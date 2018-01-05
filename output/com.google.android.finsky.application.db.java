package com.google.android.finsky.application;

import android.accounts.Account;
import android.os.AsyncTask;
import com.google.android.finsky.accounts.c;
import com.google.android.finsky.dx.a;
import java.util.Iterator;
import java.util.List;

protected final class com.google.android.finsky.application.db extends AsyncTask
{

    public final com.google.android.finsky.application.d a;

    db(com.google.android.finsky.application.d p0) {
        this.a = p0;
        AsyncTask();
    }

    protected final Object doInBackground(Object[] p0) {
        if (this.a.aN != 0) {
            if (this.a == 0)
                throw 0;
            v1 = this.a.cX().iterator();
            while (v1.hasNext())
                this.a.aN.b(((Account)v1.next()).name);
        }
        return 0;
    }

}
