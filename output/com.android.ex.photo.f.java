package com.android.ex.photo;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Build$VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.Process;
import android.support.v4.app.bw;
import android.support.v4.view.ViewPager;
import android.support.v7.app.aa;
import android.support.v7.app.ac;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.WindowManager;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.ScaleAnimation;
import android.widget.ImageView;
import com.android.ex.photo.a.d;
import com.android.ex.photo.e.b;
import com.android.ex.photo.e.e;
import com.android.ex.photo.e.i;

public class com.android.ex.photo.f extends android.support.v7.app.aa implements com.android.ex.photo.r
{

    public com.android.ex.photo.j q;
    public com.android.ex.photo.c r;

    f() {
        android.support.v7.app.aa();
    }

    public final View c(int p0) {
        return this.findViewById(p0);
    }

    public com.android.ex.photo.j k() {
        return new com.android.ex.photo.j(this);
    }

    public final com.android.ex.photo.j l() {
        return this.q;
    }

    public final Context m() {
        return this;
    }

    public com.android.ex.photo.a n() {
        if (this.r == 0)
            this.r = new com.android.ex.photo.c(this.G_().a());
        return this.r;
    }

    public void onBackPressed() {
        v0 = 0;
        if (this.q.r != 0 && this.q.H == 0)
            this.q.c();
        else {
            if (this.q.B == 0) {
                if (v0 == 0)
                    super.onBackPressed();
                return;
            }
            this.q.c.getIntent();
            v2 = this.q.m.getMeasuredWidth();
            v3 = this.q.m.getMeasuredHeight();
            v4 = Math.max((float)this.q.E / (float)v2, (float)this.q.F / (float)v3);
            v2 = com.android.ex.photo.j.a(this.q.C, this.q.E, v2, v4);
            v3 = com.android.ex.photo.j.a(this.q.D, this.q.F, v3, v4);
            if (Build$VERSION.SDK_INT >= 14) {
                if (this.q.g()) {
                    this.q.n.animate().alpha(0).setDuration(250).start();
                    this.q.n.setVisibility(0);
                }
                v6 = new com.android.ex.photo.o(this.q);
                if (this.q.h() && this.q.p.getVisibility() == 0)
                    v0 = this.q.p.animate().scaleX(v4).scaleY(v4).translationX((float)v2).translationY((float)v3).setDuration(250);
                else
                    v0 = this.q.o.animate().scaleX(v4).scaleY(v4).translationX((float)v2).translationY((float)v3).setDuration(250);
                if (!this.q.g.equals(this.q.i))
                    v0.alpha(0);
                if (Build$VERSION.SDK_INT >= 16)
                    v0.withEndAction(v6);
                else
                    this.q.L.postDelayed(v6, 250);
                v0.start();
            }
            else {
                if (this.q.g()) {
                    v2 = new AlphaAnimation(1065353216, 0);
                    v2.setDuration(250);
                    this.q.n.startAnimation(v2);
                    this.q.n.setVisibility(0);
                }
                v0 = new ScaleAnimation(1065353216, 1065353216, v4, v4);
                v0.setDuration(250);
                v0.setAnimationListener(new com.android.ex.photo.p(this.q));
                if (this.q.h() && this.q.p.getVisibility() == 0)
                    this.q.p.startAnimation(v0);
                else
                    this.q.o.startAnimation(v0);
            }
        }
        v0 = 1;
        if (v0 == 0)
            super.onBackPressed();
    }

