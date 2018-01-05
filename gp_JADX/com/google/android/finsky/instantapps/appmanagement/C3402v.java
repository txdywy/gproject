package com.google.android.finsky.instantapps.appmanagement;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.database.Cursor;
import android.net.Uri;
import android.support.v4.p037h.C0305a;
import android.util.Log;
import com.google.android.gms.instantapps.p286a.p287a.C5258a;
import com.google.android.instantapps.common.p217e.bf;
import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import java.util.Map;

public final class C3402v {
    public static final Uri f17415a = Uri.parse("content://com.google.android.gms.instantapps.provider.api/snoozedApps");
    public final Context f17416b;
    public final PackageManager f17417c;
    public final bf f17418d;

    public C3402v(Context context, PackageManager packageManager, bf bfVar) {
        this.f17416b = context;
        this.f17417c = packageManager;
        this.f17418d = bfVar;
    }

    public final Map m16902a() {
        Map c0305a = new C0305a();
        Cursor query = this.f17416b.getContentResolver().query(f17415a, null, null, null, null);
        if (query != null) {
            while (query.moveToNext()) {
                int columnIndex = query.getColumnIndex("packageName");
                if (columnIndex == -1) {
                    Log.e("SnoozedAppsFetcher", "Could not find packageName column in cursor!");
                } else {
                    int columnIndex2 = query.getColumnIndex("appOverrides");
                    if (columnIndex2 == -1) {
                        Log.e("SnoozedAppsFetcher", "Could not find appOverrides column in cursor!");
                    } else {
                        String string = query.getString(columnIndex);
                        String str;
                        String str2;
                        String valueOf;
                        try {
                            C5258a c5258a = (C5258a) C0757i.m4905a(new C5258a(), query.getBlob(columnIndex2));
                            if (m16901a(string)) {
                                str = "SnoozedAppsFetcher";
                                str2 = "Hiding package as installed app is found for package - ";
                                valueOf = String.valueOf(string);
                                Log.v(str, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
                            } else {
                                c0305a.put(string, Long.valueOf(c5258a.f26387a.f26388a));
                            }
                        } catch (InvalidProtocolBufferNanoException e) {
                            str = "SnoozedAppsFetcher";
                            str2 = "Unable to parse appOverrides for package ";
                            valueOf = String.valueOf(string);
                            Log.e(str, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
                        }
                    }
                }
            }
            query.close();
        }
        return c0305a;
    }

    private final boolean m16901a(String str) {
        try {
            this.f17417c.getPackageInfo(str, 0);
            return true;
        } catch (NameNotFoundException e) {
            return false;
        }
    }
}
