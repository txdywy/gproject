package com.google.android.finsky.activities.inlineappinstaller;

import android.accounts.Account;
import android.support.v4.app.Fragment;
import com.google.android.finsky.cv.a.cv;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.dfemodel.b;
import com.google.android.finsky.m;

public final class com.google.android.finsky.activities.inlineappinstaller.d implements com.google.android.finsky.billing.d.e
{

    public final com.google.android.finsky.m a;
    public final com.google.android.finsky.activities.inlineappinstaller.c b;

    d(com.google.android.finsky.activities.inlineappinstaller.c p0, com.google.android.finsky.m p1) {
        this.b = p0;
        this.a = p1;
    }

    public final void S_() {
        this.b.a(this.b.c(2131952242));
    }

    public final void a(Account p0, Document p1) {
        v0 = this.a.k(p0.name);
        if (v0 != 0)
            v0.a(p1.a.c);
        this.b.a(p0, p1);
    }

}
