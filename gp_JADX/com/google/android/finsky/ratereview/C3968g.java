package com.google.android.finsky.ratereview;

import android.content.Context;
import com.android.volley.C0657w;
import com.android.volley.NetworkError;
import com.android.volley.VolleyError;
import com.google.android.finsky.api.C1290m;
import com.google.android.finsky.utils.FinskyLog;

final class C3968g implements C0657w {
    public final /* synthetic */ C3974q f20023a;
    public final /* synthetic */ String f20024b;
    public final /* synthetic */ boolean f20025c;
    public final /* synthetic */ Context f20026d;
    public final /* synthetic */ C2642m f20027e;

    C3968g(C3974q c3974q, String str, boolean z, Context context, C2642m c2642m) {
        this.f20023a = c3974q;
        this.f20024b = str;
        this.f20025c = z;
        this.f20026d = context;
        this.f20027e = c2642m;
    }

    public final void mo1062a(VolleyError volleyError) {
        if (!(volleyError instanceof NetworkError)) {
            this.f20023a.m18694b(this.f20024b, this.f20025c);
            FinskyLog.m21667d("Error posting review: %s", volleyError.toString());
            C3964c.m18675a(this.f20026d, C1290m.m7702a(this.f20026d, volleyError));
        }
        if (this.f20027e != null) {
            this.f20027e.mo3088k();
        }
    }
}
