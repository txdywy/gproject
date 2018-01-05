package com.google.android.finsky.billing;

import com.android.volley.C0660x;
import com.google.wireless.android.finsky.dfe.nano.aq;
import java.util.concurrent.Semaphore;

final class C1786c implements C0660x {
    public final /* synthetic */ int[] f9241a;
    public final /* synthetic */ Semaphore f9242b;

    C1786c(int[] iArr, Semaphore semaphore) {
        this.f9241a = iArr;
        this.f9242b = semaphore;
    }

    public final /* synthetic */ void b_(Object obj) {
        int i;
        aq aqVar = (aq) obj;
        int[] iArr = this.f9241a;
        if (aqVar.b) {
            i = 1;
        } else {
            i = 2;
        }
        iArr[0] = i;
        this.f9242b.release();
    }
}
