package darek.tutorial;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class LessonSix {
    public static void main(String[] args) {
        try {
            readFile("input.tex", "output.text");
        } catch (FileNotFoundException e) {
            System.out.println(e.toString());
            // e.printStackTrace();
        } catch (IOException e) {
            System.out.println(e.toString());
            // e.printStackTrace();
        }
    }

    private static void readFile(String sPath, String dPath) throws IOException {
        FileInputStream fis = new FileInputStream(sPath);
        FileOutputStream fos = new FileOutputStream(dPath);
        int c;

        while ((c = fis.read()) != -1) {
            fos.write(c);
        }
    }
}
