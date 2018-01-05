package com.google.android.play.p179a;

import com.google.android.play.p179a.p352a.ab;
import com.google.android.play.utils.PlayCommonLog;
import com.google.android.play.utils.a;
import com.google.android.play.utils.d;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public final class C6234t {
    public final long f31221a;
    public final long f31222b;
    public final int f31223c;
    public final C6222u f31224d;
    public File f31225e;
    public FileOutputStream f31226f;
    public final ArrayList f31227g;
    public final ArrayList f31228h;
    public final File f31229i;
    public final String f31230j;
    public final String f31231k;
    public final C6220f f31232l;
    public final boolean f31233m;
    public final boolean f31234n;

    public C6234t(File file, String str, String str2, long j, long j2, int i, C6222u c6222u, C6220f c6220f, boolean z, boolean z2) {
        a.b(j > 0, "recommendedFileSize must be positive");
        a.b(j2 > 0, "maxStorageSize must be positive");
        a.b(c6222u != null, "callbacks cannot be null");
        a.b(c6220f != null, "helper cannot be null");
        this.f31229i = file;
        this.f31230j = str;
        this.f31231k = str2;
        this.f31221a = j;
        this.f31222b = j2;
        this.f31223c = i;
        this.f31224d = c6222u;
        this.f31232l = c6220f;
        this.f31233m = z;
        this.f31234n = z2;
        this.f31227g = new ArrayList();
        this.f31228h = new ArrayList();
        m28740b();
        if (this.f31225e == null) {
            PlayCommonLog.c("Could not create a temp file with prefix %s and suffix %s in dir %s", new Object[]{this.f31230j, this.f31231k, this.f31229i.getAbsolutePath()});
        }
        if (!this.f31229i.exists()) {
            m28739a();
        }
        if (!this.f31234n) {
            boolean isDirectory = this.f31229i.isDirectory();
            String str3 = "Expected a directory for path: ";
            String valueOf = String.valueOf(this.f31229i.getAbsolutePath());
            a.a(isDirectory, valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3));
        }
        this.f31227g.clear();
        m28738b(this.f31229i);
        Collections.sort(this.f31227g, d.a);
        m28741c();
    }

    final void m28739a() {
        try {
            if (this.f31226f != null) {
                this.f31226f.close();
            }
        } catch (IOException e) {
            PlayCommonLog.c("Failed to close mFileOutputStream", new Object[0]);
        }
        this.f31226f = null;
        this.f31225e = null;
        this.f31228h.clear();
        this.f31227g.clear();
        this.f31229i.mkdirs();
    }

    final void m28740b() {
        if (!this.f31229i.exists()) {
            m28739a();
        }
        this.f31225e = null;
        try {
            this.f31225e = File.createTempFile(this.f31230j, this.f31231k, this.f31229i);
            this.f31226f = new FileOutputStream(this.f31225e);
            this.f31224d.mo5356d();
        } catch (FileNotFoundException e) {
            if (this.f31225e != null) {
                this.f31225e.delete();
            }
            this.f31225e = null;
            this.f31232l.m28704a(4);
        } catch (IOException e2) {
            this.f31232l.m28704a(5);
        }
    }

    final void m28741c() {
        long j = 0;
        ArrayList arrayList = this.f31228h;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            j += ((File) obj).length();
        }
        arrayList = this.f31227g;
        size = arrayList.size();
        i = 0;
        while (i < size) {
            obj = arrayList.get(i);
            i++;
            j += ((File) obj).length();
        }
        if (this.f31225e != null) {
            j = this.f31225e.length() + j;
        }
        int i2 = 0;
        long j2 = j;
        while (j2 > this.f31222b) {
            int i3 = i2 + 1;
            File file;
            if (this.f31228h.size() > 0) {
                file = (File) this.f31228h.remove(0);
                j2 -= file.length();
                file.delete();
                i2 = i3;
            } else if (this.f31227g.size() > 0) {
                file = (File) this.f31227g.remove(0);
                j2 -= file.length();
                file.delete();
                i2 = i3;
            } else if (this.f31225e != null) {
                j2 -= this.f31225e.length();
                this.f31225e.delete();
                this.f31225e = null;
                i2 = i3;
            } else {
                i2 = i3;
            }
        }
        if (i2 > 0) {
            PlayCommonLog.a("%d files were purged due to exceeding total storage size of %d", new Object[]{Integer.valueOf(i2), Long.valueOf(this.f31222b)});
            C6220f c6220f = this.f31232l;
            ab abVar = c6220f.f31098e;
            i2 += c6220f.f31098e.f30740f;
            abVar.f30735a |= 8;
            abVar.f30740f = i2;
            c6220f.m28703a();
            C6220f c6220f2 = this.f31232l;
            i3 = (int) (j - j2);
            ab abVar2 = c6220f2.f31098e;
            i3 += c6220f2.f31098e.f30739e;
            abVar2.f30735a |= 4;
            abVar2.f30739e = i3;
            c6220f2.m28703a();
        }
    }

    private final void m28738b(File file) {
        if (file != null && file.exists()) {
            File[] listFiles = file.listFiles();
            if (listFiles != null) {
                for (File file2 : listFiles) {
                    if (file2.isFile() && !file2.equals(this.f31225e)) {
                        if (file2.length() == 0) {
                            file2.delete();
                        } else {
                            this.f31227g.add(file2);
                        }
                    }
                }
            }
        }
    }

    public final long m28742d() {
        long j = 0;
        for (int i = 0; i < this.f31227g.size(); i++) {
            j += ((File) this.f31227g.get(i)).length();
        }
        return j;
    }

    public final long m28743e() {
        return this.f31225e != null ? this.f31225e.length() : 0;
    }

    public final boolean m28744f() {
        if (this.f31225e == null || this.f31225e.length() == 0) {
            return false;
        }
        int size = (this.f31227g.size() + this.f31228h.size()) + 1;
        if (this.f31223c > 0 && size >= this.f31223c) {
            return false;
        }
        try {
            this.f31226f.close();
            this.f31227g.add(this.f31225e);
            m28741c();
            this.f31225e = null;
            this.f31226f = null;
            return true;
        } catch (IOException e) {
            C6220f c6220f = this.f31232l;
            c6220f.f31101h.f30729e = C6220f.m28702a(c6220f.f31101h.f30729e, 12);
            c6220f.m28703a();
            return false;
        }
    }

    public final void m28745g() {
        ArrayList arrayList = this.f31228h;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((File) obj).delete();
        }
        this.f31228h.clear();
    }

    public final void m28746h() {
        this.f31227g.addAll(this.f31228h);
        Collections.sort(this.f31227g, d.a);
        this.f31228h.clear();
    }

    static byte[] m28737a(File file) {
        int i = 0;
        long length = file.length();
        if (length > 2147483647L) {
            throw new OutOfMemoryError("Too large to fit in a byte array: " + length);
        } else if (length == 0) {
            return new byte[0];
        } else {
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                byte[] bArr = new byte[((int) length)];
                while (i < bArr.length) {
                    int read = fileInputStream.read(bArr, i, bArr.length - i);
                    if (read == -1) {
                        throw new IOException("Unexpected EOS: " + bArr.length + ", " + i);
                    }
                    i += read;
                }
                return bArr;
            } finally {
                fileInputStream.close();
            }
        }
    }
}
