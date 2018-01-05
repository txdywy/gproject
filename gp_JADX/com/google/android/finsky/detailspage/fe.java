package com.google.android.finsky.detailspage;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.finsky.aa.C0955b;

final class fe implements OnClickListener {
    fe() {
    }

    public final void onClick(View view) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse((String) C0955b.gs.m28964b()));
        view.getContext().startActivity(intent);
    }
}
