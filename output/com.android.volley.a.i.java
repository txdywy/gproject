package com.android.volley.a;

import android.os.SystemClock;
import android.text.TextUtils;
import com.android.volley.aa;
import com.android.volley.b;
import com.android.volley.j;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map$Entry;
import java.util.Set;

public final synchronized class com.android.volley.a.i implements com.android.volley.a
{

    public final Map a;
    public long b;
    public final File c;
    public final int d;

    i(File p0, int p1) {
        this.a = new LinkedHashMap(16, 1061158912, 1);
        this.b = 0;
        this.c = p0;
        this.d = p1;
    }

    static int a(InputStream p0) {
        return com.android.volley.a.i.c(p0) << 0 | 0 | com.android.volley.a.i.c(p0) << 8 | com.android.volley.a.i.c(p0) << 16 | com.android.volley.a.i.c(p0) << 24;
    }

    private static InputStream a(File p0) {
        return new FileInputStream(p0);
    }

    static String a(com.android.volley.a.k p0) {
        return new String(com.android.volley.a.i.a(p0, com.android.volley.a.i.b(p0)), "UTF-8");
    }

    static void a(OutputStream p0, int p1) {
        p0.write(p1 >> 0 & 255);
        p0.write(p1 >> 8 & 255);
        p0.write(p1 >> 16 & 255);
        p0.write(p1 >> 24 & 255);
    }

    static void a(OutputStream p0, long p1) {
        p0.write((byte)(int)(p1 >>> 0));
        p0.write((byte)(int)(p1 >>> 8));
        p0.write((byte)(int)(p1 >>> 16));
        p0.write((byte)(int)(p1 >>> 24));
        p0.write((byte)(int)(p1 >>> 32));
        p0.write((byte)(int)(p1 >>> 40));
        p0.write((byte)(int)(p1 >>> 48));
        p0.write((byte)(int)(p1 >>> 56));
    }

    static void a(OutputStream p0, String p1) {
        v0 = p1.getBytes("UTF-8");
        com.android.volley.a.i.a(p0, (long)v0.length);
        p0.write(v0, 0, v0.length);
    }

    private final void a(String p0, com.android.volley.a.j p1) {
        if (!this.a.containsKey(p0))
            this.b = this.b + p1.a;
        else
            this.b = p1.a - ((com.android.volley.a.j)this.a.get(p0)).a + this.b;
        this.a.put(p0, p1);
    }

    private static byte[] a(com.android.volley.a.k p0, long p1) {
        v0 = p0.a();
        if (p1 < 0 || p1 > v0 || (long)(int)p1 != p1)
            throw new IOException(73 + "streamToBytes length=" + p1 + ", maxLength=" + v0);
        v0 = new byte[(int)p1];
        new DataInputStream(p0).readFully(v0);
        return v0;
    }

    static long b(InputStream p0) {
        return 0 | ((long)com.android.volley.a.i.c(p0) & 255) << 0 | ((long)com.android.volley.a.i.c(p0) & 255) << 8 | ((long)com.android.volley.a.i.c(p0) & 255) << 16 | ((long)com.android.volley.a.i.c(p0) & 255) << 24 | ((long)com.android.volley.a.i.c(p0) & 255) << 32 | ((long)com.android.volley.a.i.c(p0) & 255) << 40 | ((long)com.android.volley.a.i.c(p0) & 255) << 48 | ((long)com.android.volley.a.i.c(p0) & 255) << 56;
    }

    static List b(com.android.volley.a.k p0) {
        v2 = com.android.volley.a.i.a(p0);
        if (v2 == 0)
            v0 = Collections.emptyList();
        else
            v0 = new ArrayList(v2);
        v1 = 0;
        while (v1 < v2) {
            v0.add(new com.android.volley.j(com.android.volley.a.i.a(p0).intern(), com.android.volley.a.i.a(p0).intern()));
            v1 = v1 + 1;
        }
        return v0;
    }

    private static int c(InputStream p0) {
        v0 = p0.read();
        if (v0 == -1)
            throw new EOFException();
        return v0;
    }

    private static String c(String p0) {
        v0 = p0.length() / 2;
        v1 = String.valueOf(String.valueOf(p0.substring(0, v0).hashCode()));
        v0 = String.valueOf(String.valueOf(p0.substring(v0).hashCode()));
        if (v0.length() != 0)
            v0 = v1.concat(v0);
        else
            v0 = new String(v1);
        return v0;
    }

    private final File d(String p0) {
        return new File(this.c, com.android.volley.a.i.c(p0));
    }

    private final void e(String p0) {
        v0 = (com.android.volley.a.j)this.a.remove(p0);
        if (v0 != 0)
            this.b = this.b - v0.a;
    }

    public final synchronized com.android.volley.b a(String p0) {
  1:    enter this;
  2:    try {
  8:        v0 = (com.android.volley.a.j)this.a.get(p0);
        }
        catch (Throwable ex) {
171:        exit this;
172:        throw ex;
        }
 10:    if (v0 != 0) goto 15;
 12:    v0 = 0;
 13:    exit this;
 14:    return v0;
 15:    try {
 15:        v3 = this.d(p0);
        }
        catch (Throwable ex) {
171:        exit this;
172:        throw ex;
        }
 34:    v4 = new com.android.volley.a.k(new BufferedInputStream(com.android.volley.a.i.a(v3)), v3.length());
 37:    v2 = com.android.volley.a.j.a(v4);
 47:    if (TextUtils.equals(p0, v2.b)) goto 80;
 52:    v5 = new Object[3];
 59:    v5[0] = v3.getAbsolutePath();
 62:    v5[1] = p0;
 67:    v5[2] = v2.b;
 69:    com.android.volley.aa.b("%s: key=%s, found=%s", v5);
 72:    this.e(p0);
 75:    v4.close();
 78:    v0 = 0;
 79:    goto 13;
 80:    try {
 90:        v2 = new com.android.volley.b();
 93:        v2.a = com.android.volley.a.i.a(v4, v4.a());
 97:        v2.b = v0.c;
101:        v2.c = v0.d;
105:        v2.d = v0.e;
109:        v2.e = v0.f;
113:        v2.f = v0.g;
121:        v2.g = com.android.volley.a.n.a(v0.h);
129:        v2.h = Collections.unmodifiableList(v0.h);
        }
        catch (Throwable ex) {
137:        v4.close();
140:        throw ex;
        }
131:    v4.close();
134:    v0 = v2;
135:    goto 13;
137:    v4.close();
140:    throw ex;
142:    try {
145:        v4 = new Object[2];
152:        v4[0] = v3.getAbsolutePath();
159:        v4[1] = ex.toString();
161:        com.android.volley.aa.b("%s: %s", v4);
164:        this.b(p0);
        }
        catch (Throwable ex) {
171:        exit this;
172:        throw ex;
        }
167:    v0 = 0;
168:    goto 13;
171:    exit this;
172:    throw ex;
174:    try
            run 131...141
        catch (IOException ex) {
131:        goto 141;
        }
        catch (Throwable ex) {
131:        goto 170;
        }
176:    try
            run 75...78
        catch (IOException ex) {
 75:        goto 141;
        }
        catch (Throwable ex) {
 75:        goto 170;
        }
177:    try
            run 37...75
        catch (Throwable ex) {
 37:        goto 136;
        }
178:    try
            run 19...37
        catch (IOException ex) {
 19:        goto 141;
        }
        catch (Throwable ex) {
 19:        goto 170;
        }
    }

    public final synchronized void a() {
  1:    enter this;
  2:    try {
  8:        if (!this.c.exists()) {
 16:            if (!this.c.mkdirs()) {
 21:                v1 = new Object[1];
 30:                v1[0] = this.c.getAbsolutePath();
 32:                com.android.volley.aa.c("Unable to create cache dir %s", v1);
                }
 35:            exit this;
 36:            return;
            }
        }
        catch (Throwable ex) {
 98:        exit this;
 99:        throw ex;
        }
 39:    v2 = this.c.listFiles();
 43:    if (v2 == 0) {
 35:        exit this;
 36:        return;
        }
 46:    v1 = 0;
 47:    if (v1 >= v2.length) {
 35:        exit this;
 36:        return;
        }
 49:    v4 = v2[v1];
 51:    v6 = v4.length();
 66:    v5 = new com.android.volley.a.k(new BufferedInputStream(com.android.volley.a.i.a(v4)), v6);
 69:    try {
 69:        v0 = com.android.volley.a.j.a(v5);
 73:        v0.a = v6;
 77:        this.a(v0.b, v0);
        }
        catch (Throwable ex) {
 88:        v5.close();
 91:        throw ex;
        }
 80:    v5.close();
 85:    v1 = v1 + 1;
 86:    goto 47;
 93:    try {
 93:        v4.delete();
        }
        catch (Throwable ex) {
 98:        exit this;
 99:        throw ex;
        }
 96:    goto 83;
 98:    exit this;
 99:    throw ex;
101:    try
            run 80...92
        catch (IOException ex) {
 80:        goto 92;
        }
        catch (Throwable ex) {
 80:        goto 97;
        }
103:    try
            run 51...69
        catch (IOException ex) {
 51:        goto 92;
        }
        catch (Throwable ex) {
 51:        goto 97;
        }
104:    try
            run 37...51
        catch (Throwable ex) {
 37:        goto 97;
        }
    }

    public final synchronized void a(String p0, com.android.volley.b p1) {
  0:    v1 = 0;
  1:    enter this;
 14:    if (this.b + (long)p1.a.length < (long)this.d) goto 144;
 18:    if (com.android.volley.aa.b != 0)
 25:        com.android.volley.aa.a("Pruning old cache entries.", new Object[0]);
 40:    v3 = this.a.entrySet().iterator();
 48:    if (!v3.hasNext()) goto 259;
 60:    v0 = (com.android.volley.a.j)((Map$Entry)v3.next()).getValue();
 72:    if (this.d(v0.b).delete())
 79:        this.b = this.b - v0.a;
        else {
217:        try {
220:            v9 = new Object[2];
225:            v9[0] = v0.b;
234:            v9[1] = com.android.volley.a.i.c(v0.b);
236:            com.android.volley.aa.b("Could not delete cache entry for key=%s, filename=%s", v9);
            }
            catch (Throwable ex) {
242:            exit this;
243:            throw ex;
            }
        }
 81:    v3.remove();
 84:    v0 = v1 + 1;
100:    if ((float)(this.b + (long)p1.a.length) >= (float)this.d * 1063675494) goto 256;
104:    if (com.android.volley.aa.b != 0) {
109:        v2 = new Object[3];
116:        v2[0] = Integer.valueOf(v0);
127:        v2[1] = Long.valueOf(this.b - this.b);
139:        v2[2] = Long.valueOf(SystemClock.elapsedRealtime() - SystemClock.elapsedRealtime());
141:        com.android.volley.aa.a("pruned %d files, %d bytes, %d ms", v2);
        }
144:    v0 = this.d(p0);
148:    try {
155:        v1 = new BufferedOutputStream(new FileOutputStream(v0));
160:        v2 = new com.android.volley.a.j(p0, p1);
167:        if (!v2.a(v1)) {
169:            v1.close();
175:            v2 = new Object[1];
182:            v2[0] = v0.getAbsolutePath();
184:            com.android.volley.aa.b("Failed to write header for %s", v2);
192:            throw new IOException();
            }
        }
        catch (IOException ex) {
194:        try {
198:            if (!v0.delete()) {
203:                v2 = new Object[1];
210:                v2[0] = v0.getAbsolutePath();
212:                com.android.volley.aa.b("Could not clean up file %s", v2);
                }
            }
            catch (Throwable ex) {
242:            exit this;
243:            throw ex;
            }
215:        exit this;
216:        return;
        }
        catch (Throwable ex) {
242:        exit this;
243:        throw ex;
        }
168:    goto 244;
194:    try {
198:        if (!v0.delete()) {
203:            v2 = new Object[1];
210:            v2[0] = v0.getAbsolutePath();
212:            com.android.volley.aa.b("Could not clean up file %s", v2);
            }
        }
        catch (Throwable ex) {
242:        exit this;
243:        throw ex;
        }
215:    exit this;
216:    return;
242:    exit this;
243:    throw ex;
244:    try {
246:        v1.write(p1.a);
249:        v1.close();
252:        this.a(p0, v2);
        }
        catch (IOException ex) {
198:        if (!v0.delete()) {
203:            v2 = new Object[1];
210:            v2[0] = v0.getAbsolutePath();
212:            com.android.volley.aa.b("Could not clean up file %s", v2);
            }
215:        exit this;
216:        return;
        }
        catch (Throwable ex) {
242:        exit this;
243:        throw ex;
        }
255:    goto 215;
256:    v1 = v0;
257:    goto 44;
259:    v0 = v1;
260:    goto 102;
265:    try
            run 2...147
        catch (Throwable ex) {
  2:        goto 241;
        }
    }

    public final synchronized void a(String p0, boolean p1) {
        enter this;
        try {
            v0 = this.a(p0);
            if (v0 != 0) {
                v0.f = 0;
                if (p1 != 0)
                    v0.e = 0;
                this.a(p0, v0);
            }
        }
        catch (Throwable ex) {
            exit this;
            throw ex;
        }
        exit this;
    }

    public final synchronized void b() {
        v0 = 0;
        enter this;
        try {
            v1 = this.c.listFiles();
            if (v1 != 0)
                while (v0 < v1.length) {
                    v1[v0].delete();
                    v0 = v0 + 1;
                }
            this.a.clear();
            this.b = 0;
            com.android.volley.aa.b("Cache cleared.", new Object[0]);
        }
        catch (Throwable ex) {
            exit this;
            throw ex;
        }
        exit this;
    }

    public final synchronized void b(String p0) {
        enter this;
        try {
            this.e(p0);
            if (!this.d(p0).delete()) {
                v1 = new Object[2];
                v1[0] = p0;
                v1[1] = com.android.volley.a.i.c(p0);
                com.android.volley.aa.b("Could not delete cache entry for key=%s, filename=%s", v1);
            }
        }
        catch (Throwable ex) {
            exit this;
            throw ex;
        }
        exit this;
    }

}
