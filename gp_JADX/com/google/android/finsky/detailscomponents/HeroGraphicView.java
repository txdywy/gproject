package com.google.android.finsky.detailscomponents;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Matrix.ScaleToFit;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.TextView;
import com.android.vending.C0629a;
import com.google.android.finsky.bg.C1601a;
import com.google.android.finsky.bg.C1608h;
import com.google.android.finsky.bg.C1611k;
import com.google.android.finsky.bg.C1612l;
import com.google.android.finsky.bg.af;
import com.google.android.finsky.bm.C1040f;
import com.google.android.finsky.cv.p177a.bd;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.frameworkviews.C2572y;
import com.google.android.finsky.frameworkviews.C2573z;
import com.google.android.finsky.p111d.C2473o;
import com.google.android.finsky.p111d.ad;
import com.google.android.finsky.providers.C3947d;
import com.google.android.finsky.utils.C4682m;
import com.google.android.play.image.FifeImageView;
import com.google.android.play.image.be;
import com.google.android.play.layout.b;
import com.google.android.play.search.PlaySearchToolbar;
import com.squareup.haha.perflib.io.MemoryMappedFileBuffer;
import com.squareup.leakcanary.C7582R;

public class HeroGraphicView extends b implements C2572y, C2573z, be {
    public C2577b f13718A;
    public C2581g f13719B;
    public C1611k f13720C;
    public FifeImageView f13721a;
    public ImageView f13722b;
    public View f13723c;
    public View f13724d;
    public View f13725e;
    public TextView f13726f;
    public TextView f13727g;
    public float f13728h;
    public int f13729i;
    public int f13730j;
    public boolean f13731k;
    public boolean f13732l;
    public boolean f13733m;
    public int f13734n;
    public int f13735o;
    public boolean f13736p;
    public boolean f13737q;
    public be f13738r;
    public boolean f13739s;
    public boolean f13740t;
    public boolean f13741u;
    public C2586l f13742v;
    public C2473o f13743w;
    public boolean f13744x;
    public C1612l f13745y;
    public af f13746z;

    public HeroGraphicView(Context context) {
        this(context, null);
    }

