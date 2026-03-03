public class OopsBannerApp {

    // Static Inner Class
    static class CharacterPatternMap {

        char letter;          // stores the character
        String[] pattern;     // stores 7 lines of banner

        // Constructor
        CharacterPatternMap(char letter, String[] pattern) {
            this.letter = letter;
            this.pattern = pattern;
        }

        // Method to get pattern
        String[] getPattern() {
            return pattern;
        }
    }

    public static void main(String[] args) {

        // Pattern for O
        String[] oPattern = {
                " * * * ",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                " * * * "
        };

        // Pattern for P
        String[] pPattern = {
                "* * * * ",
                "*      *",
                "*      *",
                "* * * * ",
                "*      ",
                "*      ",
                "*      "
        };

        // Pattern for S
        String[] sPattern = {
                " * * * * ",
                "*        ",
                "*        ",
                " * * * * ",
                "        *",
                "        *",
                " * * * *  "
        };

        // Create objects
        CharacterPatternMap letterO1 = new CharacterPatternMap('O', oPattern);
        CharacterPatternMap letterO2 = new CharacterPatternMap('O', oPattern);
        CharacterPatternMap letterP = new CharacterPatternMap('P', pPattern);
        CharacterPatternMap letterS = new CharacterPatternMap('S', sPattern);

        // Store in array
        CharacterPatternMap[] word = {letterO1, letterO2, letterP, letterS};

        // Print banner row by row
        for (int i = 0; i < 7; i++) {           // 7 rows
            for (int j = 0; j < word.length; j++) {
                System.out.print(word[j].getPattern()[i] + "  ");
            }
            System.out.println();  // move to next line
        }
    }
}