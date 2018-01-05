package android.support.p010b;

import android.content.ComponentName;
import android.net.Uri;
import android.os.RemoteException;

public final class C0039m {
    public final C0040p f54a;
    public final C0027n f55b;
    public final ComponentName f56c;

    C0039m(C0040p c0040p, C0027n c0027n, ComponentName componentName) {
        Object obj = new Object();
        this.f54a = c0040p;
        this.f55b = c0027n;
        this.f56c = componentName;
    }

    public final boolean m44a(Uri uri) {
        try {
            return this.f54a.mo15a(this.f55b, uri);
        } catch (RemoteException e) {
            return false;
        }
    }
}
