package com.google.android.finsky.instantapps.install;

import android.content.Context;
import android.net.Uri;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.gms.instantapps.p288b.C5262b;
import com.google.android.instantapps.common.p217e.bf;
import com.google.compression.brotli.dec.b;
import java.io.IOException;
import java.io.InputStream;

final class C3499a {
    public final boolean f17703a;
    public final Context f17704b;
    public final bf f17705c;
    public final C3523z f17706d;

    public C3499a(boolean z, Context context, bf bfVar, C3523z c3523z) {
        this.f17703a = z;
        this.f17704b = context;
        this.f17705c = bfVar;
        this.f17706d = c3523z;
    }

    final InputStream m17066a(Uri uri) {
        int i = 1;
        String uri2 = uri.toString();
        if (this.f17703a) {
            try {
                return this.f17704b.getContentResolver().openInputStream(C5262b.f26393a.buildUpon().appendPath("downloadAtom").appendQueryParameter("atomDownloadUrl", uri2).build());
            } catch (IOException e) {
                FinskyLog.m21665c("Falling back to prod backend for: %s", uri2);
            }
        }
        String str = (String) this.f17705c.mo5158a();
        if (!("playatoms.googleusercontent.com".equals(uri.getAuthority()) && str.startsWith("/brotli"))) {
            i = 0;
        }
        if (i == 0) {
            return this.f17706d.m17100a(uri2);
        }
        C3523z c3523z = this.f17706d;
        uri2 = String.valueOf(uri2);
        str = String.valueOf(str);
        return new b(c3523z.m17100a(str.length() != 0 ? uri2.concat(str) : new String(uri2)));
    }
}
