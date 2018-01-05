package com.google.android.finsky.billing.lightpurchase;

import android.accounts.Account;
import android.app.Activity;
import android.os.Bundle;
import com.google.android.finsky.accounts.c;
import com.google.android.finsky.ao.a;
import com.google.android.finsky.br.b;
import com.google.android.finsky.by.o;
import com.google.android.finsky.d.w;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.installqueue.InstallRequest;
import com.google.android.finsky.installqueue.g;
import com.google.android.finsky.m;
import com.google.android.finsky.utils.FinskyLog;
import java.util.List;

public final class com.google.android.finsky.billing.lightpurchase.ag extends com.google.android.finsky.billing.lightpurchase.f
{

    public final WeakReference g;
    public com.google.android.finsky.d.w h;
    public boolean i;

    ag(com.google.android.finsky.ao.a p0, com.google.android.finsky.by.o p1, com.google.android.finsky.installqueue.g p2, com.google.android.finsky.accounts.c p3, Activity p4, Bundle p5) {
        com.google.android.finsky.billing.lightpurchase.f(p0, p1, p2, p3, p5);
        this.g = new WeakReference(p4);
        if (p5 != 0)
            this.i = p5.getBoolean("AutoInstallDependencyHelper.acquire_pending");
        else
            this.i = 0;
    }

    public final synchronized void a(int p0) {
  0:    enter this;
  3:    if (this.i != 0) goto 7;
  5:    exit this;
  6:    return;
  8:    if (p0 != -1) goto 20;
 10:    this.a();
 14:    this.i = 0;
 16:    goto 5;
 18:    exit this;
 19:    throw ex;
 20:    try {
 20:        this.b();
        }
        catch (Throwable ex) {
 18:        exit this;
 19:        throw ex;
        }
 23:    goto 13;
 25:    try
            run 10...16
        catch (Throwable ex) {
 10:        goto 17;
        }
 26:    try
            run 1...3
        catch (Throwable ex) {
  1:        goto 17;
        }
    }

    protected final synchronized void a(Account p0, List p1) {
        enter this;
        try {
            if (this.i != 0) {
                FinskyLog.d("Acquire already pending", new Object[0]);
                this.b();
            }
            else {
                try {
                    if (p1.size() > 1) {
                        this.b();
                        FinskyLog.e("Expect to acquire only one dependency", new Object[0]);
                    }
                    else {
                        try {
                            if (p1.isEmpty())
                                this.a();
                            else {
                                ((Activity)this.g.get()).startActivityForResult(com.google.android.finsky.m.a.bo().a(p0, com.google.android.finsky.m.a.b, com.google.android.finsky.m.a.j(p0.name), (Document)p1.get(0), this.h, 0, 0, 0, 1), 14);
                                this.i = 1;
                            }
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
        catch (Throwable ex) {
            exit this;
            throw ex;
        }
        exit this;
    }

    public final void a(Bundle p0) {
        super.a(p0);
        p0.putBoolean("AutoInstallDependencyHelper.acquire_pending", this.i);
    }

    public final void a(InstallRequest p0, com.google.android.finsky.d.w p1) {
        this.h = p1;
        super.a(p0);
    }

}
