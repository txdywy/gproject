package com.google.android.finsky.p133c.p134a;

import android.content.ContentResolver;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.StrictMode;
import android.provider.Settings.Secure;
import android.text.TextUtils;
import com.google.android.finsky.aa.C0954a;
import com.google.android.finsky.aa.C0955b;
import com.google.android.finsky.ba.C1461c;
import com.google.android.finsky.cn.C2320a;
import com.google.android.finsky.cn.C2322b;
import com.google.android.finsky.p111d.C1463g;
import com.google.android.finsky.p111d.C2474c;
import com.google.android.finsky.p133c.C2243a;
import com.google.android.finsky.providers.C3947d;
import com.google.android.finsky.utils.C4678i;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.bb;
import com.google.android.gms.ads.p239b.C4892a;
import com.google.android.gms.ads.p239b.C4893b;
import com.google.wireless.android.p356a.p357a.p358a.p359a.bo;
import p002a.C0002a;

public final class C2244a implements C2243a {
    public C0002a f11154a;
    public C1463g f11155b;
    public C1461c f11156c;
    public String f11157d;
    public Boolean f11158e;
    public String f11159f;
    public final Context f11160g;
    public final boolean f11161h = this.f11156c.dj().mo2294a(12635427);

    public C2244a(ContentResolver contentResolver, Context context) {
        this.f11160g = context;
        this.f11159f = Secure.getString(contentResolver, "android_id");
        ((C1363d) C3947d.m18649a(C1363d.class)).mo1779a(this);
        new Handler(Looper.getMainLooper()).post(new C2245b(this));
    }

    public final void mo2829a(int i) {
        if (this.f11156c.dj().mo2294a(12602796)) {
            this.f11155b.dc().m13319a(new C2474c(1112).f13342a, null);
        }
        bb.m21792a(new C2246c(this, i), new Void[0]);
    }

    final void m11675b(int i) {
        boolean a = this.f11156c.dj().mo2294a(12602796);
        if (this.f11161h && m11669d()) {
            int i2 = (i == 2304 || i == 2302) ? 1 : 0;
            if (i2 == 0) {
                Object e = m11670e();
                if (!TextUtils.isEmpty(e)) {
                    this.f11157d = e;
                    this.f11158e = (Boolean) C0954a.av.m5760a();
                    if (a) {
                        this.f11155b.dc().m13319a(new C2474c(1111).m13254g(i).f13342a, null);
                        return;
                    }
                    return;
                }
            }
        }
        if (a) {
            this.f11155b.dc().m13319a(new C2474c(1102).f13342a, null);
        }
        try {
            m11667a(C4892a.m22910a(this.f11160g), i);
        } catch (Exception e2) {
            Exception exception = e2;
            String simpleName = exception.getClass().getSimpleName();
            if (!TextUtils.isEmpty(exception.getMessage())) {
                String message = exception.getMessage();
                simpleName = new StringBuilder((String.valueOf(simpleName).length() + 2) + String.valueOf(message).length()).append(simpleName).append(": ").append(message).toString();
            }
            FinskyLog.m21665c("Wasn't able to fetch the adId: %s", simpleName);
            m11668a(simpleName, i);
        }
    }

    private final boolean m11669d() {
        long intValue = (long) ((Integer) C0955b.fm.m28964b()).intValue();
        if (intValue <= 0) {
            return false;
        }
        C2322b a = ((C2320a) this.f11154a.mo1a()).mo2854a("com.google.android.gms");
        if (a == null || a.f11425j || ((long) a.f11419d) < intValue) {
            return false;
        }
        return true;
    }

    private final synchronized String m11670e() {
        String str;
        str = (String) C0954a.au.m5760a();
        if (!TextUtils.isEmpty(str)) {
            long longValue = ((Long) C0954a.aw.m5760a()).longValue();
            long longValue2 = ((Long) C0955b.fn.m28964b()).longValue();
            if (longValue == 0 || longValue2 == 0 || C4678i.m21812a() - longValue >= longValue2) {
                C0954a.au.m5765c();
                C0954a.av.m5765c();
                C0954a.aw.m5765c();
            }
        }
        str = "";
        return str;
    }

    private final synchronized void m11667a(C4893b c4893b, int i) {
        Boolean bool = null;
        synchronized (this) {
            Object obj;
            boolean d = m11669d();
            if (c4893b == null) {
                FinskyLog.m21665c("AdId result returned null. Refresh reason: [%s].", Integer.valueOf(i));
                m11668a("null-result", i);
                obj = null;
            } else {
                obj = c4893b.f25246a;
                if (obj == null) {
                    FinskyLog.m21665c("AdId getId from ad listener returned null. Refresh reason: [%s].", Integer.valueOf(i));
                    m11668a("null-adid", i);
                } else if (obj.length() == 0) {
                    FinskyLog.m21665c("AdId getId from ad listener returned empty string. Refresh reason: [%s].", Integer.valueOf(i));
                    m11668a("empty-adid", i);
                } else {
                    m11668a(null, i);
                    Object valueOf = Boolean.valueOf(c4893b.f25247b);
                    if (d) {
                        C0954a.au.m5763a(obj);
                        C0954a.av.m5763a(valueOf);
                        C0954a.aw.m5763a(Long.valueOf(C4678i.m21812a()));
                    } else {
                        C0954a.au.m5765c();
                        C0954a.av.m5765c();
                        C0954a.aw.m5765c();
                    }
                }
            }
            if (TextUtils.isEmpty(obj) && d) {
                obj = m11670e();
                bool = (Boolean) C0954a.av.m5760a();
            }
            if (!TextUtils.isEmpty(obj)) {
                this.f11157d = obj;
                this.f11158e = bool;
            }
        }
    }

    private final synchronized String m11671f() {
        return this.f11157d;
    }

    public final String mo2828a() {
        StrictMode.noteSlowCall("AdIdProviderImpl.getAdIdBlocking");
        if (!TextUtils.isEmpty(m11671f())) {
            return m11671f();
        }
        m11675b(2303);
        return m11671f();
    }

    public final synchronized Boolean mo2830b() {
        return this.f11158e;
    }

    public final String mo2831c() {
        return this.f11159f;
    }

    private final void m11668a(String str, int i) {
        if (this.f11156c.dj().mo2294a(12602796)) {
            C2474c c2474c = new C2474c(6);
            c2474c.m13254g(i);
            bo boVar = c2474c.f13342a;
            if (!TextUtils.isEmpty(str)) {
                boVar.m29000c(str);
            }
            this.f11155b.dc().m13319a(boVar, null);
        }
    }
}
