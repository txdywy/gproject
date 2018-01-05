package com.google.android.finsky.accounts.impl;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.text.TextUtils;
import com.google.android.finsky.aa.C0954a;
import com.google.android.finsky.aa.C0955b;
import com.google.android.finsky.aa.C0957n;
import com.google.android.finsky.aa.C0968o;
import com.google.android.finsky.ac.C0977e;
import com.google.android.finsky.accounts.C0986a;
import com.google.android.finsky.accounts.C0988c;
import com.google.android.finsky.ba.C1461c;
import com.google.android.finsky.by.C2206c;
import com.google.android.finsky.dx.C2910a;
import com.google.android.finsky.hygiene.C3178v;
import com.google.android.finsky.p107l.C3646a;
import com.google.android.finsky.p109w.C0989a;
import com.google.android.finsky.p111d.C2471a;
import com.google.android.finsky.p111d.C2474c;
import com.google.android.finsky.p198f.C3027b;
import com.google.android.finsky.providers.C1467c;
import com.google.android.finsky.providers.C3947d;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.volley.C4774e;
import java.util.Map;

public class AccountsChangedReceiver extends C0989a {
    public C0986a f5967a;
    public C0988c f5968b;
    public C2471a f5969c;
    public C3027b f5970d;
    public C3646a f5971e;
    public C0977e f5972f;
    public C1461c f5973g;
    public C1467c f5974h;
    public C3178v f5975i;
    public C2206c f5976j;
    public C2910a f5977k;
    public C4774e f5978l;

    public final void mo1179a() {
        ((C0994d) C3947d.m18649a(C0994d.class)).mo1698a(this);
    }

    public final void mo1180a(Context context, Intent intent) {
        boolean z = true;
        this.f5969c.m13178a(this.f5968b.cY()).m13367a(new C2474c(189));
        if (!this.f5973g.dj().mo2294a(12623699)) {
            C0954a.ak.m5763a(Boolean.valueOf(true));
        }
        String[] b = C0968o.m5784b(this.f5967a.mo1188d());
        boolean a = this.f5974h.mo2059a(b);
        String str = a ? b[0] : "";
        this.f5976j.mo2815a(null);
        Account[] d = this.f5967a.mo1188d();
        String[] a2 = C0968o.m5783a(d);
        String str2 = (String) C0968o.f5930g.m5760a();
        if (!TextUtils.isEmpty(str2) && a2.length > 0) {
            FinskyLog.m21659a("Restoring apps for %d new accounts.", Integer.valueOf(a2.length));
            this.f5974h.mo2115b(str2, a2[0]);
        }
        if (d.length == 1 && a2.length == 1) {
            this.f5974h.du();
        }
        SharedPreferences a3 = C0968o.f5925b.m5749a();
        Map all = a3.getAll();
        Editor edit = a3.edit();
        boolean z2 = false;
        for (String str22 : all.keySet()) {
            boolean z3;
            if (!str22.startsWith("account_exists_") || C0968o.m5782a(d, str22.substring(15))) {
                z3 = z2;
            } else {
                edit.remove(str22);
                z3 = true;
            }
            z2 = z3;
        }
        if (z2) {
            edit.apply();
        }
        for (Account account : d) {
            C0957n b2 = C0968o.f5935l.m5777b(account.name);
            if (!b2.m5764b()) {
                b2.m5763a(Boolean.valueOf(true));
            }
        }
        for (String a4 : a2) {
            this.f5977k.m15184a(a4, 7);
        }
        this.f5975i.mo3365c();
        this.f5972f.m5816a();
        if (!((Boolean) C0955b.iq.m28964b()).booleanValue() && this.f5973g.dj().mo2294a(12629250) && b.length == 0) {
            z = false;
        }
        Runnable c0992b = new C0992b(this, a, str);
        if (z) {
            this.f5978l.mo4380a(c0992b, "accounts_changed");
        } else {
            c0992b.run();
        }
    }
}
