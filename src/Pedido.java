import java.util.ArrayList;

public class Pedido extends Produto{

    private double precoFinal;
    private int quantidade;
    private int option;
    private String[] listaProdutos = getProdutos();
    private double[] listaPrecoProdutos = getPrecoProdutos();
    private ArrayList<String> carrinho = new ArrayList<String>();

    public Pedido(){
        super();
        this.precoFinal = 0;
        this.quantidade = 1;
    }

    public double selecionarPedido(){
        switch (option) {
            case 0:
                precoFinal += listaPrecoProdutos[0];
                carrinho.add(listaProdutos[0]);
                break;
            case 1:
                precoFinal += listaPrecoProdutos[1];
                carrinho.add(listaProdutos[1]);
                break;
            case 2:
                precoFinal += listaPrecoProdutos[2];
                carrinho.add(listaProdutos[2]);
                break;
            default:
                break;
        }
        return precoFinal;
    }

    public void verCarrinho(){
        for (int i = 0; i < carrinho.size(); i++){
            System.out.println(carrinho.get(i));
        }
    }

    public double getPrecoFinal() {
        return precoFinal;
    }

    public void setPrecoFinal(double precoFinal) {
        this.precoFinal = precoFinal;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public int getOption() {
        return option;
    }

    public void setOption(int option) {
        this.option = option;
    }  
}
