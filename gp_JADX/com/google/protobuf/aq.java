package com.google.protobuf;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

final class aq extends C7198f implements bh, RandomAccess {
    public float[] f35174b;
    public int f35175c;

    aq() {
        this(new float[10], 0);
    }

    private aq(float[] fArr, int i) {
        this.f35174b = fArr;
        this.f35175c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aq)) {
            return super.equals(obj);
        }
        aq aqVar = (aq) obj;
        if (this.f35175c != aqVar.f35175c) {
            return false;
        }
        float[] fArr = aqVar.f35174b;
        for (int i = 0; i < this.f35175c; i++) {
            if (this.f35174b[i] != fArr[i]) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f35175c; i2++) {
            i = (i * 31) + Float.floatToIntBits(this.f35174b[i2]);
        }
        return i;
    }

    public final int size() {
        return this.f35175c;
    }

    public final void m32930a(float f) {
        m32926a(this.f35175c, f);
    }

    private final void m32926a(int i, float f) {
        m32868c();
        if (i < 0 || i > this.f35175c) {
            throw new IndexOutOfBoundsException(m32928c(i));
        }
        if (this.f35175c < this.f35174b.length) {
            System.arraycopy(this.f35174b, i, this.f35174b, i + 1, this.f35175c - i);
        } else {
            Object obj = new float[(((this.f35175c * 3) / 2) + 1)];
            System.arraycopy(this.f35174b, 0, obj, 0, i);
            System.arraycopy(this.f35174b, i, obj, i + 1, this.f35175c - i);
            this.f35174b = obj;
        }
        this.f35174b[i] = f;
        this.f35175c++;
        this.modCount++;
    }

    public final boolean addAll(Collection collection) {
        m32868c();
        bb.m32993a((Object) collection);
        if (!(collection instanceof aq)) {
            return super.addAll(collection);
        }
        aq aqVar = (aq) collection;
        if (aqVar.f35175c == 0) {
            return false;
        }
        if (Integer.MAX_VALUE - this.f35175c < aqVar.f35175c) {
            throw new OutOfMemoryError();
        }
        int i = this.f35175c + aqVar.f35175c;
        if (i > this.f35174b.length) {
            this.f35174b = Arrays.copyOf(this.f35174b, i);
        }
        System.arraycopy(aqVar.f35174b, 0, this.f35174b, this.f35175c, aqVar.f35175c);
        this.f35175c = i;
        this.modCount++;
        return true;
    }

    public final boolean remove(Object obj) {
        m32868c();
        for (int i = 0; i < this.f35175c; i++) {
            if (obj.equals(Float.valueOf(this.f35174b[i]))) {
                System.arraycopy(this.f35174b, i + 1, this.f35174b, i, this.f35175c - i);
                this.f35175c--;
                this.modCount++;
                return true;
            }
        }
        return false;
    }

    private final void m32927b(int i) {
        if (i < 0 || i >= this.f35175c) {
            throw new IndexOutOfBoundsException(m32928c(i));
        }
    }

    private final String m32928c(int i) {
        return "Index:" + i + ", Size:" + this.f35175c;
    }

    public final /* synthetic */ Object set(int i, Object obj) {
        float floatValue = ((Float) obj).floatValue();
        m32868c();
        m32927b(i);
        float f = this.f35174b[i];
        this.f35174b[i] = floatValue;
        return Float.valueOf(f);
    }

    public final /* synthetic */ Object remove(int i) {
        m32868c();
        m32927b(i);
        float f = this.f35174b[i];
        System.arraycopy(this.f35174b, i + 1, this.f35174b, i, this.f35175c - i);
        this.f35175c--;
        this.modCount++;
        return Float.valueOf(f);
    }

    public final /* synthetic */ void add(int i, Object obj) {
        m32926a(i, ((Float) obj).floatValue());
    }

    public final /* synthetic */ bh mo6094a(int i) {
        if (i >= this.f35175c) {
            return new aq(Arrays.copyOf(this.f35174b, i), this.f35175c);
        }
        throw new IllegalArgumentException();
    }

    public final /* synthetic */ Object get(int i) {
        m32927b(i);
        return Float.valueOf(this.f35174b[i]);
    }

    static {
        new aq().f35102a = false;
    }
}
