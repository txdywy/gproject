package org.keyczar;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
import org.keyczar.p569a.C7980b;
import org.keyczar.p569a.C7981c;
import org.keyczar.p571c.C7990b;
import org.keyczar.p571c.C7992d;
import org.keyczar.p572d.C7996b;

public final class C8005k {
    public String f41028a = "";
    public C7980b f41029b = C7980b.TEST;
    public C7990b f41030c = C7994c.TEST;
    public List f41031d = new ArrayList();
    public boolean f41032e = false;
    public Map f41033f = new HashMap();

    private C8005k(String str, C7980b c7980b, C7990b c7990b, List list, boolean z) {
        this.f41028a = str;
        this.f41029b = c7980b;
        this.f41030c = c7990b;
        this.f41031d = list;
        this.f41032e = z;
    }

    public final String toString() {
        Object obj = null;
        try {
            JSONObject put = new JSONObject().put("name", this.f41028a).put("purpose", this.f41029b != null ? this.f41029b.name() : null);
            String str = "type";
            if (this.f41030c != null) {
                obj = this.f41030c.mo6652a();
            }
            return put.put(str, obj).put("versions", m38229a()).put("encrypted", this.f41032e).toString();
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    private final JSONArray m38229a() {
        JSONArray jSONArray = new JSONArray();
        int size = this.f41031d.size();
        for (int i = 0; i < size; i++) {
            jSONArray.put(((C8006l) this.f41031d.get(i)).m38231a());
        }
        return jSONArray;
    }

    public static C8005k m38230a(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            String string = jSONObject.getString("name");
            C7980b c7980b = (C7980b) C7996b.m38190a(C7980b.class, jSONObject.optString("purpose"));
            C7992d c7992d = new C7992d();
            String string2 = jSONObject.getString("type");
            if (C7992d.f40995a.containsKey(string2)) {
                C8005k c8005k = new C8005k(string, c7980b, (C7990b) C7992d.f40995a.get(string2), C8005k.m38228a(jSONObject.getJSONArray("versions")), jSONObject.getBoolean("encrypted"));
                for (C8006l c8006l : c8005k.f41031d) {
                    c8005k.f41033f.put(Integer.valueOf(c8006l.f41036c), c8006l);
                }
                return c8005k;
            }
            throw new IllegalArgumentException(new StringBuilder(String.valueOf(string2).length() + 52).append("Cannot deserialize ").append(string2).append(" no such key has been registered.").toString());
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    private static List m38228a(JSONArray jSONArray) {
        List arrayList = new ArrayList();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            arrayList.add(new C8006l(jSONObject.getInt("versionNumber"), (C7981c) C7996b.m38190a(C7981c.class, jSONObject.optString("status")), jSONObject.getBoolean("exportable")));
        }
        return arrayList;
    }
}
