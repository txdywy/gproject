package com.google.android.finsky.activities;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.finsky.p111d.C2475d;

final class dt extends BroadcastReceiver {
    public final /* synthetic */ InlineAppDetailsDialog f6677a;

    dt(InlineAppDetailsDialog inlineAppDetailsDialog) {
        this.f6677a = inlineAppDetailsDialog;
    }

    public final void onReceive(Context context, Intent intent) {
        if (this.f6677a.f6332G != null && "homekey".equals(intent.getStringExtra("reason"))) {
            this.f6677a.f6316C.m13379b(new C2475d(this.f6677a.f6332G).m13256a(604));
        }
    }
}
