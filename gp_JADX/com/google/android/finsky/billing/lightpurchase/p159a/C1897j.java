package com.google.android.finsky.billing.lightpurchase.p159a;

import android.os.Bundle;
import android.text.Html;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.finsky.bg.C1601a;
import com.google.android.finsky.billing.common.C1792g;
import com.google.android.finsky.frameworkviews.PlayActionButtonV2;
import com.google.android.finsky.utils.ParcelableProto;
import com.google.wireless.android.finsky.a.a.n;
import com.squareup.leakcanary.C7582R;

public final class C1897j extends C1792g implements OnClickListener {
    public n f9706e;
    public View f9707f;
    public PlayActionButtonV2 f9708g;
    public PlayActionButtonV2 f9709h;

    public final void mo136b(Bundle bundle) {
        super.mo136b(bundle);
        this.f9706e = (n) ParcelableProto.m21673a(this.f760q, "ChallengeErrorFragment.challenge");
    }

    public final View mo970a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f9707f = layoutInflater.inflate(C7582R.layout.age_verification_error_fragment, viewGroup, false);
        TextView textView = (TextView) this.f9707f.findViewById(C7582R.id.title);
        if (TextUtils.isEmpty(this.f9706e.b)) {
            throw new IllegalStateException("No title returned.");
        }
        textView.setText(this.f9706e.b);
        textView = (TextView) this.f9707f.findViewById(C7582R.id.message);
        if (TextUtils.isEmpty(this.f9706e.c)) {
            textView.setVisibility(8);
        } else {
            textView.setText(Html.fromHtml(this.f9706e.c));
        }
        int i = this.f760q.getInt("ChallengeErrorFragment.backend");
        this.f9709h = (PlayActionButtonV2) this.f9707f.findViewById(C7582R.id.positive_button);
        if (this.f9706e.d == null || TextUtils.isEmpty(this.f9706e.d.b)) {
            throw new IllegalStateException("No submit button returned.");
        }
        this.f9709h.mo2588a(i, this.f9706e.d.b, (OnClickListener) this);
        this.f9708g = (PlayActionButtonV2) this.f9707f.findViewById(C7582R.id.negative_button);
        if (this.f9706e.e == null || TextUtils.isEmpty(this.f9706e.e.b)) {
            this.f9708g.setVisibility(8);
        } else {
            this.f9708g.mo2588a(i, this.f9706e.e.b, (OnClickListener) this);
        }
        return this.f9707f;
    }

    public final void mo979u() {
        super.mo979u();
        C1601a.m9199a(this.f9707f.getContext(), this.f9706e.b, this.f9707f, false);
    }

    private final C1893k m10132X() {
        if (this.f761r instanceof C1893k) {
            return (C1893k) this.f761r;
        }
        if (this.f734F instanceof C1893k) {
            return (C1893k) this.f734F;
        }
        if (m603h() instanceof C1893k) {
            return (C1893k) m603h();
        }
        throw new IllegalStateException("No listener registered.");
    }

    protected final int mo968W() {
        return 1406;
    }

    public final void onClick(View view) {
        if (view == this.f9709h) {
            m9758a(1407);
            if (this.f9706e.d.d) {
                m10132X().mo968W();
            } else if (this.f9706e.d.e.length == 1) {
                m10132X().mo2505a(this.f9706e.d.e[0]);
            } else {
                throw new IllegalStateException("Unexpected submit button action.");
            }
        } else if (view == this.f9708g) {
            m9758a(1409);
            if (this.f9706e.e.d) {
                m10132X().mo968W();
                return;
            }
            throw new IllegalStateException("Unexpected cancel button action.");
        }
    }
}
