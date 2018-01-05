package com.google.android.finsky.dy;

import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public final class ae extends SQLiteOpenHelper {
    public ae(Context context) {
        super(context, "package_verification.db", null, 12);
    }

    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE verification_cache (package_name STRING PRIMARY KEY, cache_fingerprint INTEGER, sha256_digest BLOB, length INTEGER, forward_locked INTEGER, suppress_user_warning INTEGER, threat_type STRING, verified_at_install INTEGER, install_verification_error INTEGER, verdict INTEGER, verdict_description STRING, verdict_timestamp_ms INTEGER, uninstall_timestamp_ms INTEGER, hidden INTEGER, verdict_description_locale STRING, application_title STRING, application_title_locale STRING, number_attempts INTEGER, last_install_attempt_timestamp_ms INTEGER, auto_disabled INTEGER, response_token BLOB, amputated_components TEXT, is_offline_verdict INTEGER);");
    }

    private final void m15233a(SQLiteDatabase sQLiteDatabase) {
        try {
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS verification_cache");
        } catch (SQLException e) {
        }
        onCreate(sQLiteDatabase);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onUpgrade(android.database.sqlite.SQLiteDatabase r2, int r3, int r4) {
        /*
        r1 = this;
        switch(r3) {
            case 1: goto L_0x0007;
            case 2: goto L_0x000c;
            case 3: goto L_0x0011;
            case 4: goto L_0x0016;
            case 5: goto L_0x001b;
            case 6: goto L_0x0020;
            case 7: goto L_0x0025;
            case 8: goto L_0x002a;
            case 9: goto L_0x002f;
            case 10: goto L_0x0034;
            case 11: goto L_0x0039;
            default: goto L_0x0003;
        };
    L_0x0003:
        r1.m15233a(r2);
    L_0x0006:
        return;
    L_0x0007:
        r0 = com.google.android.finsky.dy.ad.f15512b;
        m15234a(r2, r0);
    L_0x000c:
        r0 = com.google.android.finsky.dy.ad.f15513c;
        m15234a(r2, r0);
    L_0x0011:
        r0 = com.google.android.finsky.dy.ad.f15514d;
        m15234a(r2, r0);
    L_0x0016:
        r0 = com.google.android.finsky.dy.ad.f15515e;
        m15234a(r2, r0);
    L_0x001b:
        r0 = com.google.android.finsky.dy.ad.f15516f;
        m15234a(r2, r0);
    L_0x0020:
        r0 = com.google.android.finsky.dy.ad.f15517g;
        m15234a(r2, r0);
    L_0x0025:
        r0 = com.google.android.finsky.dy.ad.f15518h;
        m15234a(r2, r0);
    L_0x002a:
        r0 = com.google.android.finsky.dy.ad.f15519i;
        m15234a(r2, r0);
    L_0x002f:
        r0 = com.google.android.finsky.dy.ad.f15520j;
        m15234a(r2, r0);
    L_0x0034:
        r0 = com.google.android.finsky.dy.ad.f15521k;
        m15234a(r2, r0);
    L_0x0039:
        r0 = "is_offline_verdict";
        r0 = m15235a(r2, r0);
        if (r0 != 0) goto L_0x0006;
    L_0x0041:
        r0 = com.google.android.finsky.dy.ad.f15522l;
        m15234a(r2, r0);
        goto L_0x0006;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.finsky.dy.ae.onUpgrade(android.database.sqlite.SQLiteDatabase, int, int):void");
    }

    private static boolean m15235a(SQLiteDatabase sQLiteDatabase, String str) {
        Cursor rawQuery = sQLiteDatabase.rawQuery("PRAGMA table_info(verification_cache)", null);
        try {
            int columnIndex = rawQuery.getColumnIndex("name");
            while (rawQuery.moveToNext()) {
                if (rawQuery.getString(columnIndex).equals(str)) {
                    return true;
                }
            }
            rawQuery.close();
            return false;
        } finally {
            rawQuery.close();
        }
    }

    private static void m15234a(SQLiteDatabase sQLiteDatabase, String[] strArr) {
        for (String execSQL : strArr) {
            sQLiteDatabase.execSQL(execSQL);
        }
    }

    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        m15233a(sQLiteDatabase);
    }
}
