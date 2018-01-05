package p526e;

import java.io.IOException;
import java.io.InputStream;

final class C7735r implements aa {
    public final /* synthetic */ ab f40211a;
    public final /* synthetic */ InputStream f40212b;

    C7735r(ab abVar, InputStream inputStream) {
        this.f40211a = abVar;
        this.f40212b = inputStream;
    }

    public final long mo6423a(C7726f c7726f, long j) {
        if (j < 0) {
            throw new IllegalArgumentException("byteCount < 0: " + j);
        } else if (j == 0) {
            return 0;
        } else {
            try {
                this.f40211a.mo6480f();
                C7740w b = c7726f.m37387b(1);
                int read = this.f40212b.read(b.f40221a, b.f40223c, (int) Math.min(j, (long) (8192 - b.f40223c)));
                if (read == -1) {
                    return -1;
                }
                b.f40223c += read;
                c7726f.f40188c += (long) read;
                return (long) read;
            } catch (AssertionError e) {
                if (C7733p.m37444a(e)) {
                    throw new IOException(e);
                }
                throw e;
            }
        }
    }

    public final void close() {
        this.f40212b.close();
    }

    public final ab mo6424a() {
        return this.f40211a;
    }

    public final String toString() {
        return "source(" + this.f40212b + ")";
    }
}
