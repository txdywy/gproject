package com.google.android.instantapps.common.p221d.p222a;

import android.accounts.Account;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.telephony.TelephonyManager;
import com.google.android.gms.common.api.C5058o;
import com.google.android.gms.common.api.C5089p;
import com.google.android.gms.pseudonymous.C5319b;
import com.google.android.gms.pseudonymous.C5568a;
import com.google.android.instantapps.common.C5804k;
import com.google.android.instantapps.common.p217e.bf;
import com.google.android.instantapps.common.p318g.C5771a;
import com.google.android.instantapps.p309a.C5699f;
import com.google.android.instantapps.p309a.p310a.C5686a;
import com.google.android.play.p179a.C6228m;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ExecutorService;

public final class C5727q {
    public static final C5804k f28973a = new C5804k("EventLoggerManager");
    public static final C5686a f28974b = C5686a.m26932a("android_id", Long.valueOf(0));
    public final Map f28975c = new HashMap();
    public volatile Account f28976d;
    public Set f28977e;
    public final SharedPreferences f28978f;
    public final C6228m f28979g;
    public final Context f28980h;
    public final C5725o f28981i;
    public final ExecutorService f28982j;
    public final bf f28983k;
    public final bf f28984l;
    public final C5319b f28985m;
    public final C5771a f28986n;
    public final C5733x f28987o;
    public final String f28988p;

    C5727q(Context context, C6228m c6228m, C5725o c5725o, ExecutorService executorService, String str, bf bfVar, bf bfVar2, C5319b c5319b, C5771a c5771a, C5733x c5733x, String str2) {
        this.f28980h = context;
        this.f28979g = c6228m;
        this.f28981i = c5725o;
        this.f28982j = executorService;
        this.f28983k = bfVar2;
        this.f28984l = bfVar;
        this.f28985m = c5319b;
        this.f28986n = c5771a;
        this.f28987o = c5733x;
        this.f28988p = str2;
        c6228m.f31165a = str;
        this.f28978f = context.getSharedPreferences("lastAccount", 0);
    }

    final synchronized void m27027a(C5713v c5713v) {
        Account account = null;
        synchronized (this) {
            if (this.f28977e != null) {
                this.f28977e.add(c5713v);
            } else {
                String str;
                if (((Boolean) this.f28983k.mo5158a()).booleanValue()) {
                    str = null;
                } else {
                    str = this.f28978f.getString("lastAccountStr", null);
                    String str2 = this.f28986n.f29178a;
                    if (!(str2 == null || str2.equals(str))) {
                        this.f28978f.edit().putString("lastAccountStr", str2).apply();
                        str = str2;
                    }
                }
                if (str != null) {
                    account = new Account(str, "com.google");
                }
                if (!Objects.equals(account, this.f28976d) && this.f28975c.containsKey(this.f28976d)) {
                    ((C5724n) this.f28975c.get(this.f28976d)).m27020a(null);
                }
                this.f28976d = account;
                if (this.f28975c.containsKey(this.f28976d)) {
                    m27028a(c5713v, (C5724n) this.f28975c.get(this.f28976d));
                } else if (this.f28976d != null) {
                    try {
                        long j;
                        C5725o c5725o = this.f28981i;
                        str = (String) this.f28984l.mo5158a();
                        String str3 = this.f28988p;
                        if (((Boolean) this.f28983k.mo5158a()).booleanValue()) {
                            j = 0;
                        } else {
                            j = ((Long) f28974b.m26938b()).longValue();
                        }
                        C5724n a = c5725o.m27021a(str, str3, j, m27026a(), m27030b(), this.f28979g, this.f28976d, this.f28987o, m27031c());
                        this.f28975c.put(this.f28976d, a);
                        m27028a(c5713v, a);
                    } catch (Throwable e) {
                        m27029a(c5713v, e);
                    }
                } else {
                    m27023b(c5713v);
                }
            }
        }
    }

    private final synchronized void m27023b(C5713v c5713v) {
        boolean z = true;
        synchronized (this) {
            C5699f.m26962a(this.f28977e == null, (Object) "Unexpected listeners");
            if (this.f28976d != null) {
                z = false;
            }
            C5699f.m26962a(z, (Object) "Expected pseudonymous account");
            this.f28977e = new HashSet();
            this.f28977e.add(c5713v);
            C5058o b = new C5089p(this.f28980h).m23647a(C5568a.f28482c).m23652b();
            b.mo4557e();
            this.f28985m.mo4794a(b).mo4490a(new C5728r(this, b, c5713v));
        }
    }

    final void m27028a(C5713v c5713v, C5724n c5724n) {
        this.f28982j.execute(new C5729s(c5713v, c5724n));
    }

    final void m27029a(C5713v c5713v, Throwable th) {
        this.f28982j.execute(new C5730t(c5713v, th));
    }

    final String m27026a() {
        try {
            return Integer.toString(this.f28980h.getPackageManager().getPackageInfo(this.f28980h.getPackageName(), 0).versionCode);
        } catch (NameNotFoundException e) {
            return "0";
        }
    }

    final String m27030b() {
        return ((TelephonyManager) this.f28980h.getSystemService("phone")).getSimOperator();
    }

    final int m27031c() {
        try {
            PackageInfo packageInfo = this.f28980h.getPackageManager().getPackageInfo("com.google.android.gms", 0);
            if (packageInfo != null) {
                return packageInfo.versionCode;
            }
            return 0;
        } catch (NameNotFoundException e) {
            return 0;
        }
    }
}
