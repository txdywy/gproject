package com.google.android.p306h.p307a.p308a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;

public final class C5685v extends C0758b {
    public Integer f28837a;
    public C5684u f28838b;
    public Long f28839c;
    public Long f28840d;
    public C5678o f28841e;

    public C5685v() {
        this.f28838b = null;
        this.f28839c = null;
        this.f28840d = null;
        this.f28841e = null;
        this.aP = -1;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f28837a != null) {
            codedOutputByteBufferNano.a(1, this.f28837a.intValue());
        }
        if (this.f28838b != null) {
            codedOutputByteBufferNano.b(2, this.f28838b);
        }
        if (this.f28839c != null) {
            codedOutputByteBufferNano.b(3, this.f28839c.longValue());
        }
        if (this.f28840d != null) {
            codedOutputByteBufferNano.b(4, this.f28840d.longValue());
        }
        if (this.f28841e != null) {
            codedOutputByteBufferNano.b(5, this.f28841e);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if (this.f28837a != null) {
            b += CodedOutputByteBufferNano.d(1, this.f28837a.intValue());
        }
        if (this.f28838b != null) {
            b += CodedOutputByteBufferNano.d(2, this.f28838b);
        }
        if (this.f28839c != null) {
            b += CodedOutputByteBufferNano.f(3, this.f28839c.longValue());
        }
        if (this.f28840d != null) {
            b += CodedOutputByteBufferNano.f(4, this.f28840d.longValue());
        }
        if (this.f28841e != null) {
            return b + CodedOutputByteBufferNano.d(5, this.f28841e);
        }
        return b;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.android.p306h.p307a.p308a.C5685v m26927b(com.google.protobuf.nano.a r7) {
        /*
        r6 = this;
    L_0x0000:
        r0 = r7.a();
        switch(r0) {
            case 0: goto L_0x000d;
            case 8: goto L_0x000e;
            case 18: goto L_0x0043;
            case 24: goto L_0x0054;
            case 32: goto L_0x005f;
            case 42: goto L_0x006a;
            default: goto L_0x0007;
        };
    L_0x0007:
        r0 = super.m4918a(r7, r0);
        if (r0 != 0) goto L_0x0000;
    L_0x000d:
        return r6;
    L_0x000e:
        r1 = r7.o();
        r2 = r7.i();	 Catch:{ IllegalArgumentException -> 0x0034 }
        switch(r2) {
            case 0: goto L_0x003c;
            case 1: goto L_0x003c;
            case 2: goto L_0x003c;
            case 3: goto L_0x003c;
            case 4: goto L_0x003c;
            case 5: goto L_0x003c;
            case 101: goto L_0x003c;
            case 102: goto L_0x003c;
            case 103: goto L_0x003c;
            case 104: goto L_0x003c;
            case 105: goto L_0x003c;
            case 106: goto L_0x003c;
            case 107: goto L_0x003c;
            case 108: goto L_0x003c;
            case 201: goto L_0x003c;
            case 202: goto L_0x003c;
            case 203: goto L_0x003c;
            case 204: goto L_0x003c;
            case 205: goto L_0x003c;
            case 206: goto L_0x003c;
            case 207: goto L_0x003c;
            case 208: goto L_0x003c;
            case 209: goto L_0x003c;
            case 301: goto L_0x003c;
            case 302: goto L_0x003c;
            case 303: goto L_0x003c;
            case 304: goto L_0x003c;
            case 305: goto L_0x003c;
            case 306: goto L_0x003c;
            case 307: goto L_0x003c;
            case 401: goto L_0x003c;
            case 402: goto L_0x003c;
            case 403: goto L_0x003c;
            case 404: goto L_0x003c;
            case 501: goto L_0x003c;
            case 502: goto L_0x003c;
            case 503: goto L_0x003c;
            case 504: goto L_0x003c;
            case 601: goto L_0x003c;
            case 602: goto L_0x003c;
            case 603: goto L_0x003c;
            case 604: goto L_0x003c;
            case 605: goto L_0x003c;
            case 606: goto L_0x003c;
            case 607: goto L_0x003c;
            case 608: goto L_0x003c;
            case 609: goto L_0x003c;
            case 610: goto L_0x003c;
            case 611: goto L_0x003c;
            case 612: goto L_0x003c;
            case 613: goto L_0x003c;
            case 614: goto L_0x003c;
            case 615: goto L_0x003c;
            case 616: goto L_0x003c;
            case 617: goto L_0x003c;
            case 618: goto L_0x003c;
            case 619: goto L_0x003c;
            case 620: goto L_0x003c;
            case 621: goto L_0x003c;
            case 622: goto L_0x003c;
            case 623: goto L_0x003c;
            case 624: goto L_0x003c;
            case 625: goto L_0x003c;
            case 626: goto L_0x003c;
            case 627: goto L_0x003c;
            case 628: goto L_0x003c;
            case 629: goto L_0x003c;
            case 630: goto L_0x003c;
            case 631: goto L_0x003c;
            case 632: goto L_0x003c;
            case 633: goto L_0x003c;
            case 634: goto L_0x003c;
            case 635: goto L_0x003c;
            case 636: goto L_0x003c;
            case 637: goto L_0x003c;
            case 638: goto L_0x003c;
            case 639: goto L_0x003c;
            case 640: goto L_0x003c;
            case 641: goto L_0x003c;
            case 701: goto L_0x003c;
            case 702: goto L_0x003c;
            case 703: goto L_0x003c;
            case 704: goto L_0x003c;
            case 705: goto L_0x003c;
            case 706: goto L_0x003c;
            case 707: goto L_0x003c;
            case 708: goto L_0x003c;
            case 709: goto L_0x003c;
            case 710: goto L_0x003c;
            case 711: goto L_0x003c;
            case 712: goto L_0x003c;
            case 713: goto L_0x003c;
            case 714: goto L_0x003c;
            case 715: goto L_0x003c;
            case 716: goto L_0x003c;
            case 717: goto L_0x003c;
            case 718: goto L_0x003c;
            case 719: goto L_0x003c;
            case 720: goto L_0x003c;
            case 721: goto L_0x003c;
            case 722: goto L_0x003c;
            case 801: goto L_0x003c;
            case 802: goto L_0x003c;
            case 803: goto L_0x003c;
            case 901: goto L_0x003c;
            case 902: goto L_0x003c;
            case 903: goto L_0x003c;
            case 904: goto L_0x003c;
            case 905: goto L_0x003c;
            case 906: goto L_0x003c;
            case 907: goto L_0x003c;
            case 908: goto L_0x003c;
            case 909: goto L_0x003c;
            case 910: goto L_0x003c;
            case 911: goto L_0x003c;
            case 912: goto L_0x003c;
            case 1001: goto L_0x003c;
            case 1002: goto L_0x003c;
            case 1003: goto L_0x003c;
            case 1004: goto L_0x003c;
            case 1005: goto L_0x003c;
            case 1006: goto L_0x003c;
            case 1101: goto L_0x003c;
            case 1102: goto L_0x003c;
            case 1201: goto L_0x003c;
            case 1301: goto L_0x003c;
            case 1302: goto L_0x003c;
            case 1303: goto L_0x003c;
            case 1304: goto L_0x003c;
            case 1305: goto L_0x003c;
            case 1306: goto L_0x003c;
            case 1307: goto L_0x003c;
            case 1308: goto L_0x003c;
            case 1309: goto L_0x003c;
            case 1310: goto L_0x003c;
            case 1311: goto L_0x003c;
            case 1312: goto L_0x003c;
            case 1313: goto L_0x003c;
            case 1314: goto L_0x003c;
            case 1315: goto L_0x003c;
            case 1316: goto L_0x003c;
            case 1317: goto L_0x003c;
            case 1318: goto L_0x003c;
            case 1319: goto L_0x003c;
            case 1320: goto L_0x003c;
            case 1321: goto L_0x003c;
            case 1322: goto L_0x003c;
            case 1323: goto L_0x003c;
            case 1324: goto L_0x003c;
            case 1325: goto L_0x003c;
            case 1326: goto L_0x003c;
            case 1327: goto L_0x003c;
            case 1328: goto L_0x003c;
            case 1329: goto L_0x003c;
            case 1330: goto L_0x003c;
            case 1331: goto L_0x003c;
            case 1332: goto L_0x003c;
            case 1333: goto L_0x003c;
            case 1334: goto L_0x003c;
            case 1335: goto L_0x003c;
            case 1336: goto L_0x003c;
            case 1337: goto L_0x003c;
            case 1338: goto L_0x003c;
            case 1339: goto L_0x003c;
            case 1340: goto L_0x003c;
            case 1341: goto L_0x003c;
            case 1342: goto L_0x003c;
            case 1343: goto L_0x003c;
            case 1344: goto L_0x003c;
            case 1345: goto L_0x003c;
            case 1346: goto L_0x003c;
            case 1347: goto L_0x003c;
            case 1401: goto L_0x003c;
            case 1402: goto L_0x003c;
            case 1403: goto L_0x003c;
            case 1404: goto L_0x003c;
            case 1405: goto L_0x003c;
            case 1406: goto L_0x003c;
            case 1407: goto L_0x003c;
            case 1408: goto L_0x003c;
            case 1409: goto L_0x003c;
            case 1410: goto L_0x003c;
            case 1411: goto L_0x003c;
            case 1412: goto L_0x003c;
            case 1413: goto L_0x003c;
            case 1414: goto L_0x003c;
            case 1415: goto L_0x003c;
            case 1416: goto L_0x003c;
            case 1417: goto L_0x003c;
            case 1418: goto L_0x003c;
            case 1419: goto L_0x003c;
            case 1420: goto L_0x003c;
            case 1421: goto L_0x003c;
            case 1422: goto L_0x003c;
            case 1423: goto L_0x003c;
            case 1424: goto L_0x003c;
            case 1425: goto L_0x003c;
            case 1426: goto L_0x003c;
            case 1427: goto L_0x003c;
            case 1601: goto L_0x003c;
            case 1602: goto L_0x003c;
            case 1603: goto L_0x003c;
            case 1604: goto L_0x003c;
            case 1605: goto L_0x003c;
            case 1606: goto L_0x003c;
            case 1607: goto L_0x003c;
            case 1608: goto L_0x003c;
            case 1609: goto L_0x003c;
            case 1610: goto L_0x003c;
            case 1611: goto L_0x003c;
            case 1612: goto L_0x003c;
            case 1613: goto L_0x003c;
            case 1614: goto L_0x003c;
            case 1615: goto L_0x003c;
            case 1616: goto L_0x003c;
            case 1617: goto L_0x003c;
            case 1618: goto L_0x003c;
            case 1619: goto L_0x003c;
            case 1620: goto L_0x003c;
            case 1621: goto L_0x003c;
            case 1622: goto L_0x003c;
            case 1623: goto L_0x003c;
            case 1624: goto L_0x003c;
            case 1625: goto L_0x003c;
            case 1626: goto L_0x003c;
            case 1627: goto L_0x003c;
            case 1628: goto L_0x003c;
            case 1629: goto L_0x003c;
            case 1630: goto L_0x003c;
            case 1631: goto L_0x003c;
            case 1632: goto L_0x003c;
            case 1633: goto L_0x003c;
            case 1634: goto L_0x003c;
            case 1635: goto L_0x003c;
            case 1636: goto L_0x003c;
            case 1637: goto L_0x003c;
            case 1638: goto L_0x003c;
            case 1639: goto L_0x003c;
            case 1640: goto L_0x003c;
            case 1641: goto L_0x003c;
            case 1642: goto L_0x003c;
            case 1643: goto L_0x003c;
            case 1644: goto L_0x003c;
            case 1645: goto L_0x003c;
            case 1646: goto L_0x003c;
            case 1647: goto L_0x003c;
            case 1648: goto L_0x003c;
            case 1649: goto L_0x003c;
            case 1650: goto L_0x003c;
            case 1651: goto L_0x003c;
            case 1652: goto L_0x003c;
            case 1653: goto L_0x003c;
            case 1654: goto L_0x003c;
            case 1655: goto L_0x003c;
            case 1656: goto L_0x003c;
            case 1657: goto L_0x003c;
            case 1658: goto L_0x003c;
            case 1659: goto L_0x003c;
            case 1660: goto L_0x003c;
            case 1801: goto L_0x003c;
            case 1802: goto L_0x003c;
            case 1803: goto L_0x003c;
            case 1804: goto L_0x003c;
            case 1805: goto L_0x003c;
            case 1806: goto L_0x003c;
            case 1807: goto L_0x003c;
            case 1808: goto L_0x003c;
            case 1809: goto L_0x003c;
            case 1810: goto L_0x003c;
            case 1811: goto L_0x003c;
            case 1812: goto L_0x003c;
            case 1813: goto L_0x003c;
            case 1814: goto L_0x003c;
            case 1815: goto L_0x003c;
            case 1816: goto L_0x003c;
            case 1817: goto L_0x003c;
            case 1901: goto L_0x003c;
            case 1902: goto L_0x003c;
            case 1903: goto L_0x003c;
            case 1904: goto L_0x003c;
            case 1905: goto L_0x003c;
            case 1906: goto L_0x003c;
            case 1907: goto L_0x003c;
            case 1908: goto L_0x003c;
            case 1909: goto L_0x003c;
            case 2001: goto L_0x003c;
            case 2101: goto L_0x003c;
            case 2102: goto L_0x003c;
            case 2103: goto L_0x003c;
            case 2104: goto L_0x003c;
            case 2105: goto L_0x003c;
            case 2106: goto L_0x003c;
            case 2107: goto L_0x003c;
            case 2108: goto L_0x003c;
            case 2109: goto L_0x003c;
            case 2110: goto L_0x003c;
            case 2111: goto L_0x003c;
            case 2112: goto L_0x003c;
            case 2113: goto L_0x003c;
            case 2114: goto L_0x003c;
            case 2115: goto L_0x003c;
            case 2116: goto L_0x003c;
            case 2117: goto L_0x003c;
            case 2118: goto L_0x003c;
            case 2119: goto L_0x003c;
            case 2120: goto L_0x003c;
            case 2121: goto L_0x003c;
            case 2122: goto L_0x003c;
            case 2123: goto L_0x003c;
            case 2124: goto L_0x003c;
            case 2201: goto L_0x003c;
            case 2202: goto L_0x003c;
            case 2203: goto L_0x003c;
            case 2204: goto L_0x003c;
            case 2205: goto L_0x003c;
            case 2206: goto L_0x003c;
            case 2207: goto L_0x003c;
            case 2208: goto L_0x003c;
            case 2209: goto L_0x003c;
            case 2210: goto L_0x003c;
            case 2211: goto L_0x003c;
            case 2212: goto L_0x003c;
            case 2213: goto L_0x003c;
            case 2214: goto L_0x003c;
            case 2215: goto L_0x003c;
            case 2301: goto L_0x003c;
            case 2302: goto L_0x003c;
            case 2303: goto L_0x003c;
            case 2304: goto L_0x003c;
            case 2401: goto L_0x003c;
            case 2402: goto L_0x003c;
            case 2501: goto L_0x003c;
            case 2502: goto L_0x003c;
            case 2503: goto L_0x003c;
            case 2504: goto L_0x003c;
            case 2505: goto L_0x003c;
            case 2506: goto L_0x003c;
            case 2507: goto L_0x003c;
            case 2508: goto L_0x003c;
            case 2509: goto L_0x003c;
            case 2510: goto L_0x003c;
            case 2511: goto L_0x003c;
            case 2512: goto L_0x003c;
            case 2513: goto L_0x003c;
            case 2514: goto L_0x003c;
            case 2515: goto L_0x003c;
            case 2516: goto L_0x003c;
            case 2517: goto L_0x003c;
            case 2518: goto L_0x003c;
            case 2519: goto L_0x003c;
            case 2601: goto L_0x003c;
            case 2602: goto L_0x003c;
            case 2701: goto L_0x003c;
            case 2702: goto L_0x003c;
            case 2703: goto L_0x003c;
            case 2704: goto L_0x003c;
            case 2705: goto L_0x003c;
            case 2706: goto L_0x003c;
            case 2707: goto L_0x003c;
            case 2801: goto L_0x003c;
            case 2802: goto L_0x003c;
            case 2803: goto L_0x003c;
            case 2804: goto L_0x003c;
            case 2805: goto L_0x003c;
            case 2806: goto L_0x003c;
            case 2807: goto L_0x003c;
            case 2808: goto L_0x003c;
            case 2809: goto L_0x003c;
            case 2810: goto L_0x003c;
            case 2811: goto L_0x003c;
            case 2812: goto L_0x003c;
            case 2813: goto L_0x003c;
            case 2814: goto L_0x003c;
            case 2815: goto L_0x003c;
            case 2816: goto L_0x003c;
            case 2817: goto L_0x003c;
            case 2818: goto L_0x003c;
            case 2819: goto L_0x003c;
            case 2820: goto L_0x003c;
            case 2821: goto L_0x003c;
            case 2822: goto L_0x003c;
            case 2823: goto L_0x003c;
            case 2824: goto L_0x003c;
            case 2825: goto L_0x003c;
            case 2826: goto L_0x003c;
            case 2901: goto L_0x003c;
            case 2902: goto L_0x003c;
            case 2903: goto L_0x003c;
            case 2904: goto L_0x003c;
            case 2905: goto L_0x003c;
            case 2906: goto L_0x003c;
            case 2907: goto L_0x003c;
            case 3001: goto L_0x003c;
            case 3002: goto L_0x003c;
            case 3003: goto L_0x003c;
            case 3004: goto L_0x003c;
            case 3005: goto L_0x003c;
            default: goto L_0x0019;
        };	 Catch:{ IllegalArgumentException -> 0x0034 }
    L_0x0019:
        r3 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x0034 }
        r4 = 41;
        r5 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x0034 }
        r5.<init>(r4);	 Catch:{ IllegalArgumentException -> 0x0034 }
        r2 = r5.append(r2);	 Catch:{ IllegalArgumentException -> 0x0034 }
        r4 = " is not a valid enum EventType";
        r2 = r2.append(r4);	 Catch:{ IllegalArgumentException -> 0x0034 }
        r2 = r2.toString();	 Catch:{ IllegalArgumentException -> 0x0034 }
        r3.<init>(r2);	 Catch:{ IllegalArgumentException -> 0x0034 }
        throw r3;	 Catch:{ IllegalArgumentException -> 0x0034 }
    L_0x0034:
        r2 = move-exception;
        r7.e(r1);
        r6.m4918a(r7, r0);
        goto L_0x0000;
    L_0x003c:
        r2 = java.lang.Integer.valueOf(r2);	 Catch:{ IllegalArgumentException -> 0x0034 }
        r6.f28837a = r2;	 Catch:{ IllegalArgumentException -> 0x0034 }
        goto L_0x0000;
    L_0x0043:
        r0 = r6.f28838b;
        if (r0 != 0) goto L_0x004e;
    L_0x0047:
        r0 = new com.google.android.h.a.a.u;
        r0.<init>();
        r6.f28838b = r0;
    L_0x004e:
        r0 = r6.f28838b;
        r7.a(r0);
        goto L_0x0000;
    L_0x0054:
        r0 = r7.j();
        r0 = java.lang.Long.valueOf(r0);
        r6.f28839c = r0;
        goto L_0x0000;
    L_0x005f:
        r0 = r7.j();
        r0 = java.lang.Long.valueOf(r0);
        r6.f28840d = r0;
        goto L_0x0000;
    L_0x006a:
        r0 = r6.f28841e;
        if (r0 != 0) goto L_0x0075;
    L_0x006e:
        r0 = new com.google.android.h.a.a.o;
        r0.<init>();
        r6.f28841e = r0;
    L_0x0075:
        r0 = r6.f28841e;
        r7.a(r0);
        goto L_0x0000;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.h.a.a.v.b(com.google.protobuf.nano.a):com.google.android.h.a.a.v");
    }

    public final /* synthetic */ C0757i mo1131a(a aVar) {
        return m26927b(aVar);
    }
}
