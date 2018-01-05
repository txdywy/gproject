package android.support.v7.widget;

import android.os.Build.VERSION;
import android.support.v4.os.C0330d;
import android.support.v4.view.ai;
import android.util.Log;
import android.view.View;
import android.view.animation.Interpolator;
import android.widget.OverScroller;

final class fq implements Runnable {
    public int f3478a;
    public int f3479b;
    public OverScroller f3480c;
    public Interpolator f3481d = RecyclerView.aE;
    public boolean f3482e = false;
    public boolean f3483f = false;
    public final /* synthetic */ RecyclerView f3484g;

    fq(RecyclerView recyclerView) {
        this.f3484g = recyclerView;
        this.f3480c = new OverScroller(recyclerView.getContext(), RecyclerView.aE);
    }

    public final void run() {
        if (this.f3484g.f528v == null) {
            m3714b();
            return;
        }
        this.f3483f = false;
        this.f3482e = true;
        this.f3484g.m295d();
        OverScroller overScroller = this.f3480c;
        fl flVar = this.f3484g.f528v.f2948D;
        if (overScroller.computeScrollOffset()) {
            int i;
            int i2;
            int a;
            int i3;
            int i4;
            int i5;
            Object obj;
            int[] iArr = this.f3484g.aA;
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int i6 = currX - this.f3478a;
            int i7 = currY - this.f3479b;
            this.f3478a = currX;
            this.f3479b = currY;
            if (this.f3484g.m285a(i6, i7, iArr, null, 1)) {
                i = i7 - iArr[1];
                i2 = i6 - iArr[0];
            } else {
                i = i7;
                i2 = i6;
            }
            if (this.f3484g.f527u != null) {
                this.f3484g.m298e();
                this.f3484g.m311k();
                C0330d.m1728a("RV Scroll");
                RecyclerView recyclerView = this.f3484g;
                fo foVar = this.f3484g.ao;
                recyclerView.m314n();
                if (i2 != 0) {
                    a = this.f3484g.f528v.mo723a(i2, this.f3484g.f517k, this.f3484g.ao);
                    i3 = i2 - a;
                } else {
                    i3 = 0;
                    a = 0;
                }
                if (i != 0) {
                    i6 = this.f3484g.f528v.mo734b(i, this.f3484g.f517k, this.f3484g.ao);
                    i4 = i - i6;
                } else {
                    i4 = 0;
                    i6 = 0;
                }
                C0330d.m1727a();
                this.f3484g.m318r();
                this.f3484g.m289b(true);
                this.f3484g.m283a(false);
                if (!(flVar == null || flVar.f3399j || !flVar.f3400k)) {
                    i7 = this.f3484g.ao.m3705a();
                    if (i7 == 0) {
                        flVar.m3517d();
                        i7 = i6;
                        i6 = a;
                        a = i4;
                    } else if (flVar.f3396g >= i7) {
                        flVar.f3396g = i7 - 1;
                        i7 = i2 - i3;
                        i5 = i - i4;
                        r8 = flVar.f3397h;
                        if (!flVar.f3400k || flVar.f3396g == -1 || r8 == null) {
                            flVar.m3517d();
                        }
                        flVar.f3399j = false;
                        if (flVar.f3401l != null) {
                            if (RecyclerView.m264e(flVar.f3401l) == flVar.f3396g) {
                                flVar.mo817a(flVar.f3401l, r8.ao, flVar.f3402m);
                                flVar.f3402m.m3704a(r8);
                                flVar.m3517d();
                            } else {
                                Log.e("RecyclerView", "Passed over target position while smooth scrolling.");
                                flVar.f3401l = null;
                            }
                        }
                        if (flVar.f3400k) {
                            r11 = r8.ao;
                            flVar.mo816a(i7, i5, flVar.f3402m);
                            obj = flVar.f3402m.f3460d >= 0 ? 1 : null;
                            flVar.f3402m.m3704a(r8);
                            if (obj != null) {
                                if (flVar.f3400k) {
                                    flVar.f3399j = true;
                                    r8.al.m3711a();
                                    i7 = i6;
                                    i6 = a;
                                    a = i4;
                                } else {
                                    flVar.m3517d();
                                }
                            }
                        }
                        i7 = i6;
                        i6 = a;
                        a = i4;
                    } else {
                        i7 = i2 - i3;
                        i5 = i - i4;
                        r8 = flVar.f3397h;
                        if (!flVar.f3400k || flVar.f3396g == -1 || r8 == null) {
                            flVar.m3517d();
                        }
                        flVar.f3399j = false;
                        if (flVar.f3401l != null) {
                            if (RecyclerView.m264e(flVar.f3401l) == flVar.f3396g) {
                                flVar.mo817a(flVar.f3401l, r8.ao, flVar.f3402m);
                                flVar.f3402m.m3704a(r8);
                                flVar.m3517d();
                            } else {
                                Log.e("RecyclerView", "Passed over target position while smooth scrolling.");
                                flVar.f3401l = null;
                            }
                        }
                        if (flVar.f3400k) {
                            r11 = r8.ao;
                            flVar.mo816a(i7, i5, flVar.f3402m);
                            obj = flVar.f3402m.f3460d >= 0 ? 1 : null;
                            flVar.f3402m.m3704a(r8);
                            if (obj != null) {
                                if (flVar.f3400k) {
                                    flVar.f3399j = true;
                                    r8.al.m3711a();
                                    i7 = i6;
                                    i6 = a;
                                    a = i4;
                                } else {
                                    flVar.m3517d();
                                }
                            }
                        }
                    }
                }
                i7 = i6;
                i6 = a;
                a = i4;
            } else {
                a = 0;
                i3 = 0;
                i7 = 0;
                i6 = 0;
            }
            if (!this.f3484g.f530x.isEmpty()) {
                this.f3484g.invalidate();
            }
            if (this.f3484g.getOverScrollMode() != 2) {
                this.f3484g.m294c(i2, i);
            }
            if (!(this.f3484g.m284a(i6, i7, i3, a, null, 1) || (i3 == 0 && a == 0))) {
                int i8;
                i5 = (int) overScroller.getCurrVelocity();
                if (i3 != currX) {
                    i4 = i3 < 0 ? -i5 : i3 > 0 ? i5 : 0;
                    i8 = i4;
                } else {
                    i8 = 0;
                }
                if (a == currY) {
                    i5 = 0;
                } else if (a < 0) {
                    i5 = -i5;
                } else if (a <= 0) {
                    i5 = 0;
                }
                if (this.f3484g.getOverScrollMode() != 2) {
                    View view = this.f3484g;
                    if (i8 < 0) {
                        view.m305g();
                        view.f508P.onAbsorb(-i8);
                    } else if (i8 > 0) {
                        view.m307h();
                        view.f510R.onAbsorb(i8);
                    }
                    if (i5 < 0) {
                        view.m309i();
                        view.f509Q.onAbsorb(-i5);
                    } else if (i5 > 0) {
                        view.m310j();
                        view.f511S.onAbsorb(i5);
                    }
                    if (!(i8 == 0 && i5 == 0)) {
                        ai.f1848a.mo391c(view);
                    }
                }
                if ((i8 != 0 || i3 == currX || overScroller.getFinalX() == 0) && (i5 != 0 || a == currY || overScroller.getFinalY() == 0)) {
                    overScroller.abortAnimation();
                }
            }
            if (!(i6 == 0 && i7 == 0)) {
                this.f3484g.m304f(i6, i7);
            }
            if (!this.f3484g.awakenScrollBars()) {
                this.f3484g.invalidate();
            }
            obj = (i != 0 && this.f3484g.f528v.mo747f() && i7 == i) ? 1 : null;
            Object obj2 = (i2 != 0 && this.f3484g.f528v.mo745e() && i6 == i2) ? 1 : null;
            obj2 = (!(i2 == 0 && i == 0) && obj2 == null && obj == null) ? null : 1;
            if (overScroller.isFinished() || (obj2 == null && !this.f3484g.m319t().m1797a(1))) {
                this.f3484g.m_(0);
                if (RecyclerView.f489f) {
                    this.f3484g.an.m3428a();
                }
                this.f3484g.n_(1);
            } else {
                m3711a();
                if (this.f3484g.am != null) {
                    this.f3484g.am.m3426a(this.f3484g, i2, i);
                }
            }
        }
        if (flVar != null) {
            if (flVar.f3399j) {
                RecyclerView recyclerView2 = flVar.f3397h;
                if (!flVar.f3400k || flVar.f3396g == -1 || recyclerView2 == null) {
                    flVar.m3517d();
                }
                flVar.f3399j = false;
                if (flVar.f3401l != null) {
                    if (RecyclerView.m264e(flVar.f3401l) == flVar.f3396g) {
                        flVar.mo817a(flVar.f3401l, recyclerView2.ao, flVar.f3402m);
                        flVar.f3402m.m3704a(recyclerView2);
                        flVar.m3517d();
                    } else {
                        Log.e("RecyclerView", "Passed over target position while smooth scrolling.");
                        flVar.f3401l = null;
                    }
                }
                if (flVar.f3400k) {
                    fo foVar2 = recyclerView2.ao;
                    flVar.mo816a(0, 0, flVar.f3402m);
                    obj2 = flVar.f3402m.f3460d >= 0 ? 1 : null;
                    flVar.f3402m.m3704a(recyclerView2);
                    if (obj2 != null) {
                        if (flVar.f3400k) {
                            flVar.f3399j = true;
                            recyclerView2.al.m3711a();
                        } else {
                            flVar.m3517d();
                        }
                    }
                }
            }
            if (!this.f3483f) {
                flVar.m3517d();
            }
        }
        this.f3482e = false;
        if (this.f3483f) {
            m3711a();
        }
    }

