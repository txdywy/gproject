package com.firebase.jobdispatcher;

import android.os.Bundle;
import android.util.Log;
import java.util.Locale;

final class ab extends C0734r {
    public final /* synthetic */ aa f4651a;

    ab(aa aaVar) {
        this.f4651a = aaVar;
    }

    public final void mo1110a(Bundle bundle, C0738n c0738n) {
        C0756y a = GooglePlayReceiver.f4639a.m4894a(bundle);
        if (a == null) {
            Log.wtf("FJD.JobService", "start: unknown invocation provided");
            return;
        }
        aa aaVar = this.f4651a;
        C0751z a2 = a.m4904a();
        synchronized (aaVar.f4649b) {
            if (aaVar.f4649b.containsKey(a2.mo1122e())) {
                Log.w("FJD.JobService", String.format(Locale.US, "Job with tag = %s was already running.", new Object[]{a2.mo1122e()}));
                return;
            }
            aaVar.f4649b.put(a2.mo1122e(), new ae(a2, c0738n));
            aa.f4648a.post(new ac(aaVar, a2));
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo1111a(android.os.Bundle r6, boolean r7) {
        /*
        r5 = this;
        r0 = com.firebase.jobdispatcher.GooglePlayReceiver.f4639a;
        r0 = r0.m4894a(r6);
        if (r0 != 0) goto L_0x0010;
    L_0x0008:
        r0 = "FJD.JobService";
        r1 = "stop: unknown invocation provided";
        android.util.Log.wtf(r0, r1);
    L_0x000f:
        return;
    L_0x0010:
        r1 = r5.f4651a;
        r0 = r0.m4904a();
        r2 = r1.f4649b;
        monitor-enter(r2);
        r3 = r1.f4649b;	 Catch:{ all -> 0x0039 }
        r0 = r0.mo1122e();	 Catch:{ all -> 0x0039 }
        r0 = r3.remove(r0);	 Catch:{ all -> 0x0039 }
        r0 = (com.firebase.jobdispatcher.ae) r0;	 Catch:{ all -> 0x0039 }
        if (r0 != 0) goto L_0x003c;
    L_0x0027:
        r0 = "FJD.JobService";
        r1 = 3;
        r0 = android.util.Log.isLoggable(r0, r1);	 Catch:{ all -> 0x0039 }
        if (r0 == 0) goto L_0x0037;
    L_0x0030:
        r0 = "FJD.JobService";
        r1 = "Provided job has already been executed.";
        android.util.Log.d(r0, r1);	 Catch:{ all -> 0x0039 }
    L_0x0037:
        monitor-exit(r2);	 Catch:{ all -> 0x0039 }
        goto L_0x000f;
    L_0x0039:
        r0 = move-exception;
        monitor-exit(r2);	 Catch:{ all -> 0x0039 }
        throw r0;
    L_0x003c:
        r3 = com.firebase.jobdispatcher.aa.f4648a;	 Catch:{ all -> 0x0039 }
        r4 = new com.firebase.jobdispatcher.ad;	 Catch:{ all -> 0x0039 }
        r4.<init>(r1, r7, r0);	 Catch:{ all -> 0x0039 }
        r3.post(r4);	 Catch:{ all -> 0x0039 }
        monitor-exit(r2);	 Catch:{ all -> 0x0039 }
        goto L_0x000f;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.firebase.jobdispatcher.ab.a(android.os.Bundle, boolean):void");
    }
}
