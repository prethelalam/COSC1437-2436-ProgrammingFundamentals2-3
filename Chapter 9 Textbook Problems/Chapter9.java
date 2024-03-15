import java.util.Scanner;

public class Chapter9{
    public static void main(String[] args) {
        //1 ************************************************************************************

        // Scanner scanner = new Scanner(System.in);
        
        // System.out.print("Enter a word: ");
        // String word = scanner.nextLine();

        // String backWardWord = BackwardString.getBackwardString(word);

        // System.out.print("The word you entered backwards is: " + backWardWord);

        //2 ************************************************************************************

        // Scanner scanner = new Scanner(System.in);

        // System.out.print("Enter a phrase: ");
        // String phrase = scanner.nextLine();

        // System.out.println("The number of words in the phrase is: " + WordCounter.getWordCount(phrase));

        //3 ************************************************************************************ come back too

        // Scanner scanner = new Scanner(System.in);
        
        // System.out.print("Enter a couple of sentences: ");
        // String sentences = scanner.nextLine();

        //4 ************************************************************************************
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();
        String sentence2;
        String fullSentence = "";
        String option;

        do
        {
            System.out.println("Select an Option: ");
            System.out.println("a: Count the number of vowels in the string");
            System.out.println("b: Count the number of consonants in the string");
            System.out.println("c: Count the number of vowels and consonants in the string");
            System.out.println("d: Enter another string");
            System.out.println("e: Exit the program");

            option = scanner.nextLine();

            switch(option)
            {
                case "a": System.out.println("There are " + VowelsConstantsCounter.getVowelsCounter(sentence) + " vowels in the sentence");
                break;

                case "b": System.out.println("There are " + VowelsConstantsCounter.getConsonantsCounter(sentence) + " consonants in the sentence");
                break;

                case "c": System.out.println("There are " + VowelsConstantsCounter.getVowelsCounter(sentence) + " vowels in the sentence and there are " + VowelsConstantsCounter.getConsonantsCounter(sentence) + " consonants in the sentence");

                case "d": sentence2 = scanner.nextLine();
                        sentence += sentence2;
                        break;

                case "e": break;
            }
        } while(!option.equalsIgnoreCase("E"));

        
        
    }
}