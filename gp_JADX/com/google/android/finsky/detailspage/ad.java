package com.google.android.finsky.detailspage;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.v7.widget.ff;
import android.view.View;
import com.google.android.finsky.api.C1254c;
import com.google.android.finsky.by.C2206c;
import com.google.android.finsky.detailsmodules.p183a.C2597a;
import com.google.android.finsky.detailsmodules.p183a.C2598b;
import com.google.android.finsky.detailsmodules.p183a.C2599c;
import com.google.android.finsky.detailsmodules.p183a.C2600d;
import com.google.android.finsky.dfemodel.C2719i;
import com.google.android.finsky.dfemodel.DfeToc;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.navigationmanager.C3748a;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.pagesystem.C1045b;
import com.google.android.play.image.C1294w;
import com.squareup.leakcanary.C7582R;
import java.util.ArrayList;
import java.util.List;

public class ad extends ck implements C2599c, bm, gn {
    public go f14224d;
    public bk f14225e;
    public gy f14226f;
    public gq f14227g;
    public List f14228h;
    public boolean f14229i;
    public boolean f14230j;
    public boolean f14231k;

    public final int mo2978e() {
        return 1;
    }

    public final int mo2977c(int i) {
        return C7582R.layout.combined_title_module;
    }

    public final void mo3029a(Context context, C2599c c2599c, DfeToc dfeToc, C1254c c1254c, C1254c c1254c2, C1294w c1294w, C3748a c3748a, C1045b c1045b, String str, String str2, C2206c c2206c, boolean z, String str3, boolean z2, ff ffVar, com.google.android.finsky.p111d.ad adVar, C2495w c2495w) {
        super.mo3029a(context, c2599c, dfeToc, c1254c, c1254c2, c1294w, c3748a, c1045b, str, str2, c2206c, z, str3, z2, ffVar, adVar, c2495w);
        this.f14224d = new go();
        this.f14227g = new gq();
        this.f14225e = new bk();
        this.f14226f = new gy();
        this.f14228h = new ArrayList();
        this.f14228h.add(this.f14224d);
        this.f14228h.add(this.f14227g);
        this.f14228h.add(this.f14225e);
        this.f14228h.add(this.f14226f);
        for (int i = 0; i < this.f14228h.size(); i++) {
            ((ck) this.f14228h.get(i)).mo3029a(context, this, dfeToc, c1254c, c1254c2, c1294w, c3748a, c1045b, str, str2, c2206c, z, str3, z2, ffVar, adVar, c2495w);
        }
    }

    public final boolean mo2979f() {
        return this.f14224d.mo2979f();
    }

    public final void mo2974a(boolean z, Document document, C2719i c2719i, Document document2, C2719i c2719i2) {
        for (int i = 0; i < this.f14228h.size(); i++) {
            ((ck) this.f14228h.get(i)).mo2974a(z, document, c2719i, document2, c2719i2);
        }
    }

    public final void mo2976b(View view, int i) {
        CombinedTitleModuleLayout combinedTitleModuleLayout = (CombinedTitleModuleLayout) view;
        this.f14224d.mo2976b(combinedTitleModuleLayout.getTitleModuleLayout(), i);
        View discoveryBarModuleLayout = combinedTitleModuleLayout.getDiscoveryBarModuleLayout();
        if (this.f14225e.mo2979f()) {
            this.f14225e.mo2976b(discoveryBarModuleLayout, i);
            this.f14229i = true;
            discoveryBarModuleLayout.setVisibility(0);
        } else {
            discoveryBarModuleLayout.setVisibility(8);
        }
        discoveryBarModuleLayout = combinedTitleModuleLayout.getWarningMessageModuleView();
        if (this.f14226f.mo2979f()) {
            this.f14226f.mo2976b(discoveryBarModuleLayout, i);
            this.f14230j = true;
            discoveryBarModuleLayout.setVisibility(0);
        } else {
            discoveryBarModuleLayout.setVisibility(8);
        }
        discoveryBarModuleLayout = combinedTitleModuleLayout.getTopChartRankingInfoModuleLayout();
        if (this.f14227g.mo2979f()) {
            this.f14231k = true;
            this.f14227g.mo2976b(discoveryBarModuleLayout, i);
            discoveryBarModuleLayout.setVisibility(0);
            return;
        }
        discoveryBarModuleLayout.setVisibility(8);
    }

    public final void mo3037c(View view, int i) {
        CombinedTitleModuleLayout combinedTitleModuleLayout = (CombinedTitleModuleLayout) view;
        this.f14224d.mo3037c(combinedTitleModuleLayout.getTitleModuleLayout(), i);
        if (this.f14229i) {
            this.f14225e.mo3037c(combinedTitleModuleLayout.getDiscoveryBarModuleLayout(), i);
        }
        if (this.f14230j) {
            this.f14226f.mo3037c(combinedTitleModuleLayout.getWarningMessageModuleView(), i);
        }
        if (this.f14231k) {
            this.f14227g.mo3037c(combinedTitleModuleLayout.getTopChartRankingInfoModuleLayout(), i);
        }
        super.mo3037c(view, i);
    }

    public final void mo2980h() {
        for (int i = 0; i < this.f14228h.size(); i++) {
            ((ck) this.f14228h.get(i)).mo2980h();
        }
    }

    public final void mo1202a(int i, Bundle bundle) {
        this.f14224d.mo1202a(i, bundle);
    }

    public final void mo1211b(int i, Bundle bundle) {
    }

    public final void mo3033a(C2598b c2598b, boolean z) {
        if (mo2979f()) {
            this.u.mo3033a(this, false);
        }
    }

    public final void mo3032a(C2598b c2598b) {
        if (mo2979f()) {
            this.u.mo3033a(this, false);
        }
    }

    public final void mo3036b(String str, Object obj) {
        this.u.mo3036b(str, obj);
    }

    public final void mo3034a(String str, Object obj) {
        for (int i = 0; i < this.f14228h.size(); i++) {
            ((ck) this.f14228h.get(i)).mo3034a(str, obj);
        }
    }

    public final void mo3031a(C2597a c2597a, int i, int i2) {
    }

    public final void mo3035b(C2597a c2597a, int i, int i2) {
    }

    public final void mo3038c(C2597a c2597a, int i, int i2) {
    }

    public final void mo3030a(Bitmap bitmap) {
        this.f14224d.mo3030a(bitmap);
    }

    public final void mo3028a() {
        this.f14224d.mo3028a();
    }

    public final /* synthetic */ C2600d mo3039g() {
        if (this.b == null) {
            this.b = new ae();
        }
        ((ae) this.b).f14232a = (gp) this.f14224d.mo3039g();
        ((ae) this.b).f14233b = (bl) this.f14225e.mo3039g();
        ((ae) this.b).f14234c = (hd) this.f14226f.mo3039g();
        ((ae) this.b).f14235d = (gr) this.f14227g.mo3039g();
        return (ae) super.mo3039g();
    }

    public final /* synthetic */ void mo2973a(C2600d c2600d) {
        super.mo2973a((ae) c2600d);
        if (this.b != null) {
            this.f14224d.m14397a(((ae) this.b).f14232a);
            this.f14225e.mo2973a(((ae) this.b).f14233b);
            this.f14226f.m14433a(((ae) this.b).f14234c);
            this.f14227g.mo2973a(((ae) this.b).f14235d);
        }
    }
}
