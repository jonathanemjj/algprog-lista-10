public class App {

    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario("Daniel", 101, 2500.00);

        Produto produto = new Produto("Notebook", 3500.00, 5);

        Venda venda = new Venda(funcionario, produto, 2);

        funcionario.exibirDados();
        funcionario.trabalhar();
        funcionario.receberSalario();

        System.out.println();

        produto.exibirProduto();
        produto.vender();

        System.out.println();

        venda.finalizarVenda();
    }
}