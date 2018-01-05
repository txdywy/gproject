package com.google.android.finsky.setup;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.finsky.layout.by;

final class db extends BroadcastReceiver {
    public final /* synthetic */ VpaSelectionActivity f21059a;

    db(VpaSelectionActivity vpaSelectionActivity) {
        this.f21059a = vpaSelectionActivity;
    }

    public final void onReceive(Context context, Intent intent) {
        int intExtra = intent.getIntExtra("VpaDetailsActivity.groupIndex", -1);
        int intExtra2 = intent.getIntExtra("VpaDetailsActivity.preloadIndex", -1);
        boolean booleanExtra = intent.getBooleanExtra("VpaDetailsActivity.isSelected", false);
        by byVar = this.f21059a.f20684o[intExtra];
        byVar.f18554f[intExtra2] = booleanExtra;
        byVar.m17436a(true);
    }
}
