package com.google.android.libraries.flowlayoutmanager;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.v7.widget.fa;
import android.util.AttributeSet;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import java.lang.reflect.Field;

public final class C5927g extends fa {
    public static Field f29539A;
    public int f29540a;
    public int f29541b;
    public int f29542g;
    public int f29543h;
    public int f29544i;
    public float f29545j;
    public int f29546k;
    public int f29547l;
    public int f29548m;
    public int f29549n;
    public int f29550o;
    public int f29551p;
    public int f29552q;
    public int f29553r;
    public int f29554s;
    public int f29555t;
    public int f29556u;
    public int f29557v;
    public int f29558w;
    public int f29559x;
    public int f29560y;
    public int f29561z;

    public C5927g(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f29542g = 0;
        this.f29543h = 0;
        this.f29544i = 0;
        this.f29545j = 0.0f;
        this.f29546k = 0;
        this.f29547l = Integer.MAX_VALUE;
        this.f29548m = Integer.MAX_VALUE;
        this.f29549n = Integer.MAX_VALUE;
        this.f29550o = Integer.MAX_VALUE;
        this.f29551p = Integer.MAX_VALUE;
        this.f29552q = Integer.MAX_VALUE;
        this.f29553r = 0;
        this.f29554s = 0;
        this.f29555t = 0;
        this.f29556u = 0;
        this.f29557v = 0;
        this.f29558w = 0;
        this.f29559x = -1;
        this.f29560y = -1;
        this.f29561z = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C5933p.FlowLayoutManager_Layout_Style);
        int resourceId = obtainStyledAttributes.getResourceId(C5933p.FlowLayoutManager_Layout_Style_layout_flmStyle, C5932o.FlowLayoutManager_Layout_Default);
        obtainStyledAttributes.recycle();
        obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C5933p.FlowLayoutManager_Layout, 0, resourceId);
        this.f29540a = C5927g.m27495a(obtainStyledAttributes, "layout_flmWidth", C5933p.FlowLayoutManager_Layout_layout_flmWidth, this.width);
        this.f29541b = C5927g.m27495a(obtainStyledAttributes, "layout_flmHeight", C5933p.FlowLayoutManager_Layout_layout_flmHeight, this.height);
        this.f29542g = obtainStyledAttributes.getDimensionPixelOffset(C5933p.FlowLayoutManager_Layout_layout_flmGridInsetStart, 0);
        this.f29543h = obtainStyledAttributes.getDimensionPixelOffset(C5933p.FlowLayoutManager_Layout_layout_flmGridInsetEnd, 0);
        this.f29544i = obtainStyledAttributes.getDimensionPixelSize(C5933p.FlowLayoutManager_Layout_layout_flmMaxGridWidth, 0);
        this.f29545j = obtainStyledAttributes.getFloat(C5933p.FlowLayoutManager_Layout_layout_flmGridColumnCount, 0.0f);
        this.f29546k = obtainStyledAttributes.getDimensionPixelSize(C5933p.FlowLayoutManager_Layout_layout_flmGridMinCellSize, 0);
        resourceId = C5918a.m27464a(obtainStyledAttributes, "layout_flmMargin", C5933p.FlowLayoutManager_Layout_layout_flmMargin, false);
        this.f29547l = C5927g.m27497b(obtainStyledAttributes, "layout_flmMarginTop", C5933p.FlowLayoutManager_Layout_layout_flmMarginTop, resourceId);
        this.f29548m = C5927g.m27497b(obtainStyledAttributes, "layout_flmMarginStart", C5933p.FlowLayoutManager_Layout_layout_flmMarginStart, resourceId);
        this.f29549n = C5927g.m27497b(obtainStyledAttributes, "layout_flmMarginEnd", C5933p.FlowLayoutManager_Layout_layout_flmMarginEnd, resourceId);
        this.f29550o = C5927g.m27497b(obtainStyledAttributes, "layout_flmMarginBottom", C5933p.FlowLayoutManager_Layout_layout_flmMarginBottom, resourceId);
        this.f29551p = C5918a.m27464a(obtainStyledAttributes, "layout_flmMarginTopForFirstLine", C5933p.FlowLayoutManager_Layout_layout_flmMarginTopForFirstLine, false);
        this.f29552q = C5918a.m27464a(obtainStyledAttributes, "layout_flmMarginBottomForLastLine", C5933p.FlowLayoutManager_Layout_layout_flmMarginBottomForLastLine, false);
        this.f29553r = obtainStyledAttributes.getInteger(C5933p.FlowLayoutManager_Layout_layout_flmVAlign, 0);
        this.f29554s = obtainStyledAttributes.getInteger(C5933p.FlowLayoutManager_Layout_layout_flmFlow, 0);
        this.f29555t = C5918a.m27464a(obtainStyledAttributes, "layout_flmFlowInsetTop", C5933p.FlowLayoutManager_Layout_layout_flmFlowInsetTop, false);
        this.f29556u = C5918a.m27464a(obtainStyledAttributes, "layout_flmFlowInsetStart", C5933p.FlowLayoutManager_Layout_layout_flmFlowInsetStart, false);
        this.f29557v = C5918a.m27464a(obtainStyledAttributes, "layout_flmFlowInsetEnd", C5933p.FlowLayoutManager_Layout_layout_flmFlowInsetEnd, false);
        this.f29558w = C5918a.m27464a(obtainStyledAttributes, "layout_flmFlowInsetBottom", C5933p.FlowLayoutManager_Layout_layout_flmFlowInsetBottom, false);
        this.f29559x = C5918a.m27464a(obtainStyledAttributes, "layout_flmFlowWidth", C5933p.FlowLayoutManager_Layout_layout_flmFlowWidth, true);
        this.f29560y = C5918a.m27464a(obtainStyledAttributes, "layout_flmFlowHeight", C5933p.FlowLayoutManager_Layout_layout_flmFlowHeight, true);
        this.f29561z = obtainStyledAttributes.getInteger(C5933p.FlowLayoutManager_Layout_layout_flmLineWrap, 0);
        obtainStyledAttributes.recycle();
    }

    public C5927g(C5927g c5927g) {
        super((MarginLayoutParams) c5927g);
        this.f29542g = 0;
        this.f29543h = 0;
        this.f29544i = 0;
        this.f29545j = 0.0f;
        this.f29546k = 0;
        this.f29547l = Integer.MAX_VALUE;
        this.f29548m = Integer.MAX_VALUE;
        this.f29549n = Integer.MAX_VALUE;
        this.f29550o = Integer.MAX_VALUE;
        this.f29551p = Integer.MAX_VALUE;
        this.f29552q = Integer.MAX_VALUE;
        this.f29553r = 0;
        this.f29554s = 0;
        this.f29555t = 0;
        this.f29556u = 0;
        this.f29557v = 0;
        this.f29558w = 0;
        this.f29559x = -1;
        this.f29560y = -1;
        this.f29561z = 0;
        this.f29540a = c5927g.f29540a;
        this.f29541b = c5927g.f29541b;
        this.f29544i = c5927g.f29544i;
        this.f29542g = c5927g.f29542g;
        this.f29543h = c5927g.f29543h;
        this.f29545j = c5927g.f29545j;
        this.f29546k = c5927g.f29546k;
        this.f29547l = c5927g.f29547l;
        this.f29548m = c5927g.f29548m;
        this.f29549n = c5927g.f29549n;
        this.f29550o = c5927g.f29550o;
        this.f29551p = c5927g.f29551p;
        this.f29552q = c5927g.f29552q;
        this.f29553r = c5927g.f29553r;
        this.f29554s = c5927g.f29554s;
        this.f29555t = c5927g.f29555t;
        this.f29556u = c5927g.f29556u;
        this.f29557v = c5927g.f29557v;
        this.f29558w = c5927g.f29558w;
        this.f29559x = c5927g.f29559x;
        this.f29560y = c5927g.f29560y;
        this.f29561z = c5927g.f29561z;
    }

    public C5927g(MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.f29542g = 0;
        this.f29543h = 0;
        this.f29544i = 0;
        this.f29545j = 0.0f;
        this.f29546k = 0;
        this.f29547l = Integer.MAX_VALUE;
        this.f29548m = Integer.MAX_VALUE;
        this.f29549n = Integer.MAX_VALUE;
        this.f29550o = Integer.MAX_VALUE;
        this.f29551p = Integer.MAX_VALUE;
        this.f29552q = Integer.MAX_VALUE;
        this.f29553r = 0;
        this.f29554s = 0;
        this.f29555t = 0;
        this.f29556u = 0;
        this.f29557v = 0;
        this.f29558w = 0;
        this.f29559x = -1;
        this.f29560y = -1;
        this.f29561z = 0;
        this.f29540a = this.width;
        this.f29541b = this.height;
    }

    public C5927g(LayoutParams layoutParams) {
        super(layoutParams);
        this.f29542g = 0;
        this.f29543h = 0;
        this.f29544i = 0;
        this.f29545j = 0.0f;
        this.f29546k = 0;
        this.f29547l = Integer.MAX_VALUE;
        this.f29548m = Integer.MAX_VALUE;
        this.f29549n = Integer.MAX_VALUE;
        this.f29550o = Integer.MAX_VALUE;
        this.f29551p = Integer.MAX_VALUE;
        this.f29552q = Integer.MAX_VALUE;
        this.f29553r = 0;
        this.f29554s = 0;
        this.f29555t = 0;
        this.f29556u = 0;
        this.f29557v = 0;
        this.f29558w = 0;
        this.f29559x = -1;
        this.f29560y = -1;
        this.f29561z = 0;
        this.f29540a = this.width;
        this.f29541b = this.height;
    }

    public C5927g() {
        super(-2, -2);
        this.f29542g = 0;
        this.f29543h = 0;
        this.f29544i = 0;
        this.f29545j = 0.0f;
        this.f29546k = 0;
        this.f29547l = Integer.MAX_VALUE;
        this.f29548m = Integer.MAX_VALUE;
        this.f29549n = Integer.MAX_VALUE;
        this.f29550o = Integer.MAX_VALUE;
        this.f29551p = Integer.MAX_VALUE;
        this.f29552q = Integer.MAX_VALUE;
        this.f29553r = 0;
        this.f29554s = 0;
        this.f29555t = 0;
        this.f29556u = 0;
        this.f29557v = 0;
        this.f29558w = 0;
        this.f29559x = -1;
        this.f29560y = -1;
        this.f29561z = 0;
        this.f29540a = -2;
        this.f29541b = -2;
    }

    protected final void setBaseAttributes(TypedArray typedArray, int i, int i2) {
        this.width = typedArray.getLayoutDimension(i, Integer.MAX_VALUE);
        this.height = typedArray.getLayoutDimension(i2, Integer.MAX_VALUE);
    }

    private static int m27495a(TypedArray typedArray, String str, int i, int i2) {
        if (typedArray.hasValue(i) || i2 == Integer.MAX_VALUE) {
            return C5918a.m27464a(typedArray, str, i, true);
        }
        if (-2 <= i2 && i2 <= 16777215) {
            return i2;
        }
        String positionDescription = typedArray.getPositionDescription();
        throw new IllegalArgumentException(new StringBuilder((String.valueOf(positionDescription).length() + 36) + String.valueOf(str).length()).append(positionDescription).append(": out-of-range dimension length for ").append(str).toString());
    }

    private static int m27497b(TypedArray typedArray, String str, int i, int i2) {
        if (typedArray.hasValue(i)) {
            return C5918a.m27464a(typedArray, str, i, false);
        }
        return i2;
    }

    final int m27498a() {
        if (this.f29540a == -1 || this.f29554s != 0) {
            return 2;
        }
        return this.f29561z & 3;
    }

    final boolean m27501b() {
        return m27498a() == 2 && (this.f29561z & 12) == 8;
    }

    final int m27499a(float f) {
        if (this.f29547l == Integer.MAX_VALUE) {
            return this.topMargin;
        }
        return C5927g.m27496a("layout_flmMarginTop", this.f29547l, f, false);
    }

    final int m27500b(float f) {
        if (this.f29550o == Integer.MAX_VALUE) {
            return this.bottomMargin;
        }
        return C5927g.m27496a("layout_flmMarginBottom", this.f29550o, f, false);
    }

    final int m27502c(float f) {
        return C5927g.m27496a("layout_flmFlowHeight", this.f29560y, f, true);
    }

    final int m27504d(float f) {
        return C5927g.m27496a("layout_flmFlowInsetTop", this.f29555t, f, false);
    }

    final int m27505e(float f) {
        return C5927g.m27496a("layout_flmFlowInsetBottom", this.f29558w, f, false);
    }

    static int m27496a(String str, int i, float f, boolean z) {
        if (!C5918a.m27466b(i)) {
            return i;
        }
        if (z && i < 0) {
            return i;
        }
        if (!Float.isNaN(f)) {
            return (int) (Float.intBitsToFloat(i) * f);
        }
        throw new IllegalArgumentException(String.valueOf(str).concat(" uses grid-based measurement, which is disabled"));
    }

    final String m27503c() {
        if (f29539A == null) {
            try {
                Field declaredField = fa.class.getDeclaredField("c");
                declaredField.setAccessible(true);
                f29539A = declaredField;
            } catch (Exception e) {
                String str = "failed: ";
                String valueOf = String.valueOf(e.getMessage());
                return valueOf.length() != 0 ? str.concat(valueOf) : new String(str);
            }
        }
        try {
            return String.valueOf(f29539A.get(this));
        } catch (Exception e2) {
            str = "failed: ";
            valueOf = String.valueOf(e2.getMessage());
            return valueOf.length() != 0 ? str.concat(valueOf) : new String(str);
        }
    }
}
