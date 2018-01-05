package com.google.android.finsky.pagesystem;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcelable;
import android.support.v4.app.C0254u;
import android.support.v4.app.Fragment;
import android.text.TextUtils;
import android.transition.Transition;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.android.volley.C0657w;
import com.android.volley.VolleyError;
import com.google.android.finsky.api.C1254c;
import com.google.android.finsky.api.C1287h;
import com.google.android.finsky.api.C1290m;
import com.google.android.finsky.at.C0998m;
import com.google.android.finsky.at.C1517n;
import com.google.android.finsky.ba.C1461c;
import com.google.android.finsky.bg.C1608h;
import com.google.android.finsky.dfemodel.C1031w;
import com.google.android.finsky.dfemodel.DfeToc;
import com.google.android.finsky.dfemodel.ab;
import com.google.android.finsky.dq.C2877h;
import com.google.android.finsky.layoutswitcher.C1043h;
import com.google.android.finsky.layoutswitcher.C3166e;
import com.google.android.finsky.navigationmanager.C3748a;
import com.google.android.finsky.navigationmanager.C3760e;
import com.google.android.finsky.p106a.C0950c;
import com.google.android.finsky.p106a.C0951d;
import com.google.android.finsky.p111d.C2471a;
import com.google.android.finsky.p111d.C2482j;
import com.google.android.finsky.p111d.C2492t;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p111d.ad;
import com.google.android.finsky.p111d.ah;
import com.google.android.finsky.providers.C3947d;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.play.headerlist.PlayHeaderListLayout;
import com.google.android.play.image.C1294w;
import com.squareup.leakcanary.C7582R;

public abstract class C1045b extends Fragment implements C0657w, C0951d, C0998m, ah, C1031w, C1043h, C1044f {
    public long af = C2482j.m13315j();
    public boolean bA;
    public boolean bB;
    public int bC;
    public C1294w bD;
    public C2492t bE;
    public C1037e bm;
    public Context bn;
    public C1254c bo;
    public C3748a bp;
    public C0950c bq;
    public C1041g br;
    public C3166e bs;
    public ViewGroup bt;
    public String bu;
    public boolean bv;
    public C2495w bw;
    public boolean bx;
    public Runnable by;
    public boolean bz;
    public ab f_;
    public Handler f6429i;
    public DfeToc k_;
    public C1461c n_;
    public C1287h r_;
    public C2471a y_;

    public C1045b() {
        m600f(new Bundle());
    }

    public abstract int mo1298Z();

    public abstract void aa();

    public abstract void cg_();

    public boolean am() {
        return false;
    }

    public boolean an() {
        return am();
    }

    public int mo1344Y() {
        return C7582R.layout.generic_frame;
    }

