package com.google.android.finsky.activities.inlineappinstaller;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.ab;
import android.support.v4.app.aw;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import com.google.android.finsky.activities.inlineappinstaller.a.a;
import com.google.android.finsky.activities.inlineappinstaller.a.b;
import com.google.android.finsky.activities.inlineappinstaller.a.c;
import com.google.android.finsky.activities.inlineappinstaller.a.d;
import com.google.android.finsky.activities.inlineappinstaller.a.e;
import com.google.android.finsky.api.c;
import com.google.android.finsky.billing.common.s;
import com.google.android.finsky.billing.lightpurchase.ar;
import com.google.android.finsky.billing.lightpurchase.d.a;
import com.google.android.finsky.billing.lightpurchase.d.d;
import com.google.android.finsky.billing.lightpurchase.d.f;
import com.google.android.finsky.by.c;
import com.google.android.finsky.by.o;
import com.google.android.finsky.cv.a.cv;
import com.google.android.finsky.d.a;
import com.google.android.finsky.d.ad;
import com.google.android.finsky.d.p;
import com.google.android.finsky.d.w;
import com.google.android.finsky.m;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.ParcelableProto;
import com.google.wireless.android.finsky.dfe.nano.p;

public final class com.google.android.finsky.activities.inlineappinstaller.a extends com.google.android.finsky.billing.lightpurchase.d.a implements com.google.android.finsky.billing.common.t
{

    public com.google.android.finsky.activities.inlineappinstaller.c a;
    public int b;
    public int c;
    public com.google.android.finsky.cv.a.cv d;
    public com.google.wireless.android.finsky.dfe.nano.p e;
    public boolean f;

    a() {
        com.google.android.finsky.billing.lightpurchase.d.a();
        this.b = -1;
    }

    public static com.google.android.finsky.activities.inlineappinstaller.a a(Account p0, com.google.android.finsky.cv.a.cv p1, com.google.wireless.android.finsky.dfe.nano.p p2) {
        v0 = new Bundle();
        v0.putParcelable("MultiStepFragment.account", p0);
        v0.putParcelable("mediaDoc", ParcelableProto.a(p1));
        if (p2 != 0)
            v0.putParcelable("successInfo", ParcelableProto.a(p2));
        v1 = new com.google.android.finsky.activities.inlineappinstaller.a();
        v1.f(v0);
        return v1;
    }

    protected final int W() {
        return this.d.f;
    }

    public final void X() {
        if (this.aI.a.az != 0 && this.aI.a.az != 0) {
            this.aI.a.az = 0;
            if (this.aI.a.aA != 0)
                this.aI.a.b(this.aI.a.aF);
            else
                this.aI.a.aF.setVisibility(4);
        }
        if (this.aI.a.ay == 0) {
            if (this.aI.a.ax != 0) {
                v2 = AnimationUtils.loadAnimation(this.aI.a.h(), 2131034155);
                v2.setAnimationListener(new com.google.android.finsky.billing.lightpurchase.d.d(this.aI.a));
                this.aI.a.aD.startAnimation(v2);
                this.aI.a.aE.setVisibility(0);
                this.aI.a.aE.startAnimation(AnimationUtils.loadAnimation(this.aI.a.h(), 2131034152));
            }
            else {
                this.aI.a.aD.setVisibility(4);
                this.aI.a.aE.setVisibility(0);
                this.aI.a.aE.startAnimation(AnimationUtils.loadAnimation(this.aI.a.h(), 2131034135));
            }
            this.aI.a.ay = 1;
            this.aI.a.aJ.a(new com.google.android.finsky.d.p().a(213).b((com.google.android.finsky.d.ad)this.aI.a.h()));
        }
        v0 = this.a.g.b();
        if (!com.google.android.finsky.m.a.Y().a(this.a.c, com.google.android.finsky.m.a.ah().a(v0)))
            com.google.android.finsky.billing.lightpurchase.ar.a(v0, this.a.c, new com.google.android.finsky.activities.inlineappinstaller.d(this.a, com.google.android.finsky.m.a), 0, 1, this.a.a.a(v0));
        else
            this.a.a(v0, this.a.c);
    }

    public final void a(Context p0) {
        super.a(p0);
        if (!(p0 instanceof com.google.android.finsky.d.ad))
            throw new IllegalStateException("Activity must implement PlayStoreUiElementNode");
    }

