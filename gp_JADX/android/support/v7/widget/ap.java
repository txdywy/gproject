package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.support.v4.view.ah;
import android.support.v4.widget.bo;
import android.util.AttributeSet;
import android.widget.ImageView;

public class ap extends ImageView implements ah, bo {
    public final ac f3116b;
    public final ao f3117c;

    public ap(Context context) {
        this(context, null);
    }

    public ap(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ap(Context context, AttributeSet attributeSet, int i) {
        super(gz.m3765a(context), attributeSet, i);
        this.f3116b = new ac(this);
        this.f3116b.m3162a(attributeSet, i);
        this.f3117c = new ao(this);
        this.f3117c.m3195a(attributeSet, i);
    }

    public void setImageResource(int i) {
        if (this.f3117c != null) {
            this.f3117c.m3192a(i);
        }
    }

    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        if (this.f3117c != null) {
            this.f3117c.m3199d();
        }
    }

    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        if (this.f3117c != null) {
            this.f3117c.m3199d();
        }
    }

    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        if (this.f3117c != null) {
            this.f3117c.m3199d();
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        if (this.f3116b != null) {
            this.f3116b.m3159a(i);
        }
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        if (this.f3116b != null) {
            this.f3116b.m3158a();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (this.f3116b != null) {
            this.f3116b.m3160a(colorStateList);
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        return this.f3116b != null ? this.f3116b.m3163b() : null;
    }

    public void setSupportBackgroundTintMode(Mode mode) {
        if (this.f3116b != null) {
            this.f3116b.m3161a(mode);
        }
    }

    public Mode getSupportBackgroundTintMode() {
        return this.f3116b != null ? this.f3116b.m3164c() : null;
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        if (this.f3117c != null) {
            this.f3117c.m3193a(colorStateList);
        }
    }

    public ColorStateList getSupportImageTintList() {
        return this.f3117c != null ? this.f3117c.m3197b() : null;
    }

    public void setSupportImageTintMode(Mode mode) {
        if (this.f3117c != null) {
            this.f3117c.m3194a(mode);
        }
    }

    public Mode getSupportImageTintMode() {
        return this.f3117c != null ? this.f3117c.m3198c() : null;
    }

    protected void drawableStateChanged() {
        super.drawableStateChanged();
        if (this.f3116b != null) {
            this.f3116b.m3165d();
        }
        if (this.f3117c != null) {
            this.f3117c.m3199d();
        }
    }

    public boolean hasOverlappingRendering() {
        return this.f3117c.m3196a() && super.hasOverlappingRendering();
    }
}
