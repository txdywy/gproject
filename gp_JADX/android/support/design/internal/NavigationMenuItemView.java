package android.support.design.internal;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;
import android.graphics.drawable.StateListDrawable;
import android.support.design.C0121d;
import android.support.design.C0123e;
import android.support.design.C0124f;
import android.support.design.C0126h;
import android.support.v4.p013b.p014a.C0259a;
import android.support.v4.p028a.p029a.C0206f;
import android.support.v4.view.C0132b;
import android.support.v4.widget.bg;
import android.support.v7.p040a.C0394a;
import android.support.v7.view.menu.C0485t;
import android.support.v7.view.menu.ai;
import android.support.v7.widget.di;
import android.support.v7.widget.eq;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewStub;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;

public class NavigationMenuItemView extends C0128a implements ai {
    public static final int[] f473g = new int[]{16842912};
    public final int f474h;
    public boolean f475i;
    public boolean f476j;
    public final CheckedTextView f477k;
    public FrameLayout f478l;
    public C0485t f479m;
    public ColorStateList f480n;
    public boolean f481o;
    public Drawable f482p;
    public final C0132b f483q;

    public NavigationMenuItemView(Context context) {
        this(context, null);
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f483q = new C0133b(this);
        setOrientation(0);
        LayoutInflater.from(context).inflate(C0126h.design_navigation_menu_item, this, true);
        this.f474h = context.getResources().getDimensionPixelSize(C0121d.design_navigation_icon_size);
        this.f477k = (CheckedTextView) findViewById(C0124f.design_menu_item_text);
        this.f477k.setDuplicateParentStateEnabled(true);
        android.support.v4.view.ai.m1829a(this.f477k, this.f483q);
    }

    public final void mo58a(C0485t c0485t) {
        this.f479m = c0485t;
        setVisibility(c0485t.isVisible() ? 0 : 8);
        if (getBackground() == null) {
            Drawable stateListDrawable;
            TypedValue typedValue = new TypedValue();
            if (getContext().getTheme().resolveAttribute(C0394a.colorControlHighlight, typedValue, true)) {
                stateListDrawable = new StateListDrawable();
                stateListDrawable.addState(f473g, new ColorDrawable(typedValue.data));
                stateListDrawable.addState(EMPTY_STATE_SET, new ColorDrawable(0));
            } else {
                stateListDrawable = null;
            }
            android.support.v4.view.ai.m1826a((View) this, stateListDrawable);
        }
        setCheckable(c0485t.isCheckable());
        setChecked(c0485t.isChecked());
        setEnabled(c0485t.isEnabled());
        setTitle(c0485t.getTitle());
        setIcon(c0485t.getIcon());
        View actionView = c0485t.getActionView();
        if (actionView != null) {
            if (this.f478l == null) {
                this.f478l = (FrameLayout) ((ViewStub) findViewById(C0124f.design_menu_item_action_area_stub)).inflate();
            }
            this.f478l.removeAllViews();
            this.f478l.addView(actionView);
        }
        boolean z = this.f479m.getTitle() == null && this.f479m.getIcon() == null && this.f479m.getActionView() != null;
        if (z) {
            this.f477k.setVisibility(8);
            if (this.f478l != null) {
                di diVar = (di) this.f478l.getLayoutParams();
                diVar.width = -1;
                this.f478l.setLayoutParams(diVar);
                return;
            }
            return;
        }
        this.f477k.setVisibility(0);
        if (this.f478l != null) {
            diVar = (di) this.f478l.getLayoutParams();
            diVar.width = -2;
            this.f478l.setLayoutParams(diVar);
        }
    }

    public C0485t getItemData() {
        return this.f479m;
    }

    public void setTitle(CharSequence charSequence) {
        this.f477k.setText(charSequence);
    }

    public void setCheckable(boolean z) {
        refreshDrawableState();
        if (this.f476j != z) {
            this.f476j = z;
            this.f483q.mo1019a(this.f477k, (int) eq.FLAG_MOVED);
        }
    }

    public void setChecked(boolean z) {
        refreshDrawableState();
        this.f477k.setChecked(z);
    }

    public void setIcon(Drawable drawable) {
        if (drawable != null) {
            if (this.f481o) {
                ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = C0259a.m1526e(drawable).mutate();
                C0259a.m1516a(drawable, this.f480n);
            }
            drawable.setBounds(0, 0, this.f474h, this.f474h);
        } else if (this.f475i) {
            if (this.f482p == null) {
                this.f482p = C0206f.m1065a(getResources(), C0123e.navigation_empty_icon, getContext().getTheme());
                if (this.f482p != null) {
                    this.f482p.setBounds(0, 0, this.f474h, this.f474h);
                }
            }
            drawable = this.f482p;
        }
        bg.f2112a.mo478a(this.f477k, drawable);
    }

    public final boolean mo59a() {
        return false;
    }

    protected int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        if (this.f479m != null && this.f479m.isCheckable() && this.f479m.isChecked()) {
            mergeDrawableStates(onCreateDrawableState, f473g);
        }
        return onCreateDrawableState;
    }

    public void setTextAppearance(int i) {
        bg.m2221a(this.f477k, i);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.f477k.setTextColor(colorStateList);
    }

    public void setNeedsEmptyIcon(boolean z) {
        this.f475i = z;
    }
}
