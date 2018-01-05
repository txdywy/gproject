package com.firebase.jobdispatcher;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

final class C0754w {
    public final String f4711a;

    C0754w(String str) {
        this.f4711a = str;
    }

    final Bundle m4893a(C0751z c0751z, Bundle bundle) {
        if (bundle == null) {
            throw new IllegalArgumentException("Unexpected null Bundle provided");
        }
        String valueOf;
        Bundle b = c0751z.mo1119b();
        if (b != null) {
            bundle.putAll(b);
        }
        String valueOf2 = String.valueOf(this.f4711a);
        String valueOf3 = String.valueOf("persistent");
        bundle.putInt(valueOf3.length() != 0 ? valueOf2.concat(valueOf3) : new String(valueOf2), c0751z.mo1124g());
        valueOf2 = String.valueOf(this.f4711a);
        valueOf3 = String.valueOf("recurring");
        bundle.putBoolean(valueOf3.length() != 0 ? valueOf2.concat(valueOf3) : new String(valueOf2), c0751z.mo1125h());
        valueOf2 = String.valueOf(this.f4711a);
        valueOf3 = String.valueOf("replace_current");
        bundle.putBoolean(valueOf3.length() != 0 ? valueOf2.concat(valueOf3) : new String(valueOf2), c0751z.mo1121d());
        valueOf2 = String.valueOf(this.f4711a);
        valueOf3 = String.valueOf("tag");
        bundle.putString(valueOf3.length() != 0 ? valueOf2.concat(valueOf3) : new String(valueOf2), c0751z.mo1122e());
        valueOf2 = String.valueOf(this.f4711a);
        valueOf3 = String.valueOf("service");
        bundle.putString(valueOf3.length() != 0 ? valueOf2.concat(valueOf3) : new String(valueOf2), c0751z.mo1126i());
        valueOf2 = String.valueOf(this.f4711a);
        valueOf3 = String.valueOf("constraints");
        bundle.putInt(valueOf3.length() != 0 ? valueOf2.concat(valueOf3) : new String(valueOf2), C0732a.m4810a(c0751z.mo1118a()));
        ag f = c0751z.mo1123f();
        if (f == ao.f4673a) {
            valueOf2 = String.valueOf(this.f4711a);
            valueOf3 = String.valueOf("trigger_type");
            if (valueOf3.length() != 0) {
                valueOf3 = valueOf2.concat(valueOf3);
            } else {
                valueOf3 = new String(valueOf2);
            }
            bundle.putInt(valueOf3, 2);
        } else if (f instanceof ai) {
            ai aiVar = (ai) f;
            valueOf = String.valueOf(this.f4711a);
            valueOf2 = String.valueOf("trigger_type");
            bundle.putInt(valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf), 1);
            valueOf = String.valueOf(this.f4711a);
            valueOf2 = String.valueOf("window_start");
            bundle.putInt(valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf), aiVar.f4665a);
            valueOf = String.valueOf(this.f4711a);
            valueOf2 = String.valueOf("window_end");
            bundle.putInt(valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf), aiVar.f4666b);
        } else if (f instanceof ah) {
            valueOf = String.valueOf(this.f4711a);
            valueOf2 = String.valueOf("trigger_type");
            bundle.putInt(valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf), 3);
            valueOf2 = C0754w.m4891a(((ah) f).f4664a);
            valueOf = String.valueOf(this.f4711a);
            valueOf3 = String.valueOf("observed_uris");
            bundle.putString(valueOf3.length() != 0 ? valueOf.concat(valueOf3) : new String(valueOf), valueOf2);
        } else {
            throw new IllegalArgumentException("Unsupported trigger.");
        }
        am c = c0751z.mo1120c();
        if (c == null) {
            c = am.f4669a;
        }
        valueOf = String.valueOf(this.f4711a);
        valueOf2 = String.valueOf("retry_policy");
        bundle.putInt(valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf), c.f4670b);
        valueOf = String.valueOf(this.f4711a);
        valueOf2 = String.valueOf("initial_backoff_seconds");
        bundle.putInt(valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf), c.f4671c);
        valueOf = String.valueOf(this.f4711a);
        valueOf2 = String.valueOf("maximum_backoff_seconds");
        bundle.putInt(valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf), c.f4672d);
        return bundle;
    }

    public final C0756y m4894a(Bundle bundle) {
        C0756y c0756y = null;
        if (bundle == null) {
            throw new IllegalArgumentException("Unexpected null Bundle provided");
        }
        String valueOf;
        ag a;
        String valueOf2;
        am amVar;
        Bundle bundle2 = new Bundle(bundle);
        String valueOf3 = String.valueOf(this.f4711a);
        String valueOf4 = String.valueOf("recurring");
        boolean z = bundle2.getBoolean(valueOf4.length() != 0 ? valueOf3.concat(valueOf4) : new String(valueOf3));
        valueOf3 = String.valueOf(this.f4711a);
        valueOf4 = String.valueOf("replace_current");
        boolean z2 = bundle2.getBoolean(valueOf4.length() != 0 ? valueOf3.concat(valueOf4) : new String(valueOf3));
        valueOf3 = String.valueOf(this.f4711a);
        valueOf4 = String.valueOf("persistent");
        int i = bundle2.getInt(valueOf4.length() != 0 ? valueOf3.concat(valueOf4) : new String(valueOf3));
        valueOf3 = String.valueOf(this.f4711a);
        valueOf4 = String.valueOf("constraints");
        int[] a2 = C0732a.m4811a(bundle2.getInt(valueOf4.length() != 0 ? valueOf3.concat(valueOf4) : new String(valueOf3)));
        valueOf3 = String.valueOf(this.f4711a);
        valueOf4 = String.valueOf("trigger_type");
        switch (bundle2.getInt(valueOf4.length() != 0 ? valueOf3.concat(valueOf4) : new String(valueOf3))) {
            case 1:
                valueOf3 = String.valueOf(this.f4711a);
                valueOf4 = String.valueOf("window_start");
                int i2 = bundle2.getInt(valueOf4.length() != 0 ? valueOf3.concat(valueOf4) : new String(valueOf3));
                valueOf = String.valueOf(this.f4711a);
                valueOf4 = String.valueOf("window_end");
                a = ao.m4829a(i2, bundle2.getInt(valueOf4.length() != 0 ? valueOf.concat(valueOf4) : new String(valueOf)));
                break;
            case 2:
                a = ao.f4673a;
                break;
            case 3:
                valueOf3 = String.valueOf(this.f4711a);
                valueOf4 = String.valueOf("observed_uris");
                a = ao.m4828a(Collections.unmodifiableList(C0754w.m4892a(bundle2.getString(valueOf4.length() != 0 ? valueOf3.concat(valueOf4) : new String(valueOf3)))));
                break;
            default:
                if (Log.isLoggable("FJD.ExternalReceiver", 3)) {
                    Log.d("FJD.ExternalReceiver", "Unsupported trigger.");
                }
                a = null;
                break;
        }
        valueOf = String.valueOf(this.f4711a);
        valueOf3 = String.valueOf("retry_policy");
        int i3 = bundle2.getInt(valueOf3.length() != 0 ? valueOf.concat(valueOf3) : new String(valueOf));
        if (i3 == 1 || i3 == 2) {
            valueOf2 = String.valueOf(this.f4711a);
            valueOf3 = String.valueOf("initial_backoff_seconds");
            int i4 = bundle2.getInt(valueOf3.length() != 0 ? valueOf2.concat(valueOf3) : new String(valueOf2));
            String valueOf5 = String.valueOf(this.f4711a);
            valueOf3 = String.valueOf("maximum_backoff_seconds");
            amVar = new am(i3, i4, bundle2.getInt(valueOf3.length() != 0 ? valueOf5.concat(valueOf3) : new String(valueOf5)));
        } else {
            amVar = am.f4669a;
        }
        String valueOf6 = String.valueOf(this.f4711a);
        valueOf = String.valueOf("tag");
        valueOf6 = bundle2.getString(valueOf.length() != 0 ? valueOf6.concat(valueOf) : new String(valueOf6));
        valueOf2 = String.valueOf(this.f4711a);
        valueOf = String.valueOf("service");
        valueOf = bundle2.getString(valueOf.length() != 0 ? valueOf2.concat(valueOf) : new String(valueOf2));
        if (!(valueOf6 == null || valueOf == null || a == null || amVar == null)) {
            c0756y = new C0756y();
            c0756y.f4722a = valueOf6;
            c0756y.f4723b = valueOf;
            c0756y.f4724c = a;
            c0756y.f4729h = amVar;
            c0756y.f4725d = z;
            c0756y.f4726e = i;
            c0756y.f4727f = a2;
            c0756y.f4730i = z2;
            if (!TextUtils.isEmpty(this.f4711a)) {
                Iterator it = bundle2.keySet().iterator();
                while (it.hasNext()) {
                    if (((String) it.next()).startsWith(this.f4711a)) {
                        it.remove();
                    }
                }
            }
            c0756y.f4728g.putAll(bundle2);
        }
        return c0756y;
    }

    private static String m4891a(List list) {
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        JSONArray jSONArray2 = new JSONArray();
        for (al alVar : list) {
            jSONArray.put(alVar.f4668b);
            jSONArray2.put(alVar.f4667a);
        }
        try {
            jSONObject.put("uri_flags", jSONArray);
            jSONObject.put("uris", jSONArray2);
            return jSONObject.toString();
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    private static List m4892a(String str) {
        List arrayList = new ArrayList();
        try {
            JSONObject jSONObject = new JSONObject(str);
            JSONArray jSONArray = jSONObject.getJSONArray("uri_flags");
            JSONArray jSONArray2 = jSONObject.getJSONArray("uris");
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                arrayList.add(new al(Uri.parse(jSONArray2.getString(i)), jSONArray.getInt(i)));
            }
            return arrayList;
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
}
