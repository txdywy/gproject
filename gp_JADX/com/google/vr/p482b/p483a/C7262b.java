package com.google.vr.p482b.p483a;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.WindowManager.LayoutParams;
import com.google.vr.p479a.p480a.C7247j;
import com.google.vr.p479a.p480a.C7250m;
import com.google.vr.p482b.p483a.p484a.C7252c;

final class C7262b extends C7252c {
    public final /* synthetic */ C7261a f35527a;

    C7262b(C7261a c7261a) {
        this.f35527a = c7261a;
    }

    public final void mo6326a() {
        super.finish();
    }

    public final void mo6328a(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
    }

    public final void mo6334b() {
        super.onAttachedToWindow();
    }

    public final void mo6338c() {
        super.onBackPressed();
    }

    public final void mo6332a(C7247j c7247j) {
        super.onConfigurationChanged((Configuration) C7250m.m33872a(c7247j));
    }

    public final void mo6329a(Bundle bundle) {
        super.onCreate(bundle);
    }

    public final void mo6330a(Bundle bundle, PersistableBundle persistableBundle) {
        super.onCreate(bundle, persistableBundle);
    }

    public final void mo6341d() {
        super.onDestroy();
    }

    public final void mo6343e() {
        super.onDetachedFromWindow();
    }

    public final void mo6344f() {
        super.onEnterAnimationComplete();
    }

    public final void mo6345g() {
        super.onLowMemory();
    }

    public final void mo6346h() {
        super.onPause();
    }

    public final void mo6335b(Bundle bundle) {
        super.onPostCreate(bundle);
    }

    public final void mo6336b(Bundle bundle, PersistableBundle persistableBundle) {
        super.onPostCreate(bundle, persistableBundle);
    }

    public final void mo6347i() {
        super.onPostResume();
    }

    public final void mo6348j() {
        super.onRestart();
    }

    public final void mo6339c(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
    }

    public final void mo6340c(Bundle bundle, PersistableBundle persistableBundle) {
        super.onRestoreInstanceState(bundle, persistableBundle);
    }

    public final void mo6349k() {
        super.onResume();
    }

    public final void mo6342d(Bundle bundle) {
        super.onSaveInstanceState(bundle);
    }

    public final void mo6331a(Bundle bundle, C7247j c7247j) {
        super.onSaveInstanceState(bundle, (PersistableBundle) C7250m.m33872a(c7247j));
    }

    public final void mo6350l() {
        super.onStart();
    }

    public final void mo6351m() {
        super.onStop();
    }

    public final void mo6327a(int i) {
        super.onTrimMemory(i);
    }

    public final void mo6337b(C7247j c7247j) {
        super.onWindowAttributesChanged((LayoutParams) C7250m.m33872a(c7247j));
    }

    public final void mo6333a(boolean z) {
        super.onWindowFocusChanged(z);
    }
}
