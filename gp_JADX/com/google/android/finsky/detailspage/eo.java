package com.google.android.finsky.detailspage;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.widget.em;
import android.text.TextUtils;
import android.view.View;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.adapters.C1181z;
import com.google.android.finsky.adapters.ab;
import com.google.android.finsky.adapters.p121a.C1140e;
import com.google.android.finsky.adapters.p121a.C1143b;
import com.google.android.finsky.adapters.p121a.C1144c;
import com.google.android.finsky.adapters.p121a.C1146d;
import com.google.android.finsky.adapters.p121a.C1148g;
import com.google.android.finsky.adapters.p121a.C1150h;
import com.google.android.finsky.adapters.p121a.C1152i;
import com.google.android.finsky.adapters.p121a.C1153j;
import com.google.android.finsky.bg.C1608h;
import com.google.android.finsky.by.C0999d;
import com.google.android.finsky.by.C2197a;
import com.google.android.finsky.cv.p177a.cv;
import com.google.android.finsky.cv.p177a.iu;
import com.google.android.finsky.cv.p177a.jx;
import com.google.android.finsky.cv.p177a.ka;
import com.google.android.finsky.cv.p177a.kd;
import com.google.android.finsky.detailsmodules.p183a.C2600d;
import com.google.android.finsky.dfemodel.C2719i;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.dn.C2833a;
import com.google.android.finsky.p111d.C2473o;
import com.google.android.finsky.p111d.C2475d;
import com.google.android.finsky.p111d.C2482j;
import com.google.android.finsky.p111d.ad;
import com.google.android.finsky.ratereview.C2642m;
import com.google.android.finsky.ratereview.C3963b;
import com.google.android.finsky.ratereview.C3964c;
import com.google.android.finsky.ratereview.C3974q;
import com.google.android.finsky.utils.C4685p;
import com.google.android.finsky.utils.FinskyLog;
import com.google.wireless.android.a.a.a.a.ce;
import com.google.wireless.android.finsky.dfe.nano.fs;
import com.squareup.leakcanary.C7582R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class eo extends ck implements C1144c, C1148g, ab, C0999d, ad, fc, C2642m {
    public C3964c f14491d = C1473m.f7980a.ac();
    public List f14492e;
    public boolean f14493f;
    public boolean f14494g;
    public C3974q f14495h = C1473m.f7980a.mo2248i(C1473m.f7980a.cZ());
    public C3963b f14496i = C1473m.f7980a.ad();
    public ce f14497j = C2482j.m13283a(6000);

    public final int mo2978e() {
        return 1;
    }

    public final int mo2977c(int i) {
        return C7582R.layout.structured_review_module;
    }

    public final boolean mo2979f() {
        return this.b != null && ((ex) this.b).f14543a && ((ex) this.b).f14549g;
    }

    public final void mo2974a(boolean z, Document document, C2719i c2719i, Document document2, C2719i c2719i2) {
        boolean z2 = true;
        if (document2 != null && !TextUtils.isEmpty(document2.f14885a.f12119z)) {
            C1473m.f7980a.mo2253l();
            if (!C2833a.m14982c(document2)) {
                if (this.b == null) {
                    this.b = new ex();
                    this.D.mo2814a((C0999d) this);
                    ((ex) this.b).f14557o = new Bundle();
                }
                if (!((ex) this.b).f14549g) {
                    m14263a(document2.f14885a.f12119z, true);
                }
                if (z && ((ex) this.b).f14545c == null) {
                    ((ex) this.b).f14545c = document2;
                    ((ex) this.b).f14544b = c2719i.m14725e();
                    ex exVar = (ex) this.b;
                    boolean z3 = C3964c.m18678a(this.D, ((ex) this.b).f14545c) && ((ex) this.b).f14544b;
                    exVar.f14543a = z3;
                    if (this.v == null) {
                        FinskyLog.m21669e("DfeToc was unexpectedly null", new Object[0]);
                    }
                    exVar = (ex) this.b;
                    if (this.v == null || !this.v.f14881a.f31775r) {
                        z2 = false;
                    }
                    exVar.f14551i = z2;
                    ((ex) this.b).f14552j = c2719i2.m14723c();
                    if (((ex) this.b).f14543a) {
                        m14250l();
                    }
                }
            }
        }
    }

    private final void m14250l() {
        iu a = this.f14495h.m18689a(((ex) this.b).f14545c.f14885a.f12096c, null, false);
        if (a != null) {
            m14259a(a);
        } else if (TextUtils.isEmpty(((ex) this.b).f14552j)) {
            m14259a(null);
        } else {
            this.x.mo1632c(((ex) this.b).f14552j, new ep(this), new eq());
        }
    }

    final void m14259a(iu iuVar) {
        m14278j();
        ((ex) this.b).f14546d = iuVar;
        ((ex) this.b).f14547e = ((ex) this.b).f14546d;
        if (((ex) this.b).f14547e != null && ((ex) this.b).f14547e.f12730r == null) {
            ((ex) this.b).f14547e.f12730r = new kd();
        }
        m14251m();
    }

    final void m14263a(String str, boolean z) {
        if (!this.f14493f) {
            this.f14493f = true;
            this.w.mo1645e(str, new er(this, z), new es(this));
        }
    }

    private final void m14251m() {
        C1473m.f7980a.aq().mo5377a(new et(this), new eu(), true);
    }

    public final void mo2976b(View view, int i) {
        List list;
        iu iuVar;
        int i2;
        int i3;
        Bundle bundle;
        boolean z;
        em emVar;
        StructuredReviewModuleLayout structuredReviewModuleLayout = (StructuredReviewModuleLayout) view;
        cv cvVar = ((ex) this.b).f14550h;
        if (this.f14492e == null) {
            this.f14492e = new ArrayList();
            if (((ex) this.b).f14547e != null && !((ex) this.b).f14553k) {
                this.f14492e.add(new C1143b(this.t, ((ex) this.b).f14545c, this, this, this.J));
            } else if (!((ex) this.b).f14549g || ((ex) this.b).f14554l == null) {
                list = null;
                iuVar = ((ex) this.b).f14547e;
                i2 = ((ex) this.b).f14555m;
                m14252n();
                i3 = ((ex) this.b).f14545c.f14885a.f12099f;
                bundle = ((ex) this.b).f14557o;
                structuredReviewModuleLayout.f14075l = iuVar == null;
                if (structuredReviewModuleLayout.f14075l || list.size() == 1) {
                    z = true;
                } else {
                    z = false;
                }
                structuredReviewModuleLayout.f14070g = z;
                structuredReviewModuleLayout.f14074k = this;
                structuredReviewModuleLayout.f14071h = i2;
                structuredReviewModuleLayout.f14073j = this;
                structuredReviewModuleLayout.f14067d.setSelectedColorResId(C1608h.m9251b(i3));
                if (cvVar == null) {
                    C2473o c2473o = new C2473o(279, cvVar.f12087D, structuredReviewModuleLayout.f14073j);
                    structuredReviewModuleLayout.f14066c.setVisibility(0);
                    structuredReviewModuleLayout.f14066c.m17564a(cvVar, C1473m.f7980a.be());
                } else {
                    structuredReviewModuleLayout.f14066c.setOnClickListener(null);
                    structuredReviewModuleLayout.f14066c.setVisibility(8);
                }
                if (structuredReviewModuleLayout.f14065b == null) {
                    structuredReviewModuleLayout.f14065b = new C1181z(structuredReviewModuleLayout);
                    structuredReviewModuleLayout.f14064a.setAdapter(structuredReviewModuleLayout.f14065b);
                }
                structuredReviewModuleLayout.f14065b.f7254d = this;
                emVar = structuredReviewModuleLayout.f14065b;
                if (emVar.f7253c != iuVar) {
                    emVar.f7253c = iuVar;
                    emVar.f3433a.m3638b();
                }
                emVar = structuredReviewModuleLayout.f14065b;
                emVar.f7257g.clear();
                emVar.f7257g.addAll(list);
                emVar.f3433a.m3638b();
                emVar = structuredReviewModuleLayout.f14065b;
                emVar.f7255e = bundle;
                emVar.f3433a.m3638b();
                structuredReviewModuleLayout.f14065b.f3433a.m3638b();
                structuredReviewModuleLayout.f14067d.setPageCount(list.size());
                structuredReviewModuleLayout.f14067d.setSelectedPage(structuredReviewModuleLayout.f14071h);
                if (list.size() > 1 || structuredReviewModuleLayout.f14070g) {
                    structuredReviewModuleLayout.f14067d.setVisibility(8);
                    structuredReviewModuleLayout.f14069f.setVisibility(8);
                } else {
                    structuredReviewModuleLayout.f14067d.setVisibility(0);
                    structuredReviewModuleLayout.f14069f.setOnClickListener(new fa(structuredReviewModuleLayout));
                }
                structuredReviewModuleLayout.m13791b(structuredReviewModuleLayout.f14071h);
                structuredReviewModuleLayout.f14068e.setOnClickListener(new fb(structuredReviewModuleLayout));
                structuredReviewModuleLayout.f14064a.mo2963c(structuredReviewModuleLayout.f14071h);
                structuredReviewModuleLayout.f14065b.m7130e(i2).mo1458b();
            } else {
                for (fs fsVar : ((ex) this.b).f14554l) {
                    Object c1150h;
                    switch (fsVar.c) {
                        case 1:
                            boolean z2 = ((ex) this.b).f14551i && !this.f14496i.m18672a() && ((ex) this.b).f14547e == null;
                            c1150h = new C1150h(this.t, fsVar.d, m14248a(fsVar, m14252n()), z2, ((ex) this.b).f14545c.f14885a.f12099f, this);
                            break;
                        case 2:
                            c1150h = new C1146d(this.t, fsVar.d, m14248a(fsVar, this.t.getString(C7582R.string.review_dialog_content_hint)), ((ex) this.b).f14545c.f14885a.f12099f, this);
                            break;
                        case 3:
                            Context context = this.t;
                            byte[] bArr = fsVar.d;
                            CharSequence a = m14248a(fsVar, fsVar.f.f12852c);
                            ka kaVar = fsVar.f;
                            C1473m.f7980a.be();
                            c1150h = new C1152i(context, bArr, a, kaVar, this, this.J);
                            break;
                        case 4:
                            c1150h = new C1153j(this.t, fsVar.d, m14248a(fsVar, fsVar.f.f12852c), fsVar.f, ((ex) this.b).f14545c.f14885a.f12099f, this);
                            break;
                        default:
                            c1150h = null;
                            break;
                    }
                    c1150h.mo1456a((C1148g) this);
                    if (c1150h != null) {
                        this.f14492e.add(c1150h);
                    }
                }
            }
        }
        list = this.f14492e;
        iuVar = ((ex) this.b).f14547e;
        i2 = ((ex) this.b).f14555m;
        m14252n();
        i3 = ((ex) this.b).f14545c.f14885a.f12099f;
        bundle = ((ex) this.b).f14557o;
        if (iuVar == null) {
        }
        structuredReviewModuleLayout.f14075l = iuVar == null;
        if (structuredReviewModuleLayout.f14075l) {
        }
        z = true;
        structuredReviewModuleLayout.f14070g = z;
        structuredReviewModuleLayout.f14074k = this;
        structuredReviewModuleLayout.f14071h = i2;
        structuredReviewModuleLayout.f14073j = this;
        structuredReviewModuleLayout.f14067d.setSelectedColorResId(C1608h.m9251b(i3));
        if (cvVar == null) {
            structuredReviewModuleLayout.f14066c.setOnClickListener(null);
            structuredReviewModuleLayout.f14066c.setVisibility(8);
        } else {
            C2473o c2473o2 = new C2473o(279, cvVar.f12087D, structuredReviewModuleLayout.f14073j);
            structuredReviewModuleLayout.f14066c.setVisibility(0);
            structuredReviewModuleLayout.f14066c.m17564a(cvVar, C1473m.f7980a.be());
        }
        if (structuredReviewModuleLayout.f14065b == null) {
            structuredReviewModuleLayout.f14065b = new C1181z(structuredReviewModuleLayout);
            structuredReviewModuleLayout.f14064a.setAdapter(structuredReviewModuleLayout.f14065b);
        }
        structuredReviewModuleLayout.f14065b.f7254d = this;
        emVar = structuredReviewModuleLayout.f14065b;
        if (emVar.f7253c != iuVar) {
            emVar.f7253c = iuVar;
            emVar.f3433a.m3638b();
        }
        emVar = structuredReviewModuleLayout.f14065b;
        emVar.f7257g.clear();
        emVar.f7257g.addAll(list);
        emVar.f3433a.m3638b();
        emVar = structuredReviewModuleLayout.f14065b;
        emVar.f7255e = bundle;
        emVar.f3433a.m3638b();
        structuredReviewModuleLayout.f14065b.f3433a.m3638b();
        structuredReviewModuleLayout.f14067d.setPageCount(list.size());
        structuredReviewModuleLayout.f14067d.setSelectedPage(structuredReviewModuleLayout.f14071h);
        if (list.size() > 1) {
        }
        structuredReviewModuleLayout.f14067d.setVisibility(8);
        structuredReviewModuleLayout.f14069f.setVisibility(8);
        structuredReviewModuleLayout.m13791b(structuredReviewModuleLayout.f14071h);
        structuredReviewModuleLayout.f14068e.setOnClickListener(new fb(structuredReviewModuleLayout));
        structuredReviewModuleLayout.f14064a.mo2963c(structuredReviewModuleLayout.f14071h);
        structuredReviewModuleLayout.f14065b.m7130e(i2).mo1458b();
    }

    private final String m14252n() {
        return C1608h.m9248a(this.t.getResources(), ((ex) this.b).f14545c.f14885a.f12098e);
    }

    private static CharSequence m14248a(fs fsVar, String str) {
        if (!TextUtils.isEmpty(fsVar.e)) {
            str = fsVar.e;
        }
        return C4685p.m21831a(str);
    }

    private final void m14253o() {
        if (this.f14492e != null) {
            for (C1140e a : this.f14492e) {
                a.mo1454a(((ex) this.b).f14557o);
            }
        }
    }

    public final void mo3037c(View view, int i) {
        super.mo3037c(view, i);
        m14253o();
    }

    public final void mo2980h() {
        this.D.mo2819b(this);
        this.f14494g = true;
        m14253o();
    }

    public final void ab_() {
    }

    public final void mo1204a(C2197a c2197a) {
        if (this.b != null && ((ex) this.b).f14545c != null) {
            boolean z = ((ex) this.b).f14543a;
            ex exVar = (ex) this.b;
            boolean z2 = C3964c.m18678a(this.D, ((ex) this.b).f14545c) && ((ex) this.b).f14544b;
            exVar.f14543a = z2;
            if (z == ((ex) this.b).f14543a) {
                return;
            }
            if (((ex) this.b).f14543a) {
                m14251m();
            } else {
                this.u.mo3032a(this);
            }
        }
    }

    final void m14264a(boolean z) {
        if (((ex) this.b).f14556n <= 0) {
            if (((ex) this.b).f14545c != null) {
                ((ex) this.b).f14546d = ((ex) this.b).f14547e;
                ((ex) this.b).f14547e = this.f14495h.m18689a(((ex) this.b).f14545c.f14885a.f12096c, ((ex) this.b).f14546d, false);
            }
            if (!this.f14494g && mo2979f()) {
                this.u.mo3033a(this, z);
            }
        }
    }

    final void m14262a(String str, int i, String str2, kd kdVar, Document document, ad adVar) {
        ex exVar = (ex) this.b;
        exVar.f14556n++;
        String str3 = str;
        int i2 = i;
        this.f14491d.m18681a(str3, ((ex) this.b).f14545c.f14885a.f12096c, ((ex) this.b).f14552j, i2, "", str2, kdVar, document, this.t, this, adVar, ((ex) this.b).f14551i);
    }

    final void m14277i() {
        ((ex) this.b).f14547e = ((ex) this.b).f14546d;
        ((ex) this.b).f14553k = false;
        m14278j();
        m14264a(true);
    }

    final void m14269b(boolean z) {
        boolean z2 = ((ex) this.b).f14553k;
        ((ex) this.b).f14553k = z;
        if (z2 != ((ex) this.b).f14553k && ((ex) this.b).f14547e != null) {
            m14278j();
        }
    }

    final void m14278j() {
        if (this.f14492e != null) {
            for (C1140e b : this.f14492e) {
                b.mo1459b(this);
            }
            this.f14492e = null;
        }
        ((ex) this.b).f14555m = 0;
    }

    private final void m14249b(C1140e c1140e, int i) {
        this.J.m13379b(new C2475d(c1140e.mo1460c()).m13256a(i));
    }

    public final void mo3085b(int i) {
        ex exVar = (ex) this.b;
        exVar.f14556n--;
        m14264a(this.f14492e == null);
    }

    public final void mo3088k() {
        ex exVar = (ex) this.b;
        exVar.f14556n--;
        m14277i();
    }

    public ce getPlayStoreUiElement() {
        return this.f14497j;
    }

    public ad getParentNode() {
        return this.I;
    }

    public final void mo1219a(ad adVar) {
        C2482j.m13291a((ad) this, adVar);
    }

    public final void mo3084b() {
        this.J.m13379b(new C2475d(this).m13256a(1202));
        m14269b(true);
        m14264a(true);
    }

    public final void mo3086d() {
        this.J.m13379b(new C2475d(this).m13256a(1209));
        String cZ = C1473m.f7980a.cZ();
        ((ex) this.b).f14553k = false;
        ((ex) this.b).f14557o.clear();
        ex exVar = (ex) this.b;
        exVar.f14556n++;
        this.f14491d.m18683a(cZ, ((ex) this.b).f14545c.f14885a.f12096c, ((ex) this.b).f14552j, this.t, new ev(this), false);
    }

    public final void mo3083a(C1140e c1140e, String str, int i, int i2) {
        jx jxVar = null;
        for (jx jxVar2 : ((ex) this.b).f14547e.f12730r.f12860a) {
            if (jxVar2.f12838c.equals(str)) {
                jxVar = jxVar2;
                break;
            }
        }
        kd kdVar = new kd();
        int length = ((ex) this.b).f14547e.f12730r.f12860a.length;
        if (jxVar == null) {
            jxVar = new jx();
            if (str == null) {
                throw new NullPointerException();
            }
            jxVar.f12837b |= 1;
            jxVar.f12838c = str;
            kdVar.f12860a = (jx[]) Arrays.copyOf(((ex) this.b).f14547e.f12730r.f12860a, length + 1, jx[].class);
            kdVar.f12860a[length] = jxVar;
        } else {
            kdVar.f12860a = (jx[]) Arrays.copyOf(((ex) this.b).f14547e.f12730r.f12860a, length, jx[].class);
        }
        jxVar.f12839d = i;
        jxVar.f12837b |= 2;
        if (i == 4) {
            jxVar.f12837b |= 4;
            jxVar.f12840e = i2;
        }
        m14262a(C1473m.f7980a.cZ(), ((ex) this.b).f14547e.f12717e, ((ex) this.b).f14547e.f12720h, kdVar, new Document(((ex) this.b).f14550h), c1140e.mo1460c());
    }

    public final void mo3081a(C1140e c1140e, int i) {
        String str;
        kd kdVar;
        m14249b(c1140e, 6002);
        if (((ex) this.b).f14547e != null) {
            str = ((ex) this.b).f14547e.f12720h;
        } else {
            str = "";
        }
        if (((ex) this.b).f14547e != null) {
            kdVar = ((ex) this.b).f14547e.f12730r;
        } else {
            kdVar = new kd();
        }
        if (((ex) this.b).f14551i) {
            this.f14491d.m18679a(this.A.m603h(), new ew(this, i, str, kdVar, c1140e), false);
            return;
        }
        m14269b(true);
        m14262a(C1473m.f7980a.cZ(), i, "", kdVar, null, c1140e.mo1460c());
    }

    public final void mo3082a(C1140e c1140e, String str) {
        m14249b(c1140e, 6004);
        m14262a(C1473m.f7980a.cZ(), ((ex) this.b).f14547e.f12717e, str, ((ex) this.b).f14547e.f12730r, new Document(((ex) this.b).f14550h), c1140e.mo1460c());
        ((ex) this.b).f14557o.clear();
    }

    public final void mo3080a() {
        m14269b(false);
        m14264a(true);
    }

    public final void mo3087d(int i) {
        if (this.b != null) {
            ((ex) this.b).f14555m = i;
        }
    }

    public final /* synthetic */ void mo2973a(C2600d c2600d) {
        super.mo2973a((ex) c2600d);
        if (this.b != null) {
            this.D.mo2814a((C0999d) this);
            if (((ex) this.b).f14543a && !((ex) this.b).f14548f) {
                m14250l();
            }
        }
    }
}
