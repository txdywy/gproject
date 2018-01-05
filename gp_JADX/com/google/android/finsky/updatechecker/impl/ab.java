package com.google.android.finsky.updatechecker.impl;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.support.v7.widget.eq;
import android.text.TextUtils;
import com.google.android.finsky.aa.C0954a;
import com.google.android.finsky.aa.C0955b;
import com.google.android.finsky.aa.C0968o;
import com.google.android.finsky.accounts.C0988c;
import com.google.android.finsky.aq.C1500a;
import com.google.android.finsky.ar.C1502a;
import com.google.android.finsky.as.C1506e;
import com.google.android.finsky.ba.C1461c;
import com.google.android.finsky.bh.C1627b;
import com.google.android.finsky.bn.C2127b;
import com.google.android.finsky.bn.C2129c;
import com.google.android.finsky.by.C2206c;
import com.google.android.finsky.cn.C2320a;
import com.google.android.finsky.cn.C2322b;
import com.google.android.finsky.cv.p177a.C2441n;
import com.google.android.finsky.cv.p177a.ch;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.dt.C2887a;
import com.google.android.finsky.installer.C3300k;
import com.google.android.finsky.installer.C3322j;
import com.google.android.finsky.installqueue.C3340g;
import com.google.android.finsky.p107l.C3646a;
import com.google.android.finsky.p107l.C3647b;
import com.google.android.finsky.p107l.C3654j;
import com.google.android.finsky.p111d.C2474c;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p167r.C2176c;
import com.google.android.finsky.p167r.C3951d;
import com.google.android.finsky.p167r.C3960a;
import com.google.android.finsky.p167r.C3961b;
import com.google.android.finsky.p198f.C3027b;
import com.google.android.finsky.p198f.C3028c;
import com.google.android.finsky.p198f.C3029d;
import com.google.android.finsky.p232s.C4006e;
import com.google.android.finsky.updatechecker.C2239c;
import com.google.android.finsky.updatechecker.C4638a;
import com.google.android.finsky.updatechecker.C4639b;
import com.google.android.finsky.updatechecker.C4641e;
import com.google.android.finsky.updatechecker.C4642f;
import com.google.android.finsky.utils.C4672c;
import com.google.android.finsky.utils.C4680k;
import com.google.android.finsky.utils.FinskyLog;
import com.google.wireless.android.a.a.a.a.aa;
import com.google.wireless.android.a.a.a.a.t;
import com.squareup.haha.perflib.io.MemoryMappedFileBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Set;

public final class ab implements C4639b {
    public static final Comparator f23903a = new ac();
    public final C3960a f23904A;
    public final C3654j f23905B;
    public final C1506e f23906C;
    public final C1500a f23907D;
    public final C4006e f23908E;
    public boolean f23909F;
    public int f23910G;
    public C2495w f23911H;
    public final C4642f f23912b = new ad(this);
    public final Context f23913c;
    public final C3646a f23914d;
    public final C2206c f23915e;
    public final C0988c f23916f;
    public final C1461c f23917g;
    public final C2127b f23918h;
    public final C3300k f23919i;
    public final com.google.android.finsky.notification.ab f23920j;
    public final C1627b f23921k;
    public final C3028c f23922l;
    public final C4638a f23923m;
    public final C2320a f23924n;
    public final C3027b f23925o;
    public final C3340g f23926p;
    public long f23927q;
    public Set f23928r;
    public boolean f23929s;
    public int f23930t;
    public int f23931u;
    public C2887a f23932v;
    public C3951d f23933w;
    public C1502a f23934x;
    public C4641e f23935y;
    public boolean f23936z;

    public ab(Context context, C3646a c3646a, C2206c c2206c, C0988c c0988c, C1461c c1461c, C3027b c3027b, C2127b c2127b, C3340g c3340g, C3300k c3300k, com.google.android.finsky.notification.ab abVar, C2320a c2320a, C4638a c4638a, C1627b c1627b, C2887a c2887a, C3028c c3028c, C3951d c3951d, C1502a c1502a, C4641e c4641e, boolean z, C3960a c3960a, C3654j c3654j, C1506e c1506e, C1500a c1500a, C4006e c4006e) {
        this.f23913c = context;
        this.f23914d = c3646a;
        this.f23915e = c2206c;
        this.f23916f = c0988c;
        this.f23917g = c1461c;
        this.f23918h = c2127b;
        this.f23919i = c3300k;
        this.f23920j = abVar;
        this.f23921k = c1627b;
        this.f23922l = c3028c;
        this.f23925o = c3027b;
        this.f23926p = c3340g;
        this.f23923m = c4638a;
        this.f23924n = c2320a;
        this.f23932v = c2887a;
        this.f23933w = c3951d;
        this.f23934x = c1502a;
        this.f23935y = c4641e;
        this.f23936z = z;
        this.f23904A = c3960a;
        this.f23905B = c3654j;
        this.f23906C = c1506e;
        this.f23907D = c1500a;
        this.f23908E = c4006e;
    }

