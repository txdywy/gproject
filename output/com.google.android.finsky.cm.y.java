package com.google.android.finsky.cm;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import com.google.android.finsky.ba.c;
import com.google.android.finsky.ba.e;
import com.google.android.finsky.cv.a.es;
import com.google.android.finsky.packagemanager.a;
import com.google.android.finsky.utils.FinskyLog;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.List;

final class com.google.android.finsky.cm.y implements com.google.android.finsky.cm.c
{

    public final Context a;
    public final com.google.android.finsky.packagemanager.a b;
    public final com.google.android.finsky.ba.c c;
    public final Handler d;
    public String e;
    public File f;
    public Uri g;

    y(Context p0, com.google.android.finsky.packagemanager.a p1, com.google.android.finsky.ba.c p2) {
        this.e = 0;
        this.f = 0;
        this.g = 0;
        this.a = p0;
        this.b = p1;
        this.c = p2;
        this.d = new Handler(Looper.getMainLooper());
    }

    public final int a() {
        return -1;
    }

    public final synchronized OutputStream a(String p0, String p1, long p2) {
  0:    v0 = 1;
  2:    enter this;
  3:    try {
  5:        if (this.f != 0) {
 10:            v3 = new Object[2];
 19:            v3[0] = this.f.getName();
 24:            v3[1] = this.e;
 26:            FinskyLog.e("Already streaming file %s for %s", v3);
            }
 31:        if (this.g != 0) {
 36:            v3 = new Object[2];
 41:            v3[0] = this.g;
 46:            v3[1] = this.e;
 48:            FinskyLog.e("Already tracking file %s for %s", v3);
 52:            this.f = 0;
            }
 56:        v2 = this.a.getCacheDir();
 66:        if (v2.setExecutable(1, 0)) {
 90:            try {
 94:                v3 = new File(v2, "copies");
 97:                v3.mkdirs();
106:                if (v3.setExecutable(1, 0) && v3.setReadable(1, 0)) {
                    }
                    else
137:                    v0 = 0;
116:                if (v0 == 0) {
121:                    v1 = new Object[1];
124:                    v1[0] = v3;
126:                    FinskyLog.c("Could not make readable %s", v1);
136:                    throw new IOException("Could not make destination dir readable");
                    }
141:                v1 = File.createTempFile(p0, ".apk", v3);
151:                if (!v1.setReadable(1, 0)) {
156:                    v2 = new Object[1];
159:                    v2[0] = v1;
161:                    FinskyLog.c("Could not make readable %s", v2);
164:                    v1.delete();
174:                    throw new IOException("Could not make destination file writeable");
                    }
                }
                catch (Throwable ex) {
 88:                exit this;
 89:                throw ex;
                }
180:            try {
180:                this.e = p0;
182:                this.f = v1;
                }
                catch (Throwable ex) {
 88:                exit this;
 89:                throw ex;
                }
184:            exit this;
185:            return new FileOutputStream(v1);
            }
 71:        v1 = new Object[1];
 74:        v1[0] = v2;
 76:        FinskyLog.c("Could not make executable %s", v1);
 86:        throw new IOException("Could not make cache dir executable");
        }
        catch (Throwable ex) {
 88:        exit this;
 89:        throw ex;
        }
 88:    exit this;
 89:    throw ex;
 90:    try {
 94:        v3 = new File(v2, "copies");
 97:        v3.mkdirs();
106:        if (v3.setExecutable(1, 0) && v3.setReadable(1, 0)) {
            }
            else
137:            v0 = 0;
116:        if (v0 == 0) {
121:            v1 = new Object[1];
124:            v1[0] = v3;
126:            FinskyLog.c("Could not make readable %s", v1);
136:            throw new IOException("Could not make destination dir readable");
            }
141:        v1 = File.createTempFile(p0, ".apk", v3);
151:        if (!v1.setReadable(1, 0)) {
156:            v2 = new Object[1];
159:            v2[0] = v1;
161:            FinskyLog.c("Could not make readable %s", v2);
164:            v1.delete();
174:            throw new IOException("Could not make destination file writeable");
            }
        }
        catch (Throwable ex) {
 88:        exit this;
 89:        throw ex;
        }
180:    try {
180:        this.e = p0;
182:        this.f = v1;
        }
        catch (Throwable ex) {
 88:        exit this;
 89:        throw ex;
        }
184:    exit this;
185:    return new FileOutputStream(v1);
187:    try {
187:        v1.delete();
190:        throw ex;
        }
        catch (Throwable ex) {
 88:        exit this;
 89:        throw ex;
        }
193:    try
            run 175...180
        catch (IOException ex) {
175:        goto 186;
        }
        catch (Throwable ex) {
175:        goto 87;
        }
    }

    public final void a(OutputStream p0) {
        p0.flush();
        p0.close();
    }

    public final synchronized void a(String p0) {
        enter this;
        try {
            this.c(p0);
        }
        catch (Throwable ex) {
            exit this;
            throw ex;
        }
        exit this;
    }

    public final void a(String p0, long p1, long p3) {
    }

    public final void a(String p0, long p1, String p3, int p4, int p5, com.google.android.finsky.cv.a.es p6, int p7) {
    }

    public final void a(String p0, Bitmap p1) {
    }

    public final void a(String p0, Uri p1) {
        if (this.f != 0) {
            v1 = new Object[2];
            v1[0] = this.f.getName();
            v1[1] = this.e;
            FinskyLog.e("Already streaming file %s for %s", v1);
        }
        if (this.g != 0) {
            v1 = new Object[2];
            v1[0] = this.g;
            v1[1] = this.e;
            FinskyLog.e("Already tracking file %s for %s", v1);
            this.f = 0;
        }
        this.e = p0;
        this.g = p1;
    }

    public final void a(String p0, String p1) {
    }

    public final void a(String p0, String p1, int p2, int p3, com.google.android.finsky.cv.a.es p4, int p5) {
    }

    public final void a(String p0, String p1, int p2, com.google.android.finsky.cv.a.es p3) {
    }

    public final void a(String p0, boolean p1) {
        this.b.a(p0, p1, 0);
    }

    public final synchronized void a(String p0, boolean p1, com.google.android.finsky.cm.d p2) {
  0:    enter this;
  3:    if (this.f == 0) goto 28;
  7:    v1 = Uri.fromFile(this.f);
 23:    this.b.a(v1, -1, 0, new com.google.android.finsky.cm.aa(this, p2, p0), p1, p0);
 26:    exit this;
 27:    return;
 30:    if (this.g == 0) goto 35;
 32:    v1 = this.g;
 34:    goto 11;
 48:    if (!this.c.dj().a(12642050)) goto 64;
 57:    this.d.post(new com.google.android.finsky.cm.z(this, p0, p2));
 60:    goto 26;
 62:    exit this;
 63:    throw ex;
 64:    try {
 71:        throw new IllegalStateException("No file or URI to install from");
        }
        catch (Throwable ex) {
 62:        exit this;
 63:        throw ex;
        }
 73:    try
            run 28...60
        catch (Throwable ex) {
 28:        goto 61;
        }
 74:    try
            run 1...26
        catch (Throwable ex) {
  1:        goto 61;
        }
    }

    public final void a(List p0) {
    }

    public final boolean a(boolean p0) {
        return p0;
    }

    public final void b(String p0) {
        this.c(p0);
    }

    final void c(String p0) {
        if (p0.equals(this.e)) {
            if (this.f != 0) {
                this.f.delete();
                this.f = 0;
            }
            if (this.g != 0)
                this.g = 0;
            this.e = 0;
        }
    }

}
