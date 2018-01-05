package com.google.android.finsky.stream.controllers.illustrationassistcard.view;

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

public class IllustrationAssistCardView extends RelativeLayout implements OnClickListener, ad, ae, C3075q {
    public C1294w f22410a;
    public C4556b f22411b;
    public TextView f22412c;
    public TextView f22413d;
    public FifeImageView f22414e;
    public PlayActionButtonV2 f22415f;
    public ImageView f22416g;
    public C4542a f22417h;
    public C4542a f22418i;
    public C4542a f22419j;
    public C4542a f22420k;
    public ad f22421l;
    public ce f22422m;

    public IllustrationAssistCardView(Context context) {
        this(context, null);
    }

    public IllustrationAssistCardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public IllustrationAssistCardView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f22422m = C2482j.m13283a(2832);
        ((C1432b) C3947d.m18649a(C1432b.class)).mo1934a(this);
        getCardViewGroupDelegate().mo3865a(this, context, attributeSet, i);
    }

    protected void onFinishInflate() {
        super.onFinishInflate();
        setTag(C7582R.id.accept_page_margin, "");
        this.f22412c = (TextView) findViewById(C7582R.id.title);
        this.f22413d = (TextView) findViewById(C7582R.id.message);
        this.f22414e = (FifeImageView) findViewById(C7582R.id.icon);
        this.f22414e.setOnClickListener(this);
        this.f22415f = (PlayActionButtonV2) findViewById(C7582R.id.call_to_action);
        this.f22415f.setDrawAsLabel(true);
        this.f22416g = (ImageView) findViewById(C7582R.id.close);
        this.f22416g.setOnClickListener(this);
        this.f22411b.m21180a(getResources(), this.f22416g);
        setOnClickListener(this);
    }

    public final void Z_() {
        if (this.f22414e != null) {
            this.f22414e.a();
        }
        this.f22417h = null;
        this.f22419j = null;
        this.f22418i = null;
        this.f22420k = null;
    }

    public ce getPlayStoreUiElement() {
        return this.f22422m;
    }

    public ad getParentNode() {
        return this.f22421l;
    }

    public final void mo1219a(ad adVar) {
        C2482j.m13291a((ad) this, adVar);
    }

    public C3918i getCardViewGroupDelegate() {
        return C6270j.f31324a;
    }

    public void onClick(View view) {
        if (view == this.f22415f) {
            C4556b.m21178a(this.f22417h, (View) this);
        } else if (view == this.f22416g) {
            C4556b.m21178a(this.f22420k, (View) this);
        } else if (view == this.f22414e) {
            C4556b.m21178a(this.f22419j, (View) this);
        } else {
            C4556b.m21178a(this.f22418i, (View) this);
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
        return this.f22411b.m21179a(getResources());
    }
}
