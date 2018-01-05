package android.support.v4.view;

import android.content.Context;
import android.os.Handler;
import android.view.GestureDetector.OnDoubleTapListener;
import android.view.GestureDetector.OnGestureListener;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import com.squareup.haha.perflib.HprofParser;

final class C0354k implements C0353j {
    public static final int f1897e = ViewConfiguration.getLongPressTimeout();
    public static final int f1898f = ViewConfiguration.getTapTimeout();
    public static final int f1899g = ViewConfiguration.getDoubleTapTimeout();
    public int f1900a;
    public int f1901b;
    public int f1902c;
    public int f1903d;
    public final Handler f1904h = new C0355l(this);
    public final OnGestureListener f1905i;
    public OnDoubleTapListener f1906j;
    public boolean f1907k;
    public boolean f1908l;
    public boolean f1909m;
    public boolean f1910n;
    public boolean f1911o;
    public MotionEvent f1912p;
    public MotionEvent f1913q;
    public boolean f1914r;
    public float f1915s;
    public float f1916t;
    public float f1917u;
    public float f1918v;
    public boolean f1919w;
    public VelocityTracker f1920x;

    public C0354k(Context context, OnGestureListener onGestureListener) {
        this.f1905i = onGestureListener;
        if (onGestureListener instanceof OnDoubleTapListener) {
            this.f1906j = (OnDoubleTapListener) onGestureListener;
        }
        if (context == null) {
            throw new IllegalArgumentException("Context must not be null");
        } else if (this.f1905i == null) {
            throw new IllegalArgumentException("OnGestureListener must not be null");
        } else {
            this.f1919w = true;
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            int scaledTouchSlop = viewConfiguration.getScaledTouchSlop();
            int scaledDoubleTapSlop = viewConfiguration.getScaledDoubleTapSlop();
            this.f1902c = viewConfiguration.getScaledMinimumFlingVelocity();
            this.f1903d = viewConfiguration.getScaledMaximumFlingVelocity();
            this.f1900a = scaledTouchSlop * scaledTouchSlop;
            this.f1901b = scaledDoubleTapSlop * scaledDoubleTapSlop;
        }
    }

    public final void mo446a() {
        this.f1919w = true;
    }

