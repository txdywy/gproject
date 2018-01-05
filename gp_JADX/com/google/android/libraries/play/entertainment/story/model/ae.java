package com.google.android.libraries.play.entertainment.story.model;

import android.annotation.TargetApi;
import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

@TargetApi(21)
final class ae extends ViewOutlineProvider {
    public static final ae f30564a = new ae();

    private ae() {
    }

    public final void getOutline(View view, Outline outline) {
        outline.setOval(0, 0, view.getWidth(), view.getHeight());
    }
}
