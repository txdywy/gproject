package com.google.android.gms.peerdownloadmanager.p303g;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import com.google.android.gms.common.util.C5148c;

public final class C5495a extends C5148c {
    public C5495a(Context context) {
        super(context, "peerdownloadmanager.db", 6);
    }

    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE requests (_id INTEGER PRIMARY KEY,package_name TEXT,certificate_hash TEXT,request_key TEXT,expiry INTEGER,is_asset INTEGER, UNIQUE(package_name, certificate_hash, request_key, is_asset))");
    }

    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS requests");
        onCreate(sQLiteDatabase);
    }

    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        onUpgrade(sQLiteDatabase, i, i2);
    }
}
