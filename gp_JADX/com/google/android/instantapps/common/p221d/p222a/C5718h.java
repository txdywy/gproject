package com.google.android.instantapps.common.p221d.p222a;

import android.app.ApplicationErrorReport.CrashInfo;
import android.content.Context;
import com.google.android.instantapps.common.C5804k;
import com.google.android.instantapps.common.p217e.bf;
import com.google.android.instantapps.p309a.C5693a;
import com.google.android.p306h.p307a.p308a.C5676m;
import com.google.android.p306h.p307a.p308a.C5678o;
import com.google.protobuf.nano.C0757i;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Collections;

public final class C5718h {
    public static final C5804k f28954a = new C5804k("CrashLogger");
    public final Context f28955b;
    public final bf f28956c;

    C5718h(Context context, bf bfVar) {
        this.f28955b = context;
        this.f28956c = bfVar;
    }

    private final synchronized void m27010b(CrashInfo crashInfo) {
        File file = new File(this.f28955b.getFilesDir(), "aia-crashes");
        C5693a.m26952a(file);
        byte[] a = C0757i.m4909a(m27011a(crashInfo, false));
        long currentTimeMillis = System.currentTimeMillis();
        File file2 = new File(file, currentTimeMillis + "_" + Math.abs(crashInfo.stackTrace.hashCode()));
        if (file2.exists()) {
            f28954a.m27210c("Deleting duplicate crash file: %s", file2);
            file2.delete();
        }
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file2));
        bufferedOutputStream.write(a);
        bufferedOutputStream.close();
        f28954a.m27209b("Wrote crash file %s: %s", file2, r1);
    }

    public final synchronized void m27012a(CrashInfo crashInfo) {
        m27010b(crashInfo);
    }

    public final synchronized void m27013a(af afVar) {
        File[] listFiles;
        File file = new File(this.f28955b.getFilesDir(), "aia-crashes");
        File file2 = new File(this.f28955b.getFilesDir(), "crashes");
        Object arrayList = new ArrayList();
        if (file.exists()) {
            listFiles = file.listFiles();
            if (listFiles != null) {
                Collections.addAll(arrayList, listFiles);
            } else {
                ad adVar = new ad(2401);
                adVar.f28911d = true;
                afVar.mo5139a(adVar.m26987a());
            }
        }
        if (file2.exists()) {
            listFiles = file2.listFiles();
            if (listFiles != null) {
                Collections.addAll(arrayList, listFiles);
            } else {
                adVar = new ad(2402);
                adVar.f28911d = true;
                afVar.mo5139a(adVar.m26987a());
            }
        }
        ArrayList arrayList2 = (ArrayList) arrayList;
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            File file3 = (File) arrayList2.get(i);
            int i3 = 1641;
            try {
                long parseLong;
                byte[] bArr = new byte[((int) file3.length())];
                BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file3));
                bufferedInputStream.read(bArr, 0, bArr.length);
                bufferedInputStream.close();
                C5676m c5676m = (C5676m) C0757i.m4905a(new C5676m(), bArr);
                C5678o c5678o = new C5678o();
                c5678o.f28785b = c5676m;
                try {
                    parseLong = Long.parseLong(file3.getName().split("_")[0]);
                } catch (NumberFormatException e) {
                    parseLong = System.currentTimeMillis();
                    i3 = 1346;
                    if (!(c5676m == null || c5676m.f28775f == null)) {
                        c5676m.f28775f = String.format("java.lang.NumberFormatException(%s):\nCaused by %s", new Object[]{r14, c5676m.f28775f});
                    }
                }
                ad adVar2 = new ad(i3);
                adVar2.f28913f = c5678o;
                adVar2.f28914g = parseLong;
                afVar.mo5139a(adVar2.m26987a());
                f28954a.m27209b("Read crash file %s: %s", file3, c5676m);
                i = i2;
            } catch (Throwable e2) {
                f28954a.m27208a(e2, "Could not read crash file %s", file3);
                i = i2;
            }
        }
        arrayList.isEmpty();
        C5693a.m26953b(file);
        C5693a.m26953b(file2);
    }

    final C5676m m27011a(CrashInfo crashInfo, boolean z) {
        C5676m c5676m = new C5676m();
        c5676m.f28770a = crashInfo.exceptionClassName;
        c5676m.f28772c = crashInfo.throwClassName;
        c5676m.f28771b = crashInfo.throwFileName;
        c5676m.f28774e = Integer.valueOf(crashInfo.throwLineNumber);
        c5676m.f28773d = crashInfo.throwMethodName;
        String str = crashInfo.stackTrace;
        if (str != null) {
            String replace;
            if (crashInfo.exceptionMessage != null) {
                replace = str.replace(crashInfo.exceptionMessage, "");
            } else {
                replace = str;
            }
            str = replace.substring(0, Math.min(replace.length(), ((Integer) this.f28956c.mo5158a()).intValue()));
        }
        c5676m.f28775f = str;
        c5676m.f28776g = Boolean.valueOf(z);
        return c5676m;
    }
}
