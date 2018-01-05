package com.android.volley.p060a;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.accounts.AccountManagerFuture;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.android.volley.AuthFailureError;

@SuppressLint({"MissingPermission"})
public final class C0662b implements C0661c {
    public final AccountManager f4062a;
    public final Account f4063b;
    public final String f4064c;
    public final boolean f4065d;

    public C0662b(Context context, Account account, String str) {
        this(context, account, str, (byte) 0);
    }

    public C0662b(Context context, Account account, String str, byte b) {
        this(AccountManager.get(context), account, str);
    }

    private C0662b(AccountManager accountManager, Account account, String str) {
        this.f4062a = accountManager;
        this.f4063b = account;
        this.f4064c = str;
        this.f4065d = false;
    }

    public final String mo1071a() {
        String str = null;
        AccountManagerFuture authToken = this.f4062a.getAuthToken(this.f4063b, this.f4064c, this.f4065d, null, null);
        try {
            Bundle bundle = (Bundle) authToken.getResult();
            if (authToken.isDone() && !authToken.isCancelled()) {
                if (bundle.containsKey("intent")) {
                    throw new AuthFailureError((Intent) bundle.getParcelable("intent"));
                }
                str = bundle.getString("authtoken");
            }
            if (str != null) {
                return str;
            }
            String str2 = "Got null auth token for type: ";
            String valueOf = String.valueOf(this.f4064c);
            throw new AuthFailureError(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
        } catch (Exception e) {
            throw new AuthFailureError("Error while retrieving auth token", e);
        }
    }

    public final void m4420a(String str) {
        this.f4062a.invalidateAuthToken(this.f4063b.type, str);
    }
}
