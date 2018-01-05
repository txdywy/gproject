package android.support.p010b;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;

public abstract class C0037k implements ServiceConnection {
    public abstract void m43a(C0026b c0026b);

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        C0040p c0040p;
        if (iBinder == null) {
            c0040p = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("android.support.customtabs.ICustomTabsService");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof C0040p)) {
                c0040p = new C0041q(iBinder);
            } else {
                c0040p = (C0040p) queryLocalInterface;
            }
        }
        m43a(new C0038l(c0040p, componentName));
    }
}
