package com.google.android.finsky.activities;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.net.Uri.Builder;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.Fragment;
import android.support.v4.app.ab;
import android.support.v4.view.C0362s;
import android.support.v4.view.ai;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.C0404a;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.support.v7.widget.fe;
import android.support.v7.widget.ff;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.TextView;
import android.widget.Toast;
import com.android.volley.AuthFailureError;
import com.android.volley.VolleyError;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.aa.C0954a;
import com.google.android.finsky.aa.C0955b;
import com.google.android.finsky.api.C1254c;
import com.google.android.finsky.api.C1290m;
import com.google.android.finsky.at.C0998m;
import com.google.android.finsky.at.C1507b;
import com.google.android.finsky.at.C1508k;
import com.google.android.finsky.ba.C1552e;
import com.google.android.finsky.bg.ad;
import com.google.android.finsky.billing.common.C1789d;
import com.google.android.finsky.billing.common.RedeemCodeResult;
import com.google.android.finsky.billing.profile.C2063t;
import com.google.android.finsky.billing.profile.C2064u;
import com.google.android.finsky.billing.profile.C2065v;
import com.google.android.finsky.bm.C1040f;
import com.google.android.finsky.bm.C2117a;
import com.google.android.finsky.bm.C2119c;
import com.google.android.finsky.bm.C2122e;
import com.google.android.finsky.bm.C2126i;
import com.google.android.finsky.cf.p116a.C2268a;
import com.google.android.finsky.cg.C2278e;
import com.google.android.finsky.cn.C2322b;
import com.google.android.finsky.cv.p177a.ip;
import com.google.android.finsky.dfemodel.C2717g;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.frameworkviews.LinkTextView;
import com.google.android.finsky.headerlistlayout.FinskyHeaderListLayout;
import com.google.android.finsky.layout.actionbar.C3658a;
import com.google.android.finsky.layout.actionbar.C3663f;
import com.google.android.finsky.layout.actionbar.C3664g;
import com.google.android.finsky.layout.actionbar.C3665h;
import com.google.android.finsky.layout.actionbar.C3671m;
import com.google.android.finsky.layout.actionbar.FinskySearchToolbar;
import com.google.android.finsky.layout.play.C3718z;
import com.google.android.finsky.layout.play.FinskyDrawerLayout;
import com.google.android.finsky.layoutswitcher.C3735c;
import com.google.android.finsky.layoutswitcher.C3736d;
import com.google.android.finsky.layoutswitcher.ErrorIndicatorWithNotifyLayout;
import com.google.android.finsky.navigationmanager.C3748a;
import com.google.android.finsky.notification.C1061b;
import com.google.android.finsky.p106a.C0950c;
import com.google.android.finsky.p106a.C0951d;
import com.google.android.finsky.p106a.C0952e;
import com.google.android.finsky.p107l.C3646a;
import com.google.android.finsky.p107l.C3647b;
import com.google.android.finsky.p111d.C2471a;
import com.google.android.finsky.p111d.C2474c;
import com.google.android.finsky.p111d.C2475d;
import com.google.android.finsky.p111d.C2482j;
import com.google.android.finsky.p111d.C2492t;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p113v.C1042d;
import com.google.android.finsky.p113v.C4695b;
import com.google.android.finsky.pagesystem.C1037e;
import com.google.android.finsky.pagesystem.C1041g;
import com.google.android.finsky.playcard.ac;
import com.google.android.finsky.uninstall.az;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.bb;
import com.google.android.libraries.play.entertainment.story.MediaPlayerOverlayView;
import com.google.android.play.drawer.C3690g;
import com.google.android.play.drawer.C6292b;
import com.google.android.wallet.ui.common.a;
import com.squareup.leakcanary.C7582R;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends C1036b implements C0950c, C0998m, C1040f, C1037e, C1041g, C1042d {
    public C3748a f6361G;
    public Bundle f6362H;
    public boolean f6363I;
    public int f6364J;
    public int f6365K = -1;
    public int f6366L = -1;
    public ViewGroup f6367M;
    public FinskyDrawerLayout f6368N;
    public C0951d f6369O = null;
    public C4695b f6370P;
    public C2122e f6371Q;
    public MediaPlayerOverlayView f6372R;
    public C6292b f6373S;
    public final C2492t f6374T;
    public C3658a f6375U;
    public boolean f6376V;
    public Menu f6377W;
    public int f6378X;
    public final C1061b f6379Y;
    public final Runnable f6380Z;
    public fr aa;
    public ft ab;
    public ff ac;
    public VolleyError ad;
    public C2268a ae;
    public final Handler f6381c = new Handler();
    public final C2471a f6382t = C1473m.f7980a.aR();

    public MainActivity() {
        C1473m.f7980a.au();
        this.f6374T = C1473m.f7980a.aP();
        this.f6378X = C7582R.id.action_bar;
        this.f6379Y = new eq(this);
        this.f6380Z = new er();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (C1473m.f7980a.bK().mo3875b()) {
            this.f6376V = true;
            finish();
            return;
        }
        FinskySearchToolbar finskySearchToolbar;
        if (bundle != null) {
            this.f6374T.f13417a = true;
        }
        this.f6374T.m13355a();
        C1473m.f7980a.dc().m13335l();
        this.f6374T.m13350a(this.C, 1707);
        if (C1473m.f7980a.dj().mo2294a(12640732)) {
            setContentView((int) C7582R.layout.main_recyclerview_drawer);
        } else {
            setContentView((int) C7582R.layout.main);
        }
        Toolbar i = mo1274i();
        if (i instanceof FinskySearchToolbar) {
            ((FinskySearchToolbar) i).a(new C3671m(this));
        }
        this.f6362H = bundle;
        this.f6367M = (ViewGroup) findViewById(C7582R.id.content_frame);
        this.f6361G = C1473m.f7980a.mo2252k().mo3726a(this);
        this.f6361G.mo3637a(new es(this));
        if (i instanceof FinskySearchToolbar) {
            finskySearchToolbar = (FinskySearchToolbar) i;
        } else {
            finskySearchToolbar = null;
        }
        m2347a(i);
        C0404a a = G_().mo500a();
        if (this.f6375U == null) {
            this.f6375U = new C3658a(this.f6361G, this, this);
        } else {
            this.f6375U.m17384a(finskySearchToolbar);
        }
        this.f6373S = new C6292b(a.mo582g());
        a.mo575c(this.f6373S);
        if (this.f6377W != null) {
            this.f6375U.m17382a((Activity) this, this.f6377W);
        }
        m6167E();
        if (bundle != null) {
            this.f6361G.mo3685b(bundle);
            this.f6364J = bundle.getInt("last_shown_error_hash");
        }
        if (!this.f6361G.mo3722y()) {
            mo1251u();
            m6166D();
        }
        this.f6368N = (FinskyDrawerLayout) findViewById(C7582R.id.drawer_layout);
        if (FinskyDrawerLayout.m17524i()) {
            FinskyDrawerLayout finskyDrawerLayout = this.f6368N;
            C2495w a2 = this.f6316C.m13365a();
            long longValue = ((Long) C0955b.jm.m28964b()).longValue();
            finskyDrawerLayout.f18666O = this;
            finskyDrawerLayout.ad = a2;
            boolean z = bundle != null && bundle.getBoolean("FinskyDrawerLayout.isDrawerOpened", false);
            if (z) {
                finskyDrawerLayout.m17531a(this, bundle, a2);
            } else {
                finskyDrawerLayout.aa.postDelayed(new C3718z(finskyDrawerLayout, this, bundle, a2), longValue);
            }
        } else {
            this.f6368N.m17531a(this, bundle, this.f6316C.m13365a());
        }
        setDefaultKeyMode(3);
        if (((Boolean) C1789d.f9316c.m5760a()).booleanValue() && !C1473m.f7980a.dj().mo2294a(12641184)) {
            a aVar = new a(this, (byte) 0);
            aVar.a(LayoutInflater.from(this).inflate(C7582R.layout.wait_for_wifi_v2_not_supported, null));
            aVar.a(C7582R.string.ok, new et());
            aVar.a().show();
        }
        if (C1473m.f7980a.dj().mo2294a(12637762)) {
            this.ae = new C2268a(this.f6367M, new ep(this), C1473m.f7980a.mo2260s().f11267a, new ev(this));
        }
    }

    public final Object T_() {
        this.f6381c.removeCallbacks(this.f6380Z);
        return super.T_();
    }

    protected void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        if (this.f6368N.ap) {
            this.f6368N.mo3600h();
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f6368N.onConfigurationChanged(configuration);
    }

    public void onMultiWindowModeChanged(boolean z) {
        super.onMultiWindowModeChanged(z);
        if (z) {
            this.C.m13371a(new C2474c(546).f13342a, null);
        } else {
            this.C.m13371a(new C2474c(547).f13342a, null);
        }
    }

    private final void m6162b(C2495w c2495w) {
        int i = 1;
        String str = null;
        mo1251u();
        m6166D();
        Intent intent = getIntent();
        String stringExtra = intent.getStringExtra("authAccount");
        if (stringExtra != null) {
            intent.removeExtra("authAccount");
            FinskyLog.m21659a("b/5160617: Switching account to %s due to intent", FinskyLog.m21655a(stringExtra));
            mo1264a(stringExtra, intent);
            return;
        }
        ab H_;
        C1508k c1508k;
        boolean z;
        String stringExtra2;
        String stringExtra3;
        int hashCode;
        C2322b a = C1473m.f7980a.mo2032L().mo2854a("com.android.providers.downloads");
        if (a == null) {
            FinskyLog.m21669e("Cannot find com.android.providers.downloads", new Object[0]);
        } else if (a.f11424i || a.f11425j) {
            FinskyLog.m21665c("Detected disabled com.android.providers.downloads", new Object[0]);
            H_ = H_();
            if (H_.mo283a("download_manager_disabled") == null) {
                c1508k = new C1508k();
                c1508k.m8851a(null, 40, null).m8848a((int) C7582R.string.download_manager_disabled).m8860d((int) C7582R.string.ok).m8862e((int) C7582R.string.cancel).m8853a(false);
                c1508k.mo2272a().m625a(H_, "download_manager_disabled");
            }
            z = true;
            if (!z) {
                if (VERSION.SDK_INT >= 19) {
                    a = C1473m.f7980a.mo2032L().mo2854a("com.google.android.gms");
                    if (a != null) {
                        FinskyLog.m21669e("Cannot find com.google.android.gms", new Object[0]);
                    } else if (a.f11424i || a.f11425j) {
                        FinskyLog.m21665c("Detected disabled com.google.android.gms", new Object[0]);
                        H_ = H_();
                        if (H_.mo283a("gms_core_disabled") == null) {
                            c1508k = new C1508k();
                            c1508k.m8851a(null, 42, null).m8848a((int) C7582R.string.gms_core_disabled).m8860d((int) C7582R.string.ok).m8862e((int) C7582R.string.cancel).m8853a(false);
                            c1508k.mo2272a().m625a(H_, "gms_core_disabled");
                        }
                        if (i != 0) {
                            if (intent.hasExtra("error_html_message")) {
                                if (intent.hasExtra("error_title")) {
                                    str = intent.getStringExtra("error_title");
                                }
                                stringExtra2 = intent.getStringExtra("error_html_message");
                                stringExtra3 = intent.getStringExtra("error_doc_id");
                                hashCode = new StringBuilder((String.valueOf(stringExtra2).length() + String.valueOf(str).length()) + String.valueOf(stringExtra3).length()).append(stringExtra2).append(str).append(stringExtra3).toString().hashCode();
                                if (this.f6364J != hashCode) {
                                    m6184a(str, stringExtra2, intent.getIntExtra("error_return_code", -1), stringExtra3, this.f6382t.m13179a(intent.getExtras()));
                                    this.f6364J = hashCode;
                                }
                            }
                            if (this.f6368N != null) {
                                this.f6368N.mo3590d();
                            }
                            C1473m.f7980a.cd().mo2768a(this, c2495w, this.f6316C, this.f6361G, this.f6375U.f18449h, this.f6375U.f18450i);
                        }
                    }
                }
                i = 0;
                if (i != 0) {
                    if (intent.hasExtra("error_html_message")) {
                        if (intent.hasExtra("error_title")) {
                            str = intent.getStringExtra("error_title");
                        }
                        stringExtra2 = intent.getStringExtra("error_html_message");
                        stringExtra3 = intent.getStringExtra("error_doc_id");
                        hashCode = new StringBuilder((String.valueOf(stringExtra2).length() + String.valueOf(str).length()) + String.valueOf(stringExtra3).length()).append(stringExtra2).append(str).append(stringExtra3).toString().hashCode();
                        if (this.f6364J != hashCode) {
                            m6184a(str, stringExtra2, intent.getIntExtra("error_return_code", -1), stringExtra3, this.f6382t.m13179a(intent.getExtras()));
                            this.f6364J = hashCode;
                        }
                    }
                    if (this.f6368N != null) {
                        this.f6368N.mo3590d();
                    }
                    C1473m.f7980a.cd().mo2768a(this, c2495w, this.f6316C, this.f6361G, this.f6375U.f18449h, this.f6375U.f18450i);
                }
            }
        }
        z = false;
        if (!z) {
            if (VERSION.SDK_INT >= 19) {
                a = C1473m.f7980a.mo2032L().mo2854a("com.google.android.gms");
                if (a != null) {
                    FinskyLog.m21665c("Detected disabled com.google.android.gms", new Object[0]);
                    H_ = H_();
                    if (H_.mo283a("gms_core_disabled") == null) {
                        c1508k = new C1508k();
                        c1508k.m8851a(null, 42, null).m8848a((int) C7582R.string.gms_core_disabled).m8860d((int) C7582R.string.ok).m8862e((int) C7582R.string.cancel).m8853a(false);
                        c1508k.mo2272a().m625a(H_, "gms_core_disabled");
                    }
                    if (i != 0) {
                        if (intent.hasExtra("error_html_message")) {
                            if (intent.hasExtra("error_title")) {
                                str = intent.getStringExtra("error_title");
                            }
                            stringExtra2 = intent.getStringExtra("error_html_message");
                            stringExtra3 = intent.getStringExtra("error_doc_id");
                            hashCode = new StringBuilder((String.valueOf(stringExtra2).length() + String.valueOf(str).length()) + String.valueOf(stringExtra3).length()).append(stringExtra2).append(str).append(stringExtra3).toString().hashCode();
                            if (this.f6364J != hashCode) {
                                m6184a(str, stringExtra2, intent.getIntExtra("error_return_code", -1), stringExtra3, this.f6382t.m13179a(intent.getExtras()));
                                this.f6364J = hashCode;
                            }
                        }
                        if (this.f6368N != null) {
                            this.f6368N.mo3590d();
                        }
                        C1473m.f7980a.cd().mo2768a(this, c2495w, this.f6316C, this.f6361G, this.f6375U.f18449h, this.f6375U.f18450i);
                    }
                }
                FinskyLog.m21669e("Cannot find com.google.android.gms", new Object[0]);
            }
            i = 0;
            if (i != 0) {
                if (intent.hasExtra("error_html_message")) {
                    if (intent.hasExtra("error_title")) {
                        str = intent.getStringExtra("error_title");
                    }
                    stringExtra2 = intent.getStringExtra("error_html_message");
                    stringExtra3 = intent.getStringExtra("error_doc_id");
                    hashCode = new StringBuilder((String.valueOf(stringExtra2).length() + String.valueOf(str).length()) + String.valueOf(stringExtra3).length()).append(stringExtra2).append(str).append(stringExtra3).toString().hashCode();
                    if (this.f6364J != hashCode) {
                        m6184a(str, stringExtra2, intent.getIntExtra("error_return_code", -1), stringExtra3, this.f6382t.m13179a(intent.getExtras()));
                        this.f6364J = hashCode;
                    }
                }
                if (this.f6368N != null) {
                    this.f6368N.mo3590d();
                }
                C1473m.f7980a.cd().mo2768a(this, c2495w, this.f6316C, this.f6361G, this.f6375U.f18449h, this.f6375U.f18450i);
            }
        }
    }

    protected final void mo1252w() {
        if (!C1473m.f7980a.dj().mo2294a(12633657) && mo1280v()) {
            String str = (String) C0954a.aR.m5777b(C1473m.f7980a.db()).m5760a();
            if (!TextUtils.isEmpty(str)) {
                if (C1473m.f7980a.dj().mo2294a(12633894) && C1473m.f7980a.bk().mo4381a(str)) {
                    m6158I();
                    return;
                }
                Builder buildUpon = Uri.parse(str).buildUpon();
                buildUpon.appendQueryParameter("nocache_isui", Boolean.toString(true));
                buildUpon.appendQueryParameter("nocache_pwr", Boolean.toString(true));
                C2717g c2717g = new C2717g(C1473m.f7980a.ap(), buildUpon.build().toString());
            }
        }
        m6158I();
    }

    private final void m6158I() {
        if (mo1280v()) {
            C1552e dj = C1473m.f7980a.aN().dj();
            if (dj.mo2294a(12630046) && dj.mo2294a(12635663) && this.aa == null && this.ab == null) {
                ac h = C1473m.f7980a.mo2245h();
                Resources resources = getResources();
                int a = h.m18478a(false);
                this.ac = new ad();
                C1473m.f7980a.cn().m19642a(resources, this.ac);
                this.aa = new fr(this, this.ac);
                bb.m21792a(this.aa, Integer.valueOf(a), (Integer) C0955b.iz.m28964b(), Integer.valueOf(C7582R.layout.play_highlights_banner_card_item), Integer.valueOf(5));
                if (dj.mo2294a(12642058)) {
                    this.ab = new ft(this, this.ac);
                    bb.m21792a(this.ab, Integer.valueOf(C7582R.layout.flat_card_cluster), Integer.valueOf(r3.m19640a()));
                }
            }
        }
    }

    protected final boolean mo1280v() {
        boolean z;
        String action = getIntent().getAction();
        if ("android.intent.action.SEARCH".equals(action) || "com.google.android.gms.actions.SEARCH_ACTION".equals(action) || "android.intent.action.VIEW".equals(action) || "android.nfc.action.NDEF_DISCOVERED".equals(action) || "afwapp.android.intent.action.VIEW".equals(action) || "com.google.android.finsky.DETAILS".equals(action) || "com.google.android.finsky.VIEW_MY_DOWNLOADS".equals(action) || "com.google.android.finsky.VIEW_BROWSE".equals(action) || "com.google.android.finsky.UNINSTALL_WIZARD_FOR_MY_DOWNLOADS".equals(action) || "com.google.android.finsky.UNINSTALL_WIZARD_FOR_DETAILS".equals(action) || "com.google.android.gms.actions.VIEW_REMOTE_ESCALATIONS".equals(action) || "com.google.android.finsky.PLAY_PASS_HOME".equals(action)) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return false;
        }
        return true;
    }

    protected final void mo1249b(boolean z) {
        this.f6374T.m13350a(this.C, 1708);
        super.mo1249b(z);
        C2063t aD = C1473m.f7980a.aD();
        C1254c ap = C1473m.f7980a.ap();
        String c = ap.mo1636c();
        long currentTimeMillis = System.currentTimeMillis();
        boolean b = aD.m10827b(c);
        boolean a = aD.f10591b.m10831a(c);
        if (!b && !a) {
            FinskyLog.m21662b("Not checking for valid FOP because relevant experiments are disabled. (account=%s)", FinskyLog.m21655a(c));
        } else if (!C2063t.m10823b(c, currentTimeMillis)) {
            if (b && C2063t.m10822a(c, currentTimeMillis) && !a) {
                FinskyLog.m21662b("Not checking for valid FOP because snoozed. (account=%s)", FinskyLog.m21655a(c));
            } else {
                ap.mo1621b(new C2064u(c), new C2065v());
            }
        }
        if (z && (this.f6362H == null || this.f6361G.mo3722y() || this.f6361G.mo3709k() == null)) {
            m6162b(this.f6382t.m13182a(getIntent().getExtras(), this.f6316C));
        }
        this.f6368N.m17542g();
        this.f6362H = null;
    }

    protected void onSaveInstanceState(Bundle bundle) {
        if (this.f6362H != null) {
            bundle.putAll(this.f6362H);
        } else {
            this.f6361G.mo3636a(bundle);
        }
        super.onSaveInstanceState(bundle);
        bundle.putInt("last_shown_error_hash", this.f6364J);
        C3690g c3690g = this.f6368N;
        if (c3690g.ap) {
            c3690g.m17510k();
            bundle.putBoolean("FinskyDrawerLayout.isAccountListExpanded", c3690g.am.mo5385b());
            bundle.putBoolean("FinskyDrawerLayout.isDrawerOpened", c3690g.m17511l());
        } else {
            bundle.putBoolean("FinskyDrawerLayout.isAccountListExpanded", false);
            bundle.putBoolean("FinskyDrawerLayout.isDrawerOpened", false);
        }
        Bundle bundle2 = new Bundle();
        c3690g.ad.m13377a(bundle2);
        bundle.putBundle("FinskyDrawerLayout.LoggingContext", bundle2);
    }

    public final C3748a y_() {
        return this.f6361G;
    }

    public final void mo1241c(String str) {
        this.f6375U.m17385a(str);
        Integer B = this.f6361G.mo3621B();
        if (B != null) {
            ViewGroup D = this.f6361G.mo3623D();
            if (D instanceof FinskyHeaderListLayout) {
                FinskyHeaderListLayout finskyHeaderListLayout = (FinskyHeaderListLayout) D;
                finskyHeaderListLayout.setActionBarTitleColor(B.intValue());
                int intValue = this.f6361G.mo3622C().intValue();
                if (Color.alpha(intValue) > 0) {
                    finskyHeaderListLayout.setFloatingControlsBackground(new ColorDrawable(intValue));
                    return;
                }
                return;
            }
            FinskySearchToolbar finskySearchToolbar = (FinskySearchToolbar) findViewById(this.f6378X);
            if (finskySearchToolbar != null) {
                finskySearchToolbar.setTitleTextColor(B.intValue());
            }
        }
    }

    public final void mo1237a(int i, boolean z) {
        mo1236a(i, 0, z);
    }

    public final void mo1236a(int i, int i2, boolean z) {
        mo1235a(i, i2, 0, z);
    }

    public final void mo1235a(int i, int i2, int i3, boolean z) {
        this.f6375U.m17381a(i, z);
        this.f6375U.m17379a(i2);
        this.f6368N.mo3593a(i, i3);
    }

    public final void mo1242d(String str) {
        if (C1473m.f7980a.dj().mo2294a(12624205)) {
            C3658a c3658a = this.f6375U;
            ((C3663f) c3658a.f18447f.peek()).f18473c = str;
            c3658a.m17378a();
        }
    }

    public final void mo1246z() {
        this.f6375U.m17387a(false, -1);
    }

    public final void mo1240c(int i) {
        this.f6375U.m17387a(true, i);
    }

    public final void a_(C2495w c2495w) {
        this.f6375U.m17383a(c2495w);
    }

    public final C4695b mo1234A() {
        if (this.f6370P == null) {
            this.f6370P = new C4695b(this, (ViewGroup) findViewById(C7582R.id.outer_content_frame));
        }
        return this.f6370P;
    }

    public final C0950c mo1243l() {
        return this;
    }

    public final void mo1259a() {
        this.f6361G.mo3678a(true);
        if (this.f6367M.getPaddingTop() != 0) {
            ai.m1823a(this.f6367M, ai.f1848a.mo401l(this.f6367M), 0, ai.f1848a.mo402m(this.f6367M), this.f6367M.getPaddingBottom());
        }
    }

    public final void mo1267c() {
        this.f6361G.mo3678a(false);
        int paddingTop = this.f6367M.getPaddingTop();
        int max = Math.max(FinskySearchToolbar.a(this), G_().mo500a().mo574c());
        if (paddingTop != max) {
            ai.m1823a(this.f6367M, ai.f1848a.mo401l(this.f6367M), max, ai.f1848a.mo402m(this.f6367M), this.f6367M.getPaddingBottom());
        }
    }

    public final void mo1269d() {
        this.f6361G.mo3694b(true);
    }

    public final void mo1270e() {
        this.f6361G.mo3694b(false);
    }

    public final void mo1271f() {
        this.f6375U.m17380a(1, null);
        if (this.f6369O != null) {
            this.f6369O.p_();
        }
        ai.m1841c(this.f6367M, 2);
    }

    public final void mo1272g() {
        C3658a c3658a = this.f6375U;
        if (c3658a.m17388a(Integer.valueOf(1))) {
            c3658a.m17392c();
            c3658a.m17378a();
        } else {
            c3658a.m17390b(Integer.valueOf(1));
        }
        if (this.f6369O != null) {
            this.f6369O.q_();
        }
        ai.m1841c(this.f6367M, 0);
    }

    public final void mo1261a(C0951d c0951d) {
        this.f6369O = c0951d;
    }

    public final void mo1263a(CharSequence charSequence, C0952e c0952e) {
        this.f6363I = true;
        this.f6368N.setDrawerLockMode(1);
        C3658a c3658a = this.f6375U;
        c3658a.m17380a(2, charSequence);
        c3658a.m17389b();
        c3658a.f18465x = c0952e;
        if (c3658a.f18444c != null) {
            c3658a.f18456o.c_(C7582R.drawable.ic_collapse);
        }
        c3658a.m17378a();
    }

    public final void mo1273h() {
        this.f6363I = false;
        this.f6368N.setDrawerLockMode(0);
        C3658a c3658a = this.f6375U;
        if (c3658a.f18444c != null) {
            c3658a.f18456o.c_(0);
        }
        c3658a.f18465x = null;
        if (c3658a.m17388a(Integer.valueOf(2))) {
            c3658a.m17392c();
            c3658a.m17378a();
            return;
        }
        c3658a.m17390b(Integer.valueOf(2));
    }

    public final void mo1262a(C2495w c2495w) {
        m6170H().ad = c2495w;
    }

    public final void mo1255B() {
        if (FinskyDrawerLayout.m17524i() || FinskyDrawerLayout.m17525j()) {
            m6170H();
        }
    }

    public final void c_(int i) {
        C0404a a = G_().mo500a();
        if (a == null) {
            return;
        }
        if (i == 0) {
            a.mo575c(this.f6373S);
        } else {
            a.mo561a(i);
        }
    }

    public final void mo1275j() {
        this.f6375U.m17380a(3, null);
    }

    public final void mo1276k() {
        C3658a c3658a = this.f6375U;
        if (c3658a.m17388a(Integer.valueOf(3))) {
            c3658a.m17392c();
            c3658a.m17378a();
            return;
        }
        c3658a.m17390b(Integer.valueOf(3));
    }

    public final void mo1260a(ViewGroup viewGroup) {
        int i = 1;
        if (viewGroup instanceof FinskyHeaderListLayout) {
            C3748a c3748a;
            FinskyHeaderListLayout finskyHeaderListLayout = (FinskyHeaderListLayout) viewGroup;
            FinskySearchToolbar finskySearchToolbar = (FinskySearchToolbar) finskyHeaderListLayout.getToolbar();
            if (finskySearchToolbar == null || finskySearchToolbar.l()) {
                c3748a = this.f6361G;
                i = 0;
            } else {
                int i2;
                if (finskyHeaderListLayout.getActionBarTranslationY() == 0.0f) {
                    i2 = 1;
                } else {
                    i2 = 0;
                }
                C3748a c3748a2 = this.f6361G;
                if (i2 != 0) {
                    i = 2;
                    c3748a = c3748a2;
                } else {
                    c3748a = c3748a2;
                }
            }
            c3748a.mo3697c(i);
        }
    }

    public final void m6165C() {
        this.f6375U.m17386a(true);
        ai.m1841c(this.f6367M, 2);
    }

    public final void mo1244m() {
        onBackPressed();
    }

    protected void onResume() {
        this.f6374T.m13355a();
        super.onResume();
        C1473m.f7980a.mo2259r().mo3776a(this.f6379Y);
        az a = az.m21336a();
        if (a != null) {
            a.f23526f = this.f6379Y;
        }
        if (this.f6368N.ap) {
            this.f6368N.mo3600h();
        }
    }

    protected void onPostResume() {
        super.onPostResume();
        if (this.ad != null) {
            VolleyError volleyError = this.ad;
            this.ad = null;
            m6161b(volleyError);
        }
    }

    protected void onPause() {
        super.onPause();
        if (this.f6329z) {
            this.f6374T.m13352a(this.C, 1721, -1, "user_interruption");
        }
        this.f6374T.f13417a = true;
        C1473m.f7980a.mo2259r().mo3801b(this.f6379Y);
        az a = az.m21336a();
        if (a != null) {
            a.f23526f = null;
        }
        this.f6365K = C1473m.f7980a.bl().f4180a.incrementAndGet();
        this.f6366L = C1473m.f7980a.bm().f4180a.incrementAndGet();
    }

    protected final void mo1266b(String str) {
        C1473m.f7980a.mo2053a(C1473m.f7980a.bl().f4180a.incrementAndGet(), C1473m.f7980a.bm().f4180a.incrementAndGet());
        if (!C1473m.f7980a.dj().mo2294a(12629293)) {
            C1473m.f7980a.bk().mo4380a(null, str);
        }
        if (this.x) {
            FinskyLog.m21669e("Should not be here after state was saved", new Object[0]);
            return;
        }
        if (this.f6361G != null) {
            this.f6361G.mo3696c();
            this.f6361G.mo3723z();
        }
        if (this.f6367M != null) {
            int i;
            int childCount = this.f6367M.getChildCount();
            List arrayList = new ArrayList();
            for (i = 0; i < childCount; i++) {
                View childAt = this.f6367M.getChildAt(i);
                int id = childAt.getId();
                if (!(id == C7582R.id.placeholder_loading || id == C7582R.id.placeholder_error || id == C7582R.id.placeholder_error_with_notify)) {
                    arrayList.add(childAt);
                }
            }
            ArrayList arrayList2 = (ArrayList) arrayList;
            childCount = arrayList2.size();
            i = 0;
            while (i < childCount) {
                Object obj = arrayList2.get(i);
                i++;
                this.f6367M.removeView((View) obj);
            }
        }
        mo1250t();
    }

    protected void onNewIntent(Intent intent) {
        setIntent(intent);
        this.ad = null;
        C2495w a = this.f6382t.m13179a(intent.getExtras());
        if (a != null && "deep_link".equals(a.f13432b)) {
            this.C = a;
        }
        if (this.x || (!this.A && ((Boolean) C0955b.hT.m28964b()).booleanValue())) {
            this.x = false;
            super.onNewIntent(intent);
            return;
        }
        m6162b(this.f6382t.m13182a(intent.getExtras(), this.f6316C));
        m6057a(intent);
    }

    protected void onActivityResult(int i, int i2, Intent intent) {
        if (i == 31 && i2 == 40) {
            FinskyLog.m21659a("b/5160617: Reinitialize with null accountafter user changed content level", new Object[0]);
            m6059a(new ew(this));
            return;
        }
        if (i == 34) {
            C2495w c2495w = this.f6316C;
            if (intent != null) {
                RedeemCodeResult redeemCodeResult = (RedeemCodeResult) intent.getParcelableExtra("redeem_code_result");
                if (!(redeemCodeResult == null || redeemCodeResult.f9311e == null)) {
                    ip ipVar = redeemCodeResult.f9311e.f12324d;
                    if (ipVar == null) {
                        FinskyLog.m21669e("Unexpected missing resolvedLink", new Object[0]);
                    } else if (TextUtils.isEmpty(ipVar.f12681d)) {
                        FinskyLog.m21669e("Unexpected missing browseUrl", new Object[0]);
                    } else {
                        startActivity(C1473m.f7980a.bo().mo2747a((Context) this, ipVar.f12681d, null, ipVar.f12675H, c2495w));
                    }
                }
            }
        } else if (i == 35) {
            boolean z = i2 == -1;
            C1473m.f7980a.dc().m13318a(503, z);
            if (z) {
                C1473m.f7980a.aq().mo5378a();
                this.f6381c.postDelayed(new ex(this), 3000);
            }
        } else if (i != 51 && i == 52) {
            C1473m.f7980a.aY().mo2307a(intent, this.f6361G, this.C);
        }
        super.onActivityResult(i, i2, intent);
    }

    protected void onDestroy() {
        if (this.f6376V) {
            super.onDestroy();
            return;
        }
        if (this.f6368N != null) {
            FinskyDrawerLayout finskyDrawerLayout = this.f6368N;
            if (finskyDrawerLayout.aa != null) {
                finskyDrawerLayout.aa.removeCallbacksAndMessages(null);
            }
            if (finskyDrawerLayout.f18667P != null) {
                finskyDrawerLayout.f18667P.mo3686b(finskyDrawerLayout.af);
                finskyDrawerLayout.af = null;
            }
        }
        if (this.aa != null) {
            this.aa.cancel(true);
            this.aa = null;
        }
        if (this.ab != null) {
            this.ab.cancel(false);
            this.ab = null;
        }
        this.ac = null;
        this.ae = null;
        this.f6361G.mo3707i();
        super.onDestroy();
    }

    protected void onStart() {
        this.f6374T.m13355a();
        this.f6374T.m13350a(this.C, 1702);
        super.onStart();
        if (C1473m.f7980a.mo2022B().m8966b(C1473m.f7980a.db())) {
            FinskyLog.m21659a("Reload home because of new enterprise acl consistency token.", new Object[0]);
            this.f6361G.mo3696c();
            this.f6361G.mo3646a(C1473m.f7980a.dn(), this.C);
        }
        if (C1473m.f7980a.dj().mo2294a(12627477)) {
            C1473m.f7980a.dc().m13329a(null);
        }
        if (this.ae != null) {
            C2268a c2268a = this.ae;
            if (!C2278e.f11283a.contains(c2268a)) {
                C2278e.f11283a.add(c2268a);
            }
            c2268a.m11729b(c2268a.f11256c.getContext().getApplicationContext());
        }
    }

    protected void onStop() {
        super.onStop();
        this.f6374T.m13350a(this.C, 1720);
        this.f6374T.f13417a = true;
        this.f6381c.post(this.f6380Z);
        if (this.f6365K == -1) {
            this.f6365K = C1473m.f7980a.bl().f4180a.incrementAndGet();
        }
        if (this.f6366L == -1) {
            this.f6366L = C1473m.f7980a.bm().f4180a.incrementAndGet();
        }
        C1473m.f7980a.mo2053a(this.f6365K, this.f6366L);
        this.f6365K = -1;
        this.f6366L = -1;
        if (this.f6371Q != null) {
            C2122e c2122e = this.f6371Q;
            if (c2122e.f10757g.m11061a()) {
                c2122e.f10761k.m11035a(6, c2122e.f10760j, c2122e.f10759i, c2122e.f10763m);
            } else {
                c2122e.f10761k.m11035a(5, c2122e.f10760j, c2122e.f10759i, c2122e.f10763m);
            }
            c2122e.m11051f();
            this.f6371Q = null;
        }
        if (this.ae != null) {
            C2268a c2268a = this.ae;
            C2278e.f11283a.remove(c2268a);
            c2268a.m11727a();
        }
    }

    public void onBackPressed() {
        if (this.f6368N.ap && this.f6368N.m17511l()) {
            this.f6368N.mo3590d();
        } else if (!this.f6361G.mo3682a(this.f6316C, false)) {
            super.onBackPressed();
        }
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        getMenuInflater().inflate(C7582R.menu.actions, menu);
        if (C1473m.f7980a.dj().mo2294a(12624205)) {
            MenuItem findItem = menu.findItem(C7582R.id.share_button);
            if (findItem != null) {
                Drawable icon = findItem.getIcon();
                if (icon != null) {
                    icon.mutate();
                    icon.setColorFilter(-1, Mode.SRC_ATOP);
                }
            }
        }
        this.f6375U.m17382a((Activity) this, menu);
        this.f6377W = menu;
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        int i = 0;
        int itemId = menuItem.getItemId();
        if (itemId == 16908332) {
            if (m6160K() && this.f6368N.ap) {
                DrawerLayout drawerLayout = this.f6368N;
                drawerLayout.m17510k();
                if (DrawerLayout.m2091g(drawerLayout.al)) {
                    drawerLayout.m2103f(drawerLayout.al);
                    return true;
                }
                drawerLayout.m2102e(drawerLayout.al);
                return true;
            }
            this.f6368N.mo3590d();
            if (this.f6361G.mo3695b(this.f6316C, false)) {
                return true;
            }
            super.onBackPressed();
            return true;
        } else if (itemId == C7582R.id.translate_button) {
            C3658a c3658a = this.f6375U;
            if (c3658a.f18465x == null) {
                return true;
            }
            c3658a.f18465x.mo3555c();
            r2 = c3658a.f18465x.mo3554b();
            C1473m.f7980a.dc().m13325a(r2 ? 256 : 257, null, c3658a.f18455n.mo3712n());
            c3658a.f18459r.setTitle(r2 ? C7582R.string.revert_translation : C7582R.string.translate);
            return true;
        } else if (itemId == C7582R.id.auto_update_button) {
            r3 = this.f6375U;
            Document u = r3.f18455n.mo3718u();
            if (u == null) {
                FinskyLog.m21669e("tried to operate on a null doc", new Object[0]);
            } else if (u.f14885a.f12099f != 3) {
                FinskyLog.m21669e("tried to operate on a non-apps doc.", new Object[0]);
            } else {
                r4 = u.f14885a.f12096c;
                boolean z = !C3664g.m17396a(r4);
                ab H_ = H_();
                C3646a I = C1473m.f7980a.mo2029I();
                C3647b a = C1473m.f7980a.mo2029I().m17243a(r4);
                if (a.f18029d == null || a.f18029d.f10808b != 1) {
                    r2 = false;
                } else {
                    r2 = true;
                }
                I.f18022b.mo2661a(r4, z ? 1 : 2);
                if (!(!z || C1473m.f7980a.mo2265x().m18670c() || C1473m.f7980a.mo2265x().m18668a())) {
                    new C3665h().m625a(H_, "auto_update_dialog");
                }
                C2482j dc = C1473m.f7980a.dc();
                itemId = z ? 1 : 0;
                if (r2) {
                    i = 1;
                }
                dc.m13320a(new C2474c(403).m13243b(Integer.valueOf(itemId)).m13235a(Integer.valueOf(i)).m13236a(r4).f13342a, null, -1);
            }
            r3.m17393d();
            return true;
        } else if (itemId == C7582R.id.env_button) {
            Toast.makeText(this, "Environment indicator (not visible externally)", 0).show();
            return true;
        } else if (itemId == C7582R.id.notification_settings_button) {
            this.f6375U.f18455n.mo3634a((Context) this, this.C);
            return true;
        } else if (!C1473m.f7980a.dj().mo2294a(12624205) || itemId != C7582R.id.share_button) {
            return super.onOptionsItemSelected(menuItem);
        } else {
            r3 = this.f6375U;
            r4 = ((C3663f) r3.f18447f.peek()).f18473c;
            CharSequence charSequence = ((C3663f) r3.f18447f.peek()).f18472b;
            if (TextUtils.isEmpty(r4)) {
                return true;
            }
            C1473m.f7980a.bn().mo2694a(r3.f18446e, r3.f18455n.mo3712n(), r3.f18455n.mo3710l(), r4, false, charSequence != null ? charSequence.toString() : "");
            return true;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    final boolean m6184a(java.lang.String r7, java.lang.String r8, int r9, java.lang.String r10, com.google.android.finsky.p111d.C2495w r11) {
        /*
        r6 = this;
        r0 = 0;
        r1 = 1;
        r2 = com.google.android.finsky.C1473m.f7980a;
        r2 = r2.mo2032L();
        r2 = r2.mo2854a(r10);
        switch(r9) {
            case 1: goto L_0x0044;
            case 2: goto L_0x000f;
            case 3: goto L_0x0013;
            default: goto L_0x000f;
        };
    L_0x000f:
        r6.mo1238a(r7, r8, r11);
    L_0x0012:
        return r1;
    L_0x0013:
        r2 = com.google.android.finsky.C1473m.f7980a;
        r2 = r2.dj();
        r4 = 12610437; // 0xc06b85 float:1.7670986E-38 double:6.2303837E-317;
        r2 = r2.mo2294a(r4);
        if (r2 == 0) goto L_0x0034;
    L_0x0022:
        r2 = new java.util.ArrayList;
        r2.<init>();
        r2.add(r10);
        r3 = r6.f6316C;
        r0 = com.google.android.finsky.uninstall.UninstallManagerActivityV2.m21251a(r2, r3, r0);
        r6.startActivity(r0);
        goto L_0x0012;
    L_0x0034:
        r0 = r6.f6361G;
        r0 = r0.mo3718u();
        r2 = r6.f6316C;
        r0 = com.google.android.finsky.uninstall.UninstallManagerActivity.m21236a(r0, r2);
        r6.startActivity(r0);
        goto L_0x0012;
    L_0x0044:
        if (r2 == 0) goto L_0x004b;
    L_0x0046:
        r2 = r2.f11422g;
        if (r2 == 0) goto L_0x004b;
    L_0x004a:
        r0 = r1;
    L_0x004b:
        if (r0 != 0) goto L_0x000f;
    L_0x004d:
        r0 = new com.google.android.finsky.at.k;
        r0.<init>();
        r2 = 2131952315; // 0x7f1302bb float:1.954107E38 double:1.0533243974E-314;
        r2 = r0.m8848a(r2);
        r3 = 2131952688; // 0x7f130430 float:1.9541826E38 double:1.0533245817E-314;
        r2 = r2.m8860d(r3);
        r3 = 2131953292; // 0x7f13068c float:1.954305E38 double:1.05332488E-314;
        r2.m8862e(r3);
        r2 = new android.os.Bundle;
        r2.<init>();
        r3 = "error_package_name";
        r2.putString(r3, r10);
        r3 = 0;
        r4 = 32;
        r0.m8851a(r3, r4, r2);
        r0 = r0.mo2272a();
        r2 = r6.H_();
        r3 = "mismatched_certificates";
        r0.m625a(r2, r3);
        goto L_0x0012;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.finsky.activities.MainActivity.a(java.lang.String, java.lang.String, int, java.lang.String, com.google.android.finsky.d.w):boolean");
    }

    private final void m6159J() {
        C1508k c1508k = new C1508k();
        c1508k.m8851a(null, 41, null).m8848a((int) C7582R.string.restart_required).m8860d((int) C7582R.string.ok).m8853a(false);
        c1508k.mo2272a().m625a(H_(), "restart_required");
    }

    public final void mo1238a(String str, String str2, C2495w c2495w) {
        if (TextUtils.isEmpty(str2)) {
            FinskyLog.m21669e("Unknown error with empty error message.", new Object[0]);
        } else if (this.x) {
            FinskyLog.m21667d(str2, new Object[0]);
        } else {
            C1507b.m8844a(H_(), null, str, str2, c2495w, 0);
        }
    }

    protected final void mo1248a(VolleyError volleyError) {
        if (volleyError instanceof AuthFailureError) {
            Intent intent = ((AuthFailureError) volleyError).f4024a;
            if (intent != null) {
                this.f6325v = true;
                startActivityForResult(intent, 22);
                return;
            }
        }
        mo1251u();
        m6161b(volleyError);
        DrawerLayout H = m6170H();
        H.m17510k();
        if (!DrawerLayout.m2091g(H.al)) {
            H.m2102e(H.al);
        }
    }

    final void m6166D() {
        findViewById(C7582R.id.placeholder_error).setVisibility(8);
        findViewById(C7582R.id.placeholder_error_with_notify).setVisibility(8);
    }

    private final void m6161b(VolleyError volleyError) {
        if (this.x) {
            this.ad = volleyError;
            return;
        }
        if (!this.f6361G.mo3722y()) {
            this.f6361G.mo3696c();
        }
        if (this.f6329z) {
            this.f6374T.m13352a(this.C, 1721, -1, "authentication_error");
        }
        CharSequence c = C1290m.m7704c(this, volleyError);
        View findViewById = findViewById(C7582R.id.placeholder_error);
        ErrorIndicatorWithNotifyLayout errorIndicatorWithNotifyLayout = (ErrorIndicatorWithNotifyLayout) findViewById(C7582R.id.placeholder_error_with_notify);
        C3736d u = C1473m.f7980a.mo2262u();
        OnClickListener eyVar = new ey(this);
        if (u.m17616a()) {
            int i;
            if (((Boolean) C0954a.f5809E.m5760a()).booleanValue()) {
                i = 1;
            } else {
                i = 5;
            }
            errorIndicatorWithNotifyLayout.m17613a(C3735c.m17615a(i, 1), eyVar);
            errorIndicatorWithNotifyLayout.setVisibility(0);
            findViewById.setVisibility(8);
            return;
        }
        findViewById.setVisibility(0);
        errorIndicatorWithNotifyLayout.setVisibility(8);
        TextView textView = (TextView) findViewById.findViewById(C7582R.id.error_msg);
        textView.setText(c);
        if (textView instanceof LinkTextView) {
            LinkTextView linkTextView = (LinkTextView) textView;
            linkTextView.setContentDescription(c);
            linkTextView.setMovementMethod(LinkMovementMethod.getInstance());
        }
        findViewById.findViewById(C7582R.id.retry_button).setOnClickListener(eyVar);
    }

    public final void mo1202a(int i, Bundle bundle) {
        Intent intent;
        switch (i) {
            case 32:
                return;
            case 40:
                FinskyLog.m21659a("Attempting to enable download manager", new Object[0]);
                getPackageManager().setApplicationEnabledSetting("com.android.providers.downloads", 1, 0);
                m6159J();
                return;
            case 41:
                FinskyLog.m21659a("Shutting down after download manager or gms core re-enabled", new Object[0]);
                System.exit(0);
                return;
            case 42:
                FinskyLog.m21659a("Attempting to enable gms core", new Object[0]);
                getPackageManager().setApplicationEnabledSetting("com.google.android.gms", 1, 0);
                m6159J();
                return;
            case 47:
                intent = new Intent("android.settings.INTERNAL_STORAGE_SETTINGS");
                if (intent.resolveActivity(getPackageManager()) != null) {
                    startActivity(intent);
                    return;
                }
                return;
            case 48:
                intent = new Intent("android.settings.MEMORY_CARD_SETTINGS");
                if (intent.resolveActivity(getPackageManager()) != null) {
                    startActivity(intent);
                    return;
                }
                return;
            default:
                if (this.f6361G != null) {
                    this.f6361G.mo3627a(i, bundle);
                    return;
                }
                return;
        }
    }

    public final void f_(int i) {
    }

    public final void mo1211b(int i, Bundle bundle) {
        switch (i) {
            case 32:
                C1473m.f7980a.mo2256o().mo3445b(bundle.getString("error_package_name"), false);
                return;
            case 40:
                FinskyLog.m21659a("Shutting down because download manager remains disabled", new Object[0]);
                System.exit(0);
                return;
            case 42:
                FinskyLog.m21659a("Shutting down because gms core remains disabled", new Object[0]);
                System.exit(0);
                return;
            default:
                return;
        }
    }

    public boolean onSearchRequested() {
        if (!C1473m.f7980a.mo2039S().m21204a()) {
            return false;
        }
        boolean z;
        C3658a c3658a = this.f6375U;
        if (c3658a.f18462u != null) {
            if (C0362s.m2064d(c3658a.f18462u)) {
                C0362s.m2063c(c3658a.f18462u);
            } else {
                C0362s.m2062b(c3658a.f18462u);
            }
            z = true;
        } else {
            z = false;
        }
        if (z || super.onSearchRequested()) {
            return true;
        }
        return false;
    }

    protected final void mo1264a(String str, Intent intent) {
        super.mo1264a(str, intent);
        if (this.f6375U != null) {
            this.f6375U.m17381a(0, false);
            this.f6375U.m17379a(0);
        }
        if (this.f6368N != null) {
            this.f6368N.mo3593a(0, 0);
        }
    }

    public final void m6167E() {
        if (this.f6373S != null) {
            boolean K = m6160K();
            int i = K ? 0 : 1;
            this.f6373S.m28911a(i, this.f6361G.mo3716s());
            C3658a c3658a = this.f6375U;
            if (c3658a.f18445d != null) {
                c3658a.f18445d.setIdleModeDrawerIconState(i);
            }
            C0404a a = G_().mo500a();
            if (a == null) {
                return;
            }
            if (K && this.f6368N.ap) {
                a.mo570b(this.f6368N.m17511l() ? C7582R.string.play_drawer_close : C7582R.string.play_drawer_open);
            } else if (this.f6363I) {
                a.mo570b((int) C7582R.string.expanded_details_close);
            } else {
                a.mo570b(0);
            }
        }
    }

    private final boolean m6160K() {
        int g = this.f6361G.mo3705g();
        boolean z = g == 1 || g == 17 || g == 2 || g == 10 || g == 3 || g == 13 || g == 20 || g == 27 || g == 23 || g == 26 || g == 29;
        Fragment k = this.f6361G.mo3709k();
        if (g != 4 || !(k instanceof gn)) {
            return z;
        }
        gn gnVar = (gn) k;
        if (gnVar.k_.m14607a(gnVar.bF) != null) {
            return true;
        }
        return z;
    }

    public final Toolbar mo1274i() {
        return (Toolbar) findViewById(this.f6378X);
    }

    public final boolean mo1256F() {
        return !this.f6327x;
    }

    public final MediaPlayerOverlayView mo1257G() {
        if (this.f6372R == null) {
            ViewGroup viewGroup = (ViewGroup) findViewById(C7582R.id.outer_content_frame);
            this.f6372R = (MediaPlayerOverlayView) LayoutInflater.from(this).inflate(C7582R.layout.media_overlay, viewGroup, false);
            viewGroup.addView(this.f6372R);
            ((ViewGroup) findViewById(C7582R.id.action_bar_container_container)).bringToFront();
        }
        return this.f6372R;
    }

    public final void mo1265a(String str, View view, com.google.android.finsky.p111d.ad adVar, byte[] bArr) {
        if (this.f6371Q == null) {
            C2119c bL = C1473m.f7980a.bL();
            this.f6371Q = new C2122e(this, getResources(), this.f6361G.mo3708j(), this, (ViewGroup) findViewById(C7582R.id.outer_content_frame), this.C, bL.f10748a);
        }
        fe feVar = this.f6371Q;
        if (TextUtils.isEmpty(str)) {
            FinskyLog.m21667d("Tried to play video with empty id.", new Object[0]);
        } else if (TextUtils.equals(feVar.f10759i, str)) {
            if (feVar.f10757g.m11061a()) {
                feVar.f10762l.m13379b(new C2475d(adVar).m13256a(6501));
                feVar.f10761k.m11035a(2, feVar.f10760j, feVar.f10759i, feVar.f10763m);
            } else {
                feVar.f10762l.m13379b(new C2475d(adVar).m13256a(6500));
                feVar.f10761k.m11036a(feVar.f10760j, feVar.f10759i, feVar.f10763m);
            }
            C2126i c2126i = feVar.f10757g;
            if (c2126i.f10770e == null) {
                FinskyLog.m21667d("Try to pause/resume video without initial loading and construct fragment", new Object[0]);
            } else if (!c2126i.m11061a()) {
                int i;
                if (c2126i.f10770e == null) {
                    FinskyLog.m21667d("Cannot determine if video is paused with uninitialized fragment", new Object[0]);
                } else if (c2126i.f10766a == 5) {
                    i = 1;
                    if (i != 0 && c2126i.f10771f != null) {
                        c2126i.f10771f.a();
                        return;
                    }
                }
                i = 0;
                if (i != 0) {
                }
            } else if (c2126i.f10771f != null) {
                try {
                    c2126i.f10771f.b();
                } catch (IllegalStateException e) {
                }
            }
        } else {
            feVar.f10762l.m13379b(new C2475d(adVar).m13256a(6500));
            if (feVar.m11050e()) {
                feVar.m11051f();
            }
            for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
                if (parent instanceof RecyclerView) {
                    RecyclerView recyclerView = (RecyclerView) parent;
                    ((RecyclerView) parent).mo2951a(feVar);
                    feVar.f10751a.add(recyclerView);
                }
            }
            if (feVar.f10751a.isEmpty()) {
                FinskyLog.m21669e("InlineVideoPlayer fail since anchor view %s doesn't have recycler parent", view.getClass().getName());
                return;
            }
            feVar.f10759i = str;
            feVar.f10763m = bArr;
            C2117a c2117a = feVar.f10758h;
            ViewGroup viewGroup = feVar.f10754d;
            c2117a.m11030a();
            c2117a.f10739b = view;
            c2117a.f10739b.addOnAttachStateChangeListener(c2117a);
            c2117a.f10739b.getViewTreeObserver().addOnScrollChangedListener(c2117a);
            c2117a.f10740c = viewGroup;
            c2117a.f10740c.getWindowVisibleDisplayFrame(c2117a.f10742e);
            c2117a.f10745h = 1;
            c2117a.m11031b();
        }
    }

    public final FinskyDrawerLayout m6170H() {
        if (!this.f6368N.ap) {
            this.f6368N.m17531a(this, this.f6362H, this.f6316C.m13365a());
        }
        if (FinskyDrawerLayout.m17525j()) {
            this.f6368N.m17538b(true);
        }
        return this.f6368N;
    }
}
