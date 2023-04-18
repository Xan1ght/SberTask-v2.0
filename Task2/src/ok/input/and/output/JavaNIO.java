package ok.input.and.output;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class JavaNIO {
    public String readFile(String fname) {
        String str = "";

        try {
            str = new String(Files.readAllBytes(Paths.get(fname)));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
//        System.out.println(str);

        return str;
    }

    public void writeFile(String fname, String info) throws IOException {
        try {
            FileChannel uFile = FileChannel.open(Paths.get(fname), StandardOpenOption.CREATE, StandardOpenOption.WRITE);
            ByteBuffer buffer = ByteBuffer.allocate(256);
            int ch = 0;

            while (ch < info.length()) {
                buffer.put(String.valueOf(info.charAt(ch)).getBytes(StandardCharsets.UTF_8));
                ch++;
            }

            buffer.rewind();
            uFile.write(buffer);
            buffer.clear();
            uFile.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
