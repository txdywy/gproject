package com.google.android.finsky.layout;

import android.accounts.Account;
import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.finsky.C1473m;

final class ai implements OnClickListener {
    public final /* synthetic */ Account f18485a;
    public final /* synthetic */ ExtrasItemSnippet f18486b;

    ai(ExtrasItemSnippet extrasItemSnippet, Account account) {
        this.f18486b = extrasItemSnippet;
        this.f18485a = account;
    }

    public final void onClick(View view) {
        C1473m.f7980a.dc().m13325a(218, null, this.f18486b.f18203n);
        this.f18486b.f18201l.mo3633a(this.f18485a, this.f18486b.f18197h, false);
    }
}
