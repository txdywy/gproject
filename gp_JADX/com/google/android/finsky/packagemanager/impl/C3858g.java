package com.google.android.finsky.packagemanager.impl;

import android.accounts.Account;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Handler;
import android.os.Looper;
import com.google.android.finsky.cn.C2320a;
import com.google.android.finsky.packagemanager.C2294c;
import com.google.android.finsky.packagemanager.C3850d;
import com.google.android.finsky.utils.C4688t;
import com.google.android.finsky.utils.C4689u;
import com.google.android.finsky.utils.FinskyLog;
import java.io.File;
import java.io.IOException;

final class C3858g extends AsyncTask {
    public final Uri f19246a;
    public final long f19247b;
    public final String f19248c;
    public final C2294c f19249d;
    public final boolean f19250e;
    public final String f19251f;
    public volatile IOException f19252g;
    public volatile C4689u f19253h;
    public final Handler f19254i = new Handler(Looper.getMainLooper());
    public final Context f19255j;
    public final C2320a f19256k;
    public final /* synthetic */ C3852a f19257l;

    C3858g(C3852a c3852a, Uri uri, long j, String str, C2294c c2294c, boolean z, String str2, Context context, C2320a c2320a) {
        this.f19257l = c3852a;
        this.f19246a = uri;
        this.f19247b = j;
        this.f19248c = str;
        this.f19249d = c2294c;
        this.f19250e = z;
        this.f19251f = str2;
        this.f19255j = context;
        this.f19256k = c2320a;
    }

    private final Uri m18345a() {
        this.f19252g = null;
        if (this.f19247b >= 0) {
            try {
                this.f19253h = C4688t.m21837a(this.f19255j.getContentResolver().openInputStream(this.f19246a), "SHA-1");
            } catch (IOException e) {
                this.f19252g = e;
            }
        }
        return m18346a(this.f19246a);
    }

    @Deprecated
    private final Uri m18346a(Uri uri) {
        Throwable th;
        Cursor cursor = null;
        if ("file".equalsIgnoreCase(uri.getScheme())) {
            return uri;
        }
        try {
            Cursor query = this.f19255j.getContentResolver().query(uri, C3852a.f19227a, null, null, null);
            try {
                String string;
                if (query.moveToFirst()) {
                    string = query.getString(0);
                } else {
                    string = null;
                }
                if (query != null) {
                    query.close();
                }
                if (string == null) {
                    return null;
                }
                return Uri.fromFile(new File(Uri.parse(string).getPath()));
            } catch (Throwable th2) {
                th = th2;
                cursor = query;
                if (cursor != null) {
                    cursor.close();
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    protected final /* synthetic */ void onPostExecute(Object obj) {
        int i;
        int i2 = 3;
        obj = (Uri) obj;
        if (this.f19252g != null) {
            FinskyLog.m21665c("Verification check of %s failed, exception=%s", this.f19251f, this.f19252g);
            i = 961;
        } else {
            if (this.f19253h != null) {
                if (this.f19247b != this.f19253h.f24071a) {
                    FinskyLog.m21665c("Signature check of %s failed, size expected=%d actual=%d", this.f19251f, Long.valueOf(this.f19247b), Long.valueOf(this.f19253h.f24071a));
                    i = 919;
                } else if (!this.f19248c.equals(this.f19253h.f24073c)) {
                    FinskyLog.m21665c("Signature check of %s failed, hash expected=%s actual=%s", this.f19251f, this.f19248c, this.f19253h.f24073c);
                    i = 960;
                }
            }
            i = 0;
        }
        if (i != 0) {
            FinskyLog.m21665c("Signature check failed, aborting installation. Error %d", Integer.valueOf(i));
            this.f19249d.mo2837a(i, this.f19252g);
            return;
        }
        C3850d c3863l;
        if (!this.f19250e) {
            i2 = 2;
        }
        C3850d c3859h = new C3859h(this);
        Account b = this.f19257l.f19232f.mo1196b();
        long a = this.f19257l.f19231e.mo2875a("SaturnV", "delay_installation_ms", b == null ? null : b.name);
        if (a > 0) {
            c3863l = new C3863l(a, c3859h);
        } else {
            c3863l = c3859h;
        }
        if (obj == null) {
            obj = this.f19246a;
        }
        if (obj != null) {
            C3852a c3852a = this.f19257l;
            if (c3852a.f19237k != null) {
                C3853b c3853b = new C3853b(c3863l);
                try {
                    c3852a.f19237k.invoke(c3852a.f19230d, new Object[]{obj, c3853b, Integer.valueOf(i2), "com.android.vending"});
                    return;
                } catch (Throwable e) {
                    FinskyLog.m21663b(e, "Cannot install packages due to reflection access exception", new Object[0]);
                    return;
                } catch (Throwable e2) {
                    FinskyLog.m21663b(e2, "Cannot install packages due to reflection invocation exception", new Object[0]);
                    return;
                }
            }
            return;
        }
        this.f19249d.mo2837a(-3, null);
    }

    protected final /* synthetic */ Object doInBackground(Object[] objArr) {
        return m18345a();
    }
}
