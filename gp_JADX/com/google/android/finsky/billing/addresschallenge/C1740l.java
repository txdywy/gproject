package com.google.android.finsky.billing.addresschallenge;

import com.android.volley.C0659a;
import com.android.volley.C0684b;
import com.google.android.finsky.aa.C0955b;
import com.google.android.finsky.billing.addresschallenge.p156a.C1706w;
import java.io.UnsupportedEncodingException;
import java.util.concurrent.TimeUnit;

public final class C1740l implements C1706w {
    public static final long f9041a = TimeUnit.DAYS.toMillis(7);
    public final C0659a f9042b;

    public C1740l(C0659a c0659a) {
        this.f9042b = c0659a;
    }

    public final String mo2416a(String str) {
        C0659a c0659a = this.f9042b;
        String valueOf = String.valueOf("AddressMetadataCacheManager-");
        String valueOf2 = String.valueOf(str);
        C0684b a = c0659a.mo1064a(valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf));
        if (a == null || a.m4487a()) {
            return "";
        }
        try {
            return new String(a.f4131a, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("UTF-8 not supported.");
        }
    }

    public final void mo2417a(String str, String str2) {
        C0684b c0684b = new C0684b();
        try {
            c0684b.f4131a = str2.getBytes("UTF-8");
            c0684b.f4133c = System.currentTimeMillis();
            c0684b.f4135e = c0684b.f4133c + f9041a;
            C0659a c0659a = this.f9042b;
            String valueOf = String.valueOf("AddressMetadataCacheManager-");
            String valueOf2 = String.valueOf(str);
            c0659a.mo1066a(valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf), c0684b);
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("UTF-8 not supported.");
        }
    }

    public final String mo2415a() {
        return (String) C0955b.f5881Y.m28964b();
    }
}
