package com.google.android.finsky.setup;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

final class bg extends BroadcastReceiver {
    public final /* synthetic */ RestoreServiceV2 f20865a;

    bg(RestoreServiceV2 restoreServiceV2) {
        this.f20865a = restoreServiceV2;
    }

    public final void onReceive(Context context, Intent intent) {
        this.f20865a.f20607s.post(new bh(this));
    }
}
