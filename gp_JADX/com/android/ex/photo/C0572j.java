package com.android.ex.photo;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.Fragment;
import android.support.v4.app.bx;
import android.support.v4.p028a.C0211f;
import android.support.v4.view.bi;
import android.support.v4.view.p038a.C0332a;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.View.OnSystemUiVisibilityChangeListener;
import android.view.ViewPropertyAnimator;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import com.android.ex.photo.p048a.C0544d;
import com.android.ex.photo.p049b.C0548a;
import com.android.ex.photo.p050c.C0552a;
import com.android.ex.photo.p050c.C0554d;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class C0572j implements bx, bi, C0550b, C0570g, C0571v {
    public static int f3795a;
    public static int f3796b;
    public boolean f3797A;
    public boolean f3798B;
    public int f3799C;
    public int f3800D;
    public int f3801E;
    public int f3802F;
    public boolean f3803G;
    public boolean f3804H;
    public boolean f3805I;
    public final AccessibilityManager f3806J;
    public C0580s f3807K;
    public final Handler f3808L = new Handler();
    public long f3809M;
    public int f3810N = -1;
    public final Runnable f3811O = new C0574l(this);
    public final C0568r f3812c;
    public int f3813d;
    public final OnSystemUiVisibilityChangeListener f3814e;
    public String f3815f;
    public String f3816g;
    public int f3817h;
    public String f3818i;
    public String[] f3819j;
    public int f3820k = -1;
    public boolean f3821l;
    public View f3822m;
    public View f3823n;
    public PhotoViewPager f3824o;
    public ImageView f3825p;
    public C0544d f3826q;
    public boolean f3827r;
    public final Map f3828s = new HashMap();
    public final Set f3829t = new HashSet();
    public boolean f3830u;
    public boolean f3831v;
    public boolean f3832w = true;
    public float f3833x;
    public String f3834y;
    public String f3835z;

    public C0572j(C0568r c0568r) {
        this.f3812c = c0568r;
        if (VERSION.SDK_INT < 11) {
            this.f3814e = null;
        } else {
            this.f3814e = new C0573k(this);
        }
        this.f3806J = (AccessibilityManager) c0568r.mo995m().getSystemService("accessibility");
    }

    protected final View m4155d(int i) {
        return this.f3812c.mo993c(i);
    }

    protected final boolean m4159g() {
        return this.f3823n != null;
    }

    protected final boolean m4160h() {
        return this.f3825p != null;
    }

    public final void mo1002a(int i, C0547i c0547i) {
        this.f3828s.put(Integer.valueOf(i), c0547i);
    }

    public final void mo1010c(int i) {
        this.f3828s.remove(Integer.valueOf(i));
    }

    public final synchronized void mo1004a(C0546h c0546h) {
        this.f3829t.add(c0546h);
    }

    public final synchronized void mo1007b(C0546h c0546h) {
        this.f3829t.remove(c0546h);
    }

    public final boolean mo1008b(Fragment fragment) {
        if (this.f3824o == null || this.f3826q == null || this.f3826q.mo961a() == 0) {
            return this.f3827r;
        }
        return this.f3827r || this.f3824o.getCurrentItem() != this.f3826q.mo963b((Object) fragment);
    }

    public final void mo1009c() {
        m4147a(!this.f3827r, true);
    }

    public C0211f mo969a(int i, Bundle bundle) {
        if (i == 100) {
            return new C0554d(this.f3812c.mo995m(), Uri.parse(this.f3815f), this.f3819j);
        }
        return null;
    }

    public C0211f mo1000a(int i, String str) {
        switch (i) {
            case 1:
            case 2:
            case 3:
                return new C0552a(this.f3812c.mo995m(), str);
            default:
                return null;
        }
    }

    public final void mo973b() {
        if (!this.f3831v) {
            this.f3826q.mo966a(null);
        }
    }

    private final synchronized void m4132a(Cursor cursor) {
        for (C0546h a : this.f3829t) {
            a.mo971a(cursor);
        }
    }

    public final void mo179a(int i, float f, int i2) {
        if (((double) f) < 1.0E-4d) {
            C0547i c0547i = (C0547i) this.f3828s.get(Integer.valueOf(i - 1));
            if (c0547i != null) {
                c0547i.c_();
            }
            c0547i = (C0547i) this.f3828s.get(Integer.valueOf(i + 1));
            if (c0547i != null) {
                c0547i.c_();
            }
        }
    }

    public final void mo180b(int i) {
        this.f3817h = i;
        m4133e(i);
    }

    public final void d_(int i) {
    }

    public final boolean mo1006a(Fragment fragment) {
        if (this.f3824o == null || this.f3826q == null || this.f3824o.getCurrentItem() != this.f3826q.mo963b((Object) fragment)) {
            return false;
        }
        return true;
    }

    public final void mo1011d() {
    }

    public final C0582u mo1014i() {
        boolean z = false;
        boolean z2 = false;
        for (C0547i c0547i : this.f3828s.values()) {
            boolean z3;
            if (!z2) {
                z2 = c0547i.e_();
            }
            if (z) {
                z3 = z;
            } else {
                z3 = c0547i.f_();
            }
            z = z3;
        }
        if (z2) {
            if (z) {
                return C0582u.BOTH;
            }
            return C0582u.LEFT;
        } else if (z) {
            return C0582u.RIGHT;
        } else {
            return C0582u.NONE;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected final void m4147a(boolean r10, boolean r11) {
        /*
        r9 = this;
        r6 = 19;
        r8 = 16;
        r7 = 11;
        r2 = 1;
        r0 = 0;
        r1 = r9.f3806J;
        r1 = com.android.ex.photo.p052e.C0566i.m4104a(r1);
        if (r1 == 0) goto L_0x0012;
    L_0x0010:
        r11 = r0;
        r10 = r0;
    L_0x0012:
        r1 = r9.f3827r;
        if (r10 == r1) goto L_0x003a;
    L_0x0016:
        r1 = r2;
    L_0x0017:
        r9.f3827r = r10;
        r3 = r9.f3827r;
        if (r3 == 0) goto L_0x00a0;
    L_0x001d:
        r5 = android.os.Build.VERSION.SDK_INT;
        if (r5 >= r8) goto L_0x003c;
    L_0x0021:
        r3 = r2;
    L_0x0022:
        r4 = r9.f3798B;
        if (r4 == 0) goto L_0x002a;
    L_0x0026:
        r4 = r9.f3797A;
        if (r4 == 0) goto L_0x008a;
    L_0x002a:
        if (r5 > r6) goto L_0x004a;
    L_0x002c:
        if (r5 != r6) goto L_0x007b;
    L_0x002e:
        r4 = android.os.Build.VERSION.SDK_INT;
        if (r4 == r6) goto L_0x003e;
    L_0x0032:
        r0 = new java.lang.IllegalStateException;
        r1 = "kitkatIsSecondary user is only callable on KitKat";
        r0.<init>(r1);
        throw r0;
    L_0x003a:
        r1 = r0;
        goto L_0x0017;
    L_0x003c:
        r3 = r0;
        goto L_0x0022;
    L_0x003e:
        r4 = android.os.Process.myUid();
        r6 = 100000; // 0x186a0 float:1.4013E-40 double:4.94066E-319;
        if (r4 <= r6) goto L_0x0079;
    L_0x0047:
        r4 = r2;
    L_0x0048:
        if (r4 != 0) goto L_0x007b;
    L_0x004a:
        r0 = 3846; // 0xf06 float:5.39E-42 double:1.9E-320;
    L_0x004c:
        if (r3 == 0) goto L_0x0051;
    L_0x004e:
        r9.mo3895m();
    L_0x0051:
        if (r5 < r7) goto L_0x005a;
    L_0x0053:
        r9.f3813d = r0;
        r2 = r9.f3822m;
        r2.setSystemUiVisibility(r0);
    L_0x005a:
        r9.m4135o();
    L_0x005d:
        if (r1 == 0) goto L_0x00ca;
    L_0x005f:
        r0 = r9.f3828s;
        r0 = r0.values();
        r1 = r0.iterator();
    L_0x0069:
        r0 = r1.hasNext();
        if (r0 == 0) goto L_0x00ca;
    L_0x006f:
        r0 = r1.next();
        r0 = (com.android.ex.photo.C0547i) r0;
        r0.mo974c();
        goto L_0x0069;
    L_0x0079:
        r4 = r0;
        goto L_0x0048;
    L_0x007b:
        if (r5 < r8) goto L_0x0080;
    L_0x007d:
        r0 = 1285; // 0x505 float:1.8E-42 double:6.35E-321;
        goto L_0x004c;
    L_0x0080:
        r4 = 14;
        if (r5 < r4) goto L_0x0086;
    L_0x0084:
        r0 = r2;
        goto L_0x004c;
    L_0x0086:
        if (r5 < r7) goto L_0x004c;
    L_0x0088:
        r0 = r2;
        goto L_0x004c;
    L_0x008a:
        if (r5 < r6) goto L_0x0094;
    L_0x008c:
        r0 = 1792; // 0x700 float:2.511E-42 double:8.854E-321;
    L_0x008e:
        if (r3 == 0) goto L_0x0051;
    L_0x0090:
        r9.mo3894l();
        goto L_0x0051;
    L_0x0094:
        if (r5 < r8) goto L_0x0099;
    L_0x0096:
        r0 = 1280; // 0x500 float:1.794E-42 double:6.324E-321;
        goto L_0x008e;
    L_0x0099:
        r2 = 14;
        if (r5 >= r2) goto L_0x008e;
    L_0x009d:
        if (r5 < r7) goto L_0x008e;
    L_0x009f:
        goto L_0x008e;
    L_0x00a0:
        r3 = android.os.Build.VERSION.SDK_INT;
        if (r3 >= r8) goto L_0x00bc;
    L_0x00a4:
        if (r3 < r6) goto L_0x00be;
    L_0x00a6:
        r0 = 1792; // 0x700 float:2.511E-42 double:8.854E-321;
    L_0x00a8:
        if (r2 == 0) goto L_0x00ad;
    L_0x00aa:
        r9.mo3894l();
    L_0x00ad:
        if (r3 < r7) goto L_0x00b6;
    L_0x00af:
        r9.f3813d = r0;
        r2 = r9.f3822m;
        r2.setSystemUiVisibility(r0);
    L_0x00b6:
        if (r11 == 0) goto L_0x005d;
    L_0x00b8:
        r9.m4134n();
        goto L_0x005d;
    L_0x00bc:
        r2 = r0;
        goto L_0x00a4;
    L_0x00be:
        if (r3 < r8) goto L_0x00c3;
    L_0x00c0:
        r0 = 1280; // 0x500 float:1.794E-42 double:6.324E-321;
        goto L_0x00a8;
    L_0x00c3:
        r4 = 14;
        if (r3 >= r4) goto L_0x00a8;
    L_0x00c7:
        if (r3 < r7) goto L_0x00a8;
    L_0x00c9:
        goto L_0x00a8;
    L_0x00ca:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.ex.photo.j.a(boolean, boolean):void");
    }

    private final void m4134n() {
        if (this.f3803G) {
            this.f3808L.postDelayed(this.f3811O, this.f3809M);
        }
    }

    private final void m4135o() {
        this.f3808L.removeCallbacks(this.f3811O);
    }

    private final void m4133e(int i) {
        C0547i c0547i = (C0547i) this.f3828s.get(Integer.valueOf(i));
        if (c0547i != null) {
            c0547i.d_();
        }
        Cursor p = m4136p();
        this.f3817h = i;
        this.f3818i = p.getString(p.getColumnIndex("uri"));
        int currentItem = this.f3824o.getCurrentItem() + 1;
        int i2 = this.f3820k >= 0 ? 1 : 0;
        Cursor p2 = m4136p();
        if (p2 != null) {
            this.f3834y = p2.getString(p2.getColumnIndex("_display_name"));
        } else {
            this.f3834y = null;
        }
        if (this.f3821l || i2 == 0 || currentItem <= 0) {
            this.f3835z = null;
        } else {
            this.f3835z = this.f3812c.getResources().getString(ad.photo_view_count, new Object[]{Integer.valueOf(currentItem), Integer.valueOf(this.f3820k)});
        }
        m4143a(this.f3812c.mo996n());
        if (this.f3806J.isEnabled() && this.f3810N != i) {
            CharSequence string;
            String str = this.f3834y;
            if (this.f3835z != null) {
                string = this.f3812c.mo995m().getResources().getString(ad.titles, new Object[]{this.f3834y, this.f3835z});
            } else {
                Object obj = str;
            }
            if (string != null) {
                View view = this.f3822m;
                AccessibilityManager accessibilityManager = this.f3806J;
                if (VERSION.SDK_INT >= 16) {
                    view.announceForAccessibility(string);
                } else {
                    Context applicationContext = view.getContext().getApplicationContext();
                    if (accessibilityManager == null) {
                        accessibilityManager = (AccessibilityManager) applicationContext.getSystemService("accessibility");
                    }
                    if (accessibilityManager.isEnabled()) {
                        AccessibilityEvent obtain = AccessibilityEvent.obtain(8);
                        obtain.getText().add(string);
                        obtain.setEnabled(view.isEnabled());
                        obtain.setClassName(view.getClass().getName());
                        obtain.setPackageName(applicationContext.getPackageName());
                        C0332a.m1762a(obtain).m1790a(view);
                        if (VERSION.SDK_INT >= 14) {
                            view.getParent().requestSendAccessibilityEvent(view, obtain);
                        } else {
                            accessibilityManager.sendAccessibilityEvent(obtain);
                        }
                    }
                }
                this.f3810N = i;
            }
        }
        m4135o();
        m4134n();
    }

    protected final void m4143a(C0545a c0545a) {
        if (c0545a != null) {
            c0545a.mo986a(C0572j.m4131a(this.f3834y));
            c0545a.mo988b(C0572j.m4131a(this.f3835z));
        }
    }

    private static final String m4131a(String str) {
        if (str == null) {
            return "";
        }
        return str;
    }

    private final Cursor m4136p() {
        if (this.f3824o == null) {
            return null;
        }
        int currentItem = this.f3824o.getCurrentItem();
        Cursor cursor = this.f3826q.f3731d;
        if (cursor == null) {
            return null;
        }
        cursor.moveToPosition(currentItem);
        return cursor;
    }

    public final void mo1005a(boolean z) {
        if (z) {
            m4135o();
        } else {
            m4134n();
        }
    }

    public final void mo1001a() {
    }

    public final void mo1003a(C0548a c0548a, boolean z) {
        if (m4160h() && this.f3825p.getVisibility() != 8 && TextUtils.equals(c0548a.f3739a, this.f3818i)) {
            if (z) {
                if (m4160h()) {
                    this.f3825p.setVisibility(8);
                }
                this.f3824o.setVisibility(0);
            } else {
                Log.w("PhotoViewController", "Failed to load fragment image");
                if (m4160h()) {
                    this.f3825p.setVisibility(8);
                }
                this.f3824o.setVisibility(0);
            }
            this.f3812c.b_().mo313a(2);
        }
    }

    public final void mo1012e() {
    }

    public final C0544d mo1013f() {
        return this.f3826q;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m4162j() {
        /*
        r8 = this;
        r7 = 16;
        r6 = 11;
        r5 = 19;
        r1 = 1;
        r0 = 0;
        r8.f3797A = r1;
        r2 = r8.f3824o;
        r2.setVisibility(r0);
        r2 = r8.f3827r;
        r4 = android.os.Build.VERSION.SDK_INT;
        if (r4 >= r7) goto L_0x0030;
    L_0x0015:
        r3 = r1;
    L_0x0016:
        if (r2 == 0) goto L_0x0060;
    L_0x0018:
        r2 = r8.f3798B;
        if (r2 == 0) goto L_0x0020;
    L_0x001c:
        r2 = r8.f3797A;
        if (r2 == 0) goto L_0x0060;
    L_0x0020:
        if (r4 > r5) goto L_0x003e;
    L_0x0022:
        if (r4 != r5) goto L_0x0051;
    L_0x0024:
        r2 = android.os.Build.VERSION.SDK_INT;
        if (r2 == r5) goto L_0x0032;
    L_0x0028:
        r0 = new java.lang.IllegalStateException;
        r1 = "kitkatIsSecondary user is only callable on KitKat";
        r0.<init>(r1);
        throw r0;
    L_0x0030:
        r3 = r0;
        goto L_0x0016;
    L_0x0032:
        r2 = android.os.Process.myUid();
        r5 = 100000; // 0x186a0 float:1.4013E-40 double:4.94066E-319;
        if (r2 <= r5) goto L_0x004f;
    L_0x003b:
        r2 = r1;
    L_0x003c:
        if (r2 != 0) goto L_0x0051;
    L_0x003e:
        r0 = 3846; // 0xf06 float:5.39E-42 double:1.9E-320;
    L_0x0040:
        if (r3 == 0) goto L_0x0045;
    L_0x0042:
        r8.mo3895m();
    L_0x0045:
        if (r4 < r6) goto L_0x004e;
    L_0x0047:
        r8.f3813d = r0;
        r1 = r8.f3822m;
        r1.setSystemUiVisibility(r0);
    L_0x004e:
        return;
    L_0x004f:
        r2 = r0;
        goto L_0x003c;
    L_0x0051:
        if (r4 < r7) goto L_0x0056;
    L_0x0053:
        r0 = 1285; // 0x505 float:1.8E-42 double:6.35E-321;
        goto L_0x0040;
    L_0x0056:
        r2 = 14;
        if (r4 < r2) goto L_0x005c;
    L_0x005a:
        r0 = r1;
        goto L_0x0040;
    L_0x005c:
        if (r4 < r6) goto L_0x0040;
    L_0x005e:
        r0 = r1;
        goto L_0x0040;
    L_0x0060:
        if (r4 < r5) goto L_0x006a;
    L_0x0062:
        r0 = 1792; // 0x700 float:2.511E-42 double:8.854E-321;
    L_0x0064:
        if (r3 == 0) goto L_0x0045;
    L_0x0066:
        r8.mo3894l();
        goto L_0x0045;
    L_0x006a:
        if (r4 < r7) goto L_0x006f;
    L_0x006c:
        r0 = 1280; // 0x500 float:1.794E-42 double:6.324E-321;
        goto L_0x0064;
    L_0x006f:
        r1 = 14;
        if (r4 >= r1) goto L_0x0064;
    L_0x0073:
        if (r4 < r6) goto L_0x0064;
    L_0x0075:
        goto L_0x0064;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.ex.photo.j.j():void");
    }

    final void m4163k() {
        int measuredWidth = this.f3822m.getMeasuredWidth();
        int measuredHeight = this.f3822m.getMeasuredHeight();
        if (m4160h()) {
            this.f3825p.setVisibility(0);
        }
        float max = Math.max(((float) this.f3801E) / ((float) measuredWidth), ((float) this.f3802F) / ((float) measuredHeight));
        measuredWidth = C0572j.m4130a(this.f3799C, this.f3801E, measuredWidth, max);
        measuredHeight = C0572j.m4130a(this.f3800D, this.f3802F, measuredHeight, max);
        int i = VERSION.SDK_INT;
        if (i >= 14) {
            if (m4159g()) {
                this.f3823n.setAlpha(0.0f);
                this.f3823n.animate().alpha(1.0f).setDuration(250).start();
                this.f3823n.setVisibility(0);
            }
            if (m4160h()) {
                this.f3825p.setScaleX(max);
                this.f3825p.setScaleY(max);
                this.f3825p.setTranslationX((float) measuredWidth);
                this.f3825p.setTranslationY((float) measuredHeight);
                Runnable c0575m = new C0575m(this);
                ViewPropertyAnimator duration = this.f3825p.animate().scaleX(1.0f).scaleY(1.0f).translationX(0.0f).translationY(0.0f).setDuration(250);
                if (i >= 16) {
                    duration.withEndAction(c0575m);
                } else {
                    this.f3808L.postDelayed(c0575m, 250);
                }
                duration.start();
                return;
            }
            return;
        }
        if (m4159g()) {
            Animation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
            alphaAnimation.setDuration(250);
            this.f3823n.startAnimation(alphaAnimation);
            this.f3823n.setVisibility(0);
        }
        if (m4160h()) {
            alphaAnimation = new TranslateAnimation((float) measuredWidth, (float) measuredHeight, 0.0f, 0.0f);
            alphaAnimation.setDuration(250);
            Animation scaleAnimation = new ScaleAnimation(max, max, 0.0f, 0.0f);
            scaleAnimation.setDuration(250);
            Animation animationSet = new AnimationSet(true);
            animationSet.addAnimation(alphaAnimation);
            animationSet.addAnimation(scaleAnimation);
            animationSet.setAnimationListener(new C0576n(this));
            this.f3825p.startAnimation(animationSet);
        }
    }

    static int m4130a(int i, int i2, int i3, float f) {
        return (i - Math.round((((float) i3) - (((float) i3) * f)) / 2.0f)) - Math.round(((((float) i3) * f) - ((float) i2)) / 2.0f);
    }

    public void mo3894l() {
        this.f3812c.mo996n().mo989c();
    }

    public void mo3895m() {
        this.f3812c.mo996n().mo990d();
    }

    public final /* synthetic */ void mo972a(C0211f c0211f, Object obj) {
        Cursor cursor = (Cursor) obj;
        if (c0211f.f1190o != 100) {
            return;
        }
        if (cursor == null || cursor.getCount() == 0) {
            this.f3821l = true;
            this.f3826q.mo966a(null);
            return;
        }
        this.f3820k = cursor.getCount();
        if (this.f3818i != null) {
            Uri build;
            int columnIndex = cursor.getColumnIndex("uri");
            if (VERSION.SDK_INT >= 11) {
                build = Uri.parse(this.f3818i).buildUpon().clearQuery().build();
            } else {
                build = Uri.parse(this.f3818i).buildUpon().query(null).build();
            }
            cursor.moveToPosition(-1);
            int i = 0;
            while (cursor.moveToNext()) {
                String string = cursor.getString(columnIndex);
                Object build2;
                if (VERSION.SDK_INT >= 11) {
                    build2 = Uri.parse(string).buildUpon().clearQuery().build();
                } else {
                    build2 = Uri.parse(string).buildUpon().query(null).build();
                }
                if (build != null && build.equals(r3)) {
                    this.f3817h = i;
                    break;
                }
                i++;
            }
        }
        if (this.f3832w) {
            this.f3830u = true;
            this.f3826q.mo966a(null);
            return;
        }
        boolean z = this.f3821l;
        this.f3821l = false;
        this.f3826q.mo966a(cursor);
        if (this.f3824o.getAdapter() == null) {
            this.f3824o.setAdapter(this.f3826q);
        }
        m4132a(cursor);
        if (this.f3817h < 0) {
            this.f3817h = 0;
        }
        this.f3824o.m1757a(this.f3817h, false);
        if (z) {
            m4133e(this.f3817h);
        }
    }
}
