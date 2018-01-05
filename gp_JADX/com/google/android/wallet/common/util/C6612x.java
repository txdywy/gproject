package com.google.android.wallet.common.util;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

public final class C6612x extends BroadcastReceiver {
    public final /* synthetic */ C6611w f32781a;

    public C6612x(C6611w c6611w) {
        this.f32781a = c6611w;
    }

    public final void onReceive(Context context, Intent intent) {
        context.unregisterReceiver(this);
        int resultCode = getResultCode();
        switch (resultCode) {
            case -1:
                this.f32781a.m29988a(1);
                return;
            case 1:
                Log.d("SmsSender", "SMS failed, error code: " + intent.getIntExtra("errorCode", -1));
                this.f32781a.m29988a(2);
                return;
            case 2:
                this.f32781a.m29988a(3);
                return;
            case 3:
                this.f32781a.m29988a(4);
                return;
            default:
                Log.d("SmsSender", "SMS failed, result code: " + resultCode);
                this.f32781a.m29988a(2);
                return;
        }
    }
}
