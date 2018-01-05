package com.google.android.instantapps.common.p313a.p314a;

import com.google.android.instantapps.common.C5804k;
import com.google.android.instantapps.common.p217e.bf;
import com.google.j.a.a.a.a.a;
import com.google.protobuf.nano.C0757i;
import com.squareup.okhttp.ad;
import com.squareup.okhttp.ah;
import com.squareup.okhttp.ak;

public final class C5700a {
    public static final C5804k f28851a = new C5804k("AppMetadataClient");
    public final ad f28852b;
    public final bf f28853c;
    public final bf f28854d;

    public C5700a(ad adVar, bf bfVar, bf bfVar2) {
        this.f28852b = adVar;
        this.f28853c = bfVar;
        this.f28854d = bfVar2;
    }

    public final a m26964a(String str) {
        ah b;
        ah a = new ah().a(String.format((String) this.f28853c.mo5158a(), new Object[]{str}));
        if (((Boolean) this.f28854d.mo5158a()).booleanValue()) {
            b = a.b("X-Google-Dark-Launch", "X-Google-Dark-Launch");
        } else {
            b = a;
        }
        try {
            int i;
            ak a2 = this.f28852b.m29020a(b.a()).a();
            if (a2.c < 200 || a2.c >= 300) {
                i = 0;
            } else {
                i = 1;
            }
            if (i == 0) {
                f28851a.m27211d("Failure on backend call with response code: " + a2.c, new Object[0]);
                return null;
            }
            try {
                if (a2.g == null) {
                    return null;
                }
                return (a) C0757i.m4905a(new a(), a2.g.e());
            } catch (Throwable e) {
                f28851a.m27208a(e, "Failure to parse response", new Object[0]);
                return null;
            }
        } catch (Throwable e2) {
            f28851a.m27208a(e2, "Failed to hit metadata backend", new Object[0]);
            return null;
        }
    }
}
