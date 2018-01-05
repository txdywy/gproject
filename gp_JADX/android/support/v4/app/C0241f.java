package android.support.v4.app;

import android.app.ActivityOptions;
import android.content.Context;
import android.os.Build.VERSION;
import android.os.Bundle;

public class C0241f {
    public static C0241f m1451a(Context context, int i, int i2) {
        if (VERSION.SDK_INT < 16) {
            return new C0241f();
        }
        ActivityOptions makeCustomAnimation = ActivityOptions.makeCustomAnimation(context, i, i2);
        if (VERSION.SDK_INT >= 24) {
            return new C0244i(makeCustomAnimation);
        }
        if (VERSION.SDK_INT >= 23) {
            return new C0243h(makeCustomAnimation);
        }
        return new C0242g(makeCustomAnimation);
    }

    protected C0241f() {
    }

    public Bundle mo321a() {
        return null;
    }
}
