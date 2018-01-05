package com.google.android.gms.peerdownloadmanager.p302f;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import com.google.android.gms.peerdownloadmanager.common.C5389t;
import com.google.android.gms.peerdownloadmanager.common.C5390u;
import java.util.Collection;
import java.util.Map.Entry;

public final class C5494b {
    public final C5493a f28255a;

    public C5494b(Context context) {
        this.f28255a = new C5493a(context);
    }

    public final long m26380a(long j, String str, String str2, boolean z) {
        SQLiteDatabase writableDatabase = this.f28255a.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("run_id", Long.valueOf(j));
        contentValues.put("app_key", str);
        contentValues.put("request_key", str2);
        contentValues.put("is_asset", Integer.valueOf(z ? 1 : 0));
        return writableDatabase.insert("request", null, contentValues);
    }

    public final long m26378a(long j, C5389t c5389t) {
        SQLiteDatabase writableDatabase = this.f28255a.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("run_id", Long.valueOf(j));
        contentValues.put("num_discovered", Integer.valueOf(c5389t.f27991a));
        contentValues.put("num_is_master", Integer.valueOf(c5389t.f27992b));
        contentValues.put("scan_duration", Long.valueOf(c5389t.f27993c));
        contentValues.put("advertise_duration", Long.valueOf(c5389t.f27994d));
        return writableDatabase.insert("discovery", null, contentValues);
    }

    public final long m26379a(long j, C5390u c5390u) {
        SQLiteDatabase writableDatabase = this.f28255a.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("run_id", Long.valueOf(j));
        contentValues.put("num_bytes_sent", Long.valueOf(c5390u.f27997c));
        contentValues.put("num_bytes_received", Long.valueOf(c5390u.f27998d));
        contentValues.put("duration", Long.valueOf(c5390u.f27999e));
        contentValues.put("is_master", Integer.valueOf(c5390u.f28000f ? 1 : 0));
        contentValues.put("duration_transfer", Long.valueOf(c5390u.f28001g));
        contentValues.put("is_retry", Integer.valueOf(c5390u.f28002h ? 1 : 0));
        contentValues.put("duration_upgrade", Long.valueOf(c5390u.f28003i));
        contentValues.put("connection_type", Integer.valueOf(c5390u.f28004j));
        long insert = writableDatabase.insert("meeting", null, contentValues);
        for (Entry entry : c5390u.f27995a.entrySet()) {
            String str = (String) entry.getKey();
            for (String str2 : (Collection) entry.getValue()) {
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("meeting_id", Long.valueOf(insert));
                contentValues2.put("app_key", str);
                contentValues2.put("request_key", str2);
                contentValues2.put("is_send", Integer.valueOf(1));
                writableDatabase.insert("meeting_key", null, contentValues2);
            }
        }
        for (Entry entry2 : c5390u.f27996b.entrySet()) {
            str = (String) entry2.getKey();
            for (String str22 : (Collection) entry2.getValue()) {
                contentValues2 = new ContentValues();
                contentValues2.put("meeting_id", Long.valueOf(insert));
                contentValues2.put("app_key", str);
                contentValues2.put("request_key", str22);
                contentValues2.put("is_send", Integer.valueOf(0));
                writableDatabase.insert("meeting_key", null, contentValues2);
            }
        }
        return insert;
    }
}
