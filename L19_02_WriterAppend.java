import java.io.FileWriter;
import java.io.IOException;

public class L19_02_WriterAppend 
{
    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("sample.txt", true);
            fw.write("\nThis text will be added to the end of the file.");
            fw.close();
            System.out.println("Data successfully appended to the file.");
        } catch (IOException e)
        {
            System.out.println(e);
        }
    }
}