package android.support.constraint.p015a.p016a;

import android.support.constraint.p015a.C0075b;
import android.support.constraint.p015a.C0077d;
import android.support.constraint.p015a.C0078e;
import android.support.constraint.p015a.C0081h;
import com.google.c.a.a.a.a.a;
import java.util.ArrayList;
import java.util.Arrays;

public final class C0069g extends C0068l {
    public int f246H;
    public int f247I;
    public C0078e ak = new C0078e();
    public C0072j al;
    public int am;
    public int an;
    public int ao;
    public int ap;
    public int aq = 0;
    public int ar = 0;
    public C0066e[] as = new C0066e[4];
    public C0066e[] at = new C0066e[4];
    public C0066e[] au = new C0066e[4];
    public int av = 2;
    public boolean[] aw = new boolean[3];
    public C0066e[] ax = new C0066e[4];
    public boolean ay = false;
    public boolean az = false;

    public final void mo38a() {
        this.ak.m158a();
        this.am = 0;
        this.ao = 0;
        this.an = 0;
        this.ap = 0;
        super.mo38a();
    }

    private final boolean m121b(C0078e c0078e) {
        int size;
        int i;
        C0066e c0066e;
        int i2;
        int i3;
        int c;
        Object obj;
        float f;
        int i4;
        Object obj2;
        mo44a(c0078e);
        int size2 = this.aA.size();
        if (this.av == 2 || this.av == 4) {
            size = this.aA.size();
            Object obj3 = null;
            for (i = 0; i < size; i++) {
                c0066e = (C0066e) this.aA.get(i);
                c0066e.f215a = -1;
                c0066e.f216b = -1;
                if (c0066e.f201M == C0067f.MATCH_CONSTRAINT || c0066e.f202N == C0067f.MATCH_CONSTRAINT) {
                    c0066e.f215a = 1;
                    c0066e.f216b = 1;
                }
            }
            int i5 = 0;
            int i6 = 0;
            while (obj3 == null) {
                i2 = 0;
                i3 = 0;
                int i7 = 0;
                while (i7 < size) {
                    C0081h c0081h;
                    Object obj4;
                    C0070h c0070h;
                    c0066e = (C0066e) this.aA.get(i7);
                    if (c0066e.f215a == -1) {
                        if (this.M == C0067f.WRAP_CONTENT) {
                            c0066e.f215a = 1;
                        } else if (c0066e.f201M == C0067f.MATCH_CONSTRAINT) {
                            c0066e.f215a = 1;
                        } else if (this.M != C0067f.WRAP_CONTENT && c0066e.f201M == C0067f.MATCH_PARENT) {
                            c0066e.f223i.f171i = c0078e.m157a(c0066e.f223i);
                            c0066e.f225k.f171i = c0078e.m157a(c0066e.f225k);
                            i = c0066e.f223i.f166d;
                            c = m97c() - c0066e.f225k.f166d;
                            c0078e.m161a(c0066e.f223i.f171i, i);
                            c0078e.m161a(c0066e.f225k.f171i, c);
                            c0066e.m94b(i, c);
                            c0066e.f215a = 2;
                        } else if (c0066e.f223i.f165c == null || c0066e.f225k.f165c == null) {
                            if (c0066e.f223i.f165c != null && c0066e.f223i.f165c.f163a == this) {
                                i = c0066e.f223i.m81b();
                                c = c0066e.m97c() + i;
                                c0066e.f223i.f171i = c0078e.m157a(c0066e.f223i);
                                c0066e.f225k.f171i = c0078e.m157a(c0066e.f225k);
                                c0078e.m161a(c0066e.f223i.f171i, i);
                                c0078e.m161a(c0066e.f225k.f171i, c);
                                c0066e.f215a = 2;
                                c0066e.m94b(i, c);
                            } else if (c0066e.f225k.f165c != null && c0066e.f225k.f165c.f163a == this) {
                                c0066e.f223i.f171i = c0078e.m157a(c0066e.f223i);
                                c0066e.f225k.f171i = c0078e.m157a(c0066e.f225k);
                                i = m97c() - c0066e.f225k.m81b();
                                c = i - c0066e.m97c();
                                c0078e.m161a(c0066e.f223i.f171i, c);
                                c0078e.m161a(c0066e.f225k.f171i, i);
                                c0066e.f215a = 2;
                                c0066e.m94b(c, i);
                            } else if (c0066e.f223i.f165c != null && c0066e.f223i.f165c.f163a.f215a == 2) {
                                c0081h = c0066e.f223i.f165c.f171i;
                                c0066e.f223i.f171i = c0078e.m157a(c0066e.f223i);
                                c0066e.f225k.f171i = c0078e.m157a(c0066e.f225k);
                                i = (int) ((c0081h.f298e + ((float) c0066e.f223i.m81b())) + 0.5f);
                                c = c0066e.m97c() + i;
                                c0078e.m161a(c0066e.f223i.f171i, i);
                                c0078e.m161a(c0066e.f225k.f171i, c);
                                c0066e.f215a = 2;
                                c0066e.m94b(i, c);
                            } else if (c0066e.f225k.f165c == null || c0066e.f225k.f165c.f163a.f215a != 2) {
                                obj = c0066e.f223i.f165c != null ? 1 : null;
                                obj4 = c0066e.f225k.f165c != null ? 1 : null;
                                if (obj == null && obj4 == null) {
                                    if (c0066e instanceof C0070h) {
                                        c0070h = (C0070h) c0066e;
                                        if (c0070h.ao == 1) {
                                            c0066e.f223i.f171i = c0078e.m157a(c0066e.f223i);
                                            c0066e.f225k.f171i = c0078e.m157a(c0066e.f225k);
                                            if (c0070h.al != -1) {
                                                f = (float) c0070h.al;
                                            } else if (c0070h.am != -1) {
                                                f = (float) (m97c() - c0070h.am);
                                            } else {
                                                f = c0070h.ak * ((float) m97c());
                                            }
                                            i = (int) (f + 0.5f);
                                            c0078e.m161a(c0066e.f223i.f171i, i);
                                            c0078e.m161a(c0066e.f225k.f171i, i);
                                            c0066e.f215a = 2;
                                            c0066e.f216b = 2;
                                            c0066e.m94b(i, i);
                                            c0066e.m99c(0, m103f());
                                        }
                                    } else {
                                        c0066e.f223i.f171i = c0078e.m157a(c0066e.f223i);
                                        c0066e.f225k.f171i = c0078e.m157a(c0066e.f225k);
                                        i = c0066e.f237w;
                                        c = c0066e.m97c() + i;
                                        c0078e.m161a(c0066e.f223i.f171i, i);
                                        c0078e.m161a(c0066e.f225k.f171i, c);
                                        c0066e.f215a = 2;
                                    }
                                }
                            } else {
                                c0081h = c0066e.f225k.f165c.f171i;
                                c0066e.f223i.f171i = c0078e.m157a(c0066e.f223i);
                                c0066e.f225k.f171i = c0078e.m157a(c0066e.f225k);
                                i = (int) ((c0081h.f298e - ((float) c0066e.f225k.m81b())) + 0.5f);
                                c = i - c0066e.m97c();
                                c0078e.m161a(c0066e.f223i.f171i, c);
                                c0078e.m161a(c0066e.f225k.f171i, i);
                                c0066e.f215a = 2;
                                c0066e.m94b(c, i);
                            }
                        } else if (c0066e.f223i.f165c.f163a == this && c0066e.f225k.f165c.f163a == this) {
                            c = c0066e.f223i.m81b();
                            i = c0066e.f225k.m81b();
                            if (this.M == C0067f.MATCH_CONSTRAINT) {
                                i = m97c() - i;
                            } else {
                                c += (int) ((((float) (((m97c() - c) - i) - c0066e.m97c())) * c0066e.f199K) + 0.5f);
                                i = c0066e.m97c() + c;
                            }
                            c0066e.f223i.f171i = c0078e.m157a(c0066e.f223i);
                            c0066e.f225k.f171i = c0078e.m157a(c0066e.f225k);
                            c0078e.m161a(c0066e.f223i.f171i, c);
                            c0078e.m161a(c0066e.f225k.f171i, i);
                            c0066e.f215a = 2;
                            c0066e.m94b(c, i);
                        } else {
                            c0066e.f215a = 1;
                        }
                    }
                    if (c0066e.f216b == -1) {
                        if (this.N == C0067f.WRAP_CONTENT) {
                            c0066e.f216b = 1;
                        } else if (c0066e.f202N == C0067f.MATCH_CONSTRAINT) {
                            c0066e.f216b = 1;
                        } else {
                            if (this.N != C0067f.WRAP_CONTENT && c0066e.f202N == C0067f.MATCH_PARENT) {
                                c0066e.f224j.f171i = c0078e.m157a(c0066e.f224j);
                                c0066e.f226l.f171i = c0078e.m157a(c0066e.f226l);
                                i = c0066e.f224j.f166d;
                                c = m103f() - c0066e.f226l.f166d;
                                c0078e.m161a(c0066e.f224j.f171i, i);
                                c0078e.m161a(c0066e.f226l.f171i, c);
                                if (c0066e.f194E > 0 || c0066e.f204P == 8) {
                                    c0066e.f227m.f171i = c0078e.m157a(c0066e.f227m);
                                    c0078e.m161a(c0066e.f227m.f171i, c0066e.f194E + i);
                                }
                                c0066e.m99c(i, c);
                            } else if (c0066e.f224j.f165c == null || c0066e.f226l.f165c == null) {
                                if (c0066e.f224j.f165c != null && c0066e.f224j.f165c.f163a == this) {
                                    i = c0066e.f224j.m81b();
                                    c = c0066e.m103f() + i;
                                    c0066e.f224j.f171i = c0078e.m157a(c0066e.f224j);
                                    c0066e.f226l.f171i = c0078e.m157a(c0066e.f226l);
                                    c0078e.m161a(c0066e.f224j.f171i, i);
                                    c0078e.m161a(c0066e.f226l.f171i, c);
                                    if (c0066e.f194E > 0 || c0066e.f204P == 8) {
                                        c0066e.f227m.f171i = c0078e.m157a(c0066e.f227m);
                                        c0078e.m161a(c0066e.f227m.f171i, c0066e.f194E + i);
                                    }
                                    c0066e.f216b = 2;
                                    c0066e.m99c(i, c);
                                } else if (c0066e.f226l.f165c != null && c0066e.f226l.f165c.f163a == this) {
                                    c0066e.f224j.f171i = c0078e.m157a(c0066e.f224j);
                                    c0066e.f226l.f171i = c0078e.m157a(c0066e.f226l);
                                    i = m103f() - c0066e.f226l.m81b();
                                    c = i - c0066e.m103f();
                                    c0078e.m161a(c0066e.f224j.f171i, c);
                                    c0078e.m161a(c0066e.f226l.f171i, i);
                                    if (c0066e.f194E > 0 || c0066e.f204P == 8) {
                                        c0066e.f227m.f171i = c0078e.m157a(c0066e.f227m);
                                        c0078e.m161a(c0066e.f227m.f171i, c0066e.f194E + c);
                                    }
                                    c0066e.f216b = 2;
                                    c0066e.m99c(c, i);
                                } else if (c0066e.f224j.f165c != null && c0066e.f224j.f165c.f163a.f216b == 2) {
                                    c0081h = c0066e.f224j.f165c.f171i;
                                    c0066e.f224j.f171i = c0078e.m157a(c0066e.f224j);
                                    c0066e.f226l.f171i = c0078e.m157a(c0066e.f226l);
                                    i = (int) ((c0081h.f298e + ((float) c0066e.f224j.m81b())) + 0.5f);
                                    c = c0066e.m103f() + i;
                                    c0078e.m161a(c0066e.f224j.f171i, i);
                                    c0078e.m161a(c0066e.f226l.f171i, c);
                                    if (c0066e.f194E > 0 || c0066e.f204P == 8) {
                                        c0066e.f227m.f171i = c0078e.m157a(c0066e.f227m);
                                        c0078e.m161a(c0066e.f227m.f171i, c0066e.f194E + i);
                                    }
                                    c0066e.f216b = 2;
                                    c0066e.m99c(i, c);
                                } else if (c0066e.f226l.f165c != null && c0066e.f226l.f165c.f163a.f216b == 2) {
                                    c0081h = c0066e.f226l.f165c.f171i;
                                    c0066e.f224j.f171i = c0078e.m157a(c0066e.f224j);
                                    c0066e.f226l.f171i = c0078e.m157a(c0066e.f226l);
                                    i = (int) ((c0081h.f298e - ((float) c0066e.f226l.m81b())) + 0.5f);
                                    c = i - c0066e.m103f();
                                    c0078e.m161a(c0066e.f224j.f171i, c);
                                    c0078e.m161a(c0066e.f226l.f171i, i);
                                    if (c0066e.f194E > 0 || c0066e.f204P == 8) {
                                        c0066e.f227m.f171i = c0078e.m157a(c0066e.f227m);
                                        c0078e.m161a(c0066e.f227m.f171i, c0066e.f194E + c);
                                    }
                                    c0066e.f216b = 2;
                                    c0066e.m99c(c, i);
                                } else if (c0066e.f227m.f165c == null || c0066e.f227m.f165c.f163a.f216b != 2) {
                                    obj = c0066e.f227m.f165c != null ? 1 : null;
                                    obj4 = c0066e.f224j.f165c != null ? 1 : null;
                                    Object obj5 = c0066e.f226l.f165c != null ? 1 : null;
                                    if (obj == null && obj4 == null && obj5 == null) {
                                        if (c0066e instanceof C0070h) {
                                            c0070h = (C0070h) c0066e;
                                            if (c0070h.ao == 0) {
                                                c0066e.f224j.f171i = c0078e.m157a(c0066e.f224j);
                                                c0066e.f226l.f171i = c0078e.m157a(c0066e.f226l);
                                                if (c0070h.al != -1) {
                                                    f = (float) c0070h.al;
                                                } else if (c0070h.am != -1) {
                                                    f = (float) (m103f() - c0070h.am);
                                                } else {
                                                    f = c0070h.ak * ((float) m103f());
                                                }
                                                i = (int) (f + 0.5f);
                                                c0078e.m161a(c0066e.f224j.f171i, i);
                                                c0078e.m161a(c0066e.f226l.f171i, i);
                                                c0066e.f216b = 2;
                                                c0066e.f215a = 2;
                                                c0066e.m99c(i, i);
                                                c0066e.m94b(0, m97c());
                                            }
                                        } else {
                                            c0066e.f224j.f171i = c0078e.m157a(c0066e.f224j);
                                            c0066e.f226l.f171i = c0078e.m157a(c0066e.f226l);
                                            i = c0066e.f238x;
                                            c = c0066e.m103f() + i;
                                            c0078e.m161a(c0066e.f224j.f171i, i);
                                            c0078e.m161a(c0066e.f226l.f171i, c);
                                            if (c0066e.f194E > 0 || c0066e.f204P == 8) {
                                                c0066e.f227m.f171i = c0078e.m157a(c0066e.f227m);
                                                c0078e.m161a(c0066e.f227m.f171i, i + c0066e.f194E);
                                            }
                                        }
                                    }
                                } else {
                                    c0081h = c0066e.f227m.f165c.f171i;
                                    c0066e.f224j.f171i = c0078e.m157a(c0066e.f224j);
                                    c0066e.f226l.f171i = c0078e.m157a(c0066e.f226l);
                                    i = (int) ((c0081h.f298e - ((float) c0066e.f194E)) + 0.5f);
                                    c = c0066e.m103f() + i;
                                    c0078e.m161a(c0066e.f224j.f171i, i);
                                    c0078e.m161a(c0066e.f226l.f171i, c);
                                    c0066e.f227m.f171i = c0078e.m157a(c0066e.f227m);
                                    c0078e.m161a(c0066e.f227m.f171i, c0066e.f194E + i);
                                    c0066e.f216b = 2;
                                    c0066e.m99c(i, c);
                                }
                            } else if (c0066e.f224j.f165c.f163a == this && c0066e.f226l.f165c.f163a == this) {
                                c = c0066e.f224j.m81b();
                                i = c0066e.f226l.m81b();
                                if (this.N == C0067f.MATCH_CONSTRAINT) {
                                    i = c0066e.m103f() + c;
                                } else {
                                    c = (int) (((((float) (((m103f() - c) - i) - c0066e.m103f())) * c0066e.f200L) + ((float) c)) + 0.5f);
                                    i = c0066e.m103f() + c;
                                }
                                c0066e.f224j.f171i = c0078e.m157a(c0066e.f224j);
                                c0066e.f226l.f171i = c0078e.m157a(c0066e.f226l);
                                c0078e.m161a(c0066e.f224j.f171i, c);
                                c0078e.m161a(c0066e.f226l.f171i, i);
                                if (c0066e.f194E > 0 || c0066e.f204P == 8) {
                                    c0066e.f227m.f171i = c0078e.m157a(c0066e.f227m);
                                    c0078e.m161a(c0066e.f227m.f171i, c0066e.f194E + c);
                                }
                                c0066e.f216b = 2;
                                c0066e.m99c(c, i);
                            } else {
                                c0066e.f216b = 1;
                            }
                            c0066e.f216b = 2;
                        }
                    }
                    if (c0066e.f216b == -1) {
                        i = i2 + 1;
                    } else {
                        i = i2;
                    }
                    if (c0066e.f215a == -1) {
                        i4 = i3 + 1;
                    } else {
                        i4 = i3;
                    }
                    i7++;
                    i3 = i4;
                    i2 = i;
                }
                if (i2 == 0 && i3 == 0) {
                    obj3 = 1;
                    i5 = i3;
                    i6 = i2;
                } else {
                    if (i6 == i2 && r11 == i3) {
                        obj2 = 1;
                    } else {
                        obj2 = obj3;
                    }
                    i5 = i3;
                    i6 = i2;
                    obj3 = obj2;
                }
            }
            i = 0;
            c = 0;
            i2 = 0;
            while (i2 < size) {
                c0066e = (C0066e) this.aA.get(i2);
                if (c0066e.f215a == 1 || c0066e.f215a == -1) {
                    i++;
                }
                if (c0066e.f216b == 1 || c0066e.f216b == -1) {
                    i4 = c + 1;
                } else {
                    i4 = c;
                }
                i2++;
                c = i4;
            }
            if (i == 0 && c == 0) {
                obj2 = 1;
            } else {
                obj2 = null;
            }
            if (obj2 != null) {
                return false;
            }
            obj = null;
        } else {
            obj = 1;
        }
        for (c = 0; c < size2; c++) {
            c0066e = (C0066e) this.aA.get(c);
            if (c0066e instanceof C0069g) {
                C0067f c0067f = c0066e.f201M;
                C0067f c0067f2 = c0066e.f202N;
                if (c0067f == C0067f.WRAP_CONTENT) {
                    c0066e.m90a(C0067f.FIXED);
                }
                if (c0067f2 == C0067f.WRAP_CONTENT) {
                    c0066e.m95b(C0067f.FIXED);
                }
                c0066e.mo44a(c0078e);
                if (c0067f == C0067f.WRAP_CONTENT) {
                    c0066e.m90a(c0067f);
                }
                if (c0067f2 == C0067f.WRAP_CONTENT) {
                    c0066e.m95b(c0067f2);
                }
            } else {
                if (obj != null) {
                    if (this.M != C0067f.WRAP_CONTENT && c0066e.f201M == C0067f.MATCH_PARENT) {
                        c0066e.f223i.f171i = c0078e.m157a(c0066e.f223i);
                        c0066e.f225k.f171i = c0078e.m157a(c0066e.f225k);
                        i2 = c0066e.f223i.f166d;
                        i3 = m97c() - c0066e.f225k.f166d;
                        c0078e.m161a(c0066e.f223i.f171i, i2);
                        c0078e.m161a(c0066e.f225k.f171i, i3);
                        c0066e.m94b(i2, i3);
                        c0066e.f215a = 2;
                    }
                    if (this.N != C0067f.WRAP_CONTENT && c0066e.f202N == C0067f.MATCH_PARENT) {
                        c0066e.f224j.f171i = c0078e.m157a(c0066e.f224j);
                        c0066e.f226l.f171i = c0078e.m157a(c0066e.f226l);
                        i2 = c0066e.f224j.f166d;
                        i3 = m103f() - c0066e.f226l.f166d;
                        c0078e.m161a(c0066e.f224j.f171i, i2);
                        c0078e.m161a(c0066e.f226l.f171i, i3);
                        if (c0066e.f194E > 0 || c0066e.f204P == 8) {
                            c0066e.f227m.f171i = c0078e.m157a(c0066e.f227m);
                            c0078e.m161a(c0066e.f227m.f171i, c0066e.f194E + i2);
                        }
                        c0066e.m99c(i2, i3);
                        c0066e.f216b = 2;
                    }
                }
                c0066e.mo44a(c0078e);
            }
        }
        if (this.aq > 0) {
            for (size = 0; size < this.aq; size++) {
                C0066e c0066e2 = this.au[size];
                int a = m118a(c0078e, this.ax, this.au[size], 0, this.aw);
                C0066e c0066e3 = this.ax[2];
                if (c0066e3 != null) {
                    if (this.aw[1]) {
                        i4 = c0066e2.m104g();
                        while (c0066e3 != null) {
                            c0078e.m161a(c0066e3.f223i.f171i, i4);
                            i4 += (c0066e3.f223i.m81b() + c0066e3.m97c()) + c0066e3.f225k.m81b();
                            c0066e3 = c0066e3.ai;
                        }
                    } else {
                        Object obj6 = c0066e2.ac == 0 ? 1 : null;
                        Object obj7 = c0066e2.ac == 2 ? 1 : null;
                        obj2 = this.M == C0067f.WRAP_CONTENT ? 1 : null;
                        C0066e c0066e4;
                        C0066e c0066e5;
                        if ((this.av == 2 || this.av == 8) && this.aw[0] && c0066e2.ae && obj7 == null && obj2 == null && c0066e2.ac == 0) {
                            float f2;
                            i2 = 0;
                            i4 = 0;
                            f = 0.0f;
                            c0066e4 = null;
                            c0066e5 = c0066e2;
                            while (c0066e5 != null) {
                                if ((c0066e5.f204P == 8 ? 1 : null) == null) {
                                    c = i4 + 1;
                                    if (c0066e5.f201M != C0067f.MATCH_CONSTRAINT) {
                                        i2 = (c0066e5.f225k.f165c != null ? c0066e5.f225k.m81b() : 0) + ((i2 + c0066e5.m97c()) + (c0066e5.f223i.f165c != null ? c0066e5.f223i.m81b() : 0));
                                    } else {
                                        f = c0066e5.ag + f;
                                    }
                                } else {
                                    c = i4;
                                }
                                c0066e = c0066e5.f225k.f165c != null ? c0066e5.f225k.f165c.f163a : null;
                                if (c0066e != null && (c0066e.f223i.f165c == null || !(c0066e.f223i.f165c == null || c0066e.f223i.f165c.f163a == c0066e5))) {
                                    c0066e = null;
                                }
                                c0066e4 = c0066e5;
                                c0066e5 = c0066e;
                                i4 = c;
                            }
                            c = 0;
                            if (c0066e4 != null) {
                                if (c0066e4.f225k.f165c != null) {
                                    c = c0066e4.f225k.f165c.f163a.f237w;
                                } else {
                                    c = 0;
                                }
                                if (c0066e4.f225k.f165c != null && c0066e4.f225k.f165c.f163a == this) {
                                    c = m106i();
                                }
                            }
                            float f3 = ((float) (c + 0)) - ((float) i2);
                            float f4 = f3 / ((float) (i4 + 1));
                            if (a == 0) {
                                f2 = f4;
                                c0066e5 = c0066e2;
                            } else {
                                f2 = f3 / ((float) a);
                                c0066e5 = c0066e2;
                                f4 = 0.0f;
                            }
                            while (c0066e5 != null) {
                                float c2;
                                i4 = c0066e5.f223i.f165c != null ? c0066e5.f223i.m81b() : 0;
                                c = c0066e5.f225k.f165c != null ? c0066e5.f225k.m81b() : 0;
                                if (c0066e5.f204P != 8) {
                                    f4 += (float) i4;
                                    c0078e.m161a(c0066e5.f223i.f171i, (int) (0.5f + f4));
                                    if (c0066e5.f201M != C0067f.MATCH_CONSTRAINT) {
                                        c2 = ((float) c0066e5.m97c()) + f4;
                                    } else if (f == 0.0f) {
                                        c2 = ((f2 - ((float) i4)) - ((float) c)) + f4;
                                    } else {
                                        c2 = ((((c0066e5.ag * f3) / f) - ((float) i4)) - ((float) c)) + f4;
                                    }
                                    c0078e.m161a(c0066e5.f225k.f171i, (int) (0.5f + c2));
                                    if (a == 0) {
                                        c2 += f2;
                                    }
                                    c2 += (float) c;
                                } else {
                                    c2 = f4 - (f2 / 2.0f);
                                    c0078e.m161a(c0066e5.f223i.f171i, (int) (0.5f + c2));
                                    c0078e.m161a(c0066e5.f225k.f171i, (int) (c2 + 0.5f));
                                    c2 = f4;
                                }
                                C0066e c0066e6 = c0066e5.f225k.f165c != null ? c0066e5.f225k.f165c.f163a : null;
                                if (!(c0066e6 == null || c0066e6.f223i.f165c == null || c0066e6.f223i.f165c.f163a == c0066e5)) {
                                    c0066e6 = null;
                                }
                                if (c0066e6 == this) {
                                    c0066e6 = null;
                                }
                                f4 = c2;
                                c0066e5 = c0066e6;
                            }
                        } else if (a == 0 || obj7 != null) {
                            C0062a c0062a;
                            int b;
                            C0081h c0081h2;
                            c0066e4 = null;
                            obj2 = null;
                            c0066e5 = null;
                            C0066e c0066e7 = c0066e3;
                            while (c0066e7 != null) {
                                Object obj8;
                                C0066e c0066e8;
                                r3 = c0066e7.ai;
                                if (r3 == null) {
                                    obj8 = 1;
                                    c0066e8 = this.ax[1];
                                } else {
                                    obj8 = obj2;
                                    c0066e8 = c0066e4;
                                }
                                if (obj7 != null) {
                                    C0062a c0062a2 = c0066e7.f223i;
                                    i4 = c0062a2.m81b();
                                    if (c0066e5 != null) {
                                        c = i4 + c0066e5.f225k.m81b();
                                    } else {
                                        c = i4;
                                    }
                                    i4 = 1;
                                    if (c0066e3 != c0066e7) {
                                        i4 = 3;
                                    }
                                    c0078e.m163a(c0062a2.f171i, c0062a2.f165c.f171i, c, i4);
                                    if (c0066e7.f201M == C0067f.MATCH_CONSTRAINT) {
                                        r2 = c0066e7.f225k;
                                        if (c0066e7.f217c == 1) {
                                            c0078e.m167c(r2.f171i, c0062a2.f171i, Math.max(c0066e7.f219e, c0066e7.m97c()), 3);
                                            c0066e = r3;
                                        } else {
                                            c0078e.m163a(c0062a2.f171i, c0062a2.f165c.f171i, c0062a2.f166d, 3);
                                            c0078e.m166b(r2.f171i, c0062a2.f171i, c0066e7.f219e, 3);
                                        }
                                    }
                                    c0066e = r3;
                                } else if (obj6 != null || obj8 == null || c0066e5 == null) {
                                    if (obj6 != null || obj8 != null || c0066e5 != null) {
                                        C0062a c0062a3 = c0066e7.f223i;
                                        c0062a = c0066e7.f225k;
                                        i2 = c0062a3.m81b();
                                        b = c0062a.m81b();
                                        c0078e.m163a(c0062a3.f171i, c0062a3.f165c.f171i, i2, 1);
                                        c0078e.m166b(c0062a.f171i, c0062a.f165c.f171i, -b, 1);
                                        r4 = c0062a3.f165c != null ? c0062a3.f165c.f171i : null;
                                        if (c0066e5 == null) {
                                            r4 = c0066e2.f223i.f165c != null ? c0066e2.f223i.f165c.f171i : null;
                                        }
                                        if (r3 == null) {
                                            r13 = c0066e8.f225k.f165c != null ? c0066e8.f225k.f165c.f163a : null;
                                        } else {
                                            r13 = r3;
                                        }
                                        if (r13 != null) {
                                            c0081h2 = r13.f223i.f171i;
                                            if (obj8 != null) {
                                                c0081h2 = c0066e8.f225k.f165c != null ? c0066e8.f225k.f165c.f171i : null;
                                            }
                                            if (!(r4 == null || c0081h2 == null)) {
                                                c0078e.m162a(c0062a3.f171i, r4, i2, 0.5f, c0081h2, c0062a.f171i, b);
                                            }
                                        }
                                        c0066e = r13;
                                    } else if (c0066e7.f223i.f165c == null) {
                                        c0078e.m161a(c0066e7.f223i.f171i, c0066e7.m104g());
                                        c0066e = r3;
                                    } else {
                                        c0078e.m167c(c0066e7.f223i.f171i, c0066e2.f223i.f165c.f171i, c0066e7.f223i.m81b(), 5);
                                        c0066e = r3;
                                    }
                                } else if (c0066e7.f225k.f165c == null) {
                                    c0078e.m161a(c0066e7.f225k.f171i, c0066e7.m104g() + c0066e7.f190A);
                                    c0066e = r3;
                                } else {
                                    c0078e.m167c(c0066e7.f225k.f171i, c0066e8.f225k.f165c.f171i, -c0066e7.f225k.m81b(), 5);
                                    c0066e = r3;
                                }
                                if (obj8 != null) {
                                    c0066e = null;
                                }
                                c0066e4 = c0066e8;
                                c0066e5 = c0066e7;
                                c0066e7 = c0066e;
                                obj2 = obj8;
                            }
                            if (obj7 != null) {
                                r2 = c0066e3.f223i;
                                c0062a = c0066e4.f225k;
                                i2 = r2.m81b();
                                b = c0062a.m81b();
                                r4 = c0066e2.f223i.f165c != null ? c0066e2.f223i.f165c.f171i : null;
                                c0081h2 = c0066e4.f225k.f165c != null ? c0066e4.f225k.f165c.f171i : null;
                                if (!(r4 == null || c0081h2 == null)) {
                                    c0078e.m166b(c0062a.f171i, c0081h2, -b, 1);
                                    c0078e.m162a(r2.f171i, r4, i2, c0066e2.f199K, c0081h2, c0062a.f171i, b);
                                }
                            }
                        } else {
                            float f5 = 0.0f;
                            r3 = null;
                            C0066e c0066e9 = c0066e3;
                            while (c0066e9 != null) {
                                if (c0066e9.f201M != C0067f.MATCH_CONSTRAINT) {
                                    i4 = c0066e9.f223i.m81b();
                                    if (r3 != null) {
                                        i4 += r3.f225k.m81b();
                                    }
                                    i = 3;
                                    if (c0066e9.f223i.f165c.f163a.f201M == C0067f.MATCH_CONSTRAINT) {
                                        i = 2;
                                    }
                                    c0078e.m163a(c0066e9.f223i.f171i, c0066e9.f223i.f165c.f171i, i4, i);
                                    i4 = c0066e9.f225k.m81b();
                                    if (c0066e9.f225k.f165c.f163a.f223i.f165c != null && c0066e9.f225k.f165c.f163a.f223i.f165c.f163a == c0066e9) {
                                        i4 += c0066e9.f225k.f165c.f163a.f223i.m81b();
                                    }
                                    i = 3;
                                    if (c0066e9.f225k.f165c.f163a.f201M == C0067f.MATCH_CONSTRAINT) {
                                        i = 2;
                                    }
                                    c0078e.m166b(c0066e9.f225k.f171i, c0066e9.f225k.f165c.f171i, -i4, i);
                                } else {
                                    f5 += c0066e9.ag;
                                    i4 = 0;
                                    if (c0066e9.f225k.f165c != null) {
                                        i4 = c0066e9.f225k.m81b();
                                        if (c0066e9 != this.ax[3]) {
                                            i4 += c0066e9.f225k.f165c.f163a.f223i.m81b();
                                        }
                                    }
                                    c0078e.m163a(c0066e9.f225k.f171i, c0066e9.f223i.f171i, 0, 1);
                                    c0078e.m166b(c0066e9.f225k.f171i, c0066e9.f225k.f165c.f171i, -i4, 1);
                                }
                                r3 = c0066e9;
                                c0066e9 = c0066e9.ai;
                            }
                            if (a == 1) {
                                c0066e9 = this.as[0];
                                i4 = c0066e9.f223i.m81b();
                                if (c0066e9.f223i.f165c != null) {
                                    i4 += c0066e9.f223i.f165c.m81b();
                                }
                                i = c0066e9.f225k.m81b();
                                if (c0066e9.f225k.f165c != null) {
                                    i += c0066e9.f225k.f165c.m81b();
                                }
                                r4 = c0066e2.f225k.f165c.f171i;
                                if (c0066e9 == this.ax[3]) {
                                    r4 = this.ax[1].f225k.f165c.f171i;
                                }
                                if (c0066e9.f217c == 1) {
                                    c0078e.m163a(c0066e2.f223i.f171i, c0066e2.f223i.f165c.f171i, i4, 1);
                                    c0078e.m166b(c0066e2.f225k.f171i, r4, -i, 1);
                                    c0078e.m167c(c0066e2.f225k.f171i, c0066e2.f223i.f171i, c0066e2.m97c(), 2);
                                } else {
                                    c0078e.m167c(c0066e9.f223i.f171i, c0066e9.f223i.f165c.f171i, i4, 1);
                                    c0078e.m167c(c0066e9.f225k.f171i, r4, -i, 1);
                                }
                            } else {
                                for (int i8 = 0; i8 < a - 1; i8++) {
                                    C0066e c0066e10 = this.as[i8];
                                    r13 = this.as[i8 + 1];
                                    C0081h c0081h3 = c0066e10.f223i.f171i;
                                    C0081h c0081h4 = c0066e10.f225k.f171i;
                                    C0081h c0081h5 = r13.f223i.f171i;
                                    C0081h c0081h6 = r13.f225k.f171i;
                                    if (r13 == this.ax[3]) {
                                        c0081h6 = this.ax[1].f225k.f171i;
                                    }
                                    i4 = c0066e10.f223i.m81b();
                                    if (!(c0066e10.f223i.f165c == null || c0066e10.f223i.f165c.f163a.f225k.f165c == null || c0066e10.f223i.f165c.f163a.f225k.f165c.f163a != c0066e10)) {
                                        i4 += c0066e10.f223i.f165c.f163a.f225k.m81b();
                                    }
                                    c0078e.m163a(c0081h3, c0066e10.f223i.f165c.f171i, i4, 2);
                                    i = c0066e10.f225k.m81b();
                                    if (c0066e10.f225k.f165c == null || c0066e10.ai == null) {
                                        i4 = i;
                                    } else {
                                        i4 = (c0066e10.ai.f223i.f165c != null ? c0066e10.ai.f223i.m81b() : 0) + i;
                                    }
                                    c0078e.m166b(c0081h4, c0066e10.f225k.f165c.f171i, -i4, 2);
                                    if (i8 + 1 == a - 1) {
                                        i4 = r13.f223i.m81b();
                                        if (!(r13.f223i.f165c == null || r13.f223i.f165c.f163a.f225k.f165c == null || r13.f223i.f165c.f163a.f225k.f165c.f163a != r13)) {
                                            i4 += r13.f223i.f165c.f163a.f225k.m81b();
                                        }
                                        c0078e.m163a(c0081h5, r13.f223i.f165c.f171i, i4, 2);
                                        r2 = r13.f225k;
                                        if (r13 == this.ax[3]) {
                                            r2 = this.ax[1].f225k;
                                        }
                                        i = r2.m81b();
                                        if (!(r2.f165c == null || r2.f165c.f163a.f223i.f165c == null || r2.f165c.f163a.f223i.f165c.f163a != r13)) {
                                            i += r2.f165c.f163a.f223i.m81b();
                                        }
                                        c0078e.m166b(c0081h6, r2.f165c.f171i, -i, 2);
                                    }
                                    if (c0066e2.f220f > 0) {
                                        c0078e.m166b(c0081h4, c0081h3, c0066e2.f220f, 2);
                                    }
                                    C0075b b2 = c0078e.m165b();
                                    b2.m138a(c0066e10.ag, f5, r13.ag, c0081h3, c0066e10.f223i.m81b(), c0081h4, c0066e10.f225k.m81b(), c0081h5, r13.f223i.m81b(), c0081h6, r13.f225k.m81b());
                                    c0078e.m159a(b2);
                                }
                            }
                        }
                    }
                }
            }
        }
        if (this.ar > 0) {
            m122c(c0078e);
        }
        return true;
    }

