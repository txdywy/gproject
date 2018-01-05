package com.google.android.finsky.dp;

import com.android.volley.VolleyError;
import com.google.wireless.android.finsky.dfe.nano.gp;
import java.util.concurrent.Semaphore;

final class C2865b implements C1096g {
    public final /* synthetic */ gp[] f15327a;
    public final /* synthetic */ Semaphore f15328b;

    C2865b(gp[] gpVarArr, Semaphore semaphore) {
        this.f15327a = gpVarArr;
        this.f15328b = semaphore;
    }

    public final void mo1427a(gp gpVar) {
        this.f15327a[0] = gpVar;
        this.f15328b.release();
    }

    public final void mo1426a(VolleyError volleyError) {
        this.f15327a[0] = null;
        this.f15328b.release();
    }
}
