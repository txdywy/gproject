package com.google.android.finsky.dy;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import com.google.android.finsky.aa.C0955b;
import com.google.android.finsky.utils.C4678i;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.PatternSyntaxException;

public final class ad {
    public static final String[] f15511a = new String[]{"package_name", "cache_fingerprint", "sha256_digest", "length", "forward_locked", "suppress_user_warning", "threat_type", "verified_at_install", "install_verification_error", "verdict", "verdict_description", "verdict_timestamp_ms", "uninstall_timestamp_ms", "hidden", "verdict_description_locale", "application_title", "application_title_locale", "number_attempts", "last_install_attempt_timestamp_ms", "auto_disabled", "response_token", "amputated_components", "is_offline_verdict"};
    public static final String[] f15512b = new String[]{"ALTER TABLE verification_cache ADD COLUMN threat_type STRING;"};
    public static final String[] f15513c = new String[]{"ALTER TABLE verification_cache ADD COLUMN verified_at_install INTEGER;", "ALTER TABLE verification_cache ADD COLUMN install_verification_error INTEGER;"};
    public static final String[] f15514d = new String[]{"ALTER TABLE verification_cache ADD COLUMN verdict INTEGER;", "ALTER TABLE verification_cache ADD COLUMN verdict_description STRING;", "ALTER TABLE verification_cache ADD COLUMN verdict_timestamp_ms LONG;"};
    public static final String[] f15515e = new String[]{"ALTER TABLE verification_cache ADD COLUMN uninstall_timestamp_ms INTEGER;", "ALTER TABLE verification_cache ADD COLUMN hidden INTEGER;"};
    public static final String[] f15516f = new String[]{"ALTER TABLE verification_cache ADD COLUMN verdict_description_locale STRING;"};
    public static final String[] f15517g = new String[]{"ALTER TABLE verification_cache ADD COLUMN application_title STRING;", "ALTER TABLE verification_cache ADD COLUMN application_title_LOCALE STRING;"};
    public static final String[] f15518h = new String[]{"ALTER TABLE verification_cache ADD COLUMN number_attempts INTEGER;", "ALTER TABLE verification_cache ADD COLUMN last_install_attempt_timestamp_ms INTEGER;"};
    public static final String[] f15519i = new String[]{"ALTER TABLE verification_cache ADD COLUMN auto_disabled INTEGER;"};
    public static final String[] f15520j = new String[]{"ALTER TABLE verification_cache ADD COLUMN response_token BLOB;"};
    public static final String[] f15521k = new String[]{"ALTER TABLE verification_cache ADD COLUMN amputated_components TEXT;"};
    public static final String[] f15522l = new String[]{"ALTER TABLE verification_cache ADD COLUMN is_offline_verdict INTEGER;"};
    public final ae f15523m;

    public ad(Context context) {
        this.f15523m = new ae(context);
    }

    public final synchronized ac m15217a(String str) {
        ac acVar;
        Cursor query = this.f15523m.getWritableDatabase().query("verification_cache", f15511a, "package_name=?", new String[]{str}, null, null, null);
        try {
            if (query.getCount() != 1) {
                acVar = null;
            } else {
                query.moveToNext();
                acVar = m15215a(query);
                query.close();
            }
        } finally {
            query.close();
        }
        return acVar;
    }

    public final synchronized ac m15218a(String str, byte[] bArr) {
        ac a;
        a = m15217a(str);
        if (a == null || !Arrays.equals(a.f15489c, bArr)) {
            a = null;
        }
        return a;
    }

    public final synchronized int m15216a() {
        int i;
        Cursor query = this.f15523m.getWritableDatabase().query("verification_cache", new String[]{"count(*)"}, "cache_fingerprint>0 AND COALESCE(uninstall_timestamp_ms,0)=0 AND COALESCE(verdict,0)!=0", null, null, null, null);
        try {
            if (query.moveToNext()) {
                i = query.getInt(0);
                query.close();
            } else {
                i = 0;
            }
        } finally {
            query.close();
        }
        return i;
    }

    public final synchronized int m15227b() {
        int i;
        Cursor query = this.f15523m.getWritableDatabase().query("verification_cache", new String[]{"count(*)"}, "COALESCE(uninstall_timestamp_ms,0)!=0 and COALESCE(verdict,0)!=0 AND COALESCE(hidden,0)=0", null, null, null, null);
        try {
            if (query.moveToNext()) {
                i = query.getInt(0);
                query.close();
            } else {
                i = 0;
            }
        } finally {
            query.close();
        }
        return i;
    }

    public final List m15230c() {
        Cursor query = this.f15523m.getWritableDatabase().query("verification_cache", f15511a, "cache_fingerprint=0 AND COALESCE(uninstall_timestamp_ms,0)=0 AND COALESCE(verdict,0)!=0", null, null, null, null, null);
        try {
            List arrayList = new ArrayList();
            while (query.moveToNext()) {
                ac a = m15215a(query);
                if (a != null) {
                    arrayList.add(a);
                }
            }
            return arrayList;
        } finally {
            query.close();
        }
    }

