package com.google.android.finsky.bn;

import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.finsky.cv.p177a.C2441n;
import com.google.android.finsky.installer.p208b.p209a.C3314d;
import com.google.android.finsky.p111d.p178a.C2470a;
import com.google.android.finsky.utils.C4680k;
import com.google.android.finsky.utils.FinskyLog;
import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import com.google.wireless.android.finsky.b.a;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Collection;

public final class C2132f implements C2127b {
    public static final String[] f10836a = new String[]{"package_name", "auto_update", "desired_version", "download_uri", "delivery_data", "delivery_data_timestamp_ms", "installer_state", "first_download_ms", "referrer", "account", "title", "flags", "continue_url", "last_notified_version", "last_update_timestamp_ms", "account_for_update", "auto_acquire_tags", "external_referrer_timestamp_ms", "persistent_flags", "permissions_version", "delivery_token", "completed_split_ids", "active_split_id", "request_id", "managed_configuration_token", "total_completed_bytes_downloaded", "app_details", "install_client_event_id", "last_client_event_id", "requesting_package_name", "update_discovered_timestamp_ms", "install_logging_context", "logging_context", "install_request_timestamp_ms", "desired_derived_apk_id", "notification_intent", "auto_update_flow_policy", "install_reason", "sandbox_version", "requested_modules", "install_request_data"};
    public static final String[] f10837b = new String[0];
    public final C2133g f10838c;

    public C2132f(Context context, String str) {
        this.f10838c = new C2133g(context, str);
    }

    public static String m11165b(String str) {
        if (TextUtils.isEmpty(str)) {
            return "localappstate.db";
        }
        String encode = Uri.encode(str);
        return new StringBuilder(String.valueOf(encode).length() + 17).append("node-appstate-").append(encode).append(".db").toString();
    }

