import java.io.BufferedReader; 
import java.io.File; 
import java.io.FileReader; 
import java.io.FileWriter; 
import java.io.PrintWriter; 
import java.io.IOException; 

public class Change {
    public static void main(String[] args) {
        File file1 = new File("obama.txt"); 
        File file2 = new File("output.txt"); 

        try (BufferedReader in = new BufferedReader(new FileReader(file1));
             PrintWriter out = new PrintWriter(new FileWriter(file2))) {
            

            int ch;
            while ((ch = in.read()) != -1) {
                if (Character.isLowerCase(ch)) {
                    ch = Character.toUpperCase(ch);
                }
                out.print((char) ch); 
            }
        } catch (IOException e) {
            e.printStackTrace(); 
        }
    }
}
