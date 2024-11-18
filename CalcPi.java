// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
	    int numOfTerms = Integer.parseInt(args[0]);
		double qurterPi = 0;
		double sign = 1;
		for (int i = 1; i < (2 * numOfTerms); i += 2) {
			qurterPi += sign * (1.0 / i);
			sign *= -1;
		}
		System.out.println("pi according to Java: " + Math.PI);
		System.out.println("pi, approximated:      " + (4 * qurterPi));		
	}
}
