package com.google.android.finsky.cu;

import android.media.AudioManager.OnAudioFocusChangeListener;

final class C2422h implements OnAudioFocusChangeListener {
    public final /* synthetic */ C2417d f11743a;

    C2422h(C2417d c2417d) {
        this.f11743a = c2417d;
    }

    public final void onAudioFocusChange(int i) {
        this.f11743a.f11734i = i;
    }
}
