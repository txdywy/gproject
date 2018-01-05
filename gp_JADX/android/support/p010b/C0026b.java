package android.support.p010b;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.RemoteException;
import android.text.TextUtils;

public class C0026b {
    public final C0040p f41a;
    public final ComponentName f42b;

    C0026b(C0040p c0040p, ComponentName componentName) {
        this.f41a = c0040p;
        this.f42b = componentName;
    }

    public static boolean m26a(Context context, String str, C0037k c0037k) {
        Intent intent = new Intent("android.support.customtabs.action.CustomTabsService");
        if (!TextUtils.isEmpty(str)) {
            intent.setPackage(str);
        }
        return context.bindService(intent, c0037k, 33);
    }

    public final boolean m28a() {
        try {
            return this.f41a.mo13a();
        } catch (RemoteException e) {
            return false;
        }
    }

    public final C0039m m27a(C0025a c0025a) {
        C0027n c0029c = new C0029c(c0025a);
        try {
            if (this.f41a.mo14a(c0029c)) {
                return new C0039m(this.f41a, c0029c, this.f42b);
            }
            return null;
        } catch (RemoteException e) {
            return null;
        }
    }
}
