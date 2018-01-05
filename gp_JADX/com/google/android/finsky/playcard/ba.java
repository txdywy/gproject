package com.google.android.finsky.playcard;

import android.accounts.Account;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.finsky.cv.p177a.hu;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.navigationmanager.C3748a;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p111d.ad;

final class ba implements OnClickListener {
    public final /* synthetic */ FlatCardViewReEngagement f19622a;
    public final /* synthetic */ Document f19623b;
    public final /* synthetic */ ad f19624c;
    public final /* synthetic */ C2495w f19625d;
    public final /* synthetic */ C3748a f19626e;
    public final /* synthetic */ hu f19627f;
    public final /* synthetic */ Account f19628g;
    public final /* synthetic */ az f19629h;

    ba(az azVar, FlatCardViewReEngagement flatCardViewReEngagement, Document document, ad adVar, C2495w c2495w, C3748a c3748a, hu huVar, Account account) {
        this.f19629h = azVar;
        this.f19622a = flatCardViewReEngagement;
        this.f19623b = document;
        this.f19624c = adVar;
        this.f19625d = c2495w;
        this.f19626e = c3748a;
        this.f19627f = huVar;
        this.f19628g = account;
    }

    public final void onClick(View view) {
        this.f19629h.m18529a(this.f19622a, this.f19623b, view, this.f19624c, this.f19625d, this.f19626e);
        Intent a = this.f19629h.f19617a.f19579C.mo2690a(Uri.parse(this.f19627f.f12622b.f12323c), this.f19623b.cf());
        PackageManager packageManager = this.f19622a.getContext().getPackageManager();
        if (packageManager == null || a.resolveActivity(packageManager) == null) {
            this.f19626e.mo3633a(this.f19628g, this.f19623b, false);
        } else {
            this.f19622a.getContext().startActivity(a);
        }
    }
}
