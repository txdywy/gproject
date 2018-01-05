package com.google.android.finsky.detailspage;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.widget.TextView;
import com.google.android.finsky.C1406o;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.bg.C1611k;
import com.google.android.finsky.detailscomponents.C2577b;
import com.google.android.finsky.detailscomponents.C2581g;
import com.google.android.finsky.detailscomponents.C2584j;
import com.google.android.finsky.frameworkviews.BucketRowLayout;
import com.google.android.finsky.frameworkviews.C2572y;
import com.google.android.finsky.frameworkviews.C2573z;
import com.google.android.finsky.frameworkviews.C2621k;
import com.google.android.finsky.frameworkviews.C2622l;
import com.google.android.finsky.frameworkviews.FadingEdgeImageView;
import com.google.android.finsky.providers.C3947d;
import com.google.android.play.image.FifeImageView;
import com.google.android.play.layout.b;
import com.squareup.haha.perflib.io.MemoryMappedFileBuffer;
import com.squareup.leakcanary.C7582R;

public class CreatorAvatarCardClusterModuleLayout extends b implements C2584j, C2621k, C2622l, C2572y, C2573z {
    public FifeImageView f13960a;
    public View f13961b;
    public FadingEdgeImageView f13962c;
    public TextView f13963d;
    public TextView f13964e;
    public BucketRowLayout f13965f;
    public final int f13966g;
    public final int f13967h;
    public final int f13968i;
    public final int f13969j;
    public final int f13970k;
    public final int f13971l;
    public int f13972m;
    public int f13973n;
    public int f13974o;
    public float f13975p;
    public final int f13976q;
    public boolean f13977r;
    public final int f13978s;
    public C2581g f13979t;
    public C2577b f13980u;
    public C1611k f13981v;

    public CreatorAvatarCardClusterModuleLayout(Context context) {
        this(context, null);
    }

    public CreatorAvatarCardClusterModuleLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Resources resources = context.getResources();
        this.f13967h = resources.getDimensionPixelSize(C7582R.dimen.creator_avatar_cover_image_height_gap);
        this.f13966g = resources.getDimensionPixelSize(C7582R.dimen.creator_avatar_cover_image_height);
        this.f13968i = resources.getDimensionPixelSize(C7582R.dimen.creator_avatar_size);
        this.f13969j = resources.getDimensionPixelSize(C7582R.dimen.creator_avatar_bucket_gap);
        this.f13970k = resources.getDimensionPixelSize(C7582R.dimen.creator_avatar_text_gap);
        this.f13971l = resources.getDimensionPixelSize(C7582R.dimen.creator_avatar_more_button_bottom_gap);
        this.f13973n = C1473m.f7980a.mo2245h().m18477a(resources);
        this.f13978s = resources.getDimensionPixelSize(C7582R.dimen.creator_avatar_content_vpadding);
        this.f13976q = resources.getColor(C7582R.color.play_fg_primary);
    }

    protected void onFinishInflate() {
        ((C1406o) C3947d.m18649a(C1406o.class)).mo1806a(this);
        super.onFinishInflate();
        Resources resources = getContext().getResources();
        this.f13972m = this.f13980u.m13626a(resources, this.f13981v.m9286k(resources)).f13772a;
        if (this.f13972m > 0) {
            this.f13972m -= resources.getDimensionPixelSize(C7582R.dimen.play_card_inset);
        }
        this.f13960a = (FifeImageView) findViewById(C7582R.id.avatar_image);
        this.f13961b = findViewById(C7582R.id.cover_fill);
        this.f13962c = (FadingEdgeImageView) findViewById(C7582R.id.cover_image);
        this.f13964e = (TextView) findViewById(C7582R.id.title);
        this.f13963d = (TextView) findViewById(C7582R.id.more_button);
        this.f13965f = (BucketRowLayout) findViewById(C7582R.id.bucket_row);
    }

    private final int m13762a(int i) {
        int paddingLeft = getPaddingLeft();
        return paddingLeft + ((((((i - paddingLeft) - getPaddingRight()) - this.f13965f.getPaddingLeft()) - this.f13965f.getPaddingRight()) / this.f13973n) * (this.f13973n - this.f13974o));
    }

    protected void onMeasure(int i, int i2) {
        boolean z = false;
        int size = MeasureSpec.getSize(i);
        int i3 = size - (this.f13972m * 2);
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int a = m13762a(i3);
        int i4 = this.f13977r ? this.f13967h : 0;
        this.f13964e.measure(MeasureSpec.makeMeasureSpec(a - paddingLeft, Integer.MIN_VALUE), 0);
        this.f13963d.measure(0, 0);
        this.f13965f.measure(MeasureSpec.makeMeasureSpec((i3 - a) - paddingRight, MemoryMappedFileBuffer.DEFAULT_SIZE), 0);
        i3 = MeasureSpec.makeMeasureSpec(this.f13968i, MemoryMappedFileBuffer.DEFAULT_SIZE);
        this.f13960a.measure(i3, i3);
        if (this.f13977r) {
            i4 = this.f13965f.getMeasuredHeight() - (i4 * 2);
        } else {
            i4 = Math.max(this.f13966g, this.f13965f.getMeasuredHeight() + (this.f13969j * 2));
        }
        i3 = Math.max(i4, ((((this.f13970k * 2) + this.f13971l) + this.f13963d.getMeasuredHeight()) + this.f13964e.getMeasuredHeight()) + this.f13960a.getMeasuredHeight());
        this.f13962c.measure(MeasureSpec.makeMeasureSpec(Math.min((int) (((float) i3) / this.f13975p), size), MemoryMappedFileBuffer.DEFAULT_SIZE), MeasureSpec.makeMeasureSpec(i3, MemoryMappedFileBuffer.DEFAULT_SIZE));
        this.f13961b.measure(i, MeasureSpec.makeMeasureSpec(i3, MemoryMappedFileBuffer.DEFAULT_SIZE));
        if (this.f13962c.getVisibility() == 8 || this.f13962c.getMeasuredWidth() >= size) {
            this.f13962c.m16023b();
        } else {
            boolean z2 = this.f13974o > 0;
            paddingLeft = (int) (0.1f * ((float) size));
            FadingEdgeImageView fadingEdgeImageView = this.f13962c;
            if (!z2) {
                z = true;
            }
            fadingEdgeImageView.m16022a(z, true, paddingLeft, this.f13976q);
        }
        setMeasuredDimension(size, (this.f13978s * 2) + i3);
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int paddingLeft = getPaddingLeft();
        int measuredHeight = this.f13960a.getMeasuredHeight();
        int measuredWidth = this.f13960a.getMeasuredWidth();
        int measuredHeight2 = this.f13964e.getMeasuredHeight();
        int measuredWidth2 = this.f13964e.getMeasuredWidth();
        int measuredHeight3 = this.f13963d.getMeasuredHeight();
        int measuredWidth3 = this.f13963d.getMeasuredWidth();
        int measuredHeight4 = getMeasuredHeight();
        int measuredWidth4 = getMeasuredWidth();
        int a = m13762a(measuredWidth4 - (this.f13972m * 2));
        int i5 = (paddingLeft + a) / 2;
        this.f13961b.layout(0, this.f13978s, measuredWidth4, this.f13978s + this.f13961b.getMeasuredHeight());
        paddingLeft = this.f13974o > 0 ? 0 : (measuredWidth4 - this.f13962c.getMeasuredWidth()) / 2;
        this.f13962c.layout(paddingLeft, this.f13978s, this.f13962c.getMeasuredWidth() + paddingLeft, this.f13978s + this.f13962c.getMeasuredHeight());
        paddingLeft = (measuredHeight4 - this.f13965f.getMeasuredHeight()) / 2;
        this.f13965f.layout(this.f13972m + a, paddingLeft, (a + this.f13972m) + this.f13965f.getMeasuredWidth(), this.f13965f.getMeasuredHeight() + paddingLeft);
        paddingLeft = (this.f13972m + i5) - (measuredWidth3 / 2);
        measuredHeight4 = (measuredHeight4 - this.f13978s) - this.f13971l;
        this.f13963d.layout(paddingLeft, measuredHeight4 - measuredHeight3, measuredWidth3 + paddingLeft, measuredHeight4);
        paddingLeft = (this.f13972m + i5) - (measuredWidth2 / 2);
        measuredHeight3 = this.f13963d.getTop() - this.f13970k;
        this.f13964e.layout(paddingLeft, measuredHeight3 - measuredHeight2, measuredWidth2 + paddingLeft, measuredHeight3);
        paddingLeft = (this.f13972m + i5) - (measuredWidth / 2);
        measuredHeight2 = this.f13964e.getTop() - this.f13970k;
        this.f13960a.layout(paddingLeft, measuredHeight2 - measuredHeight, measuredWidth + paddingLeft, measuredHeight2);
    }
}
