package com.google.android.gms.googlehelp.internal.common;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.api.C5058o;
import com.google.android.gms.feedback.FeedbackOptions;
import com.google.android.gms.googlehelp.GoogleHelp;

final class C5237t extends C5223f {
    public /* synthetic */ FeedbackOptions f26325a;
    public /* synthetic */ Bundle f26326u;
    public /* synthetic */ long f26327v;
    public /* synthetic */ GoogleHelp f26328w;

    C5237t(C5058o c5058o, FeedbackOptions feedbackOptions, Bundle bundle, long j, GoogleHelp googleHelp) {
        this.f26325a = feedbackOptions;
        this.f26326u = bundle;
        this.f26327v = j;
        this.f26328w = googleHelp;
        super(c5058o);
    }

    protected final void mo4665a(Context context, C5228k c5228k) {
        try {
            c5228k.mo4658a(this.f26325a, this.f26326u, this.f26327v, this.f26328w, new C5238u(this));
        } catch (Throwable e) {
            Log.e("gH_GoogleHelpApiImpl", "Requesting to save the async feedback psbd failed!", e);
            m23074c(C5234q.f26319a);
        }
    }
}
