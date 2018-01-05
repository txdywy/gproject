package com.google.android.finsky.playcard;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.v4.widget.bg;
import android.text.TextUtils.TruncateAt;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView.ScaleType;
import android.widget.TextView;
import com.caverock.androidsvg.C0722q;
import com.caverock.androidsvg.as;
import com.google.android.finsky.actionbuttons.C1006c;
import com.google.android.finsky.actionbuttons.DetailsSummaryDynamic;
import com.google.android.finsky.detailscomponents.DetailsSummaryExtraLabelsSection;
import com.google.android.finsky.detailscomponents.DocImageView;
import com.google.android.finsky.detailscomponents.ScreenshotsRecyclerView;
import com.google.android.finsky.frameworkviews.ae;
import com.google.android.play.layout.PlayCardThumbnail;
import com.google.android.play.layout.PlayTextView;
import com.google.android.play.p184e.C2629a;
import com.squareup.leakcanary.C7582R;

public class FlatCardAppsMdpView extends C3893r implements ae, cn, C2629a {
    public TextView D_;
    public TextView f19354a;
    public TextView f19355b;
    public TextView f19356d;
    public TextView f19357e;
    public DetailsSummaryDynamic f19358f;
    public C1006c f19359g;
    public View f19360h;
    public ViewGroup f19361i;
    public DetailsSummaryExtraLabelsSection f19362j;
    public ScreenshotsRecyclerView f19363k;
    public final Drawable f19364l;
    public final Drawable f19365m;
    public final int f19366n;

    public FlatCardAppsMdpView(Context context) {
        this(context, null);
    }

    public FlatCardAppsMdpView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.at = true;
        Resources resources = context.getResources();
        this.f19364l = C0722q.m4782a(resources, (int) C7582R.raw.ic_user_rating_dark, new as().m4593b(resources.getColor(C7582R.color.play_secondary_text)));
        this.f19365m = C0722q.m4782a(resources, (int) C7582R.raw.ic_get_app_black_12px, new as().m4593b(resources.getColor(C7582R.color.play_secondary_text)));
        this.f19366n = resources.getDimensionPixelSize(C7582R.dimen.play_listing_card_height);
    }

    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f19354a = (TextView) findViewById(C7582R.id.app_size);
        this.f19355b = (TextView) findViewById(C7582R.id.rating_count_left);
        this.D_ = (TextView) findViewById(C7582R.id.rating_count_right);
        this.f19356d = (TextView) findViewById(C7582R.id.rating_count);
        this.f19357e = (TextView) findViewById(C7582R.id.downloads_count);
        this.f19358f = (DetailsSummaryDynamic) findViewById(C7582R.id.title_details_summary_dynamic);
        this.f19360h = findViewById(C7582R.id.rating_info);
        this.f19361i = (ViewGroup) findViewById(C7582R.id.title_content_rating_panel);
        this.f19362j = (DetailsSummaryExtraLabelsSection) findViewById(C7582R.id.title_extra_labels_bottom);
        this.f19363k = (ScreenshotsRecyclerView) findViewById(C7582R.id.screenshots_container);
        bg.m2222a(this.f19356d, null, null, this.f19364l, null);
        bg.m2222a(this.f19357e, null, null, this.f19365m, null);
        if (VERSION.SDK_INT >= 26) {
            this.ai.setEllipsize(TruncateAt.END);
        }
        this.f19358f.setForceWideLayout(!getResources().getBoolean(C7582R.bool.mdp_buttons_expand_whole_width));
    }

    public int getCardType() {
        return 36;
    }

    protected void onMeasure(int i, int i2) {
        PlayCardThumbnail thumbnail = getThumbnail();
        int paddingTop = this.f19366n - (getPaddingTop() * 2);
        LayoutParams layoutParams = thumbnail.getLayoutParams();
        paddingTop = Math.min(layoutParams.height, paddingTop);
        layoutParams.width = paddingTop;
        layoutParams.height = paddingTop;
        ((DocImageView) thumbnail.getImageView()).setScaleType(ScaleType.FIT_START);
        super.onMeasure(i, i2);
    }

    public ViewGroup getContentRatingPanel() {
        return this.f19361i;
    }

    public final void mo3836a(CharSequence charSequence) {
        this.f19354a.setVisibility(0);
        this.f19354a.setText(charSequence);
        this.f19355b.setVisibility(8);
        this.f19356d.setVisibility(8);
        this.D_.setVisibility(8);
    }

    public final void ar_() {
        this.f19354a.setVisibility(8);
        this.f19355b.setVisibility(0);
        this.f19356d.setVisibility(0);
        this.D_.setVisibility(0);
    }

    public final void mo3837a(boolean z) {
    }

    public final boolean mo3839b(boolean z) {
        return true;
    }

    final void h_(int i) {
        this.f19360h.setVisibility(i);
    }

    public void setDownloadsCountVisbility(int i) {
        this.f19357e.setVisibility(i);
    }

    public DetailsSummaryDynamic getDetailsDynamicSection() {
        return this.f19358f;
    }

    public void setActionButtonHelper(C1006c c1006c) {
        this.f19359g = c1006c;
    }

    public DetailsSummaryExtraLabelsSection getExtraLabelsContainer() {
        return this.f19362j;
    }

    public ScreenshotsRecyclerView getScreenshotsContainer() {
        return this.f19363k;
    }

    public PlayTextView getDescription() {
        if (this.q.dj().mo2294a(12608339)) {
            return super.getDescription();
        }
        return null;
    }

    public final boolean mo2996a(float f, float f2) {
        return this.f19363k != null && f >= ((float) this.f19363k.getLeft()) && f < ((float) this.f19363k.getRight()) && f2 >= ((float) this.f19363k.getTop()) && f2 < ((float) this.f19363k.getBottom());
    }

    public final void as_() {
        this.f19363k.aT = true;
    }

    public int getHorizontalScrollerTop() {
        return this.f19363k.getTop();
    }

    public int getHorizontalScrollerBottom() {
        return this.f19363k.getBottom();
    }

    public final void Z_() {
        this.f19363k.Z_();
        if (this.f19359g != null) {
            this.f19359g.m5955a();
        }
    }
}
