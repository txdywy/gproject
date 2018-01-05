package com.google.android.finsky.playcard.lite;

import android.graphics.LinearGradient;
import android.graphics.Shader.TileMode;
import android.text.Layout.Alignment;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.View;

public final class C3912c {
    public static final Alignment f19784a;
    public static final Alignment f19785b;
    public final TextPaint f19786c = new TextPaint(1);
    public final TextPaint f19787d = new TextPaint(1);
    public final View f19788e;
    public CharSequence f19789f = "";
    public StaticLayout f19790g;
    public StaticLayout f19791h;
    public int f19792i = -16777216;
    public int f19793j = 2;
    public int f19794k;
    public float f19795l;
    public float f19796m;
    public int f19797n;
    public int f19798o;
    public String f19799p;
    public float f19800q;
    public float f19801r;
    public float f19802s;

    public C3912c(float f, float f2, View view) {
        this.f19795l = f2;
        this.f19788e = view;
        this.f19786c.setTextSize(f);
        this.f19787d.setTextSize(f);
        this.f19787d.setColor(-1);
    }

    public final void m18583a(int i) {
        if (this.f19792i != i) {
            this.f19792i = i;
            this.f19786c.setColor(i);
            this.f19796m = Float.NaN;
            this.f19788e.invalidate();
        }
    }

    public final int m18581a() {
        if (this.f19790g == null) {
            return 0;
        }
        int lineCount = this.f19790g.getLineCount();
        if (this.f19794k != -1) {
            lineCount++;
        }
        return Math.min(lineCount, this.f19793j);
    }

    final void m18582a(float f, int i, float f2, int i2) {
        if (this.f19795l != 0.0f) {
            int[] iArr;
            float[] fArr;
            if (i == 1) {
                iArr = new int[]{i2, 16777215 & i2};
                fArr = new float[]{1.0f - (this.f19795l / f2), 1.0f};
            } else {
                iArr = new int[]{16777215 & i2, i2};
                fArr = new float[]{0.0f, this.f19795l / f2};
            }
            this.f19787d.setShader(new LinearGradient(f, 0.0f, f2 + f, 0.0f, iArr, fArr, TileMode.CLAMP));
        }
    }

    static {
        Alignment valueOf;
        Alignment valueOf2;
        try {
            valueOf = Alignment.valueOf("ALIGN_LEFT");
            valueOf2 = Alignment.valueOf("ALIGN_RIGHT");
        } catch (Exception e) {
            valueOf = Alignment.ALIGN_NORMAL;
            valueOf2 = Alignment.ALIGN_NORMAL;
        }
        f19784a = valueOf;
        f19785b = valueOf2;
    }
}
