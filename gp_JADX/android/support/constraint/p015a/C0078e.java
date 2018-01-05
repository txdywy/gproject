package android.support.constraint.p015a;

import android.support.constraint.p015a.p016a.C0062a;
import com.google.c.a.a.a.a.a;
import java.util.Arrays;
import java.util.HashMap;

public final class C0078e {
    public static int f277a = 1000;
    public int f278b;
    public HashMap f279c;
    public C0077d f280d;
    public int f281e;
    public int f282f;
    public C0075b[] f283g;
    public boolean[] f284h;
    public int f285i;
    public int f286j;
    public int f287k;
    public final C0076c f288l;
    public C0081h[] f289m;
    public int f290n;
    public C0075b[] f291o;

    public C0078e() {
        this.f278b = 0;
        this.f279c = null;
        this.f280d = new C0077d();
        this.f281e = 32;
        this.f282f = this.f281e;
        this.f283g = null;
        this.f284h = new boolean[this.f281e];
        this.f285i = 1;
        this.f286j = 0;
        this.f287k = this.f281e;
        this.f289m = new C0081h[f277a];
        this.f290n = 0;
        this.f291o = new C0075b[this.f281e];
        this.f283g = new C0075b[this.f281e];
        m155f();
        this.f288l = new C0076c();
    }

    private final void m154e() {
        this.f281e *= 2;
        this.f283g = (C0075b[]) Arrays.copyOf(this.f283g, this.f281e);
        this.f288l.f275c = (C0081h[]) Arrays.copyOf(this.f288l.f275c, this.f281e);
        this.f284h = new boolean[this.f281e];
        this.f282f = this.f281e;
        this.f287k = this.f281e;
        this.f280d.f276a.clear();
    }

    private final void m155f() {
        for (int i = 0; i < this.f283g.length; i++) {
            Object obj = this.f283g[i];
            if (obj != null) {
                this.f288l.f273a.mo49a(obj);
            }
            this.f283g[i] = null;
        }
    }

    public final void m158a() {
        for (C0081h c0081h : this.f288l.f275c) {
            if (c0081h != null) {
                c0081h.m178b();
            }
        }
        this.f288l.f274b.mo48a(this.f289m, this.f290n);
        this.f290n = 0;
        Arrays.fill(this.f288l.f275c, null);
        if (this.f279c != null) {
            this.f279c.clear();
        }
        this.f278b = 0;
        this.f280d.f276a.clear();
        this.f285i = 1;
        m155f();
        this.f286j = 0;
    }

    public final C0081h m157a(Object obj) {
        C0081h c0081h = null;
        if (obj != null) {
            if (this.f285i + 1 >= this.f282f) {
                m154e();
            }
            if (obj instanceof C0062a) {
                c0081h = ((C0062a) obj).f171i;
                if (c0081h == null) {
                    ((C0062a) obj).m79a();
                    c0081h = ((C0062a) obj).f171i;
                }
                if (c0081h.f295b == -1 || c0081h.f295b > this.f278b || this.f288l.f275c[c0081h.f295b] == null) {
                    if (c0081h.f295b != -1) {
                        c0081h.m178b();
                    }
                    this.f278b++;
                    this.f285i++;
                    c0081h.f295b = this.f278b;
                    c0081h.f300g = C0082i.UNRESTRICTED;
                    this.f288l.f275c[this.f278b] = c0081h;
                }
            }
        }
        return c0081h;
    }

    public final C0075b m165b() {
        C0075b c0075b = (C0075b) this.f288l.f273a.mo47a();
        if (c0075b == null) {
            return new C0075b(this.f288l);
        }
        c0075b.f269a = null;
        C0074a c0074a = c0075b.f271c;
        c0074a.f266i = -1;
        c0074a.f267j = -1;
        c0074a.f268k = false;
        c0074a.f258a = 0;
        c0075b.f270b = 0.0f;
        c0075b.f272d = false;
        return c0075b;
    }

