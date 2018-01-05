package com.google.android.finsky.activities;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.v4.a.d;
import android.support.v4.view.ai;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.StrikethroughSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup$LayoutParams;
import android.widget.ImageView$ScaleType;
import android.widget.TextView;
import com.google.android.finsky.actionbuttons.DetailsSummaryDynamic;
import com.google.android.finsky.actionbuttons.c;
import com.google.android.finsky.actionbuttons.h;
import com.google.android.finsky.aw.a;
import com.google.android.finsky.ba.c;
import com.google.android.finsky.ba.e;
import com.google.android.finsky.bg.ai;
import com.google.android.finsky.bg.h;
import com.google.android.finsky.bg.k;
import com.google.android.finsky.by.c;
import com.google.android.finsky.by.o;
import com.google.android.finsky.ck.b;
import com.google.android.finsky.cv.a.bl;
import com.google.android.finsky.cv.a.cv;
import com.google.android.finsky.cv.a.la;
import com.google.android.finsky.cv.a.lq;
import com.google.android.finsky.d.ad;
import com.google.android.finsky.d.w;
import com.google.android.finsky.detailscomponents.DocImageView;
import com.google.android.finsky.detailscomponents.a;
import com.google.android.finsky.detailscomponents.f;
import com.google.android.finsky.detailscomponents.g;
import com.google.android.finsky.dfemodel.DfeToc;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.frameworkviews.DecoratedTextView;
import com.google.android.finsky.frameworkviews.PlayActionButtonV2;
import com.google.android.finsky.layout.DetailsSummary;
import com.google.android.finsky.layout.DetailsSummaryWishlistView;
import com.google.android.finsky.m;
import com.google.android.finsky.navigationmanager.a;
import com.google.android.finsky.navigationmanager.e;
import com.google.android.finsky.p.c;
import com.google.android.finsky.pagesystem.b;
import com.google.android.finsky.playcard.ac;
import com.google.android.finsky.utils.n;
import com.google.android.play.image.FifeImageView;
import com.google.android.play.image.w;
import com.google.android.play.layout.PlayCardThumbnail;
import com.google.android.play.layout.PlayTextView;
import com.google.protobuf.nano.b;
import com.google.wireless.android.finsky.b.aa;
import com.google.wireless.android.finsky.b.z;

protected class com.google.android.finsky.activities.dc extends com.google.android.finsky.activities.cu implements com.google.android.finsky.cz.d
{

    public View[] F;
    public boolean K;
    public String U;
    public boolean V;
    public com.google.android.finsky.detailscomponents.a Z;
    public final boolean a;
    public com.google.android.finsky.aw.a aa;
    public Intent af;
    public com.google.android.finsky.actionbuttons.c m;
    public com.google.android.finsky.by.o u;
    public final boolean v;
    public com.google.android.play.image.w x;

    dc(DfeToc p0, Account p1) {
        com.google.android.finsky.activities.cu(p0, p1);
        this.v = com.google.android.finsky.m.a.dj().a(12622545);
        this.a = com.google.android.finsky.m.a.dj().a(12624692);
        this.u = com.google.android.finsky.m.a.Y();
        this.Z = com.google.android.finsky.m.a.ch();
        com.google.android.finsky.m.a.cm();
        this.aa = com.google.android.finsky.m.a.d();
        com.google.android.finsky.m.a.h();
    }

