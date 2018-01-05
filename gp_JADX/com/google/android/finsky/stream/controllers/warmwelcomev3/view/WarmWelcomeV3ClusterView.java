package com.google.android.finsky.stream.controllers.warmwelcomev3.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.RelativeLayout;
import com.google.android.finsky.frameworkviews.ae;
import com.google.android.finsky.p111d.C2473o;
import com.google.android.finsky.p111d.C2482j;
import com.google.android.finsky.p111d.ad;
import com.google.android.finsky.providers.C3947d;
import com.google.android.play.image.C1294w;
import com.google.android.play.image.FifeImageView;
import com.google.android.play.image.be;
import com.google.android.play.layout.PlayTextView;
import com.google.android.play.p203b.C3918i;
import com.google.android.play.p203b.C6270j;
import com.google.wireless.android.a.a.a.a.ce;
import com.squareup.leakcanary.C7582R;

public class WarmWelcomeV3ClusterView extends RelativeLayout implements OnClickListener, ad, ae, be {
    public C1294w f23179a;
    public C4529b f23180b;
    public PlayTextView f23181c;
    public PlayTextView f23182d;
    public PlayTextView f23183e;
    public FifeImageView f23184f;
    public ad f23185g;
    public ce f23186h;
    public ad f23187i;
    public C4527a f23188j;

    public WarmWelcomeV3ClusterView(Context context) {
        this(context, null);
    }

    public WarmWelcomeV3ClusterView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public WarmWelcomeV3ClusterView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        getCardViewGroupDelegate().mo3865a(this, context, attributeSet, i);
    }

    protected void onFinishInflate() {
        ((C1445c) C3947d.m18649a(C1445c.class)).mo1961a(this);
        super.onFinishInflate();
        setTag(C7582R.id.accept_page_margin, "");
        this.f23181c = (PlayTextView) findViewById(C7582R.id.welcome_card_title);
        this.f23182d = (PlayTextView) findViewById(C7582R.id.welcome_card_subtitle);
        this.f23183e = (PlayTextView) findViewById(C7582R.id.dismiss_button);
        this.f23184f = (FifeImageView) findViewById(C7582R.id.welcome_card_image);
    }

    public C3918i getCardViewGroupDelegate() {
        return C6270j.f31324a;
    }

    public final void m21115b() {
        if (this.f23184f != null) {
            this.f23184f.setOnLoadedListener(null);
            this.f23184f.a();
            this.f23184f.setVisibility(8);
        }
    }

    public final void Z_() {
        m21115b();
        if (this.f23183e != null) {
            this.f23183e.setOnClickListener(null);
        }
    }

    public final void m21114a(FifeImageView fifeImageView, Bitmap bitmap) {
        if (bitmap.getHeight() != 0) {
            LayoutParams layoutParams = fifeImageView.getLayoutParams();
            layoutParams.width = (layoutParams.height * bitmap.getWidth()) / bitmap.getHeight();
        }
    }

    public final void m21113a(FifeImageView fifeImageView) {
    }

    public void onClick(View view) {
        this.f23188j.mo4257a(this.f23187i);
    }

    public ce getPlayStoreUiElement() {
        if (this.f23186h == null) {
            this.f23186h = C2482j.m13283a(463);
            C2482j.m13285a(this.f23186h, this.f23180b.f23194f);
            this.f23187i = new C2473o(546, null, this);
        }
        return this.f23186h;
    }

    public ad getParentNode() {
        return this.f23185g;
    }

    public final void mo1219a(ad adVar) {
        C2482j.m13291a((ad) this, adVar);
    }
}
