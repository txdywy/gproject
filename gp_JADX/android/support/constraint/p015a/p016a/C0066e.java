package android.support.constraint.p015a.p016a;

import android.support.constraint.p015a.C0075b;
import android.support.constraint.p015a.C0076c;
import android.support.constraint.p015a.C0078e;
import android.support.constraint.p015a.C0081h;
import java.util.ArrayList;

public class C0066e {
    public static float f189J = 0.5f;
    public int f190A = 0;
    public int f191B = 0;
    public int f192C = 0;
    public int f193D = 0;
    public int f194E = 0;
    public int f195F;
    public int f196G;
    public int f197H;
    public int f198I;
    public float f199K = f189J;
    public float f200L = f189J;
    public C0067f f201M = C0067f.FIXED;
    public C0067f f202N = C0067f.FIXED;
    public Object f203O;
    public int f204P = 0;
    public String f205Q = null;
    public String f206R = null;
    public int f207S;
    public int f208T;
    public int f209U;
    public int f210V;
    public boolean f211W;
    public boolean f212X;
    public boolean f213Y;
    public boolean f214Z;
    public int f215a = -1;
    public boolean aa;
    public boolean ab;
    public int ac = 0;
    public int ad = 0;
    public boolean ae;
    public boolean af;
    public float ag = 0.0f;
    public float ah = 0.0f;
    public C0066e ai = null;
    public C0066e aj = null;
    public int f216b = -1;
    public int f217c = 0;
    public int f218d = 0;
    public int f219e = 0;
    public int f220f = 0;
    public int f221g = 0;
    public int f222h = 0;
    public C0062a f223i = new C0062a(this, C0065d.LEFT);
    public C0062a f224j = new C0062a(this, C0065d.TOP);
    public C0062a f225k = new C0062a(this, C0065d.RIGHT);
    public C0062a f226l = new C0062a(this, C0065d.BOTTOM);
    public C0062a f227m = new C0062a(this, C0065d.BASELINE);
    public C0062a f228n = new C0062a(this, C0065d.CENTER_X);
    public C0062a f229o = new C0062a(this, C0065d.CENTER_Y);
    public C0062a f230p = new C0062a(this, C0065d.CENTER);
    public ArrayList f231q = new ArrayList();
    public C0066e f232r = null;
    public int f233s = 0;
    public int f234t = 0;
    public float f235u = 0.0f;
    public int f236v = -1;
    public int f237w = 0;
    public int f238x = 0;
    public int f239y = 0;
    public int f240z = 0;

    public void mo38a() {
        this.f223i.m82c();
        this.f224j.m82c();
        this.f225k.m82c();
        this.f226l.m82c();
        this.f227m.m82c();
        this.f228n.m82c();
        this.f229o.m82c();
        this.f230p.m82c();
        this.f232r = null;
        this.f233s = 0;
        this.f234t = 0;
        this.f235u = 0.0f;
        this.f236v = -1;
        this.f237w = 0;
        this.f238x = 0;
        this.f239y = 0;
        this.f240z = 0;
        this.f190A = 0;
        this.f191B = 0;
        this.f192C = 0;
        this.f193D = 0;
        this.f194E = 0;
        this.f195F = 0;
        this.f196G = 0;
        this.f197H = 0;
        this.f198I = 0;
        this.f199K = f189J;
        this.f200L = f189J;
        this.f201M = C0067f.FIXED;
        this.f202N = C0067f.FIXED;
        this.f203O = null;
        this.f204P = 0;
        this.f205Q = null;
        this.f206R = null;
        this.aa = false;
        this.ab = false;
        this.ac = 0;
        this.ad = 0;
        this.ae = false;
        this.af = false;
        this.ag = 0.0f;
        this.ah = 0.0f;
        this.f215a = -1;
        this.f216b = -1;
    }

    public C0066e() {
        this.f231q.add(this.f223i);
        this.f231q.add(this.f224j);
        this.f231q.add(this.f225k);
        this.f231q.add(this.f226l);
        this.f231q.add(this.f228n);
        this.f231q.add(this.f229o);
        this.f231q.add(this.f227m);
    }

