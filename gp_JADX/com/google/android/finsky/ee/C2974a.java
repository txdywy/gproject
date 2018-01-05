package com.google.android.finsky.ee;

import android.accounts.Account;
import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.Toast;
import com.android.volley.C0657w;
import com.android.volley.C0660x;
import com.google.android.finsky.accounts.C0988c;
import com.google.android.finsky.api.C1254c;
import com.google.android.finsky.aq.C1500a;
import com.google.android.finsky.ba.C1461c;
import com.google.android.finsky.bg.C1601a;
import com.google.android.finsky.by.C2199l;
import com.google.android.finsky.by.C2206c;
import com.google.android.finsky.by.C2227g;
import com.google.android.finsky.by.C2233o;
import com.google.android.finsky.cn.C2320a;
import com.google.android.finsky.cv.p177a.ax;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.utils.FinskyLog;
import com.squareup.leakcanary.C7582R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class C2974a {
    public final C1461c f15632a;
    public final C1500a f15633b;
    public final C2320a f15634c;
    public final C2206c f15635d;
    public final C2199l f15636e;
    public final C0988c f15637f;
    public long f15638g;
    public final List f15639h = new ArrayList();
    public final C2233o f15640i;

    public C2974a(C1461c c1461c, C1500a c1500a, C2320a c2320a, C2206c c2206c, C2199l c2199l, C0988c c0988c, C2233o c2233o) {
        this.f15632a = c1461c;
        this.f15633b = c1500a;
        this.f15634c = c2320a;
        this.f15635d = c2206c;
        this.f15636e = c2199l;
        this.f15637f = c0988c;
        this.f15640i = c2233o;
    }

    public final void m15399a(C1016f c1016f) {
        this.f15639h.add(c1016f);
    }

    public final void m15404b(C1016f c1016f) {
        this.f15639h.remove(c1016f);
    }

    final void m15400a(String str, boolean z, boolean z2) {
        for (int size = this.f15639h.size() - 1; size >= 0; size--) {
            ((C1016f) this.f15639h.get(size)).mo1217a(str, z, z2);
        }
    }

    public final boolean m15403a(Document document, C1254c c1254c) {
        if (m15402a(document, this.f15637f.cY())) {
            return false;
        }
        if (document.ae() || document.f14885a.f12098e == 20 || document.f14885a.f12098e == 4 || document.f14885a.f12098e == 30 || document.f14885a.f12098e == 8 || document.f14885a.f12098e == 34 || document.f14885a.f12098e == 44 || document.f14885a.f12098e == 3) {
            return true;
        }
        if (this.f15632a.dj().mo2294a(12608225) && this.f15633b.m8819a(c1254c.mo1620b())) {
            return true;
        }
        Account a = this.f15640i.m11642a(document, c1254c.mo1620b());
        if (a == null && document.f14885a.f12099f == 6 && document.bj()) {
            a = this.f15640i.m11643a(document.bl(), this.f15637f.cY());
        }
        boolean z;
        if (document.f14885a.f12098e == 1) {
            z = this.f15634c.mo2854a(document.m14625N().f13171k) != null;
        } else {
            z = false;
        }
        if (a != null || r1) {
            return true;
        }
        return false;
    }

    public final boolean m15401a(ax axVar, Account account) {
        return this.f15635d.mo2811a(account).mo2782a(C2227g.m11632a(account.name, "u-wl", axVar, 1));
    }

    public final boolean m15402a(Document document, Account account) {
        return m15401a(document.m14646d(), account);
    }

    public final void m15397a(View view, ax axVar, String str, String str2, C1254c c1254c) {
        if (axVar == null) {
            FinskyLog.m21665c("Tried to wishlist an item but there is no docId", new Object[0]);
            return;
        }
        boolean z;
        Context context = view.getContext();
        boolean a = m15401a(axVar, c1254c.mo1620b());
        Resources resources = context.getResources();
        C0660x c2975b = new C2975b(this, c1254c, str, a);
        C0657w c2977d = new C2977d(this, a, resources, str2, context, str);
        boolean a2 = C1601a.m9200a(context);
        if (a) {
            if (!a2) {
                Toast.makeText(context, C7582R.string.wishlist_removing, 0).show();
            }
            c1254c.mo1628b(Arrays.asList(new String[]{str}), "u-wl", c2975b, c2977d);
        } else {
            if (!a2) {
                Toast.makeText(context, C7582R.string.wishlist_adding, 0).show();
            }
            c1254c.mo1602a(Arrays.asList(new String[]{str}), "u-wl", c2975b, c2977d);
        }
        if (a) {
            z = false;
        } else {
            z = true;
        }
        m15400a(str, z, false);
        if (a2) {
            new Handler(Looper.myLooper()).post(new C2978e(context, a, view));
        }
    }

    public final void m15398a(View view, Document document, C1254c c1254c) {
        if (document == null) {
            FinskyLog.m21665c("Tried to wishlist an item but there is no document active", new Object[0]);
            return;
        }
        m15397a(view, document.m14646d(), document.f14885a.f12096c, document.f14885a.f12100g, c1254c);
    }
}
