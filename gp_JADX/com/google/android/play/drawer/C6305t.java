package com.google.android.play.drawer;

import android.accounts.Account;
import com.android.volley.C0660x;
import com.google.android.finsky.cv.p177a.cv;
import com.google.android.finsky.cv.p177a.hb;

final class C6305t implements C0660x {
    public final /* synthetic */ String f31519a;
    public final /* synthetic */ C6300o f31520b;

    C6305t(C6300o c6300o, String str) {
        this.f31520b = c6300o;
        this.f31519a = str;
    }

    public final /* synthetic */ void b_(Object obj) {
        Object obj2 = null;
        hb hbVar = (hb) obj;
        C6300o c6300o = this.f31520b;
        cv cvVar = hbVar.f12532b;
        String str = this.f31519a;
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
