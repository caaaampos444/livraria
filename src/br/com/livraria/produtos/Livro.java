package br.com.livraria.produtos;

import java.text.DecimalFormat;

import br.com.livraria.externos.*;

public class Livro {

	DecimalFormat toFixed=new DecimalFormat("0.##");
	private String nome;
	private String descricao;
	private double valor;
	private double valorComDesconto;
	private double descontoPercentual;
	private String isbn;
	private Autor autor;
	private Editora editora;
	
	public Livro(String isbn,Autor autor,Editora editora) {
		this.isbn=isbn;
		this.autor=autor;
		this.editora=editora;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public double getValorComDesconto() {
		return valorComDesconto;
	}

	public void setValorComDesconto(double valorComDesconto) {
		this.valorComDesconto = valorComDesconto;
	}

	public double getDescontoPercentual() {
		return descontoPercentual;
	}

	public void setDescontoPercentual(double descontoPercentual) {
		this.descontoPercentual = descontoPercentual;
	}
	
	public Autor getAutor() {
		return autor;
	}

	public Editora getEditora() {
		return editora;
	}

	public String getIsbn() {
		return isbn;
	}
	
	public boolean aplicaDescontoDe() {
		if(descontoPercentual<=20) {
			valorComDesconto=(descontoPercentual/100)*valor;
			return true;
		}else {
			return false;
		}
	}
	
	public void exibirDadosLivro() {
		System.out.println("Nome do livro: "+nome);
		System.out.println("Descrição do livro: "+descricao);
		System.out.println("Valor do livro: "+valor);
		System.out.println("Desconto do livro: "+descontoPercentual+"% de desconto");
		if(aplicaDescontoDe()==true) {
			System.out.println("Valor com desconto: "+toFixed.format(valorComDesconto));
		}else {
			System.out.println("Valor com desconto: DESCONTO NEGADO.");
		}
		System.out.println("ISBN: "+isbn);
		System.out.println("Autor: "+autor.getNome());
		System.out.println("Editora: "+editora.getNomeFantasia());
	}

}