    private final void m122c(C0078e c0078e) {
        for (int i = 0; i < this.ar; i++) {
            C0066e c0066e = this.at[i];
            int a = m118a(c0078e, this.ax, this.at[i], 1, this.aw);
            C0066e c0066e2 = this.ax[2];
            if (c0066e2 != null) {
                int h;
                if (this.aw[1]) {
                    h = c0066e.m105h();
                    while (c0066e2 != null) {
                        c0078e.m161a(c0066e2.f224j.f171i, h);
                        h += (c0066e2.f224j.m81b() + c0066e2.m103f()) + c0066e2.f226l.m81b();
                        c0066e2 = c0066e2.aj;
                    }
                } else {
                    Object obj = c0066e.ad == 0 ? 1 : null;
                    Object obj2 = c0066e.ad == 2 ? 1 : null;
                    Object obj3 = this.N == C0067f.WRAP_CONTENT ? 1 : null;
                    int i2;
                    C0066e c0066e3;
                    C0066e c0066e4;
                    C0066e c0066e5;
                    if ((this.av == 2 || this.av == 8) && this.aw[0] && c0066e.af && obj2 == null && obj3 == null && c0066e.ad == 0) {
                        int i3;
                        float f;
                        i2 = 0;
                        h = 0;
                        float f2 = 0.0f;
                        c0066e3 = null;
                        c0066e4 = c0066e;
                        while (c0066e4 != null) {
                            if ((c0066e4.f204P == 8 ? 1 : null) == null) {
                                i3 = h + 1;
                                if (c0066e4.f202N != C0067f.MATCH_CONSTRAINT) {
                                    i2 = (c0066e4.f226l.f165c != null ? c0066e4.f226l.m81b() : 0) + ((i2 + c0066e4.m103f()) + (c0066e4.f224j.f165c != null ? c0066e4.f224j.m81b() : 0));
                                } else {
                                    f2 = c0066e4.ah + f2;
                                }
                            } else {
                                i3 = h;
                            }
                            c0066e5 = c0066e4.f226l.f165c != null ? c0066e4.f226l.f165c.f163a : null;
                            if (c0066e5 != null && (c0066e5.f224j.f165c == null || !(c0066e5.f224j.f165c == null || c0066e5.f224j.f165c.f163a == c0066e4))) {
                                c0066e5 = null;
                            }
                            c0066e3 = c0066e4;
                            c0066e4 = c0066e5;
                            h = i3;
                        }
                        i3 = 0;
                        if (c0066e3 != null) {
                            if (c0066e3.f226l.f165c != null) {
                                i3 = c0066e3.f226l.f165c.f163a.f237w;
                            } else {
                                i3 = 0;
                            }
                            if (c0066e3.f226l.f165c != null && c0066e3.f226l.f165c.f163a == this) {
                                i3 = m107j();
                            }
                        }
                        float f3 = ((float) (i3 + 0)) - ((float) i2);
                        float f4 = f3 / ((float) (h + 1));
                        if (a == 0) {
                            f = f4;
                            c0066e4 = c0066e;
                        } else {
                            f = f3 / ((float) a);
                            c0066e4 = c0066e;
                            f4 = 0.0f;
                        }
                        while (c0066e4 != null) {
                            float f5;
                            h = c0066e4.f224j.f165c != null ? c0066e4.f224j.m81b() : 0;
                            i3 = c0066e4.f226l.f165c != null ? c0066e4.f226l.m81b() : 0;
                            if (c0066e4.f204P != 8) {
                                f4 += (float) h;
                                c0078e.m161a(c0066e4.f224j.f171i, (int) (0.5f + f4));
                                if (c0066e4.f202N != C0067f.MATCH_CONSTRAINT) {
                                    f5 = ((float) c0066e4.m103f()) + f4;
                                } else if (f2 == 0.0f) {
                                    f5 = ((f - ((float) h)) - ((float) i3)) + f4;
                                } else {
                                    f5 = ((((c0066e4.ah * f3) / f2) - ((float) h)) - ((float) i3)) + f4;
                                }
                                c0078e.m161a(c0066e4.f226l.f171i, (int) (0.5f + f5));
                                if (a == 0) {
                                    f5 += f;
                                }
                                f5 += (float) i3;
                            } else {
                                f5 = f4 - (f / 2.0f);
                                c0078e.m161a(c0066e4.f224j.f171i, (int) (0.5f + f5));
                                c0078e.m161a(c0066e4.f226l.f171i, (int) (f5 + 0.5f));
                                f5 = f4;
                            }
                            C0066e c0066e6 = c0066e4.f226l.f165c != null ? c0066e4.f226l.f165c.f163a : null;
                            if (!(c0066e6 == null || c0066e6.f224j.f165c == null || c0066e6.f224j.f165c.f163a == c0066e4)) {
                                c0066e6 = null;
                            }
                            if (c0066e6 == this) {
                                c0066e6 = null;
                            }
                            f4 = f5;
                            c0066e4 = c0066e6;
                        }
                    } else if (a == 0 || obj2 != null) {
                        C0062a c0062a;
                        int b;
                        C0081h c0081h;
                        c0066e3 = null;
                        obj3 = null;
                        c0066e4 = null;
                        C0066e c0066e7 = c0066e2;
                        while (c0066e7 != null) {
                            Object obj4;
                            C0066e c0066e8;
                            r3 = c0066e7.aj;
                            if (r3 == null) {
                                obj4 = 1;
                                c0066e8 = this.ax[1];
                            } else {
                                obj4 = obj3;
                                c0066e8 = c0066e3;
                            }
                            if (obj2 != null) {
                                c0062a = c0066e7.f224j;
                                int b2 = c0062a.m81b();
                                if (c0066e4 != null) {
                                    b2 += c0066e4.f226l.m81b();
                                }
                                h = 1;
                                if (c0066e2 != c0066e7) {
                                    h = 3;
                                }
                                C0081h c0081h2 = null;
                                r4 = null;
                                if (c0062a.f165c != null) {
                                    c0081h2 = c0062a.f171i;
                                    r4 = c0062a.f165c.f171i;
                                } else if (c0066e7.f227m.f165c != null) {
                                    c0081h2 = c0066e7.f227m.f171i;
                                    r4 = c0066e7.f227m.f165c.f171i;
                                    b2 -= c0062a.m81b();
                                }
                                if (!(c0081h2 == null || r4 == null)) {
                                    c0078e.m163a(c0081h2, r4, b2, h);
                                }
                                if (c0066e7.f202N == C0067f.MATCH_CONSTRAINT) {
                                    r2 = c0066e7.f226l;
                                    if (c0066e7.f218d == 1) {
                                        c0078e.m167c(r2.f171i, c0062a.f171i, Math.max(c0066e7.f221g, c0066e7.m103f()), 3);
                                        c0066e5 = r3;
                                    } else {
                                        c0078e.m163a(c0062a.f171i, c0062a.f165c.f171i, c0062a.f166d, 3);
                                        c0078e.m166b(r2.f171i, c0062a.f171i, c0066e7.f221g, 3);
                                    }
                                }
                                c0066e5 = r3;
                            } else if (obj != null || obj4 == null || c0066e4 == null) {
                                if (obj != null || obj4 != null || c0066e4 != null) {
                                    C0062a c0062a2 = c0066e7.f224j;
                                    c0062a = c0066e7.f226l;
                                    i2 = c0062a2.m81b();
                                    b = c0062a.m81b();
                                    c0078e.m163a(c0062a2.f171i, c0062a2.f165c.f171i, i2, 1);
                                    c0078e.m166b(c0062a.f171i, c0062a.f165c.f171i, -b, 1);
                                    r4 = c0062a2.f165c != null ? c0062a2.f165c.f171i : null;
                                    if (c0066e4 == null) {
                                        r4 = c0066e.f224j.f165c != null ? c0066e.f224j.f165c.f171i : null;
                                    }
                                    if (r3 == null) {
                                        r13 = c0066e8.f226l.f165c != null ? c0066e8.f226l.f165c.f163a : null;
                                    } else {
                                        r13 = r3;
                                    }
                                    if (r13 != null) {
                                        c0081h = r13.f224j.f171i;
                                        if (obj4 != null) {
                                            c0081h = c0066e8.f226l.f165c != null ? c0066e8.f226l.f165c.f171i : null;
                                        }
                                        if (!(r4 == null || c0081h == null)) {
                                            c0078e.m162a(c0062a2.f171i, r4, i2, 0.5f, c0081h, c0062a.f171i, b);
                                        }
                                    }
                                    c0066e5 = r13;
                                } else if (c0066e7.f224j.f165c == null) {
                                    c0078e.m161a(c0066e7.f224j.f171i, c0066e7.m105h());
                                    c0066e5 = r3;
                                } else {
                                    c0078e.m167c(c0066e7.f224j.f171i, c0066e.f224j.f165c.f171i, c0066e7.f224j.m81b(), 5);
                                    c0066e5 = r3;
                                }
                            } else if (c0066e7.f226l.f165c == null) {
                                c0078e.m161a(c0066e7.f226l.f171i, c0066e7.m105h() + c0066e7.f191B);
                                c0066e5 = r3;
                            } else {
                                c0078e.m167c(c0066e7.f226l.f171i, c0066e8.f226l.f165c.f171i, -c0066e7.f226l.m81b(), 5);
                                c0066e5 = r3;
                            }
                            if (obj4 != null) {
                                c0066e5 = null;
                            }
                            c0066e3 = c0066e8;
                            c0066e4 = c0066e7;
                            c0066e7 = c0066e5;
                            obj3 = obj4;
                        }
                        if (obj2 != null) {
                            r2 = c0066e2.f224j;
                            c0062a = c0066e3.f226l;
                            i2 = r2.m81b();
                            b = c0062a.m81b();
                            r4 = c0066e.f224j.f165c != null ? c0066e.f224j.f165c.f171i : null;
                            c0081h = c0066e3.f226l.f165c != null ? c0066e3.f226l.f165c.f171i : null;
                            if (!(r4 == null || c0081h == null)) {
                                c0078e.m166b(c0062a.f171i, c0081h, -b, 1);
                                c0078e.m162a(r2.f171i, r4, i2, c0066e.f200L, c0081h, c0062a.f171i, b);
                            }
                        }
                    } else {
                        int i4;
                        float f6 = 0.0f;
                        r3 = null;
                        C0066e c0066e9 = c0066e2;
                        while (c0066e9 != null) {
                            if (c0066e9.f202N != C0067f.MATCH_CONSTRAINT) {
                                h = c0066e9.f224j.m81b();
                                if (r3 != null) {
                                    h += r3.f226l.m81b();
                                }
                                i4 = 3;
                                if (c0066e9.f224j.f165c.f163a.f202N == C0067f.MATCH_CONSTRAINT) {
                                    i4 = 2;
                                }
                                c0078e.m163a(c0066e9.f224j.f171i, c0066e9.f224j.f165c.f171i, h, i4);
                                h = c0066e9.f226l.m81b();
                                if (c0066e9.f226l.f165c.f163a.f224j.f165c != null && c0066e9.f226l.f165c.f163a.f224j.f165c.f163a == c0066e9) {
                                    h += c0066e9.f226l.f165c.f163a.f224j.m81b();
                                }
                                i4 = 3;
                                if (c0066e9.f226l.f165c.f163a.f202N == C0067f.MATCH_CONSTRAINT) {
                                    i4 = 2;
                                }
                                c0078e.m166b(c0066e9.f226l.f171i, c0066e9.f226l.f165c.f171i, -h, i4);
                            } else {
                                f6 += c0066e9.ah;
                                h = 0;
                                if (c0066e9.f226l.f165c != null) {
                                    h = c0066e9.f226l.m81b();
                                    if (c0066e9 != this.ax[3]) {
                                        h += c0066e9.f226l.f165c.f163a.f224j.m81b();
                                    }
                                }
                                c0078e.m163a(c0066e9.f226l.f171i, c0066e9.f224j.f171i, 0, 1);
                                c0078e.m166b(c0066e9.f226l.f171i, c0066e9.f226l.f165c.f171i, -h, 1);
                            }
                            r3 = c0066e9;
                            c0066e9 = c0066e9.aj;
                        }
                        if (a == 1) {
                            c0066e9 = this.as[0];
                            h = c0066e9.f224j.m81b();
                            if (c0066e9.f224j.f165c != null) {
                                h += c0066e9.f224j.f165c.m81b();
                            }
                            i4 = c0066e9.f226l.m81b();
                            if (c0066e9.f226l.f165c != null) {
                                i4 += c0066e9.f226l.f165c.m81b();
                            }
                            r4 = c0066e.f226l.f165c.f171i;
                            if (c0066e9 == this.ax[3]) {
                                r4 = this.ax[1].f226l.f165c.f171i;
                            }
                            if (c0066e9.f218d == 1) {
                                c0078e.m163a(c0066e.f224j.f171i, c0066e.f224j.f165c.f171i, h, 1);
                                c0078e.m166b(c0066e.f226l.f171i, r4, -i4, 1);
                                c0078e.m167c(c0066e.f226l.f171i, c0066e.f224j.f171i, c0066e.m103f(), 2);
                            } else {
                                c0078e.m167c(c0066e9.f224j.f171i, c0066e9.f224j.f165c.f171i, h, 1);
                                c0078e.m167c(c0066e9.f226l.f171i, r4, -i4, 1);
                            }
                        } else {
                            for (int i5 = 0; i5 < a - 1; i5++) {
                                C0066e c0066e10 = this.as[i5];
                                r13 = this.as[i5 + 1];
                                C0081h c0081h3 = c0066e10.f224j.f171i;
                                C0081h c0081h4 = c0066e10.f226l.f171i;
                                C0081h c0081h5 = r13.f224j.f171i;
                                C0081h c0081h6 = r13.f226l.f171i;
                                if (r13 == this.ax[3]) {
                                    c0081h6 = this.ax[1].f226l.f171i;
                                }
                                h = c0066e10.f224j.m81b();
                                if (!(c0066e10.f224j.f165c == null || c0066e10.f224j.f165c.f163a.f226l.f165c == null || c0066e10.f224j.f165c.f163a.f226l.f165c.f163a != c0066e10)) {
                                    h += c0066e10.f224j.f165c.f163a.f226l.m81b();
                                }
                                c0078e.m163a(c0081h3, c0066e10.f224j.f165c.f171i, h, 2);
                                i4 = c0066e10.f226l.m81b();
                                if (c0066e10.f226l.f165c == null || c0066e10.aj == null) {
                                    h = i4;
                                } else {
                                    h = (c0066e10.aj.f224j.f165c != null ? c0066e10.aj.f224j.m81b() : 0) + i4;
                                }
                                c0078e.m166b(c0081h4, c0066e10.f226l.f165c.f171i, -h, 2);
                                if (i5 + 1 == a - 1) {
                                    h = r13.f224j.m81b();
                                    if (!(r13.f224j.f165c == null || r13.f224j.f165c.f163a.f226l.f165c == null || r13.f224j.f165c.f163a.f226l.f165c.f163a != r13)) {
                                        h += r13.f224j.f165c.f163a.f226l.m81b();
                                    }
                                    c0078e.m163a(c0081h5, r13.f224j.f165c.f171i, h, 2);
                                    r2 = r13.f226l;
                                    if (r13 == this.ax[3]) {
                                        r2 = this.ax[1].f226l;
                                    }
                                    i4 = r2.m81b();
                                    if (!(r2.f165c == null || r2.f165c.f163a.f224j.f165c == null || r2.f165c.f163a.f224j.f165c.f163a != r13)) {
                                        i4 += r2.f165c.f163a.f224j.m81b();
                                    }
                                    c0078e.m166b(c0081h6, r2.f165c.f171i, -i4, 2);
                                }
                                if (c0066e.f222h > 0) {
                                    c0078e.m166b(c0081h4, c0081h3, c0066e.f222h, 2);
                                }
                                C0075b b3 = c0078e.m165b();
                                b3.m138a(c0066e10.ah, f6, r13.ah, c0081h3, c0066e10.f224j.m81b(), c0081h4, c0066e10.f226l.m81b(), c0081h5, r13.f224j.m81b(), c0081h6, r13.f226l.m81b());
                                c0078e.m159a(b3);
                            }
                        }
                    }
                }
            }
        }
    }

