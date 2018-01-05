package com.google.android.finsky.activities;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.a.d;
import android.support.v4.app.Fragment;
import android.support.v4.app.u;
import android.support.v4.view.ai;
import android.support.v4.view.at;
import android.text.Html;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.View$OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup$LayoutParams;
import android.widget.ImageView;
import android.widget.ImageView$ScaleType;
import android.widget.TextView;
import com.google.android.finsky.api.c;
import com.google.android.finsky.api.l;
import com.google.android.finsky.b.f;
import com.google.android.finsky.ba.e;
import com.google.android.finsky.bg.aa;
import com.google.android.finsky.bg.g;
import com.google.android.finsky.bg.h;
import com.google.android.finsky.bg.p;
import com.google.android.finsky.billing.common.v;
import com.google.android.finsky.bn.b;
import com.google.android.finsky.bn.c;
import com.google.android.finsky.by.c;
import com.google.android.finsky.by.o;
import com.google.android.finsky.ck.a;
import com.google.android.finsky.ct.a;
import com.google.android.finsky.cv.a.bl;
import com.google.android.finsky.cv.a.cv;
import com.google.android.finsky.cv.a.n;
import com.google.android.finsky.d.ad;
import com.google.android.finsky.d.j;
import com.google.android.finsky.d.o;
import com.google.android.finsky.d.t;
import com.google.android.finsky.d.w;
import com.google.android.finsky.detailscomponents.DocImageView;
import com.google.android.finsky.detailscomponents.ScreenshotsRecyclerView;
import com.google.android.finsky.detailscomponents.a;
import com.google.android.finsky.detailscomponents.w;
import com.google.android.finsky.dfemodel.DfeToc;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.dfemodel.i;
import com.google.android.finsky.dfemodel.k;
import com.google.android.finsky.f.a;
import com.google.android.finsky.f.b;
import com.google.android.finsky.frameworkviews.DecoratedTextView;
import com.google.android.finsky.frameworkviews.HorizontalSeparatorContainer;
import com.google.android.finsky.frameworkviews.PlayActionButtonV2;
import com.google.android.finsky.inlinedetails.b;
import com.google.android.finsky.installqueue.f;
import com.google.android.finsky.installqueue.g;
import com.google.android.finsky.l.a;
import com.google.android.finsky.layout.DetailsSummaryWishlistView;
import com.google.android.finsky.layout.ScreenshotGallery;
import com.google.android.finsky.layout.WarningMessageSection;
import com.google.android.finsky.layout.a;
import com.google.android.finsky.layoutswitcher.e;
import com.google.android.finsky.m;
import com.google.android.finsky.navigationmanager.a;
import com.google.android.finsky.pagesystem.ContentFrame;
import com.google.android.finsky.pagesystem.b;
import com.google.android.finsky.playcard.ac;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.z.e;
import com.google.android.play.image.FifeImageView;
import com.google.android.play.layout.PlayCardThumbnail;
import com.google.android.play.layout.StarRatingBar;
import com.google.wireless.android.a.a.a.a.ce;
import java.text.NumberFormat;
import java.util.List;

final class com.google.android.finsky.activities.dx extends com.google.android.finsky.pagesystem.b implements com.google.android.finsky.d.ah
{

    public Document a;
    public long af;
    public com.google.wireless.android.a.a.a.a.ce ag;
    public com.google.android.finsky.d.o ah;
    public boolean ai;
    public com.google.android.finsky.bg.p aj;
    public boolean ak;
    public boolean al;
    public com.google.android.finsky.by.o am;
    public boolean an;
    public boolean ao;
    public com.google.android.finsky.ct.a ap;
    public com.google.android.finsky.b.f aq;
    public boolean ar;
    public boolean as;
    public com.google.android.finsky.z.e at;
    public com.google.android.finsky.by.c c;
    public boolean f;
    public String g;
    public String h;
    public final Handler i;
    public DfeToc k_;
    public com.google.android.finsky.dfemodel.i l_;
    public String m_;

