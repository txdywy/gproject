package com.google.android.finsky.bg;

public final class ab {
    public final float f8507a = 0.25f;
    public final boolean f8508b;
    public final int f8509c;
    public final int f8510d;
    public final int f8511e;

    public ab(boolean z, int i, int i2, int i3) {
        this.f8508b = z;
        this.f8509c = i;
        this.f8510d = i2;
        this.f8511e = i3;
    }

    public final void m9204a(ac acVar, int i, int i2) {
        int i3;
        int i4;
        Object obj;
        acVar.bX_();
        int peekableChildCount = acVar.getPeekableChildCount();
        int i5 = 0;
        int i6 = i;
        while (i5 < peekableChildCount) {
            int b;
            int i7;
            int a = acVar.mo3019a(i5) + i6;
            if (a <= i2) {
                i5++;
                i6 = a;
            } else {
                if (i5 != peekableChildCount - 1 || a - i > i2 || acVar.mo3023b()) {
                    i3 = i6;
                    i6 = 1;
                    i4 = i;
                } else {
                    i3 = a - i;
                    obj = null;
                    i4 = 0;
                }
                if (obj != null) {
                    peekableChildCount = acVar.mo3019a(i5);
                    b = acVar.mo3022b(i5);
                    i7 = peekableChildCount - (b * 2);
                    i6 = Math.round(((float) peekableChildCount) * this.f8507a);
                    i4 = Math.round(((float) peekableChildCount) * (1.0f - this.f8507a));
                    a = (int) Math.round(((double) b) + (((double) i7) / 3.0d));
                    if (i6 <= b) {
                        i6 = a;
                    }
                    if (i6 + i3 > i2) {
                        if (i4 >= b + i7) {
                            i4 = peekableChildCount - a;
                        }
                        i4 = i2 - Math.min(i4 + i3, i2);
                    } else {
                        i4 = i2 - (i3 - Math.round(((float) acVar.mo3019a(i5 - 1)) * this.f8507a));
                        i5--;
                    }
                    if (i4 >= 10) {
                        m9203b(acVar, 0, (i4 / ((i5 * 2) + 1)) * 2);
                    }
                } else if (this.f8508b) {
                    i5 = i3 + i4;
                    if (i5 <= i2) {
                        i5 -= i4 * 2;
                        a = 0;
                    } else {
                        a = i4;
                    }
                    i6 = peekableChildCount != 1 ? this.f8509c : peekableChildCount != 2 ? this.f8510d : 0;
                    if (i6 <= 0) {
                        i4 = m9203b(acVar, i6, 0) + i5;
                    } else {
                        i4 = i5;
                    }
                    i3 = i2 - i4;
                    if (i3 < this.f8511e && i3 > 10) {
                        i4 = m9203b(acVar, i6, i3 / peekableChildCount) + i5;
                    }
                    if (i4 <= i2) {
                        acVar.bX_();
                    } else {
                        i5 = i4;
                    }
                    i4 = ((i2 - i5) / 2) + a;
                    acVar.a_(i4, i4);
                }
            }
        }
        i3 = i6;
        obj = null;
        i4 = i;
        if (obj != null) {
            peekableChildCount = acVar.mo3019a(i5);
            b = acVar.mo3022b(i5);
            i7 = peekableChildCount - (b * 2);
            i6 = Math.round(((float) peekableChildCount) * this.f8507a);
            i4 = Math.round(((float) peekableChildCount) * (1.0f - this.f8507a));
            a = (int) Math.round(((double) b) + (((double) i7) / 3.0d));
            if (i6 <= b) {
                i6 = a;
            }
            if (i6 + i3 > i2) {
                i4 = i2 - (i3 - Math.round(((float) acVar.mo3019a(i5 - 1)) * this.f8507a));
                i5--;
            } else {
                if (i4 >= b + i7) {
                    i4 = peekableChildCount - a;
                }
                i4 = i2 - Math.min(i4 + i3, i2);
            }
            if (i4 >= 10) {
                m9203b(acVar, 0, (i4 / ((i5 * 2) + 1)) * 2);
            }
        } else if (this.f8508b) {
            i5 = i3 + i4;
            if (i5 <= i2) {
                a = i4;
            } else {
                i5 -= i4 * 2;
                a = 0;
            }
            if (peekableChildCount != 1) {
                if (peekableChildCount != 2) {
                }
            }
            if (i6 <= 0) {
                i4 = i5;
            } else {
                i4 = m9203b(acVar, i6, 0) + i5;
            }
            i3 = i2 - i4;
            i4 = m9203b(acVar, i6, i3 / peekableChildCount) + i5;
            if (i4 <= i2) {
                i5 = i4;
            } else {
                acVar.bX_();
            }
            i4 = ((i2 - i5) / 2) + a;
            acVar.a_(i4, i4);
        }
    }

    private static int m9203b(ac acVar, int i, int i2) {
        int peekableChildCount = acVar.getPeekableChildCount();
        int i3 = 0;
        for (int i4 = 0; i4 < peekableChildCount; i4++) {
            int a = acVar.mo3019a(i4) + i2;
            if (a < i) {
                a = i - a;
            } else {
                a = i2;
            }
            acVar.mo3020a(i4, a);
            i3 += a;
        }
        return i3;
    }
}
