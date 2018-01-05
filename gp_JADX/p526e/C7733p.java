package p526e;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.logging.Logger;

public final class C7733p {
    public static final Logger f40208a = Logger.getLogger(C7733p.class.getName());

    private C7733p() {
    }

    public static C7725i m37442a(aa aaVar) {
        return new C7738u(aaVar);
    }

    public static C7724h m37441a(C7631z c7631z) {
        return new C7737t(c7631z);
    }

    public static C7631z m37443a(Socket socket) {
        if (socket == null) {
            throw new IllegalArgumentException("socket == null");
        }
        ab c = C7733p.m37446c(socket);
        OutputStream outputStream = socket.getOutputStream();
        if (outputStream != null) {
            return new C7720b(c, new C7734q(c, outputStream));
        }
        throw new IllegalArgumentException("out == null");
    }

    public static aa m37445b(Socket socket) {
        if (socket == null) {
            throw new IllegalArgumentException("socket == null");
        }
        ab c = C7733p.m37446c(socket);
        InputStream inputStream = socket.getInputStream();
        if (inputStream != null) {
            return new C7721c(c, new C7735r(c, inputStream));
        }
        throw new IllegalArgumentException("in == null");
    }

    private static C7634a m37446c(Socket socket) {
        return new C7736s(socket);
    }

    static boolean m37444a(AssertionError assertionError) {
        return (assertionError.getCause() == null || assertionError.getMessage() == null || !assertionError.getMessage().contains("getsockname failed")) ? false : true;
    }
}
