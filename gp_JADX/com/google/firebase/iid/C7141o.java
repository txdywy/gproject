package com.google.firebase.iid;

import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.iid.MessengerCompat;

final class C7141o extends Handler {
    public /* synthetic */ C7129b f34886a;

    C7141o(C7129b c7129b, Looper looper) {
        this.f34886a = c7129b;
        super(looper);
    }

    public final void handleMessage(Message message) {
        C7129b c7129b = this.f34886a;
        if (message == null) {
            return;
        }
        if (message.obj instanceof Intent) {
            Intent intent = (Intent) message.obj;
            intent.setExtrasClassLoader(MessengerCompat.class.getClassLoader());
            if (intent.hasExtra("google.messenger")) {
                Parcelable parcelableExtra = intent.getParcelableExtra("google.messenger");
                if (parcelableExtra instanceof MessengerCompat) {
                    c7129b.f34855i = (MessengerCompat) parcelableExtra;
                }
                if (parcelableExtra instanceof Messenger) {
                    c7129b.f34854h = (Messenger) parcelableExtra;
                }
            }
            c7129b.m32385a((Intent) message.obj);
            return;
        }
        Log.w("InstanceID/Rpc", "Dropping invalid message");
    }
}
