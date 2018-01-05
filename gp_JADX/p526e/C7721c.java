package p526e;

import java.io.IOException;

final class C7721c implements aa {
    public final /* synthetic */ aa f40183a;
    public final /* synthetic */ C7634a f40184b;

    C7721c(C7634a c7634a, aa aaVar) {
        this.f40184b = c7634a;
        this.f40183a = aaVar;
    }

    public final long mo6423a(C7726f c7726f, long j) {
        this.f40184b.cV_();
        try {
            long a = this.f40183a.mo6423a(c7726f, j);
            this.f40184b.m36850a(true);
            return a;
        } catch (IOException e) {
            throw this.f40184b.m36851b(e);
        } catch (Throwable th) {
            this.f40184b.m36850a(false);
        }
    }

    public final void close() {
        try {
            this.f40183a.close();
            this.f40184b.m36850a(true);
        } catch (IOException e) {
            throw this.f40184b.m36851b(e);
        } catch (Throwable th) {
            this.f40184b.m36850a(false);
        }
    }

    public final ab mo6424a() {
        return this.f40184b;
    }

    public final String toString() {
        return "AsyncTimeout.source(" + this.f40183a + ")";
    }
}