    public final void mo42o() {
        int size;
        int i;
        int size2;
        int i2;
        int i3;
        int i4;
        int i5;
        C0066e c0066e;
        int max;
        boolean z;
        boolean z2;
        C0078e c0078e;
        boolean[] zArr;
        C0072j c0072j;
        C0066e c0066e2;
        C0069g c0069g;
        C0066e c0066e3;
        int i6 = this.w;
        int i7 = this.x;
        int max2 = Math.max(0, m97c());
        int max3 = Math.max(0, m103f());
        this.ay = false;
        this.az = false;
        if (this.r != null) {
            if (this.al == null) {
                this.al = new C0072j(this);
            }
            C0072j c0072j2 = this.al;
            c0072j2.f248a = this.f237w;
            c0072j2.f249b = this.f238x;
            c0072j2.f250c = m97c();
            c0072j2.f251d = m103f();
            size = c0072j2.f252e.size();
            for (i = 0; i < size; i++) {
                C0073k c0073k = (C0073k) c0072j2.f252e.get(i);
                c0073k.f253a = mo43a(c0073k.f253a.f164b);
                if (c0073k.f253a != null) {
                    c0073k.f254b = c0073k.f253a.f165c;
                    c0073k.f255c = c0073k.f253a.m81b();
                    c0073k.f256d = c0073k.f253a.f168f;
                    c0073k.f257e = c0073k.f253a.f170h;
                } else {
                    c0073k.f254b = null;
                    c0073k.f255c = 0;
                    c0073k.f256d = C0064c.STRONG;
                    c0073k.f257e = 0;
                }
            }
            this.f237w = this.am;
            this.f238x = this.an;
            size2 = this.f231q.size();
            for (i = 0; i < size2; i++) {
                ((C0062a) this.f231q.get(i)).m82c();
            }
            mo40a(this.ak.f288l);
        } else {
            this.w = 0;
            this.x = 0;
        }
        boolean z3 = false;
        C0067f c0067f = this.N;
        C0067f c0067f2 = this.M;
        if (this.av == 2 && (this.N == C0067f.WRAP_CONTENT || this.M == C0067f.WRAP_CONTENT)) {
            ArrayList arrayList = this.aA;
            boolean[] zArr2 = this.aw;
            i2 = 0;
            int i8 = 0;
            i3 = 0;
            int i9 = 0;
            i4 = 0;
            size = 0;
            int size3 = arrayList.size();
            zArr2[0] = true;
            i5 = 0;
            while (i5 < size3) {
                c0066e = (C0066e) arrayList.get(i5);
                if (!c0066e.m96b()) {
                    if (!c0066e.aa) {
                        m119a(c0066e, zArr2);
                    }
                    if (!c0066e.ab) {
                        m120b(c0066e, zArr2);
                    }
                    if (!zArr2[0]) {
                        break;
                    }
                    i = (c0066e.f208T + c0066e.f209U) - c0066e.m97c();
                    size2 = (c0066e.f207S + c0066e.f210V) - c0066e.m103f();
                    if (c0066e.f201M == C0067f.MATCH_PARENT) {
                        i = (c0066e.m97c() + c0066e.f223i.f166d) + c0066e.f225k.f166d;
                    }
                    if (c0066e.f202N == C0067f.MATCH_PARENT) {
                        size2 = (c0066e.m103f() + c0066e.f224j.f166d) + c0066e.f226l.f166d;
                    }
                    if (c0066e.f204P == 8) {
                        i = 0;
                        size2 = 0;
                    }
                    i8 = Math.max(i8, c0066e.f208T);
                    i3 = Math.max(i3, c0066e.f209U);
                    i9 = Math.max(i9, c0066e.f210V);
                    i2 = Math.max(i2, c0066e.f207S);
                    i = Math.max(i4, i);
                    max = Math.max(size, size2);
                    size2 = i9;
                    size = i3;
                    i4 = i8;
                    i9 = i2;
                } else {
                    max = size;
                    i = i4;
                    size2 = i9;
                    size = i3;
                    i4 = i8;
                    i9 = i2;
                }
                i5++;
                i8 = i4;
                i2 = i9;
                i9 = size2;
                i3 = size;
                i4 = i;
                size = max;
            }
            this.f246H = Math.max(this.F, Math.max(Math.max(i8, i3), i4));
            this.f247I = Math.max(this.G, Math.max(Math.max(i2, i9), size));
            for (i = 0; i < size3; i++) {
                c0066e = (C0066e) arrayList.get(i);
                c0066e.aa = false;
                c0066e.ab = false;
                c0066e.f211W = false;
                c0066e.f212X = false;
                c0066e.f213Y = false;
                c0066e.f214Z = false;
            }
            z3 = this.aw[0];
            if (max2 > 0 && max3 > 0 && (this.f246H > max2 || this.f247I > max3)) {
                z3 = false;
            }
            if (z3) {
                if (this.M == C0067f.WRAP_CONTENT) {
                    this.M = C0067f.FIXED;
                    if (max2 <= 0 || max2 >= this.f246H) {
                        m87a(Math.max(this.F, this.f246H));
                    } else {
                        this.ay = true;
                        m87a(max2);
                    }
                }
                if (this.N == C0067f.WRAP_CONTENT) {
                    this.N = C0067f.FIXED;
                    if (max3 <= 0 || max3 >= this.f247I) {
                        m93b(Math.max(this.G, this.f247I));
                    } else {
                        this.az = true;
                        m93b(max3);
                        z = z3;
                        this.aq = 0;
                        this.ar = 0;
                        i3 = this.aA.size();
                        for (size2 = 0; size2 < i3; size2++) {
                            c0066e = (C0066e) this.aA.get(size2);
                            if (c0066e instanceof C0068l) {
                                ((C0068l) c0066e).mo42o();
                            }
                        }
                        max = 0;
                        z2 = z;
                        z = true;
                        while (z) {
                            size2 = max + 1;
                            try {
                                this.ak.m158a();
                                z = m121b(this.ak);
                                if (z) {
                                    c0078e = this.ak;
                                    C0077d c0077d = c0078e.f280d;
                                    c0077d.m149a(c0078e);
                                    c0078e.m164b(c0077d);
                                    c0078e.m156a(c0077d);
                                    for (max = 0; max < c0078e.f286j; max++) {
                                        C0075b c0075b = c0078e.f283g[max];
                                        c0075b.f269a.f298e = c0075b.f270b;
                                    }
                                }
                            } catch (Throwable e) {
                                a.a.a(e);
                            }
                            if (z) {
                                mo46n();
                                while (i < i3) {
                                    c0066e = (C0066e) this.aA.get(i);
                                    if (c0066e.f201M == C0067f.MATCH_CONSTRAINT || c0066e.m97c() >= c0066e.f197H) {
                                        if (c0066e.f202N != C0067f.MATCH_CONSTRAINT && c0066e.m103f() < c0066e.f198I) {
                                            this.aw[2] = true;
                                            break;
                                        }
                                    } else {
                                        this.aw[2] = true;
                                        break;
                                    }
                                }
                            }
                            zArr = this.aw;
                            zArr[2] = false;
                            mo46n();
                            i4 = this.aA.size();
                            for (i = 0; i < i4; i++) {
                                c0066e = (C0066e) this.aA.get(i);
                                c0066e.mo46n();
                                if (c0066e.f201M == C0067f.MATCH_CONSTRAINT && c0066e.m97c() < c0066e.f197H) {
                                    zArr[2] = true;
                                }
                                if (c0066e.f202N == C0067f.MATCH_CONSTRAINT && c0066e.m103f() < c0066e.f198I) {
                                    zArr[2] = true;
                                }
                            }
                            if (size2 < 8 || !this.aw[2]) {
                                z3 = false;
                                z = z2;
                            } else {
                                i9 = 0;
                                i4 = 0;
                                for (size = 0; size < i3; size++) {
                                    c0066e = (C0066e) this.aA.get(size);
                                    i9 = Math.max(i9, c0066e.f237w + c0066e.m97c());
                                    i4 = Math.max(i4, c0066e.m103f() + c0066e.f238x);
                                }
                                max = Math.max(this.F, i9);
                                size = Math.max(this.G, i4);
                                if (c0067f2 != C0067f.WRAP_CONTENT || m97c() >= max) {
                                    z3 = false;
                                    z = z2;
                                } else {
                                    m87a(max);
                                    this.M = C0067f.WRAP_CONTENT;
                                    z = true;
                                    z3 = true;
                                }
                                if (c0067f == C0067f.WRAP_CONTENT && m103f() < size) {
                                    m93b(size);
                                    this.N = C0067f.WRAP_CONTENT;
                                    z = true;
                                    z3 = true;
                                }
                            }
                            size = Math.max(this.F, m97c());
                            if (size > m97c()) {
                                m87a(size);
                                this.M = C0067f.FIXED;
                                z = true;
                                z3 = true;
                            }
                            size = Math.max(this.G, m103f());
                            if (size > m103f()) {
                                m93b(size);
                                this.N = C0067f.FIXED;
                                z = true;
                                z3 = true;
                            }
                            if (z) {
                                if (this.M == C0067f.WRAP_CONTENT && max2 > 0 && m97c() > max2) {
                                    this.ay = true;
                                    z = true;
                                    this.M = C0067f.FIXED;
                                    m87a(max2);
                                    z3 = true;
                                }
                                if (this.N == C0067f.WRAP_CONTENT && max3 > 0 && m103f() > max3) {
                                    this.az = true;
                                    z = true;
                                    this.N = C0067f.FIXED;
                                    m93b(max3);
                                    z3 = true;
                                }
                            }
                            z2 = z;
                            z = z3;
                            max = size2;
                        }
                        if (this.r == null) {
                            i5 = Math.max(this.F, m97c());
                            i6 = Math.max(this.G, m103f());
                            c0072j = this.al;
                            this.f237w = c0072j.f248a;
                            this.f238x = c0072j.f249b;
                            m87a(c0072j.f250c);
                            m93b(c0072j.f251d);
                            max2 = c0072j.f252e.size();
                            for (i2 = 0; i2 < max2; i2++) {
                                C0073k c0073k2 = (C0073k) c0072j.f252e.get(i2);
                                mo43a(c0073k2.f253a.f164b).m80a(c0073k2.f254b, c0073k2.f255c, -1, c0073k2.f256d, c0073k2.f257e, false);
                            }
                            m87a((this.am + i5) + this.ao);
                            m93b((this.an + i6) + this.ap);
                        } else {
                            this.w = i6;
                            this.x = i7;
                        }
                        if (z2) {
                            this.M = c0067f2;
                            this.N = c0067f;
                        }
                        mo40a(this.ak.f288l);
                        c0066e2 = this.f232r;
                        if (this instanceof C0069g) {
                            c0066e = c0066e2;
                            c0069g = null;
                        } else {
                            c0066e = c0066e2;
                            c0069g = this;
                        }
                        while (c0066e != null) {
                            c0066e3 = c0066e.f232r;
                            if (c0066e instanceof C0069g) {
                                c0066e = c0066e3;
                            } else {
                                c0069g = (C0069g) c0066e;
                                c0066e = c0066e3;
                            }
                        }
                        if (this == c0069g) {
                            mo41m();
                        }
                    }
                }
            }
        }
        z = z3;
        this.aq = 0;
        this.ar = 0;
        i3 = this.aA.size();
        for (size2 = 0; size2 < i3; size2++) {
            c0066e = (C0066e) this.aA.get(size2);
            if (c0066e instanceof C0068l) {
                ((C0068l) c0066e).mo42o();
            }
        }
        max = 0;
        z2 = z;
        z = true;
        while (z) {
            size2 = max + 1;
            this.ak.m158a();
            z = m121b(this.ak);
            if (z) {
                c0078e = this.ak;
                C0077d c0077d2 = c0078e.f280d;
                c0077d2.m149a(c0078e);
                c0078e.m164b(c0077d2);
                c0078e.m156a(c0077d2);
                for (max = 0; max < c0078e.f286j; max++) {
                    C0075b c0075b2 = c0078e.f283g[max];
                    c0075b2.f269a.f298e = c0075b2.f270b;
                }
            }
            if (z) {
                mo46n();
                for (i = 0; i < i3; i++) {
                    c0066e = (C0066e) this.aA.get(i);
                    if (c0066e.f201M == C0067f.MATCH_CONSTRAINT) {
                    }
                    if (c0066e.f202N != C0067f.MATCH_CONSTRAINT) {
                    }
                }
            } else {
                zArr = this.aw;
                zArr[2] = false;
                mo46n();
                i4 = this.aA.size();
                for (i = 0; i < i4; i++) {
                    c0066e = (C0066e) this.aA.get(i);
                    c0066e.mo46n();
                    zArr[2] = true;
                    zArr[2] = true;
                }
            }
            if (size2 < 8) {
            }
            z3 = false;
            z = z2;
            size = Math.max(this.F, m97c());
            if (size > m97c()) {
                m87a(size);
                this.M = C0067f.FIXED;
                z = true;
                z3 = true;
            }
            size = Math.max(this.G, m103f());
            if (size > m103f()) {
                m93b(size);
                this.N = C0067f.FIXED;
                z = true;
                z3 = true;
            }
            if (z) {
                this.ay = true;
                z = true;
                this.M = C0067f.FIXED;
                m87a(max2);
                z3 = true;
                this.az = true;
                z = true;
                this.N = C0067f.FIXED;
                m93b(max3);
                z3 = true;
            }
            z2 = z;
            z = z3;
            max = size2;
        }
        if (this.r == null) {
            this.w = i6;
            this.x = i7;
        } else {
            i5 = Math.max(this.F, m97c());
            i6 = Math.max(this.G, m103f());
            c0072j = this.al;
            this.f237w = c0072j.f248a;
            this.f238x = c0072j.f249b;
            m87a(c0072j.f250c);
            m93b(c0072j.f251d);
            max2 = c0072j.f252e.size();
            for (i2 = 0; i2 < max2; i2++) {
                C0073k c0073k22 = (C0073k) c0072j.f252e.get(i2);
                mo43a(c0073k22.f253a.f164b).m80a(c0073k22.f254b, c0073k22.f255c, -1, c0073k22.f256d, c0073k22.f257e, false);
            }
            m87a((this.am + i5) + this.ao);
            m93b((this.an + i6) + this.ap);
        }
        if (z2) {
            this.M = c0067f2;
            this.N = c0067f;
        }
        mo40a(this.ak.f288l);
        c0066e2 = this.f232r;
        if (this instanceof C0069g) {
            c0066e = c0066e2;
            c0069g = null;
        } else {
            c0066e = c0066e2;
            c0069g = this;
        }
        while (c0066e != null) {
            c0066e3 = c0066e.f232r;
            if (c0066e instanceof C0069g) {
                c0066e = c0066e3;
            } else {
                c0069g = (C0069g) c0066e;
                c0066e = c0066e3;
            }
        }
        if (this == c0069g) {
            mo41m();
        }
    }

