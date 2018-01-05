package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.internal.am;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONException;

public final class C4966t {
    public static final Lock f25463a = new ReentrantLock();
    public static C4966t f25464b;
    public final Lock f25465c = new ReentrantLock();
    public final SharedPreferences f25466d;

    private C4966t(Context context) {
        this.f25466d = context.getSharedPreferences("com.google.android.gms.signin", 0);
    }

    private final GoogleSignInAccount m23099a(String str) {
        GoogleSignInAccount googleSignInAccount = null;
        if (!TextUtils.isEmpty(str)) {
            String c = m23103c(C4966t.m23102b("googleSignInAccount", str));
            if (c != null) {
                try {
                    googleSignInAccount = GoogleSignInAccount.m22951a(c);
                } catch (JSONException e) {
                }
            }
        }
        return googleSignInAccount;
    }

    public static C4966t m23100a(Context context) {
        am.m23733a((Object) context);
        f25463a.lock();
        try {
            if (f25464b == null) {
                f25464b = new C4966t(context.getApplicationContext());
            }
            C4966t c4966t = f25464b;
            return c4966t;
        } finally {
            f25463a.unlock();
        }
    }

    private final GoogleSignInOptions m23101b(String str) {
        GoogleSignInOptions googleSignInOptions = null;
        if (!TextUtils.isEmpty(str)) {
            String c = m23103c(C4966t.m23102b("googleSignInOptions", str));
            if (c != null) {
                try {
                    googleSignInOptions = GoogleSignInOptions.m22953a(c);
                } catch (JSONException e) {
                }
            }
        }
        return googleSignInOptions;
    }

    static String m23102b(String str, String str2) {
        String str3 = ":";
        return new StringBuilder((String.valueOf(str).length() + String.valueOf(str3).length()) + String.valueOf(str2).length()).append(str).append(str3).append(str2).toString();
    }

    private final String m23103c(String str) {
        this.f25465c.lock();
        try {
            String string = this.f25466d.getString(str, null);
            return string;
        } finally {
            this.f25465c.unlock();
        }
    }

    private final void m23104d(String str) {
        this.f25465c.lock();
        try {
            this.f25466d.edit().remove(str).apply();
        } finally {
            this.f25465c.unlock();
        }
    }

    public final GoogleSignInAccount m23105a() {
        return m23099a(m23103c("defaultGoogleSignInAccount"));
    }

    final void m23106a(String str, String str2) {
        this.f25465c.lock();
        try {
            this.f25466d.edit().putString(str, str2).apply();
        } finally {
            this.f25465c.unlock();
        }
    }

    public final GoogleSignInOptions m23107b() {
        return m23101b(m23103c("defaultGoogleSignInAccount"));
    }

    public final void m23108c() {
        String c = m23103c("defaultGoogleSignInAccount");
        m23104d("defaultGoogleSignInAccount");
        if (!TextUtils.isEmpty(c)) {
            m23104d(C4966t.m23102b("googleSignInAccount", c));
            m23104d(C4966t.m23102b("googleSignInOptions", c));
        }
    }
}
