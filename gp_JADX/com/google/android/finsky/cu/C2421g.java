package com.google.android.finsky.cu;

import android.app.ActivityManager;
import com.android.volley.C0660x;
import com.google.android.finsky.utils.FinskyLog;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;

final class C2421g implements C0660x {
    public final /* synthetic */ C2417d f11742a;

    C2421g(C2417d c2417d) {
        this.f11742a = c2417d;
    }

    public final /* synthetic */ void b_(Object obj) {
        C2417d c2417d;
        JSONObject jSONObject = (JSONObject) obj;
        try {
            this.f11742a.f11732g = null;
            try {
                this.f11742a.f11727b.setDataSource(C2417d.m12128a(jSONObject.getString("url")));
                this.f11742a.f11727b.prepareAsync();
                this.f11742a.f11726a.mo2905d();
            } catch (IllegalStateException e) {
                FinskyLog.m21667d("Illegal state while preparing audio. Is Monkey=%b.", Boolean.valueOf(ActivityManager.isUserAMonkey()));
            }
        } catch (IOException e2) {
            FinskyLog.m21667d("IOException: %s", e2.getMessage());
            c2417d = this.f11742a;
            c2417d.f11726a.mo2908g();
            c2417d.f11730e = null;
            c2417d.m12131c();
        } catch (JSONException e3) {
            FinskyLog.m21667d("Unable to decode JSON response", new Object[0]);
            c2417d = this.f11742a;
            c2417d.f11726a.mo2908g();
            c2417d.f11730e = null;
            c2417d.m12131c();
        }
    }
}
