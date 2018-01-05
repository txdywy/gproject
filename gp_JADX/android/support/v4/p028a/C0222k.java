package android.support.v4.p028a;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

final class C0222k extends Handler {
    public final /* synthetic */ C0221j f1236a;

    C0222k(C0221j c0221j, Looper looper) {
        this.f1236a = c0221j;
        super(looper);
    }

    public final void handleMessage(Message message) {
        switch (message.what) {
            case 1:
                this.f1236a.m1130a();
                return;
            default:
                super.handleMessage(message);
                return;
        }
    }
}
