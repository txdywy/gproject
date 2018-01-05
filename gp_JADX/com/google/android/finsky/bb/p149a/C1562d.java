package com.google.android.finsky.bb.p149a;

import android.text.TextUtils;
import com.google.android.finsky.aa.C0954a;
import com.google.android.finsky.ba.C1461c;
import com.google.android.finsky.ba.C1552e;
import com.google.android.finsky.bb.C1561c;
import com.google.android.finsky.cv.p177a.lh;
import com.google.android.finsky.dx.C2910a;
import com.google.android.finsky.utils.FinskyLog;
import com.google.wireless.android.finsky.dfe.h.a.g;
import com.google.wireless.android.finsky.dfe.h.a.j;
import com.google.wireless.android.finsky.dfe.h.a.o;
import com.google.wireless.android.finsky.dfe.nano.cn;
import com.google.wireless.android.finsky.dfe.nano.gy;

public final class C1562d implements C1561c {
    public final C2910a f8353a;
    public final C1461c f8354b;
    public final String f8355c;
    public final j f8356d;
    public final o f8357e;

    public C1562d(C2910a c2910a, C1461c c1461c, String str) {
        j jVar;
        this.f8353a = c2910a;
        this.f8354b = c1461c;
        this.f8355c = str;
        if (this.f8355c != null) {
            gy b = this.f8353a.m15190b(this.f8355c);
            if (b != null) {
                jVar = b.c;
                this.f8356d = jVar;
                this.f8357e = m9072q();
            }
        }
        jVar = null;
        this.f8356d = jVar;
        this.f8357e = m9072q();
    }

    public final String mo2318a() {
        return this.f8355c;
    }

    public final j mo2320b() {
        return this.f8356d;
    }

    public final boolean mo2323d() {
        return this.f8357e != null;
    }

    public final boolean mo2324e() {
        return this.f8357e != null && this.f8357e.c == 5;
    }

    public final boolean mo2325f() {
        if (!mo2323d()) {
            return false;
        }
        for (o oVar : this.f8356d.c.a) {
            if (oVar.c == 5) {
                return true;
            }
        }
        return false;
    }

    public final boolean mo2329j() {
        return this.f8354b.mo2249j(this.f8355c).mo2294a(12603772);
    }

    public final boolean mo2330k() {
        return this.f8354b.mo2249j(this.f8355c).mo2294a(12613100);
    }

    public final boolean mo2319a(int i) {
        C1552e j = this.f8354b.mo2249j(this.f8355c);
        switch (i) {
            case 1:
                return j.mo2294a(12604245);
            case 3:
                return j.mo2294a(12604244);
            case 4:
                return j.mo2294a(12604246);
            default:
                return false;
        }
    }

    public final boolean mo2326g() {
        gy b = this.f8353a.m15190b(this.f8355c);
        if (b != null) {
            cn cnVar = b.e;
            if (cnVar != null) {
                return "1".equals(cnVar.b);
            }
        }
        return false;
    }

    public final o mo2322c() {
        return this.f8357e;
    }

    public final boolean mo2327h() {
        if (this.f8357e == null || this.f8357e.c != 1) {
            return false;
        }
        return true;
    }

    public final boolean mo2328i() {
        if (this.f8357e == null || (this.f8357e.c != 1 && this.f8357e.c != 4)) {
            return false;
        }
        return true;
    }

    public final o mo2317a(String str) {
        if (mo2323d()) {
            for (o oVar : this.f8356d.c.a) {
                if (str.equals(oVar.d.f12097d)) {
                    return oVar;
                }
            }
        }
        return null;
    }

    public final void mo2321b(String str) {
        if (TextUtils.isEmpty(this.f8355c)) {
            FinskyLog.m21669e("AccountName should never be null to save consistency token.", new Object[0]);
        } else if (!TextUtils.isEmpty(str)) {
            lh lhVar = new lh();
            lhVar.f13011b |= 1;
            lhVar.f13012c = "X-DFE-Family-Consistency-Token";
            lhVar.m13029a(str);
            C2910a.m15175a(this.f8355c, lhVar);
        }
    }

    public final boolean mo2331l() {
        if (this.f8356d != null && this.f8356d.b == 2 && this.f8356d.e == 1) {
            return true;
        }
        return false;
    }

    public final boolean mo2332m() {
        if (this.f8356d == null) {
            return true;
        }
        return ((Long) C0954a.aE.m5777b(this.f8355c).m5760a()).longValue() >= this.f8356d.d;
    }

    public final boolean mo2333n() {
        return (this.f8356d == null || !mo2331l() || mo2332m()) ? false : true;
    }

    public final void mo2334o() {
        if (this.f8356d == null) {
            FinskyLog.m21669e("No family info while dismissing paused edu card.", new Object[0]);
        } else {
            C0954a.aE.m5777b(this.f8355c).m5763a(Long.valueOf(this.f8356d.d));
        }
    }

    public final String mo2335p() {
        String str;
        if (this.f8356d == null) {
            str = "Null familyInfo";
        } else {
            int i = this.f8356d.b;
            str = "Family status: " + i + "\nInactive Reason: " + this.f8356d.e;
        }
        boolean g = mo2326g();
        return new StringBuilder(String.valueOf(str).length() + 49).append(str).append("\nTos Accepted: ").append(g).append("\nOnboarding Experiment: ").append(mo2329j()).toString();
    }

    private final o m9072q() {
        if (this.f8356d != null) {
            g gVar = this.f8356d.c;
            if (!(gVar == null || gVar.a == null)) {
                for (o oVar : gVar.a) {
                    if (oVar.d != null && oVar.d.f12112s != null && oVar.d.f12112s.f12059l != null && oVar.d.f12112s.f12059l.f12064b) {
                        return oVar;
                    }
                }
            }
        }
        return null;
    }
}
