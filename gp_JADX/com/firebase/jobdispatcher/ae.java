package com.firebase.jobdispatcher;

import android.os.Bundle;
import android.util.Log;

public final class ae {
    public final C0751z f4657a;
    public final C0738n f4658b;

    ae(C0751z c0751z, C0738n c0738n) {
        this.f4657a = c0751z;
        this.f4658b = c0738n;
    }

    public final void m4818a(int i) {
        try {
            this.f4658b.mo1112a(GooglePlayReceiver.f4639a.m4893a(this.f4657a, new Bundle()), i);
        } catch (Throwable e) {
            Log.e("FJD.JobService", "Failed to send result to driver", e);
        }
    }
}
