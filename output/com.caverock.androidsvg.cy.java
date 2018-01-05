package com.caverock.androidsvg;

import android.graphics.Matrix;
import android.util.Log;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.zip.GZIPInputStream;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.Attributes;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.ext.DefaultHandler2;

public final class com.caverock.androidsvg.cy extends DefaultHandler2
{

    public com.caverock.androidsvg.q a;
    public com.caverock.androidsvg.bi b;
    public boolean c;
    public int d;
    public boolean e;
    public StringBuilder f;
    public boolean g;
    public StringBuilder h;

    cy() {
        DefaultHandler2();
        this.a = 0;
        this.b = 0;
        this.c = 0;
        this.e = 0;
        this.f = 0;
        this.g = 0;
        this.h = 0;
    }

    private static float a(String p0, int p1) {
        v0 = new com.caverock.androidsvg.l().a(p0, 0, p1);
        if (!Float.isNaN(v0))
            return v0;
        v0 = String.valueOf(p0);
        if (v0.length() != 0)
            v0 = "Invalid float value: ".concat(v0);
        else
            v0 = new String("Invalid float value: ");
        throw new SAXException(v0);
    }

    private static int a(float p0) {
        if (p0 < 0)
            v0 = 0;
        else if (p0 > 1132396544)
            v0 = 255;
        else
            v0 = Math.round(p0);
        return v0;
    }

    private static com.caverock.androidsvg.af a(com.caverock.androidsvg.df p0) {
        if (p0.a("auto"))
            v0 = new com.caverock.androidsvg.af(0);
        else
            v0 = p0.h();
        return v0;
    }

    private static com.caverock.androidsvg.bn a(String p0, String p1) {
        if (p0.startsWith("url(")) {
            v1 = p0.indexOf(")");
            if (v1 == -1)
                throw new SAXException((String.valueOf(p1).length() + 44) + "Bad " + p1 + " attribute. Unterminated url() reference");
            v2 = p0.substring(4, v1).trim();
            v0 = 0;
            v1 = p0.substring(v1 + 1).trim();
            if (v1.length() > 0)
                v0 = com.caverock.androidsvg.cy.g(v1);
            v0 = new com.caverock.androidsvg.ak(v2, v0);
        }
        else
            v0 = com.caverock.androidsvg.cy.g(p0);
        return v0;
    }

    private static Float a(String p0) {
        v0 = 0;
        if (p0.length() == 0)
            throw new SAXException("Invalid offset value in <stop> (empty string)");
        v3 = p0.length();
        if (p0.charAt(p0.length() - 1) == 37) {
            v2 = v3 - 1;
            v3 = 1;
        }
        else {
            v2 = v3;
            v3 = 0;
        }
        try {
            v2 = com.caverock.androidsvg.cy.a(p0, v2);
            if (v3 != 0)
                v2 = v2 / 1120403456;
            if (v2 < 0) {
            }
            else if (v2 > 1120403456)
                v0 = 1120403456;
            else
                v0 = v2;
        }
        catch (NumberFormatException ex) {
            v0 = String.valueOf(p0);
            if (v0.length() != 0)
                v0 = "Invalid offset value in <stop>: ".concat(v0);
            else
                v0 = new String("Invalid offset value in <stop>: ");
            throw new SAXException(v0, ex);
        }
        return Float.valueOf(v0);
    }

    private static void a(com.caverock.androidsvg.ad p0, Attributes p1) {
        v0 = 0;
        while (v0 < p1.getLength()) {
            if (com.caverock.androidsvg.dd.a(p1.getLocalName(v0)) == com.caverock.androidsvg.dd.ay)
                p0.a(com.caverock.androidsvg.cy.b(p1.getValue(v0)));
            v0 = v0 + 1;
        }
    }

    private static void a(com.caverock.androidsvg.ae p0, Attributes p1) {
        v0 = 0;
        while (true) {
            if (v0 >= p1.getLength())
                return;
            v1 = p1.getValue(v0).trim();
            switch (com.caverock.androidsvg.dd.a(p1.getLocalName(v0)).ordinal()) {
                case 25:
                    p0.e = com.caverock.androidsvg.cy.c(v1);
                    if (p0.e.b())
                        throw new SAXException("Invalid <use> element. height cannot be negative");
                    break;
                case 26:
                    if ("http://www.w3.org/1999/xlink".equals(p1.getURI(v0)))
                        p0.a = v1;
                    break;
                case 48:
                    com.caverock.androidsvg.cy.a(p0, v1);
                    break;
                case 81:
                    p0.d = com.caverock.androidsvg.cy.c(v1);
                    if (p0.d.b())
                        throw new SAXException("Invalid <use> element. width cannot be negative");
                    break;
                case 82:
                    p0.b = com.caverock.androidsvg.cy.c(v1);
                    break;
                case 83:
                    p0.c = com.caverock.androidsvg.cy.c(v1);
                    break;
                default:
                    break;
            }
            v0 = v0 + 1;
        }
    }

    private static void a(com.caverock.androidsvg.ag p0, Attributes p1) {
        v0 = 0;
        while (v0 < p1.getLength()) {
            v1 = p1.getValue(v0).trim();
            switch (com.caverock.androidsvg.dd.a(p1.getLocalName(v0)).ordinal()) {
                case 84:
                    p0.a = com.caverock.androidsvg.cy.c(v1);
                    break;
                case 85:
                    p0.b = com.caverock.androidsvg.cy.c(v1);
                    break;
                case 86:
                    p0.c = com.caverock.androidsvg.cy.c(v1);
                    break;
                case 87:
                    p0.d = com.caverock.androidsvg.cy.c(v1);
                    break;
                default:
                    break;
            }
            v0 = v0 + 1;
        }
    }

    private static void a(com.caverock.androidsvg.ah p0, Attributes p1) {
        v0 = 0;
        while (true) {
            if (v0 >= p1.getLength())
                return;
            v2 = p1.getValue(v0).trim();
            switch (com.caverock.androidsvg.dd.a(p1.getLocalName(v0)).ordinal()) {
                case 32:
                    p0.e = com.caverock.androidsvg.cy.c(v2);
                    if (p0.e.b())
                        throw new SAXException("Invalid <marker> element. markerHeight cannot be negative");
                    break;
                case 33:
                    if ("strokeWidth".equals(v2))
                        p0.a = 0;
                    else {
                        if (!"userSpaceOnUse".equals(v2))
                            throw new SAXException("Invalid value for attribute markerUnits");
                        p0.a = 1;
                    }
                    break;
                case 34:
                    p0.d = com.caverock.androidsvg.cy.c(v2);
                    if (p0.d.b())
                        throw new SAXException("Invalid <marker> element. markerWidth cannot be negative");
                    break;
                case 41:
                    if ("auto".equals(v2))
                        p0.f = Float.valueOf(2143289344);
                    else
                        p0.f = Float.valueOf(com.caverock.androidsvg.cy.e(v2));
                    break;
                case 50:
                    p0.b = com.caverock.androidsvg.cy.c(v2);
                    break;
                case 51:
                    p0.c = com.caverock.androidsvg.cy.c(v2);
                    break;
                default:
                    break;
            }
            v0 = v0 + 1;
        }
    }

    private static void a(com.caverock.androidsvg.ai p0, Attributes p1) {
        v0 = 0;
        while (true) {
            if (v0 >= p1.getLength())
                return;
            v2 = p1.getValue(v0).trim();
            switch (com.caverock.androidsvg.dd.a(p1.getLocalName(v0)).ordinal()) {
                case 25:
                    p0.f = com.caverock.androidsvg.cy.c(v2);
                    if (p0.f.b())
                        throw new SAXException("Invalid <mask> element. height cannot be negative");
                    break;
                case 36:
                    if ("objectBoundingBox".equals(v2))
                        p0.b = Boolean.valueOf(0);
                    else {
                        if (!"userSpaceOnUse".equals(v2))
                            throw new SAXException("Invalid value for attribute maskContentUnits");
                        p0.b = Boolean.valueOf(1);
                    }
                    break;
                case 37:
                    if ("objectBoundingBox".equals(v2))
                        p0.a = Boolean.valueOf(0);
                    else {
                        if (!"userSpaceOnUse".equals(v2))
                            throw new SAXException("Invalid value for attribute maskUnits");
                        p0.a = Boolean.valueOf(1);
                    }
                    break;
                case 81:
                    p0.e = com.caverock.androidsvg.cy.c(v2);
                    if (p0.e.b())
                        throw new SAXException("Invalid <mask> element. width cannot be negative");
                    break;
                case 82:
                    p0.c = com.caverock.androidsvg.cy.c(v2);
                    break;
                case 83:
                    p0.d = com.caverock.androidsvg.cy.c(v2);
                    break;
                default:
                    break;
            }
            v0 = v0 + 1;
        }
    }

