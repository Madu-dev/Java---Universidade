public class Funcionario {

	  private String nome;
	  private String endereco;
	  private String cidade;
	  private String telefone;
	  private String email;
	  private String cpf;
	  private double salario;

	  public Funcionario(){ }

	  public Funcionario(String nome, String endereco, String cidade,String telefone,String email, double salario, String cpf){
	    
	    this.nome = nome;
	    this.endereco = endereco;
	    this.cidade = cidade;
	    this.telefone = telefone;
	    this.email = email;
	    this.salario = salario;
	    this.cpf = cpf;
	    
	  }

	    public String getNome() {
			    return nome;
		}
	  
		  public void setNome(String nome) {
			    this.nome = nome;
		}
	  
		  public String getEndereco() {
			    return endereco;
		}
	  
		  public void setEndereco(String endereco) {
			    this.endereco = endereco;
		}
	  
		  public String getCidade() {
			    return cidade;
		}
	  
		  public void setCidade(String cidade) {
			    this.cidade = cidade;
		}
	  
		  public String getTelefone() {
			    return telefone;
		}
		
	    public void setTelefone(String telefone) {
			    this.telefone = telefone;
		}
		  public String getEmail() {
			    return email;
		}
		  public void setEmail(String email) {
			    this.email = email;
		}
		  public double getSalario() {
			    return salario;
		}
	  
		  public void setSalario(double salario) {
			    this.salario = salario;
		}
	  
	    public String getCpf() {
			    return cpf;
		}
	  
		  public void setCpf(String cpf) {
			    this.cpf = cpf;
		}

	    public String obterInfo(){
	        String info = "Nome: "+this.nome+"\n";
	        info+= "Endereço: "+this.endereco+"\n";
	        info+= "Cidade: "+this.cidade+"\n";
	        info+= "Telefone: "+this.telefone+"\n";
	        info+= "E-mail: "+this.email+"\n";
	        info+= "CPF: "+this.cpf+"\n";
	        info+= "Salario: "+this.salario+"\n";
	        return info;
	      }
	}