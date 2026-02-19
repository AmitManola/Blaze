import java.io.FileWriter;
import java.io.IOException;
public class L19_02_Writer {
public static void main(String[] args) {
try {
FileWriter fw = new FileWriter("sample.txt");
fw.write("Java I/O Streams Example");
fw.close();
System.out.println("File written successfully.");
} catch (IOException e) {
System.out.println(e);
}
}
}