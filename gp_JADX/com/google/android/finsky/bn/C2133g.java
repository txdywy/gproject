package com.google.android.finsky.bn;

import android.content.Context;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.google.android.finsky.utils.FinskyLog;

final class C2133g extends SQLiteOpenHelper {
    public C2133g(Context context, String str) {
        super(context, C2132f.m11165b(str), null, 33);
    }

    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE appstate (package_name STRING, auto_update INTEGER, desired_version INTEGER, download_uri STRING, delivery_data BLOB, delivery_data_timestamp_ms INTEGER,installer_state INTEGER, first_download_ms INTEGER, referrer STRING, account STRING, title STRING,flags INTEGER, continue_url STRING, last_notified_version INTEGER, last_update_timestamp_ms INTEGER, account_for_update STRING, auto_acquire_tags STRING, external_referrer_timestamp_ms INTEGER, persistent_flags INTEGER, permissions_version INTEGER, delivery_token STRING,completed_split_ids STRING, active_split_id STRING, request_id STRING,managed_configuration_token BLOB, total_completed_bytes_downloaded INTEGER,app_details BLOB, install_client_event_id INTEGER,last_client_event_id INTEGER, requesting_package_name STRING,update_discovered_timestamp_ms INTEGER, install_logging_context BLOB, logging_context BLOB, install_request_timestamp_ms INTEGER, desired_derived_apk_id INTEGER, notification_intent STRING, auto_update_flow_policy BLOB, install_reason STRING, sandbox_version INTEGER,requested_modules TEXT, install_request_data BLOB,PRIMARY KEY (package_name))");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onUpgrade(android.database.sqlite.SQLiteDatabase r2, int r3, int r4) {
        /*
        r1 = this;
        switch(r3) {
            case 7: goto L_0x0007;
            case 8: goto L_0x000c;
            case 9: goto L_0x0011;
            case 10: goto L_0x0016;
            case 11: goto L_0x001b;
            case 12: goto L_0x0020;
            case 13: goto L_0x0025;
            case 14: goto L_0x002a;
            case 15: goto L_0x0034;
            case 16: goto L_0x0039;
            case 17: goto L_0x0043;
            case 18: goto L_0x0048;
            case 19: goto L_0x004d;
            case 20: goto L_0x0052;
            case 21: goto L_0x0057;
            case 22: goto L_0x0061;
            case 23: goto L_0x0066;
            case 24: goto L_0x006b;
            case 25: goto L_0x0075;
            case 26: goto L_0x007a;
            case 27: goto L_0x007f;
            case 28: goto L_0x0084;
            case 29: goto L_0x0089;
            case 30: goto L_0x008e;
            case 31: goto L_0x0093;
            case 32: goto L_0x0098;
            default: goto L_0x0003;
        };
    L_0x0003:
        r1.m11191a(r2);
    L_0x0006:
        return;
    L_0x0007:
        r0 = "ALTER TABLE appstate ADD COLUMN continue_url STRING";
        r2.execSQL(r0);
    L_0x000c:
        r0 = "ALTER TABLE appstate ADD COLUMN delivery_data_timestamp_ms INTEGER";
        r2.execSQL(r0);
    L_0x0011:
        r0 = "ALTER TABLE appstate ADD COLUMN last_notified_version INTEGER";
        r2.execSQL(r0);
    L_0x0016:
        r0 = "ALTER TABLE appstate ADD COLUMN last_update_timestamp_ms INTEGER";
        r2.execSQL(r0);
    L_0x001b:
        r0 = "ALTER TABLE appstate ADD COLUMN account_for_update STRING";
        r2.execSQL(r0);
    L_0x0020:
        r0 = "ALTER TABLE appstate ADD COLUMN auto_acquire_tags STRING";
        r2.execSQL(r0);
    L_0x0025:
        r0 = "ALTER TABLE appstate ADD COLUMN external_referrer_timestamp_ms INTEGER";
        r2.execSQL(r0);
    L_0x002a:
        r0 = "ALTER TABLE appstate ADD COLUMN persistent_flags INTEGER";
        r2.execSQL(r0);
        r0 = "ALTER TABLE appstate ADD COLUMN permissions_version INTEGER";
        r2.execSQL(r0);
    L_0x0034:
        r0 = "ALTER TABLE appstate ADD COLUMN delivery_token STRING";
        r2.execSQL(r0);
    L_0x0039:
        r0 = "ALTER TABLE appstate ADD COLUMN completed_split_ids STRING";
        r2.execSQL(r0);
        r0 = "ALTER TABLE appstate ADD COLUMN active_split_id STRING";
        r2.execSQL(r0);
    L_0x0043:
        r0 = "ALTER TABLE appstate ADD COLUMN request_id STRING";
        r2.execSQL(r0);
    L_0x0048:
        r0 = "ALTER TABLE appstate ADD COLUMN managed_configuration_token BLOB";
        r2.execSQL(r0);
    L_0x004d:
        r0 = "ALTER TABLE appstate ADD COLUMN total_completed_bytes_downloaded INTEGER";
        r2.execSQL(r0);
    L_0x0052:
        r0 = "ALTER TABLE appstate ADD COLUMN app_details BLOB";
        r2.execSQL(r0);
    L_0x0057:
        r0 = "ALTER TABLE appstate ADD COLUMN install_client_event_id INTEGER";
        r2.execSQL(r0);
        r0 = "ALTER TABLE appstate ADD COLUMN last_client_event_id INTEGER";
        r2.execSQL(r0);
    L_0x0061:
        r0 = "ALTER TABLE appstate ADD COLUMN requesting_package_name STRING";
        r2.execSQL(r0);
    L_0x0066:
        r0 = "ALTER TABLE appstate ADD COLUMN update_discovered_timestamp_ms INTEGER";
        r2.execSQL(r0);
    L_0x006b:
        r0 = "ALTER TABLE appstate ADD COLUMN install_logging_context BLOB";
        r2.execSQL(r0);
        r0 = "ALTER TABLE appstate ADD COLUMN logging_context BLOB";
        r2.execSQL(r0);
    L_0x0075:
        r0 = "ALTER TABLE appstate ADD COLUMN install_request_timestamp_ms INTEGER";
        r2.execSQL(r0);
    L_0x007a:
        r0 = "ALTER TABLE appstate ADD COLUMN desired_derived_apk_id INTEGER";
        r2.execSQL(r0);
    L_0x007f:
        r0 = "ALTER TABLE appstate ADD COLUMN notification_intent STRING";
        r2.execSQL(r0);
    L_0x0084:
        r0 = "ALTER TABLE appstate ADD COLUMN auto_update_flow_policy BLOB";
        r2.execSQL(r0);
    L_0x0089:
        r0 = "ALTER TABLE appstate ADD COLUMN install_reason STRING";
        r2.execSQL(r0);
    L_0x008e:
        r0 = "ALTER TABLE appstate ADD COLUMN sandbox_version INTEGER default 1";
        r2.execSQL(r0);
    L_0x0093:
        r0 = "ALTER TABLE appstate ADD COLUMN requested_modules TEXT";
        r2.execSQL(r0);
    L_0x0098:
        r0 = "ALTER TABLE appstate ADD COLUMN install_request_data BLOB";
        r2.execSQL(r0);
        goto L_0x0006;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.finsky.bn.g.onUpgrade(android.database.sqlite.SQLiteDatabase, int, int):void");
    }

    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        FinskyLog.m21659a("Downgrading InstallerDataStore from %d to %d", Integer.valueOf(i), Integer.valueOf(i2));
        m11191a(sQLiteDatabase);
    }

    private final void m11191a(SQLiteDatabase sQLiteDatabase) {
        try {
            sQLiteDatabase.execSQL("DROP TABLE appstate");
        } catch (SQLException e) {
            FinskyLog.m21665c("Unable to drop table: %s", e);
        }
        onCreate(sQLiteDatabase);
    }
}
