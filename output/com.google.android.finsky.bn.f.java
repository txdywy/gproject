package com.google.android.finsky.bn;

import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.finsky.cv.a.n;
import com.google.android.finsky.d.a.a;
import com.google.android.finsky.installer.b.a.d;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.k;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import com.google.protobuf.nano.i;
import com.google.wireless.android.finsky.b.a;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Collection;

public final synchronized class com.google.android.finsky.bn.f implements com.google.android.finsky.bn.b
{

    public static final String[] a;
    public static final String[] b;
    public final com.google.android.finsky.bn.g c;

    static {
        v0 = new String[41];
        v0[0] = "package_name";
        v0[1] = "auto_update";
        v0[2] = "desired_version";
        v0[3] = "download_uri";
        v0[4] = "delivery_data";
        v0[5] = "delivery_data_timestamp_ms";
        v0[6] = "installer_state";
        v0[7] = "first_download_ms";
        v0[8] = "referrer";
        v0[9] = "account";
        v0[10] = "title";
        v0[11] = "flags";
        v0[12] = "continue_url";
        v0[13] = "last_notified_version";
        v0[14] = "last_update_timestamp_ms";
        v0[15] = "account_for_update";
        v0[16] = "auto_acquire_tags";
        v0[17] = "external_referrer_timestamp_ms";
        v0[18] = "persistent_flags";
        v0[19] = "permissions_version";
        v0[20] = "delivery_token";
        v0[21] = "completed_split_ids";
        v0[22] = "active_split_id";
        v0[23] = "request_id";
        v0[24] = "managed_configuration_token";
        v0[25] = "total_completed_bytes_downloaded";
        v0[26] = "app_details";
        v0[27] = "install_client_event_id";
        v0[28] = "last_client_event_id";
        v0[29] = "requesting_package_name";
        v0[30] = "update_discovered_timestamp_ms";
        v0[31] = "install_logging_context";
        v0[32] = "logging_context";
        v0[33] = "install_request_timestamp_ms";
        v0[34] = "desired_derived_apk_id";
        v0[35] = "notification_intent";
        v0[36] = "auto_update_flow_policy";
        v0[37] = "install_reason";
        v0[38] = "sandbox_version";
        v0[39] = "requested_modules";
        v0[40] = "install_request_data";
        com.google.android.finsky.bn.f.a = v0;
        com.google.android.finsky.bn.f.b = new String[0];
    }

    f(Context p0, String p1) {
        this.c = new com.google.android.finsky.bn.g(p0, p1);
    }

    private static com.google.android.finsky.bn.c a(Cursor p0) {
 14:    if (p0.isNull(1))
 16:        v5 = 0;
        else
535:        v5 = p0.getInt(1);
 24:    if (p0.isNull(2))
 26:        v6 = -1;
        else
544:        v6 = p0.getInt(2);
 35:    if (p0.isNull(38))
 37:        v7 = 1;
        else
554:        v7 = p0.getInt(38);
 46:    if (p0.isNull(13))
 48:        v8 = -1;
        else
564:        v8 = p0.getInt(13);
 49:    v9 = 0;
 57:    if (!p0.isNull(4)) {
 60:        try {
 66:            v9 = com.google.wireless.android.finsky.b.a.a(p0.getBlob(4));
            }
            catch (InvalidProtocolBufferNanoException ex) {
574:            v10 = new Object[1];
577:            v10[0] = ex;
579:            FinskyLog.c("Couldn't parse blob as AndroidAppDeliveryData: %s", v10);
            }
        }
186:    v2 = 0;
195:    if (!p0.isNull(21))
201:        v2 = p0.getString(21);
205:    v29 = com.google.android.finsky.utils.k.a(v2);
241:    v35 = 0;
251:    if (!p0.isNull(26)) {
255:        try {
261:            v35 = com.google.android.finsky.cv.a.n.a(p0.getBlob(26));
            }
            catch (InvalidProtocolBufferNanoException ex) {
593:            v36 = new Object[1];
597:            v36[0] = ex;
601:            FinskyLog.c("Couldn't parse blob as AppDetails: %s", v36);
            }
        }
297:    v43 = 0;
299:    v2 = 0;
308:    if (!p0.isNull(31))
318:        v43 = com.google.android.finsky.d.a.a.a(p0.getBlob(31));
330:    if (!p0.isNull(32))
340:        v2 = com.google.android.finsky.d.a.a.a(p0.getBlob(32));
344:    v44 = v2;
346:    if (v43 == 0)
350:        v43 = new com.google.android.finsky.d.a.a();
353:    if (v44 == 0)
357:        v44 = new com.google.android.finsky.d.a.a();
376:    if (p0.isNull(34))
378:        v47 = 0;
        else
632:        v47 = p0.getInt(34);
380:    v48 = 0;
390:    if (!p0.isNull(35)) {
396:        v2 = p0.getString(35);
401:        try {
401:            v48 = Intent.parseUri(v2, 1);
            }
            catch (URISyntaxException ex) {
647:            v49 = new Object[1];
655:            v49[0] = FinskyLog.a(v2);
659:            FinskyLog.c("Could not parse string as WebAPK notification intent: %s", v49);
            }
        }
409:    v49 = p0.getString(37);
417:    if (TextUtils.isEmpty(v49))
419:        v49 = "unknown";
421:    v50 = 0;
431:    if (!p0.isNull(39)) {
441:        v50 = com.google.android.finsky.utils.k.a(p0.getString(39));
448:        if (v50.length == 0)
450:            v50 = 0;
        }
452:    v51 = 0;
462:    if (!p0.isNull(40)) {
466:        try {
472:            v51 = com.google.android.finsky.installer.b.a.d.a(p0.getBlob(40));
            }
            catch (InvalidProtocolBufferNanoException ex) {
677:            FinskyLog.b(ex, "Error while parsing InstallRequestData proto", new Object[0]);
            }
        }
478:    v3 = new com.google.android.finsky.bn.c(p0.getString(0), v5, v6, v7, v8, v9, p0.getLong(5), p0.getInt(6), p0.getString(3), p0.getLong(7), p0.getString(8), p0.getString(12), p0.getString(9), p0.getString(10), p0.getInt(11), p0.getLong(14), p0.getString(15), p0.getLong(17), p0.getInt(18), p0.getInt(19), p0.getString(20), v29, p0.getString(22), p0.getString(23), p0.getBlob(24), p0.getLong(25), v35, p0.getLong(27), p0.getLong(28), p0.getString(29), p0.getLong(30), v43, v44, p0.getLong(33), v47, v48, v49, v50, v51);
486:    v2 = v3.s;
490:    if (v3.m & 64) {
499:        v4 = v3.m & -65;
500:        v5 = 1;
501:        v6 = v3.r | 1;
        }
        else {
684:        v4 = v3.m;
685:        v5 = 0;
686:        v6 = v3.r;
        }
505:    if (v4 & 256) {
507:        v5 = 1;
508:        v4 = v4 & -257;
510:        v2 = 1;
        }
511:    if (v5 != 0) {
517:        v5 = new com.google.android.finsky.bn.d(v3.a);
520:        v5.f(v4);
523:        v5.g(v6);
526:        v5.h(v2);
529:        v3 = v5.a;
        }
531:    return v3;
621:    FinskyLog.b(ex, "Error while parsing LoggingContextState proto", new Object[0]);
624:    v44 = 0;
626:    goto 346;
691:    try
            run 302...343
        catch (InvalidProtocolBufferNanoException ex) {
302:        goto 606;
        }
    }

    public static void a(Context p0, String p1) {
        p0.deleteDatabase(com.google.android.finsky.bn.f.b(p1));
    }

    public static String b(String p0) {
        if (TextUtils.isEmpty(p0))
            v0 = "localappstate.db";
        else {
            v0 = Uri.encode(p0);
            v0 = (String.valueOf(v0).length() + 17) + "node-appstate-" + v0 + ".db";
        }
        return v0;
    }

    public static String[] getDatabaseNodes(Context p0) {
        v2 = p0.databaseList();
        v0 = 0;
        v1 = 0;
        while (v1 < v2.length) {
            if (v2[v1].startsWith("node-appstate-")) {
                if (v2[v1].endsWith(".db")) {
                    if (v0 == 0)
                        v0 = new ArrayList();
                    v0.add(Uri.decode(v2[v1].substring(14, v2[v1].length() - 3)));
                }
            }
            v1 = v1 + 1;
        }
        if (v0 == 0)
            v0 = com.google.android.finsky.bn.f.b;
        else
            v0 = (String[])v0.toArray(new String[v0.size()]);
        return v0;
    }

    public final synchronized com.google.android.finsky.bn.c a(String p0) {
  2:    enter this;
  3:    try {
 16:        v4 = new String[1];
 19:        v4[0] = p0;
 24:        v1 = this.c.getWritableDatabase().query("appstate", com.google.android.finsky.bn.f.a, "package_name=?", v4, 0, 0, 0);
        }
        catch (Throwable ex) {
 52:        exit this;
 53:        throw ex;
        }
 32:    if (v1.getCount() == 1) goto 40;
 34:    try {
 34:        v1.close();
        }
        catch (Throwable ex) {
 52:        exit this;
 53:        throw ex;
        }
 37:    v0 = 0;
 38:    exit this;
 39:    return v0;
 40:    v1.moveToNext();
 43:    v0 = com.google.android.finsky.bn.f.a(v1);
 47:    try {
 47:        v1.close();
        }
        catch (Throwable ex) {
 52:        exit this;
 53:        throw ex;
        }
 50:    goto 38;
 55:    try {
 55:        v1.close();
 58:        throw ex;
        }
        catch (Throwable ex) {
 52:        exit this;
 53:        throw ex;
        }
 61:    try
            run 40...46
        catch (Throwable ex) {
 40:        goto 54;
        }
 63:    try
            run 28...31
        catch (Throwable ex) {
 28:        goto 54;
        }
    }

    public final synchronized Collection a() {
        enter this;
        try {
            v1 = this.c.getWritableDatabase().query("appstate", com.google.android.finsky.bn.f.a, 0, 0, 0, 0, 0);
            v0 = new ArrayList(v1.getCount());
        }
        catch (Throwable ex) {
            exit this;
            throw ex;
        }
        try {
            while (v1.moveToNext())
                v0.add(com.google.android.finsky.bn.f.a(v1));
        }
        catch (Throwable ex) {
            try {
                v1.close();
                throw ex;
            }
            catch (Throwable ex) {
                exit this;
                throw ex;
            }
            try {
                v1.close();
            }
            catch (Throwable ex) {
                exit this;
                throw ex;
            }
            exit this;
            return v0;
        }
        try {
            v1.close();
        }
        catch (Throwable ex) {
            exit this;
            throw ex;
        }
        exit this;
        return v0;
    }

    public final synchronized void a(com.google.android.finsky.bn.c p0) {
        enter this;
        try {
            v0 = new ContentValues();
            v0.put("package_name", p0.a);
            v0.put("auto_update", Integer.valueOf(p0.b));
            v0.put("desired_version", Integer.valueOf(p0.c));
            v0.put("sandbox_version", Integer.valueOf(p0.K));
            v0.put("download_uri", p0.h);
            if (p0.e != 0)
                v0.put("delivery_data", com.google.protobuf.nano.i.a(p0.e));
            else {
                try {
                    v0.putNull("delivery_data");
                }
                catch (Throwable ex) {
                    exit this;
                    throw ex;
                }
            }
            v0.put("delivery_data_timestamp_ms", Long.valueOf(p0.f));
            v0.put("installer_state", Integer.valueOf(p0.g));
            v0.put("first_download_ms", Long.valueOf(p0.j));
            v0.put("referrer", p0.k);
            v0.put("account", p0.i);
            v0.put("title", p0.l);
            v0.put("flags", Integer.valueOf(p0.m));
            v0.put("continue_url", p0.n);
            v0.put("last_notified_version", Integer.valueOf(p0.d));
            v0.put("last_update_timestamp_ms", Long.valueOf(p0.o));
            v0.put("account_for_update", p0.p);
            v0.put("external_referrer_timestamp_ms", Long.valueOf(p0.q));
            v0.put("persistent_flags", Integer.valueOf(p0.r));
            v0.put("permissions_version", Integer.valueOf(p0.s));
            v0.put("delivery_token", p0.t);
            v0.put("completed_split_ids", com.google.android.finsky.utils.k.a(p0.a()));
            v0.put("active_split_id", p0.v);
            v0.put("request_id", p0.w);
            v0.put("managed_configuration_token", p0.x);
            v0.put("total_completed_bytes_downloaded", Long.valueOf(p0.y));
            if (p0.z != 0)
                v0.put("app_details", com.google.protobuf.nano.i.a(p0.z));
            else {
                try {
                    v0.putNull("app_details");
                }
                catch (Throwable ex) {
                    exit this;
                    throw ex;
                }
            }
            v0.put("install_client_event_id", Long.valueOf(p0.A));
            v0.put("last_client_event_id", Long.valueOf(p0.B));
            v0.put("requesting_package_name", p0.C);
            v0.put("update_discovered_timestamp_ms", Long.valueOf(p0.D));
            v0.put("install_logging_context", com.google.protobuf.nano.i.a(p0.c()));
            v0.put("logging_context", com.google.protobuf.nano.i.a(p0.d()));
            v0.put("install_request_timestamp_ms", Long.valueOf(p0.G));
            v0.put("desired_derived_apk_id", Integer.valueOf(p0.I));
            v0.put("install_reason", p0.H);
            if (p0.J != 0)
                v0.put("notification_intent", p0.J.toUri(1));
            else
                v0.putNull("notification_intent");
            v0.put("requested_modules", com.google.android.finsky.utils.k.a(p0.L));
            if (p0.M != 0)
                v0.put("install_request_data", com.google.protobuf.nano.i.a(p0.M));
            else
                v0.putNull("install_request_data");
            this.c.getWritableDatabase().replace("appstate", 0, v0);
        }
        catch (Throwable ex) {
            exit this;
            throw ex;
        }
        exit this;
    }

    public final synchronized void a(com.google.android.finsky.bn.e p0) {
        enter this;
        try {
            v4 = new String[1];
            v4[0] = p0.b;
            if (this.c.getWritableDatabase().update("appstate", p0.a, "package_name = ?", v4) == 0)
                this.c.getWritableDatabase().insert("appstate", 0, p0.a);
        }
        catch (Throwable ex) {
            exit this;
            throw ex;
        }
        exit this;
    }

    public final synchronized void a(String p0, int p1) {
        enter this;
        try {
            this.a(com.google.android.finsky.bn.d.a(this.a(p0), p0).a(p1).a);
        }
        catch (Throwable ex) {
            exit this;
            throw ex;
        }
        exit this;
    }

    public final synchronized void a(String p0, int p1, String p2) {
        enter this;
        try {
            this.a(com.google.android.finsky.bn.d.a(this.a(p0), p0).e(p1).a(p2).a);
        }
        catch (Throwable ex) {
            exit this;
            throw ex;
        }
        exit this;
    }

    public final synchronized void a(String p0, long p1) {
        enter this;
        try {
            this.a(com.google.android.finsky.bn.d.a(this.a(p0), p0).a(p1).a);
        }
        catch (Throwable ex) {
            exit this;
            throw ex;
        }
        exit this;
    }

    public final synchronized void a(String p0, com.google.android.finsky.cv.a.n p1) {
        enter this;
        try {
            this.a(com.google.android.finsky.bn.d.a(this.a(p0), p0).a(p1).a);
        }
        catch (Throwable ex) {
            exit this;
            throw ex;
        }
        exit this;
    }

    public final synchronized void a(String p0, com.google.wireless.android.finsky.b.a p1, long p2) {
        enter this;
        try {
            this.a(com.google.android.finsky.bn.d.a(this.a(p0), p0).a(p1, p2).a);
        }
        catch (Throwable ex) {
            exit this;
            throw ex;
        }
        exit this;
    }

    public final synchronized void a(String p0, String p1) {
        enter this;
        try {
            this.a(com.google.android.finsky.bn.d.a(this.a(p0), p0).b(p1).a);
        }
        catch (Throwable ex) {
            exit this;
            throw ex;
        }
        exit this;
    }

    public final synchronized void a(String p0, byte[] p1) {
        enter this;
        try {
            this.a(com.google.android.finsky.bn.d.a(this.a(p0), p0).a(p1).a);
        }
        catch (Throwable ex) {
            exit this;
            throw ex;
        }
        exit this;
    }

    public final synchronized void a(String p0, String[] p1) {
        enter this;
        try {
            this.a(com.google.android.finsky.bn.d.a(this.a(p0), p0).a(p1).a);
        }
        catch (Throwable ex) {
            exit this;
            throw ex;
        }
        exit this;
    }

    public final synchronized void b(String p0, int p1) {
        enter this;
        try {
            this.a(com.google.android.finsky.bn.d.a(this.a(p0), p0).b(p1).a);
        }
        catch (Throwable ex) {
            exit this;
            throw ex;
        }
        exit this;
    }

    public final synchronized void b(String p0, long p1) {
        enter this;
        try {
            this.a(com.google.android.finsky.bn.d.a(this.a(p0), p0).b(p1).a);
        }
        catch (Throwable ex) {
            exit this;
            throw ex;
        }
        exit this;
    }

    public final synchronized void b(String p0, String p1) {
        enter this;
        try {
            this.a(com.google.android.finsky.bn.d.a(this.a(p0), p0).e(p1).a);
        }
        catch (Throwable ex) {
            exit this;
            throw ex;
        }
        exit this;
    }

    public final synchronized void c(String p0, int p1) {
        enter this;
        try {
            this.a(com.google.android.finsky.bn.d.a(this.a(p0), p0).d(p1).a);
        }
        catch (Throwable ex) {
            exit this;
            throw ex;
        }
        exit this;
    }

    public final synchronized void c(String p0, long p1) {
        enter this;
        try {
            this.a(com.google.android.finsky.bn.d.a(this.a(p0), p0).c(p1).a);
        }
        catch (Throwable ex) {
            exit this;
            throw ex;
        }
        exit this;
    }

    public final synchronized void c(String p0, String p1) {
        enter this;
        try {
            this.a(com.google.android.finsky.bn.d.a(this.a(p0), p0).f(p1).a);
        }
        catch (Throwable ex) {
            exit this;
            throw ex;
        }
        exit this;
    }

    public final synchronized void d(String p0, int p1) {
        enter this;
        try {
            this.a(com.google.android.finsky.bn.d.a(this.a(p0), p0).f(p1).a);
        }
        catch (Throwable ex) {
            exit this;
            throw ex;
        }
        exit this;
    }

    public final synchronized void d(String p0, long p1) {
        enter this;
        try {
            this.a(com.google.android.finsky.bn.d.a(this.a(p0), p0).d(p1).a);
        }
        catch (Throwable ex) {
            exit this;
            throw ex;
        }
        exit this;
    }

    public final synchronized void d(String p0, String p1) {
        enter this;
        try {
            this.a(com.google.android.finsky.bn.d.a(this.a(p0), p0).g(p1).a);
        }
        catch (Throwable ex) {
            exit this;
            throw ex;
        }
        exit this;
    }

    public final synchronized void e(String p0, int p1) {
        enter this;
        try {
            this.a(com.google.android.finsky.bn.d.a(this.a(p0), p0).g(p1).a);
        }
        catch (Throwable ex) {
            exit this;
            throw ex;
        }
        exit this;
    }

    public final synchronized void e(String p0, long p1) {
        enter this;
        try {
            this.a(com.google.android.finsky.bn.d.a(this.a(p0), p0).e(p1).a);
        }
        catch (Throwable ex) {
            exit this;
            throw ex;
        }
        exit this;
    }

    public final synchronized void e(String p0, String p1) {
        enter this;
        try {
            this.a(com.google.android.finsky.bn.d.a(this.a(p0), p0).h(p1).a);
        }
        catch (Throwable ex) {
            exit this;
            throw ex;
        }
        exit this;
    }

    public final synchronized void f(String p0, int p1) {
        enter this;
        try {
            this.a(com.google.android.finsky.bn.d.a(this.a(p0), p0).h(p1).a);
        }
        catch (Throwable ex) {
            exit this;
            throw ex;
        }
        exit this;
    }

}