    private static void a(com.caverock.androidsvg.al p0, Attributes p1) {
  1:    v9 = 0;
  6:    if (v9 >= p1.getLength())
943:        return;
 14:    v1 = p1.getValue(v9).trim();
 32:    switch (com.caverock.androidsvg.dd.a(p1.getLocalName(v9)).ordinal()) {
            case 13:
 32:            goto 39;
            case 43:
 32:            goto 910;
            default:
        }
 37:    v9 = v9 + 1;
 38:    goto 2;
 41:    v14 = new com.caverock.androidsvg.df(v1);
 44:    v7 = 0;
 45:    v6 = 0;
 46:    v5 = 0;
 47:    v4 = 0;
 48:    v3 = 0;
 49:    v2 = 0;
 52:    v1 = new com.caverock.androidsvg.am();
 59:    if (v14.b()) goto 93;
 65:    v8 = v14.g().intValue();
 71:    if (v8 == 77) goto 77;
 75:    if (v8 != 109) goto 93;
 77:    v10 = v4;
 78:    v11 = v5;
 79:    v12 = v8;
 80:    v5 = v6;
 81:    v6 = v7;
 82:    v17 = v3;
 84:    v3 = v2;
 85:    v2 = v17;
 87:    v14.c();
 90:    switch (v12) {
            case 65:
 90:            goto 787;
            case 67:
 90:            goto 305;
            case 72:
 90:            goto 505;
            case 76:
 90:            goto 240;
            case 77:
 90:            goto 98;
            case 81:
 90:            goto 635;
            case 83:
 90:            goto 398;
            case 84:
 90:            goto 711;
            case 86:
 90:            goto 570;
            case 90:
 90:            goto 491;
            case 97:
 90:            goto 787;
            case 99:
 90:            goto 305;
            case 104:
 90:            goto 505;
            case 108:
 90:            goto 240;
            case 109:
 90:            goto 98;
            case 113:
 90:            goto 635;
            case 115:
 90:            goto 398;
            case 116:
 90:            goto 711;
            case 118:
 90:            goto 570;
            case 122:
 90:            goto 491;
            default:
        }
 95:    p0.a = v1;
 97:    goto 35;
 98:    v3 = v14.e();
102:    v2 = v14.a(v3);
110:    if (!Float.isNaN(v2)) goto 146;
142:    Log.e("SVGParser", 34 + "Bad path coords for " + (char)v12 + " path segment");
145:    goto 93;
148:    if (v12 == 109) {
152:        if (v1.b == 0)
154:            v4 = 1;
            else
235:            v4 = 0;
155:        if (v4 == 0) {
157:            v3 = v3 + v6;
158:            v2 = v2 + v5;
            }
        }
159:    v1.a(v3, v2);
164:    if (v12 == 109)
166:        v4 = 108;
        else
237:        v4 = 76;
168:    v5 = v3;
169:    v6 = v2;
170:    v7 = v3;
171:    v8 = v4;
172:    v4 = v2;
173:    v14.d();
180:    if (v14.b()) goto 93;
186:    if (v14.b == v14.c) goto 907;
192:    v10 = v14.a.charAt(v14.b);
198:    if (v10 < 97) goto 204;
202:    if (v10 <= 122) goto 212;
206:    if (v10 < 65) goto 907;
210:    if (v10 > 90) goto 907;
212:    v10 = 1;
213:    if (v10 == 0) goto 77;
223:    v10 = v4;
224:    v11 = v5;
225:    v12 = v14.g().intValue();
226:    v5 = v6;
227:    v6 = v7;
228:    v17 = v3;
230:    v3 = v2;
231:    v2 = v17;
233:    goto 87;
240:    v3 = v14.e();
244:    v2 = v14.a(v3);
252:    if (!Float.isNaN(v2)) goto 289;
284:    Log.e("SVGParser", 34 + "Bad path coords for " + (char)v12 + " path segment");
287:    goto 93;
291:    if (v12 == 108) {
293:        v3 = v3 + v6;
294:        v2 = v2 + v5;
        }
295:    v1.b(v3, v2);
298:    v4 = v10;
299:    v5 = v11;
300:    v6 = v2;
301:    v7 = v3;
302:    v8 = v12;
303:    goto 173;
305:    v7 = v14.e();
309:    v3 = v14.a(v7);
313:    v4 = v14.a(v3);
317:    v2 = v14.a(v4);
321:    v13 = v14.a(v2);
325:    v8 = v14.a(v13);
333:    if (!Float.isNaN(v8)) goto 370;
365:    Log.e("SVGParser", 34 + "Bad path coords for " + (char)v12 + " path segment");
368:    goto 93;
372:    if (v12 == 99) {
375:        v8 = v8 + v5;
377:        v3 = v3 + v5;
378:        v4 = v4 + v6;
379:        v5 = v5 + v2;
380:        v2 = v7 + v6;
381:        v6 = v13 + v6;
382:        v7 = v8;
        }
        else {
959:        v5 = v2;
960:        v6 = v13;
961:        v2 = v7;
962:        v7 = v8;
        }
383:    v1.a(v2, v3, v4, v5, v6, v7);
386:    v2 = v5;
387:    v3 = v4;
388:    v8 = v12;
389:    v5 = v11;
390:    v4 = v10;
391:    v17 = v6;
393:    v6 = v7;
394:    v7 = v17;
396:    goto 173;
401:    v2 = 1073741824 * v6 - v2;
406:    v3 = 1073741824 * v5 - v3;
408:    v7 = v14.e();
412:    v4 = v14.a(v7);
416:    v13 = v14.a(v4);
420:    v8 = v14.a(v13);
428:    if (!Float.isNaN(v8)) goto 465;
460:    Log.e("SVGParser", 34 + "Bad path coords for " + (char)v12 + " path segment");
463:    goto 93;
467:    if (v12 == 115) {
470:        v8 = v8 + v5;
472:        v5 = v5 + v4;
473:        v4 = v6 + v7;
474:        v7 = v8;
475:        v6 = v13 + v6;
        }
        else {
953:        v5 = v4;
954:        v6 = v13;
955:        v4 = v7;
956:        v7 = v8;
        }
476:    v1.a(v2, v3, v4, v5, v6, v7);
479:    v2 = v5;
480:    v3 = v4;
481:    v8 = v12;
482:    v5 = v11;
483:    v4 = v10;
484:    v17 = v6;
486:    v6 = v7;
487:    v7 = v17;
489:    goto 173;
493:    v1.a(8);
496:    v2 = v10;
497:    v3 = v11;
498:    v4 = v10;
499:    v5 = v11;
500:    v6 = v10;
501:    v7 = v11;
502:    v8 = v12;
503:    goto 173;
505:    v2 = v14.e();
513:    if (!Float.isNaN(v2)) goto 550;
545:    Log.e("SVGParser", 34 + "Bad path coords for " + (char)v12 + " path segment");
548:    goto 93;
552:    if (v12 == 104)
554:        v2 = v2 + v6;
555:    v1.b(v2, v5);
558:    v4 = v10;
559:    v6 = v5;
560:    v7 = v2;
561:    v8 = v12;
562:    v5 = v11;
563:    v17 = v3;
565:    v3 = v2;
566:    v2 = v17;
568:    goto 173;
570:    v3 = v14.e();
578:    if (!Float.isNaN(v3)) goto 615;
610:    Log.e("SVGParser", 34 + "Bad path coords for " + (char)v12 + " path segment");
613:    goto 93;
617:    if (v12 == 118)
619:        v3 = v3 + v5;
620:    v1.b(v6, v3);
623:    v4 = v10;
624:    v5 = v11;
625:    v7 = v6;
626:    v8 = v12;
627:    v6 = v3;
628:    v17 = v3;
630:    v3 = v2;
631:    v2 = v17;
633:    goto 173;
635:    v3 = v14.e();
639:    v2 = v14.a(v3);
643:    v7 = v14.a(v2);
647:    v4 = v14.a(v7);
655:    if (!Float.isNaN(v4)) goto 692;
687:    Log.e("SVGParser", 34 + "Bad path coords for " + (char)v12 + " path segment");
690:    goto 93;
694:    if (v12 == 113) {
697:        v4 = v4 + v5;
698:        v3 = v3 + v6;
699:        v2 = v2 + v5;
700:        v5 = v7 + v6;
        }
        else
950:        v5 = v7;
701:    v1.a(v3, v2, v5, v4);
704:    v6 = v4;
705:    v7 = v5;
706:    v8 = v12;
707:    v5 = v11;
708:    v4 = v10;
709:    goto 173;
714:    v4 = 1073741824 * v6 - v2;
718:    v8 = 1073741824 * v5 - v3;
720:    v3 = v14.e();
724:    v2 = v14.a(v3);
732:    if (!Float.isNaN(v2)) goto 769;
764:    Log.e("SVGParser", 34 + "Bad path coords for " + (char)v12 + " path segment");
767:    goto 93;
771:    if (v12 == 116) {
773:        v3 = v3 + v6;
774:        v2 = v2 + v5;
        }
775:    v1.a(v4, v8, v3, v2);
778:    v5 = v11;
779:    v6 = v2;
780:    v7 = v3;
781:    v2 = v8;
782:    v3 = v4;
783:    v4 = v10;
784:    v8 = v12;
785:    goto 173;
787:    v2 = v14.e();
791:    v3 = v14.a(v2);
795:    v4 = v14.a(v3);
803:    v13 = v14.a(Float.valueOf(v4));
807:    v15 = v14.a(v13);
811:    if (v15 == 0) {
813:        v7 = 2143289344;
815:        v8 = 2143289344;
        }
        else {
869:        v8 = v14.f();
873:        v7 = v14.a(v8);
        }
820:    if (Float.isNaN(v7)) goto 834;
826:    if (v2 < 0) goto 834;
832:    if (v3 >= 0) goto 878;
864:    Log.e("SVGParser", 34 + "Bad path coords for " + (char)v12 + " path segment");
867:    goto 93;
882:    if (v12 == 97) {
884:        v6 = v6 + v8;
885:        v8 = v7 + v5;
887:        v7 = v6;
        }
        else {
944:        v17 = v7;
946:        v7 = v8;
947:        v8 = v17;
        }
896:    v1.a(v2, v3, v4, v13.booleanValue(), v15.booleanValue(), v7, v8);
899:    v2 = v8;
900:    v3 = v7;
901:    v4 = v10;
902:    v5 = v11;
903:    v6 = v8;
904:    v8 = v12;
905:    goto 173;
907:    v10 = 0;
908:    goto 213;
920:    p0.b = Float.valueOf(com.caverock.androidsvg.cy.e(v1));
933:    if (p0.b.floatValue() < 0)
942:        throw new SAXException("Invalid <path> element. pathLength cannot be negative");
934:    goto 35;
    }

    private static void a(com.caverock.androidsvg.ao p0, Attributes p1) {
        v0 = 0;
        while (true) {
            if (v0 >= p1.getLength())
                return;
            v2 = p1.getValue(v0).trim();
            switch (com.caverock.androidsvg.dd.a(p1.getLocalName(v0)).ordinal()) {
                case 25:
                    p0.g = com.caverock.androidsvg.cy.c(v2);
                    if (p0.g.b())
                        throw new SAXException("Invalid <pattern> element. height cannot be negative");
                    break;
                case 26:
                    if ("http://www.w3.org/1999/xlink".equals(p1.getURI(v0)))
                        p0.h = v2;
                    break;
                case 44:
                    if ("objectBoundingBox".equals(v2))
                        p0.b = Boolean.valueOf(0);
                    else {
                        if (!"userSpaceOnUse".equals(v2))
                            throw new SAXException("Invalid value for attribute patternContentUnits");
                        p0.b = Boolean.valueOf(1);
                    }
                    break;
                case 45:
                    p0.c = com.caverock.androidsvg.cy.b(v2);
                    break;
                case 46:
                    if ("objectBoundingBox".equals(v2))
                        p0.a = Boolean.valueOf(0);
                    else {
                        if (!"userSpaceOnUse".equals(v2))
                            throw new SAXException("Invalid value for attribute patternUnits");
                        p0.a = Boolean.valueOf(1);
                    }
                    break;
                case 81:
                    p0.f = com.caverock.androidsvg.cy.c(v2);
                    if (p0.f.b())
                        throw new SAXException("Invalid <pattern> element. width cannot be negative");
                    break;
                case 82:
                    p0.d = com.caverock.androidsvg.cy.c(v2);
                    break;
                case 83:
                    p0.e = com.caverock.androidsvg.cy.c(v2);
                    break;
                default:
                    break;
            }
            v0 = v0 + 1;
        }
    }

    private static void a(com.caverock.androidsvg.ap p0, Attributes p1, String p2) {
        v2 = 0;
        while (v2 < p1.getLength()) {
            if (com.caverock.androidsvg.dd.a(p1.getLocalName(v2)) == com.caverock.androidsvg.dd.V) {
                v1 = new com.caverock.androidsvg.df(p1.getValue(v2));
                v0 = new ArrayList();
                v1.c();
                while (!v1.b()) {
                    v4 = v1.e();
                    if (Float.isNaN(v4))
                        throw new SAXException((String.valueOf(p2).length() + 66) + "Invalid <" + p2 + "> points attribute. Non-coordinate content found in list.");
                    v1.d();
                    v5 = v1.e();
                    if (Float.isNaN(v5))
                        throw new SAXException((String.valueOf(p2).length() + 75) + "Invalid <" + p2 + "> points attribute. There should be an even number of coordinates.");
                    v1.d();
                    v0.add(Float.valueOf(v4));
                    v0.add(Float.valueOf(v5));
                }
                p0.a = new float[v0.size()];
                v4 = 0;
                v5 = 0;
                while (v4 < ((ArrayList)v0).size()) {
                    v1 = ((ArrayList)v0).get(v4);
                    v4 = v4 + 1;
                    p0.a[v5] = ((Float)v1).floatValue();
                    v5 = v5 + 1;
                }
            }
            v2 = v2 + 1;
        }
    }

    private static void a(com.caverock.androidsvg.ar p0, Attributes p1) {
        v0 = 0;
        while (true) {
            if (v0 >= p1.getLength())
                return;
            v1 = p1.getValue(v0).trim();
            switch (com.caverock.androidsvg.dd.a(p1.getLocalName(v0)).ordinal()) {
                case 25:
                    p0.d = com.caverock.androidsvg.cy.c(v1);
                    if (p0.d.b())
                        throw new SAXException("Invalid <rect> element. height cannot be negative");
                    break;
                case 56:
                    p0.f = com.caverock.androidsvg.cy.c(v1);
                    if (p0.f.b())
                        throw new SAXException("Invalid <rect> element. rx cannot be negative");
                    break;
                case 57:
                    p0.g = com.caverock.androidsvg.cy.c(v1);
                    if (p0.g.b())
                        throw new SAXException("Invalid <rect> element. ry cannot be negative");
                    break;
                case 81:
                    p0.c = com.caverock.androidsvg.cy.c(v1);
                    if (p0.c.b())
                        throw new SAXException("Invalid <rect> element. width cannot be negative");
                    break;
                case 82:
                    p0.a = com.caverock.androidsvg.cy.c(v1);
                    break;
                case 83:
                    p0.b = com.caverock.androidsvg.cy.c(v1);
                    break;
                default:
                    break;
            }
            v0 = v0 + 1;
        }
    }

    private static void a(com.caverock.androidsvg.au p0, Attributes p1) {
        v0 = 0;
        while (v0 < p1.getLength()) {
            switch (com.caverock.androidsvg.dd.a(p1.getLocalName(v0)).ordinal()) {
                case 39:
                    p0.a = com.caverock.androidsvg.cy.a(p1.getValue(v0).trim());
                    break;
                default:
                    break;
            }
            v0 = v0 + 1;
        }
    }

