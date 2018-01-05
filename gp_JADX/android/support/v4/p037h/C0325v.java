package android.support.v4.p037h;

public final class C0325v implements Cloneable {
    public static final Object f1767a = new Object();
    public boolean f1768b;
    public int[] f1769c;
    public Object[] f1770d;
    public int f1771e;

    public C0325v() {
        this(10);
    }

    public C0325v(int i) {
        this.f1768b = false;
        if (i == 0) {
            this.f1769c = C0310e.f1733a;
            this.f1770d = C0310e.f1735c;
        } else {
            int a = C0310e.m1671a(i);
            this.f1769c = new int[a];
            this.f1770d = new Object[a];
        }
        this.f1771e = 0;
    }

    private final C0325v m1706c() {
        try {
            C0325v c0325v = (C0325v) super.clone();
            try {
                c0325v.f1769c = (int[]) this.f1769c.clone();
                c0325v.f1770d = (Object[]) this.f1770d.clone();
                return c0325v;
            } catch (CloneNotSupportedException e) {
                return c0325v;
            }
        } catch (CloneNotSupportedException e2) {
            return null;
        }
    }

    public final Object m1709a(int i) {
        int a = C0310e.m1672a(this.f1769c, this.f1771e, i);
        if (a < 0 || this.f1770d[a] == f1767a) {
            return null;
        }
        return this.f1770d[a];
    }

    public final void m1712b(int i) {
        if (this.f1770d[i] != f1767a) {
            this.f1770d[i] = f1767a;
            this.f1768b = true;
        }
    }

    private final void m1707d() {
        int i = this.f1771e;
        int[] iArr = this.f1769c;
        Object[] objArr = this.f1770d;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != f1767a) {
                if (i3 != i2) {
                    iArr[i2] = iArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        this.f1768b = false;
        this.f1771e = i2;
    }

    public final void m1710a(int i, Object obj) {
        int a = C0310e.m1672a(this.f1769c, this.f1771e, i);
        if (a >= 0) {
            this.f1770d[a] = obj;
            return;
        }
        a ^= -1;
        if (a >= this.f1771e || this.f1770d[a] != f1767a) {
            if (this.f1768b && this.f1771e >= this.f1769c.length) {
                m1707d();
                a = C0310e.m1672a(this.f1769c, this.f1771e, i) ^ -1;
            }
            if (this.f1771e >= this.f1769c.length) {
                int a2 = C0310e.m1671a(this.f1771e + 1);
                Object obj2 = new int[a2];
                Object obj3 = new Object[a2];
                System.arraycopy(this.f1769c, 0, obj2, 0, this.f1769c.length);
                System.arraycopy(this.f1770d, 0, obj3, 0, this.f1770d.length);
                this.f1769c = obj2;
                this.f1770d = obj3;
            }
            if (this.f1771e - a != 0) {
                System.arraycopy(this.f1769c, a, this.f1769c, a + 1, this.f1771e - a);
                System.arraycopy(this.f1770d, a, this.f1770d, a + 1, this.f1771e - a);
            }
            this.f1769c[a] = i;
            this.f1770d[a] = obj;
            this.f1771e++;
            return;
        }
        this.f1769c[a] = i;
        this.f1770d[a] = obj;
    }

    public final int m1708a() {
        if (this.f1768b) {
            m1707d();
        }
        return this.f1771e;
    }

    public final int m1714c(int i) {
        if (this.f1768b) {
            m1707d();
        }
        return this.f1769c[i];
    }

    public final Object m1715d(int i) {
        if (this.f1768b) {
            m1707d();
        }
        return this.f1770d[i];
    }

    public final int m1716e(int i) {
        if (this.f1768b) {
            m1707d();
        }
        return C0310e.m1672a(this.f1769c, this.f1771e, i);
    }

    public final void m1711b() {
        int i = this.f1771e;
        Object[] objArr = this.f1770d;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.f1771e = 0;
        this.f1768b = false;
    }

    public final void m1713b(int i, Object obj) {
        if (this.f1771e == 0 || i > this.f1769c[this.f1771e - 1]) {
            if (this.f1768b && this.f1771e >= this.f1769c.length) {
                m1707d();
            }
            int i2 = this.f1771e;
            if (i2 >= this.f1769c.length) {
                int a = C0310e.m1671a(i2 + 1);
                Object obj2 = new int[a];
                Object obj3 = new Object[a];
                System.arraycopy(this.f1769c, 0, obj2, 0, this.f1769c.length);
                System.arraycopy(this.f1770d, 0, obj3, 0, this.f1770d.length);
                this.f1769c = obj2;
                this.f1770d = obj3;
            }
            this.f1769c[i2] = i;
            this.f1770d[i2] = obj;
            this.f1771e = i2 + 1;
            return;
        }
        m1710a(i, obj);
    }

    public final String toString() {
        if (m1708a() <= 0) {
            return "{}";
        }
        StringBuilder stringBuilder = new StringBuilder(this.f1771e * 28);
        stringBuilder.append('{');
        for (int i = 0; i < this.f1771e; i++) {
            if (i > 0) {
                stringBuilder.append(", ");
            }
            stringBuilder.append(m1714c(i));
            stringBuilder.append('=');
            C0325v d = m1715d(i);
            if (d != this) {
                stringBuilder.append(d);
            } else {
                stringBuilder.append("(this Map)");
            }
        }
        stringBuilder.append('}');
        return stringBuilder.toString();
    }

    public final /* synthetic */ Object clone() {
        return m1706c();
    }
}
