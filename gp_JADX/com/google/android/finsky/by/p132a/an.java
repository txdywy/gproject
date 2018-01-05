package com.google.android.finsky.by.p132a;

import android.content.Context;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.google.android.finsky.utils.FinskyLog;

final class an extends SQLiteOpenHelper {
    public an(Context context) {
        super(context, "library.db", null, 12);
    }

    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE ownership (account STRING, library_id STRING, backend INTEGER, doc_id STRING, doc_type INTEGER, offer_type INTEGER, document_hash INTEGER, subs_valid_until_time INTEGER, app_certificate_hash STRING, app_refund_pre_delivery_endtime_ms INTEGER, app_refund_post_delivery_window_ms INTEGER, subs_auto_renewing INTEGER, subs_initiation_time INTEGER, subs_trial_until_time INTEGER, inapp_purchase_data STRING, inapp_signature STRING, preordered INTEGER, owned_via_license INTEGER, shared_by_me INTEGER, sharer_gaia_id TEXT, shareability INTEGER, purchase_time INTEGER, PRIMARY KEY (account, library_id, backend, doc_id, doc_type, offer_type))");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onUpgrade(android.database.sqlite.SQLiteDatabase r2, int r3, int r4) {
        /*
        r1 = this;
        switch(r3) {
            case 5: goto L_0x0007;
            case 6: goto L_0x0011;
            case 7: goto L_0x0011;
            case 8: goto L_0x0016;
            case 9: goto L_0x001b;
            case 10: goto L_0x0020;
            case 11: goto L_0x002a;
            default: goto L_0x0003;
        };
    L_0x0003:
        r1.m11564a(r2);
    L_0x0006:
        return;
    L_0x0007:
        r0 = "ALTER TABLE ownership ADD COLUMN inapp_purchase_data STRING";
        r2.execSQL(r0);
        r0 = "ALTER TABLE ownership ADD COLUMN inapp_signature STRING";
        r2.execSQL(r0);
    L_0x0011:
        r0 = "ALTER TABLE ownership ADD COLUMN preordered INTEGER";
        r2.execSQL(r0);
    L_0x0016:
        r0 = "ALTER TABLE ownership ADD COLUMN owned_via_license INTEGER";
        r2.execSQL(r0);
    L_0x001b:
        r0 = "ALTER TABLE ownership ADD COLUMN shared_by_me INTEGER";
        r2.execSQL(r0);
    L_0x0020:
        r0 = "ALTER TABLE ownership ADD COLUMN sharer_gaia_id TEXT";
        r2.execSQL(r0);
        r0 = "ALTER TABLE ownership ADD COLUMN shareability INTEGER";
        r2.execSQL(r0);
    L_0x002a:
        r0 = "ALTER TABLE ownership ADD COLUMN purchase_time INTEGER";
        r2.execSQL(r0);
        goto L_0x0006;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.finsky.by.a.an.onUpgrade(android.database.sqlite.SQLiteDatabase, int, int):void");
    }

    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        FinskyLog.m21659a("Downgrading Library from %d to %d", Integer.valueOf(i), Integer.valueOf(i2));
        m11564a(sQLiteDatabase);
    }

    private final void m11564a(SQLiteDatabase sQLiteDatabase) {
        try {
            sQLiteDatabase.execSQL("DROP TABLE ownership");
        } catch (SQLException e) {
        }
        onCreate(sQLiteDatabase);
    }
}
