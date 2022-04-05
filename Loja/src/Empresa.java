public class Empresa {

	  private String endereco;
	  private String cidade;
	  private String telefone;
	  private String email;
	  private boolean matriz;

	  private Funcionario gerente;
	  private Funcionario[] funcionarios;
	  private Produto[] produtos;
	  private Cliente[] clientes;

	  int posProdutos, posClientes, posFuncionarios;
	  
	  public Empresa(){ }

	  public Empresa(String endereco, String cidade,String telefone,String email,boolean matriz, Funcionario gerente, Funcionario[] funcionarios, Produto[] produtos, Cliente[] clientes){
	    
	    this.endereco = endereco;
	    this.cidade = cidade;
	    this.telefone = telefone;
	    this.email = email;
	    this.matriz = matriz;
	    this.gerente = gerente;
	    this.funcionarios = funcionarios;
			this.produtos = produtos;
	    this.clientes = clientes;
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

		  public boolean isMatriz() {
			    return matriz;
		}

		  public void setMatriz(boolean matriz) {
			    this.matriz = matriz;
		}

	    public Funcionario getGerente() {
			    return gerente;
		}
		 
	    public void setGerente(Funcionario gerente) {
			    this.gerente = gerente;
		}
	  
	    public Funcionario[] getFuncionarios() {
			    return funcionarios;
		}
	  
		  public void setFuncionarios(Funcionario[] funcionarios) {
			    this.funcionarios = funcionarios;
		}
	    
	    public Produto[] getProdutos() {
			    return produtos;
		}
	  
		  public void setProdutos(Produto[] produtos) {
			    this.produtos = produtos;
		}
	  
		  public Cliente[] getClientes() {
			    return clientes;
		}
	  
		  public void setClientes(Cliente[] clientes) {
			    this.clientes = clientes;
		}

	    public boolean verificarCpfFuncionario(String cpf, int qtd){
	    boolean resposta = false;
	        for(int i = 0; i < qtd; i++){
	            if(this.funcionarios[i].getCpf().equals(cpf)){
	        resposta = true;
	      }
	      else{
	        resposta = false;
	      }
	    }
	    return resposta;
	  }
	      public void exibirInfo(){
	          System.out.println("Endereço: "+this.endereco);
	          System.out.println("Cidade: "+this.cidade);
	          System.out.println("Telefone: "+this.telefone);
	          System.out.println("Email: "+this.email);
	          System.out.println("Matriz: "+this.matriz);
	  }
}