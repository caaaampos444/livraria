package br.com.livraria.teste;

import br.com.livraria.externos.*;

import br.com.livraria.produtos.*;

public class LivrariaTeste {

	public static void main(String[] args) {
		
		Autor a1=new Autor("670.868.151-01");
		a1.setEmail("jorgeamado@gmail.com");
		a1.setNome("Jorge Amado");
		Editora e1=new Editora("Companhia das Letras LTDA","55.789.390/0001-12");
		e1.setNomeFantasia("GRUPO COMPANHIA DAS LETRAS");
		Livro l1=new Livro("9788420603902",a1,e1);
		l1.setNome("Capitães da Areia");
		l1.setDescricao("Desde o seu lançamento, em 1937, Capitães da Areia causou escândalo: inúmeros exemplares do livro foram queimados em praça pública, por determinação do Estado Novo. Ao longo de sete décadas a narrativa não perdeu viço nem atualidade, pelo contrário: a vida urbana dos meninos pobres e infratores ganhou contornos trágicos e urgentes. Várias gerações de brasileiros sofreram o impacto e a sedução desses meninos que moram num trapiche abandonado no areal do cais de Salvador, vivendo à margem das convenções sociais. Verdadeiro romance de formação, o livro nos torna íntimos de suas pequenas criaturas, cada uma delas com suas carências e suas ambições: do líder Pedro Bala ao religioso Pirulito, do ressentido e cruel Sem-Pernas ao aprendiz de cafetão Gato, do sensato Professor ao rústico sertanejo Volta Seca. Com a força envolvente da sua prosa, Jorge Amado nos aproxima desses garotos e nos contagia com seu intenso desejo de liberdade.");
		l1.setValor(67.96);
		l1.setDescontoPercentual(20);
		
		System.out.println("INFORMAÇÕES DA EDITORA:");
		e1.exibirDadosDaEditora();
		System.out.println("----------------------------------------------------");
		System.out.println("INFORMAÇÕES DO AUTOR:");
		a1.exibirDadosDoAutor();
		System.out.println("----------------------------------------------------");
		System.out.println("INFORMAÇÕES DO LIVRO:");
		l1.exibirDadosLivro();

	}

}
