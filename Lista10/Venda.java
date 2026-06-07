public class Venda {

    private Funcionario funcionario;
    private Produto produto;
    private int quantidadeVendida;

    public Venda(Funcionario funcionario, Produto produto, int quantidadeVendida) {
        this.funcionario = funcionario;
        this.produto = produto;
        this.quantidadeVendida = quantidadeVendida;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }


    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }


    public int getQuantidadeVendida() {
        return quantidadeVendida;
    }

    public void setQuantidadeVendida(int quantidadeVendida) {
        if (quantidadeVendida < 0) {
            System.out.println("Erro: a quantidade vendida não pode ser negativa.");
        } else {
            this.quantidadeVendida = quantidadeVendida;
        }
    }

    public double calcularTotal() {
        return produto.getPreco() * quantidadeVendida;
    }

    public void finalizarVenda() {
        System.out.println("Venda finalizada!");
        System.out.println("Funcionário: " + funcionario.getNome());
        System.out.println("Produto: " + produto.getNome());
        System.out.println("Quantidade vendida: " + quantidadeVendida);
        System.out.println("Total da venda: R$ " + calcularTotal());
    }
}