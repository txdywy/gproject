package com.google.android.finsky.cu;

import android.media.MediaPlayer;

public final class com.google.android.finsky.cu.j implements MediaPlayer$OnCompletionListener
{

    public final com.google.android.finsky.cu.d a;

    j(com.google.android.finsky.cu.d p0) {
        this.a = p0;
    }

    public final void onCompletion(MediaPlayer p0) {
        this.a.a.c();
        if (this.a.c())
            this.a.b.a = 10;
    }

}
