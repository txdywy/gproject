package com.google.android.finsky.accounts.impl;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.content.Context;
import com.google.android.finsky.aa.C0957n;
import com.google.android.finsky.accounts.C0986a;
import com.google.android.finsky.accounts.C0987b;
import com.google.android.finsky.aq.C1500a;
import com.google.android.finsky.as.C1506e;
import com.google.android.finsky.dx.C2910a;
import com.google.android.finsky.utils.FinskyLog;
import com.google.wireless.android.finsky.dfe.f.a.a;
import com.google.wireless.android.finsky.dfe.nano.gy;
import java.util.ArrayList;
import java.util.List;

public final class C0991a extends C0990e implements C0986a {
    public final List f5986a;
    public final C2910a f5987b;

    public C0991a(Context context, C1500a c1500a, C1506e c1506e, C2910a c2910a) {
        this(context, AccountManager.get(context), c1500a, c1506e, c2910a);
    }

    private C0991a(Context context, AccountManager accountManager, C1500a c1500a, C1506e c1506e, C2910a c2910a) {
        super(context, accountManager, c1506e, c1500a);
        this.f5986a = new ArrayList();
        this.f5987b = c2910a;
    }

    public final Account[] mo1195a() {
        int i;
        int i2 = 0;
        Account[] d = mo1188d();
        int length = d.length;
        for (i = 0; i < d.length; i++) {
            if (!mo1193a(d[i])) {
                length--;
                d[i] = null;
            }
        }
        if (length == 0) {
            return c;
        }
        if (length == d.length) {
            return d;
        }
        Account[] accountArr = new Account[length];
        for (i = 0; i < d.length; i++) {
            if (d[i] != null) {
                length = i2 + 1;
                accountArr[i2] = d[i];
                i2 = length;
            }
        }
        return accountArr;
    }

    public final Account mo1189e() {
        Account b = mo1196b();
        return b != null ? b : super.mo1189e();
    }

    public final Account mo1196b() {
        Account[] a = mo1195a();
        if (a.length > 0) {
            return a[0];
        }
        return null;
    }

    public final boolean mo1194a(String str) {
        return mo1193a(mo1183b(str));
    }

    public final boolean mo1193a(Account account) {
        return (account == null || mo1197b(account)) ? false : true;
    }

    public final boolean mo1197b(Account account) {
        gy b = this.f5987b.m15190b(account.name);
        if (b == null) {
            return false;
        }
        a aVar = b.f;
        if (aVar == null || aVar.e != 2) {
            return false;
        }
        return true;
    }

    public final synchronized void mo1192a(C0987b c0987b) {
        if (this.f5986a.contains(c0987b)) {
            FinskyLog.m21669e("Trying to register an already registered AccountSwitchListener.", new Object[0]);
        } else {
            this.f5986a.add(c0987b);
        }
    }

    public final void mo1198c(Account account) {
        if (account == null || mo1193a(account)) {
            synchronized (this) {
                for (int size = this.f5986a.size() - 1; size >= 0; size--) {
                    ((C0987b) this.f5986a.get(size)).mo2020a(account);
                }
            }
            return;
        }
        FinskyLog.m21669e("Cannot switch to non-visible account", new Object[0]);
    }

    public final /* bridge */ /* synthetic */ String[] mo1191g() {
        return super.mo1191g();
    }

    public final /* bridge */ /* synthetic */ boolean mo1190f() {
        return super.mo1190f();
    }

    public final /* bridge */ /* synthetic */ void mo1182a(Account account, C0957n c0957n) {
        super.mo1182a(account, c0957n);
    }

    public final /* bridge */ /* synthetic */ Account[] mo1188d() {
        return super.mo1188d();
    }

    public final /* bridge */ /* synthetic */ String[] mo1185c() {
        return super.mo1185c();
    }
}
