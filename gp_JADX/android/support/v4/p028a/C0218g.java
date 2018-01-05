package android.support.v4.p028a;

import android.database.ContentObserver;
import android.os.Handler;

public final class C0218g extends ContentObserver {
    public final /* synthetic */ C0211f f1228a;

    public C0218g(C0211f c0211f) {
        this.f1228a = c0211f;
        super(new Handler());
    }

    public final boolean deliverSelfNotifications() {
        return true;
    }

    public final void onChange(boolean z) {
        this.f1228a.mo3893l();
    }
}
