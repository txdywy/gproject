package com.android.volley.p060a;

import android.util.Log;
import com.android.volley.C0656n;
import com.android.volley.C0657w;
import com.android.volley.C0660x;
import com.android.volley.C0697m;
import com.android.volley.C0704v;
import java.io.UnsupportedEncodingException;

public abstract class aa extends C0656n {
    public static final String f4042q = String.format("application/json; charset=%s", new Object[]{"utf-8"});
    public final Object f4043e = new Object();
    public C0660x f4044r;
    public final String f4045s;

    public aa(int i, String str, String str2, C0660x c0660x, C0657w c0657w) {
        super(i, str, c0657w);
        this.f4044r = c0660x;
        this.f4045s = str2;
    }

    public abstract C0704v mo1055a(C0697m c0697m);

    public final void mo1057f() {
        super.mo1057f();
        synchronized (this.f4043e) {
            this.f4044r = null;
        }
    }

    protected final void mo1056a(Object obj) {
        synchronized (this.f4043e) {
            C0660x c0660x = this.f4044r;
        }
        if (c0660x != null) {
            c0660x.b_(obj);
        }
    }

    @Deprecated
    public final String mo1058i() {
        return mo1060l();
    }

    @Deprecated
    public final byte[] mo1059j() {
        return mo1061m();
    }

    public final String mo1060l() {
        return f4042q;
    }

    public final byte[] mo1061m() {
        byte[] bArr = null;
        try {
            if (this.f4045s != null) {
                bArr = this.f4045s.getBytes("utf-8");
            }
        } catch (UnsupportedEncodingException e) {
            Log.wtf(com.android.volley.aa.f4123a, com.android.volley.aa.m4484d("Unsupported Encoding while trying to get the bytes of %s using %s", this.f4045s, "utf-8"));
        }
        return bArr;
    }
}
