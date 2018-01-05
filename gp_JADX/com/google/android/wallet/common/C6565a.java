package com.google.android.wallet.common;

import java.util.ArrayList;

public final class C6565a {
    public final ArrayList[] f32684a = new ArrayList[2];

    public C6565a() {
        for (int i = 0; i < 2; i++) {
            this.f32684a[i] = new ArrayList();
        }
    }

    public final boolean m29797a(int i) {
        return this.f32684a[0].contains(Integer.valueOf(i));
    }
}
