package generatorNumere;

public class CMidSquare implements IGenerator{
	int rad = 3594;
	int count = 0;
	int[] ultimeleRadacini = new int[5];
	
	public float Next() {

		float radfinala;
		ultimeleRadacini[count] = rad;
		rad = rad * rad;
		rad /= 100;
		rad %= 10000;
		
		for(int i=0; i < ultimeleRadacini.length; i++) {
			if(ultimeleRadacini[i] == rad) {
				rad += 118;
			}
		}
		
		radfinala = rad;
		radfinala /= 10000;	
		
		count++;
		
		if(count >= 5) {
			count = 0;
		}	
		return radfinala;
	}
}
