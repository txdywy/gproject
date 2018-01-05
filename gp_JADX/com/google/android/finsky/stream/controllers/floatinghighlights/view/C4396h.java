package com.google.android.finsky.stream.controllers.floatinghighlights.view;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.v4.p028a.C0216d;
import android.support.v4.view.ai;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.finsky.bg.C1607g;
import com.google.android.finsky.bg.C1612l;
import com.google.android.finsky.frameworkviews.C2630c;
import com.google.android.finsky.frameworkviews.FadingEdgeImageView;
import com.google.android.finsky.frameworkviews.ae;
import com.google.android.finsky.p111d.C2482j;
import com.google.android.finsky.p111d.ad;
import com.google.android.finsky.providers.C3947d;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.play.image.FifeImageView;
import com.google.android.play.image.be;
import com.squareup.haha.perflib.io.MemoryMappedFileBuffer;
import com.squareup.leakcanary.C7582R;

public abstract class C4396h extends C2630c implements OnClickListener, ad, ae, be {
    public static final PorterDuffXfermode f22291k = new PorterDuffXfermode(Mode.SRC_IN);
    public int f22292f;
    public int f22293g;
    public float f22294h;
    public boolean f22295i;
    public boolean f22296j;
    public C1612l f22297l;
    public FadingEdgeImageView f22298m;
    public TextView f22299n;
    public View f22300o;
    public FrameLayout f22301p;
    public View f22302q;
    public ad f22303r;
    public C4390j f22304s;
    public boolean f22305t;
    public final int f22306u;
    public final int f22307v;
    public final int f22308w;
    public int f22309x;

    public C4396h(Context context) {
        this(context, null);
    }

    protected abstract C4397g getGradientConfig();

    public C4396h(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f22306u = C0216d.m1116c(context, C7582R.color.play_multi_primary);
        this.f22307v = C0216d.m1116c(context, C7582R.color.floating_highlights_banner_dark_theme_text_color);
        this.f22308w = C0216d.m1116c(context, C7582R.color.floating_highlights_banner_light_theme_text_color);
    }

    protected void onFinishInflate() {
        ((C1430k) C3947d.m18649a(C1430k.class)).mo1932a(this);
        super.onFinishInflate();
        this.f22301p = (FrameLayout) findViewById(C7582R.id.banner_image_container);
        this.f22302q = findViewById(C7582R.id.banner_image_gradient);
        this.f22298m = (FadingEdgeImageView) findViewById(C7582R.id.banner_image);
        this.f22298m.setOnLoadedListener(this);
        this.f22300o = findViewById(C7582R.id.banner_title_group);
        this.f22299n = (TextView) findViewById(C7582R.id.banner_title);
        setOnClickListener(this);
    }

