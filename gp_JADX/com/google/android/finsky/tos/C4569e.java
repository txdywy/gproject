package com.google.android.finsky.tos;

import android.accounts.Account;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Base64;
import com.google.android.finsky.aa.C0954a;
import com.google.android.finsky.accounts.C0988c;
import com.google.android.finsky.api.C1254c;
import com.google.android.finsky.api.C1287h;
import com.google.android.finsky.ba.C1461c;
import com.google.android.finsky.dfemodel.DfeToc;
import com.google.android.finsky.dfemodel.ab;
import com.google.android.finsky.dx.C2910a;
import com.google.android.finsky.p111d.C1463g;
import com.google.android.finsky.p111d.C2482j;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.verifier.C4726d;
import com.google.wireless.android.p356a.p357a.p358a.p359a.bo;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class C4569e {
    public static final Pattern f23359a = Pattern.compile("version:(\\d+)");
    public static final Handler f23360b = new Handler(Looper.getMainLooper());
    public final C0988c f23361c;
    public final C1287h f23362d;
    public final C1461c f23363e;
    public final C2910a f23364f;
    public final ab f23365g;
    public final C4726d f23366h;
    public final C1463g f23367i;

    public C4569e(C0988c c0988c, C1287h c1287h, C1461c c1461c, C2910a c2910a, ab abVar, C4726d c4726d, C1463g c1463g) {
        this.f23361c = c0988c;
        this.f23362d = c1287h;
        this.f23363e = c1461c;
        this.f23364f = c2910a;
        this.f23365g = abVar;
        this.f23366h = c4726d;
        this.f23367i = c1463g;
    }

    public final boolean m21204a() {
        String db = this.f23361c.db();
        if (db == null) {
            return false;
        }
        DfeToc dn = this.f23365g.dn();
        if (dn == null || m21205a(db, dn)) {
            return false;
        }
        return true;
    }

    public final boolean m21205a(String str, DfeToc dfeToc) {
        String str2 = dfeToc.f14881a.f31761d;
        if (TextUtils.isEmpty(str2)) {
            FinskyLog.m21659a("TU:tosToken is empty", new Object[0]);
            return false;
        } else if (dfeToc.f14881a.f31763f) {
            if (!TextUtils.equals(str2, (String) C0954a.f5811G.m5777b(str).m5760a())) {
                FinskyLog.m21659a("TU:accepted=T, ackedTosToken!=token", new Object[0]);
                C4569e.m21200a(str2, str);
            }
            return false;
        } else {
            String str3 = (String) C0954a.f5808D.m5777b(str).m5760a();
            if (TextUtils.equals(str2, str3)) {
                m21201b(str, str3);
                FinskyLog.m21659a("TU:accepted=F, clientAcceptedTosToken==token", new Object[0]);
                return false;
            }
            str3 = (String) C0954a.f5811G.m5777b(str).m5760a();
            if (!TextUtils.equals(str2, str3)) {
                return true;
            }
            if (this.f23363e.mo2249j(str).mo2294a(12645830)) {
                m21201b(str, str3);
            }
            FinskyLog.m21659a("TU:accepted=F, acceptedTosToken==token", new Object[0]);
            return false;
        }
    }

    private final void m21201b(String str, String str2) {
        f23360b.post(new C4570f(this, str, str2));
        FinskyLog.m21659a("TU:retrying ackTos", new Object[0]);
    }

    static void m21200a(String str, String str2) {
        C0954a.f5811G.m5777b(str2).m5763a((Object) str);
        C0954a.f5808D.m5777b(str2).m5765c();
        C0954a.f5810F.m5777b(str2).m5765c();
    }

    public final void m21202a(String str, String str2, Boolean bool) {
        m21203a(str, str2, bool, null);
    }

    protected final void m21203a(String str, String str2, Boolean bool, Boolean bool2) {
        FinskyLog.m21659a("TU:Initializing TOS acceptance for %s.", FinskyLog.m21655a(str));
        C1254c a = this.f23362d.mo2016a(str);
        if (a == null) {
            FinskyLog.m21667d("TU:Could not get DFE API.", new Object[0]);
        } else if (TextUtils.isEmpty(str2)) {
            FinskyLog.m21659a("TU:TOS already accepted.", new Object[0]);
            this.f23366h.mo4365c();
        } else {
            C2482j f = this.f23367i.mo2242f(str);
            a.mo1588a(str2, bool, bool2, new C4571g(this, str2, str, f), new C4572h(f));
            C0954a.f5808D.m5777b(str).m5763a((Object) str2);
            if (bool != null) {
                C0954a.f5810F.m5777b(str).m5763a((Object) bool);
            }
            f.m13319a(new bo().m28992a(944), null);
        }
    }

    public final int m21206b() {
        int i = -1;
        try {
            for (Account account : this.f23361c.cX()) {
                i = Math.max(i, C4569e.m21199a(account.name));
            }
            return i;
        } catch (Throwable th) {
            Throwable th2 = th;
            int i2 = -1;
            FinskyLog.m21667d("Max accepted TOS version failed with exception: %s", th2);
            return i2;
        }
    }

    private static int m21199a(String str) {
        Matcher matcher = f23359a.matcher(new String(Base64.decode((String) C0954a.f5811G.m5777b(str).m5760a(), 0)));
        if (matcher.find()) {
            Object group = matcher.group(1);
            try {
                return Integer.parseInt(group);
            } catch (NumberFormatException e) {
                FinskyLog.m21667d("Cannot convert TOS version %s to integer", group);
            }
        }
        return -1;
    }
}
