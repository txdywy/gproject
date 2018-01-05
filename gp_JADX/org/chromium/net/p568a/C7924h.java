package org.chromium.net.p568a;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.ByteBuffer;
import org.chromium.net.CronetException;
import org.chromium.net.au;
import org.chromium.net.aw;
import org.chromium.net.ay;

final class C7924h extends aw {
    public final /* synthetic */ C7923g f40640a;

    public C7924h(C7923g c7923g) {
        this.f40640a = c7923g;
    }

    public final void mo6580a(au auVar, ay ayVar) {
        this.f40640a.f40634g = ayVar;
        this.f40640a.f40637j = true;
        this.f40640a.f40629b.f40646b = false;
    }

    public final void mo6582a(au auVar, ay ayVar, ByteBuffer byteBuffer) {
        this.f40640a.f40634g = ayVar;
        this.f40640a.f40629b.f40646b = false;
    }

    public final void mo6581a(au auVar, ay ayVar, String str) {
        this.f40640a.f40636i = true;
        try {
            URL url = new URL(str);
            boolean equals = url.getProtocol().equals(this.f40640a.url.getProtocol());
            if (this.f40640a.instanceFollowRedirects) {
                this.f40640a.url = url;
            }
            if (this.f40640a.instanceFollowRedirects && equals) {
                this.f40640a.f40630c.mo6598b();
                return;
            }
        } catch (MalformedURLException e) {
        }
        this.f40640a.f40634g = ayVar;
        this.f40640a.f40630c.mo6599c();
        m37916a(null);
    }

    public final void mo6584b(au auVar, ay ayVar) {
        this.f40640a.f40634g = ayVar;
        m37916a(null);
    }

    public final void mo6583a(au auVar, ay ayVar, CronetException cronetException) {
        if (cronetException == null) {
            throw new IllegalStateException("Exception cannot be null in onFailed.");
        }
        this.f40640a.f40634g = ayVar;
        m37916a(cronetException);
    }

    public final void mo6585c(au auVar, ay ayVar) {
        this.f40640a.f40634g = ayVar;
        m37916a(new IOException("disconnect() called"));
    }

    private final void m37916a(IOException iOException) {
        this.f40640a.f40635h = iOException;
        if (this.f40640a.f40632e != null) {
            C7925i c7925i = this.f40640a.f40632e;
            c7925i.f40644d = iOException;
            c7925i.f40642b = true;
            c7925i.f40643c = null;
        }
        if (this.f40640a.f40633f != null) {
            C7916j c7916j = this.f40640a.f40633f;
            c7916j.f40608g = iOException;
            c7916j.f40610i = true;
        }
        this.f40640a.f40637j = true;
        this.f40640a.f40629b.f40646b = false;
    }
}
