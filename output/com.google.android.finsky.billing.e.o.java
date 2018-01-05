package com.google.android.finsky.billing.e;

import com.android.volley.ServerError;
import com.android.volley.a.n;
import com.android.volley.m;
import java.io.UnsupportedEncodingException;
import org.json.JSONException;
import org.json.JSONObject;

public static class com.google.android.finsky.billing.e.o
{

    public static int a(ServerError p0, boolean p1) {
        try {
            v2 = new JSONObject(new String(p0.b.b, com.android.volley.a.n.a(p0.b.c))).getJSONObject("error");
            v3 = v2.optString("message");
            v0 = -1;
            switch (v3.hashCode()) {
                case -1616156298:
                    if (v3.equals("UNAUTHORIZED_CLIENT"))
                        v0 = 4;
                    break;
                case -1110397804:
                    if (v3.equals("INVALID_GRANT"))
                        v0 = 2;
                    break;
                case -4805671:
                    if (v3.equals("FORBIDDEN"))
                        v0 = 3;
                    break;
                case 1823199508:
                    if (v3.equals("PIN_LOCKED"))
                        v0 = 1;
                    break;
                case 1880971961:
                    if (v3.equals("PIN_NOTSET"))
                        v0 = 0;
                    break;
                default:
                    break;
            }
            switch (v0) {
                case 0:
                    v0 = 1001;
                    break;
                case 1:
                    v0 = 1002;
                    break;
                case 2:
                    if (p1 != 0)
                        v0 = 1003;
                    else
                        v0 = 1100;
                    break;
                case 3:
                    v0 = 906;
                    break;
                case 4:
                    v0 = 905;
                    break;
                default:
                    v0 = 900;
                    break;
            }
            if (v0 == 900)
                v0 = v2.optInt("code", 900);
            return v0;
        }
        catch (UnsupportedEncodingException ex) {
            v0 = 908;
            return v0;
        }
        catch (JSONException ex) {
            v0 = 907;
            return v0;
        }
    }

}
