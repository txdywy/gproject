package com.google.android.finsky.detailspage;

import android.os.Handler;
import android.text.TextUtils;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.ba.C1552e;
import com.google.android.finsky.by.C0999d;
import com.google.android.finsky.by.C2197a;
import com.google.android.finsky.dfemodel.C2719i;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.installqueue.C1003o;
import com.google.android.finsky.installqueue.C3369m;

public class cz extends C2637r implements C0999d, C1003o {
    public Runnable f14388K = new da(this);
    public final C1552e f14389j = C1473m.f7980a.dj();
    public Document f14390k;
    public Boolean f14391l;
    public boolean f14392m;
    public boolean f14393n;
    public boolean f14394o;
    public boolean f14395p;
    public boolean f14396q;
    public String f14397r;
    public Handler f14398s = new Handler();

    protected final String mo3066a() {
        return this.f14397r;
    }

    public final void mo2974a(boolean z, Document document, C2719i c2719i, Document document2, C2719i c2719i2) {
        if (this.f14389j.mo2294a(12631854) && z) {
            this.f14397r = c2719i.f14925a.k;
            this.f14390k = document;
            if (!(!this.f14389j.mo2294a(12638925) || this.f14395p || TextUtils.isEmpty(mo3066a()))) {
                this.f14395p = true;
                this.f14398s.postDelayed(this.f14388K, 500);
            }
            if (!this.f14392m) {
                boolean z2;
                if (this.f14389j.mo2294a(12629849)) {
                    int b = C1473m.f7980a.bw().mo3482b(document.cf());
                    if (b == 1 || b == 2 || b == 3) {
                        z2 = true;
                        if (z2) {
                            if (!this.f14393n) {
                                C1473m.f7980a.bw().mo3481a((C1003o) this);
                                this.f14393n = true;
                            }
                            if (this.f14391l == null) {
                                this.f14391l = Boolean.valueOf(C1473m.f7980a.mo2045Y().m11647a(document, this.D));
                                this.D.mo2814a((C0999d) this);
                                return;
                            }
                            return;
                        }
                        this.f14392m = true;
                        m14094b();
                        this.f14394o = true;
                    }
                }
                z2 = false;
                if (z2) {
                    if (this.f14393n) {
                        C1473m.f7980a.bw().mo3481a((C1003o) this);
                        this.f14393n = true;
                    }
                    if (this.f14391l == null) {
                        this.f14391l = Boolean.valueOf(C1473m.f7980a.mo2045Y().m11647a(document, this.D));
                        this.D.mo2814a((C0999d) this);
                        return;
                    }
                    return;
                }
                this.f14392m = true;
                m14094b();
                this.f14394o = true;
            }
        }
    }

    public final void mo2980h() {
        super.mo2980h();
        if (this.f14393n) {
            C1473m.f7980a.bw().mo3484b((C1003o) this);
            this.f14393n = false;
        }
        this.D.mo2819b(this);
        if (this.f14389j.mo2294a(12638925) && this.f14395p) {
            this.f14398s.removeCallbacks(this.f14388K);
        }
    }

    public final void m_() {
        if (((C2672t) this.b).f14753a.m14698m() != 0 && !this.f14396q) {
            if (this.u instanceof db) {
                ((db) this.u).ao();
            }
            this.f14396q = true;
        }
    }

    public final void ab_() {
    }

    public final void mo1204a(C2197a c2197a) {
        boolean z = false;
        if (!this.f14394o) {
            if (!(this.f14391l.booleanValue() || this.f14390k == null)) {
                if (C1473m.f7980a.mo2045Y().m11647a(this.f14390k, this.D)) {
                    z = true;
                } else if (C1473m.f7980a.mo2045Y().m11648a(this.f14390k, this.D, 2)) {
                    z = true;
                }
            }
            if (z) {
                m14094b();
                this.f14391l = Boolean.valueOf(true);
                this.f14394o = true;
            }
        }
    }

    public final void mo1205a(C3369m c3369m) {
        if (!this.f14394o && c3369m.m16819a().equals(this.f14390k.cf())) {
            if (c3369m.f17273c.f17153d == 11 || c3369m.f17273c.f17153d == 0 || c3369m.f17273c.f17153d == 1) {
                m14094b();
                this.f14394o = true;
            }
        }
    }
}
