package com.firebase.jobdispatcher;

import android.annotation.TargetApi;
import android.app.AppOpsManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.util.Log;

@TargetApi(21)
final class C0747l extends Handler {
    public final GooglePlayReceiver f4689a;

    public C0747l(Looper looper, GooglePlayReceiver googlePlayReceiver) {
        super(looper);
        this.f4689a = googlePlayReceiver;
    }

    public final void handleMessage(Message message) {
        if (message != null) {
            try {
                ((AppOpsManager) this.f4689a.getApplicationContext().getSystemService("appops")).checkPackage(message.sendingUid, "com.google.android.gms");
                switch (message.what) {
                    case 1:
                        Bundle data = message.getData();
                        Messenger messenger = message.replyTo;
                        String string = data.getString("tag");
                        if (messenger != null && string != null) {
                            this.f4689a.m4806a().m4840a(GooglePlayReceiver.m4801a(new C0748m(messenger, string), data));
                            return;
                        } else if (Log.isLoggable("FJD.GooglePlayReceiver", 3)) {
                            Log.d("FJD.GooglePlayReceiver", "Invalid start execution message.");
                            return;
                        } else {
                            return;
                        }
                    case 2:
                        C0756y a = GooglePlayReceiver.f4639a.m4894a(message.getData());
                        if (a != null) {
                            C0737d.m4839a(a.m4904a(), true);
                            return;
                        } else if (Log.isLoggable("FJD.GooglePlayReceiver", 3)) {
                            Log.d("FJD.GooglePlayReceiver", "Invalid stop execution message.");
                            return;
                        } else {
                            return;
                        }
                    case 4:
                        return;
                    default:
                        String valueOf = String.valueOf(message);
                        Log.e("FJD.GooglePlayReceiver", new StringBuilder(String.valueOf(valueOf).length() + 31).append("Unrecognized message received: ").append(valueOf).toString());
                        return;
                }
            } catch (SecurityException e) {
                Log.e("FJD.GooglePlayReceiver", "Message was not sent from GCM.");
            }
        }
    }
}