    final void m3711a() {
        if (this.f3482e) {
            this.f3483f = true;
            return;
        }
        this.f3484g.removeCallbacks(this);
        ai.m1830a(this.f3484g, (Runnable) this);
    }

    final int m3710a(int i, int i2) {
        int round;
        int abs = Math.abs(i);
        int abs2 = Math.abs(i2);
        Object obj = abs > abs2 ? 1 : null;
        int sqrt = (int) Math.sqrt(0.0d);
        int sqrt2 = (int) Math.sqrt((double) ((i * i) + (i2 * i2)));
        int width = obj != null ? this.f3484g.getWidth() : this.f3484g.getHeight();
        int i3 = width / 2;
        float sin = (((float) Math.sin((double) ((Math.min(1.0f, (((float) sqrt2) * 1.0f) / ((float) width)) - 0.5f) * 0.47123894f))) * ((float) i3)) + ((float) i3);
        if (sqrt > 0) {
            round = Math.round(1000.0f * Math.abs(sin / ((float) sqrt))) * 4;
        } else {
            if (obj != null) {
                round = abs;
            } else {
                round = abs2;
            }
            round = (int) (((((float) round) / ((float) width)) + 1.0f) * 300.0f);
        }
        return Math.min(round, 2000);
    }

    public final void m3712a(int i, int i2, int i3) {
        m3713a(i, i2, i3, RecyclerView.aE);
    }

    public final void m3713a(int i, int i2, int i3, Interpolator interpolator) {
        if (this.f3481d != interpolator) {
            this.f3481d = interpolator;
            this.f3480c = new OverScroller(this.f3484g.getContext(), interpolator);
        }
        this.f3484g.m_(2);
        this.f3479b = 0;
        this.f3478a = 0;
        this.f3480c.startScroll(0, 0, i, i2, i3);
        if (VERSION.SDK_INT < 23) {
            this.f3480c.computeScrollOffset();
        }
        m3711a();
    }

    public final void m3714b() {
        this.f3484g.removeCallbacks(this);
        this.f3480c.abortAnimation();
    }
}
