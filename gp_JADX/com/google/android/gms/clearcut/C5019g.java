package com.google.android.gms.clearcut;

import android.util.Log;
import com.google.android.gms.common.internal.am;
import com.google.android.gms.common.util.C5147b;
import com.google.android.gms.common.util.C5153h;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.util.Comparator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public final class C5019g {
    public static final Charset f25554a = Charset.forName("UTF-8");
    public static final Comparator f25555o = new C5048u();
    public static final C5021i f25556p = new C5038k();
    public final String f25557b;
    public final int f25558c;
    public final C5147b f25559d;
    public boolean f25560e;
    public C5042o f25561f;
    public long f25562g;
    public final C5012a f25563h;
    public final ReentrantReadWriteLock f25564i;
    public Map f25565j;
    public byte[] f25566k;
    public Integer f25567l;
    public TreeMap f25568m;
    public C5041n f25569n;

    private C5019g(C5012a c5012a, String str, int i, C5147b c5147b) {
        boolean z = false;
        this.f25560e = false;
        this.f25561f = null;
        this.f25564i = new ReentrantReadWriteLock();
        this.f25565j = new TreeMap();
        this.f25566k = null;
        this.f25567l = null;
        this.f25568m = new TreeMap(f25555o);
        this.f25569n = null;
        am.m23733a((Object) c5012a);
        am.m23733a((Object) str);
        if (i > 0) {
            z = true;
        }
        am.m23742b(z);
        am.m23733a((Object) c5147b);
        this.f25563h = c5012a;
        this.f25557b = str;
        this.f25558c = i;
        this.f25559d = c5147b;
        this.f25562g = c5147b.mo4630b();
    }

    public static long m23200a(String str) {
        try {
            MessageDigest instance = MessageDigest.getInstance("MD5");
            instance.update(str.getBytes(f25554a));
            return ByteBuffer.wrap(instance.digest()).getLong();
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.f25564i.readLock().lock();
        try {
            stringBuilder.append("{");
            for (Entry entry : this.f25568m.entrySet()) {
                stringBuilder.append(entry.getKey() == null ? "null" : new String((byte[]) entry.getKey()));
                stringBuilder.append(", ");
            }
            stringBuilder.append("}\n");
            for (C5020h c5020h : this.f25565j.values()) {
                stringBuilder.append(c5020h.toString());
                stringBuilder.append("\n");
            }
            return stringBuilder.toString();
        } finally {
            this.f25564i.readLock().unlock();
        }
    }

    public C5019g(C5012a c5012a, String str, int i) {
        this(c5012a, str, i, C5153h.f26089a);
    }

    private C5019g(C5019g c5019g) {
        this(c5019g.f25563h, c5019g.f25557b, c5019g.f25558c, c5019g.f25559d);
        Lock writeLock = c5019g.f25564i.writeLock();
        writeLock.lock();
        try {
            this.f25566k = c5019g.f25566k;
            this.f25567l = c5019g.f25567l;
            this.f25562g = c5019g.f25562g;
            this.f25561f = c5019g.f25561f;
            this.f25565j = new TreeMap();
            for (Entry entry : c5019g.f25565j.entrySet()) {
                Object c5039l;
                Map map = this.f25565j;
                String str = (String) entry.getKey();
                C5020h c5020h = (C5020h) entry.getValue();
                if (c5020h instanceof C5039l) {
                    c5039l = new C5039l(this, (C5039l) c5020h);
                } else if (c5020h instanceof C5045q) {
                    C5045q c5045q = new C5045q(this, (C5045q) c5020h);
                } else if (c5020h instanceof C5040m) {
                    C5040m c5040m = new C5040m(this, (C5040m) c5020h);
                } else if (c5020h instanceof C5044p) {
                    C5044p c5044p = new C5044p(this, (C5044p) c5020h);
                } else if (c5020h instanceof C5037j) {
                    C5037j c5037j = new C5037j(this, (C5037j) c5020h);
                } else {
                    String valueOf = String.valueOf(c5020h);
                    throw new IllegalArgumentException(new StringBuilder(String.valueOf(valueOf).length() + 21).append("Unkown counter type: ").append(valueOf).toString());
                }
                map.put(str, c5039l);
            }
            TreeMap treeMap = this.f25568m;
            this.f25568m = c5019g.f25568m;
            c5019g.f25568m = treeMap;
            c5019g.f25567l = null;
            c5019g.f25562g = this.f25559d.mo4630b();
        } finally {
            writeLock.unlock();
        }
    }

    public final C5044p m23212a(String str, C5021i c5021i) {
        this.f25564i.writeLock().lock();
        try {
            C5044p c5044p = new C5044p(this, str, c5021i);
            return c5044p;
        } finally {
            this.f25564i.writeLock().unlock();
        }
    }

    final C5019g m23211a() {
        C5041n c5041n = this.f25569n;
        this.f25564i.writeLock().lock();
        if (c5041n != null) {
            try {
                c5041n.m23254a();
            } catch (Throwable e) {
                Log.i("Counters", "problem executing callback: ", e);
            } catch (Throwable th) {
                this.f25564i.writeLock().unlock();
            }
        }
        C5019g c5019g = new C5019g(this);
        this.f25564i.writeLock().unlock();
        return c5019g;
    }

    static /* synthetic */ Integer m23202a(C5019g c5019g, byte[] bArr) {
        Integer num = (Integer) c5019g.f25568m.get(bArr);
        if (num != null) {
            return num;
        }
        num = Integer.valueOf(c5019g.f25568m.size());
        c5019g.f25568m.put(bArr, num);
        return num;
    }
}
