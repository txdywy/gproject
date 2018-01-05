package org.chromium.net;

import android.accounts.AccountManagerCallback;
import android.accounts.AccountManagerFuture;
import android.accounts.AuthenticatorException;
import android.accounts.OperationCanceledException;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Bundle;
import java.io.IOException;
import org.chromium.base.C7888e;
import org.chromium.base.C7893j;

final class C7969p implements AccountManagerCallback {
    public final C7971r f40943a;
    public final /* synthetic */ HttpNegotiateAuthenticator f40944b;

    public C7969p(HttpNegotiateAuthenticator httpNegotiateAuthenticator, C7971r c7971r) {
        this.f40944b = httpNegotiateAuthenticator;
        this.f40943a = c7971r;
    }

    public final void run(AccountManagerFuture accountManagerFuture) {
        AuthenticatorException e;
        int i = 0;
        try {
            Bundle bundle = (Bundle) accountManagerFuture.getResult();
            if (bundle.containsKey("intent")) {
                Context context = C7888e.f40514a;
                context.registerReceiver(new C7970q(this, context), new IntentFilter("android.accounts.LOGIN_ACCOUNTS_CHANGED"));
                return;
            }
            HttpNegotiateAuthenticator httpNegotiateAuthenticator = this.f40944b;
            C7971r c7971r = this.f40943a;
            httpNegotiateAuthenticator.f40570a = bundle.getBundle("spnegoContext");
            switch (bundle.getInt("spnegoResult", 1)) {
                case 0:
                    break;
                case 1:
                    i = -9;
                    break;
                case 2:
                    i = -3;
                    break;
                case 3:
                    i = -342;
                    break;
                case 4:
                    i = -320;
                    break;
                case 5:
                    i = -338;
                    break;
                case 6:
                    i = -339;
                    break;
                case 7:
                    i = -341;
                    break;
                case 8:
                    i = -344;
                    break;
                case 9:
                    i = -329;
                    break;
                default:
                    i = -9;
                    break;
            }
            httpNegotiateAuthenticator.nativeSetResult(c7971r.f40947a, i, bundle.getString("authtoken"));
        } catch (OperationCanceledException e2) {
            e = e2;
            C7893j.m37817a("net_auth", "ERR_UNEXPECTED: Error while attempting to obtain a token.", e);
            this.f40944b.nativeSetResult(this.f40943a.f40947a, -9, null);
        } catch (AuthenticatorException e3) {
            e = e3;
            C7893j.m37817a("net_auth", "ERR_UNEXPECTED: Error while attempting to obtain a token.", e);
            this.f40944b.nativeSetResult(this.f40943a.f40947a, -9, null);
        } catch (IOException e4) {
            e = e4;
            C7893j.m37817a("net_auth", "ERR_UNEXPECTED: Error while attempting to obtain a token.", e);
            this.f40944b.nativeSetResult(this.f40943a.f40947a, -9, null);
        }
    }
}
