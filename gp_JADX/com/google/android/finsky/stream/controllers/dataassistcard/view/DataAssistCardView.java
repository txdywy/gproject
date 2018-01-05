package com.google.android.finsky.stream.controllers.dataassistcard.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.ProgressBar;
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
import com.google.android.play.p203b.C3918i;
import com.google.android.play.p203b.C6270j;
import com.google.wireless.android.a.a.a.a.ce;
import com.squareup.leakcanary.C7582R;

public class DataAssistCardView extends RelativeLayout implements OnClickListener, ad, ae, C3075q {
    public C4556b f22196a;
    public TextView f22197b;
    public TextView f22198c;
    public TextView f22199d;
    public TextView f22200e;
    public ProgressBar f22201f;
    public PlayActionButtonV2 f22202g;
    public ImageView f22203h;
    public C4542a f22204i;
    public C4542a f22205j;
    public C4542a f22206k;
    public ad f22207l;
    public ce f22208m;

    public DataAssistCardView(Context context) {
        this(context, null);
    }

    public DataAssistCardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public DataAssistCardView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f22208m = C2482j.m13283a(2836);
        ((C1427b) C3947d.m18649a(C1427b.class)).mo1928a(this);
        getCardViewGroupDelegate().mo3865a(this, context, attributeSet, i);
    }

    protected void onFinishInflate() {
        super.onFinishInflate();
        setTag(C7582R.id.accept_page_margin, "");
        this.f22197b = (TextView) findViewById(C7582R.id.title);
        this.f22198c = (TextView) findViewById(C7582R.id.message);
        this.f22199d = (TextView) findViewById(C7582R.id.quantity_top_line);
        this.f22200e = (TextView) findViewById(C7582R.id.quantity_bottom_line);
        this.f22201f = (ProgressBar) findViewById(C7582R.id.progress_ring);
        this.f22202g = (PlayActionButtonV2) findViewById(C7582R.id.call_to_action);
        this.f22202g.setDrawAsLabel(true);
        this.f22203h = (ImageView) findViewById(C7582R.id.close);
        this.f22203h.setOnClickListener(this);
        this.f22196a.m21180a(getResources(), this.f22203h);
        setOnClickListener(this);
    }

    public final void Z_() {
        this.f22204i = null;
        this.f22205j = null;
        this.f22206k = null;
    }

    public ce getPlayStoreUiElement() {
        return this.f22208m;
    }

    public ad getParentNode() {
        return this.f22207l;
    }

    public final void mo1219a(ad adVar) {
        C2482j.m13291a((ad) this, adVar);
    }

    public C3918i getCardViewGroupDelegate() {
        return C6270j.f31324a;
    }

    public void onClick(View view) {
        if (view == this.f22202g) {
            C4556b.m21178a(this.f22204i, (View) this);
        } else if (view == this.f22203h) {
            C4556b.m21178a(this.f22206k, (View) this);
        } else {
            C4556b.m21178a(this.f22205j, (View) this);
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
        return this.f22196a.m21179a(getResources());
    }
}
