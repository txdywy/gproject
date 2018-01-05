package com.google.android.finsky.unauthenticated;

import android.support.v4.app.Fragment;
import android.widget.TextView;
import com.google.android.finsky.p108z.C0978f;
import com.google.android.finsky.p108z.C4809e;
import com.google.android.finsky.utils.FinskyLog;
import com.squareup.leakcanary.C7582R;
import java.util.List;
import java.util.concurrent.ExecutionException;

final /* synthetic */ class C4580h implements C0978f {
    public final C4579g f23404a;
    public final TextView f23405b;

    C4580h(C4579g c4579g, TextView textView) {
        this.f23404a = c4579g;
        this.f23405b = textView;
    }

    public final void mo1172a(C4809e c4809e) {
        Throwable e;
        Fragment fragment = this.f23404a;
        TextView textView = this.f23405b;
        try {
            int size = ((List) c4809e.get()).size();
            if (size == 0) {
                fragment.f23400f.mo4265b(C4574a.m21211a(fragment.af));
                return;
            }
            textView.setText(fragment.m605i().getQuantityString(C7582R.plurals.unauth_updates_cancellation_progress_text, size, new Object[]{Integer.valueOf(size)}));
        } catch (InterruptedException e2) {
            e = e2;
            FinskyLog.m21663b(e, "Error while retrieving InstallStatus for progress", new Object[0]);
        } catch (ExecutionException e3) {
            e = e3;
            FinskyLog.m21663b(e, "Error while retrieving InstallStatus for progress", new Object[0]);
        }
    }
}
