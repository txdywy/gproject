package com.google.android.wallet.common.util;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build.VERSION;
import android.provider.Telephony.Sms.Intents;
import android.telephony.SmsMessage;
import android.util.Log;

public final class C6609u extends BroadcastReceiver {
    public C6610v f32778a;

    public final void onReceive(Context context, Intent intent) {
        if (!"android.provider.Telephony.SMS_RECEIVED".equals(intent.getAction())) {
            String str = "SmsReceiver";
            String str2 = "Received intent with action: ";
            String valueOf = String.valueOf(intent.getAction());
            if (valueOf.length() != 0) {
                valueOf = str2.concat(valueOf);
            } else {
                valueOf = new String(str2);
            }
            Log.d(str, valueOf);
        } else if (this.f32778a == null) {
            Log.v("SmsReceiver", "No listener to handle SMS broadcasts");
        } else if (VERSION.SDK_INT >= 19) {
            this.f32778a.mo5584a(Intents.getMessagesFromIntent(intent));
        } else {
            Object[] objArr = (Object[]) intent.getExtras().get("pdus");
            int length = objArr.length;
            SmsMessage[] smsMessageArr = new SmsMessage[length];
            for (int i = 0; i < length; i++) {
                smsMessageArr[i] = SmsMessage.createFromPdu((byte[]) objArr[i]);
            }
            this.f32778a.mo5584a(smsMessageArr);
        }
    }
}
