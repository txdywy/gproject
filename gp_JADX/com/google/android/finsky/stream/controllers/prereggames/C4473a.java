package com.google.android.finsky.stream.controllers.prereggames;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.finsky.aa.C0954a;
import com.google.android.finsky.api.C1287h;
import com.google.android.finsky.ba.C1461c;
import com.google.android.finsky.ba.C1556d;
import com.google.android.finsky.bg.C1611k;
import com.google.android.finsky.dfemodel.C2720j;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.installqueue.C3340g;
import com.google.android.finsky.navigationmanager.C3748a;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p111d.ad;
import com.google.android.finsky.p147y.C4808a;
import com.google.android.finsky.playcard.FlatCardViewPreregistrableGame;
import com.google.android.finsky.playcard.ac;
import com.google.android.finsky.playcard.ao;
import com.google.android.finsky.playcard.ct;
import com.google.android.finsky.stream.base.C4230c;
import com.google.android.finsky.stream.base.C4239i;
import com.google.android.finsky.stream.base.C4253a;
import com.google.android.finsky.stream.base.C4254d;
import com.google.android.finsky.stream.base.C4256g;
import com.google.android.finsky.stream.base.view.C3687d;
import com.google.android.finsky.stream.base.view.C4295c;
import com.google.android.finsky.stream.base.view.FlatCardClusterViewHeader;
import com.squareup.leakcanary.C7582R;

public final class C4473a extends C4253a implements OnClickListener, C3687d {
    public final C4254d f22730E;
    public ct f22731F;
    public int f22732G;
    public boolean f22733H;
    public C4295c f22734I;
    public boolean f22735J;

    public C4473a(Context context, C3748a c3748a, C4808a c4808a, ad adVar, C4230c c4230c, C1611k c1611k, C1556d c1556d, C4239i c4239i, C2495w c2495w, C3340g c3340g, C1287h c1287h, C1461c c1461c, ao aoVar, C4254d c4254d, ac acVar) {
        super(context, c3748a, c4808a, adVar, c4230c, c1611k, c1556d, c4239i, c2495w, c3340g, c1287h, c1461c, aoVar, acVar);
        this.f22732G = -1;
        this.f22733H = false;
        this.f22735J = false;
        this.D = new C4256g();
        this.f22730E = c4254d;
    }

    public final void mo4050a(C2720j c2720j) {
        boolean z = false;
        super.mo4050a(c2720j);
        Document document = this.g.f14908a;
        String a = this.f22730E.m19769a(this.e, document, document.m14638a(), null, false);
        this.f22734I = new C4295c();
        this.f22734I.f21657a = document.f14885a.f12099f;
        this.f22734I.f21658b = document.f14885a.f12100g;
        this.f22734I.f21659c = document.f14885a.f12101h;
        this.f22734I.f21660d = a;
        this.f22734I.f21661e = null;
        this.f22734I.f21662f = null;
        m20884e();
        Document document2 = this.g.f14908a;
        if (document2.m14656k() || !TextUtils.isEmpty(document2.f14885a.f12116w) || (document2.m14660o() && !TextUtils.isEmpty(document2.f14885a.f12111r.f12016b))) {
            z = true;
        }
        this.f22735J = z;
    }

    protected final int mo4094d() {
        return C7582R.layout.flat_card_preregistrable_game;
    }

    protected final int mo4095l() {
        return 1;
    }

    protected final int mo4096m() {
        return C7582R.layout.preregistrable_game_row;
    }

    protected final int mo4151n() {
        if (this.g.f14908a == null || TextUtils.isEmpty(this.g.f14908a.f14885a.f12100g)) {
            return -1;
        }
        return C7582R.layout.preregistrable_games_cluster_header;
    }

    protected final void mo4150b(View view) {
        C3687d c3687d;
        FlatCardClusterViewHeader flatCardClusterViewHeader = (FlatCardClusterViewHeader) view;
        C4295c c4295c = this.f22734I;
        if (!this.f22735J) {
            c3687d = null;
        }
        flatCardClusterViewHeader.mo3611a(c4295c, c3687d);
    }

    protected final void mo4063a(Document document, int i, View view) {
        super.mo4063a(document, i, view);
        if (this.c.f8336a.dj().mo2294a(12638773) && !((Boolean) C0954a.aO.m5760a()).booleanValue() && !this.f22733H && document.aN() && this.f22732G != -1 && this.f22732G == i) {
            this.f22733H = true;
            FlatCardViewPreregistrableGame flatCardViewPreregistrableGame = (FlatCardViewPreregistrableGame) view;
            if (this.f22731F == null) {
                this.f22731F = new C4474b();
            }
            flatCardViewPreregistrableGame.setTooltipEnabled(this.f22731F);
        }
    }

    private final void m20884e() {
        if (!((Boolean) C0954a.aO.m5760a()).booleanValue() && !this.f22733H && this.f22732G == -1) {
            int i;
            if (this.g != null) {
                i = 0;
                while (i < this.g.m14698m()) {
                    if (((Document) this.g.m14679a(i, true)).aN()) {
                        break;
                    }
                    i++;
                }
            }
            i = -1;
            this.f22732G = i;
        }
    }

    protected final int mo4097o() {
        return 470;
    }

    public final void m_() {
        m20884e();
        super.m_();
    }

    public final void onClick(View view) {
        this.f.mo3655a(this.g.f14908a, (ad) this, this.i);
    }

    public final void mo3579a(View view) {
        onClick(view);
    }

    public final void mo3580c(View view) {
        onClick(view);
    }
}
