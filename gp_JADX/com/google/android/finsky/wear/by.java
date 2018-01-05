package com.google.android.finsky.wear;

import android.net.Uri;
import com.google.android.gms.common.api.C5058o;
import com.google.android.gms.wearable.C5652n;

final class by implements Runnable {
    public final /* synthetic */ C5058o f24916a;
    public final /* synthetic */ Uri f24917b;
    public final /* synthetic */ String f24918c;
    public final /* synthetic */ String f24919d;
    public final /* synthetic */ WearSupportService f24920e;

    by(WearSupportService wearSupportService, C5058o c5058o, Uri uri, String str, String str2) {
        this.f24920e = wearSupportService;
        this.f24916a = c5058o;
        this.f24917b = uri;
        this.f24918c = str;
        this.f24919d = str2;
    }

    public final void run() {
        this.f24920e.f24760g = this.f24920e.f24760g - 1;
        this.f24920e.f24759f = this.f24920e.f24759f + 1;
        C5652n.f28708a.mo5115a(this.f24916a, this.f24917b).mo4490a(new bz(this));
    }
}
