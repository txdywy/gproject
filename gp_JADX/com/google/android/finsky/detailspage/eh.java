package com.google.android.finsky.detailspage;

import android.content.Context;
import android.content.res.Resources;
import android.support.v7.widget.ff;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.api.C1254c;
import com.google.android.finsky.bg.C1611k;
import com.google.android.finsky.bg.C1617r;
import com.google.android.finsky.bg.af;
import com.google.android.finsky.by.C2206c;
import com.google.android.finsky.cv.p177a.bd;
import com.google.android.finsky.cv.p177a.jf;
import com.google.android.finsky.detailsmodules.p183a.C2599c;
import com.google.android.finsky.dfemodel.C2711x;
import com.google.android.finsky.dfemodel.C2712a;
import com.google.android.finsky.dfemodel.DfeToc;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.layout.C3676f;
import com.google.android.finsky.navigationmanager.C3748a;
import com.google.android.finsky.p111d.C2482j;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p111d.ad;
import com.google.android.finsky.p148b.C1542f;
import com.google.android.finsky.pagesystem.C1045b;
import com.google.android.finsky.stream.base.C4254d;
import com.google.android.finsky.stream.base.playcluster.C1158a;
import com.google.android.finsky.stream.base.view.C3688e;
import com.google.android.finsky.stream.base.view.FlatCardClusterView;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.play.image.C1294w;
import com.google.android.play.image.x;
import com.google.android.play.image.y;
import com.google.android.play.layout.d;
import com.google.wireless.android.a.a.a.a.ce;
import com.squareup.leakcanary.C7582R;

public abstract class eh extends ej implements OnClickListener, ad, co, C1158a {
    public final C4254d f14402o = C1473m.f7980a.ct();
    public C3676f f14403p;
    public int f14404q;
    public ce f14405r = C2482j.m13283a(400);

    protected abstract jf mo3067b(Document document);

    public final void m14115a(Context context, C2599c c2599c, DfeToc dfeToc, C1254c c1254c, C1254c c1254c2, C1294w c1294w, C3748a c3748a, C1045b c1045b, String str, String str2, C2206c c2206c, boolean z, String str3, boolean z2, ff ffVar, ad adVar, C2495w c2495w, C3676f c3676f) {
        super.mo3029a(context, c2599c, dfeToc, c1254c, c1254c2, c1294w, c3748a, c1045b, str, str2, c2206c, z, str3, z2, ffVar, adVar, c2495w);
        this.f14403p = c3676f;
        this.f14404q = this.t.getResources().getDimensionPixelSize(C7582R.dimen.flat_cluster_to_cluster_bottom_margin);
    }

    public final int mo2977c(int i) {
        return C7582R.layout.flat_card_cluster;
    }

    public final boolean mo2979f() {
        return super.mo2979f() && ((ei) this.b).e.m14698m() != 0;
    }

    protected void aa_() {
        super.aa_();
        if (((ei) this.b).e.mo2861a()) {
            m14108d();
        }
    }

    public final void mo2976b(View view, int i) {
        String str;
        int integer;
        C3688e c3688e = (FlatCardClusterView) view;
        Document document = ((ei) this.b).e.f14908a;
        Resources resources = this.t.getResources();
        int c = C1473m.f7980a.av().m9278c(resources);
        bd bdVar = document.m14660o() ? document.f14885a.f12111r.f12023i : null;
        if (TextUtils.isEmpty(((ei) this.b).f14473a.f12776c)) {
            str = document.f14885a.f12100g;
        } else {
            str = ((ei) this.b).f14473a.f12776c;
        }
        C1473m.f7980a.mo2027G();
        CharSequence a = C1542f.m8970a(document);
        String a2 = this.f14402o.m19769a(this.t, document, c3688e.getMaxItemsPerPage(), ((ei) this.b).f14473a.f12779f, true);
        c3688e.m17483a(document.f14885a.f12087D, this.I);
        C1611k av = C1473m.f7980a.av();
        if (av.m9285j(resources)) {
            integer = resources.getInteger(C7582R.integer.flat_grid_column_count_in_details);
        } else {
            integer = av.m9284i(resources);
        }
        c3688e.m17486a(document.f14885a.f12099f, str, null, a2, this, bdVar, a, 0, this, this.f14403p.m17439a(((ei) this.b).f14474b), integer, c, this.H, ((ei) this.b).f14475c, null);
    }

