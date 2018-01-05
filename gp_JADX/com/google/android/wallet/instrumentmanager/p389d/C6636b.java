package com.google.android.wallet.instrumentmanager.p389d;

import com.android.volley.n;
import com.android.volley.r;
import com.android.volley.s;
import com.google.android.wallet.common.p374d.C6532b;
import com.google.android.wallet.common.p377b.p379b.C6567a;
import com.google.android.wallet.common.util.C6614z;

public final class C6636b implements C6614z {
    public final byte[] f32806a;
    public final /* synthetic */ C6635a f32807b;

    public C6636b(C6635a c6635a, byte[] bArr) {
        this.f32807b = c6635a;
        this.f32806a = bArr;
    }

    public final void mo5542a(int i) {
        int i2;
        if (i != 1) {
            C6532b c6532b = this.f32807b;
            Object obj = C6635a.f32805i;
            r rVar = c6532b.f32601c;
            if (obj == null) {
                throw new IllegalArgumentException("Cannot cancelAll with a null tag");
            }
            rVar.a(new s(obj));
            if (c6532b.f32600b != null) {
                for (int size = c6532b.f32600b.size() - 1; size >= 0; size--) {
                    n nVar = (n) c6532b.f32600b.get(size);
                    if (nVar != null && obj.equals(nVar.o)) {
                        c6532b.f32600b.remove(size);
                    }
                }
            }
            this.f32807b.m29649b(3, 1000);
        }
        switch (i) {
            case 1:
                i2 = 0;
                break;
            case 3:
                i2 = 30;
                break;
            case 4:
                i2 = 31;
                break;
            case 5:
                i2 = 32;
                break;
            default:
                i2 = 4;
                break;
        }
        C6567a.m29807b(771, i2, this.f32806a);
    }
}
