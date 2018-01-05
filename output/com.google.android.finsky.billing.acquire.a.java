package com.google.android.finsky.billing.acquire;

import android.accounts.Account;
import android.app.Activity;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.finsky.billing.a.h;
import com.google.android.finsky.billing.b.b;
import com.google.android.finsky.billing.b.c;
import com.google.android.finsky.billing.b.d;
import com.google.android.finsky.billing.b.f;
import com.google.android.finsky.billing.b.g;
import com.google.android.finsky.billing.c.a;
import com.google.android.finsky.billing.c.b;
import com.google.android.finsky.billing.c.c;
import com.google.android.finsky.billing.c.f;
import com.google.android.finsky.billing.c.g;
import com.google.android.finsky.billing.common.q;
import com.google.android.finsky.billing.common.u;
import com.google.android.finsky.billing.iab.w;
import com.google.android.finsky.br.b;
import com.google.android.finsky.cn.a;
import com.google.android.finsky.cv.a.ax;
import com.google.android.finsky.cv.a.cv;
import com.google.android.finsky.d.w;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.dialogbuilder.b;
import com.google.android.finsky.dialogbuilder.b.h;
import com.google.android.finsky.l.j;
import com.google.android.finsky.providers.d;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.ParcelableProto;
import com.google.android.finsky.utils.bb;
import com.google.protobuf.nano.b;
import com.google.wireless.android.finsky.dfe.c.a.a;
import com.google.wireless.android.finsky.dfe.c.a.aa;
import com.google.wireless.android.finsky.dfe.c.a.ai;
import com.google.wireless.android.finsky.dfe.c.a.aq;
import com.google.wireless.android.finsky.dfe.c.a.b;
import com.google.wireless.android.finsky.dfe.c.a.bl;
import com.google.wireless.android.finsky.dfe.c.a.c;
import com.google.wireless.android.finsky.dfe.c.a.d;
import com.google.wireless.android.finsky.dfe.c.a.dx;
import com.google.wireless.android.finsky.dfe.c.a.ea;
import com.google.wireless.android.finsky.dfe.c.a.f;
import com.google.wireless.android.finsky.dfe.c.a.g;
import com.google.wireless.android.finsky.dfe.c.a.k;
import com.google.wireless.android.finsky.dfe.c.a.n;
import com.google.wireless.android.finsky.dfe.c.a.p;
import com.google.wireless.android.finsky.dfe.c.a.u;
import com.google.wireless.android.finsky.dfe.c.a.y;

public final class com.google.android.finsky.billing.acquire.a implements com.google.android.finsky.dialogbuilder.a
{

    public com.google.android.finsky.billing.common.q a;
    public com.google.android.finsky.billing.common.u b;
    public com.google.android.finsky.br.b c;
    public com.google.android.finsky.billing.a.h d;
    public com.google.android.finsky.dialogbuilder.b e;
    public final Account f;
    public final Document g;
    public final Activity h;
    public final com.google.android.finsky.billing.c.a i;
    public final com.google.android.finsky.billing.c.b j;
    public final com.google.android.finsky.billing.b.g k;
    public final com.google.android.finsky.dialogbuilder.b.h l;
    public final com.google.android.finsky.billing.b.f m;
    public final com.google.android.finsky.d.w n;
    public final com.google.android.finsky.billing.b.d o;
    public final com.google.android.finsky.billing.b.c p;
    public final com.google.android.finsky.billing.b.b q;
    public final Bundle r;

