package Assignment_1_Day22;

        /*Create a method called countVowels that takes a string as a parameter
        and returns the number
        of vowels in the string.  (Vowels a, e, i, o, u)
        Expected output:
            Input : codewise
            Output : 4
         */
    public class VowelCounter {
        public static void main(String[] args) {
            String input = "codewise";
            int vowelCount = countVowels(input);
            System.out.println("Input : " + input);
            System.out.println("Output : " + vowelCount);
        }

        public static int countVowels(String str) {
            int count = 0;
            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);
                if (isVowel(ch)) {
                    count++;
                }
            }
            return count;
        }

        public static boolean isVowel(char ch) {
            ch = Character.toLowerCase(ch);
            return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
        }
    }

