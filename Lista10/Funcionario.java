public class Funcionario {

    private String nome;
    private int matricula;
    private double salario;

    public Funcionario(String nome, int matricula, double salario) {
        this.nome = nome;
        this.matricula = matricula;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }


    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        if (salario < 0) {
            System.out.println("Erro: o salário não pode ser negativo.");
        } else {
            this.salario = salario;
        }
    }

    public void trabalhar() {
        System.out.println(nome + " está trabalhando.");
    }

    public void receberSalario() {
        System.out.println(nome + " recebeu R$ " + salario);
    }

    public void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Matrícula: " + matricula);
        System.out.println("Salário: R$ " + salario);
    }
}