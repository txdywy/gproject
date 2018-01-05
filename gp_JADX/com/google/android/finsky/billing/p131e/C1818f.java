package com.google.android.finsky.billing.p131e;

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
import com.squareup.leakcanary.C7582R;

@TargetApi(23)
public final class C1818f extends AuthenticationCallback {
    public final int f9379a = ((Integer) C0955b.dd.m28964b()).intValue();
    public final FingerprintManager f9380b;
    public final ImageView f9381c;
    public final TextView f9382d;
    public final C1673i f9383e;
    public CancellationSignal f9384f;
    public final C1817e f9385g;
    public boolean f9386h;
    public int f9387i;
    public Runnable f9388j = new C1819g(this);
    public Runnable f9389k = new C1820h(this);

    public C1818f(Context context, ImageView imageView, TextView textView, C1673i c1673i) {
        this.f9380b = (FingerprintManager) context.getSystemService(FingerprintManager.class);
        this.f9381c = imageView;
        this.f9382d = textView;
        this.f9383e = c1673i;
        this.f9385g = new C1817e(C0282a.m1599a(context));
    }

    public final void m9829a() {
        if (this.f9384f != null) {
            this.f9386h = true;
            this.f9384f.cancel();
            this.f9384f = null;
            this.f9382d.removeCallbacks(this.f9388j);
            this.f9382d.removeCallbacks(this.f9389k);
        }
    }

    public final void onAuthenticationError(int i, CharSequence charSequence) {
        if (!this.f9386h) {
            m9827a(charSequence);
            this.f9382d.postDelayed(this.f9388j, 1600);
        }
    }

    public final void onAuthenticationHelp(int i, CharSequence charSequence) {
        m9827a(charSequence);
    }

    public final void onAuthenticationFailed() {
        this.f9387i++;
        int i = C7582R.string.fingerprint_not_recognized;
        if (this.f9387i == 1) {
            i = C7582R.string.fingerprint_failed_first_attempt;
        } else if (this.f9387i == this.f9379a - 1) {
            i = C7582R.string.fingerprint_failed_last_attempt;
        } else if (this.f9387i >= this.f9379a) {
            m9829a();
            this.f9383e.mo2382b();
            return;
        }
        m9827a(this.f9382d.getResources().getString(i));
    }

    public final void onAuthenticationSucceeded(AuthenticationResult authenticationResult) {
        this.f9381c.setImageResource(C7582R.drawable.ic_fp_dialog_successful);
        this.f9382d.setTextColor(this.f9382d.getResources().getColor(C7582R.color.fingerprint_success_color, null));
        m9828a(this.f9382d.getResources().getString(C7582R.string.fingerprint_scan_successful));
        this.f9382d.postDelayed(this.f9389k, 300);
    }

    private final void m9827a(CharSequence charSequence) {
        this.f9381c.setImageResource(C7582R.drawable.ic_fp_dialog_error);
        m9828a(charSequence.toString());
        this.f9382d.setTextColor(this.f9382d.getResources().getColor(C7582R.color.fingerprint_warning_color, null));
        C1621v.m9305a(this.f9382d.getContext(), this.f9382d);
    }

    private final void m9828a(String str) {
        C1601a.m9199a(this.f9382d.getContext(), str, this.f9382d, false);
        this.f9382d.setText(str);
    }
}
