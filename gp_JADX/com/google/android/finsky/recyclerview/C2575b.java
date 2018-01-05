package com.google.android.finsky.recyclerview;

import android.content.Context;
import android.support.v4.view.ai;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.ew;
import android.support.v7.widget.fa;
import android.support.v7.widget.fe;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.google.android.finsky.frameworkviews.ae;

public class C2575b extends PlayRecyclerView implements ae {
    public final int aK;
    public int aL;
    public boolean aM;
    public int aN;
    public int aO;
    public boolean aP;
    public int aQ;
    public int aR;
    public int aS;
    public boolean aT;
    public boolean aU;
    public final fe aV;

    public C2575b(Context context) {
        this(context, null);
    }

    public C2575b(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.aM = false;
        this.aU = false;
        this.aV = new C3985c(this);
        this.aK = ViewConfiguration.get(getContext()).getScaledMinimumFlingVelocity();
        mo2951a(this.aV);
    }

    public void setLayoutManager(ew ewVar) {
        if (!(ewVar instanceof LinearLayoutManager)) {
            throw new IllegalArgumentException("Only LinearLayoutManager is supported");
        } else if (((LinearLayoutManager) ewVar).f2962i != 0) {
            throw new IllegalArgumentException("Only horizontal LinearLayoutManager is supported");
        } else {
            super.setLayoutManager(ewVar);
        }
    }

    public boolean mo2964u() {
        return true;
    }

