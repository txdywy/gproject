package com.google.android.finsky.activities;

import android.accounts.AccountManagerFuture;
import android.accounts.AuthenticatorException;
import android.accounts.OperationCanceledException;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.u;
import com.google.android.finsky.d.c;
import com.google.android.finsky.d.j;
import com.google.android.finsky.m;
import com.google.android.finsky.utils.FinskyLog;
import java.io.IOException;

public final class com.google.android.finsky.activities.g implements AccountManagerCallback
{

    public final com.google.android.finsky.activities.b a;

    g(com.google.android.finsky.activities.b p0) {
        this.a = p0;
    }

    public final void run(AccountManagerFuture p0) {
        com.google.android.finsky.m.a.dc().a(new com.google.android.finsky.d.c(528).a);
        try {
            this.a.startActivityForResult((Intent)((Bundle)p0.getResult()).getParcelable("intent"), 21);
            this.a.v = 1;
        }
        catch (OperationCanceledException ex) {
            FinskyLog.c("Account add canceled. Finishing.", new Object[0]);
            this.a.finish();
        }
        catch (IOException ex) {
            v2 = new Object[1];
            v2[0] = ex;
            FinskyLog.c("IOException while adding account: %s. Finishing.", v2);
            this.a.finish();
        }
        catch (AuthenticatorException ex) {
            v2 = new Object[1];
            v2[0] = ex;
            FinskyLog.c("AuthenticatorException while adding account: %s. Finishing.", v2);
            this.a.finish();
        }
    }

}
