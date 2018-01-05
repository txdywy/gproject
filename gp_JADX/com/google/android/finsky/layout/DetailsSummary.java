package com.google.android.finsky.layout;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.PaintDrawable;
import android.support.v4.view.C0361r;
import android.support.v4.view.ai;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.TextView;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.bd.C1592a;
import com.google.android.finsky.frameworkviews.C2573z;
import com.google.android.finsky.frameworkviews.C2622l;
import com.google.android.play.layout.PlayCardThumbnail;
import com.google.android.play.utils.j;
import com.google.android.play.utils.k;
import com.squareup.haha.perflib.io.MemoryMappedFileBuffer;
import com.squareup.leakcanary.C7582R;
import java.util.List;

public class DetailsSummary extends ViewGroup implements C2622l, C2573z, C2623r {
    public View f14171a;
    public int f14172b;
    public int f14173c;
    public PlayCardThumbnail f14174d;
    public TextView f14175e;
    public View f14176f;
    public View f14177g;
    public View f14178h;
    public View f14179i;
    public View f14180j;
    public View f14181k;
    public View f14182l;
    public View f14183m;
    public View f14184n;
    public View f14185o;
    public View f14186p;
    public View f14187q;
    public View f14188r;
    public boolean f14189s;
    public final int f14190t;
    public final int f14191u;
    public final int f14192v;
    public final Rect f14193w;
    public final Rect f14194x;
    public boolean f14195y;

    public DetailsSummary(Context context) {
        this(context, null);
    }

