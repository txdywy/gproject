package com.google.protobuf;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

public final class ba extends C7198f implements be, RandomAccess {
    public static final ba f35205b;
    public int[] f35206c;
    public int f35207d;

    ba() {
        this(new int[10], 0);
    }

    private ba(int[] iArr, int i) {
        this.f35206c = iArr;
        this.f35207d = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ba)) {
            return super.equals(obj);
        }
        ba baVar = (ba) obj;
        if (this.f35207d != baVar.f35207d) {
            return false;
        }
        int[] iArr = baVar.f35206c;
        for (int i = 0; i < this.f35207d; i++) {
            if (this.f35206c[i] != iArr[i]) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f35207d; i2++) {
            i = (i * 31) + this.f35206c[i2];
        }
        return i;
    }

    public final be mo6130b(int i) {
        if (i >= this.f35207d) {
            return new ba(Arrays.copyOf(this.f35206c, i), this.f35207d);
        }
        throw new IllegalArgumentException();
    }

    public final int mo6131c(int i) {
        m32984e(i);
        return this.f35206c[i];
    }

    public final int size() {
        return this.f35207d;
    }

    public final void mo6132d(int i) {
        m32983a(this.f35207d, i);
    }

    private final void m32983a(int i, int i2) {
        m32868c();
        if (i < 0 || i > this.f35207d) {
            throw new IndexOutOfBoundsException(m32985f(i));
        }
        if (this.f35207d < this.f35206c.length) {
            System.arraycopy(this.f35206c, i, this.f35206c, i + 1, this.f35207d - i);
        } else {
            Object obj = new int[(((this.f35207d * 3) / 2) + 1)];
            System.arraycopy(this.f35206c, 0, obj, 0, i);
            System.arraycopy(this.f35206c, i, obj, i + 1, this.f35207d - i);
            this.f35206c = obj;
        }
        this.f35206c[i] = i2;
        this.f35207d++;
        this.modCount++;
    }

    public final boolean addAll(Collection collection) {
        m32868c();
        bb.m32993a((Object) collection);
        if (!(collection instanceof ba)) {
            return super.addAll(collection);
        }
        ba baVar = (ba) collection;
        if (baVar.f35207d == 0) {
            return false;
        }
        if (Integer.MAX_VALUE - this.f35207d < baVar.f35207d) {
            throw new OutOfMemoryError();
        }
        int i = this.f35207d + baVar.f35207d;
        if (i > this.f35206c.length) {
            this.f35206c = Arrays.copyOf(this.f35206c, i);
        }
        System.arraycopy(baVar.f35206c, 0, this.f35206c, this.f35207d, baVar.f35207d);
        this.f35207d = i;
        this.modCount++;
        return true;
    }

    public final boolean remove(Object obj) {
        m32868c();
        for (int i = 0; i < this.f35207d; i++) {
            if (obj.equals(Integer.valueOf(this.f35206c[i]))) {
                System.arraycopy(this.f35206c, i + 1, this.f35206c, i, this.f35207d - i);
                this.f35207d--;
                this.modCount++;
                return true;
            }
        }
        return false;
    }

    private final void m32984e(int i) {
        if (i < 0 || i >= this.f35207d) {
            throw new IndexOutOfBoundsException(m32985f(i));
        }
    }

    private final String m32985f(int i) {
        return "Index:" + i + ", Size:" + this.f35207d;
    }

    public final /* synthetic */ Object set(int i, Object obj) {
        int intValue = ((Integer) obj).intValue();
        m32868c();
        m32984e(i);
        int i2 = this.f35206c[i];
        this.f35206c[i] = intValue;
        return Integer.valueOf(i2);
    }

    public final /* synthetic */ Object remove(int i) {
        m32868c();
        m32984e(i);
        int i2 = this.f35206c[i];
        System.arraycopy(this.f35206c, i + 1, this.f35206c, i, this.f35207d - i);
        this.f35207d--;
        this.modCount++;
        return Integer.valueOf(i2);
    }

    public final /* synthetic */ void add(int i, Object obj) {
        m32983a(i, ((Integer) obj).intValue());
    }

    public final /* synthetic */ bh mo6094a(int i) {
        return mo6130b(i);
    }

    public final /* synthetic */ Object get(int i) {
        return Integer.valueOf(mo6131c(i));
    }

    static {
        C7198f baVar = new ba();
        f35205b = baVar;
        baVar.f35102a = false;
    }
}