    public View mo970a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        if (this.bz) {
            m6257b(this.y_.m13179a(this.f760q.getBundle("finsky.PageFragment.loggingContext")));
        }
        ContentFrame contentFrame = (ContentFrame) layoutInflater.inflate(mo1344Y(), viewGroup, false);
        this.bt = contentFrame.m13770a(layoutInflater, mo1298Z(), C7582R.id.page_content);
        this.by = new C3872c(this, contentFrame);
        if (!ag()) {
            this.by.run();
        }
        this.bx = false;
        this.bs = mo1299a(contentFrame);
        FinskyLog.m21670f("Views inflated", new Object[0]);
        return contentFrame;
    }

    public boolean ag() {
        return false;
    }

    public C3166e mo1299a(ContentFrame contentFrame) {
        return new C3166e(contentFrame, C7582R.id.page_content, C7582R.id.loading_indicator, this, 2);
    }

    public void h_() {
        if (this.bq != null) {
            this.bq.mo1260a(this.bt);
        }
        super.h_();
        if (this.f746R != null && this.f746R.getParent() != null) {
            ((ViewGroup) this.f746R.getParent()).clearDisappearingChildren();
        }
    }

    public void mo980v() {
        mo1293j(1706);
        super.mo980v();
    }

    public void mo138d() {
        super.mo138d();
        this.bt = null;
        this.bs = null;
        this.by = null;
        if (this.bq != null) {
            this.bq.mo1261a(null);
            this.bq.mo1276k();
        }
        this.bz = true;
    }

    public void mo1292a(Activity activity) {
        ((C1408h) C3947d.m18649a(C1408h.class)).mo1875a(this);
        this.f6429i = new Handler(activity.getMainLooper());
        super.mo1292a(activity);
    }

    @TargetApi(19)
    public void mo139d(Bundle bundle) {
        super.mo139d(bundle);
        if (((C1037e) m603h()) != this.bm) {
            this.bm = (C1037e) m603h();
            this.bn = m603h();
            this.bp = this.bm.y_();
            this.bq = this.bm.mo1243l();
            this.bm.a_(this.bw);
        }
        if (m603h() instanceof C1041g) {
            this.br = (C1041g) m603h();
        }
        if (this.bm != null) {
            this.bm.mo1242d(null);
        }
        this.bx = false;
        if (this.bq != null) {
            this.bq.mo1261a((C0951d) this);
        }
        if (C3760e.m17903a()) {
            Transition ae = ae();
            if (ae != null) {
                super.m560L().f1598i = ae;
            }
        }
        FinskyLog.m21670f("Views bound", new Object[0]);
    }

    @TargetApi(22)
    public Transition ae() {
        return new C2877h(0);
    }

    public void mo136b(Bundle bundle) {
        super.mo136b(bundle);
        this.bB = bundle != null;
        this.bu = this.f760q.getString("finsky.PageFragment.dfeAccount");
        this.k_ = (DfeToc) this.f760q.getParcelable("finsky.PageFragment.toc");
        this.bo = this.r_.mo2016a(this.bu);
        if (bundle != null) {
            m6257b(this.y_.m13179a(bundle));
        } else if (this.bw == null) {
            m6257b(this.y_.m13179a(this.f760q.getBundle("finsky.PageFragment.loggingContext")));
        }
        this.bx = false;
    }

    public void mo140e(Bundle bundle) {
        this.bw.m13377a(bundle);
        this.bx = true;
    }

    public int ab() {
        return 0;
    }

    public int ad() {
        return 0;
    }

    public void mo979u() {
        super.mo979u();
        C2482j.m13305c(this);
        this.bx = false;
        if (this.bv) {
            this.bv = false;
            m_();
        }
    }

    public void n_() {
        aa();
    }

    public boolean mo1343X() {
        return false;
    }

    public final boolean at() {
        C0254u h = m603h();
        return (this.bx || h == null || ((h instanceof C1035i) && ((C1035i) h).mo1232p())) ? false : true;
    }

    public void f_(int i) {
    }

    public void m_() {
        if (m610k()) {
            O_();
            cg_();
            FinskyLog.m21670f("Views rebound", new Object[0]);
        }
    }

    public void ac() {
    }

    public final void au() {
        this.bs.m16126a(350);
    }

    public void mo1345a(CharSequence charSequence) {
        if (this.bs == null) {
            boolean z;
            boolean z2;
            C0254u h = m603h();
            if (h == null) {
                z = false;
                z2 = false;
            } else {
                z2 = h instanceof C1035i;
                z = z2 ? ((C1035i) h).mo1232p() : false;
            }
            FinskyLog.m21669e("fragmentClass=[%s], mSaveInstanceStateCalled=[%s], activityNull=[%s], isStateSaveMonitor=[%s], isStateSaved=[%s]", getClass().getSimpleName(), Boolean.valueOf(this.bx), Boolean.valueOf(r3), Boolean.valueOf(z2), Boolean.valueOf(z));
            return;
        }
        this.bs.m16127a(1, charSequence);
        if (this.bm != null) {
            this.bm.mo1246z();
        }
        if (this.bA) {
            mo1293j(1705);
        }
    }

    public void O_() {
        this.bs.mo3397a();
    }

    public void mo1062a(VolleyError volleyError) {
        if (!this.bz && at()) {
            mo1345a(C1290m.m7704c(this.bn, volleyError));
        }
    }

    public final void m6259c(String str) {
        if (!TextUtils.isEmpty(str)) {
            m6258b("finsky.PageFragment.dfeAccount", str);
        }
    }

    public final void m6251a(DfeToc dfeToc) {
        if (dfeToc == null && !mo1343X()) {
            FinskyLog.m21669e("Attempted to set a null DfeToc in PageFragment", new Object[0]);
        }
        m6254a("finsky.PageFragment.toc", (Parcelable) dfeToc);
    }

    public void mo2580a(C2495w c2495w) {
        Parcelable bundle = new Bundle();
        c2495w.m13377a((Bundle) bundle);
        m6254a("finsky.PageFragment.loggingContext", bundle);
    }

    public final void m6257b(C2495w c2495w) {
        if (this.bw != c2495w) {
            this.bw = c2495w;
            if (this.bm != null && this.n_.dj().mo2294a(12644614)) {
                this.bm.a_(c2495w);
            }
        }
    }

    public final void m6258b(String str, String str2) {
        this.f760q.putString(str, str2);
    }

    public final void m6253a(String str, int i) {
        this.f760q.putInt(str, i);
    }

    public final void m6254a(String str, Parcelable parcelable) {
        this.f760q.putParcelable(str, parcelable);
    }

    public final void m6262d(String str, boolean z) {
        this.f760q.putBoolean(str, z);
    }

    public final ad getParentNode() {
        return null;
    }

    public final C2495w mo1224n() {
        return this.bw;
    }

    public void mo1219a(ad adVar) {
        C2482j.m13288a(this.f6429i, this.af, this, adVar, this.bw);
    }

    public void o_() {
        this.af = C2482j.m13315j();
    }

    public void mo1222m() {
        C2482j.m13289a(this.f6429i, this.af, (ah) this, this.bw);
    }

    public void p_() {
        if (this.bt instanceof PlayHeaderListLayout) {
            PlayHeaderListLayout playHeaderListLayout = (PlayHeaderListLayout) this.bt;
            playHeaderListLayout.a(new ColorDrawable(0), true);
            playHeaderListLayout.setHeaderShadowMode(2);
        }
    }

    public void q_() {
        if (this.bt instanceof PlayHeaderListLayout) {
            PlayHeaderListLayout playHeaderListLayout = (PlayHeaderListLayout) this.bt;
            playHeaderListLayout.a(new ColorDrawable(af()), true);
            playHeaderListLayout.postDelayed(new C3873d(this, playHeaderListLayout), 200);
        }
    }

    public void mo1202a(int i, Bundle bundle) {
        C1517n.m8867a(i, bundle);
        C0254u h = m603h();
        if (h instanceof C0998m) {
            ((C0998m) h).mo1202a(i, bundle);
        }
    }

    public void mo1211b(int i, Bundle bundle) {
        C1517n.m8869b(i, bundle);
        C0254u h = m603h();
        if (h instanceof C0998m) {
            ((C0998m) h).mo1211b(i, bundle);
        }
    }

    public int af() {
        return C1608h.m9243a(this.bn, 0);
    }

    public int Y_() {
        return this.bn.getResources().getColor(C7582R.color.play_white);
    }

    public int ak() {
        return 1;
    }

    public ad al() {
        return this;
    }

    public final void m6264i(int i) {
        if (this.n_.dj().mo2294a(12627947) && this.bB) {
            this.bA = false;
        } else if (!this.bA) {
            this.bE.m13351a(this.bw, 1703, i);
            this.bC = i;
            this.bA = true;
        }
    }

    public final void mo1293j(int i) {
        mo1294k(i);
        this.bA = false;
    }

    public final void mo1294k(int i) {
        if (this.bA && this.bC > 0) {
            this.bE.m13351a(this.bw, i, this.bC);
        }
    }
}
