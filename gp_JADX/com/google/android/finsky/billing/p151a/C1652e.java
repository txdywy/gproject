package com.google.android.finsky.billing.p151a;

import android.os.SystemClock;
import android.text.TextUtils;
import com.android.volley.C0659a;
import com.android.volley.C0684b;
import com.android.volley.aa;
import com.google.android.finsky.utils.an;
import com.squareup.haha.perflib.HprofParser;
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
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

final class C1652e implements C0659a {
    public final Map f8591a = new LinkedHashMap(16, 0.75f, true);
    public long f8592b = 0;
    public final File f8593c;
    public final long f8594d;

    public C1652e(File file, long j) {
        this.f8593c = file;
        this.f8594d = j;
    }

    public final synchronized void mo1068b() {
        synchronized (this) {
            File[] listFiles = this.f8593c.listFiles();
            if (listFiles != null) {
                for (File delete : listFiles) {
                    delete.delete();
                }
            }
            this.f8591a.clear();
            this.f8592b = 0;
            aa.m4482b("Cache cleared.", new Object[0]);
        }
    }

    public final synchronized C0684b mo1064a(String str) {
        C0684b c0684b;
        C1653f c1653f = (C1653f) this.f8591a.get(str);
        if (c1653f == null) {
            c0684b = null;
        } else {
            File e = m9389e(str);
            C1654g c1654g;
            try {
                c1654g = new C1654g(new BufferedInputStream(C1652e.m9377a(e)), e.length());
                if (TextUtils.equals(str, C1653f.m9398a(c1654g).f8596b)) {
                    byte[] a = C1652e.m9384a(c1654g, c1654g.m9400a());
                    C0684b c0684b2 = new C0684b();
                    c0684b2.f4131a = a;
                    c0684b2.f4132b = c1653f.f8597c;
                    c0684b2.f4133c = c1653f.f8598d;
                    c0684b2.f4134d = c1653f.f8599e;
                    c0684b2.f4135e = c1653f.f8600f;
                    c0684b2.f4136f = c1653f.f8601g;
                    c0684b2.f4137g = c1653f.f8602h;
                    c1654g.close();
                    c0684b = c0684b2;
                } else {
                    aa.m4482b("%s: key=%s, found=%s", e.getAbsolutePath(), str, C1653f.m9398a(c1654g).f8596b);
                    m9390f(str);
                    c1654g.close();
                    c0684b = null;
                }
            } catch (IOException e2) {
                aa.m4482b("%s: %s", e.getAbsolutePath(), e2.toString());
                mo1069b(str);
                c0684b = null;
            } catch (Throwable th) {
                c1654g.close();
            }
        }
        return c0684b;
    }

    public final synchronized boolean m9397c(String str) {
        boolean z;
        C1653f c1653f = (C1653f) this.f8591a.get(str);
        z = c1653f != null && c1653f.f8600f > System.currentTimeMillis();
        return z;
    }

    public final synchronized void mo1065a() {
        if (this.f8593c.exists()) {
            File[] listFiles = this.f8593c.listFiles();
            if (listFiles != null) {
                for (File file : listFiles) {
                    C1654g c1654g;
                    try {
                        long length = file.length();
                        c1654g = new C1654g(new BufferedInputStream(C1652e.m9377a(file)), length);
                        C1653f a = C1653f.m9398a(c1654g);
                        a.f8595a = length;
                        m9382a(a.f8596b, a);
                        c1654g.close();
                    } catch (IOException e) {
                        file.delete();
                    } catch (Throwable th) {
                        c1654g.close();
                    }
                }
            }
        } else if (!this.f8593c.mkdirs()) {
            aa.m4483c("Unable to create cache dir %s", this.f8593c.getAbsolutePath());
        }
    }

    public final synchronized void mo1067a(String str, boolean z) {
        C0684b a = mo1064a(str);
        if (a != null) {
            a.f4136f = 0;
            if (z) {
                a.f4135e = 0;
            }
            mo1066a(str, a);
        }
    }

