package com.google.android.finsky.billing.myaccount.layout;

import android.animation.Animator;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup$LayoutParams;
import android.view.animation.Animation;
import android.widget.TextView;
import com.google.android.finsky.bg.v;
import com.google.android.finsky.cv.a.cv;
import com.google.android.finsky.d.ad;
import com.google.android.finsky.d.j;
import com.google.android.finsky.d.o;
import com.google.android.finsky.d.w;
import com.google.android.finsky.detailscomponents.DocImageView;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.frameworkviews.w;
import com.google.android.finsky.navigationmanager.a;
import com.google.android.finsky.navigationmanager.e;
import com.google.android.play.image.w;
import com.google.android.play.layout.PlayCardThumbnail;
import com.google.wireless.android.a.a.a.a.ce;

public class com.google.android.finsky.billing.myaccount.layout.a extends AccountSeparatorRowView implements View$OnClickListener, Animation$AnimationListener, com.google.android.finsky.d.ad
{

    public final int a;
    public final int b;
    public final com.google.wireless.android.a.a.a.a.ce c;
    public final com.google.android.finsky.frameworkviews.w d;
    public final com.google.android.finsky.frameworkviews.w e;
    public Document f;
    public boolean g;
    public int h;
    public com.google.android.finsky.navigationmanager.a i;
    public com.google.android.finsky.d.w j;
    public com.google.android.finsky.d.ad k;
    public PlayCardThumbnail l;
    public TextView m;

    a(Context p0, AttributeSet p1, int p2) {
        AccountSeparatorRowView(p0, p1);
        v0 = p0.getResources().getConfiguration().fontScale;
        v1 = this.getResources().getDimensionPixelSize(2131625403);
        this.a = Math.max(v1, (int)((float)this.getResources().getDimensionPixelSize(2131624023) * v0));
        this.b = Math.max(v1, (int)(v0 * (float)this.getResources().getDimensionPixelSize(2131624022)));
        this.c = com.google.android.finsky.d.j.a(p2);
        this.d = new com.google.android.finsky.frameworkviews.w(this);
        this.d.setDuration(150);
        this.d.setAnimationListener(this);
        this.e = new com.google.android.finsky.frameworkviews.w(this);
        this.e.setDuration(150);
        this.e.setAnimationListener(this);
    }

    protected static void a(View p0) {
        p0.setVisibility(0);
        com.google.android.finsky.bg.v.a(p0, 0, 150).start();
    }

    protected final void a() {
        if (this.g != 0)
            v0 = this.b;
        else
            v0 = this.a;
        this.getLayoutParams().height = v0;
        this.d.a(this.a, this.b);
        this.e.a(this.b, this.a);
        this.requestLayout();
    }

    public final void a(com.google.android.finsky.d.ad p0) {
        com.google.android.finsky.d.j.a(this, p0);
    }

    protected final void a(Document p0, String p1, com.google.android.play.image.w p2, boolean p3, com.google.android.finsky.navigationmanager.a p4, com.google.android.finsky.d.ad p5, com.google.android.finsky.d.w p6) {
        this.f = p0;
        this.g = p3;
        this.k = p5;
        this.i = p4;
        this.j = p6;
        this.m.setText(p1);
        com.google.android.finsky.d.j.a(this.c, p0.a.D);
        p5.a(this);
        v1 = this.getThumbnailCover();
        if (v1 == 0)
            this.l.setVisibility(8);
        else {
            v1.a(p0, p2, DocImageView.a);
            if (com.google.android.finsky.navigationmanager.e.a()) {
                v2 = String.valueOf("transition_card_details:cover:");
                v0 = String.valueOf(p0.a.c);
                if (v0.length() != 0)
                    v0 = v2.concat(v0);
                else
                    v0 = new String(v2);
                v1.setTransitionName(v0);
                this.setTransitionGroup(1);
            }
            if (com.google.android.finsky.navigationmanager.e.a(p0))
                this.l.setOnClickListener(this);
            this.l.setVisibility(0);
        }
    }

    public final void b() {
        v1 = 1;
        if (this.g == 0)
            v0 = 1;
        else
            v0 = 0;
        this.g = v0;
        if (this.g != 0)
            v1 = 0;
        this.setClickable(v1);
        if (this.g != 0)
            v0 = this.d;
        else
            v0 = this.e;
        this.startAnimation(v0);
    }

    public com.google.android.finsky.d.ad getParentNode() {
        return this.k;
    }

    public com.google.wireless.android.a.a.a.a.ce getPlayStoreUiElement() {
        return this.c;
    }

    public int getRowPosition() {
        return this.h;
    }

    protected DocImageView getThumbnailCover() {
        if (this.l != 0)
            v0 = (DocImageView)this.l.getImageView();
        else
            v0 = 0;
        return v0;
    }

    public void onAnimationRepeat(Animation p0) {
    }

    public void onClick(View p0) {
        this.i.a(this.f, new com.google.android.finsky.d.o(2605, this), this.getThumbnailCover(), this.j);
    }

    protected void onFinishInflate() {
        super.onFinishInflate();
        this.l = (PlayCardThumbnail)this.findViewById(2131755432);
        this.m = (TextView)this.findViewById(2131755114);
    }

    public void setRowPosition(int p0) {
        this.h = p0;
    }

}
