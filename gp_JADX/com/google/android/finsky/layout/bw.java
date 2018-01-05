package com.google.android.finsky.layout;

import android.accounts.Account;
import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.finsky.C1473m;

final class bw implements OnClickListener {
    public final /* synthetic */ Account f18546a;
    public final /* synthetic */ SongSnippet f18547b;

    bw(SongSnippet songSnippet, Account account) {
        this.f18547b = songSnippet;
        this.f18546a = account;
    }

    public final void onClick(View view) {
        C1473m.f7980a.dc().m13325a(218, null, this.f18547b);
        this.f18547b.f18401o.mo3633a(this.f18546a, this.f18547b.f18400n, false);
    }
}
