import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.FileInputStream;
import java.io.DataInputStream;
import java.io.EOFException;

public class FileArray {
    //write array method
    public static void writeArray(String fileName, int[] array) throws IOException
    {
        try(FileOutputStream fstream = new FileOutputStream(fileName, true); DataOutputStream outputFile = new DataOutputStream(fstream))
        {
            System.out.println("Writing numbers to file.");

            for(int i = 0; i < array.length; i++)
            {
                outputFile.writeInt(array[i]);
            }

            System.out.println("Done");
        }
        catch(IOException e)
        {
            System.out.println("Error: " + e.getMessage());
        }
    }

    //read array method
    public static void readArray(String fileName, int[] array) throws IOException
    {
        boolean endOFFile = false;

        try(FileInputStream fstream = new FileInputStream(fileName);
        DataInputStream inputFile = new DataInputStream(fstream))
        {
            System.out.println("Reading numbers from file.");

            for(int i = 0; i < array.length; i++)
            {
                System.out.println(inputFile.readInt());
            }

            System.out.println("Done");
        }
        catch(EOFException e)
        {
            endOFFile = true;
        }
    }
}
