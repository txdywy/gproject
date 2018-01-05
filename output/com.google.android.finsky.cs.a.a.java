package com.google.android.finsky.cs.a;

import android.text.TextUtils;
import com.google.android.finsky.aa.b;
import com.google.android.finsky.accounts.c;
import com.google.android.finsky.al.c;
import com.google.android.finsky.al.g;
import com.google.android.finsky.al.k;
import com.google.android.finsky.deviceconfig.e;
import com.google.android.play.utils.b.a;
import com.google.d.a.a.a.a;
import com.google.protobuf.nano.i;
import java.util.List;

public final class com.google.android.finsky.cs.a.a
{

    public final com.google.android.finsky.al.g a;
    public final com.google.android.finsky.deviceconfig.e b;
    public final com.google.android.finsky.accounts.c c;
    public byte[] d;

    a(com.google.android.finsky.al.g p0, com.google.android.finsky.deviceconfig.e p1, com.google.android.finsky.accounts.c p2) {
        this.a = p0;
        this.b = p1;
        this.c = p2;
    }

    public final byte[] a() {
        v2 = 3;
        if (this.d == 0) {
            v4 = new com.google.d.a.a.a.a();
            if (this.a.c == 0) {
                v0 = com.google.android.finsky.al.c.a("marketenvs.csv", this.a.a);
                if (v0.a < 0) {
                    if (((String)com.google.android.play.utils.b.a.a("url:finsky_dfe_url", "").b()).contains((CharSequence)com.google.android.finsky.aa.b.ir.b()))
                        v0 = 3;
                    else
                        v0 = 1;
                    this.a.b = v0;
                }
                else {
                    v0 = (String)v0.a().get(v0.a);
                    if (!TextUtils.equals(v0, "Dogfood")) {
                        if ((TextUtils.equals(v0, "Demo")) || TextUtils.equals(v0, "Autopush"))
                            v2 = 2;
                        else if (TextUtils.equals(v0, "Staging"))
                            v2 = 5;
                        else if ((TextUtils.equals(v0, "Internal")) || TextUtils.equals(v0, "QA"))
                            v2 = 4;
                        else
                            v2 = 1;
                    }
                    this.a.b = v2;
                }
                this.a.c = 1;
            }
            v4.b = this.a.b;
            v4.a = v4.a | 1;
            if (((Boolean)com.google.android.finsky.aa.b.it.b()).booleanValue() && this.c.cX().isEmpty()) {
                v4.c = this.b.c();
                v4.d = this.b.f();
            }
            this.d = com.google.protobuf.nano.i.a(v4);
        }
        return this.d;
    }

}
