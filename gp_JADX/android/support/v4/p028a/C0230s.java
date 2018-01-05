package android.support.v4.p028a;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

final class C0230s extends Handler {
    C0230s() {
        super(Looper.getMainLooper());
    }

    public final void handleMessage(Message message) {
        C0229r c0229r = (C0229r) message.obj;
        switch (message.what) {
            case 1:
                C0213n c0213n = c0229r.f1246a;
                Object obj = c0229r.f1247b[0];
                if (c0213n.f1213l.get()) {
                    c0213n.mo271b(obj);
                } else {
                    c0213n.mo270a(obj);
                }
                c0213n.f1212k = C0231t.FINISHED;
                return;
            case 2:
                C0213n.m1099b();
                return;
            default:
                return;
        }
    }
}
