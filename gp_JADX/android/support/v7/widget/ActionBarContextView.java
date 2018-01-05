package android.support.v7.widget;

import android.content.Context;
import android.support.v4.view.ai;
import android.support.v4.view.bt;
import android.support.v7.p040a.C0394a;
import android.support.v7.p040a.C0399f;
import android.support.v7.p040a.C0400g;
import android.support.v7.p040a.C0403j;
import android.support.v7.view.C0412b;
import android.support.v7.view.menu.C0471p;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.squareup.haha.perflib.io.MemoryMappedFileBuffer;

public class ActionBarContextView extends C0490a {
    public CharSequence f2874i;
    public CharSequence f2875j;
    public View f2876k;
    public View f2877l;
    public LinearLayout f2878m;
    public TextView f2879n;
    public TextView f2880o;
    public int f2881p;
    public int f2882q;
    public boolean f2883r;
    public int f2884s;

    public ActionBarContextView(Context context) {
        this(context, null);
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0394a.actionModeStyle);
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        hc a = hc.m3769a(context, attributeSet, C0403j.ActionMode, i, 0);
        ai.m1826a((View) this, a.m3771a(C0403j.ActionMode_background));
        this.f2881p = a.m3783g(C0403j.ActionMode_titleTextStyle, 0);
        this.f2882q = a.m3783g(C0403j.ActionMode_subtitleTextStyle, 0);
        this.e = a.m3781f(C0403j.ActionMode_height, 0);
        this.f2884s = a.m3783g(C0403j.ActionMode_closeItemLayout, C0400g.abc_action_mode_close_item_material);
        a.f3558b.recycle();
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.d != null) {
            this.d.m3885d();
            this.d.m3887f();
        }
    }

    public void setContentHeight(int i) {
        this.e = i;
    }

    public void setCustomView(View view) {
        if (this.f2877l != null) {
            removeView(this.f2877l);
        }
        this.f2877l = view;
        if (!(view == null || this.f2878m == null)) {
            removeView(this.f2878m);
            this.f2878m = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setTitle(CharSequence charSequence) {
        this.f2874i = charSequence;
        m2937c();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f2875j = charSequence;
        m2937c();
    }

    public CharSequence getTitle() {
        return this.f2874i;
    }

    public CharSequence getSubtitle() {
        return this.f2875j;
    }

    private final void m2937c() {
        int i;
        int i2 = 8;
        Object obj = 1;
        if (this.f2878m == null) {
            LayoutInflater.from(getContext()).inflate(C0400g.abc_action_bar_title_item, this);
            this.f2878m = (LinearLayout) getChildAt(getChildCount() - 1);
            this.f2879n = (TextView) this.f2878m.findViewById(C0399f.action_bar_title);
            this.f2880o = (TextView) this.f2878m.findViewById(C0399f.action_bar_subtitle);
            if (this.f2881p != 0) {
                this.f2879n.setTextAppearance(getContext(), this.f2881p);
            }
            if (this.f2882q != 0) {
                this.f2880o.setTextAppearance(getContext(), this.f2882q);
            }
        }
        this.f2879n.setText(this.f2874i);
        this.f2880o.setText(this.f2875j);
        Object obj2 = !TextUtils.isEmpty(this.f2874i) ? 1 : null;
        if (TextUtils.isEmpty(this.f2875j)) {
            obj = null;
        }
        TextView textView = this.f2880o;
        if (obj != null) {
            i = 0;
        } else {
            i = 8;
        }
        textView.setVisibility(i);
        LinearLayout linearLayout = this.f2878m;
        if (!(obj2 == null && obj == null)) {
            i2 = 0;
        }
        linearLayout.setVisibility(i2);
        if (this.f2878m.getParent() == null) {
            addView(this.f2878m);
        }
    }

    public final void m2939a(C0412b c0412b) {
        if (this.f2876k == null) {
            this.f2876k = LayoutInflater.from(getContext()).inflate(this.f2884s, this, false);
            addView(this.f2876k);
        } else if (this.f2876k.getParent() == null) {
            addView(this.f2876k);
        }
        this.f2876k.findViewById(C0399f.action_mode_close_button).setOnClickListener(new C0495e(c0412b));
        C0471p c0471p = (C0471p) c0412b.mo605b();
        if (this.d != null) {
            this.d.m3886e();
        }
        this.d = new C0502k(getContext());
        this.d.m3883b();
        LayoutParams layoutParams = new LayoutParams(-2, -1);
        c0471p.m2822a(this.d, this.b);
        this.c = (ActionMenuView) this.d.mo922a((ViewGroup) this);
        ai.m1826a(this.c, null);
        addView(this.c, layoutParams);
    }

    public final void m2941b() {
        removeAllViews();
        this.f2877l = null;
        this.c = null;
    }

    public final boolean mo697a() {
        if (this.d != null) {
            return this.d.m3884c();
        }
        return false;
    }

    protected LayoutParams generateDefaultLayoutParams() {
        return new MarginLayoutParams(-1, -2);
    }

    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new MarginLayoutParams(getContext(), attributeSet);
    }

    protected void onMeasure(int i, int i2) {
        int i3 = MemoryMappedFileBuffer.DEFAULT_SIZE;
        int i4 = 0;
        if (MeasureSpec.getMode(i) != MemoryMappedFileBuffer.DEFAULT_SIZE) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_width=\"match_parent\" (or fill_parent)");
        } else if (MeasureSpec.getMode(i2) == 0) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_height=\"wrap_content\"");
        } else {
            int i5;
            int a;
            int size = MeasureSpec.getSize(i);
            if (this.e > 0) {
                i5 = this.e;
            } else {
                i5 = MeasureSpec.getSize(i2);
            }
            int paddingTop = getPaddingTop() + getPaddingBottom();
            int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
            int i6 = i5 - paddingTop;
            int makeMeasureSpec = MeasureSpec.makeMeasureSpec(i6, Integer.MIN_VALUE);
            if (this.f2876k != null) {
                a = C0490a.m2931a(this.f2876k, paddingLeft, makeMeasureSpec);
                MarginLayoutParams marginLayoutParams = (MarginLayoutParams) this.f2876k.getLayoutParams();
                paddingLeft = a - (marginLayoutParams.rightMargin + marginLayoutParams.leftMargin);
            }
            if (this.c != null && this.c.getParent() == this) {
                paddingLeft = C0490a.m2931a(this.c, paddingLeft, makeMeasureSpec);
            }
            if (this.f2878m != null && this.f2877l == null) {
                if (this.f2883r) {
                    this.f2878m.measure(MeasureSpec.makeMeasureSpec(0, 0), makeMeasureSpec);
                    a = this.f2878m.getMeasuredWidth();
                    makeMeasureSpec = a <= paddingLeft ? 1 : 0;
                    if (makeMeasureSpec != 0) {
                        paddingLeft -= a;
                    }
                    this.f2878m.setVisibility(makeMeasureSpec != 0 ? 0 : 8);
                } else {
                    paddingLeft = C0490a.m2931a(this.f2878m, paddingLeft, makeMeasureSpec);
                }
            }
            if (this.f2877l != null) {
                int min;
                LayoutParams layoutParams = this.f2877l.getLayoutParams();
                makeMeasureSpec = layoutParams.width != -2 ? MemoryMappedFileBuffer.DEFAULT_SIZE : Integer.MIN_VALUE;
                if (layoutParams.width >= 0) {
                    paddingLeft = Math.min(layoutParams.width, paddingLeft);
                }
                if (layoutParams.height == -2) {
                    i3 = Integer.MIN_VALUE;
                }
                if (layoutParams.height >= 0) {
                    min = Math.min(layoutParams.height, i6);
                } else {
                    min = i6;
                }
                this.f2877l.measure(MeasureSpec.makeMeasureSpec(paddingLeft, makeMeasureSpec), MeasureSpec.makeMeasureSpec(min, i3));
            }
            if (this.e <= 0) {
                makeMeasureSpec = getChildCount();
                i5 = 0;
                while (i4 < makeMeasureSpec) {
                    paddingLeft = getChildAt(i4).getMeasuredHeight() + paddingTop;
                    if (paddingLeft <= i5) {
                        paddingLeft = i5;
                    }
                    i4++;
                    i5 = paddingLeft;
                }
                setMeasuredDimension(size, i5);
                return;
            }
            setMeasuredDimension(size, i5);
        }
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        boolean a = id.m3869a(this);
        int paddingRight = a ? (i3 - i) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
        if (!(this.f2876k == null || this.f2876k.getVisibility() == 8)) {
            MarginLayoutParams marginLayoutParams = (MarginLayoutParams) this.f2876k.getLayoutParams();
            int i6 = a ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            i5 = a ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            paddingRight = C0490a.m2930a(paddingRight, i6, a);
            paddingRight = C0490a.m2930a(paddingRight + C0490a.m2932a(this.f2876k, paddingRight, paddingTop, paddingTop2, a), i5, a);
        }
        if (!(this.f2878m == null || this.f2877l != null || this.f2878m.getVisibility() == 8)) {
            paddingRight += C0490a.m2932a(this.f2878m, paddingRight, paddingTop, paddingTop2, a);
        }
        if (this.f2877l != null) {
            C0490a.m2932a(this.f2877l, paddingRight, paddingTop, paddingTop2, a);
        }
        i5 = a ? getPaddingLeft() : (i3 - i) - getPaddingRight();
        if (this.c != null) {
            C0490a.m2932a(this.c, i5, paddingTop, paddingTop2, !a);
        }
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() == 32) {
            accessibilityEvent.setSource(this);
            accessibilityEvent.setClassName(getClass().getName());
            accessibilityEvent.setPackageName(getContext().getPackageName());
            accessibilityEvent.setContentDescription(this.f2874i);
            return;
        }
        super.onInitializeAccessibilityEvent(accessibilityEvent);
    }

    public void setTitleOptional(boolean z) {
        if (z != this.f2883r) {
            requestLayout();
        }
        this.f2883r = z;
    }

    public /* bridge */ /* synthetic */ void setVisibility(int i) {
        super.setVisibility(i);
    }

    public final /* bridge */ /* synthetic */ bt mo696a(int i, long j) {
        return super.mo696a(i, j);
    }

    public /* bridge */ /* synthetic */ int getAnimatedVisibility() {
        return super.getAnimatedVisibility();
    }

    public /* bridge */ /* synthetic */ int getContentHeight() {
        return super.getContentHeight();
    }

    public /* bridge */ /* synthetic */ boolean onHoverEvent(MotionEvent motionEvent) {
        return super.onHoverEvent(motionEvent);
    }

    public /* bridge */ /* synthetic */ boolean onTouchEvent(MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }
}