    protected void onMeasure(int i, int i2) {
        int i3;
        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) getLayoutParams();
        int size = (MeasureSpec.getSize(i) - marginLayoutParams.leftMargin) - marginLayoutParams.rightMargin;
        int size2 = MeasureSpec.getSize(i2);
        int makeMeasureSpec = MeasureSpec.makeMeasureSpec(size2, MemoryMappedFileBuffer.DEFAULT_SIZE);
        marginLayoutParams = (MarginLayoutParams) this.f22300o.getLayoutParams();
        MarginLayoutParams marginLayoutParams2 = (MarginLayoutParams) this.f22301p.getLayoutParams();
        if (this.f22295i) {
            int i4 = (size - this.f22309x) / 2;
            marginLayoutParams.setMargins(i4, 0, i4, 0);
            marginLayoutParams2.setMargins(i4, 0, i4, 0);
        } else {
            marginLayoutParams.setMargins(0, 0, 0, 0);
            marginLayoutParams2.setMargins(0, 0, 0, 0);
        }
        this.f22300o.setLayoutParams(marginLayoutParams);
        this.f22301p.setLayoutParams(marginLayoutParams2);
        if (this.f22295i) {
            i3 = this.f22309x;
        } else {
            i3 = size;
        }
        this.f22300o.measure(MeasureSpec.makeMeasureSpec(i3, MemoryMappedFileBuffer.DEFAULT_SIZE), makeMeasureSpec);
        this.f22301p.measure(MeasureSpec.makeMeasureSpec(Math.min((int) ((2.0f * ((float) size2)) * this.f22294h), size), MemoryMappedFileBuffer.DEFAULT_SIZE), makeMeasureSpec);
        this.f22301p.setScaleX(ai.f1848a.mo400k(this) == 0 ? 1.0f : -1.0f);
        setMeasuredDimension(size, size2);
    }

    protected final void m20597a(C4403i c4403i, ad adVar, C4390j c4390j) {
        int i;
        C2482j.m13285a(getPlayStoreUiElement(), c4403i.f22354f);
        this.f22303r = adVar;
        this.f22304s = c4390j;
        this.f22296j = c4403i.f22351c;
        Resources resources = getResources();
        boolean z = c4403i.f22349a && resources.getBoolean(C7582R.bool.should_center_floating_highlights_banner_content_for_single_banner);
        this.f22295i = z;
        if (this.f22295i) {
            this.f22309x = resources.getDimensionPixelOffset(C7582R.dimen.floating_highlight_banner_single_banner_content_width);
        }
        TypedValue typedValue = new TypedValue();
        if (c4403i.f22349a) {
            i = C7582R.dimen.floating_highlight_banner_single_banner_image_scale_factor;
        } else if (c4403i.f22350b) {
            i = C7582R.dimen.floating_highlight_banner_dual_banners_image_scale_factor;
        } else {
            i = C7582R.dimen.floating_highlight_banner_multi_banners_image_scale_factor;
        }
        resources.getValue(i, typedValue, true);
        this.f22294h = typedValue.getFloat();
        if (c4403i.f22353e != null) {
            this.f22305t = c4403i.f22353e.m12247d();
            this.f22293g = C1607g.m9236a(c4403i.f22353e, this.f22306u);
            m20594c();
            this.f22297l.m9288a(this.f22298m, c4403i.f22353e.f11860f, c4403i.f22353e.f11863i);
            m20595d();
        } else {
            FinskyLog.m21667d("Missing Feature Image for Floating Highlights Banner.", new Object[0]);
        }
        this.f22299n.setText(c4403i.f22352d);
        mo4191b();
        this.f22303r.mo1219a(this);
    }

    public FadingEdgeImageView getBackgroundImage() {
        return this.f22298m;
    }

    protected void mo4191b() {
        this.f22292f = this.f22296j ? this.f22307v : this.f22308w;
        this.f22299n.setTextColor(this.f22292f);
    }

    private final void m20594c() {
        getCardViewGroupDelegate().mo3864a(this, this.f22293g);
    }

    private final void m20595d() {
        BitmapDrawable bitmapDrawable = (BitmapDrawable) this.f22298m.getDrawable();
        if (bitmapDrawable != null && bitmapDrawable.getBitmap() != null) {
            int width = bitmapDrawable.getBitmap().getWidth();
            int height = bitmapDrawable.getBitmap().getHeight();
            if (height == 0 || width == 0) {
                FinskyLog.m21669e("The banner image's drawable's width or height is 0.", new Object[0]);
                return;
            }
            Bitmap createBitmap = Bitmap.createBitmap(width, height, Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            canvas.drawColor(this.f22293g);
            Paint paint = new Paint();
            C4397g gradientConfig = getGradientConfig();
            paint.setShader(new LinearGradient(0.0f, 0.0f, (float) width, 0.0f, gradientConfig.mo4192a(), gradientConfig.mo4193b(), TileMode.CLAMP));
            paint.setXfermode(f22291k);
            canvas.drawRect(0.0f, 0.0f, (float) width, (float) height, paint);
            Drawable bitmapDrawable2 = new BitmapDrawable(getResources(), createBitmap);
            if (VERSION.SDK_INT >= 16) {
                this.f22302q.setBackground(bitmapDrawable2);
            } else {
                this.f22302q.setBackgroundDrawable(bitmapDrawable2);
            }
        }
    }

    public final void Z_() {
        this.f22298m.a();
        this.f22304s = null;
    }

    public ad getParentNode() {
        return this.f22303r;
    }

    public final void mo1219a(ad adVar) {
        throw new IllegalStateException("unwanted children");
    }

    public final void m20599a(FifeImageView fifeImageView, Bitmap bitmap) {
        if (!this.f22305t) {
            this.f22293g = Bitmap.createScaledBitmap(Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), Math.min(20, bitmap.getHeight())), 1, 1, false).getPixel(0, 0);
            m20594c();
        }
        m20595d();
        mo4191b();
    }

    public final void m20598a(FifeImageView fifeImageView) {
    }

    public void onClick(View view) {
        if (this.f22304s != null) {
            this.f22304s.mo4186a((ad) view);
        }
    }
}