    public void onCreate(Bundle p0) {
  6:    v1 = 1;
  7:    v2 = 0;
  8:    super.onCreate(p0);
 15:    this.q = this.k();
 17:    v4 = this.q;
 21:    if (com.android.ex.photo.j.b != 0) goto 68;
 25:    v3 = new DisplayMetrics();
 48:    ((WindowManager)v4.c.m().getSystemService("window")).getDefaultDisplay().getMetrics(v3);
 55:    switch (com.android.ex.photo.e.b.b.ordinal()) {
            case 0:
 55:            goto 542;
            default:
        }
 66:    com.android.ex.photo.j.b = Math.min(v3.heightPixels, v3.widthPixels);
 86:    com.android.ex.photo.j.a = ((ActivityManager)v4.c.getApplicationContext().getSystemService("activity")).getMemoryClass();
 90:    v3 = v4.c.getIntent();
100:    if (v3.hasExtra("photos_uri"))
108:        v4.f = v3.getStringExtra("photos_uri");
116:    v4.G = v3.getBooleanExtra("enable_timer_lights_out", 1);
124:    if (v3.getBooleanExtra("scale_up_animation", 0)) {
126:        v4.B = 1;
134:        v4.C = v3.getIntExtra("start_x_extra", 0);
142:        v4.D = v3.getIntExtra("start_y_extra", 0);
150:        v4.E = v3.getIntExtra("start_width_extra", 0);
158:        v4.F = v3.getIntExtra("start_height_extra", 0);
        }
166:    if (v3.getBooleanExtra("action_bar_hidden_initially", 0) && !com.android.ex.photo.e.i.a(v4.J))
176:        v0 = 1;
        else
558:        v0 = 0;
177:    v4.H = v0;
185:    v4.I = v3.getBooleanExtra("display_thumbs_fullscreen", 0);
193:    if (v3.hasExtra("projection"))
201:        v4.j = v3.getStringArrayExtra("projection");
        else
562:        v4.j = 0;
211:    v4.x = v3.getFloatExtra("max_scale", 1065353216);
214:    v4.i = 0;
217:    v4.h = -1;
225:    if (v3.hasExtra("photo_index"))
234:        v4.h = v3.getIntExtra("photo_index", -1);
242:    if (v3.hasExtra("initial_photo_uri")) {
250:        v4.g = v3.getStringExtra("initial_photo_uri");
254:        v4.i = v4.g;
        }
256:    v4.l = 1;
258:    if (p0 != 0) {
266:        v4.g = p0.getString("com.android.ex.PhotoViewFragment.INITIAL_URI");
274:        v4.i = p0.getString("com.android.ex.PhotoViewFragment.CURRENT_URI");
282:        v4.h = p0.getInt("com.android.ex.PhotoViewFragment.CURRENT_INDEX");
290:        if (p0.getBoolean("com.android.ex.PhotoViewFragment.FULLSCREEN", 0) && !com.android.ex.photo.e.i.a(v4.J))
300:            v0 = 1;
            else
566:            v0 = 0;
301:        v4.r = v0;
309:        v4.y = p0.getString("com.android.ex.PhotoViewFragment.ACTIONBARTITLE");
317:        v4.z = p0.getString("com.android.ex.PhotoViewFragment.ACTIONBARSUBTITLE");
325:        v4.A = p0.getBoolean("com.android.ex.PhotoViewFragment.SCALEANIMATIONFINISHED", 0);
        }
        else
571:        v4.r = v4.H;
331:    v4.c.setContentView(com.android.ex.photo.ac.photo_activity_view);
355:    v4.q = new com.android.ex.photo.a.d(v4.c.m(), v4.c.H_(), v4.x, v4.I);
359:    v3 = v4.c.getResources();
369:    v4.m = v4.d(com.android.ex.photo.aa.photo_activity_root_view);
373:    if (Build$VERSION.SDK_INT >= 11)
379:        v4.m.setOnSystemUiVisibilityChangeListener(v4.e);
388:    v4.n = v4.d(com.android.ex.photo.aa.photo_activity_background);
398:    v4.p = (ImageView)v4.d(com.android.ex.photo.aa.photo_activity_temporary_image);
408:    v4.o = (PhotoViewPager)v4.d(com.android.ex.photo.aa.photo_view_pager);
414:    v4.o.setAdapter(v4.q);
419:    v4.o.setOnPageChangeListener(v4);
424:    v4.o.setOnInterceptTouchListener(v4);
435:    v4.o.setPageMargin(v3.getDimensionPixelSize(com.android.ex.photo.y.photo_page_margin));
443:    v4.K = new com.android.ex.photo.s(v4);
447:    if (v4.B == 0 || v4.A != 0) {
462:        v4.c.b_().a(100, 0, v4);
469:        if (v4.g())
473:            v4.n.setVisibility(0);
        }
        else {
579:        v4.o.setVisibility(8);
584:        v0 = new Bundle();
591:        v0.putString("image_uri", v4.g);
603:        v4.c.b_().a(2, v0, v4.K);
        }
483:    v4.M = (long)v3.getInteger(com.android.ex.photo.ab.reenter_fullscreen_delay_time_in_millis);
487:    v0 = v4.c.n();
491:    if (v0 != 0) {
493:        v0.a();
496:        v0.a(v4);
499:        v0.b();
502:        v4.a(v0);
        }
507:    if (v4.B != 0) {
687:        if (Build$VERSION.SDK_INT >= 16)
708:            v1 = 0;
689:        if (Build$VERSION.SDK_INT >= 19)
691:            v2 = 1792;
710:        else if (Build$VERSION.SDK_INT >= 16)
712:            v2 = 1280;
717:        else if (Build$VERSION.SDK_INT < 14 && Build$VERSION.SDK_INT >= 11) {
            }
693:        if (v1 != 0)
695:            v4.l();
698:        if (Build$VERSION.SDK_INT >= 11) {
700:            v4.d = v2;
704:            v4.m.setSystemUiVisibility(v2);
            }
707:        return;
        }
513:    if (Build$VERSION.SDK_INT < 16)
515:        v3 = 1;
        else
608:        v3 = 0;
516:    if (v4.r == 0) goto 658;
520:    if (v4.B == 0) goto 526;
524:    if (v4.A == 0) goto 658;
526:    if (Build$VERSION.SDK_INT > 19) {
624:        v0 = 3846;
625:        if (v3 != 0)
627:            v4.m();
630:        if (Build$VERSION.SDK_INT >= 11) {
632:            v4.d = v0;
636:            v4.m.setSystemUiVisibility(v0);
            }
639:        return;
        }
528:    if (Build$VERSION.SDK_INT != 19) goto 642;
532:    if (Build$VERSION.SDK_INT != 19)
541:        throw new IllegalStateException("kitkatIsSecondary user is only callable on KitKat");
533:    goto 610;
554:    com.android.ex.photo.j.b = Math.min(v3.heightPixels, v3.widthPixels) * 800 / 1000;
556:    goto 68;
617:    if (Process.myUid() > 100000)
619:        v0 = 1;
        else
640:        v0 = 0;
620:    if (v0 != 0) goto 642;
624:    v0 = 3846;
625:    if (v3 != 0)
627:        v4.m();
630:    if (Build$VERSION.SDK_INT >= 11) {
632:        v4.d = v0;
636:        v4.m.setSystemUiVisibility(v0);
        }
639:    return;
642:    if (Build$VERSION.SDK_INT >= 16)
646:        v0 = 1285;
650:    else if (Build$VERSION.SDK_INT >= 14)
652:        v0 = 1;
654:    else if (Build$VERSION.SDK_INT >= 11)
656:        v0 = 1;
        else
724:        v0 = 0;
647:    goto 625;
658:    if (Build$VERSION.SDK_INT >= 19)
662:        v0 = 1792;
669:    else if (Build$VERSION.SDK_INT >= 16)
673:        v0 = 1280;
677:    else if (Build$VERSION.SDK_INT >= 14)
679:        v0 = 0;
681:    else if (Build$VERSION.SDK_INT >= 11)
683:        v0 = 0;
        else
722:        v0 = 0;
663:    if (v3 != 0)
665:        v4.l();
668:    goto 630;
    }

