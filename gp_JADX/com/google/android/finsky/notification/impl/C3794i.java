package com.google.android.finsky.notification.impl;

import android.os.AsyncTask;
import android.os.AsyncTask.Status;
import com.google.android.finsky.notification.ab;
import com.google.android.finsky.providers.C3947d;
import com.google.android.finsky.scheduler.ah;
import com.google.android.finsky.scheduler.p238b.C4026d;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.bb;

public class C3794i extends ah {
    public aa f19070a;
    public ab f19071c;
    public C3788c f19072d;
    public C3796k f19073e;
    public AsyncTask f19074f;

    public C3794i() {
        ((C1403o) C3947d.m18649a(C1403o.class)).mo1870a(this);
    }

    protected final boolean mo1168a(C4026d c4026d) {
        if (this.f19071c instanceof C3803r) {
            this.f19074f = new C3795j(this);
            bb.m21792a(this.f19074f, new Void[0]);
            return true;
        }
        FinskyLog.m21669e("NotificationManager is expected.", new Object[0]);
        return false;
    }

    protected final boolean k_(int i) {
        if (this.f19074f == null) {
            return false;
        }
        Status status = this.f19074f.getStatus();
        this.f19074f.cancel(false);
        if (status == Status.PENDING) {
            return true;
        }
        return false;
    }
}
