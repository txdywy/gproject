package com.google.android.finsky.setup;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

final class aq extends BroadcastReceiver {
    public final /* synthetic */ RestoreService f20793a;

    aq(RestoreService restoreService) {
        this.f20793a = restoreService;
    }

    public final void onReceive(Context context, Intent intent) {
        this.f20793a.f20584r.post(new ar(this));
    }
}
