package android.support.p010b;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.p028a.C0216d;

public final class C0035i {
    public final Intent f47a;
    public final Bundle f48b;

    public final void m39a(Context context, Uri uri) {
        this.f47a.setData(uri);
        C0216d.m1113a(context, this.f47a, this.f48b);
    }

    C0035i(Intent intent, Bundle bundle) {
        this.f47a = intent;
        this.f48b = bundle;
    }
}
