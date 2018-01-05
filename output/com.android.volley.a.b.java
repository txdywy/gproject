package com.android.volley.a;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.accounts.AccountManagerFuture;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.android.volley.AuthFailureError;

public final class com.android.volley.a.b implements com.android.volley.a.c
{

    public final AccountManager a;
    public final Account b;
    public final String c;
    public final boolean d;

    b(AccountManager p0, Account p1, String p2) {
        this.a = p0;
        this.b = p1;
        this.c = p2;
        this.d = 0;
    }

    b(Context p0, Account p1, String p2) {
        com.android.volley.a.b(p0, p1, p2, 0);
    }

    b(Context p0, Account p1, String p2, byte p3) {
        com.android.volley.a.b(AccountManager.get(p0), p1, p2);
    }

    public final String a() {
        v4 = 0;
        v1 = this.a.getAuthToken(this.b, this.c, this.d, 0, 0);
        try {
            v0 = (Bundle)v1.getResult();
        }
        catch (Exception ex) {
            throw new AuthFailureError("Error while retrieving auth token", ex);
        }
        if (v1.isDone() && !v1.isCancelled()) {
            if (v0.containsKey("intent"))
                throw new AuthFailureError((Intent)v0.getParcelable("intent"));
            v4 = v0.getString("authtoken");
        }
        if (v4 == 0) {
            v0 = String.valueOf(this.c);
            if (v0.length() != 0)
                v0 = "Got null auth token for type: ".concat(v0);
            else
                v0 = new String("Got null auth token for type: ");
            throw new AuthFailureError(v0);
        }
        return v4;
    }

    public final void a(String p0) {
        this.a.invalidateAuthToken(this.b.type, p0);
    }

}
