package com.google.android.play.search;

import android.support.v7.widget.LinearLayoutManager;
import android.view.View;

final class C6430x extends LinearLayoutManager {
    public final /* synthetic */ PlaySearchSuggestionsList f32386a;

    C6430x(PlaySearchSuggestionsList playSearchSuggestionsList) {
        this.f32386a = playSearchSuggestionsList;
    }

    public final View m29458a(View view, int i) {
        return (i == 130 && view.getParent() == this.f32386a.f32320d && C6430x.a(view) >= r() - 1) ? view : super.a(view, i);
    }
}
