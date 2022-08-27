public class Cliente {

	private String nome;
	private String endereco;
	private String cidade;
	private String telefone;
	private String email;
	private String cpf;

	public Cliente() {
	}

	public Cliente(String nome, String endereco, String cidade, String telefone, String email, String cpf) {

		this.nome = nome;
		this.endereco = endereco;
		this.cidade = cidade;
		this.telefone = telefone;
		this.email = email;
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

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
}