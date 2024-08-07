package view;
import controller.VetorController;

public class VetorPrincipal {
	public static void main (String[] args) {
		VetorController vetor = new VetorController();
		int vet[] = {7, 6, 8, 1, 3, 4};
		int pos = vet.length-1;
		int menor = vet[pos];
		System.out.println(vetor.menorVetor(vet, pos, menor));
	}
}
