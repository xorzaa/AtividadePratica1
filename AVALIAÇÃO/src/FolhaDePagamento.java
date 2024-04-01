public class FolhaDePagamento {

    String nomeFuncionario;
    int horaTrabalhada;
    float valorHora;
    float salarioBruto;
    float IR;
    float INSS;
    float FGTS;
    float salarioLiquido;

    public FolhaDePagamento(){}
    public FolhaDePagamento(String nomeFuncionario, int horaTrabalhada, int valorHora){
        this.nomeFuncionario = nomeFuncionario;
        this.horaTrabalhada = horaTrabalhada;
        this.valorHora = valorHora;
    }
    public String getNomeFuncionario() {
        return nomeFuncionario;
    }
    public void setNomeFuncionario(String nomeFuncionario) {
        this.nomeFuncionario = nomeFuncionario;
    }
    public int getHoraTrabalhada() {
        return horaTrabalhada;
    }
    public void setHoraTrabalhada(int horaTrabalhada) {
        this.horaTrabalhada = horaTrabalhada;
    }
    public float getValorHora() {
        return valorHora;
    }
    public void setValorHora(float valorHora) {
        this.valorHora = valorHora;
    }
    
    public float calcularSalarioBruto(){
        salarioBruto = horaTrabalhada * valorHora;
        return salarioBruto;
    }

    public float calcularIR(){
        if (salarioBruto <= 1372.81f){
            IR = 0;
        } else if(salarioBruto <= 2743.25f){
            IR = salarioBruto * 0.15f - 205.92f;
        } else {
            IR = salarioBruto * 0.275f - 548.82f;
        }
        return IR;
    }
    public float calcularINSS() {
        
    
        if (salarioBruto <= 868.29f) {
            INSS = salarioBruto * 0.08f;
        } else if (salarioBruto <= 1447.14f) {
            INSS = salarioBruto * 0.09f;
        } else if (salarioBruto <= 2894.27f) {
            INSS = salarioBruto * 0.11f;
        } else {
            INSS = 318.37f;
        }
    
        return INSS;
    }
    public float calcularFGTS(){
        FGTS = salarioBruto * 0.08f;
        return FGTS;
    }
    public float calcularSalarioLiquido(){
        salarioLiquido = salarioBruto - IR - INSS;
        return salarioLiquido;
    }
    public void imprimirFolhaDePagamento(){
        calcularSalarioBruto();
        calcularIR();
        calcularINSS();
        calcularFGTS();
        calcularSalarioLiquido();
        System.out.println("\nNome do funcionario: " + nomeFuncionario);
        System.out.println("Horas trabalhadas: "+ horaTrabalhada);
        System.out.println("Salário Bruto: "+ salarioBruto);
        System.out.println("IR: "+ IR);
        System.out.println("INSS: "+ INSS);
        System.out.println("FGTS: "+ FGTS);
        System.out.println("Salário: Liquido: "+ salarioLiquido);

    }





}