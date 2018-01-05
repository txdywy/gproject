package com.google.android.finsky.instantapps.install;

import android.support.v4.os.C0330d;
import android.util.Base64;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.instantapps.common.p221d.p222a.ad;
import com.google.android.instantapps.common.p221d.p222a.af;
import com.google.android.p306h.p307a.p308a.C5677n;
import com.google.android.p306h.p307a.p308a.C5678o;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.DigestOutputStream;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;

final class C3514p implements Callable {
    public final C3522y f17747a;
    public final C3503c f17748b;
    public final Future f17749c;
    public final C3506h f17750d;

    C3514p(C3522y c3522y, C3503c c3503c, Future future, C3506h c3506h) {
        this.f17747a = c3522y;
        this.f17748b = c3503c;
        this.f17749c = future;
        this.f17750d = c3506h;
    }

    private final Boolean m17089a() {
        try {
            C0330d.m1728a("getInstallStream");
            OutputStream a = this.f17750d.m17081a(this.f17748b);
            ag agVar = (ag) this.f17749c.get();
            InputStream bufferedInputStream = new BufferedInputStream(agVar.f17717a, 32768);
            af afVar = agVar.f17718b;
            MessageDigest instance = MessageDigest.getInstance("SHA-256");
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new DigestOutputStream(a, instance), 32768);
            m17091a(afVar, 1619);
            long j = 0;
            byte[] bArr = new byte[32768];
            while (true) {
                try {
                    int read = bufferedInputStream.read(bArr);
                    if (read > 0) {
                        bufferedOutputStream.write(bArr, 0, read);
                        j += (long) read;
                        C3522y c3522y = this.f17747a;
                        c3522y.f17769b.mo3528a(c3522y.f17770c.addAndGet((long) read), c3522y.f17768a);
                    }
                    if (read == -1) {
                        break;
                    }
                } catch (Throwable th) {
                    C0330d.m1728a("closeStreams");
                    bufferedInputStream.close();
                    bufferedOutputStream.close();
                } finally {
                    C0330d.m1727a();
                }
            }
            C0330d.m1728a("closeStreams");
            try {
                boolean z;
                bufferedInputStream.close();
                bufferedOutputStream.close();
                m17091a(afVar, 1620);
                byte[] bArr2 = this.f17748b.f17728d;
                byte[] digest = instance.digest();
                if (this.f17748b.f17727c == j && (bArr2 == null || Arrays.equals(digest, bArr2))) {
                    z = true;
                } else {
                    m17091a(afVar, 1640);
                    FinskyLog.m21667d("Validation failed for %s. Expected %d bytes with hash %s but got %d bytes with hash %s", this.f17748b.f17726b, Long.valueOf(this.f17748b.f17727c), C3514p.m17090a(bArr2), Long.valueOf(j), C3514p.m17090a(digest));
                    z = false;
                }
                return Boolean.valueOf(z);
            } finally {
                C0330d.m1727a();
            }
        } finally {
            C0330d.m1727a();
        }
    }

    private static String m17090a(byte[] bArr) {
        if (bArr != null) {
            return Base64.encodeToString(bArr, 0);
        }
        return "<none>";
    }

    private final void m17091a(af afVar, int i) {
        C5678o c5678o = new C5678o();
        c5678o.f28786c = new C5677n();
        c5678o.f28786c.f28777a = this.f17748b.f17726b.toString();
        c5678o.f28786c.f28778b = Long.valueOf(this.f17748b.f17727c);
        ad adVar = new ad(i);
        adVar.f28913f = c5678o;
        afVar.mo5139a(adVar.m26987a());
    }

    public final /* synthetic */ Object call() {
        return m17089a();
    }
}
