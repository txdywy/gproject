package com.google.android.finsky.dv;

import android.accounts.Account;
import com.google.android.finsky.accounts.C0986a;
import com.google.android.finsky.billing.p120d.C1805b;
import com.google.android.finsky.billing.p120d.C1807a;
import com.google.android.finsky.billing.p120d.C1811c;
import com.google.android.finsky.by.C2206c;
import com.google.android.finsky.by.C2233o;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

final class C2902d implements Runnable {
    public static final Set f15428a = new HashSet();
    public final C2206c f15429b;
    public final C2233o f15430c;
    public final Map f15431d = new HashMap();
    public final Collection f15432e;
    public final C1805b f15433f;
    public final C1807a f15434g;
    public final Runnable f15435h;
    public final C0986a f15436i;

    C2902d(C2206c c2206c, C2233o c2233o, C0986a c0986a, C1805b c1805b, Collection collection, Runnable runnable) {
        this.f15429b = c2206c;
        this.f15430c = c2233o;
        this.f15436i = c0986a;
        this.f15433f = c1805b;
        this.f15434g = this.f15433f.mo2455a();
        this.f15435h = runnable;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            Account account;
            C2901c c2901c = (C2901c) it.next();
            if (this.f15431d.containsKey(c2901c.f15424a)) {
                account = (Account) this.f15431d.get(c2901c.f15424a);
            } else {
                account = this.f15436i.mo1183b(c2901c.f15424a);
                this.f15431d.put(c2901c.f15424a, account);
            }
            if (account == null) {
                it.remove();
            } else if (this.f15430c.m11647a(c2901c.f15426c, this.f15429b.mo2811a(account))) {
                it.remove();
            } else if (!f15428a.add(c2901c.f15426c.m14625N().f13171k)) {
                it.remove();
            }
        }
        this.f15432e = collection;
    }

    public final void run() {
        for (C2901c c2901c : this.f15432e) {
            this.f15434g.mo2456a(new C1811c((Account) this.f15431d.get(c2901c.f15424a), c2901c.f15426c));
        }
        this.f15434g.mo2457a(this.f15435h);
    }
}
