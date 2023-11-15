package view;

import br.edu.fateczl.arvore.ArvoreInt.ArvoreInt;

public class Principal {

	public static void main(String[] args) {
		ArvoreInt arv = new ArvoreInt();
		int[] vetor = { 12, 4, 16, 8, 2, 6 };

		for (int i : vetor) {
			arv.insert(i);

		}

		try {

			arv.search(6);
			arv.remove(12);
			arv.postfixSearch();

		} catch (Exception e) {
			e.getStackTrace();
		}

	}

}
