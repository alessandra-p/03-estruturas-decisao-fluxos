package br.com.glandata;

public class Decisao {

	/**
	 * Esta classe e responsavel por executar o programa principal e monstra as
	 * opcoes de condicao com if
	 * 
	 * @param args recebe os argumentos de execucao
	 */
	public static void main(String[] args) {

		int primeiraNota = 8;
		int segundaNota = 6;

		// Condicao SE menor que
		if (primeiraNota < segundaNota) {
			System.out.println("Segunda nota é maior");

		} else {
			System.out.println("Primeira nota é maior");
		}

		// IGUALDADE
		// Condicao com igualdade
		if (primeiraNota == segundaNota) {
			System.out.println("É Igual");

		} else {
			System.out.println("É Diferente");
		}

		// OPERACAO DE INVERSAO
		// Condicao com negação
		if (!(primeiraNota != segundaNota)) {
			System.out.println("É Igual");

		} else {
			System.out.println("É Diferente");
		}

		// PRIMEIRA NOTA > 1 E SEGUNDA NOTA > 1
		// Condicao com E
		if ((primeiraNota > 1) && (segundaNota > 1)) {
			System.out.println("É Igual");

		} else {
			System.out.println("É Diferente");
		}

		// PRIMEIRA NOTA > 1 OU SEGUNDA NOTA > 1
		// Condicao com OU
		if ((primeiraNota > 1) || (segundaNota > 1)) {
			System.out.println("Um dos valores é igual a 1");

		} else {
			System.out.println("Não tem valor igual a 1");
		}

		int hora = 20;

		// if encoded
		if (hora < 10) {
			System.out.println("Bom Dia!");
		} else if (hora < 20) {
			System.out.println("Boa Tarde!");
		} else {
			System.out.println("Boa Noite!");
		}

		int idade = 50;
		// Operador ternario
		// ? ENTAO/VERDADEIRO : SE FOR FALSO
		System.out.println(idade < 18 ? "Não pode dirigir" : "Pode dirigir");

		// exemplo 2 operador ternario
		String texto = "";
		texto = idade < 18 ? "Não pode dirigir" : "Pode dirigir";

		System.out.println(texto);

		// Retorno unico em uma unica linha
		if (idade >= 50)
			System.out.println("Você já faz parte da velha guarda");

	}

}
