package com.google.android.flexbox;

import android.support.v4.view.C0361r;
import android.support.v4.view.ai;
import android.util.SparseIntArray;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import com.squareup.haha.perflib.io.MemoryMappedFileBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

final class C4873c {
    public final C4871a f25221a;
    public boolean[] f25222b;
    public int[] f25223c;
    public long[] f25224d;
    public long[] f25225e;

    C4873c(C4871a c4871a) {
        this.f25221a = c4871a;
    }

    final int[] m22882a(View view, int i, LayoutParams layoutParams, SparseIntArray sparseIntArray) {
        int flexItemCount = this.f25221a.getFlexItemCount();
        List a = m22858a(flexItemCount);
        C4875e c4875e = new C4875e();
        if (view == null || !(layoutParams instanceof FlexItem)) {
            c4875e.f25229b = 1;
        } else {
            c4875e.f25229b = ((FlexItem) layoutParams).mo4427c();
        }
        if (i == -1 || i == flexItemCount) {
            c4875e.f25228a = flexItemCount;
        } else if (i < this.f25221a.getFlexItemCount()) {
            c4875e.f25228a = i;
            while (i < flexItemCount) {
                C4875e c4875e2 = (C4875e) a.get(i);
                c4875e2.f25228a++;
                i++;
            }
        } else {
            c4875e.f25228a = flexItemCount;
        }
        a.add(c4875e);
        return C4873c.m22866a(flexItemCount + 1, a, sparseIntArray);
    }

    final int[] m22881a(SparseIntArray sparseIntArray) {
        int flexItemCount = this.f25221a.getFlexItemCount();
        return C4873c.m22866a(flexItemCount, m22858a(flexItemCount), sparseIntArray);
    }

