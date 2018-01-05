package com.google.android.finsky.billing.b;

import android.accounts.Account;
import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.text.TextUtils;
import android.widget.Toast;
import com.google.android.finsky.ba.e;
import com.google.android.finsky.billing.common.a;
import com.google.android.finsky.billing.common.e;
import com.google.android.finsky.billing.common.r;
import com.google.android.finsky.br.a;
import com.google.android.finsky.br.b;
import com.google.android.finsky.by.l;
import com.google.android.finsky.d.c;
import com.google.android.finsky.d.w;
import com.google.android.finsky.installer.k;
import com.google.android.finsky.providers.d;
import com.google.wireless.android.finsky.dfe.c.a.aj;
import com.google.wireless.android.finsky.dfe.c.a.bt;

final class com.google.android.finsky.billing.b.n
{

    public com.google.android.finsky.br.b a;
    public com.google.android.finsky.br.a b;
    public final Account c;
    public final com.google.android.finsky.billing.common.e d;
    public final com.google.android.finsky.d.w e;
    public final com.google.android.finsky.installer.k f;
    public final com.google.android.finsky.by.l g;
    public final com.google.android.finsky.billing.b.p h;
    public final Activity i;
    public final com.google.android.finsky.billing.common.a j;
    public final com.google.android.finsky.ba.e k;
    public com.google.wireless.android.finsky.dfe.c.a.bt l;
    public boolean m;

    n(Account p0, com.google.android.finsky.d.w p1, com.google.android.finsky.installer.k p2, com.google.android.finsky.by.l p3, com.google.android.finsky.billing.b.p p4, com.google.android.finsky.billing.common.e p5, Activity p6, com.google.android.finsky.billing.common.a p7, com.google.android.finsky.ba.e p8) {
        ((com.google.android.finsky.billing.b.e)com.google.android.finsky.providers.d.a(com.google.android.finsky.billing.b.e)).a(this);
        this.c = p0;
        this.e = p1;
        this.f = p2;
        this.g = p3;
        this.h = p4;
        this.d = p5;
        this.i = p6;
        this.j = p7;
        this.k = p8;
    }

    public final void a(com.google.wireless.android.finsky.dfe.c.a.bt p0) {
        v1 = 0;
        v4 = 0;
        if (this.m != 0) {
            this.l = p0;
            return;
        }
        if (p0 != 0) {
            if (p0.f != 0) {
                if (p0.f.i == 0 || this.b.a(this.i.getPackageManager(), p0.f.g)) {
                    if (p0.f == 0)
                        v0 = 0;
                    else {
                        if (p0.f.k != 0 && p0.f.d()) {
                            v0 = this.i.getPackageManager().getLaunchIntentForPackage(p0.f.e);
                            if (v0 != 0) {
                                if (v0 == 0) {
                                    if (p0.a & 4)
                                        v4 = 1;
                                    if (v4 != 0) {
                                        if (TextUtils.isEmpty(p0.e))
                                            v0 = this.a.a(this.i, this.e);
                                        else
                                            v0 = this.a.a(this.i, p0.e, this.e);
                                    }
                                }
                                if (v0 != 0)
                                    this.i.startActivity(v0);
                                v1 = p0.b;
                                v0 = p0.c;
                                this.h.a(v0, v1);
                                return;
                            }
                        }
                        if (p0.f.a & 1)
                            v0 = 1;
                        else
                            v0 = 0;
                        if (v0 == 0)
                            v0 = 0;
                        else {
                            v0 = new Intent(p0.f.c);
                            if (p0.f.a & 16)
                                v1 = 1;
                            else
                                v1 = 0;
                            if (v1 != 0)
                                v0.setClassName(this.j.a, p0.f.h);
                            if (p0.f.a & 2)
                                v1 = 1;
                            else
                                v1 = 0;
                            if (v1 != 0)
                                v0.setData(Uri.parse(p0.f.d));
                            if (p0.f.d())
                                v0.setPackage(p0.f.e);
                            if (p0.f.j != 0)
                                this.e.a(v0);
                            v0.setFlags(com.google.android.finsky.billing.common.a.a(p0.f.b));
                            v1 = com.google.android.finsky.billing.common.r.a(p0.f.f);
                            if (v1 != 0)
                                v0.putExtras(v1);
                        }
                    }
                }
                else {
                    Toast.makeText(this.i, this.i.getString(this.b.c(p0.f.g)), 0).show();
                    v0 = this.b.a(this.b.a(p0.f.g), p0.f.d);
                }
            }
            else
                v0 = 0;
            if (v0 == 0) {
                if (p0.a & 4)
                    v4 = 1;
                if (v4 != 0) {
                    if (TextUtils.isEmpty(p0.e))
                        v0 = this.a.a(this.i, this.e);
                    else
                        v0 = this.a.a(this.i, p0.e, this.e);
                }
            }
            if (v0 != 0)
                this.i.startActivity(v0);
            v1 = p0.b;
            v0 = p0.c;
        }
        else
            v0 = 0;
        this.h.a(v0, v1);
    }

    final void a(Throwable p0) {
        if (this.k.a(12604323)) {
            v0 = new com.google.android.finsky.d.c(1105);
            v0.a(p0);
            this.e.a(v0);
        }
    }

}
