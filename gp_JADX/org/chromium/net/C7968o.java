package org.chromium.net;

import android.accounts.Account;
import android.accounts.AccountManagerCallback;
import android.accounts.AccountManagerFuture;
import android.accounts.AuthenticatorException;
import android.accounts.OperationCanceledException;
import android.os.Handler;
import java.io.IOException;
import org.chromium.base.C7888e;
import org.chromium.base.C7893j;
import org.chromium.base.ThreadUtils;

final class C7968o implements AccountManagerCallback {
    public final C7971r f40941a;
    public final /* synthetic */ HttpNegotiateAuthenticator f40942b;

    public C7968o(HttpNegotiateAuthenticator httpNegotiateAuthenticator, C7971r c7971r) {
        this.f40942b = httpNegotiateAuthenticator;
        this.f40941a = c7971r;
    }

    public final void run(AccountManagerFuture accountManagerFuture) {
        AuthenticatorException e;
        try {
            Account[] accountArr = (Account[]) accountManagerFuture.getResult();
            if (accountArr.length == 0) {
                C7893j.m37817a("net_auth", "ERR_MISSING_AUTH_CREDENTIALS: No account provided for the kerberos authentication. Please verify the configuration policies and that the CONTACTS runtime permission is granted. ", new Object[0]);
                this.f40942b.nativeSetResult(this.f40941a.f40947a, -341, null);
            } else if (accountArr.length > 1) {
                C7893j.m37817a("net_auth", "ERR_MISSING_AUTH_CREDENTIALS: Found %d accounts eligible for the kerberos authentication. Please fix the configuration by providing a single account.", Integer.valueOf(accountArr.length));
                this.f40942b.nativeSetResult(this.f40941a.f40947a, -341, null);
            } else if (HttpNegotiateAuthenticator.m37837a(C7888e.f40514a, "android.permission.USE_CREDENTIALS", true)) {
                C7893j.m37818b("net_auth", "ERR_MISCONFIGURED_AUTH_ENVIRONMENT: USE_CREDENTIALS permission not granted. Aborting authentication.", new Object[0]);
                this.f40942b.nativeSetResult(this.f40941a.f40947a, -343, null);
            } else {
                this.f40941a.f40951e = accountArr[0];
                this.f40941a.f40948b.getAuthToken(this.f40941a.f40951e, this.f40941a.f40950d, this.f40941a.f40949c, true, new C7969p(this.f40942b, this.f40941a), new Handler(ThreadUtils.m37806a().getLooper()));
            }
        } catch (OperationCanceledException e2) {
            e = e2;
            C7893j.m37817a("net_auth", "ERR_UNEXPECTED: Error while attempting to retrieve accounts.", e);
            this.f40942b.nativeSetResult(this.f40941a.f40947a, -9, null);
        } catch (AuthenticatorException e3) {
            e = e3;
            C7893j.m37817a("net_auth", "ERR_UNEXPECTED: Error while attempting to retrieve accounts.", e);
            this.f40942b.nativeSetResult(this.f40941a.f40947a, -9, null);
        } catch (IOException e4) {
            e = e4;
            C7893j.m37817a("net_auth", "ERR_UNEXPECTED: Error while attempting to retrieve accounts.", e);
            this.f40942b.nativeSetResult(this.f40941a.f40947a, -9, null);
        }
    }
}