    public boolean onCreateOptionsMenu(Menu p0) {
        return 1;
    }

    protected void onDestroy() {
        this.q.v = 1;
        super.onDestroy();
    }

    public boolean onOptionsItemSelected(MenuItem p0) {
        v0 = 0;
        switch (p0.getItemId()) {
            case 16908332:
                this.q.c.finish();
                v2 = 1;
                break;
            default:
                v2 = 0;
                break;
        }
        if (v2 != 0 || super.onOptionsItemSelected(p0))
            v0 = 1;
        return v0;
    }

    protected void onPause() {
        this.q.w = 1;
        super.onPause();
    }

    public boolean onPrepareOptionsMenu(Menu p0) {
        return 1;
    }

    protected void onResume() {
        super.onResume();
        this.q.a(this.q.r, 0);
        this.q.w = 0;
        if (this.q.u != 0) {
            this.q.u = 0;
            this.q.c.b_().a(100, 0, this.q);
        }
    }

    public void onSaveInstanceState(Bundle p0) {
        super.onSaveInstanceState(p0);
        p0.putString("com.android.ex.PhotoViewFragment.INITIAL_URI", this.q.g);
        p0.putString("com.android.ex.PhotoViewFragment.CURRENT_URI", this.q.i);
        p0.putInt("com.android.ex.PhotoViewFragment.CURRENT_INDEX", this.q.h);
        p0.putBoolean("com.android.ex.PhotoViewFragment.FULLSCREEN", this.q.r);
        p0.putString("com.android.ex.PhotoViewFragment.ACTIONBARTITLE", this.q.y);
        p0.putString("com.android.ex.PhotoViewFragment.ACTIONBARSUBTITLE", this.q.z);
        p0.putBoolean("com.android.ex.PhotoViewFragment.SCALEANIMATIONFINISHED", this.q.A);
    }

}
