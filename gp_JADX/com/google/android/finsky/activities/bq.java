package com.google.android.finsky.activities;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.p011c.p012a.C0054l;
import android.support.v4.app.ab;
import android.support.v4.os.C0327a;
import android.support.v4.p013b.p014a.C0259a;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.aa.C0955b;
import com.google.android.finsky.at.C1508k;
import com.google.android.finsky.av.C1527a;
import com.google.android.finsky.ba.C1552e;
import com.google.android.finsky.bg.C1608h;
import com.google.android.finsky.bg.C1613m;
import com.google.android.finsky.by.C2196e;
import com.google.android.finsky.by.C2206c;
import com.google.android.finsky.by.C2233o;
import com.google.android.finsky.cn.C2322b;
import com.google.android.finsky.ct.C2412a;
import com.google.android.finsky.cv.p177a.C2441n;
import com.google.android.finsky.cv.p177a.ch;
import com.google.android.finsky.cv.p177a.es;
import com.google.android.finsky.cx.C1000f;
import com.google.android.finsky.cx.C2460b;
import com.google.android.finsky.dfemodel.DfeToc;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.dn.C1002e;
import com.google.android.finsky.dn.C2833a;
import com.google.android.finsky.frameworkviews.C3147s;
import com.google.android.finsky.frameworkviews.C3148t;
import com.google.android.finsky.frameworkviews.PlayActionButtonV2;
import com.google.android.finsky.installer.C3300k;
import com.google.android.finsky.installqueue.C1003o;
import com.google.android.finsky.installqueue.C3340g;
import com.google.android.finsky.installqueue.C3369m;
import com.google.android.finsky.installqueue.C3371p;
import com.google.android.finsky.navigationmanager.C3748a;
import com.google.android.finsky.p107l.C3646a;
import com.google.android.finsky.p107l.C3647b;
import com.google.android.finsky.p107l.C3654j;
import com.google.android.finsky.p108z.C4831h;
import com.google.android.finsky.p111d.C2473o;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p111d.ad;
import com.google.android.finsky.p148b.C1542f;
import com.google.android.finsky.packagemanager.C0983h;
import com.google.android.finsky.packagemanager.C3851f;
import com.google.android.finsky.pagesystem.C1045b;
import com.google.android.finsky.preregistration.C1005p;
import com.google.android.finsky.utils.C4672c;
import com.google.android.finsky.utils.C4680k;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.play.image.C1294w;
import com.squareup.leakcanary.C7582R;
import java.util.ArrayList;
import java.util.List;

public final class bq extends cu implements C1000f, C1002e, C1003o, C0983h, C1005p {
    public static String f6548p;
    public static boolean f6549q;
    public final C3851f f6550a;
    public final C3300k f6551b;
    public final C3340g f6552c;
    public final C3646a f6553d;
    public final C2206c f6554e;
    public final C2460b f6555f;
    public final C2412a f6556g;
    public final C1542f f6557h;
    public boolean f6558i;
    public boolean f6559j;
    public boolean f6560k;
    public C2441n f6561l;
    public TextView f6562m;
    public C3147s f6563n;
    public cg f6564o;
    public List f6565r = new ArrayList();
    public List f6566s = new ArrayList();
    public final C2833a f6567t;
    public final C2233o f6568u;

    public bq(DfeToc dfeToc, Account account, C3851f c3851f, C3300k c3300k, C3340g c3340g, C3646a c3646a, C2206c c2206c) {
        super(dfeToc, account);
        this.f6550a = c3851f;
        this.f6551b = c3300k;
        this.f6552c = c3340g;
        this.f6553d = c3646a;
        this.f6554e = c2206c;
        this.f6567t = C1473m.f7980a.mo2253l();
        this.f6555f = C1473m.f7980a.bH();
        this.f6556g = C1473m.f7980a.mo2028H();
        this.f6557h = C1473m.f7980a.mo2027G();
        this.f6568u = C1473m.f7980a.mo2045Y();
        this.f6564o = cg.SHOW;
        m6364a(account);
    }

    public final void mo1316a(Context context, C3748a c3748a, C1294w c1294w, C1045b c1045b, boolean z, String str, String str2, boolean z2, ad adVar, C2495w c2495w) {
        super.mo1316a(context, c3748a, c1294w, c1045b, z, str, str2, z2, adVar, c2495w);
        this.f6558i = z;
        m6369h();
        this.f6556g.m12119a(context, null);
    }

    private final void m6369h() {
        if (this.f6558i) {
            this.f6550a.mo3819b(this);
            this.f6550a.mo3818a((C0983h) this);
            if (!this.f6559j) {
                C1473m.f7980a.bw().mo3481a((C1003o) this);
                C1473m.f7980a.mo2243f().m18637a((C1005p) this);
                this.f6555f.m13163a(this);
                this.f6567t.m14984a((C1002e) this);
                this.f6559j = true;
            }
        }
    }

