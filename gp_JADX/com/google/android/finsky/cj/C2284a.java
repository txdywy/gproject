package com.google.android.finsky.cj;

import com.google.android.finsky.dk.C2830g;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.ad;
import java.io.File;

public final class C2284a {
    public final boolean f11296a;
    public final String f11297b;
    public int f11298c;
    public long f11299d;
    public int f11300e = 4;
    public String f11301f = C2286c.m11781a(this.f11296a, this.f11298c, this.f11297b);

    public C2284a(boolean z, String str, int i, long j) {
        this.f11296a = z;
        this.f11297b = str;
        this.f11298c = i;
        this.f11299d = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C2284a c2284a = (C2284a) obj;
        if (ad.m21692a(this.f11301f, c2284a.f11301f) && ad.m21692a(this.f11297b, c2284a.f11297b) && this.f11296a == c2284a.f11296a && this.f11298c == c2284a.f11298c && this.f11299d == c2284a.f11299d && this.f11300e == c2284a.f11300e) {
            return true;
        }
        return false;
    }

    public final String toString() {
        String str;
        String str2 = "%s: %s v:%d %s";
        Object[] objArr = new Object[4];
        objArr[0] = this.f11296a ? "Patch" : "Main";
        objArr[1] = this.f11297b;
        objArr[2] = Integer.valueOf(this.f11298c);
        int i = this.f11300e;
        switch (i) {
            case 1:
                str = "DOWNLOAD_PENDING";
                break;
            case 2:
                str = "DOWNLOADING";
                break;
            case 3:
                str = "DOWNLOADED";
                break;
            case 4:
                str = "NOT_ON_STORAGE";
                break;
            case 5:
                str = "NOT_APPLICABLE";
                break;
            default:
                str = Integer.toString(i);
                break;
        }
        objArr[3] = str;
        return String.format(str2, objArr);
    }

    public final void m11770a() {
        Object obj = null;
        if (this.f11300e != 5) {
            if (C2830g.m14966a()) {
                File b = m11771b();
                if (b != null && b.exists() && b.length() == this.f11299d) {
                    obj = 1;
                }
                if (obj == null) {
                    m11767a(4);
                    return;
                } else {
                    m11767a(3);
                    return;
                }
            }
            m11767a(4);
        }
    }

    public final File m11771b() {
        if (!C2830g.m14966a() || this.f11299d <= 0) {
            return null;
        }
        File a = C2286c.m11779a(this.f11297b);
        if (!a.exists()) {
            a.mkdirs();
        }
        return new File(a, this.f11301f);
    }

    public final File m11772c() {
        File b = m11771b();
        if (b == null) {
            return null;
        }
        File parentFile = b.getParentFile();
        String str = "temp.";
        String valueOf = String.valueOf(b.getName());
        return new File(parentFile, valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
    }

    private final boolean m11769h() {
        File b = m11771b();
        if (b == null) {
            m11768a("main file null");
            return false;
        }
        File c = m11772c();
        if (c == null) {
            m11768a("temp file null");
            return false;
        } else if (c.exists() || b.length() != this.f11299d) {
            return false;
        } else {
            return true;
        }
    }

    private final void m11767a(int i) {
        if (i == 5) {
            this.f11298c = -1;
            this.f11299d = -1;
            this.f11301f = "";
        }
        this.f11300e = i;
    }

    public final boolean m11773d() {
        m11770a();
        if (this.f11300e == 4) {
            File b = m11771b();
            if (b == null) {
                m11768a("main file null");
            } else {
                File c = m11772c();
                if (c == null) {
                    m11768a("temp file null");
                } else if (c.length() != this.f11299d) {
                    String str = "size mismatch: tempfile size=";
                    String valueOf = String.valueOf(String.valueOf(c.length()));
                    m11768a(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
                } else if (!c.renameTo(b)) {
                    m11768a("renameTo() returned false");
                }
            }
            m11770a();
        }
        if (this.f11300e == 5 || this.f11300e == 3) {
            return true;
        }
        return false;
    }

    public final boolean m11774e() {
        if (this.f11300e == 5) {
            return true;
        }
        m11770a();
        if (this.f11300e == 3) {
            return true;
        }
        return false;
    }

    public final void m11775f() {
        File c = m11772c();
        if (c != null) {
            c.delete();
        }
    }

    public final void m11776g() {
        if (m11769h()) {
            m11771b().delete();
        }
    }

    private final void m11768a(String str) {
        try {
            FinskyLog.m21665c("Failure %s while finalizing %s", str, toString());
            FinskyLog.m21665c(" file=%s, size=%d", this.f11301f, Long.valueOf(this.f11299d));
            File a = C2286c.m11779a(this.f11297b);
            FinskyLog.m21665c(" Contents of %s:", a.getAbsolutePath());
            if (!a.exists()) {
                FinskyLog.m21665c(" (Does not exist)", new Object[0]);
            } else if (a.isDirectory()) {
                File[] listFiles = a.listFiles();
                if (listFiles == null) {
                    FinskyLog.m21665c(" (listFiles() returned null)", new Object[0]);
                    return;
                }
                for (File file : listFiles) {
                    FinskyLog.m21665c("  name=%s size=%d", file.getName(), Long.valueOf(file.length()));
                }
            } else {
                FinskyLog.m21665c(" (Is not a directory)", new Object[0]);
            }
        } catch (Throwable e) {
            FinskyLog.m21663b(e, "Unexpected exception", new Object[0]);
        }
    }
}
