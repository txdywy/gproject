package android.support.v7.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.RectF;
import android.os.Build.VERSION;
import android.text.TextPaint;
import android.util.Log;
import android.util.TypedValue;
import android.widget.TextView;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Hashtable;
import java.util.List;

final class bh {
    public static final RectF f3198a = new RectF();
    public static Hashtable f3199b = new Hashtable();
    public int f3200c = 0;
    public boolean f3201d = false;
    public float f3202e = -1.0f;
    public float f3203f = -1.0f;
    public float f3204g = -1.0f;
    public int[] f3205h = new int[0];
    public boolean f3206i = false;
    public TextPaint f3207j;
    public final TextView f3208k;
    public final Context f3209l;

    bh(TextView textView) {
        this.f3208k = textView;
        this.f3209l = this.f3208k.getContext();
    }

    final boolean m3252a() {
        int length = this.f3205h.length;
        this.f3206i = length > 0;
        if (this.f3206i) {
            this.f3200c = 1;
            this.f3203f = (float) this.f3205h[0];
            this.f3204g = (float) this.f3205h[length - 1];
            this.f3202e = -1.0f;
        }
        return this.f3206i;
    }

    static int[] m3249a(int[] iArr) {
        int size;
        if (size != 0) {
            int i;
            Arrays.sort(iArr);
            List arrayList = new ArrayList();
            for (int i2 : iArr) {
                if (i2 > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i2)) < 0) {
                    arrayList.add(Integer.valueOf(i2));
                }
            }
            if (size != arrayList.size()) {
                size = arrayList.size();
                iArr = new int[size];
                for (i = 0; i < size; i++) {
                    iArr[i] = ((Integer) arrayList.get(i)).intValue();
                }
            }
        }
        return iArr;
    }

    final void m3250a(float f, float f2, float f3) {
        if (f <= 0.0f) {
            throw new IllegalArgumentException("Minimum auto-size text size (" + f + "px) is less or equal to (0px)");
        } else if (f2 <= f) {
            throw new IllegalArgumentException("Maximum auto-size text size (" + f2 + "px) is less or equal to minimum auto-size text size (" + f + "px)");
        } else if (f3 <= 0.0f) {
            throw new IllegalArgumentException("The auto-size step granularity (" + f3 + "px) is less or equal to (0px)");
        } else {
            this.f3200c = 1;
            this.f3203f = f;
            this.f3204g = f2;
            this.f3202e = f3;
            this.f3206i = false;
        }
    }

    final boolean m3253b() {
        if (m3256e() && this.f3200c == 1) {
            if (!this.f3206i || this.f3205h.length == 0) {
                float round = (float) Math.round(this.f3203f);
                int i = 1;
                while (Math.round(this.f3202e + round) <= Math.round(this.f3204g)) {
                    i++;
                    round += this.f3202e;
                }
                int[] iArr = new int[i];
                float f = this.f3203f;
                for (int i2 = false; i2 < i; i2++) {
                    iArr[i2] = Math.round(f);
                    f += this.f3202e;
                }
                this.f3205h = m3249a(iArr);
            }
            this.f3201d = true;
        } else {
            this.f3201d = false;
        }
        return this.f3201d;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    final void m3254c() {
        /*
        r15 = this;
        r0 = r15.m3255d();
        if (r0 != 0) goto L_0x0007;
    L_0x0006:
        return;
    L_0x0007:
        r0 = r15.f3201d;
        if (r0 == 0) goto L_0x01ff;
    L_0x000b:
        r0 = r15.f3208k;
        r0 = r0.getMeasuredHeight();
        if (r0 <= 0) goto L_0x0006;
    L_0x0013:
        r0 = r15.f3208k;
        r0 = r0.getMeasuredWidth();
        if (r0 <= 0) goto L_0x0006;
    L_0x001b:
        r0 = r15.f3208k;
        r1 = "getHorizontallyScrolling";
        r2 = 0;
        r2 = java.lang.Boolean.valueOf(r2);
        r0 = m3247a(r0, r1, r2);
        r0 = (java.lang.Boolean) r0;
        r0 = r0.booleanValue();
        if (r0 == 0) goto L_0x006e;
    L_0x0030:
        r0 = 1048576; // 0x100000 float:1.469368E-39 double:5.180654E-318;
    L_0x0032:
        r1 = r15.f3208k;
        r1 = r1.getHeight();
        r2 = r15.f3208k;
        r2 = r2.getCompoundPaddingBottom();
        r1 = r1 - r2;
        r2 = r15.f3208k;
        r2 = r2.getCompoundPaddingTop();
        r1 = r1 - r2;
        if (r0 <= 0) goto L_0x0006;
    L_0x0048:
        if (r1 <= 0) goto L_0x0006;
    L_0x004a:
        r11 = f3198a;
        monitor-enter(r11);
        r2 = f3198a;	 Catch:{ all -> 0x006b }
        r2.setEmpty();	 Catch:{ all -> 0x006b }
        r2 = f3198a;	 Catch:{ all -> 0x006b }
        r0 = (float) r0;	 Catch:{ all -> 0x006b }
        r2.right = r0;	 Catch:{ all -> 0x006b }
        r0 = f3198a;	 Catch:{ all -> 0x006b }
        r1 = (float) r1;	 Catch:{ all -> 0x006b }
        r0.bottom = r1;	 Catch:{ all -> 0x006b }
        r12 = f3198a;	 Catch:{ all -> 0x006b }
        r0 = r15.f3205h;	 Catch:{ all -> 0x006b }
        r0 = r0.length;	 Catch:{ all -> 0x006b }
        if (r0 != 0) goto L_0x0083;
    L_0x0063:
        r0 = new java.lang.IllegalStateException;	 Catch:{ all -> 0x006b }
        r1 = "No available text sizes to choose from.";
        r0.<init>(r1);	 Catch:{ all -> 0x006b }
        throw r0;	 Catch:{ all -> 0x006b }
    L_0x006b:
        r0 = move-exception;
        monitor-exit(r11);	 Catch:{ all -> 0x006b }
        throw r0;
    L_0x006e:
        r0 = r15.f3208k;
        r0 = r0.getMeasuredWidth();
        r1 = r15.f3208k;
        r1 = r1.getTotalPaddingLeft();
        r0 = r0 - r1;
        r1 = r15.f3208k;
        r1 = r1.getTotalPaddingRight();
        r0 = r0 - r1;
        goto L_0x0032;
    L_0x0083:
        r10 = 0;
        r1 = 1;
        r0 = r0 + -1;
        r9 = r0;
        r0 = r10;
        r10 = r1;
    L_0x008a:
        if (r10 > r9) goto L_0x01eb;
    L_0x008c:
        r0 = r10 + r9;
        r13 = r0 / 2;
        r0 = r15.f3205h;	 Catch:{ all -> 0x006b }
        r2 = r0[r13];	 Catch:{ all -> 0x006b }
        r0 = r15.f3208k;	 Catch:{ all -> 0x006b }
        r0 = r0.getText();	 Catch:{ all -> 0x006b }
        r1 = r15.f3208k;	 Catch:{ all -> 0x006b }
        r1 = r1.getTransformationMethod();	 Catch:{ all -> 0x006b }
        if (r1 == 0) goto L_0x0204;
    L_0x00a2:
        r3 = r15.f3208k;	 Catch:{ all -> 0x006b }
        r1 = r1.getTransformation(r0, r3);	 Catch:{ all -> 0x006b }
        if (r1 == 0) goto L_0x0204;
    L_0x00aa:
        r0 = android.os.Build.VERSION.SDK_INT;	 Catch:{ all -> 0x006b }
        r3 = 16;
        if (r0 < r3) goto L_0x0168;
    L_0x00b0:
        r0 = r15.f3208k;	 Catch:{ all -> 0x006b }
        r8 = r0.getMaxLines();	 Catch:{ all -> 0x006b }
    L_0x00b6:
        r0 = r15.f3207j;	 Catch:{ all -> 0x006b }
        if (r0 != 0) goto L_0x016b;
    L_0x00ba:
        r0 = new android.text.TextPaint;	 Catch:{ all -> 0x006b }
        r0.<init>();	 Catch:{ all -> 0x006b }
        r15.f3207j = r0;	 Catch:{ all -> 0x006b }
    L_0x00c1:
        r0 = r15.f3207j;	 Catch:{ all -> 0x006b }
        r3 = r15.f3208k;	 Catch:{ all -> 0x006b }
        r3 = r3.getPaint();	 Catch:{ all -> 0x006b }
        r0.set(r3);	 Catch:{ all -> 0x006b }
        r0 = r15.f3207j;	 Catch:{ all -> 0x006b }
        r2 = (float) r2;	 Catch:{ all -> 0x006b }
        r0.setTextSize(r2);	 Catch:{ all -> 0x006b }
        r0 = r15.f3208k;	 Catch:{ all -> 0x006b }
        r2 = "getLayoutAlignment";
        r3 = android.text.Layout.Alignment.ALIGN_NORMAL;	 Catch:{ all -> 0x006b }
        r4 = m3247a(r0, r2, r3);	 Catch:{ all -> 0x006b }
        r4 = (android.text.Layout.Alignment) r4;	 Catch:{ all -> 0x006b }
        r0 = android.os.Build.VERSION.SDK_INT;	 Catch:{ all -> 0x006b }
        r2 = 23;
        if (r0 < r2) goto L_0x0174;
    L_0x00e4:
        r0 = r12.right;	 Catch:{ all -> 0x006b }
        r2 = java.lang.Math.round(r0);	 Catch:{ all -> 0x006b }
        r0 = r15.f3208k;	 Catch:{ all -> 0x006b }
        r3 = "getTextDirectionHeuristic";
        r5 = android.text.TextDirectionHeuristics.FIRSTSTRONG_LTR;	 Catch:{ all -> 0x006b }
        r0 = m3247a(r0, r3, r5);	 Catch:{ all -> 0x006b }
        r0 = (android.text.TextDirectionHeuristic) r0;	 Catch:{ all -> 0x006b }
        r3 = 0;
        r5 = r1.length();	 Catch:{ all -> 0x006b }
        r6 = r15.f3207j;	 Catch:{ all -> 0x006b }
        r2 = android.text.StaticLayout.Builder.obtain(r1, r3, r5, r6, r2);	 Catch:{ all -> 0x006b }
        r2 = r2.setAlignment(r4);	 Catch:{ all -> 0x006b }
        r3 = r15.f3208k;	 Catch:{ all -> 0x006b }
        r3 = r3.getLineSpacingExtra();	 Catch:{ all -> 0x006b }
        r4 = r15.f3208k;	 Catch:{ all -> 0x006b }
        r4 = r4.getLineSpacingMultiplier();	 Catch:{ all -> 0x006b }
        r2 = r2.setLineSpacing(r3, r4);	 Catch:{ all -> 0x006b }
        r3 = r15.f3208k;	 Catch:{ all -> 0x006b }
        r3 = r3.getIncludeFontPadding();	 Catch:{ all -> 0x006b }
        r2 = r2.setIncludePad(r3);	 Catch:{ all -> 0x006b }
        r3 = r15.f3208k;	 Catch:{ all -> 0x006b }
        r3 = r3.getBreakStrategy();	 Catch:{ all -> 0x006b }
        r2 = r2.setBreakStrategy(r3);	 Catch:{ all -> 0x006b }
        r3 = r15.f3208k;	 Catch:{ all -> 0x006b }
        r3 = r3.getHyphenationFrequency();	 Catch:{ all -> 0x006b }
        r3 = r2.setHyphenationFrequency(r3);	 Catch:{ all -> 0x006b }
        r2 = -1;
        if (r8 != r2) goto L_0x0172;
    L_0x0136:
        r2 = 2147483647; // 0x7fffffff float:NaN double:1.060997895E-314;
    L_0x0139:
        r2 = r3.setMaxLines(r2);	 Catch:{ all -> 0x006b }
        r0 = r2.setTextDirection(r0);	 Catch:{ all -> 0x006b }
        r0 = r0.build();	 Catch:{ all -> 0x006b }
    L_0x0145:
        r2 = -1;
        if (r8 == r2) goto L_0x01d5;
    L_0x0148:
        r2 = r0.getLineCount();	 Catch:{ all -> 0x006b }
        if (r2 > r8) goto L_0x015e;
    L_0x014e:
        r2 = r0.getLineCount();	 Catch:{ all -> 0x006b }
        r2 = r2 + -1;
        r2 = r0.getLineEnd(r2);	 Catch:{ all -> 0x006b }
        r1 = r1.length();	 Catch:{ all -> 0x006b }
        if (r2 == r1) goto L_0x01d5;
    L_0x015e:
        r0 = 0;
    L_0x015f:
        if (r0 == 0) goto L_0x01e6;
    L_0x0161:
        r0 = r13 + 1;
        r14 = r0;
        r0 = r10;
        r10 = r14;
        goto L_0x008a;
    L_0x0168:
        r8 = -1;
        goto L_0x00b6;
    L_0x016b:
        r0 = r15.f3207j;	 Catch:{ all -> 0x006b }
        r0.reset();	 Catch:{ all -> 0x006b }
        goto L_0x00c1;
    L_0x0172:
        r2 = r8;
        goto L_0x0139;
    L_0x0174:
        r0 = r12.right;	 Catch:{ all -> 0x006b }
        r3 = java.lang.Math.round(r0);	 Catch:{ all -> 0x006b }
        r0 = android.os.Build.VERSION.SDK_INT;	 Catch:{ all -> 0x006b }
        r2 = 16;
        if (r0 < r2) goto L_0x019a;
    L_0x0180:
        r0 = r15.f3208k;	 Catch:{ all -> 0x006b }
        r5 = r0.getLineSpacingMultiplier();	 Catch:{ all -> 0x006b }
        r0 = r15.f3208k;	 Catch:{ all -> 0x006b }
        r6 = r0.getLineSpacingExtra();	 Catch:{ all -> 0x006b }
        r0 = r15.f3208k;	 Catch:{ all -> 0x006b }
        r7 = r0.getIncludeFontPadding();	 Catch:{ all -> 0x006b }
    L_0x0192:
        r0 = new android.text.StaticLayout;	 Catch:{ all -> 0x006b }
        r2 = r15.f3207j;	 Catch:{ all -> 0x006b }
        r0.<init>(r1, r2, r3, r4, r5, r6, r7);	 Catch:{ all -> 0x006b }
        goto L_0x0145;
    L_0x019a:
        r0 = r15.f3208k;	 Catch:{ all -> 0x006b }
        r2 = "getLineSpacingMultiplier";
        r5 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r5 = java.lang.Float.valueOf(r5);	 Catch:{ all -> 0x006b }
        r0 = m3247a(r0, r2, r5);	 Catch:{ all -> 0x006b }
        r0 = (java.lang.Float) r0;	 Catch:{ all -> 0x006b }
        r5 = r0.floatValue();	 Catch:{ all -> 0x006b }
        r0 = r15.f3208k;	 Catch:{ all -> 0x006b }
        r2 = "getLineSpacingExtra";
        r6 = 0;
        r6 = java.lang.Float.valueOf(r6);	 Catch:{ all -> 0x006b }
        r0 = m3247a(r0, r2, r6);	 Catch:{ all -> 0x006b }
        r0 = (java.lang.Float) r0;	 Catch:{ all -> 0x006b }
        r6 = r0.floatValue();	 Catch:{ all -> 0x006b }
        r0 = r15.f3208k;	 Catch:{ all -> 0x006b }
        r2 = "getIncludeFontPadding";
        r7 = 1;
        r7 = java.lang.Boolean.valueOf(r7);	 Catch:{ all -> 0x006b }
        r0 = m3247a(r0, r2, r7);	 Catch:{ all -> 0x006b }
        r0 = (java.lang.Boolean) r0;	 Catch:{ all -> 0x006b }
        r7 = r0.booleanValue();	 Catch:{ all -> 0x006b }
        goto L_0x0192;
    L_0x01d5:
        r0 = r0.getHeight();	 Catch:{ all -> 0x006b }
        r0 = (float) r0;	 Catch:{ all -> 0x006b }
        r1 = r12.bottom;	 Catch:{ all -> 0x006b }
        r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1));
        if (r0 <= 0) goto L_0x01e3;
    L_0x01e0:
        r0 = 0;
        goto L_0x015f;
    L_0x01e3:
        r0 = 1;
        goto L_0x015f;
    L_0x01e6:
        r0 = r13 + -1;
        r9 = r0;
        goto L_0x008a;
    L_0x01eb:
        r1 = r15.f3205h;	 Catch:{ all -> 0x006b }
        r0 = r1[r0];	 Catch:{ all -> 0x006b }
        r0 = (float) r0;	 Catch:{ all -> 0x006b }
        r1 = r15.f3208k;	 Catch:{ all -> 0x006b }
        r1 = r1.getTextSize();	 Catch:{ all -> 0x006b }
        r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1));
        if (r1 == 0) goto L_0x01fe;
    L_0x01fa:
        r1 = 0;
        r15.m3251a(r1, r0);	 Catch:{ all -> 0x006b }
    L_0x01fe:
        monitor-exit(r11);	 Catch:{ all -> 0x006b }
    L_0x01ff:
        r0 = 1;
        r15.f3201d = r0;
        goto L_0x0006;
    L_0x0204:
        r1 = r0;
        goto L_0x00aa;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.bh.c():void");
    }

    final void m3251a(int i, float f) {
        Resources system;
        if (this.f3209l == null) {
            system = Resources.getSystem();
        } else {
            system = this.f3209l.getResources();
        }
        float applyDimension = TypedValue.applyDimension(i, f, system.getDisplayMetrics());
        if (applyDimension != this.f3208k.getPaint().getTextSize()) {
            boolean isInLayout;
            this.f3208k.getPaint().setTextSize(applyDimension);
            if (VERSION.SDK_INT >= 18) {
                isInLayout = this.f3208k.isInLayout();
            } else {
                isInLayout = false;
            }
            if (this.f3208k.getLayout() != null) {
                this.f3201d = false;
                try {
                    Method a = m3248a("nullLayouts");
                    if (a != null) {
                        a.invoke(this.f3208k, new Object[0]);
                    }
                } catch (Throwable e) {
                    Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#nullLayouts() method", e);
                }
                if (isInLayout) {
                    this.f3208k.forceLayout();
                } else {
                    this.f3208k.requestLayout();
                }
                this.f3208k.invalidate();
            }
        }
    }

    private static Object m3247a(Object obj, String str, Object obj2) {
        try {
            obj2 = m3248a(str).invoke(obj, new Object[0]);
            return obj2 == null ? obj2 : obj2;
        } catch (Throwable e) {
            Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#" + str + "() method", e);
        }
    }

    private static Method m3248a(String str) {
        try {
            Method method = (Method) f3199b.get(str);
            if (method != null) {
                return method;
            }
            method = TextView.class.getDeclaredMethod(str, new Class[0]);
            if (method == null) {
                return method;
            }
            method.setAccessible(true);
            f3199b.put(str, method);
            return method;
        } catch (Throwable e) {
            Log.w("ACTVAutoSizeHelper", "Failed to retrieve TextView#" + str + "() method", e);
            return null;
        }
    }

    final boolean m3255d() {
        return m3256e() && this.f3200c != 0;
    }

    final boolean m3256e() {
        return !(this.f3208k instanceof al);
    }
}
