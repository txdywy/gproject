package com.google.android.instantapps.common.loading.ui;

import com.google.android.instantapps.common.loading.C5814k;
import com.google.android.instantapps.common.p217e.bf;

public final class C5839y {
    public static final int[] f29315a = new int[]{C5814k.loading_embedded_opt_in_positive_1, C5814k.loading_embedded_opt_in_positive_2, C5814k.loading_embedded_opt_in_positive_3, C5814k.loading_embedded_opt_in_positive_4};
    public static final int[] f29316b = new int[]{C5814k.loading_embedded_opt_in_negative_1, C5814k.loading_embedded_opt_in_negative_2, C5814k.loading_embedded_opt_in_negative_3, C5814k.loading_embedded_opt_in_negative_4};
    public int f29317c = -1;
    public int f29318d = -1;
    public final bf f29319e;
    public final bf f29320f;

    public C5839y(bf bfVar, bf bfVar2) {
        this.f29319e = bfVar;
        this.f29320f = bfVar2;
    }

    final void m27264a() {
        int intValue;
        if (this.f29317c == -1) {
            intValue = ((Integer) this.f29319e.mo5158a()).intValue();
            if (intValue < 0 || intValue >= f29315a.length) {
                this.f29317c = C5814k.loading_embedded_opt_in_accept_and_open;
            } else {
                this.f29317c = f29315a[intValue];
            }
        }
        if (this.f29318d == -1) {
            intValue = ((Integer) this.f29320f.mo5158a()).intValue();
            if (intValue < 0 || intValue >= f29316b.length) {
                this.f29318d = C5814k.loading_embedded_opt_in_open_in_browser;
            } else {
                this.f29318d = f29316b[intValue];
            }
        }
    }
}
