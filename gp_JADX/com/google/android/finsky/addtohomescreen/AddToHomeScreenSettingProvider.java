package com.google.android.finsky.addtohomescreen;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import com.google.android.finsky.aa.C0968o;
import com.google.android.finsky.bx.C2195a;
import com.google.android.finsky.utils.FinskyLog;
import com.google.p169b.p170a.p171a.p172a.p173a.p174a.C6331c;

public class AddToHomeScreenSettingProvider extends ContentProvider {
    public boolean onCreate() {
        C6331c.m28983a((ContentProvider) this, C2195a.f10984a);
        return true;
    }

    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        int i;
        Cursor matrixCursor = new MatrixCursor(new String[]{"value"});
        Object[] objArr = new Object[1];
        if (((Boolean) C0968o.f5934k.m5760a()).booleanValue()) {
            i = 1;
        } else {
            i = 0;
        }
        objArr[0] = Integer.valueOf(i);
        matrixCursor.addRow(objArr);
        return matrixCursor;
    }

    public String getType(Uri uri) {
        return "vnd.android.cursor.item/vnd.com.android.vending.addtohomescreen";
    }

    public Uri insert(Uri uri, ContentValues contentValues) {
        FinskyLog.m21667d("Inserting into this content provider is unsupported.", new Object[0]);
        return null;
    }

    public int delete(Uri uri, String str, String[] strArr) {
        FinskyLog.m21667d("Deleting from this content provider is unsupported.", new Object[0]);
        return 0;
    }

    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        FinskyLog.m21667d("Updating rows in this content provider is unsupported.", new Object[0]);
        return 0;
    }
}
