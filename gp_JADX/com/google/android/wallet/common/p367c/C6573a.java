package com.google.android.wallet.common.p367c;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import com.android.volley.a.e;
import com.android.volley.a.i;
import com.android.volley.k;
import com.android.volley.r;
import com.google.android.wallet.a.a;
import com.google.android.wallet.p355a.C6489e;
import java.io.File;
import java.util.Locale;

public final class C6573a {
    public static final String f32700a = String.format(Locale.US, "unused/0 (%s %s); gzip", new Object[]{Build.DEVICE, Build.ID});
    public static r f32701b;
    public static r f32702c;

    public static synchronized void m29821a(r rVar) {
        synchronized (C6573a.class) {
            if (rVar != f32701b) {
                if (f32701b == null || rVar == null) {
                    f32701b = rVar;
                } else {
                    Log.e("WalletRequestQueue", "Trying to set request queue when one already exists");
                }
            }
        }
    }

    public static synchronized r m29820a(Context context) {
        r rVar;
        synchronized (C6573a.class) {
            if (f32701b == null) {
                rVar = new r(new i(new File(context.getCacheDir(), "wallet_im_volley_api_cache"), 1048576), C6573a.m29824c(context), 2);
                f32701b = rVar;
                rVar.a();
            }
            rVar = f32701b;
        }
        return rVar;
    }

    public static synchronized void m29823b(r rVar) {
        synchronized (C6573a.class) {
            if (rVar != f32702c) {
                if (f32702c == null || rVar == null) {
                    f32702c = rVar;
                } else {
                    Log.e("WalletRequestQueue", "Trying to set image request queue when one already exists");
                }
            }
        }
    }

    public static synchronized r m29822b(Context context) {
        r rVar;
        synchronized (C6573a.class) {
            if (f32702c == null) {
                rVar = new r(new i(new File(context.getCacheDir(), "wallet_im_volley_image_cache"), ((Integer) C6489e.f32496b.a()).intValue()), C6573a.m29824c(context), 6);
                f32702c = rVar;
                rVar.a();
            }
            rVar = f32702c;
        }
        return rVar;
    }

    private static k m29824c(Context context) {
        return new e(new com.google.android.volley.k(context, ((Boolean) a.i.a()).booleanValue()));
    }
}
