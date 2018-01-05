package com.google.android.finsky.activities;

public final class com.google.android.finsky.activities.fm implements Runnable
{

    public final com.google.android.finsky.activities.fl a;

    fm(com.google.android.finsky.activities.fl p0) {
        this.a = p0;
    }

    public final void run() {
        v0 = this.a.getActivity();
        if ((DebugActivity)v0 != 0)
            ((DebugActivity)v0).a(1);
    }

}
