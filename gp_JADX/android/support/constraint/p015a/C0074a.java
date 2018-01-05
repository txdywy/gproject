package android.support.constraint.p015a;

import java.util.Arrays;

public final class C0074a {
    public int f258a = 0;
    public final C0075b f259b;
    public final C0076c f260c;
    public int f261d = 8;
    public C0081h f262e = null;
    public int[] f263f = new int[this.f261d];
    public int[] f264g = new int[this.f261d];
    public float[] f265h = new float[this.f261d];
    public int f266i = -1;
    public int f267j = -1;
    public boolean f268k = false;

    C0074a(C0075b c0075b, C0076c c0076c) {
        this.f259b = c0075b;
        this.f260c = c0076c;
    }

    public final void m134a(C0081h c0081h, float f) {
        if (f == 0.0f) {
            m131a(c0081h);
        } else if (this.f266i == -1) {
            this.f266i = 0;
            this.f265h[this.f266i] = f;
            this.f263f[this.f266i] = c0081h.f295b;
            this.f264g[this.f266i] = -1;
            this.f258a++;
            if (!this.f268k) {
                this.f267j++;
            }
        } else {
            int i = this.f266i;
            int i2 = 0;
            int i3 = -1;
            while (i != -1 && i2 < this.f258a) {
                if (this.f263f[i] == c0081h.f295b) {
                    this.f265h[i] = f;
                    return;
                }
                if (this.f263f[i] < c0081h.f295b) {
                    i3 = i;
                }
                i2++;
                i = this.f264g[i];
            }
            i = this.f267j + 1;
            if (this.f268k) {
                if (this.f263f[this.f267j] == -1) {
                    i = this.f267j;
                } else {
                    i = this.f263f.length;
                }
            }
            if (i >= this.f263f.length && this.f258a < this.f263f.length) {
                for (i2 = 0; i2 < this.f263f.length; i2++) {
                    if (this.f263f[i2] == -1) {
                        i = i2;
                        break;
                    }
                }
            }
            if (i >= this.f263f.length) {
                i = this.f263f.length;
                this.f261d *= 2;
                this.f268k = false;
                this.f267j = i - 1;
                this.f265h = Arrays.copyOf(this.f265h, this.f261d);
                this.f263f = Arrays.copyOf(this.f263f, this.f261d);
                this.f264g = Arrays.copyOf(this.f264g, this.f261d);
            }
            this.f263f[i] = c0081h.f295b;
            this.f265h[i] = f;
            if (i3 != -1) {
                this.f264g[i] = this.f264g[i3];
                this.f264g[i3] = i;
            } else {
                this.f264g[i] = this.f266i;
                this.f266i = i;
            }
            this.f258a++;
            if (!this.f268k) {
                this.f267j++;
            }
            if (this.f258a >= this.f263f.length) {
                this.f268k = true;
            }
        }
    }

    public final void m137b(C0081h c0081h, float f) {
        if (f != 0.0f) {
            if (this.f266i == -1) {
                this.f266i = 0;
                this.f265h[this.f266i] = f;
                this.f263f[this.f266i] = c0081h.f295b;
                this.f264g[this.f266i] = -1;
                this.f258a++;
                if (!this.f268k) {
                    this.f267j++;
                    return;
                }
                return;
            }
            int i = this.f266i;
            int i2 = 0;
            int i3 = -1;
            while (i != -1 && i2 < this.f258a) {
                int i4 = this.f263f[i];
                if (i4 == c0081h.f295b) {
                    float[] fArr = this.f265h;
                    fArr[i] = fArr[i] + f;
                    if (this.f265h[i] == 0.0f) {
                        if (i == this.f266i) {
                            this.f266i = this.f264g[i];
                        } else {
                            this.f264g[i3] = this.f264g[i];
                        }
                        this.f260c.f275c[i4].m177a(this.f259b);
                        if (this.f268k) {
                            this.f267j = i;
                        }
                        this.f258a--;
                        return;
                    }
                    return;
                }
                if (this.f263f[i] < c0081h.f295b) {
                    i3 = i;
                }
                i2++;
                i = this.f264g[i];
            }
            i = this.f267j + 1;
            if (this.f268k) {
                if (this.f263f[this.f267j] == -1) {
                    i = this.f267j;
                } else {
                    i = this.f263f.length;
                }
            }
            if (i >= this.f263f.length && this.f258a < this.f263f.length) {
                for (i2 = 0; i2 < this.f263f.length; i2++) {
                    if (this.f263f[i2] == -1) {
                        i = i2;
                        break;
                    }
                }
            }
            if (i >= this.f263f.length) {
                i = this.f263f.length;
                this.f261d *= 2;
                this.f268k = false;
                this.f267j = i - 1;
                this.f265h = Arrays.copyOf(this.f265h, this.f261d);
                this.f263f = Arrays.copyOf(this.f263f, this.f261d);
                this.f264g = Arrays.copyOf(this.f264g, this.f261d);
            }
            this.f263f[i] = c0081h.f295b;
            this.f265h[i] = f;
            if (i3 != -1) {
                this.f264g[i] = this.f264g[i3];
                this.f264g[i3] = i;
            } else {
                this.f264g[i] = this.f266i;
                this.f266i = i;
            }
            this.f258a++;
            if (!this.f268k) {
                this.f267j++;
            }
            if (this.f267j >= this.f263f.length) {
                this.f268k = true;
                this.f267j = this.f263f.length - 1;
            }
        }
    }

