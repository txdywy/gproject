package p046b.p047a;

public abstract class C0516d implements Cloneable {
    public transient int f3667a;
    public transient int f3668b;
    public float f3669c;
    public int f3670d;
    public int f3671e;
    public float f3672f;
    public boolean f3673g;

    public C0516d() {
        this((byte) 0);
    }

    protected abstract int mo932a();

    protected abstract void mo938d(int i);

    private C0516d(byte b) {
        this.f3673g = false;
        this.f3669c = 0.5f;
        this.f3672f = 0.5f;
        mo934c((int) Math.ceil(20.0d));
    }

    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }

    public boolean isEmpty() {
        return this.f3667a == 0;
    }

    public int size() {
        return this.f3667a;
    }

    public final void m3923a(int i) {
        if (i > this.f3670d - size()) {
            mo938d(C0519b.m3972a(((int) Math.ceil((double) (((float) i) + (((float) size()) / this.f3669c)))) + 1));
            mo952e(mo932a());
        }
    }

    protected void mo933b(int i) {
        this.f3667a--;
        if (this.f3672f != 0.0f) {
            this.f3671e--;
            if (!this.f3673g && this.f3671e <= 0) {
                mo938d(C0519b.m3972a(((int) Math.ceil((double) (((float) size()) / this.f3669c))) + 1));
                mo952e(mo932a());
                if (this.f3672f != 0.0f) {
                    mo953f(size());
                }
            }
        }
    }

    public void clear() {
        this.f3667a = 0;
        this.f3668b = mo932a();
    }

    protected int mo934c(int i) {
        int a = C0519b.m3972a(i);
        mo952e(a);
        mo953f(i);
        return a;
    }

    private final void mo952e(int i) {
        this.f3670d = Math.min(i - 1, (int) Math.floor((double) (((float) i) * this.f3669c)));
        this.f3668b = i - this.f3667a;
    }

    private final void mo953f(int i) {
        if (this.f3672f != 0.0f) {
            this.f3671e = Math.round(((float) i) * this.f3672f);
        }
    }

    protected final void m3924a(boolean z) {
        if (z) {
            this.f3668b--;
        }
        int i = this.f3667a + 1;
        this.f3667a = i;
        if (i > this.f3670d || this.f3668b == 0) {
            mo938d(this.f3667a > this.f3670d ? C0519b.m3972a(mo932a() << 1) : mo932a());
            mo952e(mo932a());
        }
    }
}
