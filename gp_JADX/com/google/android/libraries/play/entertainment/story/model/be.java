package com.google.android.libraries.play.entertainment.story.model;

import android.annotation.TargetApi;
import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.google.android.libraries.play.entertainment.C6072e;

@TargetApi(21)
final class be extends ViewOutlineProvider {
    public static final be f30630a = new be();

    private be() {
    }

    public final void getOutline(View view, Outline outline) {
        outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), (float) view.getResources().getDimensionPixelOffset(C6072e.play_card_default_radius));
    }
}