    public final void mo4316a(C2239c c2239c, boolean z, int i, C2495w c2495w) {
        m21610a(c2239c, z, i, null, c2495w);
    }

    public final void mo4317a(List list, C2495w c2495w) {
        m21610a(null, false, -1, list, c2495w);
    }

    private final void m21610a(C2239c c2239c, boolean z, int i, List list, C2495w c2495w) {
        this.f23911H = c2495w;
        this.f23909F = z;
        this.f23910G = i;
        this.f23935y.mo4313a(c2239c, list, this.f23912b);
    }

    final void m21619a(List list) {
        long j;
        if (this.f23917g.dj().mo2294a(12644444)) {
            List arrayList = new ArrayList();
            List arrayList2 = new ArrayList();
            Object[] a = C4680k.m21818a((String) C0955b.aT.m28964b());
            for (Document document : list) {
                boolean z;
                String cf = document.cf();
                if (TextUtils.isEmpty(cf)) {
                    z = false;
                } else if (C4672c.m21804a(a, (Object) cf)) {
                    z = false;
                } else if (this.f23906C.m8843f() != 0) {
                    z = false;
                } else if (this.f23907D.m8820a(cf)) {
                    z = false;
                } else {
                    z = true;
                }
                if (z) {
                    arrayList2.add(document);
                } else {
                    arrayList.add(document);
                }
            }
            C4006e c4006e = this.f23908E;
            boolean z2 = !this.f23936z;
            C2495w c2495w = this.f23911H;
            FinskyLog.m21659a("Scheduling auto update v2 with %d apps", Integer.valueOf(arrayList2.size()));
            c4006e.f20108g = new ArrayList();
            c4006e.m18749a(arrayList2, z2, c2495w);
            c4006e.m18748a();
            c4006e.f20106e.m18747a(c4006e.f20108g, c2495w);
            list = arrayList;
        }
        if (this.f23909F || this.f23923m.mo4312a()) {
            j = 272;
        } else {
            j = 0;
        }
        int i = this.f23910G;
        this.f23927q = j;
        this.f23928r = C3322j.m16693a(this.f23913c);
        if (!this.f23917g.dj().mo2294a(12623699)) {
            z2 = ((Boolean) C0954a.ak.m5760a()).booleanValue() && ((Long) C0955b.aP.m28964b()).longValue() > 0;
            this.f23929s = z2;
            C0954a.ak.m5763a(Boolean.valueOf(false));
        }
        this.f23930t = 0;
        this.f23931u = 0;
        C0954a.ah.m5763a(Long.valueOf(0));
        List b = m21612b(list);
        m21613c(b);
        Collections.sort(b, f23903a);
        m21614d(b);
        m21611a(b, i);
        m21615e(b);
        m21616f(b);
        m21617g(b);
        if (!this.f23917g.dj().mo2294a(12623699) && this.f23930t > 0 && this.f23929s) {
            FinskyLog.m21659a("Auto-update of %d packages will defer for %d ms", Integer.valueOf(this.f23930t), C0955b.aP.m28964b());
            new Handler(Looper.getMainLooper()).postDelayed(new ae(this), ((Long) C0955b.aP.m28964b()).longValue());
        }
        aa aaVar = new aa();
        int i2 = this.f23930t;
        aaVar.a |= eq.FLAG_APPEARED_IN_PRE_LAYOUT;
        aaVar.n = i2;
        i2 = this.f23931u;
        aaVar.a |= 8192;
        aaVar.o = i2;
        this.f23911H.m13367a(new C2474c(131).m13214a(aaVar).m13217a(this.f23934x.m8828a()));
    }

