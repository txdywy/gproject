package com.google.android.finsky.al;

import android.os.Environment;
import android.text.TextUtils;
import com.google.android.finsky.utils.C4679j;
import com.google.android.finsky.utils.C4680k;
import com.google.android.finsky.utils.FinskyLog;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.File;
import java.io.FileReader;

public final class C1219c {
    public static C1225k m7207a(String str, C1216i c1216i) {
        Exception e;
        Object obj;
        Throwable th;
        Closeable closeable = null;
        try {
            File externalStorageDirectory = Environment.getExternalStorageDirectory();
            File file = new File(externalStorageDirectory, str);
            if (!file.exists()) {
                file = new File(new File(externalStorageDirectory, "Download"), str);
            }
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            try {
                C1225k a = C1219c.m7206a(bufferedReader, c1216i);
                C4679j.m21814a(bufferedReader);
                return a;
            } catch (Exception e2) {
                e = e2;
                obj = bufferedReader;
                try {
                    FinskyLog.m21667d("Unable to build selector: %s", e.getMessage());
                    C4679j.m21814a(closeable);
                    return new C1225k();
                } catch (Throwable th2) {
                    th = th2;
                    C4679j.m21814a(closeable);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                obj = bufferedReader;
                C4679j.m21814a(closeable);
                throw th;
            }
        } catch (Exception e3) {
            e = e3;
            FinskyLog.m21667d("Unable to build selector: %s", e.getMessage());
            C4679j.m21814a(closeable);
            return new C1225k();
        }
    }

    private static C1225k m7206a(BufferedReader bufferedReader, C1216i c1216i) {
        C1225k c1225k = new C1225k();
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine == null) {
                return c1225k;
            }
            readLine = readLine.trim();
            if (!(readLine.startsWith("#") || TextUtils.isEmpty(readLine))) {
                String[] a = C4680k.m21818a(readLine);
                Object obj = a[0];
                String str;
                if (TextUtils.isEmpty(obj)) {
                    str = "Skipping an item from csv without a name: ";
                    readLine = String.valueOf(readLine);
                    FinskyLog.m21659a(readLine.length() != 0 ? str.concat(readLine) : new String(str), new Object[0]);
                } else if (c1216i.mo1530a(a)) {
                    Object b = c1216i.mo1531b(a);
                    c1225k.m7215a(obj, b);
                    if (c1216i.mo1532b(b)) {
                        c1225k.f7360a = c1225k.m7214a().size() - 1;
                    }
                } else {
                    str = "Skipping an item from csv without proper validation: ";
                    readLine = String.valueOf(readLine);
                    FinskyLog.m21659a(readLine.length() != 0 ? str.concat(readLine) : new String(str), new Object[0]);
                }
            }
        }
    }
}
