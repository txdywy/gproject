package com.google.android.finsky.detailspage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.view.View;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.adapters.C1174q;
import com.google.android.finsky.bg.C1611k;
import com.google.android.finsky.cv.p177a.bd;
import com.google.android.finsky.cv.p177a.bf;
import com.google.android.finsky.detailsmodules.p183a.C2600d;
import com.google.android.finsky.dfemodel.C2719i;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.frameworkviews.ae;
import com.google.android.finsky.p111d.C2473o;
import com.google.android.finsky.p111d.C2475d;
import com.google.android.finsky.p111d.C2482j;
import com.google.android.finsky.p111d.ad;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.bb;
import com.google.android.play.image.x;
import com.google.android.play.utils.C6324f;
import com.google.wireless.android.a.a.a.a.ce;
import com.google.wireless.android.a.a.a.a.cf;
import com.squareup.leakcanary.C7582R;
import java.util.Arrays;

public class dz extends ck implements ad, ed, ee {
    public int f14450d;
    public bd[] f14451e;
    public x[] f14452f;
    public bf[] f14453g;
    public Drawable[] f14454h;
    public ec f14455i;
    public ec f14456j;
    public int[] f14457k;
    public int f14458l;
    public int f14459m = 0;
    public Boolean f14460n;
    public ce f14461o;
    public C2473o f14462p;

    public final int mo2978e() {
        return 1;
    }

    public final int mo2977c(int i) {
        return C7582R.layout.screenshots_module;
    }

    public final boolean mo2979f() {
        return this.b != null && m14204d();
    }

    public final void mo2974a(boolean z, Document document, C2719i c2719i, Document document2, C2719i c2719i2) {
        if (this.b == null && m14204d() && document.ak()) {
            this.b = new eb();
            ((eb) this.b).f14466a = document;
            m14206j();
        }
    }

    public final void mo2976b(View view, int i) {
        int i2;
        int i3 = 0;
        int i4 = this.f14450d == 0 ? 1 : 0;
        if (this.f14450d == 3) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        ScreenshotsModuleLayout screenshotsModuleLayout = (ScreenshotsModuleLayout) view;
        bf[] bfVarArr = this.f14453g;
        Drawable[] drawableArr = this.f14454h;
        int[] iArr = this.f14457k;
        boolean a = m14212a(this.t);
        screenshotsModuleLayout.f14053f = this;
        screenshotsModuleLayout.f14054g = this;
        if (i4 != 0) {
            screenshotsModuleLayout.f14050c.m16127a(0, null);
        } else if (i2 != 0) {
            screenshotsModuleLayout.f14050c.m16127a(1, screenshotsModuleLayout.getContext().getString(C7582R.string.screenshots_not_loaded));
        } else {
            screenshotsModuleLayout.f14050c.mo3397a();
            if (screenshotsModuleLayout.f14052e == null) {
                i4 = (int) screenshotsModuleLayout.getContext().getResources().getDimension(C7582R.dimen.screenshots_height);
                Bitmap createBitmap = Bitmap.createBitmap((i4 * 9) / 16, i4, Config.ARGB_8888);
                createBitmap.eraseColor(screenshotsModuleLayout.getContext().getResources().getColor(C7582R.color.details_screenshot_placeholder));
                BitmapDrawable bitmapDrawable = new BitmapDrawable(screenshotsModuleLayout.getContext().getResources(), createBitmap);
                i4 = drawableArr.length;
                while (i3 < i4) {
                    if (iArr[i3] == 0) {
                        drawableArr[i3] = bitmapDrawable;
                    }
                    i3++;
                }
                screenshotsModuleLayout.f14052e = new C1174q(drawableArr.length, screenshotsModuleLayout);
                screenshotsModuleLayout.f14051d.setAppScreenshotStates(iArr);
                screenshotsModuleLayout.f14051d.setAdapter(screenshotsModuleLayout.f14052e);
                if (!a) {
                    screenshotsModuleLayout.f14051d.setLoadAllScreenshotsListener(screenshotsModuleLayout);
                }
            }
            screenshotsModuleLayout.f14052e.m7106a(drawableArr, bfVarArr);
        }
        getParentNode().mo1219a(this);
    }

    public final void mo2980h() {
        m14205i();
        if (this.f14452f != null) {
            for (x xVar : this.f14452f) {
                if (xVar != null) {
                    xVar.a();
                }
            }
        }
        this.f14450d = 2;
    }

    private static boolean m14204d() {
        return !C1473m.f7980a.dj().mo2294a(12642389);
    }

    private final void m14205i() {
        if (this.f14455i != null) {
            this.f14455i.cancel(true);
        }
        if (this.f14456j != null) {
            this.f14456j.cancel(true);
        }
        this.f14455i = null;
        this.f14456j = null;
    }

