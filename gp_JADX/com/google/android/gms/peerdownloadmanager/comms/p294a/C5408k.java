package com.google.android.gms.peerdownloadmanager.comms.p294a;

import android.util.Log;
import com.google.common.f.a.aj;

final class C5408k implements aj {
    C5408k() {
    }

    public final void m26197a(Throwable th) {
        Log.d("NetworkCtrlDelegate", "error while removing local AP", th);
    }

    public final /* synthetic */ void m26196a(Object obj) {
        Boolean bool = (Boolean) obj;
        if (bool == null) {
            return;
        }
        if (bool.booleanValue()) {
            Log.d("NetworkCtrlDelegate", "successfully removed local AP");
        } else {
            Log.d("NetworkCtrlDelegate", "failed to remove local AP");
        }
    }
}
