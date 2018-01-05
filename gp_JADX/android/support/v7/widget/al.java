package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.support.v4.view.ah;
import android.support.v7.p040a.C0394a;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import android.widget.TextView;

public final class al extends EditText implements ah {
    public final ac f3110a;
    public final bd f3111b;

    public al(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0394a.editTextStyle);
    }

    private al(Context context, AttributeSet attributeSet, int i) {
        super(gz.m3765a(context), attributeSet, i);
        this.f3110a = new ac(this);
        this.f3110a.m3162a(attributeSet, i);
        this.f3111b = bd.m3230a((TextView) this);
        this.f3111b.mo757a(attributeSet, i);
        this.f3111b.mo756a();
    }

    public final void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        if (this.f3110a != null) {
            this.f3110a.m3159a(i);
        }
    }

    public final void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        if (this.f3110a != null) {
            this.f3110a.m3158a();
        }
    }

    public final void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (this.f3110a != null) {
            this.f3110a.m3160a(colorStateList);
        }
    }

    public final ColorStateList getSupportBackgroundTintList() {
        return this.f3110a != null ? this.f3110a.m3163b() : null;
    }

    public final void setSupportBackgroundTintMode(Mode mode) {
        if (this.f3110a != null) {
            this.f3110a.m3161a(mode);
        }
    }

    public final Mode getSupportBackgroundTintMode() {
        return this.f3110a != null ? this.f3110a.m3164c() : null;
    }

    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        if (this.f3110a != null) {
            this.f3110a.m3165d();
        }
        if (this.f3111b != null) {
            this.f3111b.mo756a();
        }
    }

    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        if (this.f3111b != null) {
            this.f3111b.m3237a(context, i);
        }
    }

    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return am.m3191a(super.onCreateInputConnection(editorInfo), editorInfo, this);
    }
}
