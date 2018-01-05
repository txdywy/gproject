package android.support.v4.view;

import android.os.Handler;
import android.os.Message;

final class C0355l extends Handler {
    public final /* synthetic */ C0354k f1921a;

    C0355l(C0354k c0354k) {
        this.f1921a = c0354k;
    }

    public final void handleMessage(Message message) {
        switch (message.what) {
            case 1:
                this.f1921a.f1905i.onShowPress(this.f1921a.f1912p);
                return;
            case 2:
                C0354k c0354k = this.f1921a;
                c0354k.f1904h.removeMessages(3);
                c0354k.f1908l = false;
                c0354k.f1909m = true;
                c0354k.f1905i.onLongPress(c0354k.f1912p);
                return;
            case 3:
                if (this.f1921a.f1906j == null) {
                    return;
                }
                if (this.f1921a.f1907k) {
                    this.f1921a.f1908l = true;
                    return;
                } else {
                    this.f1921a.f1906j.onSingleTapConfirmed(this.f1921a.f1912p);
                    return;
                }
            default:
                throw new RuntimeException("Unknown message " + message);
        }
    }
}
