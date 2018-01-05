package p046b.p047a;

import java.util.ConcurrentModificationException;

abstract class C0517z {
    public final C0516d f3688c;
    public int f3689d = this.f3688c.size();
    public int f3690e = this.f3688c.mo932a();

    public C0517z(C0516d c0516d) {
        this.f3688c = c0516d;
    }

    protected abstract int mo943a();

    public boolean hasNext() {
        return mo943a() >= 0;
    }

    public void remove() {
        if (this.f3689d != this.f3688c.size()) {
            throw new ConcurrentModificationException();
        }
        try {
            this.f3688c.f3673g = true;
            this.f3688c.mo933b(this.f3690e);
            this.f3689d--;
        } finally {
            this.f3688c.f3673g = false;
        }
    }
}
