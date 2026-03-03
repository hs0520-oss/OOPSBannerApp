public class uc6 {

    // Pattern for O
    public static String[] getOPattern() {
        return new String[]{
                " *** ",
                "*   *",
                "*   *",
                "*   *",
                " *** "
        };
    }

    // Pattern for P
    public static String[] getPPattern() {
        return new String[]{
                "**** ",
                "*   *",
                "**** ",
                "*    ",
                "*    "
        };
    }

    // Pattern for S
    public static String[] getSPattern() {
        return new String[]{
                " ****",
                "*    ",
                " *** ",
                "    *",
                "**** "
        };
    }

    // Method to return pattern based on character
    public static String[] getPattern(char ch) {
        switch (ch) {
            case 'O':
                return getOPattern();
            case 'P':
                return getPPattern();
            case 'S':
                return getSPattern();
            default:
                return new String[]{
                        "     ",
                        "     ",
                        "     ",
                        "     ",
                        "     "
                };
        }
    }

    public static void main(String[] args) {

        String word = "OOPS";   // Change word here if needed
        int height = 5;

        // Store patterns for each letter
        String[][] letters = new String[word.length()][];

        for (int i = 0; i < word.length(); i++) {
            letters[i] = getPattern(word.charAt(i));
        }

        // Loop-based rendering
        for (int row = 0; row < height; row++) {
            for (int col = 0; col < letters.length; col++) {
                System.out.print(letters[col][row] + "  ");
            }
            System.out.println();
        }
    }
}