package com.google.android.finsky.stream.controllers;

import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.finsky.actionbuttons.C1011h;
import com.google.android.finsky.api.C1287h;
import com.google.android.finsky.ba.C1461c;
import com.google.android.finsky.ba.C1556d;
import com.google.android.finsky.bf.C1600a;
import com.google.android.finsky.bg.C1611k;
import com.google.android.finsky.bg.C1617r;
import com.google.android.finsky.cv.p177a.bd;
import com.google.android.finsky.dfemodel.C2720j;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.frameworkviews.ThumbnailImageView;
import com.google.android.finsky.frameworkviews.ae;
import com.google.android.finsky.installqueue.C3340g;
import com.google.android.finsky.navigationmanager.C3748a;
import com.google.android.finsky.navigationmanager.C3760e;
import com.google.android.finsky.p111d.C2482j;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p111d.ad;
import com.google.android.finsky.p147y.C4808a;
import com.google.android.finsky.playcard.C3902b;
import com.google.android.finsky.playcard.C3921v;
import com.google.android.finsky.playcard.C3922w;
import com.google.android.finsky.playcard.FlatCardViewLiveReengagement;
import com.google.android.finsky.playcard.ac;
import com.google.android.finsky.playcard.ao;
import com.google.android.finsky.playcard.cu;
import com.google.android.finsky.playcard.cv;
import com.google.android.finsky.stream.base.C4230c;
import com.google.android.finsky.stream.base.C4239i;
import com.google.android.finsky.stream.base.C4253a;
import com.google.android.finsky.stream.base.C4256g;
import com.google.android.finsky.stream.base.view.C4295c;
import com.google.android.finsky.stream.base.view.FlatCardClusterViewHeader;
import com.squareup.leakcanary.C7582R;
import java.util.ArrayList;
import java.util.List;

public final class bn extends C4253a {
    public C1011h f21942E;
    public C3921v f21943F;
    public C4295c f21944G;
    public cu f21945H;

    protected final int mo4094d() {
        return C7582R.layout.flat_card_live_reengagement;
    }

    protected final int mo4095l() {
        return 1;
    }

    protected final int mo4151n() {
        return C7582R.layout.flat_card_cluster_header;
    }

    public bn(Context context, C3748a c3748a, C4808a c4808a, ad adVar, C4230c c4230c, C1611k c1611k, C1556d c1556d, C4239i c4239i, C2495w c2495w, C3340g c3340g, C1287h c1287h, C1461c c1461c, ao aoVar, ac acVar, C1011h c1011h, cu cuVar) {
        super(context, c3748a, c4808a, adVar, c4230c, c1611k, c1556d, c4239i, c2495w, c3340g, c1287h, c1461c, aoVar, acVar);
        this.f21944G = new C4295c();
        this.D = new C4256g();
        this.f21942E = c1011h;
        this.f21945H = cuVar;
    }

    public final void mo4050a(C2720j c2720j) {
        super.mo4050a(c2720j);
        this.e.getResources();
    }

    protected final void mo4150b(View view) {
        Document document = this.g.f14908a;
        FlatCardClusterViewHeader flatCardClusterViewHeader = (FlatCardClusterViewHeader) view;
        this.f21944G.f21657a = document.f14885a.f12099f;
        this.f21944G.f21658b = document.f14885a.f12100g;
        this.f21944G.f21659c = null;
        this.f21944G.f21660d = null;
        this.f21944G.f21661e = null;
        this.f21944G.f21662f = null;
        flatCardClusterViewHeader.setTextShade(0);
        flatCardClusterViewHeader.mo3611a(this.f21944G, null);
    }

