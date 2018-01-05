package com.google.android.libraries.play.entertainment.story;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.Path.Direction;
import android.graphics.Path.FillType;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import com.google.android.libraries.play.entertainment.bitmap.C6032d;

public final class C6136f implements C6032d {
    public static final PorterDuffXfermode f30487a = new PorterDuffXfermode(Mode.SRC);
    public static final C6032d f30488b = new C6136f();
    public final Paint f30489c = new Paint(1);
    public final RectF f30490d = new RectF();
    public final Path f30491e = new Path();
    public final Object f30492f;

    private C6136f() {
        this.f30491e.setFillType(FillType.WINDING);
        this.f30492f = this.f30489c;
    }

    public final void mo5324a(Bitmap bitmap) {
        synchronized (this.f30492f) {
            bitmap.setHasAlpha(true);
            Canvas canvas = new Canvas(bitmap);
            this.f30491e.rewind();
            this.f30490d.set(0.0f, 0.0f, (float) bitmap.getWidth(), (float) bitmap.getHeight());
            this.f30491e.addRect(this.f30490d, Direction.CCW);
            this.f30491e.addOval(this.f30490d, Direction.CW);
            this.f30491e.close();
            this.f30489c.setColor(0);
            this.f30489c.setStyle(Style.FILL);
            this.f30489c.setXfermode(f30487a);
            canvas.drawPath(this.f30491e, this.f30489c);
        }
    }

    public final String toString() {
        return "AvatarTransformation";
    }
}