    public final C0081h m168c() {
        if (this.f285i + 1 >= this.f282f) {
            m154e();
        }
        C0081h a = m152a(C0082i.SLACK);
        this.f278b++;
        this.f285i++;
        a.f295b = this.f278b;
        this.f288l.f275c[this.f278b] = a;
        return a;
    }

    public final void m160a(C0075b c0075b, int i) {
        c0075b.f271c.m134a(m169d(), (float) i);
    }

    public final C0081h m169d() {
        if (this.f285i + 1 >= this.f282f) {
            m154e();
        }
        C0081h a = m152a(C0082i.ERROR);
        this.f278b++;
        this.f285i++;
        a.f295b = this.f278b;
        this.f288l.f275c[this.f278b] = a;
        return a;
    }

    private final C0081h m152a(C0082i c0082i) {
        C0081h c0081h;
        C0081h c0081h2 = (C0081h) this.f288l.f274b.mo47a();
        if (c0081h2 == null) {
            c0081h = new C0081h(c0082i);
        } else {
            c0081h2.m178b();
            c0081h2.f300g = c0082i;
            c0081h = c0081h2;
        }
        if (this.f290n >= f277a) {
            f277a *= 2;
            this.f289m = (C0081h[]) Arrays.copyOf(this.f289m, f277a);
        }
        C0081h[] c0081hArr = this.f289m;
        int i = this.f290n;
        this.f290n = i + 1;
        c0081hArr[i] = c0081h;
        return c0081h;
    }

    public static int m153b(Object obj) {
        C0081h c0081h = ((C0062a) obj).f171i;
        if (c0081h != null) {
            return (int) (c0081h.f298e + 0.5f);
        }
        return 0;
    }

