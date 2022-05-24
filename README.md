# Media Alunos Vetores 
## Algoritmo e Fluxograma do exercício 02)

### Algoritmo
Início

	int blocoQ[] = new int[6]
	double media
	double soma
	
	PARA(i = 0; i<6; i++) 
		escreva 'Digite a quantidade de alunos da sala'
		ler blocoQ[i]
	FIMPARA

	PARA(i = 0; i<6; i++) 
		soma = soma + blocoQ[i]
	FIMPARA
	
	media = soma/6

	PARA(i = 0; i<6; i++) 
	   SE blocoQ[i] > media FAÇA
		escreva 'salas maior que a media'
		Exibir blocoQ[i]
	   FIMSE
	FIMPARA

	PARA(i = 0; i<6; i++) 
	   SE blocoQ[i] < media FAÇA
		escreva 'salas menor que a media'
		Exibir blocoQ[i]
	   FIMSE
	FIMPARA
	
Fim

### Fluxograma
![image](https://user-images.githubusercontent.com/104536317/170089891-4e5fd88b-533c-4580-b92b-ccc86b21f0c9.png)
