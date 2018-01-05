package com.google.android.finsky.billing.addresschallenge.p156a;

import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

final class ah extends JSONObject {
    static ah m9541a(String str) {
        return new ah(new JSONTokener(str));
    }

    protected ah() {
    }

    private ah(JSONTokener jSONTokener) {
        super(jSONTokener);
    }

    private ah(JSONObject jSONObject, String[] strArr) {
        super(jSONObject, strArr);
    }

    private final String m9542d(String str) {
        try {
            Object obj = super.get(str);
            if (obj instanceof String) {
                return (String) obj;
            }
            if (obj instanceof Integer) {
                throw new IllegalArgumentException();
            }
            throw new ClassCastException();
        } catch (JSONException e) {
            return null;
        }
    }

    public final int getInt(String str) {
        try {
            Object obj = super.get(str);
            if (obj instanceof Integer) {
                return ((Integer) obj).intValue();
            }
            throw new RuntimeException("Something other than an int was returned");
        } catch (JSONException e) {
            return -1;
        }
    }

    final JSONArray m9543a() {
        return super.names();
    }

    final ah m9546b(String str) {
        try {
            Object obj = super.get(str);
            if (obj instanceof JSONObject) {
                JSONObject jSONObject = (JSONObject) obj;
                ArrayList arrayList = new ArrayList(jSONObject.length());
                Iterator keys = jSONObject.keys();
                while (keys.hasNext()) {
                    arrayList.add((String) keys.next());
                }
                return new ah(jSONObject, (String[]) arrayList.toArray(new String[arrayList.size()]));
            } else if (obj instanceof Integer) {
                throw new IllegalArgumentException();
            } else {
                throw new ClassCastException();
            }
        } catch (JSONException e) {
            return null;
        }
    }

    final boolean m9547c(String str) {
        return super.has(str);
    }

    final void m9544a(ah ahVar) {
        if (ahVar != null) {
            JSONArray names = ahVar.names();
            if (names != null) {
                for (int i = 0; i < names.length(); i++) {
                    try {
                        String string = names.getString(i);
                        if (!super.has(string)) {
                            super.put(string, super.get(string));
                        }
                    } catch (Throwable e) {
                        throw new RuntimeException(e);
                    } catch (JSONException e2) {
                    }
                }
            }
        }
    }

    final void m9545a(String str, JSONObject jSONObject) {
        try {
            super.put(str, jSONObject);
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public final /* synthetic */ Object get(String str) {
        return m9542d(str);
    }
}