    public void mo40a(C0076c c0076c) {
        this.f223i.m79a();
        this.f224j.m79a();
        this.f225k.m79a();
        this.f226l.m79a();
        this.f227m.m79a();
        this.f230p.m79a();
        this.f228n.m79a();
        this.f229o.m79a();
    }

    public final boolean m96b() {
        return this.f232r == null;
    }

    public String toString() {
        return (this.f206R != null ? "type: " + this.f206R + " " : "") + (this.f205Q != null ? "id: " + this.f205Q + " " : "") + "(" + this.f237w + ", " + this.f238x + ") - (" + this.f233s + " x " + this.f234t + ") wrap: (" + this.f197H + " x " + this.f198I + ")";
    }

    public final int m97c() {
        if (this.f204P == 8) {
            return 0;
        }
        return this.f233s;
    }

    public final int m100d() {
        int i = this.f233s;
        if (this.f201M != C0067f.MATCH_CONSTRAINT) {
            return i;
        }
        if (this.f217c == 1) {
            i = Math.max(this.f219e, i);
        } else if (this.f219e > 0) {
            i = this.f219e;
            this.f233s = i;
        } else {
            i = 0;
        }
        if (this.f220f <= 0 || this.f220f >= i) {
            return i;
        }
        return this.f220f;
    }

    public final int m102e() {
        int i = this.f234t;
        if (this.f202N != C0067f.MATCH_CONSTRAINT) {
            return i;
        }
        if (this.f218d == 1) {
            i = Math.max(this.f221g, i);
        } else if (this.f221g > 0) {
            i = this.f221g;
            this.f234t = i;
        } else {
            i = 0;
        }
        if (this.f222h <= 0 || this.f222h >= i) {
            return i;
        }
        return this.f222h;
    }

    public final int m103f() {
        if (this.f204P == 8) {
            return 0;
        }
        return this.f234t;
    }

    public final int m104g() {
        return this.f239y + this.f192C;
    }

    public final int m105h() {
        return this.f240z + this.f193D;
    }

    public final int m106i() {
        return this.f237w + this.f233s;
    }

    public final int m107j() {
        return this.f238x + this.f234t;
    }

    public final boolean m108k() {
        return this.f194E > 0;
    }

    public ArrayList mo45l() {
        return this.f231q;
    }

    public void mo39a(int i, int i2) {
        this.f192C = i;
        this.f193D = i2;
    }

    public void mo41m() {
        int i = this.f237w;
        int i2 = this.f238x;
        int i3 = this.f237w + this.f233s;
        int i4 = this.f238x + this.f234t;
        this.f239y = i;
        this.f240z = i2;
        this.f190A = i3 - i;
        this.f191B = i4 - i2;
    }

    public final void m87a(int i) {
        this.f233s = i;
        if (this.f233s < this.f195F) {
            this.f233s = this.f195F;
        }
    }

    public final void m93b(int i) {
        this.f234t = i;
        if (this.f234t < this.f196G) {
            this.f234t = this.f196G;
        }
    }

    public final void m98c(int i) {
        if (i < 0) {
            this.f195F = 0;
        } else {
            this.f195F = i;
        }
    }

    public final void m101d(int i) {
        if (i < 0) {
            this.f196G = 0;
        } else {
            this.f196G = i;
        }
    }

    public final void m94b(int i, int i2) {
        this.f237w = i;
        this.f233s = i2 - i;
        if (this.f233s < this.f195F) {
            this.f233s = this.f195F;
        }
    }

    public final void m99c(int i, int i2) {
        this.f238x = i;
        this.f234t = i2 - i;
        if (this.f234t < this.f196G) {
            this.f234t = this.f196G;
        }
    }

    public final void m89a(C0065d c0065d, C0066e c0066e, C0065d c0065d2, int i, int i2) {
        mo43a(c0065d).m80a(c0066e.mo43a(c0065d2), i, i2, C0064c.STRONG, 0, true);
    }

