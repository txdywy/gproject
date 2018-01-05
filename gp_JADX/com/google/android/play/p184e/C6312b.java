package com.google.android.play.p184e;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import com.google.android.play.utils.k;

public final class C6312b {
    public final C3163d f31530a;
    public final int f31531b;
    public final int f31532c;
    public boolean f31533d;
    public boolean f31534e;
    public float f31535f;
    public float f31536g;
    public float f31537h;
    public float f31538i;
    public View f31539j;
    public MotionEvent f31540k;
    public boolean f31541l;
    public boolean f31542m;

    public C6312b(C3163d c3163d, Context context, boolean z) {
        this.f31530a = c3163d;
        this.f31531b = ViewConfiguration.get(context).getScaledTouchSlop();
        this.f31532c = z ? k.e(context) : 0;
    }

    public final boolean m28933a(MotionEvent motionEvent) {
        this.f31533d = false;
        this.f31534e = false;
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        switch (motionEvent.getAction()) {
            case 0:
                this.f31537h = 0.0f;
                this.f31538i = 0.0f;
                if (this.f31540k != null) {
                    this.f31540k.recycle();
                }
                this.f31540k = MotionEvent.obtain(motionEvent);
                break;
            case 2:
                this.f31538i += Math.abs(y - this.f31536g);
                break;
        }
        ViewGroup c = this.f31530a.mo3340c();
        if (c == null || !c.isShown()) {
            return false;
        }
        this.f31535f = x;
        this.f31536g = y;
        boolean z = c instanceof RecyclerView;
        if (z && this.f31538i >= ((float) this.f31531b)) {
            m28932d(motionEvent);
            return true;
        } else if (motionEvent.getAction() != 0) {
            return false;
        } else {
            View d = this.f31530a.mo3341d();
            if (!z) {
                return m28930a(x, y, d);
            }
            View view = (RecyclerView) c;
            if (view.getScrollState() == 2) {
                view.m303f();
            }
            if (view.getScrollState() == 1) {
                return false;
            }
            View view2;
            View b;
            if (this.f31540k != null) {
                motionEvent = this.f31540k;
            }
            float x2 = motionEvent.getX();
            float y2 = motionEvent.getY();
            for (view2 = view; view2 != this.f31530a.mo3336a(); view2 = (View) view2.getParent()) {
                x2 -= (float) view2.getLeft();
                y2 -= (float) view2.getTop();
            }
            int a = view.f520n.m3326a() - 1;
            while (a >= 0) {
                view2 = view.f520n.m3332b(a);
                float translationX = view2.getTranslationX();
                float translationY = view2.getTranslationY();
                if (x2 < ((float) view2.getLeft()) + translationX || x2 > translationX + ((float) view2.getRight()) || y2 < ((float) view2.getTop()) + translationY || y2 > ((float) view2.getBottom()) + translationY) {
                    a--;
                } else if (view2 == null && this.f31530a.mo3338a(view2) && y2 < ((float) (view2.getBottom() - this.f31530a.mo3344g()))) {
                    this.f31539j = d;
                    return true;
                } else {
                    view = this.f31530a.mo3337a(motionEvent.getX(), motionEvent.getY());
                    b = this.f31530a.mo3339b();
                    if (view != b) {
                        return false;
                    }
                    if (!(view2 instanceof C2629a) && ((C2629a) view2).mo2996a(x2 - ((float) view2.getLeft()), y2 - ((float) view2.getTop()))) {
                        this.f31539j = view2;
                        return true;
                    } else if (m28930a(x, y, d)) {
                        return true;
                    } else {
                        this.f31539j = b;
                        return true;
                    }
                }
            }
            view2 = null;
            if (view2 == null) {
            }
            view = this.f31530a.mo3337a(motionEvent.getX(), motionEvent.getY());
            b = this.f31530a.mo3339b();
            if (view != b) {
                return false;
            }
            if (!(view2 instanceof C2629a)) {
            }
            if (m28930a(x, y, d)) {
                return true;
            }
            this.f31539j = b;
            return true;
        }
    }

    public final boolean m28934b(MotionEvent motionEvent) {
        if (this.f31539j == null) {
            return false;
        }
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        m28931c(motionEvent);
        switch (motionEvent.getAction()) {
            case 1:
                if (!(this.f31533d || this.f31534e || this.f31537h < ((float) this.f31531b))) {
                    m28929a();
                    break;
                }
            case 2:
                if (!(this.f31533d || this.f31534e)) {
                    this.f31537h += Math.abs(x - this.f31535f);
                    this.f31538i += Math.abs(y - this.f31536g);
                    if (this.f31537h < this.f31538i) {
                        if (this.f31538i >= ((float) this.f31531b)) {
                            m28932d(motionEvent);
                            m28931c(motionEvent);
                            break;
                        }
                    } else if (this.f31537h >= ((float) this.f31531b) * 10.0f) {
                        this.f31533d = true;
                        m28929a();
                        if (this.f31540k != null) {
                            this.f31540k.recycle();
                            this.f31540k = null;
                            break;
                        }
                    }
                }
                break;
            case 3:
                break;
        }
        this.f31539j = null;
        if (this.f31541l) {
            this.f31541l = false;
            if (!this.f31542m) {
                this.f31530a.mo3345h();
            }
        }
        this.f31535f = x;
        this.f31536g = y;
        return true;
    }

