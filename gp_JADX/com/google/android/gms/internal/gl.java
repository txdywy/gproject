package com.google.android.gms.internal;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Build.VERSION;

final class gl extends SQLiteOpenHelper {
    public /* synthetic */ gk f26785a;

    gl(gk gkVar, Context context, String str) {
        this.f26785a = gkVar;
        super(context, str, null, 1);
    }

    public final SQLiteDatabase getWritableDatabase() {
        Object obj = 1;
        jh a = this.f26785a.f26784g;
        gj.m24437C();
        if (a.f27054b != 0 && a.f27053a.mo4630b() - a.f27054b < 3600000) {
            obj = null;
        }
        if (obj == null) {
            throw new SQLiteException("Database open failed");
        }
        SQLiteDatabase writableDatabase;
        try {
            writableDatabase = super.getWritableDatabase();
        } catch (SQLiteException e) {
            this.f26785a.f26784g.m24885a();
            this.f26785a.mo4742p().f26845d.m24652a("Opening the database failed, dropping and recreating it");
            String E = gj.m24439E();
            if (!this.f26785a.mo4736j().getDatabasePath(E).delete()) {
                this.f26785a.mo4742p().f26845d.m24653a("Failed to delete corrupted db file", E);
            }
            try {
                writableDatabase = super.getWritableDatabase();
                this.f26785a.f26784g.f27054b = 0;
            } catch (SQLiteException e2) {
                this.f26785a.mo4742p().f26845d.m24653a("Failed to open freshly created database", e2);
                throw e2;
            }
        }
        return writableDatabase;
    }

    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        gk.m24490a(this.f26785a.mo4742p(), sQLiteDatabase);
    }

    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        if (VERSION.SDK_INT < 15) {
            Cursor rawQuery = sQLiteDatabase.rawQuery("PRAGMA journal_mode=memory", null);
            try {
                rawQuery.moveToFirst();
            } finally {
                rawQuery.close();
            }
        }
        gk.m24491a(this.f26785a.mo4742p(), sQLiteDatabase, "events", "CREATE TABLE IF NOT EXISTS events ( app_id TEXT NOT NULL, name TEXT NOT NULL, lifetime_count INTEGER NOT NULL, current_bundle_count INTEGER NOT NULL, last_fire_timestamp INTEGER NOT NULL, PRIMARY KEY (app_id, name)) ;", "app_id,name,lifetime_count,current_bundle_count,last_fire_timestamp", null);
        gk.m24491a(this.f26785a.mo4742p(), sQLiteDatabase, "conditional_properties", "CREATE TABLE IF NOT EXISTS conditional_properties ( app_id TEXT NOT NULL, origin TEXT NOT NULL, name TEXT NOT NULL, value BLOB NOT NULL, creation_timestamp INTEGER NOT NULL, active INTEGER NOT NULL, trigger_event_name TEXT, trigger_timeout INTEGER NOT NULL, timed_out_event BLOB,triggered_event BLOB, triggered_timestamp INTEGER NOT NULL, time_to_live INTEGER NOT NULL, expired_event BLOB, PRIMARY KEY (app_id, name)) ;", "app_id,origin,name,value,active,trigger_event_name,trigger_timeout,creation_timestamp,timed_out_event,triggered_event,triggered_timestamp,time_to_live,expired_event", null);
        gk.m24491a(this.f26785a.mo4742p(), sQLiteDatabase, "user_attributes", "CREATE TABLE IF NOT EXISTS user_attributes ( app_id TEXT NOT NULL, name TEXT NOT NULL, set_timestamp INTEGER NOT NULL, value BLOB NOT NULL, PRIMARY KEY (app_id, name)) ;", "app_id,name,set_timestamp,value", gk.f26778a);
        gk.m24491a(this.f26785a.mo4742p(), sQLiteDatabase, "apps", "CREATE TABLE IF NOT EXISTS apps ( app_id TEXT NOT NULL, app_instance_id TEXT, gmp_app_id TEXT, resettable_device_id_hash TEXT, last_bundle_index INTEGER NOT NULL, last_bundle_end_timestamp INTEGER NOT NULL, PRIMARY KEY (app_id)) ;", "app_id,app_instance_id,gmp_app_id,resettable_device_id_hash,last_bundle_index,last_bundle_end_timestamp", gk.f26779b);
        gk.m24491a(this.f26785a.mo4742p(), sQLiteDatabase, "queue", "CREATE TABLE IF NOT EXISTS queue ( app_id TEXT NOT NULL, bundle_end_timestamp INTEGER NOT NULL, data BLOB NOT NULL);", "app_id,bundle_end_timestamp,data", gk.f26781d);
        gk.m24491a(this.f26785a.mo4742p(), sQLiteDatabase, "raw_events_metadata", "CREATE TABLE IF NOT EXISTS raw_events_metadata ( app_id TEXT NOT NULL, metadata_fingerprint INTEGER NOT NULL, metadata BLOB NOT NULL, PRIMARY KEY (app_id, metadata_fingerprint));", "app_id,metadata_fingerprint,metadata", null);
        gk.m24491a(this.f26785a.mo4742p(), sQLiteDatabase, "raw_events", "CREATE TABLE IF NOT EXISTS raw_events ( app_id TEXT NOT NULL, name TEXT NOT NULL, timestamp INTEGER NOT NULL, metadata_fingerprint INTEGER NOT NULL, data BLOB NOT NULL);", "app_id,name,timestamp,metadata_fingerprint,data", gk.f26780c);
        gk.m24491a(this.f26785a.mo4742p(), sQLiteDatabase, "event_filters", "CREATE TABLE IF NOT EXISTS event_filters ( app_id TEXT NOT NULL, audience_id INTEGER NOT NULL, filter_id INTEGER NOT NULL, event_name TEXT NOT NULL, data BLOB NOT NULL, PRIMARY KEY (app_id, event_name, audience_id, filter_id));", "app_id,audience_id,filter_id,event_name,data", null);
        gk.m24491a(this.f26785a.mo4742p(), sQLiteDatabase, "property_filters", "CREATE TABLE IF NOT EXISTS property_filters ( app_id TEXT NOT NULL, audience_id INTEGER NOT NULL, filter_id INTEGER NOT NULL, property_name TEXT NOT NULL, data BLOB NOT NULL, PRIMARY KEY (app_id, property_name, audience_id, filter_id));", "app_id,audience_id,filter_id,property_name,data", null);
        gk.m24491a(this.f26785a.mo4742p(), sQLiteDatabase, "audience_filter_values", "CREATE TABLE IF NOT EXISTS audience_filter_values ( app_id TEXT NOT NULL, audience_id INTEGER NOT NULL, current_results BLOB, PRIMARY KEY (app_id, audience_id));", "app_id,audience_id,current_results", null);
        gk.m24491a(this.f26785a.mo4742p(), sQLiteDatabase, "app2", "CREATE TABLE IF NOT EXISTS app2 ( app_id TEXT NOT NULL, first_open_count INTEGER NOT NULL, PRIMARY KEY (app_id));", "app_id,first_open_count", gk.f26782e);
    }
}
