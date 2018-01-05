package com.google.android.finsky.stream.base;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.android.volley.C0657w;
import com.android.volley.VolleyError;
import com.google.android.finsky.api.C1287h;
import com.google.android.finsky.ba.C1461c;
import com.google.android.finsky.ba.C1556d;
import com.google.android.finsky.bg.C1611k;
import com.google.android.finsky.dfemodel.C1031w;
import com.google.android.finsky.dfemodel.C2720j;
import com.google.android.finsky.dfemodel.C2721l;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.frameworkviews.BucketRowLayout;
import com.google.android.finsky.installqueue.C1003o;
import com.google.android.finsky.installqueue.C3340g;
import com.google.android.finsky.installqueue.C3369m;
import com.google.android.finsky.navigationmanager.C3748a;
import com.google.android.finsky.p111d.C2482j;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p111d.ad;
import com.google.android.finsky.p147y.C4808a;
import com.google.android.finsky.playcard.ab;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.play.layout.d;
import com.google.wireless.android.a.a.a.a.ce;

public abstract class C4252f extends C4250b implements C0657w, ad, C1031w, C1003o, ab, C4251h {
    public int f21497A;
    public int f21498B = -1;
    public final C4808a f21499o;
    public final C4230c f21500p;
    public int f21501q;
    public int f21502r;
    public int f21503s;
    public boolean f21504t;
    public ce f21505u;
    public final C4239i f21506v;
    public final boolean f21507w;
    public final C3340g f21508x;
    public final C1287h f21509y;
    public int f21510z;

    public abstract void mo4063a(Document document, int i, View view);

    public abstract void mo4064a(BucketRowLayout bucketRowLayout, int i);

    public abstract void c_(View view);

    public abstract int mo4094d();

    public abstract int mo4095l();

    public abstract int mo4096m();

    public int mo4151n() {
        return -1;
    }

    public abstract int mo4097o();

    public void mo4150b(View view) {
    }

    public C4252f(Context context, C3748a c3748a, C4808a c4808a, ad adVar, C4230c c4230c, C1611k c1611k, C1556d c1556d, C4239i c4239i, C2495w c2495w, C3340g c3340g, C1287h c1287h, C1461c c1461c) {
        super(context, c3748a, adVar, c1611k, c1556d, c2495w, false);
        this.f21500p = c4230c;
        this.f21499o = c4808a;
        this.f21507w = c1461c.dj().mo2294a(12633050);
        this.f21506v = c4239i;
        this.f21508x = c3340g;
        this.f21509y = c1287h;
    }

    public void mo4050a(C2720j c2720j) {
        super.mo4050a(c2720j);
        this.f21501q = mo4094d();
        this.f21503s = mo4095l();
        this.g.m11918a((C1031w) this);
        this.g.m11917a((C0657w) this);
        this.f21504t = mo4151n() != -1;
        this.f21505u = C2482j.m13283a(mo4097o());
        C2482j.m13285a(this.f21505u, this.g.f14908a.f14885a.f12087D);
        if (this.f21507w) {
            this.f21506v.mo4038a(this.e, this.f, this, this, this.h, this.i);
            if (this.g.f14908a.f14885a.f12099f == 3) {
                this.f21508x.mo3481a((C1003o) this);
            }
        }
        m19762r();
    }

    public final void mo4053a(C4278u c4278u) {
        super.mo4053a(c4278u);
        if (this.f21507w) {
            this.f21506v.mo4043a(c4278u);
        }
    }

    public final C4277k mo4049a(C4255t c4255t, C4277k c4277k, int i) {
        int i2 = 1;
        int i3 = ((C4256g) c4255t).f21514a;
        if (i3 == this.f21503s) {
            return c4277k;
        }
        int i4 = c4277k.f21578b;
        int i5 = c4277k.f21577a;
        if ((((float) (i4 + i)) / ((float) i) > 0.5f ? 1 : 0) == 0) {
            i5++;
        }
        if (!this.f21504t) {
            i2 = 0;
        } else if (i5 == 0) {
            return new C4277k(0, 0);
        }
        return new C4277k((((i5 - i2) * i3) / this.f21503s) + i2, 0);
    }

    public int mo1508a() {
        if (this.f21507w) {
            return this.f21506v.mo4034a();
        }
        return this.f21502r;
    }

    public final int mo4060p() {
        return this.f21502r;
    }

    public int mo1509a(int i) {
        if (this.f21507w) {
            return this.f21506v.mo4035a(i);
        }
        return mo4054b(i);
    }

    public final int mo4054b(int i) {
        if (mo4168c(i)) {
            return mo4151n();
        }
        return mo4096m();
    }

    public void mo1510a(View view, int i) {
        if (this.f21507w) {
            this.f21506v.mo4039a(view, i);
        } else {
            mo4056c(view, i);
        }
    }

    public final void mo4056c(View view, int i) {
        int i2 = 0;
        if (mo4168c(i)) {
            mo4150b(view);
            return;
        }
        if (this.f21504t) {
            i--;
        }
        BucketRowLayout bucketRowLayout = (BucketRowLayout) view;
        mo4064a(bucketRowLayout, i);
        for (int childCount = bucketRowLayout.getChildCount(); childCount < this.f21503s; childCount++) {
            bucketRowLayout.addView(this.m.inflate(this.f21501q, bucketRowLayout, false));
        }
        int i3 = i * this.f21503s;
        while (i2 < this.f21503s) {
            int i4 = i3 + i2;
            mo4063a(this.g.m14686a(i4) ? (Document) this.g.m14679a(i4, true) : null, i4, bucketRowLayout.getChildAt(i2));
            i2++;
        }
    }

