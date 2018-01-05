package android.support.v7.widget;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;

class C0493c extends Drawable {
    public final ActionBarContainer f3238a;

    public C0493c(ActionBarContainer actionBarContainer) {
        this.f3238a = actionBarContainer;
    }

    public void draw(Canvas canvas) {
        if (!this.f3238a.f2863h) {
            if (this.f3238a.f2860e != null) {
                this.f3238a.f2860e.draw(canvas);
            }
            if (this.f3238a.f2861f != null && this.f3238a.f2864i) {
                this.f3238a.f2861f.draw(canvas);
            }
        } else if (this.f3238a.f2862g != null) {
            this.f3238a.f2862g.draw(canvas);
        }
    }

    public void setAlpha(int i) {
    }

    public void setColorFilter(ColorFilter colorFilter) {
    }

    public int getOpacity() {
        return 0;
    }
}
