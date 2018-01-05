package android.support.v4.p037h;

import java.util.ConcurrentModificationException;
import java.util.Map;

public class C0304u {
    public static Object[] f1709b;
    public static int f1710c;
    public static Object[] f1711d;
    public static int f1712e;
    public int[] f1713f;
    public Object[] f1714g;
    public int f1715h;

    private static int m1623a(int[] iArr, int i, int i2) {
        try {
            return C0310e.m1672a(iArr, i, i2);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new ConcurrentModificationException();
        }
    }

    private final int m1622a(Object obj, int i) {
        int i2 = this.f1715h;
        if (i2 == 0) {
            return -1;
        }
        int a = C0304u.m1623a(this.f1713f, i2, i);
        if (a < 0 || obj.equals(this.f1714g[a << 1])) {
            return a;
        }
        int i3 = a + 1;
        while (i3 < i2 && this.f1713f[i3] == i) {
            if (obj.equals(this.f1714g[i3 << 1])) {
                return i3;
            }
            i3++;
        }
        a--;
        while (a >= 0 && this.f1713f[a] == i) {
            if (obj.equals(this.f1714g[a << 1])) {
                return a;
            }
            a--;
        }
        return i3 ^ -1;
    }

    private final int m1621a() {
        int i = this.f1715h;
        if (i == 0) {
            return -1;
        }
        int a = C0304u.m1623a(this.f1713f, i, 0);
        if (a < 0 || this.f1714g[a << 1] == null) {
            return a;
        }
        int i2 = a + 1;
        while (i2 < i && this.f1713f[i2] == 0) {
            if (this.f1714g[i2 << 1] == null) {
                return i2;
            }
            i2++;
        }
        a--;
        while (a >= 0 && this.f1713f[a] == 0) {
            if (this.f1714g[a << 1] == null) {
                return a;
            }
            a--;
        }
        return i2 ^ -1;
    }

    private final void m1625e(int i) {
        Object[] objArr;
        if (i == 8) {
            synchronized (C0305a.class) {
                if (f1711d != null) {
                    objArr = f1711d;
                    this.f1714g = objArr;
                    f1711d = (Object[]) objArr[0];
                    this.f1713f = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    f1712e--;
                    return;
                }
            }
        } else if (i == 4) {
            synchronized (C0305a.class) {
                if (f1709b != null) {
                    objArr = f1709b;
                    this.f1714g = objArr;
                    f1709b = (Object[]) objArr[0];
                    this.f1713f = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    f1710c--;
                    return;
                }
            }
        }
        this.f1713f = new int[i];
        this.f1714g = new Object[(i << 1)];
    }

    private static void m1624a(int[] iArr, Object[] objArr, int i) {
        int i2;
        if (iArr.length == 8) {
            synchronized (C0305a.class) {
                if (f1712e < 10) {
                    objArr[0] = f1711d;
                    objArr[1] = iArr;
                    for (i2 = (i << 1) - 1; i2 >= 2; i2--) {
                        objArr[i2] = null;
                    }
                    f1711d = objArr;
                    f1712e++;
                }
            }
        } else if (iArr.length == 4) {
            synchronized (C0305a.class) {
                if (f1710c < 10) {
                    objArr[0] = f1709b;
                    objArr[1] = iArr;
                    for (i2 = (i << 1) - 1; i2 >= 2; i2--) {
                        objArr[i2] = null;
                    }
                    f1709b = objArr;
                    f1710c++;
                }
            }
        }
    }

    public C0304u() {
        this.f1713f = C0310e.f1733a;
        this.f1714g = C0310e.f1735c;
        this.f1715h = 0;
    }

    public C0304u(int i) {
        if (i == 0) {
            this.f1713f = C0310e.f1733a;
            this.f1714g = C0310e.f1735c;
        } else {
            m1625e(i);
        }
        this.f1715h = 0;
    }

    public C0304u(C0304u c0304u) {
        int i = 0;
        this();
        if (c0304u != null) {
            int i2 = c0304u.f1715h;
            m1627a(this.f1715h + i2);
            if (this.f1715h != 0) {
                while (i < i2) {
                    put(c0304u.m1629b(i), c0304u.m1630c(i));
                    i++;
                }
            } else if (i2 > 0) {
                System.arraycopy(c0304u.f1713f, 0, this.f1713f, 0, i2);
                System.arraycopy(c0304u.f1714g, 0, this.f1714g, 0, i2 << 1);
                this.f1715h = i2;
            }
        }
    }

