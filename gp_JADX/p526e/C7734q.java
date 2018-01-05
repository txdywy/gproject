package p526e;

import java.io.OutputStream;

final class C7734q implements C7631z {
    public final /* synthetic */ ab f40209a;
    public final /* synthetic */ OutputStream f40210b;

    C7734q(ab abVar, OutputStream outputStream) {
        this.f40209a = abVar;
        this.f40210b = outputStream;
    }

    public final void a_(C7726f c7726f, long j) {
        ad.m37329a(c7726f.f40188c, 0, j);
        while (j > 0) {
            this.f40209a.mo6480f();
            C7740w c7740w = c7726f.f40187b;
            int min = (int) Math.min(j, (long) (c7740w.f40223c - c7740w.f40222b));
            this.f40210b.write(c7740w.f40221a, c7740w.f40222b, min);
            c7740w.f40222b += min;
            j -= (long) min;
            c7726f.f40188c -= (long) min;
            if (c7740w.f40222b == c7740w.f40223c) {
                c7726f.f40187b = c7740w.m37485a();
                C7741x.m37489a(c7740w);
            }
        }
    }

    public final void flush() {
        this.f40210b.flush();
    }

    public final void close() {
        this.f40210b.close();
    }

    public final ab mo6454a() {
        return this.f40209a;
    }

    public final String toString() {
        return "sink(" + this.f40210b + ")";
    }
}
