package android.support.v7.widget;

import android.content.Context;
import android.graphics.Rect;
import android.support.v7.p040a.C0399f;
import android.support.v7.p040a.C0400g;
import android.support.v7.p040a.C0402i;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.view.WindowManager.LayoutParams;
import android.widget.TextView;

final class hu {
    public final Context f3602a;
    public final View f3603b;
    public final TextView f3604c;
    public final LayoutParams f3605d = new LayoutParams();
    public final Rect f3606e = new Rect();
    public final int[] f3607f = new int[2];
    public final int[] f3608g = new int[2];

    hu(Context context) {
        this.f3602a = context;
        this.f3603b = LayoutInflater.from(this.f3602a).inflate(C0400g.tooltip, null);
        this.f3604c = (TextView) this.f3603b.findViewById(C0399f.message);
        this.f3605d.setTitle(getClass().getSimpleName());
        this.f3605d.packageName = this.f3602a.getPackageName();
        this.f3605d.type = 1002;
        this.f3605d.width = -2;
        this.f3605d.height = -2;
        this.f3605d.format = -3;
        this.f3605d.windowAnimations = C0402i.Animation_AppCompat_Tooltip;
        this.f3605d.flags = 24;
    }

    final void m3846a() {
        if (m3847b()) {
            ((WindowManager) this.f3602a.getSystemService("window")).removeView(this.f3603b);
        }
    }

    final boolean m3847b() {
        return this.f3603b.getParent() != null;
    }
}
