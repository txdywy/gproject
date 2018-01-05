package com.google.android.finsky.datasync;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Handler;
import android.os.HandlerThread;
import com.google.android.finsky.aa.C0955b;
import com.google.android.finsky.cv.p177a.dk;
import com.google.android.finsky.utils.C4674e;
import com.google.android.finsky.utils.C4678i;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.bb;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class aa implements C2515v {
    public static Handler f13514a;
    public final String f13515b;
    public final SQLiteOpenHelper f13516c;
    public final boolean f13517d;

    public aa(Context context, String str, boolean z) {
        this.f13516c = ag.m13461a(context);
        this.f13515b = str;
        this.f13517d = z;
    }

    public final void mo2930a(String str, String str2) {
        m13449a(new ab(this, str, str2));
    }

    public final List mo2928a(int i) {
        List a;
        RuntimeException e;
        if (bb.m21795c()) {
            throw new IllegalStateException("This method must be called from a background thread.");
        }
        long a2 = C4678i.m21812a();
        try {
            this.f13516c.getWritableDatabase().beginTransaction();
            Cursor query;
            try {
                String[] strArr;
                String str = "queue_name = ? AND processing_start_millis < ? AND enqueued_millis >= ? AND failed_attempts_count < ?";
                Object obj = new String[]{this.f13515b, String.valueOf(a2 - ((Long) C0955b.hc.m28964b()).longValue()), String.valueOf(a2 - ((Long) C0955b.hd.m28964b()).longValue()), String.valueOf(C0955b.he.m28964b())};
                if (this.f13517d || i <= 1) {
                    Object obj2 = obj;
                } else {
                    String valueOf = String.valueOf(str);
                    str = new StringBuilder((String.valueOf(valueOf).length() + 102) + String.valueOf(str).length()).append(valueOf).append(" AND user_account_name = (SELECT user_account_name FROM fetch_suggestions_queues_table WHERE ").append(str).append(" LIMIT 1)").toString();
                    strArr = new String[8];
                    System.arraycopy(obj, 0, strArr, 0, 4);
                    System.arraycopy(obj, 0, strArr, 4, 4);
                }
                query = this.f13516c.getWritableDatabase().query("fetch_suggestions_queues_table", ag.f13533a, str, strArr, null, null, null, String.valueOf(i));
                a = m13448a(query);
                m13450a(a, a2);
                this.f13516c.getWritableDatabase().setTransactionSuccessful();
                query.close();
                try {
                    this.f13516c.getWritableDatabase().endTransaction();
                } catch (SQLiteException e2) {
                    e = e2;
                    FinskyLog.m21667d("%s: getEntriesForProcessing %s", "[Cache and Sync]", e.getMessage());
                    return a;
                } catch (IllegalStateException e3) {
                    e = e3;
                    FinskyLog.m21667d("%s: getEntriesForProcessing %s", "[Cache and Sync]", e.getMessage());
                    return a;
                }
                return a;
            } catch (SQLiteException e4) {
                e = e4;
                try {
                    FinskyLog.m21667d("%s: getEntriesForProcessing %s", "[Cache and Sync]", e.getMessage());
                    a = Collections.emptyList();
                    try {
                        this.f13516c.getWritableDatabase().endTransaction();
                    } catch (SQLiteException e5) {
                        e = e5;
                        FinskyLog.m21667d("%s: getEntriesForProcessing %s", "[Cache and Sync]", e.getMessage());
                        return a;
                    } catch (IllegalStateException e6) {
                        e = e6;
                        FinskyLog.m21667d("%s: getEntriesForProcessing %s", "[Cache and Sync]", e.getMessage());
                        return a;
                    }
                    return a;
                } catch (Throwable th) {
                    Throwable th2 = th;
                    try {
                        this.f13516c.getWritableDatabase().endTransaction();
                    } catch (SQLiteException e7) {
                        e = e7;
                        FinskyLog.m21667d("%s: getEntriesForProcessing %s", "[Cache and Sync]", e.getMessage());
                    } catch (IllegalStateException e8) {
                        e = e8;
                        FinskyLog.m21667d("%s: getEntriesForProcessing %s", "[Cache and Sync]", e.getMessage());
                    }
                }
            } catch (IllegalStateException e9) {
                e = e9;
                FinskyLog.m21667d("%s: getEntriesForProcessing %s", "[Cache and Sync]", e.getMessage());
                a = Collections.emptyList();
                this.f13516c.getWritableDatabase().endTransaction();
                return a;
            } catch (Throwable th3) {
                query.close();
            }
        } catch (SQLiteException e10) {
            FinskyLog.m21667d("%s: getEntriesForProcessing %s", "[Cache and Sync]", e10.getMessage());
            return Collections.emptyList();
        }
    }

    public final List mo2927a() {
        Cursor query;
        RuntimeException e;
        if (bb.m21795c()) {
            throw new IllegalStateException("This method must be called from a background thread.");
        } else if (this.f13515b.equals("fife")) {
            return Collections.emptyList();
        } else {
            try {
                query = this.f13516c.getWritableDatabase().query("synced_entries_table", ag.f13534b, null, null, null, null, null);
                List b = m13451b(query);
                query.close();
                return b;
            } catch (SQLiteException e2) {
                e = e2;
                FinskyLog.m21667d("%s: getSyncedEntries %s", "[Cache and Sync]", e.getMessage());
                return Collections.emptyList();
            } catch (IllegalStateException e3) {
                e = e3;
                FinskyLog.m21667d("%s: getSyncedEntries %s", "[Cache and Sync]", e.getMessage());
                return Collections.emptyList();
            } catch (Throwable th) {
                query.close();
            }
        }
    }

    public final void mo2931a(String str, String str2, boolean z) {
        m13449a(new ac(this, str, str2, z));
    }

    public final void mo2929a(String str) {
        m13449a(new ad(this, str));
    }

    public final void mo2932b(String str, String str2) {
        if (this.f13515b.equals("dfe")) {
            m13449a(new ae(this, str, str2));
        }
    }

    public final void mo2934c(String str, String str2) {
        m13449a(new af(this, str, str2));
    }

    public final boolean mo2933b() {
        long a = C4678i.m21812a();
        Cursor rawQuery = this.f13516c.getWritableDatabase().rawQuery(String.format("SELECT count(*) FROM %s WHERE %s = ? AND %s >= ? AND %s < ?", new Object[]{"fetch_suggestions_queues_table", "queue_name", "enqueued_millis", "failed_attempts_count"}), new String[]{this.f13515b, String.valueOf(a - ((Long) C0955b.hd.m28964b()).longValue()), String.valueOf(C0955b.he.m28964b())});
        try {
            boolean z;
            rawQuery.moveToFirst();
            if (rawQuery.getInt(0) != 0) {
                z = true;
            } else {
                z = false;
            }
            rawQuery.close();
            return z;
        } catch (Throwable th) {
            rawQuery.close();
        }
    }

    private static List m13448a(Cursor cursor) {
        List arrayList = new ArrayList(cursor.getCount());
        while (cursor.moveToNext()) {
            dk a = new dk().m12426a(cursor.getString(cursor.getColumnIndexOrThrow("fetch_suggestion_url")));
            String string = cursor.getString(cursor.getColumnIndexOrThrow("user_account_name"));
            cursor.getLong(cursor.getColumnIndexOrThrow("enqueued_millis"));
            cursor.getInt(cursor.getColumnIndexOrThrow("failed_attempts_count"));
            arrayList.add(new C2533w(a, string));
        }
        return arrayList;
    }

    private static List m13451b(Cursor cursor) {
        List arrayList = new ArrayList(cursor.getCount());
        while (cursor.moveToNext()) {
            arrayList.add(new ah(new dk().m12426a(cursor.getString(cursor.getColumnIndexOrThrow("fetch_suggestion_url"))), cursor.getString(cursor.getColumnIndexOrThrow("user_account_name"))));
        }
        return arrayList;
    }

    private final void m13450a(List list, long j) {
        if (list.size() != 0) {
            StringBuilder stringBuilder = new StringBuilder();
            if (!list.isEmpty()) {
                stringBuilder.append("(fetch_suggestion_url = ? and user_account_name = ?)");
                for (int i = 1; i < list.size(); i++) {
                    stringBuilder.append(" OR (fetch_suggestion_url = ? and user_account_name = ?)");
                }
            }
            String[] strArr = new String[(list.size() * 2)];
            int i2 = 0;
            for (C2533w c2533w : list) {
                int i3 = i2 + 1;
                strArr[i2] = c2533w.f13576a.f12151c;
                i2 = i3 + 1;
                strArr[i3] = c2533w.f13577b;
            }
            ContentValues contentValues = new ContentValues();
            contentValues.put("processing_start_millis", Long.valueOf(j));
            this.f13516c.getWritableDatabase().update("fetch_suggestions_queues_table", contentValues, stringBuilder.toString(), strArr);
        }
    }

    private static void m13449a(Runnable runnable) {
        if (bb.m21795c()) {
            m13452c().post(runnable);
        } else {
            runnable.run();
        }
    }

    private static synchronized Handler m13452c() {
        Handler handler;
        synchronized (aa.class) {
            if (f13514a == null) {
                HandlerThread a = C4674e.m21808a("fetch-suggestions-queue-thread");
                a.start();
                f13514a = new Handler(a.getLooper());
            }
            handler = f13514a;
        }
        return handler;
    }
}
