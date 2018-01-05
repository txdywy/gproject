package com.google.android.gms.auth.api.signin.internal;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.app.C0254u;
import android.util.Log;
import android.view.accessibility.AccessibilityEvent;
import com.google.android.gms.auth.api.signin.SignInAccount;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.am;
import org.json.JSONObject;

@KeepName
public class SignInHubActivity extends C0254u {
    public C4966t f25401n;
    public boolean f25402o = false;
    public SignInConfiguration f25403p;
    public boolean f25404q;
    public int f25405r;
    public Intent f25406s;

    private final void m22970c(int i) {
        Parcelable status = new Status(i);
        Intent intent = new Intent();
        intent.putExtra("googleSignInStatus", status);
        setResult(0, intent);
        finish();
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return true;
    }

    protected void onActivityResult(int i, int i2, Intent intent) {
        if (!this.f25402o) {
            setResult(0);
            switch (i) {
                case 40962:
                    if (intent != null) {
                        SignInAccount signInAccount = (SignInAccount) intent.getParcelableExtra("signInAccount");
                        if (signInAccount != null && signInAccount.f25389b != null) {
                            Object obj = signInAccount.f25389b;
                            C4966t c4966t = this.f25401n;
                            Object obj2 = this.f25403p.f25400b;
                            am.m23733a(obj);
                            am.m23733a(obj2);
                            c4966t.m23106a("defaultGoogleSignInAccount", obj.f25370j);
                            am.m23733a(obj);
                            am.m23733a(obj2);
                            String str = obj.f25370j;
                            String b = C4966t.m23102b("googleSignInAccount", str);
                            JSONObject a = obj.m22952a();
                            a.remove("serverAuthCode");
                            c4966t.m23106a(b, a.toString());
                            c4966t.m23106a(C4966t.m23102b("googleSignInOptions", str), obj2.m22965b().toString());
                            intent.removeExtra("signInAccount");
                            intent.putExtra("googleSignInAccount", obj);
                            this.f25404q = true;
                            this.f25405r = i2;
                            this.f25406s = intent;
                            m22971f();
                            return;
                        } else if (intent.hasExtra("errorCode")) {
                            m22970c(intent.getIntExtra("errorCode", 8));
                            return;
                        }
                    }
                    m22970c(8);
                    return;
                default:
                    return;
            }
        }
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f25401n = C4966t.m23100a((Context) this);
        Intent intent = getIntent();
        if (!"com.google.android.gms.auth.GOOGLE_SIGN_IN".equals(intent.getAction())) {
            String str = "AuthSignInClient";
            String str2 = "Unknown action: ";
            String valueOf = String.valueOf(intent.getAction());
            Log.e(str, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
            finish();
        }
        this.f25403p = (SignInConfiguration) intent.getParcelableExtra("config");
        if (this.f25403p == null) {
            Log.e("AuthSignInClient", "Activity started with invalid configuration.");
            setResult(0);
            finish();
        } else if (bundle == null) {
            Intent intent2 = new Intent("com.google.android.gms.auth.GOOGLE_SIGN_IN");
            intent2.setPackage("com.google.android.gms");
            intent2.putExtra("config", this.f25403p);
            try {
                startActivityForResult(intent2, 40962);
            } catch (ActivityNotFoundException e) {
                this.f25402o = true;
                Log.w("AuthSignInClient", "Could not launch sign in Intent. Google Play Service is probably being updated...");
                m22970c(17);
            }
        } else {
            this.f25404q = bundle.getBoolean("signingInGoogleApiClients");
            if (this.f25404q) {
                this.f25405r = bundle.getInt("signInResultCode");
                this.f25406s = (Intent) bundle.getParcelable("signInResultData");
                m22971f();
            }
        }
    }

    protected void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("signingInGoogleApiClients", this.f25404q);
        if (this.f25404q) {
            bundle.putInt("signInResultCode", this.f25405r);
            bundle.putParcelable("signInResultData", this.f25406s);
        }
    }

    private final void m22971f() {
        b_().mo311a(0, null, new C4942a(this));
    }
}
