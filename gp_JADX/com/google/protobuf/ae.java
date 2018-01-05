package com.google.protobuf;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

final class ae extends C7198f implements bh, RandomAccess {
    public double[] f35103b;
    public int f35104c;

    ae() {
        this(new double[10], 0);
    }

    private ae(double[] dArr, int i) {
        this.f35103b = dArr;
        this.f35104c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ae)) {
            return super.equals(obj);
        }
        ae aeVar = (ae) obj;
        if (this.f35104c != aeVar.f35104c) {
            return false;
        }
        double[] dArr = aeVar.f35103b;
        for (int i = 0; i < this.f35104c; i++) {
            if (this.f35103b[i] != dArr[i]) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f35104c; i2++) {
            i = (i * 31) + bb.m32991a(Double.doubleToLongBits(this.f35103b[i2]));
        }
        return i;
    }

    public final int size() {
        return this.f35104c;
    }

    public final void m32873a(double d) {
        m32869a(this.f35104c, d);
    }

    private final void m32869a(int i, double d) {
        m32868c();
        if (i < 0 || i > this.f35104c) {
            throw new IndexOutOfBoundsException(m32871c(i));
        }
        if (this.f35104c < this.f35103b.length) {
            System.arraycopy(this.f35103b, i, this.f35103b, i + 1, this.f35104c - i);
        } else {
            Object obj = new double[(((this.f35104c * 3) / 2) + 1)];
            System.arraycopy(this.f35103b, 0, obj, 0, i);
            System.arraycopy(this.f35103b, i, obj, i + 1, this.f35104c - i);
            this.f35103b = obj;
        }
        this.f35103b[i] = d;
        this.f35104c++;
        this.modCount++;
    }

    public final boolean addAll(Collection collection) {
        m32868c();
        bb.m32993a((Object) collection);
        if (!(collection instanceof ae)) {
            return super.addAll(collection);
        }
        ae aeVar = (ae) collection;
        if (aeVar.f35104c == 0) {
            return false;
        }
        if (Integer.MAX_VALUE - this.f35104c < aeVar.f35104c) {
            throw new OutOfMemoryError();
        }
        int i = this.f35104c + aeVar.f35104c;
        if (i > this.f35103b.length) {
            this.f35103b = Arrays.copyOf(this.f35103b, i);
        }
        System.arraycopy(aeVar.f35103b, 0, this.f35103b, this.f35104c, aeVar.f35104c);
        this.f35104c = i;
        this.modCount++;
        return true;
    }

    public final boolean remove(Object obj) {
        m32868c();
        for (int i = 0; i < this.f35104c; i++) {
            if (obj.equals(Double.valueOf(this.f35103b[i]))) {
                System.arraycopy(this.f35103b, i + 1, this.f35103b, i, this.f35104c - i);
                this.f35104c--;
                this.modCount++;
                return true;
            }
        }
        return false;
    }

    private final void m32870b(int i) {
        if (i < 0 || i >= this.f35104c) {
            throw new IndexOutOfBoundsException(m32871c(i));
        }
    }

    private final String m32871c(int i) {
        return "Index:" + i + ", Size:" + this.f35104c;
    }

    public final /* synthetic */ Object set(int i, Object obj) {
        double doubleValue = ((Double) obj).doubleValue();
        m32868c();
        m32870b(i);
        double d = this.f35103b[i];
        this.f35103b[i] = doubleValue;
        return Double.valueOf(d);
    }

    public final /* synthetic */ Object remove(int i) {
        m32868c();
        m32870b(i);
        double d = this.f35103b[i];
        System.arraycopy(this.f35103b, i + 1, this.f35103b, i, this.f35104c - i);
        this.f35104c--;
        this.modCount++;
        return Double.valueOf(d);
    }

    public final /* synthetic */ void add(int i, Object obj) {
        m32869a(i, ((Double) obj).doubleValue());
    }

    public final /* synthetic */ bh mo6094a(int i) {
        if (i >= this.f35104c) {
            return new ae(Arrays.copyOf(this.f35103b, i), this.f35104c);
        }
        throw new IllegalArgumentException();
    }

    public final /* synthetic */ Object get(int i) {
        m32870b(i);
        return Double.valueOf(this.f35103b[i]);
    }

    static {
        new ae().f35102a = false;
    }
}
