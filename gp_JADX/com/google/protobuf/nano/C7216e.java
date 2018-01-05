package com.google.protobuf.nano;

public final class C7216e implements Cloneable {
    public static final C7217f f35455a = new C7217f();
    public boolean f35456b;
    public int[] f35457c;
    public C7217f[] f35458d;
    public int f35459e;

    public C7216e() {
        this(10);
    }

    private C7216e(int i) {
        this.f35456b = false;
        int c = C7216e.m33591c(i);
        this.f35457c = new int[c];
        this.f35458d = new C7217f[c];
        this.f35459e = 0;
    }

    public final C7217f m33595a(int i) {
        int d = m33593d(i);
        if (d < 0 || this.f35458d[d] == f35455a) {
            return null;
        }
        return this.f35458d[d];
    }

    private final void m33592c() {
        int i = this.f35459e;
        int[] iArr = this.f35457c;
        C7217f[] c7217fArr = this.f35458d;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            C7217f c7217f = c7217fArr[i3];
            if (c7217f != f35455a) {
                if (i3 != i2) {
                    iArr[i2] = iArr[i3];
                    c7217fArr[i2] = c7217f;
                    c7217fArr[i3] = null;
                }
                i2++;
            }
        }
        this.f35456b = false;
        this.f35459e = i2;
    }

    public final void m33596a(int i, C7217f c7217f) {
        int d = m33593d(i);
        if (d >= 0) {
            this.f35458d[d] = c7217f;
            return;
        }
        d ^= -1;
        if (d >= this.f35459e || this.f35458d[d] != f35455a) {
            if (this.f35456b && this.f35459e >= this.f35457c.length) {
                m33592c();
                d = m33593d(i) ^ -1;
            }
            if (this.f35459e >= this.f35457c.length) {
                int c = C7216e.m33591c(this.f35459e + 1);
                Object obj = new int[c];
                Object obj2 = new C7217f[c];
                System.arraycopy(this.f35457c, 0, obj, 0, this.f35457c.length);
                System.arraycopy(this.f35458d, 0, obj2, 0, this.f35458d.length);
                this.f35457c = obj;
                this.f35458d = obj2;
            }
            if (this.f35459e - d != 0) {
                System.arraycopy(this.f35457c, d, this.f35457c, d + 1, this.f35459e - d);
                System.arraycopy(this.f35458d, d, this.f35458d, d + 1, this.f35459e - d);
            }
            this.f35457c[d] = i;
            this.f35458d[d] = c7217f;
            this.f35459e++;
            return;
        }
        this.f35457c[d] = i;
        this.f35458d[d] = c7217f;
    }

    public final int m33594a() {
        if (this.f35456b) {
            m33592c();
        }
        return this.f35459e;
    }

    public final boolean m33598b() {
        return m33594a() == 0;
    }

    public final C7217f m33597b(int i) {
        if (this.f35456b) {
            m33592c();
        }
        return this.f35458d[i];
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C7216e)) {
            return false;
        }
        C7216e c7216e = (C7216e) obj;
        if (m33594a() != c7216e.m33594a()) {
            return false;
        }
        int i;
        boolean z;
        int[] iArr = this.f35457c;
        int[] iArr2 = c7216e.f35457c;
        int i2 = this.f35459e;
        for (i = 0; i < i2; i++) {
            if (iArr[i] != iArr2[i]) {
                z = false;
                break;
            }
        }
        z = true;
        if (z) {
            C7217f[] c7217fArr = this.f35458d;
            C7217f[] c7217fArr2 = c7216e.f35458d;
            i2 = this.f35459e;
            for (i = 0; i < i2; i++) {
                if (!c7217fArr[i].equals(c7217fArr2[i])) {
                    z = false;
                    break;
                }
            }
            z = true;
            if (z) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.f35456b) {
            m33592c();
        }
        int i = 17;
        for (int i2 = 0; i2 < this.f35459e; i2++) {
            i = (((i * 31) + this.f35457c[i2]) * 31) + this.f35458d[i2].hashCode();
        }
        return i;
    }

    private static int m33591c(int i) {
        int i2 = i * 4;
        for (int i3 = 4; i3 < 32; i3++) {
            if (i2 <= (1 << i3) - 12) {
                i2 = (1 << i3) - 12;
                break;
            }
        }
        return i2 / 4;
    }

    private final int m33593d(int i) {
        int i2 = 0;
        int i3 = this.f35459e - 1;
        while (i2 <= i3) {
            int i4 = (i2 + i3) >>> 1;
            int i5 = this.f35457c[i4];
            if (i5 < i) {
                i2 = i4 + 1;
            } else if (i5 <= i) {
                return i4;
            } else {
                i3 = i4 - 1;
            }
        }
        return i2 ^ -1;
    }

    public final /* synthetic */ Object clone() {
        int a = m33594a();
        C7216e c7216e = new C7216e(a);
        System.arraycopy(this.f35457c, 0, c7216e.f35457c, 0, a);
        for (int i = 0; i < a; i++) {
            if (this.f35458d[i] != null) {
                c7216e.f35458d[i] = (C7217f) this.f35458d[i].clone();
            }
        }
        c7216e.f35459e = a;
        return c7216e;
    }
}
