package com.google.android.finsky.bc;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.p028a.p029a.C0206f;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.finsky.bg.C1612l;
import com.google.android.finsky.cv.p177a.bd;
import com.google.android.finsky.providers.C3947d;
import com.google.android.play.image.FifeImageView;
import com.squareup.leakcanary.C7582R;

public final class C1583n extends C1574v {
    public C1612l f8401a;
    public boolean f8402c = false;
    public View f8403f;
    public TextView f8404h;

    public final void mo1292a(Activity activity) {
        ((C1347t) C3947d.m18649a(C1347t.class)).mo1718a(this);
        super.mo1292a(activity);
    }

    public final View mo970a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View a = super.mo970a(layoutInflater, viewGroup, bundle);
        FifeImageView fifeImageView = (FifeImageView) a.findViewById(C7582R.id.family_music_purchase_image);
        bd f = this.ag.mo2350f();
        if (f != null) {
            this.f8401a.m9288a(fifeImageView, f.f11860f, f.f11863i);
        }
        m9114a(a, (int) C7582R.id.music_purchase_title, 18);
        m9114a(a, (int) C7582R.id.music_purchase_body, 19);
        this.f8403f = a.findViewById(C7582R.id.try_again_button);
        this.f8403f.setBackgroundColor(C0206f.m1066b(a.getResources(), this.ag.mo2349e().f8378c, null));
        this.f8404h = (TextView) a.findViewById(C7582R.id.try_again_text);
        this.f8404h.setText(m592c((int) C7582R.string.try_again).toUpperCase(m605i().getConfiguration().locale));
        this.f8403f.setOnClickListener(this);
        return a;
    }

    protected final int aj() {
        return C7582R.layout.family_music_purchase;
    }

    public final void onClick(View view) {
        this.aj.setEnabled(false);
        this.ak.setVisibility(0);
        if (this.f8402c && view == this.ai) {
            this.f8404h.setEnabled(false);
            this.ag.mo2348d().m9156b();
            return;
        }
        startActivityForResult((Intent) m603h().getIntent().getParcelableExtra("purchase_intent"), 1);
    }

    protected final void ao() {
    }

    protected final int ap() {
        return 5230;
    }

    public final void mo2342a(int i, int i2, Intent intent) {
        if (i != 1) {
            return;
        }
        if (i2 == -1) {
            this.ag.mo2348d().f8410e = true;
            this.ag.mo2348d().m9156b();
        } else if (i2 == 0) {
            if (!this.f8402c) {
                this.f8402c = true;
                this.f8403f.setVisibility(0);
                m9114a(this.f746R, (int) C7582R.id.music_purchase_body, 21);
            }
            this.ak.setVisibility(8);
        }
    }
}
