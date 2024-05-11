public class Compra extends Pedido{

    private double valorFinal = selecionarPedido();

    // Pergunta ao Usuario qual é a Forma de Pagamento
    // Pagamento: Dinheiro, Cartão de Credito e Debito;
    // Forma o Valor final com os Descontos

    // Dinheiro = 10% de Desconto
    public double dinheiro(){
        valorFinal -= (valorFinal * 10) / 100;
        return valorFinal;
    }

    // Credito = Acrescenta + 10%
    public double credito(){
        valorFinal += (valorFinal * 10) / 100;
        return valorFinal;
    }

    // Debito = 5% de Deconto
    public double debito(){
        System.out.println(valorFinal);
        valorFinal -= (valorFinal * 5) / 100;
        return valorFinal;
    }

    public double getValorFinal() {
        return valorFinal;
    }
}