    public final void m159a(C0075b c0075b) {
        if (c0075b != null) {
            int i;
            int i2;
            if (this.f286j + 1 >= this.f287k || this.f285i + 1 >= this.f282f) {
                m154e();
            }
            if (!c0075b.f272d) {
                C0074a c0074a;
                C0074a c0074a2;
                C0081h c0081h;
                if (this.f286j > 0) {
                    c0074a = c0075b.f271c;
                    C0075b[] c0075bArr = this.f283g;
                    i = c0074a.f266i;
                    i2 = 0;
                    while (i != -1 && i2 < c0074a.f258a) {
                        C0081h c0081h2 = c0074a.f260c.f275c[c0074a.f263f[i]];
                        if (c0081h2.f296c != -1) {
                            float f = c0074a.f265h[i];
                            c0074a.m131a(c0081h2);
                            C0075b c0075b2 = c0075bArr[c0081h2.f296c];
                            if (!c0075b2.f272d) {
                                c0074a2 = c0075b2.f271c;
                                i = c0074a2.f266i;
                                i2 = 0;
                                while (i != -1 && i2 < c0074a2.f258a) {
                                    c0074a.m137b(c0074a.f260c.f275c[c0074a2.f263f[i]], c0074a2.f265h[i] * f);
                                    i = c0074a2.f264g[i];
                                    i2++;
                                }
                            }
                            c0075b.f270b += c0075b2.f270b * f;
                            c0075b2.f269a.m177a(c0075b);
                            i = c0074a.f266i;
                            i2 = 0;
                        } else {
                            i = c0074a.f264g[i];
                            i2++;
                        }
                    }
                    if (c0075b.f271c.f258a == 0) {
                        c0075b.f272d = true;
                    }
                }
                if (c0075b.f270b < 0.0f) {
                    c0075b.f270b *= -1.0f;
                    c0074a = c0075b.f271c;
                    i = c0074a.f266i;
                    i2 = 0;
                    while (i != -1 && i2 < c0074a.f258a) {
                        float[] fArr = c0074a.f265h;
                        fArr[i] = fArr[i] * -1.0f;
                        i = c0074a.f264g[i];
                        i2++;
                    }
                }
                c0074a2 = c0075b.f271c;
                int i3 = 0;
                int i4 = c0074a2.f266i;
                C0081h c0081h3 = null;
                C0081h c0081h4 = null;
                while (i4 != -1 && i3 < c0074a2.f258a) {
                    float f2;
                    float f3 = c0074a2.f265h[i4];
                    if (f3 < 0.0f) {
                        if (f3 > -0.001f) {
                            c0074a2.f265h[i4] = 0.0f;
                            f2 = 0.0f;
                        }
                        f2 = f3;
                    } else {
                        if (f3 < 0.001f) {
                            c0074a2.f265h[i4] = 0.0f;
                            f2 = 0.0f;
                        }
                        f2 = f3;
                    }
                    if (f2 != 0.0f) {
                        c0081h = c0074a2.f260c.f275c[c0074a2.f263f[i4]];
                        if (c0081h.f300g == C0082i.UNRESTRICTED) {
                            if (f2 < 0.0f) {
                                break;
                            } else if (c0081h3 == null) {
                                c0081h3 = c0081h4;
                                i3++;
                                i4 = c0074a2.f264g[i4];
                                c0081h4 = c0081h3;
                                c0081h3 = c0081h;
                            }
                        } else if (f2 < 0.0f && (c0081h4 == null || c0081h.f297d < c0081h4.f297d)) {
                            C0081h c0081h5 = c0081h3;
                            c0081h3 = c0081h;
                            c0081h = c0081h5;
                            i3++;
                            i4 = c0074a2.f264g[i4];
                            c0081h4 = c0081h3;
                            c0081h3 = c0081h;
                        }
                    }
                    c0081h = c0081h3;
                    c0081h3 = c0081h4;
                    i3++;
                    i4 = c0074a2.f264g[i4];
                    c0081h4 = c0081h3;
                    c0081h3 = c0081h;
                }
                if (c0081h3 != null) {
                    c0081h = c0081h3;
                } else {
                    c0081h = c0081h4;
                }
                if (c0081h != null) {
                    c0075b.m146a(c0081h);
                }
                if (c0075b.f271c.f258a == 0) {
                    c0075b.f272d = true;
                }
                Object obj = (c0075b.f269a == null || (c0075b.f269a.f300g != C0082i.UNRESTRICTED && c0075b.f270b < 0.0f)) ? null : 1;
                if (obj == null) {
                    return;
                }
            }
            if (this.f283g[this.f286j] != null) {
                this.f288l.f273a.mo49a(this.f283g[this.f286j]);
            }
            if (!c0075b.f272d) {
                c0075b.m145a();
            }
            this.f283g[this.f286j] = c0075b;
            c0075b.f269a.f296c = this.f286j;
            this.f286j++;
            i = c0075b.f269a.f302i;
            if (i > 0) {
                while (this.f291o.length < i) {
                    this.f291o = new C0075b[(this.f291o.length * 2)];
                }
                C0075b[] c0075bArr2 = this.f291o;
                for (i2 = 0; i2 < i; i2++) {
                    c0075bArr2[i2] = c0075b.f269a.f301h[i2];
                }
                for (i2 = 0; i2 < i; i2++) {
                    C0075b c0075b3 = c0075bArr2[i2];
                    if (c0075b3 != c0075b) {
                        c0075b3.f271c.m133a(c0075b3, c0075b);
                        c0075b3.m145a();
                    }
                }
            }
        }
    }