    dx() {
        com.google.android.finsky.pagesystem.b();
        this.f = 0;
        this.i = new Handler(Looper.getMainLooper());
        this.af = com.google.android.finsky.d.j.j();
        this.ag = com.google.android.finsky.d.j.a(5400);
        this.ah = 0;
        this.ai = 0;
    }

    private final View$OnClickListener a(Account p0, Document p1, int p2) {
        return new com.google.android.finsky.activities.ec(this, this.bp.a(p0, p1, 1, 0, this.h, p2, this, this.bw), p1);
    }

    static void a(Document p0) {
        v0 = com.google.android.finsky.m.a.I().b;
        v0.d(p0.N().k, v0.a(p0.N().k).m | 67108864);
    }

    private final boolean aj() {
        if (this.l_ != 0 && this.l_.a())
            v0 = 1;
        else
            v0 = 0;
        return v0;
    }

    private final void ao() {
        if (this.at != 0) {
            this.at.cancel(1);
            this.at = 0;
        }
    }

    protected final boolean X() {
        return 1;
    }

    protected final int Y() {
        if (this.an != 0)
            v0 = 2130968989;
        else
            v0 = super.Y();
        return v0;
    }

    protected final int Z() {
        if (this.an != 0)
            v0 = 2130968995;
        else if (this.al != 0)
            v0 = 2130968988;
        else
            v0 = 2130968987;
        return v0;
    }

    protected final com.google.android.finsky.layoutswitcher.e a(ContentFrame p0) {
        if (this.an != 0)
            v0 = new com.google.android.finsky.inlinedetails.b(p0, this);
        else
            v0 = super.a(p0);
        return v0;
    }

    public final void a(com.google.android.finsky.d.ad p0) {
        com.google.android.finsky.d.j.a(this.i, this.af, this, p0, this.bw);
    }

    protected final void a(CharSequence p0) {
        FinskyLog.d(p0.toString(), new Object[0]);
        this.bp.a(com.google.android.finsky.api.l.a(this.q.getString("docid")), 0, this.h, this.bu, 0, 1, this.bw);
    }

    protected final void aa() {
        this.k(1718);
        if (this.l_ != 0) {
            this.l_.b(this);
            this.l_.b(this);
        }
        this.l_ = new com.google.android.finsky.dfemodel.i(com.google.android.finsky.m.a.ap(), this.g);
        this.l_.a(this);
        this.l_.a(this);
    }

    public final void b(Bundle p0) {
        v0 = 0;
        super.b(p0);
        this.am = com.google.android.finsky.m.a.Y();
        com.google.android.finsky.m.a.h();
        com.google.android.finsky.m.a.cB();
        this.ak = this.q.getBoolean("InlineAppDetailsFragment.allow_latency_logging", 0);
        if (this.ak != 0) {
            v1 = this.q.getInt("InlineAppDetailsFragment.page_type", 0);
            if (v1 == 0)
                FinskyLog.e("Page type not specified!", new Object[0]);
            this.i(v1);
        }
        v1 = com.google.android.finsky.m.a.dj();
        this.ao = v1.a(12640662);
        this.an = v1.a(12631898);
        if (this.an != 0 || v1.a(12630292))
            v0 = 1;
        this.al = v0;
        this.as = com.google.android.finsky.m.a.dj().a(12641050);
    }

