package com.google.android.finsky.playcard;

import com.google.android.finsky.bg.C1617r;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.navigationmanager.C3748a;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.play.layout.d;

final class by extends C3901z {
    by() {
    }

    public final /* synthetic */ void mo3861a(d dVar, Document document, C3748a c3748a, C2495w c2495w) {
        int i;
        PlayEditorialNonAppCardView playEditorialNonAppCardView = (PlayEditorialNonAppCardView) dVar;
        super.mo3861a(playEditorialNonAppCardView, document, c3748a, c2495w);
        if (document == null) {
            i = 6;
        } else {
            i = document.f14885a.f12098e;
        }
        playEditorialNonAppCardView.setThumbnailAspectRatio(C1617r.m9292a(i));
    }
}
