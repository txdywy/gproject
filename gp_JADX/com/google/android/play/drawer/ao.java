package com.google.android.play.drawer;

import android.accounts.Account;
import android.support.v7.widget.em;
import com.android.volley.C0660x;
import com.google.android.finsky.cv.p177a.cv;
import com.google.android.finsky.cv.p177a.hb;

final class ao implements C0660x {
    public final /* synthetic */ String f31442a;
    public final /* synthetic */ ak f31443b;

    ao(ak akVar, String str) {
        this.f31443b = akVar;
        this.f31442a = str;
    }

    public final /* synthetic */ void b_(Object obj) {
        int i;
        hb hbVar = (hb) obj;
        em emVar = this.f31443b;
        cv cvVar = hbVar.f12532b;
        String str = this.f31442a;
        emVar.f31430q.put(str, cvVar);
        emVar.f31431r.add(str);
        for (Account account : emVar.f31429p) {
            if (!emVar.f31431r.contains(account.name)) {
                i = 0;
                break;
            }
        }
        i = 1;
        if (i != 0) {
            emVar.m3631c(0);
        }
    }
}
