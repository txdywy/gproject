package com.google.android.finsky.p227n;

import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.net.Uri;
import android.os.Environment;
import android.os.Handler;
import android.text.TextUtils;
import com.google.android.finsky.as.C1503a;
import com.google.android.finsky.cn.C2320a;
import com.google.android.finsky.cn.C2322b;
import com.google.android.finsky.packagemanager.C0983h;
import com.google.android.finsky.utils.C4679j;
import com.google.android.finsky.utils.C4692x;
import com.google.android.finsky.utils.FinskyLog;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class C3745a implements C0983h {
    public static final Pattern f18893a = Pattern.compile("^patch\\.(\\d+)\\.([\\w\\.]+)$");
    public static final Pattern f18894b = Pattern.compile("^main\\.(\\d+)\\.([\\w\\.]+)$");
    public final Context f18895c;
    public final C2320a f18896d;
    public final C1503a f18897e;
    public final C3747c f18898f;
    public final Handler f18899g;

    public C3745a(Context context, C2320a c2320a, C1503a c1503a, C3747c c3747c, Handler handler) {
        this.f18895c = context;
        this.f18896d = c2320a;
        this.f18897e = c1503a;
        this.f18898f = c3747c;
        this.f18899g = handler;
    }

    public final void mo1176c(String str, boolean z) {
    }

    public final void mo1175b(String str, boolean z) {
        m17629b(str);
    }

    public final void mo1177d(String str) {
        m17629b(str);
    }

    public final void mo1174a(String[] strArr) {
    }

    public final void mo1178e(String str) {
    }

    private final void m17629b(String str) {
        this.f18899g.post(new C3746b(this, str));
    }

    final synchronized void m17630a(String str) {
        synchronized (this) {
            FinskyLog.m21659a("Pushing in cache %s", str);
            if (this.f18897e.f8184h && this.f18898f.m17636a()) {
                C2322b a = this.f18896d.mo2854a(str);
                if (a == null) {
                    FinskyLog.m21667d("The app %s is not installed", str);
                } else {
                    try {
                        ApplicationInfo applicationInfo = this.f18895c.getPackageManager().getApplicationInfo(str, 0);
                        String str2 = applicationInfo.sourceDir;
                        String str3 = applicationInfo.publicSourceDir;
                        if (TextUtils.isEmpty(str2) || !str2.equals(str3)) {
                            FinskyLog.m21667d("The app %s is unavailable or inaccessible", str);
                        } else {
                            File file = new File(str2);
                            ContentValues contentValues = new ContentValues();
                            contentValues.put("package_name", str);
                            String str4 = "file_name";
                            String valueOf = String.valueOf(str);
                            str3 = String.valueOf(".apk");
                            if (str3.length() != 0) {
                                str3 = valueOf.concat(str3);
                            } else {
                                str3 = new String(valueOf);
                            }
                            contentValues.put(str4, str3);
                            contentValues.put("length", Long.valueOf(file.length()));
                            contentValues.put("file_type", Integer.valueOf(0));
                            contentValues.put("version", Integer.valueOf(a.f11419d));
                            if (m17628a(file, this.f18895c.getContentResolver().insert(C3747c.f18902a, contentValues))) {
                                File[] listFiles = new File(new File(new File(Environment.getExternalStorageDirectory(), "Android"), "obb"), str).listFiles();
                                if (listFiles != null && listFiles.length <= 2) {
                                    for (File file2 : listFiles) {
                                        ContentValues contentValues2 = new ContentValues();
                                        contentValues2.put("file_name", file2.getName());
                                        contentValues2.put("package_name", str);
                                        contentValues2.put("length", Long.valueOf(file2.length()));
                                        if (file2.getName().startsWith("main.") && file2.getName().endsWith(".obb")) {
                                            contentValues2.put("file_type", Integer.valueOf(1));
                                            contentValues2.put("version", Integer.valueOf(C3745a.m17627a(file2, f18894b)));
                                        } else if (file2.getName().startsWith("patch.") && file2.getName().endsWith(".obb")) {
                                            contentValues2.put("file_type", Integer.valueOf(2));
                                            contentValues2.put("version", Integer.valueOf(C3745a.m17627a(file2, f18893a)));
                                        } else {
                                            FinskyLog.m21667d("Wrong file in the OBB directory", new Object[0]);
                                        }
                                        m17628a(file2, this.f18895c.getContentResolver().insert(C3747c.f18902a, contentValues2));
                                    }
                                }
                            }
                        }
                    } catch (Throwable e) {
                        FinskyLog.m21660a(e, "The app %s is not installed", str);
                    }
                }
            }
        }
    }

    private final boolean m17628a(File file, Uri uri) {
        Closeable openOutputStream;
        Closeable fileInputStream;
        Throwable e;
        Throwable th;
        Closeable closeable = null;
        if (uri == null) {
            FinskyLog.m21659a("Uri for file %s is null", file.getName());
            return false;
        }
        try {
            openOutputStream = this.f18895c.getContentResolver().openOutputStream(uri);
            try {
                fileInputStream = new FileInputStream(file);
            } catch (IOException e2) {
                e = e2;
                fileInputStream = null;
                closeable = openOutputStream;
                try {
                    FinskyLog.m21660a(e, "Could not write into cache.", new Object[0]);
                    C4679j.m21814a(closeable);
                    C4679j.m21814a(fileInputStream);
                    return false;
                } catch (Throwable th2) {
                    th = th2;
                    openOutputStream = closeable;
                    closeable = fileInputStream;
                    C4679j.m21814a(openOutputStream);
                    C4679j.m21814a(closeable);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                C4679j.m21814a(openOutputStream);
                C4679j.m21814a(closeable);
                throw th;
            }
            try {
                C4692x.m21843a(fileInputStream, openOutputStream);
                C4679j.m21814a(openOutputStream);
                C4679j.m21814a(fileInputStream);
                return true;
            } catch (IOException e3) {
                e = e3;
                closeable = openOutputStream;
                FinskyLog.m21660a(e, "Could not write into cache.", new Object[0]);
                C4679j.m21814a(closeable);
                C4679j.m21814a(fileInputStream);
                return false;
            } catch (Throwable th4) {
                th = th4;
                closeable = fileInputStream;
                C4679j.m21814a(openOutputStream);
                C4679j.m21814a(closeable);
                throw th;
            }
        } catch (IOException e4) {
            e = e4;
            fileInputStream = null;
            FinskyLog.m21660a(e, "Could not write into cache.", new Object[0]);
            C4679j.m21814a(closeable);
            C4679j.m21814a(fileInputStream);
            return false;
        } catch (Throwable th5) {
            th = th5;
            openOutputStream = null;
            C4679j.m21814a(openOutputStream);
            C4679j.m21814a(closeable);
            throw th;
        }
    }

    private static int m17627a(File file, Pattern pattern) {
        Matcher matcher = pattern.matcher(file.getName());
        if (matcher.matches()) {
            try {
                return Integer.parseInt(matcher.group(1));
            } catch (NumberFormatException e) {
            }
        }
        FinskyLog.m21667d("Unable to parse version code from OBB file %s", file.getName());
        return -1;
    }
}
