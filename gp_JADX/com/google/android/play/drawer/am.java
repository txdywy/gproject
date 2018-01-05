package com.google.android.play.drawer;

import android.accounts.Account;
import android.support.v7.widget.em;
import com.android.volley.C0660x;
import com.google.android.finsky.cv.p177a.cv;
import com.google.android.finsky.cv.p177a.le;

final class am implements C0660x {
    public final /* synthetic */ String f31440a;
    public final /* synthetic */ ak f31441b;

    am(ak akVar, String str) {
        this.f31441b = akVar;
        this.f31440a = str;
    }

    public final /* synthetic */ void b_(Object obj) {
        int i;
        le leVar = (le) obj;
        em emVar = this.f31441b;
        cv cvVar = leVar.f13004a;
        String str = this.f31440a;
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
