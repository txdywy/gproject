package com.google.android.finsky.unauthenticated;

import android.accounts.AccountManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.finsky.p111d.C2475d;
import com.squareup.leakcanary.C7582R;

final class C4577d implements OnClickListener {
    public final /* synthetic */ C4574a f23393a;

    C4577d(C4574a c4574a) {
        this.f23393a = c4574a;
    }

    public final void onClick(View view) {
        this.f23393a.f23387e.m13379b(new C2475d(this.f23393a).m13256a(2948));
        Fragment fragment = this.f23393a;
        Context g = fragment.m601g();
        Bundle bundle = new Bundle();
        bundle.putParcelable("pendingIntent", PendingIntent.getBroadcast(g, 0, new Intent(), 0));
        bundle.putString("introMessage", g.getString(C7582R.string.account_required_external));
        bundle.putBoolean("allowSkip", false);
        AccountManager.get(fragment.m601g()).addAccount("com.google", "androidmarket", null, bundle, null, new C4575b(fragment), null);
    }
}