    public C0062a mo43a(C0065d c0065d) {
        switch (c0065d.ordinal()) {
            case 1:
                return this.f223i;
            case 2:
                return this.f224j;
            case 3:
                return this.f225k;
            case 4:
                return this.f226l;
            case 5:
                return this.f227m;
            case 6:
                return this.f230p;
            case 7:
                return this.f228n;
            case 8:
                return this.f229o;
            default:
                return null;
        }
    }

    public final void m90a(C0067f c0067f) {
        this.f201M = c0067f;
        if (this.f201M == C0067f.WRAP_CONTENT) {
            m87a(this.f197H);
        }
    }

    public final void m95b(C0067f c0067f) {
        this.f202N = c0067f;
        if (this.f202N == C0067f.WRAP_CONTENT) {
            m93b(this.f198I);
        }
    }

    public void mo44a(C0078e c0078e) {
        C0081h a;
        boolean z;
        boolean z2;
        boolean z3;
        float f;
        int i;
        Object obj;
        boolean z4;
        int i2;
        int i3;
        boolean z5;
        C0062a c0062a;
        C0075b b;
        C0081h d;
        C0081h a2 = c0078e.m157a(this.f223i);
        C0081h a3 = c0078e.m157a(this.f225k);
        C0081h a4 = c0078e.m157a(this.f224j);
        C0081h a5 = c0078e.m157a(this.f226l);
        C0081h a6 = c0078e.m157a(this.f227m);
        if (this.f232r != null) {
            boolean z6;
            boolean z7;
            C0075b b2;
            if ((this.f223i.f165c == null || this.f223i.f165c.f165c != this.f223i) && (this.f225k.f165c == null || this.f225k.f165c.f165c != this.f225k)) {
                z6 = false;
            } else {
                ((C0069g) this.f232r).m124a(this, 0);
                z6 = true;
            }
            if ((this.f224j.f165c == null || this.f224j.f165c.f165c != this.f224j) && (this.f226l.f165c == null || this.f226l.f165c.f165c != this.f226l)) {
                z7 = false;
            } else {
                ((C0069g) this.f232r).m124a(this, 1);
                z7 = true;
            }
            if (this.f232r.f201M == C0067f.WRAP_CONTENT && !z6) {
                if (this.f223i.f165c == null || this.f223i.f165c.f163a != this.f232r) {
                    a = c0078e.m157a(this.f232r.f223i);
                    b2 = c0078e.m165b();
                    b2.m143a(a2, a, c0078e.m168c(), 0);
                    c0078e.m159a(b2);
                } else if (this.f223i.f165c != null && this.f223i.f165c.f163a == this.f232r) {
                    this.f223i.f169g = C0063b.STRICT;
                }
                if (this.f225k.f165c == null || this.f225k.f165c.f163a != this.f232r) {
                    a = c0078e.m157a(this.f232r.f225k);
                    b2 = c0078e.m165b();
                    b2.m143a(a, a3, c0078e.m168c(), 0);
                    c0078e.m159a(b2);
                } else if (this.f225k.f165c != null && this.f225k.f165c.f163a == this.f232r) {
                    this.f225k.f169g = C0063b.STRICT;
                }
            }
            if (this.f232r.f202N == C0067f.WRAP_CONTENT && !z7) {
                if (this.f224j.f165c == null || this.f224j.f165c.f163a != this.f232r) {
                    a = c0078e.m157a(this.f232r.f224j);
                    b2 = c0078e.m165b();
                    b2.m143a(a4, a, c0078e.m168c(), 0);
                    c0078e.m159a(b2);
                } else if (this.f224j.f165c != null && this.f224j.f165c.f163a == this.f232r) {
                    this.f224j.f169g = C0063b.STRICT;
                }
                if (this.f226l.f165c == null || this.f226l.f165c.f163a != this.f232r) {
                    a = c0078e.m157a(this.f232r.f226l);
                    b2 = c0078e.m165b();
                    b2.m143a(a, a5, c0078e.m168c(), 0);
                    c0078e.m159a(b2);
                    z = z7;
                    z2 = z6;
                } else if (this.f226l.f165c != null && this.f226l.f165c.f163a == this.f232r) {
                    this.f226l.f169g = C0063b.STRICT;
                }
            }
            z = z7;
            z2 = z6;
        } else {
            z = false;
            z2 = false;
        }
        int i4 = this.f233s;
        if (i4 < this.f195F) {
            i4 = this.f195F;
        }
        int i5 = this.f234t;
        if (i5 < this.f196G) {
            i5 = this.f196G;
        }
        boolean z8 = this.f201M != C0067f.MATCH_CONSTRAINT;
        boolean z9 = this.f202N != C0067f.MATCH_CONSTRAINT;
        if (z8 || this.f223i == null || this.f225k == null || !(this.f223i.f165c == null || this.f225k.f165c == null)) {
            z3 = z8;
        } else {
            z3 = true;
        }
        if (z9 || this.f224j == null || this.f226l == null || (!(this.f224j.f165c == null || this.f226l.f165c == null) || (this.f194E != 0 && (this.f227m == null || !(this.f224j.f165c == null || this.f227m.f165c == null))))) {
            z8 = z9;
        } else {
            z8 = true;
        }
        Object obj2 = null;
        int i6 = this.f236v;
        float f2 = this.f235u;
        if (this.f235u > 0.0f && this.f204P != 8) {
            if (this.f201M == C0067f.MATCH_CONSTRAINT && this.f202N == C0067f.MATCH_CONSTRAINT) {
                obj2 = 1;
                if (z3 && !z8) {
                    f = f2;
                    i = 0;
                    obj = 1;
                    z4 = z8;
                    i2 = i5;
                    i3 = i4;
                    z9 = z3;
                    if (obj == null) {
                    }
                    if (this.f201M != C0067f.WRAP_CONTENT) {
                    }
                    if (this.f215a != 2) {
                        if (z5) {
                        }
                        m84a(c0078e, z8, z9, this.f223i, this.f225k, this.f237w, this.f237w + i3, i3, this.f195F, this.f199K, z5, z2, this.f217c, this.f219e, this.f220f);
                    }
                    if (this.f216b != 2) {
                        if (this.f202N != C0067f.WRAP_CONTENT) {
                        }
                        if (obj == null) {
                        }
                        if (this.f194E <= 0) {
                            c0062a = this.f226l;
                            c0078e.m167c(a6, a4, this.f194E, 5);
                            if (this.f227m.f165c == null) {
                                i3 = this.f194E;
                                c0062a = this.f227m;
                            } else {
                                i3 = i2;
                            }
                            if (z5) {
                            }
                            m84a(c0078e, z8, z4, this.f224j, c0062a, this.f238x, this.f238x + i3, i3, this.f196G, this.f200L, z5, z, this.f218d, this.f221g, this.f222h);
                            c0078e.m167c(a5, a4, i2, 5);
                        } else {
                            if (z5) {
                            }
                            m84a(c0078e, z8, z4, this.f224j, this.f226l, this.f238x, this.f238x + i2, i2, this.f196G, this.f200L, z5, z, this.f218d, this.f221g, this.f222h);
                        }
                        if (obj == null) {
                            b = c0078e.m165b();
                            if (i != 0) {
                                c0078e.m159a(b.m144a(a3, a2, a5, a4, f));
                            } else if (i != 1) {
                                c0078e.m159a(b.m144a(a5, a4, a3, a2, f));
                            } else {
                                if (this.f219e > 0) {
                                    c0078e.m163a(a3, a2, this.f219e, 3);
                                }
                                if (this.f221g > 0) {
                                    c0078e.m163a(a5, a4, this.f221g, 3);
                                }
                                b.m144a(a3, a2, a5, a4, f);
                                d = c0078e.m169d();
                                a = c0078e.m169d();
                                d.f297d = 4;
                                a.f297d = 4;
                                b.m140a(d, a);
                                c0078e.m159a(b);
                            }
                        }
                    }
                } else if (!z3 && z8) {
                    i6 = 1;
                    if (this.f236v == -1) {
                        f = 1.0f / f2;
                        i = 1;
                        int i7 = 1;
                        z4 = z8;
                        i2 = i5;
                        i3 = i4;
                        z9 = z3;
                        if (obj == null) {
                        }
                        if (this.f201M != C0067f.WRAP_CONTENT) {
                        }
                        if (this.f215a != 2) {
                            if (z5) {
                            }
                            m84a(c0078e, z8, z9, this.f223i, this.f225k, this.f237w, this.f237w + i3, i3, this.f195F, this.f199K, z5, z2, this.f217c, this.f219e, this.f220f);
                        }
                        if (this.f216b != 2) {
                            if (this.f202N != C0067f.WRAP_CONTENT) {
                            }
                            if (obj == null) {
                            }
                            if (this.f194E <= 0) {
                                if (z5) {
                                }
                                m84a(c0078e, z8, z4, this.f224j, this.f226l, this.f238x, this.f238x + i2, i2, this.f196G, this.f200L, z5, z, this.f218d, this.f221g, this.f222h);
                            } else {
                                c0062a = this.f226l;
                                c0078e.m167c(a6, a4, this.f194E, 5);
                                if (this.f227m.f165c == null) {
                                    i3 = i2;
                                } else {
                                    i3 = this.f194E;
                                    c0062a = this.f227m;
                                }
                                if (z5) {
                                }
                                m84a(c0078e, z8, z4, this.f224j, c0062a, this.f238x, this.f238x + i3, i3, this.f196G, this.f200L, z5, z, this.f218d, this.f221g, this.f222h);
                                c0078e.m167c(a5, a4, i2, 5);
                            }
                            if (obj == null) {
                                b = c0078e.m165b();
                                if (i != 0) {
                                    c0078e.m159a(b.m144a(a3, a2, a5, a4, f));
                                } else if (i != 1) {
                                    if (this.f219e > 0) {
                                        c0078e.m163a(a3, a2, this.f219e, 3);
                                    }
                                    if (this.f221g > 0) {
                                        c0078e.m163a(a5, a4, this.f221g, 3);
                                    }
                                    b.m144a(a3, a2, a5, a4, f);
                                    d = c0078e.m169d();
                                    a = c0078e.m169d();
                                    d.f297d = 4;
                                    a.f297d = 4;
                                    b.m140a(d, a);
                                    c0078e.m159a(b);
                                } else {
                                    c0078e.m159a(b.m144a(a5, a4, a3, a2, f));
                                }
                            }
                        }
                    }
                }
            }
            C0081h a7;
            C0081h a8;
            if (this.f201M == C0067f.MATCH_CONSTRAINT) {
                i3 = (int) (((float) this.f234t) * f2);
                f = f2;
                i = 0;
                obj = null;
                z4 = z8;
                i2 = i5;
                z9 = true;
            } else if (this.f202N == C0067f.MATCH_CONSTRAINT) {
                float f3;
                if (this.f236v == -1) {
                    f3 = 1.0f / f2;
                } else {
                    f3 = f2;
                }
                i2 = (int) (((float) this.f233s) * f3);
                f = f3;
                i = 1;
                obj = null;
                z4 = true;
                i3 = i4;
                z9 = z3;
            }
            z5 = obj == null && (i == 0 || i == -1);
            z8 = this.f201M != C0067f.WRAP_CONTENT && (this instanceof C0069g);
            if (this.f215a != 2) {
                if (z5 || this.f223i.f165c == null || this.f225k.f165c == null) {
                    m84a(c0078e, z8, z9, this.f223i, this.f225k, this.f237w, this.f237w + i3, i3, this.f195F, this.f199K, z5, z2, this.f217c, this.f219e, this.f220f);
                } else {
                    d = c0078e.m157a(this.f223i);
                    a7 = c0078e.m157a(this.f225k);
                    a = c0078e.m157a(this.f223i.f165c);
                    a8 = c0078e.m157a(this.f225k.f165c);
                    c0078e.m163a(d, a, this.f223i.m81b(), 3);
                    c0078e.m166b(a7, a8, this.f225k.m81b() * -1, 3);
                    if (!z2) {
                        c0078e.m162a(d, a, this.f223i.m81b(), this.f199K, a8, a7, this.f225k.m81b());
                    }
                }
            }
            if (this.f216b != 2) {
                z8 = this.f202N != C0067f.WRAP_CONTENT && (this instanceof C0069g);
                z5 = obj == null && (i == 1 || i == -1);
                if (this.f194E <= 0) {
                    c0062a = this.f226l;
                    c0078e.m167c(a6, a4, this.f194E, 5);
                    if (this.f227m.f165c == null) {
                        i3 = this.f194E;
                        c0062a = this.f227m;
                    } else {
                        i3 = i2;
                    }
                    if (z5 || this.f224j.f165c == null || this.f226l.f165c == null) {
                        m84a(c0078e, z8, z4, this.f224j, c0062a, this.f238x, this.f238x + i3, i3, this.f196G, this.f200L, z5, z, this.f218d, this.f221g, this.f222h);
                        c0078e.m167c(a5, a4, i2, 5);
                    } else {
                        d = c0078e.m157a(this.f224j);
                        a7 = c0078e.m157a(this.f226l);
                        a = c0078e.m157a(this.f224j.f165c);
                        a8 = c0078e.m157a(this.f226l.f165c);
                        c0078e.m163a(d, a, this.f224j.m81b(), 3);
                        c0078e.m166b(a7, a8, this.f226l.m81b() * -1, 3);
                        if (!z) {
                            c0078e.m162a(d, a, this.f224j.m81b(), this.f200L, a8, a7, this.f226l.m81b());
                        }
                    }
                } else if (z5 || this.f224j.f165c == null || this.f226l.f165c == null) {
                    m84a(c0078e, z8, z4, this.f224j, this.f226l, this.f238x, this.f238x + i2, i2, this.f196G, this.f200L, z5, z, this.f218d, this.f221g, this.f222h);
                } else {
                    d = c0078e.m157a(this.f224j);
                    a7 = c0078e.m157a(this.f226l);
                    a = c0078e.m157a(this.f224j.f165c);
                    a8 = c0078e.m157a(this.f226l.f165c);
                    c0078e.m163a(d, a, this.f224j.m81b(), 3);
                    c0078e.m166b(a7, a8, this.f226l.m81b() * -1, 3);
                    if (!z) {
                        c0078e.m162a(d, a, this.f224j.m81b(), this.f200L, a8, a7, this.f226l.m81b());
                    }
                }
                if (obj == null) {
                    b = c0078e.m165b();
                    if (i != 0) {
                        c0078e.m159a(b.m144a(a3, a2, a5, a4, f));
                    } else if (i != 1) {
                        c0078e.m159a(b.m144a(a5, a4, a3, a2, f));
                    } else {
                        if (this.f219e > 0) {
                            c0078e.m163a(a3, a2, this.f219e, 3);
                        }
                        if (this.f221g > 0) {
                            c0078e.m163a(a5, a4, this.f221g, 3);
                        }
                        b.m144a(a3, a2, a5, a4, f);
                        d = c0078e.m169d();
                        a = c0078e.m169d();
                        d.f297d = 4;
                        a.f297d = 4;
                        b.m140a(d, a);
                        c0078e.m159a(b);
                    }
                }
            }
        }
        f = f2;
        i = i6;
        obj = obj2;
        z4 = z8;
        i2 = i5;
        i3 = i4;
        z9 = z3;
        if (obj == null) {
        }
        if (this.f201M != C0067f.WRAP_CONTENT) {
        }
        if (this.f215a != 2) {
            if (z5) {
            }
            m84a(c0078e, z8, z9, this.f223i, this.f225k, this.f237w, this.f237w + i3, i3, this.f195F, this.f199K, z5, z2, this.f217c, this.f219e, this.f220f);
        }
        if (this.f216b != 2) {
            if (this.f202N != C0067f.WRAP_CONTENT) {
            }
            if (obj == null) {
            }
            if (this.f194E <= 0) {
                if (z5) {
                }
                m84a(c0078e, z8, z4, this.f224j, this.f226l, this.f238x, this.f238x + i2, i2, this.f196G, this.f200L, z5, z, this.f218d, this.f221g, this.f222h);
            } else {
                c0062a = this.f226l;
                c0078e.m167c(a6, a4, this.f194E, 5);
                if (this.f227m.f165c == null) {
                    i3 = i2;
                } else {
                    i3 = this.f194E;
                    c0062a = this.f227m;
                }
                if (z5) {
                }
                m84a(c0078e, z8, z4, this.f224j, c0062a, this.f238x, this.f238x + i3, i3, this.f196G, this.f200L, z5, z, this.f218d, this.f221g, this.f222h);
                c0078e.m167c(a5, a4, i2, 5);
            }
            if (obj == null) {
                b = c0078e.m165b();
                if (i != 0) {
                    c0078e.m159a(b.m144a(a3, a2, a5, a4, f));
                } else if (i != 1) {
                    if (this.f219e > 0) {
                        c0078e.m163a(a3, a2, this.f219e, 3);
                    }
                    if (this.f221g > 0) {
                        c0078e.m163a(a5, a4, this.f221g, 3);
                    }
                    b.m144a(a3, a2, a5, a4, f);
                    d = c0078e.m169d();
                    a = c0078e.m169d();
                    d.f297d = 4;
                    a.f297d = 4;
                    b.m140a(d, a);
                    c0078e.m159a(b);
                } else {
                    c0078e.m159a(b.m144a(a5, a4, a3, a2, f));
                }
            }
        }
    }

