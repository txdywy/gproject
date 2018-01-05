package com.android.setupwizardlib;

import android.graphics.Bitmap;
import android.graphics.Bitmap$Config;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff$Mode;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build$VERSION;

public final class com.android.setupwizardlib.a extends Drawable
{

    public static SoftReference a;
    public static Path[] b;
    public static int[] c;
    public int d;
    public Paint e;
    public ColorFilter f;

    a(int p0) {
        Drawable();
        this.e = new Paint(1);
        v0 = Color.red(p0);
        v1 = Color.green(p0);
        v2 = Color.blue(p0);
        this.d = Color.argb(204, v0, v1, v2);
        v4 = new float[20];
        v4[0] = 0;
        v4[1] = 0;
        v4[2] = 0;
        v4[3] = 1045220556;
        v4[4] = (float)v0 * 1061997773;
        v4[5] = 0;
        v4[6] = 0;
        v4[7] = 0;
        v4[8] = 1045220556;
        v4[9] = (float)v1 * 1061997773;
        v4[10] = 0;
        v4[11] = 0;
        v4[12] = 0;
        v4[13] = 1045220556;
        v4[14] = (float)v2 * 1061997773;
        v4[15] = 0;
        v4[16] = 0;
        v4[17] = 0;
        v4[18] = 0;
        v4[19] = 1132396544;
        this.f = new ColorMatrixColorFilter(v4);
        this.invalidateSelf();
    }

    private final void a(Canvas p0, float p1) {
        p0.save();
        p0.scale(p1, p1);
        this.e.setXfermode(new PorterDuffXfermode(PorterDuff$Mode.SRC));
        if (com.android.setupwizardlib.a.b == 0) {
            com.android.setupwizardlib.a.b = new Path[7];
            com.android.setupwizardlib.a.c = new int[7]{10, 40, 51, 66, 91, 112, 130};
            v2 = new Path();
            com.android.setupwizardlib.a.b[0] = v2;
            v2.moveTo(1149283533, 1135788032);
            v2.lineTo(1152040960, 1144899174);
            v2.lineTo(1152040960, 0);
            v2.lineTo(1150170726, 0);
            v2.close();
            v0 = new Path();
            com.android.setupwizardlib.a.b[1] = v0;
            v0.moveTo(1150174003, 0);
            v0.rLineTo(-1022309171, 1145044992);
            v0.rLineTo(1136286106, 0);
            v0.rLineTo(0, -1006436352);
            v0.cubicTo(1151424102, 1123234611, 1150838374, 1109681766, 1150506598, 0);
            v0.close();
            v0 = new Path();
            com.android.setupwizardlib.a.b[2] = v0;
            v0.moveTo(1148023603, 1145044992);
            v0.rCubicTo(1119433523, -1020618342, 1129644032, -1008982426, 1132901171, -1002438656);
            v0.lineTo(1142046720, 0);
            v0.rLineTo(1074161254, 1145012224);
            v0.close();
            v0 = new Path();
            com.android.setupwizardlib.a.b[3] = v0;
            v0.moveTo(1139510477, 1145044992);
            v0.rMoveTo(1144004608, 0);
            v0.cubicTo(1150055219, 1141691187, 1149267149, 1133091226, 1146490061, 0);
            v0.lineTo(1139684147, 0);
            v0.rLineTo(-1062626918, 1145044992);
            v0.close();
            v0 = new Path();
            com.android.setupwizardlib.a.b[4] = v0;
            v0.moveTo(1134660813, 1145044992);
            v0.moveTo(1145200640, 1145044992);
            v0.cubicTo(1143306650, 1135502950, 1138071962, 1101738803, 1137219994, 1103835955);
            v0.lineTo(1134660813, 1145044992);
            v0.close();
            v0 = new Path();
            com.android.setupwizardlib.a.b[5] = v0;
            v0.moveTo(1127379295, 1145026267);
            v0.lineTo(1134188954, 1145044992);
            v0.cubicTo(1136581018, 1142367846, 1139854541, 1135355494, 1141673165, 0);
            v0.lineTo(0, 0);
            v0.close();
            v0 = new Path();
            com.android.setupwizardlib.a.b[6] = v0;
            v0.moveTo(1125253120, 0);
            v0.lineTo(0, 0);
            v0.lineTo(0, 1145044992);
            v0.lineTo(1136990618, 1145044992);
            v0.cubicTo(1134811546, 1139648102, 1130659840, 1128857600, 1125253120, 0);
            v0.close();
        }
        v0 = 0;
        while (v0 < 7) {
            this.e.setColor(com.android.setupwizardlib.a.c[v0] << 24);
            p0.drawPath(com.android.setupwizardlib.a.b[v0], this.e);
            v0 = v0 + 1;
        }
        p0.restore();
        this.e.reset();
    }

    public final void draw(Canvas p0) {
        v2 = this.getBounds();
        v3 = v2.width();
        v4 = v2.height();
        if (com.android.setupwizardlib.a.a != 0)
            v0 = (Bitmap)com.android.setupwizardlib.a.a.get();
        else
            v0 = 0;
        if (v0 != 0) {
            v5 = v0.getWidth();
            v6 = v0.getHeight();
            if (v3 > v5 && (float)v5 < 1157632000)
                v0 = 0;
            else if (v4 > v6 && (float)v6 < 1150287872)
                v0 = 0;
        }
        if (v0 == 0) {
            this.e.reset();
            v1 = Math.min(1069547520, Math.max((float)v3 / 1152040960, (float)v4 / 1145044992));
            v0 = Bitmap.createBitmap((int)(1152040960 * v1), (int)(1145044992 * v1), Bitmap$Config.ALPHA_8);
            this.a(new Canvas(v0), v1);
            com.android.setupwizardlib.a.a = new SoftReference(v0);
            this.e.reset();
        }
        p0.save();
        p0.clipRect(v2);
        v1 = v0.getWidth();
        v3 = v0.getHeight();
        v4 = (float)v2.width() / (float)v1;
        v2 = (float)v2.height() / (float)v3;
        p0.scale(v4, v2);
        if (v2 > v4)
            p0.scale(v2 / v4, 1065353216, (float)v1 * 1041596678, 0);
        else if (v4 > v2)
            p0.scale(1065353216, v4 / v2, 0, 1047099605 * (float)v3);
        if (Build$VERSION.SDK_INT >= 11 && p0.isHardwareAccelerated()) {
            this.e.setColorFilter(this.f);
            p0.drawBitmap(v0, 0, 0, this.e);
        }
        else {
            p0.drawColor(-16777216);
            this.e.setColor(-1);
            p0.drawBitmap(v0, 0, 0, this.e);
            p0.drawColor(this.d);
        }
        p0.restore();
    }

    public final int getOpacity() {
        return 0;
    }

    public final void setAlpha(int p0) {
    }

    public final void setColorFilter(ColorFilter p0) {
    }

}
