package com.google.android.finsky.stream.controllers.comboassistcard.view;

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

public class ComboAssistCardView extends RelativeLayout implements OnClickListener, ad, ae, C3075q {
    public C1294w f22058a;
    public C4556b f22059b;
    public TextView f22060c;
    public TextView f22061d;
    public TextView f22062e;
    public FifeImageView f22063f;
    public PlayActionButtonV2 f22064g;
    public ImageView f22065h;
    public C4542a f22066i;
    public C4542a f22067j;
    public C4542a f22068k;
    public C4542a f22069l;
    public ad f22070m;
    public ce f22071n;

    public ComboAssistCardView(Context context) {
        this(context, null);
    }

    public ComboAssistCardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ComboAssistCardView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f22071n = C2482j.m13283a(2817);
        ((C1422b) C3947d.m18649a(C1422b.class)).mo1923a(this);
        getCardViewGroupDelegate().mo3865a(this, context, attributeSet, i);
    }

    protected void onFinishInflate() {
        super.onFinishInflate();
        setTag(C7582R.id.accept_page_margin, "");
        this.f22060c = (TextView) findViewById(C7582R.id.title);
        this.f22061d = (TextView) findViewById(C7582R.id.message);
        this.f22062e = (TextView) findViewById(C7582R.id.button_message);
        this.f22063f = (FifeImageView) findViewById(C7582R.id.icon);
        this.f22063f.setOnClickListener(this);
        this.f22064g = (PlayActionButtonV2) findViewById(C7582R.id.call_to_action);
        this.f22064g.setDrawAsLabel(true);
        this.f22065h = (ImageView) findViewById(C7582R.id.close);
        this.f22065h.setOnClickListener(this);
        this.f22059b.m21180a(getResources(), this.f22065h);
        setOnClickListener(this);
    }

    public final void Z_() {
        if (this.f22063f != null) {
            this.f22063f.a();
        }
        this.f22066i = null;
        this.f22068k = null;
        this.f22067j = null;
        this.f22069l = null;
    }

    public ce getPlayStoreUiElement() {
        return this.f22071n;
    }

    public ad getParentNode() {
        return this.f22070m;
    }

    public final void mo1219a(ad adVar) {
        C2482j.m13291a((ad) this, adVar);
    }

    public C3918i getCardViewGroupDelegate() {
        return C6270j.f31324a;
    }

    public void onClick(View view) {
        if (view == this.f22064g) {
            C4556b.m21178a(this.f22066i, (View) this);
        } else if (view == this.f22065h) {
            C4556b.m21178a(this.f22069l, (View) this);
        } else if (view == this.f22063f) {
            C4556b.m21178a(this.f22068k, (View) this);
        } else {
            C4556b.m21178a(this.f22067j, (View) this);
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
        return this.f22059b.m21179a(getResources());
    }
}
