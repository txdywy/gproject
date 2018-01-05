package com.google.android.gms.peerdownloadmanager.p303g;

import android.content.Context;
import android.database.Cursor;
import com.google.android.gms.peerdownloadmanager.common.C5371a;
import com.google.android.gms.peerdownloadmanager.common.C5380k;
import com.google.android.gms.peerdownloadmanager.common.C5382m;
import com.google.android.gms.peerdownloadmanager.common.C5383n;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public final class C5496b {
    public final C5495a f28256a;

    public C5496b(Context context) {
        this.f28256a = new C5495a(context);
    }

    public final List m26383a(C5380k c5380k) {
        return m26382a(null, c5380k.f27956b, c5380k.f27957c);
    }

    public final List m26382a(C5371a c5371a, Collection collection, boolean z) {
        int i;
        Object obj;
        String a = C5496b.m26381a("_id", null);
        String a2 = C5496b.m26381a("request_key", collection);
        String stringBuilder = new StringBuilder((String.valueOf(a).length() + 5) + String.valueOf(a2).length()).append(a).append(" AND ").append(a2).toString();
        int size = (collection == null ? 0 : collection.size()) + 0;
        if (c5371a == null) {
            i = 0;
        } else {
            i = 2;
        }
        String[] strArr = new String[((i + size) + 1)];
        if (collection != null) {
            size = 0;
            for (String a3 : collection) {
                strArr[size] = a3;
                size++;
            }
        } else {
            size = 0;
        }
        if (c5371a != null) {
            stringBuilder = String.valueOf(stringBuilder);
            a3 = String.valueOf(" AND package_name = ?");
            Object concat = a3.length() != 0 ? stringBuilder.concat(a3) : new String(stringBuilder);
            strArr[size] = c5371a.f27935a;
            size++;
            stringBuilder = String.valueOf(concat);
            a3 = String.valueOf(" AND certificate_hash = ?");
            a3 = a3.length() != 0 ? stringBuilder.concat(a3) : new String(stringBuilder);
            strArr[size] = c5371a.f27936b;
            int i2 = size + 1;
            obj = a3;
            i = i2;
        } else {
            i = size;
            a2 = stringBuilder;
        }
        stringBuilder = String.valueOf(obj);
        a2 = String.valueOf(" AND (expiry = 0 OR expiry > ?)");
        obj = a2.length() != 0 ? stringBuilder.concat(a2) : new String(stringBuilder);
        strArr[i] = String.valueOf(System.currentTimeMillis());
        a2 = String.valueOf(obj);
        a3 = z ? "1" : "0";
        Cursor query = this.f28256a.getReadableDatabase().query("requests", new String[]{"_id", "package_name", "certificate_hash", "request_key", "expiry", "is_asset"}, new StringBuilder((String.valueOf(a2).length() + 16) + String.valueOf(a3).length()).append(a2).append(" AND is_asset = ").append(a3).toString(), strArr, null, null, null);
        try {
            List arrayList = new ArrayList(query.getCount());
            while (query.moveToNext()) {
                arrayList.add(new C5382m(new C5383n(C5371a.m26134a(query.getString(query.getColumnIndexOrThrow("package_name")), query.getString(query.getColumnIndexOrThrow("certificate_hash"))), query.getString(query.getColumnIndexOrThrow("request_key"))), query.getLong(query.getColumnIndexOrThrow("_id")), query.getLong(query.getColumnIndexOrThrow("expiry")), query.getInt(query.getColumnIndexOrThrow("is_asset")) == 1));
            }
            return arrayList;
        } finally {
            query.close();
        }
    }

    private static String m26381a(String str, Collection collection) {
        if (collection == null) {
            return "1";
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.append(" IN (");
        for (int i = 0; i < collection.size(); i++) {
            stringBuilder.append("?");
            if (i < collection.size() - 1) {
                stringBuilder.append(",");
            }
        }
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
