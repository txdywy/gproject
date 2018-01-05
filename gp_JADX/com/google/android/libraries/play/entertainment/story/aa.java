package com.google.android.libraries.play.entertainment.story;

import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.fe;
import android.view.View;
import com.google.android.libraries.play.entertainment.p351m.C6116b;

final class aa extends fe {
    public final /* synthetic */ ParallaxContainer f30374a;

    aa(ParallaxContainer parallaxContainer) {
        this.f30374a = parallaxContainer;
    }

    public final void mo791a(RecyclerView recyclerView, int i, int i2) {
        if (recyclerView == this.f30374a.f30344c) {
            ParallaxContainer parallaxContainer = this.f30374a;
            parallaxContainer.m28174a(((float) ((View) C6116b.m28100a(parallaxContainer.f30343b)).getTop()) * (-parallaxContainer.f30347f));
        }
    }
}
