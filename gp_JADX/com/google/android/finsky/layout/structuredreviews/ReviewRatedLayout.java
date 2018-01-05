package com.google.android.finsky.layout.structuredreviews;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.layout.MyReviewReplyLayout;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p111d.ad;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.play.layout.PlayTextView;
import com.google.android.play.layout.StarRatingBar;
import com.google.android.play.layout.i;
import com.squareup.leakcanary.C7582R;

public class ReviewRatedLayout extends C3721a implements i {
    public StarRatingBar f18819c;
    public PlayTextView f18820d;
    public MyReviewReplyLayout f18821e;
    public ViewStub f18822f;
    public TextView f18823g;
    public TextView f18824h;
    public ImageView f18825i;
    public C1142f f18826j;

    public ReviewRatedLayout(Context context) {
        this(context, null);
    }

    public ReviewRatedLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f18823g = (TextView) findViewById(C7582R.id.user_display_name);
        this.f18824h = (TextView) findViewById(C7582R.id.review_timestamp);
        this.f18819c = (StarRatingBar) findViewById(C7582R.id.my_rating_bar);
        this.f18820d = (PlayTextView) findViewById(C7582R.id.review_text);
        this.f18822f = (ViewStub) findViewById(C7582R.id.review_reply_stub);
        this.f18825i = (ImageView) findViewById(C7582R.id.rating_overflow);
    }

    public final void m17599a(CharSequence charSequence, int i, String str, long j, ad adVar, C2495w c2495w) {
        super.m17594a(null);
        this.f18819c.setRating((float) i);
        if (TextUtils.isEmpty(charSequence)) {
            this.f18820d.setVisibility(8);
        } else {
            this.f18820d.setVisibility(0);
            this.f18820d.setText(charSequence);
        }
        Resources resources = getResources();
        setContentDescription(resources.getQuantityString(C7582R.plurals.content_description_rated, i, new Object[]{Integer.valueOf(i)}));
        if (TextUtils.isEmpty(str)) {
            this.f18823g.setVisibility(8);
        } else {
            this.f18823g.setText(str);
        }
        this.f18824h.setText(resources.getString(C7582R.string.my_rate_review, new Object[]{C1473m.f7980a.bb().m21826a(j)}));
        this.f18825i.setOnClickListener(new C3722d(this, c2495w, adVar));
        this.f18825i.setVisibility(0);
    }

    public void setRatedActionListener(C1142f c1142f) {
        this.f18826j = c1142f;
    }

    public final void m17598a(int i) {
        if (this.f18826j != null) {
            switch (i) {
                case 1:
                    this.f18825i.setVisibility(8);
                    this.f18826j.mo1467i();
                    return;
                case 2:
                    this.f18825i.setVisibility(8);
                    this.f18826j.mo1468j();
                    return;
                default:
                    FinskyLog.m21669e("Unknown item selected on ReviewRatedCard overflow menu: %d", Integer.valueOf(i));
                    return;
            }
        }
    }
}
