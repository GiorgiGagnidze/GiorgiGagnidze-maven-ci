import java.util.Random;

/**
 * Hello World program. Program says that user wins 0 to 800 $.
 * @author Giorgi Gagnidze
 */
public class Main {
	
	public static void main(String[] args) {
		System.out.println("Hello World");
		System.out.println("Congratulations! You won "+
		cutValueAddedTax(todaysWin(new Random(),1000))+
		"$.");
	}
	
	/**
	 * Generates amount of money which will user win today. 
	 * @param random for generation random amount
	 * @param maxAmount maximum amount of money
	 * @return generated double
	 */
	public static double todaysWin(Random random,int maxAmount){
		return maxAmount*random.nextDouble();
	}
	
	
	/**
	 * Cuts value added tax from amount.
	 * @param amount
	 * @return returns real amount of money, which user will get.
	 */
	public static int cutValueAddedTax(double amount){
		return (int)(amount - amount*0.2);
	}
}


