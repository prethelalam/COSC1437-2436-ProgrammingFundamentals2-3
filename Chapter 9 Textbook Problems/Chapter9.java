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
        
        // Scanner scanner = new Scanner(System.in);
        
        // System.out.print("Enter a sentence: ");
        // String sentence = scanner.nextLine();
        // String sentence2;
        // String fullSentence = "";
        // String option;

        // do
        // {
        //     System.out.println("Select an Option: ");
        //     System.out.println("a: Count the number of vowels in the string");
        //     System.out.println("b: Count the number of consonants in the string");
        //     System.out.println("c: Count the number of vowels and consonants in the string");
        //     System.out.println("d: Enter another string");
        //     System.out.println("e: Exit the program");

        //     option = scanner.nextLine();

        //     switch(option)
        //     {
        //         case "a": System.out.println("There are " + VowelsConstantsCounter.getVowelsCounter(sentence) + " vowels in the sentence");
        //         break;

        //         case "b": System.out.println("There are " + VowelsConstantsCounter.getConsonantsCounter(sentence) + " consonants in the sentence");
        //         break;

        //         case "c": System.out.println("There are " + VowelsConstantsCounter.getVowelsCounter(sentence) + " vowels in the sentence and there are " + VowelsConstantsCounter.getConsonantsCounter(sentence) + " consonants in the sentence");
        //         break;

        //         case "d": sentence2 = scanner.nextLine();
        //                 sentence += sentence2;
        //                 break;

        //         case "e": break;
        //     }
        // } while(!option.equalsIgnoreCase("E"));

        //5 ************************************************************************************

        // Scanner scanner = new Scanner(System.in);
        // String password;

        // System.out.print("Enter your password: ");
        // password = scanner.nextLine();
        
        // do
        // {
        //     if(!PasswordVerifier.PasswordLengthChecker(password))
        //     {
        //         System.out.println("Password must be atleast 6 characters long.");
        //     }
        //     if(!PasswordVerifier.PasswordCaseChecker(password))
        //     {
        //         System.out.println("Password requires atleast 1 uppercase and 1 lowercase letter.");
        //     }
        //     if(!PasswordVerifier.PasswordDigitChecker(password))
        //     {
        //         System.out.println("Password requires at least 1 digit.");
        //     }

        //     password = scanner.nextLine();

        // } while (!PasswordVerifier.PasswordLengthChecker(password) || 
        // !PasswordVerifier.PasswordCaseChecker(password) || 
        // !PasswordVerifier.PasswordDigitChecker(password));

        // if(PasswordVerifier.PasswordLengthChecker(password) && PasswordVerifier.PasswordCaseChecker(password) && PasswordVerifier.PasswordDigitChecker(password))
        // {
        //     System.out.print("Password is valid.");
        // }
        
        //6 ************************************************************************************

        Scanner scanner = new Scanner(System.in);

        String[] nameArray = {"Harrison, Rose", "James, Jean", "Smith, William", "Smith, Brad"};
        String[] phoneArray = {"5552234", "5559098", "5551785", "5559224"};

        System.out.print("Enter a name or the first few characters of a name: ");
        String phrase = scanner.nextLine();

        TelemarketingPhoneList.getInformation(phrase, nameArray, phoneArray);

    }
}