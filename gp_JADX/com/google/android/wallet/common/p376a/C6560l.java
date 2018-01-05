package com.google.android.wallet.common.p376a;

import android.app.Activity;
import android.location.Location;
import android.location.LocationManager;
import android.net.Uri;
import android.net.Uri.Builder;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import com.android.volley.a.ag;
import com.android.volley.r;
import com.google.android.wallet.common.p367c.C6573a;
import com.google.android.wallet.common.p367c.p368a.C6570d;
import com.google.android.wallet.common.util.C6589a;
import com.google.android.wallet.common.util.C6607s;
import com.google.android.wallet.p355a.C6488d;
import com.google.p440g.p441a.p442a.C7147b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class C6560l implements C6550c {
    public final Activity f32675a;
    public final r f32676b;

    public C6560l(Activity activity, r rVar) {
        this.f32675a = activity;
        this.f32676b = rVar;
    }

    public static boolean m29777a(int i) {
        return ((String) C6488d.f32492a.a()).contains(C6563p.m29793a(i));
    }

    public final String mo5511a() {
        return "GooglePlacesAddressSource";
    }

    public final List mo5512a(CharSequence charSequence, char c, char[] cArr, int i, String str) {
        if (charSequence != null) {
            int intValue;
            int length = charSequence.length();
            switch (c) {
                case '1':
                    intValue = ((Integer) C6488d.f32493b.a()).intValue();
                    break;
                default:
                    intValue = ((Integer) C6488d.f32494c.a()).intValue();
                    break;
            }
            if (length >= intValue) {
                Object obj = (!C6560l.m29777a(i) || C6560l.m29773a(c) == null) ? null : 1;
                if (obj == null) {
                    return null;
                }
                Builder buildUpon = Uri.parse("https://maps.googleapis.com/maps/api/place/autocomplete/json").buildUpon();
                buildUpon.appendQueryParameter("input", charSequence.toString());
                buildUpon.appendQueryParameter("key", "AIzaSyCgACP5TTubzmLhxFL5ONXq6B5l2eH_EXc");
                buildUpon.appendQueryParameter("types", C6560l.m29773a(c));
                Location b = m29779b();
                if (b != null) {
                    buildUpon.appendQueryParameter("location", b.getLatitude() + "," + b.getLongitude());
                    buildUpon.appendQueryParameter("radius", "80000");
                }
                buildUpon.appendQueryParameter("sensor", b != null ? "true" : "false");
                String str2 = "components";
                String str3 = "country:";
                String valueOf = String.valueOf(C6563p.m29793a(i).toLowerCase(Locale.US));
                if (valueOf.length() != 0) {
                    valueOf = str3.concat(valueOf);
                } else {
                    valueOf = new String(str3);
                }
                buildUpon.appendQueryParameter(str2, valueOf);
                if (!TextUtils.isEmpty(str)) {
                    buildUpon.appendQueryParameter("language", str);
                }
                return C6560l.m29774a(m29776a(buildUpon.build().toString()), charSequence, c);
            }
        }
        return null;
    }

    public final C7147b mo5510a(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        Builder buildUpon = Uri.parse("https://maps.googleapis.com/maps/api/place/details/json").buildUpon();
        buildUpon.appendQueryParameter("placeid", str);
        buildUpon.appendQueryParameter("sensor", m29779b() != null ? "true" : "false");
        buildUpon.appendQueryParameter("key", "AIzaSyCgACP5TTubzmLhxFL5ONXq6B5l2eH_EXc");
        if (!TextUtils.isEmpty(str2)) {
            buildUpon.appendQueryParameter("language", str2);
        }
        return C6560l.m29780b(m29776a(buildUpon.build().toString()), str2);
    }

    private final JSONObject m29776a(String str) {
        try {
            ag agVar = new ag();
            this.f32676b.a(new C6570d(str, Collections.singletonMap("User-Agent", C6573a.f32700a), agVar, agVar));
            return (JSONObject) agVar.get(5000, TimeUnit.MILLISECONDS);
        } catch (Throwable e) {
            Log.w("GooglePlacesAddressSour", "TimeoutException while retrieving addresses from GooglePlaces", e);
            return null;
        } catch (Throwable e2) {
            Log.w("GooglePlacesAddressSour", "InterruptedException while retrieving addresses from GooglePlaces", e2);
            return null;
        } catch (Throwable e22) {
            Log.w("GooglePlacesAddressSour", "ExecutionException while retrieving addresses from GooglePlaces", e22);
            return null;
        }
    }

    private static String m29773a(char c) {
        switch (c) {
            case '1':
                return "geocode";
            case 'C':
                return "(cities)";
            case 'S':
                return "(regions)";
            default:
                return null;
        }
    }

    private final Location m29779b() {
        Object obj;
        Activity activity = this.f32675a;
        if (C6607s.m29979a(activity)) {
            C6607s.m29978a();
            C6607s.m29978a();
            if (C6607s.m29982b(activity, C6589a.m29894a(activity))) {
                obj = 1;
                if (obj != null) {
                    return null;
                }
                return ((LocationManager) this.f32675a.getSystemService("location")).getLastKnownLocation("network");
            }
        }
        obj = null;
        if (obj != null) {
            return ((LocationManager) this.f32675a.getSystemService("location")).getLastKnownLocation("network");
        }
        return null;
    }

    private static ArrayList m29774a(JSONObject jSONObject, CharSequence charSequence, char c) {
        if (jSONObject == null) {
            return null;
        }
        String optString = jSONObject.optString("status");
        String str;
        if ("OK".equalsIgnoreCase(optString)) {
            try {
                JSONArray jSONArray = jSONObject.getJSONArray("predictions");
                ArrayList arrayList = new ArrayList();
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    try {
                        JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                        CharSequence string = jSONObject2.getString("description");
                        if (!TextUtils.isEmpty(string)) {
                            String string2 = jSONObject2.getString("place_id");
                            if (!TextUtils.isEmpty(string2)) {
                                switch (c) {
                                    case '1':
                                        str = "geocode";
                                        break;
                                    case 'C':
                                        str = "locality";
                                        break;
                                    case 'S':
                                        str = "administrative_area_level_1";
                                        break;
                                    case 'Z':
                                        str = "locality";
                                        break;
                                    default:
                                        str = null;
                                        break;
                                }
                                if (C6560l.m29778a(jSONObject2, str)) {
                                    String b = C6560l.m29781b(jSONObject2);
                                    if (b != null) {
                                        Object obj;
                                        switch (c) {
                                            case '1':
                                            case 'C':
                                                obj = null;
                                                break;
                                            default:
                                                obj = 1;
                                                break;
                                        }
                                        if (obj == null || b.toLowerCase(Locale.getDefault()).startsWith(charSequence.toString().toLowerCase(Locale.getDefault()))) {
                                            List a = C6560l.m29775a(jSONObject2);
                                            if (!a.isEmpty()) {
                                                string = C6564q.m29796a(a, string);
                                            }
                                            arrayList.add(new C6551d(b, string, "GooglePlacesAddressSource", string2));
                                        }
                                    }
                                }
                            }
                        }
                    } catch (JSONException e) {
                    }
                }
                return arrayList;
            } catch (JSONException e2) {
                Log.w("GooglePlacesAddressSour", "Response does not contain predictions");
                return null;
            }
        }
        String str2 = "GooglePlacesAddressSour";
        str = "Response has invalid status: ";
        optString = String.valueOf(optString);
        Log.w(str2, optString.length() != 0 ? str.concat(optString) : new String(str));
        return null;
    }

    private static List m29775a(JSONObject jSONObject) {
        List arrayList = new ArrayList();
        try {
            JSONArray jSONArray = jSONObject.getJSONArray("matched_substrings");
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                arrayList.add(Pair.create(Integer.valueOf(jSONObject2.getInt("offset")), Integer.valueOf(jSONObject2.getInt("length"))));
            }
        } catch (JSONException e) {
        }
        return arrayList;
    }

    private static String m29781b(JSONObject jSONObject) {
        int i = 0;
        int i2 = jSONObject.getJSONArray("matched_substrings").getJSONObject(0).getInt("offset");
        JSONArray jSONArray = jSONObject.getJSONArray("terms");
        int length = jSONArray.length();
        while (i < length) {
            JSONObject jSONObject2 = jSONArray.getJSONObject(i);
            if (i2 < jSONObject2.getInt("offset") + jSONObject2.getString("value").length()) {
                return jSONObject2.getString("value");
            }
            i++;
        }
        return null;
    }

    private static boolean m29778a(JSONObject jSONObject, String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            JSONArray jSONArray = jSONObject.getJSONArray("types");
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                if (str.equalsIgnoreCase(jSONArray.getString(i))) {
                    return true;
                }
            }
            return false;
        } catch (JSONException e) {
            return false;
        }
    }

    private static com.google.p440g.p441a.p442a.C7147b m29780b(org.json.JSONObject r11, java.lang.String r12) {
        /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:37)
	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:61)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:33)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:37)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:306)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:199)
