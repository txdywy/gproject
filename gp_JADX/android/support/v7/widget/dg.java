package android.support.v7.widget;

import android.util.SparseIntArray;

public abstract class dg {
    public final SparseIntArray f3370a = new SparseIntArray();
    public boolean f3371b = false;

    public abstract int mo813a(int i);

    final int m3502b(int i, int i2) {
        if (!this.f3371b) {
            return mo814a(i, i2);
        }
        int i3 = this.f3370a.get(i, -1);
        if (i3 != -1) {
            return i3;
        }
        i3 = mo814a(i, i2);
        this.f3370a.put(i, i3);
        return i3;
    }

    public int mo814a(int i, int i2) {
        int a = mo813a(i);
        if (a == i2) {
            return 0;
        }
        int size;
        int i3;
        int i4;
        if (this.f3371b && this.f3370a.size() > 0) {
            size = this.f3370a.size() - 1;
            i3 = 0;
            while (i3 <= size) {
                i4 = (i3 + size) >>> 1;
                if (this.f3370a.keyAt(i4) < i) {
                    i3 = i4 + 1;
                } else {
                    size = i4 - 1;
                }
            }
            size = i3 - 1;
            if (size < 0 || size >= this.f3370a.size()) {
                size = -1;
            } else {
                size = this.f3370a.keyAt(size);
            }
            if (size >= 0) {
                i3 = this.f3370a.get(size) + mo813a(size);
                size++;
                i4 = size;
                while (i4 < i) {
                    size = mo813a(i4);
                    i3 += size;
                    if (i3 == i2) {
                        size = 0;
                    } else if (i3 <= i2) {
                        size = i3;
                    }
                    i4++;
                    i3 = size;
                }
                if (i3 + a > i2) {
                    return i3;
                }
                return 0;
            }
        }
        size = 0;
        i3 = 0;
        i4 = size;
        while (i4 < i) {
            size = mo813a(i4);
            i3 += size;
            if (i3 == i2) {
                size = 0;
            } else if (i3 <= i2) {
                size = i3;
            }
            i4++;
            i3 = size;
        }
        if (i3 + a > i2) {
            return 0;
        }
        return i3;
    }

    public final int m3503c(int i, int i2) {
        int a = mo813a(i);
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (i3 < i) {
            int a2 = mo813a(i3);
            i5 += a2;
            if (i5 == i2) {
                i4++;
                a2 = 0;
            } else if (i5 > i2) {
                i4++;
            } else {
                a2 = i5;
            }
            i3++;
            i5 = a2;
        }
        if (i5 + a > i2) {
            return i4 + 1;
        }
        return i4;
    }
}
