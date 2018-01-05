package com.google.android.finsky.stream.controllers.collectionassistcard.view;

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
import com.google.android.finsky.utils.C4672c;
import com.google.android.play.image.C1294w;
import com.google.android.play.image.FifeImageView;
import com.google.android.play.p203b.C3918i;
import com.google.android.play.p203b.C6270j;
import com.google.wireless.android.a.a.a.a.ce;
import com.squareup.leakcanary.C7582R;

public class CollectionAssistCardView extends RelativeLayout implements OnClickListener, ad, ae, C3075q {
    public C1294w f22030a;
    public C4556b f22031b;
    public TextView f22032c;
    public TextView f22033d;
    public PlayActionButtonV2 f22034e;
    public ImageView f22035f;
    public C4542a f22036g;
    public C4542a f22037h;
    public C4542a[] f22038i;
    public C4542a f22039j;
    public FifeImageView[] f22040k;
    public int[] f22041l;
    public ad f22042m;
    public ce f22043n;

    public CollectionAssistCardView(Context context) {
        this(context, null);
    }

    public CollectionAssistCardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CollectionAssistCardView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f22040k = new FifeImageView[5];
        this.f22041l = new int[]{C7582R.id.icon1, C7582R.id.icon2, C7582R.id.icon3, C7582R.id.icon4, C7582R.id.icon5};
        this.f22043n = C2482j.m13283a(2839);
        ((C1421b) C3947d.m18649a(C1421b.class)).mo1922a(this);
        getCardViewGroupDelegate().mo3865a(this, context, attributeSet, i);
    }

    protected void onFinishInflate() {
        super.onFinishInflate();
        setTag(C7582R.id.accept_page_margin, "");
        for (int i = 0; i < 5; i++) {
            this.f22040k[i] = (FifeImageView) findViewById(this.f22041l[i]);
            this.f22040k[i].setOnClickListener(this);
        }
        this.f22032c = (TextView) findViewById(C7582R.id.title);
        this.f22033d = (TextView) findViewById(C7582R.id.message);
        this.f22034e = (PlayActionButtonV2) findViewById(C7582R.id.call_to_action);
        this.f22034e.setDrawAsLabel(true);
        this.f22035f = (ImageView) findViewById(C7582R.id.close);
        this.f22035f.setOnClickListener(this);
        this.f22031b.m21180a(getResources(), this.f22035f);
        setOnClickListener(this);
    }

    public final void Z_() {
        for (int i = 0; i < 5; i++) {
            if (this.f22040k[i] != null) {
                this.f22040k[i].a();
            }
        }
        this.f22036g = null;
        this.f22039j = null;
        this.f22038i = null;
    }

    public ce getPlayStoreUiElement() {
        return this.f22043n;
    }

    public ad getParentNode() {
        return this.f22042m;
    }

    public final void mo1219a(ad adVar) {
        C2482j.m13291a((ad) this, adVar);
    }

    public C3918i getCardViewGroupDelegate() {
        return C6270j.f31324a;
    }

    public void onClick(View view) {
        if (view == this.f22034e) {
            C4556b.m21178a(this.f22036g, (View) this);
        } else if (view == this.f22035f) {
            C4556b.m21178a(this.f22039j, (View) this);
        } else if (C4672c.m21804a(this.f22040k, (Object) view)) {
            int length = this.f22040k.length;
            int i = 0;
            while (i < length) {
                if (this.f22040k[i] == view) {
                    break;
                }
                i++;
            }
            i = -1;
            if (i >= 0 && this.f22038i[i] != null) {
                this.f22038i[i].mo4262a(this);
            }
        } else {
            C4556b.m21178a(this.f22037h, (View) this);
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
        return this.f22031b.m21179a(getResources());
    }
}
