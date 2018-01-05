package com.google.android.finsky.playcard;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.support.v4.widget.bg;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView.ScaleType;
import android.widget.TextView;
import com.caverock.androidsvg.C0722q;
import com.caverock.androidsvg.as;
import com.google.android.finsky.actionbuttons.C1006c;
import com.google.android.finsky.actionbuttons.DetailsSummaryDynamic;
import com.google.android.finsky.ba.C1461c;
import com.google.android.finsky.detailscomponents.DocImageView;
import com.google.android.finsky.detailscomponents.ScreenshotsRecyclerView;
import com.google.android.finsky.frameworkviews.ae;
import com.google.android.finsky.providers.C3947d;
import com.google.android.play.layout.PlayCardThumbnail;
import com.google.android.play.layout.PlayTextView;
import com.google.android.play.layout.d;
import com.google.android.play.p184e.C2629a;
import com.squareup.leakcanary.C7582R;

public class PlayCardJpkrEditorialView extends d implements ae, cn, C2629a {
    public TextView f19426a;
    public TextView f19427b;
    public TextView f19428c;
    public TextView f19429d;
    public TextView f19430e;
    public DetailsSummaryDynamic f19431f;
    public C1006c f19432g;
    public View f19433h;
    public ViewGroup f19434i;
    public EditorialPageExtraLabelsSection f19435j;
    public ScreenshotsRecyclerView f19436k;
    public View f19437l;
    public ViewGroup f19438m;
    public final Drawable f19439n;
    public final Drawable f19440o;
    public final int f19441p;
    public boolean f19442q;
    public C1461c f19443r;

    public PlayCardJpkrEditorialView(Context context) {
        this(context, null);
    }

