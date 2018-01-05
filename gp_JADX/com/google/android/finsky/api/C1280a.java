package com.google.android.finsky.api;

import com.android.volley.C0656n;
import com.google.android.finsky.p111d.C1463g;
import com.google.android.finsky.p111d.C2474c;
import com.google.android.play.image.C1279z;
import com.google.wireless.android.a.a.a.a.as;

public final class C1280a implements C1279z {
    public final C1463g f7566a;
    public int f7567b = 100;
    public int f7568c;
    public int f7569d;
    public int f7570e;
    public int f7571f;
    public int f7572g;
    public int f7573h;
    public int f7574i;

    public C1280a(C1463g c1463g) {
        this.f7566a = c1463g;
    }

    public final void mo1666a() {
        this.f7568c++;
        this.f7569d++;
        m7679b();
    }

    public final void mo1668a(boolean z) {
        this.f7568c++;
        if (z) {
            this.f7570e++;
        }
        m7679b();
    }

    public final void mo1667a(C0656n c0656n) {
        if (c0656n instanceof C1282b) {
            C1282b c1282b = (C1282b) c0656n;
            if (c1282b.mo1680a() == 0) {
                this.f7571f++;
                this.f7573h += (int) c1282b.mo1681b();
            } else {
                this.f7572g++;
                this.f7574i += (int) c1282b.mo1681b();
            }
            m7679b();
        }
    }

    private final void m7679b() {
        if (this.f7568c >= this.f7567b || this.f7571f + this.f7572g >= this.f7567b) {
            C2474c c2474c = new C2474c(554);
            int i = this.f7568c;
            int i2 = this.f7569d;
            int i3 = this.f7570e;
            int i4 = this.f7571f;
            int i5 = this.f7572g;
            int i6 = this.f7573h;
            int i7 = this.f7574i;
            as asVar = new as();
            asVar.a = i;
            asVar.b = i2;
            asVar.c = i3;
            asVar.d = i4;
            asVar.e = i5;
            asVar.f = i6;
            asVar.g = i7;
            c2474c.f13342a.au = asVar;
            this.f7566a.dc().m13319a(c2474c.f13342a, null);
            this.f7569d = 0;
            this.f7570e = 0;
            this.f7571f = 0;
            this.f7572g = 0;
            this.f7573h = 0;
            this.f7574i = 0;
            this.f7568c = 0;
        }
    }
}
