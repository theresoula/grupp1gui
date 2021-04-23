package grupp1kalkylator;

public class Kalkylator {
	
	public static double Add(double x, double y) 
	{
		// TODO Auto-generated method stub
		return x + y;
		
	}

	public static double Sub(double x, double y) 
	{
		// TODO Auto-generated method stub
		return x - y;
	}

	public static double Multi(double x, double y) 
	{
		// TODO Auto-generated method stub
		if ((x * y) <= Double.MAX_VALUE)
		return x * y;
		else
			System.out.println("OUT OF BOUND");
		return -1; // = 0; ??	
	}

	public static double Div(double x, double y) 
	{
		// TODO Auto-generated method stub
		
		if(y !=0)
			return x / y;
		else 
			System.out.println("FEL");
			return 0;
		
	}

	public static double Procent(double x, double y) {
		// TODO Auto-generated method stub
		//return (y * 0.01)* x;
		
		double procent = (y * 0.01) * x;
		//return procent;
		//skriver ut rabatten positivt
		
		double discount = x - procent;
		if(y <= 99 && y >= 1)
		return discount - x;
		else
			System.out.println("Wrong procentage");
			return 0;
		// skriver ut rabatten negativt
		// räkna bara procent mellan 1-99% annars returnera 0 och felmeddelande
	}

	public static double Discount(double x, double y) {
		// TODO Auto-generated method stub
		//double discount = (y * 0.01) * x;
		//return discount - x;
		
		double newprice = (y * 0.01)* x;
		if(y <= 99 && y >= 1)
		return x - newprice;
		else
			System.out.println("Wrong procentage");
			return 0;
		// skriver ut nytt pris
		
		
	
		
		
	}

}
