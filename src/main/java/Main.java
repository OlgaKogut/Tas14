public class Main {
    public static String position(char alphabet) {
        int i = 1;
        int result = 0;
        for (char letter = 'a'; letter<='z'; letter ++) {
            if (alphabet == letter) {
                result = i;
            }
            i += 1;
        }
        return "Position of alphabet: " + result;
    }

}
