package com.google.android.finsky.billing.addresschallenge;

import com.android.volley.a;
import com.android.volley.b;
import com.google.android.finsky.aa.b;
import com.google.android.play.utils.b.a;
import java.io.UnsupportedEncodingException;
import java.util.concurrent.TimeUnit;

public final class com.google.android.finsky.billing.addresschallenge.l implements com.google.android.finsky.billing.addresschallenge.a.w
{

    public static final long a;
    public final com.android.volley.a b;

    static {
        com.google.android.finsky.billing.addresschallenge.l.a = TimeUnit.DAYS.toMillis(7);
    }

    l(com.android.volley.a p0) {
        this.b = p0;
    }

    public final String a() {
        return (String)com.google.android.finsky.aa.b.Y.b();
    }

    public final String a(String p0) {
        v2 = String.valueOf("AddressMetadataCacheManager-");
        v0 = String.valueOf(p0);
        if (v0.length() != 0)
            v0 = v2.concat(v0);
        else
            v0 = new String(v2);
        v1 = this.b.a(v0);
        if (v1 == 0 || v1.a())
            v0 = "";
        else {
            try {
                v0 = new String(v1.a, "UTF-8");
            }
            catch (UnsupportedEncodingException ex) {
                throw new RuntimeException("UTF-8 not supported.");
            }
        }
        return v0;
    }

    public final void a(String p0, String p1) {
        v1 = new com.android.volley.b();
        try {
            v1.a = p1.getBytes("UTF-8");
        }
        catch (UnsupportedEncodingException ex) {
            throw new RuntimeException("UTF-8 not supported.");
        }
        v1.c = System.currentTimeMillis();
        v1.e = v1.c + com.google.android.finsky.billing.addresschallenge.l.a;
        v3 = String.valueOf("AddressMetadataCacheManager-");
        v0 = String.valueOf(p0);
        if (v0.length() != 0)
            v0 = v3.concat(v0);
        else
            v0 = new String(v3);
        this.b.a(v0, v1);
    }

}
