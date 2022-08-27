public class Assalariado extends Empregado {
  private double salario;

  public Assalariado() {

  }

  public Assalariado(double salario, String nome, String sobreNome, String cpf) {
    super(nome, sobreNome, cpf);
    this.salario = salario;
  }

  public double getSalario() {
    return salario;
  }

  public void setSalario(double salario) {
    this.salario = salario;
  }

  public double vencimento() {
    return salario;
  }
}