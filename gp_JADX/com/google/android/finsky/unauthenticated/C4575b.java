package com.google.android.finsky.unauthenticated;

import android.accounts.AccountManagerCallback;
import android.accounts.AccountManagerFuture;
import android.accounts.AuthenticatorException;
import android.accounts.OperationCanceledException;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import com.google.android.finsky.p111d.C2474c;
import com.google.android.finsky.utils.FinskyLog;
import java.io.IOException;

final /* synthetic */ class C4575b implements AccountManagerCallback {
    public final C4574a f23390a;

    C4575b(C4574a c4574a) {
        this.f23390a = c4574a;
    }

    public final void run(AccountManagerFuture accountManagerFuture) {
        Fragment fragment = this.f23390a;
        fragment.f23387e.m13367a(new C2474c(528));
        fragment.f23387e.m13382d().m13333d();
        try {
            fragment.startActivityForResult((Intent) ((Bundle) accountManagerFuture.getResult()).getParcelable("intent"), 1);
        } catch (OperationCanceledException e) {
            FinskyLog.m21665c("Account add canceled. Finishing.", new Object[0]);
            fragment.m603h().finish();
        } catch (IOException e2) {
            FinskyLog.m21665c("IOException while adding account: %s. Finishing.", e2);
            fragment.m603h().finish();
        } catch (AuthenticatorException e3) {
            FinskyLog.m21665c("AuthenticatorException while adding account: %s. Finishing.", e3);
            fragment.m603h().finish();
        }
    }
}
