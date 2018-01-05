package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.support.v4.view.ah;
import android.support.v4.widget.C0373d;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;

public class bg extends TextView implements ah, C0373d {
    public final ac f2621m;
    public final bd f2622n;

    public bg(Context context) {
        this(context, null);
    }

    public bg(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842884);
    }

    public bg(Context context, AttributeSet attributeSet, int i) {
        super(gz.m3765a(context), attributeSet, i);
        this.f2621m = new ac(this);
        this.f2621m.m3162a(attributeSet, i);
        this.f2622n = bd.m3230a((TextView) this);
        this.f2622n.mo757a(attributeSet, i);
        this.f2622n.mo756a();
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        if (this.f2621m != null) {
            this.f2621m.m3159a(i);
        }
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        if (this.f2621m != null) {
            this.f2621m.m3158a();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (this.f2621m != null) {
            this.f2621m.m3160a(colorStateList);
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        return this.f2621m != null ? this.f2621m.m3163b() : null;
    }

    public void setSupportBackgroundTintMode(Mode mode) {
        if (this.f2621m != null) {
            this.f2621m.m3161a(mode);
        }
    }

    public Mode getSupportBackgroundTintMode() {
        return this.f2621m != null ? this.f2621m.m3164c() : null;
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        if (this.f2622n != null) {
            this.f2622n.m3237a(context, i);
        }
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        if (this.f2621m != null) {
            this.f2621m.m3165d();
        }
        if (this.f2622n != null) {
            this.f2622n.mo756a();
        }
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.f2622n != null) {
            this.f2622n.m3242b();
        }
    }

    public void setTextSize(int i, float f) {
        if (a) {
            super.setTextSize(i, f);
        } else if (this.f2622n != null) {
            this.f2622n.m3235a(i, f);
        }
    }

    protected void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        if (this.f2622n != null && !a && this.f2622n.f3190f.m3255d()) {
            this.f2622n.f3190f.m3254c();
        }
    }

    public void setAutoSizeTextTypeWithDefaults(int i) {
        if (a) {
            super.setAutoSizeTextTypeWithDefaults(i);
        } else if (this.f2622n != null) {
            this.f2622n.m3234a(i);
        }
    }

    public void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) {
        if (a) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
        } else if (this.f2622n != null) {
            this.f2622n.m3236a(i, i2, i3, i4);
        }
    }

    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) {
        if (a) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
        } else if (this.f2622n != null) {
            this.f2622n.m3241a(iArr, i);
        }
    }

    public int getAutoSizeTextType() {
        if (!a) {
            return this.f2622n != null ? this.f2622n.f3190f.f3200c : 0;
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
        if (this.f2622n != null) {
            return Math.round(this.f2622n.f3190f.f3202e);
        }
        return -1;
    }

    public int getAutoSizeMinTextSize() {
        if (a) {
            return super.getAutoSizeMinTextSize();
        }
        if (this.f2622n != null) {
            return Math.round(this.f2622n.f3190f.f3203f);
        }
        return -1;
    }

    public int getAutoSizeMaxTextSize() {
        if (a) {
            return super.getAutoSizeMaxTextSize();
        }
        if (this.f2622n != null) {
            return Math.round(this.f2622n.f3190f.f3204g);
        }
        return -1;
    }

    public int[] getAutoSizeTextAvailableSizes() {
        if (a) {
            return super.getAutoSizeTextAvailableSizes();
        }
        if (this.f2622n != null) {
            return this.f2622n.f3190f.f3205h;
        }
        return new int[0];
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return am.m3191a(super.onCreateInputConnection(editorInfo), editorInfo, this);
    }
}