    public final int m156a(C0077d c0077d) {
        int i;
        Object obj;
        for (i = 0; i < this.f285i; i++) {
            this.f284h[i] = false;
        }
        int i2 = 0;
        i = 0;
        Object obj2 = null;
        while (obj2 == null) {
            C0081h c0081h;
            int i3 = i + 1;
            int size = c0077d.f276a.size();
            int i4 = 0;
            C0081h c0081h2 = null;
            int i5 = 0;
            while (i4 < size) {
                C0081h c0081h3 = (C0081h) c0077d.f276a.get(i4);
                C0081h c0081h4 = c0081h2;
                int i6 = i5;
                i5 = 5;
                while (i5 >= 0) {
                    float f = c0081h3.f299f[i5];
                    if (c0081h4 == null && f < 0.0f && i5 >= i6) {
                        i6 = i5;
                        c0081h4 = c0081h3;
                    }
                    if (f > 0.0f && i5 > r1) {
                        c0081h4 = null;
                        i6 = i5;
                    }
                    i5--;
                }
                i4++;
                i5 = i6;
                c0081h2 = c0081h4;
            }
            if (c0081h2 == null) {
                i4 = i2;
                obj = obj2;
                c0081h = c0081h2;
            } else if (this.f284h[c0081h2.f295b]) {
                i4 = i2;
                obj = obj2;
                c0081h = null;
            } else {
                this.f284h[c0081h2.f295b] = true;
                i = i2 + 1;
                if (i >= this.f285i) {
                    c0081h = c0081h2;
                    i4 = i;
                    size = 1;
                } else {
                    i4 = i;
                    obj = obj2;
                    c0081h = c0081h2;
                }
            }
            if (c0081h != null) {
                float f2 = Float.MAX_VALUE;
                i = -1;
                i6 = 0;
                while (i6 < this.f286j) {
                    float b;
                    C0075b c0075b = this.f283g[i6];
                    if (c0075b.f269a.f300g != C0082i.UNRESTRICTED) {
                        Object obj3;
                        C0074a c0074a = c0075b.f271c;
                        if (c0074a.f266i != -1) {
                            i2 = c0074a.f266i;
                            i5 = 0;
                            while (i2 != -1 && i5 < c0074a.f258a) {
                                if (c0074a.f263f[i2] == c0081h.f295b) {
                                    obj3 = 1;
                                    break;
                                }
                                i2 = c0074a.f264g[i2];
                                i5++;
                            }
                        }
                        obj3 = null;
                        if (obj3 != null) {
                            b = c0075b.f271c.m136b(c0081h);
                            if (b < 0.0f) {
                                b = (-c0075b.f270b) / b;
                                if (b < f2) {
                                    i = i6;
                                    i6++;
                                    f2 = b;
                                }
                            }
                        }
                    }
                    b = f2;
                    i6++;
                    f2 = b;
                }
                if (i >= 0) {
                    C0075b c0075b2 = this.f283g[i];
                    c0075b2.f269a.f296c = -1;
                    c0075b2.m146a(c0081h);
                    c0075b2.f269a.f296c = i;
                    for (i = 0; i < this.f286j; i++) {
                        this.f283g[i].m147a(c0075b2);
                    }
                    c0077d.m149a(this);
                    try {
                        m164b(c0077d);
                        i2 = i4;
                        i = i3;
                        obj2 = obj;
                    } catch (Throwable e) {
                        a.a.a(e);
                        i2 = i4;
                        i = i3;
                        obj2 = obj;
                    }
                } else {
                    i2 = i4;
                    i = i3;
                    obj2 = 1;
                }
            } else {
                i2 = i4;
                i = i3;
                obj2 = 1;
            }
        }
        return i;
    }

    public final int m164b(C0077d c0077d) {
        Object obj;
        int i;
        int i2 = 0;
        while (i2 < this.f286j) {
            if (this.f283g[i2].f269a.f300g != C0082i.UNRESTRICTED && this.f283g[i2].f270b < 0.0f) {
                obj = 1;
                break;
            }
            i2++;
        }
        obj = null;
        if (obj != null) {
            Object obj2 = null;
            i2 = 0;
            while (obj2 == null) {
                int i3 = i2 + 1;
                float f = Float.MAX_VALUE;
                int i4 = 0;
                int i5 = -1;
                i = -1;
                for (i2 = 0; i2 < this.f286j; i2++) {
                    C0075b c0075b = this.f283g[i2];
                    if (c0075b.f269a.f300g != C0082i.UNRESTRICTED && c0075b.f270b < 0.0f) {
                        float f2 = f;
                        int i6 = i4;
                        i4 = i5;
                        i5 = i;
                        for (i = 1; i < this.f285i; i++) {
                            C0081h c0081h = this.f288l.f275c[i];
                            float b = c0075b.f271c.m136b(c0081h);
                            if (b > 0.0f) {
                                float f3 = f2;
                                int i7 = 0;
                                while (i7 < 6) {
                                    float f4 = c0081h.f299f[i7] / b;
                                    if ((f4 >= f3 || i7 != r6) && i7 <= r6) {
                                        f4 = f3;
                                    } else {
                                        i5 = i;
                                        i4 = i2;
                                        i6 = i7;
                                    }
                                    i7++;
                                    f3 = f4;
                                }
                                f2 = f3;
                            }
                        }
                        i = i5;
                        i5 = i4;
                        i4 = i6;
                        f = f2;
                    }
                }
                if (i5 != -1) {
                    C0075b c0075b2 = this.f283g[i5];
                    c0075b2.f269a.f296c = -1;
                    c0075b2.m146a(this.f288l.f275c[i]);
                    c0075b2.f269a.f296c = i5;
                    for (i2 = 0; i2 < this.f286j; i2++) {
                        this.f283g[i2].m147a(c0075b2);
                    }
                    c0077d.m149a(this);
                    i2 = i3;
                } else {
                    obj2 = 1;
                    i2 = i3;
                }
            }
        } else {
            i2 = 0;
        }
        i = 0;
        while (i < this.f286j && (this.f283g[i].f269a.f300g == C0082i.UNRESTRICTED || this.f283g[i].f270b >= 0.0f)) {
            i++;
        }
        return i2;
    }

