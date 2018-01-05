package com.google.android.gms.common.util;

import android.os.Process;
import android.os.StrictMode;
import android.os.StrictMode.ThreadPolicy;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.FileReader;
import java.io.IOException;

public final class C5156k {
    public static String f26093a = null;
    public static final int f26094b = Process.myPid();

    public static String m23891a() {
        if (f26093a == null) {
            f26093a = C5156k.m23892a(f26094b);
        }
        return f26093a;
    }

    private static String m23892a(int i) {
        ThreadPolicy allowThreadDiskReads;
        Closeable bufferedReader;
        Throwable th;
        String str = null;
        if (i > 0) {
            try {
                allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                bufferedReader = new BufferedReader(new FileReader("/proc/" + i + "/cmdline"));
                try {
                    StrictMode.setThreadPolicy(allowThreadDiskReads);
                    str = bufferedReader.readLine().trim();
                    C5150e.m23881a(bufferedReader);
                } catch (IOException e) {
                    C5150e.m23881a(bufferedReader);
                    return str;
                } catch (Throwable th2) {
                    th = th2;
                    C5150e.m23881a(bufferedReader);
                    throw th;
                }
            } catch (IOException e2) {
                bufferedReader = str;
                C5150e.m23881a(bufferedReader);
                return str;
            } catch (Throwable th3) {
                Throwable th4 = th3;
                bufferedReader = str;
                th = th4;
                C5150e.m23881a(bufferedReader);
                throw th;
            }
        }
        return str;
    }
}
