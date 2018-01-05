package com.google.android.gms.common.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.C5096b;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.internal.ao;
import com.google.p169b.p170a.p171a.p172a.p173a.p174a.C6331c;
import com.google.p169b.p170a.p171a.p172a.p173a.p174a.C6332e;

public class GoogleApiActivity extends Activity implements OnCancelListener {
    public int f25622a = 0;

    public static Intent m23270a(Context context, PendingIntent pendingIntent, int i, boolean z) {
        Intent intent = new Intent(context, GoogleApiActivity.class);
        intent.putExtra("pending_intent", pendingIntent);
        intent.putExtra("failing_client_id", i);
        intent.putExtra("notify_manager", z);
        return intent;
    }

    public Context createConfigurationContext(Configuration configuration) {
        return VERSION.SDK_INT >= 17 ? new C6332e(super.createConfigurationContext(configuration)) : null;
    }

    public AssetManager getAssets() {
        return C6331c.m28986b(this);
    }

    public Resources getResources() {
        return C6331c.m28981a(this);
    }

    public Theme getTheme() {
        return C6331c.m28987c(this);
    }

    protected void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1) {
            boolean booleanExtra = getIntent().getBooleanExtra("notify_manager", true);
            this.f25622a = 0;
            setResult(i2, intent);
            if (booleanExtra) {
                ao a = ao.m23405a((Context) this);
                switch (i2) {
                    case -1:
                        a.m23421b();
                        break;
                    case 0:
                        a.m23422b(new ConnectionResult(13, null), getIntent().getIntExtra("failing_client_id", -1));
                        break;
                }
            }
        } else if (i == 2) {
            this.f25622a = 0;
            setResult(i2, intent);
        }
        finish();
    }

    public void onCancel(DialogInterface dialogInterface) {
        this.f25622a = 0;
        setResult(0);
        finish();
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.f25622a = bundle.getInt("resolution");
        }
        if (this.f25622a != 1) {
            Bundle extras = getIntent().getExtras();
            if (extras == null) {
                Log.e("GoogleApiActivity", "Activity started without extras");
                finish();
                return;
            }
            PendingIntent pendingIntent = (PendingIntent) extras.get("pending_intent");
            Integer num = (Integer) extras.get("error_code");
            if (pendingIntent == null && num == null) {
                Log.e("GoogleApiActivity", "Activity started without resolution");
                finish();
            } else if (pendingIntent != null) {
                try {
                    startIntentSenderForResult(pendingIntent.getIntentSender(), 1, null, 0, 0, 0);
                    this.f25622a = 1;
                } catch (Throwable e) {
                    Log.e("GoogleApiActivity", "Failed to launch pendingIntent", e);
                    finish();
                }
            } else {
                C5096b.m23669a((Activity) this, num.intValue(), 2, (OnCancelListener) this);
                this.f25622a = 1;
            }
        }
    }

    protected void onSaveInstanceState(Bundle bundle) {
        bundle.putInt("resolution", this.f25622a);
        super.onSaveInstanceState(bundle);
    }

    public void setTheme(int i) {
        super.setTheme(i);
        C6331c.m28984a((Context) this, i);
    }
}
