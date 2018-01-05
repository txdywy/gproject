package android.support.v7.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.support.v7.p040a.C0403j;
import android.support.v7.widget.C0464s;
import android.support.v7.widget.bg;
import android.support.v7.widget.cs;
import android.support.v7.widget.hn;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import com.squareup.haha.perflib.io.MemoryMappedFileBuffer;

public class ActionMenuItemView extends bg implements ai, C0464s, OnClickListener {
    public C0485t f2623b;
    public CharSequence f2624c;
    public Drawable f2625d;
    public C0465r f2626e;
    public cs f2627f;
    public C0473c f2628g;
    public boolean f2629h;
    public boolean f2630i;
    public int f2631j;
    public int f2632k;
    public int f2633l;

    public ActionMenuItemView(Context context) {
        this(context, null);
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Resources resources = context.getResources();
        this.f2629h = m2727e();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0403j.ActionMenuItemView, i, 0);
        this.f2631j = obtainStyledAttributes.getDimensionPixelSize(C0403j.ActionMenuItemView_android_minWidth, 0);
        obtainStyledAttributes.recycle();
        this.f2633l = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.f2632k = -1;
        setSaveEnabled(false);
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f2629h = m2727e();
        m2728f();
    }

    private final boolean m2727e() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        return i >= 480 || ((i >= 640 && configuration.screenHeightDp >= 480) || configuration.orientation == 2);
    }

    public void setPadding(int i, int i2, int i3, int i4) {
        this.f2632k = i;
        super.setPadding(i, i2, i3, i4);
    }

    public C0485t getItemData() {
        return this.f2623b;
    }

    public final void mo58a(C0485t c0485t) {
        this.f2623b = c0485t;
        setIcon(c0485t.getIcon());
        setTitle(c0485t.m2912a((ai) this));
        setId(c0485t.getItemId());
        setVisibility(c0485t.isVisible() ? 0 : 8);
        setEnabled(c0485t.isEnabled());
        if (c0485t.hasSubMenu() && this.f2627f == null) {
            this.f2627f = new C0472b(this);
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f2623b.hasSubMenu() && this.f2627f != null && this.f2627f.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void onClick(View view) {
        if (this.f2626e != null) {
            this.f2626e.mo626a(this.f2623b);
        }
    }

    public void setItemInvoker(C0465r c0465r) {
        this.f2626e = c0465r;
    }

    public void setPopupCallback(C0473c c0473c) {
        this.f2628g = c0473c;
    }

    public final boolean mo59a() {
        return true;
    }

    public void setCheckable(boolean z) {
    }

    public void setChecked(boolean z) {
    }

    public void setExpandedFormat(boolean z) {
        if (this.f2630i != z) {
            this.f2630i = z;
            if (this.f2623b != null) {
                this.f2623b.f2839n.m2837g();
            }
        }
    }

    private final void m2728f() {
        CharSequence charSequence;
        int i = 0;
        CharSequence charSequence2 = null;
        int i2 = !TextUtils.isEmpty(this.f2624c) ? 1 : 0;
        if (this.f2625d == null || ((this.f2623b.f2851z & 4) == 4 && (this.f2629h || this.f2630i))) {
            i = 1;
        }
        int i3 = i2 & i;
        if (i3 != 0) {
            charSequence = this.f2624c;
        } else {
            charSequence = null;
        }
        setText(charSequence);
        charSequence = this.f2623b.getContentDescription();
        if (TextUtils.isEmpty(charSequence)) {
            setContentDescription(i3 != 0 ? null : this.f2623b.getTitle());
        } else {
            setContentDescription(charSequence);
        }
        charSequence = this.f2623b.getTooltipText();
        if (TextUtils.isEmpty(charSequence)) {
            if (i3 == 0) {
                charSequence2 = this.f2623b.getTitle();
            }
            hn.m3839a(this, charSequence2);
            return;
        }
        hn.m3839a(this, charSequence);
    }

    public void setIcon(Drawable drawable) {
        this.f2625d = drawable;
        if (drawable != null) {
            float f;
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (intrinsicWidth > this.f2633l) {
                f = ((float) this.f2633l) / ((float) intrinsicWidth);
                intrinsicWidth = this.f2633l;
                intrinsicHeight = (int) (((float) intrinsicHeight) * f);
            }
            if (intrinsicHeight > this.f2633l) {
                f = ((float) this.f2633l) / ((float) intrinsicHeight);
                intrinsicHeight = this.f2633l;
                intrinsicWidth = (int) (((float) intrinsicWidth) * f);
            }
            drawable.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
        }
        setCompoundDrawables(drawable, null, null, null);
        m2728f();
    }

    public final boolean m2731b() {
        return !TextUtils.isEmpty(getText());
    }

    public void setTitle(CharSequence charSequence) {
        this.f2624c = charSequence;
        m2728f();
    }

    public final boolean mo624c() {
        return m2731b() && this.f2623b.getIcon() == null;
    }

    public final boolean mo625d() {
        return m2731b();
    }

    protected void onMeasure(int i, int i2) {
        boolean b = m2731b();
        if (b && this.f2632k >= 0) {
            super.setPadding(this.f2632k, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i, i2);
        int mode = MeasureSpec.getMode(i);
        int size = MeasureSpec.getSize(i);
        int measuredWidth = getMeasuredWidth();
        size = mode == Integer.MIN_VALUE ? Math.min(size, this.f2631j) : this.f2631j;
        if (mode != MemoryMappedFileBuffer.DEFAULT_SIZE && this.f2631j > 0 && measuredWidth < size) {
            super.onMeasure(MeasureSpec.makeMeasureSpec(size, MemoryMappedFileBuffer.DEFAULT_SIZE), i2);
        }
        if (!b && this.f2625d != null) {
            super.setPadding((getMeasuredWidth() - this.f2625d.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }
}
