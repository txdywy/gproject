package com.google.android.finsky.activities;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.net.Uri.Builder;
import android.os.AsyncTask;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v4.view.af;
import android.support.v4.view.bi;
import android.support.v4.view.p039b.C0344b;
import android.support.v7.widget.ff;
import android.text.TextUtils;
import android.transition.Transition;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.FrameLayout.LayoutParams;
import android.widget.TextView;
import com.android.volley.C0657w;
import com.android.volley.VolleyError;
import com.google.android.finsky.C1406o;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.aa.C0954a;
import com.google.android.finsky.accounts.C0988c;
import com.google.android.finsky.ba.C1461c;
import com.google.android.finsky.ba.C1552e;
import com.google.android.finsky.bg.C1601a;
import com.google.android.finsky.bg.C1608h;
import com.google.android.finsky.bg.C1611k;
import com.google.android.finsky.bl.C2116a;
import com.google.android.finsky.by.C2206c;
import com.google.android.finsky.detailscomponents.C2581g;
import com.google.android.finsky.dfemodel.C1031w;
import com.google.android.finsky.dfemodel.C2335k;
import com.google.android.finsky.dfemodel.C2711x;
import com.google.android.finsky.dfemodel.C2717g;
import com.google.android.finsky.dfemodel.C2720j;
import com.google.android.finsky.dfemodel.C2721l;
import com.google.android.finsky.dfemodel.C2730u;
import com.google.android.finsky.dfemodel.DfeToc;
import com.google.android.finsky.dq.C2877h;
import com.google.android.finsky.ea.C2963c;
import com.google.android.finsky.ea.C2964d;
import com.google.android.finsky.ea.C2965g;
import com.google.android.finsky.frameworkviews.InsetsFrameLayout;
import com.google.android.finsky.frameworkviews.ah;
import com.google.android.finsky.headerlistlayout.C3161c;
import com.google.android.finsky.headerlistlayout.C3167i;
import com.google.android.finsky.headerlistlayout.FinskyHeaderListLayout;
import com.google.android.finsky.headerlistlayout.FinskyTabStrip;
import com.google.android.finsky.ia2.C1072x;
import com.google.android.finsky.ia2.C3226c;
import com.google.android.finsky.ia2.C3228d;
import com.google.android.finsky.ia2.C3242v;
import com.google.android.finsky.ia2.Ia2SubNavView;
import com.google.android.finsky.layout.C3685o;
import com.google.android.finsky.layout.play.FinskyViewPager;
import com.google.android.finsky.layoutswitcher.C3166e;
import com.google.android.finsky.p106a.C0948a;
import com.google.android.finsky.p111d.C2475d;
import com.google.android.finsky.p111d.C2482j;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p111d.ad;
import com.google.android.finsky.p111d.al;
import com.google.android.finsky.p147y.C4808a;
import com.google.android.finsky.pagesystem.C1045b;
import com.google.android.finsky.pagesystem.C1052j;
import com.google.android.finsky.pagesystem.ContentFrame;
import com.google.android.finsky.providers.C3947d;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.ac;
import com.google.android.finsky.utils.bb;
import com.google.android.libraries.bind.p117b.C5872c;
import com.google.android.play.animation.C6242e;
import com.google.android.play.headerlist.PlayHeaderListLayout;
import com.google.android.play.headerlist.PlayHeaderListTabStrip;
import com.google.android.play.headerlist.n;
import com.google.android.play.utils.k;
import com.google.wireless.android.a.a.a.a.ce;
import com.google.wireless.android.finsky.dfe.nano.ab;
import com.google.wireless.android.finsky.dfe.nano.gj;
import com.google.wireless.android.finsky.dfe.nano.z;
import com.squareup.leakcanary.C7582R;
import java.lang.reflect.Field;
import java.util.ArrayList;

public final class gn extends C1052j implements bi, gm, al, ah, C1072x, n {
    public C2717g f6892a;
    public FinskyTabStrip aA;
    public C3161c aB;
    public AsyncTask aC;
    public AsyncTask aD;
    public ff aE;
    public C2964d aF;
    public C0988c aG;
    public C2206c aH;
    public C2581g aI;
    public C1611k aJ;
    public C2965g aK;
    public C2116a aL;
    public Ia2SubNavView aM;
    public int aN;
    public int ag;
    public int ah = 3;
    public int ai = -1;
    public ac aj = new ac();
    public ce ak = C2482j.m13283a(1);
    public boolean al;
    public int am;
    public int an;
    public boolean ao;
    public boolean ap;
    public gq aq;
    public boolean ar;
    public FinskyViewPager as;
    public FinskyHeaderListLayout at;
    public C0948a au;
    public gk av;
    public ViewGroup aw;
    public C3685o ax;
    public ViewGroup az;
    public boolean f6893c;
    public int f6894e = 0;
    public int f6895f = 0;
    public int f6896g = 0;
    public String f6897h;
    public C1461c n_;
    public C2720j[] s_;

    public static gn m6631a(String str, String str2, int i, DfeToc dfeToc, C2495w c2495w) {
        return m6632a(str, str2, false, i, 0, dfeToc, c2495w);
    }

    public static gn m6632a(String str, String str2, boolean z, int i, int i2, DfeToc dfeToc, C2495w c2495w) {
        C1045b gnVar = new gn();
        if (i >= 0) {
            gnVar.f6894e = i;
        }
        if (i2 != 0) {
            gnVar.f6895f = i2;
        }
        if (!TextUtils.isEmpty(str2)) {
            gnVar.f6897h = str2;
        }
        gnVar.m6319a(dfeToc, str);
        gnVar.mo2580a(c2495w);
        gnVar.m6262d("TabbedBrowseFragment.IsFromDeeplink", z);
        return gnVar;
    }

    private final boolean aq() {
        if (this.al) {
            return true;
        }
        boolean z;
        DfeToc dfeToc = this.k_;
        DfeToc dfeToc2 = this.k_;
        CharSequence charSequence = this.bF;
        if (TextUtils.equals(charSequence, dfeToc2.f14881a.f31765h) || TextUtils.equals(charSequence, dfeToc2.f14881a.f31766i)) {
            z = true;
        } else {
            z = false;
        }
        if (!z || dfeToc.m14609b().size() <= 1) {
            return false;
        }
        return true;
    }

    public final void mo1292a(Activity activity) {
        ((C1406o) C3947d.m18649a(C1406o.class)).mo1704a(this);
        super.mo1292a(activity);
    }

