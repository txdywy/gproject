package org.chromium.net.impl;

import android.content.Context;
import org.chromium.net.C7932f;
import org.chromium.net.C7935i;
import org.chromium.net.C7967l;

public class JavaCronetProvider extends C7935i {
    public JavaCronetProvider(Context context) {
        super(context);
    }

    public final C7932f mo6605a() {
        return new C7967l(new ae(this.b));
    }

    public final String mo6606b() {
        return "Fallback-Cronet-Provider";
    }

    public final String mo6607c() {
        return "64.0.3261.0";
    }

    public final boolean mo6608d() {
        return true;
    }
}
