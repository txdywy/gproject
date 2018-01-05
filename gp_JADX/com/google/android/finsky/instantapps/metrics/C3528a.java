package com.google.android.finsky.instantapps.metrics;

import android.content.Context;
import android.os.Build.VERSION;
import com.google.android.instantapps.common.p217e.bf;
import com.google.android.instantapps.common.p221d.p222a.ae;

public final class C3528a implements ae {
    public final Context f17782a;
    public final bf f17783b;
    public final bf f17784c;
    public final boolean f17785d;

    public C3528a(Context context, bf bfVar, bf bfVar2) {
        this.f17782a = context;
        this.f17783b = bfVar;
        this.f17784c = bfVar2;
        this.f17785d = VERSION.SDK_INT >= 21;
    }

    public final void mo3541a() {
        if (this.f17785d && ((Boolean) this.f17784c.mo5158a()).booleanValue()) {
            LogFlushJob.m17108a(this.f17782a, ((Long) this.f17783b.mo5158a()).longValue());
        }
    }

    public final void mo3542b() {
        if (this.f17785d && ((Boolean) this.f17784c.mo5158a()).booleanValue()) {
            LogFlushJob.m17107a(this.f17782a);
        }
    }
}
