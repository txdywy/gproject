package com.google.android.libraries.play.entertainment.story;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.libraries.play.entertainment.C2998a;
import com.google.android.libraries.play.entertainment.C6098k;

final class as implements OnClickListener {
    public final /* synthetic */ ar f30430a;

    as(ar arVar) {
        this.f30430a = arVar;
    }

    public final void onClick(View view) {
        try {
            C2998a.m15496l().m15517t();
            this.f30430a.f30406c.startActivity(new Intent().setAction("android.intent.action.VIEW").setData(Uri.parse("https://play.google.com/store/apps/details?id=com.android.chrome")));
        } catch (ActivityNotFoundException e) {
            ar.f30399a.m28058b(null, "Play Store not found.", new Object[0]);
            Snackbar.m499a(this.f30430a.f30408e, C6098k.pe__error_no_play_store, 0).m493a();
        }
    }
}