    private final void m84a(C0078e c0078e, boolean z, boolean z2, C0062a c0062a, C0062a c0062a2, int i, int i2, int i3, int i4, float f, boolean z3, boolean z4, int i5, int i6, int i7) {
        int i8;
        C0081h a = c0078e.m157a((Object) c0062a);
        C0081h a2 = c0078e.m157a((Object) c0062a2);
        C0081h a3 = c0078e.m157a(c0062a.f165c);
        C0081h a4 = c0078e.m157a(c0062a2.f165c);
        int b = c0062a.m81b();
        int b2 = c0062a2.m81b();
        if (this.f204P == 8) {
            i8 = 0;
            z2 = true;
        } else {
            i8 = i3;
        }
        if (a3 == null && a4 == null) {
            c0078e.m159a(c0078e.m165b().m139a(a, i));
            if (!z3) {
                if (z) {
                    c0078e.m159a(C0078e.m151a(c0078e, a2, a, i4, true));
                } else if (z2) {
                    c0078e.m159a(C0078e.m151a(c0078e, a2, a, i8, false));
                } else {
                    c0078e.m159a(c0078e.m165b().m139a(a2, i2));
                }
            }
        } else if (a3 != null && a4 == null) {
            c0078e.m159a(c0078e.m165b().m141a(a, a3, b));
            if (z) {
                c0078e.m159a(C0078e.m151a(c0078e, a2, a, i4, true));
            } else if (!z3) {
                if (z2) {
                    c0078e.m159a(c0078e.m165b().m141a(a2, a, i8));
                } else {
                    c0078e.m159a(c0078e.m165b().m139a(a2, i2));
                }
            }
        } else if (a3 == null && a4 != null) {
            c0078e.m159a(c0078e.m165b().m141a(a2, a4, b2 * -1));
            if (z) {
                c0078e.m159a(C0078e.m151a(c0078e, a2, a, i4, true));
            } else if (!z3) {
                if (z2) {
                    c0078e.m159a(c0078e.m165b().m141a(a2, a, i8));
                } else {
                    c0078e.m159a(c0078e.m165b().m139a(a, i));
                }
            }
        } else if (z2) {
            if (z) {
                c0078e.m159a(C0078e.m151a(c0078e, a2, a, i4, true));
            } else {
                c0078e.m159a(c0078e.m165b().m141a(a2, a, i8));
            }
            if (c0062a.f168f != c0062a2.f168f) {
                C0081h c;
                if (c0062a.f168f == C0064c.STRONG) {
                    c0078e.m159a(c0078e.m165b().m141a(a, a3, b));
                    c = c0078e.m168c();
                    C0075b b3 = c0078e.m165b();
                    b3.m148b(a2, a4, c, b2 * -1);
                    c0078e.m159a(b3);
                    return;
                }
                c = c0078e.m168c();
                C0075b b4 = c0078e.m165b();
                b4.m143a(a, a3, c, b);
                c0078e.m159a(b4);
                c0078e.m159a(c0078e.m165b().m141a(a2, a4, b2 * -1));
            } else if (a3 == a4) {
                c0078e.m159a(C0078e.m150a(c0078e, a, a3, 0, 0.5f, a4, a2, 0, true));
            } else if (!z4) {
                Object obj = c0062a.f169g != C0063b.STRICT ? 1 : null;
                C0081h c2 = c0078e.m168c();
                C0075b b5 = c0078e.m165b();
                b5.m143a(a, a3, c2, b);
                if (obj != null) {
                    c0078e.m160a(b5, (int) (b5.f271c.m136b(c2) * -1.0f));
                }
                c0078e.m159a(b5);
                obj = c0062a2.f169g != C0063b.STRICT ? 1 : null;
                int i9 = b2 * -1;
                C0081h c3 = c0078e.m168c();
                C0075b b6 = c0078e.m165b();
                b6.m148b(a2, a4, c3, i9);
                if (obj != null) {
                    c0078e.m160a(b6, (int) (b6.f271c.m136b(c3) * -1.0f));
                }
                c0078e.m159a(b6);
                c0078e.m159a(C0078e.m150a(c0078e, a, a3, b, f, a4, a2, b2, false));
            }
        } else if (z3) {
            c0078e.m163a(a, a3, b, 3);
            c0078e.m166b(a2, a4, b2 * -1, 3);
            c0078e.m159a(C0078e.m150a(c0078e, a, a3, b, f, a4, a2, b2, true));
        } else if (!z4) {
            if (i5 == 1) {
                if (i6 > i8) {
                    i8 = i6;
                }
                if (i7 > 0) {
                    if (i7 >= i8) {
                        c0078e.m166b(a2, a, i7, 3);
                    }
                    c0078e.m167c(a2, a, i7, 3);
                }
                i7 = i8;
                c0078e.m167c(a2, a, i7, 3);
            } else if (i6 == 0 && i7 == 0) {
                c0078e.m159a(c0078e.m165b().m141a(a, a3, b));
                c0078e.m159a(c0078e.m165b().m141a(a2, a4, b2 * -1));
                return;
            } else if (i7 > 0) {
                c0078e.m166b(a2, a, i7, 3);
            }
            c0078e.m163a(a, a3, b, 2);
            c0078e.m166b(a2, a4, -b2, 2);
            c0078e.m162a(a, a3, b, f, a4, a2, b2);
        }
    }

    public void mo46n() {
        int b = C0078e.m153b(this.f223i);
        int b2 = C0078e.m153b(this.f224j);
        int b3 = C0078e.m153b(this.f225k) - b;
        int b4 = C0078e.m153b(this.f226l) - b2;
        this.f237w = b;
        this.f238x = b2;
        if (this.f204P == 8) {
            this.f233s = 0;
            this.f234t = 0;
            return;
        }
        if (this.f201M == C0067f.FIXED && b3 < this.f233s) {
            b3 = this.f233s;
        }
        if (this.f202N == C0067f.FIXED && b4 < this.f234t) {
            b4 = this.f234t;
        }
        this.f233s = b3;
        this.f234t = b4;
        if (this.f234t < this.f196G) {
            this.f234t = this.f196G;
        }
        if (this.f233s < this.f195F) {
            this.f233s = this.f195F;
        }
    }
}
