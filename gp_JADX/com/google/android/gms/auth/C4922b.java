package com.google.android.gms.auth;

import android.accounts.Account;
import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.C5105f;
import com.google.android.gms.common.C5109i;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.UserRecoverableException;
import com.google.android.gms.common.internal.C5119h;
import com.google.android.gms.common.internal.C5120i;
import com.google.android.gms.internal.dl;
import java.io.IOException;

public class C4922b {
    public static final String[] f25333a = new String[]{"com.google", "com.google.work", "cn.google"};
    @SuppressLint({"InlinedApi"})
    public static final String f25334b = "androidPackageName";
    public static final ComponentName f25335c = new ComponentName("com.google.android.gms", "com.google.android.gms.auth.GetToken");
    public static final dl f25336d = new dl("Auth", "GoogleAuthUtil");

    static void m22934a(Account account) {
        if (account == null) {
            throw new IllegalArgumentException("Account cannot be null");
        } else if (TextUtils.isEmpty(account.name)) {
            throw new IllegalArgumentException("Account name cannot be empty!");
        } else {
            String[] strArr = f25333a;
            int length = strArr.length;
            int i = 0;
            while (i < length) {
                if (!strArr[i].equals(account.type)) {
                    i++;
                } else {
                    return;
                }
            }
            throw new IllegalArgumentException("Account type not supported");
        }
    }

    static void m22935a(Context context) {
        try {
            C5105f.m23695e(context.getApplicationContext());
        } catch (UserRecoverableException e) {
            String message = e.getMessage();
            Intent intent = new Intent(e.f25615b);
            throw new GooglePlayServicesAvailabilityException(message);
        } catch (GooglePlayServicesNotAvailableException e2) {
            throw new GoogleAuthException(e2.getMessage());
        }
    }

    static Object m22932a(Context context, ComponentName componentName, C4967c c4967c) {
        Throwable e;
        dl dlVar;
        ServiceConnection c5109i = new C5109i();
        C5119h a = C5119h.m23789a(context);
        if (a.mo4622a(new C5120i(componentName), c5109i)) {
            try {
                Object a2 = c4967c.mo4499a(c5109i.m23712a());
                a.m23790a(componentName, c5109i);
                return a2;
            } catch (RemoteException e2) {
                e = e2;
                try {
                    dlVar = f25336d;
                    Log.i(dlVar.f26655a, dlVar.m24292c("GoogleAuthUtil", "Error on service connection.", e));
                    throw new IOException("Error on service connection.", e);
                } catch (Throwable th) {
                    a.m23790a(componentName, c5109i);
                }
            } catch (InterruptedException e3) {
                e = e3;
                dlVar = f25336d;
                Log.i(dlVar.f26655a, dlVar.m24292c("GoogleAuthUtil", "Error on service connection.", e));
                throw new IOException("Error on service connection.", e);
            }
        }
        throw new IOException("Could not bind to service.");
    }

    static /* synthetic */ Object m22933a(Object obj) {
        if (obj != null) {
            return obj;
        }
        f25336d.m24291b("GoogleAuthUtil", "Binder call returned null.");
        throw new IOException("Service unavailable.");
    }
}
