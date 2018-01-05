package android.support.v7.widget;

import android.util.SparseIntArray;

public abstract class dc {
    public final SparseIntArray f3354a = new SparseIntArray();
    public boolean f3355b = false;

    public abstract int mo809a(int i);

    final int m3466b(int i, int i2) {
        if (!this.f3355b) {
            return mo810a(i, i2);
        }
        int i3 = this.f3354a.get(i, -1);
        if (i3 != -1) {
            return i3;
        }
        i3 = mo810a(i, i2);
        this.f3354a.put(i, i3);
        return i3;
    }

    public int mo810a(int i, int i2) {
        int a = mo809a(i);
        if (a == i2) {
            return 0;
        }
        int size;
        int i3;
        int i4;
        if (this.f3355b && this.f3354a.size() > 0) {
            size = this.f3354a.size() - 1;
            i3 = 0;
            while (i3 <= size) {
                i4 = (i3 + size) >>> 1;
                if (this.f3354a.keyAt(i4) < i) {
                    i3 = i4 + 1;
                } else {
                    size = i4 - 1;
                }
            }
            size = i3 - 1;
            if (size < 0 || size >= this.f3354a.size()) {
                size = -1;
            } else {
                size = this.f3354a.keyAt(size);
            }
            if (size >= 0) {
                i3 = this.f3354a.get(size) + mo809a(size);
                size++;
                i4 = size;
                while (i4 < i) {
                    size = mo809a(i4);
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
            size = mo809a(i4);
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

    public final int m3467c(int i, int i2) {
        int a = mo809a(i);
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (i3 < i) {
            int a2 = mo809a(i3);
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