    a(Account p0, Document p1, Activity p2, com.google.android.finsky.billing.c.a p3, com.google.android.finsky.billing.c.b p4, com.google.android.finsky.billing.b.g p5, com.google.android.finsky.dialogbuilder.b.h p6, com.google.android.finsky.billing.b.f p7, com.google.android.finsky.d.w p8, com.google.android.finsky.billing.b.d p9, com.google.android.finsky.billing.b.c p10, com.google.android.finsky.billing.b.b p11, Bundle p12) {
        ((com.google.android.finsky.billing.acquire.d)com.google.android.finsky.providers.d.a(com.google.android.finsky.billing.acquire.d)).a(this);
        this.f = p0;
        this.g = p1;
        this.h = p2;
        this.i = p3;
        this.j = p4;
        this.k = p5;
        this.l = p6;
        this.m = p7;
        this.n = p8;
        this.o = p9;
        this.p = p10;
        this.q = p11;
        if (p12 == 0)
            this.r = new Bundle();
        else
            this.r = p12.getBundle("AcquireActionHandler.actionBundle");
    }

    public final void a(com.google.android.finsky.dialogbuilder.b p0) {
        this.e = p0;
        this.k.H = p0;
    }

    public final boolean a(com.google.wireless.android.finsky.dfe.c.a.bl p0) {
        v5 = 0;
        v6 = 1;
        v11 = 0;
        if (p0.a(com.google.wireless.android.finsky.dfe.c.a.a.a)) {
            v0 = (com.google.wireless.android.finsky.dfe.c.a.a)p0.b(com.google.wireless.android.finsky.dfe.c.a.a.a);
            if (v0.d != 0) {
                v1 = Integer.toString(1);
                if (this.r.containsKey(v1))
                    FinskyLog.e("Cannot launch multiple redeem flows simultaneously.", new Object[0]);
                else {
                    this.r.putParcelable(v1, ParcelableProto.a(v0.d));
                    this.h.startActivityForResult(this.a.a(this.f.name, v0.d.b, v0.d.c, this.n), 1);
                }
            }
            else if (v0.e != 0) {
                v1 = Integer.toString(2);
                if (this.r.containsKey(v1))
                    FinskyLog.e("Cannot launch multiple top up flows simultaneously.", new Object[0]);
                else {
                    this.r.putParcelable(v1, ParcelableProto.a(v0.e));
                    this.h.startActivityForResult(this.b.a(this.f.name, v0.e.b, this.n), 2);
                }
            }
            else if (v0.b != 0) {
                this.i.a(v0.b);
                this.e.a(v0.b.b);
            }
            else if (v0.c != 0) {
                if (this.j.e != 0 && this.j.e.booleanValue())
                    v1 = 1;
                else
                    v1 = 0;
                if (v1 != 0)
                    this.e.a(v0.c.c);
                else {
                    v3 = new com.google.android.finsky.billing.acquire.b(this, v0.c);
                    if (this.j.d == 0)
                        throw new IllegalStateException("User input field not set.");
                    if (this.j.g >= v0.c.b.b)
                        v3.a(0);
                    else if (TextUtils.isEmpty(this.j.d.a())) {
                        this.j.k = 1;
                        this.j.e = Boolean.valueOf(0);
                        this.j.g = this.j.g + 1;
                        if (this.j.g >= v0.c.b.b)
                            v6 = 0;
                        v3.a(v6);
                    }
                    else {
                        this.j.k = 0;
                        this.j.e = 0;
                        v2 = new String[1];
                        v2[0] = this.j.d.a();
                        com.google.android.finsky.utils.bb.a(new com.google.android.finsky.billing.c.c(this.j, v0.c.b, v3), v2);
                        v11 = 1;
                    }
                }
            }
            else if (v0.f != 0)
                this.m.a(v0.f);
            else if (v0.h != 0) {
                v4 = v0.h;
                v0 = Integer.toString(3);
                if (this.r.containsKey(v0))
                    FinskyLog.e("Cannot launch multiple age verification flows simultaneously.", new Object[0]);
                else {
                    this.r.putParcelable(v0, ParcelableProto.a(v4));
                    v3 = v4.d;
                    if (!(v4.a & 2))
                        v6 = 0;
                    if (v6 != 0)
                        v4 = v4.e;
                    else
                        v4 = 0;
                    this.h.startActivityForResult(this.c.a(this.h, this.f.name, v3, v4, this.n), 3);
                }
            }
            else if (v0.g != 0) {
                v1 = Integer.toString(4);
                if (this.r.containsKey(v1))
                    FinskyLog.e("Cannot launch multiple address flows simultaneously.", new Object[0]);
                else {
                    this.r.putParcelable(v1, ParcelableProto.a(v0.g));
                    this.h.startActivityForResult(this.c.a(v0.g.d, v0.g.e, new Bundle(), this.n), 4);
                }
            }
            else if (v0.j != 0)
                this.h.startActivity(this.c.a(this.h, this.f.name, this.g.a.c, this.g, 0, 1, v0.j.b, this.n));
            else {
                if (v0.i != 0) {
                    this.k.F = v0.i;
                    switch (this.k.a()) {
                        case 1:
                            v11 = v6;
                            break;
                        case 2:
                            this.k.f();
                            v6 = 0;
                            v11 = v6;
                            break;
                        default:
                            throw new RuntimeException("Unexpected state when handling refresh action!");
                    }
                }
                if (v0.k != 0) {
                    if (v0.k.b != 0) {
                        if (!(v0.k.b.a & 1))
                            v6 = 0;
                        if (v6 != 0 && v0.k.b.b == 2 && v0.k.b.c != 0)
                            this.p.a = this.p.d.a(this.p.c, v0.k.b.c, v0.k.b.d, this.p.b);
                    }
                    if (v0.k.a != 0)
                        this.e.a(v0.k.a);
                }
                else if (v0.l != 0) {
                    v1 = Integer.toString(5);
                    if (this.r.containsKey(v1))
                        FinskyLog.e("Cannot launch multiple web view flows simultaneously.", new Object[0]);
                    else {
                        this.r.putParcelable(v1, ParcelableProto.a(v0.l));
                        this.h.startActivityForResult(this.c.a(this.f, v0.l.d, v0.l.e, this.n), 5);
                    }
                }
                else if (v0.m != 0) {
                    v8 = v0.m;
                    v0 = Integer.toString(6);
                    if (this.r.containsKey(v0))
                        FinskyLog.e("Cannot launch multiple light purchase flows simultaneously.", new Object[0]);
                    else {
                        this.r.putParcelable(v0, ParcelableProto.a(v8));
                        v0 = new com.google.android.finsky.cv.a.cv().b(v8.d.b).a(v8.d.c).b(v8.d.d).a(v8.j);
                        v0.n = v8.i;
                        if (v8.a & 4)
                            v3 = 1;
                        else
                            v3 = 0;
                        if (v3 != 0)
                            v3 = v8.g;
                        else
                            v3 = 0;
                        if (v8.a & 2)
                            v4 = 1;
                        else
                            v4 = 0;
                        if (v4 != 0)
                            v4 = v8.f;
                        else
                            v4 = 1;
                        if (v8.a & 1)
                            v7 = 1;
                        else
                            v7 = 0;
                        if (v7 != 0)
                            v7 = v8.e;
                        else
                            v7 = 0;
                        if (!(v8.a & 8))
                            v6 = 0;
                        if (v6 != 0)
                            v9 = v8.h;
                        else
                            v9 = 0;
                        this.h.startActivityForResult(this.c.a(this.f, new Document(v0), v3, v4, 0, v7, 0, 0, v9, this.n), 6);
                    }
                }
                else if (v0.n != 0) {
                    this.d.a(this.f.name, this.o);
                    if (v0.n.a != 0)
                        this.e.a(v0.n.a);
                }
                else if (v0.o != 0) {
                    if (v0.o.a != 0)
                        v6 = 0;
                    if (v6 != 0) {
                        if (v0.o.a == 0)
                            v5 = v0.o.d;
                        v1 = new com.google.android.finsky.l.j(this.q.a).a(v5.b).a(this.q.b.a(v5.c)).e();
                    }
                    else
                        v1 = 0;
                    if (v1 != 0)
                        this.e.a(v0.o.b);
                    else
                        this.e.a(v0.o.c);
                }
            }
        }
        return v11;
    }

}