    public HeroGraphicView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        ((C1375d) C3947d.m18649a(C1375d.class)).mo1803a(this);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0629a.HeroGraphicView);
        this.f13733m = obtainStyledAttributes.getBoolean(0, false);
        this.f13736p = obtainStyledAttributes.getBoolean(1, false);
        this.f13732l = this.f13733m;
        obtainStyledAttributes.recycle();
        this.f13730j = 0;
        this.f13744x = false;
    }

    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f13721a = (FifeImageView) findViewById(C7582R.id.hero_image);
        this.f13722b = (ImageView) findViewById(C7582R.id.play_icon);
        this.f13723c = findViewById(C7582R.id.corpus_fill);
        this.f13724d = findViewById(C7582R.id.hero_image_top_overlay);
        this.f13725e = findViewById(C7582R.id.hero_image_bottom_overlay);
        this.f13726f = (TextView) findViewById(C7582R.id.hero_title);
        this.f13727g = (TextView) findViewById(C7582R.id.hero_subtitle);
        this.f13742v = this.f13718A.m13627a(getContext(), this.f13722b, this);
    }

    public final void m13596a(FifeImageView fifeImageView, Bitmap bitmap) {
        this.f13741u = true;
        if (!this.f13739s) {
            this.f13721a.setVisibility(0);
        }
        if (this.f13732l && bitmap != null) {
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            int width2 = this.f13721a.getWidth();
            float f = ((float) height) / ((float) width);
            Matrix matrix = new Matrix();
            matrix.setRectToRect(new RectF(0.0f, 0.0f, (float) width, (float) height), new RectF(0.0f, 0.0f, (float) width2, (float) ((int) (((float) width2) * f))), ScaleToFit.FILL);
            this.f13721a.setScaleType(ScaleType.MATRIX);
            this.f13721a.setImageMatrix(matrix);
        }
        if (this.f13738r != null) {
            this.f13738r.a(fifeImageView, bitmap);
        }
    }

    public final void m13595a(FifeImageView fifeImageView) {
        if (!this.f13739s) {
            setCorpusFillMode(0);
            this.f13721a.setVisibility(0);
            if (this.f13740t) {
                this.f13722b.setVisibility(0);
            }
        }
        if (this.f13738r != null) {
            this.f13738r.a(fifeImageView);
        }
    }

    @TargetApi(21)
    public final void m13588a() {
        boolean z = true;
        this.f13739s = true;
        if (this.f13722b.getVisibility() != 0) {
            z = false;
        }
        this.f13740t = z;
        this.f13723c.setAlpha(0.0f);
        this.f13723c.animate().alpha(1.0f).setDuration(400).start();
        this.f13721a.setVisibility(4);
        this.f13722b.setVisibility(4);
    }

    @TargetApi(21)
    public final void m13599b() {
        this.f13739s = false;
        if (this.f13741u) {
            this.f13721a.setVisibility(0);
            this.f13721a.setAlpha(0.0f);
            this.f13721a.animate().alpha(1.0f).setDuration(400).setListener(new C2582h(this)).start();
            if (this.f13740t) {
                this.f13722b.setVisibility(0);
                this.f13722b.setScaleX(0.0f);
                this.f13722b.setScaleY(0.0f);
                this.f13722b.animate().scaleY(1.0f).setDuration(400).start();
                this.f13722b.animate().scaleX(1.0f).setDuration(400).start();
            }
        }
    }

    public final void m13597a(String str, String str2, boolean z, boolean z2, int i, ad adVar, boolean z3, byte[] bArr) {
        if (this.f13743w == null) {
            this.f13743w = new C2473o(120, adVar);
        }
        if (z3) {
            C2586l c2586l = this.f13742v;
            Activity a = C4682m.m21821a(c2586l.f13773a, Activity.class);
            if (a instanceof C1040f) {
                c2586l.f13774b.setVisibility(0);
                View view = C1601a.m9200a(c2586l.f13773a) ? c2586l.f13774b : c2586l.f13775c;
                view.setClickable(true);
                view.setOnClickListener(new C2587m(c2586l, str, a, adVar, bArr));
            }
        } else {
            this.f13742v.m13645a(str, str2, z, z2, i, this.f13743w, adVar);
        }
        if (this.f13739s) {
            this.f13740t = true;
            this.f13722b.setVisibility(4);
        }
    }

    public final void m13598a(Object... objArr) {
        setContentDescription(getContext().getString(C7582R.string.content_description_generic_trailer, objArr));
    }

    public void setFullScreenMode(boolean z) {
        this.f13733m = z;
    }

    public void setUseDetailsPageWidth(boolean z) {
        this.f13744x = z;
    }

    public final void m13591a(Document document) {
        this.f13731k = false;
        this.f13732l = true;
        this.f13728h = 0.5625f;
        bd a = C2581g.m13637a(document, 13);
        if (a == null) {
            setVisibility(8);
            return;
        }
        this.f13745y.m9288a(this.f13721a, a.f11860f, a.f11863i);
        setBackgroundResource(0);
    }

    public final void m13592a(Document document, ad adVar) {
        this.f13731k = false;
        this.f13728h = C2581g.m13632a(document.f14885a.f12098e);
        m13594a(document, false, adVar, false);
        bd a = C2581g.m13636a(document);
        this.f13721a.setVisibility(0);
        this.f13745y.m9288a(this.f13721a, a.f11860f, a.f11863i);
        this.f13736p = true;
    }

    public final void m13593a(Document document, boolean z, ad adVar) {
        m13589a(C2581g.m13638c(document, z), document, C2586l.m13642a(document), adVar);
    }

    public void setCorpusForFill(int i) {
        setFillColor(m13587a(i));
    }

    public void setFillColor(int i) {
        if (this.f13723c != null) {
            this.f13723c.setBackgroundColor(i);
        }
    }

    public void setCorpusFillMode(int i) {
        int i2 = 8;
        if (this.f13723c != null && !this.f13739s && this.f13730j != i) {
            int i3;
            this.f13730j = i;
            FifeImageView fifeImageView = this.f13721a;
            if (this.f13730j == 2) {
                i3 = 8;
            } else {
                i3 = 0;
            }
            fifeImageView.setVisibility(i3);
            View view = this.f13723c;
            if (this.f13730j != 0) {
                i2 = 0;
            }
            view.setVisibility(i2);
        }
    }

    public final int m13587a(int i) {
        return C1608h.m9243a(getContext(), i);
    }

    public void setOnLoadedListener(be beVar) {
        this.f13738r = beVar;
    }

    public final void m13589a(bd bdVar, Document document, boolean z, ad adVar) {
        m13594a(document, z, adVar, false);
        if (bdVar != null) {
            if (!this.f13733m) {
                this.f13728h = C2581g.m13632a(document.f14885a.f12098e);
            } else if (bdVar.f11859e == null || bdVar.f11859e.f11878b <= 0 || bdVar.f11859e.f11879c <= 0) {
                this.f13728h = C2581g.m13633a(document, this.f13733m);
            } else {
                this.f13728h = ((float) bdVar.f11859e.f11879c) / ((float) bdVar.f11859e.f11878b);
            }
        }
        m13586b(bdVar, false, document.f14885a.f12099f);
    }

    public final void m13590a(bd bdVar, boolean z, int i) {
        this.f13742v.m13644a();
        if (bdVar != null) {
            this.f13728h = 0.5625f;
            if (this.f13733m && bdVar.f11859e != null && bdVar.f11859e.f11878b > 0 && bdVar.f11859e.f11879c > 0) {
                this.f13728h = ((float) bdVar.f11859e.f11879c) / ((float) bdVar.f11859e.f11878b);
            }
        }
        m13586b(bdVar, z, i);
    }

    private final void m13586b(bd bdVar, boolean z, int i) {
        this.f13731k = true;
        setCorpusForFill(i);
        if (bdVar != null) {
            setCorpusFillMode(1);
            this.f13721a.setOnLoadedListener(this);
            this.f13721a.setToFadeInAfterLoad(false);
            this.f13745y.m9288a(this.f13721a, bdVar.f11860f, bdVar.f11863i);
            setVisibility(0);
        } else if (z) {
            setVisibility(8);
        } else {
            setCorpusFillMode(2);
        }
    }

    protected void onMeasure(int i, int i2) {
        boolean z;
        int i3;
        int i4 = 1;
        int i5 = 0;
        this.f13722b.measure(0, 0);
        int size = MeasureSpec.getSize(i);
        int size2 = MeasureSpec.getSize(i2);
        Resources resources = getContext().getResources();
        boolean n = C1611k.m9272n(resources);
        if (this.f13744x) {
            z = (C1611k.m9271m(resources) > resources.getDimensionPixelSize(C7582R.dimen.width_for_fixed_width_pages) ? 1 : 0) | n;
        } else {
            z = n;
        }
        Context context = getContext();
        if (this.f13721a.getVisibility() != 8) {
            n = true;
        } else {
            n = false;
        }
        this.f13729i = C2581g.m13635a(context, size, n, this.f13728h, z);
        if (this.f13733m && this.f13730j == 2 && this.f13734n == 0) {
            this.f13729i /= 2;
        }
        Context context2 = getContext();
        if (this.f13737q || (this.f13733m && this.f13731k)) {
            i3 = size2;
        } else {
            Resources resources2 = context2.getResources();
            z = this.f13736p || C1611k.m9272n(resources2);
            if (this.f13744x) {
                if (C1611k.m9271m(resources2) <= resources2.getDimensionPixelSize(C7582R.dimen.width_for_fixed_width_pages)) {
                    i4 = 0;
                }
                z |= i4;
            }
            i3 = C2581g.m13634a(context2, size, this.f13728h, z);
        }
        if (this.f13726f.getVisibility() != 8) {
            this.f13726f.measure(MeasureSpec.makeMeasureSpec(size, MemoryMappedFileBuffer.DEFAULT_SIZE), 0);
        }
        if (this.f13727g.getVisibility() != 8) {
            this.f13727g.measure(MeasureSpec.makeMeasureSpec(size, MemoryMappedFileBuffer.DEFAULT_SIZE), 0);
        }
        if (this.f13721a.getVisibility() == 8) {
            this.f13725e.measure(i, MeasureSpec.makeMeasureSpec(0, MemoryMappedFileBuffer.DEFAULT_SIZE));
        } else {
            if (!this.f13733m || this.f13734n <= 0) {
                i4 = i3;
            } else {
                i4 = this.f13729i + this.f13734n;
            }
            this.f13721a.measure(i, MeasureSpec.makeMeasureSpec(i4, MemoryMappedFileBuffer.DEFAULT_SIZE));
            if (this.f13725e.getVisibility() != 8) {
                if (this.f13741u) {
                    Drawable drawable = this.f13721a.getDrawable();
                    if (drawable == null) {
                        this.f13735o = i4;
                    } else {
                        this.f13735o = Math.min((drawable.getIntrinsicHeight() * size) / drawable.getIntrinsicWidth(), i4);
                    }
                    i5 = this.f13735o - Math.min(i4 / 2, (this.f13729i - this.f13726f.getMeasuredHeight()) - this.f13727g.getMeasuredHeight());
                }
                this.f13725e.measure(i, MeasureSpec.makeMeasureSpec(i5, MemoryMappedFileBuffer.DEFAULT_SIZE));
            }
        }
        if (!(this.f13723c == null || this.f13723c.getVisibility() == 8)) {
            i4 = this.f13730j == 2 ? this.f13733m ? this.f13729i + (PlaySearchToolbar.a(getContext()) * 2) : this.f13729i : (!this.f13733m || this.f13728h <= 0.0f) ? i3 : Math.min((int) (((float) size) * this.f13728h), this.f13721a.getMeasuredHeight());
            this.f13723c.measure(i, MeasureSpec.makeMeasureSpec(i4, MemoryMappedFileBuffer.DEFAULT_SIZE));
        }
        if (this.f13724d.getVisibility() != 8) {
            this.f13724d.measure(i, MeasureSpec.makeMeasureSpec(this.f13724d.getLayoutParams().height, MemoryMappedFileBuffer.DEFAULT_SIZE));
        }
        setMeasuredDimension(size, i3);
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int width = getWidth();
        int height = getHeight();
        int paddingRight = getPaddingRight();
        int measuredWidth = this.f13721a.getMeasuredWidth();
        int i5 = ((width - measuredWidth) - paddingRight) / 2;
        this.f13721a.layout(i5, 0, measuredWidth + i5, this.f13721a.getMeasuredHeight());
        if (this.f13722b.getVisibility() != 8) {
            measuredWidth = this.f13722b.getMeasuredWidth();
            i5 = this.f13722b.getMeasuredHeight();
            int i6 = ((width - measuredWidth) - paddingRight) / 2;
            if (this.f13729i == 0 || this.f13736p) {
                paddingRight = height;
            } else {
                paddingRight = this.f13729i;
            }
            paddingRight = (paddingRight - i5) / 2;
            this.f13722b.layout(i6, paddingRight, measuredWidth + i6, i5 + paddingRight);
        }
        if (!(this.f13723c == null || this.f13723c.getVisibility() == 8)) {
            this.f13723c.layout(0, 0, this.f13723c.getMeasuredWidth(), this.f13723c.getMeasuredHeight());
        }
        if (this.f13724d.getVisibility() != 8) {
            this.f13724d.layout(0, 0, width, this.f13724d.getMeasuredHeight());
        }
        if (this.f13725e.getVisibility() != 8) {
            this.f13725e.layout(0, this.f13735o - this.f13725e.getMeasuredHeight(), width, this.f13735o);
        }
        if (this.f13726f.getVisibility() != 8) {
            if (this.f13729i != 0) {
                height = this.f13729i;
            }
            if (this.f13727g.getVisibility() != 8) {
                this.f13727g.layout(0, height - this.f13727g.getMeasuredHeight(), width, height);
                height -= this.f13727g.getMeasuredHeight();
            }
            this.f13726f.layout(0, height - this.f13726f.getMeasuredHeight(), width, height);
        }
    }

    public final void m13594a(Document document, boolean z, ad adVar, boolean z2) {
        if (C2586l.m13643b(document)) {
            m13597a(((bd) document.m14644c(3).get(0)).f11860f, document.f14885a.f12100g, z, document.f14885a.f12088E, document.f14885a.f12099f, adVar, z2, document.f14885a.f12087D);
            return;
        }
        this.f13742v.m13644a();
    }
}
