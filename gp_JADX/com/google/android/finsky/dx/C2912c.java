package com.google.android.finsky.dx;

import com.android.volley.C0657w;
import com.android.volley.VolleyError;
import com.google.android.finsky.utils.FinskyLog;

final class C2912c implements C0657w {
    public final /* synthetic */ C2910a f15477a;

    C2912c(C2910a c2910a) {
        this.f15477a = c2910a;
    }

    public final void mo1062a(VolleyError volleyError) {
        FinskyLog.m21665c("GetUserSettings failed with error: %s", volleyError);
        C2910a c2910a = this.f15477a;
        for (int size = c2910a.f15465a.size() - 1; size >= 0; size--) {
            ((C1054h) c2910a.f15465a.get(size)).ce_();
        }
    }
}