    public final void mo136b(Bundle bundle) {
        int i = 1;
        super.mo136b(bundle);
        m6635l(1703);
        this.f740L = true;
        if (!aq()) {
            i = 0;
        }
        this.ag = i;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo139d(android.os.Bundle r11) {
        /*
        r10 = this;
        r9 = 400; // 0x190 float:5.6E-43 double:1.976E-321;
        r8 = 2;
        r1 = 1;
        r2 = 0;
        super.mo139d(r11);
        r0 = r10.aL;
        r0 = r0.m11023b();
        r10.aN = r0;
        r0 = r10.bp;
        r0 = r0.mo3680a();
        if (r0 == 0) goto L_0x0033;
    L_0x0018:
        r0 = com.google.android.finsky.C1473m.f7980a;
        r0 = r0.aN();
        r0 = r0.dj();
        r4 = 12630046; // 0xc0b81e float:1.7698464E-38 double:6.240072E-317;
        r3 = r0.mo2294a(r4);
        if (r3 == 0) goto L_0x0033;
    L_0x002b:
        r3 = r10.aC;
        if (r3 != 0) goto L_0x0033;
    L_0x002f:
        r3 = r10.aD;
        if (r3 == 0) goto L_0x012a;
    L_0x0033:
        r0 = r10.f6893c;
        if (r0 != 0) goto L_0x01c3;
    L_0x0037:
        r10.au();
        r0 = 1718; // 0x6b6 float:2.407E-42 double:8.49E-321;
        r10.m6635l(r0);
        r10.aa();
        r10.ac();
    L_0x0045:
        r0 = r10.bq;
        r0.mo1259a();
        if (r11 != 0) goto L_0x01c8;
    L_0x004c:
        r0 = r1;
    L_0x004d:
        r3 = r10.bF;
        r4 = r10.k_;
        r4 = r4.f14881a;
        r4 = r4.f31765h;
        r3 = r3.equals(r4);
        if (r3 == 0) goto L_0x0093;
    L_0x005b:
        r3 = com.google.android.finsky.C1473m.f7980a;
        r3 = r3.aY();
        r3 = r3.mo2316f();
        if (r3 == 0) goto L_0x0093;
    L_0x0067:
        r3 = new com.google.android.finsky.family.b.a;
        r4 = r10.bp;
        r5 = r10.bm;
        r6 = r10.bw;
        r6 = r6.m13365a();
        r3.<init>(r4, r5, r0, r6);
        r0 = com.google.android.finsky.C1473m.f7980a;
        r0 = r0.aY();
        r4 = r3.f15887d;
        r0 = r0.mo2306a(r4);
        r0 = r0.mo2330k();
        if (r0 == 0) goto L_0x01cb;
    L_0x0088:
        r0 = com.google.android.finsky.C1473m.f7980a;
        r0 = r0.ap();
        r4 = "";
        r0.mo1634c(r4, r1, r3, r3);
    L_0x0093:
        if (r11 != 0) goto L_0x01d0;
    L_0x0095:
        r0 = r1;
    L_0x0096:
        r3 = r10.bn;
        r3 = r3.getResources();
        r4 = r3.getConfiguration();
        r3 = r10.bp;
        r5 = r10.f6894e;
        r3 = r3.mo3681a(r5);
        if (r3 == 0) goto L_0x0129;
    L_0x00aa:
        r3 = r10.n_;
        r3 = r3.dj();
        r6 = 12623744; // 0xc09f80 float:1.7689633E-38 double:6.236958E-317;
        r5 = r3.mo2294a(r6);
        if (r5 != 0) goto L_0x00c2;
    L_0x00b9:
        r6 = 12623745; // 0xc09f81 float:1.7689634E-38 double:6.2369587E-317;
        r3 = r3.mo2294a(r6);
        if (r3 == 0) goto L_0x01d3;
    L_0x00c2:
        r3 = r1;
    L_0x00c3:
        if (r3 == 0) goto L_0x01dc;
    L_0x00c5:
        r3 = r10.n_;
        r3 = r3.dj();
        r6 = 87;
        r5 = r3.mo2294a(r6);
        r6 = 12602761; // 0xc04d89 float:1.766023E-38 double:6.2265913E-317;
        r3 = r3.mo2294a(r6);
        if (r5 != 0) goto L_0x00dc;
    L_0x00da:
        if (r3 == 0) goto L_0x01d6;
    L_0x00dc:
        r3 = r1;
    L_0x00dd:
        r5 = r10.aG;
        r5 = r5.cY();
        r6 = r10.aH;
        r5 = r6.mo2811a(r5);
        r6 = com.google.android.finsky.C1473m.f7980a;
        r6 = r6.mo2045Y();
        r5 = r6.m11644a(r5);
        if (r3 == 0) goto L_0x01d9;
    L_0x00f5:
        if (r5 != 0) goto L_0x01d9;
    L_0x00f7:
        r3 = r1;
    L_0x00f8:
        if (r3 == 0) goto L_0x01dc;
    L_0x00fa:
        if (r1 == 0) goto L_0x0129;
    L_0x00fc:
        r1 = com.google.android.finsky.activities.fa.m6551W();
        if (r1 != 0) goto L_0x0129;
    L_0x0102:
        if (r0 == 0) goto L_0x0129;
    L_0x0104:
        r0 = r4.screenHeightDp;
        if (r0 < r9) goto L_0x0129;
    L_0x0108:
        r0 = r4.screenWidthDp;
        if (r0 < r9) goto L_0x0129;
    L_0x010c:
        r0 = r10.bw;
        r0 = r0.m13365a();
        r1 = new com.google.android.finsky.activities.fa;
        r1.<init>();
        r2 = new android.os.Bundle;
        r2.<init>();
        r0.m13377a(r2);
        r1.m600f(r2);
        r0 = r10.f730B;
        r2 = "music_home_microsite";
        r1.m625a(r0, r2);
    L_0x0129:
        return;
    L_0x012a:
        r4 = 12635663; // 0xc0ce0f float:1.7706335E-38 double:6.242847E-317;
        r0 = r0.mo2294a(r4);
        if (r0 != 0) goto L_0x0033;
    L_0x0133:
        r0 = com.google.android.finsky.C1473m.f7980a;
        r0 = r0.mo2245h();
        r3 = r10.bn;
        r3 = r3.getResources();
        r0 = r0.m18478a(r2);
        r4 = new com.google.android.finsky.bg.ad;
        r4.<init>();
        r10.aE = r4;
        r4 = com.google.android.finsky.C1473m.f7980a;
        r4 = r4.cn();
        r5 = r10.aE;
        r4.m19642a(r3, r5);
        r5 = new com.google.android.finsky.activities.fr;
        r6 = r10.m603h();
        r7 = r10.aE;
        r5.<init>(r6, r7);
        r10.aC = r5;
        r5 = r10.aC;
        r6 = 4;
        r6 = new java.lang.Integer[r6];
        r0 = java.lang.Integer.valueOf(r0);
        r6[r2] = r0;
        r0 = r4.m19641a(r3);
        r0 = java.lang.Integer.valueOf(r0);
        r6[r1] = r0;
        r0 = 2130969271; // 0x7f0402b7 float:1.754722E38 double:1.052838709E-314;
        r0 = java.lang.Integer.valueOf(r0);
        r6[r8] = r0;
        r0 = 3;
        r3 = 5;
        r3 = java.lang.Integer.valueOf(r3);
        r6[r0] = r3;
        com.google.android.finsky.utils.bb.m21792a(r5, r6);
        r0 = r10.n_;
        r0 = r0.dj();
        r6 = 12642058; // 0xc0e70a float:1.7715296E-38 double:6.2460066E-317;
        r0 = r0.mo2294a(r6);
        if (r0 == 0) goto L_0x0033;
    L_0x019a:
        r0 = new com.google.android.finsky.activities.ft;
        r3 = r10.m603h();
        r5 = r10.aE;
        r0.<init>(r3, r5);
        r10.aD = r0;
        r0 = r10.aD;
        r3 = new java.lang.Integer[r8];
        r5 = 2130968883; // 0x7f040133 float:1.7546432E38 double:1.0528385174E-314;
        r5 = java.lang.Integer.valueOf(r5);
        r3[r2] = r5;
        r4 = r4.m19640a();
        r4 = java.lang.Integer.valueOf(r4);
        r3[r1] = r4;
        com.google.android.finsky.utils.bb.m21792a(r0, r3);
        goto L_0x0033;
    L_0x01c3:
        r10.cg_();
        goto L_0x0045;
    L_0x01c8:
        r0 = r2;
        goto L_0x004d;
    L_0x01cb:
        r3.m15684b();
        goto L_0x0093;
    L_0x01d0:
        r0 = r2;
        goto L_0x0096;
    L_0x01d3:
        r3 = r2;
        goto L_0x00c3;
    L_0x01d6:
        r3 = r2;
        goto L_0x00dd;
    L_0x01d9:
        r3 = r2;
        goto L_0x00f8;
    L_0x01dc:
        r1 = r2;
        goto L_0x00fa;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.finsky.activities.gn.d(android.os.Bundle):void");
    }

    @TargetApi(22)
    protected final Transition ae() {
        return new C2877h(this.f6894e);
    }

    protected final C3166e mo1299a(ContentFrame contentFrame) {
        return new C3167i(contentFrame, this, (byte) 0);
    }

    protected final int mo1298Z() {
        return C7582R.layout.header_list_container;
    }

    protected final boolean ag() {
        return true;
    }

    public final int ah() {
        if (this.ao) {
            return this.an;
        }
        return this.am;
    }

    public final void m_() {
        if (!this.f6893c) {
            av();
        }
        if (this.f6893c) {
            super.m_();
        }
    }

    public final void mo1062a(VolleyError volleyError) {
        if (this.f6892a == null || !this.f6892a.mo2861a()) {
            super.mo1062a(volleyError);
            return;
        }
        this.ap = true;
        this.s_ = null;
        av();
        if (this.f6893c) {
            super.m_();
        }
    }

    public final void cg_() {
        boolean z;
        NoSuchFieldException e;
        PlayHeaderListLayout playHeaderListLayout;
        PlayHeaderListLayout playHeaderListLayout2;
        int i;
        int b;
        if (this.f6892a != null && this.f6892a.m14717b()) {
            C4808a h = C1473m.f7980a.mo2246h(C1473m.f7980a.cZ());
            C2717g c2717g = this.f6892a;
            z = c2717g.m14717b() && c2717g.f14921a.p;
            h.f25088e = z;
        }
        Resources i2 = m605i();
        this.at = (FinskyHeaderListLayout) this.bt;
        this.at.a(new gr(this, this.at.getContext(), this.ag, this.aq != null));
        this.at.setBackgroundViewForTouchPassthrough(this.aw);
        this.at.setAlwaysUseFloatingBackground(true);
        this.at.setFloatingControlsBackground(ar());
        this.f6894e = this.f6892a.f14921a.c;
        if (this.f6897h == null) {
            String string;
            if (as()) {
                string = this.bn.getString(C7582R.string.app_long_name);
            } else {
                string = this.f6892a.f14921a.b;
                if (string == null) {
                    gj a = this.k_.m14606a(this.f6894e);
                    if (a == null) {
                        string = "";
                    } else if (this.bp.mo3720w()) {
                        string = a.d;
                    } else {
                        string = this.bn.getString(C7582R.string.launcher_name);
                    }
                }
            }
            this.f6897h = string;
        }
        ac();
        if (!(TextUtils.isEmpty(this.f6897h) || this.bp == null || !this.bp.mo3706h())) {
            C1601a.m9199a(this.bn, this.f6897h, this.f746R, false);
        }
        LayoutInflater layoutInflater = m603h().getLayoutInflater();
        C2720j[] c2720jArr = null;
        if (this.al) {
            c2720jArr = this.s_;
        }
        C1473m c1473m = C1473m.f7980a;
        C1552e dj = c1473m.aN().dj();
        if (this.aE == null && (m603h() instanceof MainActivity) && dj.mo2294a(12630046) && dj.mo2294a(12635663) && this.bp.mo3680a()) {
            MainActivity mainActivity = (MainActivity) m603h();
            ff ffVar = mainActivity.ac;
            mainActivity.ac = null;
            this.aE = ffVar;
        }
        this.as = (FinskyViewPager) this.bt.findViewById(C7582R.id.viewpager);
        this.av = new gk(this.bn, layoutInflater, this.aJ, this.bp, this.k_, this.bo, c1473m.mo2246h(c1473m.cZ()), this.aI, this.bD, this.f6892a.f14921a.d, this.f6892a.f14921a.e, (ac) this.aj.m21690b("TabbedBrowseFragment.AdapterState"), this, this, this, this.at, this.as.getOffscreenPageLimit(), this.bw, c2720jArr, this, this.aE, this.br, this);
        int i3 = this.av.mo961a() > 1 ? 0 : 2;
        PlayHeaderListTabStrip playHeaderListTabStrip = this.aA;
        z = N_() || this.aL.m11021a();
        playHeaderListTabStrip.setAnimateOnTabClick(z);
        if (N_() || this.al || aj()) {
            if (!aj()) {
                playHeaderListTabStrip = this.aA;
                playHeaderListTabStrip.f16349c = true;
                Resources resources = playHeaderListTabStrip.getResources();
                playHeaderListTabStrip.setSelectedUnderlineThickness(resources.getDimensionPixelSize(C7582R.dimen.finsky_fixed_tab_underline_thickness));
                playHeaderListTabStrip.f16352f = resources.getBoolean(C7582R.bool.use_wide_layout);
                if (resources.getBoolean(C7582R.bool.use_wide_layout_v2)) {
                    playHeaderListTabStrip.f16352f = true;
                }
                if (playHeaderListTabStrip.f16352f) {
                    View findViewById = playHeaderListTabStrip.findViewById(C7582R.id.play_header_list_tab_scroll);
                    LayoutParams layoutParams = (LayoutParams) findViewById.getLayoutParams();
                    layoutParams.gravity = 17;
                    findViewById.setLayoutParams(layoutParams);
                }
                playHeaderListTabStrip.requestLayout();
            }
            this.aA.d();
            this.at.setAlwaysUseFloatingBackground(false);
            C3161c c3161c = this.aB;
            c3161c.f16372i = this.at;
            c3161c.f16374k = null;
        }
        this.at.setShouldUseScrollLocking(this.f6894e != 9);
        this.as.setAdapter(this.av);
        if (ao() && this.aL.m11029h()) {
            C2964d c2964d;
            C2116a c2116a = this.aL;
            Object obj = (c2116a.m11021a() && c2116a.f10736b.dj().mo2294a(12642036)) ? 1 : null;
            if (obj != null) {
                c2964d = new C2964d(new C2963c());
            } else {
                c2964d = C2965g.m15376a();
            }
            this.aF = c2964d;
            this.aF.m15371a(this.as, this.av);
        }
        this.as.setPageMargin(i2.getDimensionPixelSize(C7582R.dimen.swipey_tab_gutter_width));
        if (ao()) {
            Interpolator a2;
            FinskyViewPager finskyViewPager = this.as;
            if (VERSION.SDK_INT >= 21) {
                a2 = C6242e.m28755a(this.bn);
            } else {
                a2 = new C0344b();
            }
            try {
                Field declaredField = ViewPager.class.getDeclaredField("k");
                declaredField.setAccessible(true);
                declaredField.set(finskyViewPager, new com.google.android.finsky.layout.play.ah(finskyViewPager.getContext(), a2));
            } catch (NoSuchFieldException e2) {
                e = e2;
                FinskyLog.m21669e("Error setting animation parameters: %s", e);
                this.as.ah = true;
                this.aA.setSelectedTabIndicator(0);
                this.as.ah = true;
                this.at.K.d();
                this.at.setOnPageChangeListener(this);
                this.at.setOnTabSelectedListener(this);
                if (!N_()) {
                    this.at.a(i2.getColor(C7582R.color.status_bar_overlay), C1608h.m9243a(this.bn, this.f6894e));
                }
                this.as.ah = true;
                this.at.setHeaderMode(0);
                if (ao()) {
                    this.an = FinskyHeaderListLayout.b(this.bn, i3, this.at.getActionBarHeight(), this.at.getSubNavHeight());
                } else {
                    this.an = FinskyHeaderListLayout.a(this.bn, i3, 0, this.at.getActionBarHeight());
                }
                if (this.ax == null) {
                    this.ax = new C3685o(this.f6894e, this.aw, this.az, layoutInflater, this.bn, this);
                }
                this.ax.m17477a(this.aq, false);
                ap();
                if (this.aq == null) {
                    if (this.bp.mo3680a()) {
                    }
                    playHeaderListLayout = this.at;
                    if (i3 != 2) {
                        playHeaderListLayout2 = playHeaderListLayout;
                        i = 3;
                        playHeaderListLayout2.setHeaderShadowMode(i);
                        this.at.setAlwaysUseFloatingBackground(true);
                        if (this.az != null) {
                            this.az.getLayoutParams().width = -1;
                            this.az.getLayoutParams().height = -1;
                        }
                        this.am = this.an;
                        this.at.b(i3, ah());
                        if (this.ag != 1) {
                            this.at.setFloatingControlsBackground(ar());
                        }
                        if (this.ai != -1) {
                            i = this.f6892a.f14921a.e;
                        } else {
                            i = this.ai;
                            this.ai = -1;
                        }
                        i3 = C5872c.m27301a(this.av, this.as.getCurrentItem());
                        b = C5872c.m27302b(this.av, i);
                        if (i3 == i) {
                            this.as.m1757a(b, false);
                            m6655h(b);
                        } else {
                            this.av.m6617c(i);
                            m6655h(b);
                        }
                        if (ao()) {
                            m6634b(i, false);
                        }
                        O_();
                        this.by.run();
                    }
                }
                playHeaderListLayout = this.at;
                playHeaderListLayout2 = playHeaderListLayout;
                i = 2;
                playHeaderListLayout2.setHeaderShadowMode(i);
                this.at.setAlwaysUseFloatingBackground(true);
                if (this.az != null) {
                    this.az.getLayoutParams().width = -1;
                    this.az.getLayoutParams().height = -1;
                }
                this.am = this.an;
                this.at.b(i3, ah());
                if (this.ag != 1) {
                    this.at.setFloatingControlsBackground(ar());
                }
                if (this.ai != -1) {
                    i = this.ai;
                    this.ai = -1;
                } else {
                    i = this.f6892a.f14921a.e;
                }
                i3 = C5872c.m27301a(this.av, this.as.getCurrentItem());
                b = C5872c.m27302b(this.av, i);
                if (i3 == i) {
                    this.av.m6617c(i);
                    m6655h(b);
                } else {
                    this.as.m1757a(b, false);
                    m6655h(b);
                }
                if (ao()) {
                    m6634b(i, false);
                }
                O_();
                this.by.run();
            } catch (IllegalArgumentException e3) {
                e = e3;
                FinskyLog.m21669e("Error setting animation parameters: %s", e);
                this.as.ah = true;
                this.aA.setSelectedTabIndicator(0);
                this.as.ah = true;
                this.at.K.d();
                this.at.setOnPageChangeListener(this);
                this.at.setOnTabSelectedListener(this);
                if (N_()) {
                    this.at.a(i2.getColor(C7582R.color.status_bar_overlay), C1608h.m9243a(this.bn, this.f6894e));
                }
                this.as.ah = true;
                this.at.setHeaderMode(0);
                if (ao()) {
                    this.an = FinskyHeaderListLayout.b(this.bn, i3, this.at.getActionBarHeight(), this.at.getSubNavHeight());
                } else {
                    this.an = FinskyHeaderListLayout.a(this.bn, i3, 0, this.at.getActionBarHeight());
                }
                if (this.ax == null) {
                    this.ax = new C3685o(this.f6894e, this.aw, this.az, layoutInflater, this.bn, this);
                }
                this.ax.m17477a(this.aq, false);
                ap();
                if (this.aq == null) {
                    playHeaderListLayout = this.at;
                } else {
                    if (this.bp.mo3680a()) {
                    }
                    playHeaderListLayout = this.at;
                    if (i3 != 2) {
                        playHeaderListLayout2 = playHeaderListLayout;
                        i = 3;
                        playHeaderListLayout2.setHeaderShadowMode(i);
                        this.at.setAlwaysUseFloatingBackground(true);
                        if (this.az != null) {
                            this.az.getLayoutParams().width = -1;
                            this.az.getLayoutParams().height = -1;
                        }
                        this.am = this.an;
                        this.at.b(i3, ah());
                        if (this.ag != 1) {
                            this.at.setFloatingControlsBackground(ar());
                        }
                        if (this.ai != -1) {
                            i = this.f6892a.f14921a.e;
                        } else {
                            i = this.ai;
                            this.ai = -1;
                        }
                        i3 = C5872c.m27301a(this.av, this.as.getCurrentItem());
                        b = C5872c.m27302b(this.av, i);
                        if (i3 == i) {
                            this.as.m1757a(b, false);
                            m6655h(b);
                        } else {
                            this.av.m6617c(i);
                            m6655h(b);
                        }
                        if (ao()) {
                            m6634b(i, false);
                        }
                        O_();
                        this.by.run();
                    }
                }
                playHeaderListLayout2 = playHeaderListLayout;
                i = 2;
                playHeaderListLayout2.setHeaderShadowMode(i);
                this.at.setAlwaysUseFloatingBackground(true);
                if (this.az != null) {
                    this.az.getLayoutParams().width = -1;
                    this.az.getLayoutParams().height = -1;
                }
                this.am = this.an;
                this.at.b(i3, ah());
                if (this.ag != 1) {
                    this.at.setFloatingControlsBackground(ar());
                }
                if (this.ai != -1) {
                    i = this.ai;
                    this.ai = -1;
                } else {
                    i = this.f6892a.f14921a.e;
                }
                i3 = C5872c.m27301a(this.av, this.as.getCurrentItem());
                b = C5872c.m27302b(this.av, i);
                if (i3 == i) {
                    this.av.m6617c(i);
                    m6655h(b);
                } else {
                    this.as.m1757a(b, false);
                    m6655h(b);
                }
                if (ao()) {
                    m6634b(i, false);
                }
                O_();
                this.by.run();
            } catch (IllegalAccessException e4) {
                e = e4;
                FinskyLog.m21669e("Error setting animation parameters: %s", e);
                this.as.ah = true;
                this.aA.setSelectedTabIndicator(0);
                this.as.ah = true;
                this.at.K.d();
                this.at.setOnPageChangeListener(this);
                this.at.setOnTabSelectedListener(this);
                if (N_()) {
                    this.at.a(i2.getColor(C7582R.color.status_bar_overlay), C1608h.m9243a(this.bn, this.f6894e));
                }
                this.as.ah = true;
                this.at.setHeaderMode(0);
                if (ao()) {
                    this.an = FinskyHeaderListLayout.a(this.bn, i3, 0, this.at.getActionBarHeight());
                } else {
                    this.an = FinskyHeaderListLayout.b(this.bn, i3, this.at.getActionBarHeight(), this.at.getSubNavHeight());
                }
                if (this.ax == null) {
                    this.ax = new C3685o(this.f6894e, this.aw, this.az, layoutInflater, this.bn, this);
                }
                this.ax.m17477a(this.aq, false);
                ap();
                if (this.aq == null) {
                    if (this.bp.mo3680a()) {
                    }
                    playHeaderListLayout = this.at;
                    if (i3 != 2) {
                        playHeaderListLayout2 = playHeaderListLayout;
                        i = 3;
                        playHeaderListLayout2.setHeaderShadowMode(i);
                        this.at.setAlwaysUseFloatingBackground(true);
                        if (this.az != null) {
                            this.az.getLayoutParams().width = -1;
                            this.az.getLayoutParams().height = -1;
                        }
                        this.am = this.an;
                        this.at.b(i3, ah());
                        if (this.ag != 1) {
                            this.at.setFloatingControlsBackground(ar());
                        }
                        if (this.ai != -1) {
                            i = this.f6892a.f14921a.e;
                        } else {
                            i = this.ai;
                            this.ai = -1;
                        }
                        i3 = C5872c.m27301a(this.av, this.as.getCurrentItem());
                        b = C5872c.m27302b(this.av, i);
                        if (i3 == i) {
                            this.as.m1757a(b, false);
                            m6655h(b);
                        } else {
                            this.av.m6617c(i);
                            m6655h(b);
                        }
                        if (ao()) {
                            m6634b(i, false);
                        }
                        O_();
                        this.by.run();
                    }
                }
                playHeaderListLayout = this.at;
                playHeaderListLayout2 = playHeaderListLayout;
                i = 2;
                playHeaderListLayout2.setHeaderShadowMode(i);
                this.at.setAlwaysUseFloatingBackground(true);
                if (this.az != null) {
                    this.az.getLayoutParams().width = -1;
                    this.az.getLayoutParams().height = -1;
                }
                this.am = this.an;
                this.at.b(i3, ah());
                if (this.ag != 1) {
                    this.at.setFloatingControlsBackground(ar());
                }
                if (this.ai != -1) {
                    i = this.ai;
                    this.ai = -1;
                } else {
                    i = this.f6892a.f14921a.e;
                }
                i3 = C5872c.m27301a(this.av, this.as.getCurrentItem());
                b = C5872c.m27302b(this.av, i);
                if (i3 == i) {
                    this.av.m6617c(i);
                    m6655h(b);
                } else {
                    this.as.m1757a(b, false);
                    m6655h(b);
                }
                if (ao()) {
                    m6634b(i, false);
                }
                O_();
                this.by.run();
            }
            this.as.ah = true;
            this.aA.setSelectedTabIndicator(0);
        }
        if (this.bp.mo3680a() && this.n_.dj().mo2294a(12644646)) {
            this.as.ah = true;
        }
        this.at.K.d();
        this.at.setOnPageChangeListener(this);
        this.at.setOnTabSelectedListener(this);
        if (N_()) {
            this.at.a(i2.getColor(C7582R.color.status_bar_overlay), C1608h.m9243a(this.bn, this.f6894e));
        }
        if ((this.al || N_()) && !aj()) {
            this.as.ah = true;
            this.at.setHeaderMode(0);
        }
        if (ao()) {
            this.an = FinskyHeaderListLayout.b(this.bn, i3, this.at.getActionBarHeight(), this.at.getSubNavHeight());
        } else {
            this.an = FinskyHeaderListLayout.a(this.bn, i3, 0, this.at.getActionBarHeight());
        }
        if (this.ax == null) {
            this.ax = new C3685o(this.f6894e, this.aw, this.az, layoutInflater, this.bn, this);
        }
        this.ax.m17477a(this.aq, false);
        ap();
        if (this.aq == null) {
            playHeaderListLayout = this.at;
        } else if (this.bp.mo3680a() || !C1473m.f7980a.ay().m9022a()) {
            if (this.al && !aj()) {
                playHeaderListLayout = this.at;
                if (i3 != 2) {
                    playHeaderListLayout2 = playHeaderListLayout;
                    i = 3;
                    playHeaderListLayout2.setHeaderShadowMode(i);
                    this.at.setAlwaysUseFloatingBackground(true);
                }
            }
            if (this.az != null) {
                this.az.getLayoutParams().width = -1;
                this.az.getLayoutParams().height = -1;
            }
            this.am = this.an;
            this.at.b(i3, ah());
            if (this.ag != 1) {
                this.at.setFloatingControlsBackground(ar());
            }
            if (this.ai != -1) {
                i = this.ai;
                this.ai = -1;
            } else {
                i = this.f6892a.f14921a.e;
            }
            i3 = C5872c.m27301a(this.av, this.as.getCurrentItem());
            b = C5872c.m27302b(this.av, i);
            if (i3 == i) {
                this.av.m6617c(i);
                m6655h(b);
            } else {
                this.as.m1757a(b, false);
                m6655h(b);
            }
            if (ao()) {
                m6634b(i, false);
            }
            O_();
            this.by.run();
        } else {
            playHeaderListLayout2 = this.at;
            i = 3;
            playHeaderListLayout2.setHeaderShadowMode(i);
            this.at.setAlwaysUseFloatingBackground(true);
            if (this.az != null) {
                this.az.getLayoutParams().width = -1;
                this.az.getLayoutParams().height = -1;
            }
            this.am = this.an;
            this.at.b(i3, ah());
            if (this.ag != 1) {
                this.at.setFloatingControlsBackground(ar());
            }
            if (this.ai != -1) {
                i = this.f6892a.f14921a.e;
            } else {
                i = this.ai;
                this.ai = -1;
            }
            i3 = C5872c.m27301a(this.av, this.as.getCurrentItem());
            b = C5872c.m27302b(this.av, i);
            if (i3 == i) {
                this.as.m1757a(b, false);
                m6655h(b);
            } else {
                this.av.m6617c(i);
                m6655h(b);
            }
            if (ao()) {
                m6634b(i, false);
            }
            O_();
            this.by.run();
        }
        playHeaderListLayout2 = playHeaderListLayout;
        i = 2;
        playHeaderListLayout2.setHeaderShadowMode(i);
        this.at.setAlwaysUseFloatingBackground(true);
        if (this.az != null) {
            this.az.getLayoutParams().width = -1;
            this.az.getLayoutParams().height = -1;
        }
        this.am = this.an;
        this.at.b(i3, ah());
        if (this.ag != 1) {
            this.at.setFloatingControlsBackground(ar());
        }
        if (this.ai != -1) {
            i = this.ai;
            this.ai = -1;
        } else {
            i = this.f6892a.f14921a.e;
        }
        i3 = C5872c.m27301a(this.av, this.as.getCurrentItem());
        b = C5872c.m27302b(this.av, i);
        if (i3 == i) {
            this.av.m6617c(i);
            m6655h(b);
        } else {
            this.as.m1757a(b, false);
            m6655h(b);
        }
        if (ao()) {
            m6634b(i, false);
        }
        O_();
        this.by.run();
    }

    final boolean N_() {
        if (this.f6892a.f14921a.d.length <= 1 || this.f6892a.f14921a.h != 2) {
            return false;
        }
        return true;
    }

    final boolean aj() {
        if (this.f6893c && this.f6892a.f14921a.h == 3 && this.bp.mo3680a()) {
            return true;
        }
        return false;
    }

    private final ColorDrawable ar() {
        return new ColorDrawable(C1608h.m9243a(m603h(), this.f6894e));
    }

    public final int af() {
        if (aq() || !this.f6893c) {
            return m605i().getColor(C7582R.color.play_transparent);
        }
        return C1608h.m9243a(m603h(), this.f6894e);
    }

    public final void mo1386a(gp gpVar) {
        int i = 0;
        boolean z = true;
        if (!this.al) {
            boolean z2;
            boolean z3 = this.av.mo961a() == 1;
            boolean z4;
            if (this.aq != null) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (gpVar == null || !gpVar.mo1452c()) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (z3 && (r4 || z2)) {
                this.ax.m17476a(0);
                this.at.post(new go(this, z2, gpVar));
                this.at.setAlwaysUseFloatingBackground(false);
                if (gpVar != null) {
                    this.at.setHeaderShadowMode(1);
                }
                Resources resources = this.bn.getResources();
                float f = 0.0f;
                if (z2) {
                    i = ((int) (((float) resources.getDimensionPixelSize(C7582R.dimen.play_profile_avatar_size)) * 0.3f)) + 0;
                } else if (this.aq != null) {
                    f = 0.5625f;
                }
                int a = C2581g.m13635a(this.bn, C1611k.m9270l(resources), true, f, C1611k.m9272n(resources)) + i;
                if (this.ax != null) {
                    a += this.ax.f18592d;
                }
                if (InsetsFrameLayout.f14024a) {
                    a -= k.e(this.bn);
                }
                this.am = a;
                this.at.b(2, ah());
                this.au = new C0948a(m603h().getWindow(), this.at);
                this.at.setOnLayoutChangedListener(this.au);
                this.au.m5719b();
                return;
            }
            if (this.ax != null) {
                this.ax.m17476a(8);
            }
            PlayHeaderListLayout playHeaderListLayout = this.at;
            if (this.ag == 1) {
                z = false;
            }
            playHeaderListLayout.setAlwaysUseFloatingBackground(z);
            this.at.setOnLayoutChangedListener(null);
        }
    }

    public final void ac() {
        this.bm.mo1241c(this.f6897h);
        this.bm.mo1235a(this.f6894e, this.f6895f, this.f6896g, this.f6893c);
        if (C1473m.f7980a.dj().mo2294a(12624205)) {
            this.bm.mo1242d(aw());
        }
        if (aq() || aj()) {
            this.bm.mo1240c(1);
        } else if (this.f6893c) {
            if (as()) {
                this.bq.mo1275j();
                this.bm.mo1241c(this.f6897h);
                this.bm.mo1242d(aw());
            }
            this.bm.mo1246z();
        }
    }

    private final boolean as() {
        return (!this.f760q.getBoolean("TabbedBrowseFragment.IsFromDeeplink") || this.aq == null || this.aq.f6902b == null || this.aq.f6902b.e() == null) ? false : true;
    }

    protected final void aa() {
        av();
    }

    private final void av() {
        gq gqVar = null;
        boolean z = false;
        if (this.f6892a == null || !this.f6892a.mo2861a()) {
            this.ap = false;
            String str = this.bF;
            if (TextUtils.equals(this.bF, this.k_.f14881a.f31765h)) {
                Builder buildUpon = Uri.parse(str).buildUpon();
                buildUpon.appendQueryParameter("nocache_isui", Boolean.toString(true));
                str = buildUpon.build().toString();
            }
            this.f6892a = new C2717g(this.bo, str);
            this.f6892a.m11918a((C1031w) this);
            this.f6892a.m11917a((C0657w) this);
            return;
        }
        byte[] bArr;
        if (!ao()) {
            int i = this.f6892a.f14921a.e;
            ab[] abVarArr = this.f6892a.f14921a.d;
            if (!(this.ap || TextUtils.isEmpty(abVarArr[i].g))) {
                if (this.s_ == null || !this.s_[i].mo2861a()) {
                    this.s_ = new C2720j[abVarArr.length];
                    for (i = 0; i < abVarArr.length; i++) {
                        if (TextUtils.isEmpty(abVarArr[i].g)) {
                            this.s_[i] = null;
                        } else {
                            C1473m.f7980a.aO();
                            C2335k a = C2721l.m14733a(this.bo, abVarArr[i].g, false, true);
                            this.s_[i] = a;
                            if (i == this.f6892a.f14921a.e) {
                                a.m11918a((C1031w) this);
                                a.m11917a((C0657w) this);
                                a.m14699n();
                            }
                        }
                    }
                    return;
                } else if (aj()) {
                    this.al = true;
                    if (this.s_[i].m14698m() <= 0) {
                        z = true;
                    }
                    this.ao = z;
                } else {
                    gn gnVar;
                    if (this.bp.mo3680a()) {
                        z = true;
                        gnVar = this;
                    } else if (this.s_[i].m14698m() > 0) {
                        z = true;
                        gnVar = this;
                    } else {
                        gnVar = this;
                    }
                    gnVar.al = z;
                }
            }
        }
        ce ceVar = this.ak;
        C2717g c2717g = this.f6892a;
        if (c2717g.f14921a == null || c2717g.f14921a.k.length == 0) {
            bArr = null;
        } else {
            bArr = c2717g.f14921a.k;
        }
        C2482j.m13285a(ceVar, bArr);
        if (!(this.f6892a.f14921a.r == null && this.f6892a.f14921a.i == null)) {
            gqVar = new gq(this.f6892a.f14921a.r, this.f6892a.f14921a.i);
        }
        this.aq = gqVar;
        this.f6893c = true;
        if (!C1473m.f7980a.dj().mo2294a(12636210)) {
            m6635l(1719);
        }
    }

    public final void mo138d() {
        if (this.f6893c && this.as != null) {
            this.ai = C5872c.m27301a(this.av, this.as.getCurrentItem());
            ac acVar = new ac();
            gk gkVar = this.av;
            gkVar.f6857B = true;
            if (!(gkVar.f6879u == null || gkVar.f6879u.isEmpty())) {
                ArrayList arrayList = new ArrayList();
                for (gl glVar : gkVar.f6879u) {
                    if (glVar.f6887c != null) {
                        glVar.f6888d = glVar.f6887c.mo1312b();
                    }
                    arrayList.add(glVar.f6888d);
                    C2730u c2730u = glVar.f6886b;
                    if (c2730u != null) {
                        C2711x.m14674a(c2730u.f14950a);
                    }
                }
                acVar.m21688a("TabbedAdapter.TabInstanceStates", arrayList);
                acVar.m21688a("TabbedAdapter.TabDfeLists", gkVar.m6621f());
            }
            this.aj.m21688a("TabbedBrowseFragment.AdapterState", acVar);
        }
        this.bm.mo1234A().m21845a();
        if (this.at != null) {
            this.at.setOnPageChangeListener(null);
            this.at.setOnTabSelectedListener(null);
        }
        if (this.aF != null) {
            this.aF.m15369a();
            this.aF = null;
        }
        if (this.as != null) {
            this.as.setAdapter(null);
            this.as = null;
        }
        if (this.aM != null) {
            this.aM.f16564d = null;
            this.aM = null;
        }
        this.av = null;
        if (this.at != null) {
            this.at.f();
        }
        if (this.au != null) {
            this.au.m5722e();
            this.au = null;
        }
        this.aw = null;
        if (this.ax != null) {
            C3685o c3685o = this.ax;
            if (c3685o.f18593e != null) {
                c3685o.f18593e.setOnLoadedListener(null);
            }
            c3685o.f18593e = null;
            c3685o.f18595g = null;
            this.ax = null;
        }
        this.az = null;
        this.aA = null;
        if (this.aC != null) {
            this.aC.cancel(false);
            this.aC = null;
        }
        if (this.aD != null) {
            this.aD.cancel(false);
            this.aD = null;
        }
        this.aE = null;
        if (this.aB != null) {
            this.aB.m16087a();
            this.aB = null;
        }
        super.mo138d();
    }

    public final int ab() {
        return this.f6894e;
    }

    public final void d_(int i) {
        gi giVar = this.av.f6881w;
        bb.m21791a();
        giVar.f6854f = i;
        if (i == 2) {
            giVar.f6851c.removeCallbacks(giVar);
            giVar.f6853e = true;
        }
        if (i == 0) {
            switch (giVar.f6850b) {
                case 0:
                    giVar.m6596a();
                    return;
                case 1:
                    giVar.f6855g = false;
                    if (giVar.f6849a.mo1379d()) {
                        giVar.m6596a();
                        giVar.f6855g = true;
                    } else {
                        ek e = giVar.f6849a.mo1380e();
                        giVar.f6852d.remove(e);
                        e.m6535c();
                    }
                    giVar.f6853e = false;
                    return;
                default:
                    FinskyLog.m21669e("Do not recognize mode:" + giVar.f6850b, new Object[0]);
                    return;
            }
        }
    }

    public final void mo179a(int i, float f, int i2) {
    }

    public final void mo180b(int i) {
        int a = C5872c.m27301a(this.av, i);
        this.av.m6617c(a);
        if (ao()) {
            m6634b(a, true);
        }
        if (!(TextUtils.isEmpty((String) this.av.mo1371a(a)) || this.bp == null || !this.bp.mo3706h())) {
            C1601a.m9199a(this.bn, this.bn.getString(C7582R.string.accessibility_event_tab_selected, new Object[]{r0}), this.as, false);
        }
        if (aj()) {
            boolean z = this.aA.f16354h;
            if (z) {
                this.aA.setTabStripClicked(false);
            }
            m6633a(a, z);
        }
    }

    public final void m6653f(int i) {
        af afVar = this.av;
        Runnable runnable = afVar.f6881w;
        runnable.f6853e = true;
        if (runnable.f6850b == 0) {
            runnable.f6851c.postDelayed(runnable, 500);
        }
        int a = C5872c.m27301a(afVar, i);
        afVar.f6884z = afVar.f6883y;
        afVar.f6883y = a;
        int a2 = C5872c.m27301a(this.av, i);
        gk gkVar = this.av;
        if (a2 >= 0 && a2 < gkVar.f6879u.size()) {
            gkVar.f6874p.m13379b(new C2475d(((gl) gkVar.f6879u.get(a2)).f6890f));
        }
    }

    public final void m6654g(int i) {
        m6655h(i);
    }

    private final void m6633a(int i, boolean z) {
        int i2;
        int i3 = 0;
        this.f6894e = this.f6892a.f14921a.d[i].l;
        if (this.f6892a.f14921a.d[i].f()) {
            i2 = this.f6892a.f14921a.d[i].n;
        } else {
            i2 = 0;
        }
        this.f6895f = i2;
        if (this.f6892a.f14921a.d[i].e()) {
            i2 = this.f6892a.f14921a.d[i].m;
        } else {
            i2 = 0;
        }
        this.f6896g = i2;
        this.bm.mo1235a(this.f6894e, this.f6895f, this.f6896g, true);
        if (!z) {
            View view;
            PlayHeaderListTabStrip playHeaderListTabStrip = this.aA;
            ViewPager pager = playHeaderListTabStrip.getPager();
            af adapter = pager == null ? null : pager.getAdapter();
            if (adapter == null) {
                view = null;
            } else {
                view = playHeaderListTabStrip.f16350d.getChildAt(C5872c.m27302b(adapter, i));
            }
            int[] iArr = new int[2];
            view.getLocationOnScreen(iArr);
            this.aB.f16376m = (view.getWidth() / 2) + iArr[0];
        }
        this.aB.m16088a(this.f6894e);
        i2 = this.bn.getResources().getColor(C7582R.color.status_bar_overlay);
        this.at.a(i2, i2);
        if (C1473m.f7980a.dj().mo2294a(12633956)) {
            PlayHeaderListTabStrip playHeaderListTabStrip2 = this.aA;
            i2 = this.f6894e;
            int color = playHeaderListTabStrip2.getResources().getColor(17170443);
            Resources resources = playHeaderListTabStrip2.getResources();
            switch (i2) {
                case 1:
                    i2 = C7582R.color.play_books_tab_unselected;
                    break;
                case 2:
                    i2 = C7582R.color.play_music_tab_unselected;
                    break;
                case 3:
                    i2 = C7582R.color.play_apps_tab_unselected;
                    break;
                case 4:
                    i2 = C7582R.color.play_movies_tab_unselected;
                    break;
                case 6:
                    i2 = C7582R.color.play_newsstand_tab_unselected;
                    break;
                default:
                    i2 = C7582R.color.play_multi_tab_unselected;
                    break;
            }
            int color2 = resources.getColor(i2);
            while (i3 < playHeaderListTabStrip2.f16350d.getChildCount()) {
                int i4;
                TextView textView = (TextView) playHeaderListTabStrip2.f16350d.getChildAt(i3);
                if (playHeaderListTabStrip2.getPager().getCurrentItem() == i3) {
                    i4 = color;
                } else {
                    i4 = color2;
                }
                textView.setTextColor(i4);
                i3++;
            }
        }
    }

    public final void m6655h(int i) {
        int a = C5872c.m27301a(this.av, i);
        if (C1473m.f7980a.dj().mo2294a(12642869) || !(ao() || aj())) {
            C0954a.bH.m5765c();
        } else {
            if ((this.f6892a.f14921a.d[a].b & 512) != 0) {
                C0954a.bH.m5763a(Integer.valueOf(this.f6892a.f14921a.d[a].o));
            } else {
                C0954a.bH.m5765c();
            }
        }
        if (aj()) {
            m6633a(a, true);
        } else if (N_()) {
            int i2;
            this.f6894e = this.f6892a.f14921a.d[a].l;
            if (this.f6892a.f14921a.d[a].f()) {
                i2 = this.f6892a.f14921a.d[a].n;
            } else {
                i2 = 0;
            }
            this.f6895f = i2;
            if (this.f6892a.f14921a.d[a].e()) {
                i2 = this.f6892a.f14921a.d[a].m;
            } else {
                i2 = 0;
            }
            this.f6896g = i2;
            this.bm.mo1235a(this.f6894e, this.f6895f, this.f6896g, true);
            this.aB.m16088a(this.f6894e);
            this.at.a(this.bn.getResources().getColor(C7582R.color.status_bar_overlay), Color.alpha(0));
        }
    }

    public final ce getPlayStoreUiElement() {
        return this.ak;
    }

    public final void p_() {
        if (this.av != null && this.av.mo961a() == 1) {
            super.p_();
            if (this.au != null) {
                this.au.m5718a(true);
            }
        }
    }

    public final void q_() {
        if (this.av != null && this.av.mo961a() == 1) {
            super.q_();
            if (this.au != null) {
                this.au.m5718a(false);
            }
        }
    }

    protected final int ak() {
        return this.ah;
    }

    public final ad al() {
        if (this.as == null || this.av == null) {
            return super.al();
        }
        af afVar = this.av;
        return ((gl) afVar.f6879u.get(C5872c.m27301a(afVar, this.as.getCurrentItem()))).f6890f;
    }

    public final boolean am() {
        if (!ao() || this.aM == null || this.av == null || this.av.m6623h() <= 0) {
            if (this.bp.mo3705g() == 1 && !(this.f6894e == 3 && this.f6896g == 0)) {
                DfeToc dfeToc = this.k_;
                if (TextUtils.equals(this.bF, dfeToc.f14881a.f31765h)) {
                    this.bp.mo3646a(dfeToc, this.bw);
                    return true;
                }
            }
            return super.am();
        }
        this.aM.m16273a(0, true, 2);
        return true;
    }

    public final boolean an() {
        boolean z = (!C1473m.f7980a.dj().mo2294a(12626320) || this.aq == null || this.aq.f6902b == null || this.aq.f6902b.e() == null) ? false : true;
        if (!z) {
            return super.an();
        }
        this.bp.mo3646a(this.k_, this.bw);
        return true;
    }

    public final void mo1385a(int i, byte[] bArr, byte[] bArr2, boolean z) {
        if (i == 1733) {
            this.bE.m13353a(this.bw, i, this.bC, bArr, null);
        } else if (i == 1737) {
            this.bE.m13353a(this.bw, i, this.bC, bArr, bArr2);
        }
        this.ar = z;
    }

    public final void mo1393b(int i, byte[] bArr, byte[] bArr2, boolean z) {
        if (i == 1734 || i == 1736 || i == 1735) {
            this.bE.m13353a(this.bw, i, this.bC, bArr, null);
        } else if (i == 1738 || i == 1740 || i == 1739) {
            this.bE.m13353a(this.bw, i, this.bC, bArr, bArr2);
        }
        boolean z2 = this.ar && !z;
        this.ar = z2;
    }

    public final void mo1384a(int i, byte[] bArr, byte[] bArr2) {
        if (this.ar && this.bC > 0) {
            this.bE.m13353a(this.bw, i, this.bC, bArr, bArr2);
        }
    }

    private final void m6635l(int i) {
        if (!TextUtils.equals(this.bF, this.k_.f14881a.f31765h)) {
            return;
        }
        if (i == 1703) {
            m6264i(1);
        } else if (i == 1704 || i == 1706 || i == 1705) {
            mo1293j(i);
        } else {
            mo1294k(i);
        }
    }

    private final String aw() {
        if (this.f6892a == null) {
            return null;
        }
        C2717g c2717g = this.f6892a;
        if (c2717g.f14921a != null) {
            return c2717g.f14921a.j;
        }
        return null;
    }

    private final void m6634b(int i, boolean z) {
        ab abVar = this.f6892a.f14921a.d[i];
        if (this.aM != null && abVar.h != null) {
            int h = this.av.m6623h();
            Ia2SubNavView ia2SubNavView = this.aM;
            z[] zVarArr = abVar.h.b;
            int i2 = abVar.l;
            int i3 = abVar.m;
            al();
            if (z) {
                ia2SubNavView.f16561a.clearAnimation();
                ia2SubNavView.f16567g.removeCallbacksAndMessages(null);
                ia2SubNavView.f16561a.startAnimation(ia2SubNavView.f16568h);
                ia2SubNavView.f16567g.postDelayed(new C3242v(ia2SubNavView, zVarArr, i2, i3, this, h), ia2SubNavView.f16568h.getDuration());
            } else {
                ia2SubNavView.f16567g.removeCallbacksAndMessages(null);
                ia2SubNavView.m16274a(zVarArr, i2, i3, this, h);
            }
            m6637n(h);
            m6638o(h);
        }
    }

    final boolean ao() {
        return this.aL.m11022a(this.k_) && this.bp.mo3680a();
    }

    public final void mo1392b(int i, int i2) {
        if (this.av != null) {
            gk gkVar = this.av;
            gt gtVar = ((gl) gkVar.f6879u.get(gkVar.f6883y)).f6887c;
            if (gtVar != null) {
                if (gtVar instanceof C3226c) {
                    C3226c c3226c = (C3226c) gtVar;
                    if (c3226c.f16580c != null) {
                        c3226c.f16580c.m16340a(i, i2, true);
                    }
                } else if (gtVar instanceof C3228d) {
                    C3228d c3228d = (C3228d) gtVar;
                    c3228d.f16586b.m16348a(i, i2);
                    c3228d.m16291b(true);
                } else {
                    String str = "Unexpected ViewPagerTab type:";
                    String valueOf = String.valueOf(gtVar.getClass().toString());
                    FinskyLog.m21669e(valueOf.length() != 0 ? str.concat(valueOf) : new String(str), new Object[0]);
                }
            }
        }
        m6637n(i);
        m6638o(i);
    }

    private final z m6636m(int i) {
        ab abVar = this.f6892a.f14921a.d[this.av.f6883y];
        if (abVar.h == null || i < 0 || i >= abVar.h.b.length) {
            return null;
        }
        return abVar.h.b[i];
    }

    private final void m6637n(int i) {
        z m = m6636m(i);
        if (m != null) {
            C1473m.f7980a.mo2246h(C1473m.f7980a.cZ()).f25088e = m.h;
        }
    }

    private final void m6638o(int i) {
        int i2 = 0;
        z m = m6636m(i);
        if (m != null) {
            if ((m.b & 16) != 0) {
                i2 = m.i;
            }
            this.f6895f = i2;
            this.bm.mo1235a(this.f6894e, this.f6895f, this.f6896g, true);
        }
    }

    final void ap() {
        this.at.setHasBackgroundImage(this.ax.f18593e.getVisibility() == 0);
    }
}
