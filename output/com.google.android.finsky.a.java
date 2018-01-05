package com.google.android.finsky;

import android.content.Context;
import android.util.Log;
import com.google.android.finsky.aa.a;
import com.google.android.finsky.aa.b;
import com.google.android.finsky.aa.c;
import com.google.android.finsky.aa.o;
import com.google.android.finsky.ai.b;
import com.google.android.finsky.ba.c;
import com.google.android.finsky.ba.e;
import com.google.android.finsky.bn.f;
import com.google.android.finsky.d.q;
import com.google.android.finsky.dd.a;
import com.google.android.finsky.i.a;
import com.google.android.finsky.providers.d;
import com.google.android.finsky.setup.RestoreService;
import com.google.android.finsky.setup.bp;
import com.google.android.finsky.utils.j;
import com.google.android.play.utils.b.a;
import com.google.c.a.a.a.a.a;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Locale;

public final class com.google.android.finsky.a implements Thread$UncaughtExceptionHandler
{

    public final Context a;
    public final com.google.android.finsky.i.a b;
    public final boolean c;
    public final int d;
    public final File e;
    public int f;
    public long g;
    public Thread$UncaughtExceptionHandler h;
    public volatile boolean i;
    public String j;
    public String k;
    public Boolean l;
    public com.google.android.finsky.d.q m;
    public long n;
    public long o;

    a(Context p0, com.google.android.finsky.i.a p1, com.google.android.finsky.ba.c p2) {
        ((com.google.android.finsky.o)com.google.android.finsky.providers.d.a(com.google.android.finsky.o)).a(this);
        this.a = p0;
        this.b = p1;
        if (p2.dj().a(12635440) && p2.dj().a(12635488))
            v0 = 1;
        else
            v0 = 0;
        this.c = v0;
        v0 = p2.dj();
        if (v0.a(12635426))
            this.d = 1;
        else if (v0.a(12635480))
            this.d = 2;
        else
            this.d = 0;
        v7 = new Object[1];
        v7[0] = Integer.valueOf(808539);
        this.e = new File(p0.getCacheDir(), String.format(Locale.US, "crash%d", v7));
        this.a();
        if (this.f > 0) {
            if (this.a(((Integer)com.google.android.finsky.aa.b.fx.b()).intValue())) {
                this.a("Cleanup cache");
                try {
                    this.a(new File(this.a.getCacheDir(), "main"));
                    this.a(new File(this.a.getCacheDir(), "images"));
                    this.a(new File(this.a.getCacheDir(), "cache_and_sync_images"));
                }
                catch (Exception ex) {
                    this.a("Failed to cleanup Volley cache", ex);
                }
            }
            if (this.a(((Integer)com.google.android.finsky.aa.b.fy.b()).intValue())) {
                this.a("Cleanup data stores");
                this.a("Cleanup restore data store");
                try {
                    RestoreService.a(this.a);
                    com.google.android.finsky.setup.bp.a(this.a);
                }
                catch (Exception ex) {
                    this.a("Failed to cleanup restore data store", ex);
                }
                this.a("Cleanup installer data store");
                try {
                    com.google.android.finsky.bn.f.a(this.a, 0);
                }
                catch (Exception ex) {
                    this.a("Failed to cleanup installer data store", ex);
                }
            }
            if (this.a(((Integer)com.google.android.finsky.aa.b.fA.b()).intValue())) {
                this.a("Cleanup self update data store");
                try {
                    com.google.android.finsky.dd.a.a();
                }
                catch (Exception ex) {
                    this.a("Failed to cleanup self update data store", ex);
                }
            }
            if (this.a(((Integer)com.google.android.finsky.aa.b.fz.b()).intValue())) {
                this.a("Cleanup user preferences");
                try {
                    com.google.android.finsky.aa.a.a.b();
                    com.google.android.finsky.aa.o.b.b();
                    com.google.android.finsky.ai.b.a.b();
                }
                catch (Exception ex) {
                    this.a("Failed to cleanup user prefs", ex);
                }
            }
            this.a(this.f, this.g, 1, 0, this.l, this.n, this.o);
        }
    }

