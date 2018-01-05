package com.google.android.finsky.billing.e;

import android.content.Context;
import android.content.res.Resources;
import android.hardware.fingerprint.FingerprintManager;
import android.hardware.fingerprint.FingerprintManager$AuthenticationCallback;
import android.hardware.fingerprint.FingerprintManager$AuthenticationResult;
import android.os.CancellationSignal;
import android.support.v4.c.a.a;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.finsky.aa.b;
import com.google.android.finsky.bg.a;
import com.google.android.finsky.bg.v;
import com.google.android.play.utils.b.a;

public final class com.google.android.finsky.billing.e.f extends FingerprintManager$AuthenticationCallback
{

    public final int a;
    public final FingerprintManager b;
    public final ImageView c;
    public final TextView d;
    public final com.google.android.finsky.billing.e.i e;
    public CancellationSignal f;
    public final com.google.android.finsky.billing.e.e g;
    public boolean h;
    public int i;
    public Runnable j;
    public Runnable k;

    f(Context p0, ImageView p1, TextView p2, com.google.android.finsky.billing.e.i p3) {
        FingerprintManager$AuthenticationCallback();
        this.a = ((Integer)com.google.android.finsky.aa.b.dd.b()).intValue();
        this.j = new com.google.android.finsky.billing.e.g(this);
        this.k = new com.google.android.finsky.billing.e.h(this);
        this.b = (FingerprintManager)p0.getSystemService(FingerprintManager);
        this.c = p1;
        this.d = p2;
        this.e = p3;
        this.g = new com.google.android.finsky.billing.e.e(android.support.v4.c.a.a.a(p0));
    }

    private final void a(CharSequence p0) {
        this.c.setImageResource(2130837714);
        this.a(p0.toString());
        this.d.setTextColor(this.d.getResources().getColor(2131558505, 0));
        com.google.android.finsky.bg.v.a(this.d.getContext(), this.d);
    }

    private final void a(String p0) {
        com.google.android.finsky.bg.a.a(this.d.getContext(), p0, this.d, 0);
        this.d.setText(p0);
    }

    public final void a() {
        if (this.f != 0) {
            this.h = 1;
            this.f.cancel();
            this.f = 0;
            this.d.removeCallbacks(this.j);
            this.d.removeCallbacks(this.k);
        }
    }

    public final void onAuthenticationError(int p0, CharSequence p1) {
        if (this.h == 0) {
            this.a(p1);
            this.d.postDelayed(this.j, 1600);
        }
    }

    public final void onAuthenticationFailed() {
        this.i = this.i + 1;
        v0 = 2131952196;
        if (this.i == 1)
            v0 = 2131952192;
        else {
            if (this.i != this.a - 1) {
                if (this.i < this.a) {
                    this.a(this.d.getResources().getString(v0));
                    return;
                }
                this.a();
                this.e.b();
                return;
            }
            v0 = 2131952193;
        }
        this.a(this.d.getResources().getString(v0));
    }

    public final void onAuthenticationHelp(int p0, CharSequence p1) {
        this.a(p1);
    }

    public final void onAuthenticationSucceeded(FingerprintManager$AuthenticationResult p0) {
        this.c.setImageResource(2130837716);
        this.d.setTextColor(this.d.getResources().getColor(2131558504, 0));
        this.a(this.d.getResources().getString(2131952198));
        this.d.postDelayed(this.k, 300);
    }

}
