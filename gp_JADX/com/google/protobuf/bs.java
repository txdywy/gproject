package com.google.protobuf;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

final class bs extends C7198f implements bh, RandomAccess {
    public long[] f35234b;
    public int f35235c;

    bs() {
        this(new long[10], 0);
    }

    private bs(long[] jArr, int i) {
        this.f35234b = jArr;
        this.f35235c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bs)) {
            return super.equals(obj);
        }
        bs bsVar = (bs) obj;
        if (this.f35235c != bsVar.f35235c) {
            return false;
        }
        long[] jArr = bsVar.f35234b;
        for (int i = 0; i < this.f35235c; i++) {
            if (this.f35234b[i] != jArr[i]) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f35235c; i2++) {
            i = (i * 31) + bb.m32991a(this.f35234b[i2]);
        }
        return i;
    }

    public final long m33034b(int i) {
        m33030c(i);
        return this.f35234b[i];
    }

    public final int size() {
        return this.f35235c;
    }

    public final void m33033a(long j) {
        m33029a(this.f35235c, j);
    }

    private final void m33029a(int i, long j) {
        m32868c();
        if (i < 0 || i > this.f35235c) {
            throw new IndexOutOfBoundsException(m33031d(i));
        }
        if (this.f35235c < this.f35234b.length) {
            System.arraycopy(this.f35234b, i, this.f35234b, i + 1, this.f35235c - i);
        } else {
            Object obj = new long[(((this.f35235c * 3) / 2) + 1)];
            System.arraycopy(this.f35234b, 0, obj, 0, i);
            System.arraycopy(this.f35234b, i, obj, i + 1, this.f35235c - i);
            this.f35234b = obj;
        }
        this.f35234b[i] = j;
        this.f35235c++;
        this.modCount++;
    }

    public final boolean addAll(Collection collection) {
        m32868c();
        bb.m32993a((Object) collection);
        if (!(collection instanceof bs)) {
            return super.addAll(collection);
        }
        bs bsVar = (bs) collection;
        if (bsVar.f35235c == 0) {
            return false;
        }
        if (Integer.MAX_VALUE - this.f35235c < bsVar.f35235c) {
            throw new OutOfMemoryError();
        }
        int i = this.f35235c + bsVar.f35235c;
        if (i > this.f35234b.length) {
            this.f35234b = Arrays.copyOf(this.f35234b, i);
        }
        System.arraycopy(bsVar.f35234b, 0, this.f35234b, this.f35235c, bsVar.f35235c);
        this.f35235c = i;
        this.modCount++;
        return true;
    }

    public final boolean remove(Object obj) {
        m32868c();
        for (int i = 0; i < this.f35235c; i++) {
            if (obj.equals(Long.valueOf(this.f35234b[i]))) {
                System.arraycopy(this.f35234b, i + 1, this.f35234b, i, this.f35235c - i);
                this.f35235c--;
                this.modCount++;
                return true;
            }
        }
        return false;
    }

    private final void m33030c(int i) {
        if (i < 0 || i >= this.f35235c) {
            throw new IndexOutOfBoundsException(m33031d(i));
        }
    }

    private final String m33031d(int i) {
        return "Index:" + i + ", Size:" + this.f35235c;
    }

    public final /* synthetic */ Object set(int i, Object obj) {
        long longValue = ((Long) obj).longValue();
        m32868c();
        m33030c(i);
        long j = this.f35234b[i];
        this.f35234b[i] = longValue;
        return Long.valueOf(j);
    }

    public final /* synthetic */ Object remove(int i) {
        m32868c();
        m33030c(i);
        long j = this.f35234b[i];
        System.arraycopy(this.f35234b, i + 1, this.f35234b, i, this.f35235c - i);
        this.f35235c--;
        this.modCount++;
        return Long.valueOf(j);
    }

    public final /* synthetic */ void add(int i, Object obj) {
        m33029a(i, ((Long) obj).longValue());
    }

    public final /* synthetic */ bh mo6094a(int i) {
        if (i >= this.f35235c) {
            return new bs(Arrays.copyOf(this.f35234b, i), this.f35235c);
        }
        throw new IllegalArgumentException();
    }

    public final /* synthetic */ Object get(int i) {
        return Long.valueOf(m33034b(i));
    }

    static {
        new bs().f35102a = false;
    }
}
