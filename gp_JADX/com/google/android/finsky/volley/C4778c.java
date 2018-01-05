package com.google.android.finsky.volley;

import android.os.SystemClock;
import android.support.v4.p037h.C0320p;
import android.text.TextUtils;
import com.android.volley.C0659a;
import com.android.volley.C0684b;
import com.android.volley.aa;
import com.google.android.finsky.api.C1289l;
import com.google.android.finsky.utils.C4679j;
import com.google.android.finsky.utils.C4688t;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;

public final class C4778c implements C0659a {
    public final Map f24740a = new LinkedHashMap(16, 0.75f, true);
    public final Map f24741b = new ConcurrentHashMap();
    public long f24742c = 0;
    public final File f24743d;
    public final int f24744e;
    public final C1476d f24745f;
    public final boolean f24746g;

    public C4778c(File file, int i, C1476d c1476d, boolean z) {
        this.f24743d = file;
        this.f24744e = i;
        this.f24745f = c1476d;
        this.f24746g = z;
    }

    public final synchronized void mo1068b() {
        synchronized (this) {
            File[] listFiles = this.f24743d.listFiles();
            if (listFiles != null) {
                for (File delete : listFiles) {
                    delete.delete();
                }
            }
            this.f24740a.clear();
            this.f24741b.clear();
            this.f24742c = 0;
            aa.m4482b("Cache cleared.", new Object[0]);
        }
    }

    public final synchronized C0684b mo1064a(String str) {
        Closeable dataInputStream;
        C0684b c0684b;
        IOException e;
        Throwable th;
        String e2 = m22399e(str);
        if (this.f24740a.containsKey(e2)) {
            File file = new File(this.f24743d, e2);
            if (file.exists()) {
                try {
                    dataInputStream = new DataInputStream(new BufferedInputStream(new FileInputStream(file)));
                    try {
                        c0684b = (C0684b) C4778c.m22395a((DataInput) dataInputStream, str, e2).f1763b;
                        C4679j.m21814a(dataInputStream);
                    } catch (IOException e3) {
                        e = e3;
                        try {
                            aa.m4482b("%s: %s", file.getAbsolutePath(), e.toString());
                            mo1069b(str);
                            C4679j.m21814a(dataInputStream);
                            c0684b = null;
                            return c0684b;
                        } catch (Throwable th2) {
                            th = th2;
                            C4679j.m21814a(dataInputStream);
                            throw th;
                        }
                    }
                } catch (IOException e4) {
                    e = e4;
                    dataInputStream = null;
                    aa.m4482b("%s: %s", file.getAbsolutePath(), e.toString());
                    mo1069b(str);
                    C4679j.m21814a(dataInputStream);
                    c0684b = null;
                    return c0684b;
                } catch (Throwable th3) {
                    th = th3;
                    dataInputStream = null;
                    C4679j.m21814a(dataInputStream);
                    throw th;
                }
            }
            m22400f(e2);
            c0684b = null;
        } else {
            c0684b = null;
        }
        return c0684b;
    }

