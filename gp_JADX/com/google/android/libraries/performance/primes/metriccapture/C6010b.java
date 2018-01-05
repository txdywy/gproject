package com.google.android.libraries.performance.primes.metriccapture;

import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.StatFs;
import com.google.android.libraries.p326c.p327a.C5917b;
import com.google.android.libraries.performance.primes.C5989do;
import d.a.a.a.a.a.at;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public final class C6010b {
    private static boolean m27876a(File file) {
        try {
            if (file.getCanonicalPath().equals(new File(file.getParentFile().getCanonicalFile(), file.getName()).getPath())) {
                return false;
            }
            return true;
        } catch (IOException e) {
            String valueOf = String.valueOf(file);
            C5989do.m27824a(5, "DirStatsCapture", new StringBuilder(String.valueOf(valueOf).length() + 53).append("Could not check symlink for file: ").append(valueOf).append(", assuming symlink.").toString(), new Object[0]);
            return false;
        }
    }

    private static long m27874a(File file, List list, int i, int i2, int i3) {
        long j = 0;
        if (C6010b.m27876a(file) || i3 >= i2) {
            j = new StatFs(file.getPath()).getBlockSizeLong();
        } else if (file.isFile()) {
            return file.length();
        } else {
            File[] listFiles = file.listFiles();
            if (listFiles != null) {
                if (listFiles.length >= i) {
                    j = new StatFs(file.getPath()).getBlockSizeLong();
                } else {
                    for (File file2 : listFiles) {
                        if (file2.isDirectory()) {
                            j += C6010b.m27874a(file2, list, i, i2, i3 + 1);
                        } else {
                            j += file2.length();
                        }
                    }
                }
            }
        }
        at atVar = new at();
        atVar.b = file.toString();
        atVar.d = Long.valueOf(j);
        list.add(atVar);
        return j;
    }

    private static void m27875a(List list, String str) {
        at atVar = null;
        for (at atVar2 : list) {
            at atVar22;
            String substring;
            String str2 = atVar22.b;
            if (str2.startsWith(str)) {
                substring = str2.substring(Math.min(str2.length(), str.length() + 1));
            } else {
                String str3 = "DirStatsCapture";
                String str4 = "Unexpected dir to be stripped: ";
                substring = String.valueOf(str2);
                C5989do.m27824a(5, str3, substring.length() != 0 ? str4.concat(substring) : new String(str4), new Object[0]);
                substring = str2;
            }
            if (!substring.isEmpty()) {
                atVar22 = atVar;
            }
            atVar = atVar22;
        }
        if (atVar != null) {
            list.remove(atVar);
        }
    }

    public static at[] m27877a(Context context) {
        File file;
        at[] atVarArr = null;
        C5917b.m27414b();
        List arrayList = new ArrayList();
        try {
            file = new File(context.getPackageManager().getApplicationInfo(context.getPackageName(), 0).dataDir);
        } catch (NameNotFoundException e) {
            C5989do.m27824a(5, "DirStatsCapture", "Failed to use package manager getting data directory from context instead.", new Object[0]);
            file = context.getFilesDir();
            if (file != null) {
                file = file.getParentFile();
            } else {
                file = null;
            }
        }
        if (file != null) {
            try {
                C6010b.m27874a(file, arrayList, 10, 2, 0);
                if (!arrayList.isEmpty()) {
                    C5989do.m27824a(3, "DirStatsCapture", "Successfully retrieved DirStats.", new Object[0]);
                    C6010b.m27875a(arrayList, file.toString());
                    atVarArr = (at[]) arrayList.toArray(new at[0]);
                }
            } catch (Exception e2) {
                String valueOf = String.valueOf(e2);
                C5989do.m27824a(5, "DirStatsCapture", new StringBuilder(String.valueOf(valueOf).length() + 29).append("Failed to retrieve DirStats: ").append(valueOf).toString(), new Object[0]);
            }
        }
        return atVarArr;
    }
}
