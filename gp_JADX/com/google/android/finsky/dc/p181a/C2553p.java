package com.google.android.finsky.dc.p181a;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.finsky.aa.C0955b;
import com.google.android.finsky.ba.C1552e;
import com.google.android.finsky.dk.C2830g;
import com.google.android.finsky.download.C2850m;
import com.google.android.finsky.installer.C3322j;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p140i.C3219f;
import com.google.android.finsky.utils.C4679j;
import com.google.android.finsky.utils.C4688t;
import com.google.android.finsky.utils.C4689u;
import com.google.android.finsky.utils.C4690v;
import com.google.android.finsky.utils.FinskyLog;
import com.google.archivepatcher.applier.a.b;
import com.google.wireless.android.finsky.b.d;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.RandomAccessFile;
import java.util.zip.GZIPInputStream;

public final class C2553p extends C2538b {
    public C2553p(Context context, C2850m c2850m, C1552e c1552e, C2495w c2495w, C3219f c3219f, C2538b c2538b, C3322j c3322j, C2546i c2546i, C2830g c2830g) {
        super(context, c2850m, c1552e, c2495w, c3219f, c2538b, c3322j, c2546i);
    }

    protected final void mo2942d() {
        super.mo2942d();
        this.k.c(true);
        if (this.h.q != null) {
            this.k.c(this.h.q.f);
            if (m13531f()) {
                this.k.b(true);
            }
        }
    }

    protected final synchronized boolean mo2937a() {
        boolean z;
        Closeable fileInputStream;
        Throwable e;
        Closeable closeable;
        d dVar = this.h.q;
        if (dVar != null) {
            switch (dVar.f) {
                case 3:
                    int i = dVar.b;
                    int i2 = this.i;
                    if (i2 != i) {
                        m13527a(i2 > 0 ? "wrong-base-app-installed" : "no-base-app-installed", null);
                        FinskyLog.m21665c("Cannot patch %s, need version %d but has %d", this.g, Integer.valueOf(i), Integer.valueOf(i2));
                        z = false;
                    } else {
                        File e2 = m13530e();
                        if (e2 == null) {
                            m13527a("base-app-dirs-mismatch", null);
                            FinskyLog.m21665c("Cannot patch %s, existing version is %d", this.g, Integer.valueOf(i2));
                            z = false;
                        } else if (e2.exists()) {
                            try {
                                fileInputStream = new FileInputStream(e2);
                                try {
                                    if (dVar.d.equals(C4688t.m21837a(fileInputStream, "SHA-1").f24073c)) {
                                        C4679j.m21814a(fileInputStream);
                                        if (C2830g.m14970d() < (((long) ((Integer) C0955b.bb.m28964b()).intValue()) * this.l) / 100) {
                                            m13527a("free-space", null);
                                            FinskyLog.m21665c("Cannot patch %s, need %d, free %d", this.g, Long.valueOf(r6), Long.valueOf(r4));
                                            z = false;
                                        } else {
                                            z = true;
                                        }
                                    } else {
                                        m13527a("base-file-signature", null);
                                        FinskyLog.m21665c("Cannot patch %s, bad hash, expect %s actual %s", this.g, dVar.d, r4.f24073c);
                                        C4679j.m21814a(fileInputStream);
                                        z = false;
                                    }
                                } catch (FileNotFoundException e3) {
                                    e = e3;
                                    closeable = fileInputStream;
                                    try {
                                        m13527a("base-file-FileNotFoundException", e);
                                        FinskyLog.m21665c("Cannot patch %s, FileNotFoundException, %s", this.g, e2);
                                        C4679j.m21814a(closeable);
                                        z = false;
                                        return z;
                                    } catch (Throwable th) {
                                        e = th;
                                        fileInputStream = closeable;
                                        C4679j.m21814a(fileInputStream);
                                        throw e;
                                    }
                                } catch (IOException e4) {
                                    e = e4;
                                    try {
                                        m13527a("base-file-otherexception", e);
                                        FinskyLog.m21665c("Cannot patch %s, unexpected exception %s", this.g, e);
                                        C4679j.m21814a(fileInputStream);
                                        z = false;
                                        return z;
                                    } catch (Throwable th2) {
                                        e = th2;
                                        C4679j.m21814a(fileInputStream);
                                        throw e;
                                    }
                                }
                            } catch (FileNotFoundException e5) {
                                e = e5;
                                closeable = null;
                                m13527a("base-file-FileNotFoundException", e);
                                FinskyLog.m21665c("Cannot patch %s, FileNotFoundException, %s", this.g, e2);
                                C4679j.m21814a(closeable);
                                z = false;
                                return z;
                            } catch (IOException e6) {
                                e = e6;
                                fileInputStream = null;
                                m13527a("base-file-otherexception", e);
                                FinskyLog.m21665c("Cannot patch %s, unexpected exception %s", this.g, e);
                                C4679j.m21814a(fileInputStream);
                                z = false;
                                return z;
                            } catch (Throwable th3) {
                                e = th3;
                                fileInputStream = null;
                                C4679j.m21814a(fileInputStream);
                                throw e;
                            }
                        } else {
                            m13527a("base-file-exists", null);
                            FinskyLog.m21665c("Cannot patch %s, file does not exist %s", this.g, e2);
                            z = false;
                        }
                    }
                default:
                    m13527a("unsupported-patch-format", null);
                    FinskyLog.m21665c("Can't download patch %s because format (%d) is unsupported", this.g, Integer.valueOf(dVar.f));
                    z = false;
                    break;
            }
        }
        z = false;
        return z;
    }

