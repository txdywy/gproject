package com.google.android.finsky;

import android.text.TextUtils;
import com.google.android.finsky.accounts.a;
import com.google.android.finsky.api.c;
import com.google.android.finsky.as.a;
import com.google.android.finsky.az.a;
import com.google.android.finsky.ba.e;
import com.google.android.finsky.by.c;
import com.google.android.finsky.by.h;
import com.google.android.finsky.by.l;
import com.google.android.finsky.ca.a;
import com.google.android.finsky.ca.c;
import com.google.android.finsky.cn.a;
import com.google.android.finsky.cn.b;
import com.google.android.finsky.cv.a.ax;
import com.google.android.finsky.d.a;
import com.google.android.finsky.d.c;
import com.google.android.finsky.d.j;
import com.google.android.finsky.d.w;
import com.google.android.finsky.dc.b;
import com.google.android.finsky.de.a;
import com.google.android.finsky.deviceconfig.e;
import com.google.android.finsky.ec.a;
import com.google.android.finsky.ec.b;
import com.google.android.finsky.externalreferrer.d;
import com.google.android.finsky.f.c;
import com.google.android.finsky.hygiene.DailyHygiene;
import com.google.android.finsky.installer.k;
import com.google.android.finsky.l.a;
import com.google.android.finsky.l.j;
import com.google.android.finsky.notification.ab;
import com.google.android.finsky.notification.d;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.aj;
import com.google.android.finsky.utils.i;
import com.google.android.gms.gcm.a;
import com.google.wireless.android.a.a.a.a.ak;
import com.google.wireless.android.a.a.a.a.t;
import com.google.wireless.android.finsky.b.a;
import com.google.wireless.android.finsky.b.ab;
import com.google.wireless.android.finsky.b.ac;
import com.google.wireless.android.finsky.b.ad;
import com.google.wireless.android.finsky.b.af;
import com.google.wireless.android.finsky.b.ag;
import com.google.wireless.android.finsky.b.c;
import com.google.wireless.android.finsky.b.n;
import com.google.wireless.android.finsky.dfe.j.a.a;

public final class com.google.android.finsky.c implements Runnable
{

    public final com.google.wireless.android.finsky.b.ab a;
    public final long b;
    public final com.google.android.finsky.d.w c;
    public final DfeNotificationManagerImpl d;

    c(DfeNotificationManagerImpl p0, com.google.wireless.android.finsky.b.ab p1, long p2, com.google.android.finsky.d.w p4) {
        this.d = p0;
        this.a = p1;
        this.b = p2;
        this.c = p4;
    }

