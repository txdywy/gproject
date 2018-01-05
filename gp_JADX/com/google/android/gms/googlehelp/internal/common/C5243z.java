package com.google.android.gms.googlehelp.internal.common;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.api.C5058o;
import com.google.android.gms.googlehelp.GoogleHelp;

final class C5243z extends C5223f {
    public /* synthetic */ Bundle f26352a;
    public /* synthetic */ long f26353u;
    public /* synthetic */ GoogleHelp f26354v;

    C5243z(C5058o c5058o, Bundle bundle, long j, GoogleHelp googleHelp) {
        this.f26352a = bundle;
        this.f26353u = j;
        this.f26354v = googleHelp;
        super(c5058o);
    }

    protected final void mo4665a(Context context, C5228k c5228k) {
        try {
            c5228k.mo4657a(this.f26352a, this.f26353u, this.f26354v, new aa(this));
        } catch (Throwable e) {
            Log.e("gH_GoogleHelpApiImpl", "Requesting to save the async help psd failed!", e);
            m23074c(C5234q.f26319a);
        }
    }
}
