package com.google.android.finsky.zapp;

import android.os.Bundle;
import com.google.android.finsky.zapp.p267a.C4839h;
import java.util.List;
import java.util.concurrent.BlockingQueue;

final class C4860s extends C4839h {
    public final /* synthetic */ BlockingQueue f25168a;

    C4860s(BlockingQueue blockingQueue) {
        this.f25168a = blockingQueue;
    }

    public final void mo4412a(int i, List list, Bundle bundle) {
        if (this.f25168a.peek() == null) {
            this.f25168a.add(new C4851i(i, list, bundle));
        }
    }
}
