package com.google.android.finsky.inlinedetails;

import android.content.Intent;

public final class C3254j {
    public final boolean f16769a;
    public final boolean f16770b;
    public final String f16771c;
    public final Intent f16772d;

    public C3254j(boolean z, boolean z2, String str, Intent intent) {
        this.f16769a = z;
        this.f16770b = z2;
        this.f16771c = str;
        this.f16772d = intent == null ? null : new Intent(intent);
    }

    public final Intent m16368a() {
        return this.f16772d == null ? null : new Intent(this.f16772d);
    }
}