    protected final String mo2938b() {
        return this.h.q.e;
    }

    protected final synchronized Uri mo2936a(Uri uri) {
        Closeable b;
        Closeable fileOutputStream;
        Throwable th;
        Closeable closeable;
        Throwable th2;
        int i = 0;
        Uri uri2 = null;
        synchronized (this) {
            try {
                Closeable randomAccessFile = new RandomAccessFile(m13530e(), "r");
                try {
                    b = m13529b(uri);
                    if (b == null) {
                        C4679j.m21814a(randomAccessFile);
                        C4679j.m21814a(b);
                        C4679j.m21814a(null);
                    } else {
                        try {
                            File g = m13532g();
                            try {
                                fileOutputStream = new FileOutputStream(g);
                            } catch (IOException e) {
                                g.delete();
                                C4679j.m21814a(randomAccessFile);
                                C4679j.m21814a(b);
                                C4679j.m21814a(null);
                            } catch (Throwable th3) {
                                fileOutputStream = b;
                                b = randomAccessFile;
                                th = th3;
                                closeable = null;
                                th2 = th;
                                C4679j.m21814a(b);
                                C4679j.m21814a(fileOutputStream);
                                C4679j.m21814a(closeable);
                                throw th2;
                            }
                            try {
                                OutputStream a = C4690v.m21840a(fileOutputStream, this.l);
                                if (m13528a(uri, randomAccessFile, b, a)) {
                                    C4689u a2 = a.m21841a();
                                    fileOutputStream.flush();
                                    fileOutputStream.close();
                                    this.b.mo3179c(uri);
                                    if (a2 != null) {
                                        if (a2 == null) {
                                            FinskyLog.m21667d("No digestResult for %s", this.g);
                                            i = 961;
                                        } else if (this.l != a2.f24071a) {
                                            FinskyLog.m21667d("Signature check of %s failed, size expected=%d actual=%d", this.g, Long.valueOf(this.l), Long.valueOf(a2.f24071a));
                                            i = 919;
                                        } else if (!this.m.equals(a2.f24073c)) {
                                            FinskyLog.m21667d("Signature check of %s failed, hash expected=%s actual=%s", this.g, this.m, a2.f24073c);
                                            i = 960;
                                        }
                                        if (i != 0) {
                                            m13526a("gdiff-verification", i, null);
                                            g.delete();
                                            C4679j.m21814a(randomAccessFile);
                                            C4679j.m21814a(b);
                                            C4679j.m21814a(fileOutputStream);
                                        }
                                    }
                                    uri2 = Uri.fromFile(g);
                                    C4679j.m21814a(randomAccessFile);
                                    C4679j.m21814a(b);
                                    C4679j.m21814a(fileOutputStream);
                                } else {
                                    g.delete();
                                    C4679j.m21814a(randomAccessFile);
                                    C4679j.m21814a(b);
                                    C4679j.m21814a(fileOutputStream);
                                }
                            } catch (Throwable th32) {
                                m13503a(127, "finish-IOException", 963, th32);
                                FinskyLog.m21665c("IOException while finishing %s: %s", this.g, th32);
                                g.delete();
                                C4679j.m21814a(randomAccessFile);
                                C4679j.m21814a(b);
                                C4679j.m21814a(fileOutputStream);
                            } catch (Throwable th4) {
                                th2 = th4;
                                closeable = fileOutputStream;
                                fileOutputStream = b;
                                b = randomAccessFile;
                                C4679j.m21814a(b);
                                C4679j.m21814a(fileOutputStream);
                                C4679j.m21814a(closeable);
                                throw th2;
                            }
                        } catch (IOException e2) {
                            C4679j.m21814a(randomAccessFile);
                            C4679j.m21814a(b);
                            C4679j.m21814a(null);
                        }
                    }
                } catch (Throwable th322) {
                    fileOutputStream = null;
                    b = randomAccessFile;
                    th = th322;
                    closeable = null;
                    th2 = th;
                    C4679j.m21814a(b);
                    C4679j.m21814a(fileOutputStream);
                    C4679j.m21814a(closeable);
                    throw th2;
                }
            } catch (Throwable th3222) {
                m13526a("source-FileNotFoundException", 0, th3222);
                FinskyLog.m21665c("FileNotFoundException %s", uri);
                C4679j.m21814a(null);
                C4679j.m21814a(null);
                C4679j.m21814a(null);
            } catch (Throwable th32222) {
                fileOutputStream = null;
                b = null;
                th = th32222;
                closeable = null;
                th2 = th;
                C4679j.m21814a(b);
                C4679j.m21814a(fileOutputStream);
                C4679j.m21814a(closeable);
                throw th2;
            }
        }
        return uri2;
    }

