import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class File_Joining 
{
    public static void main(String[] args) 
    {
        String file1 = "sample1.txt";
        String file2 = "sample2.txt";
        String mergedFile = "merged.txt";
        try 
        {
            BufferedWriter bw = new BufferedWriter(new FileWriter(mergedFile));
            BufferedReader br1 = new BufferedReader(new FileReader(file1));
            String line;
            System.out.println("Copying file 1...");
            while ((line = br1.readLine()) != null) {
                bw.write(line);
                bw.newLine();
            }
            br1.close();
            BufferedReader br2 = new BufferedReader(new FileReader(file2));           
            System.out.println("Copying file 2...");
            while ((line = br2.readLine()) != null) {
                bw.write(line);
                bw.newLine();
            }
            br2.close();
            bw.close();
            System.out.println("Success! Files joined into: " + mergedFile);
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}