    private final List m22858a(int i) {
        List arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            FlexItem flexItem = (FlexItem) this.f25221a.mo4442a(i2).getLayoutParams();
            C4875e c4875e = new C4875e();
            c4875e.f25229b = flexItem.mo4427c();
            c4875e.f25228a = i2;
            arrayList.add(c4875e);
        }
        return arrayList;
    }

    final boolean m22884b(SparseIntArray sparseIntArray) {
        int flexItemCount = this.f25221a.getFlexItemCount();
        if (sparseIntArray.size() != flexItemCount) {
            return true;
        }
        int i = 0;
        while (i < flexItemCount) {
            View a = this.f25221a.mo4442a(i);
            if (a != null && ((FlexItem) a.getLayoutParams()).mo4427c() != sparseIntArray.get(i)) {
                return true;
            }
            i++;
        }
        return false;
    }

    private static int[] m22866a(int i, List list, SparseIntArray sparseIntArray) {
        Collections.sort(list);
        sparseIntArray.clear();
        int[] iArr = new int[i];
        int i2 = 0;
        for (C4875e c4875e : list) {
            iArr[i2] = c4875e.f25228a;
            sparseIntArray.append(c4875e.f25228a, c4875e.f25229b);
            i2++;
        }
        return iArr;
    }

    final void m22880a(C4874d c4874d, int i, int i2) {
        m22883b(c4874d, i2, i);
    }

    final void m22883b(C4874d c4874d, int i, int i2) {
        int paddingStart;
        int paddingEnd;
        int paddingTop;
        int paddingBottom;
        boolean b = this.f25221a.mo4447b();
        int mode = MeasureSpec.getMode(i);
        int size = MeasureSpec.getSize(i);
        int i3 = 0;
        List arrayList = new ArrayList();
        c4874d.f25226a = arrayList;
        if (b) {
            paddingStart = this.f25221a.getPaddingStart();
        } else {
            paddingStart = this.f25221a.getPaddingTop();
        }
        if (b) {
            paddingEnd = this.f25221a.getPaddingEnd();
        } else {
            paddingEnd = this.f25221a.getPaddingBottom();
        }
        if (b) {
            paddingTop = this.f25221a.getPaddingTop();
        } else {
            paddingTop = this.f25221a.getPaddingStart();
        }
        if (b) {
            paddingBottom = this.f25221a.getPaddingBottom();
        } else {
            paddingBottom = this.f25221a.getPaddingEnd();
        }
        int i4 = Integer.MIN_VALUE;
        int i5 = 0;
        int i6 = 0;
        C4872b c4872b = new C4872b();
        c4872b.f25220o = 0;
        c4872b.f25210e = paddingStart + paddingEnd;
        int flexItemCount = this.f25221a.getFlexItemCount();
        int i7 = 0;
        while (i7 < flexItemCount) {
            int i8;
            int i9;
            View q_ = this.f25221a.q_(i7);
            if (q_ == null) {
                if (C4873c.m22865a(i7, flexItemCount, c4872b)) {
                    m22864a(arrayList, c4872b, i5);
                    i8 = i6;
                    i9 = i3;
                }
                i8 = i6;
                i9 = i3;
            } else if (q_.getVisibility() == 8) {
                c4872b.f25214i++;
                c4872b.f25213h++;
                if (C4873c.m22865a(i7, flexItemCount, c4872b)) {
                    m22864a(arrayList, c4872b, i5);
                    i8 = i6;
                    i9 = i3;
                }
                i8 = i6;
                i9 = i3;
            } else {
                int b2;
                Object obj;
                C4872b c4872b2;
                int i10;
                C4872b c4872b3;
                FlexItem flexItem = (FlexItem) q_.getLayoutParams();
                if (flexItem.mo4430f() == 4) {
                    c4872b.f25219n.add(Integer.valueOf(i7));
                }
                if (b) {
                    i9 = flexItem.mo4425a();
                } else {
                    i9 = flexItem.mo4426b();
                }
                if (flexItem.mo4436l() != -1.0f && mode == 1073741824) {
                    i9 = Math.round(((float) size) * flexItem.mo4436l());
                }
                if (b) {
                    i9 = this.f25221a.a_(i, ((paddingStart + paddingEnd) + C4873c.m22868b(flexItem, true)) + C4873c.m22872c(flexItem, true), i9);
                    b2 = this.f25221a.mo4446b(i2, (((paddingTop + paddingBottom) + C4873c.m22873d(flexItem, true)) + C4873c.m22874e(flexItem, true)) + i5, C4873c.m22857a(flexItem, true));
                    q_.measure(i9, b2);
                    m22860a(i7, i9, b2, q_);
                } else {
                    b2 = this.f25221a.a_(i2, (((paddingTop + paddingBottom) + C4873c.m22873d(flexItem, false)) + C4873c.m22874e(flexItem, false)) + i5, C4873c.m22857a(flexItem, false));
                    i9 = this.f25221a.mo4446b(i, ((paddingStart + paddingEnd) + C4873c.m22868b(flexItem, false)) + C4873c.m22872c(flexItem, false), i9);
                    q_.measure(b2, i9);
                    m22860a(i7, b2, i9, q_);
                }
                this.f25221a.mo4449g();
                m22862a(q_, i7);
                i3 = ai.m1819a(i3, ai.m1845e(q_));
                int i11 = c4872b.f25210e;
                b2 = (C4873c.m22856a(q_, b) + C4873c.m22868b(flexItem, b)) + C4873c.m22872c(flexItem, b);
                if (this.f25221a.getFlexWrap() != 0) {
                    if (flexItem.mo4435k()) {
                        obj = 1;
                    } else if (mode != 0) {
                        int a = this.f25221a.mo4441a(i7, i6);
                        if (a > 0) {
                            b2 += a;
                        }
                        if (size < b2 + i11) {
                            obj = 1;
                        }
                    }
                    if (obj == null) {
                        if (c4872b.m22853a() > 0) {
                            m22864a(arrayList, c4872b, i5);
                            i5 += c4872b.f25212g;
                        }
                        if (b) {
                            if (flexItem.mo4425a() == -1) {
                                q_.measure(this.f25221a.a_(i2, (((this.f25221a.getPaddingLeft() + this.f25221a.getPaddingRight()) + flexItem.mo4437m()) + flexItem.mo4439o()) + i5, flexItem.mo4425a()), i9);
                                m22862a(q_, i7);
                            }
                        } else if (flexItem.mo4426b() == -1) {
                            q_.measure(i9, this.f25221a.mo4446b(i2, (((this.f25221a.getPaddingTop() + this.f25221a.getPaddingBottom()) + flexItem.mo4438n()) + flexItem.mo4440p()) + i5, flexItem.mo4426b()));
                            m22862a(q_, i7);
                        }
                        c4872b2 = new C4872b();
                        c4872b2.f25213h = 1;
                        c4872b2.f25210e = paddingStart + paddingEnd;
                        c4872b2.f25220o = i7;
                        i10 = 0;
                        i4 = Integer.MIN_VALUE;
                    } else {
                        c4872b.f25213h++;
                        c4872b3 = c4872b;
                        i10 = i6 + 1;
                        c4872b2 = c4872b3;
                    }
                    if (this.f25223c != null) {
                        this.f25223c[i7] = arrayList.size();
                    }
                    c4872b2.f25210e += (C4873c.m22856a(q_, b) + C4873c.m22868b(flexItem, b)) + C4873c.m22872c(flexItem, b);
                    c4872b2.f25215j += flexItem.mo4428d();
                    c4872b2.f25216k += flexItem.mo4429e();
                    this.f25221a.mo4443a(i7, i10, c4872b2);
                    if (b) {
                        i6 = q_.getMeasuredWidth();
                    } else {
                        i6 = q_.getMeasuredHeight();
                    }
                    i4 = Math.max(i4, ((i6 + C4873c.m22873d(flexItem, b)) + C4873c.m22874e(flexItem, b)) + this.f25221a.mo4448c());
                    c4872b2.f25212g = Math.max(c4872b2.f25212g, i4);
                    if (b) {
                        if (this.f25221a.getFlexWrap() == 2) {
                            c4872b2.f25217l = Math.max(c4872b2.f25217l, flexItem.mo4438n() + q_.getBaseline());
                        } else {
                            c4872b2.f25217l = Math.max(c4872b2.f25217l, flexItem.mo4440p() + (q_.getMeasuredHeight() - q_.getBaseline()));
                        }
                    }
                    if (C4873c.m22865a(i7, flexItemCount, c4872b2)) {
                        m22864a(arrayList, c4872b2, i5);
                        i5 += c4872b2.f25212g;
                    }
                    if (i5 <= Integer.MAX_VALUE) {
                        break;
                    }
                    i8 = i10;
                    c4872b = c4872b2;
                    i9 = i3;
                }
                obj = null;
                if (obj == null) {
                    c4872b.f25213h++;
                    c4872b3 = c4872b;
                    i10 = i6 + 1;
                    c4872b2 = c4872b3;
                } else {
                    if (c4872b.m22853a() > 0) {
                        m22864a(arrayList, c4872b, i5);
                        i5 += c4872b.f25212g;
                    }
                    if (b) {
                        if (flexItem.mo4425a() == -1) {
                            q_.measure(this.f25221a.a_(i2, (((this.f25221a.getPaddingLeft() + this.f25221a.getPaddingRight()) + flexItem.mo4437m()) + flexItem.mo4439o()) + i5, flexItem.mo4425a()), i9);
                            m22862a(q_, i7);
                        }
                    } else if (flexItem.mo4426b() == -1) {
                        q_.measure(i9, this.f25221a.mo4446b(i2, (((this.f25221a.getPaddingTop() + this.f25221a.getPaddingBottom()) + flexItem.mo4438n()) + flexItem.mo4440p()) + i5, flexItem.mo4426b()));
                        m22862a(q_, i7);
                    }
                    c4872b2 = new C4872b();
                    c4872b2.f25213h = 1;
                    c4872b2.f25210e = paddingStart + paddingEnd;
                    c4872b2.f25220o = i7;
                    i10 = 0;
                    i4 = Integer.MIN_VALUE;
                }
                if (this.f25223c != null) {
                    this.f25223c[i7] = arrayList.size();
                }
                c4872b2.f25210e += (C4873c.m22856a(q_, b) + C4873c.m22868b(flexItem, b)) + C4873c.m22872c(flexItem, b);
                c4872b2.f25215j += flexItem.mo4428d();
                c4872b2.f25216k += flexItem.mo4429e();
                this.f25221a.mo4443a(i7, i10, c4872b2);
                if (b) {
                    i6 = q_.getMeasuredWidth();
                } else {
                    i6 = q_.getMeasuredHeight();
                }
                i4 = Math.max(i4, ((i6 + C4873c.m22873d(flexItem, b)) + C4873c.m22874e(flexItem, b)) + this.f25221a.mo4448c());
                c4872b2.f25212g = Math.max(c4872b2.f25212g, i4);
                if (b) {
                    if (this.f25221a.getFlexWrap() == 2) {
                        c4872b2.f25217l = Math.max(c4872b2.f25217l, flexItem.mo4440p() + (q_.getMeasuredHeight() - q_.getBaseline()));
                    } else {
                        c4872b2.f25217l = Math.max(c4872b2.f25217l, flexItem.mo4438n() + q_.getBaseline());
                    }
                }
                if (C4873c.m22865a(i7, flexItemCount, c4872b2)) {
                    m22864a(arrayList, c4872b2, i5);
                    i5 += c4872b2.f25212g;
                }
                if (i5 <= Integer.MAX_VALUE) {
                    break;
                }
                i8 = i10;
                c4872b = c4872b2;
                i9 = i3;
            }
            i7++;
            i3 = i9;
            i6 = i8;
        }
        c4874d.f25227b = i3;
    }

    private static int m22856a(View view, boolean z) {
        if (z) {
            return view.getMeasuredWidth();
        }
        return view.getMeasuredHeight();
    }

    private static int m22857a(FlexItem flexItem, boolean z) {
        if (z) {
            return flexItem.mo4426b();
        }
        return flexItem.mo4425a();
    }

    private static int m22868b(FlexItem flexItem, boolean z) {
        if (z) {
            return flexItem.getMarginStart();
        }
        return flexItem.mo4438n();
    }

    private static int m22872c(FlexItem flexItem, boolean z) {
        if (z) {
            return flexItem.getMarginEnd();
        }
        return flexItem.mo4440p();
    }

    private static int m22873d(FlexItem flexItem, boolean z) {
        if (z) {
            return flexItem.mo4438n();
        }
        return flexItem.getMarginStart();
    }

    private static int m22874e(FlexItem flexItem, boolean z) {
        if (z) {
            return flexItem.mo4440p();
        }
        return flexItem.getMarginEnd();
    }

    private static boolean m22865a(int i, int i2, C4872b c4872b) {
        return i == i2 + -1 && c4872b.m22853a() != 0;
    }

    private final void m22864a(List list, C4872b c4872b, int i) {
        c4872b.f25218m = i;
        this.f25221a.mo4444a(c4872b);
        list.add(c4872b);
    }

    private final void m22862a(View view, int i) {
        int h;
        Object obj = 1;
        Object obj2 = null;
        FlexItem flexItem = (FlexItem) view.getLayoutParams();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        if (measuredWidth < flexItem.mo4431g()) {
            measuredWidth = flexItem.mo4431g();
            obj2 = 1;
        } else if (measuredWidth > flexItem.mo4433i()) {
            measuredWidth = flexItem.mo4433i();
            int i2 = 1;
        }
        if (measuredHeight < flexItem.mo4432h()) {
            h = flexItem.mo4432h();
        } else if (measuredHeight > flexItem.mo4434j()) {
            h = flexItem.mo4434j();
        } else {
            h = measuredHeight;
            obj = obj2;
        }
        if (obj != null) {
            measuredWidth = MeasureSpec.makeMeasureSpec(measuredWidth, MemoryMappedFileBuffer.DEFAULT_SIZE);
            h = MeasureSpec.makeMeasureSpec(h, MemoryMappedFileBuffer.DEFAULT_SIZE);
            view.measure(measuredWidth, h);
            m22860a(i, measuredWidth, h, view);
            this.f25221a.mo4449g();
        }
    }

    final void m22876a(int i, int i2) {
        int i3 = 10;
        int flexItemCount = this.f25221a.getFlexItemCount();
        if (this.f25222b == null) {
            if (flexItemCount >= 10) {
                i3 = flexItemCount;
            }
            this.f25222b = new boolean[i3];
        } else if (this.f25222b.length < flexItemCount) {
            i3 = this.f25222b.length * 2;
            if (i3 >= flexItemCount) {
                flexItemCount = i3;
            }
            this.f25222b = new boolean[flexItemCount];
        } else {
            Arrays.fill(this.f25222b, false);
        }
        if (this.f25221a.getFlexItemCount() > 0) {
            int paddingLeft;
            int i4;
            i3 = this.f25221a.getFlexDirection();
            switch (this.f25221a.getFlexDirection()) {
                case 0:
                case 1:
                    flexItemCount = MeasureSpec.getMode(i);
                    i3 = MeasureSpec.getSize(i);
                    if (flexItemCount != MemoryMappedFileBuffer.DEFAULT_SIZE) {
                        i3 = this.f25221a.getLargestMainSize();
                    }
                    paddingLeft = this.f25221a.getPaddingLeft() + this.f25221a.getPaddingRight();
                    i4 = i3;
                    break;
                case 2:
                case 3:
                    flexItemCount = MeasureSpec.getMode(i2);
                    i3 = MeasureSpec.getSize(i2);
                    if (flexItemCount != MemoryMappedFileBuffer.DEFAULT_SIZE) {
                        i3 = this.f25221a.getLargestMainSize();
                    }
                    paddingLeft = this.f25221a.getPaddingTop() + this.f25221a.getPaddingBottom();
                    i4 = i3;
                    break;
                default:
                    throw new IllegalArgumentException("Invalid flex direction: " + i3);
            }
            if (this.f25223c != null) {
                i3 = this.f25223c[0];
            } else {
                boolean z = false;
            }
            List flexLinesInternal = this.f25221a.getFlexLinesInternal();
            int size = flexLinesInternal.size();
            for (int i5 = i3; i5 < size; i5++) {
                C4872b c4872b = (C4872b) flexLinesInternal.get(i5);
                if (c4872b.f25210e < i4) {
                    m22861a(i, i2, c4872b, i4, paddingLeft, false);
                } else {
                    m22870b(i, i2, c4872b, i4, paddingLeft, false);
                }
            }
        }
    }

    private final void m22861a(int i, int i2, C4872b c4872b, int i3, int i4, boolean z) {
        while (c4872b.f25215j > 0.0f && i3 >= c4872b.f25210e) {
            int i5 = c4872b.f25210e;
            float f = ((float) (i3 - c4872b.f25210e)) / c4872b.f25215j;
            c4872b.f25210e = c4872b.f25211f + i4;
            if (!z) {
                c4872b.f25212g = Integer.MIN_VALUE;
            }
            Object obj = null;
            int i6 = 0;
            float f2 = 0.0f;
            for (int i7 = 0; i7 < c4872b.f25213h; i7++) {
                int i8 = c4872b.f25220o + i7;
                View q_ = this.f25221a.q_(i8);
                if (!(q_ == null || q_.getVisibility() == 8)) {
                    int i9;
                    FlexItem flexItem = (FlexItem) q_.getLayoutParams();
                    int flexDirection = this.f25221a.getFlexDirection();
                    int measuredHeight;
                    float d;
                    float f3;
                    int i10;
                    int b;
                    int makeMeasureSpec;
                    int i11;
                    if (flexDirection == 0 || flexDirection == 1) {
                        flexDirection = q_.getMeasuredWidth();
                        if (this.f25225e != null) {
                            flexDirection = (int) this.f25225e[i8];
                        }
                        measuredHeight = q_.getMeasuredHeight();
                        if (this.f25225e != null) {
                            measuredHeight = (int) (this.f25225e[i8] >> 32);
                        }
                        if (!this.f25222b[i8] && flexItem.mo4428d() > 0.0f) {
                            d = ((float) flexDirection) + (flexItem.mo4428d() * f);
                            if (i7 == c4872b.f25213h - 1) {
                                f2 += d;
                                d = 0.0f;
                            } else {
                                f3 = d;
                                d = f2;
                                f2 = f3;
                            }
                            measuredHeight = Math.round(f2);
                            if (measuredHeight > flexItem.mo4433i()) {
                                obj = 1;
                                i10 = flexItem.mo4433i();
                                this.f25222b[i8] = true;
                                c4872b.f25215j -= flexItem.mo4428d();
                            } else {
                                d += f2 - ((float) measuredHeight);
                                if (((double) d) > 1.0d) {
                                    i10 = measuredHeight + 1;
                                    d = (float) (((double) d) - 1.0d);
                                } else if (((double) d) < -1.0d) {
                                    i10 = measuredHeight - 1;
                                    d = (float) (((double) d) + 1.0d);
                                } else {
                                    i10 = measuredHeight;
                                }
                            }
                            b = m22867b(i2, flexItem, c4872b.f25218m);
                            makeMeasureSpec = MeasureSpec.makeMeasureSpec(i10, MemoryMappedFileBuffer.DEFAULT_SIZE);
                            q_.measure(makeMeasureSpec, b);
                            i10 = q_.getMeasuredWidth();
                            measuredHeight = q_.getMeasuredHeight();
                            m22860a(i8, makeMeasureSpec, b, q_);
                            this.f25221a.mo4449g();
                            i11 = i10;
                            f2 = d;
                            flexDirection = i11;
                        }
                        i6 = Math.max(i6, ((measuredHeight + flexItem.mo4438n()) + flexItem.mo4440p()) + this.f25221a.mo4448c());
                        c4872b.f25210e = (flexItem.mo4439o() + (flexDirection + flexItem.mo4437m())) + c4872b.f25210e;
                        i9 = i6;
                    } else {
                        flexDirection = q_.getMeasuredHeight();
                        if (this.f25225e != null) {
                            flexDirection = (int) (this.f25225e[i8] >> 32);
                        }
                        measuredHeight = q_.getMeasuredWidth();
                        if (this.f25225e != null) {
                            measuredHeight = (int) this.f25225e[i8];
                        }
                        if (!this.f25222b[i8] && flexItem.mo4428d() > 0.0f) {
                            d = ((float) flexDirection) + (flexItem.mo4428d() * f);
                            if (i7 == c4872b.f25213h - 1) {
                                f2 += d;
                                d = 0.0f;
                            } else {
                                f3 = d;
                                d = f2;
                                f2 = f3;
                            }
                            measuredHeight = Math.round(f2);
                            if (measuredHeight > flexItem.mo4434j()) {
                                obj = 1;
                                i10 = flexItem.mo4434j();
                                this.f25222b[i8] = true;
                                c4872b.f25215j -= flexItem.mo4428d();
                            } else {
                                d += f2 - ((float) measuredHeight);
                                if (((double) d) > 1.0d) {
                                    i10 = measuredHeight + 1;
                                    d = (float) (((double) d) - 1.0d);
                                } else if (((double) d) < -1.0d) {
                                    i10 = measuredHeight - 1;
                                    d = (float) (((double) d) + 1.0d);
                                } else {
                                    i10 = measuredHeight;
                                }
                            }
                            b = m22855a(i, flexItem, c4872b.f25218m);
                            makeMeasureSpec = MeasureSpec.makeMeasureSpec(i10, MemoryMappedFileBuffer.DEFAULT_SIZE);
                            q_.measure(b, makeMeasureSpec);
                            measuredHeight = q_.getMeasuredWidth();
                            i10 = q_.getMeasuredHeight();
                            m22860a(i8, b, makeMeasureSpec, q_);
                            this.f25221a.mo4449g();
                            i11 = i10;
                            f2 = d;
                            flexDirection = i11;
                        }
                        i6 = Math.max(i6, ((measuredHeight + flexItem.mo4437m()) + flexItem.mo4439o()) + this.f25221a.mo4448c());
                        c4872b.f25210e = (flexItem.mo4440p() + (flexDirection + flexItem.mo4438n())) + c4872b.f25210e;
                        i9 = i6;
                    }
                    c4872b.f25212g = Math.max(c4872b.f25212g, i9);
                    i6 = i9;
                }
            }
            if (obj != null && i5 != c4872b.f25210e) {
                z = true;
            } else {
                return;
            }
        }
    }

    private final void m22870b(int i, int i2, C4872b c4872b, int i3, int i4, boolean z) {
        while (true) {
            int i5 = c4872b.f25210e;
            if (c4872b.f25216k > 0.0f && i3 <= c4872b.f25210e) {
                float f = ((float) (c4872b.f25210e - i3)) / c4872b.f25216k;
                c4872b.f25210e = c4872b.f25211f + i4;
                if (!z) {
                    c4872b.f25212g = Integer.MIN_VALUE;
                }
                Object obj = null;
                float f2 = 0.0f;
                int i6 = 0;
                for (int i7 = 0; i7 < c4872b.f25213h; i7++) {
                    int i8 = c4872b.f25220o + i7;
                    View q_ = this.f25221a.q_(i8);
                    if (!(q_ == null || q_.getVisibility() == 8)) {
                        int i9;
                        FlexItem flexItem = (FlexItem) q_.getLayoutParams();
                        int flexDirection = this.f25221a.getFlexDirection();
                        int measuredHeight;
                        float e;
                        float f3;
                        int g;
                        int b;
                        int makeMeasureSpec;
                        int i10;
                        if (flexDirection == 0 || flexDirection == 1) {
                            flexDirection = q_.getMeasuredWidth();
                            if (this.f25225e != null) {
                                flexDirection = (int) this.f25225e[i8];
                            }
                            measuredHeight = q_.getMeasuredHeight();
                            if (this.f25225e != null) {
                                measuredHeight = (int) (this.f25225e[i8] >> 32);
                            }
                            if (!this.f25222b[i8] && flexItem.mo4429e() > 0.0f) {
                                e = ((float) flexDirection) - (flexItem.mo4429e() * f);
                                if (i7 == c4872b.f25213h - 1) {
                                    f2 += e;
                                    e = 0.0f;
                                } else {
                                    f3 = e;
                                    e = f2;
                                    f2 = f3;
                                }
                                measuredHeight = Math.round(f2);
                                if (measuredHeight < flexItem.mo4431g()) {
                                    obj = 1;
                                    g = flexItem.mo4431g();
                                    this.f25222b[i8] = true;
                                    c4872b.f25216k -= flexItem.mo4429e();
                                } else {
                                    e += f2 - ((float) measuredHeight);
                                    if (((double) e) > 1.0d) {
                                        g = measuredHeight + 1;
                                        e -= 1.0f;
                                    } else if (((double) e) < -1.0d) {
                                        g = measuredHeight - 1;
                                        e += 1.0f;
                                    } else {
                                        g = measuredHeight;
                                    }
                                }
                                b = m22867b(i2, flexItem, c4872b.f25218m);
                                makeMeasureSpec = MeasureSpec.makeMeasureSpec(g, MemoryMappedFileBuffer.DEFAULT_SIZE);
                                q_.measure(makeMeasureSpec, b);
                                g = q_.getMeasuredWidth();
                                measuredHeight = q_.getMeasuredHeight();
                                m22860a(i8, makeMeasureSpec, b, q_);
                                this.f25221a.mo4449g();
                                i10 = g;
                                f2 = e;
                                flexDirection = i10;
                            }
                            i6 = Math.max(i6, ((measuredHeight + flexItem.mo4438n()) + flexItem.mo4440p()) + this.f25221a.mo4448c());
                            c4872b.f25210e = (flexItem.mo4439o() + (flexDirection + flexItem.mo4437m())) + c4872b.f25210e;
                            i9 = i6;
                        } else {
                            flexDirection = q_.getMeasuredHeight();
                            if (this.f25225e != null) {
                                flexDirection = (int) (this.f25225e[i8] >> 32);
                            }
                            measuredHeight = q_.getMeasuredWidth();
                            if (this.f25225e != null) {
                                measuredHeight = (int) this.f25225e[i8];
                            }
                            if (!this.f25222b[i8] && flexItem.mo4429e() > 0.0f) {
                                e = ((float) flexDirection) - (flexItem.mo4429e() * f);
                                if (i7 == c4872b.f25213h - 1) {
                                    f2 += e;
                                    e = 0.0f;
                                } else {
                                    f3 = e;
                                    e = f2;
                                    f2 = f3;
                                }
                                measuredHeight = Math.round(f2);
                                if (measuredHeight < flexItem.mo4432h()) {
                                    obj = 1;
                                    g = flexItem.mo4432h();
                                    this.f25222b[i8] = true;
                                    c4872b.f25216k -= flexItem.mo4429e();
                                } else {
                                    e += f2 - ((float) measuredHeight);
                                    if (((double) e) > 1.0d) {
                                        g = measuredHeight + 1;
                                        e -= 1.0f;
                                    } else if (((double) e) < -1.0d) {
                                        g = measuredHeight - 1;
                                        e += 1.0f;
                                    } else {
                                        g = measuredHeight;
                                    }
                                }
                                b = m22855a(i, flexItem, c4872b.f25218m);
                                makeMeasureSpec = MeasureSpec.makeMeasureSpec(g, MemoryMappedFileBuffer.DEFAULT_SIZE);
                                q_.measure(b, makeMeasureSpec);
                                measuredHeight = q_.getMeasuredWidth();
                                g = q_.getMeasuredHeight();
                                m22860a(i8, b, makeMeasureSpec, q_);
                                this.f25221a.mo4449g();
                                i10 = g;
                                f2 = e;
                                flexDirection = i10;
                            }
                            i6 = Math.max(i6, ((measuredHeight + flexItem.mo4437m()) + flexItem.mo4439o()) + this.f25221a.mo4448c());
                            c4872b.f25210e = (flexItem.mo4440p() + (flexDirection + flexItem.mo4438n())) + c4872b.f25210e;
                            i9 = i6;
                        }
                        c4872b.f25212g = Math.max(c4872b.f25212g, i9);
                        i6 = i9;
                    }
                }
                if (obj != null && i5 != c4872b.f25210e) {
                    z = true;
                } else {
                    return;
                }
            }
            return;
        }
    }

    private final int m22855a(int i, FlexItem flexItem, int i2) {
        int a_ = this.f25221a.a_(i, (((this.f25221a.getPaddingLeft() + this.f25221a.getPaddingRight()) + flexItem.mo4437m()) + flexItem.mo4439o()) + i2, flexItem.mo4425a());
        int size = MeasureSpec.getSize(a_);
        if (size > flexItem.mo4433i()) {
            return MeasureSpec.makeMeasureSpec(flexItem.mo4433i(), MeasureSpec.getMode(a_));
        }
        if (size < flexItem.mo4431g()) {
            return MeasureSpec.makeMeasureSpec(flexItem.mo4431g(), MeasureSpec.getMode(a_));
        }
        return a_;
    }

    private final int m22867b(int i, FlexItem flexItem, int i2) {
        int b = this.f25221a.mo4446b(i, (((this.f25221a.getPaddingTop() + this.f25221a.getPaddingBottom()) + flexItem.mo4438n()) + flexItem.mo4440p()) + i2, flexItem.mo4426b());
        int size = MeasureSpec.getSize(b);
        if (size > flexItem.mo4434j()) {
            return MeasureSpec.makeMeasureSpec(flexItem.mo4434j(), MeasureSpec.getMode(b));
        }
        if (size < flexItem.mo4432h()) {
            return MeasureSpec.makeMeasureSpec(flexItem.mo4432h(), MeasureSpec.getMode(b));
        }
        return b;
    }

    final void m22877a(int i, int i2, int i3) {
        int mode;
        int flexDirection = this.f25221a.getFlexDirection();
        switch (flexDirection) {
            case 0:
            case 1:
                mode = MeasureSpec.getMode(i2);
                flexDirection = mode;
                mode = MeasureSpec.getSize(i2);
                break;
            case 2:
            case 3:
                mode = MeasureSpec.getMode(i);
                flexDirection = mode;
                mode = MeasureSpec.getSize(i);
                break;
            default:
                throw new IllegalArgumentException("Invalid flex direction: " + flexDirection);
        }
        List<C4872b> flexLinesInternal = this.f25221a.getFlexLinesInternal();
        if (flexDirection == 1073741824) {
            flexDirection = this.f25221a.getSumOfCrossSize() + i3;
            if (flexLinesInternal.size() == 1) {
                ((C4872b) flexLinesInternal.get(0)).f25212g = mode - i3;
            } else if (flexLinesInternal.size() >= 2) {
                float f;
                C4872b c4872b;
                switch (this.f25221a.getAlignContent()) {
                    case 1:
                        flexDirection = mode - flexDirection;
                        C4872b c4872b2 = new C4872b();
                        c4872b2.f25212g = flexDirection;
                        flexLinesInternal.add(0, c4872b2);
                        return;
                    case 2:
                        this.f25221a.setFlexLines(C4873c.m22859a((List) flexLinesInternal, mode, flexDirection));
                        return;
                    case 3:
                        if (flexDirection < mode) {
                            float size = ((float) (mode - flexDirection)) / ((float) (flexLinesInternal.size() - 1));
                            f = 0.0f;
                            List arrayList = new ArrayList();
                            int size2 = flexLinesInternal.size();
                            int i4 = 0;
                            while (i4 < size2) {
                                float f2;
                                arrayList.add((C4872b) flexLinesInternal.get(i4));
                                if (i4 != flexLinesInternal.size() - 1) {
                                    C4872b c4872b3 = new C4872b();
                                    if (i4 == flexLinesInternal.size() - 2) {
                                        c4872b3.f25212g = Math.round(size + f);
                                        f2 = 0.0f;
                                    } else {
                                        c4872b3.f25212g = Math.round(size);
                                        f2 = f;
                                    }
                                    f2 += size - ((float) c4872b3.f25212g);
                                    if (f2 > 1.0f) {
                                        c4872b3.f25212g++;
                                        f2 -= 1.0f;
                                    } else if (f2 < -1.0f) {
                                        c4872b3.f25212g--;
                                        f2 += 1.0f;
                                    }
                                    arrayList.add(c4872b3);
                                } else {
                                    f2 = f;
                                }
                                i4++;
                                f = f2;
                            }
                            this.f25221a.setFlexLines(arrayList);
                            return;
                        }
                        return;
                    case 4:
                        if (flexDirection >= mode) {
                            this.f25221a.setFlexLines(C4873c.m22859a((List) flexLinesInternal, mode, flexDirection));
                            return;
                        }
                        flexDirection = (mode - flexDirection) / (flexLinesInternal.size() * 2);
                        List arrayList2 = new ArrayList();
                        C4872b c4872b4 = new C4872b();
                        c4872b4.f25212g = flexDirection;
                        for (C4872b c4872b5 : flexLinesInternal) {
                            arrayList2.add(c4872b4);
                            arrayList2.add(c4872b5);
                            arrayList2.add(c4872b4);
                        }
                        this.f25221a.setFlexLines(arrayList2);
                        return;
                    case 5:
                        if (flexDirection < mode) {
                            float size3 = ((float) (mode - flexDirection)) / ((float) flexLinesInternal.size());
                            float f3 = 0.0f;
                            int size4 = flexLinesInternal.size();
                            for (int i5 = 0; i5 < size4; i5++) {
                                c4872b5 = (C4872b) flexLinesInternal.get(i5);
                                f = ((float) c4872b5.f25212g) + size3;
                                if (i5 == flexLinesInternal.size() - 1) {
                                    f += f3;
                                    f3 = 0.0f;
                                }
                                int round = Math.round(f);
                                f3 += f - ((float) round);
                                if (f3 > 1.0f) {
                                    mode = round + 1;
                                    f3 -= 1.0f;
                                } else if (f3 < -1.0f) {
                                    mode = round - 1;
                                    f3 += 1.0f;
                                } else {
                                    mode = round;
                                }
                                c4872b5.f25212g = mode;
                            }
                            return;
                        }
                        return;
                    default:
                        return;
                }
            }
        }
    }

    private static List m22859a(List list, int i, int i2) {
        int i3 = (i - i2) / 2;
        List arrayList = new ArrayList();
        C4872b c4872b = new C4872b();
        c4872b.f25212g = i3;
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            if (i4 == 0) {
                arrayList.add(c4872b);
            }
            arrayList.add((C4872b) list.get(i4));
            if (i4 == list.size() - 1) {
                arrayList.add(c4872b);
            }
        }
        return arrayList;
    }

    final void m22875a() {
        if (this.f25221a.getFlexItemCount() > 0) {
            int flexDirection = this.f25221a.getFlexDirection();
            C4872b c4872b;
            if (this.f25221a.getAlignItems() == 4) {
                int i;
                if (this.f25223c != null) {
                    i = this.f25223c[0];
                } else {
                    i = 0;
                }
                List flexLinesInternal = this.f25221a.getFlexLinesInternal();
                int size = flexLinesInternal.size();
                for (int i2 = i; i2 < size; i2++) {
                    c4872b = (C4872b) flexLinesInternal.get(i2);
                    int i3 = c4872b.f25213h;
                    for (int i4 = 0; i4 < i3; i4++) {
                        int i5 = c4872b.f25220o + i4;
                        if (i4 < this.f25221a.getFlexItemCount()) {
                            View q_ = this.f25221a.q_(i5);
                            if (!(q_ == null || q_.getVisibility() == 8)) {
                                FlexItem flexItem = (FlexItem) q_.getLayoutParams();
                                if (flexItem.mo4430f() == -1 || flexItem.mo4430f() == 4) {
                                    switch (flexDirection) {
                                        case 0:
                                        case 1:
                                            m22863a(q_, c4872b.f25212g, i5);
                                            break;
                                        case 2:
                                        case 3:
                                            m22871b(q_, c4872b.f25212g, i5);
                                            break;
                                        default:
                                            throw new IllegalArgumentException("Invalid flex direction: " + flexDirection);
                                    }
                                }
                            }
                        }
                    }
                }
                return;
            }
            for (C4872b c4872b2 : this.f25221a.getFlexLinesInternal()) {
                for (Integer num : c4872b2.f25219n) {
                    View q_2 = this.f25221a.q_(num.intValue());
                    switch (flexDirection) {
                        case 0:
                        case 1:
                            m22863a(q_2, c4872b2.f25212g, num.intValue());
                            break;
                        case 2:
                        case 3:
                            m22871b(q_2, c4872b2.f25212g, num.intValue());
                            break;
                        default:
                            throw new IllegalArgumentException("Invalid flex direction: " + flexDirection);
                    }
                }
            }
        }
    }

    private final void m22863a(View view, int i, int i2) {
        int i3;
        FlexItem flexItem = (FlexItem) view.getLayoutParams();
        int min = Math.min(Math.max(((i - flexItem.mo4438n()) - flexItem.mo4440p()) - this.f25221a.mo4448c(), flexItem.mo4432h()), flexItem.mo4434j());
        if (this.f25225e != null) {
            i3 = (int) this.f25225e[i2];
        } else {
            i3 = view.getMeasuredWidth();
        }
        i3 = MeasureSpec.makeMeasureSpec(i3, MemoryMappedFileBuffer.DEFAULT_SIZE);
        min = MeasureSpec.makeMeasureSpec(min, MemoryMappedFileBuffer.DEFAULT_SIZE);
        view.measure(i3, min);
        m22860a(i2, i3, min, view);
        this.f25221a.mo4449g();
    }

    private final void m22871b(View view, int i, int i2) {
        int i3;
        FlexItem flexItem = (FlexItem) view.getLayoutParams();
        int min = Math.min(Math.max(((i - flexItem.mo4437m()) - flexItem.mo4439o()) - this.f25221a.mo4448c(), flexItem.mo4431g()), flexItem.mo4433i());
        if (this.f25225e != null) {
            i3 = (int) (this.f25225e[i2] >> 32);
        } else {
            i3 = view.getMeasuredHeight();
        }
        i3 = MeasureSpec.makeMeasureSpec(i3, MemoryMappedFileBuffer.DEFAULT_SIZE);
        min = MeasureSpec.makeMeasureSpec(min, MemoryMappedFileBuffer.DEFAULT_SIZE);
        view.measure(min, i3);
        m22860a(i2, min, i3, view);
        this.f25221a.mo4449g();
    }

    final void m22878a(View view, C4872b c4872b, int i, int i2, int i3, int i4) {
        FlexItem flexItem = (FlexItem) view.getLayoutParams();
        int alignItems = this.f25221a.getAlignItems();
        if (flexItem.mo4430f() != -1) {
            alignItems = flexItem.mo4430f();
        }
        int i5 = c4872b.f25212g;
        int measuredHeight;
        switch (alignItems) {
            case 0:
            case 4:
                if (this.f25221a.getFlexWrap() != 2) {
                    view.layout(i, flexItem.mo4438n() + i2, i3, flexItem.mo4438n() + i4);
                    return;
                } else {
                    view.layout(i, i2 - flexItem.mo4440p(), i3, i4 - flexItem.mo4440p());
                    return;
                }
            case 1:
                if (this.f25221a.getFlexWrap() != 2) {
                    view.layout(i, ((i2 + i5) - view.getMeasuredHeight()) - flexItem.mo4440p(), i3, (i5 + i2) - flexItem.mo4440p());
                    return;
                }
                view.layout(i, ((i2 - i5) + view.getMeasuredHeight()) + flexItem.mo4438n(), i3, flexItem.mo4438n() + ((i4 - i5) + view.getMeasuredHeight()));
                return;
            case 2:
                measuredHeight = (((i5 - view.getMeasuredHeight()) + flexItem.mo4438n()) - flexItem.mo4440p()) / 2;
                if (this.f25221a.getFlexWrap() != 2) {
                    view.layout(i, i2 + measuredHeight, i3, (measuredHeight + i2) + view.getMeasuredHeight());
                    return;
                } else {
                    view.layout(i, i2 - measuredHeight, i3, (i2 - measuredHeight) + view.getMeasuredHeight());
                    return;
                }
            case 3:
                if (this.f25221a.getFlexWrap() != 2) {
                    measuredHeight = Math.max(c4872b.f25217l - view.getBaseline(), flexItem.mo4438n());
                    view.layout(i, i2 + measuredHeight, i3, measuredHeight + i4);
                    return;
                }
                measuredHeight = Math.max((c4872b.f25217l - view.getMeasuredHeight()) + view.getBaseline(), flexItem.mo4440p());
                view.layout(i, i2 - measuredHeight, i3, i4 - measuredHeight);
                return;
            default:
                return;
        }
    }

    final void m22879a(View view, C4872b c4872b, boolean z, int i, int i2, int i3, int i4) {
        FlexItem flexItem = (FlexItem) view.getLayoutParams();
        int alignItems = this.f25221a.getAlignItems();
        if (flexItem.mo4430f() != -1) {
            alignItems = flexItem.mo4430f();
        }
        int i5 = c4872b.f25212g;
        switch (alignItems) {
            case 0:
            case 3:
            case 4:
                if (z) {
                    view.layout(i - flexItem.mo4439o(), i2, i3 - flexItem.mo4439o(), i4);
                    return;
                } else {
                    view.layout(flexItem.mo4437m() + i, i2, flexItem.mo4437m() + i3, i4);
                    return;
                }
            case 1:
                if (z) {
                    view.layout(((i - i5) + view.getMeasuredWidth()) + flexItem.mo4437m(), i2, flexItem.mo4437m() + ((i3 - i5) + view.getMeasuredWidth()), i4);
                    return;
                }
                view.layout(((i + i5) - view.getMeasuredWidth()) - flexItem.mo4439o(), i2, ((i5 + i3) - view.getMeasuredWidth()) - flexItem.mo4439o(), i4);
                return;
            case 2:
                MarginLayoutParams marginLayoutParams = (MarginLayoutParams) view.getLayoutParams();
                int measuredWidth = (((i5 - view.getMeasuredWidth()) + C0361r.m2049a(marginLayoutParams)) - C0361r.m2051b(marginLayoutParams)) / 2;
                if (z) {
                    view.layout(i - measuredWidth, i2, i3 - measuredWidth, i4);
                    return;
                } else {
                    view.layout(i + measuredWidth, i2, measuredWidth + i3, i4);
                    return;
                }
            default:
                return;
        }
    }

    private static long m22869b(int i, int i2) {
        return (((long) i2) << 32) | (((long) i) & 4294967295L);
    }

    private final void m22860a(int i, int i2, int i3, View view) {
        if (this.f25224d != null) {
            this.f25224d[i] = C4873c.m22869b(i2, i3);
        }
        if (this.f25225e != null) {
            this.f25225e[i] = C4873c.m22869b(view.getMeasuredWidth(), view.getMeasuredHeight());
        }
    }
}
