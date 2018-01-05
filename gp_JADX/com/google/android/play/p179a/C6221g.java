package com.google.android.play.p179a;

import com.google.android.play.utils.PlayCommonLog;
import com.google.protobuf.nano.C0757i;
import java.io.IOException;

final class C6221g implements Runnable {
    public final /* synthetic */ C6220f f31102a;

    C6221g(C6220f c6220f) {
        this.f31102a = c6220f;
    }

    public final void run() {
        C6220f c6220f = this.f31102a;
        if (!c6220f.f31094a.exists()) {
            PlayCommonLog.c("Metalog directories were deleted unexpectedly, recreating...", new Object[0]);
            c6220f.f31094a.mkdirs();
        }
        try {
            C6220f.m28700a(c6220f.f31095b, C0757i.m4909a(c6220f.f31098e));
        } catch (IOException e) {
            PlayCommonLog.c("Failed to save PlayMetalog", new Object[0]);
        }
        try {
            C6220f.m28700a(c6220f.f31097d, C0757i.m4909a(c6220f.f31101h));
        } catch (IOException e2) {
            PlayCommonLog.c("Failed to save LogsUploadAttempt", new Object[0]);
        }
    }
}
