package android.support.v7.p045f;

public final class C0444a implements C0443j {
    public final C0443j f2528a;
    public int f2529b = 0;
    public int f2530c = -1;
    public int f2531d = -1;
    public Object f2532e = null;

    public C0444a(C0443j c0443j) {
        this.f2528a = c0443j;
    }

    public final void m2660a() {
        if (this.f2529b != 0) {
            switch (this.f2529b) {
                case 1:
                    this.f2528a.mo620a(this.f2530c, this.f2531d);
                    break;
                case 2:
                    this.f2528a.mo622b(this.f2530c, this.f2531d);
                    break;
                case 3:
                    this.f2528a.mo621a(this.f2530c, this.f2531d, this.f2532e);
                    break;
            }
            this.f2532e = null;
            this.f2529b = 0;
        }
    }

    public final void mo620a(int i, int i2) {
        if (this.f2529b != 1 || i < this.f2530c || i > this.f2530c + this.f2531d) {
            m2660a();
            this.f2530c = i;
            this.f2531d = i2;
            this.f2529b = 1;
            return;
        }
        this.f2531d += i2;
        this.f2530c = Math.min(i, this.f2530c);
    }

    public final void mo622b(int i, int i2) {
        if (this.f2529b != 2 || this.f2530c < i || this.f2530c > i + i2) {
            m2660a();
            this.f2530c = i;
            this.f2531d = i2;
            this.f2529b = 2;
            return;
        }
        this.f2531d += i2;
        this.f2530c = i;
    }

    public final void mo623c(int i, int i2) {
        m2660a();
        this.f2528a.mo623c(i, i2);
    }

    public final void mo621a(int i, int i2, Object obj) {
        if (this.f2529b != 3 || i > this.f2530c + this.f2531d || i + i2 < this.f2530c || this.f2532e != obj) {
            m2660a();
            this.f2530c = i;
            this.f2531d = i2;
            this.f2532e = obj;
            this.f2529b = 3;
            return;
        }
        int i3 = this.f2530c + this.f2531d;
        this.f2530c = Math.min(i, this.f2530c);
        this.f2531d = Math.max(i3, i + i2) - this.f2530c;
    }
}
