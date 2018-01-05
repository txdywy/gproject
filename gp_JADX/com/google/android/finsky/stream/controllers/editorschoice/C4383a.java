package com.google.android.finsky.stream.controllers.editorschoice;

import android.content.Context;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup.MarginLayoutParams;
import com.google.android.finsky.api.C1287h;
import com.google.android.finsky.ba.C1461c;
import com.google.android.finsky.ba.C1556d;
import com.google.android.finsky.bg.C1611k;
import com.google.android.finsky.cv.p177a.C2440m;
import com.google.android.finsky.cv.p177a.bd;
import com.google.android.finsky.cv.p177a.db;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.dfemodel.ab;
import com.google.android.finsky.frameworkviews.BucketRowLayout;
import com.google.android.finsky.installqueue.C3340g;
import com.google.android.finsky.navigationmanager.C3748a;
import com.google.android.finsky.p111d.C2475d;
import com.google.android.finsky.p111d.C2482j;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p111d.ad;
import com.google.android.finsky.p147y.C4808a;
import com.google.android.finsky.stream.base.C4230c;
import com.google.android.finsky.stream.base.C4239i;
import com.google.android.finsky.stream.base.C4252f;
import com.google.android.finsky.stream.controllers.editorschoice.view.C4382b;
import com.google.android.finsky.stream.controllers.editorschoice.view.C4385c;
import com.google.android.finsky.stream.controllers.editorschoice.view.EditorsChoiceV2CardView;
import com.google.android.finsky.stream.controllers.editorschoice.view.EditorsChoiceV2ClusterBucketRow;
import com.google.android.finsky.stream.controllers.editorschoice.view.EditorsChoiceV2ClusterHeader;
import com.squareup.leakcanary.C7582R;
import java.util.List;

public final class C4383a extends C4252f implements C4382b {
    public final SparseArray f22235E;
    public final C1461c f22236a;
    public final ab f22237b;

    public C4383a(Context context, C3748a c3748a, C4808a c4808a, ad adVar, C4230c c4230c, C1611k c1611k, C1556d c1556d, C4239i c4239i, C2495w c2495w, C3340g c3340g, C1287h c1287h, ab abVar, C1461c c1461c) {
        super(context, c3748a, c4808a, adVar, c4230c, c1611k, c1556d, c4239i, c2495w, c3340g, c1287h, c1461c);
        this.f22236a = c1461c;
        this.f22237b = abVar;
        this.D = new C4384b();
        this.f22235E = new SparseArray();
    }

    protected final int mo4094d() {
        return C7582R.layout.editors_choice_v2_card;
    }

    protected final int mo4095l() {
        return 1;
    }

    protected final int mo4096m() {
        return C7582R.layout.editors_choice_v2_cluster_row;
    }

    protected final int mo4151n() {
        if (this.g == null || !TextUtils.isEmpty(this.g.f14908a.f14885a.f12100g)) {
            return C7582R.layout.editors_choice_v2_cluster_header;
        }
        return -1;
    }

    protected final void mo4150b(View view) {
        if (this.g != null && this.g.f14908a != null) {
            EditorsChoiceV2ClusterHeader editorsChoiceV2ClusterHeader = (EditorsChoiceV2ClusterHeader) view;
            editorsChoiceV2ClusterHeader.f22251a.setText(this.g.f14908a.f14885a.f12100g);
        }
    }

    protected final void mo4063a(Document document, int i, View view) {
        ad adVar = (EditorsChoiceV2CardView) view;
        if (document != null) {
            C4385c c4385c;
            C4385c c4385c2 = (C4385c) this.f22235E.get(i);
            if (c4385c2 == null) {
                c4385c2 = new C4385c();
                c4385c2.f22252a = this.f22236a.dj().mo2294a(12628255);
                c4385c2.f22253b = document.f14885a.f12100g;
                c4385c2.f22257f = document.m14644c(14);
                c4385c2.f22258g = document.m14644c(4);
                c4385c2.f22254c = i;
                c4385c2.f22255d = document.f14885a.f12087D;
                C2440m c2440m = document.f14885a.f12115v;
                db dbVar = c2440m != null ? c2440m.f13115V : null;
                if (dbVar != null) {
                    c4385c2.f22256e = dbVar.f12137b;
                }
                this.f22235E.put(i, c4385c2);
                c4385c = c4385c2;
            } else {
                c4385c = c4385c2;
            }
            adVar.f22240c = this;
            adVar.f22248k = c4385c.f22252a;
            adVar.f22249l = c4385c.f22258g;
            adVar.f22245h = c4385c.f22254c;
            adVar.f22246i = this;
            C2482j.m13285a(adVar.f22239b, c4385c.f22255d);
            adVar.f22241d.setText(c4385c.f22253b);
            List list = c4385c.f22257f;
            if (list != null && list.size() > 0) {
                adVar.f22242e.a(((bd) list.get(0)).f11860f, ((bd) list.get(0)).f11863i, adVar.f22238a);
            }
            if (c4385c.f22252a) {
                adVar.f22243f.setVisibility(0);
                adVar.f22244g.setVisibility(8);
                if (adVar.f22247j != 0) {
                    adVar.m20560b();
                } else {
                    adVar.getViewTreeObserver().addOnGlobalLayoutListener(adVar);
                }
            } else {
                adVar.f22243f.setVisibility(8);
                if (c4385c.f22256e != null) {
                    adVar.f22244g.setVisibility(0);
                    adVar.f22244g.setText(c4385c.f22256e);
                } else {
                    adVar.f22244g.setVisibility(8);
                }
            }
            adVar.setOnClickListener(adVar);
            mo1219a(adVar);
        }
    }

    protected final void mo4064a(BucketRowLayout bucketRowLayout, int i) {
        boolean z = true;
        int i2 = 0;
        if (i != (mo1508a() - (this.f21504t ? 1 : 0)) - 1) {
            z = false;
        }
        EditorsChoiceV2ClusterBucketRow editorsChoiceV2ClusterBucketRow = (EditorsChoiceV2ClusterBucketRow) bucketRowLayout;
        editorsChoiceV2ClusterBucketRow.f22250a = z;
        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) editorsChoiceV2ClusterBucketRow.getLayoutParams();
        if (editorsChoiceV2ClusterBucketRow.f22250a) {
            i2 = editorsChoiceV2ClusterBucketRow.getContext().getResources().getDimensionPixelSize(C7582R.dimen.flat_cluster_to_cluster_bottom_margin);
        }
        marginLayoutParams.bottomMargin = i2;
        editorsChoiceV2ClusterBucketRow.setLayoutParams(marginLayoutParams);
    }

    protected final void c_(View view) {
        ((EditorsChoiceV2CardView) view).Z_();
    }

    protected final int mo4097o() {
        return 462;
    }

    public final void mo4184a(ad adVar, int i) {
        Document document = this.g.m14686a(i) ? (Document) this.g.m14679a(i, false) : null;
        if (document != null) {
            this.i.m13379b(new C2475d(adVar));
            this.f.mo3641a(document.m14657l(), document.f14885a.f12100g, this.f22237b.dn(), this.e.getPackageManager(), null, null, 0, document.f14885a.f12099f, null, 0, this.i);
        }
    }
}
