// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
	    String chant = args[0].toUpperCase();
            for (int i = 0; i < chant.length(); i++) {
                char letter = chant.charAt(i);
                String anSounds = "AEFHILMNORSX";
                if (anSounds.indexOf(letter) == -1) {
                        System.out.println("Give me a " + letter + ": " + letter + "!");
                }
                else {
                        System.out.println("Give me an " + letter + ": " + letter + "!");
                }
            }
            System.out.println("What does that spell?");
            int numberOfChants = Integer.parseInt(args[1]);
            for (int i = 0; i < numberOfChants; i++) {
                System.out.println(chant + "!!!");
            }
        }
}
