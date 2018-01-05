package com.google.android.finsky.activities;

import android.net.Uri;
import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.br.C2162a;

final class C1049a implements OnClickListener {
    public final /* synthetic */ String f6437a;
    public final /* synthetic */ AppsPermissionsActivity f6438b;

    C1049a(AppsPermissionsActivity appsPermissionsActivity, String str) {
        this.f6438b = appsPermissionsActivity;
        this.f6437a = str;
    }

    public final void onClick(View view) {
        C2162a bn = C1473m.f7980a.bn();
        bn.mo2698a(this.f6438b, bn.mo2689a(Uri.parse(this.f6437a)));
    }
}
