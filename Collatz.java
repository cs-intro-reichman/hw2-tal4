// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
		int N = Integer.parseInt(args[0]);
		char mode = args[1].charAt(0);
	    for (int seed = 1; seed <= N; seed++) {
			int steps = 1;
			int current = seed;
			if (mode == 'v') {
				System.out.print(current + " ");
			}			
			do {
				if (current % 2 == 0) {
					current /= 2;
				}
				else {
					current = (current * 3) + 1;
				}
				steps ++;
				if (mode == 'v') {
					System.out.print(current + " ");
				}
			} while (current != 1);
			if (mode == 'v') {
				System.out.println("(" + steps + ")");				
			}
		}
		System.out.println("Every one of the first " + N + " hailstone sequences reached 1.");
	}
}
