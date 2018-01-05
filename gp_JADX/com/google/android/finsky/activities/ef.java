package com.google.android.finsky.activities;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.api.C1289l;
import com.google.android.finsky.at.C1508k;
import com.google.android.finsky.av.C1527a;
import com.google.android.finsky.av.C1530d;
import com.google.android.finsky.ba.C1552e;
import com.google.android.finsky.bg.C1608h;
import com.google.android.finsky.bg.af;
import com.google.android.finsky.bg.ai;
import com.google.android.finsky.cv.p177a.bd;
import com.google.android.finsky.cv.p177a.jf;
import com.google.android.finsky.detailscomponents.DocImageView;
import com.google.android.finsky.dfemodel.C1031w;
import com.google.android.finsky.dfemodel.C2720j;
import com.google.android.finsky.dfemodel.C2721l;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.frameworkviews.DecoratedTextView;
import com.google.android.finsky.frameworkviews.PlayActionButtonV2;
import com.google.android.finsky.installqueue.C1003o;
import com.google.android.finsky.installqueue.C3340g;
import com.google.android.finsky.installqueue.C3369m;
import com.google.android.finsky.installqueue.C3371p;
import com.google.android.finsky.p108z.C4831h;
import com.google.android.finsky.p111d.C2475d;
import com.google.android.finsky.p111d.C2482j;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p111d.ad;
import com.google.android.finsky.p111d.ah;
import com.google.android.finsky.p198f.C3026a;
import com.google.android.finsky.pagesystem.C1045b;
import com.squareup.leakcanary.C7582R;

public final class ef extends bp implements OnClickListener, ah, C1003o {
    public int aA;
    public boolean aB;
    public boolean aC;
    public boolean aD;
    public boolean aE;
    public C1530d aF;
    public Intent aG;
    public boolean aH;
    public long af = C2482j.m13315j();
    public C1473m ag = C1473m.f7980a;
    public C3340g ah = this.ag.bw();
    public jf ai;
    public C2720j aj;
    public final C1031w ak = new eg(this);
    public ViewGroup al;
    public TextView am;
    public ViewGroup an;
    public DecoratedTextView ao;
    public ViewGroup ap;
    public ViewGroup aq;
    public ViewGroup ar;
    public ViewGroup as;
    public TextView at;
    public TextView au;
    public ProgressBar av;
    public ImageView aw;
    public TextView ax;
    public TextView ay;
    public DocImageView az;
    public final Handler f6703i = new Handler(Looper.getMainLooper());

    public static ef m6499a(C1473m c1473m, Document document, String str, C2495w c2495w, Intent intent) {
        String b;
        if (C1473m.f7980a.dj().mo2294a(12622681)) {
            b = C1289l.m7696b(document.f14885a.f12096c);
        } else {
            b = C1289l.m7694a(document.f14885a.f12096c);
        }
        C1045b efVar = new ef();
        efVar.m6319a(c1473m.dn(), b);
        efVar.m6259c(str);
        efVar.m6254a("finsky.DetailsDataBasedFragment.document", (Parcelable) document);
        efVar.mo2580a(c2495w);
        efVar.m6254a("InlineAppPostPurchaseFragment.relaunchInitialDialogIntent", (Parcelable) intent);
        return efVar;
    }

    protected final int mo1298Z() {
        return C7582R.layout.inline_app_post_purchase;
    }

    protected final int k_() {
        return 5401;
    }

    final View m6507b(int i) {
        return this.bt.findViewById(i);
    }

    public final void mo136b(Bundle bundle) {
        super.mo136b(bundle);
        this.aG = (Intent) this.f760q.getParcelable("InlineAppPostPurchaseFragment.relaunchInitialDialogIntent");
    }