    protected final void cg_() {
  4:    if (!this.aj())
 12:        return;
 10:    if (this.f == 0)
 12:        return;
 23:    this.a = this.l_.b();
 34:    if (this.a.a.f != 3) {
 39:        v3 = new Object[1];
 50:        v3[0] = this.a.a.c;
 52:        FinskyLog.d("Only apps are supported: %s", v3);
 59:        this.h().finish();
 62:        return;
        }
 67:    if (this.a == 0)
 12:        return;
 86:    if (this.aj == 0 && com.google.android.finsky.m.a.aP().b() && this.ak != 0)
115:        this.aj = new com.google.android.finsky.activities.eb(this, (HorizontalSeparatorContainer)this.R.findViewById(2131756059));
128:    v2 = (TextView)this.R.findViewById(2131755365);
130:    if (v2 != 0) {
136:        v2.setText(this.a.a.g);
140:        v2.setSelected(1);
        }
150:    v2 = (ViewGroup)this.R.findViewById(2131755621);
159:    v3 = (DecoratedTextView)v2.findViewById(2131755622);
161:    if (v3 != 0) {
164:        v2.setVisibility(0);
171:        v3.setText(com.google.android.finsky.playcard.ac.a(this.a));
180:        com.google.android.finsky.m.a.ch().a(this.a, v3);
        }
190:    v2 = (ViewGroup)this.R.findViewById(2131755519);
192:    if (v2 != 0) {
195:        v2.setVisibility(0);
208:        com.google.android.finsky.m.a.ch().a(this.a, v2);
        }
218:    v2 = (DetailsSummaryWishlistView)this.R.findViewById(2131755620);
220:    if (v2 != 0)
230:        v2.a(this.a, this.bp, this.bw);
237:    v3 = this.bn.getResources();
248:    v2 = (PlayCardThumbnail)this.R.findViewById(2131755632);
251:    v2.setVisibility(0);
256:    v2.a(-1, 0);
259:    v4 = v2.getLayoutParams();
266:    v7 = v3.getDimensionPixelSize(2131624630);
270:    v4.width = v7;
272:    v4.height = v7;
278:    v2 = (DocImageView)v2.getImageView();
282:    v2.setScaleType(ImageView$ScaleType.FIT_START);
291:    v2.a(this.a, this.bD, DocImageView.a);
295:    v2.setFocusable(0);
310:    v2.setContentDescription(com.google.android.finsky.bg.h.a(this.a.a.g, this.a.a.e, v3));
328:    v2 = (StarRatingBar)this.R.findViewById(2131756077);
330:    if (v2 != 0 && this.a.I())
346:        v2.setRating(com.google.android.finsky.bg.aa.a(this.a.J()));
356:    v2 = (TextView)this.R.findViewById(2131755895);
358:    if (v2 != 0 && this.a.I()) {
370:        v4 = (float)this.a.K();
380:        v2.setText(NumberFormat.getIntegerInstance().format((double)v4));
388:        v9 = new Object[1];
396:        v9[0] = Integer.valueOf((int)v4);
402:        v2.setContentDescription(this.bn.getResources().getQuantityString(2131886082, (int)v4, v9));
        }
405:    v3 = this.a.N();
409:    if (v3 != 0) {
415:        if (v3.d() && !TextUtils.isEmpty(v3.x)) {
432:            v2 = (TextView)this.R.findViewById(2131756065);
436:            v2.setText(v3.x);
440:            v2.setVisibility(0);
            }
445:        if (v3.t != 0) {
454:            v2 = (TextView)this.R.findViewById(2131756066);
459:            v2.setText(2131952286);
463:            v2.setVisibility(0);
            }
        }
468:    v4 = com.google.android.finsky.m.a.dn();
476:    v7 = this.bo.b();
498:    if (!this.am.a(this.a, v4, com.google.android.finsky.m.a.ah().a(v7))) goto 625;
507:    v2 = (PlayActionButtonV2)this.R.findViewById(2131755597);
516:    v3 = (PlayActionButtonV2)this.R.findViewById(2131755593);
520:    v3.setVisibility(8);
525:    v2.setVisibility(8);
530:    v8 = com.google.android.finsky.m.a.ah();
546:    v9 = com.google.android.finsky.m.a.bt().a(this.a.N().k);
561:    if (!this.q.getBoolean("InlineAppDetailsFragment.allow_update", 0)) goto 1118;
565:    if (v9.h == 0) goto 1118;
575:    if (!v9.b(this.a)) {
581:        if (v9.a(this.a) && this.am.a(this.a, v4, v8.a(v7)) && !this.a.ah()) {
604:            v2.setVisibility(0);
622:            v2.a(this.a.a.f, 2131953338, this.a(v7, this.a, 217));
            }
1120:        else if (v9.s != 0 && v9.t == 0) {
1127:            v3.setVisibility(0);
1155:            v3.a(this.a.a.f, 2131952690, this.bp.a(this.a, v7, this, this.bw));
            }
1162:        else if (v9.h == 0 && this.am.a(this.a, v4, v8)) {
1183:            v2.setVisibility(0);
1190:            this.aq.a(v2);
1193:            if (this.am.a(this.a, v7) != 0)
1196:                v4 = 1;
                else
1230:                v4 = 0;
1197:            if (v4 != 0)
1199:                v3 = 221;
1236:            else if (!this.a.ah()) {
1243:                if (this.a.a.f == 3)
1245:                    v3 = 221;
1253:                else if (this.a.a.f == 1)
1255:                    v3 = 225;
                    else
1258:                    v3 = 200;
                }
                else
1258:                v3 = 200;
1205:            if (v4 != 0)
1214:                v4 = this.bn.getString(2131952292);
1265:            else if (!this.a.ah()) {
1272:                if (this.a.a.f == 3)
1281:                    v4 = this.h().getString(2131952292);
1291:                else if (this.a.a.f == 1)
1300:                    v4 = this.bn.getString(2131952690);
                    else {
1306:                    v4 = this.a.e(1);
1310:                    if (v4 != 0 && v4.aL_())
1318:                        v4 = v4.g;
                        else
1321:                        v4 = "";
                    }
                }
                else {
1306:                v4 = this.a.e(1);
1310:                if (v4 != 0 && v4.aL_())
1318:                    v4 = v4.g;
                    else
1321:                    v4 = "";
                }
1224:            v2.a(this.a.a.f, v4, this.a(v7, this.a, v3));
            }
        }
632:    v2 = (TextView)this.R.findViewById(2131756060);
634:    if (v2 != 0) {
642:        v3 = this.a.a.l;
648:        if (TextUtils.isEmpty(v3))
654:            v3 = this.a.A();
658:        v2.setText(v3);
        }
665:    if (this.al != 0) {
674:        v2 = (ScreenshotsRecyclerView)this.R.findViewById(2131756061);
694:        v2.a(com.google.android.finsky.detailscomponents.w.a(this.a, 1), new com.google.android.finsky.activities.dz(this), this);
701:        if (this.ao != 0) {
703:            v3 = this.i();
718:            v2.getLayoutParams().height = v3.getDimensionPixelSize(2131624635);
731:            this.bt.setMinimumWidth(v3.getDimensionPixelSize(2131624628));
            }
        }
        else {
1331:        v2 = (ScreenshotGallery)this.R.findViewById(2131756061);
1333:        if (v2 != 0) {
1353:            v2.g.a(0, this.bn.getResources().getDimensionPixelOffset(2131625351));
1369:            v2.setVisibility(0);
1372:            v2.c = this.bD;
1374:            v2.b = this.bp;
1376:            v2.d = this.a;
1379:            v2.e = 1;
1381:            v2.a();
            }
        }
740:    v10 = new com.google.android.finsky.d.o(5402, this);
750:    v2 = (TextView)this.R.findViewById(2131756063);
752:    if (v2 != 0) {
767:        v2.setText(this.c(2131952501).toUpperCase());
777:        v2.setOnClickListener(new com.google.android.finsky.activities.ea(this, v10));
        }
787:    v3 = (WarningMessageSection)this.R.findViewById(2131755649);
789:    if (v3 == 0) {
1037:        com.google.android.finsky.d.j.c(this);
1052:        com.google.android.finsky.d.j.a(this.ag, this.l_.d());
1059:        if (this.ah == 0)
1072:            this.ah = new com.google.android.finsky.d.o(209, this);
1086:        this.ah.a(this.a.a.D);
1093:        if (this.ai == 0) {
1101:            this.a(this.ah);
1104:            if (v2 != 0)
1108:                this.a(v10);
1114:            this.ai = 1;
            }
1116:        return;
        }
807:    v13 = this.bo.b();
811:    v14 = this.c.a(v13);
821:    v15 = com.google.android.finsky.m.a.Y().a(this.a, this.k_, v14);
835:    if (com.google.android.finsky.m.a.ab().a(this.a, v14) && this.a.E())
844:        v5 = 1;
        else
1387:        v5 = 0;
845:    v16 = this.a.al();
854:    if (this.a.a.e != 1) goto 1398;
861:    v4 = 0;
862:    if (v4 >= this.a.a.n.length) goto 1398;
870:    if (this.a.a.n[v4].r == 0) goto 1394;
880:    if (this.a.a.n[v4].e > 0) goto 886;
884:    if (this.a.a.n[v4].o == 0) goto 1394;
896:    if (!com.google.android.finsky.m.a.Y().a(this.a, v14))
899:        v6 = 1;
        else
1391:        v6 = 0;
910:    if (com.google.android.finsky.m.a.Y().a(this.a, v14) && this.a.a.e == 1 && com.google.android.finsky.m.a.bt().a(this.a.N().k).c())
942:        v7 = 1;
        else
1403:        v7 = 0;
947:    if (this.a.N() != 0 && this.a.N().v != 0)
958:        v8 = 1;
        else
1407:        v8 = 0;
961:    v17 = com.google.android.finsky.m.a.Y();
973:    if (this.a.a.e == 1) goto 1487;
981:    if (v17.a(this.a, v14)) goto 1487;
985:    v4 = v17.a(this.a);
989:    v14 = v3.getContext();
993:    if (v4 == 0) goto 1410;
999:    v12 = new Object[1];
1004:    v12[0] = v4.name;
1010:    v4 = Html.fromHtml(v14.getString(2131952716, v12));
1014:    if (v15 != 0 && v6 == 0 && v16 == 0 && v5 == 0 && v8 == 0 && TextUtils.isEmpty(v4) && v7 == 0)
1034:        v3.setVisibility(8);
        else {
1491:        v3.setVisibility(0);
1498:        v3.b.setVisibility(8);
1501:        v9 = v3.getContext();
1509:        if (v15 == 0) {
1523:            v3.a.setText(com.google.android.finsky.m.a.ax().a(this.a));
1535:            v3.c.setImageDrawable(com.google.android.finsky.bg.h.a(v9, 2130837831, this.a.a.f));
            }
1617:        else if (v6 != 0) {
1624:            v3.a.setText(2131952115);
1632:            v3.c.setImageResource(2130837707);
            }
1636:        else if (v8 != 0) {
1643:            v3.a.setText(2131952116);
1655:            v3.c.setImageDrawable(com.google.android.finsky.bg.h.a(v9, 2130837831, this.a.a.f));
            }
1659:        else if (v16 != 0) {
1667:            v3.a.setText(this.a.am());
1676:            v3.a.setMovementMethod(LinkMovementMethod.getInstance());
1688:            v3.c.setImageDrawable(com.google.android.finsky.bg.h.a(v9, 2130837831, this.a.a.f));
            }
1693:        else if (v5 != 0) {
1701:            v3.a.setText(this.a.F());
1710:            v3.c.setImageDrawable(com.google.android.finsky.bg.h.h(v9, this.a.a.f));
            }
1719:        else if (!TextUtils.isEmpty(v4)) {
1723:            v3.a.setText(v4);
1735:            v3.c.setImageDrawable(com.google.android.finsky.bg.h.a(v9, 2130837831, this.a.a.f));
            }
1740:        else if (v7 != 0) {
1747:            v3.a.setText(2131953295);
1759:            v3.c.setImageDrawable(com.google.android.finsky.bg.h.a(v9, 2130837831, this.a.a.f));
            }
1538:        v4 = com.google.android.finsky.bg.h.c(v9, this.a.a.f);
1544:        v3.a.setTextColor(v4);
1549:        v3.b.setTextColor(v4);
1586:        v12 = new Drawable[2];
1594:        v12[0] = new ColorDrawable(com.google.android.finsky.bg.g.a(com.google.android.finsky.bg.h.a(v9, this.a.a.f), 1041865114));
1604:        v12[1] = android.support.v4.a.d.a(v9, 2130837953);
1609:        v3.setBackgroundDrawable(new LayerDrawable(v12));
1612:        android.support.v4.view.ai.a(v3, android.support.v4.view.ai.a.l(v3), v3.getPaddingTop(), android.support.v4.view.ai.a.m(v3), v3.getPaddingBottom());
        }
1037:    com.google.android.finsky.d.j.c(this);
1052:    com.google.android.finsky.d.j.a(this.ag, this.l_.d());
1059:    if (this.ah == 0)
1072:        this.ah = new com.google.android.finsky.d.o(209, this);
1086:    this.ah.a(this.a.a.D);
1093:    if (this.ai == 0) {
1101:        this.a(this.ah);
1104:        if (v2 != 0)
1108:            this.a(v10);
1114:        this.ai = 1;
        }
1116:    return;
1394:    v4 = v4 + 1;
1396:    goto 862;
1399:    v6 = 0;
1400:    goto 900;
1418:    if (this.a.a.f != 6) goto 1487;
1424:    if (!this.a.bj()) goto 1487;
1428:    v12 = v17.b(this.a, this.k_, this.c);
1438:    if (v17.a(v12, v13) != 0) goto 1487;
1441:    v9 = 0;
1446:    if (v9 >= v12.size()) goto 1487;
1456:    v4 = v17.a((Document)v12.get(v9));
1460:    if (v4 == 0) goto 1483;
1466:    v12 = new Object[1];
1471:    v12[0] = v4.name;
1477:    v4 = Html.fromHtml(v14.getString(2131952716, v12));
1481:    goto 1014;
1485:    v9 = v9 + 1;
1486:    goto 1442;
1487:    v4 = 0;
1488:    goto 1014;
    }

