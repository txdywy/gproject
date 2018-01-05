package com.google.android.gms.auth.api.signin;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.am;
import com.google.android.gms.common.internal.safeparcel.C5130b;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.util.C5147b;
import com.google.android.gms.common.util.C5153h;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public class GoogleSignInAccount extends zza implements ReflectedParcelable {
    public static final Creator CREATOR = new C4938d();
    public static C5147b f25360a = C5153h.f26089a;
    public static Comparator f25361n = new C4937c();
    public int f25362b;
    public String f25363c;
    public String f25364d;
    public String f25365e;
    public String f25366f;
    public Uri f25367g;
    public String f25368h;
    public long f25369i;
    public String f25370j;
    public List f25371k;
    public String f25372l;
    public String f25373m;

    GoogleSignInAccount(int i, String str, String str2, String str3, String str4, Uri uri, String str5, long j, String str6, List list, String str7, String str8) {
        this.f25362b = i;
        this.f25363c = str;
        this.f25364d = str2;
        this.f25365e = str3;
        this.f25366f = str4;
        this.f25367g = uri;
        this.f25368h = str5;
        this.f25369i = j;
        this.f25370j = str6;
        this.f25371k = list;
        this.f25372l = str7;
        this.f25373m = str8;
    }

    public static GoogleSignInAccount m22951a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        Uri uri = null;
        Object optString = jSONObject.optString("photoUrl", null);
        if (!TextUtils.isEmpty(optString)) {
            uri = Uri.parse(optString);
        }
        long parseLong = Long.parseLong(jSONObject.getString("expirationTime"));
        Object hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("grantedScopes");
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            hashSet.add(new Scope(jSONArray.getString(i)));
        }
        String optString2 = jSONObject.optString("id");
        String optString3 = jSONObject.optString("tokenId", null);
        String optString4 = jSONObject.optString("email", null);
        String optString5 = jSONObject.optString("displayName", null);
        String optString6 = jSONObject.optString("givenName", null);
        String optString7 = jSONObject.optString("familyName", null);
        Long valueOf = Long.valueOf(parseLong);
        GoogleSignInAccount googleSignInAccount = new GoogleSignInAccount(3, optString2, optString3, optString4, optString5, uri, null, (valueOf == null ? Long.valueOf(f25360a.mo4629a() / 1000) : valueOf).longValue(), am.m23735a(jSONObject.getString("obfuscatedIdentifier")), new ArrayList((Collection) am.m23733a(hashSet)), optString6, optString7);
        googleSignInAccount.f25368h = jSONObject.optString("serverAuthCode", null);
        return googleSignInAccount;
    }

    public boolean equals(Object obj) {
        return !(obj instanceof GoogleSignInAccount) ? false : ((GoogleSignInAccount) obj).m22952a().toString().equals(m22952a().toString());
    }

    public int hashCode() {
        return m22952a().toString().hashCode();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C5130b.m23836a(parcel, 20293);
        C5130b.m23854b(parcel, 1, this.f25362b);
        C5130b.m23844a(parcel, 2, this.f25363c);
        C5130b.m23844a(parcel, 3, this.f25364d);
        C5130b.m23844a(parcel, 4, this.f25365e);
        C5130b.m23844a(parcel, 5, this.f25366f);
        C5130b.m23842a(parcel, 6, this.f25367g, i);
        C5130b.m23844a(parcel, 7, this.f25368h);
        C5130b.m23839a(parcel, 8, this.f25369i);
        C5130b.m23844a(parcel, 9, this.f25370j);
        C5130b.m23855b(parcel, 10, this.f25371k);
        C5130b.m23844a(parcel, 11, this.f25372l);
        C5130b.m23844a(parcel, 12, this.f25373m);
        C5130b.m23853b(parcel, a);
    }

    public final JSONObject m22952a() {
        JSONObject jSONObject = new JSONObject();
        try {
            if (this.f25363c != null) {
                jSONObject.put("id", this.f25363c);
            }
            if (this.f25364d != null) {
                jSONObject.put("tokenId", this.f25364d);
            }
            if (this.f25365e != null) {
                jSONObject.put("email", this.f25365e);
            }
            if (this.f25366f != null) {
                jSONObject.put("displayName", this.f25366f);
            }
            if (this.f25372l != null) {
                jSONObject.put("givenName", this.f25372l);
            }
            if (this.f25373m != null) {
                jSONObject.put("familyName", this.f25373m);
            }
            if (this.f25367g != null) {
                jSONObject.put("photoUrl", this.f25367g.toString());
            }
            if (this.f25368h != null) {
                jSONObject.put("serverAuthCode", this.f25368h);
            }
            jSONObject.put("expirationTime", this.f25369i);
            jSONObject.put("obfuscatedIdentifier", this.f25370j);
            JSONArray jSONArray = new JSONArray();
            Collections.sort(this.f25371k, f25361n);
            for (Scope scope : this.f25371k) {
                jSONArray.put(scope.f25624b);
            }
            jSONObject.put("grantedScopes", jSONArray);
            return jSONObject;
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
}
