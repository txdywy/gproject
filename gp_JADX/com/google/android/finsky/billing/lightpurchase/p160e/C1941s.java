package com.google.android.finsky.billing.lightpurchase.p160e;

import android.annotation.TargetApi;
import android.content.Context;
import android.hardware.fingerprint.FingerprintManager;
import android.hardware.fingerprint.FingerprintManager.AuthenticationCallback;
import android.hardware.fingerprint.FingerprintManager.AuthenticationResult;
import android.os.CancellationSignal;
import android.support.v4.p030c.p031a.C0282a;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.finsky.aa.C0955b;
import com.google.android.finsky.bg.C1601a;
import com.google.android.finsky.bg.C1621v;
import com.google.android.finsky.billing.p131e.C1817e;
import com.squareup.leakcanary.C7582R;

@TargetApi(23)
public final class C1941s extends AuthenticationCallback {
    public final int f9911a = ((Integer) C0955b.dd.m28964b()).intValue();
    public final FingerprintManager f9912b;
    public final ImageView f9913c;
    public final TextView f9914d;
    public final C1928v f9915e;
    public CancellationSignal f9916f;
    public final C1817e f9917g;
    public boolean f9918h;
    public int f9919i;
    public Runnable f9920j = new C1942t(this);
    public Runnable f9921k = new C1943u(this);

    public C1941s(Context context, ImageView imageView, TextView textView, C1928v c1928v) {
        this.f9912b = (FingerprintManager) context.getSystemService(FingerprintManager.class);
        this.f9913c = imageView;
        this.f9914d = textView;
        this.f9915e = c1928v;
        this.f9917g = new C1817e(C0282a.m1599a(context));
    }

    public final void m10366a() {
        if (this.f9916f != null) {
            this.f9918h = true;
            this.f9916f.cancel();
            this.f9916f = null;
            this.f9914d.removeCallbacks(this.f9920j);
            this.f9914d.removeCallbacks(this.f9921k);
        }
    }

    public final void onAuthenticationError(int i, CharSequence charSequence) {
        if (!this.f9918h) {
            m10364a(charSequence);
            this.f9914d.postDelayed(this.f9920j, 1600);
        }
    }

    public final void onAuthenticationHelp(int i, CharSequence charSequence) {
        m10364a(charSequence);
    }

    public final void onAuthenticationFailed() {
        this.f9919i++;
        int i = C7582R.string.fingerprint_not_recognized;
        if (this.f9919i == 1) {
            i = C7582R.string.fingerprint_failed_first_attempt;
        } else if (this.f9919i == this.f9911a - 1) {
            i = C7582R.string.fingerprint_failed_last_attempt;
        } else if (this.f9919i >= this.f9911a) {
            m10366a();
            this.f9915e.mo2544b();
            return;
        }
        m10364a(this.f9914d.getResources().getString(i));
    }

    public final void onAuthenticationSucceeded(AuthenticationResult authenticationResult) {
        this.f9913c.setImageResource(C7582R.drawable.ic_fp_dialog_successful);
        this.f9914d.setTextColor(this.f9914d.getResources().getColor(C7582R.color.fingerprint_success_color, null));
        m10365a(this.f9914d.getResources().getString(C7582R.string.fingerprint_scan_successful));
        this.f9914d.postDelayed(this.f9921k, 300);
    }

    private final void m10364a(CharSequence charSequence) {
        this.f9913c.setImageResource(C7582R.drawable.ic_fp_dialog_error);
        m10365a(charSequence.toString());
        this.f9914d.setTextColor(this.f9914d.getResources().getColor(C7582R.color.fingerprint_warning_color, null));
        C1621v.m9305a(this.f9914d.getContext(), this.f9914d);
    }

    private final void m10365a(String str) {
        C1601a.m9199a(this.f9914d.getContext(), str, this.f9914d, false);
        this.f9914d.setText(str);
    }
}
