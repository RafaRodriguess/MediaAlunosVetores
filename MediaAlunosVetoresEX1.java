package FACENSlistaFinal;

import java.util.Scanner;

public class MediaAlunosVetoresEX1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// declarando variaveis
		int blocoQ[] = { 35, 4, 22, 20, 36, 30 };// declarado os valores as posi��es dos vetores
		double media = 0, soma = 0;
		int escolha = 0;
		// pedindo pra digitar a sala que deseja saber a quantidade
		System.out.print("Bloco Q, sala de 1 a 6\ndigite a sala desejada: ");
		escolha = sc.nextInt();// recebendo numero da sala
		// printando sala selecionada
		System.out.printf("\nN�mero de pessoas nesta sala � de: %d\n", blocoQ[escolha - 1]);

		// estrutura de repeti��o for
		for (int i = 0; i < 6; i++) {// enquanto i for menor que 6, fa�a
			soma = soma + blocoQ[i];
		}//fim for recebendo quantidade de alunos
		// calculando e printando a m�dia
		media = soma / 6;
		System.out.printf("\nM�dia � de %.1f Alunos\n\n", media);
		// estrutura de repeti��o para printar as salas acima da m�dia
		for (int i = 0; i < 6; i++) {
			if (blocoQ[i] > media) {// se a sala for maior que a media, printar sala
				System.out.printf("sala %d � maior que a media, possui %d alunos\n", i + 1, blocoQ[i]);
			} // fim if
		} // fim for
		sc.close();
	}
}
