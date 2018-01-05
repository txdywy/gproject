package com.google.android.gms.googlehelp.internal.common;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.api.C5022m;
import com.google.android.gms.common.internal.af;
import com.google.android.gms.feedback.FeedbackOptions;
import com.google.android.gms.googlehelp.C5215f;
import com.google.android.gms.googlehelp.GoogleHelp;
import com.google.android.gms.internal.ek;

public final class C5221d implements Runnable {
    public final Context f26307a;
    public final GoogleHelp f26308b;
    public final long f26309c;

    public C5221d(Context context, GoogleHelp googleHelp, long j) {
        this.f26307a = context;
        this.f26308b = googleHelp;
        this.f26309c = j;
    }

    public final void run() {
        Bundle bundle = new Bundle(1);
        try {
            new ek().m24338a();
            throw new NoSuchMethodError();
        } catch (Throwable e) {
            Log.w("gH_GetAsyncFeedbackPsbd", "Failed to get async Feedback psbd.", e);
            bundle.putString("gms:feedback:async_feedback_psbd_failure", "exception");
            FeedbackOptions feedbackOptions = new FeedbackOptions(null);
            feedbackOptions.f26188h = null;
            C5022m a = C5215f.m23999a(this.f26307a);
            af.m23724a(C5224g.f26310j.mo4663a(a.f25591g, this.f26308b, feedbackOptions, bundle, this.f26309c));
        }
    }
}
