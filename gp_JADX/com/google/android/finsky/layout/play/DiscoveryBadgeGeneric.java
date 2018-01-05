package com.google.android.finsky.layout.play;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import com.google.android.play.image.a;
import com.google.android.play.image.ac;
import com.squareup.leakcanary.C7582R;

public class DiscoveryBadgeGeneric extends C3689a {
    public DiscoveryBadgeGeneric(Context context) {
        this(context, null);
    }

    public DiscoveryBadgeGeneric(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.q) {
            m17493a(canvas);
            return;
        }
        int width = getWidth() / 2;
        int i = this.g;
        this.s.setColor(this.e);
        canvas.drawCircle((float) width, (float) i, (float) this.g, this.s);
    }

    protected int getPlayStoreUiElementType() {
        return 1801;
    }

    protected final void mo3589a() {
        ac c;
        if (this.q) {
            c = a.c(getResources(), getResources().getColor(C7582R.color.play_transparent));
        } else {
            c = a.b(getResources(), this.e);
        }
        this.b.setBitmapTransformation(c);
    }
}
