package com.google.android.finsky.cu;

public final class com.google.android.finsky.cu.h implements AudioManager$OnAudioFocusChangeListener
{

    public final com.google.android.finsky.cu.d a;

    h(com.google.android.finsky.cu.d p0) {
        this.a = p0;
    }

    public final void onAudioFocusChange(int p0) {
        this.a.i = p0;
    }

}
