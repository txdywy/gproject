package com.google.android.wallet.common.p376a;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import com.google.android.wallet.p383e.C6622f;
import com.google.android.wallet.p383e.C6625i;
import com.google.p440g.p441a.p442a.C7147b;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Locale;
import java.util.UnknownFormatConversionException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONObject;

public final class C6553f {
    public static final Pattern f32652a = Pattern.compile("/");
    public static final Pattern f32653b = Pattern.compile("--");
    public static final char[] f32654c = C6548a.m29721a();
    public static final SparseIntArray f32655d;
    public static final Pattern f32656e = Pattern.compile("(\\\\d|\\d|[^\\^\\w])");
    public static final Pattern f32657f = Pattern.compile("^[\\w \\-]+$");
    public static final Pattern f32658g = Pattern.compile("[_-]");

    public static int[] m29740a(String[] strArr) {
        if (strArr == null) {
            return null;
        }
        int length = strArr.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            iArr[i] = C6563p.m29794b(strArr[i]);
        }
        return iArr;
    }

    public static String m29732a(JSONObject jSONObject, String str) {
        if (jSONObject == null || str == null) {
            return null;
        }
        return jSONObject.optString(str, null);
    }

    public static String[] m29744b(JSONObject jSONObject, String str) {
        String a = C6553f.m29732a(jSONObject, str);
        if (a == null) {
            return null;
        }
        return a.split("~");
    }

    public static int[] m29739a(int[] iArr) {
        int i = 0;
        if (iArr == null) {
            return null;
        }
        int intValue;
        SparseArray sparseArray = new SparseArray(274);
        sparseArray.put(858, "");
        ArrayList arrayList = new ArrayList(iArr.length);
        for (int i2 : iArr) {
            if (!(i2 == 0 || i2 == 858)) {
                arrayList.add(Integer.valueOf(i2));
            }
        }
        int size = arrayList.size();
        ArrayList arrayList2 = arrayList;
        int size2 = arrayList2.size();
        int i22 = 0;
        while (i22 < size2) {
            Object obj = arrayList2.get(i22);
            i22++;
            int intValue2 = ((Integer) obj).intValue();
            obj = C6553f.m29745c(C6563p.m29793a(intValue2));
            if (TextUtils.isEmpty(obj)) {
                Log.w("AddressUtils", "Region code '" + intValue2 + "' without label");
                obj = "";
            }
            sparseArray.put(intValue2, obj);
        }
        Collections.sort(arrayList, new C6554g(Collator.getInstance(Locale.getDefault()), sparseArray));
        int i3 = 0;
        int i4 = 0;
        i22 = 0;
        while (i3 < size) {
            intValue = ((Integer) arrayList.get(i3)).intValue();
            if (intValue != i4) {
                i4 = i22 + 1;
            } else {
                intValue = i4;
                i4 = i22;
            }
            i3++;
            i22 = i4;
            i4 = intValue;
        }
        int[] iArr2 = new int[i22];
        i4 = 0;
        size2 = 0;
        while (size2 < size) {
            i22 = ((Integer) arrayList.get(size2)).intValue();
            if (i22 != i) {
                iArr2[i4] = i22;
                intValue = i4 + 1;
                i4 = i22;
            } else {
                intValue = i4;
                i4 = i;
            }
            size2++;
            i = i4;
            i4 = intValue;
        }
        return iArr2;
    }

    public static String m29731a(Context context, char c, JSONObject jSONObject) {
        String a;
        switch (c) {
            case '1':
                return context.getString(C6625i.wallet_uic_address_field_address_line_1);
            case '2':
                return context.getString(C6625i.wallet_uic_address_field_address_line_2);
            case '3':
                return context.getString(C6625i.wallet_uic_address_field_address_line_3);
            case 'A':
                return context.getString(C6625i.wallet_uic_address_field_address_line_1);
            case 'C':
                a = C6553f.m29732a(jSONObject, "locality_name_type");
                if ("district".equals(a)) {
                    return context.getString(C6625i.wallet_uic_address_field_admin_area_district);
                }
                if ("post_town".equals(a)) {
                    return context.getString(C6625i.wallet_uic_address_field_post_town);
                }
                if ("suburb".equals(a)) {
                    return context.getString(C6625i.wallet_uic_address_field_suburb);
                }
                return context.getString(C6625i.wallet_uic_address_field_locality);
            case 'D':
                return context.getString(C6625i.wallet_uic_address_field_dependent_locality);
            case 'N':
                return context.getString(C6625i.wallet_uic_address_field_recipient);
            case 'O':
                return context.getString(C6625i.wallet_uic_address_field_organization);
            case 'R':
                return context.getString(C6625i.wallet_uic_address_field_country);
            case 'S':
                a = C6553f.m29732a(jSONObject, "state_name_type");
                if ("state".equals(a)) {
                    return context.getString(C6625i.wallet_uic_address_field_admin_area_state);
                }
                if ("area".equals(a)) {
                    return context.getString(C6625i.wallet_uic_address_field_admin_area_area);
                }
                if ("county".equals(a)) {
                    return context.getString(C6625i.wallet_uic_address_field_admin_area_county);
                }
                if ("department".equals(a)) {
                    return context.getString(C6625i.wallet_uic_address_field_admin_area_department);
                }
                if ("district".equals(a)) {
                    return context.getString(C6625i.wallet_uic_address_field_admin_area_district);
                }
                if ("do_si".equals(a)) {
                    return context.getString(C6625i.wallet_uic_address_field_admin_area_do_si);
                }
                if ("emirate".equals(a)) {
                    return context.getString(C6625i.wallet_uic_address_field_admin_area_emirate);
                }
                if ("island".equals(a)) {
                    return context.getString(C6625i.wallet_uic_address_field_admin_area_island);
                }
                if ("oblast".equals(a)) {
                    return context.getString(C6625i.wallet_uic_address_field_admin_area_oblast);
                }
                if ("parish".equals(a)) {
                    return context.getString(C6625i.wallet_uic_address_field_admin_area_parish);
                }
                if ("prefecture".equals(a)) {
                    return context.getString(C6625i.wallet_uic_address_field_admin_area_prefecture);
                }
                if ("region".equals(a)) {
                    return context.getString(C6625i.wallet_uic_address_field_admin_area_region);
                }
                return context.getString(C6625i.wallet_uic_address_field_admin_area_province);
            case 'X':
                return context.getString(C6625i.wallet_uic_address_field_sorting_code);
            case 'Z':
                a = C6553f.m29732a(jSONObject, "zip_name_type");
                if ("zip".equals(a)) {
                    return context.getString(C6625i.wallet_uic_address_field_zip_code);
                }
                if ("pin".equals(a)) {
                    return context.getString(C6625i.wallet_uic_address_field_pin_code);
                }
                if ("eircode".equals(a)) {
                    return context.getString(C6625i.wallet_uic_address_field_eircode);
                }
                return context.getString(C6625i.wallet_uic_address_field_postal_code);
            default:
                return null;
        }
    }

    public static int m29728a(char c) {
        switch (c) {
            case '1':
                return C6622f.address_field_address_line_1;
            case '2':
                return C6622f.address_field_address_line_2;
            case '3':
                return C6622f.address_field_address_line_3;
            case 'A':
                return C6622f.address_field_address_line_1;
            case 'C':
                return C6622f.address_field_locality;
            case 'D':
                return C6622f.address_field_dependent_locality;
            case 'N':
                return C6622f.address_field_recipient;
            case 'O':
                return C6622f.address_field_organization;
            case 'R':
                return C6622f.address_field_country;
            case 'S':
                return C6622f.address_field_admin_area;
            case 'X':
                return C6622f.address_field_sorting_code;
            case 'Z':
                return C6622f.address_field_postal_code;
            default:
                return 0;
        }
    }

    public static int m29729a(int i) {
        switch (i) {
            case 1:
                return C6622f.address_field_country;
            case 2:
                return C6622f.address_field_recipient;
            case 3:
                return C6622f.address_field_address_line_1;
            case 4:
                return C6622f.address_field_address_line_2;
            case 5:
                return C6622f.address_field_locality;
            case 6:
                return C6622f.address_field_admin_area;
            case 7:
                return C6622f.address_field_postal_code;
            case 8:
                return C6622f.address_field_phone_number;
            case 9:
                return C6622f.address_field_sorting_code;
            case 10:
                return C6622f.address_field_dependent_locality;
            case 11:
                return C6622f.address_field_organization;
            default:
                throw new IllegalArgumentException("Unexpected addressFormField: " + i);
        }
    }

    public static char[] m29738a(String str) {
        if (TextUtils.isEmpty(str)) {
            throw new UnknownFormatConversionException("Cannot convert null/empty formats");
        }
        ArrayList arrayList = new ArrayList();
        ArrayList d = C6553f.m29749d(str);
        int size = d.size();
        int i = 0;
        while (i < size) {
            Object obj = d.get(i);
            i++;
            String str2 = (String) obj;
            if (str2.matches("%.") && !str2.equals("%n")) {
                arrayList.add(Character.valueOf(str2.charAt(1)));
            }
        }
        ArrayList arrayList2 = new ArrayList();
        d = arrayList;
        size = d.size();
        int i2 = 0;
        while (i2 < size) {
            obj = d.get(i2);
            i2++;
            char charValue = ((Character) obj).charValue();
            if (charValue == 'A') {
                arrayList2.add(Character.valueOf('1'));
                arrayList2.add(Character.valueOf('2'));
                arrayList2.add(Character.valueOf('3'));
            } else {
                arrayList2.add(Character.valueOf(charValue));
            }
        }
        char[] cArr = new char[arrayList2.size()];
        for (int i3 = 0; i3 < cArr.length; i3++) {
            cArr[i3] = ((Character) arrayList2.get(i3)).charValue();
        }
        return cArr;
    }

    public static boolean m29734a(char c, JSONObject jSONObject) {
        if (c == 'N') {
            return true;
        }
        Object a = C6553f.m29732a(jSONObject, "require");
        if (TextUtils.isEmpty(a)) {
            return false;
        }
        if (c == '1') {
            c = 'A';
        }
        return a.contains(String.valueOf(c));
    }

    public static int m29730a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return 0;
        }
        CharSequence a = C6553f.m29732a(jSONObject, "id");
        if (a == null) {
            return 0;
        }
        String[] split = f32652a.split(a);
        switch (split.length) {
            case 2:
            case 3:
                return C6563p.m29794b(f32653b.split(split[1])[0]);
            default:
                String str = "Invalid address data id: ";
                String valueOf = String.valueOf(a);
                throw new IllegalArgumentException(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
        }
    }

    public static Pattern m29743b(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        String a = C6553f.m29732a(jSONObject, "zip");
        if (TextUtils.isEmpty(a)) {
            return null;
        }
        CharSequence a2 = C6553f.m29732a(jSONObject, "id");
        if (TextUtils.isEmpty(a2)) {
            return null;
        }
        switch (f32652a.split(a2).length) {
            case 2:
                return Pattern.compile(a, 2);
            case 3:
                return C6553f.m29742b(a);
            default:
                return null;
        }
    }

    public static Pattern m29742b(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return Pattern.compile(new StringBuilder(String.valueOf(str).length() + 4).append("(").append(str).append(").*").toString(), 2);
    }

    public static boolean m29747c(JSONObject jSONObject) {
        if (jSONObject == null) {
            return false;
        }
        CharSequence a = C6553f.m29732a(jSONObject, "zip");
        if (TextUtils.isEmpty(a) || f32656e.matcher(a).replaceAll("").length() != 0) {
            return false;
        }
        return true;
    }

    public static String m29748d(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        boolean z;
        CharSequence a = C6553f.m29732a(jSONObject, "zip");
        if (TextUtils.isEmpty(a)) {
            z = false;
        } else {
            z = f32657f.matcher(a).matches();
        }
        if (z) {
            return a;
        }
        return null;
    }

    public static String m29746c(JSONObject jSONObject, String str) {
        if (jSONObject == null || TextUtils.isEmpty(str)) {
            return null;
        }
        String[] strArr;
        String[] strArr2 = new String[]{str};
        String[] strArr3 = new String[1];
        Pattern b = C6553f.m29743b(jSONObject);
        if (b != null) {
            String[] b2 = C6553f.m29744b(jSONObject, "sub_zips");
            if (b2 == null || b2.length == 0) {
                strArr = strArr3;
                return strArr[0];
            }
            for (int i = 0; i <= 0; i++) {
                CharSequence charSequence = strArr2[0];
                if (!TextUtils.isEmpty(charSequence) && b.matcher(charSequence).matches()) {
                    int i2 = -1;
                    int i3 = 0;
                    int i4 = 0;
                    int length = b2.length;
                    while (i4 < length) {
                        int length2;
                        Matcher matcher = C6553f.m29742b(b2[i4]).matcher(charSequence);
                        if (matcher.matches()) {
                            length2 = matcher.group(1).length();
                            if (i2 == -1 || length2 > r0) {
                                i3 = length2;
                                length2 = i4;
                                i4++;
                                i2 = length2;
                            }
                        }
                        length2 = i2;
                        i4++;
                        i2 = length2;
                    }
                    if (i2 >= 0) {
                        strArr = C6553f.m29744b(jSONObject, "sub_keys");
                        if (strArr != null && i2 < strArr.length) {
                            strArr3[0] = strArr[i2];
                        }
                    }
                }
            }
        }
        strArr = strArr3;
        return strArr[0];
    }

    public static ArrayList m29733a(Collection collection, char[] cArr) {
        if (collection == null) {
            return null;
        }
        if (cArr == null) {
            cArr = f32654c;
        } else {
            for (int i = 0; i < cArr.length; i++) {
                if (!C6548a.m29720a(cArr[i])) {
                    cArr[i] = '\u0000';
                }
            }
        }
        ArrayList arrayList = new ArrayList(collection);
        int size = arrayList.size() - 1;
        while (size >= 0) {
            int size2 = arrayList.size() - 1;
            while (size2 >= 0) {
                if (size != size2 && C6553f.m29736a((C7147b) arrayList.get(size), (C7147b) arrayList.get(size2), r6)) {
                    arrayList.remove(size);
                    break;
                }
                size2--;
            }
            size--;
        }
        return arrayList;
    }

    private static boolean m29736a(C7147b c7147b, C7147b c7147b2, char[] cArr) {
        if (c7147b == null || c7147b2 == null || cArr == null) {
            return false;
        }
        boolean z = false;
        for (char c : cArr) {
            if (c != '\u0000') {
                Object a = C6549b.m29722a(c7147b, c);
                if (TextUtils.isEmpty(a)) {
                    continue;
                } else if (!a.equals(C6549b.m29722a(c7147b2, c))) {
                    return false;
                } else {
                    z = true;
                }
            }
        }
        return z;
    }

    public static boolean m29750d(JSONObject jSONObject, String str) {
        if (jSONObject == null || TextUtils.isEmpty(str)) {
            return false;
        }
        if (!jSONObject.has("lname") && !jSONObject.has("sub_lnames") && !jSONObject.has("lfmt")) {
            return false;
        }
        String a = C6553f.m29732a(jSONObject, "lang");
        if (TextUtils.isEmpty(a)) {
            return C6553f.m29735a(C6553f.m29730a(jSONObject), str);
        }
        if (C6553f.m29737a(a, Locale.ENGLISH.getLanguage())) {
            return true;
        }
        if (C6553f.m29737a(a, str)) {
            return false;
        }
        return true;
    }

    public static String m29751e(JSONObject jSONObject, String str) {
        String[] b = C6553f.m29744b(jSONObject, "languages");
        if (b == null || b.length <= 1) {
            return null;
        }
        String a = C6553f.m29732a(jSONObject, "lang");
        if (TextUtils.isEmpty(a) || C6553f.m29737a(a, str)) {
            return null;
        }
        for (String a2 : b) {
            if (C6553f.m29737a(a2, str)) {
                return a2;
            }
        }
        return null;
    }

    private static ArrayList m29749d(String str) {
        ArrayList arrayList = new ArrayList();
        Object obj = null;
        for (char c : str.toCharArray()) {
            if (obj != null) {
                if ("%n".equals("%" + c)) {
                    arrayList.add("%n");
                    obj = null;
                } else if (C6548a.m29720a(c)) {
                    arrayList.add("%" + c);
                    obj = null;
                } else {
                    throw new UnknownFormatConversionException("Cannot determine AddressField for '" + c + "'");
                }
            } else if (c == '%') {
                obj = 1;
            } else {
                arrayList.add(Character.toString(c));
            }
        }
        return arrayList;
    }

    public static String m29741b(int i) {
        return C6553f.m29745c(C6563p.m29793a(i));
    }

    public static String m29745c(String str) {
        Locale locale = Locale.getDefault();
        return new Locale(locale.getLanguage(), str, locale.getVariant()).getDisplayCountry();
    }

    public static boolean m29737a(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return false;
        }
        return f32658g.split(str)[0].equalsIgnoreCase(f32658g.split(str2)[0]);
    }

    public static boolean m29735a(int i, String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        String str2;
        switch (i) {
            case 37:
            case 167:
                str2 = "ar";
                break;
            case 45:
                str2 = "hy";
                break;
            case 110:
            case 267:
            case 431:
            case 663:
                str2 = "zh";
                break;
            case 336:
                str2 = "ja";
                break;
            case 368:
            case 370:
                str2 = "ko";
                break;
            case 597:
                str2 = "ru";
                break;
            case 648:
                str2 = "th";
                break;
            case 673:
                str2 = "uk";
                break;
            case 718:
                str2 = "vi";
                break;
            default:
                str2 = null;
                break;
        }
        if (TextUtils.isEmpty(str2)) {
            return false;
        }
        return !C6553f.m29737a(str2, str);
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray(10);
        f32655d = sparseIntArray;
        sparseIntArray.put(82, 1);
        f32655d.put(78, 2);
        f32655d.put(49, 3);
        f32655d.put(50, 4);
        f32655d.put(67, 5);
        f32655d.put(83, 6);
        f32655d.put(90, 7);
        f32655d.put(88, 9);
        f32655d.put(68, 10);
        f32655d.put(79, 11);
    }
}
