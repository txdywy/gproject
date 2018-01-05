package org.chromium.base;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.MessageQueue.IdleHandler;
import org.chromium.base.annotations.CalledByNative;

class SystemMessageHandler extends Handler {
    public long f40502a;
    public long f40503b;
    public long f40504c;
    public final IdleHandler f40505d = new C7905q(this);

    private SystemMessageHandler(long j, long j2) {
        this.f40502a = j;
        this.f40503b = j2;
        Looper.myQueue().addIdleHandler(this.f40505d);
    }

    private native void nativeDoIdleWork(long j, long j2);

    private native void nativeDoRunLoopOnce(long j, long j2, long j3);

    public void handleMessage(Message message) {
        if (message.what == 2) {
            this.f40504c = 0;
        }
        nativeDoRunLoopOnce(this.f40502a, this.f40503b, this.f40504c);
    }

    @CalledByNative
    private void scheduleWork() {
        sendMessage(m37804a(1));
    }

    @CalledByNative
    private void scheduleDelayedWork(long j, long j2) {
        if (this.f40504c != 0) {
            removeMessages(2);
        }
        this.f40504c = j;
        sendMessageDelayed(m37804a(2), j2);
    }

    @CalledByNative
    private void removeAllPendingMessages() {
        removeMessages(1);
        removeMessages(2);
        Looper.myQueue().removeIdleHandler(this.f40505d);
    }

    private static Message m37804a(int i) {
        Message obtain = Message.obtain();
        obtain.what = i;
        C7906r.f40554a.mo6570a(obtain);
        return obtain;
    }

    @CalledByNative
    private static SystemMessageHandler create(long j, long j2) {
        return new SystemMessageHandler(j, j2);
    }
}
