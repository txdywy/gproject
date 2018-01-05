package com.google.android.finsky.dc.p181a;

import android.content.Context;
import android.net.Uri;
import com.google.android.finsky.ba.C1552e;
import com.google.android.finsky.dk.C2830g;
import com.google.android.finsky.download.C2850m;
import com.google.android.finsky.installer.C3322j;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p140i.C3219f;

public final class C2539a extends C2538b {
    public C2539a(Context context, C2850m c2850m, C1552e c1552e, C2495w c2495w, C3219f c3219f, C3322j c3322j, C2546i c2546i, C2830g c2830g) {
        super(context, c2850m, c1552e, c2495w, c3219f, null, c3322j, c2546i);
    }

    protected final synchronized boolean mo2937a() {
        return true;
    }

    protected final synchronized String mo2938b() {
        return this.h.f;
    }

    protected final synchronized Uri mo2936a(Uri uri) {
        return uri;
    }
}
