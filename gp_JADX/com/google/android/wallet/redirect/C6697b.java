package com.google.android.wallet.redirect;

import android.content.Context;
import com.google.android.gms.f.a;
import com.google.android.gms.f.b;

public final class C6697b {
    public static boolean f33040a;

    public static void m30347a(Context context, b bVar) {
        if (f33040a) {
            bVar.cS_();
        } else {
            a.a(context.getApplicationContext(), new C6698c(bVar));
        }
    }
}