    public final synchronized Map m15219a(boolean z, boolean z2) {
        Map hashMap;
        String str = null;
        synchronized (this) {
            Iterable arrayList = new ArrayList();
            if (!z) {
                arrayList.add("(COALESCE(uninstall_timestamp_ms,0)!=0)");
            }
            if (!z2) {
                arrayList.add("(COALESCE(uninstall_timestamp_ms,0)=0 or COALESCE(hidden,0)=1)");
            }
            arrayList.add("(COALESCE(hidden,0)=0)");
            if (arrayList.size() > 0) {
                str = TextUtils.join(" and ", arrayList);
            }
            Cursor query = this.f15523m.getWritableDatabase().query("verification_cache", f15511a, str, null, null, null, null, null);
            try {
                hashMap = new HashMap();
                while (query.moveToNext()) {
                    ac a = m15215a(query);
                    if (a != null) {
                        hashMap.put(a.f15487a, a);
                    }
                }
                query.close();
            } catch (Throwable th) {
                query.close();
            }
        }
        return hashMap;
    }

    public final synchronized void m15220a(ac acVar) {
        int i = 1;
        synchronized (this) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("package_name", acVar.f15487a);
            contentValues.put("cache_fingerprint", Long.valueOf(acVar.f15488b));
            contentValues.put("sha256_digest", acVar.f15489c);
            contentValues.put("length", Long.valueOf(acVar.f15490d));
            contentValues.put("forward_locked", Integer.valueOf(acVar.f15491e ? 1 : 0));
            String str = "suppress_user_warning";
            if (!acVar.f15492f) {
                i = 0;
            }
            contentValues.put(str, Integer.valueOf(i));
            contentValues.put("threat_type", acVar.f15493g);
            contentValues.put("verified_at_install", Boolean.valueOf(acVar.f15494h));
            contentValues.put("install_verification_error", Integer.valueOf(acVar.f15495i));
            contentValues.put("verdict", Integer.valueOf(acVar.f15496j));
            contentValues.put("verdict_description", acVar.f15497k);
            contentValues.put("verdict_timestamp_ms", Long.valueOf(acVar.f15499m));
            contentValues.put("uninstall_timestamp_ms", Long.valueOf(acVar.f15500n));
            contentValues.put("hidden", Boolean.valueOf(acVar.f15501o));
            contentValues.put("verdict_description_locale", acVar.f15498l);
            contentValues.put("application_title", acVar.f15502p);
            contentValues.put("application_title_locale", acVar.f15503q);
            contentValues.put("number_attempts", Integer.valueOf(acVar.f15504r));
            contentValues.put("last_install_attempt_timestamp_ms", Long.valueOf(acVar.f15506t));
            contentValues.put("auto_disabled", Boolean.valueOf(acVar.f15507u));
            contentValues.put("response_token", acVar.f15508v);
            if (acVar.f15509w == null || acVar.f15509w.length <= 0) {
                contentValues.put("amputated_components", null);
            } else {
                contentValues.put("amputated_components", TextUtils.join(",", acVar.f15509w));
            }
            contentValues.put("is_offline_verdict", Boolean.valueOf(acVar.f15510x));
            this.f15523m.getWritableDatabase().replace("verification_cache", null, contentValues);
        }
    }

    public final synchronized void m15228b(String str) {
        this.f15523m.getWritableDatabase().delete("verification_cache", "package_name=?", new String[]{str});
    }

    public final synchronized void m15221a(String str, long j, String str2, int i, String str3, String str4, String str5, String str6, byte[] bArr, boolean z) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("threat_type", str2);
        contentValues.put("verdict", Integer.valueOf(i));
        contentValues.put("verdict_description", str3);
        contentValues.put("verdict_description_locale", str4);
        contentValues.put("application_title", str5);
        contentValues.put("application_title_locale", str6);
        contentValues.put("verdict_timestamp_ms", Long.valueOf(C4678i.m21812a()));
        contentValues.put("response_token", bArr);
        contentValues.put("is_offline_verdict", Boolean.valueOf(z));
        this.f15523m.getWritableDatabase().update("verification_cache", contentValues, "package_name=? AND cache_fingerprint=?", new String[]{str, Long.toString(j)});
    }

    public final synchronized void m15229b(String str, byte[] bArr) {
        this.f15523m.getWritableDatabase().execSQL("UPDATE verification_cache set number_attempts=? WHERE package_name=? AND sha256_digest=?", new Object[]{Integer.valueOf(0), str, bArr});
    }

    public final synchronized void m15223a(String str, byte[] bArr, int i) {
        this.f15523m.getWritableDatabase().execSQL("UPDATE verification_cache set install_verification_error=? WHERE package_name=? AND sha256_digest=?", new Object[]{Integer.valueOf(i), str, bArr});
    }

    public final synchronized void m15225a(String str, byte[] bArr, boolean z) {
        int i = 1;
        synchronized (this) {
            SQLiteDatabase writableDatabase = this.f15523m.getWritableDatabase();
            String str2 = "UPDATE verification_cache set auto_disabled=? WHERE package_name=? AND sha256_digest=?";
            Object[] objArr = new Object[3];
            if (!z) {
                i = 0;
            }
            objArr[0] = Integer.valueOf(i);
            objArr[1] = str;
            objArr[2] = bArr;
            writableDatabase.execSQL(str2, objArr);
        }
    }

    public final synchronized void m15226a(String str, byte[] bArr, String[] strArr) {
        String str2 = null;
        if (strArr != null) {
            if (strArr.length > 0) {
                str2 = TextUtils.join(",", strArr);
            }
        }
        this.f15523m.getWritableDatabase().execSQL("UPDATE verification_cache set amputated_components=? WHERE package_name=? AND sha256_digest=?", new Object[]{str2, str, bArr});
    }

    public final synchronized void m15222a(String str, boolean z) {
        int i = 1;
        synchronized (this) {
            ContentValues contentValues = new ContentValues();
            String str2 = "suppress_user_warning";
            if (!z) {
                i = 0;
            }
            contentValues.put(str2, Integer.valueOf(i));
            this.f15523m.getWritableDatabase().update("verification_cache", contentValues, "package_name=?", new String[]{str});
        }
    }

    public final synchronized void m15224a(String str, byte[] bArr, String str2, String str3) {
        if (str2 == null) {
            this.f15523m.getWritableDatabase().execSQL("UPDATE verification_cache SET cache_fingerprint=?,uninstall_timestamp_ms=? WHERE package_name=? AND sha256_digest=?", new Object[]{Integer.valueOf(-1), Long.valueOf(C4678i.m21812a()), str, bArr});
        } else {
            this.f15523m.getWritableDatabase().execSQL("UPDATE verification_cache SET cache_fingerprint=?,uninstall_timestamp_ms=?, application_title=?, application_title_locale=? WHERE package_name=? AND sha256_digest=?", new Object[]{Integer.valueOf(-1), Long.valueOf(C4678i.m21812a()), str2, str3, str, bArr});
        }
    }

    public final synchronized void m15231c(String str, byte[] bArr) {
        this.f15523m.getWritableDatabase().execSQL("UPDATE verification_cache set hidden=? WHERE package_name=? AND sha256_digest=?", new Object[]{Integer.valueOf(1), str, bArr});
    }

    public final void m15232d() {
        Cursor query = this.f15523m.getWritableDatabase().query("verification_cache", new String[]{"package_name", "cache_fingerprint", "verdict", "verdict_timestamp_ms", "uninstall_timestamp_ms", "auto_disabled", "amputated_components", "is_offline_verdict"}, null, null, null, null, null, null);
        try {
            long a = C4678i.m21812a();
            while (query.moveToNext()) {
                Object obj;
                String string = query.getString(0);
                long j = query.getLong(1);
                int i = query.getInt(2);
                long j2 = query.getLong(3);
                long j3 = query.getLong(4);
                if (j == 0 || j3 != 0) {
                    if (j3 > 0 && i != 0) {
                        if (Math.abs(a - j3) < ((Long) C0955b.bR.m28964b()).longValue()) {
                            obj = 1;
                        }
                    }
                    if (j2 <= 0 || Math.abs(a - j2) >= ((Long) C0955b.bQ.m28964b()).longValue()) {
                        obj = null;
                    } else {
                        obj = 1;
                    }
                } else {
                    obj = 1;
                }
                if (obj == null) {
                    this.f15523m.getWritableDatabase().delete("verification_cache", "package_name=?", new String[]{string});
                }
            }
        } finally {
            query.close();
        }
    }

    private static ac m15215a(Cursor cursor) {
        Object string = cursor.getString(0);
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        String[] strArr;
        long j = cursor.getLong(1);
        byte[] blob = cursor.getBlob(2);
        long j2 = cursor.getLong(3);
        boolean z = cursor.getInt(4) == 1;
        boolean z2 = cursor.getInt(5) == 1;
        String string2 = cursor.getString(6);
        boolean z3 = cursor.getInt(7) == 1;
        int i = cursor.getInt(8);
        int i2 = cursor.getInt(9);
        String string3 = cursor.getString(10);
        long j3 = cursor.getLong(11);
        long j4 = cursor.getLong(12);
        boolean z4 = cursor.getInt(13) == 1;
        String string4 = cursor.getString(14);
        String string5 = cursor.getString(15);
        String string6 = cursor.getString(16);
        int i3 = cursor.getInt(17);
        long j5 = cursor.getLong(18);
        boolean z5 = cursor.getInt(19) == 1;
        byte[] blob2 = cursor.getBlob(20);
        String[] strArr2 = null;
        Object string7 = cursor.getString(21);
        try {
            if (!TextUtils.isEmpty(string7)) {
                strArr2 = string7.split("\\s*,\\s*");
            }
            strArr = strArr2;
        } catch (PatternSyntaxException e) {
            strArr = null;
        }
        return new ac(string, j, blob, j2, z, z2, string2, z3, i, i2, string3, string4, j3, j4, z4, string5, string6, i3, j5, z5, blob2, strArr, cursor.getInt(22) == 1);
    }
}
