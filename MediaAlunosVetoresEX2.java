package FACENSlistaFinal;

import java.util.Scanner;

public class MediaAlunosVetoresEX2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// declarando variaveis
		int soma = 0;
		int blocoQ[] = new int[6];
		double media = 0;

		for (int i = 0; i < 6; i++) {// repeti��o recebendo alunos
			System.out.printf("Digite a quantidade de alunos na sala %d: ", (i + 1));
			blocoQ[i] = sc.nextInt();
		} // fim for recebendo alunos
		for (int i = 0; i < 6; i++) {
			soma = soma + blocoQ[i];
		} // fim for soma
			// calculando e printando a m�dia

		media = (double) soma / 6;
		System.out.printf("\nM�dia � de %.1f Alunos\n", media);
		// estrutura de repeti��o para printar as salas acima da m�dia
		for (int i = 0; i < 6; i++) {
			if (blocoQ[i] > media) {// se a sala for maior que a media, printara a sala
				System.out.printf("sala %d � maior que a media, possui %d alunos\n", i + 1, blocoQ[i]);
			}
		} // fim for print maior
		for (int i = 0; i < 6; i++) {
			if (blocoQ[i] < media) {// se for menor que a media, printar a sala
				System.out.printf("sala %d � menor que a media, possui %d alunos\n", i + 1, blocoQ[i]);
			}
		} // fim for print menor
		sc.close();
	}
}
