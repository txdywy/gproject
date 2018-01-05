package com.google.android.gms.googlehelp.internal.common;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.api.C5058o;
import com.google.android.gms.googlehelp.GoogleHelp;

final class C5235r extends C5223f {
    public /* synthetic */ Bundle f26321a;
    public /* synthetic */ long f26322u;
    public /* synthetic */ GoogleHelp f26323v;

    C5235r(C5058o c5058o, Bundle bundle, long j, GoogleHelp googleHelp) {
        this.f26321a = bundle;
        this.f26322u = j;
        this.f26323v = googleHelp;
        super(c5058o);
    }

    protected final void mo4665a(Context context, C5228k c5228k) {
        try {
            c5228k.mo4660b(this.f26321a, this.f26322u, this.f26323v, new C5236s(this));
        } catch (Throwable e) {
            Log.e("gH_GoogleHelpApiImpl", "Requesting to save the async feedback psd failed!", e);
            m23074c(C5234q.f26319a);
        }
    }
}