    public PlayCardJpkrEditorialView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.at = true;
        Resources resources = context.getResources();
        this.f19439n = C0722q.m4782a(resources, (int) C7582R.raw.ic_user_rating_dark, new as().m4593b(resources.getColor(C7582R.color.play_secondary_text)));
        this.f19440o = C0722q.m4782a(resources, (int) C7582R.raw.ic_get_app_black_12px, new as().m4593b(resources.getColor(C7582R.color.play_secondary_text)));
        this.f19441p = resources.getDimensionPixelSize(C7582R.dimen.play_listing_card_height);
    }

    protected void onFinishInflate() {
        ((ae) C3947d.m18649a(ae.class)).mo1883a(this);
        super.onFinishInflate();
        if (this.f19443r.dj().mo2294a(12632714)) {
            int dimensionPixelSize = getResources().getDimensionPixelSize(C7582R.dimen.flat_cluster_content_bottom_padding_large_tablet);
            setPadding(getPaddingLeft(), dimensionPixelSize, getPaddingRight(), dimensionPixelSize);
        }
        this.f19426a = (TextView) findViewById(C7582R.id.app_size);
        this.f19427b = (TextView) findViewById(C7582R.id.rating_count_left);
        this.f19428c = (TextView) findViewById(C7582R.id.rating_count_right);
        this.f19429d = (TextView) findViewById(C7582R.id.rating_count);
        this.f19430e = (TextView) findViewById(C7582R.id.downloads_count);
        this.f19431f = (DetailsSummaryDynamic) findViewById(C7582R.id.title_details_summary_dynamic);
        this.f19433h = findViewById(C7582R.id.rating_info);
        this.f19434i = (ViewGroup) findViewById(C7582R.id.title_content_rating_panel);
        this.f19435j = (EditorialPageExtraLabelsSection) findViewById(C7582R.id.title_extra_labels_bottom);
        this.f19436k = (ScreenshotsRecyclerView) findViewById(C7582R.id.screenshots_container);
        bg.m2222a(this.f19429d, null, null, this.f19439n, null);
        bg.m2222a(this.f19430e, null, null, this.f19440o, null);
        this.f19437l = findViewById(C7582R.id.key_points_title);
        this.f19438m = (ViewGroup) findViewById(C7582R.id.key_points_container);
    }

    public PlayTextView getDescription() {
        return null;
    }

    public int getCardType() {
        return 37;
    }

    protected void onMeasure(int i, int i2) {
        PlayCardThumbnail thumbnail = getThumbnail();
        LayoutParams layoutParams = thumbnail.getLayoutParams();
        int min = Math.min(layoutParams.height, this.f19441p);
        layoutParams.width = min;
        layoutParams.height = min;
        ((DocImageView) thumbnail.getImageView()).setScaleType(ScaleType.FIT_START);
        int size = MeasureSpec.getSize(i);
        if (size != 0) {
            LayoutParams layoutParams2 = this.f19436k.getLayoutParams();
            int dimensionPixelSize = getResources().getDimensionPixelSize(C7582R.dimen.jpkr_editorial_details_screenshot_max_height);
            if (!this.f19442q) {
                dimensionPixelSize = (int) Math.min((float) dimensionPixelSize, ((float) (((size - (getResources().getDimensionPixelSize(C7582R.dimen.jpkr_editorial_details_card_padding) * 2)) - getPaddingLeft()) - getPaddingRight())) / 2.05f);
            }
            layoutParams2.height = dimensionPixelSize;
        }
        super.onMeasure(i, i2);
    }

    public ViewGroup getContentRatingPanel() {
        return this.f19434i;
    }

    public final void mo3836a(CharSequence charSequence) {
        this.f19426a.setVisibility(0);
        this.f19426a.setText(charSequence);
        this.f19427b.setVisibility(8);
        this.f19429d.setVisibility(8);
        this.f19428c.setVisibility(8);
    }

    public final void ar_() {
        this.f19426a.setVisibility(8);
        this.f19427b.setVisibility(0);
        this.f19429d.setVisibility(0);
        this.f19428c.setVisibility(0);
    }

    public final void mo3837a(boolean z) {
    }

    public final boolean mo3839b(boolean z) {
        return true;
    }

    final void m18447b(int i) {
        this.f19433h.setVisibility(i);
    }

    public void setDownloadsCountVisbility(int i) {
        this.f19430e.setVisibility(i);
    }

    public DetailsSummaryDynamic getDetailsDynamicSection() {
        return this.f19431f;
    }

    public void setActionButtonHelper(C1006c c1006c) {
        this.f19432g = c1006c;
    }

    public EditorialPageExtraLabelsSection getExtraLabelsContainer() {
        return this.f19435j;
    }

    public ScreenshotsRecyclerView getScreenshotsContainer() {
        return this.f19436k;
    }

    public void setAllPortraitMode(boolean z) {
        this.f19442q = z;
        requestLayout();
    }

    public void setKeyPointsVisibility(int i) {
        this.f19437l.setVisibility(i);
        this.f19438m.setVisibility(i);
    }

    public void setKeyPointCount(int i) {
        while (this.f19438m.getChildCount() < i) {
            View inflate = LayoutInflater.from(getContext()).inflate(C7582R.layout.jpkr_editorial_key_point_view, this.f19438m, false);
            ((TextView) inflate.findViewById(C7582R.id.key_point_index)).setText(Integer.toString(this.f19438m.getChildCount() + 1));
            this.f19438m.addView(inflate);
        }
        while (this.f19438m.getChildCount() > i) {
            this.f19438m.removeViewAt(this.f19438m.getChildCount() - 1);
        }
    }

    public void setEditorialParagraphVisibility(int i) {
        getEditorialParagraph().setVisibility(i);
    }

    public PlayTextView getEditorialParagraph() {
        return super.getDescription();
    }

    public final boolean mo2996a(float f, float f2) {
        return this.f19436k != null && f >= ((float) this.f19436k.getLeft()) && f < ((float) this.f19436k.getRight()) && f2 >= ((float) this.f19436k.getTop()) && f2 < ((float) this.f19436k.getBottom());
    }

    public final void as_() {
        this.f19436k.aT = true;
    }

    public int getHorizontalScrollerTop() {
        return this.f19436k.getTop();
    }

    public int getHorizontalScrollerBottom() {
        return this.f19436k.getBottom();
    }

    public final void Z_() {
        this.f19436k.Z_();
        if (this.f19432g != null) {
            this.f19432g.m5955a();
        }
    }
}