    public final synchronized void mo1065a() {
        synchronized (this) {
            if (this.f24743d.exists()) {
                File[] listFiles = this.f24743d.listFiles();
                if (listFiles != null) {
                    for (File file : listFiles) {
                        m22397a(file.getName(), file.length());
                    }
                }
            } else if (!this.f24743d.mkdirs()) {
                aa.m4483c("Unable to create cache dir %s", this.f24743d.getAbsolutePath());
            } else if (this.f24745f != null) {
                this.f24745f.mo2269a();
            }
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
        Closeable dataOutputStream;
        Throwable th;
        int length = c0684b.f4131a.length;
        if (this.f24742c + ((long) length) >= ((long) this.f24744e)) {
            int i;
            if (aa.f4124b) {
                aa.m4480a("Pruning old cache entries.", new Object[0]);
            }
            long j = this.f24742c;
            int i2 = 0;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            Iterator it = this.f24740a.entrySet().iterator();
            while (it.hasNext()) {
                Entry entry = (Entry) it.next();
                String str2 = (String) entry.getKey();
                if (new File(this.f24743d, str2).delete()) {
                    this.f24742c -= ((Long) entry.getValue()).longValue();
                } else {
                    aa.m4482b("Could not delete cache entry for filename=%s", str2);
                }
                it.remove();
                CharSequence g = C4778c.m22401g(str2);
                if (!TextUtils.isEmpty(g)) {
                    this.f24741b.remove(g);
                }
                i = i2 + 1;
                if (((float) (this.f24742c + ((long) length))) < ((float) this.f24744e) * 0.9f) {
                    break;
                }
                i2 = i;
            }
            i = i2;
            if (aa.f4124b) {
                aa.m4480a("pruned %d files, %d bytes, %d ms", Integer.valueOf(i), Long.valueOf(this.f24742c - j), Long.valueOf(SystemClock.elapsedRealtime() - elapsedRealtime));
            }
        }
        String e = m22399e(str);
        File file = new File(this.f24743d, e);
        Closeable closeable = null;
        try {
            dataOutputStream = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(file)));
            try {
                if (C4778c.m22398a((DataOutput) dataOutputStream, str, c0684b)) {
                    dataOutputStream.close();
                    m22397a(e, file.length());
                    C4679j.m21814a(dataOutputStream);
                } else {
                    aa.m4482b("Failed to write header for %s", file.getAbsolutePath());
                    throw new IOException();
                }
            } catch (IOException e2) {
                try {
                    if (!file.delete()) {
                        aa.m4482b("Could not clean up file %s", file.getAbsolutePath());
                    }
                    C4679j.m21814a(dataOutputStream);
                } catch (Throwable th2) {
                    Throwable th3 = th2;
                    closeable = dataOutputStream;
                    th = th3;
                    C4679j.m21814a(closeable);
                    throw th;
                }
            }
        } catch (IOException e3) {
            dataOutputStream = null;
            if (file.delete()) {
                aa.m4482b("Could not clean up file %s", file.getAbsolutePath());
            }
            C4679j.m21814a(dataOutputStream);
        } catch (Throwable th4) {
            th = th4;
            C4679j.m21814a(closeable);
            throw th;
        }
    }

    public final synchronized void mo1069b(String str) {
        String e = m22399e(str);
        boolean delete = new File(this.f24743d, e).delete();
        m22400f(e);
        if (!delete) {
            aa.m4482b("Could not delete cache entry for key=%s, filename=%s", str, e);
        }
    }

    public final synchronized boolean m22408c(String str) {
        return this.f24740a.containsKey(m22399e(str));
    }

    private final String m22399e(String str) {
        String a = C4688t.m21838a(str.getBytes());
        if (!this.f24746g) {
            return a;
        }
        Object c = C1289l.m7697c(str);
        if (TextUtils.isEmpty(c)) {
            return a;
        }
        String a2 = C4688t.m21838a(c.getBytes());
        return new StringBuilder((String.valueOf(a).length() + 1) + String.valueOf(a2).length()).append(a).append(',').append(a2).toString();
    }

    private final void m22397a(String str, long j) {
        Long l = (Long) this.f24740a.put(str, Long.valueOf(j));
        CharSequence g = C4778c.m22401g(str);
        if (!TextUtils.isEmpty(g)) {
            this.f24741b.put(g, str);
        }
        this.f24742c += j;
        if (l != null) {
            this.f24742c -= l.longValue();
        }
    }

    private final void m22400f(String str) {
        Long l = (Long) this.f24740a.remove(str);
        CharSequence g = C4778c.m22401g(str);
        if (!TextUtils.isEmpty(g)) {
            this.f24741b.remove(g);
        }
        if (l != null) {
            this.f24742c -= l.longValue();
        }
    }

    private static String m22401g(String str) {
        int lastIndexOf = str.lastIndexOf(44);
        if (lastIndexOf == -1) {
            return null;
        }
        return str.substring(lastIndexOf + 1);
    }

    private static C0320p m22395a(DataInput dataInput, String str, String str2) {
        if (dataInput.readInt() != 538316816) {
            throw new IOException();
        }
        String readUTF = dataInput.readUTF();
        if (str == null || str.equals(readUTF)) {
            C0684b c0684b = new C0684b();
            c0684b.f4132b = dataInput.readUTF();
            if (c0684b.f4132b.equals("")) {
                c0684b.f4132b = null;
            }
            c0684b.f4133c = dataInput.readLong();
            c0684b.f4134d = dataInput.readLong();
            c0684b.f4135e = dataInput.readLong();
            c0684b.f4136f = dataInput.readLong();
            int readInt = dataInput.readInt();
            c0684b.f4137g = C4778c.m22396a(dataInput);
            c0684b.f4131a = new byte[readInt];
            dataInput.readFully(c0684b.f4131a);
            return new C0320p(readUTF, c0684b);
        }
        aa.m4482b("File name collision for key: %s, filename: %s with key: %s", str, str2, readUTF);
        return new C0320p(readUTF, null);
    }

    public final synchronized String m22409d(String str) {
        String str2;
        IOException e;
        Throwable th;
        if (this.f24740a.containsKey(str)) {
            File file = new File(this.f24743d, str);
            if (file.exists()) {
                Closeable dataInputStream;
                try {
                    dataInputStream = new DataInputStream(new BufferedInputStream(new FileInputStream(file)));
                    try {
                        C0320p a = C4778c.m22395a((DataInput) dataInputStream, null, str);
                        C4679j.m21814a(dataInputStream);
                        str2 = (a.f1763b == null || ((C0684b) a.f1763b).m4487a()) ? null : (String) a.f1762a;
                    } catch (IOException e2) {
                        e = e2;
                        try {
                            aa.m4482b("%s: %s", file.getAbsolutePath(), e.toString());
                            C4679j.m21814a(dataInputStream);
                            str2 = null;
                            return str2;
                        } catch (Throwable th2) {
                            th = th2;
                            C4679j.m21814a(dataInputStream);
                            throw th;
                        }
                    }
                } catch (IOException e3) {
                    e = e3;
                    dataInputStream = null;
                    aa.m4482b("%s: %s", file.getAbsolutePath(), e.toString());
                    C4679j.m21814a(dataInputStream);
                    str2 = null;
                    return str2;
                } catch (Throwable th3) {
                    th = th3;
                    dataInputStream = null;
                    C4679j.m21814a(dataInputStream);
                    throw th;
                }
            }
            m22400f(str);
            str2 = null;
        } else {
            str2 = null;
        }
        return str2;
    }

    private static boolean m22398a(DataOutput dataOutput, String str, C0684b c0684b) {
        try {
            dataOutput.writeInt(538316816);
            dataOutput.writeUTF(str);
            dataOutput.writeUTF(c0684b.f4132b == null ? "" : c0684b.f4132b);
            dataOutput.writeLong(c0684b.f4133c);
            dataOutput.writeLong(c0684b.f4134d);
            dataOutput.writeLong(c0684b.f4135e);
            dataOutput.writeLong(c0684b.f4136f);
            dataOutput.writeInt(c0684b.f4131a.length);
            Map map = c0684b.f4137g;
            if (map != null) {
                dataOutput.writeInt(map.size());
                for (Entry entry : map.entrySet()) {
                    dataOutput.writeUTF((String) entry.getKey());
                    dataOutput.writeUTF((String) entry.getValue());
                }
            } else {
                dataOutput.writeInt(0);
            }
            dataOutput.write(c0684b.f4131a);
            return true;
        } catch (IOException e) {
            aa.m4482b("%s", e.toString());
            return false;
        }
    }

    private static Map m22396a(DataInput dataInput) {
        int readInt = dataInput.readInt();
        Map emptyMap = readInt == 0 ? Collections.emptyMap() : new HashMap(readInt);
        for (int i = 0; i < readInt; i++) {
            emptyMap.put(dataInput.readUTF().intern(), dataInput.readUTF().intern());
        }
        return emptyMap;
    }
}