    public final void run() {
  0:    v8 = com.google.android.finsky.utils.i.b();
  4:    v0 = 0;
  9:    switch (this.a.c) {
            case 1:
  9:            goto 111;
            case 2:
  9:            goto 476;
            case 3:
  9:            goto 12;
            case 4:
  9:            goto 609;
            case 5:
  9:            goto 12;
            case 6:
  9:            goto 634;
            case 7:
  9:            goto 12;
            case 8:
  9:            goto 762;
            case 9:
  9:            goto 772;
            case 10:
  9:            goto 953;
            case 11:
  9:            goto 1061;
            case 12:
  9:            goto 1317;
            case 13:
  9:            goto 12;
            case 14:
  9:            goto 1340;
            case 15:
  9:            goto 1412;
            case 16:
  9:            goto 1412;
            case 17:
  9:            goto 1420;
            case 18:
  9:            goto 1527;
            case 19:
  9:            goto 1519;
            case 20:
  9:            goto 12;
            case 21:
  9:            goto 12;
            case 22:
  9:            goto 1543;
            case 23:
  9:            goto 1564;
            default:
        }
 15:    v2 = new Object[1];
 26:    v2[0] = Integer.valueOf(this.a.c);
 28:    FinskyLog.d("Unhandled notification type [%s]", v2);
 44:    if (com.google.android.finsky.m.a.dj().a(12638123)) {
 48:        v1 = new com.google.wireless.android.a.a.a.a.ak();
 55:        v1.a(this.a.c);
 66:        v1.a = v1.a | 2;
 68:        v1.c = v8 - this.b;
 79:        v1.a = v1.a | 4;
 81:        v1.d = com.google.android.finsky.utils.i.b() - v8;
100:        this.c.a(new com.google.android.finsky.d.c(2801).a(v1).a(v0));
        }
107:    this.d.f(this.a);
110:    return;
121:    v7 = this.d.m.a("tickle");
127:    if (this.a.j == 0) {
134:        FinskyLog.a("Ignoring PurchaseDeliveryNotification because AppData was null.", new Object[0]);
137:        v0 = 0;
        }
141:    else if (this.a.k == 0) {
148:        FinskyLog.a("Ignoring PurchaseDeliveryNotification because delivery data was null", new Object[0]);
151:        v0 = 0;
        }
161:    else if (this.a.k.o == 0) {
166:        v2 = new Object[1];
169:        v2[0] = this.a.f.b;
171:        FinskyLog.a("Ignoring PurchaseDeliveryNotification with !server_initiated: pkg=%s", v2);
174:        v0 = 0;
        }
        else {
181:        v3 = this.d.g.c.a(this.a.f.b);
185:        if (v3 != 0)
187:            v0 = v3.d;
            else
293:            v0 = -1;
209:        v5 = new com.google.android.finsky.l.j(com.google.android.finsky.m.a.aN()).a(this.a.j.b, this.a.j.e, 0).a(v3);
217:        if (!v5.a()) {
222:            v4 = new Object[3];
225:            v4[0] = this.a.f.b;
232:            v4[1] = v5.f();
239:            v4[2] = v5.g();
241:            FinskyLog.a("Skip remote install of %s because %s is not newer than %s", v4);
246:            v2 = new com.google.wireless.android.a.a.a.a.t();
251:            v2.a(this.a.j.b);
254:            if (v0 >= 0)
256:                v2.b(v0);
259:            if (v3 != 0)
263:                v2.a(v3.g);
287:            v7.a(new com.google.android.finsky.d.c(112).a(this.a.f.b).a(v2).b("older-version"));
290:            v0 = 0;
            }
            else {
299:            v0 = new com.google.wireless.android.a.a.a.a.t();
304:            v0.a(this.a.j.b);
322:            v7.a(new com.google.android.finsky.d.c(201).a(this.a.f.b).a(v0));
331:            if (this.a.k.a & 4096)
333:                v0 = 1;
                else
467:                v0 = 0;
334:            if (v0 != 0)
346:                com.google.android.finsky.m.a.bu().b(this.a.f.b, this.a.k.t);
355:            if (!TextUtils.isEmpty(this.a.j.d)) {
360:                v5 = new Object[1];
363:                v5[0] = this.a.f.b;
365:                FinskyLog.a("Capturing referrer for %s from notification", v5);
381:                com.google.android.finsky.m.a.E().a(this.a.j.d, 0, this.a.f, "tickle");
                }
390:            if (com.google.android.finsky.as.a.b(this.d.f) && com.google.android.finsky.ec.a.a(this.d.f).c()) {
410:                v0 = String.valueOf(this.a.f.b);
418:                if (v0.length() != 0)
420:                    v0 = "Requesting install on unmetered network for package: ".concat(v0);
                    else
472:                    v0 = new String("Requesting install on unmetered network for package: ");
427:                FinskyLog.a(v0, new Object[0]);
436:                this.d.d.b(this.a.f.b);
449:                com.google.android.finsky.m.a.cO().a(this.a.f.b);
                }
461:            this.d.d.a(this.a.f.b, this.a.j.b, this.a.h, this.a.g, 2, this.a.j.e, v7);
464:            v0 = 1;
            }
        }
138:    goto 31;
486:    if (this.a.l != 0 && this.a.l.b != 0)
494:        v0 = 1;
        else
594:        v0 = 0;
500:    v5 = new Object[2];
503:    v5[0] = this.a.f.b;
510:    v5[1] = Boolean.valueOf(v0);
512:    FinskyLog.a("Removing package '%s'. Malicious='%s'", v5);
519:    v5 = this.d.g.c.a(this.a.f.b);
523:    v1 = 0;
524:    if (v5 != 0) {
528:        v1 = new com.google.wireless.android.a.a.a.a.t();
533:        v1.b(v5.d);
538:        v1.a(v5.g);
        }
565:    com.google.android.finsky.m.a.dc().a(new com.google.android.finsky.d.c(202).a(this.a.f.b).a(v1).a, 0);
571:    v1 = this.d.m.a(0);
575:    if (v5 != 0) {
577:        if (v0 != 0)
581:            this.d.e.a(this.a.g, v1);
            else
598:            this.d.e.c(this.a.g, this.a.f.b, v1);
        }
584:    if (v0 != 0)
588:        this.d.d.k(this.a.f.b);
        else
605:        this.d.d.b(this.a.f.b, 1);
591:    v0 = 1;
592:    goto 31;
628:    this.d.e.e(this.a.m.b, this.a.m.c, this.d.m.a(0));
631:    v0 = 1;
632:    goto 31;
640:    if (this.a.o == 0) {
645:        v2 = new Object[1];
650:        v2[0] = this.a.d;
652:        FinskyLog.d("Received LibraryDirty notification without LibraryDirtyData: id=%s", v2);
655:        v0 = 0;
        }
        else {
662:        v2 = this.d.n.b(this.a.h);
666:        if (v2 == 0) {
671:            v2 = new Object[2];
676:            v2[0] = this.a.d;
685:            v2[1] = FinskyLog.a(this.a.h);
687:            FinskyLog.d("Received LibraryDirty notification for invalid account: id=%s, account=%s", v2);
690:            v0 = 0;
            }
            else {
694:            v3 = new String[1];
704:            if (this.a.o.c.length() > 0)
711:                v3[0] = this.a.o.c;
                else
753:                v3[0] = com.google.android.finsky.by.h.a(this.a.o.b);
724:            v0 = String.valueOf(this.a.d);
732:            if (v0.length() != 0)
734:                v0 = "notification-".concat(v0);
                else
758:                v0 = new String("notification-");
738:            this.d.h.a(v2, v3, new com.google.android.finsky.e(this.a), v0);
741:            v0 = 1;
            }
        }
656:    goto 31;
766:    v0 = this.d.c(this.a);
770:    goto 31;
789:    if (!com.google.android.finsky.m.a.dj().a(12606497))
791:        v0 = 0;
        else {
800:        v1 = -1;
801:        v0 = 0;
802:        if (this.a.j != 0) {
808:            if (this.a.j.a & 1)
810:                v2 = 1;
                else
896:                v2 = 0;
811:            if (v2 != 0) {
813:                v1 = this.a.j.b;
815:                v0 = this.a.j.e;
                }
            }
820:        v5 = new Object[2];
823:        v5[0] = this.a.f.b;
830:        v5[1] = Integer.valueOf(v1);
832:        FinskyLog.a("Received update check tickle for package '%s', maxVersionCode %d.", v5);
839:        v5 = this.d.g.c.a(this.a.f.b);
843:        v2 = 0;
844:        if (v5 != 0) {
848:            v2 = new com.google.wireless.android.a.a.a.a.t();
851:            if (v1 >= 0)
853:                v2.a(v1);
858:            v2.b(v5.d);
863:            v2.a(v5.g);
            }
869:        v3 = this.d.m.a(0);
888:        v3.a(new com.google.android.finsky.d.c(203).a(this.a.f.b).a(v2));
891:        if (v5 == 0)
893:            v0 = 0;
898:        else if (v1 >= 0 && new com.google.android.finsky.l.j(com.google.android.finsky.m.a.aN()).a(v1, v0, 0).a(v5).e())
926:            v0 = 0;
931:        else if (DailyHygiene.a != 0)
933:            v0 = 0;
            else {
947:            com.google.android.finsky.m.a.ah().a(new com.google.android.finsky.f(v3, this.a.f.b));
950:            v0 = 1;
            }
        }
792:    goto 31;
965:    v3 = this.d.g.c.a(this.a.f.b);
969:    v0 = 0;
970:    if (v3 != 0) {
974:        v0 = new com.google.wireless.android.a.a.a.a.t();
979:        v0.a(v3.d);
984:        v0.a(v3.g);
        }
1011:    com.google.android.finsky.m.a.dc().a(new com.google.android.finsky.d.c(204).a(this.a.f.b).a(v0).a, 0);
1018:    com.google.android.finsky.utils.aj.a(this.a.f.b);
1021:    com.google.android.finsky.utils.aj.a(this.a.h);
1030:    if (!this.d.j.e.a())
1038:        this.d.j.a(this.a.h, 1303, "cannot-set-restrictions", 0, 0, this.a.f.b);
        else {
1044:        v2 = this.d.j.a(this.a.f.b, this.a.h);
1048:        if (v2 != 0) {
1051:            v3 = new dj[1];
1054:            v3[0] = v2;
1057:            this.d.j.a(v3, this.a.h, 0);
            }
        }
1041:    v0 = 1;
1042:    goto 31;
1065:    v0 = -1;
1079:    if (com.google.android.finsky.m.a.dj().a(12638995)) {
1083:        if (this.a.j != 0)
1087:            v0 = this.a.j.b;
            else
1122:            v0 = -1;
        }
1102:    if (!com.google.android.finsky.m.a.dj().a(12631759)) goto 1124;
1116:    com.google.android.gms.gcm.a.a(this.d.f).a(DfeNotificationManagerImpl$SelfUpdateNotificationTaskService.a(0, v0));
1119:    v0 = 1;
1120:    goto 31;
1129:    v3 = this.d.m.a(0);
1137:    v1 = com.google.android.finsky.m.a.a(com.google.android.finsky.m.a.dj());
1154:    if (!com.google.android.finsky.m.a.dj().a(12638995)) goto 1165;
1157:    if (v0 == -1) goto 1165;
1163:    if (!v1.a(v0)) goto 1206;
1174:    v0 = new com.google.android.finsky.d.c(153).b("su_notification");
1189:    if (com.google.android.finsky.m.a.dj().a(12609134)) goto 1209;
1192:    v0.a(-3);
1195:    v3.a(v0);
1203:    FinskyLog.a("Self-update notification ignored - experiment not enabled", new Object[0]);
1206:    v0 = 0;
1207:    goto 31;
1211:    if (DailyHygiene.a == 0) goto 1229;
1214:    v0.a(-1);
1217:    v3.a(v0);
1225:    FinskyLog.a("Self-update notification ignored - DailyHygiene in progress", new Object[0]);
1228:    goto 1206;
1233:    if (!v1.a()) goto 1251;
1236:    v0.a(-2);
1239:    v3.a(v0);
1247:    FinskyLog.a("Self-update notification ignored - Already running", new Object[0]);
1250:    goto 1206;
1251:    v5 = com.google.android.finsky.m.a.ap();
1255:    if (v5 == 0) goto 1206;
1259:    v2 = new com.google.wireless.android.a.a.a.a.t();
1266:    v2.b(com.google.android.finsky.m.a.bi());
1270:    v2.a(1);
1278:    FinskyLog.a("Initiating push triggered self-update check", new Object[0]);
1311:    com.google.android.finsky.m.a.bI().a(v5, com.google.android.finsky.deviceconfig.e.a(), new com.google.android.finsky.d(v1, v2, v3, new com.google.android.finsky.d.c(119).b("su_notification").a(v2), v5));
1314:    v0 = 1;
1315:    goto 31;
1323:    if (this.a.t != 0) {
1331:        this.d.a(this.a.t, this.a.f, this.a.h);
1334:        v0 = 1;
        }
        else
1337:        v0 = 0;
1335:    goto 31;
1346:    if (this.a.s != 0) goto 1364;
1351:    v2 = new Object[1];
1356:    v2[0] = this.a.d;
1358:    FinskyLog.d("Received StaleDataRefresh notification without StaleDataRefreshData: id=%s", v2);
1361:    v0 = 0;
1362:    goto 31;
1366:    if (this.a.h != 0) goto 1379;
1373:    FinskyLog.a("Could not process stale data refresh for unknown account.", new Object[0]);
1376:    v0 = 0;
1377:    goto 31;
1381:    switch (this.a.s.b) {
            case 1:
1406:            this.d.k.a(this.a.h, this.a.s.c, this.a.s.d);
1409:            v0 = 1;
1582:            break;
            default:
1387:            v1 = new Object[1];
1392:            v1[0] = this.a.s.c;
1394:            FinskyLog.d("Unhandled data refresh token type [%s]", v1);
1397:            v0 = 0;
1582:            break;
        }
1414:    v0 = DfeNotificationManagerImpl.e(this.a);
1418:    goto 31;
1426:    if (this.a.v != 0) {
1434:        if (this.a.v.a & 1)
1436:            v0 = 1;
            else
1484:            v0 = 0;
1437:        if (v0 != 0) {
1464:            this.d.m.a(0).a(new com.google.android.finsky.d.c(3103).a(this.a.v.c).a, 0);
1469:            v0 = new com.google.wireless.android.finsky.dfe.j.a.a();
1476:            if (this.a.v.b == 0)
1483:                throw new NullPointerException();
1490:            v0.a = v0.a | 1;
1492:            v0.b = this.a.v.b;
1510:            com.google.android.finsky.m.a.ap().a(v0, new com.google.android.finsky.h(this.d, this.a), new com.google.android.finsky.i());
1513:            v0 = 1;
            }
            else
1516:            v0 = 0;
        }
        else
1516:        v0 = 0;
1514:    goto 31;
1521:    v0 = DfeNotificationManagerImpl.d(this.a);
1525:    goto 31;
1537:    v0 = this.d.o.a(this.a.w, this.a.h);
1541:    goto 31;
1549:    if (this.a.x != 0) {
1555:        this.d.a(this.a.x, this.a.h);
1558:        v0 = 1;
        }
        else
1561:        v0 = 0;
1559:    goto 31;
1570:    if (this.a.y != 0) {
1574:        this.d.a(this.a.y);
1577:        v0 = 1;
        }
        else
1580:        v0 = 0;
1578:    goto 31;
    }

}