    private final void m119a(C0066e c0066e, boolean[] zArr) {
        C0066e c0066e2 = null;
        boolean z = false;
        if (c0066e.f201M == C0067f.MATCH_CONSTRAINT && c0066e.f202N == C0067f.MATCH_CONSTRAINT && c0066e.f235u > 0.0f) {
            zArr[0] = false;
            return;
        }
        boolean d = c0066e.m100d();
        if (c0066e.f201M != C0067f.MATCH_CONSTRAINT || c0066e.f202N == C0067f.MATCH_CONSTRAINT || c0066e.f235u <= 0.0f) {
            int i;
            int i2;
            c0066e.aa = true;
            boolean z2;
            if (c0066e instanceof C0070h) {
                boolean z3;
                C0070h c0070h = (C0070h) c0066e;
                if (c0070h.ao != 1) {
                    z3 = d;
                    z = d;
                } else if (c0070h.al != -1) {
                    i = c0070h.al;
                    i2 = 0;
                } else if (c0070h.am != -1) {
                    d = c0070h.am;
                    z3 = false;
                    z = d;
                } else {
                    z3 = false;
                }
                d = z3;
                z2 = z;
            } else if (!c0066e.f225k.m83d() && !c0066e.f223i.m83d()) {
                z2 = d;
                i = c0066e.f237w + d;
            } else if (c0066e.f225k.f165c == null || c0066e.f223i.f165c == null || (c0066e.f225k.f165c != c0066e.f223i.f165c && (c0066e.f225k.f165c.f163a != c0066e.f223i.f165c.f163a || c0066e.f225k.f165c.f163a == c0066e.f232r))) {
                C0066e c0066e3;
                if (c0066e.f225k.f165c != null) {
                    c0066e3 = c0066e.f225k.f165c.f163a;
                    i2 = c0066e.f225k.m81b() + d;
                    if (!(c0066e3.m96b() || c0066e3.aa)) {
                        m119a(c0066e3, zArr);
                    }
                } else {
                    c0066e3 = null;
                    i2 = d;
                }
                if (c0066e.f223i.f165c != null) {
                    c0066e2 = c0066e.f223i.f165c.f163a;
                    i = d + c0066e.f223i.m81b();
                    if (!(c0066e2.m96b() || c0066e2.aa)) {
                        m119a(c0066e2, zArr);
                    }
                }
                if (!(c0066e.f225k.f165c == null || c0066e3.m96b())) {
                    boolean z4;
                    if (c0066e.f225k.f165c.f164b == C0065d.RIGHT) {
                        i2 += c0066e3.f209U - c0066e3.m100d();
                    } else if (c0066e.f225k.f165c.f164b == C0065d.LEFT) {
                        i2 += c0066e3.f209U;
                    }
                    if (c0066e3.f212X || !(c0066e3.f223i.f165c == null || c0066e3.f225k.f165c == null || c0066e3.f201M == C0067f.MATCH_CONSTRAINT)) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    c0066e.f212X = z4;
                    if (c0066e.f212X && (c0066e3.f223i.f165c == null || c0066e3.f223i.f165c.f163a != c0066e)) {
                        i2 += i2 - c0066e3.f209U;
                    }
                }
                if (!(c0066e.f223i.f165c == null || c0066e2.m96b())) {
                    if (c0066e.f223i.f165c.f164b == C0065d.LEFT) {
                        i += c0066e2.f208T - c0066e2.m100d();
                    } else if (c0066e.f223i.f165c.f164b == C0065d.RIGHT) {
                        i += c0066e2.f208T;
                    }
                    if (c0066e2.f211W || !(c0066e2.f223i.f165c == null || c0066e2.f225k.f165c == null || c0066e2.f201M == C0067f.MATCH_CONSTRAINT)) {
                        z = true;
                    }
                    c0066e.f211W = z;
                    if (c0066e.f211W && (c0066e2.f225k.f165c == null || c0066e2.f225k.f165c.f163a != c0066e)) {
                        i += i - c0066e2.f208T;
                    }
                }
            } else {
                zArr[0] = false;
                return;
            }
            if (c0066e.f204P == 8) {
                i -= c0066e.f233s;
                i2 -= c0066e.f233s;
            }
            c0066e.f208T = i;
            c0066e.f209U = i2;
            return;
        }
        zArr[0] = false;
    }

