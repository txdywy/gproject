package com.google.android.finsky.p148b;

import android.os.RemoteException;
import android.view.MotionEvent;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.gms.dynamic.C5164d;

final class C1547k implements Runnable {
    public final /* synthetic */ MotionEvent f8313a;
    public final /* synthetic */ C1546j f8314b;

    C1547k(C1546j c1546j, MotionEvent motionEvent) {
        this.f8314b = c1546j;
        this.f8313a = motionEvent;
    }

    public final void run() {
        if (this.f8314b.f8312a.m12120a()) {
            try {
                this.f8314b.f8312a.f11713a.f25238a.mo4878d(C5164d.m23906a(this.f8313a));
            } catch (RemoteException e) {
                FinskyLog.m21667d("Error accessing AdShield: %s", e);
            }
        }
    }
}
