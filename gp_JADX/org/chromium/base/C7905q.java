package org.chromium.base;

import android.os.MessageQueue.IdleHandler;

final class C7905q implements IdleHandler {
    public final /* synthetic */ SystemMessageHandler f40553a;

    C7905q(SystemMessageHandler systemMessageHandler) {
        this.f40553a = systemMessageHandler;
    }

    public final boolean queueIdle() {
        this.f40553a.nativeDoIdleWork(this.f40553a.f40502a, this.f40553a.f40503b);
        return true;
    }
}
