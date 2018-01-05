package android.support.v4.view;

import android.view.View;
import android.view.ViewParent;

public final class aa {
    public ViewParent f1839a;
    public ViewParent f1840b;
    public final View f1841c;
    public boolean f1842d;
    public int[] f1843e;

    public aa(View view) {
        this.f1841c = view;
    }

    public final void m1794a(boolean z) {
        if (this.f1842d) {
            ai.f1848a.mo426y(this.f1841c);
        }
        this.f1842d = z;
    }

    public final boolean m1797a(int i) {
        return m1793c(i) != null;
    }

    public final boolean m1798a(int i, int i2) {
        if (m1797a(i2)) {
            return true;
        }
        if (this.f1842d) {
            View view = this.f1841c;
            for (ViewParent parent = this.f1841c.getParent(); parent != null; parent = parent.getParent()) {
                if (bp.m1975a(parent, view, this.f1841c, i, i2)) {
                    m1792a(i2, parent);
                    bp.m1977b(parent, view, this.f1841c, i, i2);
                    return true;
                }
                if (parent instanceof View) {
                    view = (View) parent;
                }
            }
        }
        return false;
    }

    public final void m1803b(int i) {
        ViewParent c = m1793c(i);
        if (c != null) {
            bp.m1972a(c, this.f1841c, i);
            m1792a(i, null);
        }
    }

    public final boolean m1799a(int i, int i2, int i3, int i4, int[] iArr) {
        return m1800a(i, i2, i3, i4, iArr, 0);
    }

    public final boolean m1800a(int i, int i2, int i3, int i4, int[] iArr, int i5) {
        if (this.f1842d) {
            ViewParent c = m1793c(i5);
            if (c == null) {
                return false;
            }
            if (i != 0 || i2 != 0 || i3 != 0 || i4 != 0) {
                int i6;
                int i7;
                if (iArr != null) {
                    this.f1841c.getLocationInWindow(iArr);
                    int i8 = iArr[0];
                    i6 = iArr[1];
                    i7 = i8;
                } else {
                    i6 = 0;
                    i7 = 0;
                }
                bp.m1973a(c, this.f1841c, i, i2, i3, i4, i5);
                if (iArr != null) {
                    this.f1841c.getLocationInWindow(iArr);
                    iArr[0] = iArr[0] - i7;
                    iArr[1] = iArr[1] - i6;
                }
                return true;
            } else if (iArr != null) {
                iArr[0] = 0;
                iArr[1] = 0;
            }
        }
        return false;
    }

    public final boolean m1801a(int i, int i2, int[] iArr, int[] iArr2) {
        return m1802a(i, i2, iArr, iArr2, 0);
    }

    public final boolean m1802a(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        if (this.f1842d) {
            ViewParent c = m1793c(i3);
            if (c == null) {
                return false;
            }
            if (i != 0 || i2 != 0) {
                int i4;
                int i5;
                int[] iArr3;
                if (iArr2 != null) {
                    this.f1841c.getLocationInWindow(iArr2);
                    int i6 = iArr2[0];
                    i4 = iArr2[1];
                    i5 = i6;
                } else {
                    i4 = 0;
                    i5 = 0;
                }
                if (iArr == null) {
                    if (this.f1843e == null) {
                        this.f1843e = new int[2];
                    }
                    iArr3 = this.f1843e;
                } else {
                    iArr3 = iArr;
                }
                iArr3[0] = 0;
                iArr3[1] = 0;
                bp.m1974a(c, this.f1841c, i, i2, iArr3, i3);
                if (iArr2 != null) {
                    this.f1841c.getLocationInWindow(iArr2);
                    iArr2[0] = iArr2[0] - i5;
                    iArr2[1] = iArr2[1] - i4;
                }
                return (iArr3[0] == 0 && iArr3[1] == 0) ? false : true;
            } else if (iArr2 != null) {
                iArr2[0] = 0;
                iArr2[1] = 0;
            }
        }
        return false;
    }

    public final boolean m1796a(float f, float f2, boolean z) {
        if (!this.f1842d) {
            return false;
        }
        ViewParent c = m1793c(0);
        if (c == null) {
            return false;
        }
        return bp.f1882a.mo437a(c, this.f1841c, f, f2, z);
    }

    public final boolean m1795a(float f, float f2) {
        if (!this.f1842d) {
            return false;
        }
        ViewParent c = m1793c(0);
        if (c == null) {
            return false;
        }
        return bp.f1882a.mo436a(c, this.f1841c, f, f2);
    }

    private final ViewParent m1793c(int i) {
        switch (i) {
            case 0:
                return this.f1839a;
            case 1:
                return this.f1840b;
            default:
                return null;
        }
    }

    private final void m1792a(int i, ViewParent viewParent) {
        switch (i) {
            case 0:
                this.f1839a = viewParent;
                return;
            case 1:
                this.f1840b = viewParent;
                return;
            default:
                return;
        }
    }
}
