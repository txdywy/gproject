package com.google.android.wallet.ui.common;

import android.text.InputFilter;
import android.text.Spanned;
import android.text.TextUtils;
import com.google.a.a.a.a.b.a.b.a.z;
import com.google.android.wallet.common.util.C6600l;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class bn implements InputFilter {
    public static final Pattern f33573a = Pattern.compile("0+");
    public z f33574b;
    public Pattern f33575c;
    public Character f33576d;

    public bn(z zVar) {
        m30761a(zVar);
        this.f33574b = zVar;
        if (!TextUtils.isEmpty(this.f33574b.e)) {
            this.f33576d = Character.valueOf(this.f33574b.e.charAt(0));
            this.f33575c = Pattern.compile(Pattern.quote(this.f33574b.e));
        }
    }

    public final String m30764a(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            return "";
        }
        String a;
        String[] c = m30767c(charSequence);
        String b = m30766b(c[0]);
        String str = c[1];
        CharSequence a2 = m30759a(b, this.f33574b.a);
        if (this.f33574b.g.length > 0) {
            a = m30760a(a2, this.f33574b.g, 0, this.f33574b.f);
        } else {
            CharSequence charSequence2 = a2;
        }
        StringBuilder stringBuilder = new StringBuilder(a);
        if (this.f33574b.b > 0 && str != null) {
            if (TextUtils.isEmpty(a2)) {
                stringBuilder.append('0');
            }
            if (str == null) {
                a = "";
            } else {
                b = String.valueOf(this.f33574b.e);
                a = String.valueOf(m30759a(str, this.f33574b.b));
                a = a.length() != 0 ? b.concat(a) : new String(b);
            }
            stringBuilder.append(a);
        }
        if (stringBuilder.length() > 0) {
            stringBuilder.insert(this.f33574b.d ? 0 : stringBuilder.length(), this.f33574b.c);
        }
        return stringBuilder.toString();
    }

    public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        if (i2 - i != 1) {
            return null;
        }
        Character valueOf = Character.valueOf(charSequence.charAt(i));
        if (!m30765a(valueOf)) {
            return "";
        }
        CharSequence subSequence = spanned.subSequence(0, i3);
        if (this.f33576d != null) {
            String charSequence2 = subSequence.toString();
            int indexOf = charSequence2.indexOf(this.f33576d.charValue());
            if (valueOf.equals(this.f33576d)) {
                if (indexOf >= 0) {
                    return "";
                }
                return null;
            } else if (indexOf >= 0) {
                if (m30763e(charSequence2.substring(indexOf)).length() >= this.f33574b.b) {
                    return "";
                }
                return null;
            }
        }
        if (m30763e(subSequence).length() >= this.f33574b.a) {
            return "";
        }
        return null;
    }

    final String m30766b(CharSequence charSequence) {
        if (charSequence == null) {
            return null;
        }
        String charSequence2 = charSequence.toString();
        int i = 0;
        int length = charSequence2.length() - 1;
        if (this.f33574b.d && charSequence2.startsWith(this.f33574b.c)) {
            i = this.f33574b.c.length() + 0;
        } else if (!this.f33574b.d && charSequence2.endsWith(this.f33574b.c)) {
            length -= this.f33574b.c.length();
        }
        Matcher matcher = f33573a.matcher(charSequence2);
        if (matcher.find(i) && matcher.start() == i) {
            if (matcher.end() == length + 1) {
                i = length;
            } else {
                i = matcher.end();
            }
        }
        return charSequence2.substring(i);
    }

    final String[] m30767c(CharSequence charSequence) {
        String str = null;
        String[] strArr = new String[2];
        if (this.f33575c != null) {
            String[] split = this.f33575c.split(charSequence, 2);
            strArr[0] = m30763e(split[0]);
            if (split.length == 2) {
                str = m30763e(split[1]);
            }
            strArr[1] = str;
        } else {
            strArr[0] = m30763e(charSequence);
            strArr[1] = null;
        }
        return strArr;
    }

    final boolean m30765a(Character ch) {
        return ch.equals(this.f33576d) || Character.isDigit(ch.charValue());
    }

    private static void m30761a(z zVar) {
        int i;
        int i2 = 0;
        String[] strArr = new String[]{zVar.e, zVar.c, zVar.f};
        loop0:
        for (int i3 = 0; i3 < 3; i3++) {
            Object obj = strArr[i3];
            if (!TextUtils.isEmpty(obj)) {
                i = 0;
                while (i < 3) {
                    if (i3 != i && !TextUtils.isEmpty(strArr[i]) && obj.contains(strArr[i])) {
                        i = 0;
                        break loop0;
                    }
                    i++;
                }
                continue;
            }
        }
        i = 1;
        String valueOf;
        if (i == 0) {
            valueOf = String.valueOf(zVar);
            throw new IllegalArgumentException(new StringBuilder(String.valueOf(valueOf).length() + 66).append("Symbols for units, decimal, and groups should be distinguishable: ").append(valueOf).toString());
        } else if (m30762d(zVar.e) || m30762d(zVar.c) || m30762d(zVar.f)) {
            valueOf = String.valueOf(zVar);
            throw new IllegalArgumentException(new StringBuilder(String.valueOf(valueOf).length() + 61).append("Symbols for units, decimal, and groups can't contain digits: ").append(valueOf).toString());
        } else if (zVar.b > 0 && TextUtils.isEmpty(zVar.e)) {
            throw new IllegalArgumentException("Decimal symbol must be provided if max precision is greater than 0");
        } else if (!TextUtils.isEmpty(zVar.e) && zVar.e.length() > 1) {
            throw new IllegalArgumentException("Decimal symbol should only be a single character or user cannot enter it.");
        } else if (zVar.a > 0 || zVar.b > 0) {
            int[] iArr = zVar.g;
            int length = iArr.length;
            while (i2 < length) {
                if (iArr[i2] <= 0) {
                    throw new IllegalArgumentException("Group lengths must be positive/non-zero.");
                }
                i2++;
            }
            if (zVar.g.length > 0 && TextUtils.isEmpty(zVar.f)) {
                throw new IllegalArgumentException("Group separator symbol must be provided if group lengths are specified");
            }
        } else {
            throw new IllegalArgumentException("No value can be collected if both maxMagnitude or maxPrecision <= 0");
        }
    }

    private static boolean m30762d(CharSequence charSequence) {
        return !TextUtils.isEmpty(m30763e(charSequence));
    }

    private static String m30763e(CharSequence charSequence) {
        return charSequence == null ? "" : C6600l.m29944a(charSequence);
    }

    private static String m30760a(String str, int[] iArr, int i, String str2) {
        int min = Math.min(iArr.length - 1, i);
        int i2 = iArr[min];
        int length = str.length();
        if (length <= i2) {
            return str;
        }
        i2 = length - i2;
        String substring = str.substring(0, i2);
        String substring2 = str.substring(i2);
        String a = m30760a(substring, iArr, min + 1, str2);
        return new StringBuilder((String.valueOf(a).length() + String.valueOf(str2).length()) + String.valueOf(substring2).length()).append(a).append(str2).append(substring2).toString();
    }

    private static String m30759a(String str, int i) {
        return str.substring(0, Math.min(str.length(), i));
    }
}
