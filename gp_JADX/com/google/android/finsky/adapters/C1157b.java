package com.google.android.finsky.adapters;

import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.p111d.ad;

final /* synthetic */ class C1157b implements OnClickListener {
    public final CardRecyclerViewAdapter f7152a;
    public final Document f7153b;
    public final ad f7154c;

    C1157b(CardRecyclerViewAdapter cardRecyclerViewAdapter, Document document, ad adVar) {
        this.f7152a = cardRecyclerViewAdapter;
        this.f7153b = document;
        this.f7154c = adVar;
    }

    public final void onClick(View view) {
        CardRecyclerViewAdapter cardRecyclerViewAdapter = this.f7152a;
        cardRecyclerViewAdapter.f7120q.mo3655a(this.f7153b, this.f7154c, cardRecyclerViewAdapter.f7117n);
    }
}