    public static String[] getDatabaseNodes(Context context) {
        ArrayList arrayList = null;
        for (String str : context.databaseList()) {
            if (str.startsWith("node-appstate-") && str.endsWith(".db")) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(Uri.decode(str.substring(14, str.length() - 3)));
            }
        }
        if (arrayList == null) {
            return f10837b;
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public static void m11164a(Context context, String str) {
        context.deleteDatabase(C2132f.m11165b(str));
    }

    public final synchronized C2129c mo2657a(String str) {
        C2129c c2129c;
        Cursor query = this.f10838c.getWritableDatabase().query("appstate", f10836a, "package_name=?", new String[]{str}, null, null, null);
        try {
            if (query.getCount() != 1) {
                c2129c = null;
            } else {
                query.moveToNext();
                c2129c = C2132f.m11163a(query);
                query.close();
            }
        } finally {
            query.close();
        }
        return c2129c;
    }

    public final synchronized Collection mo2658a() {
        Collection arrayList;
        Cursor query = this.f10838c.getWritableDatabase().query("appstate", f10836a, null, null, null, null, null);
        arrayList = new ArrayList(query.getCount());
        while (query.moveToNext()) {
            try {
                arrayList.add(C2132f.m11163a(query));
            } catch (Throwable th) {
                query.close();
            }
        }
        query.close();
        return arrayList;
    }

    public final synchronized void mo2659a(C2129c c2129c) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("package_name", c2129c.f10807a);
        contentValues.put("auto_update", Integer.valueOf(c2129c.f10808b));
        contentValues.put("desired_version", Integer.valueOf(c2129c.f10809c));
        contentValues.put("sandbox_version", Integer.valueOf(c2129c.f10804K));
        contentValues.put("download_uri", c2129c.f10814h);
        if (c2129c.f10811e != null) {
            contentValues.put("delivery_data", C0757i.m4909a(c2129c.f10811e));
        } else {
            contentValues.putNull("delivery_data");
        }
        contentValues.put("delivery_data_timestamp_ms", Long.valueOf(c2129c.f10812f));
        contentValues.put("installer_state", Integer.valueOf(c2129c.f10813g));
        contentValues.put("first_download_ms", Long.valueOf(c2129c.f10816j));
        contentValues.put("referrer", c2129c.f10817k);
        contentValues.put("account", c2129c.f10815i);
        contentValues.put("title", c2129c.f10818l);
        contentValues.put("flags", Integer.valueOf(c2129c.f10819m));
        contentValues.put("continue_url", c2129c.f10820n);
        contentValues.put("last_notified_version", Integer.valueOf(c2129c.f10810d));
        contentValues.put("last_update_timestamp_ms", Long.valueOf(c2129c.f10821o));
        contentValues.put("account_for_update", c2129c.f10822p);
        contentValues.put("external_referrer_timestamp_ms", Long.valueOf(c2129c.f10823q));
        contentValues.put("persistent_flags", Integer.valueOf(c2129c.f10824r));
        contentValues.put("permissions_version", Integer.valueOf(c2129c.f10825s));
        contentValues.put("delivery_token", c2129c.f10826t);
        contentValues.put("completed_split_ids", C4680k.m21817a(c2129c.m11117a()));
        contentValues.put("active_split_id", c2129c.f10828v);
        contentValues.put("request_id", c2129c.f10829w);
        contentValues.put("managed_configuration_token", c2129c.f10830x);
        contentValues.put("total_completed_bytes_downloaded", Long.valueOf(c2129c.f10831y));
        if (c2129c.f10832z != null) {
            contentValues.put("app_details", C0757i.m4909a(c2129c.f10832z));
        } else {
            contentValues.putNull("app_details");
        }
        contentValues.put("install_client_event_id", Long.valueOf(c2129c.f10794A));
        contentValues.put("last_client_event_id", Long.valueOf(c2129c.f10795B));
        contentValues.put("requesting_package_name", c2129c.f10796C);
        contentValues.put("update_discovered_timestamp_ms", Long.valueOf(c2129c.f10797D));
        contentValues.put("install_logging_context", C0757i.m4909a(c2129c.m11119c()));
        contentValues.put("logging_context", C0757i.m4909a(c2129c.m11120d()));
        contentValues.put("install_request_timestamp_ms", Long.valueOf(c2129c.f10800G));
        contentValues.put("desired_derived_apk_id", Integer.valueOf(c2129c.f10802I));
        contentValues.put("install_reason", c2129c.f10801H);
        if (c2129c.f10803J != null) {
            contentValues.put("notification_intent", c2129c.f10803J.toUri(1));
        } else {
            contentValues.putNull("notification_intent");
        }
        contentValues.put("requested_modules", C4680k.m21817a(c2129c.f10805L));
        if (c2129c.f10806M != null) {
            contentValues.put("install_request_data", C0757i.m4909a(c2129c.f10806M));
        } else {
            contentValues.putNull("install_request_data");
        }
        this.f10838c.getWritableDatabase().replace("appstate", null, contentValues);
    }

    public final synchronized void mo2660a(C2131e c2131e) {
        if (this.f10838c.getWritableDatabase().update("appstate", c2131e.f10834a, "package_name = ?", new String[]{c2131e.f10835b}) == 0) {
            this.f10838c.getWritableDatabase().insert("appstate", null, c2131e.f10834a);
        }
    }