    private final void m120b(C0066e c0066e, boolean[] zArr) {
        C0066e c0066e2 = null;
        boolean z = false;
        if (c0066e.f202N != C0067f.MATCH_CONSTRAINT || c0066e.f201M == C0067f.MATCH_CONSTRAINT || c0066e.f235u <= 0.0f) {
            int i;
            int i2;
            boolean e = c0066e.m102e();
            c0066e.ab = true;
            int i3;
            if (c0066e instanceof C0070h) {
                C0070h c0070h = (C0070h) c0066e;
                if (c0070h.ao != 0) {
                    i3 = e;
                    z = e;
                } else if (c0070h.al != -1) {
                    i = c0070h.al;
                    i2 = 0;
                } else {
                    i3 = c0070h.am != -1 ? c0070h.am : 0;
                }
                i2 = i3;
                boolean z2 = z;
            } else if (c0066e.f227m.f165c == null && c0066e.f224j.f165c == null && c0066e.f226l.f165c == null) {
                i = e + c0066e.f238x;
            } else if (c0066e.f226l.f165c != null && c0066e.f224j.f165c != null && (c0066e.f226l.f165c == c0066e.f224j.f165c || (c0066e.f226l.f165c.f163a == c0066e.f224j.f165c.f163a && c0066e.f226l.f165c.f163a != c0066e.f232r))) {
                zArr[0] = false;
                return;
            } else if (c0066e.f227m.m83d()) {
                r0 = c0066e.f227m.f165c.f163a;
                if (!r0.ab) {
                    m120b(r0, zArr);
                }
                int max = Math.max((r0.f207S - r0.f234t) + e, e);
                i3 = Math.max((r0.f210V - r0.f234t) + e, e);
                if (c0066e.f204P == 8) {
                    max -= c0066e.f234t;
                    i3 -= c0066e.f234t;
                }
                c0066e.f207S = max;
                c0066e.f210V = i3;
                return;
            } else {
                if (c0066e.f224j.m83d()) {
                    r0 = c0066e.f224j.f165c.f163a;
                    i = c0066e.f224j.m81b() + e;
                    if (!(r0.m96b() || r0.ab)) {
                        m120b(r0, zArr);
                    }
                } else {
                    r0 = null;
                    i = e;
                }
                if (c0066e.f226l.m83d()) {
                    c0066e2 = c0066e.f226l.f165c.f163a;
                    i2 = e + c0066e.f226l.m81b();
                    if (!(c0066e2.m96b() || c0066e2.ab)) {
                        m120b(c0066e2, zArr);
                    }
                }
                if (!(c0066e.f224j.f165c == null || r0.m96b())) {
                    boolean z3;
                    if (c0066e.f224j.f165c.f164b == C0065d.TOP) {
                        i += r0.f207S - r0.m102e();
                    } else if (c0066e.f224j.f165c.f164b == C0065d.BOTTOM) {
                        i += r0.f207S;
                    }
                    if (r0.f213Y || !(r0.f224j.f165c == null || r0.f224j.f165c.f163a == c0066e || r0.f226l.f165c == null || r0.f226l.f165c.f163a == c0066e || r0.f202N == C0067f.MATCH_CONSTRAINT)) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    c0066e.f213Y = z3;
                    if (c0066e.f213Y && (r0.f226l.f165c == null || r0.f226l.f165c.f163a != c0066e)) {
                        i += i - r0.f207S;
                    }
                }
                if (!(c0066e.f226l.f165c == null || c0066e2.m96b())) {
                    if (c0066e.f226l.f165c.f164b == C0065d.BOTTOM) {
                        i2 += c0066e2.f210V - c0066e2.m102e();
                    } else if (c0066e.f226l.f165c.f164b == C0065d.TOP) {
                        i2 += c0066e2.f210V;
                    }
                    if (c0066e2.f214Z || !(c0066e2.f224j.f165c == null || c0066e2.f224j.f165c.f163a == c0066e || c0066e2.f226l.f165c == null || c0066e2.f226l.f165c.f163a == c0066e || c0066e2.f202N == C0067f.MATCH_CONSTRAINT)) {
                        z = true;
                    }
                    c0066e.f214Z = z;
                    if (c0066e.f214Z && (c0066e2.f224j.f165c == null || c0066e2.f224j.f165c.f163a != c0066e)) {
                        i2 += i2 - c0066e2.f210V;
                    }
                }
            }
            if (c0066e.f204P == 8) {
                i -= c0066e.f234t;
                i2 -= c0066e.f234t;
            }
            c0066e.f207S = i;
            c0066e.f210V = i2;
            return;
        }
        zArr[0] = false;
    }

