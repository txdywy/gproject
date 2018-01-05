package com.google.android.finsky.instantapps.install;

import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import org.chromium.net.e;
import p002a.C0002a;

final class C3523z {
    public final boolean f17771a;
    public final C0002a f17772b;

    C3523z(boolean z, C0002a c0002a) {
        this.f17771a = z;
        this.f17772b = c0002a;
    }

    final InputStream m17100a(String str) {
        if (this.f17771a) {
            return ((HttpURLConnection) ((e) this.f17772b.mo1a()).a(new URL(str))).getInputStream();
        }
        return new URL(str).openStream();
    }
}