    public void m_() {
        m14108d();
        if (((ei) this.b).e.m14698m() != 0) {
            this.u.mo3033a(this, false);
        }
    }

    private final void m14108d() {
        Document document = ((ei) this.b).e.f14908a;
        if (document != null && document.f14885a.f12087D != null) {
            C2482j.m13285a(this.f14405r, document.f14885a.f12087D);
        }
    }

    public void onClick(View view) {
        if (mo2979f()) {
            int i;
            C3748a c3748a = this.z;
            String str = ((ei) this.b).f14473a.f12779f;
            C2712a c2712a = ((ei) this.b).e;
            if (c2712a.m14707c()) {
                i = c2712a.f14908a.f14885a.f12099f;
            } else {
                i = 0;
            }
            c3748a.mo3673a(str, null, i, ((ei) this.b).e.mo3121d(), this.v, (ad) this, this.J);
            return;
        }
        FinskyLog.m21669e("Module is not ready to handle click", new Object[0]);
    }

    public final String mo1480a() {
        return ((ei) this.b).e.f14928d;
    }

    public final int mo1477a(int i) {
        return ((ei) this.b).f14474b;
    }

    public final boolean mo1484b() {
        return false;
    }

    public final x mo1479a(int i, int i2, int i3, y yVar, int[] iArr) {
        C2711x c2711x = ((ei) this.b).e;
        Document document = i < c2711x.m14698m() ? (Document) c2711x.m14679a(i, true) : null;
        C1473m.f7980a.bR();
        return af.m9223a(this.t, document, this.y, i2, i3, yVar, iArr);
    }

    public final int mo1486c() {
        return ((ei) this.b).e.m14698m();
    }

    public final float mo1482b(int i) {
        C2711x c2711x = ((ei) this.b).e;
        Document document = i < c2711x.m14698m() ? (Document) c2711x.m14679a(i, true) : null;
        if (document != null) {
            return C1617r.m9292a(document.f14885a.f12098e);
        }
        return 0.0f;
    }

    public ce getPlayStoreUiElement() {
        return this.f14405r;
    }

    public ad getParentNode() {
        return this.I;
    }

    public final void mo1219a(ad adVar) {
        C2482j.m13291a((ad) this, adVar);
    }

    public final int mo3053a(int i, int i2) {
        return i == 0 ? this.f14404q : 0;
    }

    public final int mo3054i() {
        return 0;
    }

    protected final /* synthetic */ ek mo3047a(Document document) {
        jf b = mo3067b(document);
        if (b == null || TextUtils.isEmpty(b.f12778e)) {
            return null;
        }
        ek eiVar = new ei();
        eiVar.d = b.f12778e;
        eiVar.f14473a = b;
        eiVar.f14474b = C1473m.f7980a.mo2245h().m18478a(false);
        return eiVar;
    }

    public final /* synthetic */ int mo1478a(View view) {
        return ((d) view).getThumbnail().getChildAt(0).getHeight();
    }

    public final /* synthetic */ int mo1483b(View view) {
        return ((d) view).getThumbnail().getChildAt(0).getWidth();
    }

    public final /* synthetic */ float mo1485c(View view) {
        return C1617r.m9292a(((Document) ((d) view).getData()).f14885a.f12098e);
    }

    public final /* synthetic */ void mo1481a(View view, int i) {
        d dVar = (d) view;
        C2711x c2711x = ((ei) this.b).e;
        Document document = i < c2711x.m14698m() ? (Document) c2711x.m14679a(i, true) : null;
        if (document != null) {
            String str;
            if (c2711x.f14908a != null) {
                str = c2711x.f14908a.f14885a.f12096c;
            } else {
                str = c2711x.f14928d;
            }
            C1473m.f7980a.cr().m18516a(dVar, document, i, str, this.z, false, null, this, true, false, false, this.J, null);
            return;
        }
        dVar.d();
    }
}
