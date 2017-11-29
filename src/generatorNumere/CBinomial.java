package generatorNumere;

public class CBinomial {
	int n;
	float p;
	IGenerator generator;
	
	CBinomial(int n, float p, IGenerator generator){
		this.n = n;
		this.p = p;
		this.generator = generator;
	}
	
	float run() {
		float x=0;
		for(int i=0; i < n; i++) {
			if(generator.Next() < p) {
				x++;
			}
		}
		return x / n ;
	};
}