    public final boolean mo447a(MotionEvent motionEvent) {
        int i;
        int action = motionEvent.getAction();
        if (this.f1920x == null) {
            this.f1920x = VelocityTracker.obtain();
        }
        this.f1920x.addMovement(motionEvent);
        boolean z = (action & HprofParser.ROOT_UNKNOWN) == 6;
        int actionIndex = z ? motionEvent.getActionIndex() : -1;
        int pointerCount = motionEvent.getPointerCount();
        float f = 0.0f;
        float f2 = 0.0f;
        for (i = 0; i < pointerCount; i++) {
            if (actionIndex != i) {
                f2 += motionEvent.getX(i);
                f += motionEvent.getY(i);
            }
        }
        actionIndex = z ? pointerCount - 1 : pointerCount;
        f2 /= (float) actionIndex;
        f /= (float) actionIndex;
        boolean hasMessages;
        float yVelocity;
        float xVelocity;
        switch (action & HprofParser.ROOT_UNKNOWN) {
            case 0:
                if (this.f1906j != null) {
                    hasMessages = this.f1904h.hasMessages(3);
                    if (hasMessages) {
                        this.f1904h.removeMessages(3);
                    }
                    if (!(this.f1912p == null || this.f1913q == null || !hasMessages)) {
                        MotionEvent motionEvent2 = this.f1912p;
                        MotionEvent motionEvent3 = this.f1913q;
                        if (this.f1911o && motionEvent.getEventTime() - motionEvent3.getEventTime() <= ((long) f1899g)) {
                            pointerCount = ((int) motionEvent2.getX()) - ((int) motionEvent.getX());
                            actionIndex = ((int) motionEvent2.getY()) - ((int) motionEvent.getY());
                            if ((actionIndex * actionIndex) + (pointerCount * pointerCount) < this.f1901b) {
                                hasMessages = true;
                                if (hasMessages) {
                                    this.f1914r = true;
                                    actionIndex = (this.f1906j.onDoubleTap(this.f1912p) | 0) | this.f1906j.onDoubleTapEvent(motionEvent);
                                    this.f1915s = f2;
                                    this.f1917u = f2;
                                    this.f1916t = f;
                                    this.f1918v = f;
                                    if (this.f1912p != null) {
                                        this.f1912p.recycle();
                                    }
                                    this.f1912p = MotionEvent.obtain(motionEvent);
                                    this.f1910n = true;
                                    this.f1911o = true;
                                    this.f1907k = true;
                                    this.f1909m = false;
                                    this.f1908l = false;
                                    if (this.f1919w) {
                                        this.f1904h.removeMessages(2);
                                        this.f1904h.sendEmptyMessageAtTime(2, (this.f1912p.getDownTime() + ((long) f1898f)) + ((long) f1897e));
                                    }
                                    this.f1904h.sendEmptyMessageAtTime(1, this.f1912p.getDownTime() + ((long) f1898f));
                                    return actionIndex | this.f1905i.onDown(motionEvent);
                                }
                            }
                        }
                        hasMessages = false;
                        if (hasMessages) {
                            this.f1914r = true;
                            actionIndex = (this.f1906j.onDoubleTap(this.f1912p) | 0) | this.f1906j.onDoubleTapEvent(motionEvent);
                            this.f1915s = f2;
                            this.f1917u = f2;
                            this.f1916t = f;
                            this.f1918v = f;
                            if (this.f1912p != null) {
                                this.f1912p.recycle();
                            }
                            this.f1912p = MotionEvent.obtain(motionEvent);
                            this.f1910n = true;
                            this.f1911o = true;
                            this.f1907k = true;
                            this.f1909m = false;
                            this.f1908l = false;
                            if (this.f1919w) {
                                this.f1904h.removeMessages(2);
                                this.f1904h.sendEmptyMessageAtTime(2, (this.f1912p.getDownTime() + ((long) f1898f)) + ((long) f1897e));
                            }
                            this.f1904h.sendEmptyMessageAtTime(1, this.f1912p.getDownTime() + ((long) f1898f));
                            return actionIndex | this.f1905i.onDown(motionEvent);
                        }
                    }
                    this.f1904h.sendEmptyMessageDelayed(3, (long) f1899g);
                }
                actionIndex = 0;
                this.f1915s = f2;
                this.f1917u = f2;
                this.f1916t = f;
                this.f1918v = f;
                if (this.f1912p != null) {
                    this.f1912p.recycle();
                }
                this.f1912p = MotionEvent.obtain(motionEvent);
                this.f1910n = true;
                this.f1911o = true;
                this.f1907k = true;
                this.f1909m = false;
                this.f1908l = false;
                if (this.f1919w) {
                    this.f1904h.removeMessages(2);
                    this.f1904h.sendEmptyMessageAtTime(2, (this.f1912p.getDownTime() + ((long) f1898f)) + ((long) f1897e));
                }
                this.f1904h.sendEmptyMessageAtTime(1, this.f1912p.getDownTime() + ((long) f1898f));
                return actionIndex | this.f1905i.onDown(motionEvent);
            case 1:
                this.f1907k = false;
                MotionEvent obtain = MotionEvent.obtain(motionEvent);
                if (this.f1914r) {
                    hasMessages = this.f1906j.onDoubleTapEvent(motionEvent) | 0;
                } else if (this.f1909m) {
                    this.f1904h.removeMessages(3);
                    this.f1909m = false;
                    hasMessages = false;
                } else if (this.f1910n) {
                    hasMessages = this.f1905i.onSingleTapUp(motionEvent);
                    if (this.f1908l && this.f1906j != null) {
                        this.f1906j.onSingleTapConfirmed(motionEvent);
                    }
                } else {
                    VelocityTracker velocityTracker = this.f1920x;
                    int pointerId = motionEvent.getPointerId(0);
                    velocityTracker.computeCurrentVelocity(1000, (float) this.f1903d);
                    yVelocity = velocityTracker.getYVelocity(pointerId);
                    xVelocity = velocityTracker.getXVelocity(pointerId);
                    hasMessages = (Math.abs(yVelocity) > ((float) this.f1902c) || Math.abs(xVelocity) > ((float) this.f1902c)) ? this.f1905i.onFling(this.f1912p, motionEvent, xVelocity, yVelocity) : false;
                }
                if (this.f1913q != null) {
                    this.f1913q.recycle();
                }
                this.f1913q = obtain;
                if (this.f1920x != null) {
                    this.f1920x.recycle();
                    this.f1920x = null;
                }
                this.f1914r = false;
                this.f1908l = false;
                this.f1904h.removeMessages(1);
                this.f1904h.removeMessages(2);
                return hasMessages;
            case 2:
                if (this.f1909m) {
                    return false;
                }
                xVelocity = this.f1915s - f2;
                yVelocity = this.f1916t - f;
                if (this.f1914r) {
                    return this.f1906j.onDoubleTapEvent(motionEvent) | 0;
                }
                if (this.f1910n) {
                    i = (int) (f2 - this.f1917u);
                    int i2 = (int) (f - this.f1918v);
                    i = (i * i) + (i2 * i2);
                    if (i > this.f1900a) {
                        hasMessages = this.f1905i.onScroll(this.f1912p, motionEvent, xVelocity, yVelocity);
                        this.f1915s = f2;
                        this.f1916t = f;
                        this.f1910n = false;
                        this.f1904h.removeMessages(3);
                        this.f1904h.removeMessages(1);
                        this.f1904h.removeMessages(2);
                    } else {
                        hasMessages = false;
                    }
                    if (i > this.f1900a) {
                        this.f1911o = false;
                    }
                    return hasMessages;
                } else if (Math.abs(xVelocity) < 1.0f && Math.abs(yVelocity) < 1.0f) {
                    return false;
                } else {
                    boolean onScroll = this.f1905i.onScroll(this.f1912p, motionEvent, xVelocity, yVelocity);
                    this.f1915s = f2;
                    this.f1916t = f;
                    return onScroll;
                }
            case 3:
                this.f1904h.removeMessages(1);
                this.f1904h.removeMessages(2);
                this.f1904h.removeMessages(3);
                this.f1920x.recycle();
                this.f1920x = null;
                this.f1914r = false;
                this.f1907k = false;
                this.f1910n = false;
                this.f1911o = false;
                this.f1908l = false;
                if (!this.f1909m) {
                    return false;
                }
                this.f1909m = false;
                return false;
            case 5:
                this.f1915s = f2;
                this.f1917u = f2;
                this.f1916t = f;
                this.f1918v = f;
                this.f1904h.removeMessages(1);
                this.f1904h.removeMessages(2);
                this.f1904h.removeMessages(3);
                this.f1914r = false;
                this.f1910n = false;
                this.f1911o = false;
                this.f1908l = false;
                if (!this.f1909m) {
                    return false;
                }
                this.f1909m = false;
                return false;
            case 6:
                this.f1915s = f2;
                this.f1917u = f2;
                this.f1916t = f;
                this.f1918v = f;
                this.f1920x.computeCurrentVelocity(1000, (float) this.f1903d);
                int actionIndex2 = motionEvent.getActionIndex();
                actionIndex = motionEvent.getPointerId(actionIndex2);
                f2 = this.f1920x.getXVelocity(actionIndex);
                float yVelocity2 = this.f1920x.getYVelocity(actionIndex);
                for (actionIndex = 0; actionIndex < pointerCount; actionIndex++) {
                    if (actionIndex != actionIndex2) {
                        i = motionEvent.getPointerId(actionIndex);
                        if ((this.f1920x.getYVelocity(i) * yVelocity2) + (this.f1920x.getXVelocity(i) * f2) < 0.0f) {
                            this.f1920x.clear();
                            return false;
                        }
                    }
                }
                return false;
            default:
                return false;
        }
    }
}