    public final void a(com.google.android.finsky.billing.common.s p0) {
  6:    v1 = new Object[2];
 14:    v1[0] = Integer.valueOf(p0.l);
 20:    v1[1] = Integer.valueOf(p0.ag);
 24:    if (p0.ag != this.b) goto 42;
 28:    v1 = new Object[1];
 36:    v1[0] = Integer.valueOf(this.b);
 38:    FinskyLog.b("Already handled state %d", v1);
 41:    return;
 42:    this.b = p0.ag;
 48:    switch (this.a.l) {
            case 0:
 48:            goto 95;
            case 1:
 48:            goto 51;
            case 2:
 48:            goto 51;
            case 3:
 48:            goto 51;
            case 4:
 48:            goto 51;
            case 5:
 48:            goto 259;
            case 6:
 48:            goto 301;
            case 7:
 48:            goto 328;
            case 8:
 48:            goto 355;
            default:
        }
 66:    v0 = new Bundle();
 71:    v0.putString("errorMsg", this.a.d);
 74:    if (this.a.c != 0)
 78:        v0.putParcelable("appDoc", this.a.c);
 81:    v2 = new com.google.android.finsky.activities.inlineappinstaller.a.b();
 82:    v1 = v0;
 83:    v0 = this;
 84:    v2.f(v1);
 87:    v0.a(v2);
 92:    this.c = p0.l;
 94:    goto 41;
101:    if (this.aI.a.az != 0 && this.aI.a.az != 0) {
109:        this.aI.a.az = 0;
113:        if (this.aI.a.aA != 0)
117:            this.aI.a.b(this.aI.a.aF);
            else
220:            this.aI.a.aF.setVisibility(4);
        }
124:    if (this.aI.a.ay == 0) {
130:        if (this.aI.a.ax != 0) {
141:            v2 = AnimationUtils.loadAnimation(this.aI.a.h(), 2131034155);
150:            v2.setAnimationListener(new com.google.android.finsky.billing.lightpurchase.d.d(this.aI.a));
155:            this.aI.a.aD.startAnimation(v2);
162:            this.aI.a.aE.setVisibility(0);
182:            this.aI.a.aE.startAnimation(AnimationUtils.loadAnimation(this.aI.a.h(), 2131034152));
            }
            else {
228:            this.aI.a.aD.setVisibility(4);
235:            this.aI.a.aE.setVisibility(0);
255:            this.aI.a.aE.startAnimation(AnimationUtils.loadAnimation(this.aI.a.h(), 2131034135));
            }
187:        this.aI.a.ay = 1;
214:        this.aI.a.aJ.a(new com.google.android.finsky.d.p().a(213).b((com.google.android.finsky.d.ad)this.aI.a.h()));
        }
217:    goto 90;
265:    v2 = new com.google.android.finsky.activities.inlineappinstaller.a.e();
270:    v3 = new Bundle();
279:    v3.putParcelable("mediaDoc", ParcelableProto.a(this.d));
282:    if (this.e != 0)
290:        v3.putParcelable("installStep", ParcelableProto.a(this.e));
293:    v2.f(v3);
296:    this.a(v2);
299:    goto 90;
307:    v1 = new com.google.android.finsky.activities.inlineappinstaller.a.c();
312:    v2 = new Bundle();
317:    v2.putParcelable("appDoc", this.a.c);
320:    v1.f(v2);
323:    this.a(v1);
326:    goto 90;
334:    v1 = new com.google.android.finsky.activities.inlineappinstaller.a.a();
339:    v2 = new Bundle();
344:    v2.putParcelable("appDoc", this.a.c);
347:    v1.f(v2);
350:    this.a(v1);
353:    goto 90;
370:    v0 = new Bundle();
375:    v0.putParcelable("InlineConsumptionAppInstallerReadyToReadStep.appDoc", this.a.c);
380:    v0.putInt("InlineConsumptionAppInstallerReadyToReadStep.mediaDocType", this.d.e);
383:    v2 = new com.google.android.finsky.activities.inlineappinstaller.a.d();
384:    v1 = v0;
385:    v0 = this;
386:    goto 84;
    }

    public final void a(boolean p0) {
        ((com.google.android.finsky.activities.inlineappinstaller.b)this.h()).b(p0);
    }

    public final void b(Bundle p0) {
        super.b(p0);
        if (p0 != 0) {
            this.a = (com.google.android.finsky.activities.inlineappinstaller.c)this.B.a("InlineConsumptionAppInstallerFragment.sidecar");
            this.b = p0.getInt("InlineConsumptionAppInstallerFragment.handledStateInstance");
            this.c = p0.getInt("InlineConsumptionAppInstallerFragment.previousState");
        }
        this.d = (com.google.android.finsky.cv.a.cv)ParcelableProto.a(this.q, "mediaDoc");
        this.e = (com.google.wireless.android.finsky.dfe.nano.p)ParcelableProto.a(this.q, "successInfo");
    }

    public final void e(Bundle p0) {
        super.e(p0);
        p0.putInt("InlineConsumptionAppInstallerFragment.handledStateInstance", this.b);
        p0.putInt("InlineConsumptionAppInstallerFragment.previousState", this.c);
    }

    public final void g_() {
        super.g_();
        if (this.a == 0) {
            v2 = new Bundle();
            v2.putString("authAccount", this.aw.name);
            v2.putParcelable("InlineConsumptionAppInstallerSidecar.mediaDoc", ParcelableProto.a(this.d));
            v0 = new com.google.android.finsky.activities.inlineappinstaller.c();
            v0.f(v2);
            this.a = v0;
            this.B.a().a(this.a, "InlineConsumptionAppInstallerFragment.sidecar").c();
        }
        this.a.a(this);
    }

    public final void h_() {
        if (this.a != 0)
            this.a.a(0);
        super.h_();
    }

}