    private static void a(com.caverock.androidsvg.av p0, String p1) {
  4:    v1 = 0;
 43:    if ("|caption|icon|menu|message-box|small-caption|status-bar|".indexOf((String.valueOf(p1).length() + 2) + 124 + p1 + 124) != -1)
 45:        return;
 48:    v5 = new com.caverock.androidsvg.df(p1);
 51:    v0 = 0;
 52:    v3 = 0;
 53:    v4 = 0;
 54:    v2 = v5.b(47);
 58:    v5.c();
 61:    if (v2 == 0)
 70:        throw new SAXException("Invalid font style attribute: missing font size and family");
 71:    if (v4 != 0 && v3 != 0) {
111:        v0 = com.caverock.androidsvg.cy.j(v2);
119:        if (v5.a(47)) {
121:            v5.c();
126:            v2 = v5.b(32);
130:            if (v2 == 0)
139:                throw new SAXException("Invalid font style attribute: missing line-height");
140:            com.caverock.androidsvg.cy.c(v2);
143:            v5.c();
            }
150:        if (!v5.b()) {
190:            v5.b = v5.c;
194:            v1 = v5.a.substring(v5.b);
            }
156:        p0.o = com.caverock.androidsvg.cy.i(v1);
158:        p0.p = v0;
160:        if (v4 == 0)
162:            v0 = 400;
            else
199:            v0 = v4.intValue();
168:        p0.q = Integer.valueOf(v0);
170:        if (v3 == 0)
172:            v3 = com.caverock.androidsvg.ax.a;
174:        p0.r = v3;
182:        p0.a = p0.a | 122880;
184:        return;
        }
 81:    if (v2.equals("normal")) goto 54;
 83:    if (v4 != 0) goto 91;
 85:    v4 = com.caverock.androidsvg.dc.a(v2);
 89:    if (v4 != 0) goto 54;
 91:    if (v3 != 0) goto 99;
 93:    v3 = com.caverock.androidsvg.cy.k(v2);
 97:    if (v3 != 0) goto 54;
 99:    if (v0 != 0) {
111:        v0 = com.caverock.androidsvg.cy.j(v2);
119:        if (v5.a(47)) {
121:            v5.c();
126:            v2 = v5.b(32);
130:            if (v2 == 0)
139:                throw new SAXException("Invalid font style attribute: missing line-height");
140:            com.caverock.androidsvg.cy.c(v2);
143:            v5.c();
            }
150:        if (!v5.b()) {
190:            v5.b = v5.c;
194:            v1 = v5.a.substring(v5.b);
            }
156:        p0.o = com.caverock.androidsvg.cy.i(v1);
158:        p0.p = v0;
160:        if (v4 == 0)
162:            v0 = 400;
            else
199:            v0 = v4.intValue();
168:        p0.q = Integer.valueOf(v0);
170:        if (v3 == 0)
172:            v3 = com.caverock.androidsvg.ax.a;
174:        p0.r = v3;
182:        p0.a = p0.a | 122880;
184:        return;
        }
107:    if (!v2.equals("small-caps")) {
111:        v0 = com.caverock.androidsvg.cy.j(v2);
119:        if (v5.a(47)) {
121:            v5.c();
126:            v2 = v5.b(32);
130:            if (v2 == 0)
139:                throw new SAXException("Invalid font style attribute: missing line-height");
140:            com.caverock.androidsvg.cy.c(v2);
143:            v5.c();
            }
150:        if (!v5.b()) {
190:            v5.b = v5.c;
194:            v1 = v5.a.substring(v5.b);
            }
156:        p0.o = com.caverock.androidsvg.cy.i(v1);
158:        p0.p = v0;
160:        if (v4 == 0)
162:            v0 = 400;
            else
199:            v0 = v4.intValue();
168:        p0.q = Integer.valueOf(v0);
170:        if (v3 == 0)
172:            v3 = com.caverock.androidsvg.ax.a;
174:        p0.r = v3;
182:        p0.a = p0.a | 122880;
184:        return;
        }
109:    v0 = v2;
110:    goto 54;
    }

    protected static void a(com.caverock.androidsvg.av p0, String p1, String p2) {
        v0 = 0;
        if (p2.length() == 0)
            return;
        if (p2.equals("inherit"))
            return;
        switch (com.caverock.androidsvg.dd.a(p1).ordinal()) {
            case 1:
                if (!"auto".equals(p2)) {
                    if (!p2.toLowerCase(Locale.US).startsWith("rect("))
                        throw new SAXException("Invalid clip attribute shape. Only rect() is supported.");
                    v0 = new com.caverock.androidsvg.df(p2.substring(5));
                    v0.c();
                    v0.d();
                    v0.d();
                    v0.d();
                    v0.c();
                    if (!v0.a(41)) {
                        v0 = String.valueOf(p2);
                        if (v0.length() != 0)
                            v0 = "Bad rect() clip definition: ".concat(v0);
                        else
                            v0 = new String("Bad rect() clip definition: ");
                        throw new SAXException(v0);
                    }
                    v0 = new com.caverock.androidsvg.s(com.caverock.androidsvg.cy.a(v0), com.caverock.androidsvg.cy.a(v0), com.caverock.androidsvg.cy.a(v0), com.caverock.androidsvg.cy.a(v0));
                }
                p0.w = v0;
                p0.a = p0.a | 1048576;
                break;
            case 2:
                p0.E = com.caverock.androidsvg.cy.b(p2, p1);
                p0.a = p0.a | 268435456;
                break;
            case 3:
                break;
            case 4:
                p0.F = com.caverock.androidsvg.cy.l(p2);
                p0.a = p0.a | 536870912;
                break;
            case 5:
                p0.n = com.caverock.androidsvg.cy.h(p2);
                p0.a = p0.a | 4096;
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                if ("ltr".equals(p2))
                    v0 = com.caverock.androidsvg.bc.a;
                else {
                    if (!"rtl".equals(p2)) {
                        v0 = String.valueOf(p2);
                        if (v0.length() != 0)
                            v0 = "Invalid direction property: ".concat(v0);
                        else
                            v0 = new String("Invalid direction property: ");
                        throw new SAXException(v0);
                    }
                    v0 = com.caverock.androidsvg.bc.b;
                }
                p0.t = v0;
                p0.a = p0.a | 68719476736;
                return;
            case 9:
                break;
            case 10:
                break;
            case 11:
                break;
            case 12:
                break;
            case 13:
                break;
            case 14:
                if (p2.indexOf(124) >= 0 || "|inline|block|list-item|run-in|compact|marker|table|inline-table|table-row-group|table-header-group|table-footer-group|table-row|table-column-group|table-column|table-cell|table-caption|none|".indexOf((String.valueOf(p2).length() + 2) + 124 + p2 + 124) == -1) {
                    v0 = String.valueOf(p2);
                    if (v0.length() != 0)
                        v0 = "Invalid value for \"display\" attribute: ".concat(v0);
                    else
                        v0 = new String("Invalid value for \"display\" attribute: ");
                    throw new SAXException(v0);
                }
                if (!p2.equals("none"))
                    v0 = 1;
                else
                    v0 = 0;
                p0.A = Boolean.valueOf(v0);
                p0.a = p0.a | 16777216;
                break;
            case 15:
                p0.b = com.caverock.androidsvg.cy.a(p2, "fill");
                p0.a = p0.a | 1;
                return;
            case 16:
                p0.c = com.caverock.androidsvg.cy.l(p2);
                p0.a = p0.a | 2;
                return;
            case 17:
                p0.d = Float.valueOf(com.caverock.androidsvg.cy.f(p2));
                p0.a = p0.a | 4;
                return;
            case 18:
                com.caverock.androidsvg.cy.a(p0, p2);
                return;
            case 19:
                p0.o = com.caverock.androidsvg.cy.i(p2);
                p0.a = p0.a | 8192;
                return;
            case 20:
                p0.p = com.caverock.androidsvg.cy.j(p2);
                p0.a = p0.a | 16384;
                return;
            case 21:
                v0 = com.caverock.androidsvg.dc.a(p2);
                if (v0 == 0) {
                    v0 = String.valueOf(p2);
                    if (v0.length() != 0)
                        v0 = "Invalid font-weight property: ".concat(v0);
                    else
                        v0 = new String("Invalid font-weight property: ");
                    throw new SAXException(v0);
                }
                p0.q = v0;
                p0.a = p0.a | 32768;
                return;
            case 22:
                v0 = com.caverock.androidsvg.cy.k(p2);
                if (v0 == 0) {
                    v0 = String.valueOf(p2);
                    if (v0.length() != 0)
                        v0 = "Invalid font-style property: ".concat(v0);
                    else
                        v0 = new String("Invalid font-style property: ");
                    throw new SAXException(v0);
                }
                p0.r = v0;
                p0.a = p0.a | 65536;
                return;
            case 23:
                break;
            case 24:
                break;
            case 25:
                break;
            case 26:
                break;
            case 27:
                break;
            case 28:
                p0.x = com.caverock.androidsvg.cy.b(p2, p1);
                p0.y = p0.x;
                p0.z = p0.x;
                p0.a = p0.a | 14680064;
                break;
            case 29:
                p0.x = com.caverock.androidsvg.cy.b(p2, p1);
                p0.a = p0.a | 2097152;
                break;
            case 30:
                p0.y = com.caverock.androidsvg.cy.b(p2, p1);
                p0.a = p0.a | 4194304;
                break;
            case 31:
                p0.z = com.caverock.androidsvg.cy.b(p2, p1);
                p0.a = p0.a | 8388608;
                break;
            case 32:
                break;
            case 33:
                break;
            case 34:
                break;
            case 35:
                p0.G = com.caverock.androidsvg.cy.b(p2, p1);
                p0.a = p0.a | 1073741824;
                break;
            case 36:
                break;
            case 37:
                break;
            case 38:
                break;
            case 39:
                break;
            case 40:
                p0.m = Float.valueOf(com.caverock.androidsvg.cy.f(p2));
                p0.a = p0.a | 2048;
                return;
            case 41:
                break;
            case 42:
                if ("visible".equals(p2)) {
                    v0 = Boolean.TRUE;
                    p0.v = v0;
                    p0.a = p0.a | 524288;
                    return;
                }
                if ("auto".equals(p2))
                    v0 = Boolean.TRUE;
                else {
                    if (!"hidden".equals(p2) && (!"scroll".equals(p2))) {
                        v0 = String.valueOf(p2);
                        if (v0.length() != 0)
                            v0 = "Invalid toverflow property: ".concat(v0);
                        else
                            v0 = new String("Invalid toverflow property: ");
                        throw new SAXException(v0);
                    }
                    v0 = Boolean.FALSE;
                }
                p0.v = v0;
                p0.a = p0.a | 524288;
                return;
            case 43:
                break;
            case 44:
                break;
            case 45:
                break;
            case 46:
                break;
            case 47:
                break;
            case 48:
                break;
            case 49:
                break;
            case 50:
                break;
            case 51:
                break;
            case 52:
                break;
            case 53:
                break;
            case 54:
                break;
            case 55:
                break;
            case 56:
                break;
            case 57:
                break;
            case 58:
                if (p2.equals("currentColor"))
                    p0.H = com.caverock.androidsvg.w.a;
                else
                    p0.H = com.caverock.androidsvg.cy.h(p2);
                p0.a = p0.a | 2147483648;
                break;
            case 59:
                p0.I = Float.valueOf(com.caverock.androidsvg.cy.f(p2));
                p0.a = p0.a | 4294967296;
                break;
            case 60:
                break;
            case 61:
                break;
            case 62:
                if (p2.equals("currentColor"))
                    p0.C = com.caverock.androidsvg.w.a;
                else
                    p0.C = com.caverock.androidsvg.cy.h(p2);
                p0.a = p0.a | 67108864;
                break;
            case 63:
                p0.D = Float.valueOf(com.caverock.androidsvg.cy.f(p2));
                p0.a = p0.a | 134217728;
                break;
            case 64:
                p0.e = com.caverock.androidsvg.cy.a(p2, "stroke");
                p0.a = p0.a | 8;
                return;
            case 65:
                if ("none".equals(p2))
                    p0.k = 0;
                else
                    p0.k = com.caverock.androidsvg.cy.m(p2);
                p0.a = p0.a | 512;
                return;
            case 66:
                p0.l = com.caverock.androidsvg.cy.c(p2);
                p0.a = p0.a | 1024;
                return;
            case 67:
                if ("butt".equals(p2))
                    v0 = com.caverock.androidsvg.ay.a;
                else if ("round".equals(p2))
                    v0 = com.caverock.androidsvg.ay.b;
                else {
                    if (!"square".equals(p2)) {
                        v0 = String.valueOf(p2);
                        if (v0.length() != 0)
                            v0 = "Invalid stroke-linecap property: ".concat(v0);
                        else
                            v0 = new String("Invalid stroke-linecap property: ");
                        throw new SAXException(v0);
                    }
                    v0 = com.caverock.androidsvg.ay.c;
                }
                p0.h = v0;
                p0.a = p0.a | 64;
                return;
            case 68:
                if ("miter".equals(p2))
                    v0 = com.caverock.androidsvg.az.a;
                else if ("round".equals(p2))
                    v0 = com.caverock.androidsvg.az.b;
                else {
                    if (!"bevel".equals(p2)) {
                        v0 = String.valueOf(p2);
                        if (v0.length() != 0)
                            v0 = "Invalid stroke-linejoin property: ".concat(v0);
                        else
                            v0 = new String("Invalid stroke-linejoin property: ");
                        throw new SAXException(v0);
                    }
                    v0 = com.caverock.androidsvg.az.c;
                }
                p0.i = v0;
                p0.a = p0.a | 128;
                return;
            case 69:
                p0.j = Float.valueOf(com.caverock.androidsvg.cy.e(p2));
                p0.a = p0.a | 256;
                return;
            case 70:
                p0.f = Float.valueOf(com.caverock.androidsvg.cy.f(p2));
                p0.a = p0.a | 16;
                return;
            case 71:
                p0.g = com.caverock.androidsvg.cy.c(p2);
                p0.a = p0.a | 32;
                return;
            case 72:
                break;
            case 73:
                break;
            case 74:
                if ("start".equals(p2))
                    v0 = com.caverock.androidsvg.ba.a;
                else if ("middle".equals(p2))
                    v0 = com.caverock.androidsvg.ba.b;
                else {
                    if (!"end".equals(p2)) {
                        v0 = String.valueOf(p2);
                        if (v0.length() != 0)
                            v0 = "Invalid text-anchor property: ".concat(v0);
                        else
                            v0 = new String("Invalid text-anchor property: ");
                        throw new SAXException(v0);
                    }
                    v0 = com.caverock.androidsvg.ba.c;
                }
                p0.u = v0;
                p0.a = p0.a | 262144;
                return;
            case 75:
                if ("none".equals(p2))
                    v0 = com.caverock.androidsvg.bb.a;
                else if ("underline".equals(p2))
                    v0 = com.caverock.androidsvg.bb.b;
                else if ("overline".equals(p2))
                    v0 = com.caverock.androidsvg.bb.c;
                else if ("line-through".equals(p2))
                    v0 = com.caverock.androidsvg.bb.d;
                else {
                    if (!"blink".equals(p2)) {
                        v0 = String.valueOf(p2);
                        if (v0.length() != 0)
                            v0 = "Invalid text-decoration property: ".concat(v0);
                        else
                            v0 = new String("Invalid text-decoration property: ");
                        throw new SAXException(v0);
                    }
                    v0 = com.caverock.androidsvg.bb.e;
                }
                p0.s = v0;
                p0.a = p0.a | 131072;
                return;
            case 76:
                break;
            case 77:
                break;
            case 78:
                if ("none".equals(p2))
                    v0 = com.caverock.androidsvg.bd.a;
                else {
                    if (!"non-scaling-stroke".equals(p2)) {
                        v0 = String.valueOf(p2);
                        if (v0.length() != 0)
                            v0 = "Invalid vector-effect property: ".concat(v0);
                        else
                            v0 = new String("Invalid vector-effect property: ");
                        throw new SAXException(v0);
                    }
                    v0 = com.caverock.androidsvg.bd.b;
                }
                p0.L = v0;
                p0.a = p0.a | 34359738368;
                return;
            case 79:
                break;
            case 80:
                break;
            case 81:
                break;
            case 82:
                break;
            case 83:
                break;
            case 84:
                break;
            case 85:
                break;
            case 86:
                break;
            case 87:
                break;
            case 88:
                if (p2.equals("currentColor"))
                    p0.J = com.caverock.androidsvg.w.a;
                else
                    p0.J = com.caverock.androidsvg.cy.h(p2);
                p0.a = p0.a | 8589934592;
                return;
            case 89:
                p0.K = Float.valueOf(com.caverock.androidsvg.cy.f(p2));
                p0.a = p0.a | 17179869184;
                return;
            case 90:
                if (p2.indexOf(124) >= 0 || "|visible|hidden|collapse|".indexOf((String.valueOf(p2).length() + 2) + 124 + p2 + 124) == -1) {
                    v0 = String.valueOf(p2);
                    if (v0.length() != 0)
                        v0 = "Invalid value for \"visibility\" attribute: ".concat(v0);
                    else
                        v0 = new String("Invalid value for \"visibility\" attribute: ");
                    throw new SAXException(v0);
                }
                p0.B = Boolean.valueOf(p2.equals("visible"));
                p0.a = p0.a | 33554432;
                return;
            default:
                break;
        }
    }

