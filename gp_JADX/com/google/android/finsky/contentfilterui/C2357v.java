package com.google.android.finsky.contentfilterui;

import android.accounts.Account;
import android.content.Context;
import android.os.AsyncTask;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.gms.auth.GoogleAuthException;
import java.io.IOException;

final class C2357v extends AsyncTask {
    public C2345t f11562a;
    public final /* synthetic */ Context f11563b;
    public final /* synthetic */ Account f11564c;

    C2357v(Context context, Account account) {
        this.f11563b = context;
        this.f11564c = account;
    }

    private final Boolean m11981a(C2345t... c2345tArr) {
        Throwable e;
        this.f11562a = c2345tArr[0];
        try {
            return Boolean.valueOf(C2356u.m11980b(this.f11563b, this.f11564c));
        } catch (GoogleAuthException e2) {
            e = e2;
            FinskyLog.m21660a(e, "Error invoking gmscore", new Object[0]);
            return null;
        } catch (IOException e3) {
            e = e3;
            FinskyLog.m21660a(e, "Error invoking gmscore", new Object[0]);
            return null;
        }
    }

    protected final /* synthetic */ void onPostExecute(Object obj) {
        Boolean bool = (Boolean) obj;
        C2345t c2345t = this.f11562a;
        boolean z = bool != null && bool.booleanValue();
        c2345t.mo2867b(z);
    }

    protected final /* synthetic */ Object doInBackground(Object[] objArr) {
        return m11981a((C2345t[]) objArr);
    }
}
