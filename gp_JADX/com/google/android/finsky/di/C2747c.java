package com.google.android.finsky.di;

import com.google.android.finsky.utils.C4679j;
import com.google.android.finsky.utils.C4692x;
import com.google.android.finsky.utils.FinskyLog;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

final class C2747c {
    public final File f14981a;

    public C2747c(File file) {
        this.f14981a = file;
    }

    final boolean m14800a(String str, String str2, InputStream inputStream) {
        boolean z = true;
        Closeable a = C2754j.m14809a(new File(this.f14981a, C2747c.m14798b(str, str2)));
        if (a != null) {
            try {
                C4692x.m21843a(inputStream, a);
            } catch (IOException e) {
                z = "IOException when caching split %s for package %s";
                FinskyLog.m21665c(z, str2, str);
            } finally {
                C4679j.m21814a(inputStream);
                C4679j.m21814a(a);
            }
            return z;
        }
        C4679j.m21814a(inputStream);
        C4679j.m21814a(a);
        return false;
    }

    final InputStream m14799a(String str, String str2) {
        return C2754j.m14810b(new File(this.f14981a, C2747c.m14798b(str, str2)));
    }

    static String m14798b(String str, String str2) {
        return new StringBuilder((String.valueOf(str).length() + 5) + String.valueOf(str2).length()).append(str).append("_").append(str2).append(".apk").toString();
    }
}
