package com.android.ex.photo;

import android.content.Context;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v4.app.bx;
import android.support.v7.app.aa;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.ScaleAnimation;

public class C0569f extends aa implements C0568r {
    public C0572j f3793q;
    public C0555c f3794r;

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r12) {
        /*
        r11 = this;
        r10 = 19;
        r9 = 16;
        r8 = 11;
        r1 = 1;
        r2 = 0;
        super.onCreate(r12);
        r0 = r11.mo3890k();
        r11.f3793q = r0;
        r4 = r11.f3793q;
        r0 = com.android.ex.photo.C0572j.f3796b;
        if (r0 != 0) goto L_0x0044;
    L_0x0017:
        r3 = new android.util.DisplayMetrics;
        r3.<init>();
        r0 = r4.f3812c;
        r0 = r0.mo995m();
        r5 = "window";
        r0 = r0.getSystemService(r5);
        r0 = (android.view.WindowManager) r0;
        r5 = com.android.ex.photo.p052e.C0559b.f3761b;
        r0 = r0.getDefaultDisplay();
        r0.getMetrics(r3);
        r0 = r5.ordinal();
        switch(r0) {
            case 0: goto L_0x021e;
            default: goto L_0x003a;
        };
    L_0x003a:
        r0 = r3.heightPixels;
        r3 = r3.widthPixels;
        r0 = java.lang.Math.min(r0, r3);
        com.android.ex.photo.C0572j.f3796b = r0;
    L_0x0044:
        r0 = r4.f3812c;
        r0 = r0.getApplicationContext();
        r3 = "activity";
        r0 = r0.getSystemService(r3);
        r0 = (android.app.ActivityManager) r0;
        r0 = r0.getMemoryClass();
        com.android.ex.photo.C0572j.f3795a = r0;
        r0 = r4.f3812c;
        r3 = r0.getIntent();
        r0 = "photos_uri";
        r0 = r3.hasExtra(r0);
        if (r0 == 0) goto L_0x006e;
    L_0x0066:
        r0 = "photos_uri";
        r0 = r3.getStringExtra(r0);
        r4.f3815f = r0;
    L_0x006e:
        r0 = "enable_timer_lights_out";
        r0 = r3.getBooleanExtra(r0, r1);
        r4.f3803G = r0;
        r0 = "scale_up_animation";
        r0 = r3.getBooleanExtra(r0, r2);
        if (r0 == 0) goto L_0x00a0;
    L_0x007e:
        r4.f3798B = r1;
        r0 = "start_x_extra";
        r0 = r3.getIntExtra(r0, r2);
        r4.f3799C = r0;
        r0 = "start_y_extra";
        r0 = r3.getIntExtra(r0, r2);
        r4.f3800D = r0;
        r0 = "start_width_extra";
        r0 = r3.getIntExtra(r0, r2);
        r4.f3801E = r0;
        r0 = "start_height_extra";
        r0 = r3.getIntExtra(r0, r2);
        r4.f3802F = r0;
    L_0x00a0:
        r0 = "action_bar_hidden_initially";
        r0 = r3.getBooleanExtra(r0, r2);
        if (r0 == 0) goto L_0x022e;
    L_0x00a8:
        r0 = r4.f3806J;
        r0 = com.android.ex.photo.p052e.C0566i.m4104a(r0);
        if (r0 != 0) goto L_0x022e;
    L_0x00b0:
        r0 = r1;
    L_0x00b1:
        r4.f3804H = r0;
        r0 = "display_thumbs_fullscreen";
        r0 = r3.getBooleanExtra(r0, r2);
        r4.f3805I = r0;
        r0 = "projection";
        r0 = r3.hasExtra(r0);
        if (r0 == 0) goto L_0x0231;
    L_0x00c3:
        r0 = "projection";
        r0 = r3.getStringArrayExtra(r0);
        r4.f3819j = r0;
    L_0x00cb:
        r0 = "max_scale";
        r5 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r0 = r3.getFloatExtra(r0, r5);
        r4.f3833x = r0;
        r0 = 0;
        r4.f3818i = r0;
        r0 = -1;
        r4.f3817h = r0;
        r0 = "photo_index";
        r0 = r3.hasExtra(r0);
        if (r0 == 0) goto L_0x00ec;
    L_0x00e3:
        r0 = "photo_index";
        r5 = -1;
        r0 = r3.getIntExtra(r0, r5);
        r4.f3817h = r0;
    L_0x00ec:
        r0 = "initial_photo_uri";
        r0 = r3.hasExtra(r0);
        if (r0 == 0) goto L_0x0100;
    L_0x00f4:
        r0 = "initial_photo_uri";
        r0 = r3.getStringExtra(r0);
        r4.f3816g = r0;
        r0 = r4.f3816g;
        r4.f3818i = r0;
    L_0x0100:
        r4.f3821l = r1;
        if (r12 == 0) goto L_0x0239;
    L_0x0104:
        r0 = "com.android.ex.PhotoViewFragment.INITIAL_URI";
        r0 = r12.getString(r0);
        r4.f3816g = r0;
        r0 = "com.android.ex.PhotoViewFragment.CURRENT_URI";
        r0 = r12.getString(r0);
        r4.f3818i = r0;
        r0 = "com.android.ex.PhotoViewFragment.CURRENT_INDEX";
        r0 = r12.getInt(r0);
        r4.f3817h = r0;
        r0 = "com.android.ex.PhotoViewFragment.FULLSCREEN";
        r0 = r12.getBoolean(r0, r2);
        if (r0 == 0) goto L_0x0236;
    L_0x0124:
        r0 = r4.f3806J;
        r0 = com.android.ex.photo.p052e.C0566i.m4104a(r0);
        if (r0 != 0) goto L_0x0236;
    L_0x012c:
        r0 = r1;
    L_0x012d:
        r4.f3827r = r0;
        r0 = "com.android.ex.PhotoViewFragment.ACTIONBARTITLE";
        r0 = r12.getString(r0);
        r4.f3834y = r0;
        r0 = "com.android.ex.PhotoViewFragment.ACTIONBARSUBTITLE";
        r0 = r12.getString(r0);
        r4.f3835z = r0;
        r0 = "com.android.ex.PhotoViewFragment.SCALEANIMATIONFINISHED";
        r0 = r12.getBoolean(r0, r2);
        r4.f3797A = r0;
    L_0x0147:
        r0 = r4.f3812c;
        r3 = com.android.ex.photo.ac.photo_activity_view;
        r0.setContentView(r3);
        r0 = r4.f3812c;
        r0 = r0.mo995m();
        r3 = r4.f3812c;
        r3 = r3.H_();
        r5 = r4.f3833x;
        r6 = new com.android.ex.photo.a.d;
        r7 = r4.f3805I;
        r6.<init>(r0, r3, r5, r7);
        r4.f3826q = r6;
        r0 = r4.f3812c;
        r3 = r0.getResources();
        r0 = com.android.ex.photo.aa.photo_activity_root_view;
        r0 = r4.m4155d(r0);
        r4.f3822m = r0;
        r0 = android.os.Build.VERSION.SDK_INT;
        if (r0 < r8) goto L_0x017e;
    L_0x0177:
        r0 = r4.f3822m;
        r5 = r4.f3814e;
        r0.setOnSystemUiVisibilityChangeListener(r5);
    L_0x017e:
        r0 = com.android.ex.photo.aa.photo_activity_background;
        r0 = r4.m4155d(r0);
        r4.f3823n = r0;
        r0 = com.android.ex.photo.aa.photo_activity_temporary_image;
        r0 = r4.m4155d(r0);
        r0 = (android.widget.ImageView) r0;
        r4.f3825p = r0;
        r0 = com.android.ex.photo.aa.photo_view_pager;
        r0 = r4.m4155d(r0);
        r0 = (com.android.ex.photo.PhotoViewPager) r0;
        r4.f3824o = r0;
        r0 = r4.f3824o;
        r5 = r4.f3826q;
        r0.setAdapter(r5);
        r0 = r4.f3824o;
        r0.setOnPageChangeListener(r4);
        r0 = r4.f3824o;
        r0.setOnInterceptTouchListener(r4);
        r0 = r4.f3824o;
        r5 = com.android.ex.photo.C0591y.photo_page_margin;
        r5 = r3.getDimensionPixelSize(r5);
        r0.setPageMargin(r5);
        r0 = new com.android.ex.photo.s;
        r0.<init>(r4);
        r4.f3807K = r0;
        r0 = r4.f3798B;
        if (r0 == 0) goto L_0x01c5;
    L_0x01c1:
        r0 = r4.f3797A;
        if (r0 == 0) goto L_0x023f;
    L_0x01c5:
        r0 = r4.f3812c;
        r0 = r0.b_();
        r5 = 100;
        r6 = 0;
        r0.mo311a(r5, r6, r4);
        r0 = r4.m4159g();
        if (r0 == 0) goto L_0x01dc;
    L_0x01d7:
        r0 = r4.f3823n;
        r0.setVisibility(r2);
    L_0x01dc:
        r0 = com.android.ex.photo.ab.reenter_fullscreen_delay_time_in_millis;
        r0 = r3.getInteger(r0);
        r6 = (long) r0;
        r4.f3809M = r6;
        r0 = r4.f3812c;
        r0 = r0.mo996n();
        if (r0 == 0) goto L_0x01f9;
    L_0x01ed:
        r0.mo983a();
        r0.mo985a(r4);
        r0.mo987b();
        r4.m4143a(r0);
    L_0x01f9:
        r0 = r4.f3798B;
        if (r0 != 0) goto L_0x02ad;
    L_0x01fd:
        r0 = r4.f3827r;
        r5 = android.os.Build.VERSION.SDK_INT;
        if (r5 >= r9) goto L_0x0260;
    L_0x0203:
        r3 = r1;
    L_0x0204:
        if (r0 == 0) goto L_0x0292;
    L_0x0206:
        r0 = r4.f3798B;
        if (r0 == 0) goto L_0x020e;
    L_0x020a:
        r0 = r4.f3797A;
        if (r0 == 0) goto L_0x0292;
    L_0x020e:
        if (r5 > r10) goto L_0x026e;
    L_0x0210:
        if (r5 != r10) goto L_0x0282;
    L_0x0212:
        r0 = android.os.Build.VERSION.SDK_INT;
        if (r0 == r10) goto L_0x0262;
    L_0x0216:
        r0 = new java.lang.IllegalStateException;
        r1 = "kitkatIsSecondary user is only callable on KitKat";
        r0.<init>(r1);
        throw r0;
    L_0x021e:
        r0 = r3.heightPixels;
        r3 = r3.widthPixels;
        r0 = java.lang.Math.min(r0, r3);
        r0 = r0 * 800;
        r0 = r0 / 1000;
        com.android.ex.photo.C0572j.f3796b = r0;
        goto L_0x0044;
    L_0x022e:
        r0 = r2;
        goto L_0x00b1;
    L_0x0231:
        r0 = 0;
        r4.f3819j = r0;
        goto L_0x00cb;
    L_0x0236:
        r0 = r2;
        goto L_0x012d;
    L_0x0239:
        r0 = r4.f3804H;
        r4.f3827r = r0;
        goto L_0x0147;
    L_0x023f:
        r0 = r4.f3824o;
        r5 = 8;
        r0.setVisibility(r5);
        r0 = new android.os.Bundle;
        r0.<init>();
        r5 = "image_uri";
        r6 = r4.f3816g;
        r0.putString(r5, r6);
        r5 = r4.f3812c;
        r5 = r5.b_();
        r6 = 2;
        r7 = r4.f3807K;
        r5.mo311a(r6, r0, r7);
        goto L_0x01dc;
    L_0x0260:
        r3 = r2;
        goto L_0x0204;
    L_0x0262:
        r0 = android.os.Process.myUid();
        r6 = 100000; // 0x186a0 float:1.4013E-40 double:4.94066E-319;
        if (r0 <= r6) goto L_0x0280;
    L_0x026b:
        r0 = r1;
    L_0x026c:
        if (r0 != 0) goto L_0x0282;
    L_0x026e:
        r1 = 3846; // 0xf06 float:5.39E-42 double:1.9E-320;
        r0 = r1;
    L_0x0271:
        if (r3 == 0) goto L_0x0276;
    L_0x0273:
        r4.mo3895m();
    L_0x0276:
        if (r5 < r8) goto L_0x027f;
    L_0x0278:
        r4.f3813d = r0;
        r1 = r4.f3822m;
        r1.setSystemUiVisibility(r0);
    L_0x027f:
        return;
    L_0x0280:
        r0 = r2;
        goto L_0x026c;
    L_0x0282:
        if (r5 < r9) goto L_0x0288;
    L_0x0284:
        r1 = 1285; // 0x505 float:1.8E-42 double:6.35E-321;
        r0 = r1;
        goto L_0x0271;
    L_0x0288:
        r0 = 14;
        if (r5 < r0) goto L_0x028e;
    L_0x028c:
        r0 = r1;
        goto L_0x0271;
    L_0x028e:
        if (r5 < r8) goto L_0x02d4;
    L_0x0290:
        r0 = r1;
        goto L_0x0271;
    L_0x0292:
        if (r5 < r10) goto L_0x029d;
    L_0x0294:
        r2 = 1792; // 0x700 float:2.511E-42 double:8.854E-321;
        r0 = r2;
    L_0x0297:
        if (r3 == 0) goto L_0x0276;
    L_0x0299:
        r4.mo3894l();
        goto L_0x0276;
    L_0x029d:
        if (r5 < r9) goto L_0x02a3;
    L_0x029f:
        r2 = 1280; // 0x500 float:1.794E-42 double:6.324E-321;
        r0 = r2;
        goto L_0x0297;
    L_0x02a3:
        r0 = 14;
        if (r5 < r0) goto L_0x02a9;
    L_0x02a7:
        r0 = r2;
        goto L_0x0297;
    L_0x02a9:
        if (r5 < r8) goto L_0x02d2;
    L_0x02ab:
        r0 = r2;
        goto L_0x0297;
    L_0x02ad:
        r0 = android.os.Build.VERSION.SDK_INT;
        if (r0 >= r9) goto L_0x02c4;
    L_0x02b1:
        if (r0 < r10) goto L_0x02c6;
    L_0x02b3:
        r2 = 1792; // 0x700 float:2.511E-42 double:8.854E-321;
    L_0x02b5:
        if (r1 == 0) goto L_0x02ba;
    L_0x02b7:
        r4.mo3894l();
    L_0x02ba:
        if (r0 < r8) goto L_0x027f;
    L_0x02bc:
        r4.f3813d = r2;
        r0 = r4.f3822m;
        r0.setSystemUiVisibility(r2);
        goto L_0x027f;
    L_0x02c4:
        r1 = r2;
        goto L_0x02b1;
    L_0x02c6:
        if (r0 < r9) goto L_0x02cb;
    L_0x02c8:
        r2 = 1280; // 0x500 float:1.794E-42 double:6.324E-321;
        goto L_0x02b5;
    L_0x02cb:
        r3 = 14;
        if (r0 >= r3) goto L_0x02b5;
    L_0x02cf:
        if (r0 < r8) goto L_0x02b5;
    L_0x02d1:
        goto L_0x02b5;
    L_0x02d2:
        r0 = r2;
        goto L_0x0297;
    L_0x02d4:
        r0 = r2;
        goto L_0x0271;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.ex.photo.f.onCreate(android.os.Bundle):void");
    }

    public C0572j mo3890k() {
        return new C0572j(this);
    }

    public final C0572j mo994l() {
        return this.f3793q;
    }

    protected void onResume() {
        super.onResume();
        bx bxVar = this.f3793q;
        bxVar.m4147a(bxVar.f3827r, false);
        bxVar.f3832w = false;
        if (bxVar.f3830u) {
            bxVar.f3830u = false;
            bxVar.f3812c.b_().mo311a(100, null, bxVar);
        }
    }

    protected void onPause() {
        this.f3793q.f3832w = true;
        super.onPause();
    }

    protected void onDestroy() {
        this.f3793q.f3831v = true;
        super.onDestroy();
    }

    public void onBackPressed() {
        int i = 0;
        C0572j c0572j = this.f3793q;
        if (!c0572j.f3827r || c0572j.f3804H) {
            if (c0572j.f3798B) {
                c0572j.f3812c.getIntent();
                int measuredWidth = c0572j.f3822m.getMeasuredWidth();
                int measuredHeight = c0572j.f3822m.getMeasuredHeight();
                float max = Math.max(((float) c0572j.f3801E) / ((float) measuredWidth), ((float) c0572j.f3802F) / ((float) measuredHeight));
                measuredWidth = C0572j.m4130a(c0572j.f3799C, c0572j.f3801E, measuredWidth, max);
                measuredHeight = C0572j.m4130a(c0572j.f3800D, c0572j.f3802F, measuredHeight, max);
                int i2 = VERSION.SDK_INT;
                if (i2 >= 14) {
                    ViewPropertyAnimator duration;
                    if (c0572j.m4159g()) {
                        c0572j.f3823n.animate().alpha(0.0f).setDuration(250).start();
                        c0572j.f3823n.setVisibility(0);
                    }
                    Runnable c0577o = new C0577o(c0572j);
                    if (c0572j.m4160h() && c0572j.f3825p.getVisibility() == 0) {
                        duration = c0572j.f3825p.animate().scaleX(max).scaleY(max).translationX((float) measuredWidth).translationY((float) measuredHeight).setDuration(250);
                    } else {
                        duration = c0572j.f3824o.animate().scaleX(max).scaleY(max).translationX((float) measuredWidth).translationY((float) measuredHeight).setDuration(250);
                    }
                    if (!c0572j.f3816g.equals(c0572j.f3818i)) {
                        duration.alpha(0.0f);
                    }
                    if (i2 >= 16) {
                        duration.withEndAction(c0577o);
                    } else {
                        c0572j.f3808L.postDelayed(c0577o, 250);
                    }
                    duration.start();
                } else {
                    if (c0572j.m4159g()) {
                        Animation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
                        alphaAnimation.setDuration(250);
                        c0572j.f3823n.startAnimation(alphaAnimation);
                        c0572j.f3823n.setVisibility(0);
                    }
                    Animation scaleAnimation = new ScaleAnimation(1.0f, 1.0f, max, max);
                    scaleAnimation.setDuration(250);
                    scaleAnimation.setAnimationListener(new C0578p(c0572j));
                    if (c0572j.m4160h() && c0572j.f3825p.getVisibility() == 0) {
                        c0572j.f3825p.startAnimation(scaleAnimation);
                    } else {
                        c0572j.f3824o.startAnimation(scaleAnimation);
                    }
                }
            }
            if (i == 0) {
                super.onBackPressed();
            }
        }
        c0572j.mo1009c();
        i = 1;
        if (i == 0) {
            super.onBackPressed();
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        C0572j c0572j = this.f3793q;
        bundle.putString("com.android.ex.PhotoViewFragment.INITIAL_URI", c0572j.f3816g);
        bundle.putString("com.android.ex.PhotoViewFragment.CURRENT_URI", c0572j.f3818i);
        bundle.putInt("com.android.ex.PhotoViewFragment.CURRENT_INDEX", c0572j.f3817h);
        bundle.putBoolean("com.android.ex.PhotoViewFragment.FULLSCREEN", c0572j.f3827r);
        bundle.putString("com.android.ex.PhotoViewFragment.ACTIONBARTITLE", c0572j.f3834y);
        bundle.putString("com.android.ex.PhotoViewFragment.ACTIONBARSUBTITLE", c0572j.f3835z);
        bundle.putBoolean("com.android.ex.PhotoViewFragment.SCALEANIMATIONFINISHED", c0572j.f3797A);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        return true;
    }

    public boolean onPrepareOptionsMenu(Menu menu) {
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        boolean z;
        C0572j c0572j = this.f3793q;
        switch (menuItem.getItemId()) {
            case 16908332:
                c0572j.f3812c.finish();
                z = true;
                break;
            default:
                z = false;
                break;
        }
        if (z || super.onOptionsItemSelected(menuItem)) {
            return true;
        }
        return false;
    }

    public final Context mo995m() {
        return this;
    }

    public C0545a mo996n() {
        if (this.f3794r == null) {
            this.f3794r = new C0555c(G_().mo500a());
        }
        return this.f3794r;
    }

    public final View mo993c(int i) {
        return findViewById(i);
    }
}