    public void clear() {
        if (this.f1715h > 0) {
            int[] iArr = this.f1713f;
            Object[] objArr = this.f1714g;
            int i = this.f1715h;
            this.f1713f = C0310e.f1733a;
            this.f1714g = C0310e.f1735c;
            this.f1715h = 0;
            C0304u.m1624a(iArr, objArr, i);
        }
        if (this.f1715h > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public final void m1627a(int i) {
        int i2 = this.f1715h;
        if (this.f1713f.length < i) {
            int[] iArr = this.f1713f;
            Object[] objArr = this.f1714g;
            m1625e(i);
            if (this.f1715h > 0) {
                System.arraycopy(iArr, 0, this.f1713f, 0, i2);
                System.arraycopy(objArr, 0, this.f1714g, 0, i2 << 1);
            }
            C0304u.m1624a(iArr, objArr, i2);
        }
        if (this.f1715h != i2) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean containsKey(Object obj) {
        return m1626a(obj) >= 0;
    }

    public final int m1626a(Object obj) {
        return obj == null ? m1621a() : m1622a(obj, obj.hashCode());
    }

    final int m1628b(Object obj) {
        int i = 1;
        int i2 = this.f1715h * 2;
        Object[] objArr = this.f1714g;
        if (obj == null) {
            while (i < i2) {
                if (objArr[i] == null) {
                    return i >> 1;
                }
                i += 2;
            }
        } else {
            while (i < i2) {
                if (obj.equals(objArr[i])) {
                    return i >> 1;
                }
                i += 2;
            }
        }
        return -1;
    }

    public boolean containsValue(Object obj) {
        return m1628b(obj) >= 0;
    }

    public Object get(Object obj) {
        int a = m1626a(obj);
        return a >= 0 ? this.f1714g[(a << 1) + 1] : null;
    }

    public final Object m1629b(int i) {
        return this.f1714g[i << 1];
    }

    public final Object m1630c(int i) {
        return this.f1714g[(i << 1) + 1];
    }

    public boolean isEmpty() {
        return this.f1715h <= 0;
    }

    public Object put(Object obj, Object obj2) {
        int a;
        int i;
        int i2 = 8;
        int i3 = this.f1715h;
        if (obj == null) {
            a = m1621a();
            i = 0;
        } else {
            i = obj.hashCode();
            a = m1622a(obj, i);
        }
        if (a >= 0) {
            int i4 = (a << 1) + 1;
            Object obj3 = this.f1714g[i4];
            this.f1714g[i4] = obj2;
            return obj3;
        }
        a ^= -1;
        if (i3 >= this.f1713f.length) {
            if (i3 >= 8) {
                i2 = (i3 >> 1) + i3;
            } else if (i3 < 4) {
                i2 = 4;
            }
            int[] iArr = this.f1713f;
            Object[] objArr = this.f1714g;
            m1625e(i2);
            if (i3 != this.f1715h) {
                throw new ConcurrentModificationException();
            }
            if (this.f1713f.length > 0) {
                System.arraycopy(iArr, 0, this.f1713f, 0, iArr.length);
                System.arraycopy(objArr, 0, this.f1714g, 0, objArr.length);
            }
            C0304u.m1624a(iArr, objArr, i3);
        }
        if (a < i3) {
            System.arraycopy(this.f1713f, a, this.f1713f, a + 1, i3 - a);
            System.arraycopy(this.f1714g, a << 1, this.f1714g, (a + 1) << 1, (this.f1715h - a) << 1);
        }
        if (i3 != this.f1715h || a >= this.f1713f.length) {
            throw new ConcurrentModificationException();
        }
        this.f1713f[a] = i;
        this.f1714g[a << 1] = obj;
        this.f1714g[(a << 1) + 1] = obj2;
        this.f1715h++;
        return null;
    }

    public Object remove(Object obj) {
        int a = m1626a(obj);
        if (a >= 0) {
            return m1631d(a);
        }
        return null;
    }

    public final Object m1631d(int i) {
        int i2 = 8;
        Object obj = this.f1714g[(i << 1) + 1];
        int i3 = this.f1715h;
        if (i3 <= 1) {
            C0304u.m1624a(this.f1713f, this.f1714g, i3);
            this.f1713f = C0310e.f1733a;
            this.f1714g = C0310e.f1735c;
            i2 = 0;
        } else {
            int i4 = i3 - 1;
            if (this.f1713f.length <= 8 || this.f1715h >= this.f1713f.length / 3) {
                if (i < i4) {
                    System.arraycopy(this.f1713f, i + 1, this.f1713f, i, i4 - i);
                    System.arraycopy(this.f1714g, (i + 1) << 1, this.f1714g, i << 1, (i4 - i) << 1);
                }
                this.f1714g[i4 << 1] = null;
                this.f1714g[(i4 << 1) + 1] = null;
                i2 = i4;
            } else {
                if (i3 > 8) {
                    i2 = (i3 >> 1) + i3;
                }
                Object obj2 = this.f1713f;
                Object obj3 = this.f1714g;
                m1625e(i2);
                if (i3 != this.f1715h) {
                    throw new ConcurrentModificationException();
                }
                if (i > 0) {
                    System.arraycopy(obj2, 0, this.f1713f, 0, i);
                    System.arraycopy(obj3, 0, this.f1714g, 0, i << 1);
                }
                if (i < i4) {
                    System.arraycopy(obj2, i + 1, this.f1713f, i, i4 - i);
                    System.arraycopy(obj3, (i + 1) << 1, this.f1714g, i << 1, (i4 - i) << 1);
                }
                i2 = i4;
            }
        }
        if (i3 != this.f1715h) {
            throw new ConcurrentModificationException();
        }
        this.f1715h = i2;
        return obj;
    }

    public int size() {
        return this.f1715h;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        int i;
        Object b;
        Object c;
        Object obj2;
        if (obj instanceof C0304u) {
            C0304u c0304u = (C0304u) obj;
            if (size() != c0304u.size()) {
                return false;
            }
            i = 0;
            while (i < this.f1715h) {
                try {
                    b = m1629b(i);
                    c = m1630c(i);
                    obj2 = c0304u.get(b);
                    if (c == null) {
                        if (obj2 != null || !c0304u.containsKey(b)) {
                            return false;
                        }
                    } else if (!c.equals(obj2)) {
                        return false;
                    }
                    i++;
                } catch (NullPointerException e) {
                    return false;
                } catch (ClassCastException e2) {
                    return false;
                }
            }
            return true;
        } else if (!(obj instanceof Map)) {
            return false;
        } else {
            Map map = (Map) obj;
            if (size() != map.size()) {
                return false;
            }
            i = 0;
            while (i < this.f1715h) {
                try {
                    b = m1629b(i);
                    c = m1630c(i);
                    obj2 = map.get(b);
                    if (c == null) {
                        if (obj2 != null || !map.containsKey(b)) {
                            return false;
                        }
                    } else if (!c.equals(obj2)) {
                        return false;
                    }
                    i++;
                } catch (NullPointerException e3) {
                    return false;
                } catch (ClassCastException e4) {
                    return false;
                }
            }
            return true;
        }
    }

    public int hashCode() {
        int[] iArr = this.f1713f;
        Object[] objArr = this.f1714g;
        int i = this.f1715h;
        int i2 = 1;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            Object obj = objArr[i2];
            i4 += (obj == null ? 0 : obj.hashCode()) ^ iArr[i3];
            i3++;
            i2 += 2;
        }
        return i4;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder stringBuilder = new StringBuilder(this.f1715h * 28);
        stringBuilder.append('{');
        for (int i = 0; i < this.f1715h; i++) {
            if (i > 0) {
                stringBuilder.append(", ");
            }
            C0304u b = m1629b(i);
            if (b != this) {
                stringBuilder.append(b);
            } else {
                stringBuilder.append("(this Map)");
            }
            stringBuilder.append('=');
            b = m1630c(i);
            if (b != this) {
                stringBuilder.append(b);
            } else {
                stringBuilder.append("(this Map)");
            }
        }
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
