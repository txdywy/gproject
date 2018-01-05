package com.google.android.finsky.download;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.database.ContentObserver;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.StrictMode;
import android.support.v4.os.C0327a;
import android.support.v4.p037h.C0304u;
import android.text.TextUtils;
import com.google.android.finsky.aa.C0955b;
import com.google.android.finsky.as.C1503a;
import com.google.android.finsky.ba.C1461c;
import com.google.android.finsky.ce.C2266a;
import com.google.android.finsky.dg.C2734a;
import com.google.android.finsky.recoverymode.C3982a;
import com.google.android.finsky.utils.C4671b;
import com.google.android.finsky.utils.C4674e;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.play.utils.C6324f;
import com.squareup.haha.perflib.HprofParser;
import java.net.HttpCookie;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class C2863z implements C2843f {
    public static final Uri f15313a = Uri.parse("content://downloads/my_downloads");
    public final Context f15314b;
    public final C2734a f15315c;
    public final C2266a f15316d;
    public final C1461c f15317e;
    public final ContentResolver f15318f;
    public final Handler f15319g;
    public final String f15320h;
    public final String[] f15321i;
    public final boolean f15322j;
    public Cursor f15323k;
    public ContentObserver f15324l = new aa(this, this.f15319g);
    public C2844g f15325m;

    public C2863z(Context context, C2734a c2734a, C2266a c2266a, C1461c c1461c, C3982a c3982a) {
        this.f15314b = context;
        this.f15315c = c2734a;
        this.f15316d = c2266a;
        this.f15317e = c1461c;
        this.f15318f = context.getContentResolver();
        HandlerThread a = C4674e.m21808a("download-manager-thread");
        a.start();
        this.f15319g = new Handler(a.getLooper());
        this.f15322j = c3982a.mo3874a();
        if (this.f15322j) {
            this.f15320h = RecoveryModeDownloadBroadcastReceiver.class.getName();
        } else {
            this.f15320h = DownloadBroadcastReceiver.class.getName();
        }
        this.f15321i = new String[]{this.f15320h};
    }

    public final Uri mo3185a(C2839b c2839b) {
        Uri uri = null;
        StrictMode.noteSlowCall("SystemDownloadManager.enqueue");
        if (Build.MODEL.equals("google_sdk")) {
            FinskyLog.m21662b("Skip download of %s because emulator", c2839b.toString());
        } else {
            try {
                uri = this.f15318f.insert(f15313a, m15099b(c2839b));
            } catch (Throwable e) {
                FinskyLog.m21660a(e, "Unable to insert download request for %s", r2.toString());
            } catch (Throwable e2) {
                FinskyLog.m21660a(e2, "Unable to insert download request for %s", r2.toString());
            }
        }
        return uri;
    }

    private final ContentValues m15099b(C2839b c2839b) {
        int i = 0;
        ContentValues contentValues = new ContentValues();
        contentValues.put("otheruid", Integer.valueOf(1000));
        contentValues.put("uri", c2839b.mo3153c());
        Uri g = c2839b.mo3157g();
        if (g != null) {
            contentValues.put("destination", Integer.valueOf(4));
            contentValues.put("hint", g.toString());
        } else {
            contentValues.put("destination", Integer.valueOf(2));
        }
        contentValues.put("notificationpackage", this.f15314b.getPackageName());
        contentValues.put("notificationclass", this.f15320h);
        if (!c2839b.mo3158h().isEmpty()) {
            StringBuilder stringBuilder = new StringBuilder();
            for (HttpCookie httpCookie : c2839b.mo3158h()) {
                if (stringBuilder.length() > 0) {
                    stringBuilder.append(";");
                }
                String name = httpCookie.getName();
                String value = httpCookie.getValue();
                stringBuilder.append(new StringBuilder((String.valueOf(name).length() + 1) + String.valueOf(value).length()).append(name).append("=").append(value).toString());
            }
            contentValues.put("cookiedata", stringBuilder.toString());
        }
        boolean j = c2839b.mo3160j();
        Object d = c2839b.mo3154d();
        if (j || TextUtils.isEmpty(d)) {
            contentValues.put("visibility", Integer.valueOf(2));
        } else {
            contentValues.put("visibility", Integer.valueOf(0));
            contentValues.put("title", d);
        }
        if (this.f15322j) {
            j = false;
        } else if (!C0327a.m1721a()) {
            j = false;
        } else if (((Boolean) C0955b.ic.m28964b()).booleanValue() || this.f15315c.m14775a()) {
            j = this.f15317e.dj().mo2294a(12620811);
        } else {
            j = true;
        }
        if (c2839b.mo3161k()) {
            if (VERSION.SDK_INT < 16 || !(C1503a.m8830a(this.f15314b) || C1503a.m8831b(this.f15314b) || C1503a.m8832c(this.f15314b) || this.f15316d.m11724f())) {
                contentValues.put("allowed_network_types", Integer.valueOf(2));
            } else {
                contentValues.put("allow_metered", Boolean.valueOf(false));
                contentValues.put("allowed_network_types", Integer.valueOf(-1));
            }
            j = true;
        }
        if (j) {
            contentValues.put("is_public_api", Boolean.valueOf(true));
            contentValues.put("allow_roaming", Boolean.valueOf(true));
        }
        if (c2839b.mo3155e() != 1 && this.f15317e.dj().mo2294a(12633423) && ((Boolean) C0955b.be.m28964b()).booleanValue()) {
            C0304u c0304u = new C0304u(4);
            try {
                c0304u.put("X-DS-VC", Integer.valueOf(this.f15314b.getPackageManager().getPackageInfo(this.f15314b.getPackageName(), 0).versionCode));
            } catch (Throwable e) {
                FinskyLog.m21663b(e, "Cannot retrieve own version code", new Object[0]);
            }
            c0304u.put("X-DS-NT", Integer.valueOf(C6324f.m28966a(this.f15314b)));
            c0304u.put("X-DS-SDK", Integer.valueOf(VERSION.SDK_INT));
            if (C4671b.m21788e() && VERSION.PREVIEW_SDK_INT > 0) {
                c0304u.put("X-DS-PSDK", Integer.valueOf(VERSION.PREVIEW_SDK_INT));
            }
            while (i < c0304u.size()) {
                String str = "http_header_" + i;
                value = (String) c0304u.m1629b(i);
                String valueOf = String.valueOf(c0304u.m1630c(i));
                contentValues.put(str, new StringBuilder((String.valueOf(value).length() + 2) + String.valueOf(valueOf).length()).append(value).append(": ").append(valueOf).toString());
                i++;
            }
        }
        return contentValues;
    }

    public final void mo3187a(Uri uri) {
        this.f15319g.post(new ab(this, uri));
    }

    public final synchronized List mo3186a(Uri uri, C2844g c2844g) {
        List emptyList;
        Uri uri2;
        StrictMode.noteSlowCall("SystemDownloadManager.query");
        if (uri == null) {
            uri2 = f15313a;
        } else {
            uri2 = uri;
        }
        Cursor query = this.f15318f.query(uri2, null, "notificationclass=?", this.f15321i, null);
        if (query == null) {
            FinskyLog.m21665c("Download progress cursor null", new Object[0]);
            emptyList = Collections.emptyList();
        } else {
            if (query.getCount() <= 0) {
                emptyList = Collections.emptyList();
            } else {
                emptyList = new ArrayList(query.getCount());
                int columnIndexOrThrow = query.getColumnIndexOrThrow("_id");
                int columnIndexOrThrow2 = query.getColumnIndexOrThrow("status");
                int columnIndexOrThrow3 = query.getColumnIndexOrThrow("current_bytes");
                int columnIndexOrThrow4 = query.getColumnIndexOrThrow("total_bytes");
                int columnIndex = query.getColumnIndex("allowed_network_types");
                int columnIndexOrThrow5 = query.getColumnIndexOrThrow("uri");
                while (query.moveToNext()) {
                    Uri a = C2863z.m15097a(query.getLong(columnIndexOrThrow));
                    String string = query.getString(columnIndexOrThrow5);
                    int i = query.getInt(columnIndexOrThrow2);
                    long j = query.getLong(columnIndexOrThrow3);
                    long j2 = query.getLong(columnIndexOrThrow4);
                    if (i == HprofParser.ROOT_PRIMITIVE_ARRAY_NODATA && columnIndex != -1 && query.getInt(columnIndex) == 2) {
                        i = 196;
                    }
                    emptyList.add(new C2845h(a, string, j, j2, i));
                }
            }
            if (c2844g == null) {
                query.close();
            } else {
                mo3188a(this.f15325m);
                this.f15323k = query;
                this.f15323k.registerContentObserver(this.f15324l);
                this.f15325m = c2844g;
            }
        }
        return emptyList;
    }

    final synchronized void m15102a() {
        C2844g c2844g = this.f15325m;
        mo3188a(c2844g);
        if (c2844g != null) {
            c2844g.mo3169a();
        }
    }

    public final synchronized void mo3188a(C2844g c2844g) {
        if (this.f15325m == c2844g) {
            if (this.f15323k != null) {
                this.f15323k.unregisterContentObserver(this.f15324l);
                this.f15323k.close();
                this.f15323k = null;
            }
            this.f15325m = null;
        }
    }

    static Uri m15098a(Intent intent) {
        Uri data = intent.getData();
        if (data != null) {
            return data;
        }
        long longExtra = intent.getLongExtra("extra_download_id", -1);
        if (longExtra == -1) {
            long[] longArrayExtra = intent.getLongArrayExtra("extra_click_download_ids");
            if (longArrayExtra != null && longArrayExtra.length == 1) {
                longExtra = longArrayExtra[0];
            }
        }
        if (longExtra == -1) {
            return null;
        }
        return C2863z.m15097a(longExtra);
    }

    private static Uri m15097a(long j) {
        return Uri.parse("content://downloads/my_downloads/" + j);
    }
}