    public DetailsSummary(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Resources resources = context.getResources();
        this.f14190t = resources.getDimensionPixelSize(C7582R.dimen.details_new_content_margin);
        this.f14173c = resources.getDimensionPixelSize(C7582R.dimen.summary_thumbnail_peek);
        this.f14191u = resources.getDimensionPixelSize(C7582R.dimen.details_title_offset);
        this.f14192v = resources.getDimensionPixelSize(C7582R.dimen.summary_wishlist_touch_extend);
        this.f14193w = new Rect();
        this.f14194x = new Rect();
        this.f14172b = 0;
    }

    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f14171a = findViewById(C7582R.id.title_background);
        this.f14174d = (PlayCardThumbnail) findViewById(C7582R.id.title_thumbnail_frame);
        boolean a = C1473m.f7980a.dj().mo2294a(12636865);
        if (this.f14174d != null && a) {
            this.f14174d.setAppThumbnailPaddingWithoutUpdate(getResources().getDimensionPixelSize(C7582R.dimen.details_title_cover_padding_v2));
        }
        this.f14175e = (TextView) findViewById(C7582R.id.title_title);
        if (a) {
            this.f14175e.setTextSize(0, (float) getResources().getDimensionPixelSize(C7582R.dimen.play_details_title_size_v3));
        }
        this.f14176f = findViewById(C7582R.id.title_wishlist_button);
        this.f14177g = findViewById(C7582R.id.title_creator_panel);
        this.f14178h = findViewById(C7582R.id.title_creator_block);
        this.f14179i = findViewById(C1592a.am.intValue());
        this.f14181k = findViewById(C7582R.id.title_rating_size);
        this.f14182l = findViewById(C7582R.id.title_content_rating_panel);
        this.f14180j = findViewById(C7582R.id.title_app_size_rating_line);
        this.f14183m = findViewById(C7582R.id.title_app_size);
        this.f14184n = findViewById(C7582R.id.title_tipper_sticker);
        this.f14185o = findViewById(C7582R.id.title_bylines);
        this.f14186p = findViewById(C7582R.id.title_extra_labels);
        this.f14187q = findViewById(C7582R.id.title_extra_labels_bottom);
        this.f14188r = findViewById(C7582R.id.title_details_summary_dynamic);
    }

    public void setThumbnailMode(int i) {
        int i2 = 1;
        if (this.f14172b != i) {
            this.f14172b = i;
            int color = getResources().getColor(C7582R.color.white);
            if (this.f14172b != 1) {
                i2 = 0;
            }
            if (i2 != 0) {
                setBackgroundDrawable(new InsetDrawable(new PaintDrawable(color), 0, this.f14173c, 0, 0));
            } else {
                setBackgroundColor(color);
            }
            ai.m1823a(this, 0, 0, 0, 0);
            requestLayout();
        }
    }

    public int getTopPeekAmount() {
        return this.f14172b == 1 ? this.f14173c : 0;
    }

    public final void mo2983b(List list) {
        list.add(this.f14175e);
        list.add(this.f14176f);
        list.add(this.f14177g);
        list.add(this.f14178h);
        list.add(this.f14179i);
        list.add(this.f14181k);
        list.add(this.f14182l);
        list.add(this.f14180j);
        list.add(this.f14183m);
        list.add(this.f14184n);
        list.add(this.f14185o);
        list.add(this.f14186p);
        list.add(this.f14187q);
        list.add(this.f14188r);
    }

    public final void mo2982a(List list) {
        list.add(Integer.valueOf(C7582R.id.title_title));
        list.add(Integer.valueOf(C7582R.id.title_wishlist_button));
        list.add(Integer.valueOf(C7582R.id.title_creator_panel));
        list.add(Integer.valueOf(C7582R.id.title_creator_block));
        list.add(C1592a.am);
        list.add(Integer.valueOf(C7582R.id.title_rating_size));
        list.add(Integer.valueOf(C7582R.id.title_content_rating));
        list.add(Integer.valueOf(C7582R.id.title_app_size_rating_line));
        list.add(Integer.valueOf(C7582R.id.title_app_size));
        list.add(Integer.valueOf(C7582R.id.title_tipper_sticker));
        list.add(Integer.valueOf(C7582R.id.title_bylines));
        list.add(Integer.valueOf(C7582R.id.title_extra_labels));
        list.add(Integer.valueOf(C7582R.id.title_extra_labels_bottom));
        list.add(Integer.valueOf(C7582R.id.title_details_summary_dynamic));
    }

    public void setPadding(int i, int i2, int i3, int i4) {
        if (this.f14171a != null) {
            this.f14171a.setPadding(i, i2, i3, i4);
        }
    }

    public void setPaddingRelative(int i, int i2, int i3, int i4) {
        if (this.f14171a != null) {
            ai.m1823a(this.f14171a, i, i2, i3, i4);
        }
    }

    public Drawable getBackground() {
        return this.f14171a == null ? null : this.f14171a.getBackground();
    }

    public void setBackgroundDrawable(Drawable drawable) {
        if (this.f14171a != null) {
            this.f14171a.setBackgroundDrawable(drawable);
        }
    }

    @TargetApi(16)
    public void setBackground(Drawable drawable) {
        if (this.f14171a != null) {
            this.f14171a.setBackground(drawable);
        }
    }

    public void setBackgroundColor(int i) {
        if (this.f14171a != null) {
            this.f14171a.setBackgroundColor(i);
        }
    }

    public void setBackgroundResource(int i) {
        if (this.f14171a != null) {
            this.f14171a.setBackgroundResource(i);
        }
    }

    protected void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5 = 1;
        int size = MeasureSpec.getSize(i);
        int i6 = size - (this.f14190t * 2);
        int topPeekAmount = getTopPeekAmount() + this.f14190t;
        if (this.f14174d == null || this.f14174d.getVisibility() == 8) {
            i3 = 0;
            i4 = i6;
        } else {
            LayoutParams layoutParams = this.f14174d.getLayoutParams();
            this.f14174d.measure(MeasureSpec.makeMeasureSpec(layoutParams.width, MemoryMappedFileBuffer.DEFAULT_SIZE), MeasureSpec.makeMeasureSpec(layoutParams.height, MemoryMappedFileBuffer.DEFAULT_SIZE));
            i6 -= this.f14174d.getMeasuredWidth();
            i3 = layoutParams.height;
            if (this.f14172b != 0) {
                i6 -= this.f14190t;
            }
            if (this.f14172b == 2) {
                i3 += this.f14190t;
                i4 = i6;
            } else {
                i4 = i6;
            }
        }
        if (this.f14176f.getVisibility() != 8) {
            this.f14176f.measure(0, 0);
            i6 = i4 - this.f14176f.getMeasuredWidth();
        } else {
            i6 = i4;
        }
        this.f14175e.measure(MeasureSpec.makeMeasureSpec(i6, MemoryMappedFileBuffer.DEFAULT_SIZE), 0);
        topPeekAmount += this.f14175e.getMeasuredHeight() - this.f14191u;
        View view = this.f14175e;
        if (this.f14177g.getVisibility() != 8) {
            this.f14177g.measure(MeasureSpec.makeMeasureSpec(i4, Integer.MIN_VALUE), 0);
            topPeekAmount += this.f14177g.getMeasuredHeight();
            view = this.f14177g;
        }
        if (this.f14185o.getVisibility() == 0) {
            this.f14185o.measure(MeasureSpec.makeMeasureSpec(i4, Integer.MIN_VALUE), 0);
            topPeekAmount += this.f14185o.getMeasuredHeight();
            view = this.f14185o;
        }
        if (this.f14181k.getVisibility() != 8) {
            view = this.f14181k.findViewById(C7582R.id.title_content_rating_panel);
            if (view.findViewById(C7582R.id.title_content_rating_icon).getVisibility() == 8) {
                View findViewById = view.findViewById(C7582R.id.title_content_rating);
                MarginLayoutParams marginLayoutParams = (MarginLayoutParams) findViewById.getLayoutParams();
                C0361r.m2050a(marginLayoutParams, 0);
                findViewById.setLayoutParams(marginLayoutParams);
            }
            this.f14181k.measure(MeasureSpec.makeMeasureSpec(i4, Integer.MIN_VALUE), 0);
            getResources().getBoolean(C7582R.bool.use_full_width_buttons);
            topPeekAmount += this.f14181k.getMeasuredHeight();
            view = this.f14181k;
        }
        if (this.f14183m.getVisibility() != 8) {
            this.f14183m.measure(MeasureSpec.makeMeasureSpec(i4, Integer.MIN_VALUE), 0);
            topPeekAmount += this.f14183m.getMeasuredHeight();
            view = this.f14183m;
        }
        if (this.f14184n.getVisibility() != 8) {
            this.f14184n.measure(MeasureSpec.makeMeasureSpec(i4, Integer.MIN_VALUE), 0);
            topPeekAmount += this.f14184n.getMeasuredHeight();
            view = this.f14184n;
        }
        if (this.f14178h.getVisibility() != 8) {
            this.f14178h.measure(MeasureSpec.makeMeasureSpec(i4, Integer.MIN_VALUE), 0);
            topPeekAmount += this.f14178h.getMeasuredHeight() + (this.f14190t / 2);
            view = this.f14178h;
        }
        if (this.f14179i.getVisibility() != 8) {
            this.f14179i.measure(MeasureSpec.makeMeasureSpec(i4, Integer.MIN_VALUE), 0);
            topPeekAmount += this.f14179i.getMeasuredHeight() + (this.f14190t / 2);
            view = this.f14179i;
        }
        if (this.f14186p.getVisibility() == 0) {
            this.f14186p.measure(MeasureSpec.makeMeasureSpec(i4, Integer.MIN_VALUE), 0);
            this.f14189s = view.getMeasuredWidth() + this.f14186p.getMeasuredWidth() <= i4;
            if (this.f14189s) {
                topPeekAmount += this.f14186p.getMeasuredHeight() - view.getMeasuredHeight();
            } else {
                topPeekAmount += this.f14186p.getMeasuredHeight();
            }
        }
        if (this.f14188r.getVisibility() != 8) {
            int i7 = size - (this.f14190t * 2);
            this.f14188r.measure(MeasureSpec.makeMeasureSpec(i7, Integer.MIN_VALUE), 0);
            int measuredWidth = this.f14188r.getMeasuredWidth();
            int measuredHeight = this.f14188r.getMeasuredHeight();
            if (this.f14172b != 0) {
                i6 = i3 - this.f14190t;
            } else {
                i6 = i3;
            }
            if (measuredWidth > i4 || measuredHeight + topPeekAmount > r0) {
                if (this.f14178h.getVisibility() == 0 && this.f14185o.getVisibility() == 8 && this.f14186p.getVisibility() == 8) {
                    i6 = this.f14178h.getMeasuredWidth();
                    if (i6 + measuredWidth <= i4) {
                        this.f14188r.measure(MeasureSpec.makeMeasureSpec(i4 - i6, MemoryMappedFileBuffer.DEFAULT_SIZE), 0);
                        i6 = Math.max(topPeekAmount, i3);
                        i5 = 0;
                        if (this.f14179i.getVisibility() == 0 && this.f14185o.getVisibility() == 8 && this.f14186p.getVisibility() == 8) {
                            measuredHeight = this.f14179i.getMeasuredWidth();
                            if (measuredWidth + measuredHeight <= i4) {
                                this.f14188r.measure(MeasureSpec.makeMeasureSpec(i4 - measuredHeight, MemoryMappedFileBuffer.DEFAULT_SIZE), 0);
                                i6 = Math.max(topPeekAmount, i3);
                                i5 = 0;
                            }
                        }
                        if (i5 != 0) {
                            this.f14188r.measure(MeasureSpec.makeMeasureSpec(i7, MemoryMappedFileBuffer.DEFAULT_SIZE), 0);
                            i6 = (Math.max(topPeekAmount, i3) + this.f14190t) + this.f14188r.getMeasuredHeight();
                            if (this.f14174d != null && this.f14172b == 2) {
                                i6 -= this.f14174d.getPaddingBottom();
                            }
                        }
                        i3 = i6;
                    }
                }
                i6 = 0;
                measuredHeight = this.f14179i.getMeasuredWidth();
                if (measuredWidth + measuredHeight <= i4) {
                    this.f14188r.measure(MeasureSpec.makeMeasureSpec(i4 - measuredHeight, MemoryMappedFileBuffer.DEFAULT_SIZE), 0);
                    i6 = Math.max(topPeekAmount, i3);
                    i5 = 0;
                }
                if (i5 != 0) {
                    this.f14188r.measure(MeasureSpec.makeMeasureSpec(i7, MemoryMappedFileBuffer.DEFAULT_SIZE), 0);
                    i6 = (Math.max(topPeekAmount, i3) + this.f14190t) + this.f14188r.getMeasuredHeight();
                    i6 -= this.f14174d.getPaddingBottom();
                }
                i3 = i6;
            } else {
                this.f14188r.measure(MeasureSpec.makeMeasureSpec(i4, MemoryMappedFileBuffer.DEFAULT_SIZE), 0);
            }
        } else {
            i3 = Math.max(topPeekAmount, i3);
        }
        if (this.f14187q.getVisibility() != 8) {
            this.f14187q.measure(MeasureSpec.makeMeasureSpec(size, MemoryMappedFileBuffer.DEFAULT_SIZE), 0);
            i6 = (this.f14187q.getMeasuredHeight() + i3) + this.f14187q.getPaddingTop();
        } else {
            i6 = this.f14190t + i3;
        }
        i6 += getPaddingTop() + getPaddingBottom();
        if (this.f14171a.getVisibility() != 8) {
            this.f14171a.measure(MeasureSpec.makeMeasureSpec(size, MemoryMappedFileBuffer.DEFAULT_SIZE), MeasureSpec.makeMeasureSpec(i6, MemoryMappedFileBuffer.DEFAULT_SIZE));
        }
        setMeasuredDimension(size, i6);
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int measuredWidth;
        boolean z2 = ai.f1848a.mo400k(this) == 0;
        int width = getWidth();
        int height = getHeight();
        int i6 = this.f14190t;
        int paddingTop = getPaddingTop();
        if (this.f14172b == 2) {
            paddingTop += this.f14190t;
        }
        if (this.f14174d == null || this.f14174d.getVisibility() == 8) {
            i5 = i6;
        } else {
            measuredWidth = this.f14174d.getMeasuredWidth();
            i5 = this.f14172b == 0 ? 0 : this.f14190t;
            int a = k.a(width, measuredWidth, z2, i5);
            this.f14174d.layout(a, paddingTop, a + measuredWidth, this.f14174d.getMeasuredHeight() + paddingTop);
            i5 = (i5 + measuredWidth) + i6;
        }
        paddingTop += getTopPeekAmount();
        if (this.f14172b != 2) {
            paddingTop += this.f14190t;
        }
        if (this.f14176f.getVisibility() != 8) {
            i6 = this.f14176f.getMeasuredWidth();
            measuredWidth = k.b(width, i6, z2, this.f14190t);
            this.f14176f.layout(measuredWidth, paddingTop, i6 + measuredWidth, this.f14176f.getMeasuredHeight() + paddingTop);
            this.f14176f.getHitRect(this.f14193w);
            this.f14193w.inset(-this.f14192v, -this.f14192v);
            if (!this.f14193w.equals(this.f14194x)) {
                setTouchDelegate(new j(this.f14193w, this.f14176f));
                this.f14194x.set(this.f14193w);
            }
        } else {
            this.f14194x.setEmpty();
            setTouchDelegate(null);
        }
        paddingTop -= this.f14191u;
        i6 = this.f14175e.getMeasuredWidth();
        measuredWidth = k.a(width, i6, z2, i5);
        this.f14175e.layout(measuredWidth, paddingTop, i6 + measuredWidth, this.f14175e.getMeasuredHeight() + paddingTop);
        paddingTop += this.f14175e.getMeasuredHeight();
        if (this.f14177g.getVisibility() != 8) {
            i6 = this.f14177g.getMeasuredWidth();
            measuredWidth = k.a(width, i6, z2, i5);
            this.f14177g.layout(measuredWidth, paddingTop, i6 + measuredWidth, this.f14177g.getMeasuredHeight() + paddingTop);
            paddingTop += this.f14177g.getMeasuredHeight();
        }
        if (this.f14185o.getVisibility() == 0) {
            i6 = this.f14185o.getMeasuredWidth();
            measuredWidth = k.a(width, i6, z2, i5);
            this.f14185o.layout(measuredWidth, paddingTop, i6 + measuredWidth, this.f14185o.getMeasuredHeight() + paddingTop);
            paddingTop += this.f14185o.getMeasuredHeight();
        }
        if (this.f14181k.getVisibility() != 8) {
            i6 = k.a(width, this.f14181k.getMeasuredWidth(), z2, i5);
            getResources().getBoolean(C7582R.bool.use_full_width_buttons);
            this.f14181k.layout(i6, paddingTop, this.f14181k.getMeasuredWidth() + i6, this.f14181k.getMeasuredHeight() + paddingTop);
            paddingTop += this.f14181k.getMeasuredHeight();
        }
        if (this.f14183m.getVisibility() == 0) {
            i6 = this.f14183m.getMeasuredWidth();
            measuredWidth = k.a(width, i6, z2, i5);
            this.f14183m.layout(measuredWidth, paddingTop, i6 + measuredWidth, this.f14183m.getMeasuredHeight() + paddingTop);
            paddingTop += this.f14183m.getMeasuredHeight();
        }
        if (this.f14184n.getVisibility() == 0) {
            i6 = this.f14184n.getMeasuredWidth();
            measuredWidth = k.a(width, i6, z2, i5);
            this.f14184n.layout(measuredWidth, paddingTop, i6 + measuredWidth, this.f14184n.getMeasuredHeight() + paddingTop);
            paddingTop += this.f14184n.getMeasuredHeight();
        }
        if (this.f14178h.getVisibility() != 8) {
            i6 = this.f14178h.getMeasuredWidth();
            measuredWidth = k.a(width, i6, z2, i5);
            paddingTop += this.f14190t / 2;
            this.f14178h.layout(measuredWidth, paddingTop, i6 + measuredWidth, this.f14178h.getMeasuredHeight() + paddingTop);
            paddingTop += this.f14178h.getMeasuredHeight();
        }
        if (this.f14179i.getVisibility() != 8) {
            i6 = this.f14179i.getMeasuredWidth();
            measuredWidth = k.a(width, i6, z2, i5);
            paddingTop += this.f14190t / 2;
            this.f14179i.layout(measuredWidth, paddingTop, i6 + measuredWidth, this.f14179i.getMeasuredHeight() + paddingTop);
            paddingTop += this.f14179i.getMeasuredHeight();
        }
        if (this.f14189s) {
            paddingTop -= this.f14186p.getMeasuredHeight();
        }
        i6 = height - getPaddingBottom();
        if (this.f14187q.getVisibility() != 8) {
            i6 -= this.f14187q.getPaddingTop();
            this.f14187q.layout(0, i6 - this.f14187q.getMeasuredHeight(), this.f14187q.getMeasuredWidth(), i6);
            i6 -= this.f14187q.getMeasuredHeight();
        } else {
            i6 -= this.f14190t;
        }
        if (this.f14188r.getVisibility() != 8) {
            paddingTop = this.f14188r.getMeasuredHeight();
            measuredWidth = this.f14188r.getMeasuredWidth();
            a = k.b(width, measuredWidth, z2, this.f14190t);
            this.f14188r.layout(a, i6 - paddingTop, measuredWidth + a, i6);
            paddingTop = (i6 - paddingTop) - this.f14186p.getMeasuredHeight();
        }
        if (this.f14186p.getVisibility() != 8) {
            int a2;
            i6 = this.f14186p.getMeasuredWidth();
            if (this.f14195y) {
                a2 = k.a(width, i6, z2, i5);
            } else {
                a2 = k.b(width, i6, z2, this.f14190t);
            }
            this.f14186p.layout(a2, paddingTop, i6 + a2, this.f14186p.getMeasuredHeight() + paddingTop);
        }
        if (this.f14171a.getVisibility() != 8) {
            this.f14171a.layout(0, 0, width, height);
        }
    }
}
