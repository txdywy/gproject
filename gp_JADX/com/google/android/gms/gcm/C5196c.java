package com.google.android.gms.gcm;

import android.annotation.TargetApi;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.util.Log;
import com.google.android.gms.common.util.C5159n;

@TargetApi(21)
final class C5196c extends Handler {
    public /* synthetic */ C0946b f26232a;

    C5196c(C0946b c0946b, Looper looper) {
        this.f26232a = c0946b;
        super(looper);
    }

    public final void handleMessage(Message message) {
        if (C5159n.m23896a(this.f26232a, message.sendingUid, "com.google.android.gms")) {
            String valueOf;
            switch (message.what) {
                case 1:
                    Bundle data = message.getData();
                    if (!data.isEmpty()) {
                        Messenger messenger = message.replyTo;
                        if (messenger != null) {
                            String string = data.getString("tag");
                            data.getParcelableArrayList("triggered_uris");
                            if (!this.f26232a.m5697a(string)) {
                                this.f26232a.m5696a(new C5197d(this.f26232a, string, messenger, data.getBundle("extras")));
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    return;
                case 2:
                    if (Log.isLoggable("GcmTaskService", 3)) {
                        valueOf = String.valueOf(message);
                        Log.d("GcmTaskService", new StringBuilder(String.valueOf(valueOf).length() + 45).append("ignoring unimplemented stop message for now: ").append(valueOf).toString());
                        return;
                    }
                    return;
                case 4:
                    return;
                default:
                    valueOf = String.valueOf(message);
                    Log.e("GcmTaskService", new StringBuilder(String.valueOf(valueOf).length() + 31).append("Unrecognized message received: ").append(valueOf).toString());
                    return;
            }
        }
        Log.e("GcmTaskService", "unable to verify presence of Google Play Services");
    }
}
