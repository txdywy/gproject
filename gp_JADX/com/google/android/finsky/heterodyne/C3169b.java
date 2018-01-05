package com.google.android.finsky.heterodyne;

import android.accounts.Account;
import android.content.Context;
import android.net.ConnectivityManager;
import android.os.Build;
import android.telephony.TelephonyManager;
import com.android.volley.p060a.C0662b;
import com.google.android.finsky.aa.C0955b;
import com.google.android.finsky.accounts.C0988c;
import com.google.android.finsky.deviceconfig.C2699l;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p230q.C3948a;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.gms.phenotype.core.p176c.C3168b;
import com.google.android.gms.phenotype.core.p176c.C3173h;
import com.google.android.gms.phenotype.core.p176c.C5517i;
import com.google.android.gms.phenotype.core.p304a.C5505c;
import com.google.wireless.android.a.a.a.a.b;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public final class C3169b extends C3168b {
    public final Context f16412a;
    public final C2495w f16413b;
    public final TelephonyManager f16414c;
    public final C3948a f16415d;
    public final C0988c f16416e;
    public Map f16417f = new HashMap();
    public Map f16418g = new HashMap();

    public C3169b(ConnectivityManager connectivityManager, C5505c c5505c, C5517i c5517i, C3173h c3173h, Context context, C2495w c2495w, TelephonyManager telephonyManager, C3948a c3948a, C0988c c0988c) {
        super(connectivityManager, c5505c, c5517i, k, c3173h);
        this.f16412a = context;
        this.f16413b = c2495w;
        this.f16414c = telephonyManager;
        this.f16415d = c3948a;
        this.f16416e = c0988c;
    }

    protected final String mo3353a(String str) {
        if (str == null) {
            return null;
        }
        String str2;
        C0662b c0662b;
        C0662b c0662b2 = (C0662b) this.f16418g.get(str);
        if (c0662b2 == null) {
            C3948a c3948a = this.f16415d;
            str2 = (String) C0955b.iv.m28964b();
            Account b = c3948a.f19946a.mo1183b(str);
            if (b == null) {
                FinskyLog.m21669e("Trying to create authenticator with null account.", new Object[0]);
                c0662b2 = null;
            } else {
                c0662b2 = new C0662b(c3948a.f19947b, b, str2);
            }
            this.f16418g.put(str, c0662b2);
            c0662b = c0662b2;
        } else {
            c0662b = c0662b2;
        }
        if (c0662b == null) {
            return null;
        }
        try {
            str2 = c0662b.mo1071a();
            this.f16417f.put(str2, c0662b);
            return str2;
        } catch (Throwable e) {
            FinskyLog.m21660a(e, "Failed to get auth token", new Object[0]);
            return null;
        }
    }

    protected final void mo3356b(String str) {
        C0662b c0662b = (C0662b) this.f16417f.get(str);
        if (c0662b != null) {
            c0662b.m4420a(str);
            this.f16417f.remove(str);
        }
    }

    protected final void mo3354a() {
    }

    protected final String mo3355b() {
        return "";
    }

    protected final b mo3352a(boolean z) {
        b bVar = new b();
        if (z) {
            bVar.a = ((Long) C0955b.m5748a().m28964b()).longValue();
        }
        if (((Boolean) C0955b.it.m28964b()).booleanValue() && this.f16416e.cX().isEmpty()) {
            bVar.r = Build.FINGERPRINT;
            bVar.A = C2699l.m14576a(this.f16412a, this.f16413b);
        }
        bVar.m = Locale.getDefault().getCountry();
        bVar.k = this.f16414c.getSimOperator();
        return bVar;
    }

    protected final void mo3357c() {
    }

    protected final void mo3358d() {
    }
}
