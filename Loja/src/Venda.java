public class Venda {

	private String endereco;
	private String cidade;
	private String telefone;

	public Venda() {
	}

	public Venda(String cidade, String telefone, String endereco) {

		this.endereco = endereco;
		this.cidade = cidade;
		this.telefone = telefone;
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
}