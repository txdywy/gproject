package com.google.android.finsky.billing.myaccount.layout;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.widget.TextView;
import com.google.android.finsky.bg.C1621v;
import com.google.android.finsky.detailscomponents.DocImageView;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.frameworkviews.C3149w;
import com.google.android.finsky.navigationmanager.C3748a;
import com.google.android.finsky.navigationmanager.C3760e;
import com.google.android.finsky.p111d.C2473o;
import com.google.android.finsky.p111d.C2482j;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p111d.ad;
import com.google.android.play.image.C1294w;
import com.google.android.play.layout.PlayCardThumbnail;
import com.google.wireless.android.a.a.a.a.ce;
import com.squareup.leakcanary.C7582R;

public abstract class C2012a extends AccountSeparatorRowView implements OnClickListener, AnimationListener, ad {
    public final int f10364a;
    public final int f10365b;
    public final ce f10366c;
    public final C3149w f10367d = new C3149w(this);
    public final C3149w f10368e;
    public Document f10369f;
    public boolean f10370g;
    public int f10371h;
    public C3748a f10372i;
    public C2495w f10373j;
    public ad f10374k;
    public PlayCardThumbnail f10375l;
    public TextView f10376m;

    protected C2012a(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        float f = context.getResources().getConfiguration().fontScale;
        int dimensionPixelSize = getResources().getDimensionPixelSize(C7582R.dimen.standard_button_touch_target_minsize);
        this.f10364a = Math.max(dimensionPixelSize, (int) (((float) getResources().getDimensionPixelSize(C7582R.dimen.account_row_min_height)) * f));
        this.f10365b = Math.max(dimensionPixelSize, (int) (f * ((float) getResources().getDimensionPixelSize(C7582R.dimen.account_row_height_expanded))));
        this.f10366c = C2482j.m13283a(i);
        this.f10367d.setDuration(150);
        this.f10367d.setAnimationListener(this);
        this.f10368e = new C3149w(this);
        this.f10368e.setDuration(150);
        this.f10368e.setAnimationListener(this);
    }

    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f10375l = (PlayCardThumbnail) findViewById(C7582R.id.li_thumbnail_frame);
        this.f10376m = (TextView) findViewById(C7582R.id.title);
    }

    protected DocImageView getThumbnailCover() {
        return this.f10375l != null ? (DocImageView) this.f10375l.getImageView() : null;
    }

    protected final void m10696a(Document document, String str, C1294w c1294w, boolean z, C3748a c3748a, ad adVar, C2495w c2495w) {
        this.f10369f = document;
        this.f10370g = z;
        this.f10374k = adVar;
        this.f10372i = c3748a;
        this.f10373j = c2495w;
        this.f10376m.setText(str);
        C2482j.m13285a(this.f10366c, document.f14885a.f12087D);
        adVar.mo1219a(this);
        DocImageView thumbnailCover = getThumbnailCover();
        if (thumbnailCover == null) {
            this.f10375l.setVisibility(8);
            return;
        }
        thumbnailCover.m13584a(document, c1294w, DocImageView.f13711a);
        if (C3760e.m17903a()) {
            String valueOf = String.valueOf("transition_card_details:cover:");
            String valueOf2 = String.valueOf(document.f14885a.f12096c);
            thumbnailCover.setTransitionName(valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf));
            setTransitionGroup(true);
        }
        if (C3760e.m17904a(document)) {
            this.f10375l.setOnClickListener(this);
        }
        this.f10375l.setVisibility(0);
    }

    protected final void m10694a() {
        getLayoutParams().height = this.f10370g ? this.f10365b : this.f10364a;
        this.f10367d.m16059a(this.f10364a, this.f10365b);
        this.f10368e.m16059a(this.f10365b, this.f10364a);
        requestLayout();
    }

    protected static void m10693a(View view) {
        view.setVisibility(0);
        C1621v.m9303a(view, 0.0f, 150).start();
    }

    public final void m10697b() {
        boolean z;
        boolean z2 = true;
        if (this.f10370g) {
            z = false;
        } else {
            z = true;
        }
        this.f10370g = z;
        if (this.f10370g) {
            z2 = false;
        }
        setClickable(z2);
        startAnimation(this.f10370g ? this.f10367d : this.f10368e);
    }

    public void setRowPosition(int i) {
        this.f10371h = i;
    }

    public int getRowPosition() {
        return this.f10371h;
    }

    public void onAnimationRepeat(Animation animation) {
    }

    public void onClick(View view) {
        this.f10372i.mo3654a(this.f10369f, new C2473o(2605, this), getThumbnailCover(), this.f10373j);
    }

    public ce getPlayStoreUiElement() {
        return this.f10366c;
    }

    public ad getParentNode() {
        return this.f10374k;
    }

    public final void mo1219a(ad adVar) {
        C2482j.m13291a((ad) this, adVar);
    }
}
