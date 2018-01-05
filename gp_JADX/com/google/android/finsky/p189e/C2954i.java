package com.google.android.finsky.p189e;

import android.os.Build;
import android.os.StrictMode;
import com.google.android.finsky.aa.C0954a;
import com.google.android.finsky.p111d.C1463g;
import com.google.android.finsky.p111d.C2474c;
import com.google.android.finsky.utils.FinskyLog;
import com.google.archivepatcher.a.b;
import com.google.archivepatcher.a.c;
import com.google.archivepatcher.a.h;
import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public final class C2954i {
    public static final String f15601a = String.format("%d:%s", new Object[]{Integer.valueOf(808539), Build.FINGERPRINT});

    public static synchronized boolean m15343a(C1463g c1463g) {
        boolean booleanValue;
        synchronized (C2954i.class) {
            StrictMode.noteSlowCall("FileByFilePatcher.isEnabled");
            if (f15601a.equals(C0954a.aG.m5760a())) {
                booleanValue = ((Boolean) C0954a.aH.m5760a()).booleanValue();
            } else {
                C2474c c2474c = new C2474c(10);
                try {
                    b bVar = new b();
                    Map hashMap = new HashMap();
                    Map b = b.b();
                    for (Entry entry : c.a.entrySet()) {
                        String str = (String) b.get(entry.getKey());
                        if (!str.equals(entry.getValue())) {
                            hashMap.put((h) entry.getKey(), str);
                        }
                    }
                    booleanValue = hashMap.isEmpty();
                } catch (Throwable e) {
                    FinskyLog.m21667d("File-by-file compatibility check threw an exception: %s", e);
                    c2474c.m13238a(e);
                    booleanValue = false;
                }
                C0954a.aH.m5763a(Boolean.valueOf(booleanValue));
                C0954a.aG.m5763a(f15601a);
                c2474c.m13239a(booleanValue);
                FinskyLog.m21659a("File-by-file compatibility check finished, isCompatible=%s", Boolean.valueOf(booleanValue));
                c1463g.dc().m13319a(c2474c.f13342a, null);
            }
        }
        return booleanValue;
    }

    public static void m15342a(File file, InputStream inputStream, OutputStream outputStream, File file2) {
        new com.google.archivepatcher.applier.c(file2).a(file, inputStream, outputStream);
    }
}
