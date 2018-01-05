package com.google.android.finsky.stream.controllers;

import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.p111d.ad;
import com.google.android.finsky.playcard.FlatCardViewLiveReengagement;

final /* synthetic */ class bo implements OnClickListener {
    public final bn f21946a;
    public final Document f21947b;
    public final FlatCardViewLiveReengagement f21948c;

    bo(bn bnVar, Document document, FlatCardViewLiveReengagement flatCardViewLiveReengagement) {
        this.f21946a = bnVar;
        this.f21947b = document;
        this.f21948c = flatCardViewLiveReengagement;
    }

    public final void onClick(View view) {
        bn bnVar = this.f21946a;
        Document document = this.f21947b;
        ad adVar = this.f21948c;
        bnVar.f.mo3656a(document, adVar, adVar.getTransitionViews(), bnVar.i);
    }
}
