package com.google.android.finsky.bc;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.TextUtils;
import android.util.SparseArray;
import com.android.volley.VolleyError;
import com.google.android.finsky.accounts.c;
import com.google.android.finsky.api.c;
import com.google.android.finsky.api.h;
import com.google.android.finsky.dx.a;
import com.google.android.finsky.providers.d;
import com.google.wireless.android.finsky.dfe.h.a.u;
import com.google.wireless.android.finsky.dfe.h.a.z;

public final class com.google.android.finsky.bc.w extends Fragment implements com.android.volley.w, com.android.volley.x, com.google.android.finsky.bc.m
{

    public com.google.android.finsky.dx.a a;
    public com.google.android.finsky.api.h b;
    public com.google.android.finsky.accounts.c c;
    public com.google.android.finsky.bc.x d;
    public com.google.android.finsky.bc.l e;

    w() {
        Fragment();
    }

    public final void a(Activity p0) {
        ((com.google.android.finsky.bc.t)com.google.android.finsky.providers.d.a(com.google.android.finsky.bc.t)).a(this);
        super.a(p0);
    }

    public final void a(VolleyError p0) {
        this.e.b(p0);
    }

    public final void b(Bundle p0) {
        super.b(p0);
        this.L = 1;
    }

    public final void b_(Object p0) {
  2:    p0 = (com.google.wireless.android.finsky.dfe.h.a.z)p0;
  8:    if (!this.k()) goto 49;
 15:    v0 = 0;
 16:    while (v0 < p0.f.length) {
 26:        this.d.d.put(p0.f[v0].c, p0.f[v0].d);
 29:        v0 = v0 + 1;
        }
 34:    if (p0.e != 1) {
 38:        switch (p0.e) {
                case 2:
 52:                v0 = this.d.a(13);
217:                break;
                case 3:
 77:                this.d.a.e = 1;
 81:                v0 = this.d.a(14);
 92:                this.d.i.a.a(this.d.b, 7);
217:                break;
                default:
 43:                this.d.a.a();
 47:                this.e = 0;
 49:                return;
            }
 60:        if (!TextUtils.isEmpty(v0)) {
 66:            v3 = new com.google.android.finsky.bc.r();
 69:            v3.a = v0;
 71:            this.d.a.a(v3, 0);
            }
            else
 98:            this.d.a.a();
        }
        else {
104:        this.d.e = p0.h;
108:        this.d.f = p0.g;
114:        if (p0.d == 0 || p0.d.length == 0)
119:            this.d.a.a();
            else {
134:            this.d.a.a = new y[p0.d.length];
136:            v0 = 0;
137:            while (v0 < p0.d.length) {
144:                switch (p0.d[v0]) {
                        case 1:
169:                        v2 = new com.google.android.finsky.bc.b(this.d.a.d);
217:                        break;
                        case 2:
157:                        v2 = new com.google.android.finsky.bc.c(this.d.a.d);
217:                        break;
                        case 3:
193:                        v2 = new com.google.android.finsky.bc.aa(this.d.a.d);
217:                        break;
                        case 4:
177:                        v2 = new com.google.android.finsky.bc.k(this.d.a.d);
217:                        break;
                        case 5:
185:                        v2 = new com.google.android.finsky.bc.z(this.d.a.d);
217:                        break;
                        case 6:
201:                        v2 = new com.google.android.finsky.bc.o(this.d.a.d);
217:                        break;
                        default:
152:                        throw new UnsupportedOperationException();
                    }
160:                this.d.a.a[v0] = v2;
162:                v0 = v0 + 1;
                }
205:            this.d.a.b = 0;
213:            this.d.a.a[this.d.a.b].a();
            }
124:        this.d.g = p0.i;
128:        this.d.h = p0.j;
        }
 74:    goto 46;
    }

    public final void c() {
        this.b.a(this.d.a()).c(this.d.e().a, 0, this, this);
    }

    public final void d(Bundle p0) {
        super.d(p0);
        v0 = this.h();
        if (this.d == 0) {
            this.d = new com.google.android.finsky.bc.x(this, v0);
            this.e = com.google.android.finsky.bc.l.a(this, this.d.d(), 0);
            this.c();
        }
        else
            this.d.a.c = v0;
    }

}
