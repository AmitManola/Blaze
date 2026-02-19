import java.io.FileReader;
import java.io.IOException;
public class L19_02_Reader 
{
@SuppressWarnings("ConvertToTryWithResources")
public static void main(String[] args) {
try {
FileReader fr = new FileReader("sample.txt");
int i;
while((i = fr.read()) != -1) {
System.out.print((char)i);
}
fr.close();
} catch (IOException e) {
System.out.println(e);
}
}
}