package com.google.android.finsky.bu.p168a;

import android.accounts.Account;
import android.os.Handler;
import android.os.Looper;
import android.util.SparseIntArray;
import com.google.android.finsky.aa.C0954a;
import com.google.android.finsky.accounts.C0986a;
import com.google.android.finsky.accounts.C0987b;
import com.google.android.finsky.ba.C1461c;
import com.google.android.finsky.bu.C2181b;
import com.google.android.finsky.bu.C2186a;
import com.google.android.finsky.notification.C2182z;
import com.google.android.finsky.notification.ab;
import com.google.android.finsky.p111d.C1463g;
import com.google.android.finsky.p111d.C2474c;
import com.google.android.finsky.utils.C4680k;
import com.google.android.finsky.utils.FinskyLog;
import com.google.wireless.android.a.a.a.a.ay;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public final class C2183a implements C0987b, C2181b, C2182z {
    public static final int f10957a = "updates".hashCode();
    public final SparseIntArray f10958b = new SparseIntArray();
    public final List f10959c = new ArrayList();
    public C2186a f10960d;
    public Handler f10961e = new Handler(Looper.getMainLooper());
    public C1461c f10962f;
    public C1463g f10963g;
    public boolean f10964h;
    public boolean f10965i;
    public boolean f10966j;
    public boolean f10967k;
    public boolean f10968l;
    public boolean f10969m;

    public C2183a(ab abVar, C0986a c0986a, C2186a c2186a, C1461c c1461c, C1463g c1463g) {
        m11466h();
        abVar.mo3777a((C2182z) this);
        c0986a.mo1192a((C0987b) this);
        this.f10960d = c2186a;
        this.f10962f = c1461c;
        this.f10963g = c1463g;
        this.f10966j = c1461c.dj().mo2294a(12626952);
        this.f10964h = c1461c.dj().mo2294a(12629991);
        this.f10965i = c1461c.dj().mo2294a(12631404);
        this.f10967k = ((Boolean) C0954a.bw.m5760a()).booleanValue();
        boolean z = this.f10966j && this.f10967k;
        if (!z || this.f10964h) {
            z = this.f10960d.mo2776a(0);
        } else {
            z = this.f10960d.mo2776a(m11461d());
        }
        this.f10968l = z;
        m11459b(true);
    }

    public final void mo2770a(int i) {
        if (C2183a.m11462d(i)) {
            int d = m11461d();
            int i2 = this.f10958b.get(i);
            this.f10958b.put(i, 1);
            i2 = 1 - i2;
            if (i2 != 0) {
                m11458a(d, d + i2);
            }
            if (i2 != 0 && this.f10969m) {
                m11464f();
            }
        }
    }

    public final void mo2773b(int i) {
        if (C2183a.m11462d(i)) {
            int d = m11461d();
            int i2 = this.f10958b.get(i);
            this.f10958b.delete(i);
            i2 = -i2;
            if (i2 != 0) {
                m11458a(d, d + i2);
            }
            if (i2 != 0 && this.f10969m) {
                m11464f();
            }
        }
    }

    public final void mo2020a(Account account) {
        boolean z;
        boolean z2 = true;
        String str = account == null ? null : account.name;
        boolean a = this.f10962f.mo2249j(str).mo2294a(12626952);
        boolean a2 = this.f10962f.mo2249j(str).mo2294a(12629991);
        this.f10965i = this.f10962f.mo2249j(str).mo2294a(12631404);
        if (this.f10966j != a) {
            z = true;
        } else {
            z = false;
        }
        if (this.f10964h == a2) {
            z2 = false;
        }
        if (z || r1) {
            boolean z3 = this.f10969m;
            this.f10966j = a;
            this.f10964h = a2;
            if (z) {
                m11459b(false);
            }
            if (z3 != this.f10969m || !this.f10969m || !r1) {
                return;
            }
            if (a2) {
                m11463e();
            } else {
                m11464f();
            }
        }
    }

    private final int m11461d() {
        int i = 0;
        int i2 = 0;
        while (i < this.f10958b.size()) {
            i2 += this.f10958b.valueAt(i);
            i++;
        }
        return i2;
    }

    public final boolean mo2772a() {
        return this.f10969m && m11461d() > 0;
    }

    private final void m11463e() {
        this.f10960d.mo2776a(0);
    }

    private final void m11464f() {
        if (!this.f10964h) {
            this.f10960d.mo2776a(m11461d());
        }
    }

    public final boolean mo2775c() {
        return this.f10968l;
    }

    public final boolean mo2774b() {
        return this.f10967k;
    }

    public final void mo2771a(boolean z) {
        if (this.f10967k != z) {
            this.f10967k = z;
            C0954a.bw.m5763a(Boolean.valueOf(this.f10967k));
            m11459b(false);
        }
    }

    private final void m11459b(boolean z) {
        boolean z2 = this.f10969m;
        boolean z3 = this.f10966j && this.f10967k && this.f10968l;
        this.f10969m = z3;
        if (z) {
            m11465g();
        } else if (z2 != this.f10969m) {
            if (!this.f10969m || this.f10964h) {
                m11463e();
            } else {
                m11464f();
            }
            m11465g();
            this.f10961e.post(new C2184b(this));
        }
    }

    private final void m11458a(int i, int i2) {
        List arrayList = new ArrayList();
        for (int i3 = 0; i3 < this.f10958b.size(); i3++) {
            arrayList.add(String.format(Locale.US, "%d%c%d", new Object[]{Integer.valueOf(this.f10958b.keyAt(i3)), Character.valueOf(':'), Integer.valueOf(this.f10958b.valueAt(i3))}));
        }
        C0954a.bv.m5763a(C4680k.m21815a(arrayList));
        if (!this.f10969m) {
            return;
        }
        if (i == 0 || i2 == 0) {
            m11460c(2501);
            this.f10961e.post(new C2185c(this));
        }
    }

    private final void m11460c(int i) {
        C2474c c2474c = new C2474c(i);
        ay a = new ay().a(this.f10968l);
        boolean z = this.f10967k;
        a.a |= 2;
        a.c = z;
        this.f10963g.dc().m13319a(c2474c.m13221a(a.a(m11461d())).f13342a, null);
    }

    private final void m11465g() {
        if (!this.f10966j) {
            return;
        }
        if (!this.f10965i || this.f10968l) {
            m11460c(2500);
        }
    }

    private final void m11466h() {
        for (String str : C4680k.m21818a((String) C0954a.bv.m5760a())) {
            int indexOf = str.indexOf(58);
            if (indexOf <= 0 || indexOf >= str.length() - 1) {
                FinskyLog.m21667d("Wrong launcher icon counter count data format: %s", r0);
            } else {
                try {
                    this.f10958b.put(Integer.parseInt(str.substring(0, indexOf)), Integer.parseInt(str.substring(indexOf + 1)));
                } catch (NumberFormatException e) {
                    FinskyLog.m21667d("Wrong launcher icon counter count data format: %s", r0);
                }
            }
        }
    }

    private static boolean m11462d(int i) {
        return f10957a == i;
    }
}
