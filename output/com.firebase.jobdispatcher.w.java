package com.firebase.jobdispatcher;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class com.firebase.jobdispatcher.w
{

    public final String a;

    w(String p0) {
        this.a = p0;
    }

    private static String a(List p0) {
        v1 = new JSONObject();
        v2 = new JSONArray();
        v3 = new JSONArray();
        v4 = p0.iterator();
        while (v4.hasNext()) {
            v0 = (com.firebase.jobdispatcher.al)v4.next();
            v2.put(v0.b);
            v3.put(v0.a);
        }
        try {
            v1.put("uri_flags", v2);
            v1.put("uris", v3);
        }
        catch (JSONException ex) {
            throw new RuntimeException(ex);
        }
        return v1.toString();
    }

    private static List a(String p0) {
        v1 = new ArrayList();
        try {
            v0 = new JSONObject(p0);
            v2 = v0.getJSONArray("uri_flags");
            v3 = v0.getJSONArray("uris");
            v0 = 0;
            while (v0 < v2.length()) {
                v1.add(new com.firebase.jobdispatcher.al(Uri.parse(v3.getString(v0)), v2.getInt(v0)));
                v0 = v0 + 1;
            }
        }
        catch (JSONException ex) {
            throw new RuntimeException(ex);
        }
        return v1;
    }

    final Bundle a(com.firebase.jobdispatcher.z p0, Bundle p1) {
        if (p1 == 0)
            throw new IllegalArgumentException("Unexpected null Bundle provided");
        v0 = p0.b();
        if (v0 != 0)
            p1.putAll(v0);
        v1 = String.valueOf(this.a);
        v0 = String.valueOf("persistent");
        if (v0.length() != 0)
            v0 = v1.concat(v0);
        else
            v0 = new String(v1);
        p1.putInt(v0, p0.g());
        v1 = String.valueOf(this.a);
        v0 = String.valueOf("recurring");
        if (v0.length() != 0)
            v0 = v1.concat(v0);
        else
            v0 = new String(v1);
        p1.putBoolean(v0, p0.h());
        v1 = String.valueOf(this.a);
        v0 = String.valueOf("replace_current");
        if (v0.length() != 0)
            v0 = v1.concat(v0);
        else
            v0 = new String(v1);
        p1.putBoolean(v0, p0.d());
        v1 = String.valueOf(this.a);
        v0 = String.valueOf("tag");
        if (v0.length() != 0)
            v0 = v1.concat(v0);
        else
            v0 = new String(v1);
        p1.putString(v0, p0.e());
        v1 = String.valueOf(this.a);
        v0 = String.valueOf("service");
        if (v0.length() != 0)
            v0 = v1.concat(v0);
        else
            v0 = new String(v1);
        p1.putString(v0, p0.i());
        v1 = String.valueOf(this.a);
        v0 = String.valueOf("constraints");
        if (v0.length() != 0)
            v0 = v1.concat(v0);
        else
            v0 = new String(v1);
        p1.putInt(v0, com.firebase.jobdispatcher.a.a(p0.a()));
        v0 = p0.f();
        if (v0 == com.firebase.jobdispatcher.ao.a) {
            v1 = String.valueOf(this.a);
            v0 = String.valueOf("trigger_type");
            if (v0.length() != 0)
                v0 = v1.concat(v0);
            else
                v0 = new String(v1);
            p1.putInt(v0, 2);
        }
        else if (v0 instanceof com.firebase.jobdispatcher.ai) {
            v2 = String.valueOf(this.a);
            v1 = String.valueOf("trigger_type");
            if (v1.length() != 0)
                v1 = v2.concat(v1);
            else
                v1 = new String(v2);
            p1.putInt(v1, 1);
            v2 = String.valueOf(this.a);
            v1 = String.valueOf("window_start");
            if (v1.length() != 0)
                v1 = v2.concat(v1);
            else
                v1 = new String(v2);
            p1.putInt(v1, ((com.firebase.jobdispatcher.ai)v0).a);
            v2 = String.valueOf(this.a);
            v1 = String.valueOf("window_end");
            if (v1.length() != 0)
                v1 = v2.concat(v1);
            else
                v1 = new String(v2);
            p1.putInt(v1, ((com.firebase.jobdispatcher.ai)v0).b);
        }
        else {
            if (!(v0 instanceof com.firebase.jobdispatcher.ah))
                throw new IllegalArgumentException("Unsupported trigger.");
            v2 = String.valueOf(this.a);
            v1 = String.valueOf("trigger_type");
            if (v1.length() != 0)
                v1 = v2.concat(v1);
            else
                v1 = new String(v2);
            p1.putInt(v1, 3);
            v1 = com.firebase.jobdispatcher.w.a(((com.firebase.jobdispatcher.ah)v0).a);
            v2 = String.valueOf(this.a);
            v0 = String.valueOf("observed_uris");
            if (v0.length() != 0)
                v0 = v2.concat(v0);
            else
                v0 = new String(v2);
            p1.putString(v0, v1);
        }
        v0 = p0.c();
        if (v0 == 0)
            v0 = com.firebase.jobdispatcher.am.a;
        v2 = String.valueOf(this.a);
        v1 = String.valueOf("retry_policy");
        if (v1.length() != 0)
            v1 = v2.concat(v1);
        else
            v1 = new String(v2);
        p1.putInt(v1, v0.b);
        v2 = String.valueOf(this.a);
        v1 = String.valueOf("initial_backoff_seconds");
        if (v1.length() != 0)
            v1 = v2.concat(v1);
        else
            v1 = new String(v2);
        p1.putInt(v1, v0.c);
        v2 = String.valueOf(this.a);
        v1 = String.valueOf("maximum_backoff_seconds");
        if (v1.length() != 0)
            v1 = v2.concat(v1);
        else
            v1 = new String(v2);
        p1.putInt(v1, v0.d);
        return p1;
    }

    public final com.firebase.jobdispatcher.y a(Bundle p0) {
        v1 = 0;
        if (p0 == 0)
            throw new IllegalArgumentException("Unexpected null Bundle provided");
        v4 = new Bundle(p0);
        v2 = String.valueOf(this.a);
        v0 = String.valueOf("recurring");
        if (v0.length() != 0)
            v0 = v2.concat(v0);
        else
            v0 = new String(v2);
        v5 = v4.getBoolean(v0);
        v2 = String.valueOf(this.a);
        v0 = String.valueOf("replace_current");
        if (v0.length() != 0)
            v0 = v2.concat(v0);
        else
            v0 = new String(v2);
        v6 = v4.getBoolean(v0);
        v2 = String.valueOf(this.a);
        v0 = String.valueOf("persistent");
        if (v0.length() != 0)
            v0 = v2.concat(v0);
        else
            v0 = new String(v2);
        v7 = v4.getInt(v0);
        v2 = String.valueOf(this.a);
        v0 = String.valueOf("constraints");
        if (v0.length() != 0)
            v0 = v2.concat(v0);
        else
            v0 = new String(v2);
        v8 = com.firebase.jobdispatcher.a.a(v4.getInt(v0));
        v2 = String.valueOf(this.a);
        v0 = String.valueOf("trigger_type");
        if (v0.length() != 0)
            v0 = v2.concat(v0);
        else
            v0 = new String(v2);
        switch (v4.getInt(v0)) {
            case 1:
                v2 = String.valueOf(this.a);
                v0 = String.valueOf("window_start");
                if (v0.length() != 0)
                    v0 = v2.concat(v0);
                else
                    v0 = new String(v2);
                v2 = v4.getInt(v0);
                v3 = String.valueOf(this.a);
                v0 = String.valueOf("window_end");
                if (v0.length() != 0)
                    v0 = v3.concat(v0);
                else
                    v0 = new String(v3);
                v0 = com.firebase.jobdispatcher.ao.a(v2, v4.getInt(v0));
                break;
            case 2:
                v0 = com.firebase.jobdispatcher.ao.a;
                break;
            case 3:
                v2 = String.valueOf(this.a);
                v0 = String.valueOf("observed_uris");
                if (v0.length() != 0)
                    v0 = v2.concat(v0);
                else
                    v0 = new String(v2);
                v0 = com.firebase.jobdispatcher.ao.a(Collections.unmodifiableList(com.firebase.jobdispatcher.w.a(v4.getString(v0))));
                break;
            default:
                if (Log.isLoggable("FJD.ExternalReceiver", 3))
                    Log.d("FJD.ExternalReceiver", "Unsupported trigger.");
                v0 = 0;
                break;
        }
        v3 = String.valueOf(this.a);
        v2 = String.valueOf("retry_policy");
        if (v2.length() != 0)
            v2 = v3.concat(v2);
        else
            v2 = new String(v3);
        v9 = v4.getInt(v2);
        if (v9 != 1 && v9 != 2)
            v2 = com.firebase.jobdispatcher.am.a;
        else {
            v10 = String.valueOf(this.a);
            v2 = String.valueOf("initial_backoff_seconds");
            if (v2.length() != 0)
                v2 = v10.concat(v2);
            else
                v2 = new String(v10);
            v10 = v4.getInt(v2);
            v11 = String.valueOf(this.a);
            v2 = String.valueOf("maximum_backoff_seconds");
            if (v2.length() != 0)
                v2 = v11.concat(v2);
            else
                v2 = new String(v11);
            v2 = new com.firebase.jobdispatcher.am(v9, v10, v4.getInt(v2));
        }
        v9 = String.valueOf(this.a);
        v3 = String.valueOf("tag");
        if (v3.length() != 0)
            v3 = v9.concat(v3);
        else
            v3 = new String(v9);
        v9 = v4.getString(v3);
        v10 = String.valueOf(this.a);
        v3 = String.valueOf("service");
        if (v3.length() != 0)
            v3 = v10.concat(v3);
        else
            v3 = new String(v10);
        v3 = v4.getString(v3);
        if (v9 != 0 && v3 != 0 && v0 != 0 && v2 != 0) {
            v1 = new com.firebase.jobdispatcher.y();
            v1.a = v9;
            v1.b = v3;
            v1.c = v0;
            v1.h = v2;
            v1.d = v5;
            v1.e = v7;
            v1.f = v8;
            v1.i = v6;
            if (!TextUtils.isEmpty(this.a)) {
                v2 = v4.keySet().iterator();
                while (v2.hasNext()) {
                    if (!((String)v2.next()).startsWith(this.a))
                        continue;
                    v2.remove();
                }
            }
            v1.g.putAll(v4);
        }
        return v1;
    }

}
