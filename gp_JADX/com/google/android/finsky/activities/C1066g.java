package com.google.android.finsky.activities;

import android.accounts.AccountManagerCallback;
import android.accounts.AccountManagerFuture;
import android.accounts.AuthenticatorException;
import android.accounts.OperationCanceledException;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.p111d.C2474c;
import com.google.android.finsky.utils.FinskyLog;
import java.io.IOException;

final class C1066g implements AccountManagerCallback {
    public final /* synthetic */ C1036b f6833a;

    C1066g(C1036b c1036b) {
        this.f6833a = c1036b;
    }

    public final void run(AccountManagerFuture accountManagerFuture) {
        C1473m.f7980a.dc().m13327a(new C2474c(528).f13342a);
        try {
            this.f6833a.startActivityForResult((Intent) ((Bundle) accountManagerFuture.getResult()).getParcelable("intent"), 21);
            this.f6833a.f6325v = true;
        } catch (OperationCanceledException e) {
            FinskyLog.m21665c("Account add canceled. Finishing.", new Object[0]);
            this.f6833a.finish();
        } catch (IOException e2) {
            FinskyLog.m21665c("IOException while adding account: %s. Finishing.", e2);
            this.f6833a.finish();
        } catch (AuthenticatorException e3) {
            FinskyLog.m21665c("AuthenticatorException while adding account: %s. Finishing.", e3);
            this.f6833a.finish();
        }
    }
}
