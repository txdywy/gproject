package android.support.v7.widget;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.ListAdapter;
import android.widget.SpinnerAdapter;

final class az extends C0491do {
    public CharSequence f3174a;
    public ListAdapter f3175b;
    public final Rect f3176c = new Rect();
    public final /* synthetic */ AppCompatSpinner f3177d;

    public az(AppCompatSpinner appCompatSpinner, Context context, AttributeSet attributeSet, int i) {
        this.f3177d = appCompatSpinner;
        super(context, attributeSet, i);
        this.f3172y = appCompatSpinner;
        m3217f();
        this.f3170w = 0;
        this.f3143A = new ba(this);
    }

    public final void mo753a(ListAdapter listAdapter) {
        super.mo753a(listAdapter);
        this.f3175b = listAdapter;
    }

    final void m3223a() {
        int i;
        int i2;
        Drawable background = this.f3153K.getBackground();
        if (background != null) {
            background.getPadding(this.f3177d.f2936i);
            if (id.m3869a(this.f3177d)) {
                i = this.f3177d.f2936i.right;
            } else {
                i = -this.f3177d.f2936i.left;
            }
            i2 = i;
        } else {
            Rect rect = this.f3177d.f2936i;
            this.f3177d.f2936i.right = 0;
            rect.left = 0;
            i2 = 0;
        }
        int paddingLeft = this.f3177d.getPaddingLeft();
        int paddingRight = this.f3177d.getPaddingRight();
        int width = this.f3177d.getWidth();
        if (this.f3177d.f2935h == -2) {
            int a = this.f3177d.m2972a((SpinnerAdapter) this.f3175b, this.f3153K.getBackground());
            i = (this.f3177d.getContext().getResources().getDisplayMetrics().widthPixels - this.f3177d.f2936i.left) - this.f3177d.f2936i.right;
            if (a <= i) {
                i = a;
            }
            m3213b(Math.max(i, (width - paddingLeft) - paddingRight));
        } else if (this.f3177d.f2935h == -1) {
            m3213b((width - paddingLeft) - paddingRight);
        } else {
            m3213b(this.f3177d.f2935h);
        }
        if (id.m3869a(this.f3177d)) {
            i = ((width - paddingRight) - this.f3158k) + i2;
        } else {
            i = i2 + paddingLeft;
        }
        this.f3159l = i;
    }

    public final void mo671b() {
        boolean isShowing = this.f3153K.isShowing();
        m3223a();
        m3219h();
        super.mo671b();
        this.f3156i.setChoiceMode(1);
        int selectedItemPosition = this.f3177d.getSelectedItemPosition();
        ck ckVar = this.f3156i;
        if (this.f3153K.isShowing() && ckVar != null) {
            ckVar.f3288a = false;
            ckVar.setSelection(selectedItemPosition);
            if (ckVar.getChoiceMode() != 0) {
                ckVar.setItemChecked(selectedItemPosition, true);
            }
        }
        if (!isShowing) {
            ViewTreeObserver viewTreeObserver = this.f3177d.getViewTreeObserver();
            if (viewTreeObserver != null) {
                OnGlobalLayoutListener bbVar = new bb(this);
                viewTreeObserver.addOnGlobalLayoutListener(bbVar);
                m3211a(new bc(this, bbVar));
            }
        }
    }
}
