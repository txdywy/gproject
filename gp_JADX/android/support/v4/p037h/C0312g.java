package android.support.v4.p037h;

import android.util.Log;
import java.io.Writer;

public final class C0312g extends Writer {
    public final String f1736a;
    public StringBuilder f1737b = new StringBuilder(128);

    public C0312g(String str) {
        this.f1736a = str;
    }

    public final void close() {
        m1678a();
    }

    public final void flush() {
        m1678a();
    }

    public final void write(char[] cArr, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            char c = cArr[i + i3];
            if (c == '\n') {
                m1678a();
            } else {
                this.f1737b.append(c);
            }
        }
    }

    private final void m1678a() {
        if (this.f1737b.length() > 0) {
            Log.d(this.f1736a, this.f1737b.toString());
            this.f1737b.delete(0, this.f1737b.length());
        }
    }
}
