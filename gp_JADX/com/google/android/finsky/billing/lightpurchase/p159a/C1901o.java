package com.google.android.finsky.billing.lightpurchase.p159a;

import android.os.Bundle;
import android.text.Html;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import com.google.android.finsky.bg.C1601a;
import com.google.android.finsky.bg.ae;
import com.google.android.finsky.billing.common.C1792g;
import com.google.android.finsky.frameworkviews.PlayActionButtonV2;
import com.google.android.finsky.utils.C4677h;
import com.google.android.finsky.utils.ParcelableProto;
import com.google.wireless.android.finsky.a.a.ag;
import com.squareup.leakcanary.C7582R;

public final class C1901o extends C1792g implements OnClickListener {
    public ag f9712e;
    public EditText f9713f;
    public View f9714g;
    public PlayActionButtonV2 f9715h;
    public PlayActionButtonV2 f9716i;

    public final void mo136b(Bundle bundle) {
        super.mo136b(bundle);
        this.f9712e = (ag) ParcelableProto.m21673a(this.f760q, "SmsCodeFragment.challenge");
    }

    public final View mo970a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f9714g = layoutInflater.inflate(C7582R.layout.age_verification_sms_code_fragment, viewGroup, false);
        TextView textView = (TextView) this.f9714g.findViewById(C7582R.id.title);
        if (TextUtils.isEmpty(this.f9712e.b)) {
            throw new IllegalStateException("No title returned");
        }
        textView.setText(this.f9712e.b);
        textView = (TextView) this.f9714g.findViewById(C7582R.id.description);
        if (TextUtils.isEmpty(this.f9712e.c)) {
            textView.setVisibility(8);
        } else {
            textView.setText(Html.fromHtml(this.f9712e.c));
        }
        this.f9713f = (EditText) this.f9714g.findViewById(C7582R.id.code_entry);
        ae.m9215a(m603h(), this.f9713f, 6, 6);
        if (this.f9712e.d != null) {
            if (!TextUtils.isEmpty(this.f9712e.d.d)) {
                this.f9713f.setHint(this.f9712e.d.d);
            }
            if (!TextUtils.isEmpty(this.f9712e.d.c)) {
                this.f9713f.setText(this.f9712e.d.c);
            }
            this.f9713f.addTextChangedListener(new C1902p(this));
            textView = (TextView) this.f9714g.findViewById(C7582R.id.error);
            if (TextUtils.isEmpty(this.f9712e.d.e)) {
                textView.setVisibility(8);
            } else {
                textView.setText(this.f9712e.d.e);
            }
            int i = this.f760q.getInt("SmsCodeFragment.backend");
            this.f9716i = (PlayActionButtonV2) this.f9714g.findViewById(C7582R.id.positive_button);
            if (this.f9712e.f == null || TextUtils.isEmpty(this.f9712e.f.b)) {
                throw new IllegalStateException("No submit button returned.");
            }
            this.f9716i.mo2588a(i, this.f9712e.f.b, (OnClickListener) this);
            this.f9715h = (PlayActionButtonV2) this.f9714g.findViewById(C7582R.id.negative_button);
            if (this.f9712e.e == null || TextUtils.isEmpty(this.f9712e.e.b)) {
                this.f9715h.setVisibility(8);
            } else {
                this.f9715h.mo2588a(i, this.f9712e.e.b, (OnClickListener) this);
            }
            m10141X();
            return this.f9714g;
        }
        throw new IllegalStateException("No SMS code field returned.");
    }

    public final void mo979u() {
        super.mo979u();
        C1601a.m9199a(this.f9714g.getContext(), this.f9712e.b, this.f9714g, false);
    }

    final void m10141X() {
        this.f9716i.setEnabled(!C4677h.m21811a(this.f9713f.getText()));
    }

    private final C1894q m10139Y() {
        if (this.f761r instanceof C1894q) {
            return (C1894q) this.f761r;
        }
        if (this.f734F instanceof C1894q) {
            return (C1894q) this.f734F;
        }
        if (m603h() instanceof C1894q) {
            return (C1894q) m603h();
        }
        throw new IllegalStateException("No listener registered.");
    }

    protected final int mo968W() {
        return 1403;
    }

    public final void onClick(View view) {
        if (view == this.f9715h) {
            m9758a(1405);
            m10139Y().mo2506a(this.f9712e.e.c);
        } else if (view == this.f9716i) {
            m9758a(1408);
            m10139Y().mo2507a(this.f9712e.f.c, this.f9712e.d.f, this.f9713f.getText().toString());
        }
    }
}
