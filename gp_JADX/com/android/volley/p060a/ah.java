package com.android.volley.p060a;

import com.android.volley.C0656n;
import com.android.volley.C0657w;
import com.android.volley.C0660x;
import com.android.volley.C0697m;
import com.android.volley.C0704v;
import java.io.UnsupportedEncodingException;

public class ah extends C0656n {
    public final Object f4060e;
    public C0660x f4061q;

    private ah(String str, C0660x c0660x, C0657w c0657w) {
        super(0, str, c0657w);
        this.f4060e = new Object();
        this.f4061q = c0660x;
    }

    public ah(String str, C0660x c0660x, C0657w c0657w, byte b) {
        this(str, c0660x, c0657w);
    }

    public final void mo1057f() {
        super.mo1057f();
        synchronized (this.f4060e) {
            this.f4061q = null;
        }
    }

    protected final C0704v mo1055a(C0697m c0697m) {
        Object str;
        try {
            str = new String(c0697m.f4167b, C0673n.m4461a(c0697m.f4168c));
        } catch (UnsupportedEncodingException e) {
            str = new String(c0697m.f4167b);
        }
        return C0704v.m4517a(str, C0673n.m4460a(c0697m));
    }

    protected final /* synthetic */ void mo1056a(Object obj) {
        String str = (String) obj;
        synchronized (this.f4060e) {
            C0660x c0660x = this.f4061q;
        }
        if (c0660x != null) {
            c0660x.b_(str);
        }
    }
}
