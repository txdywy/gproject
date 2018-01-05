package com.google.android.finsky.cu;

import android.app.ActivityManager;
import com.google.android.finsky.utils.FinskyLog;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;

public final class com.google.android.finsky.cu.g implements com.android.volley.x
{

    public final com.google.android.finsky.cu.d a;

    g(com.google.android.finsky.cu.d p0) {
        this.a = p0;
    }

    public final void b_(Object p0) {
        try {
            this.a.g = 0;
        }
        catch (IOException ex) {
            v2 = new Object[1];
            v2[0] = ex.getMessage();
            FinskyLog.d("IOException: %s", v2);
            this.a.a.g();
            this.a.e = 0;
            this.a.c();
            return;
        }
        catch (JSONException ex) {
            FinskyLog.d("Unable to decode JSON response", new Object[0]);
            this.a.a.g();
            this.a.e = 0;
            this.a.c();
            return;
        }
        try {
            this.a.b.setDataSource(com.google.android.finsky.cu.d.a(((JSONObject)p0).getString("url")));
            this.a.b.prepareAsync();
            this.a.a.d();
        }
        catch (IllegalStateException ex) {
            try {
                v1 = new Object[1];
                v1[0] = Boolean.valueOf(ActivityManager.isUserAMonkey());
                FinskyLog.d("Illegal state while preparing audio. Is Monkey=%b.", v1);
            }
            catch (IOException ex) {
                v2 = new Object[1];
                v2[0] = ex.getMessage();
                FinskyLog.d("IOException: %s", v2);
                this.a.a.g();
                this.a.e = 0;
                this.a.c();
            }
            catch (JSONException ex) {
                FinskyLog.d("Unable to decode JSON response", new Object[0]);
                this.a.a.g();
                this.a.e = 0;
                this.a.c();
            }
        }
        catch (IOException ex) {
            v2 = new Object[1];
            v2[0] = ex.getMessage();
            FinskyLog.d("IOException: %s", v2);
            this.a.a.g();
            this.a.e = 0;
            this.a.c();
        }
        catch (JSONException ex) {
            FinskyLog.d("Unable to decode JSON response", new Object[0]);
            this.a.a.g();
            this.a.e = 0;
            this.a.c();
        }
    }

}
