package com.google.android.finsky.cu;

import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;

final class C2424j implements OnCompletionListener {
    public final /* synthetic */ C2417d f11745a;

    C2424j(C2417d c2417d) {
        this.f11745a = c2417d;
    }

    public final void onCompletion(MediaPlayer mediaPlayer) {
        this.f11745a.f11726a.mo2904c();
        if (this.f11745a.m12131c()) {
            this.f11745a.f11727b.f11717a = 10;
        }
    }
}
