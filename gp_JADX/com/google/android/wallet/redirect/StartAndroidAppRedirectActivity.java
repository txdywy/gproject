package com.google.android.wallet.redirect;

import android.content.Context;
import android.content.Intent;
import android.content.res.TypedArray;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.b.b;
import android.support.b.j;
import android.support.v7.app.aa;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import com.google.a.a.a.a.b.a.a.h.a.c;
import com.google.a.a.a.a.b.a.a.h.a.d;
import com.google.android.c.i;
import com.google.android.wallet.a.a;
import com.google.android.wallet.analytics.C6495c;
import com.google.android.wallet.common.util.ParcelableProto;
import com.google.android.wallet.p383e.C6617a;
import com.google.android.wallet.p383e.C6622f;
import com.google.android.wallet.p383e.C6623g;
import com.google.android.wallet.p383e.C6625i;
import com.google.android.wallet.ui.common.ci;
import org.chromium.customtabsclient.shared.C6645b;
import org.chromium.customtabsclient.shared.C7915a;
import org.chromium.customtabsclient.shared.KeepAliveService;

public class StartAndroidAppRedirectActivity extends aa implements OnClickListener, Runnable, C6645b {
    public Handler f32824c;
    public ViewGroup f32825q;
    public View f32826r;
    public ImageView f32827s;
    public boolean f32828t;
    public boolean f32829u;
    public C7915a f32830v;
    public byte[] f32831w;
    public C6495c f32832x;
    public int f32833y;

    public static Intent m30040a(Context context, Uri uri) {
        Intent intent = new Intent(context, StartAndroidAppRedirectActivity.class);
        intent.setAction("com.google.android.wallet.redirect.intent.action.FINISH_REDIRECT");
        intent.setData(uri);
        intent.addFlags(67108864);
        return intent;
    }

    public void onCreate(Bundle bundle) {
        i.a = getApplicationContext().getContentResolver();
        Intent intent = getIntent();
        if ("com.google.android.wallet.redirect.intent.action.FINISH_REDIRECT".equals(intent.getAction())) {
            Log.i("StartAndroidAppRedirect", "Ignoring unexpected finish redirect intent");
            super.onCreate(bundle);
            finish();
            return;
        }
        setTheme(intent.getIntExtra("activityThemeResId", -1));
        this.f32831w = intent.getByteArrayExtra("logToken");
        intent.getParcelableExtra("parentLogContext");
        this.f32829u = intent.hasExtra("startAndroidAppIntent");
        if (bundle == null) {
            this.f32828t = true;
        } else {
            this.f32828t = bundle.getBoolean("startingAndroidAppRedirect");
        }
        if (this.f32829u) {
            super.onCreate(bundle);
            setContentView(C6623g.activity_start_android_app_redirect);
            a((Toolbar) findViewById(C6622f.toolbar));
            G_().a().a(true);
            setTitle(C6625i.wallet_uic_android_app_redirect_indeterminate_title);
            this.f32825q = (ViewGroup) findViewById(C6622f.message_and_button_container);
            this.f32826r = ((ViewStub) findViewById(C6622f.loading_progress)).inflate();
            LayoutInflater.from(this).inflate(C6623g.view_start_android_app_redirect_ok_button, this.f32825q).findViewById(C6622f.ok_button).setOnClickListener(this);
            this.f32827s = (ImageView) findViewById(C6622f.logo);
            TypedArray obtainStyledAttributes = obtainStyledAttributes(new int[]{C6617a.uicPopupRedirectIntegratorLogoDrawable});
            TypedValue peekValue = obtainStyledAttributes.peekValue(0);
            obtainStyledAttributes.recycle();
            ci.m30860a(this.f32827s, peekValue);
            if (bundle != null && bundle.getBoolean("showingCanceledText", false)) {
                m30042k();
            }
            if (this.f32828t) {
                intent = (Intent) getIntent().getParcelableExtra("startAndroidAppIntent");
                if (intent == null) {
                    Log.e("StartAndroidAppRedirect", "Starting Activity without a redirect Intent");
                    m30041c(60);
                    finish();
                    return;
                }
                startActivity(intent);
            }
            this.f32824c = new Handler(Looper.getMainLooper());
            return;
        }
        super.onCreate(bundle);
        if (this.f32828t) {
            this.f32830v = new C7915a(this);
            if (!b.a(this, "com.android.chrome", this.f32830v)) {
                m30041c(63);
                finish();
            }
        }
    }

    protected void onDestroy() {
        super.onDestroy();
        if (this.f32830v != null) {
            unbindService(this.f32830v);
            this.f32830v = null;
        }
    }

    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        if (!"com.google.android.wallet.redirect.intent.action.FINISH_REDIRECT".equals(intent.getAction()) || intent.getData() == null) {
            Log.e("StartAndroidAppRedirect", String.format("onNewIntent() with action: %s and data: %s", new Object[]{intent.getAction(), intent.getData()}));
            m30041c(61);
        } else {
            Intent intent2 = new Intent();
            intent2.setData(intent.getData());
            setResult(-1, intent2);
        }
        finish();
    }

    protected void onResume() {
        super.onResume();
        if (!this.f32828t) {
            if (!this.f32829u) {
                m30041c(62);
                finish();
            } else if (this.f32826r.getVisibility() == 0) {
                this.f32824c.postDelayed(this, ((Long) a.o.a()).longValue());
            }
        }
    }

    protected void onPause() {
        super.onPause();
        this.f32828t = false;
        if (this.f32829u) {
            this.f32824c.removeCallbacks(this);
        }
    }

    protected void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("startingAndroidAppRedirect", this.f32828t);
        if (this.f32829u) {
            bundle.putBoolean("showingCanceledText", this.f32825q.getVisibility() == 0);
        }
    }

    public final void mo5547a(b bVar) {
        int color;
        j jVar = new j(bVar.a(new C6708n(this)));
        d dVar = (d) ParcelableProto.m29886a(getIntent(), "displayOptions");
        if (dVar == null || !dVar.c) {
            TypedArray obtainStyledAttributes = getTheme().obtainStyledAttributes(new int[]{C6617a.colorPrimary});
            color = obtainStyledAttributes.getColor(0, -3355444);
            obtainStyledAttributes.recycle();
        } else {
            color = dVar.d;
        }
        android.support.b.i b = jVar.a(color).a().b();
        b.a.putExtra("android.support.customtabs.extra.KEEP_ALIVE", new Intent().setClassName(getPackageName(), KeepAliveService.class.getCanonicalName()));
        b.a.setFlags(524288);
        b.a(this, Uri.parse(getIntent().getStringExtra("initialUrl")));
    }

    public final void mo5546a() {
    }

    private final void m30041c(int i) {
        Intent intent = new Intent();
        intent.putExtra("analyticsResult", i);
        setResult(0, intent);
    }

    public void onClick(View view) {
        m30041c(62);
        finish();
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        m30041c(62);
        finish();
        return true;
    }

    public void run() {
        if (((c) ParcelableProto.m29886a(getIntent(), "androidAppInfo")).k) {
            m30041c(62);
            finish();
            return;
        }
        m30042k();
    }

    private final void m30042k() {
        this.f32826r.setVisibility(4);
        this.f32825q.setVisibility(0);
        setTitle(C6625i.wallet_uic_android_app_redirect_canceled_title);
    }
}
