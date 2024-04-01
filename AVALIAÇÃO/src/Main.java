public class Main {
    public static void main(String[] args) {
        
        int escolha;
        do {
            System.out.print("\n\nDigite 1 para criar uma nova folha de pagamento ou 2 para sair do programa: ");
            escolha = Console.lerInt();

            if (escolha == 1) {
                
                FolhaDePagamento f1 = new FolhaDePagamento();
                System.out.print("\nDigite o nome do funcionario: ");
                String nomeFuncionario = Console.lerString();
                f1.setNomeFuncionario(nomeFuncionario);
                System.out.print("Horas trabalhadas: ");
                int horaTrabalhada = Console.lerInt();
                f1.setHoraTrabalhada(horaTrabalhada);
                System.out.print("Valor da hora trabalhada: ");
                float valorHora = Console.lerFloat();
                f1.setValorHora(valorHora);


                f1.imprimirFolhaDePagamento();


            }else if (escolha!=2) {
                System.out.println("Escolha invalida. Por favor, tente novamente.");
            }
        }while (escolha != 2);
        System.out.println("Saindo do programa. Obrigado!");
    }
}
