package com.google.android.play.image;

import java.util.concurrent.ThreadFactory;

final /* synthetic */ class C6377p implements ThreadFactory {
    public static final ThreadFactory f32121a = new C6377p();

    private C6377p() {
    }

    public final Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable, "DecodeThread");
        thread.setPriority(1);
        return thread;
    }
}
