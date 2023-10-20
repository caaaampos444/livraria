package br.com.livraria.externos;

public class Editora {

	private String nomeFantasia;
	private String razaoSocial;
	private String cnpj;
	
	public Editora(String razaoSocial, String cnpj) {
		this.razaoSocial=razaoSocial;
		this.cnpj=cnpj;
	}

	public String getNomeFantasia() {
		return nomeFantasia;
	}

	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public String getCnpj() {
		return cnpj;
	}
	
	public void exibirDadosDaEditora() {
		System.out.println("Nome Fantasia da editora: "+nomeFantasia);
		System.out.println("Razão Social da editora: "+razaoSocial);
		System.out.println("CNPJ da editora: "+cnpj);
	}
	
}
