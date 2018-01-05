package com.google.android.youtube.player.internal;

import android.os.IBinder;

public final class ac extends C6831f {
    public final /* synthetic */ C6850x f33839a;

    protected ac(C6850x c6850x) {
        this.f33839a = c6850x;
    }

    public final void mo5674a(String str, IBinder iBinder) {
        this.f33839a.f33866f.sendMessage(this.f33839a.f33866f.obtainMessage(1, new ab(this.f33839a, str, iBinder)));
    }
}
