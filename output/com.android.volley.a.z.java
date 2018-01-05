package com.android.volley.a;

import com.android.volley.ParseError;
import com.android.volley.m;
import com.android.volley.v;
import com.android.volley.w;
import com.android.volley.x;
import java.io.UnsupportedEncodingException;
import org.json.JSONException;
import org.json.JSONObject;

public class com.android.volley.a.z extends com.android.volley.a.aa
{

    z(int p0, String p1, JSONObject p2, com.android.volley.x p3, com.android.volley.w p4) {
        if (p2 == 0)
            v3 = 0;
        else
            v3 = p2.toString();
        com.android.volley.a.aa(p0, p1, v3, p3, p4);
    }

    z(String p0, JSONObject p1, com.android.volley.x p2, com.android.volley.w p3) {
        if (p1 == 0)
            v1 = 0;
        else
            v1 = 1;
        com.android.volley.a.z(v1, p0, p1, p2, p3);
    }

    public com.android.volley.v a(com.android.volley.m p0) {
        try {
            v0 = com.android.volley.v.a(new JSONObject(new String(p0.b, com.android.volley.a.n.a(p0.c, "utf-8"))), com.android.volley.a.n.a(p0));
        }
        catch (UnsupportedEncodingException ex) {
            v0 = com.android.volley.v.a(new ParseError(ex));
        }
        catch (JSONException ex) {
            v0 = com.android.volley.v.a(new ParseError(ex));
        }
        return v0;
    }

}
