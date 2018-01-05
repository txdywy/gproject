package com.google.android.finsky.billing.d.a;

import android.accounts.Account;
import android.os.Handler;
import com.google.android.finsky.aa.b;
import com.google.android.finsky.billing.d.c;
import com.google.android.finsky.billing.d.e;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.play.utils.b.a;
import java.util.ArrayDeque;

public final class com.google.android.finsky.billing.d.a.c implements com.google.android.finsky.billing.d.e
{

    public final com.google.android.finsky.billing.d.a.b a;

    c(com.google.android.finsky.billing.d.a.b p0) {
        this.a = p0;
    }

    public final void S_() {
        if (this.a.d.d != 0)
            this.a.d.d.S_();
        if (this.a.b.isEmpty())
            this.a.d = 0;
        if (this.a.a()) {
            if (this.a.e != 0) {
                this.a.e.run();
                this.a.e = 0;
            }
        }
        else
            this.a.c.postDelayed(new com.google.android.finsky.billing.d.a.d(this.a), ((Long)com.google.android.finsky.aa.b.gv.b()).longValue());
    }

    public final void a(Account p0, Document p1) {
        if (this.a.d.d != 0)
            this.a.d.d.a(p0, p1);
        if (this.a.b.isEmpty())
            this.a.d = 0;
        if (this.a.a()) {
            if (this.a.e != 0) {
                this.a.e.run();
                this.a.e = 0;
            }
        }
        else
            this.a.c.postDelayed(new com.google.android.finsky.billing.d.a.d(this.a), ((Long)com.google.android.finsky.aa.b.gv.b()).longValue());
    }

}
