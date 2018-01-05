package com.google.android.finsky.billing.a;

import android.content.Context;
import com.android.volley.b;
import com.google.android.finsky.d.c;
import com.google.android.finsky.d.w;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.an;
import com.google.android.finsky.utils.i;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import com.google.protobuf.nano.i;
import com.google.wireless.android.finsky.dfe.c.a.ae;
import com.google.wireless.android.finsky.dfe.c.a.du;
import com.google.wireless.android.finsky.dfe.c.a.h;
import java.io.File;

final synchronized class com.google.android.finsky.billing.a.a
{

    public static final long a;
    public final File b;
    public final com.google.android.finsky.billing.a.n c;
    public com.google.android.finsky.billing.a.e d;

    static {
        com.google.android.finsky.billing.a.a.a = com.google.android.finsky.utils.an.g.a(2);
    }

    a(Context p0, com.google.android.finsky.billing.a.n p1) {
        this.b = p0.getDir("commerce_acquire_cache", 0);
        this.c = p1;
    }

    private final void a(com.google.android.finsky.d.w p0, com.google.android.finsky.billing.a.d p1) {
        if (this.d == 0) {
            this.d = new com.google.android.finsky.billing.a.e(this.b, com.google.android.finsky.billing.a.a.a);
            this.d.a();
            if (p0 != 0)
                p0.a(new com.google.android.finsky.d.c(2030));
            if (p1 != 0)
                p1.a();
        }
    }

    static void a(File p0) {
  6:    if (p0.listFiles() == 0) {
 42:        v2 = new Object[1];
 48:        v2[0] = p0.getAbsolutePath();
 50:        FinskyLog.c("Got null list of files for directory: %s", v2);
 57:        FinskyLog.a("Commerce cache was cleared.", new Object[0]);
 60:        return;
        }
  8:    v2 = p0.listFiles();
 13:    v0 = 0;
 14:    while (v0 < v2.length) {
 22:        if (!v2[v0].delete()) {
 26:            v6 = new Object[1];
 32:            v6[0] = v2[v0].getAbsolutePath();
 34:            FinskyLog.c("Couldn't delete the file: %s", v6);
            }
 37:        v0 = v0 + 1;
        }
 39:    goto 53;
 42:    v2 = new Object[1];
 48:    v2[0] = p0.getAbsolutePath();
 50:    FinskyLog.c("Got null list of files for directory: %s", v2);
 57:    FinskyLog.a("Commerce cache was cleared.", new Object[0]);
    }

    final synchronized void a(com.google.android.finsky.billing.a.d p0) {
        enter this;
        try {
            com.google.android.finsky.billing.a.a.a(this.b);
            if (p0 != 0)
                p0.e();
        }
        catch (Throwable ex) {
            exit this;
            throw ex;
        }
        exit this;
    }

    public final synchronized void a(String p0, com.google.android.finsky.billing.a.d p1) {
        enter this;
        try {
            this.a(0, p1);
            this.d.b(p0);
            p1.f();
        }
        catch (Throwable ex) {
            exit this;
            throw ex;
        }
        exit this;
    }

    final synchronized void a(String p0, com.google.wireless.android.finsky.dfe.c.a.ae p1, long p2, com.google.android.finsky.d.w p4) {
        enter this;
        try {
            this.a(p0, com.google.protobuf.nano.i.a(p1), p2, p4);
        }
        catch (Throwable ex) {
            exit this;
            throw ex;
        }
        exit this;
    }

    final synchronized void a(String p0, com.google.wireless.android.finsky.dfe.c.a.du p1, long p2, com.google.android.finsky.d.w p4) {
        enter this;
        try {
            this.a(p0, com.google.protobuf.nano.i.a(p1), p2, p4);
        }
        catch (Throwable ex) {
            exit this;
            throw ex;
        }
        exit this;
    }

    final synchronized void a(String p0, byte[] p1, long p2, com.google.android.finsky.d.w p4) {
        enter this;
        try {
            this.a(p4, 0);
            v0 = new com.android.volley.b();
            v0.a = p1;
            v0.e = com.google.android.finsky.utils.i.a() + p2;
            this.d.a(p0, v0);
        }
        catch (Throwable ex) {
            exit this;
            throw ex;
        }
        exit this;
    }

    final synchronized boolean a(String p0) {
        enter this;
        try {
            exit this;
        }
        catch (Throwable ex) {
            exit this;
            throw ex;
        }
        return this.d.c(p0);
    }

    public final synchronized com.google.wireless.android.finsky.dfe.c.a.ae b(String p0, com.google.android.finsky.billing.a.d p1) {
        enter this;
        try {
            this.a(0, p1);
            v0 = this.d.a(p0);
            if (v0 == 0) {
                p1.c(2);
                v0 = 0;
            }
            else {
                try {
                    if (v0.a()) {
                        p1.c(3);
                        v0 = 0;
                    }
                    else {
                        try {
                            v0 = (com.google.wireless.android.finsky.dfe.c.a.ae)com.google.protobuf.nano.i.a(new com.google.wireless.android.finsky.dfe.c.a.ae(), v0.a);
                            p1.d();
                        }
                        catch (InvalidProtocolBufferNanoException ex) {
                            try {
                                p1.c(4);
                                v3 = new Object[1];
                                v3[0] = ex.toString();
                                FinskyLog.c("Got an exception trying to parse the response: %s", v3);
                            }
                            catch (Throwable ex) {
                                exit this;
                                throw ex;
                            }
                            v0 = 0;
                        }
                        catch (Throwable ex) {
                            exit this;
                            throw ex;
                        }
                    }
                }
                catch (Throwable ex) {
                    exit this;
                    throw ex;
                }
            }
        }
        catch (Throwable ex) {
            exit this;
            throw ex;
        }
        exit this;
        return v0;
    }

    public final synchronized com.google.wireless.android.finsky.dfe.c.a.du c(String p0, com.google.android.finsky.billing.a.d p1) {
        enter this;
        try {
            this.a(0, p1);
            v0 = this.d.a(p0);
            if (v0 == 0) {
                p1.b(2);
                v0 = 0;
            }
            else {
                try {
                    if (v0.a()) {
                        p1.b(3);
                        v0 = 0;
                    }
                    else {
                        try {
                            v0 = (com.google.wireless.android.finsky.dfe.c.a.du)com.google.protobuf.nano.i.a(new com.google.wireless.android.finsky.dfe.c.a.du(), v0.a);
                            p1.c();
                        }
                        catch (InvalidProtocolBufferNanoException ex) {
                            try {
                                p1.b(4);
                                v3 = new Object[1];
                                v3[0] = ex.toString();
                                FinskyLog.c("Got an exception trying to parse the response: %s", v3);
                            }
                            catch (Throwable ex) {
                                exit this;
                                throw ex;
                            }
                            v0 = 0;
                        }
                        catch (Throwable ex) {
                            exit this;
                            throw ex;
                        }
                    }
                }
                catch (Throwable ex) {
                    exit this;
                    throw ex;
                }
            }
        }
        catch (Throwable ex) {
            exit this;
            throw ex;
        }
        exit this;
        return v0;
    }

    final synchronized com.google.wireless.android.finsky.dfe.c.a.h d(String p0, com.google.android.finsky.billing.a.d p1) {
  1:    enter this;
  3:    try {
  3:        this.a(0, p1);
  8:        v0 = this.d.a(p0);
 12:        if (v0 == 0) {
 14:            if (p1 != 0)
 17:                p1.a(2);
 20:            v0 = 0;
            }
            else {
 23:            try {
 27:                if (v0.a()) {
 29:                    if (p1 != 0)
 32:                        p1.a(3);
 35:                    v0 = 0;
                    }
                    else {
 48:                    v0 = (com.google.wireless.android.finsky.dfe.c.a.h)com.google.protobuf.nano.i.a(new com.google.wireless.android.finsky.dfe.c.a.h(), v0.a);
 50:                    if (p1 != 0)
 52:                        p1.b();
                    }
                }
                catch (Throwable ex) {
 81:                exit this;
 82:                throw ex;
                }
            }
        }
        catch (Throwable ex) {
 81:        exit this;
 82:        throw ex;
        }
 21:    exit this;
 22:    return v0;
 48:    v0 = (com.google.wireless.android.finsky.dfe.c.a.h)com.google.protobuf.nano.i.a(new com.google.wireless.android.finsky.dfe.c.a.h(), v0.a);
 50:    if (p1 != 0)
 52:        p1.b();
 55:    goto 21;
 57:    if (p1 == 0) goto 63;
 60:    p1.a(4);
 66:    v3 = new Object[1];
 73:    v3[0] = ex.toString();
 75:    FinskyLog.c("Got an exception trying to parse the response: %s", v3);
 78:    v0 = 0;
 79:    goto 21;
 81:    exit this;
 82:    throw ex;
 83:    try
            run 60...78
        catch (Throwable ex) {
 60:        goto 80;
        }
 84:    try
            run 37...55
        catch (InvalidProtocolBufferNanoException ex) {
 37:        goto 56;
        }
        catch (Throwable ex) {
 37:        goto 80;
        }
    }

}
