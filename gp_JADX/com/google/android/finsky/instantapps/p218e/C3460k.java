package com.google.android.finsky.instantapps.p218e;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.BitmapFactory;
import android.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URL;

final class C3460k {
    public File f17647a;

    C3460k(Context context) {
        this.f17647a = new File(context.getCacheDir(), "instant_apps");
    }

    final Bitmap m17019a(String str, String str2) {
        Bitmap decodeFile;
        FileOutputStream fileOutputStream;
        Throwable e;
        Throwable th;
        Object obj = null;
        if (this.f17647a.isDirectory() || this.f17647a.mkdir()) {
            obj = 1;
        } else {
            Log.e("AIAIconFetcher", "Unable to create subfolder in cache dir!");
        }
        if (obj == null) {
            return null;
        }
        File a = m17018a(str);
        if (a.exists()) {
            decodeFile = BitmapFactory.decodeFile(a.getAbsolutePath());
        } else {
            decodeFile = null;
        }
        if (decodeFile != null) {
            return decodeFile;
        }
        try {
            InputStream openStream = new URL(str2).openStream();
            decodeFile = BitmapFactory.decodeStream(openStream);
            openStream.close();
            try {
                fileOutputStream = new FileOutputStream(m17018a(str), false);
                try {
                    decodeFile.compress(CompressFormat.PNG, 100, fileOutputStream);
                    try {
                        fileOutputStream.close();
                    } catch (Throwable e2) {
                        Log.e("AIAIconFetcher", "Couldn't save icon to file!", e2);
                    }
                } catch (Exception e3) {
                    e2 = e3;
                    try {
                        Log.e("AIAIconFetcher", "Couldn't compress icon.", e2);
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (Throwable e22) {
                                Log.e("AIAIconFetcher", "Couldn't save icon to file!", e22);
                            }
                        }
                        return decodeFile;
                    } catch (Throwable th2) {
                        th = th2;
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (Throwable e222) {
                                Log.e("AIAIconFetcher", "Couldn't save icon to file!", e222);
                            }
                        }
                        throw th;
                    }
                }
            } catch (Exception e4) {
                e222 = e4;
                fileOutputStream = null;
                Log.e("AIAIconFetcher", "Couldn't compress icon.", e222);
                if (fileOutputStream != null) {
                    fileOutputStream.close();
                }
                return decodeFile;
            } catch (Throwable th3) {
                th = th3;
                fileOutputStream = null;
                if (fileOutputStream != null) {
                    fileOutputStream.close();
                }
                throw th;
            }
            return decodeFile;
        } catch (Throwable th4) {
            Log.e("AIAIconFetcher", "Couldn't read app icon!", th4);
            return null;
        }
    }

    private final File m17018a(String str) {
        return new File(this.f17647a, String.valueOf(str).concat("_icon.png"));
    }
}
