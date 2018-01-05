package com.google.android.finsky.by.a;

import android.accounts.Account;
import android.database.sqlite.SQLiteDatabase;
import com.google.android.finsky.accounts.c;
import com.google.android.finsky.utils.FinskyLog;
import java.util.List;

public final class com.google.android.finsky.by.a.i implements Runnable
{

    public final com.google.android.finsky.by.a.f a;

    i(com.google.android.finsky.by.a.f p0) {
        this.a = p0;
    }

    public final void run() {
        v4 = this.a.a.cX();
        v5 = new StringBuilder();
        v6 = new String[v4.size()];
        v1 = 0;
        while (v1 < v4.size()) {
            if (v1 > 0)
                v5.append(44);
            v5.append(63);
            v6[v1] = ((Account)v4.get(v1)).name;
            v1 = v1 + 1;
        }
        v3 = v5.toString();
        v0 = this.a.b.c.getWritableDatabase().delete("ownership", (String.valueOf(v3).length() + 17) + "account NOT IN (" + v3 + ")", v6);
        if (v0 > 0) {
            v3 = new Object[1];
            v3[0] = Integer.valueOf(v0);
            FinskyLog.a("Removed %d obsolete library rows.", v3);
        }
    }

}
