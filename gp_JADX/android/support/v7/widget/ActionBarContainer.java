package android.support.v7.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.v4.view.ai;
import android.support.v7.p040a.C0399f;
import android.support.v7.p040a.C0403j;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.ActionMode.Callback;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import com.squareup.haha.perflib.io.MemoryMappedFileBuffer;

public class ActionBarContainer extends FrameLayout {
    public boolean f2856a;
    public View f2857b;
    public View f2858c;
    public View f2859d;
    public Drawable f2860e;
    public Drawable f2861f;
    public Drawable f2862g;
    public boolean f2863h;
    public boolean f2864i;
    public int f2865j;

    public ActionBarContainer(Context context) {
        this(context, null);
    }

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        ai.m1826a((View) this, VERSION.SDK_INT >= 21 ? new C0494d(this) : new C0493c(this));
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0403j.ActionBar);
        this.f2860e = obtainStyledAttributes.getDrawable(C0403j.ActionBar_background);
        this.f2861f = obtainStyledAttributes.getDrawable(C0403j.ActionBar_backgroundStacked);
        this.f2865j = obtainStyledAttributes.getDimensionPixelSize(C0403j.ActionBar_height, -1);
        if (getId() == C0399f.split_action_bar) {
            this.f2863h = true;
            this.f2862g = obtainStyledAttributes.getDrawable(C0403j.ActionBar_backgroundSplit);
        }
        obtainStyledAttributes.recycle();
        boolean z = this.f2863h ? this.f2862g == null : this.f2860e == null && this.f2861f == null;
        setWillNotDraw(z);
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        this.f2858c = findViewById(C0399f.action_bar);
        this.f2859d = findViewById(C0399f.action_context_bar);
    }

    public void setPrimaryBackground(Drawable drawable) {
        boolean z = true;
        if (this.f2860e != null) {
            this.f2860e.setCallback(null);
            unscheduleDrawable(this.f2860e);
        }
        this.f2860e = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f2858c != null) {
                this.f2860e.setBounds(this.f2858c.getLeft(), this.f2858c.getTop(), this.f2858c.getRight(), this.f2858c.getBottom());
            }
        }
        if (this.f2863h) {
            if (this.f2862g != null) {
                z = false;
            }
        } else if (!(this.f2860e == null && this.f2861f == null)) {
            z = false;
        }
        setWillNotDraw(z);
        invalidate();
    }

    public void setStackedBackground(Drawable drawable) {
        boolean z = true;
        if (this.f2861f != null) {
            this.f2861f.setCallback(null);
            unscheduleDrawable(this.f2861f);
        }
        this.f2861f = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f2864i && this.f2861f != null) {
                this.f2861f.setBounds(this.f2857b.getLeft(), this.f2857b.getTop(), this.f2857b.getRight(), this.f2857b.getBottom());
            }
        }
        if (this.f2863h) {
            if (this.f2862g != null) {
                z = false;
            }
        } else if (!(this.f2860e == null && this.f2861f == null)) {
            z = false;
        }
        setWillNotDraw(z);
        invalidate();
    }

    public void setSplitBackground(Drawable drawable) {
        boolean z = true;
        if (this.f2862g != null) {
            this.f2862g.setCallback(null);
            unscheduleDrawable(this.f2862g);
        }
        this.f2862g = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f2863h && this.f2862g != null) {
                this.f2862g.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (this.f2863h) {
            if (this.f2862g != null) {
                z = false;
            }
        } else if (!(this.f2860e == null && this.f2861f == null)) {
            z = false;
        }
        setWillNotDraw(z);
        invalidate();
    }

    public void setVisibility(int i) {
        boolean z;
        super.setVisibility(i);
        if (i == 0) {
            z = true;
        } else {
            z = false;
        }
        if (this.f2860e != null) {
            this.f2860e.setVisible(z, false);
        }
        if (this.f2861f != null) {
            this.f2861f.setVisible(z, false);
        }
        if (this.f2862g != null) {
            this.f2862g.setVisible(z, false);
        }
    }

    protected boolean verifyDrawable(Drawable drawable) {
        return (drawable == this.f2860e && !this.f2863h) || ((drawable == this.f2861f && this.f2864i) || ((drawable == this.f2862g && this.f2863h) || super.verifyDrawable(drawable)));
    }

    protected void drawableStateChanged() {
        super.drawableStateChanged();
        if (this.f2860e != null && this.f2860e.isStateful()) {
            this.f2860e.setState(getDrawableState());
        }
        if (this.f2861f != null && this.f2861f.isStateful()) {
            this.f2861f.setState(getDrawableState());
        }
        if (this.f2862g != null && this.f2862g.isStateful()) {
            this.f2862g.setState(getDrawableState());
        }
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        if (this.f2860e != null) {
            this.f2860e.jumpToCurrentState();
        }
        if (this.f2861f != null) {
            this.f2861f.jumpToCurrentState();
        }
        if (this.f2862g != null) {
            this.f2862g.jumpToCurrentState();
        }
    }

    public void setTransitioning(boolean z) {
        this.f2856a = z;
        setDescendantFocusability(z ? 393216 : 262144);
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f2856a || super.onInterceptTouchEvent(motionEvent);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    public void setTabContainer(fz fzVar) {
        if (this.f2857b != null) {
            removeView(this.f2857b);
        }
        this.f2857b = fzVar;
        if (fzVar != null) {
            addView(fzVar);
            LayoutParams layoutParams = fzVar.getLayoutParams();
            layoutParams.width = -1;
            layoutParams.height = -2;
            fzVar.setAllowCollapse(false);
        }
    }

    public View getTabContainer() {
        return this.f2857b;
    }

    public ActionMode startActionModeForChild(View view, Callback callback) {
        return null;
    }

    public ActionMode startActionModeForChild(View view, Callback callback, int i) {
        if (i != 0) {
            return super.startActionModeForChild(view, callback, i);
        }
        return null;
    }

    private static boolean m2928a(View view) {
        return view == null || view.getVisibility() == 8 || view.getMeasuredHeight() == 0;
    }

    private static int m2929b(View view) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        return layoutParams.bottomMargin + (view.getMeasuredHeight() + layoutParams.topMargin);
    }

    public void onMeasure(int i, int i2) {
        if (this.f2858c == null && MeasureSpec.getMode(i2) == Integer.MIN_VALUE && this.f2865j >= 0) {
            i2 = MeasureSpec.makeMeasureSpec(Math.min(this.f2865j, MeasureSpec.getSize(i2)), Integer.MIN_VALUE);
        }
        super.onMeasure(i, i2);
        if (this.f2858c != null) {
            int mode = MeasureSpec.getMode(i2);
            if (this.f2857b != null && this.f2857b.getVisibility() != 8 && mode != MemoryMappedFileBuffer.DEFAULT_SIZE) {
                int b;
                if (!m2928a(this.f2858c)) {
                    b = m2929b(this.f2858c);
                } else if (m2928a(this.f2859d)) {
                    b = 0;
                } else {
                    b = m2929b(this.f2859d);
                }
                setMeasuredDimension(getMeasuredWidth(), Math.min(b + m2929b(this.f2857b), mode == Integer.MIN_VALUE ? MeasureSpec.getSize(i2) : Integer.MAX_VALUE));
            }
        }
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5 = 1;
        super.onLayout(z, i, i2, i3, i4);
        View view = this.f2857b;
        boolean z2 = (view == null || view.getVisibility() == 8) ? false : true;
        if (!(view == null || view.getVisibility() == 8)) {
            int measuredHeight = getMeasuredHeight();
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
            view.layout(i, (measuredHeight - view.getMeasuredHeight()) - layoutParams.bottomMargin, i3, measuredHeight - layoutParams.bottomMargin);
        }
        if (!this.f2863h) {
            int i6;
            if (this.f2860e != null) {
                if (this.f2858c.getVisibility() == 0) {
                    this.f2860e.setBounds(this.f2858c.getLeft(), this.f2858c.getTop(), this.f2858c.getRight(), this.f2858c.getBottom());
                } else if (this.f2859d == null || this.f2859d.getVisibility() != 0) {
                    this.f2860e.setBounds(0, 0, 0, 0);
                } else {
                    this.f2860e.setBounds(this.f2859d.getLeft(), this.f2859d.getTop(), this.f2859d.getRight(), this.f2859d.getBottom());
                }
                i6 = 1;
            } else {
                i6 = 0;
            }
            this.f2864i = z2;
            if (!z2 || this.f2861f == null) {
                i5 = i6;
            } else {
                this.f2861f.setBounds(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            }
        } else if (this.f2862g != null) {
            this.f2862g.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
        } else {
            i5 = 0;
        }
        if (i5 != 0) {
            invalidate();
        }
    }
}
