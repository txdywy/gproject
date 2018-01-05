package android.support.v4.p037h;

public final class C0313h implements Cloneable {
    public static final Object f1738a = new Object();
    public boolean f1739b;
    public long[] f1740c;
    public Object[] f1741d;
    public int f1742e;

    public C0313h() {
        this(10);
    }

    public C0313h(int i) {
        this.f1739b = false;
        if (i == 0) {
            this.f1740c = C0310e.f1734b;
            this.f1741d = C0310e.f1735c;
        } else {
            int b = C0310e.m1675b(i);
            this.f1740c = new long[b];
            this.f1741d = new Object[b];
        }
        this.f1742e = 0;
    }

    private final C0313h m1679c() {
        try {
            C0313h c0313h = (C0313h) super.clone();
            try {
                c0313h.f1740c = (long[]) this.f1740c.clone();
                c0313h.f1741d = (Object[]) this.f1741d.clone();
                return c0313h;
            } catch (CloneNotSupportedException e) {
                return c0313h;
            }
        } catch (CloneNotSupportedException e2) {
            return null;
        }
    }

    public final Object m1684a(long j) {
        int a = C0310e.m1673a(this.f1740c, this.f1742e, j);
        if (a < 0 || this.f1741d[a] == f1738a) {
            return null;
        }
        return this.f1741d[a];
    }

    public final void m1688b(long j) {
        int a = C0310e.m1673a(this.f1740c, this.f1742e, j);
        if (a >= 0 && this.f1741d[a] != f1738a) {
            this.f1741d[a] = f1738a;
            this.f1739b = true;
        }
    }

    private final void m1680d() {
        int i = this.f1742e;
        long[] jArr = this.f1740c;
        Object[] objArr = this.f1741d;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != f1738a) {
                if (i3 != i2) {
                    jArr[i2] = jArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        this.f1739b = false;
        this.f1742e = i2;
    }

    public final void m1685a(long j, Object obj) {
        int a = C0310e.m1673a(this.f1740c, this.f1742e, j);
        if (a >= 0) {
            this.f1741d[a] = obj;
            return;
        }
        a ^= -1;
        if (a >= this.f1742e || this.f1741d[a] != f1738a) {
            if (this.f1739b && this.f1742e >= this.f1740c.length) {
                m1680d();
                a = C0310e.m1673a(this.f1740c, this.f1742e, j) ^ -1;
            }
            if (this.f1742e >= this.f1740c.length) {
                int b = C0310e.m1675b(this.f1742e + 1);
                Object obj2 = new long[b];
                Object obj3 = new Object[b];
                System.arraycopy(this.f1740c, 0, obj2, 0, this.f1740c.length);
                System.arraycopy(this.f1741d, 0, obj3, 0, this.f1741d.length);
                this.f1740c = obj2;
                this.f1741d = obj3;
            }
            if (this.f1742e - a != 0) {
                System.arraycopy(this.f1740c, a, this.f1740c, a + 1, this.f1742e - a);
                System.arraycopy(this.f1741d, a, this.f1741d, a + 1, this.f1742e - a);
            }
            this.f1740c[a] = j;
            this.f1741d[a] = obj;
            this.f1742e++;
            return;
        }
        this.f1740c[a] = j;
        this.f1741d[a] = obj;
    }

    public final int m1681a() {
        if (this.f1739b) {
            m1680d();
        }
        return this.f1742e;
    }

    public final long m1683a(int i) {
        if (this.f1739b) {
            m1680d();
        }
        return this.f1740c[i];
    }

    public final Object m1686b(int i) {
        if (this.f1739b) {
            m1680d();
        }
        return this.f1741d[i];
    }

    public final int m1690c(long j) {
        if (this.f1739b) {
            m1680d();
        }
        return C0310e.m1673a(this.f1740c, this.f1742e, j);
    }

    public final int m1682a(Object obj) {
        if (this.f1739b) {
            m1680d();
        }
        for (int i = 0; i < this.f1742e; i++) {
            if (this.f1741d[i] == obj) {
                return i;
            }
        }
        return -1;
    }

    public final void m1687b() {
        int i = this.f1742e;
        Object[] objArr = this.f1741d;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.f1742e = 0;
        this.f1739b = false;
    }

    public final void m1689b(long j, Object obj) {
        if (this.f1742e == 0 || j > this.f1740c[this.f1742e - 1]) {
            if (this.f1739b && this.f1742e >= this.f1740c.length) {
                m1680d();
            }
            int i = this.f1742e;
            if (i >= this.f1740c.length) {
                int b = C0310e.m1675b(i + 1);
                Object obj2 = new long[b];
                Object obj3 = new Object[b];
                System.arraycopy(this.f1740c, 0, obj2, 0, this.f1740c.length);
                System.arraycopy(this.f1741d, 0, obj3, 0, this.f1741d.length);
                this.f1740c = obj2;
                this.f1741d = obj3;
            }
            this.f1740c[i] = j;
            this.f1741d[i] = obj;
            this.f1742e = i + 1;
            return;
        }
        m1685a(j, obj);
    }

    public final String toString() {
        if (m1681a() <= 0) {
            return "{}";
        }
        StringBuilder stringBuilder = new StringBuilder(this.f1742e * 28);
        stringBuilder.append('{');
        for (int i = 0; i < this.f1742e; i++) {
            if (i > 0) {
                stringBuilder.append(", ");
            }
            stringBuilder.append(m1683a(i));
            stringBuilder.append('=');
            C0313h b = m1686b(i);
            if (b != this) {
                stringBuilder.append(b);
            } else {
                stringBuilder.append("(this Map)");
            }
        }
        stringBuilder.append('}');
        return stringBuilder.toString();
    }

    public final /* synthetic */ Object clone() {
        return m1679c();
    }
}