    private static C2129c m11163a(Cursor cursor) {
        int i;
        int i2;
        int i3;
        int i4;
        C2470a c2470a;
        int i5;
        Object obj;
        String string = cursor.getString(0);
        if (cursor.isNull(1)) {
            i = 0;
        } else {
            i = cursor.getInt(1);
        }
        if (cursor.isNull(2)) {
            i2 = -1;
        } else {
            i2 = cursor.getInt(2);
        }
        if (cursor.isNull(38)) {
            i3 = 1;
        } else {
            i3 = cursor.getInt(38);
        }
        if (cursor.isNull(13)) {
            i4 = -1;
        } else {
            i4 = cursor.getInt(13);
        }
        a aVar = null;
        if (!cursor.isNull(4)) {
            try {
                aVar = a.a(cursor.getBlob(4));
            } catch (InvalidProtocolBufferNanoException e) {
                FinskyLog.m21665c("Couldn't parse blob as AndroidAppDeliveryData: %s", e);
            }
        }
        long j = cursor.getLong(5);
        int i6 = cursor.getInt(6);
        String string2 = cursor.getString(3);
        long j2 = cursor.getLong(7);
        String string3 = cursor.getString(8);
        String string4 = cursor.getString(9);
        String string5 = cursor.getString(10);
        int i7 = cursor.getInt(11);
        String string6 = cursor.getString(12);
        long j3 = cursor.getLong(14);
        String string7 = cursor.getString(15);
        long j4 = cursor.getLong(17);
        int i8 = cursor.getInt(18);
        int i9 = cursor.getInt(19);
        String string8 = cursor.getString(20);
        String str = null;
        if (!cursor.isNull(21)) {
            str = cursor.getString(21);
        }
        String[] a = C4680k.m21818a(str);
        String string9 = cursor.getString(22);
        String string10 = cursor.getString(23);
        byte[] blob = cursor.getBlob(24);
        long j5 = cursor.getLong(25);
        C2441n c2441n = null;
        if (!cursor.isNull(26)) {
            try {
                c2441n = C2441n.m13098a(cursor.getBlob(26));
            } catch (InvalidProtocolBufferNanoException e2) {
                FinskyLog.m21665c("Couldn't parse blob as AppDetails: %s", e2);
            }
        }
        long j6 = cursor.getLong(27);
        long j7 = cursor.getLong(28);
        String string11 = cursor.getString(29);
        long j8 = cursor.getLong(30);
        C2470a c2470a2 = null;
        C2470a c2470a3 = null;
        try {
            if (!cursor.isNull(31)) {
                c2470a2 = C2470a.m13171a(cursor.getBlob(31));
            }
            if (!cursor.isNull(32)) {
                c2470a3 = C2470a.m13171a(cursor.getBlob(32));
            }
            c2470a = c2470a3;
        } catch (Throwable e3) {
            FinskyLog.m21663b(e3, "Error while parsing LoggingContextState proto", new Object[0]);
            c2470a = null;
        }
        if (c2470a2 == null) {
            c2470a2 = new C2470a();
        }
        if (c2470a == null) {
            c2470a = new C2470a();
        }
        long j9 = cursor.getLong(33);
        if (cursor.isNull(34)) {
            i5 = 0;
        } else {
            i5 = cursor.getInt(34);
        }
        Intent intent = null;
        if (!cursor.isNull(35)) {
            try {
                intent = Intent.parseUri(cursor.getString(35), 1);
            } catch (URISyntaxException e4) {
                FinskyLog.m21665c("Could not parse string as WebAPK notification intent: %s", FinskyLog.m21655a(str));
            }
        }
        String string12 = cursor.getString(37);
        if (TextUtils.isEmpty(string12)) {
            string12 = "unknown";
        }
        String[] strArr = null;
        if (!cursor.isNull(39)) {
            strArr = C4680k.m21818a(cursor.getString(39));
            if (strArr.length == 0) {
                strArr = null;
            }
        }
        C3314d c3314d = null;
        if (!cursor.isNull(40)) {
            try {
                c3314d = C3314d.m16660a(cursor.getBlob(40));
            } catch (Throwable e5) {
                FinskyLog.m21663b(e5, "Error while parsing InstallRequestData proto", new Object[0]);
            }
        }
        C2129c c2129c = new C2129c(string, i, i2, i3, i4, aVar, j, i6, string2, j2, string3, string6, string4, string5, i7, j3, string7, j4, i8, i9, string8, a, string9, string10, blob, j5, c2441n, j6, j7, string11, j8, c2470a2, c2470a, j9, i5, intent, string12, strArr, c3314d);
        i = c2129c.f10819m;
        int i10 = c2129c.f10824r;
        int i11 = c2129c.f10825s;
        int i12;
        if ((i & 64) != 0) {
            i12 = i10 | 1;
            i10 = i & -65;
            obj = 1;
            i2 = i12;
        } else {
            i12 = i10;
            i10 = i;
            obj = null;
            i2 = i12;
        }
        if ((i10 & 256) != 0) {
            obj = 1;
            i10 &= -257;
            i11 = 1;
        }
        if (obj == null) {
            return c2129c;
        }
        C2130d c2130d = new C2130d(c2129c.f10807a);
        c2130d.m11143f(i10);
        c2130d.m11146g(i2);
        c2130d.m11148h(i11);
        return c2130d.f10833a;
    }

