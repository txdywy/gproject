package com.google.android.libraries.play.entertainment.story.model;

import android.content.Context;
import com.google.android.libraries.play.entertainment.C6072e;
import com.google.android.libraries.play.entertainment.C6098k;

final class C6158n extends C6150g {
    C6158n() {
        super();
    }

    final /* synthetic */ int mo5338c(bb bbVar) {
        if (((C6144a) bbVar).f30548b.g == 1) {
            return C6098k.pe__content_description_game;
        }
        return C6098k.pe__content_description_app;
    }

    final /* synthetic */ String mo5340a(Context context, bb bbVar) {
        C6144a c6144a = (C6144a) bbVar;
        if (c6144a.m28353b() && c6144a.m28354c().f30551c == 3) {
            return "";
        }
        return "=b" + context.getResources().getDimensionPixelSize(C6072e.play_featured_grid_image_margin) + "-c0xffffffff";
    }
}
