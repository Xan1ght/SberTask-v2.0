package ok.input.and.output;

import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class JavaIO implements File {
    public String readFile(String fname) {
        String str = null;
        Scanner uFile = null;

        try {
            uFile = new Scanner(new java.io.File(fname));
            while (uFile.hasNext()) {
                if (str == null) {
                    str = uFile.nextLine();
                } else {
                    str += ("\n" + uFile.nextLine());
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (uFile != null) {
                uFile.close();
            }
        }

        return str;
    }

    public void writeFile(String fname, String info) {
        try {
            java.io.File uFile = new java.io.File(fname);
            PrintWriter pw = new PrintWriter(uFile);
            pw.print(info);
            pw.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
