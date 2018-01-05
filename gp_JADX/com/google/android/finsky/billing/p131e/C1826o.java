package com.google.android.finsky.billing.p131e;

import com.android.volley.C0697m;
import com.android.volley.ServerError;
import com.android.volley.p060a.C0673n;
import java.io.UnsupportedEncodingException;
import org.json.JSONException;
import org.json.JSONObject;

public final class C1826o {
    public static int m9850a(ServerError serverError, boolean z) {
        C0697m c0697m = serverError.b;
        try {
            int i;
            JSONObject jSONObject = new JSONObject(new String(c0697m.f4167b, C0673n.m4461a(c0697m.f4168c))).getJSONObject("error");
            String optString = jSONObject.optString("message");
            Object obj = -1;
            switch (optString.hashCode()) {
                case -1616156298:
                    if (optString.equals("UNAUTHORIZED_CLIENT")) {
                        obj = 4;
                        break;
                    }
                    break;
                case -1110397804:
                    if (optString.equals("INVALID_GRANT")) {
                        obj = 2;
                        break;
                    }
                    break;
                case -4805671:
                    if (optString.equals("FORBIDDEN")) {
                        obj = 3;
                        break;
                    }
                    break;
                case 1823199508:
                    if (optString.equals("PIN_LOCKED")) {
                        obj = 1;
                        break;
                    }
                    break;
                case 1880971961:
                    if (optString.equals("PIN_NOTSET")) {
                        obj = null;
                        break;
                    }
                    break;
            }
            switch (obj) {
                case null:
                    i = 1001;
                    break;
                case 1:
                    i = 1002;
                    break;
                case 2:
                    if (!z) {
                        i = 1100;
                        break;
                    }
                    i = 1003;
                    break;
                case 3:
                    i = 906;
                    break;
                case 4:
                    i = 905;
                    break;
                default:
                    i = 900;
                    break;
            }
            if (i != 900) {
                return i;
            }
            return jSONObject.optInt("code", 900);
        } catch (UnsupportedEncodingException e) {
            return 908;
        } catch (JSONException e2) {
            return 907;
        }
    }
}