    public final void d(Bundle p0) {
        super.d(p0);
        this.ap = com.google.android.finsky.m.a.H();
        this.aq = com.google.android.finsky.m.a.G();
        this.ap.a(this.h(), 0);
        this.c = com.google.android.finsky.m.a.ah();
        this.k_ = com.google.android.finsky.m.a.dn();
        if (p0 != 0) {
            this.m_ = p0.getString("referrer");
            this.g = p0.getString("inline_details_url");
            this.h = p0.getString("continue_url");
        }
        this.bs.a(0, 0);
    }

    public final void e(Bundle p0) {
        super.e(p0);
        if (p0 != 0) {
            p0.putString("referrer", this.m_);
            p0.putString("inline_details_url", this.g);
            p0.putString("continue_url", this.h);
        }
    }

    public final com.google.wireless.android.a.a.a.a.ce getPlayStoreUiElement() {
        return this.ag;
    }

    public final void m() {
        com.google.android.finsky.d.j.a(this.i, this.af, this, this.bw);
    }

    public final void m_() {
        this.k(1719);
        super.m_();
        if (this.as != 0) {
            this.ao();
            if (this.f != 0 && this.aj()) {
                this.at = com.google.android.finsky.m.a.bw().a(new com.google.android.finsky.installqueue.f().b(this.l_.b().cf()).a());
                this.at.a(new com.google.android.finsky.activities.dy(this));
            }
        }
    }

    public final void o_() {
        this.af = com.google.android.finsky.d.j.j();
    }

    public final void w() {
        this.ao();
        super.w();
    }

    public final void w_() {
        this.f = 1;
        this.aa();
    }

    final Intent x_() {
        v0 = 0;
        v2 = com.google.android.finsky.m.a.dj();
        if ((v2.a(12640676)) || v2.a(12641721))
            v0 = new Intent(com.google.android.finsky.m.a.b, InlineAppDetailsDialogPrivate).putExtra("docid", this.a.a.c).putExtra("allow_update", this.q.getBoolean("InlineAppDetailsFragment.allow_update", 0));
        v2 = new Intent(com.google.android.finsky.m.a.b, InlineAppPostPurchaseDialog);
        v2.putExtra("document", this.a);
        v2.putExtra("relaunchInitialDialogIntent", v0);
        this.bw.a(v2);
        return v2;
    }

}
