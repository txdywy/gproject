package com.google.android.finsky.stream.controllers.contentassistcard.view;

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

public class ContentAssistCardView extends RelativeLayout implements OnClickListener, ad, ae, C3075q {
    public C1294w f22114a;
    public C4556b f22115b;
    public TextView f22116c;
    public TextView f22117d;
    public FifeImageView f22118e;
    public PlayActionButtonV2 f22119f;
    public ImageView f22120g;
    public C4542a f22121h;
    public C4542a f22122i;
    public C4542a f22123j;
    public C4542a f22124k;
    public ad f22125l;
    public ce f22126m;

    public ContentAssistCardView(Context context) {
        this(context, null);
    }

    public ContentAssistCardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ContentAssistCardView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f22126m = C2482j.m13283a(2837);
        ((C1424b) C3947d.m18649a(C1424b.class)).mo1925a(this);
        getCardViewGroupDelegate().mo3865a(this, context, attributeSet, i);
    }

    protected void onFinishInflate() {
        super.onFinishInflate();
        setTag(C7582R.id.accept_page_margin, "");
        this.f22116c = (TextView) findViewById(C7582R.id.title);
        this.f22117d = (TextView) findViewById(C7582R.id.message);
        this.f22118e = (FifeImageView) findViewById(C7582R.id.icon);
        this.f22118e.setOnClickListener(this);
        this.f22119f = (PlayActionButtonV2) findViewById(C7582R.id.call_to_action);
        this.f22119f.setDrawAsLabel(true);
        this.f22120g = (ImageView) findViewById(C7582R.id.close);
        this.f22120g.setOnClickListener(this);
        this.f22115b.m21180a(getResources(), this.f22120g);
        setOnClickListener(this);
    }

    public final void Z_() {
        if (this.f22118e != null) {
            this.f22118e.a();
        }
        this.f22121h = null;
        this.f22123j = null;
        this.f22122i = null;
        this.f22124k = null;
    }

    public ce getPlayStoreUiElement() {
        return this.f22126m;
    }

    public ad getParentNode() {
        return this.f22125l;
    }

    public final void mo1219a(ad adVar) {
        C2482j.m13291a((ad) this, adVar);
    }

    public C3918i getCardViewGroupDelegate() {
        return C6270j.f31324a;
    }

    public void onClick(View view) {
        if (view == this.f22119f) {
            C4556b.m21178a(this.f22121h, (View) this);
        } else if (view == this.f22120g) {
            C4556b.m21178a(this.f22124k, (View) this);
        } else if (view == this.f22118e) {
            C4556b.m21178a(this.f22123j, (View) this);
        } else {
            C4556b.m21178a(this.f22122i, (View) this);
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
        return this.f22115b.m21179a(getResources());
    }
}
