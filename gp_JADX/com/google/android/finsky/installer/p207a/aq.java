package com.google.android.finsky.installer.p207a;

import android.os.AsyncTask;
import android.support.v7.widget.eq;
import com.google.android.finsky.bn.C2127b;
import com.google.android.finsky.bn.C2129c;
import com.google.android.finsky.installer.C3283a;
import com.google.android.finsky.p107l.C3647b;
import com.google.android.finsky.p111d.C2474c;

final class aq extends AsyncTask {
    public final /* synthetic */ ah f16943a;

    aq(ah ahVar) {
        this.f16943a = ahVar;
    }

    protected final /* synthetic */ void onPostExecute(Object obj) {
        C3283a c3283a = (C3283a) obj;
        if (c3283a == null) {
            C2127b c2127b = this.f16943a.f16900h;
            c2127b.mo2675d(this.f16943a.f16878I, c2127b.mo2657a(this.f16943a.f16878I).f10819m | eq.FLAG_MOVED);
        } else {
            this.f16943a.f16874E.m11221a(this.f16943a.f16878I, new C2474c(3150).m13236a(this.f16943a.f16878I).m13231a(this.f16943a.f16893X).f13342a);
        }
        this.f16943a.ac = c3283a;
        this.f16943a.m16439b(0, null);
        this.f16943a.m16443c();
    }

    protected final /* synthetic */ Object doInBackground(Object[] objArr) {
        C3283a a;
        C3647b a2 = this.f16943a.f16896d.m17243a(this.f16943a.f16878I);
        C2129c c2129c = a2.f18029d;
        if ((a2.f18028c != null ? 1 : null) == null) {
            a = this.f16943a.ab.mo3413a(this.f16943a.f16878I);
            if (a != null && a.mo3416c() > c2129c.f10809c) {
                a.mo3420g();
                return null;
            }
        }
        a = null;
        return a;
    }
}
