package com.google.android.finsky.contentfilterui;

import android.os.AsyncTask;
import com.google.android.finsky.utils.FinskyLog;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

final class C2338c extends AsyncTask {
    public final /* synthetic */ C2336a f11515a;

    C2338c(C2336a c2336a) {
        this.f11515a = c2336a;
    }

    private final Void m11935a(byte[]... bArr) {
        FileOutputStream fileOutputStream;
        FileNotFoundException e;
        Throwable th;
        IOException e2;
        try {
            fileOutputStream = new FileOutputStream(this.f11515a.f11510a);
            try {
                fileOutputStream.write(bArr[0]);
                try {
                    fileOutputStream.flush();
                    fileOutputStream.close();
                } catch (IOException e3) {
                }
            } catch (FileNotFoundException e4) {
                e = e4;
                try {
                    FinskyLog.m21665c("Failed to save response proto, bad file path: %s", e);
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.flush();
                            fileOutputStream.close();
                        } catch (IOException e5) {
                        }
                    }
                    return null;
                } catch (Throwable th2) {
                    th = th2;
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.flush();
                            fileOutputStream.close();
                        } catch (IOException e6) {
                        }
                    }
                    throw th;
                }
            } catch (IOException e7) {
                e2 = e7;
                FinskyLog.m21665c("Failed to save response proto: %s", e2);
                if (fileOutputStream != null) {
                    try {
                        fileOutputStream.flush();
                        fileOutputStream.close();
                    } catch (IOException e8) {
                    }
                }
                return null;
            }
        } catch (FileNotFoundException e9) {
            e = e9;
            fileOutputStream = null;
            FinskyLog.m21665c("Failed to save response proto, bad file path: %s", e);
            if (fileOutputStream != null) {
                fileOutputStream.flush();
                fileOutputStream.close();
            }
            return null;
        } catch (IOException e10) {
            e2 = e10;
            fileOutputStream = null;
            FinskyLog.m21665c("Failed to save response proto: %s", e2);
            if (fileOutputStream != null) {
                fileOutputStream.flush();
                fileOutputStream.close();
            }
            return null;
        } catch (Throwable th3) {
            th = th3;
            fileOutputStream = null;
            if (fileOutputStream != null) {
                fileOutputStream.flush();
                fileOutputStream.close();
            }
            throw th;
        }
        return null;
    }

    protected final /* synthetic */ Object doInBackground(Object[] objArr) {
        return m11935a((byte[][]) objArr);
    }
}
