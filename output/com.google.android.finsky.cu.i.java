package com.google.android.finsky.cu;

import android.media.MediaPlayer;

public final class com.google.android.finsky.cu.i implements MediaPlayer$OnPreparedListener
{

    public final com.google.android.finsky.cu.d a;

    i(com.google.android.finsky.cu.d p0) {
        this.a = p0;
    }

    public final void onPrepared(MediaPlayer p0) {
        this.a.b.start();
    }

}
