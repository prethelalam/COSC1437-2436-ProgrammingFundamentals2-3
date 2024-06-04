public class PasswordVerifier {
    //method
    public static boolean PasswordLengthChecker(String password)
    {
        boolean status = false;

        if (password.length() < 6)
        {
            status = false;
        }
        else
        {
            status = true;
        }

        return status;
    }

    public static boolean PasswordCaseChecker(String password)
    {
        //make password into a char array
        //cycle through the array to check for lower case and uppercase letters
        boolean status = false;
        int uppercaseCounter = 0;
        int lowercaseCounter = 0;

        char[] passwordArray = password.toCharArray();

        for(int i = 0; i < passwordArray.length; i++)
        {
            if(Character.isUpperCase(passwordArray[i]))
            {
                uppercaseCounter++;
            }
            if(Character.isLowerCase(passwordArray[i]))
            {
                lowercaseCounter++;
            }
        }

        if(uppercaseCounter > 0 && lowercaseCounter > 0)
        {
            status = true;
        }
        else if(uppercaseCounter < 1 || lowercaseCounter < 1)
        {
            status = false;
        }

        return status;
    }

    public static boolean PasswordDigitChecker(String password)
    {
        boolean status = false;

        int digitCounter = 0;

        char[] passwordArray = password.toCharArray();

        for(int i = 0; i < passwordArray.length; i++)
        {
            if(Character.isDigit(passwordArray[i]))
            {
                digitCounter++;
            }
        }

        if(digitCounter > 0)
        {
            status = true;
        }

        return status;
    }
}
