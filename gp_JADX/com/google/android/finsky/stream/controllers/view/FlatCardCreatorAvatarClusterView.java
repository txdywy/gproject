package com.google.android.finsky.stream.controllers.view;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.GradientDrawable.Orientation;
import android.support.v4.p028a.C0216d;
import android.support.v4.view.ai;
import android.support.v7.widget.fe;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.finsky.bg.C1612l;
import com.google.android.finsky.bg.ah;
import com.google.android.finsky.cv.p177a.bd;
import com.google.android.finsky.frameworkviews.FadingEdgeImageView;
import com.google.android.finsky.providers.C3947d;
import com.google.android.finsky.stream.base.view.FlatCardClusterView;
import com.google.android.finsky.stream.controllers.ca;
import com.google.android.play.image.FifeImageView;
import com.squareup.haha.perflib.io.MemoryMappedFileBuffer;
import com.squareup.leakcanary.C7582R;

public class FlatCardCreatorAvatarClusterView extends FlatCardClusterView {
    public C1612l f22865j;
    public FadingEdgeImageView f22866k;
    public View f22867l;
    public LinearLayout f22868m;
    public FifeImageView f22869n;
    public TextView f22870o;
    public TextView f22871p;
    public fe f22872q;
    public int f22873r;
    public boolean f22874s;
    public int f22875t;

    public FlatCardCreatorAvatarClusterView(Context context) {
        this(context, null);
    }

    public FlatCardCreatorAvatarClusterView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f22875t = 2;
        this.f22873r = C0216d.m1116c(context, C7582R.color.flat_card_creator_avatar_background_color);
    }

    protected void onFinishInflate() {
        ((ca) C3947d.m18649a(ca.class)).mo1948a(this);
        super.onFinishInflate();
        this.f22866k = (FadingEdgeImageView) findViewById(C7582R.id.creator_avatar_image);
        this.f22867l = findViewById(C7582R.id.gradient_overlay);
        this.f22868m = (LinearLayout) findViewById(C7582R.id.developer_icon_grouping);
        this.f22869n = (FifeImageView) findViewById(C7582R.id.avatar_image);
        this.f22870o = (TextView) findViewById(C7582R.id.developer_title);
        this.f22871p = (TextView) findViewById(C7582R.id.developer_button);
    }

    public final void m20998a(bd bdVar, bd bdVar2, String str, String str2, OnClickListener onClickListener) {
        boolean z;
        getCardViewGroupDelegate().mo3864a(this, this.f22873r);
        if (bdVar != null) {
            this.f22865j.m9288a(this.f22866k, bdVar.f11860f, bdVar.f11863i);
            this.f22866k.setAlpha(77);
            this.f22866k.setVisibility(0);
        } else {
            this.f22866k.setVisibility(8);
        }
        if (onClickListener != null) {
            z = true;
        } else {
            z = false;
        }
        this.f22874s = z;
        this.f22868m.setOnClickListener(onClickListener);
        this.f22868m.setClickable(this.f22874s);
        this.f22868m.setContentDescription(this.f22874s ? str : null);
        if (bdVar2 != null) {
            this.f22865j.m9288a(this.f22869n, bdVar2.f11860f, bdVar2.f11863i);
            this.f22869n.setVisibility(0);
        } else {
            this.f22869n.setVisibility(8);
        }
        this.f22870o.setText(str);
        if (TextUtils.isEmpty(str2)) {
            this.f22871p.setVisibility(8);
        } else {
            this.f22871p.setText(str2.toUpperCase());
            this.f22871p.setVisibility(0);
        }
        this.f22872q = new C4504b(this);
        this.c.mo2951a(this.f22872q);
    }

    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int measuredHeight = getMeasuredHeight();
        int i3 = (int) (1.7777778f * ((float) measuredHeight));
        this.f22866k.measure(MeasureSpec.makeMeasureSpec(i3, MemoryMappedFileBuffer.DEFAULT_SIZE), MeasureSpec.makeMeasureSpec(measuredHeight, MemoryMappedFileBuffer.DEFAULT_SIZE));
        this.f22867l.measure(MeasureSpec.makeMeasureSpec((int) (((float) i3) * 0.5f), MemoryMappedFileBuffer.DEFAULT_SIZE), MeasureSpec.makeMeasureSpec(measuredHeight, MemoryMappedFileBuffer.DEFAULT_SIZE));
        this.f22868m.measure(MeasureSpec.makeMeasureSpec(this.c.getLeadingGapForSnapping(), MemoryMappedFileBuffer.DEFAULT_SIZE), MeasureSpec.makeMeasureSpec(measuredHeight, MemoryMappedFileBuffer.DEFAULT_SIZE));
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredWidth;
        int i5;
        int i6;
        super.onLayout(z, i, i2, i3, i4);
        int k = ai.f1848a.mo400k(this);
        int i7 = k == 0 ? 1 : 0;
        if (i7 != 0) {
            measuredWidth = this.f22866k.getMeasuredWidth() - this.f22867l.getMeasuredWidth();
            i5 = 0;
            i6 = 0;
        } else {
            i5 = getMeasuredWidth() - this.f22866k.getMeasuredWidth();
            measuredWidth = getMeasuredWidth() - this.f22866k.getMeasuredWidth();
            i6 = getMeasuredWidth() - this.f22868m.getMeasuredWidth();
        }
        if (this.f22875t != k) {
            this.f22875t = k;
            ah.m9227a(this.f22867l, new GradientDrawable(i7 != 0 ? Orientation.LEFT_RIGHT : Orientation.RIGHT_LEFT, new int[]{0, this.f22873r}));
        }
        this.f22866k.layout(i5, 0, this.f22866k.getMeasuredWidth() + i5, this.f22866k.getMeasuredHeight());
        this.f22867l.layout(measuredWidth, 0, this.f22867l.getMeasuredWidth() + measuredWidth, this.f22866k.getMeasuredHeight());
        this.f22868m.layout(i6, 0, this.f22868m.getMeasuredWidth() + i6, this.f22868m.getMeasuredHeight());
    }

    public final void Z_() {
        super.Z_();
        this.f22866k.a();
        this.c.mo2952b(this.f22872q);
    }

    protected int getPlayStoreUiElementType() {
        return 453;
    }
}
