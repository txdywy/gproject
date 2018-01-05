package com.google.android.finsky.accounts.impl;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.content.Context;
import android.text.TextUtils;
import com.google.android.finsky.aa.C0955b;
import com.google.android.finsky.aa.C0957n;
import com.google.android.finsky.accounts.C0985d;
import com.google.android.finsky.aq.C1500a;
import com.google.android.finsky.as.C1506e;
import com.google.android.finsky.utils.C4680k;
import com.google.android.finsky.utils.ba;
import com.squareup.leakcanary.C7582R;
import java.util.Locale;

class C0990e implements C0985d {
    public static final Account[] f5979c = new Account[0];
    public static final String f5980d = ba.m21789a("finsky.sw_account_type");
    public String[] f5981e;
    public final Context f5982f;
    public final C1500a f5983g;
    public final C1506e f5984h;
    public final AccountManager f5985i;

    C0990e(Context context, AccountManager accountManager, C1506e c1506e, C1500a c1500a) {
        this.f5982f = context;
        this.f5985i = accountManager;
        this.f5984h = c1506e;
        this.f5983g = c1500a;
    }

    public synchronized String[] mo1185c() {
        if (this.f5981e == null) {
            if (this.f5984h.m8839b()) {
                this.f5981e = new String[]{f5980d, "cn.google", "com.google"};
            } else if (this.f5984h.m8841d()) {
                this.f5981e = new String[0];
            } else {
                Object a = C4680k.m21818a((String) C0955b.ep.m28964b());
                int length = a.length;
                this.f5981e = new String[(length + 1)];
                this.f5981e[0] = "com.google";
                System.arraycopy(a, 0, this.f5981e, 1, length);
            }
        }
        return this.f5981e;
    }

    public Account[] mo1188d() {
        int i;
        int i2;
        Account account;
        int i3 = 0;
        Account[] accounts = this.f5985i.getAccounts();
        String[] c = mo1185c();
        boolean b = this.f5984h.m8839b();
        int length = accounts.length;
        for (i = 0; i < accounts.length; i++) {
            for (Object equals : c) {
                if (accounts[i].type.equals(equals)) {
                    i2 = 1;
                    break;
                }
            }
            i2 = 0;
            if (i2 != 0) {
                boolean z;
                Account account2 = accounts[i];
                if (!b || "cn.google".equals(account2.type) || f5980d.equals(account2.type)) {
                    z = true;
                } else {
                    z = C0990e.mo1194a(account2.name);
                }
                if (z) {
                }
            }
            accounts[i] = null;
            length--;
        }
        if (length > 1) {
            for (i = 0; i < accounts.length; i++) {
                Account account3 = accounts[i];
                if (account3 != null && account3.type.equals("com.google.work")) {
                    i2 = length;
                    for (length = 0; length < accounts.length; length++) {
                        if (i != length) {
                            account = accounts[length];
                            if (account != null && account3.name.equalsIgnoreCase(account.name)) {
                                accounts[length] = null;
                                i2--;
                            }
                        }
                    }
                    length = i2;
                }
            }
        }
        if (length == accounts.length) {
            return accounts;
        }
        if (length == 0) {
            return f5979c;
        }
        Account[] accountArr = new Account[length];
        int length2 = accounts.length;
        i2 = 0;
        while (i2 < length2) {
            account = accounts[i2];
            if (account != null) {
                i = i3 + 1;
                accountArr[i3] = account;
            } else {
                i = i3;
            }
            i2++;
            i3 = i;
        }
        return accountArr;
    }

    private static boolean mo1194a(String str) {
        return str != null && str.toLowerCase(Locale.ENGLISH).endsWith("@google.com");
    }

    public void mo1182a(Account account, C0957n c0957n) {
        if (account != null) {
            if (!this.f5984h.m8839b() || "cn.google".equals(account.type) || f5980d.equals(account.type)) {
                c0957n.m5763a(account.name);
            }
        }
    }

    public Account mo1189e() {
        Account[] d = mo1188d();
        if (d.length > 0) {
            return d[0];
        }
        return null;
    }

    public Account mo1183b(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        for (Account account : mo1188d()) {
            if (account.name.equalsIgnoreCase(str)) {
                return account;
            }
        }
        return null;
    }

    public boolean mo1184c(String str) {
        return mo1183b(str) != null;
    }

    public boolean mo1190f() {
        for (Account account : mo1188d()) {
            if (account.type.equals("com.google") && C0990e.mo1194a(account.name)) {
                return true;
            }
        }
        return false;
    }

    public Account mo1181a(C0957n c0957n) {
        Account b = mo1183b((String) c0957n.m5760a());
        if (b != null) {
            return b;
        }
        b = mo1189e();
        mo1182a(b, c0957n);
        return b;
    }

    public String mo1187d(String str) {
        if (str == null) {
            return null;
        }
        return (this.f5984h.m8839b() || this.f5983g.m8818a()) ? mo1186d(mo1183b(str)) : str;
    }

    public String mo1186d(Account account) {
        if (account == null) {
            return null;
        }
        if ("cn.google".equals(account.type)) {
            return account.name.substring(0, account.name.indexOf("@"));
        }
        if (C1500a.m8816c(account)) {
            return this.f5982f.getString(C7582R.string.work_account_label);
        }
        return account.name;
    }

    public String[] mo1191g() {
        Account[] d = mo1188d();
        String[] strArr = new String[d.length];
        for (int i = 0; i < d.length; i++) {
            strArr[i] = d[i].name;
        }
        return strArr;
    }
}
