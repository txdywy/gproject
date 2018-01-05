package com.google.android.finsky.activities;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.bg.C1613m;
import com.google.android.finsky.by.C2196e;
import com.google.android.finsky.by.C2206c;
import com.google.android.finsky.by.C2233o;
import com.google.android.finsky.cn.C2322b;
import com.google.android.finsky.cv.p177a.C2441n;
import com.google.android.finsky.cx.C1000f;
import com.google.android.finsky.dfemodel.DfeToc;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.dn.C2833a;
import com.google.android.finsky.installqueue.C1003o;
import com.google.android.finsky.installqueue.C3340g;
import com.google.android.finsky.installqueue.C3369m;
import com.google.android.finsky.installqueue.C3371p;
import com.google.android.finsky.navigationmanager.C3748a;
import com.google.android.finsky.p107l.C3646a;
import com.google.android.finsky.p107l.C3647b;
import com.google.android.finsky.p107l.C3654j;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p111d.ad;
import com.google.android.finsky.p198f.C3026a;
import com.google.android.finsky.packagemanager.C0983h;
import com.google.android.finsky.packagemanager.C3851f;
import com.google.android.finsky.pagesystem.C1045b;
import com.google.android.finsky.preregistration.C1005p;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.play.image.C1294w;
import com.squareup.leakcanary.C7582R;
import java.util.ArrayList;
import java.util.List;

public final class ch extends dc implements C1000f, C1003o, C0983h, C1005p {
    public static String f6615i;
    public static boolean f6616j;
    public final C3340g f6617b;
    public final C3646a f6618c;
    public final C2206c f6619d;
    public boolean f6620e;
    public boolean f6621f;
    public C2441n f6622g;
    public final C3851f g_;
    public TextView f6623h;
    public List f6624k = new ArrayList();
    public final C2833a f6625l;
    public final C2233o f6626u;

    public ch(DfeToc dfeToc, Account account, C3851f c3851f, C3340g c3340g, C3646a c3646a, C2206c c2206c) {
        super(dfeToc, account);
        this.g_ = c3851f;
        this.f6617b = c3340g;
        this.f6618c = c3646a;
        this.f6619d = c2206c;
        m6416a(account);
        this.f6625l = C1473m.f7980a.mo2253l();
        this.f6626u = C1473m.f7980a.mo2045Y();
    }

    public final void mo1316a(Context context, C3748a c3748a, C1294w c1294w, C1045b c1045b, boolean z, String str, String str2, boolean z2, ad adVar, C2495w c2495w) {
        super.mo1316a(context, c3748a, c1294w, c1045b, z, str, str2, z2, adVar, c2495w);
        this.f6620e = z;
        m6418s();
    }

    private final void m6418s() {
        if (this.f6620e) {
            this.g_.mo3819b(this);
            this.g_.mo3818a((C0983h) this);
            if (!this.f6621f) {
                C1473m.f7980a.bw().mo3481a((C1003o) this);
                C1473m.f7980a.mo2243f().m18637a((C1005p) this);
                C1473m.f7980a.bH().m13163a(this);
                this.f6621f = true;
            }
        }
    }

    public final void mo1317a(Document document, Document document2, boolean z, String str, boolean z2, Intent intent, View... viewArr) {
        super.mo1317a(document, document2, z, str, z2, intent, viewArr);
        this.f6622g = document.m14625N();
        if (f6616j) {
            if (this.f6623h == null) {
                this.f6623h = (TextView) mo1323c((int) C7582R.id.title_app_size_rating_line);
                long c = C1473m.f7980a.mo2223d().m8962c(this.D);
                if (this.f6623h != null && c > 0) {
                    CharSequence a = C1613m.m9289a(c, this.f6623h.getResources());
                    if (!TextUtils.isEmpty(a)) {
                        this.f6623h.setText(a);
                    }
                }
            }
            m6420u();
        }
        m6418s();
        this.f6624k.clear();
        this.f6624k.add(document.m14625N().f13171k);
    }

    public final void mo1313a() {
        this.g_.mo3819b(this);
        if (this.f6621f) {
            C1473m.f7980a.bw().mo3484b((C1003o) this);
            C1473m.f7980a.mo2243f().m18641b((C1005p) this);
            C1473m.f7980a.bH().m13164b(this);
            this.f6621f = false;
        }
        super.mo1313a();
    }

    private static synchronized void m6416a(Account account) {
        synchronized (ch.class) {
            if (!TextUtils.equals(f6615i, account.name)) {
                f6616j = C1473m.f7980a.mo2249j(account.name).mo2294a(12603301);
                f6615i = account.name;
            }
        }
    }

