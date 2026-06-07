public class Produto {

    private String nome;
    private double preco;
    private int quantidade;

    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        if (preco < 0) {
            System.out.println("Erro: o preço não pode ser negativo.");
        } else {
            this.preco = preco;
        }
    }


    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        if (quantidade < 0) {
            System.out.println("Erro: a quantidade não pode ser negativa.");
        } else {
            this.quantidade = quantidade;
        }
    }

    public void vender() {
        if (quantidade > 0) {
            quantidade--;
            System.out.println("Produto vendido: " + nome);
        } else {
            System.out.println("Produto sem estoque.");
        }
    }

    public void reporEstoque(int quantidade) {
        this.quantidade += quantidade;
        System.out.println("Estoque atualizado.");
    }

    public void exibirProduto() {
        System.out.println("Produto: " + nome);
        System.out.println("Preço: R$ " + preco);
        System.out.println("Quantidade: " + quantidade);
    }
}