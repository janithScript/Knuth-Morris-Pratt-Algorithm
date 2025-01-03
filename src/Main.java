import java.io.*;
import java.util.*;

public class Main {
    public static int[] constructLPSTable(String pattern) {
        int n = pattern.length();
        int[] lps = new int[n];
        int len = 0;
        int i = 1;
        while (i < n) {
            if (pattern.charAt(i) == pattern.charAt(len)) {
                len++;
                lps[i] = len;
                i++;
            } else {
                if (len != 0) {
                    len = lps[len - 1];
                } else {
                    lps[i] = len;
                    i++;
                }
            }
        }
        return lps;
    }

    public static void main(String[] args) {
        try {
            File file = new File("C:\\Users\\User\\Desktop\\patternsk.txt");
            Scanner scanner = new Scanner(file);
            FileWriter writer = new FileWriter("LPSk.txt");
            int index = 1;
            while (scanner.hasNextLine()) {
                String pattern = scanner.nextLine().trim();
                int[] lps = constructLPSTable(pattern);
                writer.write(index + " " + pattern + " " + Arrays.toString(lps) + "\n");
                index++;
            }
            scanner.close();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}