    private static void a(com.caverock.androidsvg.bf p0, Attributes p1) {
        v0 = 0;
        while (v0 < p1.getLength()) {
            v2 = p1.getValue(v0).trim();
            switch (com.caverock.androidsvg.dd.a(p1.getLocalName(v0)).ordinal()) {
                case 52:
                    v3 = new com.caverock.androidsvg.df(v2);
                    v2 = new HashSet();
                    while (!v3.b()) {
                        v4 = v3.b(32);
                        if (v4.startsWith("http://www.w3.org/TR/SVG11/feature#"))
                            v2.add(v4.substring(35));
                        else
                            v2.add("UNSUPPORTED");
                        v3.c();
                    }
                    p0.a(v2);
                    break;
                case 53:
                    p0.a(v2);
                    break;
                case 54:
                    p0.c(com.caverock.androidsvg.cy.o(v2));
                    break;
                case 55:
                    v3 = com.caverock.androidsvg.cy.i(v2);
                    if (v3 != 0)
                        v2 = new HashSet(v3);
                    else
                        v2 = new HashSet(0);
                    p0.d(v2);
                    break;
                case 73:
                    p0.b(com.caverock.androidsvg.cy.n(v2));
                    break;
                default:
                    break;
            }
            v0 = v0 + 1;
        }
    }

    private static void a(com.caverock.androidsvg.bk p0, Attributes p1) {
        v0 = 0;
        while (true) {
            if (v0 >= p1.getLength())
                return;
            v1 = p1.getQName(v0);
            if (v1.equals("id")) {
                p0.o = p1.getValue(v0).trim();
                return;
            }
            if (v1.equals("xml:id")) {
                p0.o = p1.getValue(v0).trim();
                return;
            }
            if (v1.equals("xml:space"))
                break;
            v0 = v0 + 1;
        }
        v0 = p1.getValue(v0).trim();
        if ("default".equals(v0)) {
            p0.p = Boolean.FALSE;
            return;
        }
        if (!"preserve".equals(v0)) {
            v0 = String.valueOf(v0);
            if (v0.length() != 0)
                v0 = "Invalid value for \"xml:space\" attribute: ".concat(v0);
            else
                v0 = new String("Invalid value for \"xml:space\" attribute: ");
            throw new SAXException(v0);
        }
        p0.p = Boolean.TRUE;
    }

    private static void a(com.caverock.androidsvg.bl p0, Attributes p1) {
        v0 = 0;
        while (v0 < p1.getLength()) {
            v1 = p1.getValue(v0).trim();
            switch (com.caverock.androidsvg.dd.a(p1.getLocalName(v0)).ordinal()) {
                case 84:
                    p0.f = com.caverock.androidsvg.cy.c(v1);
                    break;
                case 85:
                    p0.g = com.caverock.androidsvg.cy.c(v1);
                    break;
                case 86:
                    p0.h = com.caverock.androidsvg.cy.c(v1);
                    break;
                case 87:
                    p0.i = com.caverock.androidsvg.cy.c(v1);
                    break;
                default:
                    break;
            }
            v0 = v0 + 1;
        }
    }

    private static void a(com.caverock.androidsvg.bo p0, String p1) {
        v2 = new com.caverock.androidsvg.df(p1);
        v2.c();
        v1 = 0;
        v0 = v2.b(32);
        if ("defer".equals(v0)) {
            v2.c();
            v0 = v2.b(32);
        }
        v2.c();
        if (v2.b()) {
            p0.v = new com.caverock.androidsvg.m((com.caverock.androidsvg.n)com.caverock.androidsvg.cz.a.get(v0), v1);
            return;
        }
        v1 = v2.b(32);
        if (v1.equals("meet"))
            v1 = com.caverock.androidsvg.o.a;
        else {
            if (!v1.equals("slice")) {
                v0 = String.valueOf(p1);
                if (v0.length() != 0)
                    v0 = "Invalid preserveAspectRatio definition: ".concat(v0);
                else
                    v0 = new String("Invalid preserveAspectRatio definition: ");
                throw new SAXException(v0);
            }
            v1 = com.caverock.androidsvg.o.b;
        }
        p0.v = new com.caverock.androidsvg.m((com.caverock.androidsvg.n)com.caverock.androidsvg.cz.a.get(v0), v1);
    }

    private static void a(com.caverock.androidsvg.bp p0, Attributes p1) {
        v0 = 0;
        while (true) {
            if (v0 >= p1.getLength())
                return;
            v1 = p1.getValue(v0).trim();
            switch (com.caverock.androidsvg.dd.a(p1.getLocalName(v0)).ordinal()) {
                case 6:
                    p0.f = com.caverock.androidsvg.cy.c(v1);
                    break;
                case 7:
                    p0.g = com.caverock.androidsvg.cy.c(v1);
                    break;
                case 11:
                    p0.i = com.caverock.androidsvg.cy.c(v1);
                    break;
                case 12:
                    p0.j = com.caverock.androidsvg.cy.c(v1);
                    break;
                case 49:
                    p0.h = com.caverock.androidsvg.cy.c(v1);
                    if (p0.h.b())
                        throw new SAXException("Invalid <radialGradient> element. r cannot be negative");
                    break;
                default:
                    break;
            }
            v0 = v0 + 1;
        }
    }

    private static void a(com.caverock.androidsvg.bq p0, Attributes p1) {
        v0 = 0;
        while (v0 < p1.getLength()) {
            v1 = p1.getValue(v0).trim();
            switch (com.caverock.androidsvg.dd.a(p1.getLocalName(v0)).ordinal()) {
                case 48:
                    com.caverock.androidsvg.cy.a(p0, v1);
                    break;
                case 80:
                    v2 = new com.caverock.androidsvg.df(v1);
                    v2.c();
                    v1 = v2.e();
                    v2.d();
                    v3 = v2.e();
                    v2.d();
                    v4 = v2.e();
                    v2.d();
                    v2 = v2.e();
                    if ((Float.isNaN(v1)) || (Float.isNaN(v3)) || (Float.isNaN(v4)) || Float.isNaN(v2))
                        throw new SAXException("Invalid viewBox definition - should have four numbers");
                    if (v4 < 0)
                        throw new SAXException("Invalid viewBox. width cannot be negative");
                    if (v2 < 0)
                        throw new SAXException("Invalid viewBox. height cannot be negative");
                    p0.w = new com.caverock.androidsvg.r(v1, v3, v4, v2);
                    break;
                default:
                    break;
            }
            v0 = v0 + 1;
        }
    }

    private static void a(com.caverock.androidsvg.bt p0, Attributes p1) {
        v0 = 0;
        while (v0 < p1.getLength()) {
            switch (com.caverock.androidsvg.dd.a(p1.getLocalName(v0)).ordinal()) {
                case 26:
                    if ("http://www.w3.org/1999/xlink".equals(p1.getURI(v0)))
                        p0.a = p1.getValue(v0).trim();
                    break;
                default:
                    break;
            }
            v0 = v0 + 1;
        }
    }

    private static void a(com.caverock.androidsvg.by p0, Attributes p1) {
        v0 = 0;
        while (v0 < p1.getLength()) {
            v1 = p1.getValue(v0).trim();
            switch (com.caverock.androidsvg.dd.a(p1.getLocalName(v0)).ordinal()) {
                case 26:
                    if ("http://www.w3.org/1999/xlink".equals(p1.getURI(v0)))
                        p0.a = v1;
                    break;
                case 61:
                    p0.b = com.caverock.androidsvg.cy.c(v1);
                    break;
                default:
                    break;
            }
            v0 = v0 + 1;
        }
    }

