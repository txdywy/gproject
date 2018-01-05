package android.support.v4.os;

public class OperationCanceledException extends RuntimeException {
    public OperationCanceledException() {
        this((byte) 0);
    }

    private OperationCanceledException(byte b) {
        super("The operation has been canceled.");
    }
}
