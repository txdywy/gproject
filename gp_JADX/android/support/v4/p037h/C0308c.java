package android.support.v4.p037h;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

public final class C0308c implements Collection, Set {
    public static final int[] f1721a = new int[0];
    public static final Object[] f1722b = new Object[0];
    public static Object[] f1723c;
    public static int f1724d;
    public static Object[] f1725e;
    public static int f1726f;
    public final boolean f1727g;
    public int[] f1728h;
    public Object[] f1729i;
    public int f1730j;
    public C0306j f1731k;

    private final int m1657a(Object obj, int i) {
        int i2 = this.f1730j;
        if (i2 == 0) {
            return -1;
        }
        int a = C0310e.m1672a(this.f1728h, i2, i);
        if (a < 0 || obj.equals(this.f1729i[a])) {
            return a;
        }
        int i3 = a + 1;
        while (i3 < i2 && this.f1728h[i3] == i) {
            if (obj.equals(this.f1729i[i3])) {
                return i3;
            }
            i3++;
        }
        a--;
        while (a >= 0 && this.f1728h[a] == i) {
            if (obj.equals(this.f1729i[a])) {
                return a;
            }
            a--;
        }
        return i3 ^ -1;
    }

    private final int m1656a() {
        int i = this.f1730j;
        if (i == 0) {
            return -1;
        }
        int a = C0310e.m1672a(this.f1728h, i, 0);
        if (a < 0 || this.f1729i[a] == null) {
            return a;
        }
        int i2 = a + 1;
        while (i2 < i && this.f1728h[i2] == 0) {
            if (this.f1729i[i2] == null) {
                return i2;
            }
            i2++;
        }
        a--;
        while (a >= 0 && this.f1728h[a] == 0) {
            if (this.f1729i[a] == null) {
                return a;
            }
            a--;
        }
        return i2 ^ -1;
    }

    private final void m1659b(int i) {
        Object[] objArr;
        if (i == 8) {
            synchronized (C0308c.class) {
                if (f1725e != null) {
                    objArr = f1725e;
                    this.f1729i = objArr;
                    f1725e = (Object[]) objArr[0];
                    this.f1728h = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    f1726f--;
                    return;
                }
            }
        } else if (i == 4) {
            synchronized (C0308c.class) {
                if (f1723c != null) {
                    objArr = f1723c;
                    this.f1729i = objArr;
                    f1723c = (Object[]) objArr[0];
                    this.f1728h = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    f1724d--;
                    return;
                }
            }
        }
        this.f1728h = new int[i];
        this.f1729i = new Object[i];
    }

    private static void m1658a(int[] iArr, Object[] objArr, int i) {
        int i2;
        if (iArr.length == 8) {
            synchronized (C0308c.class) {
                if (f1726f < 10) {
                    objArr[0] = f1725e;
                    objArr[1] = iArr;
                    for (i2 = i - 1; i2 >= 2; i2--) {
                        objArr[i2] = null;
                    }
                    f1725e = objArr;
                    f1726f++;
                }
            }
        } else if (iArr.length == 4) {
            synchronized (C0308c.class) {
                if (f1724d < 10) {
                    objArr[0] = f1723c;
                    objArr[1] = iArr;
                    for (i2 = i - 1; i2 >= 2; i2--) {
                        objArr[i2] = null;
                    }
                    f1723c = objArr;
                    f1724d++;
                }
            }
        }
    }

    public C0308c() {
        this(0, (byte) 0);
    }

    public C0308c(int i) {
        this(i, (byte) 0);
    }

    private C0308c(int i, byte b) {
        this.f1727g = false;
        if (i == 0) {
            this.f1728h = f1721a;
            this.f1729i = f1722b;
        } else {
            m1659b(i);
        }
        this.f1730j = 0;
    }

    public C0308c(Collection collection) {
        this();
        if (collection != null) {
            addAll(collection);
        }
    }

    public final void clear() {
        if (this.f1730j != 0) {
            C0308c.m1658a(this.f1728h, this.f1729i, this.f1730j);
            this.f1728h = f1721a;
            this.f1729i = f1722b;
            this.f1730j = 0;
        }
    }

    public final boolean contains(Object obj) {
        return m1660a(obj) >= 0;
    }

    public final int m1660a(Object obj) {
        if (obj == null) {
            return m1656a();
        }
        return m1657a(obj, this.f1727g ? System.identityHashCode(obj) : obj.hashCode());
    }

    public final boolean isEmpty() {
        return this.f1730j <= 0;
    }

    public final boolean add(Object obj) {
        int a;
        int i;
        if (obj == null) {
            a = m1656a();
            i = 0;
        } else {
            a = this.f1727g ? System.identityHashCode(obj) : obj.hashCode();
            i = a;
            a = m1657a(obj, a);
        }
        if (a >= 0) {
            return false;
        }
        int i2 = a ^ -1;
        if (this.f1730j >= this.f1728h.length) {
            a = this.f1730j >= 8 ? this.f1730j + (this.f1730j >> 1) : this.f1730j >= 4 ? 8 : 4;
            Object obj2 = this.f1728h;
            Object obj3 = this.f1729i;
            m1659b(a);
            if (this.f1728h.length > 0) {
                System.arraycopy(obj2, 0, this.f1728h, 0, obj2.length);
                System.arraycopy(obj3, 0, this.f1729i, 0, obj3.length);
            }
            C0308c.m1658a(obj2, obj3, this.f1730j);
        }
        if (i2 < this.f1730j) {
            System.arraycopy(this.f1728h, i2, this.f1728h, i2 + 1, this.f1730j - i2);
            System.arraycopy(this.f1729i, i2, this.f1729i, i2 + 1, this.f1730j - i2);
        }
        this.f1728h[i2] = i;
        this.f1729i[i2] = obj;
        this.f1730j++;
        return true;
    }

