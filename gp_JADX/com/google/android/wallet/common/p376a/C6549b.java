package com.google.android.wallet.common.p376a;

import android.text.TextUtils;
import android.util.Log;
import android.util.SparseBooleanArray;
import com.google.p440g.p441a.p442a.C7147b;
import com.squareup.haha.perflib.HprofParser;
import java.util.regex.Pattern;

public final class C6549b {
    public static final Pattern f32643a = Pattern.compile("^[\\-,\\s]+|[\\-,\\s]+$");

    public static String m29724a(C7147b c7147b, String str, char[] cArr, char[] cArr2) {
        String str2;
        SparseBooleanArray sparseBooleanArray;
        if (str == null) {
            str = "\n";
        }
        if (cArr == null && cArr2 != null && cArr2.length > 0) {
            cArr = C6548a.m29721a();
        }
        int b = C6563p.m29794b(c7147b.f34899a);
        if (b == 0) {
            b = 858;
        }
        String str3 = c7147b.f34902d;
        boolean a = C6553f.m29735a(b, str3);
        switch (b) {
            case 36:
            case 65:
            case 71:
            case 114:
            case 121:
            case 122:
            case 133:
            case HprofParser.ROOT_DEBUGGER /*139*/:
            case 143:
            case 154:
            case 165:
            case 168:
            case 180:
            case 229:
            case 236:
            case 242:
            case 247:
            case 307:
            case 375:
            case 385:
            case 417:
            case 421:
            case 423:
            case 427:
            case 453:
            case 463:
            case 524:
            case 532:
            case 537:
            case 591:
            case 595:
            case 618:
            case 619:
            case 621:
            case 622:
            case 650:
            case 653:
            case 654:
            case 666:
            case 705:
            case 779:
            case 845:
                str2 = "%N%n%O%n%A%n%Z %C";
                break;
            case 37:
            case 466:
                str2 = "%N%n%O%n%A%n%S";
                break;
            case 45:
                str2 = "%N%n%O%n%A%n%Z%n%C%n%S";
                break;
            case 50:
            case 118:
            case 698:
                str2 = "%N%n%O%n%A%n%Z %C%n%S";
                break;
            case 51:
            case 97:
            case 205:
            case 245:
            case 424:
            case 432:
            case 535:
            case 685:
            case 713:
                str2 = "%N%n%O%n%A%n%C %S %Z";
                break;
            case 52:
            case 69:
            case 460:
                str2 = "%O%n%N%n%A%n%Z %C";
                break;
            case 53:
            case 99:
            case 120:
            case 269:
            case 454:
                str2 = "%O%n%N%n%A%n%C %S %Z";
                break;
            case 56:
                str2 = "%O%n%N%n%A%nAX-%Z %C%nÅLAND";
                break;
            case 58:
                str2 = "%N%n%O%n%A%nAZ %Z %C";
                break;
            case 68:
                str2 = "%N%n%O%n%A%n%C - %Z";
                break;
            case 70:
            case 100:
            case 439:
            case 628:
                str2 = "%N%n%O%n%A%n%C %X";
                break;
            case 72:
            case 77:
            case 78:
            case 300:
            case 335:
            case 360:
            case 386:
            case 403:
            case 436:
            case 438:
            case 464:
            case 609:
                str2 = "%N%n%O%n%A%n%C %Z";
                break;
            case 76:
            case 210:
            case 230:
            case 240:
            case 422:
            case 433:
            case 451:
            case 525:
            case 581:
            case 742:
            case 820:
                str2 = "%O%n%N%n%A%n%Z %C %X";
                break;
            case 82:
                str2 = "%O%n%N%n%A%n%D%n%C-%S%n%Z";
                break;
            case 83:
            case 366:
                str2 = "%N%n%O%n%A%n%C, %S";
                break;
            case 89:
                str2 = "%S%n%Z %C %X%n%A%n%O%n%N";
                break;
            case 104:
                str2 = "%O%n%N%n%A%nCH-%Z %C";
                break;
            case 105:
                str2 = "%N%n%O%n%X %A %C %X";
                break;
            case 108:
                str2 = "%N%n%O%n%A%n%Z %C%n%D%n%S";
                break;
            case 110:
                if (!a) {
                    str2 = "%Z%n%S%C%D%n%A%n%O%n%N";
                    break;
                }
                str2 = "%N%n%O%n%A%n%D%n%C%n%S, %Z";
                break;
            case 111:
                str2 = "%N%n%O%n%A%n%C, %S, %Z";
                break;
            case 163:
            case 437:
            case 493:
                str2 = "%N%n%O%n%A%n%Z%n%C";
                break;
            case 167:
            case 226:
            case 597:
            case 673:
                str2 = "%N%n%O%n%A%n%C%n%S%n%Z";
                break;
            case 179:
            case 308:
            case 518:
            case 697:
                str2 = "%N%n%O%n%A%n%Z %C %S";
                break;
            case 201:
                str2 = "%O%n%N%n%A%nFI-%Z %C";
                break;
            case 203:
            case 243:
            case 301:
            case 303:
            case 526:
            case 616:
            case 643:
                str2 = "%N%n%O%n%A%n%X%n%C%n%Z";
                break;
            case 207:
                str2 = "%N%n%O%n%A%nFO%Z %C";
                break;
            case 231:
                str2 = "%N%n%O%n%A%n%X%n%C%nGUERNSEY%n%Z";
                break;
            case 233:
                str2 = "%N%n%O%n%A%nGIBRALTAR%n%Z";
                break;
            case 238:
                str2 = "%N%n%O%n%Z %A %C";
                break;
            case 244:
                str2 = "%N%n%O%n%A%n%Z- %C";
                break;
            case 267:
                if (!a) {
                    str2 = "%S%n%C%n%A%n%O%n%N";
                    break;
                }
                str2 = "%N%n%O%n%A%n%C%n%S";
                break;
            case 270:
                str2 = "%N%n%O%n%A%n%C, %S%n%Z";
                break;
            case 274:
                str2 = "%N%n%O%n%A%nHR-%Z %C";
                break;
            case 276:
                str2 = "%N%n%O%n%A%nHT%Z %C %X";
                break;
            case 277:
                str2 = "%N%n%O%n%C%n%A%n%Z";
                break;
            case 292:
            case 718:
                str2 = "%N%n%O%n%A%n%C%n%S %Z";
                break;
            case 293:
            case 513:
            case 611:
                str2 = "%N%n%O%n%A%n%C%n%S";
                break;
            case 302:
            case 455:
                str2 = "%N%n%O%n%A%n%C %Z%n%S";
                break;
            case 305:
                str2 = "%O%n%N%n%A%n%C, %S%n%Z";
                break;
            case 306:
                str2 = "%O%n%N%n%S%n%C, %D%n%A%n%Z";
                break;
            case 325:
                str2 = "%N%n%O%n%A%n%X%n%C%nJERSEY%n%Z";
                break;
            case 333:
                str2 = "%N%n%O%n%A%n%C%n%S %X";
                break;
            case 336:
                if (!a) {
                    str2 = "〒%Z%n%S%C%n%A%n%O%n%N";
                    break;
                }
                str2 = "%N%n%O%n%A%n%C, %S%n%Z";
                break;
            case 357:
            case 395:
            case 634:
            case 711:
                str2 = "%N%n%O%n%A%n%C%n%Z";
                break;
            case 359:
                str2 = "%Z %C %X%n%A%n%O%n%N";
                break;
            case 361:
                str2 = "%N%n%O%n%A%n%S%n%C";
                break;
            case 370:
                if (!a) {
                    str2 = "%S %C%D%n%A%n%O%n%N%n%Z";
                    break;
                }
                str2 = "%N%n%O%n%A%n%D%n%C%n%S%n%Z";
                break;
            case 377:
                str2 = "%N%n%O%n%A%n%S %Z";
                break;
            case 378:
                str2 = "%Z%n%S%n%C%n%A%n%O%n%N";
                break;
            case 393:
                str2 = "%O%n%N%n%A%nFL-%Z %C";
                break;
            case 402:
                str2 = "%N%n%O%n%A%n%Z %C %X";
                break;
            case 404:
                str2 = "%O%n%N%n%A%nLT-%Z %C";
                break;
            case 405:
                str2 = "%O%n%N%n%A%nL-%Z %C";
                break;
            case 406:
            case 429:
                str2 = "%N%n%O%n%A%n%C, %Z";
                break;
            case 419:
                str2 = "%N%n%O%n%A%nMC-%Z %C %X";
                break;
            case 420:
                str2 = "%N%n%O%n%A%nMD-%Z %C";
                break;
            case 430:
                str2 = "%N%n%O%n%A%n%S %C-%X%n%Z";
                break;
            case 431:
                if (!a) {
                    str2 = "%A%n%O%n%N";
                    break;
                }
                str2 = "%N%n%O%n%A";
                break;
            case 440:
                str2 = "%N%n%O%n%A%n%D%n%Z %C, %S";
                break;
            case 441:
                str2 = "%N%n%O%n%A%n%D%n%Z %C%n%S";
                break;
            case 457:
                str2 = "%N%n%O%n%A%n%Z%n%C, %S";
                break;
            case 474:
                str2 = "%N%n%O%n%A%n%D%n%C %Z";
                break;
            case 519:
                str2 = "%N%n%O%n%A%n%C %Z %S";
                break;
            case 520:
                str2 = "%N%n%O%n%A%n%D, %C%n%Z %S";
                break;
            case 523:
                str2 = "%N%n%O%n%A%n%C-%Z";
                break;
            case 530:
                str2 = "%N%n%O%n%A%n%C PR %Z";
                break;
            case 613:
                str2 = "%O%n%N%n%A%nSE-%Z %C";
                break;
            case 615:
                str2 = "%N%n%O%n%A%nSINGAPORE %Z";
                break;
            case 617:
                str2 = "%N%n%O%n%A%nSI- %Z %C";
                break;
            case 623:
            case 691:
                str2 = "%N%n%O%n%A%n%C, %S %Z";
                break;
            case 626:
                str2 = "%N%n%O%n%A%n%C %X%n%S";
                break;
            case 630:
                str2 = "%N%n%O%n%A%n%Z-%C%n%S";
                break;
            case 648:
                if (!a) {
                    str2 = "%N%n%O%n%A%n%D %C%n%S %Z";
                    break;
                }
                str2 = "%N%n%O%n%A%n%D, %C%n%S %Z";
                break;
            case 658:
                str2 = "%N%n%O%n%A%n%Z %C/%S";
                break;
            case 662:
                str2 = "%N%n%O%n%A%n%X%n%C%n%S";
                break;
            case 663:
                if (!a) {
                    str2 = "%Z%n%S%C%n%A%n%O%n%N";
                    break;
                }
                str2 = "%N%n%O%n%A%n%C, %S %Z";
                break;
            case 709:
                str2 = "%N%n%O%n%A%n%C %Z, %S";
                break;
            case 833:
                str2 = "%N%n%O%n%A%n%D%n%C%n%Z";
                break;
            default:
                str2 = "%N%n%O%n%A%n%C";
                break;
        }
        StringBuilder stringBuilder = new StringBuilder(str2.length() + 4);
        if (a || !(C6553f.m29737a("ja", str3) || C6553f.m29737a("ko", str3) || C6553f.m29737a("zh", str3))) {
            stringBuilder.append(str2);
            stringBuilder.append("%n%R");
        } else {
            stringBuilder.append("%R%n");
            stringBuilder.append(str2);
        }
        String stringBuilder2 = stringBuilder.toString();
        StringBuilder stringBuilder3 = new StringBuilder();
        CharSequence stringBuilder4 = new StringBuilder();
        CharSequence stringBuilder5 = new StringBuilder();
        int length = str.length();
        if (cArr != null) {
            int i;
            sparseBooleanArray = new SparseBooleanArray(C6548a.f32641a.length + 1);
            for (char c : cArr) {
                if (C6548a.m29720a(c)) {
                    sparseBooleanArray.put(c, true);
                }
            }
            if (cArr2 != null) {
                for (char c2 : cArr2) {
                    if (C6548a.m29720a(c2)) {
                        sparseBooleanArray.put(c2, false);
                    }
                }
            }
        } else {
            sparseBooleanArray = null;
        }
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        Object obj6 = null;
        for (char c3 : stringBuilder2.replaceAll("%A", "%1%n%2%n%3").toCharArray()) {
            if (obj6 != null) {
                Object obj7;
                int i2;
                if ('n' == c3) {
                    obj6 = null;
                    if (stringBuilder4.length() > 0) {
                        stringBuilder4.append(stringBuilder5);
                        stringBuilder3.append(f32643a.matcher(stringBuilder4).replaceAll(""));
                        obj6 = 1;
                        stringBuilder4.setLength(0);
                        obj4 = obj3;
                    } else {
                        if (stringBuilder5.length() > 0 && obj4 == null) {
                            String replaceAll = f32643a.matcher(stringBuilder5).replaceAll("");
                            if (replaceAll.length() > 0) {
                                stringBuilder3.append(replaceAll);
                                obj6 = 1;
                                i2 = 1;
                            }
                        }
                        obj4 = obj3;
                    }
                    if (obj6 != null && length > 0) {
                        stringBuilder3.append(str);
                        obj5 = 1;
                    }
                    obj3 = obj;
                    obj7 = obj4;
                    obj4 = obj2;
                    obj2 = obj5;
                    obj5 = null;
                    obj6 = obj7;
                } else if (!C6548a.m29720a(c3)) {
                    Log.w("AddressFormatter", "Could not format AddressField." + c3);
                    obj4 = obj2;
                    obj2 = obj5;
                    i = 1;
                    obj6 = obj3;
                    obj3 = obj;
                } else if (sparseBooleanArray == null || sparseBooleanArray.get(c3)) {
                    obj6 = C6549b.m29723a(c7147b, c3, str);
                    if (obj6 != null) {
                        obj6 = obj6.trim();
                    }
                    if (TextUtils.isEmpty(obj6)) {
                        obj4 = obj2;
                        obj2 = obj5;
                        i = 1;
                        obj6 = obj3;
                        obj3 = obj;
                    } else {
                        stringBuilder4.append(stringBuilder5.toString());
                        stringBuilder4.append(obj6);
                        if ('N' == c3) {
                            obj7 = obj4;
                            obj4 = obj2;
                            obj2 = obj5;
                            obj5 = obj7;
                            obj6 = obj3;
                            int i3 = 1;
                        } else {
                            obj2 = obj5;
                            obj5 = obj4;
                            i2 = 1;
                            obj6 = obj3;
                            obj3 = obj;
                        }
                    }
                } else {
                    obj4 = obj2;
                    obj2 = obj5;
                    i = 1;
                    obj6 = obj3;
                    obj3 = obj;
                }
                stringBuilder5.setLength(0);
                obj = obj3;
                obj3 = obj6;
                obj6 = null;
                obj7 = obj5;
                obj5 = obj2;
                obj2 = obj4;
                obj4 = obj7;
            } else if (c3 == '%') {
                obj6 = 1;
            } else {
                stringBuilder5.append(c3);
            }
        }
        if (stringBuilder4.length() > 0 || obj4 == null) {
            if (stringBuilder4.length() == 0 && stringBuilder5.length() > 0) {
                obj3 = 1;
            }
            stringBuilder4.append(stringBuilder5);
            stringBuilder3.append(f32643a.matcher(stringBuilder4).replaceAll(""));
        } else if (obj5 != null) {
            stringBuilder3.delete(stringBuilder3.length() - length, stringBuilder3.length());
        }
        if ((sparseBooleanArray == null || sparseBooleanArray.get(82)) && (stringBuilder3.length() == 0 || (obj != null && obj2 == null && r7 == null))) {
            Object a2 = C6549b.m29723a(c7147b, 'R', str);
            if (!TextUtils.isEmpty(a2)) {
                if (stringBuilder3.length() > 0 && length > 0) {
                    stringBuilder3.append(str);
                }
                stringBuilder3.append(a2);
            }
        }
        return stringBuilder3.toString();
    }

