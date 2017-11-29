package generatorNumere;

public class Main {

	public static void main(String[] args) {
		
	
		float rezultat;
		
		
		IGenerator midSquare = new CMidSquare();
//		System.out.println("Metoda MidSquare " );
//		for(int i=0; i < 5 ; i++) {
//			rezultat = midSquare.Next();
//			System.out.println(rezultat);
//		}
		
//		IGenerator lcg = new CLcg();
//		System.out.println("Metoda LCG " );
//		for(int i=0; i < 5 ; i++) {	
//			rezultat = lcg.Next();
//			System.out.println(rezultat);
//		}
		
//		CEvaluator evaluator = new CEvaluator(midSquare);
//		rezultat = evaluator.Evaluare();
//		System.out.println(rezultat);
		

		CBinomial binomial = new CBinomial(1000, 0.2f, midSquare);
		System.out.println(binomial.run());
	}

}
