package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.internal.C4959k;
import com.google.android.gms.auth.api.signin.internal.zzn;
import com.google.android.gms.common.api.C4925b;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.C5130b;
import com.google.android.gms.common.internal.safeparcel.zza;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

public class GoogleSignInOptions extends zza implements C4925b, ReflectedParcelable {
    public static final Creator CREATOR = new C4940f();
    public static final Scope f25374a = new Scope("profile");
    public static final Scope f25375b = new Scope("openid");
    public static Scope f25376c = new Scope("https://www.googleapis.com/auth/games");
    public static final GoogleSignInOptions f25377d;
    public static Comparator f25378n = new C4939e();
    public int f25379e;
    public final ArrayList f25380f;
    public Account f25381g;
    public boolean f25382h;
    public final boolean f25383i;
    public final boolean f25384j;
    public String f25385k;
    public String f25386l;
    public ArrayList f25387m;

    GoogleSignInOptions(int i, ArrayList arrayList, Account account, boolean z, boolean z2, boolean z3, String str, String str2, ArrayList arrayList2) {
        this(i, arrayList, account, z, z2, z3, str, str2, m22956b((List) arrayList2));
    }

    GoogleSignInOptions(int i, ArrayList arrayList, Account account, boolean z, boolean z2, boolean z3, String str, String str2, Map map) {
        this.f25379e = i;
        this.f25380f = arrayList;
        this.f25381g = account;
        this.f25382h = z;
        this.f25383i = z2;
        this.f25384j = z3;
        this.f25385k = str;
        this.f25386l = str2;
        this.f25387m = new ArrayList(map.values());
    }

    public static GoogleSignInOptions m22953a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        Collection hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("scopes");
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            hashSet.add(new Scope(jSONArray.getString(i)));
        }
        Object optString = jSONObject.optString("accountName", null);
        return new GoogleSignInOptions(3, new ArrayList(hashSet), !TextUtils.isEmpty(optString) ? new Account(optString, "com.google") : null, jSONObject.getBoolean("idTokenRequested"), jSONObject.getBoolean("serverAuthRequested"), jSONObject.getBoolean("forceCodeForRefreshToken"), jSONObject.optString("serverClientId", null), jSONObject.optString("hostedDomain", null), new HashMap());
    }

    private static Map m22956b(List list) {
        Map hashMap = new HashMap();
        if (list == null) {
            return hashMap;
        }
        for (zzn com_google_android_gms_auth_api_signin_internal_zzn : list) {
            hashMap.put(Integer.valueOf(com_google_android_gms_auth_api_signin_internal_zzn.f25468b), com_google_android_gms_auth_api_signin_internal_zzn);
        }
        return hashMap;
    }

    public final ArrayList m22964a() {
        return new ArrayList(this.f25380f);
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            GoogleSignInOptions googleSignInOptions = (GoogleSignInOptions) obj;
            if (this.f25387m.size() > 0 || googleSignInOptions.f25387m.size() > 0 || this.f25380f.size() != googleSignInOptions.m22964a().size() || !this.f25380f.containsAll(googleSignInOptions.m22964a())) {
                return false;
            }
            if (this.f25381g == null) {
                if (googleSignInOptions.f25381g != null) {
                    return false;
                }
            } else if (!this.f25381g.equals(googleSignInOptions.f25381g)) {
                return false;
            }
            if (TextUtils.isEmpty(this.f25385k)) {
                if (!TextUtils.isEmpty(googleSignInOptions.f25385k)) {
                    return false;
                }
            } else if (!this.f25385k.equals(googleSignInOptions.f25385k)) {
                return false;
            }
            return this.f25384j == googleSignInOptions.f25384j && this.f25382h == googleSignInOptions.f25382h && this.f25383i == googleSignInOptions.f25383i;
        } catch (ClassCastException e) {
            return false;
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C5130b.m23836a(parcel, 20293);
        C5130b.m23854b(parcel, 1, this.f25379e);
        C5130b.m23855b(parcel, 2, m22964a());
        C5130b.m23842a(parcel, 3, this.f25381g, i);
        C5130b.m23846a(parcel, 4, this.f25382h);
        C5130b.m23846a(parcel, 5, this.f25383i);
        C5130b.m23846a(parcel, 6, this.f25384j);
        C5130b.m23844a(parcel, 7, this.f25385k);
        C5130b.m23844a(parcel, 8, this.f25386l);
        C5130b.m23855b(parcel, 9, this.f25387m);
        C5130b.m23853b(parcel, a);
    }

    public int hashCode() {
        Object arrayList = new ArrayList();
        ArrayList arrayList2 = this.f25380f;
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            arrayList.add(((Scope) obj).f25624b);
        }
        Collections.sort(arrayList);
        return new C4959k().m23090a(arrayList).m23090a(this.f25381g).m23090a(this.f25385k).m23091a(this.f25384j).m23091a(this.f25382h).m23091a(this.f25383i).f25459b;
    }

    public final JSONObject m22965b() {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONArray jSONArray = new JSONArray();
            Collections.sort(this.f25380f, f25378n);
            ArrayList arrayList = this.f25380f;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                jSONArray.put(((Scope) obj).f25624b);
            }
            jSONObject.put("scopes", jSONArray);
            if (this.f25381g != null) {
                jSONObject.put("accountName", this.f25381g.name);
            }
            jSONObject.put("idTokenRequested", this.f25382h);
            jSONObject.put("forceCodeForRefreshToken", this.f25384j);
            jSONObject.put("serverAuthRequested", this.f25383i);
            if (!TextUtils.isEmpty(this.f25385k)) {
                jSONObject.put("serverClientId", this.f25385k);
            }
            if (!TextUtils.isEmpty(this.f25386l)) {
                jSONObject.put("hostedDomain", this.f25386l);
            }
            return jSONObject;
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    static {
        Scope scope = new Scope("email");
        C4936b a = new C4936b().m22967a();
        a.f25391a.add(f25374a);
        f25377d = a.m22969b();
        new C4936b().m22968a(f25376c, new Scope[0]).m22969b();
    }
}
