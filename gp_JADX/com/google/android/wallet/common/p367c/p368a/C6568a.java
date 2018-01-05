package com.google.android.wallet.common.p367c.p368a;

import android.accounts.Account;
import android.content.Context;
import android.net.Uri;
import android.support.v4.h.a;
import android.util.Log;
import com.android.volley.a.b;
import com.google.android.gms.common.e;
import com.google.android.wallet.common.p367c.C6573a;
import com.google.p443h.p451c.p457c.p460b.p467d.C7178b;
import java.util.Locale;
import java.util.Map;

public final class C6568a {
    public final Context f32686a;
    public Uri f32687b;
    public Uri f32688c;
    public final String f32689d;
    public final b f32690e;
    public String f32691f;

    public static C6568a m29808a(Context context, Account account, C7178b c7178b) {
        Context applicationContext = context.getApplicationContext();
        String str = account.name;
        String str2 = c7178b.f35026d;
        if (e.c(context)) {
            boolean contains = str.contains("@");
            boolean contains2 = str2.contains("@");
            if (contains != contains2) {
                if (contains) {
                    str = str.substring(0, str.indexOf(64));
                }
                if (contains2) {
                    str2 = str2.substring(0, str2.indexOf(64));
                }
            }
        }
        if (!(account.name.equalsIgnoreCase(c7178b.f35026d) || r1.equalsIgnoreCase(r0))) {
            Log.e("ApiContext", String.format(Locale.US, "Account specified by integrator=%s should match AndroidEnvironmentConfig=%s", new Object[]{account.name, c7178b.f35026d}));
        }
        return new C6568a(applicationContext, c7178b, new b(applicationContext, account, c7178b.f35025c));
    }

    private C6568a(Context context, C7178b c7178b, b bVar) {
        this.f32686a = context;
        this.f32687b = Uri.parse(c7178b.f35023a);
        this.f32688c = Uri.parse(c7178b.f35024b);
        this.f32689d = c7178b.f35025c;
        this.f32690e = bVar;
    }

    public final synchronized void m29809a() {
        if (this.f32691f != null) {
            this.f32690e.a(this.f32691f);
            this.f32691f = null;
        }
    }

    public final synchronized Map m29810b() {
        Map aVar;
        this.f32691f = this.f32690e.a();
        aVar = new a(2);
        String str;
        String str2;
        String valueOf;
        if (this.f32689d.startsWith("oauth2:")) {
            str = "Authorization";
            str2 = "Bearer ";
            valueOf = String.valueOf(this.f32691f);
            aVar.put(str, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
        } else {
            str = "Authorization";
            str2 = "GoogleLogin auth=";
            valueOf = String.valueOf(this.f32691f);
            aVar.put(str, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
        }
        aVar.put("User-Agent", C6573a.f32700a);
        return aVar;
    }
}
