package com.google.android.play.drawer;

import android.accounts.Account;
import com.android.volley.C0660x;
import com.google.android.finsky.cv.p177a.cv;
import com.google.android.finsky.cv.p177a.le;

final class C6303r implements C0660x {
    public final /* synthetic */ String f31517a;
    public final /* synthetic */ C6300o f31518b;

    C6303r(C6300o c6300o, String str) {
        this.f31518b = c6300o;
        this.f31517a = str;
    }

    public final /* synthetic */ void b_(Object obj) {
        Object obj2 = null;
        le leVar = (le) obj;
        C6300o c6300o = this.f31518b;
        cv cvVar = leVar.f13004a;
        String str = this.f31517a;
        c6300o.f31506o.put(str, cvVar);
        c6300o.f31507p.add(str);
        for (Account account : c6300o.f31505n) {
            if (!c6300o.f31507p.contains(account.name)) {
                break;
            }
        }
        int i = 1;
        if (obj2 != null) {
            c6300o.notifyDataSetChanged();
        }
    }
}
