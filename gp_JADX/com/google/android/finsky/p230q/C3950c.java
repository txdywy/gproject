package com.google.android.finsky.p230q;

import android.accounts.Account;
import com.google.android.finsky.aa.C0955b;
import com.google.android.finsky.aq.C1500a;
import com.google.android.finsky.ba.C1552e;
import java.util.Map;

public final class C3950c {
    public static void m18652a(Map map, String str, String str2) {
        if (str2.startsWith("oauth2:")) {
            String str3 = "Authorization";
            String valueOf = String.valueOf("Bearer ");
            String valueOf2 = String.valueOf(str);
            map.put(str3, valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf));
            return;
        }
        str3 = "Authorization";
        valueOf = String.valueOf("GoogleLogin auth=");
        valueOf2 = String.valueOf(str);
        map.put(str3, valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf));
    }

    public static String m18651a(Account account, C1552e c1552e, long j) {
        if ((((Boolean) C0955b.fE.m28964b()).booleanValue() && c1552e != null && c1552e.mo2294a(j)) || C1500a.m8816c(account)) {
            return (String) C0955b.fG.m28964b();
        }
        return (String) C0955b.fF.m28964b();
    }
}
