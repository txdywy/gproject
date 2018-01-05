package android.support.p011c.p012a;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;
import android.os.Build.VERSION;
import android.support.v4.p013b.C0269b;
import android.support.v4.p013b.p014a.C0259a;
import android.support.v4.p028a.p029a.C0206f;
import android.support.v4.p028a.p029a.C0210j;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import java.util.Stack;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public final class C0054l extends C0044k {
    public static final Mode f86a = Mode.SRC_IN;
    public C0060r f87b;
    public PorterDuffColorFilter f88c;
    public ColorFilter f89d;
    public boolean f90f;
    public boolean f91g;
    public final float[] f92h;
    public final Matrix f93i;
    public final Rect f94j;

    C0054l() {
        this.f91g = true;
        this.f92h = new float[9];
        this.f93i = new Matrix();
        this.f94j = new Rect();
        this.f87b = new C0060r();
    }

    C0054l(C0060r c0060r) {
        this.f91g = true;
        this.f92h = new float[9];
        this.f93i = new Matrix();
        this.f94j = new Rect();
        this.f87b = c0060r;
        this.f88c = m65a(c0060r.f142c, c0060r.f143d);
    }

    public final Drawable mutate() {
        if (this.e != null) {
            this.e.mutate();
        } else if (!this.f90f && super.mutate() == this) {
            this.f87b = new C0060r(this.f87b);
            this.f90f = true;
        }
        return this;
    }

    public final ConstantState getConstantState() {
        if (this.e != null && VERSION.SDK_INT >= 24) {
            return new C0061s(this.e.getConstantState());
        }
        this.f87b.f140a = getChangingConfigurations();
        return this.f87b;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void draw(android.graphics.Canvas r12) {
        /*
        r11 = this;
        r10 = 2048; // 0x800 float:2.87E-42 double:1.0118E-320;
        r2 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r9 = 0;
        r4 = 1;
        r5 = 0;
        r0 = r11.e;
        if (r0 == 0) goto L_0x0011;
    L_0x000b:
        r0 = r11.e;
        r0.draw(r12);
    L_0x0010:
        return;
    L_0x0011:
        r0 = r11.f94j;
        r11.copyBounds(r0);
        r0 = r11.f94j;
        r0 = r0.width();
        if (r0 <= 0) goto L_0x0010;
    L_0x001e:
        r0 = r11.f94j;
        r0 = r0.height();
        if (r0 <= 0) goto L_0x0010;
    L_0x0026:
        r0 = r11.f89d;
        if (r0 != 0) goto L_0x0105;
    L_0x002a:
        r0 = r11.f88c;
    L_0x002c:
        r1 = r11.f93i;
        r12.getMatrix(r1);
        r1 = r11.f93i;
        r3 = r11.f92h;
        r1.getValues(r3);
        r1 = r11.f92h;
        r1 = r1[r5];
        r3 = java.lang.Math.abs(r1);
        r1 = r11.f92h;
        r6 = 4;
        r1 = r1[r6];
        r1 = java.lang.Math.abs(r1);
        r6 = r11.f92h;
        r6 = r6[r4];
        r6 = java.lang.Math.abs(r6);
        r7 = r11.f92h;
        r8 = 3;
        r7 = r7[r8];
        r7 = java.lang.Math.abs(r7);
        r6 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1));
        if (r6 != 0) goto L_0x0062;
    L_0x005e:
        r6 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1));
        if (r6 == 0) goto L_0x0064;
    L_0x0062:
        r1 = r2;
        r3 = r2;
    L_0x0064:
        r6 = r11.f94j;
        r6 = r6.width();
        r6 = (float) r6;
        r3 = r3 * r6;
        r3 = (int) r3;
        r6 = r11.f94j;
        r6 = r6.height();
        r6 = (float) r6;
        r1 = r1 * r6;
        r1 = (int) r1;
        r3 = java.lang.Math.min(r10, r3);
        r6 = java.lang.Math.min(r10, r1);
        if (r3 <= 0) goto L_0x0010;
    L_0x0080:
        if (r6 <= 0) goto L_0x0010;
    L_0x0082:
        r7 = r12.save();
        r1 = r11.f94j;
        r1 = r1.left;
        r1 = (float) r1;
        r8 = r11.f94j;
        r8 = r8.top;
        r8 = (float) r8;
        r12.translate(r1, r8);
        r1 = android.os.Build.VERSION.SDK_INT;
        r8 = 17;
        if (r1 < r8) goto L_0x010b;
    L_0x0099:
        r1 = r11.isAutoMirrored();
        if (r1 == 0) goto L_0x0109;
    L_0x009f:
        r1 = android.support.v4.p013b.p014a.C0259a.m1527f(r11);
        if (r1 != r4) goto L_0x0109;
    L_0x00a5:
        r1 = r4;
    L_0x00a6:
        if (r1 == 0) goto L_0x00b7;
    L_0x00a8:
        r1 = r11.f94j;
        r1 = r1.width();
        r1 = (float) r1;
        r12.translate(r1, r9);
        r1 = -1082130432; // 0xffffffffbf800000 float:-1.0 double:NaN;
        r12.scale(r1, r2);
    L_0x00b7:
        r1 = r11.f94j;
        r1.offsetTo(r5, r5);
        r2 = r11.f87b;
        r1 = r2.f145f;
        if (r1 == 0) goto L_0x00d5;
    L_0x00c2:
        r1 = r2.f145f;
        r1 = r1.getWidth();
        if (r3 != r1) goto L_0x010d;
    L_0x00ca:
        r1 = r2.f145f;
        r1 = r1.getHeight();
        if (r6 != r1) goto L_0x010d;
    L_0x00d2:
        r1 = r4;
    L_0x00d3:
        if (r1 != 0) goto L_0x00df;
    L_0x00d5:
        r1 = android.graphics.Bitmap.Config.ARGB_8888;
        r1 = android.graphics.Bitmap.createBitmap(r3, r6, r1);
        r2.f145f = r1;
        r2.f150k = r4;
    L_0x00df:
        r1 = r11.f91g;
        if (r1 != 0) goto L_0x010f;
    L_0x00e3:
        r1 = r11.f87b;
        r1.m73a(r3, r6);
    L_0x00e8:
        r2 = r11.f87b;
        r3 = r11.f94j;
        r1 = r2.f141b;
        r1 = r1.f137n;
        r6 = 255; // 0xff float:3.57E-43 double:1.26E-321;
        if (r1 >= r6) goto L_0x0150;
    L_0x00f4:
        r1 = r4;
    L_0x00f5:
        if (r1 != 0) goto L_0x0152;
    L_0x00f7:
        if (r0 != 0) goto L_0x0152;
    L_0x00f9:
        r0 = 0;
    L_0x00fa:
        r1 = r2.f145f;
        r2 = 0;
        r12.drawBitmap(r1, r2, r3, r0);
        r12.restoreToCount(r7);
        goto L_0x0010;
    L_0x0105:
        r0 = r11.f89d;
        goto L_0x002c;
    L_0x0109:
        r1 = r5;
        goto L_0x00a6;
    L_0x010b:
        r1 = r5;
        goto L_0x00a6;
    L_0x010d:
        r1 = r5;
        goto L_0x00d3;
    L_0x010f:
        r1 = r11.f87b;
        r2 = r1.f150k;
        if (r2 != 0) goto L_0x014e;
    L_0x0115:
        r2 = r1.f146g;
        r8 = r1.f142c;
        if (r2 != r8) goto L_0x014e;
    L_0x011b:
        r2 = r1.f147h;
        r8 = r1.f143d;
        if (r2 != r8) goto L_0x014e;
    L_0x0121:
        r2 = r1.f149j;
        r8 = r1.f144e;
        if (r2 != r8) goto L_0x014e;
    L_0x0127:
        r2 = r1.f148i;
        r1 = r1.f141b;
        r1 = r1.f137n;
        if (r2 != r1) goto L_0x014e;
    L_0x012f:
        r1 = r4;
    L_0x0130:
        if (r1 != 0) goto L_0x00e8;
    L_0x0132:
        r1 = r11.f87b;
        r1.m73a(r3, r6);
        r1 = r11.f87b;
        r2 = r1.f142c;
        r1.f146g = r2;
        r2 = r1.f143d;
        r1.f147h = r2;
        r2 = r1.f141b;
        r2 = r2.f137n;
        r1.f148i = r2;
        r2 = r1.f144e;
        r1.f149j = r2;
        r1.f150k = r5;
        goto L_0x00e8;
    L_0x014e:
        r1 = r5;
        goto L_0x0130;
    L_0x0150:
        r1 = r5;
        goto L_0x00f5;
    L_0x0152:
        r1 = r2.f151l;
        if (r1 != 0) goto L_0x0162;
    L_0x0156:
        r1 = new android.graphics.Paint;
        r1.<init>();
        r2.f151l = r1;
        r1 = r2.f151l;
        r1.setFilterBitmap(r4);
    L_0x0162:
        r1 = r2.f151l;
        r4 = r2.f141b;
        r4 = r4.f137n;
        r1.setAlpha(r4);
        r1 = r2.f151l;
        r1.setColorFilter(r0);
        r0 = r2.f151l;
        goto L_0x00fa;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.c.a.l.draw(android.graphics.Canvas):void");
    }

    public final int getAlpha() {
        if (this.e != null) {
            return C0259a.m1522b(this.e);
        }
        return this.f87b.f141b.f137n;
    }

    public final void setAlpha(int i) {
        if (this.e != null) {
            this.e.setAlpha(i);
        } else if (this.f87b.f141b.f137n != i) {
            this.f87b.f141b.f137n = i;
            invalidateSelf();
        }
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        if (this.e != null) {
            this.e.setColorFilter(colorFilter);
            return;
        }
        this.f89d = colorFilter;
        invalidateSelf();
    }

    private final PorterDuffColorFilter m65a(ColorStateList colorStateList, Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    public final void setTint(int i) {
        if (this.e != null) {
            C0259a.m1514a(this.e, i);
        } else {
            setTintList(ColorStateList.valueOf(i));
        }
    }

    public final void setTintList(ColorStateList colorStateList) {
        if (this.e != null) {
            C0259a.m1516a(this.e, colorStateList);
            return;
        }
        C0060r c0060r = this.f87b;
        if (c0060r.f142c != colorStateList) {
            c0060r.f142c = colorStateList;
            this.f88c = m65a(colorStateList, c0060r.f143d);
            invalidateSelf();
        }
    }

    public final void setTintMode(Mode mode) {
        if (this.e != null) {
            C0259a.m1519a(this.e, mode);
            return;
        }
        C0060r c0060r = this.f87b;
        if (c0060r.f143d != mode) {
            c0060r.f143d = mode;
            this.f88c = m65a(c0060r.f142c, mode);
            invalidateSelf();
        }
    }

    public final boolean isStateful() {
        if (this.e != null) {
            return this.e.isStateful();
        }
        return super.isStateful() || !(this.f87b == null || this.f87b.f142c == null || !this.f87b.f142c.isStateful());
    }

    protected final boolean onStateChange(int[] iArr) {
        if (this.e != null) {
            return this.e.setState(iArr);
        }
        C0060r c0060r = this.f87b;
        if (c0060r.f142c == null || c0060r.f143d == null) {
            return false;
        }
        this.f88c = m65a(c0060r.f142c, c0060r.f143d);
        invalidateSelf();
        return true;
    }

    public final int getOpacity() {
        if (this.e != null) {
            return this.e.getOpacity();
        }
        return -3;
    }

    public final int getIntrinsicWidth() {
        if (this.e != null) {
            return this.e.getIntrinsicWidth();
        }
        return (int) this.f87b.f141b.f133j;
    }

    public final int getIntrinsicHeight() {
        if (this.e != null) {
            return this.e.getIntrinsicHeight();
        }
        return (int) this.f87b.f141b.f134k;
    }

    public final boolean canApplyTheme() {
        if (this.e != null) {
            C0259a.m1524c(this.e);
        }
        return false;
    }

    public final boolean isAutoMirrored() {
        if (this.e != null) {
            return C0259a.m1521a(this.e);
        }
        return this.f87b.f144e;
    }

    public final void setAutoMirrored(boolean z) {
        if (this.e != null) {
            C0259a.m1520a(this.e, z);
        } else {
            this.f87b.f144e = z;
        }
    }

    public static C0054l m66a(Resources resources, int i, Theme theme) {
        if (VERSION.SDK_INT >= 24) {
            C0054l c0054l = new C0054l();
            c0054l.e = C0206f.m1065a(resources, i, theme);
            C0061s c0061s = new C0061s(c0054l.e.getConstantState());
            return c0054l;
        }
        try {
            int next;
            XmlPullParser xml = resources.getXml(i);
            AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
            do {
                next = xml.next();
                if (next == 2) {
                    break;
                }
            } while (next != 1);
            if (next == 2) {
                return C0054l.m67a(resources, xml, asAttributeSet, theme);
            }
            throw new XmlPullParserException("No start tag found");
        } catch (Throwable e) {
            Log.e("VectorDrawableCompat", "parser error", e);
            return null;
        } catch (Throwable e2) {
            Log.e("VectorDrawableCompat", "parser error", e2);
            return null;
        }
    }

    public static C0054l m67a(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Theme theme) {
        C0054l c0054l = new C0054l();
        c0054l.inflate(resources, xmlPullParser, attributeSet, theme);
        return c0054l;
    }

    static int m64a(int i, float f) {
        return (((int) (((float) Color.alpha(i)) * f)) << 24) | (16777215 & i);
    }

    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        if (this.e != null) {
            this.e.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }

    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Theme theme) {
        if (this.e != null) {
            C0259a.m1518a(this.e, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        C0060r c0060r = this.f87b;
        c0060r.f141b = new C0059q();
        TypedArray a = C0210j.m1074a(resources, theme, attributeSet, C0042a.f58a);
        C0060r c0060r2 = this.f87b;
        C0059q c0059q = c0060r2.f141b;
        int a2 = C0210j.m1073a(a, xmlPullParser, "tintMode", 6, -1);
        Mode mode = Mode.SRC_IN;
        switch (a2) {
            case 3:
                mode = Mode.SRC_OVER;
                break;
            case 5:
                mode = Mode.SRC_IN;
                break;
            case 9:
                mode = Mode.SRC_ATOP;
                break;
            case 14:
                mode = Mode.MULTIPLY;
                break;
            case 15:
                mode = Mode.SCREEN;
                break;
            case 16:
                if (VERSION.SDK_INT >= 11) {
                    mode = Mode.ADD;
                    break;
                }
                break;
        }
        c0060r2.f143d = mode;
        ColorStateList colorStateList = a.getColorStateList(1);
        if (colorStateList != null) {
            c0060r2.f142c = colorStateList;
        }
        boolean z = c0060r2.f144e;
        if (C0210j.m1076a(xmlPullParser, "autoMirrored")) {
            z = a.getBoolean(5, z);
        }
        c0060r2.f144e = z;
        c0059q.f135l = C0210j.m1071a(a, xmlPullParser, "viewportWidth", 7, c0059q.f135l);
        c0059q.f136m = C0210j.m1071a(a, xmlPullParser, "viewportHeight", 8, c0059q.f136m);
        if (c0059q.f135l <= 0.0f) {
            throw new XmlPullParserException(a.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        } else if (c0059q.f136m <= 0.0f) {
            throw new XmlPullParserException(a.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
        } else {
            c0059q.f133j = a.getDimension(3, c0059q.f133j);
            c0059q.f134k = a.getDimension(2, c0059q.f134k);
            if (c0059q.f133j <= 0.0f) {
                throw new XmlPullParserException(a.getPositionDescription() + "<vector> tag requires width > 0");
            } else if (c0059q.f134k <= 0.0f) {
                throw new XmlPullParserException(a.getPositionDescription() + "<vector> tag requires height > 0");
            } else {
                c0059q.f137n = (int) (C0210j.m1071a(a, xmlPullParser, "alpha", 4, ((float) c0059q.f137n) / 255.0f) * 255.0f);
                String string = a.getString(0);
                if (string != null) {
                    c0059q.f138o = string;
                    c0059q.f139p.put(string, c0059q);
                }
                a.recycle();
                c0060r.f140a = getChangingConfigurations();
                c0060r.f150k = true;
                m68b(resources, xmlPullParser, attributeSet, theme);
                this.f88c = m65a(c0060r.f142c, c0060r.f143d);
            }
        }
    }

    private final void m68b(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Theme theme) {
        C0060r c0060r = this.f87b;
        C0059q c0059q = c0060r.f141b;
        Object obj = 1;
        Stack stack = new Stack();
        stack.push(c0059q.f132i);
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            Object obj2;
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                C0058o c0058o = (C0058o) stack.peek();
                C0055p c0057n;
                TypedArray a;
                if ("path".equals(name)) {
                    c0057n = new C0057n();
                    a = C0210j.m1074a(resources, theme, attributeSet, C0042a.f60c);
                    c0057n.f98a = null;
                    if (C0210j.m1076a(xmlPullParser, "pathData")) {
                        String string = a.getString(0);
                        if (string != null) {
                            c0057n.o = string;
                        }
                        string = a.getString(2);
                        if (string != null) {
                            c0057n.n = C0269b.m1551b(string);
                        }
                        c0057n.f101d = C0210j.m1077b(a, xmlPullParser, "fillColor", 1, c0057n.f101d);
                        c0057n.f104g = C0210j.m1071a(a, xmlPullParser, "fillAlpha", 12, c0057n.f104g);
                        int a2 = C0210j.m1073a(a, xmlPullParser, "strokeLineCap", 8, -1);
                        Cap cap = c0057n.f108k;
                        switch (a2) {
                            case 0:
                                cap = Cap.BUTT;
                                break;
                            case 1:
                                cap = Cap.ROUND;
                                break;
                            case 2:
                                cap = Cap.SQUARE;
                                break;
                        }
                        c0057n.f108k = cap;
                        a2 = C0210j.m1073a(a, xmlPullParser, "strokeLineJoin", 9, -1);
                        Join join = c0057n.f109l;
                        switch (a2) {
                            case 0:
                                join = Join.MITER;
                                break;
                            case 1:
                                join = Join.ROUND;
                                break;
                            case 2:
                                join = Join.BEVEL;
                                break;
                        }
                        c0057n.f109l = join;
                        c0057n.f110m = C0210j.m1071a(a, xmlPullParser, "strokeMiterLimit", 10, c0057n.f110m);
                        c0057n.f99b = C0210j.m1077b(a, xmlPullParser, "strokeColor", 3, c0057n.f99b);
                        c0057n.f102e = C0210j.m1071a(a, xmlPullParser, "strokeAlpha", 11, c0057n.f102e);
                        c0057n.f100c = C0210j.m1071a(a, xmlPullParser, "strokeWidth", 4, c0057n.f100c);
                        c0057n.f106i = C0210j.m1071a(a, xmlPullParser, "trimPathEnd", 6, c0057n.f106i);
                        c0057n.f107j = C0210j.m1071a(a, xmlPullParser, "trimPathOffset", 7, c0057n.f107j);
                        c0057n.f105h = C0210j.m1071a(a, xmlPullParser, "trimPathStart", 5, c0057n.f105h);
                        c0057n.f103f = C0210j.m1073a(a, xmlPullParser, "fillType", 13, c0057n.f103f);
                    }
                    a.recycle();
                    c0058o.f112b.add(c0057n);
                    if (c0057n.f96o != null) {
                        c0059q.f139p.put(c0057n.f96o, c0057n);
                    }
                    obj2 = null;
                    c0060r.f140a |= c0057n.p;
                } else if ("clip-path".equals(name)) {
                    c0057n = new C0056m();
                    if (C0210j.m1076a(xmlPullParser, "pathData")) {
                        a = C0210j.m1074a(resources, theme, attributeSet, C0042a.f61d);
                        r11 = a.getString(0);
                        if (r11 != null) {
                            c0057n.o = r11;
                        }
                        r11 = a.getString(1);
                        if (r11 != null) {
                            c0057n.n = C0269b.m1551b(r11);
                        }
                        a.recycle();
                    }
                    c0058o.f112b.add(c0057n);
                    if (c0057n.f96o != null) {
                        c0059q.f139p.put(c0057n.f96o, c0057n);
                    }
                    c0060r.f140a |= c0057n.p;
                    obj2 = obj;
                } else {
                    if ("group".equals(name)) {
                        C0058o c0058o2 = new C0058o();
                        a = C0210j.m1074a(resources, theme, attributeSet, C0042a.f59b);
                        c0058o2.f122l = null;
                        c0058o2.f113c = C0210j.m1071a(a, xmlPullParser, "rotation", 5, c0058o2.f113c);
                        c0058o2.f114d = a.getFloat(1, c0058o2.f114d);
                        c0058o2.f115e = a.getFloat(2, c0058o2.f115e);
                        c0058o2.f116f = C0210j.m1071a(a, xmlPullParser, "scaleX", 3, c0058o2.f116f);
                        c0058o2.f117g = C0210j.m1071a(a, xmlPullParser, "scaleY", 4, c0058o2.f117g);
                        c0058o2.f118h = C0210j.m1071a(a, xmlPullParser, "translateX", 6, c0058o2.f118h);
                        c0058o2.f119i = C0210j.m1071a(a, xmlPullParser, "translateY", 7, c0058o2.f119i);
                        r11 = a.getString(0);
                        if (r11 != null) {
                            c0058o2.f123m = r11;
                        }
                        c0058o2.f120j.reset();
                        c0058o2.f120j.postTranslate(-c0058o2.f114d, -c0058o2.f115e);
                        c0058o2.f120j.postScale(c0058o2.f116f, c0058o2.f117g);
                        c0058o2.f120j.postRotate(c0058o2.f113c, 0.0f, 0.0f);
                        c0058o2.f120j.postTranslate(c0058o2.f118h + c0058o2.f114d, c0058o2.f119i + c0058o2.f115e);
                        a.recycle();
                        c0058o.f112b.add(c0058o2);
                        stack.push(c0058o2);
                        if (c0058o2.f123m != null) {
                            c0059q.f139p.put(c0058o2.f123m, c0058o2);
                        }
                        c0060r.f140a |= c0058o2.f121k;
                    }
                    obj2 = obj;
                }
            } else {
                if (eventType == 3) {
                    if ("group".equals(xmlPullParser.getName())) {
                        stack.pop();
                    }
                }
                obj2 = obj;
            }
            obj = obj2;
            eventType = xmlPullParser.next();
        }
        if (obj != null) {
            StringBuffer stringBuffer = new StringBuffer();
            if (stringBuffer.length() > 0) {
                stringBuffer.append(" or ");
            }
            stringBuffer.append("path");
            throw new XmlPullParserException("no " + stringBuffer + " defined");
        }
    }

    protected final void onBoundsChange(Rect rect) {
        if (this.e != null) {
            this.e.setBounds(rect);
        }
    }

    public final int getChangingConfigurations() {
        if (this.e != null) {
            return this.e.getChangingConfigurations();
        }
        return super.getChangingConfigurations() | this.f87b.getChangingConfigurations();
    }

    public final void invalidateSelf() {
        if (this.e != null) {
            this.e.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    public final void scheduleSelf(Runnable runnable, long j) {
        if (this.e != null) {
            this.e.scheduleSelf(runnable, j);
        } else {
            super.scheduleSelf(runnable, j);
        }
    }

    public final boolean setVisible(boolean z, boolean z2) {
        if (this.e != null) {
            return this.e.setVisible(z, z2);
        }
        return super.setVisible(z, z2);
    }

    public final void unscheduleSelf(Runnable runnable) {
        if (this.e != null) {
            this.e.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    public final /* bridge */ /* synthetic */ boolean setState(int[] iArr) {
        return super.setState(iArr);
    }

    public final /* bridge */ /* synthetic */ void setChangingConfigurations(int i) {
        super.setChangingConfigurations(i);
    }

    public final /* bridge */ /* synthetic */ Region getTransparentRegion() {
        return super.getTransparentRegion();
    }

    public final /* bridge */ /* synthetic */ int[] getState() {
        return super.getState();
    }

    public final /* bridge */ /* synthetic */ boolean getPadding(Rect rect) {
        return super.getPadding(rect);
    }

    public final /* bridge */ /* synthetic */ int getMinimumHeight() {
        return super.getMinimumHeight();
    }

    public final /* bridge */ /* synthetic */ int getMinimumWidth() {
        return super.getMinimumWidth();
    }

    public final /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    public final /* bridge */ /* synthetic */ void clearColorFilter() {
        super.clearColorFilter();
    }

    public final /* bridge */ /* synthetic */ void applyTheme(Theme theme) {
        super.applyTheme(theme);
    }

    public final /* bridge */ /* synthetic */ void jumpToCurrentState() {
        super.jumpToCurrentState();
    }

    public final /* bridge */ /* synthetic */ void setFilterBitmap(boolean z) {
        super.setFilterBitmap(z);
    }

    public final /* bridge */ /* synthetic */ void setHotspotBounds(int i, int i2, int i3, int i4) {
        super.setHotspotBounds(i, i2, i3, i4);
    }

    public final /* bridge */ /* synthetic */ void setHotspot(float f, float f2) {
        super.setHotspot(f, f2);
    }

    public final /* bridge */ /* synthetic */ ColorFilter getColorFilter() {
        return super.getColorFilter();
    }

    public final /* bridge */ /* synthetic */ void setColorFilter(int i, Mode mode) {
        super.setColorFilter(i, mode);
    }
}