    public final synchronized void mo2661a(String str, int i) {
        mo2659a(C2130d.m11121a(mo2657a(str), str).m11122a(i).f10833a);
    }

    public final synchronized void mo2665a(String str, a aVar, long j) {
        mo2659a(C2130d.m11121a(mo2657a(str), str).m11126a(aVar, j).f10833a);
    }

    public final synchronized void mo2669b(String str, int i) {
        mo2659a(C2130d.m11121a(mo2657a(str), str).m11130b(i).f10833a);
    }

    public final synchronized void mo2672c(String str, int i) {
        mo2659a(C2130d.m11121a(mo2657a(str), str).m11137d(i).f10833a);
    }

    public final synchronized void mo2662a(String str, int i, String str2) {
        mo2659a(C2130d.m11121a(mo2657a(str), str).m11140e(i).m11127a(str2).f10833a);
    }

    public final synchronized void mo2663a(String str, long j) {
        mo2659a(C2130d.m11121a(mo2657a(str), str).m11123a(j).f10833a);
    }

    public final synchronized void mo2666a(String str, String str2) {
        mo2659a(C2130d.m11121a(mo2657a(str), str).m11132b(str2).f10833a);
    }

    public final synchronized void mo2675d(String str, int i) {
        mo2659a(C2130d.m11121a(mo2657a(str), str).m11143f(i).f10833a);
    }

    public final synchronized void mo2671b(String str, String str2) {
        mo2659a(C2130d.m11121a(mo2657a(str), str).m11142e(str2).f10833a);
    }

    public final synchronized void mo2674c(String str, String str2) {
        mo2659a(C2130d.m11121a(mo2657a(str), str).m11145f(str2).f10833a);
    }

    public final synchronized void mo2670b(String str, long j) {
        mo2659a(C2130d.m11121a(mo2657a(str), str).m11131b(j).f10833a);
    }

    public final synchronized void mo2678e(String str, int i) {
        mo2659a(C2130d.m11121a(mo2657a(str), str).m11146g(i).f10833a);
    }

    public final synchronized void mo2681f(String str, int i) {
        mo2659a(C2130d.m11121a(mo2657a(str), str).m11148h(i).f10833a);
    }

    public final synchronized void mo2677d(String str, String str2) {
        mo2659a(C2130d.m11121a(mo2657a(str), str).m11147g(str2).f10833a);
    }

    public final synchronized void mo2668a(String str, String[] strArr) {
        mo2659a(C2130d.m11121a(mo2657a(str), str).m11129a(strArr).f10833a);
    }

    public final synchronized void mo2680e(String str, String str2) {
        mo2659a(C2130d.m11121a(mo2657a(str), str).m11149h(str2).f10833a);
    }

    public final synchronized void mo2667a(String str, byte[] bArr) {
        mo2659a(C2130d.m11121a(mo2657a(str), str).m11128a(bArr).f10833a);
    }

    public final synchronized void mo2673c(String str, long j) {
        mo2659a(C2130d.m11121a(mo2657a(str), str).m11135c(j).f10833a);
    }

    public final synchronized void mo2664a(String str, C2441n c2441n) {
        mo2659a(C2130d.m11121a(mo2657a(str), str).m11124a(c2441n).f10833a);
    }

    public final synchronized void mo2676d(String str, long j) {
        mo2659a(C2130d.m11121a(mo2657a(str), str).m11138d(j).f10833a);
    }

    public final synchronized void mo2679e(String str, long j) {
        mo2659a(C2130d.m11121a(mo2657a(str), str).m11141e(j).f10833a);
    }
}
