package com.google.android.finsky.bb.a;

import android.accounts.Account;
import android.support.v4.app.Fragment;
import android.support.v4.app.p;
import android.widget.Toast;
import com.android.volley.VolleyError;
import com.google.android.finsky.at.k;
import com.google.android.finsky.bb.a;
import com.google.android.finsky.bb.d;
import com.google.android.finsky.by.l;
import com.google.android.finsky.cv.a.cv;
import com.google.android.finsky.dfemodel.Document;
import com.google.wireless.android.finsky.dfe.h.a.f;
import java.util.Iterator;
import java.util.Set;

public final class com.google.android.finsky.bb.a.f implements com.android.volley.w, com.android.volley.x, Runnable
{

    public Fragment a;
    public com.google.wireless.android.finsky.dfe.h.a.f b;
    public Account c;
    public com.google.android.finsky.bb.a d;
    public final com.google.android.finsky.bb.a.e e;

    f(com.google.android.finsky.bb.a.e p0, Fragment p1, Account p2, com.google.android.finsky.bb.a p3) {
        this.e = p0;
        this.a = p1;
        this.c = p2;
        this.d = p3;
    }

    public final void a(VolleyError p0) {
        v2 = this.e.a.iterator();
        while (true) {
            if (!v2.hasNext())
                return;
            if (!this.a.k())
                continue;
            if (((com.google.android.finsky.bb.d)v2.next()).a(this.c.name, this.d.a.a.c)) {
                if (this.d.e != 0)
                    v0 = 2131952183;
                else
                    v0 = 2131952185;
                Toast.makeText(this.a.g(), v0, 1).show();
                if (this.d.e == 0)
                    v0 = 1;
                else
                    v0 = 0;
                this.d.e = v0;
                return;
            }
        }
    }

    public final void b_(Object p0) {
        this.b = (com.google.wireless.android.finsky.dfe.h.a.f)p0;
        this.e.f.a(this.c, "FamilyShareModule.setShareState", this, ((com.google.wireless.android.finsky.dfe.h.a.f)p0).b);
    }

    public final void run() {
        v2 = this.e.a.iterator();
        while (true) {
            if (!v2.hasNext())
                return;
            if (!this.a.k())
                continue;
            if (((com.google.android.finsky.bb.d)v2.next()).a(this.c.name, this.d.a.a.c, this.b)) {
                if (this.b.d()) {
                    if (this.b.a & 2)
                        v0 = 1;
                    else
                        v0 = 0;
                    if (v0 != 0)
                        new com.google.android.finsky.at.k().c(this.b.c).a(this.b.d).d(2131952688).a(1).a().a(this.a.B, "sharing");
                }
                return;
            }
        }
    }

}
