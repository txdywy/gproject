package com.google.android.finsky.detailspage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.os.Build.VERSION;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import com.google.android.play.image.ac;
import com.squareup.leakcanary.C7582R;

public final class C2673u implements ac {
    public static final boolean f14755a = (VERSION.SDK_INT >= 17);
    public int f14756b;
    public final RenderScript f14757c;

    public C2673u(Context context) {
        this.f14756b = context.getResources().getColor(C7582R.color.status_bar_overlay);
        this.f14757c = RenderScript.create(context);
    }

    public final int mo3104a(int i, int i2) {
        return 0;
    }

    public final Bitmap mo3105a(Bitmap bitmap, int i, int i2) {
        try {
            float width;
            Bitmap createBitmap = Bitmap.createBitmap((int) (((float) i) / 2.0f), (int) (((float) i2) / 2.0f), Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            if (((float) createBitmap.getWidth()) / ((float) bitmap.getWidth()) > ((float) createBitmap.getHeight()) / ((float) bitmap.getHeight())) {
                width = ((float) createBitmap.getWidth()) / ((float) bitmap.getWidth());
            } else {
                width = ((float) createBitmap.getHeight()) / ((float) bitmap.getHeight());
            }
            canvas.scale(width, width);
            canvas.drawBitmap(bitmap, ((((float) createBitmap.getWidth()) / width) - ((float) bitmap.getWidth())) / 2.0f, ((((float) createBitmap.getHeight()) / width) - ((float) bitmap.getHeight())) / 2.0f, null);
            canvas.drawColor(this.f14756b);
            if (!f14755a) {
                return createBitmap;
            }
            try {
                Bitmap createBitmap2 = Bitmap.createBitmap(createBitmap.getWidth(), createBitmap.getHeight(), Config.ARGB_8888);
                Allocation createFromBitmap = Allocation.createFromBitmap(this.f14757c, createBitmap);
                Allocation createFromBitmap2 = Allocation.createFromBitmap(this.f14757c, createBitmap2);
                ScriptIntrinsicBlur create = ScriptIntrinsicBlur.create(this.f14757c, Element.U8_4(this.f14757c));
                create.setInput(createFromBitmap);
                create.setRadius(20.0f);
                create.forEach(createFromBitmap2);
                createFromBitmap2.copyTo(createBitmap2);
                create.destroy();
                createFromBitmap.destroy();
                createFromBitmap2.destroy();
                return createBitmap2;
            } catch (OutOfMemoryError e) {
                return createBitmap;
            }
        } catch (OutOfMemoryError e2) {
            return null;
        }
    }

    public final void mo3106a(Canvas canvas, int i, int i2) {
    }

    public final void mo3107b(Canvas canvas, int i, int i2) {
    }
}
