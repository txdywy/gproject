package com.google.android.finsky.verifier.impl.p262a;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Build.VERSION;
import com.android.volley.C0656n;
import com.android.volley.C0657w;
import com.android.volley.C0689z;
import com.android.volley.C0690f;
import com.android.volley.C0697m;
import com.android.volley.C0700r;
import com.android.volley.C0704v;
import com.android.volley.NoConnectionError;
import com.android.volley.VolleyError;
import com.google.android.finsky.cg.C2276c;
import com.google.android.finsky.cg.C2279g;
import com.google.android.finsky.p111d.C2474c;
import com.google.android.finsky.p111d.C2482j;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.utils.C4678i;
import com.google.android.play.utils.C6324f;
import com.google.protobuf.nano.C0757i;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public abstract class C4729a extends C0656n {
    public final C0757i f24349q;
    public final Context f24350r;
    public final C2495w f24351s;
    public C2276c f24352t;
    public long f24353u;
    public NetworkInfo f24354v;
    public int f24355w;
    public int f24356x;
    public long f24357y = -1;
    public long f24358z = -1;

    public C4729a(Context context, C2495w c2495w, String str, C0657w c0657w, C0757i c0757i) {
        super(1, str, c0657w);
        this.f24350r = context;
        this.f24351s = c2495w;
        this.f24349q = c0757i;
    }

    protected abstract C0704v mo4339a(byte[] bArr);

    public final Map mo1547h() {
        Map hashMap = new HashMap();
        hashMap.put("User-Agent", m22027a());
        hashMap.put("Connection", "close");
        return hashMap;
    }

    public final String mo1060l() {
        return "application/x-protobuffer";
    }

    public final byte[] mo1061m() {
        if (m22028b()) {
            this.f24354v = m22030s().mo2833a();
        }
        byte[] a = C0757i.m4909a(this.f24349q);
        this.f24355w = a.length;
        return a;
    }

    private final String m22027a() {
        String c = C4729a.m22029c(Build.DEVICE);
        String c2 = C4729a.m22029c(Build.HARDWARE);
        String c3 = C4729a.m22029c(Build.PRODUCT);
        String c4 = C4729a.m22029c(Build.TYPE);
        String c5 = C4729a.m22029c(Build.ID);
        try {
            PackageInfo packageInfo = this.f24350r.getPackageManager().getPackageInfo(this.f24350r.getPackageName(), 0);
            return String.format(Locale.US, "Android-Finsky/%s (versionCode=%d,sdk=%d,device=%s,hardware=%s,product=%s,build=%s:%s)", new Object[]{packageInfo.versionName, Integer.valueOf(packageInfo.versionCode), Integer.valueOf(VERSION.SDK_INT), c, c2, c3, c5, c4});
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    private final boolean m22028b() {
        return this.f24351s != null;
    }

    public final C0704v mo1055a(C0697m c0697m) {
        long b = C4678i.m21813b();
        this.f24353u = c0697m.f4171f;
        this.f24356x = c0697m.f4167b.length;
        C0704v a = mo4339a(c0697m.f4167b);
        this.f24358z = C4678i.m21813b() - b;
        boolean a2 = a.m4518a();
        VolleyError volleyError = a.f4193c;
        if (m22028b()) {
            C0689z c0689z = this.f4038m;
            float f = 0.0f;
            if (c0689z instanceof C0690f) {
                f = ((C0690f) c0689z).f4153d;
            }
            Boolean bool = null;
            if (volleyError instanceof NoConnectionError) {
                bool = Boolean.valueOf(C6324f.m28968b(this.f24350r));
            }
            long j = -1;
            if (this.f24357y > 0) {
                j = C4678i.m21813b() - this.f24357y;
            }
            this.f24351s.m13367a(new C2474c(5).m13224a(C2482j.m13282a(mo1545d(), this.f24353u, -1, j, this.f24358z, this.f4038m.mo1079b() + 1, this.f4038m.mo1077a(), f, a2, volleyError, this.f24354v, m22030s().mo2833a(), this.f24355w, this.f24356x, false, 0, bool, 0, null)));
        }
        return a;
    }

    public final void mo1544c(VolleyError volleyError) {
        super.mo1544c(volleyError);
        this.f24353u = volleyError.f4023c;
    }

    private final C2276c m22030s() {
        if (this.f24352t == null) {
            this.f24352t = new C2279g(this.f24350r);
        }
        return this.f24352t;
    }

    private static String m22029c(String str) {
        return Uri.encode(str).replace("(", "").replace(")", "");
    }

    public final C0656n mo1540a(C0700r c0700r) {
        this.f24357y = C4678i.m21813b();
        return super.mo1540a(c0700r);
    }
}
