package com.google.firebase.iid;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.h.a;
import android.util.Log;
import java.io.IOException;
import java.security.KeyPair;
import java.util.Map;

public final class C7139m {
    public static Map f34880a = new a();
    public static C7144r f34881b;
    public static C7129b f34882c;
    public static String f34883f;
    public KeyPair f34884d;
    public String f34885e = "";

    private C7139m(Context context, String str) {
        context.getApplicationContext();
        this.f34885e = str;
    }

    public static synchronized C7139m m32394a(Context context, Bundle bundle) {
        C7139m c7139m;
        synchronized (C7139m.class) {
            String string = bundle == null ? "" : bundle.getString("subtype");
            String str = string == null ? "" : string;
            Context applicationContext = context.getApplicationContext();
            if (f34881b == null) {
                f34881b = new C7144r(applicationContext);
                f34882c = new C7129b(applicationContext);
            }
            f34883f = Integer.toString(FirebaseInstanceId.m32347a(applicationContext));
            c7139m = (C7139m) f34880a.get(str);
            if (c7139m == null) {
                c7139m = new C7139m(applicationContext, str);
                f34880a.put(str, c7139m);
            }
        }
        return c7139m;
    }

    public final String m32395a(String str, String str2, Bundle bundle) {
        Intent intent;
        String stringExtra;
        if (str2 != null) {
            bundle.putString("scope", str2);
        }
        bundle.putString("sender", str);
        if (!"".equals(this.f34885e)) {
            str = this.f34885e;
        }
        bundle.putString("subtype", str);
        bundle.putString("X-subtype", str);
        C7129b c7129b = f34882c;
        KeyPair a = m32396a();
        Intent a2 = c7129b.m32384a(bundle, a);
        if (a2 != null && a2.hasExtra("google.messenger")) {
            a2 = c7129b.m32384a(bundle, a);
            if (a2 != null && a2.hasExtra("google.messenger")) {
                intent = null;
                if (intent != null) {
                    throw new IOException("SERVICE_NOT_AVAILABLE");
                }
                stringExtra = intent.getStringExtra("registration_id");
                if (stringExtra == null) {
                    stringExtra = intent.getStringExtra("unregistered");
                }
                if (stringExtra == null) {
                    return stringExtra;
                }
                stringExtra = intent.getStringExtra("error");
                if (stringExtra == null) {
                    throw new IOException(stringExtra);
                }
                String valueOf = String.valueOf(intent.getExtras());
                Log.w("InstanceID/Rpc", new StringBuilder(String.valueOf(valueOf).length() + 29).append("Unexpected response from GCM ").append(valueOf).toString(), new Throwable());
                throw new IOException("SERVICE_NOT_AVAILABLE");
            }
        }
        intent = a2;
        if (intent != null) {
            stringExtra = intent.getStringExtra("registration_id");
            if (stringExtra == null) {
                stringExtra = intent.getStringExtra("unregistered");
            }
            if (stringExtra == null) {
                return stringExtra;
            }
            stringExtra = intent.getStringExtra("error");
            if (stringExtra == null) {
                String valueOf2 = String.valueOf(intent.getExtras());
                Log.w("InstanceID/Rpc", new StringBuilder(String.valueOf(valueOf2).length() + 29).append("Unexpected response from GCM ").append(valueOf2).toString(), new Throwable());
                throw new IOException("SERVICE_NOT_AVAILABLE");
            }
            throw new IOException(stringExtra);
        }
        throw new IOException("SERVICE_NOT_AVAILABLE");
    }

    public final KeyPair m32396a() {
        if (this.f34884d == null) {
            this.f34884d = f34881b.m32415d(this.f34885e);
        }
        if (this.f34884d == null) {
            this.f34884d = f34881b.m32408a(this.f34885e);
        }
        return this.f34884d;
    }

    public final void m32397b() {
        f34881b.m32412b(this.f34885e);
        this.f34884d = null;
    }
}
