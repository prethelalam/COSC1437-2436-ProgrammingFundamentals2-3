public class WordCounter {
    public static int getWordCount(String phrase)
    {
        int wordsCounted= 0;
        int position = phrase.indexOf(" ");

        while(position != -1)
        {
            position = phrase.indexOf(" ", position + 1);
            wordsCounted++;
        }

        return wordsCounted + 1;
    }
}
