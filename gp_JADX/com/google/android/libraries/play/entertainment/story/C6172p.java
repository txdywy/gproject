package com.google.android.libraries.play.entertainment.story;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.view.View.OnClickListener;

final class C6172p implements OnClickListener {
    public final /* synthetic */ String f30685a;

    C6172p(String str) {
        this.f30685a = str;
    }

    public final void onClick(View view) {
        view.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(this.f30685a)));
    }
}
