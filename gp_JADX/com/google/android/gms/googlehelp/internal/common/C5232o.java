package com.google.android.gms.googlehelp.internal.common;

import android.content.Context;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.api.C5022m;
import com.google.android.gms.common.internal.af;
import com.google.android.gms.googlehelp.C5215f;
import com.google.android.gms.googlehelp.GoogleHelp;
import com.google.android.gms.internal.ej;
import com.google.android.gms.internal.ek;
import java.util.Collections;
import java.util.List;

public final class C5232o implements Runnable {
    public final Context f26313a;
    public final GoogleHelp f26314b;
    public final long f26315c;

    public C5232o(Context context, GoogleHelp googleHelp, long j) {
        this.f26313a = context;
        this.f26314b = googleHelp;
        this.f26315c = j;
    }

    public final void run() {
        try {
            new ek().m24338a();
            throw new NoSuchMethodError();
        } catch (Throwable e) {
            Log.w("gH_GetAsyncFeedbackPsd", "Failed to get async Feedback psd.", e);
            List singletonList = Collections.singletonList(Pair.create("gms:feedback:async_feedback_psd_failure", "exception"));
            C5022m a = C5215f.m23999a(this.f26313a);
            af.m23724a(C5224g.f26310j.mo4664b(a.f25591g, this.f26314b, ej.m24337a(singletonList), this.f26315c));
        }
    }
}
