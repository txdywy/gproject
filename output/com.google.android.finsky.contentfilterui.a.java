package com.google.android.finsky.contentfilterui;

import android.content.Context;
import com.android.volley.ServerError;
import com.android.volley.VolleyError;
import com.google.android.finsky.dfemodel.k;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.bb;
import com.google.android.finsky.utils.x;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import com.google.protobuf.nano.i;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

protected final class com.google.android.finsky.contentfilterui.a extends com.google.android.finsky.dfemodel.k implements com.android.volley.x
{

    public final File a;
    public final Method b;
    public com.google.protobuf.nano.i c;

    a(Context p0, Class p1) {
        com.google.android.finsky.dfemodel.k();
        this.a = new File(p0.getCacheDir(), p1.getSimpleName());
        v0 = 0;
        try {
            v2 = new Class[1];
            v2[0] = byte[];
            v0 = p1.getMethod("parseFrom", v2);
        }
        catch (NoSuchMethodException ex) {
            v3 = new Object[2];
            v3[0] = p1.getName();
            v3[1] = ex;
            FinskyLog.c("Cannot find parseFrom method in given class %s, verify it is a proto: %s", v3);
        }
        this.b = v0;
    }

    static void a(com.google.android.finsky.contentfilterui.a p0, VolleyError p1) {
        p0.a(p1);
    }

    public final void a(VolleyError p0) {
        if (p0 instanceof ServerError && p0.b != 0)
            super.a(p0);
        else {
            v1 = new VolleyError[1];
            v1[0] = p0;
            com.google.android.finsky.utils.bb.a(new com.google.android.finsky.contentfilterui.b(this), v1);
        }
    }

    public final void a(com.google.protobuf.nano.i p0) {
        v2 = new byte[1][];
        v2[0] = com.google.protobuf.nano.i.a(p0);
        com.google.android.finsky.utils.bb.a(new com.google.android.finsky.contentfilterui.c(this), v2);
        this.b(p0);
    }

    public final boolean a() {
        if (this.c != 0)
            v0 = 1;
        else
            v0 = 0;
        return v0;
    }

    protected final com.google.protobuf.nano.i b() {
  7:    if (!this.c()) {
 46:        v0 = 0;
 47:        return v0;
        }
 24:    v4 = new Object[1];
 27:    v4[0] = com.google.android.finsky.utils.x.a(new FileInputStream(this.a));
 33:    v0 = (com.google.protobuf.nano.i)this.b.invoke(0, v4);
 35:    return v0;
 39:    v3 = new Object[1];
 41:    v3[0] = ex;
 43:    FinskyLog.c("Failed to load response proto, file not found: %s", v3);
 46:    v0 = 0;
 47:    return v0;
 51:    v3 = new Object[1];
 53:    v3[0] = ex;
 55:    FinskyLog.c("Failed to load response proto, bad proto: %s", v3);
 60:    this.a.delete();
 63:    goto 46;
 67:    v3 = new Object[1];
 69:    v3[0] = ex;
 71:    FinskyLog.c("Failed to load response proto: %s", v3);
 74:    goto 46;
 78:    v3 = new Object[1];
 80:    v3[0] = ex;
 82:    FinskyLog.c("Failed to parse response proto, parseFrom method missing: %s", v3);
 85:    goto 46;
 89:    v3 = new Object[1];
 91:    v3[0] = ex;
 93:    FinskyLog.c("Failed to parse response proto, parseFrom method private: %s", v3);
 96:    goto 46;
 97:    try
            run 9...35
        catch (FileNotFoundException ex) {
  9:        goto 36;
        }
        catch (InvalidProtocolBufferNanoException ex) {
  9:        goto 48;
        }
        catch (IOException ex) {
  9:        goto 64;
        }
        catch (InvocationTargetException ex) {
  9:        goto 75;
        }
        catch (IllegalAccessException ex) {
  9:        goto 86;
        }
    }

    protected final void b(com.google.protobuf.nano.i p0) {
        this.c = p0;
        this.l();
    }

    public final void b_(Object p0) {
        this.a((com.google.protobuf.nano.i)p0);
    }

    protected final boolean c() {
        if (this.a.exists() && this.a.canRead())
            v0 = 1;
        else
            v0 = 0;
        return v0;
    }

}
