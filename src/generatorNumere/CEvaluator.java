package generatorNumere;

public class CEvaluator {
	float numereGenerate = 10000;
	IGenerator generator;
	
	CEvaluator(IGenerator g) {generator = g;}
	
	
	float Evaluare()
{
		float x, y, count=0;
		
		for(int i=0; i < numereGenerate; i++) 
		{
			x = generator.Next();
			y = generator.Next();
			
			if ( Math.sqrt(x * x + y * y) < 1 ) 
			{
				count++;
			}
		}
		return Math.abs((float) (3.14 - (4 * count / numereGenerate)));
		
	}
}
