package com.google.vr.p482b.p483a;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v4.app.u;
import android.view.WindowManager.LayoutParams;
import com.google.vr.p479a.p480a.C7250m;
import com.google.vr.p482b.p483a.p484a.C7251b;
import com.google.vr.p482b.p483a.p484a.C7253a;

public abstract class C7261a extends u {
    public C7253a f35525v;
    public final C7251b f35526w = new C7262b(this);

    public abstract C7251b m33996a(C7251b c7251b);

    private final C7253a m33987f() {
        if (this.f35525v == null) {
            this.f35525v = C7253a.m33899a(m33996a(this.f35526w));
        }
        return this.f35525v;
    }

    public void onCreate(Bundle bundle) {
        m33987f().mo6329a(bundle);
    }

    public void onCreate(Bundle bundle, PersistableBundle persistableBundle) {
        m33987f().mo6330a(bundle, persistableBundle);
    }

    public void finish() {
        m33987f().mo6326a();
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        m33987f().mo6328a(i, i2, intent);
    }

    public void onAttachedToWindow() {
        m33987f().mo6334b();
    }

    public void onBackPressed() {
        m33987f().mo6338c();
    }

    public void onConfigurationChanged(Configuration configuration) {
        m33987f().mo6332a(C7250m.m33871a((Object) configuration));
    }

    protected void onDestroy() {
        m33987f().mo6341d();
    }

    public void onDetachedFromWindow() {
        m33987f().mo6343e();
    }

    public void onEnterAnimationComplete() {
        m33987f().mo6344f();
    }

    public void onLowMemory() {
        m33987f().mo6345g();
    }

    public void onPause() {
        m33987f().mo6346h();
    }

    protected void onPostCreate(Bundle bundle) {
        m33987f().mo6335b(bundle);
    }

    public void onPostCreate(Bundle bundle, PersistableBundle persistableBundle) {
        m33987f().mo6336b(bundle, persistableBundle);
    }

    protected void onPostResume() {
        m33987f().mo6347i();
    }

    protected void onRestart() {
        m33987f().mo6348j();
    }

    protected void onRestoreInstanceState(Bundle bundle) {
        m33987f().mo6339c(bundle);
    }

    public void onRestoreInstanceState(Bundle bundle, PersistableBundle persistableBundle) {
        m33987f().mo6340c(bundle, persistableBundle);
    }

    public void onResume() {
        m33987f().mo6349k();
    }

    protected void onSaveInstanceState(Bundle bundle) {
        m33987f().mo6342d(bundle);
    }

    public void onSaveInstanceState(Bundle bundle, PersistableBundle persistableBundle) {
        m33987f().mo6331a(bundle, C7250m.m33871a((Object) persistableBundle));
    }

    public void onStart() {
        m33987f().mo6350l();
    }

    protected void onStop() {
        m33987f().mo6351m();
    }

    public void onTrimMemory(int i) {
        m33987f().mo6327a(i);
    }

    public void onWindowAttributesChanged(LayoutParams layoutParams) {
        m33987f().mo6337b(C7250m.m33871a((Object) layoutParams));
    }

    public void onWindowFocusChanged(boolean z) {
        m33987f().mo6333a(z);
    }
}
