package com.google.android.finsky.billing.legacyauth;

import android.accounts.Account;
import android.content.Context;
import android.os.AsyncTask;
import android.support.v4.p030c.p031a.C0282a;
import android.text.TextUtils;
import com.google.android.finsky.billing.p131e.C1817e;
import com.google.android.finsky.billing.p131e.C1822k;
import com.google.android.finsky.billing.p131e.C1823l;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.providers.C3947d;
import com.google.android.finsky.utils.bb;

public final class C1874a {
    public final Account f9586a;
    public final C1822k f9587b;
    public final C1817e f9588c = new C1817e(C0282a.m1599a(this.f9589d));
    public Context f9589d;
    public AsyncTask f9590e;

    public C1874a(Account account, C2495w c2495w) {
        ((C1355j) C3947d.m18649a(C1355j.class)).mo1744a(this);
        this.f9586a = account;
        this.f9587b = new C1822k(this.f9589d, c2495w);
    }

    public final void m10010a() {
        if (this.f9590e != null) {
            this.f9590e.cancel(true);
            this.f9590e = null;
        }
    }

    public final void m10012a(C1882i c1882i, boolean z) {
        C1823l a = this.f9587b.m9843a(this.f9586a);
        if (a != null) {
            m10011a(c1882i, a, z);
            return;
        }
        this.f9590e = new C1876c(this, c1882i, z);
        bb.m21792a(this.f9590e, new Void[0]);
        c1882i.g_();
    }

    final void m10011a(C1882i c1882i, C1823l c1823l, boolean z) {
        String str;
        CharSequence charSequence;
        String str2;
        String str3;
        int i;
        boolean z2 = z || (c1823l.f9401a == 0 && c1823l.f9403c != null && c1823l.f9402b == null);
        if (!z2 || c1823l.f9403c == null) {
            str = null;
        } else {
            str = c1823l.f9403c.f9405a;
        }
        if (!z2 || c1823l.f9403c == null) {
            charSequence = null;
        } else {
            charSequence = c1823l.f9403c.f9406b;
        }
        if (!z2 || c1823l.f9403c == null) {
            str2 = null;
        } else {
            str2 = c1823l.f9403c.f9407c;
        }
        if (c1823l.f9402b != null) {
            str3 = c1823l.f9402b.f9404a;
        } else {
            str3 = null;
        }
        if (!z2 || c1823l.f9403c == null) {
            i = 0;
        } else {
            i = c1823l.f9403c.f9408d;
        }
        this.f9590e = null;
        if (!TextUtils.isEmpty(charSequence)) {
            CharSequence charSequence2 = charSequence;
        }
        c1882i.mo2509a(new AuthState(z2, str, str2, i, this.f9588c.m9822a(this.f9586a.name), false, str3, this.f9586a.name));
    }

    public final void m10013a(C1884l c1884l) {
        bb.m21792a(new C1877d(this, c1884l), new Void[0]);
    }
}
