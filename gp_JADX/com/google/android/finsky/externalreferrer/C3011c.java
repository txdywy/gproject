package com.google.android.finsky.externalreferrer;

import com.google.android.finsky.aa.C0955b;
import com.google.android.finsky.ba.C1461c;
import com.google.android.finsky.bn.C2127b;
import com.google.android.finsky.bn.C2129c;
import com.google.android.finsky.p108z.C4809e;
import com.google.android.finsky.p111d.C1463g;
import com.google.android.finsky.p111d.C2474c;
import com.google.android.finsky.utils.C4678i;
import com.google.android.finsky.utils.FinskyLog;
import java.util.concurrent.ExecutionException;

public final class C3011c {
    public final C3018k f15771a;
    public final C1461c f15772b;
    public final C1463g f15773c;

    public C3011c(C3018k c3018k, C1461c c1461c, C1463g c1463g) {
        this.f15771a = c3018k;
        this.f15772b = c1461c;
        this.f15773c = c1463g;
    }

    public final void m15590a(String str, C2127b c2127b) {
        int i;
        if (this.f15772b.dj().mo2294a(12638806)) {
            this.f15771a.f15800a.mo1527d(str);
        }
        C2129c a = c2127b.mo2657a(str);
        if (a == null) {
            i = 0;
        } else {
            i = a.f10824r;
        }
        int i2 = i & -9;
        if (i2 != i) {
            c2127b.mo2678e(str, i2);
        }
        c2127b.mo2666a(str, null);
        c2127b.mo2670b(str, 0);
    }

    public final ExternalReferrerStatus m15588a(String str, C2129c c2129c) {
        ExternalReferrerStatus externalReferrerStatus;
        Throwable e;
        if (this.f15772b.dj().mo2294a(12638806)) {
            try {
                externalReferrerStatus = (ExternalReferrerStatus) m15589a(str).get();
            } catch (InterruptedException e2) {
                e = e2;
                FinskyLog.m21660a(e, "Fail to read from ExternalReferrerDS", new Object[0]);
                externalReferrerStatus = null;
                if (externalReferrerStatus != null) {
                    return externalReferrerStatus;
                }
                return m15591b(str, c2129c);
            } catch (ExecutionException e3) {
                e = e3;
                FinskyLog.m21660a(e, "Fail to read from ExternalReferrerDS", new Object[0]);
                externalReferrerStatus = null;
                if (externalReferrerStatus != null) {
                    return externalReferrerStatus;
                }
                return m15591b(str, c2129c);
            }
            if (externalReferrerStatus != null) {
                return externalReferrerStatus;
            }
        }
        return m15591b(str, c2129c);
    }

    public final C4809e m15589a(String str) {
        return this.f15771a.f15800a.mo1521a((Object) str);
    }

    public final ExternalReferrerStatus m15591b(String str, C2129c c2129c) {
        if (c2129c == null || (c2129c.f10824r & 8) == 0) {
            return null;
        }
        if (this.f15772b.dj().mo2294a(12638806) && c2129c.f10823q + ((Long) C0955b.ai.m28964b()).longValue() > C4678i.m21812a()) {
            this.f15773c.dc().m13319a(new C2474c(562).f13342a, null);
        }
        return new C3017j().m15602a(str).m15603b(c2129c.f10817k).m15601a(c2129c.f10823q).m15600a();
    }
}