    private final void a() {
  2:    try {
  8:        if (!this.e.exists()) {
 10:            this.b();
 13:            return;
            }
 23:        v3 = new DataInputStream(new FileInputStream(this.e));
        }
        catch (Exception ex) {
118:        this.a("Failed to read crash file", ex);
121:        this.b();
126:        this.a(this.e);
129:        return;
        }
 26:    try {
 30:        this.f = v3.readInt();
 36:        this.g = v3.readLong();
 38:        v4 = v3.readBoolean();
 46:        this.j = v3.readUTF();
 52:        this.k = v3.readUTF();
 56:        this.n = -1;
 60:        this.o = -1;
 66:        if (v3.available() <= 0) {
180:            try {
180:                v3.close();
185:                this.a("Read crash info");
202:                if (this.f > ((Integer)com.google.android.finsky.aa.b.fw.b()).intValue())
204:                    v3 = 1;
                    else
258:                    v3 = 0;
211:                if (this.g > 0 && System.currentTimeMillis() - this.g > ((Long)com.google.android.finsky.aa.b.fv.b()).longValue())
236:                    v0 = 1;
                    else
260:                    v0 = 0;
237:                if (v0 != 0 || v4 != 0 || v3 != 0) {
245:                    this.a("Crash info expired");
248:                    this.b();
253:                    this.a(this.e);
                    }
                }
                catch (Exception ex) {
118:                this.a("Failed to read crash file", ex);
121:                this.b();
126:                this.a(this.e);
                }
256:            return;
            }
 68:        v5 = v3.readUTF();
 72:        v0 = -1;
 77:        switch (v5.hashCode()) {
                case -47067292:
146:                if (v5.equals("last_id"))
148:                    v0 = 1;
267:                break;
                case 100490230:
136:                if (v5.equals("is_fg"))
138:                    v0 = 0;
267:                break;
                default:
267:                break;
            }
 80:        switch (v0) {
                case 0:
158:                this.l = Boolean.valueOf(v3.readBoolean());
267:                break;
                case 1:
165:                this.n = v3.readLong();
171:                this.o = v3.readLong();
267:                break;
                default:
 85:                this.a("Unknown key in crash file");
 92:                v0 = String.valueOf(v5);
100:                if (v0.length() != 0)
102:                    v0 = "No such key: ".concat(v0);
                    else
176:                    v0 = new String("No such key: ");
109:                throw new IOException(v0);
            }
        }
        catch (Throwable ex) {
        }
111:    try {
111:        v3.close();
114:        throw ex;
        }
        catch (Exception ex) {
118:        this.a("Failed to read crash file", ex);
121:        this.b();
126:        this.a(this.e);
129:        return;
        }
180:    try {
180:        v3.close();
185:        this.a("Read crash info");
202:        if (this.f > ((Integer)com.google.android.finsky.aa.b.fw.b()).intValue())
204:            v3 = 1;
            else
258:            v3 = 0;
211:        if (this.g > 0 && System.currentTimeMillis() - this.g > ((Long)com.google.android.finsky.aa.b.fv.b()).longValue())
236:            v0 = 1;
            else
260:            v0 = 0;
237:        if (v0 != 0 || v4 != 0 || v3 != 0) {
245:            this.a("Crash info expired");
248:            this.b();
253:            this.a(this.e);
            }
        }
        catch (Exception ex) {
118:        this.a("Failed to read crash file", ex);
121:        this.b();
126:        this.a(this.e);
        }
256:    return;
263:    try
            run 130...179
        catch (Throwable ex) {
130:        goto 110;
        }
    }