    protected final void mo4063a(Document document, int i, View view) {
        FlatCardViewLiveReengagement flatCardViewLiveReengagement = (FlatCardViewLiveReengagement) view;
        if (flatCardViewLiveReengagement != null) {
            String str;
            OnClickListener onClickListener;
            if (document == null) {
                flatCardViewLiveReengagement.f19385g.setVisibility(8);
                flatCardViewLiveReengagement.setVisibility(4);
            }
            Document document2 = this.g.f14908a;
            if (document2 != null) {
                str = document2.f14885a.f12096c;
            } else {
                str = (String) this.g.m14697k().get(0);
            }
            if (this.f21943F == null) {
                this.f21943F = new C3921v(this.e, this.f, this.f21942E, this.i, this.f21945H);
            }
            C3921v c3921v = this.f21943F;
            C3922w c3922w = new C3922w();
            c3922w.f19859a = document.f14885a.f12100g;
            Object obj = (document.f14885a.f12115v == null || document.f14885a.f12115v.f13114U == null) ? null : 1;
            c3922w.f19860b = (obj != null ? document.f14885a.f12115v.f13114U : null).f12330b;
            c3922w.f19861c = C1617r.m9292a(document.f14885a.f12098e);
            c3922w.f19862d = C1600a.m9198a(document);
            List arrayList = new ArrayList();
            arrayList.add(Integer.valueOf(8));
            c3922w.f19863e = new C3902b(c3921v.f19856c, c3921v.f19855b, c3921v.f19854a, document, flatCardViewLiveReengagement, c3921v.f19857d, arrayList);
            c3922w.f19865g = document.f14885a.f12087D;
            cu cuVar = c3921v.f19858e;
            cv cvVar = null;
            if (cuVar.f19728a) {
                cv cvVar2 = new cv();
                int i2 = document.f14885a.f12098e;
                obj = (i2 == 2 || i2 == 4 || i2 == 24 || i2 == 25) ? 1 : null;
                if (obj == null) {
                    obj = (i2 == 18 || i2 == 19 || i2 == 3) ? 1 : null;
                    if ((i2 == 30 || i2 == 34 || i2 == 8) && !document.m14647d(4)) {
                        obj = 1;
                    }
                    if (cuVar.f19730c == null || cuVar.f19729b == null) {
                        cuVar.m18566a();
                    }
                    if (obj != null) {
                        cuVar.f19729b.setLength(26);
                        cuVar.f19729b.append(document.f14885a.f12096c);
                        cuVar.f19729b.append(':');
                        cuVar.f19729b.append(str);
                        cvVar2.f19732b = cuVar.f19729b.toString();
                    } else {
                        cuVar.f19730c.setLength(30);
                        cuVar.f19730c.append(document.f14885a.f12096c);
                        cuVar.f19730c.append(':');
                        cuVar.f19730c.append(str);
                        cvVar2.f19732b = cuVar.f19730c.toString();
                    }
                    cvVar2.f19731a = true;
                    cvVar = cvVar2;
                } else {
                    cvVar2.f19731a = false;
                    cvVar = cvVar2;
                }
            }
            c3922w.f19864f = cvVar;
            if (this.f == null || !C3760e.m17904a(document)) {
                onClickListener = null;
            } else {
                onClickListener = new bo(this, document, flatCardViewLiveReengagement);
            }
            ad adVar = this.h;
            flatCardViewLiveReengagement.setOnClickListener(onClickListener);
            flatCardViewLiveReengagement.f19380b = adVar;
            if (c3922w.f19864f != null) {
                flatCardViewLiveReengagement.f19385g.getImageView().setTransitionName(c3922w.f19864f.f19732b);
                flatCardViewLiveReengagement.setTransitionGroup(c3922w.f19864f.f19731a);
            }
            C2482j.m13285a(flatCardViewLiveReengagement.getPlayStoreUiElement(), c3922w.f19865g);
            if (flatCardViewLiveReengagement.f19380b != null) {
                flatCardViewLiveReengagement.f19380b.mo1219a(flatCardViewLiveReengagement);
            }
            flatCardViewLiveReengagement.f19386h.setText(c3922w.f19859a);
            flatCardViewLiveReengagement.f19382d.setText(c3922w.f19860b);
            flatCardViewLiveReengagement.f19382d.setVisibility(0);
            flatCardViewLiveReengagement.f19384f = c3922w.f19861c;
            ThumbnailImageView thumbnailImageView = (ThumbnailImageView) flatCardViewLiveReengagement.f19385g.getImageView();
            bd bdVar = c3922w.f19862d;
            if (bdVar == null) {
                thumbnailImageView.a();
            } else if (bdVar != thumbnailImageView.f16228b) {
                float f;
                thumbnailImageView.f16228b = bdVar;
                if (thumbnailImageView.f16228b.f11859e != null) {
                    f = ((float) thumbnailImageView.f16228b.f11859e.f11879c) / ((float) thumbnailImageView.f16228b.f11859e.f11878b);
                } else {
                    f = Float.NaN;
                }
                thumbnailImageView.f16229c = f;
                thumbnailImageView.a(thumbnailImageView.f16228b.f11860f, thumbnailImageView.f16228b.f11863i, thumbnailImageView.A_);
            }
            flatCardViewLiveReengagement.f19383e = c3922w.f19863e;
            flatCardViewLiveReengagement.f19383e.mo3863a(flatCardViewLiveReengagement.f19381c);
        }
    }

    protected final int mo4096m() {
        return C7582R.layout.flat_card_live_reengagement_row;
    }

    public final void c_(View view) {
        ((ae) view).Z_();
    }

    protected final int mo4097o() {
        return 464;
    }
}
