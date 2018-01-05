package android.support.v7.widget;

final class hx {
    public int f3612a = 0;
    public int f3613b;
    public int f3614c;
    public int f3615d;
    public int f3616e;

    hx() {
    }

    final void m3853a(int i, int i2, int i3, int i4) {
        this.f3613b = i;
        this.f3614c = i2;
        this.f3615d = i3;
        this.f3616e = i4;
    }

    final void m3852a(int i) {
        this.f3612a |= i;
    }

    private static int m3851a(int i, int i2) {
        if (i > i2) {
            return 1;
        }
        if (i == i2) {
            return 2;
        }
        return 4;
    }

    final boolean m3854a() {
        if ((this.f3612a & 7) != 0 && (this.f3612a & (m3851a(this.f3615d, this.f3613b) << 0)) == 0) {
            return false;
        }
        if ((this.f3612a & 112) != 0 && (this.f3612a & (m3851a(this.f3615d, this.f3614c) << 4)) == 0) {
            return false;
        }
        if ((this.f3612a & 1792) != 0 && (this.f3612a & (m3851a(this.f3616e, this.f3613b) << 8)) == 0) {
            return false;
        }
        if ((this.f3612a & 28672) == 0 || (this.f3612a & (m3851a(this.f3616e, this.f3614c) << 12)) != 0) {
            return true;
        }
        return false;
    }
}
