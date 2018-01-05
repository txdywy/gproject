package com.google.android.libraries.play.entertainment.story.model;

import android.support.v4.p013b.C0268a;
import android.text.TextUtils;
import com.google.android.libraries.play.entertainment.C2998a;
import com.google.android.libraries.play.entertainment.C6094i;
import com.google.android.libraries.play.entertainment.p346h.C6090b;
import com.google.android.libraries.play.entertainment.p351m.C6116b;
import com.google.wireless.android.finsky.dfe.g.a.aa;
import com.google.wireless.android.finsky.dfe.g.a.ad;
import com.google.wireless.android.finsky.dfe.g.a.ae;
import com.google.wireless.android.finsky.dfe.g.a.af;
import com.google.wireless.android.finsky.dfe.g.a.ai;
import com.google.wireless.android.finsky.dfe.g.a.aj;
import com.google.wireless.android.finsky.dfe.g.a.d;
import com.google.wireless.android.finsky.dfe.g.a.e;
import com.google.wireless.android.finsky.dfe.g.a.h;
import com.google.wireless.android.finsky.dfe.g.a.k;
import com.google.wireless.android.finsky.dfe.g.a.n;
import com.google.wireless.android.finsky.dfe.g.a.o;
import com.google.wireless.android.finsky.dfe.g.a.q;
import com.google.wireless.android.finsky.dfe.g.a.r;
import com.google.wireless.android.finsky.dfe.g.a.t;
import com.google.wireless.android.finsky.dfe.g.a.w;
import com.google.wireless.android.finsky.dfe.g.a.z;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class av {
    public static final C6090b f30525g = C6090b.m28050a();
    public static final aw f30526v = new aw();
    public static final ae f30527w = new ae();
    public static final ai f30528x = new ai();
    public final String f30529h;
    public final String f30530i;
    public final int f30531j;
    public final String f30532k;
    public final int f30533l;
    public final byte[] f30534m;
    public final ai f30535n;
    public final ae f30536o;
    public final int f30537p;
    public final int f30538q;
    public final int f30539r;
    public final int f30540s;
    public final List f30541t;
    public final aa f30542u;

    public static boolean m28352a(String str, r rVar, AtomicInteger atomicInteger, Collection collection) {
        av a = m28348a(str, rVar, atomicInteger, null);
        if (a == null || (a instanceof am)) {
            return false;
        }
        collection.add(a);
        return true;
    }

    private static boolean m28350a(int i) {
        return (i & -16777216) == -16777216;
    }

    static av m28348a(String str, r rVar, AtomicInteger atomicInteger, aa aaVar) {
        if (8 < rVar.y || 8 > rVar.z) {
            f30525g.m28054a("Panel version [%d-%d] incompatible with client's panel version %d", Integer.valueOf(rVar.y), Integer.valueOf(rVar.z), Integer.valueOf(8));
            return null;
        }
        k kVar = rVar.A;
        if (kVar == null) {
            f30525g.m28054a("Panel has no interaction", new Object[0]);
            return null;
        }
        int i;
        int i2;
        ad adVar;
        int i3;
        int b;
        aw awVar;
        String str2;
        aa aaVar2;
        av avVar;
        z g;
        o k;
        q l;
        d o;
        n p;
        t j;
        e eVar;
        h hVar;
        if (kVar.d() != null) {
            i = 0;
        } else if (kVar.e() != null) {
            i = 1;
        } else {
            f30525g.m28054a("No interaction type specified", new Object[0]);
            return null;
        }
        int i4 = -1;
        int i5 = -14273992;
        if (rVar.x != null) {
            if (m28350a(rVar.x.b) && m28350a(rVar.x.c)) {
                i4 = rVar.x.b;
                i5 = rVar.x.c;
            }
            C2998a.m15496l().m15520w();
            if (rVar.x.d != null) {
                ad adVar2 = rVar.x.d;
                Object obj = (adVar2.b < 0.0d || adVar2.b >= adVar2.d || adVar2.d > 1.0d || adVar2.c < 0.0d || adVar2.c >= adVar2.e || adVar2.e > 1.0d) ? null : 1;
                if (obj != null) {
                    i2 = i4;
                    adVar = rVar.x.d;
                    i3 = i5;
                    b = (C0268a.m1542b(i2, i3) << 24) | (16777215 & i2);
                    awVar = f30526v;
                    awVar.f30603a = str;
                    awVar.f30604b = rVar.d;
                    awVar.f30605c = atomicInteger.getAndIncrement();
                    if (rVar.e()) {
                        str2 = rVar.f;
                    } else {
                        str2 = rVar.g;
                    }
                    awVar.f30606d = str2;
                    awVar.f30615m = rVar.w;
                    awVar.f30607e = f30527w;
                    awVar.f30608f = i2;
                    awVar.f30609g = b;
                    awVar.f30610h = i3;
                    awVar.f30611i = adVar;
                    awVar.f30612j = f30528x;
                    awVar.f30613k = 0;
                    awVar.f30614l = i;
                    awVar.f30616n = aaVar;
                    if (rVar.B.length != 0) {
                        awVar.f30617o = Collections.emptyList();
                    } else {
                        awVar.f30617o = Arrays.asList(rVar.B);
                    }
                    if (rVar.f() != null) {
                        aaVar2 = rVar.f().a;
                        if (aaVar2 == null && m28351a(aaVar2.e)) {
                            if (!(C2998a.m15496l().m15520w().mo3255a() && aaVar2.k == 1 && !TextUtils.isEmpty(aaVar2.h))) {
                                if (aaVar2.d == null || TextUtils.isEmpty(aaVar2.d.d)) {
                                    avVar = null;
                                } else {
                                    aaVar2.k = 2;
                                    aaVar2.a |= 64;
                                }
                            }
                            awVar.f30607e = aaVar2.e;
                            awVar.f30612j = aaVar2.d;
                            awVar.f30613k = 2;
                            avVar = new C6147d(awVar, aaVar2);
                        } else {
                            avVar = null;
                        }
                    } else if (rVar.g() != null) {
                        g = rVar.g();
                        if (g.a == null && m28351a(g.a.c)) {
                            ae aeVar = g.a.c;
                            aeVar.a(1920);
                            aeVar.b(1080);
                            awVar.f30607e = aeVar;
                            awVar.f30613k = 8;
                            awVar.f30612j = g.a.b;
                            avVar = new bn(awVar, g.a);
                        } else {
                            avVar = null;
                        }
                    } else if (rVar.i() != null) {
                        avVar = aa.m28357a(awVar, rVar.i(), rVar.x, atomicInteger);
                    } else if (rVar.k() != null) {
                        k = rVar.k();
                        if (m28351a(k.d) || TextUtils.isEmpty(k.b) || k.f.length == 0 || k.g == null) {
                            avVar = null;
                        } else {
                            m28349a(k.b, k.g);
                            awVar.f30607e = k.d;
                            awVar.f30612j = k.g;
                            awVar.f30613k = 6;
                            avVar = new ao(awVar, k.b, k.e, k.b, k.e, k.f, k.i);
                        }
                    } else if (rVar.l() != null) {
                        l = rVar.l();
                        i = l.b.length;
                        if (i == 0 && !TextUtils.isEmpty(l.c) && m28351a(l.d)) {
                            ae aeVar2 = l.b[0].b.e;
                            if (m28351a(aeVar2)) {
                                awVar.f30607e = aeVar2;
                                String str3 = l.b[0].b.c;
                                if (i > 1) {
                                    str3 = C2998a.m15496l().f15705r.getResources().getQuantityString(C6094i.pe_first_song_and_x_more, i - 1, new Object[]{str3, Integer.valueOf(i - 1)});
                                }
                                for (af afVar : l.b) {
                                    m28349a(afVar.b.c, afVar.c);
                                }
                                awVar.f30612j = l.e;
                                awVar.f30613k = 6;
                                avVar = new ao(awVar, str3, l.c, awVar.f30606d, l.c, l.b, l.d);
                            } else {
                                avVar = null;
                            }
                        } else {
                            avVar = null;
                        }
                    } else if (rVar.o() != null) {
                        o = rVar.o();
                        if (m28351a(o.d)) {
                            avVar = null;
                        } else {
                            m28349a(o.b, o.f);
                            awVar.f30607e = o.d;
                            awVar.f30612j = o.f;
                            awVar.f30613k = 3;
                            avVar = new C6165v(awVar, o);
                        }
                    } else if (rVar.p() != null) {
                        if (awVar.f30614l == 0 || rVar.p().g == null || !m28351a(rVar.p().g.c)) {
                            p = rVar.p();
                            if (m28351a(p.d) || p.e == null) {
                                avVar = null;
                            } else {
                                m28349a(p.b, p.e);
                                awVar.f30612j = p.e;
                                awVar.f30613k = 10;
                                awVar.f30607e = p.d;
                                if (awVar.f30616n == null || awVar.f30614l != 0) {
                                    i = 4;
                                } else {
                                    i = 2;
                                }
                                avVar = new am(awVar, p, i);
                            }
                        } else {
                            n p2 = rVar.p();
                            if (p2.e == null || p2.g == null) {
                                avVar = null;
                            } else {
                                m28349a(p2.b, p2.e);
                                aj ajVar = p2.g;
                                String str4 = p2.h;
                                if (str4 == null) {
                                    throw new NullPointerException();
                                }
                                ajVar.a |= 1;
                                ajVar.d = str4;
                                avVar = bg.m28423a(awVar, p2.g, p2.e, 5);
                            }
                        }
                    } else if (rVar.q() != null) {
                        avVar = ai.m28376a(awVar, rVar.q());
                    } else if (rVar.j() != null) {
                        j = rVar.j();
                        if (TextUtils.isEmpty(j.b) && m28351a(j.d)) {
                            awVar.f30607e = j.d;
                            awVar.f30612j = j.e;
                            awVar.f30613k = 7;
                            avVar = new af(awVar, j.b, j.c);
                        } else {
                            avVar = null;
                        }
                    } else if (rVar.s() != null) {
                        avVar = bj.m28431a(awVar, rVar.s());
                    } else if (rVar.t() != null) {
                        avVar = bi.m28430a(awVar, rVar.t());
                    } else if (rVar.r() == null) {
                        avVar = C6144a.m28356a(awVar, rVar.r());
                    } else {
                        if (rVar.a != 9) {
                            eVar = rVar.q;
                        } else {
                            eVar = null;
                        }
                        if (eVar != null) {
                            C2998a.m15496l().m15520w();
                        }
                        if (rVar.a != 5) {
                            hVar = rVar.m;
                        } else {
                            hVar = null;
                        }
                        if (hVar != null) {
                            C2998a.m15496l().m15520w();
                        }
                        if (rVar.h() == null) {
                            w h = rVar.h();
                            avVar = bg.m28423a(awVar, h.a, h.b, 16);
                        } else {
                            f30525g.m28054a("Unknown panelType", new Object[0]);
                            avVar = null;
                        }
                    }
                    if (avVar != null || avVar.f30540s != 1 || avVar.f30535n != null) {
                        return avVar;
                    }
                    f30525g.m28054a("Panel with DETAILS_PAGE interaction is missing dcID information.", new Object[0]);
                    return null;
                }
            }
        }
        i2 = i4;
        adVar = null;
        i3 = i5;
        b = (C0268a.m1542b(i2, i3) << 24) | (16777215 & i2);
        awVar = f30526v;
        awVar.f30603a = str;
        awVar.f30604b = rVar.d;
        awVar.f30605c = atomicInteger.getAndIncrement();
        if (rVar.e()) {
            str2 = rVar.f;
        } else {
            str2 = rVar.g;
        }
        awVar.f30606d = str2;
        awVar.f30615m = rVar.w;
        awVar.f30607e = f30527w;
        awVar.f30608f = i2;
        awVar.f30609g = b;
        awVar.f30610h = i3;
        awVar.f30611i = adVar;
        awVar.f30612j = f30528x;
        awVar.f30613k = 0;
        awVar.f30614l = i;
        awVar.f30616n = aaVar;
        if (rVar.B.length != 0) {
            awVar.f30617o = Arrays.asList(rVar.B);
        } else {
            awVar.f30617o = Collections.emptyList();
        }
        if (rVar.f() != null) {
            aaVar2 = rVar.f().a;
            if (aaVar2 == null) {
            }
            avVar = null;
        } else if (rVar.g() != null) {
            g = rVar.g();
            if (g.a == null) {
            }
            avVar = null;
        } else if (rVar.i() != null) {
            avVar = aa.m28357a(awVar, rVar.i(), rVar.x, atomicInteger);
        } else if (rVar.k() != null) {
            k = rVar.k();
            if (m28351a(k.d)) {
            }
            avVar = null;
        } else if (rVar.l() != null) {
            l = rVar.l();
            i = l.b.length;
            if (i == 0) {
            }
            avVar = null;
        } else if (rVar.o() != null) {
            o = rVar.o();
            if (m28351a(o.d)) {
                m28349a(o.b, o.f);
                awVar.f30607e = o.d;
                awVar.f30612j = o.f;
                awVar.f30613k = 3;
                avVar = new C6165v(awVar, o);
            } else {
                avVar = null;
            }
        } else if (rVar.p() != null) {
            if (awVar.f30614l == 0) {
            }
            p = rVar.p();
            if (m28351a(p.d)) {
            }
            avVar = null;
        } else if (rVar.q() != null) {
            avVar = ai.m28376a(awVar, rVar.q());
        } else if (rVar.j() != null) {
            j = rVar.j();
            if (TextUtils.isEmpty(j.b)) {
            }
            avVar = null;
        } else if (rVar.s() != null) {
            avVar = bj.m28431a(awVar, rVar.s());
        } else if (rVar.t() != null) {
            avVar = bi.m28430a(awVar, rVar.t());
        } else if (rVar.r() == null) {
            if (rVar.a != 9) {
                eVar = null;
            } else {
                eVar = rVar.q;
            }
            if (eVar != null) {
                C2998a.m15496l().m15520w();
            }
            if (rVar.a != 5) {
                hVar = null;
            } else {
                hVar = rVar.m;
            }
            if (hVar != null) {
                C2998a.m15496l().m15520w();
            }
            if (rVar.h() == null) {
                f30525g.m28054a("Unknown panelType", new Object[0]);
                avVar = null;
            } else {
                w h2 = rVar.h();
                avVar = bg.m28423a(awVar, h2.a, h2.b, 16);
            }
        } else {
            avVar = C6144a.m28356a(awVar, rVar.r());
        }
        return avVar != null ? avVar : avVar;
    }

    protected static boolean m28351a(ae aeVar) {
        return (aeVar == null || aeVar == f30527w || TextUtils.isEmpty(aeVar.c)) ? false : true;
    }

    protected static void m28349a(String str, ai aiVar) {
        if (!TextUtils.isEmpty(aiVar.i)) {
            return;
        }
        if (str == null) {
            throw new NullPointerException();
        }
        aiVar.a |= 64;
        aiVar.i = str;
    }

    av(aw awVar) {
        boolean z;
        boolean z2 = false;
        this.f30529h = awVar.f30603a;
        this.f30530i = awVar.f30604b;
        this.f30531j = awVar.f30605c;
        this.f30532k = (String) C6116b.m28100a(awVar.f30606d);
        C6116b.m28107b(awVar.f30613k != 0, "Invalid params.panelType");
        this.f30533l = awVar.f30613k;
        this.f30534m = (byte[]) C6116b.m28100a(awVar.f30615m);
        if (awVar.f30612j != f30528x) {
            z = true;
        } else {
            z = false;
        }
        C6116b.m28107b(z, "Invalid params.dcId");
        this.f30535n = awVar.f30612j;
        if (awVar.f30607e == null || m28351a(awVar.f30607e)) {
            z2 = true;
        }
        C6116b.m28107b(z2, "Invalid params.mainImage");
        this.f30536o = awVar.f30607e;
        this.f30537p = awVar.f30608f;
        this.f30538q = awVar.f30609g;
        this.f30539r = awVar.f30610h;
        this.f30540s = awVar.f30614l;
        this.f30542u = awVar.f30616n;
        this.f30541t = awVar.f30617o;
    }

    public final boolean m28353b() {
        return this.f30542u != null;
    }

    public final aa m28354c() {
        return (aa) C6116b.m28100a(this.f30542u);
    }

    public int hashCode() {
        return this.f30531j;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        av avVar = (av) obj;
        if (this.f30531j == avVar.f30531j && TextUtils.equals(this.f30530i, avVar.f30530i) && TextUtils.equals(this.f30529h, avVar.f30529h)) {
            return true;
        }
        return false;
    }
}
