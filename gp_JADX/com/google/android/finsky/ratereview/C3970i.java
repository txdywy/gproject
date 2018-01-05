package com.google.android.finsky.ratereview;

import android.content.Context;
import com.android.volley.C0657w;
import com.android.volley.VolleyError;
import com.google.android.finsky.utils.FinskyLog;

final class C3970i implements C0657w {
    public final /* synthetic */ C3974q f20031a;
    public final /* synthetic */ String f20032b;
    public final /* synthetic */ boolean f20033c;
    public final /* synthetic */ Context f20034d;
    public final /* synthetic */ C2642m f20035e;

    C3970i(C3974q c3974q, String str, boolean z, Context context, C2642m c2642m) {
        this.f20031a = c3974q;
        this.f20032b = str;
        this.f20033c = z;
        this.f20034d = context;
        this.f20035e = c2642m;
    }

    public final void mo1062a(VolleyError volleyError) {
        this.f20031a.m18694b(this.f20032b, this.f20033c);
        FinskyLog.m21667d("Error posting review: %s", volleyError.toString());
        C3964c.m18674a(this.f20034d);
        if (this.f20035e != null) {
            this.f20035e.mo3088k();
        }
    }
}
