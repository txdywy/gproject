package com.google.android.finsky.instantappstossupport;

import android.os.AsyncTask;
import android.os.AsyncTask.Status;
import com.google.android.finsky.providers.C3947d;
import com.google.android.finsky.scheduler.ah;
import com.google.android.finsky.scheduler.p238b.C4026d;
import com.google.android.finsky.utils.bb;
import p002a.C0002a;

public class C3619a extends ah {
    public C0002a f17973a;
    public AsyncTask f17974c;

    public final boolean mo1168a(C4026d c4026d) {
        ((C1397d) C3947d.m18649a(C1397d.class)).mo1860a(this);
        this.f17974c = new C3620b(this.f17973a, this);
        bb.m21792a(this.f17974c, new Void[0]);
        return true;
    }

    public final boolean k_(int i) {
        if (this.f17974c == null) {
            return false;
        }
        Status status = this.f17974c.getStatus();
        this.f17974c.cancel(false);
        if (status == Status.PENDING) {
            return true;
        }
        return false;
    }
}
