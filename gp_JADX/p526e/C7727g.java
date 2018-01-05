package p526e;

import com.squareup.haha.perflib.HprofParser;
import java.io.InputStream;

final class C7727g extends InputStream {
    public final /* synthetic */ C7726f f40189a;

    C7727g(C7726f c7726f) {
        this.f40189a = c7726f;
    }

    public final int read() {
        if (this.f40189a.f40188c > 0) {
            return this.f40189a.mo6496f() & HprofParser.ROOT_UNKNOWN;
        }
        return -1;
    }

    public final int read(byte[] bArr, int i, int i2) {
        return this.f40189a.m37370a(bArr, i, i2);
    }

    public final int available() {
        return (int) Math.min(this.f40189a.f40188c, 2147483647L);
    }

    public final void close() {
    }

    public final String toString() {
        return this.f40189a + ".inputStream()";
    }
}
