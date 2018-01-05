package com.google.android.gms.internal;

public final class og extends wu {
    public static volatile og[] f27251a;
    public Integer f27252b;
    public Long f27253c;

    public og() {
        this.f27253c = null;
        this.ai = -1;
    }

    public static og[] m25276b() {
        if (f27251a == null) {
            synchronized (wy.f27652b) {
                if (f27251a == null) {
                    f27251a = new og[0];
                }
            }
        }
        return f27251a;
    }

    protected final int mo4701a() {
        int a = super.mo4701a();
        if (this.f27252b != null) {
            a += wt.m25889b(1, this.f27252b.intValue());
        }
        return this.f27253c != null ? a + wt.m25890b(2, this.f27253c.longValue()) : a;
    }

    public final /* synthetic */ wz mo4705a(ws wsVar) {
        while (true) {
            int a = wsVar.m25865a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    int j = wsVar.m25881j();
                    int e = wsVar.m25875e();
                    switch (e) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 101:
                        case 102:
                        case 103:
                        case 104:
                        case 105:
                        case 106:
                        case 107:
                        case 108:
                        case 201:
                        case 202:
                        case 203:
                        case 204:
                        case 205:
                        case 206:
                        case 207:
                        case 208:
                        case 209:
                        case 301:
                        case 302:
                        case 303:
                        case 304:
                        case 305:
                        case 306:
                        case 307:
                        case 401:
                        case 402:
                        case 403:
                        case 404:
                        case 501:
                        case 502:
                        case 503:
                        case 504:
                        case 601:
                        case 602:
                        case 603:
                        case 604:
                        case 605:
                        case 606:
                        case 607:
                        case 608:
                        case 609:
                        case 610:
                        case 611:
                        case 612:
                        case 613:
                        case 614:
                        case 615:
                        case 616:
                        case 617:
                        case 618:
                        case 619:
                        case 620:
                        case 621:
                        case 622:
                        case 623:
                        case 624:
                        case 625:
                        case 626:
                        case 701:
                        case 702:
                        case 703:
                        case 704:
                        case 705:
                        case 706:
                        case 801:
                        case 802:
                        case 803:
                        case 901:
                        case 902:
                        case 903:
                        case 904:
                        case 905:
                        case 906:
                        case 907:
                        case 908:
                        case 909:
                        case 1001:
                        case 1002:
                        case 1003:
                        case 1004:
                        case 1005:
                        case 1006:
                        case 1101:
                        case 1102:
                        case 1201:
                        case 1301:
                        case 1302:
                        case 1303:
                        case 1304:
                        case 1307:
                        case 1308:
                        case 1309:
                        case 1310:
                        case 1311:
                        case 1312:
                        case 1313:
                        case 1314:
                        case 1315:
                        case 1316:
                        case 1317:
                        case 1318:
                        case 1319:
                        case 1320:
                        case 1321:
                        case 1322:
                        case 1401:
                        case 1402:
                        case 1403:
                        case 1404:
                        case 1405:
                        case 1406:
                        case 1407:
                        case 1408:
                        case 1409:
                        case 1410:
                        case 1411:
                        case 1412:
                        case 1413:
                        case 1414:
                        case 1415:
                        case 1416:
                        case 1417:
                        case 1418:
                        case 1419:
                        case 1420:
                        case 1421:
                        case 1422:
                        case 1423:
                        case 1424:
                        case 1425:
                        case 1426:
                        case 1601:
                        case 1602:
                        case 1603:
                        case 1604:
                        case 1605:
                        case 1606:
                        case 1607:
                        case 1608:
                        case 1609:
                        case 1610:
                        case 1611:
                        case 1612:
                        case 1613:
                        case 1614:
                        case 1615:
                        case 1616:
                        case 1617:
                        case 1618:
                        case 1619:
                        case 1620:
                        case 1621:
                        case 1622:
                        case 1623:
                        case 1624:
                        case 1625:
                        case 1626:
                        case 1627:
                        case 1628:
                        case 1629:
                        case 1630:
                        case 1631:
                        case 1632:
                        case 1633:
                        case 1634:
                        case 1635:
                        case 1636:
                        case 1637:
                        case 1638:
                        case 1639:
                        case 1640:
                        case 1641:
                        case 1642:
                        case 1643:
                        case 1644:
                        case 1645:
                        case 1801:
                        case 1802:
                        case 1803:
                        case 1804:
                        case 1805:
                        case 1806:
                        case 1901:
                        case 1902:
                        case 1903:
                        case 1904:
                        case 1905:
                        case 1906:
                        case 1907:
                        case 1908:
                        case 2001:
                        case 2101:
                        case 2102:
                        case 2103:
                        case 2104:
                        case 2105:
                        case 2106:
                        case 2107:
                        case 2108:
                        case 2109:
                        case 2110:
                        case 2111:
                        case 2112:
                        case 2113:
                        case 2114:
                        case 2115:
                        case 2116:
                        case 2117:
                        case 2118:
                        case 2119:
                        case 2120:
                        case 2121:
                        case 2122:
                        case 2123:
                        case 2124:
                        case 2201:
                        case 2202:
                        case 2301:
                        case 2302:
                            this.f27252b = Integer.valueOf(e);
                            break;
                        default:
                            wsVar.m25876e(j);
                            m24220a(wsVar, a);
                            continue;
                    }
                case 16:
                    this.f27253c = Long.valueOf(wsVar.m25877f());
                    continue;
                default:
                    if (!super.m24220a(wsVar, a)) {
                        break;
                    }
                    continue;
            }
            return this;
        }
    }

    public final void mo4702a(wt wtVar) {
        if (this.f27252b != null) {
            wtVar.m25901a(1, this.f27252b.intValue());
        }
        if (this.f27253c != null) {
            wtVar.m25902a(2, this.f27253c.longValue());
        }
        super.mo4702a(wtVar);
    }
}
