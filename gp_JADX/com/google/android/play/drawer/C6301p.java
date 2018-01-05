package com.google.android.play.drawer;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;

final class C6301p implements OnItemClickListener {
    C6301p() {
    }

    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        if (view instanceof PlayDrawerProfileInfoView) {
            ((PlayDrawerProfileInfoView) view).f31399j.performClick();
        } else {
            view.callOnClick();
        }
    }
}
