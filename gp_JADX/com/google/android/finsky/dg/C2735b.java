package com.google.android.finsky.dg;

import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;

final class C2735b extends ContentObserver {
    public final /* synthetic */ C2734a f14966a;

    C2735b(C2734a c2734a, Handler handler) {
        this.f14966a = c2734a;
        super(handler);
    }

    public final void onChange(boolean z, Uri uri) {
        super.onChange(z, uri);
        if (this.f14966a.m14775a()) {
            C2734a c2734a = this.f14966a;
            Set<C2736i> newSetFromMap = Collections.newSetFromMap(new IdentityHashMap(c2734a.f14958a.size()));
            newSetFromMap.addAll(c2734a.f14958a);
            for (C2736i c2736i : newSetFromMap) {
                c2734a.m14779c(c2736i);
                c2734a.m14776b(c2736i);
            }
        }
    }
}