    static int a(com.google.android.finsky.cv.a.bl p0) {
 23:    if (!p0.a(com.google.wireless.android.finsky.b.aa.a)) goto 89;
 37:    if (!((com.google.wireless.android.finsky.b.z)p0.b(com.google.wireless.android.finsky.b.aa.a)).d()) goto 89;
 47:    v0 = ((com.google.wireless.android.finsky.b.z)p0.b(com.google.wireless.android.finsky.b.aa.a)).b;
 50:    if (p0.p == 1 || p0.p == 7) {
 55:        switch (v0) {
                case 1:
 66:                v0 = 2131952448;
102:                break;
                case 2:
 64:                v0 = 2131952443;
102:                break;
                case 3:
 60:                v0 = 2131952449;
102:                break;
                default:
 58:                v0 = 2131952442;
102:                break;
            }
 59:        return v0;
        }
 69:    if (p0.p == 3) goto 74;
 72:    if (p0.p != 4) goto 92;
 74:    switch (v0) {
            case 1:
 87:            v0 = 2131952446;
102:            break;
            case 2:
 85:            v0 = 2131952445;
102:            break;
            case 3:
 81:            v0 = 2131952447;
102:            break;
            default:
 77:            v0 = 2131952444;
102:            break;
        }
 89:    switch (p0.p) {
            case 1:
 96:            v0 = 2131952448;
102:            break;
            case 2:
 92:            v0 = 2131952442;
102:            break;
            case 3:
100:            v0 = 2131952446;
102:            break;
            case 4:
 98:            v0 = 2131952445;
102:            break;
            case 5:
 92:            v0 = 2131952442;
102:            break;
            case 6:
 92:            v0 = 2131952442;
102:            break;
            case 7:
 94:            v0 = 2131952443;
102:            break;
            default:
 92:            v0 = 2131952442;
102:            break;
        }
    }

    private static void b(LayoutInflater p0, ViewGroup p1, CharSequence p2) {
        v0 = (TextView)p0.inflate(2130968763, p1, 0);
        v0.setText(p2);
        p1.addView(v0);
    }

    public void a() {
        this.y = 1;
        if (this.m != 0)
            this.m.a();
        if (this.I != 0) {
            v1 = 0;
            while (v1 < this.I.getChildCount()) {
                v0 = this.I.getChildAt(v1);
                if (v0 instanceof PlayActionButtonV2)
                    ((PlayActionButtonV2)v0).a();
                v1 = v1 + 1;
            }
        }
    }

    protected void a(int p0) {
        v0 = (TextView)this.H.findViewById(2131755325);
        this.I.setVisibility(8);
        v0.setVisibility(0);
        v0.setText(this.B.getResources().getString(p0));
    }

    public final void a(int p0, Bundle p1) {
    }

    public void a(Context p0, com.google.android.finsky.navigationmanager.a p1, com.google.android.play.image.w p2, com.google.android.finsky.pagesystem.b p3, boolean p4, String p5, String p6, boolean p7, com.google.android.finsky.d.ad p8, com.google.android.finsky.d.w p9) {
        this.B = p0;
        this.z = p1;
        this.x = p2;
        this.A = p3;
        this.L = p5;
        this.U = p6;
        this.V = p7;
        this.T = p8;
        this.S = p9;
    }

    public final void a(Bitmap p0) {
        v0 = (PlayCardThumbnail)this.c(2131755632);
        if (v0 != 0)
            ((DocImageView)v0.getImageView()).setImageBitmap(p0);
    }

    protected final void a(LayoutInflater p0, ViewGroup p1, CharSequence p2) {
        v0 = (TextView)p0.inflate(2130968765, p1, 0);
        v0.setText(p2);
        v0.setTextColor(com.google.android.finsky.bg.h.a(this.B, this.D.a.f));
        p1.addView(v0);
    }

    public void a(Document p0, Document p1, boolean p2, String p3, boolean p4, Intent p5, View[] p6) {
        this.F = p6;
        this.D = p0;
        this.E = p1;
        this.O = p2;
        this.P = p3;
        this.W = p4;
        this.af = p5;
        if (com.google.android.finsky.m.a.dj().a(12633045) && (this.D.a.e == 64 || this.D.a.e == 5)) {
            if (this.D.a.e == 64 && this.ad == 0)
                this.ad = this.m();
            if (this.ae == 0)
                this.ae = this.l();
        }
        this.H = (DetailsSummaryDynamic)this.c(2131755322);
        this.I = (ViewGroup)this.c(2131755323);
        if (this.I.getChildCount() > 5)
            this.I.removeAllViews();
        this.j();
        if (this.O != 0) {
            if (this.D.a.f != 4 || this.a == 0) {
                if (this.m == 0) {
                    this.m = com.google.android.finsky.m.a.ci().a(this.A, this.A, this.z, this.B, this.L, this.T, 3, this.C, -1, 0, 0, 0, 0);
                    this.m.a(this.D, this.E, this.S, this.H, this.af);
                }
                else {
                    this.m.u = this.D;
                    if (this.m.i.dj().a(12633045) && this.m.L != 0 && this.m.J == 0 && this.m.u.a.e == 64) {
                        this.m.L.a(this.m);
                        this.m.J = 1;
                    }
                    this.m.b();
                }
            }
            this.b();
        }
        else
            this.I.setVisibility(8);
        com.google.android.finsky.bg.ai.a(this.H, 8);
    }