    private final List m21612b(List list) {
        List arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Document document = (Document) list.get(i);
            String str = document.m14625N().f13171k;
            arrayList.add(new C3961b(document, this.f23924n.mo2854a(str), this.f23918h.mo2657a(str), this.f23911H.m13365a()));
        }
        return arrayList;
    }

    private final void m21613c(List list) {
        List a = this.f23933w.mo3873a();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            C3961b c3961b = (C3961b) list.get(i);
            int size2 = a.size();
            for (int i2 = 0; i2 < size2; i2++) {
                ((C2176c) a.get(i2)).mo2769a(c3961b);
            }
        }
    }

    private final void m21614d(List list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            boolean z;
            C3961b c3961b = (C3961b) list.get(i);
            C2322b c2322b = c3961b.f19984b;
            C3029d a = this.f23922l.m15631a(c3961b.f19983a, true);
            if ((c3961b.f19989g & 1) != 0 && a.f15857a) {
                c3961b.f19990h |= 1;
            }
            if ((c3961b.f19989g & 2) != 0 && a.f15858b) {
                c3961b.f19990h |= 2;
            }
            if ((c3961b.f19989g & 4) != 0 && a.f15859c) {
                c3961b.f19990h |= 4;
            }
            if ((c3961b.f19989g & 32) != 0 && this.f23928r.contains(c3961b.f19983a.m14625N().f13171k)) {
                c3961b.f19990h |= 32;
            }
            if ((c3961b.f19989g & 16) != 0 && (this.f23927q & 16) == 0) {
                c3961b.f19990h |= 16;
            }
            if (this.f23917g.dj().mo2294a(12631407)) {
                z = true;
            } else {
                z = false;
            }
            if (z && (c3961b.f19989g & 256) != 0 && (this.f23927q & 256) == 0) {
                c3961b.f19990h |= 512;
            }
            if ((c3961b.f19989g & 64) != 0 && this.f23921k.m9312b()) {
                c3961b.f19990h |= 64;
            }
            if (!((c3961b.f19989g & 128) == 0 || c2322b == null || !c2322b.f11425j)) {
                c3961b.f19990h |= 128;
            }
            if (!((c3961b.f19989g & 8) == 0 || this.f23904A.m18668a())) {
                c3961b.f19990h |= 8;
            }
            if ((c3961b.f19989g & 512) != 0) {
                Document document = c3961b.f19983a;
                if (this.f23917g.dj().mo2294a(12643667) && document.m14671z() != null) {
                    for (ch chVar : document.m14671z().f12312d) {
                        String str = chVar.f12035c;
                        C2322b a2 = this.f23924n.mo2854a(str);
                        if (C4672c.m21804a(C4680k.m21818a((String) C0955b.jR.m28964b()), (Object) str)) {
                            this.f23905B.m17263a(chVar).m17262a(a2);
                            if (!this.f23905B.m17269e() && this.f23915e.mo2812a(str).isEmpty()) {
                                z = true;
                                break;
                            }
                        }
                    }
                }
                z = false;
                if (z) {
                    c3961b.f19990h |= MemoryMappedFileBuffer.DEFAULT_PADDING;
                }
            }
        }
    }

    private final void m21611a(List list, int i) {
        if (this.f23932v != null) {
            this.f23932v.mo4282b();
        }
        int size = list.size();
        if (i == -1) {
            i = size;
        }
        for (int i2 = 0; i2 < size; i2++) {
            C3961b c3961b = (C3961b) list.get(i2);
            if (c3961b.f19990h != 0 || this.f23930t >= r11) {
                this.f23931u++;
            } else {
                String str = c3961b.f19983a.m14625N().f13171k;
                if (this.f23917g.dj().mo2294a(12613802) && this.f23932v != null) {
                    this.f23932v.mo4280a(str);
                }
                if (!this.f23936z) {
                    String a = this.f23925o.m15626a(str).m15620a(this.f23916f.cZ());
                    if (TextUtils.isEmpty(a)) {
                        FinskyLog.m21659a("Cannot update %s because cannot determine update account.", str);
                        this.f23911H.m13367a(new C2474c(191).m13236a(str).m13254g(1800));
                        this.f23930t++;
                    } else {
                        c3961b.f19987e.m16815b(a);
                    }
                }
                c3961b.f19987e.m16812a(true);
                if (!this.f23917g.dj().mo2294a(12623699)) {
                    c3961b.f19988f.m16796b(this.f23929s);
                }
                c3961b.f19987e.m16813a(c3961b.f19988f.m16799e());
                this.f23926p.m16744a(c3961b.f19987e.m16806a());
                this.f23930t++;
            }
        }
    }

    private final void m21615e(List list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            C3961b c3961b = (C3961b) list.get(i);
            if (!((c3961b.f19994l & 1) == 0 || c3961b.f19990h == 0)) {
                aa aaVar = new aa();
                if ((c3961b.f19990h & 8) != 0) {
                    aaVar.a |= eq.FLAG_MOVED;
                    aaVar.m = true;
                }
                if ((c3961b.f19990h & 16) != 0) {
                    aaVar.c(true);
                }
                if ((c3961b.f19990h & 1) != 0) {
                    aaVar.a |= 512;
                    aaVar.k = true;
                }
                if ((c3961b.f19990h & 2) != 0) {
                    aaVar.a |= 256;
                    aaVar.j = true;
                }
                if ((c3961b.f19990h & 64) != 0) {
                    aaVar.a(true);
                }
                if ((c3961b.f19990h & 4) != 0) {
                    aaVar.a |= MemoryMappedFileBuffer.DEFAULT_PADDING;
                    aaVar.l = true;
                }
                if ((c3961b.f19990h & 32) != 0) {
                    aaVar.a |= 16384;
                    aaVar.p = true;
                }
                if ((c3961b.f19990h & 512) != 0) {
                    aaVar.b(true);
                }
                C2441n N = c3961b.f19983a.m14625N();
                C2495w c2495w = c3961b.f19986d;
                C2474c a = new C2474c(131).m13236a(N.f13171k).m13214a(aaVar);
                C3647b a2 = this.f23914d.m17243a(N.f13171k);
                t tVar = new t();
                tVar.a(N.f13163c);
                if (a2.f18028c != null) {
                    tVar.b(a2.f18028c.f11419d);
                    tVar.a(a2.f18028c.f11422g);
                }
                c2495w.m13367a(a.m13231a(tVar).m13217a(this.f23934x.m8828a()));
            }
        }
    }

    private final void m21616f(List list) {
        if (!list.isEmpty()) {
            Object obj;
            int i;
            List arrayList = new ArrayList();
            List arrayList2 = new ArrayList();
            List arrayList3 = new ArrayList();
            List arrayList4 = new ArrayList();
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                C3961b c3961b = (C3961b) list.get(i2);
                if (c3961b.f19990h != 0 && (c3961b.f19993k & 1) == 0) {
                    arrayList.add(c3961b.f19983a);
                    obj = (c3961b.f19990h & 1031) != 0 ? 1 : null;
                    if (obj != null) {
                        arrayList3.add(c3961b.f19983a);
                    }
                    C2441n N = c3961b.f19983a.m14625N();
                    String str = N.f13171k;
                    C2129c a = this.f23914d.f18022b.mo2657a(N.f13171k);
                    i = N.f13163c;
                    if (a == null || i > a.f10810d) {
                        this.f23914d.f18022b.mo2672c(str, i);
                        arrayList2.add(c3961b.f19983a);
                        if (obj != null) {
                            arrayList4.add(c3961b.f19983a);
                        }
                    }
                }
            }
            this.f23920j.mo3772a();
            if (!arrayList.isEmpty() && ((Boolean) C0968o.f5931h.m5760a()).booleanValue()) {
                boolean a2 = this.f23904A.m18668a();
                size = arrayList.size();
                i = arrayList3.size();
                int size2 = arrayList2.size();
                obj = arrayList4.size() > 0 ? 1 : null;
                long currentTimeMillis = System.currentTimeMillis() - ((Long) C0954a.ag.m5760a()).longValue();
                C2495w a3 = this.f23911H.m13365a();
                if (!a2 && size2 > 0) {
                    FinskyLog.m21659a("Notifying user that [%d/%d] applications have new updates.", Integer.valueOf(size2), Integer.valueOf(size));
                    this.f23920j.mo3798a(arrayList2, size, a3);
                    C0954a.ag.m5763a(Long.valueOf(System.currentTimeMillis()));
                } else if (a2 && obj != null) {
                    FinskyLog.m21659a("Notifying user [%d/%d] applications have updates that require approval.", Integer.valueOf(i), Integer.valueOf(size));
                    this.f23920j.mo3805b(arrayList3, size, a3);
                    C0954a.ag.m5763a(Long.valueOf(System.currentTimeMillis()));
                } else if (currentTimeMillis > ((Long) C0955b.dn.m28964b()).longValue()) {
                    FinskyLog.m21659a("Notifying user that %d applications have outstanding updates.", Integer.valueOf(size));
                    this.f23920j.mo3799a(arrayList, a3);
                    C0954a.ag.m5763a(Long.valueOf(System.currentTimeMillis()));
                }
            }
        }
    }

    private final void m21617g(List list) {
        int size = list.size();
        int i = 0;
        while (i < size) {
            C3961b c3961b = (C3961b) list.get(i);
            if (c3961b.f19990h == 0 || (c3961b.f19990h & -593) != 0) {
                i++;
            } else {
                if (((Long) C0954a.ah.m5760a()).longValue() <= 0) {
                    C0954a.ah.m5763a(Long.valueOf(System.currentTimeMillis()));
                }
                this.f23923m.mo4311a(this.f23911H);
                return;
            }
        }
    }
}
