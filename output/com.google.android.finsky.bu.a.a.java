package com.google.android.finsky.bu.a;

import android.accounts.Account;
import android.os.Handler;
import android.os.Looper;
import android.util.SparseIntArray;
import com.google.android.finsky.aa.a;
import com.google.android.finsky.aa.n;
import com.google.android.finsky.accounts.a;
import com.google.android.finsky.ba.c;
import com.google.android.finsky.ba.e;
import com.google.android.finsky.bu.a;
import com.google.android.finsky.d.c;
import com.google.android.finsky.d.g;
import com.google.android.finsky.d.j;
import com.google.android.finsky.notification.ab;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.k;
import com.google.wireless.android.a.a.a.a.ay;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public final class com.google.android.finsky.bu.a.a implements com.google.android.finsky.accounts.b, com.google.android.finsky.bu.b, com.google.android.finsky.notification.z
{

    public static final int a;
    public final SparseIntArray b;
    public final List c;
    public com.google.android.finsky.bu.a d;
    public Handler e;
    public com.google.android.finsky.ba.c f;
    public com.google.android.finsky.d.g g;
    public boolean h;
    public boolean i;
    public boolean j;
    public boolean k;
    public boolean l;
    public boolean m;

    static {
        com.google.android.finsky.bu.a.a.a = "updates".hashCode();
    }

    a(com.google.android.finsky.notification.ab p0, com.google.android.finsky.accounts.a p1, com.google.android.finsky.bu.a p2, com.google.android.finsky.ba.c p3, com.google.android.finsky.d.g p4) {
        this.b = new SparseIntArray();
        this.c = new ArrayList();
        this.e = new Handler(Looper.getMainLooper());
        this.h();
        p0.a(this);
        p1.a(this);
        this.d = p2;
        this.f = p3;
        this.g = p4;
        this.j = p3.dj().a(12626952);
        this.h = p3.dj().a(12629991);
        this.i = p3.dj().a(12631404);
        this.k = ((Boolean)com.google.android.finsky.aa.a.bw.a()).booleanValue();
        if (this.j != 0 && this.k != 0)
            v0 = 1;
        else
            v0 = 0;
        if (v0 != 0 && this.h == 0)
            v0 = this.d.a(this.d());
        else
            v0 = this.d.a(0);
        this.l = v0;
        this.b(1);
    }

    private final void a(int p0, int p1) {
        v2 = new ArrayList();
        v0 = 0;
        while (v0 < this.b.size()) {
            v5 = new Object[3];
            v5[0] = Integer.valueOf(this.b.keyAt(v0));
            v5[1] = Character.valueOf(58);
            v5[2] = Integer.valueOf(this.b.valueAt(v0));
            v2.add(String.format(Locale.US, "%d%c%d", v5));
            v0 = v0 + 1;
        }
        com.google.android.finsky.aa.a.bv.a(com.google.android.finsky.utils.k.a(v2));
        if (this.m != 0 && (p0 == 0 || p1 == 0)) {
            this.c(2501);
            this.e.post(new com.google.android.finsky.bu.a.c(this));
        }
    }

    private final void b(boolean p0) {
        if (this.j != 0 && this.k != 0 && this.l != 0)
            v0 = 1;
        else
            v0 = 0;
        this.m = v0;
        if (p0 != 0)
            this.g();
        else if (this.m != this.m) {
            if (this.m != 0 && this.h == 0)
                this.f();
            else
                this.e();
            this.g();
            this.e.post(new com.google.android.finsky.bu.a.b(this));
        }
    }

    private final void c(int p0) {
        v1 = new com.google.wireless.android.a.a.a.a.ay().a(this.l);
        v1.a = v1.a | 2;
        v1.c = this.k;
        this.g.dc().a(new com.google.android.finsky.d.c(p0).a(v1.a(this.d())).a, 0);
    }

    private final int d() {
        v0 = 0;
        v1 = 0;
        while (v0 < this.b.size()) {
            v1 = v1 + this.b.valueAt(v0);
            v0 = v0 + 1;
        }
        return v1;
    }

    private static boolean d(int p0) {
        if (com.google.android.finsky.bu.a.a.a == p0)
            v0 = 1;
        else
            v0 = 0;
        return v0;
    }

    private final void e() {
        this.d.a(0);
    }

    private final void f() {
        if (this.h == 0)
            this.d.a(this.d());
    }

    private final void g() {
        if (this.j != 0 && (this.i == 0 || this.l != 0))
            this.c(2500);
    }

    private final void h() {
        v0 = (String)com.google.android.finsky.aa.a.bv.a();
        v3 = com.google.android.finsky.utils.k.a(v0);
        v1 = 0;
        while (v1 < v3.length) {
            v6 = v3[v1].indexOf(58);
            if (v6 <= 0 || v6 >= v3[v1].length() - 1) {
                v6 = new Object[1];
                v6[0] = v0;
                FinskyLog.d("Wrong launcher icon counter count data format: %s", v6);
            }
            else {
                try {
                    this.b.put(Integer.parseInt(v3[v1].substring(0, v6)), Integer.parseInt(v3[v1].substring(v6 + 1)));
                }
                catch (NumberFormatException ex) {
                    v6 = new Object[1];
                    v6[0] = v0;
                    FinskyLog.d("Wrong launcher icon counter count data format: %s", v6);
                }
            }
            v1 = v1 + 1;
        }
    }

    public final void a(int p0) {
        if (com.google.android.finsky.bu.a.a.d(p0)) {
            v0 = this.d();
            this.b.put(p0, 1);
            v1 = 1 - this.b.get(p0);
            if (v1 != 0)
                this.a(v0, v0 + v1);
            if (v1 != 0 && this.m != 0)
                this.f();
        }
    }

    public final void a(Account p0) {
        v1 = 1;
        if (p0 == 0)
            v0 = 0;
        else
            v0 = p0.name;
        v3 = this.f.j(v0).a(12626952);
        v4 = this.f.j(v0).a(12629991);
        this.i = this.f.j(v0).a(12631404);
        if (this.j != v3)
            v0 = 1;
        else
            v0 = 0;
        if (this.h == v4)
            v1 = 0;
        if (v0 != 0 || v1 != 0) {
            this.j = v3;
            this.h = v4;
            if (v0 != 0)
                this.b(0);
            if (this.m == this.m && this.m != 0 && v1 != 0) {
                if (v4 != 0)
                    this.e();
                else
                    this.f();
            }
        }
    }

    public final void a(boolean p0) {
        if (this.k != p0) {
            this.k = p0;
            com.google.android.finsky.aa.a.bw.a(Boolean.valueOf(this.k));
            this.b(0);
        }
    }

    public final boolean a() {
        if (this.m != 0 && this.d() > 0)
            v0 = 1;
        else
            v0 = 0;
        return v0;
    }

    public final void b(int p0) {
        if (com.google.android.finsky.bu.a.a.d(p0)) {
            v0 = this.d();
            this.b.delete(p0);
            v1 = -this.b.get(p0);
            if (v1 != 0)
                this.a(v0, v0 + v1);
            if (v1 != 0 && this.m != 0)
                this.f();
        }
    }

    public final boolean b() {
        return this.k;
    }

    public final boolean c() {
        return this.l;
    }

}
