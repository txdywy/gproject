package android.support.v4.app;

import android.os.Handler;
import android.os.Message;

final class C0255v extends Handler {
    public final /* synthetic */ C0254u f1619a;

    C0255v(C0254u c0254u) {
        this.f1619a = c0254u;
    }

    public final void handleMessage(Message message) {
        switch (message.what) {
            case 1:
                if (this.f1619a.f1613g) {
                    this.f1619a.m1498a(false);
                    return;
                }
                return;
            case 2:
                this.f1619a.z_();
                this.f1619a.f1610d.m1512b();
                return;
            default:
                super.handleMessage(message);
                return;
        }
    }
}
