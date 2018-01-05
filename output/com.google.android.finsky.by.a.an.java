package com.google.android.finsky.by.a;

import android.content.Context;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.google.android.finsky.utils.FinskyLog;

public final class com.google.android.finsky.by.a.an extends SQLiteOpenHelper
{

    an(Context p0) {
        SQLiteOpenHelper(p0, "library.db", 0, 12);
    }

    private final void a(SQLiteDatabase p0) {
        try {
            p0.execSQL("DROP TABLE ownership");
        }
        catch (SQLException ex) {
        }
        this.onCreate(p0);
    }

    public final void onCreate(SQLiteDatabase p0) {
        p0.execSQL("CREATE TABLE ownership (account STRING, library_id STRING, backend INTEGER, doc_id STRING, doc_type INTEGER, offer_type INTEGER, document_hash INTEGER, subs_valid_until_time INTEGER, app_certificate_hash STRING, app_refund_pre_delivery_endtime_ms INTEGER, app_refund_post_delivery_window_ms INTEGER, subs_auto_renewing INTEGER, subs_initiation_time INTEGER, subs_trial_until_time INTEGER, inapp_purchase_data STRING, inapp_signature STRING, preordered INTEGER, owned_via_license INTEGER, shared_by_me INTEGER, sharer_gaia_id TEXT, shareability INTEGER, purchase_time INTEGER, PRIMARY KEY (account, library_id, backend, doc_id, doc_type, offer_type))");
    }

    public final void onDowngrade(SQLiteDatabase p0, int p1, int p2) {
        v1 = new Object[2];
        v1[0] = Integer.valueOf(p1);
        v1[1] = Integer.valueOf(p2);
        FinskyLog.a("Downgrading Library from %d to %d", v1);
        this.a(p0);
    }

    public final void onUpgrade(SQLiteDatabase p0, int p1, int p2) {
        switch (p1) {
            case 5:
                p0.execSQL("ALTER TABLE ownership ADD COLUMN inapp_purchase_data STRING");
                p0.execSQL("ALTER TABLE ownership ADD COLUMN inapp_signature STRING");
                p0.execSQL("ALTER TABLE ownership ADD COLUMN preordered INTEGER");
                p0.execSQL("ALTER TABLE ownership ADD COLUMN owned_via_license INTEGER");
                p0.execSQL("ALTER TABLE ownership ADD COLUMN shared_by_me INTEGER");
                p0.execSQL("ALTER TABLE ownership ADD COLUMN sharer_gaia_id TEXT");
                p0.execSQL("ALTER TABLE ownership ADD COLUMN shareability INTEGER");
                p0.execSQL("ALTER TABLE ownership ADD COLUMN purchase_time INTEGER");
                break;
            case 6:
                p0.execSQL("ALTER TABLE ownership ADD COLUMN preordered INTEGER");
                p0.execSQL("ALTER TABLE ownership ADD COLUMN owned_via_license INTEGER");
                p0.execSQL("ALTER TABLE ownership ADD COLUMN shared_by_me INTEGER");
                p0.execSQL("ALTER TABLE ownership ADD COLUMN sharer_gaia_id TEXT");
                p0.execSQL("ALTER TABLE ownership ADD COLUMN shareability INTEGER");
                p0.execSQL("ALTER TABLE ownership ADD COLUMN purchase_time INTEGER");
                break;
            case 7:
                p0.execSQL("ALTER TABLE ownership ADD COLUMN preordered INTEGER");
                p0.execSQL("ALTER TABLE ownership ADD COLUMN owned_via_license INTEGER");
                p0.execSQL("ALTER TABLE ownership ADD COLUMN shared_by_me INTEGER");
                p0.execSQL("ALTER TABLE ownership ADD COLUMN sharer_gaia_id TEXT");
                p0.execSQL("ALTER TABLE ownership ADD COLUMN shareability INTEGER");
                p0.execSQL("ALTER TABLE ownership ADD COLUMN purchase_time INTEGER");
                break;
            case 8:
                p0.execSQL("ALTER TABLE ownership ADD COLUMN owned_via_license INTEGER");
                p0.execSQL("ALTER TABLE ownership ADD COLUMN shared_by_me INTEGER");
                p0.execSQL("ALTER TABLE ownership ADD COLUMN sharer_gaia_id TEXT");
                p0.execSQL("ALTER TABLE ownership ADD COLUMN shareability INTEGER");
                p0.execSQL("ALTER TABLE ownership ADD COLUMN purchase_time INTEGER");
                break;
            case 9:
                p0.execSQL("ALTER TABLE ownership ADD COLUMN shared_by_me INTEGER");
                p0.execSQL("ALTER TABLE ownership ADD COLUMN sharer_gaia_id TEXT");
                p0.execSQL("ALTER TABLE ownership ADD COLUMN shareability INTEGER");
                p0.execSQL("ALTER TABLE ownership ADD COLUMN purchase_time INTEGER");
                break;
            case 10:
                p0.execSQL("ALTER TABLE ownership ADD COLUMN sharer_gaia_id TEXT");
                p0.execSQL("ALTER TABLE ownership ADD COLUMN shareability INTEGER");
                p0.execSQL("ALTER TABLE ownership ADD COLUMN purchase_time INTEGER");
                break;
            case 11:
                p0.execSQL("ALTER TABLE ownership ADD COLUMN purchase_time INTEGER");
                break;
            default:
                this.a(p0);
                break;
        }
    }

}
