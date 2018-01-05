package org.chromium.net.impl;

import android.content.Context;
import org.chromium.net.C7938k;

public class br extends C7942e {
    public br(Context context) {
        super(context);
    }

    public final C7938k mo6614a() {
        if (this.f40761e == null) {
            this.f40761e = bz.m38131a(this.f40757a);
        }
        C7938k cronetUrlRequestContext = new CronetUrlRequestContext(this);
        this.n = 0;
        return cronetUrlRequestContext;
    }
}
