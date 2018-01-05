package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.support.v4.view.ah;
import android.support.v4.widget.bo;
import android.support.v7.p040a.C0394a;
import android.util.AttributeSet;
import android.widget.ImageButton;

public class an extends ImageButton implements ah, bo {
    public final ac f604c;
    public final ao f605d;

    public an(Context context) {
        this(context, null);
    }

    public an(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0394a.imageButtonStyle);
    }

    public an(Context context, AttributeSet attributeSet, int i) {
        super(gz.m3765a(context), attributeSet, i);
        this.f604c = new ac(this);
        this.f604c.m3162a(attributeSet, i);
        this.f605d = new ao(this);
        this.f605d.m3195a(attributeSet, i);
    }

    public void setImageResource(int i) {
        this.f605d.m3192a(i);
    }

    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        if (this.f605d != null) {
            this.f605d.m3199d();
        }
    }

    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        if (this.f605d != null) {
            this.f605d.m3199d();
        }
    }

    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        if (this.f605d != null) {
            this.f605d.m3199d();
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        if (this.f604c != null) {
            this.f604c.m3159a(i);
        }
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        if (this.f604c != null) {
            this.f604c.m3158a();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (this.f604c != null) {
            this.f604c.m3160a(colorStateList);
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        return this.f604c != null ? this.f604c.m3163b() : null;
    }

    public void setSupportBackgroundTintMode(Mode mode) {
        if (this.f604c != null) {
            this.f604c.m3161a(mode);
        }
    }

    public Mode getSupportBackgroundTintMode() {
        return this.f604c != null ? this.f604c.m3164c() : null;
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        if (this.f605d != null) {
            this.f605d.m3193a(colorStateList);
        }
    }

    public ColorStateList getSupportImageTintList() {
        return this.f605d != null ? this.f605d.m3197b() : null;
    }

    public void setSupportImageTintMode(Mode mode) {
        if (this.f605d != null) {
            this.f605d.m3194a(mode);
        }
    }

    public Mode getSupportImageTintMode() {
        return this.f605d != null ? this.f605d.m3198c() : null;
    }

    protected void drawableStateChanged() {
        super.drawableStateChanged();
        if (this.f604c != null) {
            this.f604c.m3165d();
        }
        if (this.f605d != null) {
            this.f605d.m3199d();
        }
    }

    public boolean hasOverlappingRendering() {
        return this.f605d.m3196a() && super.hasOverlappingRendering();
    }
}