    final void m124a(C0066e c0066e, int i) {
        int i2 = 0;
        if (i == 0) {
            while (c0066e.f223i.f165c != null && c0066e.f223i.f165c.f163a.f225k.f165c != null && c0066e.f223i.f165c.f163a.f225k.f165c == c0066e.f223i && c0066e.f223i.f165c.f163a != c0066e) {
                c0066e = c0066e.f223i.f165c.f163a;
            }
            while (i2 < this.aq) {
                if (this.au[i2] != c0066e) {
                    i2++;
                } else {
                    return;
                }
            }
            if (this.aq + 1 >= this.au.length) {
                this.au = (C0066e[]) Arrays.copyOf(this.au, this.au.length * 2);
            }
            this.au[this.aq] = c0066e;
            this.aq++;
        } else if (i == 1) {
            while (c0066e.f224j.f165c != null && c0066e.f224j.f165c.f163a.f226l.f165c != null && c0066e.f224j.f165c.f163a.f226l.f165c == c0066e.f224j && c0066e.f224j.f165c.f163a != c0066e) {
                c0066e = c0066e.f224j.f165c.f163a;
            }
            while (i2 < this.ar) {
                if (this.at[i2] != c0066e) {
                    i2++;
                } else {
                    return;
                }
            }
            if (this.ar + 1 >= this.at.length) {
                this.at = (C0066e[]) Arrays.copyOf(this.at, this.at.length * 2);
            }
            this.at[this.ar] = c0066e;
            this.ar++;
        }
    }