    private static void a(com.caverock.androidsvg.bz p0, Attributes p1) {
        v0 = 0;
        while (v0 < p1.getLength()) {
            v1 = p1.getValue(v0).trim();
            switch (com.caverock.androidsvg.dd.a(p1.getLocalName(v0)).ordinal()) {
                case 9:
                    p0.d = com.caverock.androidsvg.cy.d(v1);
                    break;
                case 10:
                    p0.e = com.caverock.androidsvg.cy.d(v1);
                    break;
                case 82:
                    p0.b = com.caverock.androidsvg.cy.d(v1);
                    break;
                case 83:
                    p0.c = com.caverock.androidsvg.cy.d(v1);
                    break;
                default:
                    break;
            }
            v0 = v0 + 1;
        }
    }

    private static void a(com.caverock.androidsvg.cd p0, Attributes p1) {
        v0 = 0;
        while (true) {
            if (v0 >= p1.getLength())
                return;
            v1 = p1.getValue(v0).trim();
            switch (com.caverock.androidsvg.dd.a(p1.getLocalName(v0)).ordinal()) {
                case 25:
                    p0.f = com.caverock.androidsvg.cy.c(v1);
                    if (p0.f.b())
                        throw new SAXException("Invalid <use> element. height cannot be negative");
                    break;
                case 26:
                    if ("http://www.w3.org/1999/xlink".equals(p1.getURI(v0)))
                        p0.a = v1;
                    break;
                case 81:
                    p0.e = com.caverock.androidsvg.cy.c(v1);
                    if (p0.e.b())
                        throw new SAXException("Invalid <use> element. width cannot be negative");
                    break;
                case 82:
                    p0.c = com.caverock.androidsvg.cy.c(v1);
                    break;
                case 83:
                    p0.d = com.caverock.androidsvg.cy.c(v1);
                    break;
                default:
                    break;
            }
            v0 = v0 + 1;
        }
    }

    private static void a(com.caverock.androidsvg.t p0, Attributes p1) {
        v0 = 0;
        while (true) {
            if (v0 >= p1.getLength())
                return;
            v1 = p1.getValue(v0).trim();
            switch (com.caverock.androidsvg.dd.a(p1.getLocalName(v0)).ordinal()) {
                case 6:
                    p0.a = com.caverock.androidsvg.cy.c(v1);
                    break;
                case 7:
                    p0.b = com.caverock.androidsvg.cy.c(v1);
                    break;
                case 49:
                    p0.c = com.caverock.androidsvg.cy.c(v1);
                    if (p0.c.b())
                        throw new SAXException("Invalid <circle> element. r cannot be negative");
                    break;
                default:
                    break;
            }
            v0 = v0 + 1;
        }
    }

    private static void a(com.caverock.androidsvg.u p0, Attributes p1) {
        v0 = 0;
        while (true) {
            if (v0 >= p1.getLength())
                return;
            v2 = p1.getValue(v0).trim();
            switch (com.caverock.androidsvg.dd.a(p1.getLocalName(v0)).ordinal()) {
                case 3:
                    if ("objectBoundingBox".equals(v2))
                        p0.a = Boolean.valueOf(0);
                    else {
                        if (!"userSpaceOnUse".equals(v2))
                            throw new SAXException("Invalid value for attribute clipPathUnits");
                        p0.a = Boolean.valueOf(1);
                    }
                    break;
                default:
                    break;
            }
            v0 = v0 + 1;
        }
    }

    private static void a(com.caverock.androidsvg.y p0, Attributes p1) {
        v0 = 0;
        while (true) {
            if (v0 >= p1.getLength())
                return;
            v1 = p1.getValue(v0).trim();
            switch (com.caverock.androidsvg.dd.a(p1.getLocalName(v0)).ordinal()) {
                case 6:
                    p0.a = com.caverock.androidsvg.cy.c(v1);
                    break;
                case 7:
                    p0.b = com.caverock.androidsvg.cy.c(v1);
                    break;
                case 56:
                    p0.c = com.caverock.androidsvg.cy.c(v1);
                    if (p0.c.b())
                        throw new SAXException("Invalid <ellipse> element. rx cannot be negative");
                    break;
                case 57:
                    p0.d = com.caverock.androidsvg.cy.c(v1);
                    if (p0.d.b())
                        throw new SAXException("Invalid <ellipse> element. ry cannot be negative");
                    break;
                default:
                    break;
            }
            v0 = v0 + 1;
        }
    }

    private static void a(com.caverock.androidsvg.z p0, Attributes p1) {
        v0 = 0;
        while (true) {
            if (v0 >= p1.getLength())
                return;
            v2 = p1.getValue(v0).trim();
            switch (com.caverock.androidsvg.dd.a(p1.getLocalName(v0)).ordinal()) {
                case 23:
                    p0.c = com.caverock.androidsvg.cy.b(v2);
                    break;
                case 24:
                    if ("objectBoundingBox".equals(v2))
                        p0.b = Boolean.valueOf(0);
                    else {
                        if (!"userSpaceOnUse".equals(v2))
                            throw new SAXException("Invalid value for attribute gradientUnits");
                        p0.b = Boolean.valueOf(1);
                    }
                    break;
                case 26:
                    if ("http://www.w3.org/1999/xlink".equals(p1.getURI(v0)))
                        p0.e = v2;
                    break;
                case 60:
                    try {
                        p0.d = com.caverock.androidsvg.aa.valueOf(v2);
                    }
                    catch (IllegalArgumentException ex) {
                        throw new SAXException((String.valueOf(v2).length() + 56) + "Invalid spreadMethod attribute. \"" + v2 + "\" is not a valid value.");
                    }
                    break;
                default:
                    break;
            }
            v0 = v0 + 1;
        }
    }

    private final void a(Attributes p0) {
        if (this.b == 0)
            throw new SAXException("Invalid document. Root element must be <svg>");
        v3 = 0;
        v2 = 1;
        v0 = "all";
        while (v3 < p0.getLength()) {
            v1 = p0.getValue(v3).trim();
            switch (com.caverock.androidsvg.dd.a(p0.getLocalName(v3)).ordinal()) {
                case 38:
                    v0 = v1;
                    v1 = v2;
                    break;
                case 77:
                    v1 = v1.equals("text/css");
                    break;
                default:
                    v1 = v2;
                    break;
            }
            v3 = v3 + 1;
            v2 = v1;
        }
        if (v2 != 0 && com.caverock.androidsvg.a.a(v0, com.caverock.androidsvg.f.h))
            this.g = 1;
        else {
            this.c = 1;
            this.d = 1;
        }
    }

    private static Matrix b(String p0) {
        v0 = new Matrix();
        v1 = new com.caverock.androidsvg.df(p0);
        v1.c();
        while (true) {
            if (v1.b())
                return v0;
            v2 = v1.j();
            if (v2 == 0) {
                v0 = String.valueOf(p0);
                if (v0.length() != 0)
                    v0 = "Bad transform function encountered in transform list: ".concat(v0);
                else
                    v0 = new String("Bad transform function encountered in transform list: ");
                throw new SAXException(v0);
            }
            if (v2.equals("matrix")) {
                v1.c();
                v1.d();
                v1.d();
                v1.d();
                v1.d();
                v1.d();
                v7 = v1.e();
                v1.c();
                if ((Float.isNaN(v7)) || !v1.a(41)) {
                    v0 = String.valueOf(p0);
                    if (v0.length() != 0)
                        v0 = "Invalid transform list: ".concat(v0);
                    else
                        v0 = new String("Invalid transform list: ");
                    throw new SAXException(v0);
                }
                v8 = new Matrix();
                v9 = new float[9];
                v9[0] = v1.e();
                v9[1] = v1.e();
                v9[2] = v1.e();
                v9[3] = v1.e();
                v9[4] = v1.e();
                v9[5] = v7;
                v9[6] = 0;
                v9[7] = 0;
                v9[8] = 1065353216;
                v8.setValues(v9);
                v0.preConcat(v8);
            }
            else if (v2.equals("translate")) {
                v1.c();
                v2 = v1.e();
                v3 = v1.f();
                v1.c();
                if ((Float.isNaN(v2)) || !v1.a(41)) {
                    v0 = String.valueOf(p0);
                    if (v0.length() != 0)
                        v0 = "Invalid transform list: ".concat(v0);
                    else
                        v0 = new String("Invalid transform list: ");
                    throw new SAXException(v0);
                }
                if (Float.isNaN(v3))
                    v0.preTranslate(v2, 0);
                else
                    v0.preTranslate(v2, v3);
            }
            else if (v2.equals("scale")) {
                v1.c();
                v2 = v1.e();
                v3 = v1.f();
                v1.c();
                if ((Float.isNaN(v2)) || !v1.a(41)) {
                    v0 = String.valueOf(p0);
                    if (v0.length() != 0)
                        v0 = "Invalid transform list: ".concat(v0);
                    else
                        v0 = new String("Invalid transform list: ");
                    throw new SAXException(v0);
                }
                if (Float.isNaN(v3))
                    v0.preScale(v2, v2);
                else
                    v0.preScale(v2, v3);
            }
            else if (v2.equals("rotate")) {
                v1.c();
                v2 = v1.e();
                v3 = v1.f();
                v4 = v1.f();
                v1.c();
                if ((Float.isNaN(v2)) || !v1.a(41)) {
                    v0 = String.valueOf(p0);
                    if (v0.length() != 0)
                        v0 = "Invalid transform list: ".concat(v0);
                    else
                        v0 = new String("Invalid transform list: ");
                    throw new SAXException(v0);
                }
                if (Float.isNaN(v3))
                    v0.preRotate(v2);
                else {
                    if (Float.isNaN(v4)) {
                        v0 = String.valueOf(p0);
                        if (v0.length() != 0)
                            v0 = "Invalid transform list: ".concat(v0);
                        else
                            v0 = new String("Invalid transform list: ");
                        throw new SAXException(v0);
                    }
                    v0.preRotate(v2, v3, v4);
                }
            }
            else if (v2.equals("skewX")) {
                v1.c();
                v2 = v1.e();
                v1.c();
                if ((Float.isNaN(v2)) || !v1.a(41)) {
                    v0 = String.valueOf(p0);
                    if (v0.length() != 0)
                        v0 = "Invalid transform list: ".concat(v0);
                    else
                        v0 = new String("Invalid transform list: ");
                    throw new SAXException(v0);
                }
                v0.preSkew((float)Math.tan(Math.toRadians((double)v2)), 0);
            }
            else if (v2.equals("skewY")) {
                v1.c();
                v2 = v1.e();
                v1.c();
                if ((Float.isNaN(v2)) || !v1.a(41)) {
                    v0 = String.valueOf(p0);
                    if (v0.length() != 0)
                        v0 = "Invalid transform list: ".concat(v0);
                    else
                        v0 = new String("Invalid transform list: ");
                    throw new SAXException(v0);
                }
                v0.preSkew(0, (float)Math.tan(Math.toRadians((double)v2)));
            }
            else if (v2 != 0)
                throw new SAXException((String.valueOf(v2).length() + 28) + "Invalid transform list fn: " + v2 + ")");
            if (v1.b())
                return v0;
            v1.d();
        }
    }

    private static String b(String p0, String p1) {
        if (p0.equals("none"))
            v0 = 0;
        else {
            if ((!p0.startsWith("url(")) || !p0.endsWith(")"))
                throw new SAXException((String.valueOf(p1).length() + 49) + "Bad " + p1 + " attribute. Expected \"none\" or \"url()\" format");
            v0 = p0.substring(4, p0.length() - 1).trim();
        }
        return v0;
    }

