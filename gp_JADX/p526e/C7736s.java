package p526e;

import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;

final class C7736s extends C7634a {
    public final /* synthetic */ Socket f40213a;

    C7736s(Socket socket) {
        this.f40213a = socket;
    }

    protected final IOException mo6458a(IOException iOException) {
        IOException socketTimeoutException = new SocketTimeoutException("timeout");
        if (iOException != null) {
            socketTimeoutException.initCause(iOException);
        }
        return socketTimeoutException;
    }

    protected final void mo6459a() {
        try {
            this.f40213a.close();
        } catch (Throwable e) {
            C7733p.f40208a.log(Level.WARNING, "Failed to close timed out socket " + this.f40213a, e);
        } catch (AssertionError e2) {
            if (C7733p.m37444a(e2)) {
                C7733p.f40208a.log(Level.WARNING, "Failed to close timed out socket " + this.f40213a, e2);
                return;
            }
            throw e2;
        }
    }
}
