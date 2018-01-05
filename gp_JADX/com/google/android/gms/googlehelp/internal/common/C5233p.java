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

public final class C5233p implements Runnable {
    public final Context f26316a;
    public final GoogleHelp f26317b;
    public final long f26318c;

    public C5233p(Context context, GoogleHelp googleHelp, long j) {
        this.f26316a = context;
        this.f26317b = googleHelp;
        this.f26318c = j;
    }

    public final void run() {
        try {
            new ek().m24338a();
            throw new NoSuchMethodError();
        } catch (Throwable e) {
            Log.w("gH_GetAsyncHelpPsd", "Failed to get async help psd.", e);
            List singletonList = Collections.singletonList(Pair.create("gms:googlehelp:async_help_psd_failure", "exception"));
            C5022m a = C5215f.m23999a(this.f26316a);
            af.m23724a(C5224g.f26310j.mo4662a(a.f25591g, this.f26317b, ej.m24337a(singletonList), this.f26318c));
        }
    }
}
