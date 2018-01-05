package com.google.android.gms.p155f;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.common.C5095d;
import com.google.android.gms.common.C5105f;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.internal.am;
import java.lang.reflect.Method;

public final class C5186a {
    public static final Object f26125a = new Object();
    public static Method f26126b = null;

    public static void m23946a(Context context) {
        am.m23734a((Object) context, (Object) "Context must not be null");
        C5095d.m23662b(context);
        Context h = C5105f.m23698h(context);
        if (h == null) {
            Log.e("ProviderInstaller", "Failed to get remote context");
            throw new GooglePlayServicesNotAvailableException(8);
        }
        synchronized (f26125a) {
            try {
                if (f26126b == null) {
                    f26126b = h.getClassLoader().loadClass("com.google.android.gms.common.security.ProviderInstallerImpl").getMethod("insertProvider", new Class[]{Context.class});
                }
                f26126b.invoke(null, new Object[]{h});
            } catch (Exception e) {
                String str = "ProviderInstaller";
                String str2 = "Failed to install provider: ";
                String valueOf = String.valueOf(e.getMessage());
                Log.e(str, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
                throw new GooglePlayServicesNotAvailableException(8);
            }
        }
    }

    public static void m23947a(Context context, C1693b c1693b) {
        am.m23734a((Object) context, (Object) "Context must not be null");
        am.m23734a((Object) c1693b, (Object) "Listener must not be null");
        am.m23741b("Must be called on the UI thread");
        new C5187c(context, c1693b).execute(new Void[0]);
    }
}