    private final void m28931c(MotionEvent motionEvent) {
        float f = 0.0f;
        if (this.f31539j != null) {
            MotionEvent obtain = MotionEvent.obtain(motionEvent);
            View view = this.f31539j;
            float f2 = 0.0f;
            while (true) {
                f2 -= (float) view.getLeft();
                float top = f - ((float) view.getTop());
                View view2 = (View) view.getParent();
                if (view2 != null) {
                    float scrollX = ((float) view2.getScrollX()) + f2;
                    f2 = ((float) view2.getScrollY()) + top;
                    if (view2 == this.f31530a.mo3336a()) {
                        obtain.offsetLocation(scrollX, f2);
                        this.f31539j.dispatchTouchEvent(obtain);
                        obtain.recycle();
                        return;
                    }
                    float f3 = f2;
                    f2 = scrollX;
                    view = view2;
                    f = f3;
                } else {
                    return;
                }
            }
        }
    }

    private final void m28932d(MotionEvent motionEvent) {
        if (this.f31539j != this.f31530a.mo3339b()) {
            MotionEvent obtain;
            if (!(this.f31539j == null || this.f31540k == null)) {
                obtain = MotionEvent.obtain(this.f31540k);
                obtain.setAction(3);
                m28931c(obtain);
                obtain.recycle();
                if (this.f31539j instanceof C2629a) {
                    ((C2629a) this.f31539j).as_();
                }
            }
            this.f31539j = this.f31530a.mo3340c();
            this.f31534e = true;
            if (this.f31540k != null) {
                obtain = MotionEvent.obtainNoHistory(motionEvent);
                obtain.setLocation(this.f31540k.getX(), motionEvent.getY());
                m28931c(this.f31540k);
                this.f31540k.recycle();
                this.f31540k = null;
                m28931c(obtain);
                obtain.recycle();
            }
        }
    }

    private final void m28929a() {
        ViewGroup c = this.f31530a.mo3340c();
        if ((c instanceof RecyclerView) && this.f31539j != this.f31530a.mo3339b() && (this.f31539j instanceof C2629a)) {
            C2629a c2629a = (C2629a) this.f31539j;
            RecyclerView recyclerView = (RecyclerView) c;
            View b;
            int top;
            if (this.f31539j == this.f31530a.mo3341d()) {
                b = recyclerView.getLayoutManager().mo736b(0);
                if (b != null && this.f31530a.mo3338a(b)) {
                    top = b.getTop();
                    if (top < 0) {
                        recyclerView.b_(0, top);
                        return;
                    }
                    return;
                }
                return;
            }
            boolean z;
            int l = this.f31532c + this.f31530a.mo3349l();
            int horizontalScrollerTop = c2629a.getHorizontalScrollerTop();
            int horizontalScrollerBottom = c2629a.getHorizontalScrollerBottom();
            b = this.f31539j;
            while (b != this.f31530a.mo3336a()) {
                if (b != null) {
                    horizontalScrollerTop += b.getTop();
                    horizontalScrollerBottom += b.getTop();
                    b = (View) b.getParent();
                } else {
                    return;
                }
            }
            top = l - horizontalScrollerTop;
            horizontalScrollerBottom -= this.f31530a.mo3336a().getHeight();
            if (horizontalScrollerBottom >= 0) {
                z = horizontalScrollerBottom > (-top);
            } else if (top <= 0) {
                z = false;
                horizontalScrollerBottom = 0;
            } else if (horizontalScrollerTop < this.f31532c) {
                horizontalScrollerBottom = Math.max(horizontalScrollerTop - this.f31532c, horizontalScrollerBottom);
                z = true;
            } else {
                z = true;
                horizontalScrollerBottom = 0;
            }
            if (z) {
                this.f31541l = true;
                this.f31530a.mo3347j();
            }
            if (horizontalScrollerBottom != 0) {
                if (!z) {
                    top = this.f31530a.mo3350m();
                    if (top > l) {
                        if (top - l < horizontalScrollerBottom) {
                            this.f31530a.mo3346i();
                        }
                    } else if (top > this.f31532c) {
                        this.f31530a.mo3348k();
                    }
                }
                this.f31542m = true;
                recyclerView.mo2951a(new C6313c(this));
                recyclerView.b_(0, horizontalScrollerBottom);
            }
        }
    }

    private final boolean m28930a(float f, float f2, View view) {
        int f3 = this.f31530a.mo3343f();
        if (f < ((float) f3) || f >= ((float) (this.f31530a.mo3336a().getWidth() - f3))) {
            View e = this.f31530a.mo3342e();
            if (!(view == null || !view.isShown() || e == null)) {
                if (f2 < e.getTranslationY() + ((float) e.getBottom())) {
                    this.f31539j = view;
                    return true;
                }
            }
        }
        return false;
    }
}