    public int getScrolledToItemPosition() {
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) getLayoutManager();
        int j = linearLayoutManager.m3124j();
        if (j != -1) {
            int k = linearLayoutManager.m3125k();
            int a = getAdapter().mo1039a() - getTrailingSpacerCount();
            int i = j;
            int i2 = -1;
            int i3 = 0;
            while (i <= k) {
                int i4;
                int i5;
                if (i >= getLeadingSpacerCount()) {
                    View b = linearLayoutManager.mo736b(i);
                    if (i == getLeadingSpacerCount() && (getLeadingSpacerCount() == 0 || i != j)) {
                        i4 = 0;
                        for (i5 = j; i5 < getLeadingSpacerCount(); i5++) {
                            i4 += C2575b.m13610i(getChildAt(i5 - j));
                        }
                        i5 = (b.getWidth() / 2) + i4;
                    } else if (i != a - 1 || (getTrailingSpacerCount() != 0 && i == k)) {
                        i5 = getLeadingGapForSnapping() + (b.getWidth() / 2);
                    } else {
                        i4 = 0;
                        for (i5 = 0; i5 <= k - a; i5++) {
                            i4 += C2575b.m13610i(getChildAt((getChildCount() - i5) - 1));
                        }
                        i5 = (getWidth() - i4) - (b.getWidth() / 2);
                    }
                    i5 = Math.abs(((b.getLeft() + b.getRight()) / 2) - i5);
                    if (i2 < 0 || i5 < i3) {
                        i4 = i5;
                        i5 = i;
                        i++;
                        i2 = i5;
                        i3 = i4;
                    }
                }
                i5 = i2;
                i4 = i3;
                i++;
                i2 = i5;
                i3 = i4;
            }
            if (i2 >= getLeadingSpacerCount()) {
                return i2 - getLeadingSpacerCount();
            }
        }
        return this.aL >= getLeadingSpacerCount() ? this.aL - getLeadingSpacerCount() : -1;
    }

    public int getScrollPositionInternal() {
        int scrolledToItemPosition = getScrolledToItemPosition();
        return scrolledToItemPosition >= 0 ? scrolledToItemPosition + getLeadingSpacerCount() : -1;
    }

    public void mo2965v() {
        this.aL = getScrollPositionInternal();
    }

    public void mo2963c(int i) {
        if (i >= 0) {
            this.aL = i;
            ((LinearLayoutManager) getLayoutManager()).m3094a(i, getLeadingGapForSnapping());
        }
    }

    public void mo2966w() {
    }

    public void setLeadingGapForSnapping(int i) {
        if (this.aQ != i) {
            this.aQ = i;
            mo2966w();
        }
    }

    public int getLeadingGapForSnapping() {
        return this.aQ;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!this.aT) {
            m13608a(motionEvent);
            return super.onInterceptTouchEvent(motionEvent);
        } else if (motionEvent.getAction() != 3 && motionEvent.getAction() != 1) {
            return false;
        } else {
            this.aT = false;
            return false;
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        m13608a(motionEvent);
        return super.onTouchEvent(motionEvent);
    }

    public final boolean mo2962b(int i, int i2) {
        if (!mo2964u() || Math.abs(i) < this.aK || getChildCount() <= 0) {
            return super.mo2962b(i, i2);
        }
        int i3;
        int i4 = ai.f1848a.mo400k(this) == 0 ? 1 : -1;
        int i5 = i * i4;
        m13611a(i5 < 0, i5 > 0);
        if (this.aN == -1) {
            i3 = 0;
        } else {
            int i6 = this.aO * i4;
            int i7 = i5 < 0 ? -1 : 1;
            int width = getWidth();
            int i8 = C2575b.m13610i(getChildAt(this.aN));
            int i9 = mo3606i(i8);
            i3 = ((Math.min((i5 / 5) * i7, ((i9 > 1 ? 2 : 1) * width) - this.aS) * i7) - i6) / i8;
            if (i3 == 0 && i7 * i6 < 0) {
                i3 = i7;
            }
            ew layoutManager = getLayoutManager();
            i5 = i3;
            i3 = ew.m2979a(getChildAt(this.aN)) + i3;
            while (!mo3609h(i3)) {
                i3 += i7;
                i5 += i7;
            }
            i7 = 0;
            if (i3 < getLeadingSpacerCount()) {
                i5 += getLeadingSpacerCount() - i3;
            } else if (getTrailingSpacerCount() < 2) {
                int r = (layoutManager.m3062r() - getTrailingSpacerCount()) - i9;
                if (i3 > r) {
                    i5 -= i3 - r;
                    if (!this.aP) {
                        i7 = getLeadingGapForSnapping() - ((width - getLeadingGapForSnapping()) - (i9 * i8));
                    }
                }
            }
            i3 = (i7 + ((i5 * i8) + i6)) * i4;
        }
        ((LinearLayoutManager) getLayoutManager()).m3014a(new C3986d(this, i3));
        return true;
    }

    private final void m13608a(MotionEvent motionEvent) {
        switch (motionEvent.getAction()) {
            case 0:
                this.aR = (int) motionEvent.getX();
                return;
            case 1:
                this.aS = Math.abs(((int) motionEvent.getX()) - this.aR);
                return;
            default:
                return;
        }
    }

    public void Z_() {
        this.aU = true;
    }

    public int getTrailingSpacerCount() {
        return 0;
    }

    public int getLeadingSpacerCount() {
        return 1;
    }

    public boolean mo3609h(int i) {
        return true;
    }

    final void m13611a(boolean z, boolean z2) {
        int j;
        int j2;
        int i;
        View childAt;
        int i2 = 0;
        boolean z3 = ai.f1848a.mo400k(this) == 0;
        int width = getWidth();
        int childCount = getChildCount();
        int i3 = this.aQ;
        this.aN = -1;
        this.aO = Integer.MAX_VALUE;
        this.aP = false;
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) getLayoutManager();
        if (z) {
            j = linearLayoutManager.m3124j();
            if (j != -1) {
                int leadingSpacerCount = getLeadingSpacerCount() - j;
                if (leadingSpacerCount > 0) {
                    j = 0;
                    i3 = 0;
                    while (j < leadingSpacerCount) {
                        int i4 = C2575b.m13610i(getChildAt(j)) + i3;
                        j++;
                        i3 = i4;
                    }
                }
            }
        }
        if (z2) {
            j = getAdapter().mo1039a();
            i4 = linearLayoutManager.m3125k();
            if (i4 != -1) {
                j = (i4 + 1) - (j - getTrailingSpacerCount());
                if (j > 0) {
                    i4 = (childCount - j) - 1;
                    j2 = linearLayoutManager.m3124j() + i4;
                    if (i4 >= 0 && j2 >= getLeadingSpacerCount()) {
                        j2 = C2575b.m13610i(getChildAt(i4));
                        i4 = mo3606i(j2) * j2;
                        i3 = 0;
                        for (j2 = 0; j2 < j; j2++) {
                            i3 += C2575b.m13610i(getChildAt((childCount - 1) - j2));
                        }
                        j2 = (width - i3) - i4;
                        this.aP = true;
                        i = j2;
                        while (i2 < childCount) {
                            childAt = getChildAt(i2);
                            if (childAt.getWidth() != 0 && mo3609h(RecyclerView.m262d(childAt))) {
                                if (z3) {
                                    j2 = ((((fa) childAt.getLayoutParams()).rightMargin + childAt.getRight()) + i) - width;
                                } else {
                                    j2 = (childAt.getLeft() - ((fa) childAt.getLayoutParams()).leftMargin) - i;
                                }
                                if (Math.abs(j2) < Math.abs(this.aO)) {
                                    this.aO = j2;
                                    this.aN = i2;
                                }
                            }
                            i2++;
                        }
                    }
                }
            }
        }
        i = i3;
        while (i2 < childCount) {
            childAt = getChildAt(i2);
            if (z3) {
                j2 = ((((fa) childAt.getLayoutParams()).rightMargin + childAt.getRight()) + i) - width;
            } else {
                j2 = (childAt.getLeft() - ((fa) childAt.getLayoutParams()).leftMargin) - i;
            }
            if (Math.abs(j2) < Math.abs(this.aO)) {
                this.aO = j2;
                this.aN = i2;
            }
            i2++;
        }
    }

    private static int m13610i(View view) {
        fa faVar = (fa) view.getLayoutParams();
        return faVar.rightMargin + (view.getWidth() + faVar.leftMargin);
    }

    private final int mo3606i(int i) {
        if (i == 0) {
            return 1;
        }
        return Math.max(1, (getWidth() - getLeadingGapForSnapping()) / i);
    }
}
