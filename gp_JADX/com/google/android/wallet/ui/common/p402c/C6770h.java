package com.google.android.wallet.ui.common.p402c;

import java.util.Collections;
import java.util.HashSet;

public final class C6770h {
    public static final int[] f33605a = new int[]{1, 2, 1, 2, 1, 2, 1};
    public static final int[] f33606b = new int[]{2, 7, 6, 5, 4, 3, 2};
    public static final char[] f33607c = new char[]{'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E', 'T'};
    public static final int[] f33608d = new int[]{2, 1, 2, 1, 2, 1, 2};
    public static final int[] f33609e = new int[]{7, 9, 10, 5, 8, 4, 2};
    public static final int[] f33610f = new int[]{8, 7, 6, 5, 4, 3, 2, 10, 1};
    public static final int[] f33611g = new int[]{128, 64, 32, 16, 8, 4, 2};
    public static final int[] f33612h = new int[]{8, 7, 6, 5, 4, 3, 2};
    public static final int[] f33613i = new int[]{1, 2, 1, 2, 1, 2, 1, 2, 1, 2};
    public static final int[] f33614j = new int[]{9, 8, 7, 6, 5, 4, 3, 2};
    public static final int[] f33615k = new int[]{2, 3, 4, 5, 6, 7, 8, 9};
    public static final int[] f33616l = new int[]{9, 8, 7, 6, 5, 4, 3, 2};
    public static final int[] f33617m = new int[]{2, 1, 2, 1, 2, 1, 2, 1, 2};

    public static C6739a m30797a(int i, String str) {
        switch (i) {
            case 7:
                return new C6781s(str);
            case 8:
                return new C6773k(str);
            case 9:
                return new C6771i(str);
            case 10:
                return new C6778p(str);
            case 11:
                return new C6785w(str);
            case 12:
                return new C6780r(str);
            case 13:
                return new C6782t(str);
            case 14:
                return new C6779q(str);
            case 15:
                return new C6784v(str);
            case 16:
                return new C6772j(str);
            case 17:
                return new C6774l(str);
            case 18:
                return new C6775m(str);
            case 19:
                return new C6776n(str);
            case 20:
                return new C6777o(str);
            case 21:
                return new C6783u(str);
            default:
                throw new IllegalArgumentException("Checksum type " + i + " not supported");
        }
    }

    static boolean m30798a(String str) {
        String substring = str.substring(str.length() - 8);
        if (C6766c.m30792a(C6766c.m30793a(substring.substring(0, 7), f33605a, true) + 4, 10, true, false) == substring.charAt(7)) {
            return true;
        }
        return false;
    }

    static boolean m30799b(String str) {
        int parseInt = Integer.parseInt(str.substring(str.length() - 9));
        return (parseInt % 100) + ((parseInt / 100) % 97) == 97;
    }

    static boolean m30800c(String str) {
        String substring = str.substring(str.length() - 9);
        int i = 0;
        int i2 = 10;
        while (i < 8) {
            i2 += substring.charAt(i) - 48;
            if (i2 > 10) {
                i2 %= 10;
            }
            i++;
            i2 = (i2 * 2) % 11;
        }
        return C6766c.m30792a(i2, 11, true, false) == substring.charAt(8);
    }

    static boolean m30801d(String str) {
        String substring = str.substring(str.length() - 8);
        if (C6766c.m30792a(C6766c.m30793a(substring.substring(0, 7), f33606b, false), 11, true, true) == substring.charAt(7)) {
            return true;
        }
        return false;
    }