    public static String m29722a(C7147b c7147b, char c) {
        return C6549b.m29723a(c7147b, c, null);
    }

    private static String m29723a(C7147b c7147b, char c, String str) {
        if (c7147b == null) {
            return null;
        }
        if (str == null) {
            str = "\n";
        }
        switch (c) {
            case '1':
                if (c7147b.f34916r.length > 0) {
                    return c7147b.f34916r[0];
                }
                return null;
            case '2':
                if (c7147b.f34916r.length >= 2) {
                    return c7147b.f34916r[1];
                }
                return null;
            case '3':
                if (c7147b.f34916r.length >= 3) {
                    return c7147b.f34916r[2];
                }
                return null;
            case 'A':
                if (c7147b.f34916r.length > 0) {
                    return TextUtils.join(str, c7147b.f34916r);
                }
                return null;
            case 'B':
                if (TextUtils.isEmpty(c7147b.f34908j)) {
                    return null;
                }
                return c7147b.f34908j;
            case 'C':
                if (TextUtils.isEmpty(c7147b.f34905g)) {
                    return null;
                }
                return c7147b.f34905g;
            case 'D':
                if (TextUtils.isEmpty(c7147b.f34906h)) {
                    return null;
                }
                return c7147b.f34906h;
            case 'F':
                if (TextUtils.isEmpty(c7147b.f34915q)) {
                    return null;
                }
                return c7147b.f34915q;
            case 'N':
                if (TextUtils.isEmpty(c7147b.f34918t)) {
                    return null;
                }
                return c7147b.f34918t;
            case 'O':
                if (TextUtils.isEmpty(c7147b.f34917s)) {
                    return null;
                }
                return c7147b.f34917s;
            case 'P':
                if (TextUtils.isEmpty(c7147b.f34914p)) {
                    return null;
                }
                return c7147b.f34914p;
            case 'R':
                if (!TextUtils.isEmpty(c7147b.f34900b)) {
                    return c7147b.f34900b;
                }
                int b = C6563p.m29794b(c7147b.f34899a);
                if (b == 0 || 858 == b) {
                    return null;
                }
                return C6553f.m29741b(b);
            case 'S':
                if (TextUtils.isEmpty(c7147b.f34903e)) {
                    return null;
                }
                return c7147b.f34903e;
            case 'T':
                if (TextUtils.isEmpty(c7147b.f34907i)) {
                    return null;
                }
                return c7147b.f34907i;
            case 'U':
                if (TextUtils.isEmpty(c7147b.f34904f)) {
                    return null;
                }
                return c7147b.f34904f;
            case 'X':
                if (TextUtils.isEmpty(c7147b.f34912n)) {
                    return null;
                }
                return c7147b.f34912n;
            case 'Z':
                if (TextUtils.isEmpty(c7147b.f34910l)) {
                    return null;
                }
                return c7147b.f34910l;
            default:
                return null;
        }
    }
}
