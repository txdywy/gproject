package com.google.android.finsky.detailspage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.caverock.androidsvg.C0722q;
import com.caverock.androidsvg.as;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.cv.p177a.cv;
import com.google.android.finsky.detailscomponents.C2585k;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.frameworkviews.C2621k;
import com.google.android.finsky.frameworkviews.C2622l;
import com.google.android.finsky.frameworkviews.PlayRatingBar;
import com.google.android.finsky.layout.MyReviewReplyLayout;
import com.google.android.finsky.layout.RateReviewEditor2;
import com.google.android.finsky.layout.play.PersonAvatarView;
import com.google.android.finsky.p111d.C2473o;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p111d.ad;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.play.layout.PlayTextView;
import com.google.android.play.layout.StarRatingBar;
import com.google.android.play.layout.i;
import com.google.android.play.utils.j;
import com.squareup.leakcanary.C7582R;

public class TestingProgramReviewModuleLayout extends LinearLayout implements C2585k, C2621k, C2622l, i {
    public gd f14092a;
    public boolean f14093b;
    public ad f14094c;
    public C2495w f14095d;
    public Document f14096e;
    public cv f14097f;
    public Rect f14098g;
    public int f14099h;
    public PersonAvatarView f14100i;
    public TextView f14101j;
    public TextView f14102k;
    public PlayRatingBar f14103l;
    public StarRatingBar f14104m;
    public PlayTextView f14105n;
    public ImageView f14106o;
    public TextView f14107p;
    public RateReviewEditor2 f14108q;
    public MyReviewReplyLayout f14109r;
    public ViewStub f14110s;
    public View f14111t;

    public TestingProgramReviewModuleLayout(Context context) {
        this(context, null);
    }

    public TestingProgramReviewModuleLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f14098g = new Rect();
        this.f14099h = context.getResources().getDimensionPixelSize(C7582R.dimen.play_card_overflow_touch_extend);
    }

    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f14100i = (PersonAvatarView) findViewById(C7582R.id.my_avatar);
        this.f14101j = (TextView) findViewById(C7582R.id.my_display_name);
        this.f14102k = (TextView) findViewById(C7582R.id.my_rating_text);
        this.f14103l = (PlayRatingBar) findViewById(C7582R.id.review_rating_bar);
        this.f14104m = (StarRatingBar) findViewById(C7582R.id.my_rating_bar);
        this.f14106o = (ImageView) findViewById(C7582R.id.rating_overflow);
        this.f14105n = (PlayTextView) findViewById(C7582R.id.review_text);
        this.f14107p = (TextView) findViewById(C7582R.id.gplus_disclaimer);
        if (C1473m.f7980a.aN().dj().mo2294a(12637755)) {
            this.f14107p.setText(C7582R.string.new_public_reviews_message);
        }
        this.f14108q = (RateReviewEditor2) findViewById(C7582R.id.rate_review_editor);
        this.f14110s = (ViewStub) findViewById(C7582R.id.review_reply_stub);
        this.f14111t = findViewById(C7582R.id.contact_developer_view);
    }

    final void m13793a() {
        CharSequence charSequence;
        if (this.f14097f == null) {
            charSequence = null;
        } else {
            charSequence = this.f14097f.f12100g;
        }
        if (charSequence != null) {
            this.f14101j.setText(charSequence);
        } else {
            this.f14101j.setVisibility(8);
        }
        if (this.f14097f != null) {
            C2473o c2473o = new C2473o(279, this.f14097f.f12087D, this.f14094c);
            this.f14100i.setVisibility(0);
            this.f14100i.m17564a(this.f14097f, C1473m.f7980a.be());
            return;
        }
        this.f14100i.setOnClickListener(null);
        this.f14100i.setVisibility(8);
    }

    final void m13795a(gc gcVar) {
        Resources resources = getContext().getResources();
        if (gcVar == null) {
            this.f14111t.setVisibility(8);
            return;
        }
        ImageView imageView = (ImageView) this.f14111t.findViewById(C7582R.id.contact_developer_icon);
        ((TextView) this.f14111t.findViewById(C7582R.id.contact_developer_text)).setText(resources.getString(C7582R.string.testing_program_contact_developer).toUpperCase());
        imageView.setImageDrawable(C0722q.m4782a(resources, (int) C7582R.raw.ic_exit_to_app_24px, new as().m4593b(resources.getColor(C7582R.color.play_apps_primary))));
        this.f14111t.setVisibility(0);
        this.f14111t.setOnClickListener(new fz(gcVar));
    }

    public final void m13794a(int i) {
        if (this.f14092a != null) {
            switch (i) {
                case 1:
                    this.f14092a.mo3095b();
                    return;
                case 2:
                    this.f14092a.mo3096d();
                    return;
                default:
                    FinskyLog.m21669e("Unknown item selected on RateReviewModuleV2Layout overflow menu: %d", Integer.valueOf(i));
                    return;
            }
        }
    }

    final void m13796a(boolean z) {
        this.f14106o.setOnClickListener(new ga(this, z));
        this.f14106o.setVisibility(0);
        if (this.f14098g.isEmpty()) {
            this.f14106o.getHitRect(this.f14098g);
            this.f14098g.inset(-this.f14099h, -this.f14099h);
            setTouchDelegate(new j(this.f14098g, this.f14106o));
        }
    }

    public int getMarginOffset() {
        return 0;
    }
}