    static boolean m30802e(String str) {
        String substring = str.substring(str.length() - 9);
        if (Character.isDigit(substring.charAt(0))) {
            if (f33607c[Integer.parseInt(substring.substring(0, 8)) % 23] != substring.charAt(8)) {
                return false;
            }
        } else if (Character.isDigit(substring.charAt(8))) {
            if (C6766c.m30792a(C6766c.m30793a(substring.substring(1, 8), f33608d, true), 10, true, false) != substring.charAt(8)) {
                return false;
            }
        } else if (substring.charAt(0) == 'N' && ((char) (((10 - (C6766c.m30793a(substring.substring(1, 8), f33608d, true) % 10)) - 1) + 65)) != substring.charAt(8)) {
            return false;
        }
        return true;
    }

    static boolean m30803f(String str) {
        String substring = str.substring(str.length() - 8);
        if (C6766c.m30792a(C6766c.m30793a(substring.substring(0, 7), f33609e, false), 11, true, true) == substring.charAt(7)) {
            return true;
        }
        return false;
    }

    static boolean m30804g(String str) {
        String substring = str.substring(str.length() - 9);
        Object hashSet = new HashSet(2);
        Collections.addAll(hashSet, new Integer[]{Integer.valueOf(0), Integer.valueOf(42)});
        return hashSet.contains(Integer.valueOf(C6766c.m30793a(substring, f33610f, false) % 97));
    }

    static boolean m30805h(String str) {
        String substring = str.substring(str.length() - 8);
        if (substring.charAt(7) == C6766c.m30792a(C6766c.m30793a(substring.substring(0, 7), f33611g, false), 11, false, false)) {
            return true;
        }
        return false;
    }

    static boolean m30806i(String str) {
        String substring = str.substring(str.length() - 11);
        int i = 0;
        int i2 = 10;
        while (i < 10) {
            i2 = (i2 + (substring.charAt(i) - 48)) % 10;
            if (i2 == 0) {
                i2 = 10;
            }
            i++;
            i2 = (i2 * 2) % 11;
        }
        return (11 - i2) % 10 == substring.charAt(10) + -48;
    }

    static boolean m30807j(String str) {
        char c = 'W';
        int a;
        if (str.length() == 9) {
            a = (C6766c.m30793a(str.substring(0, 7), f33612h, false) + (((str.charAt(8) - 65) + 1) * 9)) % 23;
            if (a != 0) {
                c = (char) ((a + 65) - 1);
            }
            if (str.charAt(7) != c) {
                return false;
            }
        } else if (str.length() == 8) {
            if (!Character.isDigit(str.charAt(1))) {
                return true;
            }
            a = C6766c.m30793a(str.substring(0, 7), f33612h, false) % 23;
            if (a != 0) {
                c = (char) ((a + 65) - 1);
            }
            if (str.charAt(7) != c) {
                return false;
            }
        }
        return true;
    }

    static boolean m30808k(String str) {
        if (C6766c.m30792a(C6766c.m30793a(str.substring(0, 10), f33613i, true), 10, true, false) == str.charAt(10)) {
            return true;
        }
        return false;
    }

    static boolean m30809l(String str) {
        int parseInt = Integer.parseInt(str.substring(str.length() - 8));
        return (parseInt / 100) % 89 == parseInt % 100;
    }

    static boolean m30810m(String str) {
        String substring = str.substring(str.length() - 12);
        if (substring.charAt(8) == C6766c.m30792a(C6766c.m30793a(substring.substring(0, 8), f33614j, false), 11, false, false)) {
            return true;
        }
        return false;
    }

    static boolean m30811n(String str) {
        if (C6766c.m30792a(C6766c.m30793a(str.substring(0, 8), f33615k, false), 11, false, false) == str.charAt(8) || C6766c.m30792a(C6766c.m30793a(str.substring(0, 8), f33616l, false), 11, true, false) == str.charAt(8)) {
            return true;
        }
        return false;
    }

    static boolean m30812o(String str) {
        String substring = str.substring(str.length() - 12);
        if (C6766c.m30792a(C6766c.m30793a(substring.substring(0, 9), f33617m, true), 10, true, false) == substring.charAt(9)) {
            return true;
        }
        return false;
    }
}
