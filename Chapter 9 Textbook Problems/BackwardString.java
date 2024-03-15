public class BackwardString {
    public static String getBackwardString(String word)
    {
        char[] wordArray = word.toCharArray();
        char[] backWardArray = new char[wordArray.length]; //intilaizing backWardArray to have same length

        int i = wordArray.length - 1;
        int counter = 0;

        while (counter <= wordArray.length-1)
        {
            backWardArray[counter] = wordArray[i];
            i--;
            counter++;
        }

        return String.valueOf(backWardArray);
    } 
}
