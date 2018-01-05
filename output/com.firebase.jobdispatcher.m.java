package com.firebase.jobdispatcher;

import android.os.Bundle;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;

public final class com.firebase.jobdispatcher.m implements com.firebase.jobdispatcher.v
{

    public final Messenger a;
    public final String b;

    m(Messenger p0, String p1) {
        this.a = p0;
        this.b = p1;
    }

    public final void a(int p0) {
        try {
            v1 = Message.obtain();
            v1.what = 3;
            v1.arg1 = p0;
            v2 = new Bundle();
            v2.putString("tag", this.b);
            v1.setData(v2);
            this.a.send(v1);
        }
        catch (RemoteException ex) {
            throw new RuntimeException(ex);
        }
    }

}
