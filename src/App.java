import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String arquivo = "C:\\User.csv";
        Cliente clientes = new Cliente(arquivo);

        System.out.println("Mercado Exotico Lonf Tonf");
        System.out.println("Faça seu Login para Acessar nossos novos Produtos");
        System.out.println("------------------");

        System.out.print("Login: ");
        String login = scanner.nextLine();
        System.out.print("Senha: ");
        String senha = scanner.nextLine();

        // Verificação de Login e Senha
        clientes.setLogin(login);
        clientes.setSenha(senha);
        if (clientes.loginVerification()) {
            System.out.println("Estes são os novos produtos da nossa Loja: ");
            Pedido pedido = new Pedido();
            pedido.mostrarProdutosPrecos();
            System.out.println();

            System.out.print("Qual será os Produtos selecionados? ");
            int option = scanner.nextInt();
            pedido.setOption(option);
            pedido.selecionarPedido();

            int optionContinuar;
            do {
                System.out.println("Gostaria de Comprar mais um Objeto? ");
                System.out.println("1 - Sim");
                System.out.println("2 - Não");
                optionContinuar = scanner.nextInt();

                if (optionContinuar == 1) {
                    System.out.print("Qual será os Produtos selecionados? ");
                    option = scanner.nextInt();
                    pedido.setOption(option);
                    pedido.selecionarPedido();
                }
            } while (optionContinuar == 1);

            if (optionContinuar == 2) {
                System.out.println("Indo para Pagamento...");
                System.out.println();
                System.out.println("Área de Pagamento: ");

                Compra compra = new Compra();

                System.out.println("Selecione um método de Pagamento: ");
                System.out.println("1 - Dinheiro - 10% De Desconto");
                System.out.println("2 - Crédito - 10% De Acrescimo");
                System.out.println("3 - Débito - 5% De Desconto");
                int optionPagamento;
                optionPagamento = scanner.nextInt();

                switch (optionPagamento) {
                    case 1:
                        System.out.println("O Valor Final pagando com Dinheiro é R$ " + compra.dinheiro());
                        break;
                    case 2:
                        System.out.println("O Valor Final pagando com Crédito é R$ " + compra.credito());
                        break;
                    case 3:
                        System.out.println("O Valor Final pagando com Débito é R$ " + compra.debito());
                        break;
                    default:
                        break;
                }
            }
        } else {
            clientes.createAccount();
        }
        scanner.close();
    }
}
