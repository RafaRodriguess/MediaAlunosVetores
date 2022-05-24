# Media Alunos Vetores 
## Algoritmo e Fluxograma do exercício 01)

### Algoritmo
Início
	
	int blocoQ[] = {35,4,22,20,36,30}
	int escolha
	double media, soma;
	
	ler escolha
	exibir blocoQ[escolha]
	
	PARA(i = 0; i<6; i++) 
		soma = soma + blocoQ[i]
	FIMPARA
	
	media = soma / 6
	exibir media

	PARA(i = 0; i<6; i++)	
		SE blocoQ[i] > media FAÇA
			exibir blocoQ[i]
		FIMSE	
	FIMPARA
	
Fim

### Fluxograma
![image](https://user-images.githubusercontent.com/104536317/170089360-b8ac5dba-46a6-4153-b2ee-d3ee039100f2.png)
