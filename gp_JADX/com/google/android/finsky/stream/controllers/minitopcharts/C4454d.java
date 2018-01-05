package com.google.android.finsky.stream.controllers.minitopcharts;

import android.content.Context;
import android.support.v4.view.af;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.finsky.activities.gt;
import com.google.android.finsky.navigationmanager.C3748a;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p111d.ad;
import com.google.android.finsky.playcard.ao;
import com.google.android.finsky.stream.base.playcluster.C4285g;
import com.google.android.libraries.bind.p117b.C1071a;
import com.google.android.libraries.bind.p117b.C5872c;
import com.google.android.play.utils.k;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public final class C4454d extends af implements C1071a {
    public final Context f22636c;
    public final LayoutInflater f22637d;
    public final C3748a f22638e;
    public final C2495w f22639f;
    public final C4285g f22640g;
    public final ao f22641h;
    public List f22642i = new ArrayList();
    public final ad f22643j;
    public int f22644k;
    public int f22645l;
    public boolean f22646m;

    public C4454d(Context context, LayoutInflater layoutInflater, C3748a c3748a, C2495w c2495w, C4285g c4285g, ad adVar, int i, ao aoVar) {
        this.f22636c = context;
        this.f22637d = layoutInflater;
        this.f22638e = c3748a;
        this.f22643j = adVar;
        this.f22644k = i;
        this.f22641h = aoVar;
        this.f22646m = !k.b(this.f22636c);
        this.f22639f = c2495w;
        this.f22640g = c4285g;
    }

    public final void mo1373a(ViewGroup viewGroup, int i, Object obj) {
        viewGroup.removeView(((C4453b) obj).mo1309a());
    }

    public final int mo961a() {
        return this.f22642i.size();
    }

    public final Object mo1372a(ViewGroup viewGroup, int i) {
        int a = C5872c.m27301a(this, i);
        C4455e c4455e = (C4455e) this.f22642i.get(a);
        if (c4455e.f22649c == null) {
            c4455e.f22649c = new C4453b(this.f22636c, this.f22638e, this.f22637d, this.f22639f, this.f22640g, this.f22644k, this.f22641h);
            c4455e.f22649c.m20813a(c4455e.f22648b, c4455e.f22650d);
        }
        C4453b c4453b = c4455e.f22649c;
        c4453b.mo1311a(this.f22645l == a);
        viewGroup.addView(c4453b.mo1309a());
        return c4453b;
    }

    public final void m20824c(int i) {
        C4455e c4455e;
        int i2 = 0;
        while (i2 < this.f22642i.size()) {
            c4455e = (C4455e) this.f22642i.get(i2);
            if (!(c4455e.f22649c == null || i2 == i)) {
                c4455e.f22649c.mo1311a(false);
            }
            i2++;
        }
        c4455e = (C4455e) this.f22642i.get(i);
        if (c4455e.f22649c != null) {
            c4455e.f22649c.mo1311a(true);
        }
        this.f22645l = i;
    }

    public final boolean mo959a(View view, Object obj) {
        return ((gt) obj).mo1309a() == view;
    }

    public final int mo963b(Object obj) {
        gt gtVar = (gt) obj;
        for (int i = 0; i < this.f22642i.size(); i++) {
            if (gtVar == ((C4455e) this.f22642i.get(i)).f22649c) {
                return -1;
            }
        }
        return -2;
    }

    public final boolean mo1381g() {
        return this.f22646m;
    }

    public final void mo1375a(boolean z) {
        if (this.f22646m != z) {
            this.f22646m = z;
            M_();
        }
    }

    public final /* synthetic */ CharSequence mo1371a(int i) {
        if (i >= this.f22642i.size()) {
            return "";
        }
        return ((C4455e) this.f22642i.get(i)).f22647a.c.toUpperCase(Locale.getDefault());
    }
}
