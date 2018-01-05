package android.support.constraint.p015a;

import java.util.Arrays;

public final class C0075b {
    public C0081h f269a = null;
    public float f270b = 0.0f;
    public final C0074a f271c;
    public boolean f272d = false;

    public C0075b(C0076c c0076c) {
        this.f271c = new C0074a(this, c0076c);
    }

    final void m145a() {
        C0074a c0074a = this.f271c;
        int i = 0;
        int i2 = c0074a.f266i;
        while (i2 != -1 && i < c0074a.f258a) {
            C0081h c0081h = c0074a.f260c.f275c[c0074a.f263f[i2]];
            for (int i3 = 0; i3 < c0081h.f302i; i3++) {
                if (c0081h.f301h[i3] == this) {
                    break;
                }
            }
            if (c0081h.f302i >= c0081h.f301h.length) {
                c0081h.f301h = (C0075b[]) Arrays.copyOf(c0081h.f301h, c0081h.f301h.length * 2);
            }
            c0081h.f301h[c0081h.f302i] = this;
            c0081h.f302i++;
            i2 = c0074a.f264g[i2];
            i++;
        }
    }

    public final String toString() {
        String str;
        Object obj;
        String str2 = "";
        if (this.f269a == null) {
            str2 = str2 + "0";
        } else {
            str2 = str2 + this.f269a;
        }
        str2 = str2 + " = ";
        if (this.f270b != 0.0f) {
            str = str2 + this.f270b;
            obj = 1;
        } else {
            str = str2;
            obj = null;
        }
        int i = this.f271c.f258a;
        String str3 = str;
        for (int i2 = 0; i2 < i; i2++) {
            C0081h a = this.f271c.m132a(i2);
            if (a != null) {
                float f;
                float b = this.f271c.m135b(i2);
                String c0081h = a.toString();
                if (obj == null) {
                    if (b < 0.0f) {
                        str3 = str3 + "- ";
                        f = b * -1.0f;
                    } else {
                        f = b;
                    }
                } else if (b > 0.0f) {
                    str3 = str3 + " + ";
                    f = b;
                } else {
                    str3 = str3 + " - ";
                    f = b * -1.0f;
                }
                if (f == 1.0f) {
                    str2 = str3 + c0081h;
                } else {
                    str2 = str3 + f + " " + c0081h;
                }
                str3 = str2;
                obj = 1;
            }
        }
        if (obj == null) {
            return str3 + "0.0";
        }
        return str3;
    }

    public final C0075b m139a(C0081h c0081h, int i) {
        if (i < 0) {
            this.f270b = (float) (i * -1);
            this.f271c.m134a(c0081h, 1.0f);
        } else {
            this.f270b = (float) i;
            this.f271c.m134a(c0081h, -1.0f);
        }
        return this;
    }