    public final void m163a(C0081h c0081h, C0081h c0081h2, int i, int i2) {
        C0075b b = m165b();
        C0081h c = m168c();
        c.f297d = i2;
        b.m143a(c0081h, c0081h2, c, i);
        m159a(b);
    }

    public final void m166b(C0081h c0081h, C0081h c0081h2, int i, int i2) {
        C0075b b = m165b();
        C0081h c = m168c();
        c.f297d = i2;
        b.m148b(c0081h, c0081h2, c, i);
        m159a(b);
    }

    public final void m162a(C0081h c0081h, C0081h c0081h2, int i, float f, C0081h c0081h3, C0081h c0081h4, int i2) {
        C0075b b = m165b();
        b.m142a(c0081h, c0081h2, i, f, c0081h3, c0081h4, i2);
        C0081h d = m169d();
        C0081h d2 = m169d();
        d.f297d = 4;
        d2.f297d = 4;
        b.m140a(d, d2);
        m159a(b);
    }

    public final C0075b m167c(C0081h c0081h, C0081h c0081h2, int i, int i2) {
        C0075b b = m165b();
        b.m141a(c0081h, c0081h2, i);
        C0081h d = m169d();
        C0081h d2 = m169d();
        d.f297d = i2;
        d2.f297d = i2;
        b.m140a(d, d2);
        m159a(b);
        return b;
    }

    public final void m161a(C0081h c0081h, int i) {
        int i2 = c0081h.f296c;
        C0075b c0075b;
        if (c0081h.f296c != -1) {
            c0075b = this.f283g[i2];
            if (c0075b.f272d) {
                c0075b.f270b = (float) i;
                return;
            }
            c0075b = m165b();
            c0075b.m139a(c0081h, i);
            m159a(c0075b);
            return;
        }
        c0075b = m165b();
        c0075b.f269a = c0081h;
        c0081h.f298e = (float) i;
        c0075b.f270b = (float) i;
        c0075b.f272d = true;
        m159a(c0075b);
    }

    public static C0075b m151a(C0078e c0078e, C0081h c0081h, C0081h c0081h2, int i, boolean z) {
        C0075b b = c0078e.m165b();
        b.m141a(c0081h, c0081h2, i);
        if (z) {
            c0078e.m160a(b, 1);
        }
        return b;
    }

    public static C0075b m150a(C0078e c0078e, C0081h c0081h, C0081h c0081h2, int i, float f, C0081h c0081h3, C0081h c0081h4, int i2, boolean z) {
        C0075b b = c0078e.m165b();
        b.m142a(c0081h, c0081h2, i, f, c0081h3, c0081h4, i2);
        if (z) {
            C0081h d = c0078e.m169d();
            C0081h d2 = c0078e.m169d();
            d.f297d = 4;
            d2.f297d = 4;
            b.m140a(d, d2);
        }
        return b;
    }
}
