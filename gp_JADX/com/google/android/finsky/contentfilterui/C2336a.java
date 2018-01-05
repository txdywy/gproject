package com.google.android.finsky.contentfilterui;

import android.content.Context;
import com.android.volley.C0660x;
import com.android.volley.ServerError;
import com.android.volley.VolleyError;
import com.google.android.finsky.dfemodel.C2335k;
import com.google.android.finsky.utils.C4692x;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.bb;
import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class C2336a extends C2335k implements C0660x {
    public final File f11510a;
    public final Method f11511b;
    public C0757i f11512c;

    public C2336a(Context context, Class cls) {
        this.f11510a = new File(context.getCacheDir(), cls.getSimpleName());
        Method method = null;
        try {
            method = cls.getMethod("parseFrom", new Class[]{byte[].class});
        } catch (NoSuchMethodException e) {
            FinskyLog.m21665c("Cannot find parseFrom method in given class %s, verify it is a proto: %s", cls.getName(), e);
        }
        this.f11511b = method;
    }

    public final void mo1062a(VolleyError volleyError) {
        if (!(volleyError instanceof ServerError) || volleyError.f4022b == null) {
            bb.m21792a(new C2337b(this), volleyError);
            return;
        }
        super.mo1062a(volleyError);
    }

    public final void m11930a(C0757i c0757i) {
        byte[] a = C0757i.m4909a(c0757i);
        bb.m21792a(new C2338c(this), a);
        m11933b(c0757i);
    }

    protected final void m11933b(C0757i c0757i) {
        this.f11512c = c0757i;
        m11927l();
    }

    public final boolean mo2861a() {
        return this.f11512c != null;
    }

    protected final C0757i m11932b() {
        if (m11934c()) {
            try {
                byte[] a = C4692x.m21844a(new FileInputStream(this.f11510a));
                return (C0757i) this.f11511b.invoke(null, new Object[]{a});
            } catch (FileNotFoundException e) {
                FinskyLog.m21665c("Failed to load response proto, file not found: %s", e);
            } catch (InvalidProtocolBufferNanoException e2) {
                FinskyLog.m21665c("Failed to load response proto, bad proto: %s", e2);
                this.f11510a.delete();
            } catch (IOException e3) {
                FinskyLog.m21665c("Failed to load response proto: %s", e3);
            } catch (InvocationTargetException e4) {
                FinskyLog.m21665c("Failed to parse response proto, parseFrom method missing: %s", e4);
            } catch (IllegalAccessException e5) {
                FinskyLog.m21665c("Failed to parse response proto, parseFrom method private: %s", e5);
            }
        }
        return null;
    }

    protected final boolean m11934c() {
        return this.f11510a.exists() && this.f11510a.canRead();
    }

    public final /* synthetic */ void b_(Object obj) {
        m11930a((C0757i) obj);
    }
}
