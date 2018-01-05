package com.google.android.finsky.cu;

import android.media.MediaPlayer;
import android.media.MediaPlayer.OnPreparedListener;

final class C2423i implements OnPreparedListener {
    public final /* synthetic */ C2417d f11744a;

    C2423i(C2417d c2417d) {
        this.f11744a = c2417d;
    }

    public final void onPrepared(MediaPlayer mediaPlayer) {
        this.f11744a.f11727b.start();
    }
}
