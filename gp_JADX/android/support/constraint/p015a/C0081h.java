package android.support.constraint.p015a;

public final class C0081h {
    public String f294a;
    public int f295b = -1;
    public int f296c = -1;
    public int f297d = 0;
    public float f298e;
    public float[] f299f = new float[6];
    public C0082i f300g;
    public C0075b[] f301h = new C0075b[8];
    public int f302i = 0;

    public C0081h(C0082i c0082i) {
        this.f300g = c0082i;
    }

    final String m176a() {
        String str = this + "[";
        for (int i = 0; i < this.f299f.length; i++) {
            str = str + this.f299f[i];
            if (i < this.f299f.length - 1) {
                str = str + ", ";
            } else {
                str = str + "] ";
            }
        }
        return str;
    }

    final void m177a(C0075b c0075b) {
        int i = 0;
        for (int i2 = 0; i2 < this.f302i; i2++) {
            if (this.f301h[i2] == c0075b) {
                while (i < (this.f302i - i2) - 1) {
                    this.f301h[i2 + i] = this.f301h[(i2 + i) + 1];
                    i++;
                }
                this.f302i--;
                return;
            }
        }
    }

    public final void m178b() {
        this.f294a = null;
        this.f300g = C0082i.UNKNOWN;
        this.f297d = 0;
        this.f295b = -1;
        this.f296c = -1;
        this.f298e = 0.0f;
        this.f302i = 0;
    }

    public final String toString() {
        return "" + this.f294a;
    }
}
