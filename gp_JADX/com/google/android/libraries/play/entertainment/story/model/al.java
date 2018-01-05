package com.google.android.libraries.play.entertainment.story.model;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.view.View.OnClickListener;

final class al implements OnClickListener {
    public final /* synthetic */ String f30579a;

    al(String str) {
        this.f30579a = str;
    }

    public final void onClick(View view) {
        view.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(this.f30579a)));
    }
}
