package p526e;

public class C7612l implements aa {
    public final aa f39428b;

    public C7612l(aa aaVar) {
        if (aaVar == null) {
            throw new IllegalArgumentException("delegate == null");
        }
        this.f39428b = aaVar;
    }

    public long mo6423a(C7726f c7726f, long j) {
        return this.f39428b.mo6423a(c7726f, j);
    }

    public final ab mo6424a() {
        return this.f39428b.mo6424a();
    }

    public void close() {
        this.f39428b.close();
    }

    public String toString() {
        return getClass().getSimpleName() + "(" + this.f39428b.toString() + ")";
    }
}
