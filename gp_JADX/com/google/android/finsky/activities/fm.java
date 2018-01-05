package com.google.android.finsky.activities;

final class fm implements Runnable {
    public final /* synthetic */ fl f6816a;

    fm(fl flVar) {
        this.f6816a = flVar;
    }

    public final void run() {
        DebugActivity debugActivity = (DebugActivity) this.f6816a.getActivity();
        if (debugActivity != null) {
            debugActivity.m6047a(true);
        }
    }
}
