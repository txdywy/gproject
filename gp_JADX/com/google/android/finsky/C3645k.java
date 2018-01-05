package com.google.android.finsky;

import com.android.volley.C0657w;
import com.android.volley.VolleyError;
import com.google.android.finsky.utils.FinskyLog;
import java.util.List;

final class C3645k implements C0657w {
    public final /* synthetic */ List f18020a;

    C3645k(List list) {
        this.f18020a = list;
    }

    public final void mo1062a(VolleyError volleyError) {
        FinskyLog.m21667d("Error acking notifications [%s]", this.f18020a);
    }
}
