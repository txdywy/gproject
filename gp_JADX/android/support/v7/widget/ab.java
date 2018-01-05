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
import android.widget.AutoCompleteTextView;
import android.widget.TextView;

public class ab extends AutoCompleteTextView implements ah {
    public static final int[] f2979a = new int[]{16843126};
    public final ac f2980b;
    public final bd f2981c;

    public ab(Context context) {
        this(context, null);
    }

    public ab(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0394a.autoCompleteTextViewStyle);
    }

    public ab(Context context, AttributeSet attributeSet, int i) {
        super(gz.m3765a(context), attributeSet, i);
        hc a = hc.m3769a(getContext(), attributeSet, f2979a, i, 0);
        if (a.m3782f(0)) {
            setDropDownBackgroundDrawable(a.m3771a(0));
        }
        a.f3558b.recycle();
        this.f2980b = new ac(this);
        this.f2980b.m3162a(attributeSet, i);
        this.f2981c = bd.m3230a((TextView) this);
        this.f2981c.mo757a(attributeSet, i);
        this.f2981c.mo756a();
    }

    public void setDropDownBackgroundResource(int i) {
        setDropDownBackgroundDrawable(C0436b.m2650b(getContext(), i));
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        if (this.f2980b != null) {
            this.f2980b.m3159a(i);
        }
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        if (this.f2980b != null) {
            this.f2980b.m3158a();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (this.f2980b != null) {
            this.f2980b.m3160a(colorStateList);
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        return this.f2980b != null ? this.f2980b.m3163b() : null;
    }

    public void setSupportBackgroundTintMode(Mode mode) {
        if (this.f2980b != null) {
            this.f2980b.m3161a(mode);
        }
    }

    public Mode getSupportBackgroundTintMode() {
        return this.f2980b != null ? this.f2980b.m3164c() : null;
    }

    protected void drawableStateChanged() {
        super.drawableStateChanged();
        if (this.f2980b != null) {
            this.f2980b.m3165d();
        }
        if (this.f2981c != null) {
            this.f2981c.mo756a();
        }
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        if (this.f2981c != null) {
            this.f2981c.m3237a(context, i);
        }
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return am.m3191a(super.onCreateInputConnection(editorInfo), editorInfo, this);
    }
}
