package android.support.v4.p035f;

import android.os.Handler.Callback;
import android.os.Message;

final class C0298k implements Callback {
    public final /* synthetic */ C0297j f1695a;

    C0298k(C0297j c0297j) {
        this.f1695a = c0297j;
    }

    public final boolean handleMessage(Message message) {
        switch (message.what) {
            case 0:
                C0297j c0297j = this.f1695a;
                synchronized (c0297j.f1687a) {
                    if (!c0297j.f1689c.hasMessages(1)) {
                        c0297j.f1688b.quit();
                        c0297j.f1688b = null;
                        c0297j.f1689c = null;
                        break;
                    }
                    break;
                }
            case 1:
                C0297j c0297j2 = this.f1695a;
                ((Runnable) message.obj).run();
                synchronized (c0297j2.f1687a) {
                    c0297j2.f1689c.removeMessages(0);
                    c0297j2.f1689c.sendMessageDelayed(c0297j2.f1689c.obtainMessage(0), (long) c0297j2.f1692f);
                }
                break;
        }
        return true;
    }
}
