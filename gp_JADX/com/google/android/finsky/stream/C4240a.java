package com.google.android.finsky.stream;

import android.content.Context;
import android.view.View;
import com.google.android.finsky.dfemodel.C1031w;
import com.google.android.finsky.dfemodel.C2720j;
import com.google.android.finsky.dfemodel.C2721l;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.navigationmanager.C3748a;
import com.google.android.finsky.p111d.C2482j;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p111d.ad;
import com.google.android.finsky.stream.base.C4239i;
import com.google.android.finsky.stream.base.C4250b;
import com.google.android.finsky.stream.base.C4251h;
import com.google.android.finsky.stream.base.C4255t;
import com.google.android.finsky.stream.base.C4276j;
import com.google.android.finsky.stream.base.C4277k;
import com.google.android.finsky.stream.base.C4278u;
import com.google.android.finsky.stream.base.C4279n;
import com.google.android.finsky.stream.base.C4292r;
import com.google.android.finsky.stream.base.view.C4296f;
import com.google.android.finsky.stream.p248a.C4234b;
import com.google.android.finsky.stream.p248a.C4236d;
import com.google.android.finsky.utils.ac;
import com.google.wireless.android.a.a.a.a.ce;
import java.util.HashMap;
import java.util.Map;

public final class C4240a implements ad, C1031w, C4239i {
    public ce f21441a = C2482j.m13283a(408);
    public final C4236d f21442b;
    public int f21443c;
    public C4234b f21444d;
    public C4279n f21445e;
    public C2720j f21446f;
    public int f21447g = -1;
    public C2720j f21448h;
    public C1031w f21449i;
    public final Map f21450j = new HashMap();
    public Context f21451k;
    public C3748a f21452l;
    public C4278u f21453m;
    public ad f21454n;
    public C2495w f21455o;
    public C4250b f21456p;
    public C4251h f21457q;
    public int f21458r;
    public int f21459s;
    public int f21460t;
    public C4277k f21461u;

    public C4240a(C4236d c4236d) {
        this.f21442b = c4236d;
    }

    public final void mo4038a(Context context, C3748a c3748a, C4250b c4250b, C4251h c4251h, ad adVar, C2495w c2495w) {
        this.f21451k = context;
        this.f21452l = c3748a;
        this.f21456p = c4250b;
        this.f21457q = c4251h;
        this.f21454n = adVar;
        this.f21455o = c2495w;
        this.f21449i = new C4244b(this);
    }

    public final void mo4043a(C4278u c4278u) {
        this.f21453m = c4278u;
    }

    public final void mo4041a(C4276j c4276j, int i) {
        if (c4276j.f21573a != null) {
            m19695b(i, c4276j.f21573a);
            this.f21461u = this.f21445e.m19845a(c4276j.f21574b);
        }
    }

    public final C4277k mo4036a(C4255t c4255t, C4276j c4276j, int i, C4277k c4277k, int i2) {
        if (this.f21445e == null) {
            return this.f21457q.mo4049a(c4255t, c4277k, i2);
        }
        if (c4276j.f21575c) {
            return new C4277k(this.f21461u.f21577a + this.f21443c, this.f21461u.f21578b);
        }
        C4277k c4277k2;
        if (c4277k.f21577a >= i) {
            c4277k2 = new C4277k(c4277k.f21577a - c4276j.f21576d, c4277k.f21578b);
        } else {
            c4277k2 = c4277k;
        }
        C4277k a = this.f21457q.mo4049a(c4255t, c4277k2, i2);
        if (a.f21577a < this.f21443c) {
            return a;
        }
        if (c4277k.f21577a < i) {
            return new C4277k(this.f21443c, 0);
        }
        return new C4277k(a.f21577a + this.f21445e.mo1039a(), a.f21578b);
    }

    public final int mo4034a() {
        int p = this.f21457q.mo4060p();
        if (this.f21445e != null) {
            return p + this.f21445e.mo1039a();
        }
        return p;
    }

    public final int mo4035a(int i) {
        C4533d b = m19683b(i);
        if (b.f23201a) {
            return this.f21445e.mo1040a(b.f23203c);
        }
        return this.f21457q.mo4054b(b.f23202b);
    }