    private static void b(com.caverock.androidsvg.bk p0, Attributes p1) {
        v0 = 0;
        while (v0 < p1.getLength()) {
            v2 = p1.getValue(v0).trim();
            if (v2.length() != 0) {
                switch (com.caverock.androidsvg.dd.a(p1.getLocalName(v0)).ordinal()) {
                    case 0:
                        v3 = new com.caverock.androidsvg.d(v2);
                        v1 = 0;
                        while (!v3.b()) {
                            v4 = v3.a();
                            if (v4 == 0) {
                                v0 = String.valueOf(v2);
                                if (v0.length() != 0)
                                    v0 = "Invalid value for \"class\" attribute: ".concat(v0);
                                else
                                    v0 = new String("Invalid value for \"class\" attribute: ");
                                throw new SAXException(v0);
                            }
                            if (v1 == 0)
                                v1 = new ArrayList();
                            v1.add(v4);
                            v3.c();
                        }
                        p0.s = v1;
                        break;
                    case 72:
                        v1 = new com.caverock.androidsvg.df(v2.replaceAll("/\\*.*?\\*/", ""));
                        while (true) {
                            v1.c();
                            if (!v1.a(58))
                                break;
                            v1.c();
                            v3 = v1.b(59);
                            if (v3 == 0)
                                break;
                            v1.c();
                            if ((v1.b()) || v1.a(59)) {
                                if (p0.r == 0)
                                    p0.r = new com.caverock.androidsvg.av();
                                com.caverock.androidsvg.cy.a(p0.r, v1.b(58), v3);
                                v1.c();
                            }
                        }
                        break;
                    default:
                        if (p0.q == 0)
                            p0.q = new com.caverock.androidsvg.av();
                        com.caverock.androidsvg.cy.a(p0.q, p1.getLocalName(v0), p1.getValue(v0).trim());
                        break;
                }
            }
            v0 = v0 + 1;
        }
    }

    private static com.caverock.androidsvg.af c(String p0) {
        if (p0.length() == 0)
            throw new SAXException("Invalid length value (empty string)");
        v1 = p0.length();
        v0 = com.caverock.androidsvg.cc.a;
        v2 = p0.charAt(v1 - 1);
        if (v2 == 37) {
            v1 = v1 - 1;
            v0 = com.caverock.androidsvg.cc.i;
        }
        else if (v1 > 2 && Character.isLetter(v2) && Character.isLetter(p0.charAt(v1 - 2))) {
            v1 = v1 - 2;
            try {
                v0 = com.caverock.androidsvg.cc.valueOf(p0.substring(v1).toLowerCase(Locale.US));
            }
            catch (IllegalArgumentException ex) {
                v0 = String.valueOf(p0);
                if (v0.length() != 0)
                    v0 = "Invalid length unit specifier: ".concat(v0);
                else
                    v0 = new String("Invalid length unit specifier: ");
                throw new SAXException(v0);
            }
        }
        try {
            return new com.caverock.androidsvg.af(com.caverock.androidsvg.cy.a(p0, v1), v0);
        }
        catch (NumberFormatException ex) {
            v0 = String.valueOf(p0);
            if (v0.length() != 0)
                v0 = "Invalid length value: ".concat(v0);
            else
                v0 = new String("Invalid length value: ");
            throw new SAXException(v0, ex);
        }
    }

    private static List d(String p0) {
        if (p0.length() == 0)
            throw new SAXException("Invalid length list (empty string)");
        v1 = new ArrayList(1);
        v2 = new com.caverock.androidsvg.df(p0);
        v2.c();
        while (!v2.b()) {
            v3 = v2.e();
            if (Float.isNaN(v3)) {
                v0 = String.valueOf(v2.k());
                if (v0.length() != 0)
                    v0 = "Invalid length list value: ".concat(v0);
                else
                    v0 = new String("Invalid length list value: ");
                throw new SAXException(v0);
            }
            v0 = v2.l();
            if (v0 == 0)
                v0 = com.caverock.androidsvg.cc.a;
            v1.add(new com.caverock.androidsvg.af(v3, v0));
            v2.d();
        }
        return v1;
    }

    private static float e(String p0) {
        v0 = p0.length();
        if (v0 == 0)
            throw new SAXException("Invalid float value (empty string)");
        return com.caverock.androidsvg.cy.a(p0, v0);
    }

    private static float f(String p0) {
        v0 = 0;
        v2 = com.caverock.androidsvg.cy.e(p0);
        if (v2 >= 0) {
            if (v2 > 1065353216)
                v0 = 1065353216;
            else
                v0 = v2;
        }
        return v0;
    }

    private static com.caverock.androidsvg.bn g(String p0) {
        if (p0.equals("none"))
            v0 = 0;
        else if (p0.equals("currentColor"))
            v0 = com.caverock.androidsvg.w.a;
        else
            v0 = com.caverock.androidsvg.cy.h(p0);
        return v0;
    }

    private static com.caverock.androidsvg.v h(String p0) {
 15:    if (p0.charAt(0) != 35) {
226:        if (p0.toLowerCase(Locale.US).startsWith("rgb(")) {
235:            v3 = new com.caverock.androidsvg.df(p0.substring(4));
238:            v3.c();
241:            v0 = v3.e();
249:            if (!Float.isNaN(v0) && v3.a(37))
258:                v0 = v0 * 1132462080 / 1120403456;
259:            v1 = v3.a(v0);
267:            if (!Float.isNaN(v1) && v3.a(37))
276:                v1 = v1 * 1132462080 / 1120403456;
277:            v2 = v3.a(v1);
285:            if (!Float.isNaN(v2) && v3.a(37))
294:                v2 = v2 * 1132462080 / 1120403456;
295:            v3.c();
302:            if ((Float.isNaN(v2)) || !v3.a(41)) {
316:                v0 = String.valueOf(p0);
324:                if (v0.length() != 0)
326:                    v0 = "Bad rgb() colour value: ".concat(v0);
                    else
336:                    v0 = new String("Bad rgb() colour value: ");
333:                throw new SAXException(v0);
                }
363:            v0 = new com.caverock.androidsvg.v(com.caverock.androidsvg.cy.a(v0) << 16 | com.caverock.androidsvg.cy.a(v1) << 8 | com.caverock.androidsvg.cy.a(v2));
            }
            else {
378:            v0 = (Integer)com.caverock.androidsvg.da.a.get(p0.toLowerCase(Locale.US));
380:            if (v0 == 0) {
386:                v0 = String.valueOf(p0);
394:                if (v0.length() != 0)
396:                    v0 = "Invalid colour keyword: ".concat(v0);
                    else
406:                    v0 = new String("Invalid colour keyword: ");
403:                throw new SAXException(v0);
                }
419:            v0 = new com.caverock.androidsvg.v(v0.intValue());
            }
364:        return v0;
        }
 17:    v5 = p0.length();
 21:    v2 = 0;
 23:    if (1 < v5) goto 422;
 25:    v1 = 0;
 26:    if (v1 == 0) {
 32:        v0 = String.valueOf(p0);
 40:        if (v0.length() != 0)
 42:            v0 = "Bad hex colour value: ".concat(v0);
            else
135:            v0 = new String("Bad hex colour value: ");
 49:        throw new SAXException(v0);
        }
 27:    goto 139;
 50:    v1 = v1 + 1;
 52:    if (v1 >= v5) goto 122;
 54:    v6 = p0.charAt(v1);
 60:    if (v6 < 48) goto 84;
 64:    if (v6 > 57) goto 84;
 72:    v2 = v2 * 16 + (long)(v6 - 48);
 80:    if (v2 <= 4294967295) goto 50;
 82:    v1 = 0;
 83:    goto 26;
 86:    if (v6 < 65) goto 103;
 90:    if (v6 > 70) goto 103;
101:    v2 = v2 * 16 + (long)(v6 - 65) + 10;
102:    goto 73;
105:    if (v6 < 97) goto 122;
109:    if (v6 > 102) goto 122;
120:    v2 = v2 * 16 + (long)(v6 - 97) + 10;
121:    goto 73;
122:    if (v1 == 1)
124:        v1 = 0;
        else
131:        v1 = new com.caverock.androidsvg.k(v2, v1);
125:    goto 26;
142:    if (v1.a == 7)
149:        v0 = new com.caverock.androidsvg.v((int)v1.b);
        else {
154:        if (v1.a != 4) {
190:            v0 = String.valueOf(p0);
198:            if (v0.length() != 0)
200:                v0 = "Bad hex colour value: ".concat(v0);
                else
210:                v0 = new String("Bad hex colour value: ");
207:            throw new SAXException(v0);
            }
182:        v0 = new com.caverock.androidsvg.v(((int)v1.b & 3840) << 12 | ((int)v1.b & 3840) << 16 | ((int)v1.b & 240) << 8 | ((int)v1.b & 240) << 4 | ((int)v1.b & 15) << 4 | (int)v1.b & 15);
        }
152:    return v0;
422:    v1 = 1;
423:    goto 52;
    }

    private static List i(String p0) {
        v0 = 0;
        v2 = new com.caverock.androidsvg.df(p0);
        while (true) {
            v1 = v2.m();
            if (v1 == 0)
                v1 = v2.b(44);
            if (v1 == 0)
                return v0;
            if (v0 == 0)
                v0 = new ArrayList();
            v0.add(v1);
            v2.d();
            if (v2.b())
                return v0;
        }
    }

    private static com.caverock.androidsvg.af j(String p0) {
        v0 = (com.caverock.androidsvg.af)com.caverock.androidsvg.db.a.get(p0);
        if (v0 == 0)
            v0 = com.caverock.androidsvg.cy.c(p0);
        return v0;
    }

    private static com.caverock.androidsvg.ax k(String p0) {
        if ("italic".equals(p0))
            v0 = com.caverock.androidsvg.ax.b;
        else if ("normal".equals(p0))
            v0 = com.caverock.androidsvg.ax.a;
        else if ("oblique".equals(p0))
            v0 = com.caverock.androidsvg.ax.c;
        else
            v0 = 0;
        return v0;
    }

    private static com.caverock.androidsvg.aw l(String p0) {
        if ("nonzero".equals(p0))
            v0 = com.caverock.androidsvg.aw.a;
        else {
            if (!"evenodd".equals(p0)) {
                v0 = String.valueOf(p0);
                if (v0.length() != 0)
                    v0 = "Invalid fill-rule property: ".concat(v0);
                else
                    v0 = new String("Invalid fill-rule property: ");
                throw new SAXException(v0);
            }
            v0 = com.caverock.androidsvg.aw.b;
        }
        return v0;
    }

    private static af[] m(String p0) {
        v2 = new com.caverock.androidsvg.df(p0);
        v2.c();
        if (v2.b())
            v0 = 0;
        else {
            v3 = v2.h();
            if (v3 == 0)
                v0 = 0;
            else {
                if (v3.b()) {
                    v0 = String.valueOf(p0);
                    if (v0.length() != 0)
                        v0 = "Invalid stroke-dasharray. Dash segemnts cannot be negative: ".concat(v0);
                    else
                        v0 = new String("Invalid stroke-dasharray. Dash segemnts cannot be negative: ");
                    throw new SAXException(v0);
                }
                v0 = v3.a;
                v4 = new ArrayList();
                v4.add(v3);
                while (!v2.b()) {
                    v2.d();
                    v3 = v2.h();
                    if (v3 == 0) {
                        v0 = String.valueOf(p0);
                        if (v0.length() != 0)
                            v0 = "Invalid stroke-dasharray. Non-Length content found: ".concat(v0);
                        else
                            v0 = new String("Invalid stroke-dasharray. Non-Length content found: ");
                        throw new SAXException(v0);
                    }
                    if (v3.b()) {
                        v0 = String.valueOf(p0);
                        if (v0.length() != 0)
                            v0 = "Invalid stroke-dasharray. Dash segemnts cannot be negative: ".concat(v0);
                        else
                            v0 = new String("Invalid stroke-dasharray. Dash segemnts cannot be negative: ");
                        throw new SAXException(v0);
                    }
                    v4.add(v3);
                    v0 = v0 + v3.a;
                }
                if (v0 == 0)
                    v0 = 0;
                else
                    v0 = (af[])v4.toArray(new af[v4.size()]);
            }
        }
        return v0;
    }

    private static Set n(String p0) {
        v1 = new com.caverock.androidsvg.df(p0);
        v2 = new HashSet();
        while (!v1.b()) {
            v0 = v1.b(32);
            v3 = v0.indexOf(45);
            if (v3 != -1)
                v0 = v0.substring(0, v3);
            v2.add(new Locale(v0, "", "").getLanguage());
            v1.c();
        }
        return v2;
    }

    private static Set o(String p0) {
        v0 = new com.caverock.androidsvg.df(p0);
        v1 = new HashSet();
        while (!v0.b()) {
            v1.add(v0.b(32));
            v0.c();
        }
        return v1;
    }

