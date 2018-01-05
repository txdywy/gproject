package com.google.android.finsky.installapi.p206a;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.os.C0327a;
import android.text.TextUtils;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.aa.C0955b;
import com.google.android.finsky.accounts.C0986a;
import com.google.android.finsky.by.C2206c;
import com.google.android.finsky.installapi.C3255f;
import com.google.android.finsky.installapi.C3272g;
import com.google.android.finsky.installer.C3300k;
import com.google.android.finsky.p111d.C2471a;

public final class C3260e implements C3255f {
    public final C2471a f16797a = C1473m.f7980a.aR();
    public final Context f16798b;
    public final C3300k f16799c;
    public final C2206c f16800d;
    public final String f16801e;
    public final C0986a f16802f;
    public final String f16803g;
    public final Handler f16804h;

    public C3260e(Context context, C3300k c3300k, C2206c c2206c, String str, C0986a c0986a) {
        this.f16798b = context;
        this.f16799c = c3300k;
        this.f16800d = c2206c;
        this.f16801e = str;
        this.f16802f = c0986a;
        this.f16803g = "com.google.android.instantapps.supervisor";
        this.f16804h = new Handler(Looper.getMainLooper());
    }

    public final Bundle mo3398a(C3272g c3272g) {
        boolean booleanValue = "com.google.android.gms".equals(c3272g.f16842a) ? true : this.f16798b.getPackageName().equals(c3272g.f16842a) ? ((Boolean) C0955b.f5891h.m28964b()).booleanValue() : false;
        if (!booleanValue) {
            return null;
        }
        if (!this.f16803g.equals(c3272g.f16843b)) {
            return null;
        }
        if (C0327a.m1722b() || !((Boolean) C0955b.gA.m28964b()).booleanValue()) {
            Bundle bundle = new Bundle();
            bundle.putString("reason", "install_policy_disabled");
            if (!TextUtils.isEmpty(null)) {
                bundle.putString("exception_type", null);
            }
            Bundle bundle2 = new Bundle();
            bundle2.putInt("status_code", -4);
            bundle2.putBundle("error", bundle);
            return bundle2;
        }
        this.f16804h.post(new C3261f(this, c3272g));
        bundle2 = new Bundle();
        bundle2.putInt("status_code", 0);
        return bundle2;
    }
}
