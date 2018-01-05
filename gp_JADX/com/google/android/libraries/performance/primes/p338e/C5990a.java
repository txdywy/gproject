package com.google.android.libraries.performance.primes.p338e;

import android.content.SharedPreferences;
import android.util.Base64;
import com.google.android.libraries.p326c.p327a.C5916a;
import com.google.android.libraries.performance.primes.C5989do;
import com.google.protobuf.nano.C0757i;

public final class C5990a {
    public final SharedPreferences f30014a;

    public C5990a(SharedPreferences sharedPreferences) {
        this.f30014a = sharedPreferences;
    }

    public final boolean m27834a(String str, C0757i c0757i) {
        byte[] decode = Base64.decode(this.f30014a.getString(str, ""), 0);
        if (decode == null || decode.length == 0) {
            C5989do.m27824a(5, "PersistStorage", "unknown key", new Object[0]);
            return false;
        } else if (decode[0] == (byte) 1) {
            try {
                C0757i.m4906a(c0757i, decode, 1, decode.length - 1);
                return true;
            } catch (Throwable e) {
                C5989do.m27828b("PersistStorage", "failure reading proto", e, new Object[0]);
            }
        } else {
            C5989do.m27824a(5, "PersistStorage", "wrong header", new Object[0]);
            return false;
        }
    }

    public final boolean m27835b(String str, C0757i c0757i) {
        Object a = C0757i.m4909a((C0757i) C5916a.m27406a((Object) c0757i));
        Object obj = new byte[(a.length + 1)];
        obj[0] = 1;
        System.arraycopy(a, 0, obj, 1, a.length);
        return this.f30014a.edit().putString(str, Base64.encodeToString(obj, 0)).commit();
    }
}
