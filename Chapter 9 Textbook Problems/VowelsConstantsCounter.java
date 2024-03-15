public class VowelsConstantsCounter {
    public static int getVowelsCounter(String sentence)
    {
        int vowelCounter = 0;

        if(sentence.equals(sentence))
        {
            char[] wordArray = sentence.toCharArray();
        
            for(int i = 0; i < wordArray.length; i++)
            {
                if (wordArray[i] == 'a' || wordArray[i] == 'e' || wordArray[i] == 'i' || wordArray[i] == 'o' || wordArray[i] == 'u')
                {
                    vowelCounter++;
                }
            }
        }

        return vowelCounter;
    }

    public static int getConsonantsCounter(String sentence)
    {
        int consonantCounter = 0;

        if (sentence.equals(sentence))
        {
            char[] wordArray = sentence.toCharArray();
        
            for(int i = 0; i < wordArray.length; i++)
            {
                if (wordArray[i] != 'a' || wordArray[i] != 'e' || wordArray[i] != 'i' || wordArray[i] != 'o' || wordArray[i] != 'u')
                {
                    consonantCounter++;
                }
            }
        }

        return consonantCounter;
    }
}
