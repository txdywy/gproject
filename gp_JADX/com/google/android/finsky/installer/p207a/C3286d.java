package com.google.android.finsky.installer.p207a;

import android.content.Context;
import android.net.Uri;
import com.google.android.finsky.installer.C3283a;
import com.google.android.finsky.installer.C3284c;
import com.google.android.finsky.utils.C4692x;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.zapp.utils.C4865c;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

final class C3286d implements C3283a {
    public final String f17006a;
    public final int f17007b;
    public final int f17008c;
    public final String f17009d;
    public final Uri f17010e;
    public final Context f17011f;
    public File f17012g;
    public final C3284c f17013h;

    C3286d(String str, int i, int i2, String str2, Uri uri, C3284c c3284c, Context context) {
        this.f17006a = str;
        this.f17007b = i;
        this.f17008c = i2;
        this.f17009d = str2;
        this.f17010e = uri;
        this.f17013h = c3284c;
        this.f17011f = context;
    }

    public final int mo3416c() {
        return this.f17007b;
    }

    public final int mo3417d() {
        return this.f17008c;
    }

    public final String mo3418e() {
        return this.f17009d;
    }

    public final C3284c mo3419f() {
        return this.f17013h;
    }

    public final String mo3414a() {
        return this.f17010e.toString();
    }

    public final synchronized File mo3415b() {
        Closeable openInputStream;
        Closeable fileOutputStream;
        Throwable e;
        Throwable th;
        File file = null;
        synchronized (this) {
            if (this.f17012g != null) {
                file = this.f17012g;
            } else {
                try {
                    openInputStream = this.f17011f.getContentResolver().openInputStream(this.f17010e);
                    if (openInputStream == null) {
                        C4865c.m22751a(null);
                        C4865c.m22751a(openInputStream);
                    } else {
                        try {
                            this.f17012g = new File(this.f17011f.getCacheDir(), String.valueOf(this.f17006a).concat(".cache.apk"));
                            fileOutputStream = new FileOutputStream(this.f17012g);
                        } catch (IOException e2) {
                            e = e2;
                            fileOutputStream = null;
                            try {
                                FinskyLog.m21660a(e, "Copying cached apk for %s failed", this.f17006a);
                                if (this.f17012g != null) {
                                    this.f17012g.delete();
                                    this.f17012g = null;
                                }
                                C4865c.m22751a(fileOutputStream);
                                C4865c.m22751a(openInputStream);
                                return file;
                            } catch (Throwable th2) {
                                th = th2;
                                C4865c.m22751a(fileOutputStream);
                                C4865c.m22751a(openInputStream);
                                throw th;
                            }
                        } catch (Throwable e3) {
                            fileOutputStream = null;
                            th = e3;
                            C4865c.m22751a(fileOutputStream);
                            C4865c.m22751a(openInputStream);
                            throw th;
                        }
                        try {
                            C4692x.m21843a(openInputStream, fileOutputStream);
                            C4865c.m22751a(fileOutputStream);
                            C4865c.m22751a(openInputStream);
                            file = this.f17012g;
                        } catch (IOException e4) {
                            e3 = e4;
                            FinskyLog.m21660a(e3, "Copying cached apk for %s failed", this.f17006a);
                            if (this.f17012g != null) {
                                this.f17012g.delete();
                                this.f17012g = null;
                            }
                            C4865c.m22751a(fileOutputStream);
                            C4865c.m22751a(openInputStream);
                            return file;
                        }
                    }
                } catch (IOException e5) {
                    e3 = e5;
                    fileOutputStream = null;
                    openInputStream = null;
                    FinskyLog.m21660a(e3, "Copying cached apk for %s failed", this.f17006a);
                    if (this.f17012g != null) {
                        this.f17012g.delete();
                        this.f17012g = null;
                    }
                    C4865c.m22751a(fileOutputStream);
                    C4865c.m22751a(openInputStream);
                    return file;
                } catch (Throwable e32) {
                    fileOutputStream = null;
                    openInputStream = null;
                    th = e32;
                    C4865c.m22751a(fileOutputStream);
                    C4865c.m22751a(openInputStream);
                    throw th;
                }
            }
        }
        return file;
    }

    public final synchronized void mo3420g() {
        if (this.f17012g != null) {
            this.f17012g.delete();
        }
        this.f17013h.mo3427g();
    }
}