    public final void mo3037c(View view, int i) {
        ((ae) view).Z_();
    }

    private final void m14206j() {
        int i;
        this.f14450d = 0;
        this.f14451e = (bd[]) ((eb) this.b).f14466a.m14644c(1).toArray(new bd[0]);
        int length = this.f14451e.length;
        this.f14452f = new x[length];
        this.f14453g = new bf[length];
        for (i = 0; i < length; i++) {
            this.f14453g[i] = this.f14451e[i].f11859e;
        }
        this.f14454h = new Drawable[length];
        this.f14458l = 0;
        m14205i();
        this.f14459m = 0;
        Resources resources = this.t.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(C7582R.dimen.screenshots_height) / 2;
        C1473m.f7980a.av();
        i = Math.min((C1611k.m9270l(resources) / dimensionPixelSize) + 1, length);
        this.f14457k = new int[length];
        if (m14212a(this.t)) {
            Arrays.fill(this.f14457k, 0);
            this.f14450d = 1;
            return;
        }
        Arrays.fill(this.f14457k, 2);
        m14203a(new ec(this, 0, i - 1));
    }

    final boolean m14212a(Context context) {
        boolean z = false;
        if (this.f14460n == null) {
            this.f14460n = Boolean.valueOf(false);
            if (C1473m.f7980a.dj().mo2294a(12603286)) {
                int a = C6324f.m28966a(context);
                if (a == 1 || a == 2) {
                    z = true;
                }
                this.f14460n = Boolean.valueOf(z);
            }
        }
        return this.f14460n.booleanValue();
    }

    private final void m14203a(ec ecVar) {
        if (this.f14456j != null) {
            FinskyLog.m21669e("Tried to queue another LoadImageTask when another task was waiting.", new Object[0]);
            return;
        }
        this.f14456j = ecVar;
        if (this.f14455i == null) {
            m14208a();
        }
    }

    final void m14208a() {
        this.f14455i = this.f14456j;
        this.f14456j = null;
        if (this.f14455i != null) {
            int i = this.f14459m;
            ec ecVar = this.f14455i;
            this.f14459m = i + ((ecVar.f14468b - ecVar.f14467a) + 1);
            bb.m21792a(this.f14455i, new Void[0]);
        }
    }

    final void m14214b(int i) {
        int length = this.f14451e.length;
        bd bdVar = this.f14451e[i];
        if (bdVar != null) {
            int dimension;
            if (bdVar.f11863i) {
                dimension = (int) this.t.getResources().getDimension(C7582R.dimen.screenshots_height);
            } else {
                dimension = 0;
            }
            x b = this.y.mo1677b(bdVar.f11860f, 0, dimension, new ea(this, i, length));
            Bitmap b2 = b.b();
            if (b2 != null) {
                this.f14457k[i] = 2;
                this.f14450d = 1;
                this.f14454h[i] = m14207a(b2);
                this.u.mo3033a(this, false);
                return;
            }
            this.f14452f[i] = b;
        }
    }

    final TransitionDrawable m14207a(Bitmap bitmap) {
        TransitionDrawable transitionDrawable = new TransitionDrawable(new Drawable[]{new ColorDrawable(0), new BitmapDrawable(this.t.getResources(), bitmap)});
        transitionDrawable.setCrossFadeEnabled(true);
        transitionDrawable.startTransition(250);
        return transitionDrawable;
    }

    public final void mo3079d(int i) {
        int i2 = this.f14457k[i];
        if (this.f14462p == null) {
            int i3;
            if (i2 == 0) {
                i3 = 2940;
            } else {
                i3 = 2939;
            }
            this.f14462p = new C2473o(i3, this);
        }
        this.f14462p.m13202a(new cf().b(i));
        this.J.m13379b(new C2475d(this.f14462p));
        if (i2 == 0) {
            this.f14457k[i] = 1;
            this.u.mo3033a(this, false);
            m14214b(i);
            return;
        }
        this.z.mo3651a(((eb) this.b).f14466a, i);
    }

    public final void mo3077b() {
        m14206j();
        this.u.mo3033a(this, false);
    }

    public final void mo3078c() {
        if (this.f14459m < this.f14451e.length && this.f14456j == null) {
            m14203a(new ec(this, this.f14459m, this.f14451e.length - 1));
        }
    }

    public ce getPlayStoreUiElement() {
        if (this.f14461o == null) {
            this.f14461o = C2482j.m13283a(1863);
        }
        return this.f14461o;
    }

    public ad getParentNode() {
        return this.I;
    }

    public final void mo1219a(ad adVar) {
        C2482j.m13291a((ad) this, adVar);
    }

    public final /* synthetic */ void mo2973a(C2600d c2600d) {
        eb ebVar = (eb) c2600d;
        super.mo2973a(ebVar);
        if (ebVar != null) {
            m14206j();
        }
    }
}
