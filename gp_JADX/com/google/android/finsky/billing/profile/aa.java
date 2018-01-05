package com.google.android.finsky.billing.profile;

import android.util.Base64;
import com.android.volley.C0660x;
import com.google.android.finsky.p111d.C2474c;
import com.google.protobuf.nano.C0757i;
import com.google.wireless.android.finsky.dfe.c.a.ae;

final class aa implements C0660x {
    public final /* synthetic */ String f10540a;
    public final /* synthetic */ C2067x f10541b;

    aa(C2067x c2067x, String str) {
        this.f10541b = c2067x;
        this.f10540a = str;
    }

    public final /* synthetic */ void b_(Object obj) {
        C0757i c0757i = (ae) obj;
        if (c0757i.f != null && c0757i.f.l) {
            C2063t.m10824c(this.f10540a);
        }
        C2067x c2067x = this.f10541b;
        String str = this.f10540a;
        long currentTimeMillis = System.currentTimeMillis();
        if (!C2067x.m10830b(str)) {
            if (((c0757i.a & 2) != 0 ? 1 : 0) != 0 && c0757i.i) {
                c2067x.f10602b.m5777b(str).m5763a(Base64.encodeToString(C0757i.m4909a(c0757i), 0));
                c2067x.f10603c.m5777b(str).m5763a(Long.valueOf(currentTimeMillis));
            }
        }
        if (c0757i.c != null) {
            C2067x c2067x2 = this.f10541b;
            byte[] bArr = c0757i.c.c;
            C2474c a = new C2474c(308).m13230a(C2067x.m10829a());
            if (bArr != null) {
                a.m13240a(bArr);
            }
            c2067x2.f10605e.m13367a(a);
            return;
        }
        this.f10541b.f10605e.m13367a(new C2474c(308).m13230a(C2067x.m10829a()));
    }
}
