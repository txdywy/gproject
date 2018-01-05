package com.google.android.gms.internal;

import android.content.Context;

public final class dr {
    public static dr f26667b = new dr();
    public dq f26668a = null;

    public final synchronized dq m24299a(Context context) {
        if (this.f26668a == null) {
            if (context.getApplicationContext() != null) {
                context = context.getApplicationContext();
            }
            this.f26668a = new dq(context);
        }
        return this.f26668a;
    }
}
