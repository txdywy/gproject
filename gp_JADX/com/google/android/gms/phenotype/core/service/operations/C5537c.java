package com.google.android.gms.phenotype.core.service.operations;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.google.android.gms.phenotype.core.C5532k;
import com.google.android.gms.phenotype.core.C5533l;
import com.google.android.gms.phenotype.core.p304a.C5505c;
import com.google.android.gms.phenotype.core.p304a.C5507e;
import com.google.android.gms.phenotype.core.p304a.C5512j;
import com.google.common.flogger.c;
import com.google.common.flogger.d;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.logging.Level;

public final class C5537c extends C5535a {
    public static final c f28417a = c.a("com/google/android/gms/phenotype/core/service/operations/DeleteFlagOverridesOperation");
    public final String f28418b;
    public final String f28419c;
    public final String f28420d = null;

    public C5537c(String str, String str2) {
        this.f28418b = str;
        this.f28419c = str2;
    }

    public final C5533l m26491a(Context context, C5505c c5505c) {
        ((d) ((d) f28417a.a(Level.CONFIG)).a("com/google/android/gms/phenotype/core/service/operations/DeleteFlagOverridesOperation", "execute", 53, "DeleteFlagOverridesOperation.java")).a("(%s, %s, %s)", this.f28418b, this.f28419c, this.f28420d);
        List arrayList = new ArrayList();
        Set<String> hashSet = new HashSet();
        SQLiteDatabase writableDatabase = c5505c.getWritableDatabase();
        writableDatabase.beginTransaction();
        Cursor query;
        try {
            query = writableDatabase.query("FlagOverrides", C5542h.f28435a, "committed = 0", null, null, null, null);
            String[] strArr = new String[]{null, null, null};
            while (query.moveToNext()) {
                String string = query.getString(7);
                String string2 = query.getString(8);
                String string3 = query.getString(1);
                if ((this.f28418b == null || this.f28418b.equals(string)) && ((this.f28419c == null || this.f28419c.equals(string2)) && (this.f28420d == null || this.f28420d.equals(string3) || C5542h.m26505a(this.f28420d, string3)))) {
                    C5532k c5532k = new C5532k(string, string2, GetConfigurationSnapshotOperation.m26482a(query));
                    arrayList.add(c5532k);
                    hashSet.add(c5532k.f28390a);
                    strArr[0] = string;
                    strArr[1] = string2;
                    strArr[2] = string3;
                    writableDatabase.delete("FlagOverrides", "packageName = ? AND user = ? AND name = ? AND committed = 0", strArr);
                }
            }
            query.close();
            for (String b : hashSet) {
                C5507e.m26431b(writableDatabase, b);
            }
            writableDatabase.setTransactionSuccessful();
            writableDatabase.endTransaction();
            for (String a : hashSet) {
                C5512j.m26436a(context, c5505c, a);
            }
            return new C5533l(arrayList);
        } catch (Throwable th) {
            writableDatabase.endTransaction();
        }
    }
}
