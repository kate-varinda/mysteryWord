import java.util.Random;

public class Quiz5 {
    public static void main(String[] args) {
        String thing = mysteryWord(4);
        System.out.println(thing);
        do {
            thing = mysteryWord(4);
        } while (!thing.equals("QUIZ"));
        System.out.println(thing);

        System.out.println("hasAnEvenDigit(45889) returns " + hasAnEvenDigit(45889));
        System.out.println("hasAnEvenDigit(317) returns " + hasAnEvenDigit(317));
        System.out.println("hasAnEvenDigit(307) returns " + hasAnEvenDigit(307));
    }

    public static String mysteryWord(int length) {
        Random random = new Random();
        StringBuilder word = new StringBuilder();
        for (int i = 0; i < length; i++) {
            char letter = (char) (65 + random.nextInt(26));
            word.append(letter);
        }
        return word.toString();
    }

    public static boolean hasAnEvenDigit(int num) {
        while (num > 0) {
            if (num % 2 == 0) {
                return true;
            }
            num /= 10;
        }
        return false;
    }
}