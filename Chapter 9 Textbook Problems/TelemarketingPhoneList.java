public class TelemarketingPhoneList {
    public static void getInformation(String word, String[] name, String[] number)
    {
        //int index = 0;

        for(int i = 0; i < name.length; i++)
        {
            if(word.equals(name[i]))
            {
                System.out.print(name[i] + ": " + number[i]);
            }
        }

    }
}
