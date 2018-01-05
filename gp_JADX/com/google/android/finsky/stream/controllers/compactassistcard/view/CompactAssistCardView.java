package com.google.android.finsky.stream.controllers.compactassistcard.view;

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

public class CompactAssistCardView extends RelativeLayout implements OnClickListener, ad, ae, C3075q {
    public C1294w f22087a;
    public C4556b f22088b;
    public TextView f22089c;
    public TextView f22090d;
    public FifeImageView f22091e;
    public PlayActionButtonV2 f22092f;
    public ImageView f22093g;
    public C4542a f22094h;
    public C4542a f22095i;
    public C4542a f22096j;
    public C4542a f22097k;
    public ad f22098l;
    public ce f22099m;

    public CompactAssistCardView(Context context) {
        this(context, null);
    }

    public CompactAssistCardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CompactAssistCardView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f22099m = C2482j.m13283a(2845);
        ((C1423b) C3947d.m18649a(C1423b.class)).mo1924a(this);
        getCardViewGroupDelegate().mo3865a(this, context, attributeSet, i);
    }

    protected void onFinishInflate() {
        super.onFinishInflate();
        setTag(C7582R.id.accept_page_margin, "");
        this.f22089c = (TextView) findViewById(C7582R.id.title);
        this.f22090d = (TextView) findViewById(C7582R.id.message);
        this.f22091e = (FifeImageView) findViewById(C7582R.id.icon);
        this.f22091e.setOnClickListener(this);
        this.f22092f = (PlayActionButtonV2) findViewById(C7582R.id.call_to_action);
        this.f22092f.setDrawAsLabel(false);
        this.f22092f.setActionStyle(2);
        this.f22093g = (ImageView) findViewById(C7582R.id.close);
        this.f22093g.setOnClickListener(this);
        this.f22088b.m21180a(getResources(), this.f22093g);
        setOnClickListener(this);
    }

    public final void Z_() {
        if (this.f22091e != null) {
            this.f22091e.a();
        }
        this.f22094h = null;
        this.f22096j = null;
        this.f22095i = null;
        this.f22097k = null;
    }

    public ce getPlayStoreUiElement() {
        return this.f22099m;
    }

    public ad getParentNode() {
        return this.f22098l;
    }

    public final void mo1219a(ad adVar) {
        C2482j.m13291a((ad) this, adVar);
    }

    public C3918i getCardViewGroupDelegate() {
        return C6270j.f31324a;
    }

    public void onClick(View view) {
        if (view == this.f22092f) {
            C4556b.m21178a(this.f22094h, (View) this);
        } else if (view == this.f22093g) {
            C4556b.m21178a(this.f22097k, (View) this);
        } else if (view == this.f22091e) {
            C4556b.m21178a(this.f22096j, (View) this);
        } else {
            C4556b.m21178a(this.f22095i, (View) this);
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
        return this.f22088b.m21179a(getResources());
    }
}
