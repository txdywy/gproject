package com.google.android.gms.common;

import java.lang.ref.WeakReference;

abstract class C5141o extends C5139m {
    public static final WeakReference f26085c = new WeakReference(null);
    public WeakReference f26086b = f26085c;

    C5141o(byte[] bArr) {
        super(bArr);
    }

    final byte[] mo4627c() {
        byte[] bArr;
        synchronized (this) {
            bArr = (byte[]) this.f26086b.get();
            if (bArr == null) {
                bArr = mo4628d();
                this.f26086b = new WeakReference(bArr);
            }
        }
        return bArr;
    }

    protected abstract byte[] mo4628d();
}
