package com.google.android.finsky.detailspage;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.finsky.layout.ReviewReplyLayout;
import com.google.android.finsky.layout.play.PersonAvatarView;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.play.layout.i;
import com.squareup.leakcanary.C7582R;

public class TestingProgramMyReviewModuleLayout extends LinearLayout implements i {
    public fn f14080a;
    public TextView f14081b;
    public TextView f14082c;
    public TextView f14083d;
    public TextView f14084e;
    public TextView f14085f;
    public PersonAvatarView f14086g;
    public ViewStub f14087h;
    public ReviewReplyLayout f14088i;
    public ImageView f14089j;
    public Rect f14090k;
    public int f14091l;

    public TestingProgramMyReviewModuleLayout(Context context) {
        this(context, null);
    }

    public TestingProgramMyReviewModuleLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f14090k = new Rect();
        this.f14091l = context.getResources().getDimensionPixelSize(C7582R.dimen.play_card_overflow_touch_extend);
    }

    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f14081b = (TextView) findViewById(C7582R.id.your_review_label);
        this.f14082c = (TextView) findViewById(C7582R.id.review_author);
        this.f14083d = (TextView) findViewById(C7582R.id.review_date);
        this.f14084e = (TextView) findViewById(C7582R.id.review_title);
        this.f14085f = (TextView) findViewById(C7582R.id.review_text);
        this.f14086g = (PersonAvatarView) findViewById(C7582R.id.user_profile_image);
        this.f14087h = (ViewStub) findViewById(C7582R.id.review_reply_stub);
        this.f14088i = (ReviewReplyLayout) findViewById(C7582R.id.review_reply_container);
        this.f14089j = (ImageView) findViewById(C7582R.id.rating_overflow);
    }

    public final void m13792a(int i) {
        if (this.f14080a != null) {
            if (i == 1) {
                this.f14080a.mo3092a();
                return;
            }
            FinskyLog.m21669e("Unknown item selected on overflow menu: %d", Integer.valueOf(i));
        }
    }
}
