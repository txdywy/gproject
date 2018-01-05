package com.google.android.finsky.contentfilterui;

import android.accounts.Account;
import android.content.Context;
import android.os.AsyncTask;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.gms.auth.GoogleAuthException;
import java.io.IOException;

protected final class com.google.android.finsky.contentfilterui.v extends AsyncTask
{

    public com.google.android.finsky.contentfilterui.t a;
    public final Context b;
    public final Account c;

    v(Context p0, Account p1) {
        this.b = p0;
        this.c = p1;
        AsyncTask();
    }

    private final Boolean a(t[] p0) {
  3:    this.a = p0[0];
 13:    v0 = Boolean.valueOf(com.google.android.finsky.contentfilterui.u.b(this.b, this.c));
 17:    return v0;
 18:    v0 = ex;
 23:    FinskyLog.a(v0, "Error invoking gmscore", new Object[0]);
 26:    v0 = 0;
 27:    return v0;
 28:    v0 = ex;
 29:    goto 19;
 30:    try
            run 5...16
        catch (GoogleAuthException ex) {
  5:        goto 28;
        }
        catch (IOException ex) {
  5:        goto 18;
        }
    }

    protected final Object doInBackground(Object[] p0) {
        return this.a((t[])p0);
    }

    protected final void onPostExecute(Object p0) {
        if ((Boolean)p0 != 0 && ((Boolean)p0).booleanValue())
            v0 = 1;
        else
            v0 = 0;
        this.a.b(v0);
    }

}
