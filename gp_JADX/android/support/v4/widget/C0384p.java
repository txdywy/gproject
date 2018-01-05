package android.support.v4.widget;

import android.database.ContentObserver;
import android.os.Handler;

final class C0384p extends ContentObserver {
    public final /* synthetic */ C0370o f2185a;

    C0384p(C0370o c0370o) {
        this.f2185a = c0370o;
        super(new Handler());
    }

    public final boolean deliverSelfNotifications() {
        return true;
    }

    public final void onChange(boolean z) {
        C0370o c0370o = this.f2185a;
        if (c0370o.f2081b && c0370o.f2082c != null && !c0370o.f2082c.isClosed()) {
            c0370o.f2080a = c0370o.f2082c.requery();
        }
    }
}
