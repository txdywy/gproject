package android.support.v4.app;

import android.content.Context;
import android.os.Bundle;
import android.view.View;

final class C0252r extends C0235y {
    public final /* synthetic */ Fragment f1589a;

    C0252r(Fragment fragment) {
        this.f1589a = fragment;
    }

    public final View mo279a(int i) {
        if (this.f1589a.f746R != null) {
            return this.f1589a.f746R.findViewById(i);
        }
        throw new IllegalStateException("Fragment does not have a view");
    }

    public final boolean mo280a() {
        return this.f1589a.f746R != null;
    }

    public final Fragment mo341a(Context context, String str, Bundle bundle) {
        return this.f1589a.f731C.mo341a(context, str, bundle);
    }
}
