package com.google.android.finsky.accounts.impl;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.content.Context;
import android.text.TextUtils;
import com.google.android.finsky.aa.b;
import com.google.android.finsky.aa.n;
import com.google.android.finsky.aq.a;
import com.google.android.finsky.as.e;
import com.google.android.finsky.utils.ba;
import com.google.android.finsky.utils.k;
import com.google.android.play.utils.b.a;
import java.util.Locale;

public class com.google.android.finsky.accounts.impl.e implements com.google.android.finsky.accounts.d
{

    public static final Account[] c;
    public static final String d;
    public String[] e;
    public final Context f;
    public final com.google.android.finsky.aq.a g;
    public final com.google.android.finsky.as.e h;
    public final AccountManager i;

    static {
        com.google.android.finsky.accounts.impl.e.c = new Account[0];
        com.google.android.finsky.accounts.impl.e.d = com.google.android.finsky.utils.ba.a("finsky.sw_account_type");
    }

    e(Context p0, AccountManager p1, com.google.android.finsky.as.e p2, com.google.android.finsky.aq.a p3) {
        this.f = p0;
        this.i = p1;
        this.h = p2;
        this.g = p3;
    }

    private static boolean a(String p0) {
        if (p0 != 0 && p0.toLowerCase(Locale.ENGLISH).endsWith("@google.com"))
            v0 = 1;
        else
            v0 = 0;
        return v0;
    }

    public Account a(com.google.android.finsky.aa.n p0) {
        v0 = this.b((String)p0.a());
        if (v0 == 0) {
            v0 = this.e();
            this.a(v0, p0);
        }
        return v0;
    }

    public void a(Account p0, com.google.android.finsky.aa.n p1) {
        if (p0 != 0 && ((!this.h.b()) || ("cn.google".equals(p0.type)) || com.google.android.finsky.accounts.impl.e.d.equals(p0.type)))
            p1.a(p0.name);
    }

    public Account b(String p0) {
        v0 = 0;
        if (!TextUtils.isEmpty(p0)) {
            v3 = this.d();
            v2 = 0;
            while (true) {
                if (v2 >= v3.length)
                    return v0;
                if (v3[v2].name.equalsIgnoreCase(p0))
                    break;
                v2 = v2 + 1;
            }
            v0 = v3[v2];
        }
        return v0;
    }

    public boolean c(String p0) {
        if (this.b(p0) != 0)
            v0 = 1;
        else
            v0 = 0;
        return v0;
    }

    public synchronized String[] c() {
        enter this;
        try {
            if (this.e == 0) {
                if (this.h.b()) {
                    v0 = new String[3];
                    v0[0] = com.google.android.finsky.accounts.impl.e.d;
                    v0[1] = "cn.google";
                    v0[2] = "com.google";
                    this.e = v0;
                }
                else {
                    try {
                        if (this.h.d())
                            this.e = new String[0];
                        else {
                            try {
                                v0 = com.google.android.finsky.utils.k.a((String)com.google.android.finsky.aa.b.ep.b());
                                this.e = new String[v0.length + 1];
                                this.e[0] = "com.google";
                                System.arraycopy(v0, 0, this.e, 1, v0.length);
                            }
                            catch (Throwable ex) {
                                exit this;
                                throw ex;
                            }
                        }
                    }
                    catch (Throwable ex) {
                        exit this;
                        throw ex;
                    }
                }
            }
        }
        catch (Throwable ex) {
            exit this;
            throw ex;
        }
        exit this;
        return this.e;
    }

    public String d(Account p0) {
        if (p0 == 0)
            v0 = 0;
        else if ("cn.google".equals(p0.type))
            v0 = p0.name.substring(0, p0.name.indexOf("@"));
        else if (com.google.android.finsky.aq.a.c(p0))
            v0 = this.f.getString(2131953508);
        else
            v0 = p0.name;
        return v0;
    }

    public String d(String p0) {
        if (p0 == 0)
            p0 = 0;
        else if ((this.h.b()) || this.g.a())
            p0 = this.d(this.b(p0));
        return p0;
    }

    public Account[] d() {
  2:    v1 = 0;
  5:    v4 = this.i.getAccounts();
  9:    v6 = this.c();
 20:    v2 = v4.length;
 21:    v0 = 0;
 23:    if (v0 >= v4.length) {
 88:        if (v2 > 1) {
 90:            v0 = 0;
 91:            while (v0 < v4.length) {
 96:                if (v4[v0] != 0) {
106:                    if (v4[v0].type.equals("com.google.work")) {
108:                        v3 = v2;
109:                        v2 = 0;
110:                        while (v2 < v4.length) {
113:                            if (v0 != v2) {
117:                                if (v4[v2] != 0) {
127:                                    if (v4[v0].name.equalsIgnoreCase(v4[v2].name)) {
129:                                        v4[v2] = 0;
131:                                        v3 = v3 - 1;
                                        }
                                    }
                                }
133:                            v2 = v2 + 1;
                            }
136:                        v2 = v3;
                        }
                    }
137:                v0 = v0 + 1;
                }
            }
141:        if (v2 == v4.length)
143:            v0 = v4;
145:        else if (v2 == 0)
147:            v0 = com.google.android.finsky.accounts.impl.e.c;
            else {
150:            v2 = new Account[v2];
153:            v3 = 0;
154:            while (v3 < v4.length) {
158:                if (v4[v3] != 0) {
160:                    v0 = v1 + 1;
162:                    v2[v1] = v4[v3];
                    }
                    else
171:                    v0 = v1;
166:                v3 = v3 + 1;
167:                v1 = v0;
                }
169:            v0 = v2;
            }
144:        return v0;
        }
 26:    v3 = 0;
 27:    if (v3 >= v6.length) goto 173;
 39:    if (!v4[v0].type.equals(v6[v3])) goto 78;
 41:    v3 = 1;
 42:    if (v3 == 0) goto 71;
 46:    if ((!this.h.b()) || ("cn.google".equals(v4[v0].type)) || com.google.android.finsky.accounts.impl.e.d.equals(v4[v0].type))
 68:        v3 = 1;
        else
 83:        v3 = com.google.android.finsky.accounts.impl.e.a(v4[v0].name);
 69:    if (v3 != 0) goto 75;
 71:    v4[v0] = 0;
 73:    v2 = v2 - 1;
 75:    v0 = v0 + 1;
 77:    goto 22;
 78:    v3 = v3 + 1;
 80:    goto 27;
173:    v3 = 0;
174:    goto 42;
    }

    public Account e() {
        v0 = this.d();
        if (v0.length > 0)
            v0 = v0[0];
        else
            v0 = 0;
        return v0;
    }

    public boolean f() {
  0:    v0 = 0;
  1:    v2 = this.d();
  6:    v1 = 0;
  7:    while (true) {
  7:        if (v1 >= v2.length)
 30:            return v0;
 19:        if (v2[v1].type.equals("com.google"))
 19:            break;
 31:        v1 = v1 + 1;
        }
 27:    if (!com.google.android.finsky.accounts.impl.e.a(v2[v1].name)) goto 31;
 29:    v0 = 1;
 30:    return v0;
    }

    public String[] g() {
        v1 = this.d();
        v2 = new String[v1.length];
        v0 = 0;
        while (v0 < v1.length) {
            v2[v0] = v1[v0].name;
            v0 = v0 + 1;
        }
        return v2;
    }

}
