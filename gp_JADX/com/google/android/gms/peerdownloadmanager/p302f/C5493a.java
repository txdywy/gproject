package com.google.android.gms.peerdownloadmanager.p302f;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import com.google.android.gms.common.util.C5148c;

public final class C5493a extends C5148c {
    public C5493a(Context context) {
        super(context, "peerdownloadmanager_runlogs.db", 5);
    }

    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE start (_id INTEGER PRIMARY KEY,start_time INTEGER,battery_percent_start REAL,storage_left INTEGER,bt_enabled INTEGER,ble_enabled INTEGER,wifi_enabled INTEGER,wifi_connected INTEGER,wifi_hotspot_enabled INTEGER,wifi_direct_enabled INTEGER,cell_enabled INTEGER,cell_data_enabled INTEGER,airplane_mode_enabled INTEGER)");
        sQLiteDatabase.execSQL("CREATE TABLE stop (_id INTEGER PRIMARY KEY,run_id INTEGER UNIQUE,end_time INTEGER,shutdown_reason INTEGER,shutdown_duration INTEGER,battery_percent_end REAL, FOREIGN KEY (run_id) REFERENCES start(_id))");
        sQLiteDatabase.execSQL("CREATE TABLE request (_id INTEGER PRIMARY KEY,run_id INTEGER,app_key TEXT,request_key TEXT,is_asset INTEGER, REAL, FOREIGN KEY (run_id) REFERENCES start(_id))");
        sQLiteDatabase.execSQL("CREATE TABLE device_info (_id INTEGER PRIMARY KEY,run_id INTEGER UNIQUE,ble INTEGER,ble_beacon INTEGER,wifi INTEGER,wifi_hotspot INTEGER, REAL, FOREIGN KEY (run_id) REFERENCES start(_id))");
        sQLiteDatabase.execSQL("CREATE TABLE discovery (_id INTEGER PRIMARY KEY,run_id INTEGER UNIQUE,num_discovered INTEGER,num_is_master INTEGER,scan_duration INTEGER,advertise_duration INTEGER, REAL, FOREIGN KEY (run_id) REFERENCES start(_id))");
        sQLiteDatabase.execSQL("CREATE TABLE meeting (_id INTEGER PRIMARY KEY,run_id INTEGER,num_bytes_sent INTEGER,num_bytes_received INTEGER,duration INTEGER,is_master INTEGER,duration_transfer INTEGER,is_retry INTEGER,duration_upgrade INTEGER,connection_type INTEGER, REAL, FOREIGN KEY (run_id) REFERENCES start(_id))");
        sQLiteDatabase.execSQL("CREATE TABLE meeting_key (_id INTEGER PRIMARY KEY,meeting_id INTEGER,app_key TEXT,request_key TEXT,is_send INTEGER, REAL, FOREIGN KEY (meeting_id) REFERENCES meeting(_id))");
    }

    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS meeting_key");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS meeting");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS discovery");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS device_info");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS request");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS stop");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS start");
        onCreate(sQLiteDatabase);
    }

    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        onUpgrade(sQLiteDatabase, i, i2);
    }
}