    protected final void mo1319b() {
        if (this.D.f14885a.f12099f != 3) {
            FinskyLog.m21669e("Unexpected doc backend %d, %s", Integer.valueOf(this.D.f14885a.f12099f), this.D);
            super.mo1319b();
            return;
        }
        Object obj = this.D.m14625N().f13171k;
        if (!TextUtils.isEmpty(obj)) {
            ViewGroup viewGroup = (ViewGroup) this.H.findViewById(C7582R.id.download_progress_panel);
            viewGroup.findViewById(C7582R.id.downloading_bytes);
            viewGroup.findViewById(C7582R.id.downloading_percentage);
            viewGroup.findViewById(C7582R.id.progress_bar);
            viewGroup.findViewById(C7582R.id.cancel_download);
            C3371p c = this.f6617b.mo3485c(obj);
            switch (c.f17276a) {
                case 0:
                    viewGroup.setVisibility(4);
                    boolean z = false;
                    break;
                case 3:
                    mo1314a((int) C7582R.string.installing);
                    break;
                case 4:
                    mo1314a((int) C7582R.string.uninstalling);
                    break;
                default:
                    ((TextView) mo1323c((int) C7582R.id.title_title)).setSelected(false);
                    if (!C1473m.f7980a.ce().m5997a(c)) {
                        m6419t();
                        this.m.m5960a(this.D, this.E, this.A.bw, this.H, this.af);
                        break;
                    }
                    viewGroup = (ViewGroup) mo1323c((int) C7582R.id.title_extra_labels);
                    viewGroup.removeAllViews();
                    mo1322a(LayoutInflater.from(this.B), viewGroup, this.B.getString(C7582R.string.download_paused_wifi));
                    viewGroup.setVisibility(0);
                    mo1318a(false);
                    break;
            }
            int i = 1;
            if (i == 0) {
                super.mo1319b();
            }
        }
    }

    protected final void mo1314a(int i) {
        super.mo1314a(i);
        this.H.findViewById(C7582R.id.download_progress_panel).setVisibility(4);
        m6419t();
    }

    private final void m6419t() {
        m6420u();
        mo1318a(true);
    }

    private final void m6420u() {
        int i = 1;
        int i2 = 8;
        if (this.f6623h != null) {
            if (TextUtils.isEmpty(this.f6623h.getText()) || this.f6622g == null) {
                this.f6623h.setVisibility(8);
                return;
            }
            int i3;
            String str = this.f6622g.f13171k;
            C3371p c = this.f6617b.mo3485c(str);
            if (c.f17276a == 2 || c.f17276a == 3 || c.f17276a == 4) {
                i3 = 1;
            } else {
                i3 = 0;
            }
            if (i3 != 0) {
                this.f6623h.setVisibility(8);
                return;
            }
            C3647b a = this.f6618c.m17243a(str);
            C2322b c2322b = a != null ? a.f18028c : null;
            if (a == null || c2322b == null) {
                i = 0;
            }
            TextView textView = this.f6623h;
            if (i == 0) {
                i2 = 0;
            }
            textView.setVisibility(i2);
            if (i != 0) {
                C2196e a2 = this.f6619d.mo2811a(this.C);
                if (new C3654j(C1473m.f7980a.aN()).m17264a(this.f6622g).m17262a(c2322b).m17265a() && this.f6626u.m11649a(this.D, this.M, a2)) {
                    this.f6623h.setVisibility(0);
                }
            }
        }
    }

    protected final void mo1318a(boolean z) {
        this.I.setVisibility(8);
        if (!this.J && !z) {
            String str = this.D.m14625N().f13171k;
            C3026a a = C1473m.f7980a.bt().m15626a(str);
            C2196e a2 = this.f6619d.mo2811a(this.C);
            if ((a.m15624b(this.D) || a.m15622a(this.D)) && this.f6626u.m11649a(this.D, this.M, a2) && !a.f15833u && !this.f6625l.m14986a(this.D)) {
                C1473m.f7980a.mo2223d().m8959a(this.D);
            }
            if (!(a.f15820h || this.D.ae() || !this.f6626u.m11649a(this.D, this.M, this.f6619d) || this.f6625l.m14989b(this.D) || this.f6625l.m14991c(this.D, this.C) || C1473m.f7980a.ce().m5997a(this.f6617b.mo3485c(str)))) {
                C1473m.f7980a.mo2223d().m8959a(this.D);
            }
            this.m.m5960a(this.D, this.E, this.A.bw, this.H, this.af);
            mo1329q();
            if (this.I.getVisibility() == 0) {
                ((TextView) this.H.findViewById(C7582R.id.summary_dynamic_status)).setVisibility(4);
            }
        }
    }

    private final void m6417f(String str) {
        if (this.D != null && this.D.m14625N() != null && this.D.m14625N().f13171k.equals(str)) {
            mo1319b();
            m6420u();
        }
    }

    public final void mo1213c(String str) {
        if (this.D != null && this.D.ae() && this.D.f14885a.f12096c.equals(str)) {
            mo1326i();
        }
    }

    public final void mo1175b(String str, boolean z) {
        m6417f(str);
    }

    public final void mo1177d(String str) {
        m6417f(str);
    }

    public final void mo1174a(String[] strArr) {
    }

    public final void mo1176c(String str, boolean z) {
    }

    public final void mo1178e(String str) {
    }

    public final void mo1205a(C3369m c3369m) {
        boolean a = C1473m.f7980a.dj().mo2294a(12625960);
        if (this.D == null) {
            return;
        }
        if ((this.f6624k.contains(c3369m.m16819a()) || a) && this.A.m610k()) {
            mo1326i();
        }
    }

    public final void mo1212b(String str) {
        if (this.D.m14625N().f13171k.equals(str)) {
            this.G = true;
            mo1326i();
        }
    }

    public final void mo1208a(String str, boolean z) {
        if (this.D.m14625N().f13171k.equals(str)) {
            this.G = false;
            mo1326i();
        }
    }
}
