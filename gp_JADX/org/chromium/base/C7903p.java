package org.chromium.base;

import android.os.StrictMode;
import android.os.StrictMode.ThreadPolicy;
import android.os.StrictMode.VmPolicy;
import java.io.Closeable;

public final class C7903p implements Closeable {
    public final ThreadPolicy f40547a;
    public final VmPolicy f40548b;

    private C7903p(ThreadPolicy threadPolicy) {
        this.f40547a = threadPolicy;
        this.f40548b = null;
    }

    C7903p(ThreadPolicy threadPolicy, byte b) {
        this(threadPolicy);
    }

    public final void close() {
        if (this.f40547a != null) {
            StrictMode.setThreadPolicy(this.f40547a);
        }
        if (this.f40548b != null) {
            StrictMode.setVmPolicy(this.f40548b);
        }
    }
}