    protected final com.caverock.androidsvg.q a(InputStream p0) {
  4:    if (!p0.markSupported())
  8:        v1 = new BufferedInputStream(p0);
        else
154:        v1 = p0;
 12:    v1.mark(3);
 26:    v1.reset();
 32:    if (v1.read() + (v1.read() << 8) != 35615) goto 78;
 36:    v0 = new GZIPInputStream(v1);
 39:    v1 = SAXParserFactory.newInstance();
 44:    v1.setNamespaceAware(1);
 47:    try {
 51:        v1 = v1.newSAXParser().getXMLReader();
 55:        v1.setContentHandler(this);
 60:        v1.setProperty("http://xml.org/sax/properties/lexical-handler", this);
 68:        v1.parse(new InputSource(v0));
        }
        catch (IOException ex) {
 90:        try {
 97:            throw new SVGParseException("File error", ex);
            }
            catch (Throwable ex) {
 99:            try {
 99:                v0.close();
                }
                catch (IOException ex) {
150:                Log.e("SVGParser", "Exception thrown closing input stream");
                }
102:            throw ex;
            }
 99:        try {
 99:            v0.close();
            }
            catch (IOException ex) {
150:            Log.e("SVGParser", "Exception thrown closing input stream");
            }
102:        throw ex;
        }
        catch (ParserConfigurationException ex) {
111:        throw new SVGParseException("XML Parser problem", ex);
        }
        catch (SAXException ex) {
121:        v2 = String.valueOf(ex.getMessage());
129:        if (v2.length() != 0)
131:            v2 = "SVG parse error: ".concat(v2);
            else
141:            v2 = new String("SVG parse error: ");
138:        throw new SVGParseException(v2, ex);
        }
        catch (Throwable ex) {
 99:        try {
 99:            v0.close();
            }
            catch (IOException ex) {
150:            Log.e("SVGParser", "Exception thrown closing input stream");
            }
102:        throw ex;
        }
 71:    try {
 71:        v0.close();
        }
        catch (IOException ex) {
 85:        Log.e("SVGParser", "Exception thrown closing input stream");
        }
 76:    return this.a;
 78:    v0 = v1;
 79:    goto 39;
 90:    try {
 97:        throw new SVGParseException("File error", ex);
        }
        catch (Throwable ex) {
 99:        try {
 99:            v0.close();
            }
            catch (IOException ex) {
150:            Log.e("SVGParser", "Exception thrown closing input stream");
            }
102:        throw ex;
        }
104:    try {
111:        throw new SVGParseException("XML Parser problem", ex);
        }
        catch (Throwable ex) {
 99:        try {
 99:            v0.close();
            }
            catch (IOException ex) {
150:            Log.e("SVGParser", "Exception thrown closing input stream");
            }
102:        throw ex;
        }
161:    try
            run 12...39
        catch (IOException ex) {
 12:        goto 77;
        }
    }

    public final void characters(char[] p0, int p1, int p2) {
        if (this.c == 0) {
            if (this.e != 0) {
                if (this.f == 0)
                    this.f = new StringBuilder(p2);
                this.f.append(p0, p1, p2);
            }
            else if (this.g != 0) {
                if (this.h == 0)
                    this.h = new StringBuilder(p2);
                this.h.append(p0, p1, p2);
            }
            else if (this.b instanceof com.caverock.androidsvg.bx) {
                v1 = ((com.caverock.androidsvg.bg)this.b).i.size();
                if (v1 == 0)
                    v0 = 0;
                else
                    v0 = (com.caverock.androidsvg.bm)((com.caverock.androidsvg.bg)this.b).i.get(v1 - 1);
                if (v0 instanceof com.caverock.androidsvg.cb) {
                    v2 = String.valueOf(((com.caverock.androidsvg.cb)v0).a);
                    v1 = String.valueOf(new String(p0, p1, p2));
                    if (v1.length() != 0)
                        v1 = v2.concat(v1);
                    else
                        v1 = new String(v2);
                    ((com.caverock.androidsvg.cb)v0).a = v1;
                }
                else
                    ((com.caverock.androidsvg.bg)this.b).a(new com.caverock.androidsvg.cb(new String(p0, p1, p2)));
            }
        }
    }

    public final void comment(char[] p0, int p1, int p2) {
        if (this.c == 0 && this.g != 0) {
            if (this.h == 0)
                this.h = new StringBuilder(p2);
            this.h.append(p0, p1, p2);
        }
    }

    public final void endDocument() {
    }

    public final void endElement(String p0, String p1, String p2) {
        if (this.c != 0) {
            this.d = this.d - 1;
            if (!(this.d - 1)) {
                this.c = 0;
                return;
            }
        }
        if (!"http://www.w3.org/2000/svg".equals(p0) && (!"".equals(p0)))
            return;
        switch (com.caverock.androidsvg.de.a(p1).ordinal()) {
            case 0:
                this.b = ((com.caverock.androidsvg.bm)this.b).u;
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                this.b = ((com.caverock.androidsvg.bm)this.b).u;
                break;
            case 4:
                this.b = ((com.caverock.androidsvg.bm)this.b).u;
                break;
            case 5:
                this.e = 0;
                this.f.setLength(0);
                break;
            case 6:
                break;
            case 7:
                this.b = ((com.caverock.androidsvg.bm)this.b).u;
                break;
            case 8:
                this.b = ((com.caverock.androidsvg.bm)this.b).u;
                break;
            case 9:
                break;
            case 10:
                this.b = ((com.caverock.androidsvg.bm)this.b).u;
                break;
            case 11:
                this.b = ((com.caverock.androidsvg.bm)this.b).u;
                break;
            case 12:
                this.b = ((com.caverock.androidsvg.bm)this.b).u;
                break;
            case 13:
                break;
            case 14:
                this.b = ((com.caverock.androidsvg.bm)this.b).u;
                break;
            case 15:
                break;
            case 16:
                break;
            case 17:
                this.b = ((com.caverock.androidsvg.bm)this.b).u;
                break;
            case 18:
                break;
            case 19:
                this.b = ((com.caverock.androidsvg.bm)this.b).u;
                break;
            case 20:
                this.b = ((com.caverock.androidsvg.bm)this.b).u;
                break;
            case 21:
                if (this.h != 0) {
                    this.g = 0;
                    v3 = new com.caverock.androidsvg.d(this.h.toString());
                    v3.c();
                    this.a.e.a(new com.caverock.androidsvg.a(com.caverock.androidsvg.f.h).a(v3));
                    this.h.setLength(0);
                }
                break;
            case 22:
                this.b = ((com.caverock.androidsvg.bm)this.b).u;
                break;
            case 23:
                this.b = ((com.caverock.androidsvg.bm)this.b).u;
                break;
            case 24:
                this.b = ((com.caverock.androidsvg.bm)this.b).u;
                break;
            case 25:
                this.b = ((com.caverock.androidsvg.bm)this.b).u;
                break;
            case 26:
                this.e = 0;
                this.f.setLength(0);
                break;
            case 27:
                break;
            case 28:
                this.b = ((com.caverock.androidsvg.bm)this.b).u;
                break;
            case 29:
                this.b = ((com.caverock.androidsvg.bm)this.b).u;
                break;
            case 30:
                this.b = ((com.caverock.androidsvg.bm)this.b).u;
                break;
            default:
                break;
        }
    }

    public final void startDocument() {
        this.a = new com.caverock.androidsvg.q();
    }

