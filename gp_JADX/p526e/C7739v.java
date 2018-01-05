package p526e;

import com.squareup.haha.perflib.HprofParser;
import java.io.IOException;
import java.io.InputStream;

final class C7739v extends InputStream {
    public final /* synthetic */ C7738u f40220a;

    C7739v(C7738u c7738u) {
        this.f40220a = c7738u;
    }

    public final int read() {
        if (this.f40220a.f40219c) {
            throw new IOException("closed");
        } else if (this.f40220a.f40217a.f40188c == 0 && this.f40220a.f40218b.mo6423a(this.f40220a.f40217a, 8192) == -1) {
            return -1;
        } else {
            return this.f40220a.f40217a.mo6496f() & HprofParser.ROOT_UNKNOWN;
        }
    }

    public final int read(byte[] bArr, int i, int i2) {
        if (this.f40220a.f40219c) {
            throw new IOException("closed");
        }
        ad.m37329a((long) bArr.length, (long) i, (long) i2);
        if (this.f40220a.f40217a.f40188c == 0 && this.f40220a.f40218b.mo6423a(this.f40220a.f40217a, 8192) == -1) {
            return -1;
        }
        return this.f40220a.f40217a.m37370a(bArr, i, i2);
    }

    public final int available() {
        if (!this.f40220a.f40219c) {
            return (int) Math.min(this.f40220a.f40217a.f40188c, 2147483647L);
        }
        throw new IOException("closed");
    }

    public final void close() {
        this.f40220a.close();
    }

    public final String toString() {
        return this.f40220a + ".inputStream()";
    }
}
