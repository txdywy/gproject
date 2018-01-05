package com.google.android.finsky.billing.addresschallenge.a;

import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

public final class com.google.android.finsky.billing.addresschallenge.a.ah extends JSONObject
{

    ah() {
        JSONObject();
    }

    ah(JSONObject p0, String[] p1) {
        JSONObject(p0, p1);
    }

    ah(JSONTokener p0) {
        JSONObject(p0);
    }

    static com.google.android.finsky.billing.addresschallenge.a.ah a(String p0) {
        return new com.google.android.finsky.billing.addresschallenge.a.ah(new JSONTokener(p0));
    }

    private final String d(String p0) {
        try {
            v0 = super.get(p0);
            if (!(v0 instanceof String)) {
                if (!(v0 instanceof Integer))
                    throw new ClassCastException();
                throw new IllegalArgumentException();
            }
            v0 = (String)v0;
            return v0;
            v0 = 0;
            return v0;
        }
        catch (JSONException ex) {
            v0 = 0;
            return v0;
        }
    }

    final JSONArray a() {
        return super.names();
    }

    final void a(com.google.android.finsky.billing.addresschallenge.a.ah p0) {
  0:    if (p0 == 0)
  2:        return;
  3:    v2 = p0.names();
  7:    if (v2 == 0)
  2:        return;
  9:    v0 = 0;
 14:    if (v0 >= v2.length())
  2:        return;
 16:    v1 = v2.getString(v0);
 20:    try {
 24:        if (!super.has(v1))
 30:            super.put(v1, p0.get(v1));
        }
        catch (JSONException ex) {
 42:        throw new RuntimeException(ex);
        }
 33:    v0 = v0 + 1;
 35:    goto 10;
 42:    throw new RuntimeException(ex);
 44:    goto 33;
 45:    try
            run 37...43
        catch (JSONException ex) {
 37:        goto 43;
        }
 47:    try
            run 16...19
        catch (JSONException ex) {
 16:        goto 43;
        }
    }

    final void a(String p0, JSONObject p1) {
        try {
            super.put(p0, p1);
        }
        catch (JSONException ex) {
            throw new RuntimeException(ex);
        }
    }

    final com.google.android.finsky.billing.addresschallenge.a.ah b(String p0) {
  0:    v0 = super.get(p0);
  6:    if (!(v0 instanceof JSONObject)) {
 63:        if (v0 instanceof Integer)
 70:            throw new IllegalArgumentException();
 76:        throw new ClassCastException();
        }
 16:    v3 = new ArrayList(((JSONObject)v0).length());
 19:    v2 = ((JSONObject)v0).keys();
 23:    while (v2.hasNext())
 35:        v3.add((String)v2.next());
 38:    goto 42;
 40:    v0 = 0;
 41:    return v0;
 59:    v0 = new com.google.android.finsky.billing.addresschallenge.a.ah((JSONObject)v0, (String[])v3.toArray(new String[v3.size()]));
 60:    return v0;
 77:    try
            run 0...77
        catch (JSONException ex) {
  0:        goto 39;
        }
    }

    final boolean c(String p0) {
        return super.has(p0);
    }

    public final Object get(String p0) {
        return this.d(p0);
    }

    public final int getInt(String p0) {
        try {
            v0 = super.get(p0);
            if (!(v0 instanceof Integer))
                throw new RuntimeException("Something other than an int was returned");
            v0 = ((Integer)v0).intValue();
            return v0;
        }
        catch (JSONException ex) {
            v0 = -1;
            return v0;
        }
    }

}
