package com.google.android.finsky.stream.controllers.ctaassistcard.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.finsky.frameworkviews.C3075q;
import com.google.android.finsky.frameworkviews.PlayActionButtonV2;
import com.google.android.finsky.frameworkviews.ae;
import com.google.android.finsky.p111d.C2482j;
import com.google.android.finsky.p111d.ad;
import com.google.android.finsky.providers.C3947d;
import com.google.android.finsky.stream.myapps.view.C4542a;
import com.google.android.finsky.stream.myapps.view.C4556b;
import com.google.android.play.image.C1294w;
import com.google.android.play.image.FifeImageView;
import com.google.android.play.p203b.C3918i;
import com.google.android.play.p203b.C6270j;
import com.google.wireless.android.a.a.a.a.ce;
import com.squareup.leakcanary.C7582R;

public class CtaAssistCardView extends RelativeLayout implements OnClickListener, ad, ae, C3075q {
    public C1294w f22141a;
    public C4556b f22142b;
    public TextView f22143c;
    public TextView f22144d;
    public FifeImageView f22145e;
    public PlayActionButtonV2 f22146f;
    public ImageView f22147g;
    public C4542a f22148h;
    public C4542a f22149i;
    public C4542a f22150j;
    public C4542a f22151k;
    public ad f22152l;
    public ce f22153m;

    public CtaAssistCardView(Context context) {
        this(context, null);
    }

    public CtaAssistCardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CtaAssistCardView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f22153m = C2482j.m13283a(2835);
        ((C1425b) C3947d.m18649a(C1425b.class)).mo1926a(this);
        getCardViewGroupDelegate().mo3865a(this, context, attributeSet, i);
    }

    protected void onFinishInflate() {
        super.onFinishInflate();
        setTag(C7582R.id.accept_page_margin, "");
        this.f22143c = (TextView) findViewById(C7582R.id.title);
        this.f22144d = (TextView) findViewById(C7582R.id.button_message);
        this.f22145e = (FifeImageView) findViewById(C7582R.id.icon);
        this.f22145e.setOnClickListener(this);
        this.f22146f = (PlayActionButtonV2) findViewById(C7582R.id.call_to_action);
        this.f22146f.setDrawAsLabel(true);
        this.f22147g = (ImageView) findViewById(C7582R.id.close);
        this.f22147g.setOnClickListener(this);
        this.f22142b.m21180a(getResources(), this.f22147g);
        setOnClickListener(this);
    }

    public final void Z_() {
        if (this.f22145e != null) {
            this.f22145e.a();
        }
        this.f22148h = null;
        this.f22149i = null;
        this.f22150j = null;
        this.f22151k = null;
    }

    public ce getPlayStoreUiElement() {
        return this.f22153m;
    }

    public ad getParentNode() {
        return this.f22152l;
    }

    public final void mo1219a(ad adVar) {
        C2482j.m13291a((ad) this, adVar);
    }

    public C3918i getCardViewGroupDelegate() {
        return C6270j.f31324a;
    }

    public void onClick(View view) {
        if (view == this.f22146f) {
            C4556b.m21178a(this.f22148h, (View) this);
        } else if (view == this.f22147g) {
            C4556b.m21178a(this.f22151k, (View) this);
        } else if (view == this.f22145e) {
            C4556b.m21178a(this.f22150j, (View) this);
        } else {
            C4556b.m21178a(this.f22149i, (View) this);
        }
    }

    public final boolean ap_() {
        return true;
    }

    public final boolean aq_() {
        return true;
    }

    public int getDividerSize() {
        return 0;
    }

    public int getSectionBottomSpacerSize() {
        return this.f22142b.m21179a(getResources());
    }
}
