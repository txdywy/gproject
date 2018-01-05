package com.firebase.jobdispatcher;

import android.os.Bundle;
import android.util.Log;

final class C0740e extends C0739o {
    public final /* synthetic */ C0737d f4679a;

    C0740e(C0737d c0737d) {
        this.f4679a = c0737d;
    }

    public final void mo1112a(Bundle bundle, int i) {
        C0756y a = GooglePlayReceiver.f4639a.m4894a(bundle);
        if (a == null) {
            Log.wtf("FJD.ExternalReceiver", "jobFinished: unknown invocation provided");
            return;
        }
        C0737d c0737d = this.f4679a;
        C0755x a2 = a.m4904a();
        synchronized (C0737d.f4675a) {
            af afVar = (af) C0737d.f4675a.get(a2.f4713b);
            if (afVar != null) {
                afVar.m4821a(a2);
                if (afVar.m4823a()) {
                    C0737d.f4675a.remove(a2.f4713b);
                }
            }
        }
        c0737d.f4678d.mo1108a(a2, i);
    }
}
