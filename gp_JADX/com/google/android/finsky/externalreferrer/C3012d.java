package com.google.android.finsky.externalreferrer;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.finsky.aa.C0955b;
import com.google.android.finsky.accounts.C0988c;
import com.google.android.finsky.aq.C1500a;
import com.google.android.finsky.ba.C1461c;
import com.google.android.finsky.bn.C2127b;
import com.google.android.finsky.bn.C2129c;
import com.google.android.finsky.bn.C2130d;
import com.google.android.finsky.by.C2206c;
import com.google.android.finsky.cv.p177a.ax;
import com.google.android.finsky.dfemodel.C2726q;
import com.google.android.finsky.installqueue.C3340g;
import com.google.android.finsky.p107l.C3646a;
import com.google.android.finsky.p107l.C3647b;
import com.google.android.finsky.p111d.C1463g;
import com.google.android.finsky.p111d.C2474c;
import com.google.android.finsky.utils.FinskyLog;
import com.google.wireless.android.a.a.a.a.t;

public final class C3012d {
    public static final String[] f15774a = new String[]{"gclid", "utm_source", "utm_medium", "utm_term", "utm_content", "utm_campaign", "anid"};
    public final Context f15775b;
    public final C3646a f15776c;
    public final C2206c f15777d;
    public final C2127b f15778e;
    public final C3340g f15779f;
    public final C1463g f15780g;
    public final C3011c f15781h;
    public final C1461c f15782i;
    public final C0988c f15783j;
    public final C1500a f15784k;

    public C3012d(Context context, C3646a c3646a, C2206c c2206c, C2127b c2127b, C3340g c3340g, C3011c c3011c, C1463g c1463g, C1461c c1461c, C0988c c0988c, C1500a c1500a) {
        this.f15775b = context;
        this.f15776c = c3646a;
        this.f15777d = c2206c;
        this.f15778e = c2127b;
        this.f15779f = c3340g;
        this.f15780g = c1463g;
        this.f15782i = c1461c;
        this.f15781h = c3011c;
        this.f15783j = c0988c;
        this.f15784k = c1500a;
    }

    public final void m15597a(String str, String str2, String str3, String str4) {
        if (!TextUtils.isEmpty(str3) && C2726q.m14754c(str3) == 3) {
            m15596a(str, str2, C2726q.m14747a(3, 1, str3), str4);
        }
    }

    public final void m15596a(String str, String str2, ax axVar, String str3) {
        if (axVar == null) {
            FinskyLog.m21669e("ExternalReferrer: Docid cannot be null", new Object[0]);
        } else if (axVar.f11835d == 3 && axVar.f11834c == 1) {
            Runnable c3013e = new C3013e(this, axVar.f11833b, str, str2, str3);
            if (Looper.myLooper() == Looper.getMainLooper() && this.f15776c.f18022b.m11208b()) {
                c3013e.run();
            } else {
                this.f15776c.m17248a(c3013e);
            }
        }
    }

    private final void m15592a(int i, String str, int i2, String str2) {
        C2474c b = new C2474c(i).m13236a(str).m13244b(str2);
        if (i2 >= 0) {
            t tVar = new t();
            tVar.a(i2);
            b.m13231a(tVar);
        }
        this.f15780g.dc().m13319a(b.f13342a, null);
    }

    public final String m15594a(Uri uri) {
        String queryParameter = uri.getQueryParameter("referrer");
        if (!TextUtils.isEmpty(queryParameter)) {
            return queryParameter;
        }
        if (this.f15782i.dj().mo2294a(12640758)) {
            StringBuilder stringBuilder = new StringBuilder();
            for (String str : f15774a) {
                Object queryParameter2 = uri.getQueryParameter(str);
                if (!TextUtils.isEmpty(queryParameter2)) {
                    if (stringBuilder.length() > 0) {
                        stringBuilder.append("&");
                    }
                    stringBuilder.append(str);
                    stringBuilder.append("=");
                    stringBuilder.append(queryParameter2);
                }
            }
            if (stringBuilder.length() == 0) {
                return null;
            }
            return stringBuilder.toString();
        }
        CharSequence queryParameter3 = uri.getQueryParameter("gclid");
        if (TextUtils.isEmpty(queryParameter3)) {
            return null;
        }
        String str2 = "gclid=";
        queryParameter = String.valueOf(queryParameter3);
        return Uri.encode(queryParameter.length() != 0 ? str2.concat(queryParameter) : new String(str2));
    }

