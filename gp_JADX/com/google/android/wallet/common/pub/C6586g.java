package com.google.android.wallet.common.pub;

public final class C6586g {
    public final int f32720a;
    public final String f32721b;

    public C6586g(int i, String str) {
        if (i <= 0) {
            throw new IllegalArgumentException("SecurePaymentsData.key must be > 0");
        } else if (str == null) {
            throw new IllegalArgumentException("SecurePaymentsData.value must not be null");
        } else {
            this.f32720a = i;
            this.f32721b = str;
        }
    }
}
