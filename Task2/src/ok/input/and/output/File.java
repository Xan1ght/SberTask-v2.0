package ok.input.and.output;

import java.io.IOException;

public interface File {
    public String readFile(String fname);

    public void writeFile(String fname, String info) throws IOException;

}
