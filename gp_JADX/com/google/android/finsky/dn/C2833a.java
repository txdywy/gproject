package com.google.android.finsky.dn;

import android.accounts.Account;
import android.content.Context;
import com.google.android.finsky.accounts.C0988c;
import com.google.android.finsky.by.C2199l;
import com.google.android.finsky.by.C2206c;
import com.google.android.finsky.by.C2227g;
import com.google.android.finsky.by.C2233o;
import com.google.android.finsky.dfemodel.Document;
import java.util.ArrayList;
import java.util.List;

public final class C2833a {
    public final Context f15222a;
    public final C2206c f15223b;
    public final C2199l f15224c;
    public final C0988c f15225d;
    public final C2233o f15226e;
    public final List f15227f = new ArrayList();
    public final List f15228g = new ArrayList();

    public C2833a(Context context, C2206c c2206c, C2199l c2199l, C0988c c0988c, C2233o c2233o) {
        this.f15222a = context;
        this.f15223b = c2206c;
        this.f15224c = c2199l;
        this.f15225d = c0988c;
        this.f15226e = c2233o;
    }

    public final int m14983a(Document document, Account account) {
        boolean b = m14990b(document, account);
        boolean a = m14987a(document.f14885a.f12096c);
        boolean bU = document.bU();
        boolean bT = document.bT();
        if (a) {
            b = !b;
        }
        if (b) {
            if (bT) {
                return 3;
            }
            return 4;
        } else if (bU) {
            return 2;
        } else {
            if (bT) {
                return 1;
            }
            return 0;
        }
    }

    public final boolean m14990b(Document document, Account account) {
        return this.f15223b.mo2811a(account).mo2782a(C2227g.m11633a(account.name, "u-tpl", document, 1));
    }

    public final boolean m14987a(String str) {
        return this.f15228g.contains(str);
    }

    public final void m14984a(C1002e c1002e) {
        this.f15227f.add(c1002e);
    }

    public final void m14988b(C1002e c1002e) {
        this.f15227f.remove(c1002e);
    }

    public final void m14985a(String str, boolean z) {
        for (int size = this.f15227f.size() - 1; size >= 0; size--) {
            ((C1002e) this.f15227f.get(size)).mo1215d(str, z);
        }
    }

    public final boolean m14986a(Document document) {
        return document.bS() && document.bT() != m14990b(document, this.f15225d.cY());
    }

    public final boolean m14989b(Document document) {
        return document.bT() && !m14990b(document, this.f15225d.cY());
    }

    public final boolean m14991c(Document document, Account account) {
        boolean z;
        if (this.f15226e.m11642a(document, account) != null) {
            z = true;
        } else {
            z = false;
        }
        return !z && document.bX();
    }

    public static boolean m14982c(Document document) {
        return document != null && (document.bT() || document.bW());
    }
}