    public final void mo4039a(View view, int i) {
        C4533d b = m19683b(i);
        if (!b.f23201a) {
            this.f21457q.mo4056c(view, b.f23202b);
            if (i > 0 && (view instanceof C4296f)) {
                ((C4296f) view).setIsFirstRow(m19683b(i - 1).f23201a);
            }
        } else if (this.f21450j.containsKey(view)) {
            this.f21445e.m19851a((C4292r) this.f21450j.get(view), b.f23203c);
        } else {
            C4292r c4292r = new C4292r(view);
            this.f21450j.put(view, c4292r);
            this.f21445e.m19851a(c4292r, b.f23203c);
        }
    }

    public final void mo4044b(View view, int i) {
        if (this.f21450j.containsKey(view)) {
            this.f21445e.m19850a((C4292r) this.f21450j.get(view));
            this.f21450j.remove(view);
            return;
        }
        this.f21457q.mo4057d(view, m19683b(i).f23202b);
    }

    public final void mo4040a(C4276j c4276j) {
        c4276j.f21573a = this.f21446f;
        if (this.f21445e != null) {
            c4276j.f21576d = this.f21445e.mo1039a();
        }
    }

    public final void mo4042a(C4276j c4276j, C4277k c4277k, int i) {
        if (this.f21445e != null) {
            C4533d b = m19683b(c4277k.f21577a);
            if (b.f23201a) {
                c4276j.f21575c = true;
                this.f21458r = b.f23203c;
                this.f21459s = c4277k.f21578b;
                this.f21460t = i;
                return;
            }
            c4276j.f21575c = false;
            this.f21458r = -1;
        }
    }

    public final void mo4045b(C4276j c4276j) {
        if (this.f21445e != null) {
            this.f21446f.m11922b((C1031w) this);
            if (c4276j.f21574b == null) {
                c4276j.f21574b = new ac();
            }
            this.f21445e.m19854a(c4276j.f21574b, this.f21458r, this.f21459s, this.f21460t);
            this.f21444d.m19660d();
        }
    }

    public final void mo4037a(int i, C2720j c2720j) {
        if (c2720j.mo2861a()) {
            m19695b(i, c2720j);
            return;
        }
        this.f21448h = c2720j;
        this.f21448h.m11918a(this.f21449i);
        this.f21448h.m14699n();
        this.f21447g = i;
    }

    private final C4533d m19683b(int i) {
        C4533d c4533d = new C4533d();
        if (this.f21445e == null || i < this.f21443c) {
            c4533d.f23202b = i;
        } else {
            int a = this.f21445e.mo1039a();
            if (i < this.f21443c || i >= this.f21443c + a) {
                c4533d.f23202b = i - a;
            } else {
                c4533d.f23201a = true;
                c4533d.f23203c = i - this.f21443c;
            }
        }
        return c4533d;
    }

    final void m19695b(int i, C2720j c2720j) {
        if (this.f21445e != null) {
            this.f21446f.m11922b((C1031w) this);
            this.f21445e.m19859b(new ac());
            this.f21444d.m19660d();
            this.f21453m.mo4088b(this.f21456p, this.f21443c, this.f21445e.mo1039a());
            if (this.f21443c < this.f21457q.mo4060p()) {
                this.f21453m.mo4087a(this.f21456p, this.f21443c, 1, false);
            }
        }
        this.f21443c = i;
        this.f21446f = c2720j;
        this.f21446f.m11918a((C1031w) this);
        this.f21445e = new C4279n(true);
        this.f21445e.mo5196a(new C4299c(this));
        this.f21444d = this.f21442b.m19665a(C2721l.m14735a(c2720j), this.f21445e, null, this.f21451k, this.f21452l, this, this.f21455o, 2, null, null, null, false, null, true, true, null, null, false);
    }

    public final void m_() {
        Document document = this.f21446f.f14908a;
        if (document != null && document.f14885a.f12087D != null) {
            C2482j.m13285a(this.f21441a, document.f14885a.f12087D);
        }
    }

    public final ce getPlayStoreUiElement() {
        return this.f21441a;
    }

    public final ad getParentNode() {
        return this.f21454n;
    }

    public final void mo1219a(ad adVar) {
        C2482j.m13291a((ad) this, adVar);
    }
}
