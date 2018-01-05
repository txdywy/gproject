package com.firebase.jobdispatcher;

import android.os.Bundle;
import android.os.RemoteException;
import android.util.Log;

public final class com.firebase.jobdispatcher.ae
{

    public final com.firebase.jobdispatcher.z a;
    public final com.firebase.jobdispatcher.n b;

    ae(com.firebase.jobdispatcher.z p0, com.firebase.jobdispatcher.n p1) {
        this.a = p0;
        this.b = p1;
    }

    public final void a(int p0) {
        try {
            this.b.a(GooglePlayReceiver.a.a(this.a, new Bundle()), p0);
        }
        catch (RemoteException ex) {
            Log.e("FJD.JobService", "Failed to send result to driver", ex);
        }
    }

}
