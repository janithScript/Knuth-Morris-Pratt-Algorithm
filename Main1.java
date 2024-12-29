import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        try {
            FileReader fileReader = new FileReader("C:\\Users\\User\\Desktop\\paragraphk.txt");
            Scanner scanner = new Scanner(fileReader);
            FileWriter fileWriter = new FileWriter("stringsk.txt");
            PrintWriter printWriter = new PrintWriter(fileWriter);

            int index = 1;
            while (scanner.hasNext()) {
                String word = scanner.next();
                printWriter.println(index + " " + word + " " + word.length());
                index++;
            }
            printWriter.close();
            fileWriter.close();
            scanner.close();
            fileReader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
}