    public final void startElement(String p0, String p1, String p2, Attributes p3) {
        if (this.c != 0) {
            this.d = this.d + 1;
            return;
        }
        if (!"http://www.w3.org/2000/svg".equals(p0) && (!"".equals(p0)))
            return;
        switch (com.caverock.androidsvg.de.a(p1).ordinal()) {
            case 0:
                v1 = new com.caverock.androidsvg.be();
                v1.t = this.a;
                v1.u = this.b;
                com.caverock.androidsvg.cy.a(v1, p3);
                com.caverock.androidsvg.cy.b(v1, p3);
                com.caverock.androidsvg.cy.a(v1, p3);
                com.caverock.androidsvg.cy.a(v1, p3);
                v0 = 0;
                while (v0 < p3.getLength()) {
                    v2 = p3.getValue(v0).trim();
                    switch (com.caverock.androidsvg.dd.a(p3.getLocalName(v0)).ordinal()) {
                        case 25:
                            v1.d = com.caverock.androidsvg.cy.c(v2);
                            if (v1.d.b())
                                throw new SAXException("Invalid <svg> element. height cannot be negative");
                            break;
                        case 81:
                            v1.c = com.caverock.androidsvg.cy.c(v2);
                            if (v1.c.b())
                                throw new SAXException("Invalid <svg> element. width cannot be negative");
                            break;
                        case 82:
                            v1.a = com.caverock.androidsvg.cy.c(v2);
                            break;
                        case 83:
                            v1.b = com.caverock.androidsvg.cy.c(v2);
                            break;
                        default:
                            break;
                    }
                    v0 = v0 + 1;
                }
                if (this.b == 0)
                    this.a.b = v1;
                else
                    this.b.a(v1);
                this.b = v1;
                break;
            case 1:
                if (this.b == 0)
                    throw new SAXException("Invalid document. Root element must be <svg>");
                v0 = new com.caverock.androidsvg.ac();
                v0.t = this.a;
                v0.u = this.b;
                com.caverock.androidsvg.cy.a(v0, p3);
                com.caverock.androidsvg.cy.b(v0, p3);
                com.caverock.androidsvg.cy.a(v0, p3);
                com.caverock.androidsvg.cy.a(v0, p3);
                this.b.a(v0);
                this.b = v0;
                break;
            case 2:
                if (this.b == 0)
                    throw new SAXException("Invalid document. Root element must be <svg>");
                v0 = new com.caverock.androidsvg.t();
                v0.t = this.a;
                v0.u = this.b;
                com.caverock.androidsvg.cy.a(v0, p3);
                com.caverock.androidsvg.cy.b(v0, p3);
                com.caverock.androidsvg.cy.a(v0, p3);
                com.caverock.androidsvg.cy.a(v0, p3);
                com.caverock.androidsvg.cy.a(v0, p3);
                this.b.a(v0);
                break;
            case 3:
                if (this.b == 0)
                    throw new SAXException("Invalid document. Root element must be <svg>");
                v0 = new com.caverock.androidsvg.u();
                v0.t = this.a;
                v0.u = this.b;
                com.caverock.androidsvg.cy.a(v0, p3);
                com.caverock.androidsvg.cy.b(v0, p3);
                com.caverock.androidsvg.cy.a(v0, p3);
                com.caverock.androidsvg.cy.a(v0, p3);
                com.caverock.androidsvg.cy.a(v0, p3);
                this.b.a(v0);
                this.b = v0;
                break;
            case 4:
                if (this.b == 0)
                    throw new SAXException("Invalid document. Root element must be <svg>");
                v0 = new com.caverock.androidsvg.x();
                v0.t = this.a;
                v0.u = this.b;
                com.caverock.androidsvg.cy.a(v0, p3);
                com.caverock.androidsvg.cy.b(v0, p3);
                com.caverock.androidsvg.cy.a(v0, p3);
                this.b.a(v0);
                this.b = v0;
                break;
            case 5:
                this.e = 1;
                break;
            case 6:
                if (this.b == 0)
                    throw new SAXException("Invalid document. Root element must be <svg>");
                v0 = new com.caverock.androidsvg.y();
                v0.t = this.a;
                v0.u = this.b;
                com.caverock.androidsvg.cy.a(v0, p3);
                com.caverock.androidsvg.cy.b(v0, p3);
                com.caverock.androidsvg.cy.a(v0, p3);
                com.caverock.androidsvg.cy.a(v0, p3);
                com.caverock.androidsvg.cy.a(v0, p3);
                this.b.a(v0);
                break;
            case 7:
                if (this.b == 0)
                    throw new SAXException("Invalid document. Root element must be <svg>");
                v0 = new com.caverock.androidsvg.ac();
                v0.t = this.a;
                v0.u = this.b;
                com.caverock.androidsvg.cy.a(v0, p3);
                com.caverock.androidsvg.cy.b(v0, p3);
                com.caverock.androidsvg.cy.a(v0, p3);
                com.caverock.androidsvg.cy.a(v0, p3);
                this.b.a(v0);
                this.b = v0;
                break;
            case 8:
                if (this.b == 0)
                    throw new SAXException("Invalid document. Root element must be <svg>");
                v0 = new com.caverock.androidsvg.ae();
                v0.t = this.a;
                v0.u = this.b;
                com.caverock.androidsvg.cy.a(v0, p3);
                com.caverock.androidsvg.cy.b(v0, p3);
                com.caverock.androidsvg.cy.a(v0, p3);
                com.caverock.androidsvg.cy.a(v0, p3);
                com.caverock.androidsvg.cy.a(v0, p3);
                this.b.a(v0);
                this.b = v0;
                break;
            case 9:
                if (this.b == 0)
                    throw new SAXException("Invalid document. Root element must be <svg>");
                v0 = new com.caverock.androidsvg.ag();
                v0.t = this.a;
                v0.u = this.b;
                com.caverock.androidsvg.cy.a(v0, p3);
                com.caverock.androidsvg.cy.b(v0, p3);
                com.caverock.androidsvg.cy.a(v0, p3);
                com.caverock.androidsvg.cy.a(v0, p3);
                com.caverock.androidsvg.cy.a(v0, p3);
                this.b.a(v0);
                break;
            case 10:
                if (this.b == 0)
                    throw new SAXException("Invalid document. Root element must be <svg>");
                v0 = new com.caverock.androidsvg.bl();
                v0.t = this.a;
                v0.u = this.b;
                com.caverock.androidsvg.cy.a(v0, p3);
                com.caverock.androidsvg.cy.b(v0, p3);
                com.caverock.androidsvg.cy.a(v0, p3);
                com.caverock.androidsvg.cy.a(v0, p3);
                this.b.a(v0);
                this.b = v0;
                break;
            case 11:
                if (this.b == 0)
                    throw new SAXException("Invalid document. Root element must be <svg>");
                v0 = new com.caverock.androidsvg.ah();
                v0.t = this.a;
                v0.u = this.b;
                com.caverock.androidsvg.cy.a(v0, p3);
                com.caverock.androidsvg.cy.b(v0, p3);
                com.caverock.androidsvg.cy.a(v0, p3);
                com.caverock.androidsvg.cy.a(v0, p3);
                com.caverock.androidsvg.cy.a(v0, p3);
                this.b.a(v0);
                this.b = v0;
                break;
            case 12:
                if (this.b == 0)
                    throw new SAXException("Invalid document. Root element must be <svg>");
                v0 = new com.caverock.androidsvg.ai();
                v0.t = this.a;
                v0.u = this.b;
                com.caverock.androidsvg.cy.a(v0, p3);
                com.caverock.androidsvg.cy.b(v0, p3);
                com.caverock.androidsvg.cy.a(v0, p3);
                com.caverock.androidsvg.cy.a(v0, p3);
                this.b.a(v0);
                this.b = v0;
                break;
            case 13:
                if (this.b == 0)
                    throw new SAXException("Invalid document. Root element must be <svg>");
                v0 = new com.caverock.androidsvg.al();
                v0.t = this.a;
                v0.u = this.b;
                com.caverock.androidsvg.cy.a(v0, p3);
                com.caverock.androidsvg.cy.b(v0, p3);
                com.caverock.androidsvg.cy.a(v0, p3);
                com.caverock.androidsvg.cy.a(v0, p3);
                com.caverock.androidsvg.cy.a(v0, p3);
                this.b.a(v0);
                break;
            case 14:
                if (this.b == 0)
                    throw new SAXException("Invalid document. Root element must be <svg>");
                v0 = new com.caverock.androidsvg.ao();
                v0.t = this.a;
                v0.u = this.b;
                com.caverock.androidsvg.cy.a(v0, p3);
                com.caverock.androidsvg.cy.b(v0, p3);
                com.caverock.androidsvg.cy.a(v0, p3);
                com.caverock.androidsvg.cy.a(v0, p3);
                com.caverock.androidsvg.cy.a(v0, p3);
                this.b.a(v0);
                this.b = v0;
                break;
            case 15:
                if (this.b == 0)
                    throw new SAXException("Invalid document. Root element must be <svg>");
                v0 = new com.caverock.androidsvg.aq();
                v0.t = this.a;
                v0.u = this.b;
                com.caverock.androidsvg.cy.a(v0, p3);
                com.caverock.androidsvg.cy.b(v0, p3);
                com.caverock.androidsvg.cy.a(v0, p3);
                com.caverock.androidsvg.cy.a(v0, p3);
                com.caverock.androidsvg.cy.a(v0, p3, "polygon");
                this.b.a(v0);
                break;
            case 16:
                if (this.b == 0)
                    throw new SAXException("Invalid document. Root element must be <svg>");
                v0 = new com.caverock.androidsvg.ap();
                v0.t = this.a;
                v0.u = this.b;
                com.caverock.androidsvg.cy.a(v0, p3);
                com.caverock.androidsvg.cy.b(v0, p3);
                com.caverock.androidsvg.cy.a(v0, p3);
                com.caverock.androidsvg.cy.a(v0, p3);
                com.caverock.androidsvg.cy.a(v0, p3, "polyline");
                this.b.a(v0);
                break;
            case 17:
                if (this.b == 0)
                    throw new SAXException("Invalid document. Root element must be <svg>");
                v0 = new com.caverock.androidsvg.bp();
                v0.t = this.a;
                v0.u = this.b;
                com.caverock.androidsvg.cy.a(v0, p3);
                com.caverock.androidsvg.cy.b(v0, p3);
                com.caverock.androidsvg.cy.a(v0, p3);
                com.caverock.androidsvg.cy.a(v0, p3);
                this.b.a(v0);
                this.b = v0;
                break;
            case 18:
                if (this.b == 0)
                    throw new SAXException("Invalid document. Root element must be <svg>");
                v0 = new com.caverock.androidsvg.ar();
                v0.t = this.a;
                v0.u = this.b;
                com.caverock.androidsvg.cy.a(v0, p3);
                com.caverock.androidsvg.cy.b(v0, p3);
                com.caverock.androidsvg.cy.a(v0, p3);
                com.caverock.androidsvg.cy.a(v0, p3);
                com.caverock.androidsvg.cy.a(v0, p3);
                this.b.a(v0);
                break;
            case 19:
                if (this.b == 0)
                    throw new SAXException("Invalid document. Root element must be <svg>");
                v0 = new com.caverock.androidsvg.at();
                v0.t = this.a;
                v0.u = this.b;
                com.caverock.androidsvg.cy.a(v0, p3);
                com.caverock.androidsvg.cy.b(v0, p3);
                this.b.a(v0);
                this.b = v0;
                break;
            case 20:
                if (this.b == 0)
                    throw new SAXException("Invalid document. Root element must be <svg>");
                if (!(this.b instanceof com.caverock.androidsvg.z))
                    throw new SAXException("Invalid document. <stop> elements are only valid inside <linearGradiant> or <radialGradient> elements.");
                v0 = new com.caverock.androidsvg.au();
                v0.t = this.a;
                v0.u = this.b;
                com.caverock.androidsvg.cy.a(v0, p3);
                com.caverock.androidsvg.cy.b(v0, p3);
                com.caverock.androidsvg.cy.a(v0, p3);
                this.b.a(v0);
                this.b = v0;
                break;
            case 21:
                this.a(p3);
                break;
            case 22:
                if (this.b == 0)
                    throw new SAXException("Invalid document. Root element must be <svg>");
                v0 = new com.caverock.androidsvg.br();
                v0.t = this.a;
                v0.u = this.b;
                com.caverock.androidsvg.cy.a(v0, p3);
                com.caverock.androidsvg.cy.b(v0, p3);
                com.caverock.androidsvg.cy.a(v0, p3);
                com.caverock.androidsvg.cy.a(v0, p3);
                this.b.a(v0);
                this.b = v0;
                break;
            case 23:
                if (this.b == 0)
                    throw new SAXException("Invalid document. Root element must be <svg>");
                v0 = new com.caverock.androidsvg.bs();
                v0.t = this.a;
                v0.u = this.b;
                com.caverock.androidsvg.cy.a(v0, p3);
                com.caverock.androidsvg.cy.b(v0, p3);
                com.caverock.androidsvg.cy.a(v0, p3);
                com.caverock.androidsvg.cy.a(v0, p3);
                this.b.a(v0);
                this.b = v0;
                break;
            case 24:
                if (this.b == 0)
                    throw new SAXException("Invalid document. Root element must be <svg>");
                v0 = new com.caverock.androidsvg.bv();
                v0.t = this.a;
                v0.u = this.b;
                com.caverock.androidsvg.cy.a(v0, p3);
                com.caverock.androidsvg.cy.b(v0, p3);
                com.caverock.androidsvg.cy.a(v0, p3);
                com.caverock.androidsvg.cy.a(v0, p3);
                com.caverock.androidsvg.cy.a(v0, p3);
                this.b.a(v0);
                this.b = v0;
                break;
            case 25:
                if (this.b == 0)
                    throw new SAXException("Invalid document. Root element must be <svg>");
                v1 = new com.caverock.androidsvg.by();
                v1.t = this.a;
                v1.u = this.b;
                com.caverock.androidsvg.cy.a(v1, p3);
                com.caverock.androidsvg.cy.b(v1, p3);
                com.caverock.androidsvg.cy.a(v1, p3);
                com.caverock.androidsvg.cy.a(v1, p3);
                this.b.a(v1);
                this.b = v1;
                if (v1.u instanceof com.caverock.androidsvg.ca)
                    v1.c = (com.caverock.androidsvg.ca)v1.u;
                else
                    v1.c = ((com.caverock.androidsvg.bw)v1.u).g();
                break;
            case 26:
                this.e = 1;
                break;
            case 27:
                if (this.b == 0)
                    throw new SAXException("Invalid document. Root element must be <svg>");
                if (!(this.b instanceof com.caverock.androidsvg.bx))
                    throw new SAXException("Invalid document. <tref> elements are only valid inside <text> or <tspan> elements.");
                v1 = new com.caverock.androidsvg.bt();
                v1.t = this.a;
                v1.u = this.b;
                com.caverock.androidsvg.cy.a(v1, p3);
                com.caverock.androidsvg.cy.b(v1, p3);
                com.caverock.androidsvg.cy.a(v1, p3);
                com.caverock.androidsvg.cy.a(v1, p3);
                this.b.a(v1);
                if (v1.u instanceof com.caverock.androidsvg.ca)
                    v1.b = (com.caverock.androidsvg.ca)v1.u;
                else
                    v1.b = ((com.caverock.androidsvg.bw)v1.u).g();
                break;
            case 28:
                if (this.b == 0)
                    throw new SAXException("Invalid document. Root element must be <svg>");
                if (!(this.b instanceof com.caverock.androidsvg.bx))
                    throw new SAXException("Invalid document. <tspan> elements are only valid inside <text> or other <tspan> elements.");
                v1 = new com.caverock.androidsvg.bu();
                v1.t = this.a;
                v1.u = this.b;
                com.caverock.androidsvg.cy.a(v1, p3);
                com.caverock.androidsvg.cy.b(v1, p3);
                com.caverock.androidsvg.cy.a(v1, p3);
                com.caverock.androidsvg.cy.a(v1, p3);
                this.b.a(v1);
                this.b = v1;
                if (v1.u instanceof com.caverock.androidsvg.ca)
                    v1.a = (com.caverock.androidsvg.ca)v1.u;
                else
                    v1.a = ((com.caverock.androidsvg.bw)v1.u).g();
                break;
            case 29:
                if (this.b == 0)
                    throw new SAXException("Invalid document. Root element must be <svg>");
                v0 = new com.caverock.androidsvg.cd();
                v0.t = this.a;
                v0.u = this.b;
                com.caverock.androidsvg.cy.a(v0, p3);
                com.caverock.androidsvg.cy.b(v0, p3);
                com.caverock.androidsvg.cy.a(v0, p3);
                com.caverock.androidsvg.cy.a(v0, p3);
                com.caverock.androidsvg.cy.a(v0, p3);
                this.b.a(v0);
                this.b = v0;
                break;
            case 30:
                if (this.b == 0)
                    throw new SAXException("Invalid document. Root element must be <svg>");
                v0 = new com.caverock.androidsvg.ce();
                v0.t = this.a;
                v0.u = this.b;
                com.caverock.androidsvg.cy.a(v0, p3);
                com.caverock.androidsvg.cy.a(v0, p3);
                com.caverock.androidsvg.cy.a(v0, p3);
                this.b.a(v0);
                this.b = v0;
                break;
            default:
                this.c = 1;
                this.d = 1;
                return;
        }
    }

}