    private final boolean m13528a(Uri uri, RandomAccessFile randomAccessFile, InputStream inputStream, OutputStream outputStream) {
        try {
            switch (this.h.q.f) {
                case 3:
                    b.a(randomAccessFile, outputStream, inputStream, Long.valueOf(this.l));
                    break;
            }
            FinskyLog.m21659a("Patched %s (format %s) from %d to %d", this.g, Integer.valueOf(this.h.q.f), Integer.valueOf(this.i), Integer.valueOf(this.j));
            return true;
        } catch (Throwable e) {
            String type = this.a.getContentResolver().getType(Uri.parse(uri.toString().replaceFirst("my_downloads", "public_downloads")));
            m13526a("applyPatch-FileFormatException", 0, e);
            FinskyLog.m21665c("Patch %s (content-type '%s') is invalid", this.g, type);
            return false;
        } catch (Throwable e2) {
            m13526a("applyPatch-IOException", 0, e2);
            FinskyLog.m21665c("Patch %s failed with exception %s", this.g, e2);
            return false;
        } catch (Throwable e22) {
            m13526a("applyPatch-Exception", 0, e22);
            FinskyLog.m21665c("Patch %s failed with exception %s", this.g, e22);
            return false;
        }
    }

    private final File m13530e() {
        try {
            ApplicationInfo applicationInfo = this.a.getPackageManager().getApplicationInfo(this.g, 0);
            String str = applicationInfo.sourceDir;
            String str2 = applicationInfo.publicSourceDir;
            if (TextUtils.isEmpty(str) || !str.equals(str2)) {
                return null;
            }
            return new File(str);
        } catch (NameNotFoundException e) {
            return null;
        }
    }

    private final InputStream m13529b(Uri uri) {
        try {
            InputStream openInputStream = this.a.getContentResolver().openInputStream(uri);
            if (m13531f()) {
                return new GZIPInputStream(openInputStream, 8192);
            }
            return openInputStream;
        } catch (Throwable e) {
            FinskyLog.m21665c("FileNotFoundException %s %s", uri, e.getMessage());
            m13526a("patch-FileNotFoundException", 0, e);
            return null;
        } catch (Throwable e2) {
            FinskyLog.m21665c("IOException %s %s", uri, e2.getMessage());
            m13526a("patch-IOException", 0, e2);
            return null;
        }
    }

    private final boolean m13531f() {
        return this.h.q.f == 3;
    }

    private final File m13532g() {
        File cacheDir = this.a.getCacheDir();
        if (cacheDir.setExecutable(true, false)) {
            boolean z;
            File file = new File(cacheDir, "self_update_patches");
            file.mkdirs();
            if (file.setExecutable(true, false) && file.setReadable(true, false)) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                File[] listFiles = file.listFiles();
                if (!(listFiles == null || listFiles.length == 0)) {
                    for (File delete : listFiles) {
                        delete.delete();
                    }
                }
                cacheDir = File.createTempFile(this.g, ".apk", file);
                if (cacheDir.setReadable(true, false)) {
                    return cacheDir;
                }
                FinskyLog.m21665c("Could not make readable %s", cacheDir);
                cacheDir.delete();
                throw new IOException("Could not make destination file writeable");
            }
            FinskyLog.m21665c("Could not make readable %s", file);
            throw new IOException("Could not make destination dir readable");
        }
        FinskyLog.m21665c("Could not make executable %s", cacheDir);
        throw new IOException("Could not make cache dir executable");
    }

    private final void m13526a(String str, int i, Throwable th) {
        if (i == 0) {
            i = 917;
        }
        m13503a(108, str, i, th);
    }

    private final void m13527a(String str, Throwable th) {
        m13503a(149, str, 0, th);
    }
}
