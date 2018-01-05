package android.support.v7.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v4.view.C0357n;
import android.support.v4.view.ai;
import android.util.AttributeSet;
import android.view.View;

public class AlertDialogLayout extends dh {
    public AlertDialogLayout(Context context) {
        super(context);
    }

    public AlertDialogLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected void onMeasure(int r14, int r15) {
        /*
        r13 = this;
        r3 = 0;
        r2 = 0;
        r1 = 0;
        r8 = r13.getChildCount();
        r0 = 0;
        r4 = r0;
    L_0x0009:
        if (r4 >= r8) goto L_0x0049;
    L_0x000b:
        r0 = r13.getChildAt(r4);
        r5 = r0.getVisibility();
        r6 = 8;
        if (r5 == r6) goto L_0x0194;
    L_0x0017:
        r5 = r0.getId();
        r6 = android.support.v7.p040a.C0399f.topPanel;
        if (r5 != r6) goto L_0x002a;
    L_0x001f:
        r12 = r1;
        r1 = r2;
        r2 = r0;
        r0 = r12;
    L_0x0023:
        r3 = r4 + 1;
        r4 = r3;
        r3 = r2;
        r2 = r1;
        r1 = r0;
        goto L_0x0009;
    L_0x002a:
        r6 = android.support.v7.p040a.C0399f.buttonPanel;
        if (r5 != r6) goto L_0x0033;
    L_0x002e:
        r2 = r3;
        r12 = r0;
        r0 = r1;
        r1 = r12;
        goto L_0x0023;
    L_0x0033:
        r6 = android.support.v7.p040a.C0399f.contentPanel;
        if (r5 == r6) goto L_0x003b;
    L_0x0037:
        r6 = android.support.v7.p040a.C0399f.customPanel;
        if (r5 != r6) goto L_0x0047;
    L_0x003b:
        if (r1 == 0) goto L_0x0044;
    L_0x003d:
        r0 = 0;
    L_0x003e:
        if (r0 != 0) goto L_0x0043;
    L_0x0040:
        super.onMeasure(r14, r15);
    L_0x0043:
        return;
    L_0x0044:
        r1 = r2;
        r2 = r3;
        goto L_0x0023;
    L_0x0047:
        r0 = 0;
        goto L_0x003e;
    L_0x0049:
        r9 = android.view.View.MeasureSpec.getMode(r15);
        r10 = android.view.View.MeasureSpec.getSize(r15);
        r11 = android.view.View.MeasureSpec.getMode(r14);
        r5 = 0;
        r0 = r13.getPaddingTop();
        r4 = r13.getPaddingBottom();
        r4 = r4 + r0;
        if (r3 == 0) goto L_0x0073;
    L_0x0061:
        r0 = 0;
        r3.measure(r14, r0);
        r0 = r3.getMeasuredHeight();
        r4 = r4 + r0;
        r0 = 0;
        r3 = r3.getMeasuredState();
        r5 = android.view.View.combineMeasuredStates(r0, r3);
    L_0x0073:
        r3 = 0;
        r0 = 0;
        if (r2 == 0) goto L_0x0191;
    L_0x0077:
        r0 = 0;
        r2.measure(r14, r0);
        r0 = r2;
    L_0x007c:
        r3 = android.support.v4.view.ai.f1848a;
        r3 = r3.mo395g(r0);
        if (r3 <= 0) goto L_0x010a;
    L_0x0084:
        r0 = r3;
    L_0x0085:
        r3 = r2.getMeasuredHeight();
        r3 = r3 - r0;
        r4 = r4 + r0;
        r6 = r2.getMeasuredState();
        r5 = android.view.View.combineMeasuredStates(r5, r6);
        r7 = r3;
        r3 = r0;
    L_0x0095:
        r0 = 0;
        if (r1 == 0) goto L_0x018e;
    L_0x0098:
        if (r9 != 0) goto L_0x0121;
    L_0x009a:
        r0 = 0;
    L_0x009b:
        r1.measure(r14, r0);
        r0 = r1.getMeasuredHeight();
        r4 = r4 + r0;
        r6 = r1.getMeasuredState();
        r5 = android.view.View.combineMeasuredStates(r5, r6);
        r6 = r0;
    L_0x00ac:
        r0 = r10 - r4;
        if (r2 == 0) goto L_0x0189;
    L_0x00b0:
        r4 = r4 - r3;
        r7 = java.lang.Math.min(r0, r7);
        if (r7 <= 0) goto L_0x00b9;
    L_0x00b7:
        r0 = r0 - r7;
        r3 = r3 + r7;
    L_0x00b9:
        r7 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r3 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r7);
        r2.measure(r14, r3);
        r3 = r2.getMeasuredHeight();
        r3 = r3 + r4;
        r2 = r2.getMeasuredState();
        r2 = android.view.View.combineMeasuredStates(r5, r2);
        r12 = r0;
        r0 = r3;
        r3 = r12;
    L_0x00d2:
        if (r1 == 0) goto L_0x0186;
    L_0x00d4:
        if (r3 <= 0) goto L_0x0186;
    L_0x00d6:
        r0 = r0 - r6;
        r3 = r3 + r6;
        r3 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r9);
        r1.measure(r14, r3);
        r3 = r1.getMeasuredHeight();
        r0 = r0 + r3;
        r1 = r1.getMeasuredState();
        r1 = android.view.View.combineMeasuredStates(r2, r1);
    L_0x00ec:
        r3 = 0;
        r2 = 0;
        r12 = r2;
        r2 = r3;
        r3 = r12;
    L_0x00f1:
        if (r3 >= r8) goto L_0x012e;
    L_0x00f3:
        r4 = r13.getChildAt(r3);
        r5 = r4.getVisibility();
        r6 = 8;
        if (r5 == r6) goto L_0x0107;
    L_0x00ff:
        r4 = r4.getMeasuredWidth();
        r2 = java.lang.Math.max(r2, r4);
    L_0x0107:
        r3 = r3 + 1;
        goto L_0x00f1;
    L_0x010a:
        r3 = r0 instanceof android.view.ViewGroup;
        if (r3 == 0) goto L_0x011e;
    L_0x010e:
        r0 = (android.view.ViewGroup) r0;
        r3 = r0.getChildCount();
        r6 = 1;
        if (r3 != r6) goto L_0x011e;
    L_0x0117:
        r3 = 0;
        r0 = r0.getChildAt(r3);
        goto L_0x007c;
    L_0x011e:
        r0 = 0;
        goto L_0x0085;
    L_0x0121:
        r0 = 0;
        r6 = r10 - r4;
        r0 = java.lang.Math.max(r0, r6);
        r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r9);
        goto L_0x009b;
    L_0x012e:
        r3 = r13.getPaddingLeft();
        r4 = r13.getPaddingRight();
        r3 = r3 + r4;
        r2 = r2 + r3;
        r1 = android.view.View.resolveSizeAndState(r2, r14, r1);
        r2 = 0;
        r0 = android.view.View.resolveSizeAndState(r0, r15, r2);
        r13.setMeasuredDimension(r1, r0);
        r0 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        if (r11 == r0) goto L_0x0183;
    L_0x0148:
        r0 = r13.getMeasuredWidth();
        r1 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r2 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r1);
        r0 = 0;
        r7 = r0;
    L_0x0154:
        if (r7 >= r8) goto L_0x0183;
    L_0x0156:
        r1 = r13.getChildAt(r7);
        r0 = r1.getVisibility();
        r3 = 8;
        if (r0 == r3) goto L_0x017f;
    L_0x0162:
        r0 = r1.getLayoutParams();
        r6 = r0;
        r6 = (android.support.v7.widget.di) r6;
        r0 = r6.width;
        r3 = -1;
        if (r0 != r3) goto L_0x017f;
    L_0x016e:
        r9 = r6.height;
        r0 = r1.getMeasuredHeight();
        r6.height = r0;
        r3 = 0;
        r5 = 0;
        r0 = r13;
        r4 = r15;
        r0.measureChildWithMargins(r1, r2, r3, r4, r5);
        r6.height = r9;
    L_0x017f:
        r0 = r7 + 1;
        r7 = r0;
        goto L_0x0154;
    L_0x0183:
        r0 = 1;
        goto L_0x003e;
    L_0x0186:
        r1 = r2;
        goto L_0x00ec;
    L_0x0189:
        r3 = r0;
        r2 = r5;
        r0 = r4;
        goto L_0x00d2;
    L_0x018e:
        r6 = r0;
        goto L_0x00ac;
    L_0x0191:
        r7 = r0;
        goto L_0x0095;
    L_0x0194:
        r0 = r1;
        r1 = r2;
        r2 = r3;
        goto L_0x0023;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.AlertDialogLayout.onMeasure(int, int):void");
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int paddingLeft = getPaddingLeft();
        int i5 = i3 - i;
        int paddingRight = i5 - getPaddingRight();
        int paddingRight2 = (i5 - paddingLeft) - getPaddingRight();
        i5 = getMeasuredHeight();
        int childCount = getChildCount();
        int gravity = getGravity();
        int i6 = 8388615 & gravity;
        switch (gravity & 112) {
            case 16:
                i5 = (((i4 - i2) - i5) / 2) + getPaddingTop();
                break;
            case 80:
                i5 = ((getPaddingTop() + i4) - i2) - i5;
                break;
            default:
                i5 = getPaddingTop();
                break;
        }
        Drawable dividerDrawable = getDividerDrawable();
        if (dividerDrawable == null) {
            gravity = 0;
        } else {
            gravity = dividerDrawable.getIntrinsicHeight();
        }
        int i7 = i5;
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            if (!(childAt == null || childAt.getVisibility() == 8)) {
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                di diVar = (di) childAt.getLayoutParams();
                int i9 = diVar.f3375h;
                if (i9 < 0) {
                    i9 = i6;
                }
                switch (C0357n.m2043a(i9, ai.f1848a.mo400k(this)) & 7) {
                    case 1:
                        i9 = ((((paddingRight2 - measuredWidth) / 2) + paddingLeft) + diVar.leftMargin) - diVar.rightMargin;
                        break;
                    case 5:
                        i9 = (paddingRight - measuredWidth) - diVar.rightMargin;
                        break;
                    default:
                        i9 = diVar.leftMargin + paddingLeft;
                        break;
                }
                if (hasDividerBeforeChildAt(i8)) {
                    i7 += gravity;
                }
                i7 += diVar.topMargin;
                childAt.layout(i9, i7, measuredWidth + i9, i7 + measuredHeight);
                i7 += diVar.bottomMargin + measuredHeight;
            }
        }
    }
}
