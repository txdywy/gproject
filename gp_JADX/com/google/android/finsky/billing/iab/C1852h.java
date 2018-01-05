package com.google.android.finsky.billing.iab;

import com.android.volley.C0660x;
import com.google.wireless.android.finsky.dfe.nano.ax;
import java.util.concurrent.Semaphore;

final class C1852h implements C0660x {
    public final /* synthetic */ C1868x[] f9527a;
    public final /* synthetic */ String f9528b;
    public final /* synthetic */ Semaphore f9529c;
    public final /* synthetic */ C1849e f9530d;

    C1852h(C1849e c1849e, C1868x[] c1868xArr, String str, Semaphore semaphore) {
        this.f9530d = c1849e;
        this.f9527a = c1868xArr;
        this.f9528b = str;
        this.f9529c = semaphore;
    }

    public final /* synthetic */ void b_(Object obj) {
        this.f9530d.f9509n.mo2796a(this.f9530d.f9501f.mo1620b(), "consumePurchase", new C1853i(this, (ax) obj), r8.b);
    }
}
