package com.android.volley.p060a;

import android.os.SystemClock;
import android.text.TextUtils;
import com.android.volley.C0659a;
import com.android.volley.C0684b;
import com.android.volley.C0695j;
import com.android.volley.aa;
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
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public final class C0668i implements C0659a {
    public final Map f4076a = new LinkedHashMap(16, 0.75f, true);
    public long f4077b = 0;
    public final File f4078c;
    public final int f4079d;

    public C0668i(File file, int i) {
        this.f4078c = file;
        this.f4079d = i;
    }

    public final synchronized void mo1068b() {
        synchronized (this) {
            File[] listFiles = this.f4078c.listFiles();
            if (listFiles != null) {
                for (File delete : listFiles) {
                    delete.delete();
                }
            }
            this.f4076a.clear();
            this.f4077b = 0;
            aa.m4482b("Cache cleared.", new Object[0]);
        }
    }

    public final synchronized C0684b mo1064a(String str) {
        C0684b c0684b;
        C0669j c0669j = (C0669j) this.f4076a.get(str);
        if (c0669j == null) {
            c0684b = null;
        } else {
            File d = m4445d(str);
            C0670k c0670k;
            try {
                c0670k = new C0670k(new BufferedInputStream(C0668i.m4434a(d)), d.length());
                if (TextUtils.equals(str, C0669j.m4453a(c0670k).f4081b)) {
                    byte[] a = C0668i.m4440a(c0670k, c0670k.m4455a());
                    C0684b c0684b2 = new C0684b();
                    c0684b2.f4131a = a;
                    c0684b2.f4132b = c0669j.f4082c;
                    c0684b2.f4133c = c0669j.f4083d;
                    c0684b2.f4134d = c0669j.f4084e;
                    c0684b2.f4135e = c0669j.f4085f;
                    c0684b2.f4136f = c0669j.f4086g;
                    c0684b2.f4137g = C0673n.m4464a(c0669j.f4087h);
                    c0684b2.f4138h = Collections.unmodifiableList(c0669j.f4087h);
                    c0670k.close();
                    c0684b = c0684b2;
                } else {
                    aa.m4482b("%s: key=%s, found=%s", d.getAbsolutePath(), str, C0669j.m4453a(c0670k).f4081b);
                    m4446e(str);
                    c0670k.close();
                    c0684b = null;
                }
            } catch (IOException e) {
                aa.m4482b("%s: %s", d.getAbsolutePath(), e.toString());
                mo1069b(str);
                c0684b = null;
            } catch (Throwable th) {
                c0670k.close();
            }
        }
        return c0684b;
    }

    public final synchronized void mo1065a() {
        if (this.f4078c.exists()) {
            File[] listFiles = this.f4078c.listFiles();
            if (listFiles != null) {
                for (File file : listFiles) {
                    C0670k c0670k;
                    try {
                        long length = file.length();
                        c0670k = new C0670k(new BufferedInputStream(C0668i.m4434a(file)), length);
                        C0669j a = C0669j.m4453a(c0670k);
                        a.f4080a = length;
                        m4439a(a.f4081b, a);
                        c0670k.close();
                    } catch (IOException e) {
                        file.delete();
                    } catch (Throwable th) {
                        c0670k.close();
                    }
                }
            }
        } else if (!this.f4078c.mkdirs()) {
            aa.m4483c("Unable to create cache dir %s", this.f4078c.getAbsolutePath());
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
            if (this.f4077b + ((long) length) >= ((long) this.f4079d)) {
                int i2;
                if (aa.f4124b) {
                    aa.m4480a("Pruning old cache entries.", new Object[0]);
                }
                long j = this.f4077b;
                long elapsedRealtime = SystemClock.elapsedRealtime();
                Iterator it = this.f4076a.entrySet().iterator();
                while (it.hasNext()) {
                    C0669j c0669j = (C0669j) ((Entry) it.next()).getValue();
                    if (m4445d(c0669j.f4081b).delete()) {
                        this.f4077b -= c0669j.f4080a;
                    } else {
                        aa.m4482b("Could not delete cache entry for key=%s, filename=%s", c0669j.f4081b, C0668i.m4444c(c0669j.f4081b));
                    }
                    it.remove();
                    i2 = i + 1;
                    if (((float) (this.f4077b + ((long) length))) < ((float) this.f4079d) * 0.9f) {
                        break;
                    }
                    i = i2;
                }
                i2 = i;
                if (aa.f4124b) {
                    aa.m4480a("pruned %d files, %d bytes, %d ms", Integer.valueOf(i2), Long.valueOf(this.f4077b - j), Long.valueOf(SystemClock.elapsedRealtime() - elapsedRealtime));
                }
            }
            File d = m4445d(str);
            try {
                OutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(d));
                C0669j c0669j2 = new C0669j(str, c0684b);
                if (c0669j2.m4454a(bufferedOutputStream)) {
                    bufferedOutputStream.write(c0684b.f4131a);
                    bufferedOutputStream.close();
                    m4439a(str, c0669j2);
                } else {
                    bufferedOutputStream.close();
                    aa.m4482b("Failed to write header for %s", d.getAbsolutePath());
                    throw new IOException();
                }
            } catch (IOException e) {
                if (!d.delete()) {
                    aa.m4482b("Could not clean up file %s", d.getAbsolutePath());
                }
            }
        }
    }

    public final synchronized void mo1069b(String str) {
        boolean delete = m4445d(str).delete();
        m4446e(str);
        if (!delete) {
            aa.m4482b("Could not delete cache entry for key=%s, filename=%s", str, C0668i.m4444c(str));
        }
    }

    private static String m4444c(String str) {
        int length = str.length() / 2;
        String valueOf = String.valueOf(String.valueOf(str.substring(0, length).hashCode()));
        String valueOf2 = String.valueOf(String.valueOf(str.substring(length).hashCode()));
        return valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
    }

    private final File m4445d(String str) {
        return new File(this.f4078c, C0668i.m4444c(str));
    }

    private final void m4439a(String str, C0669j c0669j) {
        if (this.f4076a.containsKey(str)) {
            C0669j c0669j2 = (C0669j) this.f4076a.get(str);
            this.f4077b = (c0669j.f4080a - c0669j2.f4080a) + this.f4077b;
        } else {
            this.f4077b += c0669j.f4080a;
        }
        this.f4076a.put(str, c0669j);
    }

    private final void m4446e(String str) {
        C0669j c0669j = (C0669j) this.f4076a.remove(str);
        if (c0669j != null) {
            this.f4077b -= c0669j.f4080a;
        }
    }

    private static byte[] m4440a(C0670k c0670k, long j) {
        long a = c0670k.m4455a();
        if (j < 0 || j > a || ((long) ((int) j)) != j) {
            throw new IOException("streamToBytes length=" + j + ", maxLength=" + a);
        }
        byte[] bArr = new byte[((int) j)];
        new DataInputStream(c0670k).readFully(bArr);
        return bArr;
    }

    private static InputStream m4434a(File file) {
        return new FileInputStream(file);
    }

    private static int m4443c(InputStream inputStream) {
        int read = inputStream.read();
        if (read != -1) {
            return read;
        }
        throw new EOFException();
    }

    static void m4436a(OutputStream outputStream, int i) {
        outputStream.write((i >> 0) & HprofParser.ROOT_UNKNOWN);
        outputStream.write((i >> 8) & HprofParser.ROOT_UNKNOWN);
        outputStream.write((i >> 16) & HprofParser.ROOT_UNKNOWN);
        outputStream.write((i >> 24) & HprofParser.ROOT_UNKNOWN);
    }

    static int m4433a(InputStream inputStream) {
        return ((((C0668i.m4443c(inputStream) << 0) | 0) | (C0668i.m4443c(inputStream) << 8)) | (C0668i.m4443c(inputStream) << 16)) | (C0668i.m4443c(inputStream) << 24);
    }

    static void m4437a(OutputStream outputStream, long j) {
        outputStream.write((byte) ((int) (j >>> null)));
        outputStream.write((byte) ((int) (j >>> 8)));
        outputStream.write((byte) ((int) (j >>> 16)));
        outputStream.write((byte) ((int) (j >>> 24)));
        outputStream.write((byte) ((int) (j >>> 32)));
        outputStream.write((byte) ((int) (j >>> 40)));
        outputStream.write((byte) ((int) (j >>> 48)));
        outputStream.write((byte) ((int) (j >>> 56)));
    }

    static long m4441b(InputStream inputStream) {
        return (((((((0 | ((((long) C0668i.m4443c(inputStream)) & 255) << null)) | ((((long) C0668i.m4443c(inputStream)) & 255) << 8)) | ((((long) C0668i.m4443c(inputStream)) & 255) << 16)) | ((((long) C0668i.m4443c(inputStream)) & 255) << 24)) | ((((long) C0668i.m4443c(inputStream)) & 255) << 32)) | ((((long) C0668i.m4443c(inputStream)) & 255) << 40)) | ((((long) C0668i.m4443c(inputStream)) & 255) << 48)) | ((((long) C0668i.m4443c(inputStream)) & 255) << 56);
    }

    static void m4438a(OutputStream outputStream, String str) {
        byte[] bytes = str.getBytes("UTF-8");
        C0668i.m4437a(outputStream, (long) bytes.length);
        outputStream.write(bytes, 0, bytes.length);
    }

    static String m4435a(C0670k c0670k) {
        return new String(C0668i.m4440a(c0670k, C0668i.m4441b((InputStream) c0670k)), "UTF-8");
    }

    static List m4442b(C0670k c0670k) {
        List emptyList;
        int a = C0668i.m4433a((InputStream) c0670k);
        if (a == 0) {
            emptyList = Collections.emptyList();
        } else {
            emptyList = new ArrayList(a);
        }
        for (int i = 0; i < a; i++) {
            emptyList.add(new C0695j(C0668i.m4435a(c0670k).intern(), C0668i.m4435a(c0670k).intern()));
        }
        return emptyList;
    }
}
