package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.support.v4.view.ah;
import android.support.v7.p040a.C0394a;
import android.support.v7.p041b.p042a.C0436b;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.MultiAutoCompleteTextView;
import android.widget.TextView;

public final class aq extends MultiAutoCompleteTextView implements ah {
    public static final int[] f3118a = new int[]{16843126};
    public final ac f3119b;
    public final bd f3120c;

    public aq(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0394a.autoCompleteTextViewStyle);
    }

    private aq(Context context, AttributeSet attributeSet, int i) {
        super(gz.m3765a(context), attributeSet, i);
        hc a = hc.m3769a(getContext(), attributeSet, f3118a, i, 0);
        if (a.m3782f(0)) {
            setDropDownBackgroundDrawable(a.m3771a(0));
        }
        a.f3558b.recycle();
        this.f3119b = new ac(this);
        this.f3119b.m3162a(attributeSet, i);
        this.f3120c = bd.m3230a((TextView) this);
        this.f3120c.mo757a(attributeSet, i);
        this.f3120c.mo756a();
    }

    public final void setDropDownBackgroundResource(int i) {
        setDropDownBackgroundDrawable(C0436b.m2650b(getContext(), i));
    }

    public final void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        if (this.f3119b != null) {
            this.f3119b.m3159a(i);
        }
    }

    public final void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        if (this.f3119b != null) {
            this.f3119b.m3158a();
        }
    }

    public final void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (this.f3119b != null) {
            this.f3119b.m3160a(colorStateList);
        }
    }

    public final ColorStateList getSupportBackgroundTintList() {
        return this.f3119b != null ? this.f3119b.m3163b() : null;
    }

    public final void setSupportBackgroundTintMode(Mode mode) {
        if (this.f3119b != null) {
            this.f3119b.m3161a(mode);
        }
    }

    public final Mode getSupportBackgroundTintMode() {
        return this.f3119b != null ? this.f3119b.m3164c() : null;
    }

    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        if (this.f3119b != null) {
            this.f3119b.m3165d();
        }
        if (this.f3120c != null) {
            this.f3120c.mo756a();
        }
    }

    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        if (this.f3120c != null) {
            this.f3120c.m3237a(context, i);
        }
    }

    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return am.m3191a(super.onCreateInputConnection(editorInfo), editorInfo, this);
    }
}
