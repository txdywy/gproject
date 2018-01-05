package com.google.android.finsky.utils;

import android.os.Process;
import com.google.c.a.a.a.a.a;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

public final class C4687q implements C4686s, Closeable {
    public final File f24069a;
    public final PrintWriter f24070b;

    public C4687q(File file) {
        this.f24069a = file;
        this.f24070b = new PrintWriter(new FileWriter(file, true), true);
    }

    public final void m21834a(PrintWriter printWriter) {
        Closeable bufferedReader;
        Throwable e;
        Closeable closeable = null;
        try {
            bufferedReader = new BufferedReader(new FileReader(this.f24069a));
            while (true) {
                try {
                    String readLine = bufferedReader.readLine();
                    if (readLine != null) {
                        printWriter.write(readLine);
                    } else {
                        C4679j.m21814a(bufferedReader);
                        return;
                    }
                } catch (IOException e2) {
                    e = e2;
                }
            }
        } catch (IOException e3) {
            e = e3;
            bufferedReader = null;
            try {
                a.a(e, printWriter);
                C4679j.m21814a(bufferedReader);
            } catch (Throwable th) {
                e = th;
                closeable = bufferedReader;
                C4679j.m21814a(closeable);
                throw e;
            }
        } catch (Throwable th2) {
            e = th2;
            C4679j.m21814a(closeable);
            throw e;
        }
    }

    public final void mo4331a(Throwable th, String str, Object[] objArr) {
        this.f24070b.printf("%s %d %d %d ", new Object[]{FinskyLog.f24021a.format(new Date(System.currentTimeMillis())), Integer.valueOf(Process.myUid()), Integer.valueOf(Process.myPid()), Integer.valueOf(Process.myTid())});
        this.f24070b.printf(str, objArr);
        if (th != null) {
            a.a(th, this.f24070b);
        }
        this.f24070b.println();
    }

    public final void close() {
        this.f24070b.close();
    }
}
