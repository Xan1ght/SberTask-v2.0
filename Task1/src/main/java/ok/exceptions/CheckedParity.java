package ok.exceptions;

public class CheckedParity extends Exception {
    CheckedParity() {}

    CheckedParity(String mes) {
        super(mes);
    }
}