    public final void a(String p0) {
        if (p0.equals(this.D.a.c))
            this.i();
    }

    public final void a(String p0, int p1) {
        if (p1 == 1 && p0.equals(this.D.a.c))
            this.i();
    }

    protected void a(boolean p0) {
        this.I.setVisibility(8);
        if (this.J == 0 && p0 == 0) {
            this.m.a(this.D, this.E, this.A.bw, this.H, this.af);
            this.h();
            this.q();
        }
    }

    protected void b() {
        this.d(this.u.a(this.D, this.M, com.google.android.finsky.m.a.ah().a(this.C)));
        this.I.setVisibility(4);
        if (this.J == 0) {
            if (this.G != 0)
                this.a(2131952995);
            else
                this.a(0);
        }
    }

    protected final View c(int p0) {
  0:    v0 = 0;
  3:    if (this.F == 0)
  5:        return v0;
 10:    v2 = 0;
 11:    while (true) {
 11:        if (v2 >= this.F.length)
  5:            return v0;
 15:        if (this.F[v2] != 0)
 15:            break;
 27:        v2 = v2 + 1;
        }
 17:    v1 = this.F[v2].findViewById(p0);
 21:    if (v1 == 0) goto 25;
 23:    v0 = v1;
 24:    return v0;
    }

    public final void d(boolean p0) {
        if (p0 == 0)
            v0 = 1;
        else
            v0 = 0;
        this.J = v0;
    }

    protected boolean f() {
        return 1;
    }

    protected void h() {
    }

    public final void i() {
        if (this.y == 0)
            this.a(this.D, this.E, this.O, this.P, this.W, this.af, this.F);
    }

