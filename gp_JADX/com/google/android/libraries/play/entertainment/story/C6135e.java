package com.google.android.libraries.play.entertainment.story;

import android.net.Uri;
import com.google.android.libraries.play.entertainment.p192l.C6099d;
import com.google.android.libraries.play.entertainment.p344d.C6049s;
import com.google.android.libraries.play.entertainment.p351m.C6118d;
import com.google.android.play.article.C6250h;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;

final class C6135e extends C6049s {
    public final /* synthetic */ C6250h f30484a;
    public final /* synthetic */ Uri f30485b;
    public final /* synthetic */ C6132c f30486c;

    C6135e(C6132c c6132c, C6250h c6250h, Uri uri) {
        this.f30486c = c6132c;
        this.f30484a = c6250h;
        this.f30485b = uri;
    }

    public final void mo5268a(Throwable th) {
        this.f30484a.mo5359a();
    }

    public final void mo5323c() {
        C6132c.f30477a.m28054a("Canceled load of uri: %s", this.f30485b);
    }

    public final /* synthetic */ void mo5267a(Object obj) {
        C6099d c6099d = (C6099d) obj;
        C6132c.f30477a.m28054a("Observed server latency: %d", Long.valueOf(System.currentTimeMillis() - this.f30486c.f30478b));
        Closeable b = c6099d.mo5292b();
        try {
            this.f30484a.mo5360a(C6118d.m28109a((InputStream) b));
        } catch (IOException e) {
            C6132c.f30477a.m28054a("Error decoding blob response: %s", e.getMessage());
            this.f30484a.mo5359a();
        } finally {
            C6118d.m28110a(b);
        }
    }
}
