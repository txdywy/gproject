package com.google.android.finsky.addtohomescreen;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import com.google.android.finsky.aa.n;
import com.google.android.finsky.aa.o;
import com.google.android.finsky.bx.a;
import com.google.android.finsky.utils.FinskyLog;
import com.google.b.a.a.a.a.a.c;

public class AddToHomeScreenSettingProvider extends ContentProvider
{

    AddToHomeScreenSettingProvider() {
        ContentProvider();
    }

    public int delete(Uri p0, String p1, String[] p2) {
        FinskyLog.d("Deleting from this content provider is unsupported.", new Object[0]);
        return 0;
    }

    public String getType(Uri p0) {
        return "vnd.android.cursor.item/vnd.com.android.vending.addtohomescreen";
    }

    public Uri insert(Uri p0, ContentValues p1) {
        FinskyLog.d("Inserting into this content provider is unsupported.", new Object[0]);
        return 0;
    }

    public boolean onCreate() {
        com.google.b.a.a.a.a.a.c.a(this, com.google.android.finsky.bx.a.a);
        return 1;
    }

    public Cursor query(Uri p0, String[] p1, String p2, String[] p3, String p4) {
        v0 = new String[1];
        v0[0] = "value";
        v3 = new MatrixCursor(v0);
        v4 = new Object[1];
        if (((Boolean)com.google.android.finsky.aa.o.k.a()).booleanValue())
            v0 = 1;
        else
            v0 = 0;
        v4[0] = Integer.valueOf(v0);
        v3.addRow(v4);
        return v3;
    }

    public int update(Uri p0, ContentValues p1, String p2, String[] p3) {
        FinskyLog.d("Updating rows in this content provider is unsupported.", new Object[0]);
        return 0;
    }

}