    public final View mo970a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C1530d c1530d;
        View a = super.mo970a(layoutInflater, viewGroup, bundle);
        this.al = (ViewGroup) m6507b((int) C7582R.id.app_info_panel);
        this.am = (TextView) this.al.findViewById(C7582R.id.title_title);
        this.az = (DocImageView) this.al.findViewById(C7582R.id.title_thumbnail);
        this.an = (ViewGroup) m6507b((int) C7582R.id.title_creator_panel);
        this.ao = (DecoratedTextView) this.an.findViewById(C7582R.id.title_creator);
        this.ap = (ViewGroup) m6507b((int) C7582R.id.title_details_summary);
        this.aq = (ViewGroup) m6507b((int) C7582R.id.title_details_summary_dynamic);
        this.ar = (ViewGroup) this.aq.findViewById(C7582R.id.button_container);
        this.as = (ViewGroup) this.aq.findViewById(C7582R.id.download_progress_panel);
        this.at = (TextView) this.as.findViewById(C7582R.id.downloading_bytes);
        this.au = (TextView) this.as.findViewById(C7582R.id.downloading_percentage);
        this.av = (ProgressBar) this.as.findViewById(C7582R.id.progress_bar);
        this.aw = (ImageView) this.as.findViewById(C7582R.id.cancel_download);
        this.ax = (TextView) this.aq.findViewById(C7582R.id.summary_dynamic_status);
        this.ay = (TextView) m6507b((int) C7582R.id.cont);
        this.aA = m605i().getDimensionPixelSize(C7582R.dimen.inline_app_thumbnail_size_three_lines);
        C1552e dj = C1473m.f7980a.dj();
        this.aB = !dj.mo2294a(12640210);
        this.aC = dj.mo2294a(12642300);
        if (dj.mo2294a(12642398)) {
            c1530d = new C1530d();
        } else {
            c1530d = null;
        }
        this.aF = c1530d;
        this.aD = dj.mo2294a(12641184);
        C1473m.f7980a.bw().mo3481a((C1003o) this);
        return a;
    }

    public final void mo138d() {
        C1473m.f7980a.bw().mo3484b((C1003o) this);
        if (this.aj != null) {
            this.aj.m11922b(this.ak);
        }
        super.mo138d();
    }

    public final void mo979u() {
        super.mo979u();
        if (this.aH) {
            this.aH = false;
            ap();
        }
    }

    protected final boolean mo1343X() {
        return true;
    }

    protected final void j_() {
        Document document = this.f6511a;
        View view = this.f746R;
        this.ap.setVisibility(0);
        this.am.setText(document.f14885a.f12100g);
        this.ao.setText(document.f14885a.f12102i);
        Resources i = m605i();
        this.az.setScaleType(ScaleType.FIT_START);
        LayoutParams layoutParams = this.az.getLayoutParams();
        layoutParams.width = this.aA;
        layoutParams.height = this.aA;
        C1473m.f7980a.bR();
        bd a = af.m9220a(document, this.aA, this.aA, DocImageView.f13711a);
        this.az.a(a.f11860f, a.f11863i, this.bD);
        this.az.setFocusable(false);
        this.az.setContentDescription(C1608h.m9249a(document.f14885a.f12100g, document.f14885a.f12098e, i));
        ViewGroup viewGroup = (ViewGroup) view.findViewById(C7582R.id.title_content_rating_panel);
        if (viewGroup != null) {
            C1473m.f7980a.ch().m13624a(document, viewGroup);
        }
        aj();
        if (l_() && this.ai == null) {
            this.ai = this.f6511a.m14662q();
            if (this.ai != null) {
                String str = this.ai.f12778e;
                C1473m.f7980a.aO();
                this.aj = C2721l.m14733a(this.bo, str, false, true);
                this.aj.m11918a(this.ak);
                this.aj.m14699n();
            }
        }
        if (this.aB) {
            this.ay.setText(m592c((int) C7582R.string.continue_text).toUpperCase());
            this.ay.setVisibility(0);
            this.ay.setOnClickListener(this);
            return;
        }
        this.ay.setVisibility(8);
    }

    public final void mo1202a(int i, Bundle bundle) {
        super.mo1202a(i, bundle);
        if (this.aC && i == 1) {
            ao();
        }
    }

    private final void aj() {
        this.aq.setVisibility(0);
        String str = this.f6511a.m14625N().f13171k;
        C3371p c = this.ah.mo3485c(str);
        switch (c.f17276a) {
            case 0:
                this.ax.setVisibility(4);
                this.as.setVisibility(4);
                PlayActionButtonV2 playActionButtonV2 = (PlayActionButtonV2) this.ar.findViewById(C7582R.id.launch_button);
                Document document = this.f6511a;
                C3026a a = C1473m.f7980a.bt().m15626a(document.m14625N().f13171k);
                if (!a.f15831s || a.f15832t) {
                    playActionButtonV2.setVisibility(8);
                    if (a.f15820h) {
                        m6500f(C7582R.string.app_install_success);
                    } else {
                        m6500f(C7582R.string.generic_get_app_error);
                    }
                } else {
                    playActionButtonV2.m6000a(document.f14885a.f12099f, (int) C7582R.string.open, this.bp.mo3626a(document, this.bo.mo1620b(), (ad) this, this.bw));
                    playActionButtonV2.setActionStyle(0);
                    playActionButtonV2.setVisibility(0);
                }
                ai.m9228a(this.ar, 4);
                return;
            case 3:
                m6500f(C7582R.string.installing);
                return;
            case 4:
                m6500f(C7582R.string.uninstalling);
                return;
            default:
                this.ar.setVisibility(4);
                this.ax.setVisibility(4);
                C1473m.f7980a.bV();
                C1527a.m8948a(this.bn, c, this.at, this.au, this.av, this.aF);
                if (this.aD) {
                    C1527a.m8949a(c, m6507b((int) C7582R.id.download_status), m6507b((int) C7582R.id.download_now), str, C1473m.f7980a.mo2256o(), this.bw, getParentNode());
                }
                this.aw.setOnClickListener(this);
                if (c.f17276a == 1) {
                    this.at.setText(C7582R.string.download_pending);
                }
                this.as.setVisibility(0);
                if (this.aC) {
                    boolean z = C1527a.m8952a(c) && C1527a.m8953b(c) >= 100;
                    this.aE = z;
                    if (this.aE) {
                        ap();
                        return;
                    }
                    return;
                }
                return;
        }
    }

    private final void m6500f(int i) {
        this.ar.setVisibility(4);
        this.as.setVisibility(4);
        this.ax.setText(this.bn.getResources().getString(i));
        this.ax.setVisibility(0);
    }

    private final void ao() {
        this.bw.m13379b(new C2475d(this).m13256a(2917));
        this.ah.m16742a(this.f6511a.m14625N().f13171k).mo4398a(C4831h.f25111a);
        this.as.setVisibility(4);
    }

    private final void ap() {
        if (cM_()) {
            this.aH = true;
            return;
        }
        Fragment a = this.f730B.mo283a("cancel_confirmation");
        if (a != null) {
            this.f730B.mo284a().mo327a(a).mo334c();
        }
    }

    public final void onClick(View view) {
        if (view == this.ay && this.aB) {
            this.bw.m13379b(new C2475d(this).m13256a(5403));
            m603h().finish();
        } else if (view != this.aw) {
        } else {
            if (!this.aC) {
                ao();
            } else if (!this.aE) {
                this.f730B.mo284a().mo328a(new C1508k().m8852a(m605i().getString(C7582R.string.inline_details_app_download_cancel_confirmation_prompt, new Object[]{this.f6511a.f14885a.f12100g})).m8860d((int) C7582R.string.inline_details_app_download_cancel_confirmation_positive).m8862e((int) C7582R.string.inline_details_app_download_cancel_confirmation_negative).m8851a(this, 1, null).mo2272a(), "cancel_confirmation").mo334c();
            }
        }
    }

    public final void mo1205a(C3369m c3369m) {
        if (c3369m.m16819a().equals(this.f6511a.m14625N().f13171k)) {
            switch (c3369m.f17273c.f17153d) {
                case 2:
                    if (this.aG != null) {
                        this.bw.m13376a(this.aG);
                        m580a(this.aG);
                        this.aG = null;
                    }
                    m603h().finish();
                    return;
                case 4:
                    if (this.aC) {
                        ap();
                        break;
                    }
                    break;
            }
            aj();
        }
    }

    public final void o_() {
        this.af = C2482j.m13315j();
    }

    public final void mo1222m() {
        C2482j.m13289a(this.f6703i, this.af, (ah) this, this.bw);
    }

    public final void mo1219a(ad adVar) {
        C2482j.m13288a(this.f6703i, this.af, this, adVar, this.bw);
    }
}
