public class Produto {

    private String[] produtos = {"0 - Hamster Mutante XGG", "1 - PUG Radiotivo XLGGGGG", "2 - Pombo com Exoesqueleto do Iron Man"};
    private double[] precoProdutos = {69.0, 24.0, 42.0};

    public void mostrarProdutosPrecos(){
        for (int i = 0; i < produtos.length; i++){
            System.out.println(produtos[i] + " - BTC " + precoProdutos[i]);
        }
    }

    public String[] getProdutos() {
        return produtos;
    }

    public double[] getPrecoProdutos() {
        return precoProdutos;
    }
}
