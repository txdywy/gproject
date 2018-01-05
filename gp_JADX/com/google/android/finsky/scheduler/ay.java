package com.google.android.finsky.scheduler;

import android.util.Log;
import com.firebase.jobdispatcher.C0751z;
import com.firebase.jobdispatcher.aa;
import com.firebase.jobdispatcher.ae;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.scheduler.FirebaseJobDispatcherEngine.FirebaseJobDispatcherService;

final class ay implements C4021p {
    public final /* synthetic */ C2495w f20241a;
    public final /* synthetic */ FirebaseJobDispatcherService f20242b;
    public final /* synthetic */ C0751z f20243c;
    public final /* synthetic */ ak f20244d;

    ay(ak akVar, C2495w c2495w, FirebaseJobDispatcherService firebaseJobDispatcherService, C0751z c0751z) {
        this.f20244d = akVar;
        this.f20241a = c2495w;
        this.f20242b = firebaseJobDispatcherService;
        this.f20243c = c0751z;
    }

    public final void mo3888a() {
        this.f20244d.f20200a = null;
        this.f20244d.f20209j.m18907a(2522).m18893a(2, 5).m18900b(this.f20241a);
        aa aaVar = this.f20242b;
        C0751z c0751z = this.f20243c;
        if (c0751z == null) {
            Log.e("FJD.JobService", "jobFinished called with a null JobParameters");
        } else {
            synchronized (aaVar.f4649b) {
                ae aeVar = (ae) aaVar.f4649b.remove(c0751z.mo1122e());
                if (aeVar != null) {
                    aeVar.m4818a(0);
                }
            }
        }
        this.f20244d.m18818c(-1);
    }
}