    public final synchronized void mo1066a(String str, C0684b c0684b) {
        int i = 0;
        synchronized (this) {
            int length = c0684b.f4131a.length;
            if (this.f8592b + ((long) length) >= this.f8594d) {
                int i2;
                if (aa.f4124b) {
                    aa.m4480a("Pruning old cache entries.", new Object[0]);
                }
                long j = this.f8592b;
                long elapsedRealtime = SystemClock.elapsedRealtime();
                Iterator it = this.f8591a.entrySet().iterator();
                while (it.hasNext()) {
                    C1653f c1653f = (C1653f) ((Entry) it.next()).getValue();
                    if (m9389e(c1653f.f8596b).delete()) {
                        this.f8592b -= c1653f.f8595a;
                    } else {
                        aa.m4482b("Could not delete cache entry for key=%s, filename=%s", c1653f.f8596b, C1652e.m9388d(c1653f.f8596b));
                    }
                    it.remove();
                    i2 = i + 1;
                    if (((float) (this.f8592b + ((long) length))) < ((float) this.f8594d) * 0.9f) {
                        break;
                    }
                    i = i2;
                }
                i2 = i;
                if (aa.f4124b) {
                    aa.m4480a("pruned %d files, %d bytes, %d ms", Integer.valueOf(i2), Long.valueOf(this.f8592b - j), Long.valueOf(SystemClock.elapsedRealtime() - elapsedRealtime));
                }
            }
            File e = m9389e(str);
            try {
                OutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(e));
                C1653f c1653f2 = new C1653f(str, c0684b);
                if (c1653f2.m9399a(bufferedOutputStream)) {
                    bufferedOutputStream.write(c0684b.f4131a);
                    bufferedOutputStream.close();
                    m9382a(str, c1653f2);
                } else {
                    bufferedOutputStream.close();
                    aa.m4482b("Failed to write header for %s", e.getAbsolutePath());
                    throw new IOException();
                }
            } catch (IOException e2) {
                if (!e.delete()) {
                    aa.m4482b("Could not clean up file %s", e.getAbsolutePath());
                }
            }
        }
    }

    public final synchronized void mo1069b(String str) {
        boolean delete = m9389e(str).delete();
        m9390f(str);
        if (!delete) {
            aa.m4482b("Could not delete cache entry for key=%s, filename=%s", str, C1652e.m9388d(str));
        }
    }

    private static String m9388d(String str) {
        int length = str.length() / 2;
        String valueOf = String.valueOf(String.valueOf(str.substring(0, length).hashCode()));
        String valueOf2 = String.valueOf(String.valueOf(str.substring(length).hashCode()));
        return valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
    }

    private final File m9389e(String str) {
        return new File(this.f8593c, C1652e.m9388d(str));
    }

    private final void m9382a(String str, C1653f c1653f) {
        if (this.f8591a.containsKey(str)) {
            C1653f c1653f2 = (C1653f) this.f8591a.get(str);
            this.f8592b = (c1653f.f8595a - c1653f2.f8595a) + this.f8592b;
        } else {
            this.f8592b += c1653f.f8595a;
        }
        this.f8591a.put(str, c1653f);
    }

    private final void m9390f(String str) {
        C1653f c1653f = (C1653f) this.f8591a.remove(str);
        if (c1653f != null) {
            this.f8592b -= c1653f.f8595a;
        }
    }

    private static byte[] m9384a(C1654g c1654g, long j) {
        long a = c1654g.m9400a();
        if (j < 0 || j > a || ((long) ((int) j)) != j) {
            throw new IOException("streamToBytes length=" + j + ", maxLength=" + a);
        }
        byte[] bArr = new byte[((int) j)];
        new DataInputStream(c1654g).readFully(bArr);
        return bArr;
    }

    private static InputStream m9377a(File file) {
        return new FileInputStream(file);
    }

    private static int m9387c(InputStream inputStream) {
        int read = inputStream.read();
        if (read != -1) {
            return read;
        }
        throw new EOFException();
    }

    static void m9379a(OutputStream outputStream, int i) {
        outputStream.write((i >> 0) & HprofParser.ROOT_UNKNOWN);
        outputStream.write((i >> 8) & HprofParser.ROOT_UNKNOWN);
        outputStream.write((i >> 16) & HprofParser.ROOT_UNKNOWN);
        outputStream.write((i >> 24) & HprofParser.ROOT_UNKNOWN);
    }

    static int m9376a(InputStream inputStream) {
        return ((((C1652e.m9387c(inputStream) << 0) | 0) | (C1652e.m9387c(inputStream) << 8)) | (C1652e.m9387c(inputStream) << 16)) | (C1652e.m9387c(inputStream) << 24);
    }

    static void m9380a(OutputStream outputStream, long j) {
        outputStream.write((byte) ((int) (j >>> null)));
        outputStream.write((byte) ((int) (j >>> 8)));
        outputStream.write((byte) ((int) (j >>> 16)));
        outputStream.write((byte) ((int) (j >>> 24)));
        outputStream.write((byte) ((int) (j >>> 32)));
        outputStream.write((byte) ((int) (j >>> 40)));
        outputStream.write((byte) ((int) (j >>> 48)));
        outputStream.write((byte) ((int) (j >>> 56)));
    }

    static long m9385b(InputStream inputStream) {
        return (((((((0 | ((((long) C1652e.m9387c(inputStream)) & 255) << null)) | ((((long) C1652e.m9387c(inputStream)) & 255) << 8)) | ((((long) C1652e.m9387c(inputStream)) & 255) << 16)) | ((((long) C1652e.m9387c(inputStream)) & 255) << 24)) | ((((long) C1652e.m9387c(inputStream)) & 255) << 32)) | ((((long) C1652e.m9387c(inputStream)) & 255) << 40)) | ((((long) C1652e.m9387c(inputStream)) & 255) << 48)) | ((((long) C1652e.m9387c(inputStream)) & 255) << 56);
    }

    static void m9381a(OutputStream outputStream, String str) {
        byte[] bytes = str.getBytes("UTF-8");
        C1652e.m9380a(outputStream, (long) bytes.length);
        outputStream.write(bytes, 0, bytes.length);
    }

    static String m9378a(C1654g c1654g) {
        return new String(C1652e.m9384a(c1654g, C1652e.m9385b((InputStream) c1654g)), "UTF-8");
    }

    static void m9383a(Map map, OutputStream outputStream) {
        if (map != null) {
            C1652e.m9379a(outputStream, map.size());
            for (Entry entry : map.entrySet()) {
                C1652e.m9381a(outputStream, (String) entry.getKey());
                C1652e.m9381a(outputStream, (String) entry.getValue());
            }
            return;
        }
        C1652e.m9379a(outputStream, 0);
    }

    static Map m9386b(C1654g c1654g) {
        Map emptyMap;
        int a = C1652e.m9376a((InputStream) c1654g);
        if (a == 0) {
            emptyMap = Collections.emptyMap();
        } else {
            emptyMap = new HashMap(a);
        }
        for (int i = 0; i < a; i++) {
            emptyMap.put(C1652e.m9378a(c1654g).intern(), C1652e.m9378a(c1654g).intern());
        }
        return emptyMap;
    }

    static {
        an.f24044g.mo4319a(5);
    }
}
