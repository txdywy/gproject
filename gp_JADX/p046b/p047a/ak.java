package p046b.p047a;

import java.util.Arrays;

public abstract class ak extends C0516d implements am {
    public static final Object f3684k = new Object();
    public static final Object f3685l = new Object();
    public transient Object[] f3686i;
    public am f3687j = this;

    public ak mo948b() {
        ak akVar = (ak) super.clone();
        akVar.f3686i = (Object[]) this.f3686i.clone();
        return akVar;
    }

    protected final int mo932a() {
        return this.f3686i.length;
    }

    protected void mo933b(int i) {
        this.f3686i[i] = f3684k;
        super.mo933b(i);
    }

    protected int mo934c(int i) {
        int c = super.mo934c(i);
        this.f3686i = new Object[c];
        Arrays.fill(this.f3686i, f3685l);
        return c;
    }

    public final boolean m3960a(ao aoVar) {
        Object[] objArr = this.f3686i;
        int length = objArr.length;
        while (true) {
            int i = length - 1;
            if (length <= 0) {
                return true;
            }
            if (objArr[i] != f3685l && objArr[i] != f3684k && !aoVar.execute(objArr[i])) {
                return false;
            }
            length = i;
        }
    }

    public boolean contains(Object obj) {
        return m3959a(obj) >= 0;
    }

    protected final int m3959a(Object obj) {
        am amVar = this.f3687j;
        Object[] objArr = this.f3686i;
        int length = objArr.length;
        int c = amVar.mo942c(obj) & Integer.MAX_VALUE;
        int i = c % length;
        Object obj2 = objArr[i];
        if (obj2 == f3685l) {
            return -1;
        }
        if (obj2 == f3684k || !amVar.mo941a(obj2, obj)) {
            Object obj3;
            Object obj4;
            int i2 = (c % (length - 2)) + 1;
            int i3 = i;
            while (true) {
                i3 -= i2;
                if (i3 < 0) {
                    i3 += length;
                }
                obj3 = objArr[i3];
                if (obj3 == f3685l || (obj3 != f3684k && this.f3687j.mo941a(obj3, obj))) {
                    obj4 = obj3;
                    i = i3;
                    obj2 = obj4;
                }
            }
            obj4 = obj3;
            i = i3;
            obj2 = obj4;
        }
        return obj2 == f3685l ? -1 : i;
    }

    protected final int m3962b(Object obj) {
        am amVar = this.f3687j;
        Object[] objArr = this.f3686i;
        int length = objArr.length;
        int c = amVar.mo942c(obj) & Integer.MAX_VALUE;
        int i = c % length;
        Object obj2 = objArr[i];
        if (obj2 == f3685l) {
            return i;
        }
        if (obj2 != f3684k && amVar.mo941a(obj2, obj)) {
            return (-i) - 1;
        }
        int i2 = (c % (length - 2)) + 1;
        if (obj2 != f3684k) {
            int i3;
            Object obj3;
            Object obj4;
            while (true) {
                i3 = i - i2;
                if (i3 < 0) {
                    i3 += length;
                }
                obj3 = objArr[i3];
                if (obj3 == f3685l || obj3 == f3684k || amVar.mo941a(obj3, obj)) {
                    obj4 = obj3;
                    i = i3;
                    obj2 = obj4;
                } else {
                    i = i3;
                }
            }
            obj4 = obj3;
            i = i3;
            obj2 = obj4;
        }
        if (obj2 != f3684k) {
            return obj2 != f3685l ? (-i) - 1 : i;
        } else {
            c = i;
            while (obj2 != f3685l && (obj2 == f3684k || !amVar.mo941a(obj2, obj))) {
                c -= i2;
                if (c < 0) {
                    c += length;
                }
                obj2 = objArr[c];
            }
            if (obj2 != f3685l) {
                return (-c) - 1;
            }
            return i;
        }
    }

    public final int mo942c(Object obj) {
        return obj == null ? 0 : obj.hashCode();
    }

    public final boolean mo941a(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        } else {
            return obj.equals(obj2);
        }
    }

    protected static void m3957b(Object obj, Object obj2) {
        throw new IllegalArgumentException("Equal objects must have equal hashcodes. During rehashing, Trove discovered that the following two objects claim to be equal (as in java.lang.Object.equals()) but their hashCodes (or those calculated by your TObjectHashingStrategy) are not equal.This violates the general contract of java.lang.Object.hashCode().  See bullet point two in that method's documentation. object #1 =" + obj + "; object #2 =" + obj2);
    }

    public /* synthetic */ Object clone() {
        return mo948b();
    }
}
