package com.google.android.finsky.detailspage;

import android.text.TextUtils;
import com.android.volley.C0657w;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.aa.C0955b;
import com.google.android.finsky.by.C0999d;
import com.google.android.finsky.by.C2197a;
import com.google.android.finsky.cv.p177a.jf;
import com.google.android.finsky.dfemodel.C1031w;
import com.google.android.finsky.dfemodel.C2335k;
import com.google.android.finsky.dfemodel.C2719i;
import com.google.android.finsky.dfemodel.C2721l;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.installqueue.C1003o;
import com.google.android.finsky.installqueue.C3369m;

public class dc extends eh implements C0999d, C1003o {
    public Boolean f14406d;
    public Boolean f14407e;
    public boolean f14408f;
    public boolean f14409g;
    public Document f14410h;
    public C2719i f14411i;
    public Document f14412j;
    public C2719i f14413k;
    public boolean f14414l;
    public boolean f14415m;
    public boolean f14416n;

    public final void mo2974a(boolean z, Document document, C2719i c2719i, Document document2, C2719i c2719i2) {
        boolean z2 = false;
        if (!z) {
            return;
        }
        if (!C1473m.f7980a.dj().mo2294a(12631854) || TextUtils.isEmpty(c2719i.f14925a.k)) {
            if (this.f14406d == null) {
                boolean z3 = ((Boolean) C0955b.f5867K.m28964b()).booleanValue() || document.f14885a.f12099f == 3 || document.f14885a.f12099f == 1;
                this.f14406d = Boolean.valueOf(z3);
            }
            if (this.f14406d.booleanValue() && !this.f14408f) {
                this.f14409g = z;
                this.f14410h = document;
                this.f14411i = c2719i;
                this.f14412j = document2;
                this.f14413k = c2719i2;
                if (C1473m.f7980a.dj().mo2294a(12629849)) {
                    int b = C1473m.f7980a.bw().mo3482b(document.cf());
                    if (b == 1 || b == 2 || b == 3) {
                        z2 = true;
                    }
                }
                if (!z2) {
                    if (!this.f14414l) {
                        C1473m.f7980a.bw().mo3481a((C1003o) this);
                        this.f14414l = true;
                    }
                    if (this.f14407e == null) {
                        this.f14407e = Boolean.valueOf(C1473m.f7980a.mo2045Y().m11647a(document, this.D));
                        this.D.mo2814a((C0999d) this);
                    }
                } else if (document.m14662q() != null) {
                    this.f14408f = true;
                    super.mo2974a(this.f14409g, this.f14410h, this.f14411i, this.f14412j, this.f14413k);
                    this.f14415m = true;
                }
            }
        }
    }

    protected final void aa_() {
        C2335k c2335k = ((ei) this.b).e;
        if (c2335k == null) {
            C1473m.f7980a.aO();
            C2335k a = C2721l.m14733a(this.x, ((ei) this.b).d, false, true);
            ((ei) this.b).e = a;
            c2335k = a;
        }
        c2335k.m11918a((C1031w) this);
        c2335k.m11917a((C0657w) this);
        if (!c2335k.mo2861a()) {
            c2335k.m14699n();
        }
    }

    public final void m_() {
        super.m_();
        if (((ei) this.b).e.m14698m() != 0 && !this.f14416n) {
            if (this.u instanceof db) {
                ((db) this.u).ao();
            }
            this.f14416n = true;
        }
    }

    protected final jf mo3067b(Document document) {
        return document.m14662q();
    }

    public final void mo2980h() {
        super.mo2980h();
        if (this.f14414l) {
            C1473m.f7980a.bw().mo3484b((C1003o) this);
            this.f14414l = false;
        }
        this.D.mo2819b(this);
    }

    public final int mo2978e() {
        return 1;
    }

    public final void ab_() {
    }

    public final void mo1204a(C2197a c2197a) {
        if (!this.f14415m) {
            boolean z;
            if (!this.f14407e.booleanValue()) {
                if (C1473m.f7980a.mo2045Y().m11647a(this.f14410h, this.D)) {
                    z = true;
                } else if (C1473m.f7980a.mo2045Y().m11648a(this.f14410h, this.D, 2)) {
                    z = true;
                }
                if (z) {
                    super.mo2974a(this.f14409g, this.f14410h, this.f14411i, this.f14412j, this.f14413k);
                    this.f14407e = Boolean.valueOf(true);
                    this.f14415m = true;
                }
            }
            z = false;
            if (z) {
                super.mo2974a(this.f14409g, this.f14410h, this.f14411i, this.f14412j, this.f14413k);
                this.f14407e = Boolean.valueOf(true);
                this.f14415m = true;
            }
        }
    }

    public final void mo1205a(C3369m c3369m) {
        if (!this.f14415m && c3369m.m16819a().equals(this.f14410h.cf())) {
            if (c3369m.f17273c.f17153d == 11 || c3369m.f17273c.f17153d == 0 || c3369m.f17273c.f17153d == 1) {
                super.mo2974a(this.f14409g, this.f14410h, this.f14411i, this.f14412j, this.f14413k);
                this.f14415m = true;
            }
        }
    }
}
