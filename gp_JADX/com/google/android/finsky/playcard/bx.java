package com.google.android.finsky.playcard;

import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.navigationmanager.C3748a;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.play.layout.d;
import com.squareup.leakcanary.C7582R;

final class bx extends C3901z {
    bx() {
    }

    public final /* synthetic */ void mo3861a(d dVar, Document document, C3748a c3748a, C2495w c2495w) {
        FlatCardViewPreregistrableGame flatCardViewPreregistrableGame = (FlatCardViewPreregistrableGame) dVar;
        super.mo3861a(flatCardViewPreregistrableGame, document, c3748a, c2495w);
        flatCardViewPreregistrableGame.a((float) flatCardViewPreregistrableGame.getResources().getDimensionPixelSize(C7582R.dimen.flat_mini_card_title_size));
        flatCardViewPreregistrableGame.setPreregGiftBoxEnabled(document.aN());
        if (document.cC()) {
            CharSequence charSequence;
            if (document.cC()) {
                charSequence = document.f14885a.f12115v.f13119Z;
            } else {
                charSequence = null;
            }
            flatCardViewPreregistrableGame.f19398c.setText(charSequence);
        }
    }
}
