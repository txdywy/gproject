package org.chromium.net.p568a;

import java.io.IOException;
import java.io.OutputStream;
import org.chromium.net.as;

abstract class C7916j extends OutputStream {
    public IOException f40608g;
    public boolean f40609h;
    public boolean f40610i;

    C7916j() {
    }

    abstract void mo6573a();

    abstract void mo6574b();

    abstract as mo6575c();

    public void close() {
        this.f40609h = true;
    }

    protected final void m37868d() {
        if (this.f40610i) {
            m37869e();
            throw new IOException("Writing after request completed.");
        } else if (this.f40609h) {
            throw new IOException("Stream has been closed.");
        }
    }

    protected final void m37869e() {
        if (this.f40608g != null) {
            throw this.f40608g;
        }
    }
}
