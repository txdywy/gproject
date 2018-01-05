package com.google.android.finsky.activities;

final class fg implements Runnable {
    public final /* synthetic */ ff f6799a;

    fg(ff ffVar) {
        this.f6799a = ffVar;
    }

    public final void run() {
        DebugActivity debugActivity = (DebugActivity) this.f6799a.getActivity();
        if (debugActivity != null) {
            debugActivity.m6047a(true);
        }
    }
}
