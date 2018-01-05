package com.google.android.finsky.services;

import com.android.volley.VolleyError;
import com.google.android.finsky.dp.C1096g;
import com.google.wireless.android.finsky.dfe.nano.gj;
import com.google.wireless.android.finsky.dfe.nano.gp;
import java.util.concurrent.Semaphore;

final class C4081o implements C1096g {
    public final /* synthetic */ int f20442a;
    public final /* synthetic */ boolean[] f20443b;
    public final /* synthetic */ Semaphore f20444c;

    C4081o(int i, boolean[] zArr, Semaphore semaphore) {
        this.f20442a = i;
        this.f20443b = zArr;
        this.f20444c = semaphore;
    }

    public final void mo1427a(gp gpVar) {
        for (gj gjVar : gpVar.f31759b) {
            if (this.f20442a == gjVar.c) {
                this.f20443b[0] = true;
                break;
            }
        }
        this.f20444c.release();
    }

    public final void mo1426a(VolleyError volleyError) {
        this.f20444c.release();
    }
}
