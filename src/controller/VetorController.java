package controller;

public class VetorController {
	public VetorController() {
		super();
	}
	
	public int menorVetor(int [] vet, int pos, int menor) {
		if (pos < 0) {return menor;}
		//O ponto de parada tem que ser o final do vetor, ou seja, sendo decrescente, quando a posição for menor do que 0.
		else {
			if (vet[pos] < menor) {menor = vet[pos];}
			return menorVetor(vet, pos-1, menor);
			//O módulo vai sempre verificar se o valor do vetor na posição é menor do que o valor armazenado e trocar se for o caso, antes de prosseguir com a sequência, para depois retornar o menor valor encontrado.
		}
	}
}