    private final void a(int p0, long p1, boolean p3, Throwable p4, Boolean p5, long p6, long p8) {
  1:    try {
 10:        v3 = new DataOutputStream(new FileOutputStream(this.e));
        }
        catch (Exception ex) {
129:        v2 = ex;
130:        v3 = 0;
133:        this.a("Failed to write crash file", v2);
136:        com.google.android.finsky.utils.j.a(v3);
139:        return;
        }
        catch (Throwable ex) {
140:        v2 = ex;
141:        v3 = 0;
142:        com.google.android.finsky.utils.j.a(v3);
145:        throw v2;
        }
 13:    v3.writeInt(p0);
 16:    v3.writeLong(p1);
 19:    v3.writeBoolean(p3);
 22:    v4 = "";
 24:    v2 = "";
 26:    if (p4 != 0) {
 32:        v4 = p4.getClass().getSimpleName();
 38:        v2 = new StringWriter();
 46:        com.google.c.a.a.a.a.a.a(p4, new PrintWriter(v2));
 78:        v2 = v2.getBuffer().substring(0, Math.min(v2.getBuffer().length(), ((Integer)com.google.android.finsky.aa.b.gF.b()).intValue()));
        }
 82:    v3.writeUTF(v4);
 85:    v3.writeUTF(v2);
 90:    if (this.c != 0 && p5 != 0) {
 96:        v3.writeUTF("is_fg");
103:        v3.writeBoolean(p5.booleanValue());
        }
108:    if (this.d != 0) {
112:        v3.writeUTF("last_id");
117:        v3.writeLong(p6);
122:        v3.writeLong(p8);
        }
125:    com.google.android.finsky.utils.j.a(v3);
128:    return;
129:    v2 = ex;
130:    v3 = 0;
133:    this.a("Failed to write crash file", v2);
136:    com.google.android.finsky.utils.j.a(v3);
139:    return;
140:    v2 = ex;
141:    v3 = 0;
142:    com.google.android.finsky.utils.j.a(v3);
145:    throw v2;
146:    v2 = ex;
147:    goto 142;
148:    v2 = ex;
149:    goto 131;
150:    try
            run 131...136
        catch (Throwable ex) {
131:        goto 146;
        }
151:    try
            run 13...125
        catch (Exception ex) {
 13:        goto 148;
        }
        catch (Throwable ex) {
 13:        goto 146;
        }
    }

    private final void a(File p0) {
        try {
            if (p0.isDirectory()) {
                v1 = p0.listFiles();
                if (v1 != 0) {
                    v0 = 0;
                    while (v0 < v1.length) {
                        this.a(v1[v0]);
                        v0 = v0 + 1;
                    }
                }
            }
            if (!p0.delete()) {
                v0 = String.valueOf(p0);
                this.a((String.valueOf(v0).length() + 23) + "Failed to delete file: " + v0);
            }
        }
        catch (Exception ex) {
            v1 = String.valueOf(p0);
            this.a((String.valueOf(v1).length() + 23) + "Failed to delete file: " + v1, ex);
        }
    }

    private final void a(String p0) {
        try {
            v3 = new Object[2];
            v3[0] = p0;
            v3[1] = this;
            Log.w("Finsky.CrashDetector", String.format(Locale.US, "%s %s.", v3));
        }
        catch (Exception ex) {
        }
    }

    private final void a(String p0, Throwable p1) {
        try {
            v3 = new Object[2];
            v3[0] = p0;
            v3[1] = this;
            Log.w("Finsky.CrashDetector", String.format(Locale.US, "%s %s.", v3), p1);
        }
        catch (Exception ex) {
        }
    }

    private final boolean a(int p0) {
        if (p0 > 0 && this.f >= p0)
            v0 = 1;
        else
            v0 = 0;
        return v0;
    }

    private final void b() {
        this.f = 0;
        this.g = 0;
        this.n = -1;
        this.o = -1;
    }

    public final String toString() {
        v2 = new Object[4];
        v2[0] = Integer.valueOf(this.f);
        v2[1] = Long.valueOf(this.g);
        v2[2] = this.j;
        v2[3] = this.l;
        return String.format(Locale.US, "cnt=%d ts=%d cause=%s fg=%b\"", v2);
    }

    public final void uncaughtException(Thread p0, Throwable p1) {
        v10 = -1;
        if (this.i == 0) {
            if (!this.b.a())
                v0 = 1;
            else
                v0 = 0;
            this.i = 1;
            if (this.d != 0) {
                v8 = ((Long)this.m.a.get()).longValue();
                v10 = this.m.b;
            }
            else
                v8 = -1;
            this.a(this.f + 1, System.currentTimeMillis(), 0, p1, Boolean.valueOf(v0), v8, v10);
        }
        if (this.h != 0)
            this.h.uncaughtException(p0, p1);
    }

}
