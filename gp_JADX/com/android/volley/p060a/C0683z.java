package com.android.volley.p060a;

import com.android.volley.C0657w;
import com.android.volley.C0660x;
import com.android.volley.C0697m;
import com.android.volley.C0704v;
import com.android.volley.ParseError;
import org.json.JSONObject;

public class C0683z extends aa {
    public C0683z(int i, String str, JSONObject jSONObject, C0660x c0660x, C0657w c0657w) {
        super(i, str, jSONObject == null ? null : jSONObject.toString(), c0660x, c0657w);
    }

    public C0683z(String str, JSONObject jSONObject, C0660x c0660x, C0657w c0657w) {
        this(jSONObject == null ? 0 : 1, str, jSONObject, c0660x, c0657w);
    }

    public C0704v mo1055a(C0697m c0697m) {
        try {
            return C0704v.m4517a(new JSONObject(new String(c0697m.f4167b, C0673n.m4462a(c0697m.f4168c, "utf-8"))), C0673n.m4460a(c0697m));
        } catch (Throwable e) {
            return C0704v.m4516a(new ParseError(e));
        } catch (Throwable e2) {
            return C0704v.m4516a(new ParseError(e2));
        }
    }
}