    private final int m118a(C0078e c0078e, C0066e[] c0066eArr, C0066e c0066e, int i, boolean[] zArr) {
        int i2;
        zArr[0] = true;
        zArr[1] = false;
        c0066eArr[0] = null;
        c0066eArr[2] = null;
        c0066eArr[1] = null;
        c0066eArr[3] = null;
        boolean z;
        C0066e c0066e2;
        C0066e c0066e3;
        C0066e c0066e4;
        C0066e c0066e5;
        C0066e c0066e6;
        int i3;
        if (i == 0) {
            if (c0066e.f223i.f165c == null || c0066e.f223i.f165c.f163a == this) {
                z = true;
            } else {
                z = false;
            }
            c0066e.ai = null;
            c0066e2 = null;
            if (c0066e.f204P != 8) {
                c0066e2 = c0066e;
            }
            c0066e3 = null;
            i2 = 0;
            c0066e4 = c0066e;
            c0066e5 = c0066e2;
            while (c0066e4.f225k.f165c != null) {
                c0066e4.ai = null;
                if (c0066e4.f204P != 8) {
                    if (c0066e5 == null) {
                        c0066e6 = c0066e4;
                    } else {
                        c0066e6 = c0066e5;
                    }
                    if (!(c0066e2 == null || c0066e2 == c0066e4)) {
                        c0066e2.ai = c0066e4;
                    }
                    c0066e5 = c0066e4;
                } else {
                    c0078e.m167c(c0066e4.f223i.f171i, c0066e4.f223i.f165c.f171i, 0, 5);
                    c0078e.m167c(c0066e4.f225k.f171i, c0066e4.f223i.f171i, 0, 5);
                    c0066e6 = c0066e5;
                    c0066e5 = c0066e2;
                }
                if (c0066e4.f204P != 8 && c0066e4.f201M == C0067f.MATCH_CONSTRAINT) {
                    if (c0066e4.f202N == C0067f.MATCH_CONSTRAINT) {
                        zArr[0] = false;
                    }
                    if (c0066e4.f235u <= 0.0f) {
                        zArr[0] = false;
                        if (i2 + 1 >= this.as.length) {
                            this.as = (C0066e[]) Arrays.copyOf(this.as, this.as.length * 2);
                        }
                        i3 = i2 + 1;
                        this.as[i2] = c0066e4;
                        i2 = i3;
                    }
                }
                if (c0066e4.f225k.f165c.f163a.f223i.f165c == null || c0066e4.f225k.f165c.f163a.f223i.f165c.f163a != c0066e4 || c0066e4.f225k.f165c.f163a == c0066e4) {
                    break;
                }
                c0066e2 = c0066e4.f225k.f165c.f163a;
                c0066e3 = c0066e2;
                c0066e4 = c0066e2;
                c0066e2 = c0066e5;
                c0066e5 = c0066e6;
            }
            c0066e6 = c0066e5;
            c0066e5 = c0066e2;
            if (!(c0066e4.f225k.f165c == null || c0066e4.f225k.f165c.f163a == this)) {
                z = false;
            }
            if (c0066e.f223i.f165c == null || c0066e3.f225k.f165c == null) {
                zArr[1] = true;
            }
            c0066e.ae = z;
            c0066e3.ai = null;
            c0066eArr[0] = c0066e;
            c0066eArr[2] = c0066e6;
            c0066eArr[1] = c0066e3;
            c0066eArr[3] = c0066e5;
        } else {
            if (c0066e.f224j.f165c == null || c0066e.f224j.f165c.f163a == this) {
                z = true;
            } else {
                z = false;
            }
            c0066e.aj = null;
            c0066e2 = null;
            if (c0066e.f204P != 8) {
                c0066e2 = c0066e;
            }
            c0066e3 = null;
            i2 = 0;
            c0066e4 = c0066e;
            c0066e5 = c0066e2;
            while (c0066e4.f226l.f165c != null) {
                c0066e4.aj = null;
                if (c0066e4.f204P != 8) {
                    if (c0066e5 == null) {
                        c0066e6 = c0066e4;
                    } else {
                        c0066e6 = c0066e5;
                    }
                    if (!(c0066e2 == null || c0066e2 == c0066e4)) {
                        c0066e2.aj = c0066e4;
                    }
                    c0066e5 = c0066e4;
                } else {
                    c0078e.m167c(c0066e4.f224j.f171i, c0066e4.f224j.f165c.f171i, 0, 5);
                    c0078e.m167c(c0066e4.f226l.f171i, c0066e4.f224j.f171i, 0, 5);
                    c0066e6 = c0066e5;
                    c0066e5 = c0066e2;
                }
                if (c0066e4.f204P != 8 && c0066e4.f202N == C0067f.MATCH_CONSTRAINT) {
                    if (c0066e4.f201M == C0067f.MATCH_CONSTRAINT) {
                        zArr[0] = false;
                    }
                    if (c0066e4.f235u <= 0.0f) {
                        zArr[0] = false;
                        if (i2 + 1 >= this.as.length) {
                            this.as = (C0066e[]) Arrays.copyOf(this.as, this.as.length * 2);
                        }
                        i3 = i2 + 1;
                        this.as[i2] = c0066e4;
                        i2 = i3;
                    }
                }
                if (c0066e4.f226l.f165c.f163a.f224j.f165c == null || c0066e4.f226l.f165c.f163a.f224j.f165c.f163a != c0066e4 || c0066e4.f226l.f165c.f163a == c0066e4) {
                    break;
                }
                c0066e2 = c0066e4.f226l.f165c.f163a;
                c0066e3 = c0066e2;
                c0066e4 = c0066e2;
                c0066e2 = c0066e5;
                c0066e5 = c0066e6;
            }
            c0066e6 = c0066e5;
            c0066e5 = c0066e2;
            if (!(c0066e4.f226l.f165c == null || c0066e4.f226l.f165c.f163a == this)) {
                z = false;
            }
            if (c0066e.f224j.f165c == null || c0066e3.f226l.f165c == null) {
                zArr[1] = true;
            }
            c0066e.af = z;
            c0066e3.aj = null;
            c0066eArr[0] = c0066e;
            c0066eArr[2] = c0066e6;
            c0066eArr[1] = c0066e3;
            c0066eArr[3] = c0066e5;
        }
        return i2;
    }
}