    public final float m131a(C0081h c0081h) {
        if (this.f262e == c0081h) {
            this.f262e = null;
        }
        if (this.f266i == -1) {
            return 0.0f;
        }
        int i = this.f266i;
        int i2 = 0;
        int i3 = -1;
        while (i != -1 && i2 < this.f258a) {
            int i4 = this.f263f[i];
            if (i4 == c0081h.f295b) {
                if (i == this.f266i) {
                    this.f266i = this.f264g[i];
                } else {
                    this.f264g[i3] = this.f264g[i];
                }
                this.f260c.f275c[i4].m177a(this.f259b);
                this.f258a--;
                this.f263f[i] = -1;
                if (this.f268k) {
                    this.f267j = i;
                }
                return this.f265h[i];
            }
            i2++;
            int i5 = i;
            i = this.f264g[i];
            i3 = i5;
        }
        return 0.0f;
    }

    final void m133a(C0075b c0075b, C0075b c0075b2) {
        int i = this.f266i;
        int i2 = 0;
        while (i != -1 && i2 < this.f258a) {
            if (this.f263f[i] == c0075b2.f269a.f295b) {
                float f = this.f265h[i];
                m131a(c0075b2.f269a);
                C0074a c0074a = c0075b2.f271c;
                i = c0074a.f266i;
                i2 = 0;
                while (i != -1 && i2 < c0074a.f258a) {
                    m137b(this.f260c.f275c[c0074a.f263f[i]], c0074a.f265h[i] * f);
                    i = c0074a.f264g[i];
                    i2++;
                }
                c0075b.f270b += c0075b2.f270b * f;
                c0075b2.f269a.m177a(c0075b);
                i = this.f266i;
                i2 = 0;
            } else {
                i = this.f264g[i];
                i2++;
            }
        }
    }

    final C0081h m132a(int i) {
        int i2 = this.f266i;
        int i3 = 0;
        while (i2 != -1 && i3 < this.f258a) {
            if (i3 == i) {
                return this.f260c.f275c[this.f263f[i2]];
            }
            i2 = this.f264g[i2];
            i3++;
        }
        return null;
    }

    final float m135b(int i) {
        int i2 = this.f266i;
        int i3 = 0;
        while (i2 != -1 && i3 < this.f258a) {
            if (i3 == i) {
                return this.f265h[i2];
            }
            i2 = this.f264g[i2];
            i3++;
        }
        return 0.0f;
    }

    public final float m136b(C0081h c0081h) {
        int i = this.f266i;
        int i2 = 0;
        while (i != -1 && i2 < this.f258a) {
            if (this.f263f[i] == c0081h.f295b) {
                return this.f265h[i];
            }
            i = this.f264g[i];
            i2++;
        }
        return 0.0f;
    }

    public final String toString() {
        String str = "";
        int i = this.f266i;
        int i2 = 0;
        while (i != -1 && i2 < this.f258a) {
            str = ((str + " -> ") + this.f265h[i] + " : ") + this.f260c.f275c[this.f263f[i]];
            i = this.f264g[i];
            i2++;
        }
        return str;
    }
}
