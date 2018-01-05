package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.support.v4.view.ah;
import android.support.v4.widget.C0373d;
import android.support.v7.p040a.C0394a;
import android.util.AttributeSet;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.TextView;

public class ad extends Button implements ah, C0373d {
    public final ac f3084b;
    public final bd f3085c;

    public ad(Context context) {
        this(context, null);
    }

    public ad(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0394a.buttonStyle);
    }

    public ad(Context context, AttributeSet attributeSet, int i) {
        super(gz.m3765a(context), attributeSet, i);
        this.f3084b = new ac(this);
        this.f3084b.m3162a(attributeSet, i);
        this.f3085c = bd.m3230a((TextView) this);
        this.f3085c.mo757a(attributeSet, i);
        this.f3085c.mo756a();
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        if (this.f3084b != null) {
            this.f3084b.m3159a(i);
        }
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        if (this.f3084b != null) {
            this.f3084b.m3158a();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (this.f3084b != null) {
            this.f3084b.m3160a(colorStateList);
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        return this.f3084b != null ? this.f3084b.m3163b() : null;
    }

    public void setSupportBackgroundTintMode(Mode mode) {
        if (this.f3084b != null) {
            this.f3084b.m3161a(mode);
        }
    }

    public Mode getSupportBackgroundTintMode() {
        return this.f3084b != null ? this.f3084b.m3164c() : null;
    }

    protected void drawableStateChanged() {
        super.drawableStateChanged();
        if (this.f3084b != null) {
            this.f3084b.m3165d();
        }
        if (this.f3085c != null) {
            this.f3085c.mo756a();
        }
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        if (this.f3085c != null) {
            this.f3085c.m3237a(context, i);
        }
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.f3085c != null) {
            this.f3085c.m3242b();
        }
    }

    public void setTextSize(int i, float f) {
        if (a) {
            super.setTextSize(i, f);
        } else if (this.f3085c != null) {
            this.f3085c.m3235a(i, f);
        }
    }

    protected void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        if (this.f3085c != null && !a && this.f3085c.f3190f.m3255d()) {
            this.f3085c.f3190f.m3254c();
        }
    }

    public void setAutoSizeTextTypeWithDefaults(int i) {
        if (a) {
            super.setAutoSizeTextTypeWithDefaults(i);
        } else if (this.f3085c != null) {
            this.f3085c.m3234a(i);
        }
    }

    public void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) {
        if (a) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
        } else if (this.f3085c != null) {
            this.f3085c.m3236a(i, i2, i3, i4);
        }
    }

    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) {
        if (a) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
        } else if (this.f3085c != null) {
            this.f3085c.m3241a(iArr, i);
        }
    }

    public int getAutoSizeTextType() {
        if (!a) {
            return this.f3085c != null ? this.f3085c.f3190f.f3200c : 0;
        } else {
            if (super.getAutoSizeTextType() == 1) {
                return 1;
            }
            return 0;
        }
    }

    public int getAutoSizeStepGranularity() {
        if (a) {
            return super.getAutoSizeStepGranularity();
        }
        if (this.f3085c != null) {
            return Math.round(this.f3085c.f3190f.f3202e);
        }
        return -1;
    }

    public int getAutoSizeMinTextSize() {
        if (a) {
            return super.getAutoSizeMinTextSize();
        }
        if (this.f3085c != null) {
            return Math.round(this.f3085c.f3190f.f3203f);
        }
        return -1;
    }

    public int getAutoSizeMaxTextSize() {
        if (a) {
            return super.getAutoSizeMaxTextSize();
        }
        if (this.f3085c != null) {
            return Math.round(this.f3085c.f3190f.f3204g);
        }
        return -1;
    }

    public int[] getAutoSizeTextAvailableSizes() {
        if (a) {
            return super.getAutoSizeTextAvailableSizes();
        }
        if (this.f3085c != null) {
            return this.f3085c.f3190f.f3205h;
        }
        return new int[0];
    }

    public void setSupportAllCaps(boolean z) {
        if (this.f3085c != null) {
            this.f3085c.m3240a(z);
        }
    }
}
