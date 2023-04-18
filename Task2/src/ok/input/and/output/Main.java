package ok.input.and.output;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        String str, fname1, fname2;
        Scanner uInput = new Scanner(System.in);

        System.out.println("Введите текст:");
        str = uInput.nextLine();
        System.out.println("Введите имя первого файла:");
        fname1 = uInput.nextLine();
        System.out.println("Введите имя второго файла:");
        fname2 = uInput.nextLine();

        JavaIO JIO = new JavaIO();
        JIO.writeFile(fname1, str);

        if (JIO.readFile(fname1) != null) {
            System.out.println("Текст в первом файле \"" + fname1 + "\":");
            System.out.println(JIO.readFile(fname1));
        } else {
            System.out.println("Текст в первом файле \"" + fname1 + "\" отсутствует.");
        }

        JavaNIO JNIO = new JavaNIO();
        JNIO.writeFile(fname2, str);

//        if (JNIO.readFile(fname2) != "") {
//            System.out.println("Текст во втором файле \"" + fname2 + "\":");
//            System.out.println(JNIO.readFile(fname1));
//        } else {
//            System.out.println("Текст во втором файле \"" + fname2 + "\" отсутствует.");
//        }
    }
}