    public final void mo1317a(Document document, Document document2, boolean z, String str, boolean z2, Intent intent, View... viewArr) {
        super.mo1317a(document, document2, z, str, z2, intent, viewArr);
        this.f6561l = document.m14625N();
        if (f6549q) {
            if (this.f6562m == null) {
                this.f6562m = (TextView) mo1323c((int) C7582R.id.title_app_size_rating_line);
                long c = C1473m.f7980a.mo2223d().m8962c(this.D);
                if (this.f6562m != null && c > 0) {
                    CharSequence a = C1613m.m9289a(c, this.f6562m.getResources());
                    if (!TextUtils.isEmpty(a)) {
                        this.f6562m.setText(a);
                    }
                }
            }
            m6371t();
        }
        m6369h();
        this.f6565r.clear();
        this.f6565r.add(document.m14625N().f13171k);
        if (C1473m.f7980a.dj().mo2294a(12643667)) {
            es z3 = document.m14671z();
            if (z3 != null) {
                this.f6566s.clear();
                Object[] a2 = C4680k.m21818a((String) C0955b.jR.m28964b());
                for (ch chVar : z3.f12312d) {
                    if (C4672c.m21804a(a2, chVar.f12035c)) {
                        this.f6566s.add(chVar.f12035c);
                    }
                }
            }
        }
    }

    public final void mo1313a() {
        this.f6550a.mo3819b(this);
        if (this.f6559j) {
            C1473m.f7980a.bw().mo3484b((C1003o) this);
            C1473m.f7980a.mo2243f().m18641b((C1005p) this);
            this.f6555f.m13164b(this);
            this.f6567t.m14988b((C1002e) this);
            this.f6559j = false;
        }
        if (this.f6563n != null) {
            C3148t c3148t = this.f6563n.f16281d;
            if (c3148t.f16304r != null) {
                c3148t.f16304r.dismiss();
            }
        }
        this.f6563n = null;
        super.mo1313a();
    }

    private static synchronized void m6364a(Account account) {
        synchronized (bq.class) {
            if (!TextUtils.equals(f6548p, account.name)) {
                f6549q = C1473m.f7980a.mo2249j(account.name).mo2294a(12603301);
                f6548p = account.name;
            }
        }
    }

    protected final void mo1319b() {
        if (this.D.f14885a.f12099f != 3) {
            FinskyLog.m21669e("Unexpected doc backend %d, %s", Integer.valueOf(this.D.f14885a.f12099f), this.D);
            super.mo1319b();
            return;
        }
        String str = this.D.m14625N().f13171k;
        if (!TextUtils.isEmpty(str)) {
            Object obj;
            ViewGroup viewGroup = (ViewGroup) this.H.findViewById(C7582R.id.download_progress_panel);
            TextView textView = (TextView) viewGroup.findViewById(C7582R.id.downloading_bytes);
            TextView textView2 = (TextView) viewGroup.findViewById(C7582R.id.downloading_percentage);
            ProgressBar progressBar = (ProgressBar) viewGroup.findViewById(C7582R.id.progress_bar);
            ImageView imageView = (ImageView) viewGroup.findViewById(C7582R.id.cancel_download);
            C3371p c = this.f6552c.mo3485c(str);
            switch (c.f17276a) {
                case 0:
                    viewGroup.setVisibility(4);
                    obj = null;
                    break;
                case 3:
                    mo1314a((int) C7582R.string.installing);
                    break;
                case 4:
                    mo1314a((int) C7582R.string.uninstalling);
                    break;
                default:
                    ((TextView) mo1323c((int) C7582R.id.title_title)).setSelected(false);
                    if (!m6366a(c)) {
                        m6370s();
                        C1473m c1473m = C1473m.f7980a;
                        c1473m.bV();
                        C1527a.m8947a(this.B, c, textView, textView2, progressBar);
                        if (c.f17276a == 1) {
                            textView.setText(C1473m.f7980a.ce().m5991a(this.B));
                            if (c1473m.dj().mo2294a(12643667)) {
                                for (String c2 : this.f6566s) {
                                    Object obj2;
                                    switch (this.f6552c.mo3485c(c2).f17276a) {
                                        case 1:
                                        case 2:
                                        case 3:
                                            textView.setText(C7582R.string.install_progress_downloading_library);
                                            progressBar.setIndeterminate(true);
                                            obj2 = 1;
                                            continue;
                                        default:
                                            obj2 = null;
                                            continue;
                                    }
                                    if (obj2 != null) {
                                    }
                                }
                            }
                        }
                        C1552e dj = c1473m.dj();
                        if (dj.mo2294a(12641184)) {
                            C1527a.m8949a(c, viewGroup.findViewById(C7582R.id.downloading_bytes), viewGroup.findViewById(C7582R.id.download_now), str, this.f6551b, this.S, this.T);
                        }
                        if (dj.mo2294a(12628775)) {
                            Drawable e = C0259a.m1526e(C0054l.m66a(this.B.getResources(), C7582R.drawable.ic_play_protect_check_black_24dp, null));
                            C0259a.m1514a(e.mutate(), C1608h.m9243a(this.B, 3));
                            ((ImageView) viewGroup.findViewById(C7582R.id.security_info_icon)).setImageDrawable(e);
                            viewGroup.findViewById(C7582R.id.install_verified_by_play_protect).setVisibility(0);
                        }
                        ((TextView) mo1323c((int) C7582R.id.title_app_size_rating_line)).setVisibility(c.f17276a == 2 ? 8 : 0);
                        imageView.setOnClickListener(new bs(this, str, viewGroup));
                        imageView.setVisibility(0);
                        viewGroup.setVisibility(0);
                        break;
                    }
                    ViewGroup viewGroup2 = (ViewGroup) mo1323c((int) C7582R.id.title_extra_labels);
                    viewGroup2.removeAllViews();
                    mo1322a(LayoutInflater.from(this.B), viewGroup2, this.B.getString(C7582R.string.download_paused_wifi));
                    viewGroup2.setVisibility(0);
                    mo1318a(false);
                    viewGroup.setVisibility(4);
                    break;
            }
            obj = 1;
            if (obj == null) {
                super.mo1319b();
            }
        }
    }

