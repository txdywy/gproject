package com.firebase.jobdispatcher;

import android.app.AppOpsManager;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;

public final class com.firebase.jobdispatcher.l extends Handler
{

    public final GooglePlayReceiver a;

    l(Looper p0, GooglePlayReceiver p1) {
        Handler(p0);
        this.a = p1;
    }

    public final void handleMessage(Message p0) {
        if (p0 == 0)
            return;
        try {
            ((AppOpsManager)this.a.getApplicationContext().getSystemService("appops")).checkPackage(p0.sendingUid, "com.google.android.gms");
        }
        catch (SecurityException ex) {
            Log.e("FJD.GooglePlayReceiver", "Message was not sent from GCM.");
            return;
        }
        switch (p0.what) {
            case 1:
                v0 = p0.getData();
                v2 = v0.getString("tag");
                if (p0.replyTo == 0 || v2 == 0) {
                    if (Log.isLoggable("FJD.GooglePlayReceiver", 3))
                        Log.d("FJD.GooglePlayReceiver", "Invalid start execution message.");
                }
                else
                    this.a.a().a(GooglePlayReceiver.a(new com.firebase.jobdispatcher.m(p0.replyTo, v2), v0));
                break;
            case 2:
                v0 = GooglePlayReceiver.a.a(p0.getData());
                if (v0 == 0) {
                    if (Log.isLoggable("FJD.GooglePlayReceiver", 3))
                        Log.d("FJD.GooglePlayReceiver", "Invalid stop execution message.");
                }
                else
                    com.firebase.jobdispatcher.d.a(v0.a(), 1);
                break;
            case 3:
                v1 = String.valueOf(p0);
                Log.e("FJD.GooglePlayReceiver", (String.valueOf(v1).length() + 31) + "Unrecognized message received: " + v1);
                break;
            case 4:
                break;
            default:
                v1 = String.valueOf(p0);
                Log.e("FJD.GooglePlayReceiver", (String.valueOf(v1).length() + 31) + "Unrecognized message received: " + v1);
                break;
        }
    }

}
