package com.google.android.finsky.cs.p135a;

import android.text.TextUtils;
import com.google.android.finsky.aa.C0955b;
import com.google.android.finsky.accounts.C0988c;
import com.google.android.finsky.al.C1219c;
import com.google.android.finsky.al.C1223g;
import com.google.android.finsky.al.C1225k;
import com.google.android.finsky.deviceconfig.C2693e;
import com.google.android.play.utils.p354b.C6321a;
import com.google.d.a.a.a.a;
import com.google.protobuf.nano.C0757i;

public final class C2396a {
    public final C1223g f11685a;
    public final C2693e f11686b;
    public final C0988c f11687c;
    public byte[] f11688d;

    public C2396a(C1223g c1223g, C2693e c2693e, C0988c c0988c) {
        this.f11685a = c1223g;
        this.f11686b = c2693e;
        this.f11687c = c0988c;
    }

    public final byte[] m12086a() {
        int i = 3;
        if (this.f11688d == null) {
            C0757i aVar = new a();
            C1223g c1223g = this.f11685a;
            if (!c1223g.f7357c) {
                C1225k a = C1219c.m7207a("marketenvs.csv", c1223g.f7355a);
                int i2 = a.f7360a;
                if (i2 < 0) {
                    int i3;
                    if (((String) C6321a.m28960a("url:finsky_dfe_url", "").m28964b()).contains((CharSequence) C0955b.ir.m28964b())) {
                        i3 = 3;
                    } else {
                        i3 = 1;
                    }
                    c1223g.f7356b = i3;
                } else {
                    String str = (String) a.m7214a().get(i2);
                    if (!TextUtils.equals(str, "Dogfood")) {
                        i = (TextUtils.equals(str, "Demo") || TextUtils.equals(str, "Autopush")) ? 2 : TextUtils.equals(str, "Staging") ? 5 : (TextUtils.equals(str, "Internal") || TextUtils.equals(str, "QA")) ? 4 : 1;
                    }
                    c1223g.f7356b = i;
                }
                c1223g.f7357c = true;
            }
            aVar.b = c1223g.f7356b;
            aVar.a |= 1;
            if (((Boolean) C0955b.it.m28964b()).booleanValue() && this.f11687c.cX().isEmpty()) {
                aVar.c = this.f11686b.mo3115c();
                aVar.d = this.f11686b.mo3116f();
            }
            this.f11688d = C0757i.m4909a(aVar);
        }
        return this.f11688d;
    }
}
