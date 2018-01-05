package com.google.android.wallet.instrumentmanager.ui.redirect;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.google.a.a.a.a.b.a.a.h.a.c;
import com.google.android.wallet.analytics.C6494b;
import com.google.android.wallet.analytics.C6496d;
import com.google.android.wallet.analytics.C6504m;
import com.google.android.wallet.clientlog.LogContext;
import com.google.android.wallet.common.p377b.p379b.C6567a;
import com.google.android.wallet.common.util.C6589a;
import com.google.android.wallet.common.util.ParcelableProto;
import com.google.android.wallet.instrumentmanager.redirect.ImStartAndroidAppRedirectActivity;
import com.google.android.wallet.redirect.StartAndroidAppRedirectActivity;
import com.google.android.wallet.ui.p397d.C6678c;
import com.google.protobuf.nano.i;

public final class C6679b extends C6678c implements C6494b, C6496d {
    public final Intent mo5599a(Context context, c cVar, String str, int i, LogContext logContext) {
        byte[] byteArray = this.q.getByteArray("logToken");
        Intent intent = new Intent(context, StartAndroidAppRedirectActivity.class);
        intent.putExtra("startAndroidAppIntent", C6589a.m29893a(cVar, str));
        intent.putExtra("androidAppInfo", ParcelableProto.m29885a((i) cVar));
        intent.putExtra("activityThemeResId", i);
        intent.putExtra("logToken", byteArray);
        intent.putExtra("parentLogContext", logContext);
        intent.setClassName(context.getPackageName(), ImStartAndroidAppRedirectActivity.class.getName());
        return intent;
    }

    public final void mo5470a(Activity activity) {
        super.mo5470a(activity);
        this.ah = this;
        this.ai = this;
    }

    public final void mo5561a(C6504m c6504m, int i) {
        C6567a.m29805a(c6504m, -1, i);
    }

    public final void mo5560a(C6504m c6504m) {
        C6567a.m29805a(c6504m, 1636, 1622);
    }

    public final void mo5478b(C6504m c6504m) {
        C6567a.m29804a(c6504m, -1);
    }

    public final void mo5481c(C6504m c6504m) {
        C6567a.m29804a(c6504m, 1636);
    }
}
