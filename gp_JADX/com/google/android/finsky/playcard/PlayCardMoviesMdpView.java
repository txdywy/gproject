package com.google.android.finsky.playcard;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.caverock.androidsvg.C0722q;
import com.google.android.finsky.actionbuttons.C1006c;
import com.google.android.finsky.actionbuttons.C1011h;
import com.google.android.finsky.actionbuttons.DetailsSummaryDynamic;
import com.google.android.finsky.bg.C1612l;
import com.google.android.finsky.detailscomponents.C2577b;
import com.google.android.finsky.detailscomponents.C2586l;
import com.google.android.finsky.detailscomponents.HeroGraphicView;
import com.google.android.finsky.p111d.C2473o;
import com.google.android.finsky.providers.C3947d;
import com.google.android.play.image.FifeImageView;
import com.google.android.play.layout.d;
import com.squareup.leakcanary.C7582R;

public class PlayCardMoviesMdpView extends d {
    public C2577b f19444A;
    public C1011h f19445B;
    public C1612l f19446C;
    public ao f19447D;
    public ac f19448E;
    public Context f19449a;
    public FifeImageView f19450b;
    public TextView f19451c;
    public HeroGraphicView f19452d;
    public TextView f19453e;
    public DetailsSummaryDynamic f19454f;
    public View f19455g;
    public C1006c f19456h;
    public View f19457i;
    public TextView f19458j;
    public ImageView f19459k;
    public TextView f19460l;
    public LinearLayout f19461m;
    public View f19462n;
    public C2586l f19463o;
    public int f19464p;
    public final int f19465q;
    public final int f19466r;
    public final int f19467s;
    public final int f19468t;
    public final int f19469u;
    public final int f19470v;
    public final int f19471w;
    public final int f19472x;
    public final boolean f19473y;
    public C2473o f19474z;

    public PlayCardMoviesMdpView(Context context) {
        this(context, null);
    }

    public PlayCardMoviesMdpView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f19449a = context;
        Resources resources = context.getResources();
        this.f19465q = resources.getDimensionPixelSize(C7582R.dimen.summary_thumbnail_peek);
        this.f19467s = resources.getDimensionPixelSize(C7582R.dimen.movies_mdp_thumbnail_width_movie);
        this.f19466r = resources.getDimensionPixelSize(C7582R.dimen.movies_mdp_thumbnail_width_tv);
        this.f19469u = resources.getDimensionPixelSize(C7582R.dimen.movies_mdp_thumbnail_width_movie_apps_ent_home);
        this.f19468t = resources.getDimensionPixelSize(C7582R.dimen.movies_mdp_thumbnail_width_tv_apps_ent_home);
        this.f19470v = resources.getDimensionPixelSize(C7582R.dimen.movies_mdp_margin);
        this.f19471w = resources.getDimensionPixelSize(C7582R.dimen.movies_mdp_title_section_margin_top);
        this.f19472x = resources.getDimensionPixelSize(C7582R.dimen.movies_mdp_subtitle_margin);
        this.at = true;
        this.f19473y = resources.getBoolean(C7582R.bool.movies_mdp_use_large_landscape_layout);
    }

    protected void onFinishInflate() {
        ((ae) C3947d.m18649a(ae.class)).mo1884a(this);
        super.onFinishInflate();
        this.f19452d = (HeroGraphicView) findViewById(C7582R.id.hero_graphic);
        this.f19453e = (TextView) findViewById(C7582R.id.rating_count);
        this.f19454f = (DetailsSummaryDynamic) findViewById(C7582R.id.title_details_summary_dynamic);
        this.f19450b = (FifeImageView) findViewById(C7582R.id.sentiment_image);
        this.f19451c = (TextView) findViewById(C7582R.id.favorable_percent);
        this.f19455g = findViewById(C7582R.id.rotten_tomatoes_info);
        this.f19457i = findViewById(C7582R.id.rating_info);
        this.f19458j = (TextView) findViewById(C7582R.id.release_date);
        this.f19460l = (TextView) findViewById(C7582R.id.show_name);
        this.f19461m = (LinearLayout) findViewById(C7582R.id.subtitles);
        this.f19462n = findViewById(C7582R.id.title_section);
        ((ImageView) findViewById(C7582R.id.rating_icon)).setImageDrawable(C0722q.m4781a(this.f19449a.getResources(), (int) C7582R.raw.ic_user_rating_dark, (int) C7582R.color.play_primary_text));
        this.f19464p = ((MarginLayoutParams) this.U.getLayoutParams()).topMargin;
        this.f19459k = (ImageView) findViewById(C7582R.id.thumbnail_play_icon);
        if (this.f19459k != null) {
            this.f19463o = this.f19444A.m13627a(getContext(), this.f19459k, this.U);
        }
    }

    public int getCardType() {
        return 21;
    }

    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (!this.f19473y && VERSION.SDK_INT < 19) {
            setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight() + this.f19470v);
        }
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.f19459k != null && this.f19459k.getVisibility() != 8) {
            int measuredWidth = this.f19459k.getMeasuredWidth();
            int measuredHeight = this.f19459k.getMeasuredHeight();
            int left = this.U.getLeft() + ((this.U.getMeasuredWidth() - measuredWidth) / 2);
            int top = this.U.getTop() + ((this.U.getMeasuredHeight() - measuredHeight) / 2);
            this.f19459k.layout(left, top, measuredWidth + left, measuredHeight + top);
        }
    }
}
