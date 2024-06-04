public class StringReverseRecursion {
    public static void StringReverse(String word)
    {
        if(word.isEmpty())
        {
            return;
        }
        else 
        {
            System.out.print(word.charAt(word.length() - 1)); //here im printing the very last letter (base case)
            
            StringReverse(word.substring(0, word.length()-1)); //here i basically changed what part of the word were looking at. and then calling the recusion method
        }
    }
}
