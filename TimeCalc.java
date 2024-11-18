public class TimeCalc {
    public static void main(String[] args) {
        String time = args [0];
        int timeHours = Integer.parseInt("" + time.charAt(0) + time.charAt(1));
        int timeMinutes = Integer.parseInt("" + time.charAt(3) + time.charAt(4));
        int minutesToAdd = Integer.parseInt(args[1]);
        int totalMinutes = (timeMinutes + minutesToAdd) % 60;
        int totalHours = (timeHours + ((timeMinutes + minutesToAdd) / 60)) % 24;
        String output = "";
        if (totalHours < 10)    output += "0";
        output += totalHours;
        output += ":";
        if (totalMinutes < 10) output += "0";
        output += totalMinutes;
        System.out.println(output);
    }
}
