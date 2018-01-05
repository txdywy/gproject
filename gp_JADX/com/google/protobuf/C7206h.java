package com.google.protobuf;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

final class C7206h extends C7198f implements bh, RandomAccess {
    public boolean[] f35426b;
    public int f35427c;

    C7206h() {
        this(new boolean[10], 0);
    }

    private C7206h(boolean[] zArr, int i) {
        this.f35426b = zArr;
        this.f35427c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7206h)) {
            return super.equals(obj);
        }
        C7206h c7206h = (C7206h) obj;
        if (this.f35427c != c7206h.f35427c) {
            return false;
        }
        boolean[] zArr = c7206h.f35426b;
        for (int i = 0; i < this.f35427c; i++) {
            if (this.f35426b[i] != zArr[i]) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f35427c; i2++) {
            i = (i * 31) + bb.m32992a(this.f35426b[i2]);
        }
        return i;
    }

    public final int size() {
        return this.f35427c;
    }

    public final void m33466a(boolean z) {
        m33462a(this.f35427c, z);
    }

    private final void m33462a(int i, boolean z) {
        m32868c();
        if (i < 0 || i > this.f35427c) {
            throw new IndexOutOfBoundsException(m33464c(i));
        }
        if (this.f35427c < this.f35426b.length) {
            System.arraycopy(this.f35426b, i, this.f35426b, i + 1, this.f35427c - i);
        } else {
            Object obj = new boolean[(((this.f35427c * 3) / 2) + 1)];
            System.arraycopy(this.f35426b, 0, obj, 0, i);
            System.arraycopy(this.f35426b, i, obj, i + 1, this.f35427c - i);
            this.f35426b = obj;
        }
        this.f35426b[i] = z;
        this.f35427c++;
        this.modCount++;
    }

    public final boolean addAll(Collection collection) {
        m32868c();
        bb.m32993a((Object) collection);
        if (!(collection instanceof C7206h)) {
            return super.addAll(collection);
        }
        C7206h c7206h = (C7206h) collection;
        if (c7206h.f35427c == 0) {
            return false;
        }
        if (Integer.MAX_VALUE - this.f35427c < c7206h.f35427c) {
            throw new OutOfMemoryError();
        }
        int i = this.f35427c + c7206h.f35427c;
        if (i > this.f35426b.length) {
            this.f35426b = Arrays.copyOf(this.f35426b, i);
        }
        System.arraycopy(c7206h.f35426b, 0, this.f35426b, this.f35427c, c7206h.f35427c);
        this.f35427c = i;
        this.modCount++;
        return true;
    }

    public final boolean remove(Object obj) {
        m32868c();
        for (int i = 0; i < this.f35427c; i++) {
            if (obj.equals(Boolean.valueOf(this.f35426b[i]))) {
                System.arraycopy(this.f35426b, i + 1, this.f35426b, i, this.f35427c - i);
                this.f35427c--;
                this.modCount++;
                return true;
            }
        }
        return false;
    }

    private final void m33463b(int i) {
        if (i < 0 || i >= this.f35427c) {
            throw new IndexOutOfBoundsException(m33464c(i));
        }
    }

    private final String m33464c(int i) {
        return "Index:" + i + ", Size:" + this.f35427c;
    }

    public final /* synthetic */ Object set(int i, Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        m32868c();
        m33463b(i);
        boolean z = this.f35426b[i];
        this.f35426b[i] = booleanValue;
        return Boolean.valueOf(z);
    }

    public final /* synthetic */ Object remove(int i) {
        m32868c();
        m33463b(i);
        boolean z = this.f35426b[i];
        System.arraycopy(this.f35426b, i + 1, this.f35426b, i, this.f35427c - i);
        this.f35427c--;
        this.modCount++;
        return Boolean.valueOf(z);
    }

    public final /* synthetic */ void add(int i, Object obj) {
        m33462a(i, ((Boolean) obj).booleanValue());
    }

    public final /* synthetic */ bh mo6094a(int i) {
        if (i >= this.f35427c) {
            return new C7206h(Arrays.copyOf(this.f35426b, i), this.f35427c);
        }
        throw new IllegalArgumentException();
    }

    public final /* synthetic */ Object get(int i) {
        m33463b(i);
        return Boolean.valueOf(this.f35426b[i]);
    }

    static {
        new C7206h().f35102a = false;
    }
}
