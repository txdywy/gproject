package com.google.android.finsky.recyclerview;

import android.content.Context;
import android.os.Parcelable;
import android.support.v4.view.ab;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.em;
import android.support.v7.widget.eo;
import android.support.v7.widget.fe;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.finsky.recyclerview.p182a.C2574b;
import com.google.android.finsky.recyclerview.p182a.C3774a;
import com.google.android.finsky.utils.FinskyLog;

public class PlayRecyclerView extends RecyclerView implements ab, C2574b {
    public View aW;
    public View aX;
    public eo aY;
    public C3774a aZ;

    public PlayRecyclerView(Context context) {
        super(context);
    }

    public PlayRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final Parcelable mo2959x() {
        return super.onSaveInstanceState();
    }

    public final void m13601a(Parcelable parcelable) {
        super.onRestoreInstanceState(parcelable);
    }

    public void setEmptyView(View view) {
        this.aW = view;
        mo2960y();
        m13600a(getAdapter());
    }

    public void setLoadingView(View view) {
        this.aX = view;
        mo2960y();
        m13600a(getAdapter());
    }

    private final void m13600a(em emVar) {
        if (emVar != null) {
            if (this.aY != null) {
                emVar.mo5197b(this.aY);
                this.aY = null;
            }
            this.aY = new C3987f(this);
            emVar.mo5196a(this.aY);
        }
    }

    public final void mo2960y() {
        int i = 8;
        if (!(this.aW == null && this.aX == null)) {
            int i2;
            int i3;
            View view;
            int i4;
            View view2;
            em adapter = getAdapter();
            if (adapter == null) {
                i2 = 1;
                i3 = 1;
            } else if (adapter instanceof C1137h) {
                C1137h c1137h = (C1137h) adapter;
                boolean m = c1137h.mo4090m();
                boolean n = c1137h.mo4091n();
                boolean z = m;
            } else {
                FinskyLog.m21669e("PlayRecyclerView's adapter is not an instance of PlayRecyclerViewAdapter.", new Object[0]);
                i2 = 0;
                i3 = 0;
            }
            if (i3 == 0 || i2 == 0) {
                if (this.aW != null) {
                    view = this.aW;
                    if (i3 != 0) {
                        i4 = 0;
                    } else {
                        i4 = 8;
                    }
                    view.setVisibility(i4);
                }
                if (this.aX != null) {
                    view2 = this.aX;
                    if (i2 != 0) {
                        view = view2;
                        i4 = 0;
                        view.setVisibility(i4);
                    }
                }
                if ((i3 != 0 || this.aW == null) && (i2 == 0 || this.aX == null)) {
                    i4 = 0;
                } else {
                    i4 = 1;
                }
                if (i4 != 0) {
                    setVisibility(i);
                }
            } else if (this.aX == null || this.aW == null) {
                if (this.aX != null) {
                    view = this.aX;
                    i4 = 0;
                } else {
                    if (this.aW != null) {
                        view = this.aW;
                        i4 = 0;
                    }
                    if (i3 != 0) {
                    }
                    i4 = 0;
                    if (i4 != 0) {
                        setVisibility(i);
                    }
                }
                view.setVisibility(i4);
                if (i3 != 0) {
                }
                i4 = 0;
                if (i4 != 0) {
                    setVisibility(i);
                }
            } else {
                this.aX.setVisibility(0);
                view2 = this.aW;
            }
            view = view2;
            i4 = 8;
            view.setVisibility(i4);
            if (i3 != 0) {
            }
            i4 = 0;
            if (i4 != 0) {
                setVisibility(i);
            }
        }
        i = 0;
        setVisibility(i);
    }

    public void setAdapter(em emVar) {
        if (!(getAdapter() == null || this.aY == null)) {
            getAdapter().mo5197b(this.aY);
            this.aY = null;
        }
        super.setAdapter(emVar);
        m13600a(emVar);
        mo2960y();
    }

    public void setRecyclerViewDelegate(C3774a c3774a) {
        this.aZ = c3774a;
    }

    public void setOnScrollListener(fe feVar) {
        if (this.aZ == null || !this.aZ.mo3748a(feVar)) {
            super.setOnScrollListener(feVar);
        }
    }

    public final void mo2951a(fe feVar) {
        if (this.aZ == null || !this.aZ.mo3752b(feVar)) {
            super.mo2951a(feVar);
        }
    }

    public final void mo2952b(fe feVar) {
        if (this.aZ == null || !this.aZ.mo3755c(feVar)) {
            super.mo2952b(feVar);
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.aZ != null) {
            switch (this.aZ.mo3742a((RecyclerView) this, motionEvent)) {
                case 0:
                    return false;
                case 1:
                    return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.aZ != null) {
            switch (this.aZ.mo3749b(this, motionEvent)) {
                case 0:
                    return false;
                case 1:
                    return true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void mo2954g(int i) {
        if (this.aZ != null) {
            this.aZ.mo3747a(i);
        } else {
            super.mo2954g(i);
        }
    }

    public final void mo2953e(int i, int i2) {
        if (this.aZ != null) {
            this.aZ.mo3751b(i2);
        } else {
            super.mo2953e(i, i2);
        }
    }

    public boolean onStartNestedScroll(View view, View view2, int i) {
        if (this.aZ != null) {
            switch (this.aZ.mo3743a(view, view2)) {
                case 1:
                    return true;
            }
        }
        return false;
    }

    public void onNestedScrollAccepted(View view, View view2, int i) {
        if (this.aZ != null) {
            this.aZ.mo3754c(i);
        }
    }

    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        if (this.aZ != null) {
            this.aZ.mo3745a(i2, iArr);
        }
    }

    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        if (this.aZ != null) {
            this.aZ.mo3744a();
        }
    }

    public boolean onNestedPreFling(View view, float f, float f2) {
        return this.aZ != null && this.aZ.mo3746a(f2);
    }

    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (this.aZ != null) {
            this.aZ.mo3750b();
        }
        return false;
    }

    public void onStopNestedScroll(View view) {
        if (this.aZ != null) {
            this.aZ.mo3753c();
        }
    }
}