    public final C0075b m141a(C0081h c0081h, C0081h c0081h2, int i) {
        Object obj = null;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                obj = 1;
            }
            this.f270b = (float) i;
        }
        if (obj == null) {
            this.f271c.m134a(c0081h, -1.0f);
            this.f271c.m134a(c0081h2, 1.0f);
        } else {
            this.f271c.m134a(c0081h, 1.0f);
            this.f271c.m134a(c0081h2, -1.0f);
        }
        return this;
    }

    public final C0075b m143a(C0081h c0081h, C0081h c0081h2, C0081h c0081h3, int i) {
        Object obj = null;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                obj = 1;
            }
            this.f270b = (float) i;
        }
        if (obj == null) {
            this.f271c.m134a(c0081h, -1.0f);
            this.f271c.m134a(c0081h2, 1.0f);
            this.f271c.m134a(c0081h3, 1.0f);
        } else {
            this.f271c.m134a(c0081h, 1.0f);
            this.f271c.m134a(c0081h2, -1.0f);
            this.f271c.m134a(c0081h3, -1.0f);
        }
        return this;
    }

    public final C0075b m148b(C0081h c0081h, C0081h c0081h2, C0081h c0081h3, int i) {
        Object obj = null;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                obj = 1;
            }
            this.f270b = (float) i;
        }
        if (obj == null) {
            this.f271c.m134a(c0081h, -1.0f);
            this.f271c.m134a(c0081h2, 1.0f);
            this.f271c.m134a(c0081h3, -1.0f);
        } else {
            this.f271c.m134a(c0081h, 1.0f);
            this.f271c.m134a(c0081h2, -1.0f);
            this.f271c.m134a(c0081h3, 1.0f);
        }
        return this;
    }

    public final C0075b m138a(float f, float f2, float f3, C0081h c0081h, int i, C0081h c0081h2, int i2, C0081h c0081h3, int i3, C0081h c0081h4, int i4) {
        if (f2 == 0.0f || f == f3) {
            this.f270b = (float) ((((-i) - i2) + i3) + i4);
            this.f271c.m134a(c0081h, 1.0f);
            this.f271c.m134a(c0081h2, -1.0f);
            this.f271c.m134a(c0081h4, 1.0f);
            this.f271c.m134a(c0081h3, -1.0f);
        } else {
            float f4 = (f / f2) / (f3 / f2);
            this.f270b = (((float) ((-i) - i2)) + (((float) i3) * f4)) + (((float) i4) * f4);
            this.f271c.m134a(c0081h, 1.0f);
            this.f271c.m134a(c0081h2, -1.0f);
            this.f271c.m134a(c0081h4, f4);
            this.f271c.m134a(c0081h3, -f4);
        }
        return this;
    }

    final C0075b m142a(C0081h c0081h, C0081h c0081h2, int i, float f, C0081h c0081h3, C0081h c0081h4, int i2) {
        if (c0081h2 == c0081h3) {
            this.f271c.m134a(c0081h, 1.0f);
            this.f271c.m134a(c0081h4, 1.0f);
            this.f271c.m134a(c0081h2, -2.0f);
        } else if (f == 0.5f) {
            this.f271c.m134a(c0081h, 1.0f);
            this.f271c.m134a(c0081h2, -1.0f);
            this.f271c.m134a(c0081h3, -1.0f);
            this.f271c.m134a(c0081h4, 1.0f);
            if (i > 0 || i2 > 0) {
                this.f270b = (float) ((-i) + i2);
            }
        } else if (f <= 0.0f) {
            this.f271c.m134a(c0081h, -1.0f);
            this.f271c.m134a(c0081h2, 1.0f);
            this.f270b = (float) i;
        } else if (f >= 1.0f) {
            this.f271c.m134a(c0081h3, -1.0f);
            this.f271c.m134a(c0081h4, 1.0f);
            this.f270b = (float) i2;
        } else {
            this.f271c.m134a(c0081h, (1.0f - f) * 1.0f);
            this.f271c.m134a(c0081h2, (1.0f - f) * -1.0f);
            this.f271c.m134a(c0081h3, -1.0f * f);
            this.f271c.m134a(c0081h4, 1.0f * f);
            if (i > 0 || i2 > 0) {
                this.f270b = (((float) (-i)) * (1.0f - f)) + (((float) i2) * f);
            }
        }
        return this;
    }

    public final C0075b m140a(C0081h c0081h, C0081h c0081h2) {
        this.f271c.m134a(c0081h, 1.0f);
        this.f271c.m134a(c0081h2, -1.0f);
        return this;
    }

    public final C0075b m144a(C0081h c0081h, C0081h c0081h2, C0081h c0081h3, C0081h c0081h4, float f) {
        this.f271c.m134a(c0081h, -1.0f);
        this.f271c.m134a(c0081h2, 1.0f);
        this.f271c.m134a(c0081h3, f);
        this.f271c.m134a(c0081h4, -f);
        return this;
    }

    final boolean m147a(C0075b c0075b) {
        this.f271c.m133a(this, c0075b);
        return true;
    }

    final void m146a(C0081h c0081h) {
        if (this.f269a != null) {
            this.f271c.m134a(this.f269a, -1.0f);
            this.f269a = null;
        }
        float a = -1.0f * this.f271c.m131a(c0081h);
        this.f269a = c0081h;
        if (a != 1.0f) {
            this.f270b /= a;
            C0074a c0074a = this.f271c;
            int i = c0074a.f266i;
            int i2 = 0;
            while (i != -1 && i2 < c0074a.f258a) {
                float[] fArr = c0074a.f265h;
                fArr[i] = fArr[i] / a;
                i = c0074a.f264g[i];
                i2++;
            }
        }
    }
}