*/
        /*
        r10 = 1;
        r1 = 0;
        r3 = 0;
        if (r11 != 0) goto L_0x0007;
    L_0x0005:
        r0 = r1;
    L_0x0006:
        return r0;
    L_0x0007:
        r0 = "status";
        r0 = r11.optString(r0);
        r2 = "OK";
        r2 = r2.equalsIgnoreCase(r0);
        if (r2 != 0) goto L_0x0032;
    L_0x0015:
        r2 = "GooglePlacesAddressSour";
        r3 = "Response has invalid status: ";
        r0 = java.lang.String.valueOf(r0);
        r4 = r0.length();
        if (r4 == 0) goto L_0x002c;
    L_0x0023:
        r0 = r3.concat(r0);
    L_0x0027:
        android.util.Log.w(r2, r0);
        r0 = r1;
        goto L_0x0006;
    L_0x002c:
        r0 = new java.lang.String;
        r0.<init>(r3);
        goto L_0x0027;
    L_0x0032:
        r0 = "result";	 Catch:{ JSONException -> 0x005a }
        r0 = r11.getJSONObject(r0);	 Catch:{ JSONException -> 0x005a }
        r2 = "address_components";	 Catch:{ JSONException -> 0x005d }
        r2 = r0.getJSONArray(r2);	 Catch:{ JSONException -> 0x005d }
        r4 = new android.support.v4.h.u;
        r4.<init>();
        r5 = r2.length();
        r1 = r3;
    L_0x0048:
        if (r1 >= r5) goto L_0x0090;
    L_0x004a:
        r6 = r2.getJSONObject(r1);	 Catch:{ JSONException -> 0x0153 }
        r0 = "postal_code_prefix";	 Catch:{ JSONException -> 0x0153 }
        r0 = com.google.android.wallet.common.p376a.C6560l.m29778a(r6, r0);	 Catch:{ JSONException -> 0x0153 }
        if (r0 == 0) goto L_0x0060;	 Catch:{ JSONException -> 0x0153 }
    L_0x0056:
        r0 = r1 + 1;	 Catch:{ JSONException -> 0x0153 }
        r1 = r0;	 Catch:{ JSONException -> 0x0153 }
        goto L_0x0048;	 Catch:{ JSONException -> 0x0153 }
    L_0x005a:
        r0 = move-exception;	 Catch:{ JSONException -> 0x0153 }
        r0 = r1;	 Catch:{ JSONException -> 0x0153 }
        goto L_0x0006;	 Catch:{ JSONException -> 0x0153 }
    L_0x005d:
        r0 = move-exception;	 Catch:{ JSONException -> 0x0153 }
        r0 = r1;	 Catch:{ JSONException -> 0x0153 }
        goto L_0x0006;	 Catch:{ JSONException -> 0x0153 }
    L_0x0060:
        r0 = "administrative_area_level_1";	 Catch:{ JSONException -> 0x0153 }
        r0 = com.google.android.wallet.common.p376a.C6560l.m29778a(r6, r0);	 Catch:{ JSONException -> 0x0153 }
        if (r0 != 0) goto L_0x0070;	 Catch:{ JSONException -> 0x0153 }
    L_0x0068:
        r0 = "country";	 Catch:{ JSONException -> 0x0153 }
        r0 = com.google.android.wallet.common.p376a.C6560l.m29778a(r6, r0);	 Catch:{ JSONException -> 0x0153 }
        if (r0 == 0) goto L_0x008d;	 Catch:{ JSONException -> 0x0153 }
    L_0x0070:
        r0 = "short_name";	 Catch:{ JSONException -> 0x0153 }
    L_0x0072:
        r7 = r6.getString(r0);	 Catch:{ JSONException -> 0x0153 }
        r0 = "types";	 Catch:{ JSONException -> 0x0153 }
        r6 = r6.getJSONArray(r0);	 Catch:{ JSONException -> 0x0153 }
        r8 = r6.length();	 Catch:{ JSONException -> 0x0153 }
        r0 = r3;	 Catch:{ JSONException -> 0x0153 }
    L_0x0081:
        if (r0 >= r8) goto L_0x0056;	 Catch:{ JSONException -> 0x0153 }
    L_0x0083:
        r9 = r6.getString(r0);	 Catch:{ JSONException -> 0x0153 }
        r4.put(r9, r7);	 Catch:{ JSONException -> 0x0153 }
        r0 = r0 + 1;	 Catch:{ JSONException -> 0x0153 }
        goto L_0x0081;	 Catch:{ JSONException -> 0x0153 }
    L_0x008d:
        r0 = "long_name";	 Catch:{ JSONException -> 0x0153 }
        goto L_0x0072;
    L_0x0090:
        r2 = new com.google.g.a.a.b;
        r2.<init>();
        r0 = "street_number";
        r0 = r4.containsKey(r0);
        if (r0 != 0) goto L_0x00a5;
    L_0x009d:
        r0 = "route";
        r0 = r4.containsKey(r0);
        if (r0 == 0) goto L_0x00c1;
    L_0x00a5:
        r0 = "street_number";
        r0 = r4.get(r0);
        r0 = (java.lang.String) r0;
        r1 = "route";
        r1 = r4.get(r1);
        r1 = (java.lang.String) r1;
        r5 = android.text.TextUtils.isEmpty(r0);
        if (r5 == 0) goto L_0x0114;
    L_0x00bb:
        r0 = new java.lang.String[r10];
        r0[r3] = r1;
        r2.f34916r = r0;
    L_0x00c1:
        r0 = "locality";
        r0 = r4.containsKey(r0);
        if (r0 == 0) goto L_0x00d3;
    L_0x00c9:
        r0 = "locality";
        r0 = r4.get(r0);
        r0 = (java.lang.String) r0;
        r2.f34905g = r0;
    L_0x00d3:
        r0 = "administrative_area_level_1";
        r0 = r4.containsKey(r0);
        if (r0 == 0) goto L_0x00e5;
    L_0x00db:
        r0 = "administrative_area_level_1";
        r0 = r4.get(r0);
        r0 = (java.lang.String) r0;
        r2.f34903e = r0;
    L_0x00e5:
        r0 = "postal_code";
        r0 = r4.containsKey(r0);
        if (r0 == 0) goto L_0x00f7;
    L_0x00ed:
        r0 = "postal_code";
        r0 = r4.get(r0);
        r0 = (java.lang.String) r0;
        r2.f34910l = r0;
    L_0x00f7:
        r0 = "country";
        r0 = r4.containsKey(r0);
        if (r0 == 0) goto L_0x0109;
    L_0x00ff:
        r0 = "country";
        r0 = r4.get(r0);
        r0 = (java.lang.String) r0;
        r2.f34899a = r0;
    L_0x0109:
        r0 = android.text.TextUtils.isEmpty(r12);
        if (r0 != 0) goto L_0x0111;
    L_0x010f:
        r2.f34902d = r12;
    L_0x0111:
        r0 = r2;
        goto L_0x0006;
    L_0x0114:
        r5 = android.text.TextUtils.isEmpty(r1);
        if (r5 == 0) goto L_0x0121;
    L_0x011a:
        r1 = new java.lang.String[r10];
        r1[r3] = r0;
        r2.f34916r = r1;
        goto L_0x00c1;
    L_0x0121:
        r5 = new java.lang.String[r10];
        r6 = java.lang.String.valueOf(r0);
        r6 = r6.length();
        r6 = r6 + 1;
        r7 = java.lang.String.valueOf(r1);
        r7 = r7.length();
        r6 = r6 + r7;
        r7 = new java.lang.StringBuilder;
        r7.<init>(r6);
        r0 = r7.append(r0);
        r6 = " ";
        r0 = r0.append(r6);
        r0 = r0.append(r1);
        r0 = r0.toString();
        r5[r3] = r0;
        r2.f34916r = r5;
        goto L_0x00c1;
    L_0x0153:
        r0 = move-exception;
        goto L_0x0056;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.wallet.common.a.l.b(org.json.JSONObject, java.lang.String):com.google.g.a.a.b");
    }
}
