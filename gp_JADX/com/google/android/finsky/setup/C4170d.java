package com.google.android.finsky.setup;

import android.net.Uri;
import java.util.TimerTask;

final class C4170d extends TimerTask {
    public final /* synthetic */ Uri f21055a;
    public final /* synthetic */ C4141c f21056b;

    C4170d(C4141c c4141c, Uri uri) {
        this.f21056b = c4141c;
        this.f21055a = uri;
    }

    public final void run() {
        this.f21056b.f20908h.post(new C4172e(this, this.f21055a));
    }
}