    public void mo1511b(View view, int i) {
        if (this.f21507w) {
            this.f21506v.mo4044b(view, i);
        } else {
            mo4057d(view, i);
        }
    }

    public final void mo4057d(View view, int i) {
        if (!mo4168c(i)) {
            BucketRowLayout bucketRowLayout = (BucketRowLayout) view;
            for (int i2 = 0; i2 < bucketRowLayout.getChildCount(); i2++) {
                c_(bucketRowLayout.getChildAt(i2));
            }
        }
    }

    public void mo4163a(C4256g c4256g) {
        super.mo4052a((C4255t) c4256g);
        if (this.f21507w && c4256g != null) {
            this.f21510z = c4256g.f21515b;
            if (c4256g.f21514a == this.f21503s) {
                this.f21497A = c4256g.f21516c;
            } else {
                this.f21497A = mo4169d(this.f21510z);
            }
            this.f21506v.mo4041a(c4256g.f21517d, this.f21497A);
        }
    }

    public final void mo4051a(C4277k c4277k, int i) {
        if (!this.f21507w) {
            return;
        }
        if (this.D == null) {
            FinskyLog.m21669e("mState is expected to be initialized in %s", this);
            return;
        }
        if (((C4256g) this.D).f21517d == null) {
            ((C4256g) this.D).f21517d = new C4276j();
        }
        this.f21506v.mo4042a(((C4256g) this.D).f21517d, c4277k, i);
    }

    public void mo4061q() {
        if (this.f21507w) {
            this.f21506v.mo4045b(((C4256g) this.D).f21517d);
        }
        if (this.g.f14908a.f14885a.f12099f == 3) {
            this.f21508x.mo3484b((C1003o) this);
        }
        this.g.m11922b((C1031w) this);
        this.g.m11921b((C0657w) this);
        super.mo4061q();
    }

    public final void mo1448a(Document document, d dVar) {
        this.f21499o.m22589b(document.f14885a.f12096c);
        this.C.mo4087a(this, 0, mo1508a(), true);
    }

    public final boolean mo4058f() {
        return true;
    }

    public final boolean mo4059g() {
        return super.mo4059g();
    }

    public void m_() {
        int a = mo1508a();
        m19762r();
        this.C.mo4087a(this, a - 1, 1, true);
        this.C.mo4086a(this, a, mo1508a() - a);
        if (!mo4059g()) {
            this.f21500p.mo4029a();
        }
    }

    public final void mo1062a(VolleyError volleyError) {
        this.f21500p.mo4032b();
    }

    public final void m19762r() {
        int m = this.g.m14698m();
        int i = this.f21503s;
        this.f21502r = ((m + i) - 1) / i;
        this.f21502r = Math.min(this.f21502r, Integer.MAX_VALUE);
        this.f21502r = (this.f21504t ? 1 : 0) + this.f21502r;
    }

    private final boolean mo4168c(int i) {
        return i == 0 && this.f21504t;
    }

    private final int mo4169d(int i) {
        int i2 = i / this.f21503s;
        if (this.f21504t) {
            i2++;
        }
        return i2 + 1;
    }

    public ce getPlayStoreUiElement() {
        return this.f21505u;
    }

    public ad getParentNode() {
        return this.h;
    }

    public final void mo1219a(ad adVar) {
        C2482j.m13291a((ad) this, adVar);
    }

    public final void mo1205a(C3369m c3369m) {
        if (!this.f21507w || this.f21498B == -1) {
            return;
        }
        if ((c3369m.f17273c.f17153d != 11 && c3369m.f17273c.f17153d != 0 && c3369m.f17273c.f17153d != 1) || this.g == null) {
            return;
        }
        if (this.g.m14686a(this.f21498B)) {
            Document document = (Document) this.g.m14679a(this.f21498B, false);
            if (document.cf().equals(c3369m.m16819a()) && !TextUtils.isEmpty(document.cB())) {
                C2720j a = C2721l.m14731a(this.f21509y.mo2015a(), document.cB());
                this.f21510z = this.f21498B;
                this.f21497A = mo4169d(this.f21510z);
                this.f21498B = -1;
                this.f21506v.mo4037a(this.f21497A, a);
                return;
            }
            return;
        }
        FinskyLog.m21669e("Not available item for post install injection in position %d", Integer.valueOf(this.f21498B));
    }

    public final /* synthetic */ C4255t mo4062s() {
        if (this.D == null) {
            FinskyLog.m21669e("mState is expected to be initialized in %s", this);
            return null;
        }
        ((C4256g) this.D).f21514a = this.f21503s;
        if (this.f21507w) {
            if (((C4256g) this.D).f21517d == null) {
                ((C4256g) this.D).f21517d = new C4276j();
            }
            ((C4256g) this.D).f21515b = this.f21510z;
            ((C4256g) this.D).f21516c = this.f21497A;
            this.f21506v.mo4040a(((C4256g) this.D).f21517d);
        }
        return (C4256g) super.mo4062s();
    }

    public final /* synthetic */ C4277k mo4055b(C4255t c4255t, C4277k c4277k, int i) {
        C4255t c4255t2 = (C4256g) c4255t;
        if (this.f21507w) {
            return this.f21506v.mo4036a(c4255t2, c4255t2.f21517d, c4255t2.f21516c, c4277k, i);
        }
        return mo4049a(c4255t2, c4277k, i);
    }
}
