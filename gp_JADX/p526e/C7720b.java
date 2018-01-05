package p526e;

import java.io.IOException;

final class C7720b implements C7631z {
    public final /* synthetic */ C7631z f40181a;
    public final /* synthetic */ C7634a f40182b;

    C7720b(C7634a c7634a, C7631z c7631z) {
        this.f40182b = c7634a;
        this.f40181a = c7631z;
    }

    public final void a_(C7726f c7726f, long j) {
        ad.m37329a(c7726f.f40188c, 0, j);
        long j2 = j;
        while (j2 > 0) {
            C7740w c7740w = c7726f.f40187b;
            long j3 = 0;
            while (j3 < 65536) {
                j3 += (long) (c7726f.f40187b.f40223c - c7726f.f40187b.f40222b);
                if (j3 >= j2) {
                    j3 = j2;
                    break;
                }
            }
            this.f40182b.cV_();
            try {
                this.f40181a.a_(c7726f, j3);
                j2 -= j3;
                this.f40182b.m36850a(true);
            } catch (IOException e) {
                throw this.f40182b.m36851b(e);
            } catch (Throwable th) {
                this.f40182b.m36850a(false);
            }
        }
    }

    public final void flush() {
        this.f40182b.cV_();
        try {
            this.f40181a.flush();
            this.f40182b.m36850a(true);
        } catch (IOException e) {
            throw this.f40182b.m36851b(e);
        } catch (Throwable th) {
            this.f40182b.m36850a(false);
        }
    }

    public final void close() {
        this.f40182b.cV_();
        try {
            this.f40181a.close();
            this.f40182b.m36850a(true);
        } catch (IOException e) {
            throw this.f40182b.m36851b(e);
        } catch (Throwable th) {
            this.f40182b.m36850a(false);
        }
    }

    public final ab mo6454a() {
        return this.f40182b;
    }

    public final String toString() {
        return "AsyncTimeout.sink(" + this.f40181a + ")";
    }
}