    public final boolean remove(Object obj) {
        int a = m1660a(obj);
        if (a < 0) {
            return false;
        }
        m1661a(a);
        return true;
    }

    public final Object m1661a(int i) {
        int i2 = 8;
        Object obj = this.f1729i[i];
        if (this.f1730j <= 1) {
            C0308c.m1658a(this.f1728h, this.f1729i, this.f1730j);
            this.f1728h = f1721a;
            this.f1729i = f1722b;
            this.f1730j = 0;
        } else if (this.f1728h.length <= 8 || this.f1730j >= this.f1728h.length / 3) {
            this.f1730j--;
            if (i < this.f1730j) {
                System.arraycopy(this.f1728h, i + 1, this.f1728h, i, this.f1730j - i);
                System.arraycopy(this.f1729i, i + 1, this.f1729i, i, this.f1730j - i);
            }
            this.f1729i[this.f1730j] = null;
        } else {
            if (this.f1730j > 8) {
                i2 = this.f1730j + (this.f1730j >> 1);
            }
            Object obj2 = this.f1728h;
            Object obj3 = this.f1729i;
            m1659b(i2);
            this.f1730j--;
            if (i > 0) {
                System.arraycopy(obj2, 0, this.f1728h, 0, i);
                System.arraycopy(obj3, 0, this.f1729i, 0, i);
            }
            if (i < this.f1730j) {
                System.arraycopy(obj2, i + 1, this.f1728h, i, this.f1730j - i);
                System.arraycopy(obj3, i + 1, this.f1729i, i, this.f1730j - i);
            }
        }
        return obj;
    }

    public final int size() {
        return this.f1730j;
    }

    public final Object[] toArray() {
        Object obj = new Object[this.f1730j];
        System.arraycopy(this.f1729i, 0, obj, 0, this.f1730j);
        return obj;
    }

    public final Object[] toArray(Object[] objArr) {
        Object obj;
        if (objArr.length < this.f1730j) {
            obj = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), this.f1730j);
        } else {
            obj = objArr;
        }
        System.arraycopy(this.f1729i, 0, obj, 0, this.f1730j);
        if (obj.length > this.f1730j) {
            obj[this.f1730j] = null;
        }
        return obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set = (Set) obj;
        if (size() != set.size()) {
            return false;
        }
        int i = 0;
        while (i < this.f1730j) {
            try {
                if (!set.contains(this.f1729i[i])) {
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
    }

    public final int hashCode() {
        int i = 0;
        int[] iArr = this.f1728h;
        int i2 = 0;
        while (i < this.f1730j) {
            i2 += iArr[i];
            i++;
        }
        return i2;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder stringBuilder = new StringBuilder(this.f1730j * 14);
        stringBuilder.append('{');
        for (int i = 0; i < this.f1730j; i++) {
            if (i > 0) {
                stringBuilder.append(", ");
            }
            C0308c c0308c = this.f1729i[i];
            if (c0308c != this) {
                stringBuilder.append(c0308c);
            } else {
                stringBuilder.append("(this Set)");
            }
        }
        stringBuilder.append('}');
        return stringBuilder.toString();
    }

    public final Iterator iterator() {
        if (this.f1731k == null) {
            this.f1731k = new C0309d(this);
        }
        return this.f1731k.m1646d().iterator();
    }

    public final boolean containsAll(Collection collection) {
        for (Object contains : collection) {
            if (!contains(contains)) {
                return false;
            }
        }
        return true;
    }

    public final boolean addAll(Collection collection) {
        Object obj;
        boolean z = false;
        int size = this.f1730j + collection.size();
        if (this.f1728h.length < size) {
            obj = this.f1728h;
            Object obj2 = this.f1729i;
            m1659b(size);
            if (this.f1730j > 0) {
                System.arraycopy(obj, 0, this.f1728h, 0, this.f1730j);
                System.arraycopy(obj2, 0, this.f1729i, 0, this.f1730j);
            }
            C0308c.m1658a(obj, obj2, this.f1730j);
        }
        for (Object obj3 : collection) {
            z |= add(obj3);
        }
        return z;
    }

    public final boolean removeAll(Collection collection) {
        boolean z = false;
        for (Object remove : collection) {
            z |= remove(remove);
        }
        return z;
    }

    public final boolean retainAll(Collection collection) {
        boolean z = false;
        for (int i = this.f1730j - 1; i >= 0; i--) {
            if (!collection.contains(this.f1729i[i])) {
                m1661a(i);
                z = true;
            }
        }
        return z;
    }
}
