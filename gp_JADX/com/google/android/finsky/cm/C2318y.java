package com.google.android.finsky.cm;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import com.google.android.finsky.ba.C1461c;
import com.google.android.finsky.cv.p177a.es;
import com.google.android.finsky.packagemanager.C3849a;
import com.google.android.finsky.utils.FinskyLog;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.List;

public final class C2318y implements C2296c {
    public final Context f11398a;
    public final C3849a f11399b;
    public final C1461c f11400c;
    public final Handler f11401d;
    public String f11402e = null;
    public File f11403f = null;
    public Uri f11404g = null;

    public C2318y(Context context, C3849a c3849a, C1461c c1461c) {
        this.f11398a = context;
        this.f11399b = c3849a;
        this.f11400c = c1461c;
        this.f11401d = new Handler(Looper.getMainLooper());
    }

    public final void mo2843a(String str, long j, String str2, int i, int i2, es esVar, int i3) {
    }

    public final void mo2848a(String str, String str2, int i, es esVar) {
    }

    public final void mo2847a(String str, String str2, int i, int i2, es esVar, int i3) {
    }

    public final synchronized void mo2841a(String str) {
        m11865c(str);
    }

    public final void mo2851a(List list) {
    }

    public final void mo2842a(String str, long j, long j2) {
    }

    public final int mo2838a() {
        return -1;
    }

    public final void mo2844a(String str, Bitmap bitmap) {
    }

    public final boolean mo2852a(boolean z) {
        return z;
    }

    public final synchronized OutputStream mo2839a(String str, String str2, long j) {
        OutputStream fileOutputStream;
        Object obj = 1;
        synchronized (this) {
            if (this.f11403f != null) {
                FinskyLog.m21669e("Already streaming file %s for %s", this.f11403f.getName(), this.f11402e);
            }
            if (this.f11404g != null) {
                FinskyLog.m21669e("Already tracking file %s for %s", this.f11404g, this.f11402e);
                this.f11403f = null;
            }
            File cacheDir = this.f11398a.getCacheDir();
            if (cacheDir.setExecutable(true, false)) {
                File file = new File(cacheDir, "copies");
                file.mkdirs();
                if (!(file.setExecutable(true, false) && file.setReadable(true, false))) {
                    obj = null;
                }
                if (obj == null) {
                    FinskyLog.m21665c("Could not make readable %s", file);
                    throw new IOException("Could not make destination dir readable");
                }
                File createTempFile = File.createTempFile(str, ".apk", file);
                if (createTempFile.setReadable(true, false)) {
                    try {
                        fileOutputStream = new FileOutputStream(createTempFile);
                        this.f11402e = str;
                        this.f11403f = createTempFile;
                    } catch (IOException e) {
                        createTempFile.delete();
                        throw e;
                    }
                }
                FinskyLog.m21665c("Could not make readable %s", createTempFile);
                createTempFile.delete();
                throw new IOException("Could not make destination file writeable");
            }
            FinskyLog.m21665c("Could not make executable %s", cacheDir);
            throw new IOException("Could not make cache dir executable");
        }
        return fileOutputStream;
    }

    public final void mo2840a(OutputStream outputStream) {
        outputStream.flush();
        outputStream.close();
    }

    public final void mo2853b(String str) {
        m11865c(str);
    }

    public final void mo2845a(String str, Uri uri) {
        if (this.f11403f != null) {
            FinskyLog.m21669e("Already streaming file %s for %s", this.f11403f.getName(), this.f11402e);
        }
        if (this.f11404g != null) {
            FinskyLog.m21669e("Already tracking file %s for %s", this.f11404g, this.f11402e);
            this.f11403f = null;
        }
        this.f11402e = str;
        this.f11404g = uri;
    }

    public final synchronized void mo2850a(String str, boolean z, C2297d c2297d) {
        Uri fromFile;
        if (this.f11403f != null) {
            fromFile = Uri.fromFile(this.f11403f);
        } else if (this.f11404g != null) {
            fromFile = this.f11404g;
        } else if (this.f11400c.dj().mo2294a(12642050)) {
            this.f11401d.post(new C2319z(this, str, c2297d));
        } else {
            throw new IllegalStateException("No file or URI to install from");
        }
        this.f11399b.mo3822a(fromFile, -1, null, new aa(this, c2297d, str), z, str);
    }

    final void m11865c(String str) {
        if (str.equals(this.f11402e)) {
            if (this.f11403f != null) {
                this.f11403f.delete();
                this.f11403f = null;
            }
            if (this.f11404g != null) {
                this.f11404g = null;
            }
            this.f11402e = null;
        }
    }

    public final void mo2849a(String str, boolean z) {
        this.f11399b.mo3824a(str, z, null);
    }

    public final void mo2846a(String str, String str2) {
    }
}