    final void m15598a(String str, boolean z) {
        boolean z2 = true;
        C3647b a = this.f15776c.m17243a(str);
        if (a == null || a.f18029d == null || a.f18028c == null) {
            FinskyLog.m21659a("Package state data is missing for %s", str);
            m15592a(516, str, -1, "dropped_missing_app_state");
            return;
        }
        C2129c c2129c = a.f18029d;
        if (c2129c.f10811e == null || !c2129c.f10811e.p) {
            z2 = false;
        }
        if (z && !z2) {
            m15592a(516, str, a.f18028c.f11419d, "dropped_awaiting_launch");
        } else if (this.f15782i.dj().mo2294a(12638806)) {
            this.f15781h.m15589a(str).mo4398a(new C3014f(this, str, c2129c, z2, a));
        } else {
            m15595a(this.f15781h.m15591b(str, c2129c), str, z2, c2129c, a);
        }
    }

    final void m15595a(ExternalReferrerStatus externalReferrerStatus, String str, boolean z, C2129c c2129c, C3647b c3647b) {
        String str2;
        long j;
        Object obj;
        String str3;
        Object obj2 = externalReferrerStatus != null ? 1 : null;
        String str4 = "dropped_unknown";
        if (z) {
            str2 = "delivered_forced";
            String str5 = str4;
            j = 0;
            obj = "forced-launch";
            str3 = str5;
        } else {
            String str6;
            long longValue;
            CharSequence charSequence;
            if (externalReferrerStatus != null) {
                str6 = externalReferrerStatus.f15750a.f15761c;
            } else {
                str6 = null;
            }
            if (externalReferrerStatus != null) {
                longValue = externalReferrerStatus.m15583a().longValue();
            } else {
                longValue = 0;
            }
            if (longValue <= 0 || ((Long) C0955b.ai.m28964b()).longValue() + longValue >= System.currentTimeMillis()) {
                Object obj3 = str6;
                long j2 = longValue;
                obj = obj2;
                str3 = str4;
                j = j2;
            } else {
                j = 0;
                obj = null;
                charSequence = null;
                str3 = "dropped_expired";
            }
            String str7;
            if (TextUtils.isEmpty(charSequence)) {
                if (obj != null) {
                    FinskyLog.m21659a("Backfilling empty external referrer for deep link for %s", str);
                    str7 = (String) C0955b.ah.m28964b();
                    str2 = "delivered_notset";
                } else {
                    FinskyLog.m21659a("Backfilling empty external referrer for %s", str);
                    j = 0;
                    str7 = (String) C0955b.af.m28964b();
                    str2 = "delivered_organic";
                }
            } else if (this.f15782i.dj().mo2294a(12641963)) {
                obj = (c2129c == null || !this.f15784k.m8819a(this.f15783j.mo2240e(c2129c.f10815i))) ? null : 1;
                boolean c = this.f15784k.m8823c();
                if (obj != null || c) {
                    str7 = (String) C0955b.ah.m28964b();
                    str2 = "delivered_managed_account";
                } else {
                    r6 = charSequence;
                    str2 = "delivered_external";
                }
            } else {
                r6 = charSequence;
                str2 = "delivered_external";
            }
        }
        if (!TextUtils.isEmpty(obj) && this.f15777d.mo2812a(str).size() <= 0) {
            obj = null;
            j = 0;
            str3 = "dropped_not_owned";
        }
        if (!this.f15782i.dj().mo2294a(12640411)) {
            C2130d a = C2130d.m11121a(c2129c, str);
            a.m11132b(null);
            a.m11131b(0);
            a.m11146g(c2129c.f10824r & -9);
            this.f15778e.mo2659a(a.f10833a);
        }
        if (TextUtils.isEmpty(obj)) {
            FinskyLog.m21659a("Referrer is empty for %s", str);
            FinskyLog.m21659a("Dropped referrer for %s because %s", str, str3);
            m15592a(516, str, c3647b.f18028c.f11419d, str3);
            return;
        }
        Intent intent = new Intent("com.android.vending.INSTALL_REFERRER");
        if (z) {
            intent.addFlags(32);
            FinskyLog.m21659a("Forcing %s to wake up", str);
        }
        intent.putExtra("referrer", obj);
        if (j > 0) {
            intent.putExtra("referrer_timestamp_seconds", j / 1000);
        }
        intent.setPackage(str);
        if (this.f15775b.getPackageManager().queryBroadcastReceivers(intent, 0).size() > 0) {
            this.f15775b.sendBroadcast(intent);
            FinskyLog.m21659a("Delivered referrer for %s", str);
            m15592a(517, str, c3647b.f18028c.f11419d, str2);
            return;
        }
        m15592a(516, str, c3647b.f18028c.f11419d, "dropped_no_receiver");
    }
}
