package com.google.android.libraries.bind.data;

import com.google.android.libraries.bind.p325d.C5893b;
import java.util.Locale;

public class C5902l extends C5900i {
    public final C5880k f29433a;
    public C5899h f29434b;
    public boolean f29435c = true;
    public boolean f29436d;
    public boolean f29437e;
    public boolean f29438f;

    public C5902l(C5880k c5880k) {
        this.f29433a = c5880k;
    }

    public void mo5201a(C5899h c5899h) {
        boolean z = true;
        if (c5899h != this.f29434b) {
            if (this.f29436d) {
                mo5202d();
            }
            this.f29434b = c5899h;
            m27366c();
            if (this.f29434b != null && C5899h.m27354a() > 1) {
                z = false;
            }
            C5893b.m27343a(z, "Passed DataList with more than one row.");
            this.f29433a.mo5187a(mo5200a());
        }
    }

    public Data mo5200a() {
        Object obj = (this.f29434b == null || C5899h.m27356c()) ? null : 1;
        return obj != null ? C5899h.m27355b() : null;
    }

    public String toString() {
        boolean z = false;
        Locale locale = Locale.US;
        String str = "View type: %s, hasData: %b, registered: %b, attached: %b,temporarilyDetached: %b, clearDataOnDetach: %b";
        Object[] objArr = new Object[6];
        objArr[0] = this.f29433a.getClass().getSimpleName();
        if (this.f29434b != null) {
            z = true;
        }
        objArr[1] = Boolean.valueOf(z);
        objArr[2] = Boolean.valueOf(this.f29436d);
        objArr[3] = Boolean.valueOf(this.f29437e);
        objArr[4] = Boolean.valueOf(this.f29438f);
        objArr[5] = Boolean.valueOf(this.f29435c);
        return String.format(locale, str, objArr);
    }

    public final void m27365b() {
        this.f29438f = false;
        m27366c();
    }

    public final void m27366c() {
        boolean z = (this.f29437e && !this.f29438f) || !this.f29435c;
        if (z) {
            if (!this.f29436d && this.f29434b != null) {
                C5899h.m27358e();
                this.f29436d = true;
            }
        } else if (this.f29436d) {
            mo5202d();
        }
    }

    private final void mo5202d() {
        C5899h.m27359f();
        this.f29436d = false;
    }
}
