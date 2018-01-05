package com.google.android.finsky.hygiene;

import android.os.AsyncTask;
import android.os.Environment;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.aa.C0955b;
import com.google.android.finsky.p111d.C2474c;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.utils.C4679j;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.libraries.social.licenses.C6187g;
import com.google.android.libraries.social.licenses.License;
import com.google.wireless.android.a.a.a.a.ag;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

final class C3192c extends AsyncTask {
    public final /* synthetic */ int f16486a;
    public final /* synthetic */ DailyHygiene f16487b;

    C3192c(DailyHygiene dailyHygiene, int i) {
        this.f16487b = dailyHygiene;
        this.f16486a = i;
    }

    private final Void m16235a() {
        Closeable closeable;
        Closeable closeable2;
        IOException e;
        C2495w c2495w;
        int i;
        ag agVar;
        Throwable th;
        Closeable closeable3 = null;
        Closeable fileOutputStream;
        try {
            String valueOf = String.valueOf(Environment.getExternalStorageDirectory());
            File file = new File(new StringBuilder(String.valueOf(valueOf).length() + 10).append(valueOf).append("/Documents").toString());
            if ("mounted".equals(Environment.getExternalStorageState())) {
                File file2 = new File(file, (String) C0955b.gT.m28964b());
                File file3 = new File(file2, String.format("%s_v%d.html", new Object[]{C0955b.gU.m28964b(), Integer.valueOf(this.f16486a)}));
                if (!file2.exists()) {
                    file2.mkdirs();
                }
                if (file3.exists()) {
                    FinskyLog.m21659a("Open source licenses file is up-to-date", new Object[0]);
                    closeable = null;
                    closeable2 = null;
                } else {
                    PrintWriter printWriter;
                    file3.createNewFile();
                    fileOutputStream = new FileOutputStream(file3);
                    try {
                        printWriter = new PrintWriter(fileOutputStream);
                    } catch (IOException e2) {
                        e = e2;
                        closeable = null;
                        closeable2 = fileOutputStream;
                        try {
                            FinskyLog.m21667d("Failed to update open source license file: %s", e);
                            c2495w = this.f16487b.f16442n;
                            i = this.f16487b.f16443o;
                            agVar = new ag();
                            agVar.a(i);
                            c2495w.m13367a(new C2474c(172).m13216a(agVar).m13217a(C1473m.f7980a.cs().m8828a()).m13239a(false));
                            C4679j.m21814a(closeable);
                            C4679j.m21814a(closeable2);
                            return null;
                        } catch (Throwable th2) {
                            th = th2;
                            closeable3 = closeable;
                            fileOutputStream = closeable2;
                            C4679j.m21814a(closeable3);
                            C4679j.m21814a(fileOutputStream);
                            throw th;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        C4679j.m21814a(closeable3);
                        C4679j.m21814a(fileOutputStream);
                        throw th;
                    }
                    try {
                        printWriter.println("<pre>");
                        ArrayList a = C6187g.m28526a(this.f16487b.f16436h);
                        int size = a.size();
                        int i2 = 0;
                        while (i2 < size) {
                            Object obj = a.get(i2);
                            i2++;
                            License license = (License) obj;
                            String valueOf2 = String.valueOf(license);
                            String a2 = C6187g.m28522a(this.f16487b.f16436h, license);
                            printWriter.println(new StringBuilder((String.valueOf(valueOf2).length() + 16) + String.valueOf(a2).length()).append("------ ").append(valueOf2).append(" -------\n").append(a2).toString());
                        }
                        printWriter.println("</pre>");
                        FinskyLog.m21659a("Updated open source licenses file: %s", file3.getAbsolutePath());
                        closeable = printWriter;
                        closeable2 = fileOutputStream;
                    } catch (IOException e3) {
                        e = e3;
                        closeable = printWriter;
                        closeable2 = fileOutputStream;
                        FinskyLog.m21667d("Failed to update open source license file: %s", e);
                        c2495w = this.f16487b.f16442n;
                        i = this.f16487b.f16443o;
                        agVar = new ag();
                        agVar.a(i);
                        c2495w.m13367a(new C2474c(172).m13216a(agVar).m13217a(C1473m.f7980a.cs().m8828a()).m13239a(false));
                        C4679j.m21814a(closeable);
                        C4679j.m21814a(closeable2);
                        return null;
                    } catch (Throwable th4) {
                        th = th4;
                        Object obj2 = printWriter;
                        C4679j.m21814a(closeable3);
                        C4679j.m21814a(fileOutputStream);
                        throw th;
                    }
                }
                try {
                    File[] listFiles = file2.listFiles();
                    if (listFiles != null) {
                        for (File file4 : listFiles) {
                            if (!file3.getName().equals(file4.getName()) && file4.getName().contains((CharSequence) C0955b.gU.m28964b())) {
                                file4.delete();
                            }
                        }
                    }
                    C4679j.m21814a(closeable);
                    C4679j.m21814a(closeable2);
                } catch (IOException e4) {
                    e = e4;
                    FinskyLog.m21667d("Failed to update open source license file: %s", e);
                    c2495w = this.f16487b.f16442n;
                    i = this.f16487b.f16443o;
                    agVar = new ag();
                    agVar.a(i);
                    c2495w.m13367a(new C2474c(172).m13216a(agVar).m13217a(C1473m.f7980a.cs().m8828a()).m13239a(false));
                    C4679j.m21814a(closeable);
                    C4679j.m21814a(closeable2);
                    return null;
                }
            }
            FinskyLog.m21665c("External storage not mounted; could not copy open source license file.", new Object[0]);
            c2495w = this.f16487b.f16442n;
            int i3 = this.f16487b.f16443o;
            ag agVar2 = new ag();
            agVar2.a(i3);
            c2495w.m13367a(new C2474c(172).m13216a(agVar2).m13217a(C1473m.f7980a.cs().m8828a()).m13239a(false));
            C4679j.m21814a(null);
            C4679j.m21814a(null);
        } catch (IOException e5) {
            e = e5;
            closeable = null;
            closeable2 = null;
            FinskyLog.m21667d("Failed to update open source license file: %s", e);
            c2495w = this.f16487b.f16442n;
            i = this.f16487b.f16443o;
            agVar = new ag();
            agVar.a(i);
            c2495w.m13367a(new C2474c(172).m13216a(agVar).m13217a(C1473m.f7980a.cs().m8828a()).m13239a(false));
            C4679j.m21814a(closeable);
            C4679j.m21814a(closeable2);
            return null;
        } catch (Throwable th5) {
            th = th5;
            fileOutputStream = null;
            C4679j.m21814a(closeable3);
            C4679j.m21814a(fileOutputStream);
            throw th;
        }
        return null;
    }

    protected final /* synthetic */ Object doInBackground(Object[] objArr) {
        return m16235a();
    }
}