    protected final void j() {
  1:    v6 = 2;
  5:    v5 = 0;
 13:    v0 = (TextView)this.c(2131755365);
 15:    if (v0 != 0) {
 19:        v1 = this.B.getResources();
 29:        if (this.D.a.e == 1) {
 37:            if (this.D.bW()) {
 42:                v3 = new Object[1];
 50:                v3[0] = this.D.a.g;
 56:                v0.setText(v1.getString(2131952096, v3));
                }
445:            else if (this.D.bT()) {
450:                v3 = new Object[1];
458:                v3[0] = this.D.a.g;
464:                v0.setText(v1.getString(2131953223, v3));
                }
                else
475:                v0.setText(this.D.a.g);
            }
480:        else if (this.D.a.e == 5 || this.D.a.e == 64) {
488:            v1 = this.D.bJ();
494:            v2 = this.D.bI();
502:            if (!TextUtils.isEmpty(v1)) {
508:                if (!TextUtils.isEmpty(v2))
552:                    v0.setText((String.valueOf(v1).length() + 1 + String.valueOf(v2).length()) + v1 + "\n" + v2);
                    else
563:                    v0.setText(this.D.a.g);
                }
                else
563:                v0.setText(this.D.a.g);
            }
            else
563:            v0.setText(this.D.a.g);
        }
 72:    v0 = (ViewGroup)this.c(2131755621);
 81:    v1 = (DecoratedTextView)v0.findViewById(2131755622);
 90:    v2 = (ViewGroup)this.c(2131755519);
 99:    v3 = (PlayTextView)this.c(2131755625);
101:    if (v1 != 0) {
104:        if (this.D.a.e == 3 || this.D.a.e == 2 || this.D.a.e == 4 || this.D.a.e == 5 || this.D.a.e == 64 || this.D.a.e == 30) {
121:            v0.setVisibility(8);
124:            v2.setVisibility(8);
            }
569:        else if (this.D.a.e == 6) {
571:            v0.setVisibility(8);
578:            this.Z.a(this.D, v2);
            }
            else {
583:            v0.setVisibility(0);
592:            v1.setText(com.google.android.finsky.playcard.ac.a(this.D));
599:            this.Z.a(this.D, v1);
606:            this.Z.a(this.D, v2);
609:            if (this.D.a.e == 1 && com.google.android.finsky.m.a.dj().a(12631928)) {
632:                v0 = this.aa.a(this.B, this.D);
640:                if (!TextUtils.isEmpty(v0)) {
642:                    v3.setVisibility(0);
645:                    v3.setText(v0);
                    }
                    else
650:                    v3.setVisibility(8);
                }
                else
655:                v3.setVisibility(8);
            }
        }
138:    com.google.android.finsky.detailscomponents.a.a(this.D, (DecoratedTextView)this.c(2131755626));
141:    this.k();
151:    v0 = (DetailsSummaryWishlistView)this.c(2131755620);
153:    if (v0 != 0) {
157:        if (this.K != 0)
159:            v0.setVisibility(8);
            else
666:            v0.a(this.D, this.z, this.S);
        }
164:    v9 = this.B.getResources();
175:    v0 = (PlayCardThumbnail)this.c(2131755632);
183:    v3 = com.google.android.finsky.m.a.av().k(v9);
187:    switch (this.D.a.e) {
            case 1:
187:            goto 671;
            case 2:
187:            goto 674;
            case 3:
187:            goto 677;
            case 4:
187:            goto 674;
            case 5:
187:            goto 671;
            case 6:
187:            goto 671;
            case 16:
187:            goto 671;
            case 17:
187:            goto 671;
            case 18:
187:            goto 677;
            case 19:
187:            goto 677;
            case 20:
187:            goto 677;
            case 24:
187:            goto 674;
            case 25:
187:            goto 674;
            case 44:
187:            goto 671;
            case 64:
187:            goto 671;
            default:
        }
190:    v2 = 0;
202:    if (this.K == 0 && v2 == 0) {
206:        v0.setVisibility(8);
209:        if (v3 != 0)
211:            v0 = 0;
            else
680:            v0 = 2;
212:        v6 = v0;
        }
        else {
683:        v0.setVisibility(0);
692:        v0.a(this.D.a.f, 0);
695:        v2 = v0.getLayoutParams();
705:        v2.width = com.google.android.finsky.bg.h.e(this.B, this.D.a.e);
713:        v2.height = com.google.android.finsky.bg.h.f(this.B, this.D.a.e);
719:        v0 = (DocImageView)v0.getImageView();
723:        v0.setScaleType(ImageView$ScaleType.FIT_START);
730:        if (com.google.android.finsky.navigationmanager.e.a())
734:            android.support.v4.view.ai.a(v0, this.U);
739:        if (this.V == 0)
747:            v0.a(this.D, this.x, DocImageView.a);
752:        v0.setFocusable(this.O);
771:        v0.setContentDescription(com.google.android.finsky.bg.h.a(this.D.a.g, this.D.a.e, v9));
776:        if (this.O != 0) {
783:            v0.setOnClickListener(new com.google.android.finsky.activities.dd(this));
795:            v0.setForeground(android.support.v4.a.d.a(this.B, 2130837953));
            }
798:        if (v3 != 0)
800:            v6 = 0;
807:        else if (com.google.android.finsky.detailscomponents.f.a(this.D.a.e) && com.google.android.finsky.detailscomponents.g.c(this.D, v3) != 0)
817:            v6 = 1;
        }
213:    ((DetailsSummary)this.c(2131755468)).setThumbnailMode(v6);
218:    if (this.K != 0)
438:        return;
227:    v0 = (ViewGroup)this.c(2131755627);
229:    v0.removeAllViews();
234:    v1 = LayoutInflater.from(this.B);
244:    switch (this.D.a.e) {
            case 5:
244:            goto 921;
            case 6:
244:            goto 820;
            case 18:
244:            goto 896;
            case 64:
244:            goto 921;
            default:
        }
251:    if (v0.getChildCount() > 0)
253:        v1 = 0;
        else
940:        v1 = 8;
254:    v0.setVisibility(v1);
264:    v0 = (ViewGroup)this.c(2131755628);
266:    v0.removeAllViews();
271:    v2 = LayoutInflater.from(this.B);
279:    if (this.t_()) {
283:        v1 = this.D.t();
291:        if (!TextUtils.isEmpty(v1))
293:            this.a(v2, v0, v1);
        }
298:    v3 = com.google.android.finsky.m.a.ah();
308:    v6 = this.u.a(this.D, this.C);
312:    if (v6 == 0) {
393:        if (v6 == 0) {
409:            if (this.u.d(this.D, v3.a(this.C)))
420:                this.a(v2, v0, this.B.getString(2131952507));
964:            else if (this.D.a.f != 6 && this.f()) {
988:                v3 = com.google.android.finsky.m.a.X().c(this.D, this.M, v3.a(this.C));
992:                if (v3 == 0)
994:                    v1 = 0;
                    else {
1039:                    if (this.D.a.e == 6)
1041:                        v1 = com.google.android.finsky.activities.dc.a(v3);
1084:                    else if (this.D.a.e == 5 && v3.p == 3)
1089:                        v1 = 2131952444;
                        else
1093:                        v1 = 2131952442;
1049:                    v4 = new Object[1];
1051:                    v4[0] = v3.l;
1053:                    v4 = this.B.getString(v1, v4);
1059:                    v1 = new SpannableStringBuilder(v4);
1062:                    v4 = v4.indexOf(v3.l);
1066:                    if (v4 >= 0)
1080:                        v1.setSpan(new StrikethroughSpan(), v4, v3.l.length() + v4, 17);
                    }
999:                if (!TextUtils.isEmpty(v1) && this.u.a(this.D, this.M, com.google.android.finsky.m.a.ah().a(this.C)))
1025:                    this.a(v2, v0, v1);
                }
            }
427:        if (v0.getChildCount() <= 0)
1097:            v5 = 8;
429:        v0.setVisibility(v5);
432:        this.p();
435:        this.o();
438:        return;
        }
316:    v1 = v3.a(this.C);
328:    if (!this.u.c(this.D, v1)) {
393:        if (v6 == 0) {
409:            if (this.u.d(this.D, v3.a(this.C)))
420:                this.a(v2, v0, this.B.getString(2131952507));
964:            else if (this.D.a.f != 6 && this.f()) {
988:                v3 = com.google.android.finsky.m.a.X().c(this.D, this.M, v3.a(this.C));
992:                if (v3 == 0)
994:                    v1 = 0;
                    else {
1039:                    if (this.D.a.e == 6)
1041:                        v1 = com.google.android.finsky.activities.dc.a(v3);
1084:                    else if (this.D.a.e == 5 && v3.p == 3)
1089:                        v1 = 2131952444;
                        else
1093:                        v1 = 2131952442;
1049:                    v4 = new Object[1];
1051:                    v4[0] = v3.l;
1053:                    v4 = this.B.getString(v1, v4);
1059:                    v1 = new SpannableStringBuilder(v4);
1062:                    v4 = v4.indexOf(v3.l);
1066:                    if (v4 >= 0)
1080:                        v1.setSpan(new StrikethroughSpan(), v4, v3.l.length() + v4, 17);
                    }
999:                if (!TextUtils.isEmpty(v1) && this.u.a(this.D, this.M, com.google.android.finsky.m.a.ah().a(this.C)))
1025:                    this.a(v2, v0, v1);
                }
            }
427:        if (v0.getChildCount() <= 0)
1097:            v5 = 8;
429:        v0.setVisibility(v5);
432:        this.p();
435:        this.o();
438:        return;
        }
340:    v8 = this.D.e(this.u.b(this.D, v1));
344:    if (v8 == 0) goto 946;
350:    if (v8.f() && v8.x > System.currentTimeMillis())
362:        v1 = 0;
        else
943:        v1 = 1;
363:    if (v1 == 0) goto 946;
372:    v11 = new Object[1];
384:    v11[0] = com.google.android.finsky.m.a.bb().b(v8.y);
386:    v1 = this.B.getString(2131952717, v11);
390:    this.a(v2, v0, v1);
393:    if (v6 == 0) {
409:        if (this.u.d(this.D, v3.a(this.C)))
420:            this.a(v2, v0, this.B.getString(2131952507));
964:        else if (this.D.a.f != 6 && this.f()) {
988:            v3 = com.google.android.finsky.m.a.X().c(this.D, this.M, v3.a(this.C));
992:            if (v3 == 0)
994:                v1 = 0;
                else {
1039:                if (this.D.a.e == 6)
1041:                    v1 = com.google.android.finsky.activities.dc.a(v3);
1084:                else if (this.D.a.e == 5 && v3.p == 3)
1089:                    v1 = 2131952444;
                    else
1093:                    v1 = 2131952442;
1049:                v4 = new Object[1];
1051:                v4[0] = v3.l;
1053:                v4 = this.B.getString(v1, v4);
1059:                v1 = new SpannableStringBuilder(v4);
1062:                v4 = v4.indexOf(v3.l);
1066:                if (v4 >= 0)
1080:                    v1.setSpan(new StrikethroughSpan(), v4, v3.l.length() + v4, 17);
                }
999:            if (!TextUtils.isEmpty(v1) && this.u.a(this.D, this.M, com.google.android.finsky.m.a.ah().a(this.C)))
1025:                this.a(v2, v0, v1);
            }
        }
427:    if (v0.getChildCount() <= 0)
1097:        v5 = 8;
429:    v0.setVisibility(v5);
432:    this.p();
435:    this.o();
438:    return;
671:    v2 = 1;
672:    goto 191;
674:    v2 = v3;
675:    goto 191;
677:    v2 = 0;
678:    goto 191;
822:    v2 = this.D.S();
832:    if (!this.D.ab() && !TextUtils.isEmpty(v2.d))
844:        com.google.android.finsky.activities.dc.b(v1, v0, v2.d);
853:    if (this.D.ar() == 0) {
861:        if (!TextUtils.isEmpty(v2.e))
865:            com.google.android.finsky.activities.dc.b(v1, v0, v2.e);
            else
892:            com.google.android.finsky.activities.dc.b(v1, v0, this.B.getString(2131952624));
        }
874:    if (!TextUtils.isEmpty(v2.c))
878:        com.google.android.finsky.activities.dc.b(v1, v0, v2.c);
881:    goto 247;
898:    if (this.v != 0) {
902:        v2 = this.D.U();
906:        if (v2 != 0 && v2.bK_())
916:            com.google.android.finsky.activities.dc.b(v1, v0, v2.h);
        }
919:    goto 247;
927:    if (this.D.bE())
935:        com.google.android.finsky.activities.dc.b(v1, v0, this.D.bF());
938:    goto 247;
951:    v1 = this.B.getString(2131952718);
955:    goto 390;
    }

    public final void n() {
        v0 = (PlayCardThumbnail)this.c(2131755632);
        if (v0 != 0)
            ((DocImageView)v0.getImageView()).a(this.D, this.x, DocImageView.a);
        this.V = 0;
    }

    protected final void q() {
        com.google.android.finsky.bg.ai.a(this.I, 4);
    }

    public final void r() {
        this.K = 1;
    }

    protected boolean t_() {
        if (this.u.a(this.D, this.C) == 0)
            v0 = 1;
        else
            v0 = 0;
        return v0;
    }

}
