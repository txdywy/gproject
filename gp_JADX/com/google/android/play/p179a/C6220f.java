package com.google.android.play.p179a;

import android.os.Handler;
import com.google.android.play.p179a.p352a.aa;
import com.google.android.play.p179a.p352a.ab;
import com.google.android.play.utils.PlayCommonLog;
import com.google.protobuf.nano.C0757i;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public final class C6220f {
    public final File f31094a;
    public final File f31095b;
    public final Runnable f31096c;
    public final File f31097d;
    public final ab f31098e = new ab();
    public final Handler f31099f;
    public aa f31100g = null;
    public aa f31101h = new aa();

    public C6220f(File file, Handler handler) {
        this.f31094a = file;
        if (!file.exists()) {
            file.mkdirs();
        }
        this.f31095b = new File(file, "play_metalog.log");
        this.f31097d = new File(file, "logs_upload_attempt.log");
        try {
            C0757i.m4905a(this.f31098e, C6220f.m28701a(this.f31095b));
        } catch (IOException e) {
            PlayCommonLog.c("Failed to restore PlayMetalog", new Object[0]);
            this.f31098e.m28537a();
        }
        try {
            C0757i.m4905a(this.f31101h, C6220f.m28701a(this.f31097d));
        } catch (IOException e2) {
            PlayCommonLog.c("Failed to restore LogsUploadAttempt", new Object[0]);
            this.f31101h.m28534c();
        }
        this.f31096c = new C6221g(this);
        this.f31099f = handler;
    }

    public final void m28704a(int i) {
        if (this.f31098e.f30738d.length < 1000) {
            this.f31098e.f30738d = C6220f.m28702a(this.f31098e.f30738d, i);
            m28703a();
        }
    }

    public final void m28706b(int i) {
        if (i > this.f31098e.f30737c) {
            ab abVar = this.f31098e;
            abVar.f30735a |= 2;
            abVar.f30737c = i;
            m28703a();
        }
    }

    public final void m28705a(boolean z) {
        ab abVar;
        int i;
        if (z) {
            abVar = this.f31098e;
            i = this.f31098e.f30744j + 1;
            abVar.f30735a |= 64;
            abVar.f30744j = i;
        } else {
            abVar = this.f31098e;
            i = this.f31098e.f30743i + 1;
            abVar.f30735a |= 32;
            abVar.f30743i = i;
        }
        m28703a();
    }

    public final void m28707c(int i) {
        this.f31101h.f30728d = C6220f.m28702a(this.f31101h.f30728d, i);
        m28703a();
    }

    public final void m28708d(int i) {
        this.f31100g.f30729e = C6220f.m28702a(this.f31100g.f30729e, i);
        m28703a();
    }

    final void m28703a() {
        this.f31099f.removeCallbacks(this.f31096c);
        this.f31099f.postDelayed(this.f31096c, 2000);
    }

    static int[] m28702a(int[] iArr, int i) {
        Object obj = new int[(iArr.length + 1)];
        System.arraycopy(iArr, 0, obj, 0, iArr.length);
        obj[obj.length - 1] = i;
        return obj;
    }

    private static byte[] m28701a(File file) {
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            int length = (int) file.length();
            byte[] bArr = new byte[length];
            int i = 0;
            while (i < length) {
                int read = fileInputStream.read(bArr, i, length - i);
                if (read == -1) {
                    break;
                }
                i += read;
            }
            fileInputStream.close();
            return bArr;
        } catch (Throwable th) {
            fileInputStream.close();
        }
    }

    static void m28700a(File file, byte[] bArr) {
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            fileOutputStream.write(bArr);
        } finally {
            fileOutputStream.close();
        }
    }
}
