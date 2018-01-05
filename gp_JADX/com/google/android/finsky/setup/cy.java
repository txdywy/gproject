package com.google.android.finsky.setup;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

final class cy implements ServiceConnection {
    public final /* synthetic */ VpaSelectionActivity f20967a;

    cy(VpaSelectionActivity vpaSelectionActivity) {
        this.f20967a = vpaSelectionActivity;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f20967a.f20678D = ((dq) iBinder).f21084a;
        if (this.f20967a.f20684o != null) {
            return;
        }
        if (this.f20967a.f20685p != null) {
            this.f20967a.f20682H.mo3935a(this.f20967a.f20687r, this.f20967a.f20685p, this.f20967a.f20686q);
        } else {
            this.f20967a.f20678D.m19154a(this.f20967a.f20682H, this.f20967a.f20687r);
        }
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        this.f20967a.f20678D = null;
    }
}