    protected final void mo1314a(int i) {
        super.mo1314a(i);
        this.H.findViewById(C7582R.id.download_progress_panel).setVisibility(4);
        m6370s();
    }

    private final void m6370s() {
        m6371t();
        mo1318a(true);
    }

    private final void m6371t() {
        int i = 1;
        int i2 = 8;
        if (this.f6562m != null) {
            if (TextUtils.isEmpty(this.f6562m.getText()) || this.f6561l == null) {
                this.f6562m.setVisibility(8);
                return;
            }
            int i3;
            String str = this.f6561l.f13171k;
            C3371p c = this.f6552c.mo3485c(str);
            if (c.f17276a == 2 || c.f17276a == 3 || c.f17276a == 4) {
                i3 = 1;
            } else {
                i3 = 0;
            }
            if (i3 != 0) {
                this.f6562m.setVisibility(8);
                return;
            }
            C3647b a = this.f6553d.m17243a(str);
            C2322b c2322b = a != null ? a.f18028c : null;
            if (a == null || c2322b == null) {
                i = 0;
            }
            TextView textView = this.f6562m;
            if (i == 0) {
                i2 = 0;
            }
            textView.setVisibility(i2);
            if (i != 0) {
                C2196e a2 = this.f6554e.mo2811a(this.C);
                if (new C3654j(C1473m.f7980a.aN()).m17264a(this.f6561l).m17262a(c2322b).m17265a() && this.f6568u.m11649a(this.D, this.M, a2)) {
                    this.f6562m.setVisibility(0);
                }
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected final void mo1318a(boolean r26) {
        /*
        r25 = this;
        r4 = 2131755594; // 0x7f10024a float:1.9142072E38 double:1.0532272043E-314;
        r0 = r25;
        r4 = r0.mo1323c(r4);
        r4 = (com.google.android.finsky.frameworkviews.PlayActionButtonV2) r4;
        r5 = 2131755597; // 0x7f10024d float:1.9142078E38 double:1.053227206E-314;
        r0 = r25;
        r5 = r0.mo1323c(r5);
        r13 = r5;
        r13 = (com.google.android.finsky.frameworkviews.PlayActionButtonV2) r13;
        r5 = 2131755589; // 0x7f100245 float:1.9142062E38 double:1.053227202E-314;
        r0 = r25;
        r5 = r0.mo1323c(r5);
        r14 = r5;
        r14 = (com.google.android.finsky.frameworkviews.PlayActionButtonV2) r14;
        r5 = 2131755588; // 0x7f100244 float:1.914206E38 double:1.0532272014E-314;
        r0 = r25;
        r5 = r0.mo1323c(r5);
        r15 = r5;
        r15 = (com.google.android.finsky.frameworkviews.PlayActionButtonV2) r15;
        r5 = 2131755593; // 0x7f100249 float:1.914207E38 double:1.053227204E-314;
        r0 = r25;
        r5 = r0.mo1323c(r5);
        r16 = r5;
        r16 = (com.google.android.finsky.frameworkviews.PlayActionButtonV2) r16;
        r5 = 2131755591; // 0x7f100247 float:1.9142066E38 double:1.053227203E-314;
        r0 = r25;
        r5 = r0.mo1323c(r5);
        r5 = (com.google.android.finsky.frameworkviews.PlayActionButtonV2) r5;
        r6 = 2131755592; // 0x7f100248 float:1.9142068E38 double:1.0532272033E-314;
        r0 = r25;
        r6 = r0.mo1323c(r6);
        r17 = r6;
        r17 = (com.google.android.finsky.frameworkviews.PlayActionButtonV2) r17;
        r6 = 2131755595; // 0x7f10024b float:1.9142074E38 double:1.053227205E-314;
        r0 = r25;
        r6 = r0.mo1323c(r6);
        r18 = r6;
        r18 = (com.google.android.finsky.frameworkviews.PlayActionButtonV2) r18;
        r6 = 2131755587; // 0x7f100243 float:1.9142057E38 double:1.053227201E-314;
        r0 = r25;
        r6 = r0.mo1323c(r6);
        r19 = r6;
        r19 = (com.google.android.finsky.frameworkviews.PlayActionButtonV2) r19;
        r6 = 8;
        r4.setVisibility(r6);
        r4 = 8;
        r0 = r16;
        r0.setVisibility(r4);
        r4 = 8;
        r13.setVisibility(r4);
        r4 = 8;
        r14.setVisibility(r4);
        r4 = 8;
        r15.setVisibility(r4);
        r4 = 8;
        r5.setVisibility(r4);
        r4 = 8;
        r0 = r17;
        r0.setVisibility(r4);
        r4 = 8;
        r0 = r18;
        r0.setVisibility(r4);
        r4 = 8;
        r0 = r19;
        r0.setVisibility(r4);
        r0 = r25;
        r4 = r0.f6563n;
        if (r4 == 0) goto L_0x00b8;
    L_0x00a9:
        r0 = r25;
        r4 = r0.f6563n;
        r4 = r4.f16281d;
        r6 = r4.f16304r;
        if (r6 == 0) goto L_0x00b8;
    L_0x00b3:
        r4 = r4.f16304r;
        r4.dismiss();
    L_0x00b8:
        r0 = r25;
        r4 = r0.J;
        if (r4 != 0) goto L_0x00c0;
    L_0x00be:
        if (r26 == 0) goto L_0x00c1;
    L_0x00c0:
        return;
    L_0x00c1:
        r0 = r25;
        r4 = r0.D;
        r4 = r4.m14625N();
        r0 = r4.f13171k;
        r21 = r0;
        r4 = com.google.android.finsky.C1473m.f7980a;
        r4 = r4.bt();
        r0 = r21;
        r22 = r4.m15626a(r0);
        r4 = 0;
        r6 = r22.m15623b();
        if (r6 == 0) goto L_0x042e;
    L_0x00e0:
        r0 = r25;
        r4 = r0.f6568u;
        r0 = r21;
        r7 = r4.m11650a(r0);
        r4 = 0;
        r5.setVisibility(r4);
        r4 = 215; // 0xd7 float:3.01E-43 double:1.06E-321;
        r0 = r25;
        r0.m6367e(r4);
        r6 = 1;
        r0 = r25;
        r4 = r0.D;
        r4 = r4.f14885a;
        r8 = r4.f12099f;
        r0 = r22;
        r4 = r0.f15829q;
        if (r4 == 0) goto L_0x0429;
    L_0x0104:
        r4 = 2131952992; // 0x7f130560 float:1.9542442E38 double:1.053324732E-314;
    L_0x0107:
        r9 = new com.google.android.finsky.activities.by;
        r0 = r25;
        r1 = r21;
        r2 = r22;
        r9.<init>(r0, r1, r2, r7);
        r5.m6000a(r8, r4, r9);
        r4 = r6;
    L_0x0116:
        r0 = r25;
        r5 = r0.f6554e;
        r0 = r25;
        r6 = r0.C;
        r5 = r5.mo2811a(r6);
        r0 = r25;
        r6 = r0.D;
        r0 = r22;
        r6 = r0.m15624b(r6);
        if (r6 != 0) goto L_0x013a;
    L_0x012e:
        r0 = r25;
        r6 = r0.D;
        r0 = r22;
        r6 = r0.m15622a(r6);
        if (r6 == 0) goto L_0x0589;
    L_0x013a:
        r0 = r25;
        r6 = r0.f6568u;
        r0 = r25;
        r7 = r0.D;
        r0 = r25;
        r8 = r0.M;
        r5 = r6.m11649a(r7, r8, r5);
        if (r5 == 0) goto L_0x0589;
    L_0x014c:
        r0 = r22;
        r5 = r0.f15833u;
        if (r5 != 0) goto L_0x0589;
    L_0x0152:
        r0 = r25;
        r5 = r0.f6567t;
        r0 = r25;
        r6 = r0.D;
        r5 = r5.m14986a(r6);
        if (r5 != 0) goto L_0x0589;
    L_0x0160:
        r5 = 0;
        r0 = r17;
        r0.setVisibility(r5);
        r5 = 217; // 0xd9 float:3.04E-43 double:1.07E-321;
        r0 = r25;
        r0.m6367e(r5);
        r20 = r4 + 1;
        r0 = r25;
        r4 = r0.D;
        r4 = r4.f14885a;
        r0 = r4.f12099f;
        r23 = r0;
        r24 = 2131953338; // 0x7f1306ba float:1.9543144E38 double:1.053324903E-314;
        r0 = r25;
        r4 = r0.z;
        r0 = r25;
        r5 = r0.C;
        r0 = r25;
        r6 = r0.D;
        r7 = 1;
        r8 = 0;
        r0 = r25;
        r9 = r0.L;
        r10 = 217; // 0xd9 float:3.04E-43 double:1.07E-321;
        r11 = 0;
        r0 = r25;
        r12 = r0.S;
        r4 = r4.mo3624a(r5, r6, r7, r8, r9, r10, r11, r12);
        r0 = r17;
        r1 = r23;
        r2 = r24;
        r0.m6000a(r1, r2, r4);
        r4 = com.google.android.finsky.C1473m.f7980a;
        r4 = r4.mo2223d();
        r0 = r25;
        r5 = r0.D;
        r4.m8959a(r5);
        r7 = r20;
    L_0x01b1:
        r4 = 2;
        if (r7 >= r4) goto L_0x0205;
    L_0x01b4:
        r6 = 0;
        r4 = 0;
        r0 = r16;
        r0.setVisibility(r4);
        r5 = -1;
        r4 = 0;
        r0 = r22;
        r8 = r0.f15831s;
        if (r8 == 0) goto L_0x04a7;
    L_0x01c3:
        r0 = r22;
        r5 = r0.f15832t;
        if (r5 == 0) goto L_0x048a;
    L_0x01c9:
        r4 = 219; // 0xdb float:3.07E-43 double:1.08E-321;
        r5 = 2131951948; // 0x7f13014c float:1.9540325E38 double:1.053324216E-314;
        r6 = new com.google.android.finsky.activities.cb;
        r0 = r25;
        r6.<init>(r0);
    L_0x01d5:
        r8 = r16.getVisibility();
        if (r8 != 0) goto L_0x0205;
    L_0x01db:
        r7 = r7 + 1;
        if (r4 == 0) goto L_0x01e4;
    L_0x01df:
        r0 = r25;
        r0.m6367e(r4);
    L_0x01e4:
        r0 = r25;
        r4 = r0.D;
        r4 = r4.f14885a;
        r4 = r4.f12099f;
        r0 = r16;
        r0.m6000a(r4, r5, r6);
        r4 = com.google.android.finsky.C1473m.f7980a;
        r4 = r4.mo2244g();
        r0 = r21;
        r4 = r4.m15130c(r0);
        if (r4 == 0) goto L_0x0205;
    L_0x01ff:
        r4 = 0;
        r0 = r16;
        r0.setEnabled(r4);
    L_0x0205:
        r5 = r7;
        r0 = r22;
        r4 = r0.f15820h;
        if (r4 != 0) goto L_0x02d4;
    L_0x020c:
        r0 = r25;
        r4 = r0.D;
        r4 = r4.ae();
        if (r4 != 0) goto L_0x02d4;
    L_0x0216:
        r0 = r25;
        r4 = r0.f6568u;
        r0 = r25;
        r6 = r0.D;
        r0 = r25;
        r7 = r0.M;
        r0 = r25;
        r8 = r0.f6554e;
        r4 = r4.m11649a(r6, r7, r8);
        if (r4 == 0) goto L_0x02d4;
    L_0x022c:
        r0 = r25;
        r4 = r0.f6567t;
        r0 = r25;
        r6 = r0.D;
        r4 = r4.m14989b(r6);
        if (r4 != 0) goto L_0x02d4;
    L_0x023a:
        r0 = r25;
        r4 = r0.f6567t;
        r0 = r25;
        r6 = r0.D;
        r0 = r25;
        r7 = r0.C;
        r4 = r4.m14991c(r6, r7);
        if (r4 != 0) goto L_0x02d4;
    L_0x024c:
        r0 = r25;
        r4 = r0.f6568u;
        r0 = r25;
        r6 = r0.D;
        r0 = r25;
        r7 = r0.C;
        r4 = r4.m11642a(r6, r7);
        if (r4 == 0) goto L_0x04ca;
    L_0x025e:
        r4 = 1;
    L_0x025f:
        r0 = r25;
        r6 = r0.f6552c;
        r0 = r21;
        r6 = r6.mo3485c(r0);
        r6 = m6366a(r6);
        if (r6 == 0) goto L_0x04cd;
    L_0x026f:
        r0 = r25;
        r4 = r0.H;
        r6 = 2131755324; // 0x7f10013c float:1.9141524E38 double:1.053227071E-314;
        r4 = r4.findViewById(r6);
        r4 = (android.view.ViewGroup) r4;
        r6 = 0;
        r15.setVisibility(r6);
        r6 = 2917; // 0xb65 float:4.088E-42 double:1.441E-320;
        r0 = r25;
        r0.m6367e(r6);
        r0 = r25;
        r6 = r0.D;
        r6 = r6.f14885a;
        r6 = r6.f12099f;
        r0 = r25;
        r7 = r0.B;
        r8 = 2131951800; // 0x7f1300b8 float:1.9540025E38 double:1.053324143E-314;
        r7 = r7.getString(r8);
        r8 = new com.google.android.finsky.activities.cd;
        r0 = r25;
        r1 = r21;
        r8.<init>(r0, r1);
        r15.mo2588a(r6, r7, r8);
        r5 = r5 + 1;
        r6 = 0;
        r14.setVisibility(r6);
        r6 = 2911; // 0xb5f float:4.079E-42 double:1.438E-320;
        r0 = r25;
        r0.m6367e(r6);
        r0 = r25;
        r6 = r0.D;
        r6 = r6.f14885a;
        r6 = r6.f12099f;
        r0 = r25;
        r7 = r0.B;
        r8 = 2131952071; // 0x7f1301c7 float:1.9540574E38 double:1.053324277E-314;
        r7 = r7.getString(r8);
        r8 = new com.google.android.finsky.activities.ce;
        r0 = r25;
        r1 = r21;
        r8.<init>(r0, r1, r4);
        r14.mo2588a(r6, r7, r8);
        r5 = r5 + 1;
    L_0x02d4:
        r0 = r22;
        r4 = r0.f15820h;
        if (r4 != 0) goto L_0x03b8;
    L_0x02da:
        r0 = r25;
        r4 = r0.D;
        r4 = r4.ae();
        if (r4 != 0) goto L_0x03b8;
    L_0x02e4:
        r0 = r25;
        r4 = r0.f6568u;
        r0 = r25;
        r6 = r0.D;
        r0 = r25;
        r7 = r0.M;
        r0 = r25;
        r8 = r0.f6554e;
        r4 = r4.m11649a(r6, r7, r8);
        if (r4 == 0) goto L_0x03b8;
    L_0x02fa:
        r0 = r25;
        r4 = r0.f6567t;
        r0 = r25;
        r6 = r0.D;
        r4 = r4.m14989b(r6);
        if (r4 != 0) goto L_0x03b8;
    L_0x0308:
        r0 = r25;
        r4 = r0.f6567t;
        r0 = r25;
        r6 = r0.D;
        r0 = r25;
        r7 = r0.C;
        r4 = r4.m14991c(r6, r7);
        if (r4 != 0) goto L_0x03b8;
    L_0x031a:
        r0 = r25;
        r4 = r0.af;
        if (r4 == 0) goto L_0x03b8;
    L_0x0320:
        r0 = r25;
        r4 = r0.B;
        r4 = r4.getPackageManager();
        r0 = r25;
        r6 = r0.af;
        r7 = 131072; // 0x20000 float:1.83671E-40 double:6.47582E-319;
        r4 = r4.queryIntentActivities(r6, r7);
        r4 = r4.isEmpty();
        if (r4 != 0) goto L_0x03b8;
    L_0x0338:
        r4 = com.google.android.finsky.C1473m.f7980a;
        r4 = r4.dj();
        r6 = 12636357; // 0xc0d0c5 float:1.7707308E-38 double:6.24319E-317;
        r4 = r4.mo2294a(r6);
        if (r4 == 0) goto L_0x03b8;
    L_0x0347:
        r4 = 0;
        r0 = r19;
        r0.setVisibility(r4);
        r4 = 2943; // 0xb7f float:4.124E-42 double:1.454E-320;
        r0 = r25;
        r0.m6367e(r4);
        r5 = r5 + 1;
        r0 = r25;
        r4 = r0.B;
        r6 = 2131952327; // 0x7f1302c7 float:1.9541094E38 double:1.0533244033E-314;
        r4 = r4.getString(r6);
        r0 = r19;
        r0.setContentDescription(r4);
        r0 = r25;
        r4 = r0.D;
        r4 = r4.f14885a;
        r4 = r4.f12099f;
        r0 = r25;
        r6 = r0.B;
        r7 = 2131952329; // 0x7f1302c9 float:1.9541098E38 double:1.0533244043E-314;
        r6 = r6.getString(r7);
        r7 = new com.google.android.finsky.activities.bt;
        r0 = r25;
        r7.<init>(r0);
        r0 = r19;
        r0.mo2588a(r4, r6, r7);
        r4 = com.google.android.finsky.C1473m.f7980a;
        r4 = r4.dj();
        r6 = 12637101; // 0xc0d3ad float:1.770835E-38 double:6.2435575E-317;
        r4 = r4.mo2294a(r6);
        if (r4 == 0) goto L_0x03a4;
    L_0x0394:
        r0 = r25;
        r4 = r0.B;
        r6 = 2130837733; // 0x7f0200e5 float:1.7280428E38 double:1.0527737207E-314;
        r4 = android.support.v4.p028a.C0216d.m1112a(r4, r6);
        r0 = r19;
        com.google.android.finsky.actionbuttons.C1020p.m6006a(r0, r4);
    L_0x03a4:
        r4 = com.google.android.finsky.C1473m.f7980a;
        r4 = r4.mo2244g();
        r0 = r21;
        r4 = r4.m15130c(r0);
        if (r4 == 0) goto L_0x051e;
    L_0x03b2:
        r4 = 0;
        r0 = r19;
        r0.setEnabled(r4);
    L_0x03b8:
        if (r5 != 0) goto L_0x0409;
    L_0x03ba:
        r0 = r25;
        r4 = r0.D;
        r4 = r4.ae();
        if (r4 == 0) goto L_0x0409;
    L_0x03c4:
        r4 = com.google.android.finsky.C1473m.f7980a;
        r4 = r4.mo2243f();
        r0 = r25;
        r5 = r0.D;
        r5 = r5.f14885a;
        r5 = r5.f12096c;
        r0 = r25;
        r6 = r0.N;
        r6 = r6.mo1620b();
        r5 = r4.m18640a(r5, r6);
        if (r5 == 0) goto L_0x055e;
    L_0x03e0:
        r5 = 1;
        r0 = r25;
        r0.f6560k = r5;
        r5 = 0;
        r0 = r18;
        r0.setVisibility(r5);
        r5 = 296; // 0x128 float:4.15E-43 double:1.46E-321;
        r0 = r25;
        r0.m6367e(r5);
        r0 = r25;
        r5 = r0.D;
        r5 = r5.f14885a;
        r5 = r5.f12099f;
        r6 = 2131952926; // 0x7f13051e float:1.9542309E38 double:1.0533246993E-314;
        r7 = new com.google.android.finsky.activities.bu;
        r0 = r25;
        r7.<init>(r0, r4);
        r0 = r18;
        r0.m6000a(r5, r6, r7);
    L_0x0409:
        r25.mo1329q();
        r0 = r25;
        r4 = r0.I;
        r4 = r4.getVisibility();
        if (r4 != 0) goto L_0x00c0;
    L_0x0416:
        r0 = r25;
        r4 = r0.H;
        r5 = 2131755325; // 0x7f10013d float:1.9141526E38 double:1.0532270714E-314;
        r4 = r4.findViewById(r5);
        r4 = (android.widget.TextView) r4;
        r5 = 4;
        r4.setVisibility(r5);
        goto L_0x00c0;
    L_0x0429:
        r4 = 2131953292; // 0x7f13068c float:1.954305E38 double:1.05332488E-314;
        goto L_0x0107;
    L_0x042e:
        r6 = r22.m15623b();
        if (r6 != 0) goto L_0x045d;
    L_0x0434:
        r0 = r22;
        r6 = r0.f15824l;
        if (r6 == 0) goto L_0x045d;
    L_0x043a:
        r4 = 0;
        r5.setVisibility(r4);
        r4 = 216; // 0xd8 float:3.03E-43 double:1.067E-321;
        r0 = r25;
        r0.m6367e(r4);
        r4 = 1;
        r0 = r25;
        r6 = r0.D;
        r6 = r6.f14885a;
        r6 = r6.f12099f;
        r7 = 2131951956; // 0x7f130154 float:1.9540341E38 double:1.05332422E-314;
        r8 = new com.google.android.finsky.activities.bz;
        r0 = r25;
        r8.<init>(r0);
        r5.m6000a(r6, r7, r8);
        goto L_0x0116;
    L_0x045d:
        r0 = r22;
        r6 = r0.f15829q;
        if (r6 == 0) goto L_0x0116;
    L_0x0463:
        r4 = 0;
        r5.setVisibility(r4);
        r4 = 214; // 0xd6 float:3.0E-43 double:1.057E-321;
        r0 = r25;
        r0.m6367e(r4);
        r4 = 1;
        r0 = r25;
        r6 = r0.D;
        r6 = r6.f14885a;
        r6 = r6.f12099f;
        r7 = 2131952992; // 0x7f130560 float:1.9542442E38 double:1.053324732E-314;
        r8 = new com.google.android.finsky.activities.ca;
        r0 = r25;
        r1 = r21;
        r2 = r22;
        r8.<init>(r0, r1, r2);
        r5.m6000a(r6, r7, r8);
        goto L_0x0116;
    L_0x048a:
        r5 = 2131952690; // 0x7f130432 float:1.954183E38 double:1.0533245827E-314;
        r0 = r25;
        r6 = r0.z;
        r0 = r25;
        r8 = r0.D;
        r0 = r25;
        r9 = r0.C;
        r0 = r25;
        r10 = r0.A;
        r0 = r25;
        r11 = r0.S;
        r6 = r6.mo3626a(r8, r9, r10, r11);
        goto L_0x01d5;
    L_0x04a7:
        r0 = r22;
        r8 = r0.f15833u;
        if (r8 == 0) goto L_0x04c1;
    L_0x04ad:
        r8 = r22.m15621a();
        if (r8 == 0) goto L_0x04c1;
    L_0x04b3:
        r4 = 220; // 0xdc float:3.08E-43 double:1.087E-321;
        r6 = new com.google.android.finsky.activities.cc;
        r0 = r25;
        r6.<init>(r0);
        r5 = 2131952111; // 0x7f1301ef float:1.9540656E38 double:1.0533242966E-314;
        goto L_0x01d5;
    L_0x04c1:
        r8 = 8;
        r0 = r16;
        r0.setVisibility(r8);
        goto L_0x01d5;
    L_0x04ca:
        r4 = 0;
        goto L_0x025f;
    L_0x04cd:
        r6 = 0;
        r13.setVisibility(r6);
        r0 = r25;
        r6 = r0.m6346c(r4);
        r0 = r25;
        r0.m6367e(r6);
        r5 = r5 + 1;
        r0 = r25;
        r7 = r0.f6557h;
        r7.m8974a(r13);
        r0 = r25;
        r7 = r0.D;
        r7 = r7.f14885a;
        r7 = r7.f12099f;
        r0 = r25;
        r4 = r0.m6343b(r4);
        r8 = new com.google.android.finsky.activities.cf;
        r0 = r25;
        r8.<init>(r0, r6);
        r13.mo2588a(r7, r4, r8);
        r4 = com.google.android.finsky.C1473m.f7980a;
        r4 = r4.mo2223d();
        r0 = r25;
        r6 = r0.D;
        r4.m8959a(r6);
        r4 = com.google.android.finsky.C1473m.f7980a;
        r4 = r4.mo2244g();
        r0 = r21;
        r4 = r4.m15130c(r0);
        if (r4 == 0) goto L_0x02d4;
    L_0x0518:
        r4 = 0;
        r13.setEnabled(r4);
        goto L_0x02d4;
    L_0x051e:
        r4 = com.google.android.finsky.C1473m.f7980a;
        r4 = r4.dj();
        r6 = 12637094; // 0xc0d3a6 float:1.770834E-38 double:6.243554E-317;
        r4 = r4.mo2294a(r6);
        if (r4 != 0) goto L_0x03b8;
    L_0x052d:
        r0 = r25;
        r4 = r0.f6563n;
        if (r4 == 0) goto L_0x053c;
    L_0x0533:
        r0 = r25;
        r1 = r19;
        r0.m6378a(r1);
        goto L_0x03b8;
    L_0x053c:
        r4 = com.google.android.finsky.C1473m.f7980a;
        r4 = r4.dj();
        r0 = r25;
        r6 = r0.B;
        r4 = com.google.android.finsky.actionbuttons.ae.m5902a(r4, r6);
        if (r4 == 0) goto L_0x03b8;
    L_0x054c:
        r6 = r19.getViewTreeObserver();
        r7 = new com.google.android.finsky.activities.bw;
        r0 = r25;
        r1 = r19;
        r7.<init>(r0, r1, r4);
        r6.addOnGlobalLayoutListener(r7);
        goto L_0x03b8;
    L_0x055e:
        r5 = 0;
        r0 = r25;
        r0.f6560k = r5;
        r5 = 0;
        r0 = r18;
        r0.setVisibility(r5);
        r5 = 295; // 0x127 float:4.13E-43 double:1.457E-321;
        r0 = r25;
        r0.m6367e(r5);
        r0 = r25;
        r5 = r0.D;
        r5 = r5.f14885a;
        r5 = r5.f12099f;
        r6 = 2131952912; // 0x7f130510 float:1.954228E38 double:1.0533246924E-314;
        r7 = new com.google.android.finsky.activities.bv;
        r0 = r25;
        r7.<init>(r0, r4);
        r0 = r18;
        r0.m6000a(r5, r6, r7);
        goto L_0x0409;
    L_0x0589:
        r7 = r4;
        goto L_0x01b1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.finsky.activities.bq.a(boolean):void");
    }

    final void m6378a(PlayActionButtonV2 playActionButtonV2) {
        if (this.f6563n != null && this.f6564o != cg.HIDE) {
            Rect rect;
            r1 = new int[2];
            playActionButtonV2.getLocationInWindow(r1);
            r1[1] = r1[1] + 4;
            if (r1[0] <= 0 || r1[1] <= 0) {
                rect = null;
            } else {
                rect = new Rect(r1[0], r1[1], r1[0] + playActionButtonV2.getWidth(), r1[1] + playActionButtonV2.getHeight());
            }
            if (rect == null) {
                return;
            }
            if (this.f6564o == cg.SHOW_WITHOUT_ANIMATION) {
                this.f6563n.m16050a();
                this.f6563n.m16051a(rect);
                return;
            }
            playActionButtonV2.postDelayed(new br(this, rect), (long) playActionButtonV2.getContext().getResources().getInteger(C7582R.integer.instant_apps_launch_button_tooltip_render_delay_ms));
        }
    }

    protected final void mo1320c() {
        super.mo1320c();
        if (this.f6560k) {
            ((PlayActionButtonV2) mo1323c((int) C7582R.id.preregister_button)).setActionStyle(2);
        }
    }

    private static boolean m6366a(C3371p c3371p) {
        C1473m c1473m = C1473m.f7980a;
        return c1473m.dj().mo2294a(12607073) && c3371p.f17279d == 196 && c1473m.mo2258q().m11722d();
    }

    final void m6380a(String str, String str2, boolean z) {
        ab abVar = this.A.f730B;
        if (abVar.mo283a("refund_confirm") == null) {
            C1508k c1508k = new C1508k();
            c1508k.m8848a((int) C7582R.string.uninstall_refund_confirmation_body).m8860d((int) C7582R.string.yes).m8862e((int) C7582R.string.no);
            Bundle bundle = new Bundle();
            bundle.putString("package_name", str);
            bundle.putString("account_name", str2);
            bundle.putBoolean("try_uninstall", z);
            c1508k.m8851a(this.A, 4, bundle);
            c1508k.mo2272a().m625a(abVar, "refund_confirm");
        }
    }

    private final void m6365a(String str) {
        if (this.D != null && this.D.m14625N() != null && this.D.m14625N().f13171k.equals(str)) {
            mo1319b();
            m6371t();
        }
    }

    private final void m6367e(int i) {
        this.T.mo1219a(new C2473o(i, this.T));
    }

    public final void mo1213c(String str) {
        if (this.D != null && this.D.ae() && this.D.f14885a.f12096c.equals(str)) {
            mo1326i();
        }
    }

    public final void mo1315a(int i, Bundle bundle) {
        super.mo1315a(i, bundle);
        switch (i) {
            case 1:
                String string = bundle.getString("package_name");
                if (this.f6551b != null) {
                    this.f6551b.mo3445b(string, false);
                    mo1326i();
                    return;
                }
                return;
            case 2:
                return;
            case 4:
                this.f6555f.m13162a(this.A, bundle.getString("package_name"), bundle.getString("account_name"), bundle.getBoolean("try_uninstall"));
                return;
            default:
                FinskyLog.m21669e("Unexpected requestCode %d", Integer.valueOf(i));
                return;
        }
    }

    public final void mo1175b(String str, boolean z) {
        m6365a(str);
        if (m6368f(str)) {
            m6372u();
        }
    }

    private final boolean m6368f(String str) {
        return C1473m.f7980a.dj().mo2294a(12636357) && this.af != null && "com.google.android.instantapps.supervisor".equals(str) && !C0327a.m1722b();
    }

    public final void mo1177d(String str) {
        m6365a(str);
    }

    public final void mo1174a(String[] strArr) {
    }

    public final void mo1176c(String str, boolean z) {
        if (m6368f(str)) {
            m6372u();
        }
    }

    public final void mo1178e(String str) {
    }

    public final void mo1205a(C3369m c3369m) {
        if (this.D != null) {
            boolean a = C1473m.f7980a.dj().mo2294a(12625960);
            if (this.f6565r.contains(c3369m.m16819a()) || this.f6566s.contains(c3369m.m16819a()) || a) {
                if (c3369m.m16825g() && this.f6566s.contains(c3369m.m16819a())) {
                    m6392e();
                }
                m6372u();
            }
        }
    }

    private final void m6372u() {
        if (this.A.m610k()) {
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

    public final void mo1215d(String str, boolean z) {
        if (this.D != null && this.D.f14885a.f12096c.equals(str)) {
            mo1326i();
        }
    }

    final void m6392e() {
        if (this.D != null) {
            List arrayList = new ArrayList(this.f6566s.size() + 1);
            arrayList.add(this.D.cf());
            arrayList.addAll(this.f6566s);
            this.f6552c.mo3480a(arrayList).mo4398a(C4831h.f25111a);
        }
    }
}
