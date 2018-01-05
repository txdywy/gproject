package com.google.android.finsky.frameworkviews;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build$VERSION;
import android.support.v4.view.ai;
import android.util.AttributeSet;
import android.view.View$OnClickListener;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.TextView;
import com.android.vending.a;
import com.google.android.finsky.as.a;
import com.google.android.finsky.ba.c;
import com.google.android.finsky.ba.e;
import com.google.android.finsky.bg.h;
import com.google.android.finsky.providers.d;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.play.utils.h;

public class PlayActionButtonV2 extends Button
{

    public int h;
    public boolean i;
    public boolean j;
    public int k;
    public int l;
    public int m;
    public int n;
    public String o;
    public int p;
    public com.google.android.finsky.as.a q;
    public com.google.android.finsky.ba.c r;
    public boolean s;

    PlayActionButtonV2(Context p0) {
        PlayActionButtonV2(p0, 0);
    }

    PlayActionButtonV2(Context p0, AttributeSet p1) {
        Button(p0, p1);
        v0 = p0.obtainStyledAttributes(p1, com.android.vending.a.PlayActionButton);
        this.i = v0.getBoolean(1, 0);
        this.j = v0.getBoolean(2, 1);
        this.h = v0.getInt(0, 0);
        this.k = v0.getDimensionPixelSize(3, 0);
        this.l = v0.getDimensionPixelSize(4, 0);
        this.m = v0.getDimensionPixelSize(5, 0);
        this.n = v0.getInt(6, -1);
        v0.recycle();
    }

    private final void b() {
 12:    if (this.o == 0 || this.i != 0 && this.j == 0)
 22:        v0 = this.o;
        else
 91:        v0 = this.o.toUpperCase();
 24:    this.setText(v0);
 29:    if (this.i == 0) goto 101;
 35:    if (this.isClickable())
 37:        v0 = 2130837955;
        else
 96:        v0 = 0;
 40:    this.setBackgroundResource(v0);
 46:    if (this.h == 2)
 48:        v0 = 0;
        else
 98:        v0 = this.p;
 61:    this.setTextColor(this.getResources().getColor(com.google.android.finsky.bg.h.a(v0)));
 66:    if (this.i != 0 && !this.isClickable())
 74:        v0 = 1;
        else
356:        v0 = 0;
 75:    if (v0 == 0)
 85:        android.support.v4.view.ai.a(this, this.k, this.l, this.k, this.m);
        else
359:        android.support.v4.view.ai.a(this, 0, 0, 0, 0);
 88:    return;
103:    switch (this.h) {
            case 0:
103:            goto 107;
            case 1:
103:            goto 180;
            case 2:
103:            goto 208;
            case 3:
103:            goto 338;
            default:
        }
106:    goto 64;
109:    if (this.s != 0) {
113:        switch (this.p) {
                case 1:
149:                v0 = 2130837905;
363:                break;
                case 2:
161:                v0 = 2130837926;
363:                break;
                case 3:
141:                if (com.google.android.finsky.bg.h.b != 0)
143:                    v0 = 2130837896;
                    else
145:                    v0 = 2130837894;
363:                break;
                case 4:
157:                v0 = 2130837914;
363:                break;
                case 5:
118:                if (com.google.android.finsky.bg.h.b != 0)
120:                    v0 = 2130837896;
                    else
169:                    v0 = 2130837920;
363:                break;
                case 6:
153:                v0 = 2130837932;
363:                break;
                case 7:
118:                if (com.google.android.finsky.bg.h.b != 0)
120:                    v0 = 2130837896;
                    else
169:                    v0 = 2130837920;
363:                break;
                case 8:
118:                if (com.google.android.finsky.bg.h.b != 0)
120:                    v0 = 2130837896;
                    else
169:                    v0 = 2130837920;
363:                break;
                case 9:
118:                if (com.google.android.finsky.bg.h.b != 0)
120:                    v0 = 2130837896;
                    else
169:                    v0 = 2130837920;
363:                break;
                case 10:
165:                v0 = 2130837911;
363:                break;
                default:
118:                if (com.google.android.finsky.bg.h.b != 0)
120:                    v0 = 2130837896;
                    else
169:                    v0 = 2130837920;
363:                break;
            }
        }
        else
175:        v0 = com.google.android.finsky.bg.h.g(this.p);
121:    this.setBackgroundResource(v0);
135:    this.setTextColor(this.getResources().getColor(2131558951));
138:    goto 64;
186:    this.setBackgroundResource(com.google.android.finsky.bg.h.f(this.p));
203:    this.setTextColor(this.getResources().getColor(com.google.android.finsky.bg.h.a(this.p)));
206:    goto 64;
210:    if (this.s != 0) {
214:        switch (this.p) {
                case 1:
262:                v0 = 2130837908;
363:                break;
                case 2:
274:                v0 = 2130837929;
363:                break;
                case 3:
254:                if (com.google.android.finsky.bg.h.b != 0)
256:                    v0 = 2130837899;
                    else
258:                    v0 = 2130837902;
363:                break;
                case 4:
270:                v0 = 2130837917;
363:                break;
                case 5:
219:                if (com.google.android.finsky.bg.h.b != 0)
221:                    v0 = 2130837899;
                    else
278:                    v0 = 2130837923;
363:                break;
                case 6:
266:                v0 = 2130837935;
363:                break;
                default:
219:                if (com.google.android.finsky.bg.h.b != 0)
221:                    v0 = 2130837899;
                    else
278:                    v0 = 2130837923;
363:                break;
            }
        }
        else
284:        v0 = com.google.android.finsky.bg.h.f(this.p);
222:    this.setBackgroundResource(v0);
227:    if (this.s != 0) {
235:        switch (this.p) {
                case 1:
299:                v0 = 2131558961;
363:                break;
                case 2:
311:                v0 = 2131558976;
363:                break;
                case 3:
291:                if (com.google.android.finsky.bg.h.b != 0)
293:                    v0 = 2131558953;
                    else
295:                    v0 = 2131558957;
363:                break;
                case 4:
307:                v0 = 2131558968;
363:                break;
                case 5:
240:                if (com.google.android.finsky.bg.h.b != 0)
242:                    v0 = 2131558953;
                    else
315:                    v0 = 2131558972;
363:                break;
                case 6:
303:                v0 = 2131558980;
363:                break;
                default:
240:                if (com.google.android.finsky.bg.h.b != 0)
242:                    v0 = 2131558953;
                    else
315:                    v0 = 2131558972;
363:                break;
            }
247:        this.setTextColor(this.getResources().getColorStateList(v0));
        }
        else
333:        this.setTextColor(this.getResources().getColor(com.google.android.finsky.bg.h.a(this.p)));
250:    goto 64;
341:    this.setBackgroundResource(2130837601);
348:    if (Build$VERSION.SDK_INT >= 21)
351:        this.setStateListAnimator(0);
354:    goto 189;
    }

    public final void a() {
        super.setOnClickListener(0);
        this.setClickable(0);
        this.setFocusable(0);
    }

    public final void a(int p0, int p1, View$OnClickListener p2) {
        this.a(p0, this.getResources().getString(p1), p2);
    }

    public void a(int p0, String p1, View$OnClickListener p2) {
        this.o = p1;
        this.p = p0;
        if (p2 != 0)
            v0 = 1;
        else
            v0 = 0;
        if (v0 != 0) {
            this.setFocusable(1);
            super.setOnClickListener(p2);
            this.setClickable(1);
        }
        else {
            this.setFocusable(0);
            super.setOnClickListener(0);
            this.setClickable(0);
        }
        this.b();
    }

    public int getActionXPadding() {
        return this.k;
    }

    public int getPriority() {
        return this.n;
    }

    public void onFinishInflate() {
        ((com.google.android.finsky.frameworkviews.u)com.google.android.finsky.providers.d.a(com.google.android.finsky.frameworkviews.u)).a(this);
        super.onFinishInflate();
        if (this.q.h != 0 && this.r.dj().a(12638807))
            v0 = 1;
        else
            v0 = 0;
        this.s = v0;
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo p0) {
        super.onInitializeAccessibilityNodeInfo(p0);
        if (this.i != 0 && !this.isClickable())
            v0 = 1;
        else
            v0 = 0;
        if (v0 != 0)
            v0 = TextView.getName();
        else
            v0 = 0;
        com.google.android.play.utils.h.a(p0, v0);
    }

    public void setActionStyle(int p0) {
        if (this.h != p0) {
            if (Build$VERSION.SDK_INT < 21 && p0 == 3)
                FinskyLog.e("Borderless style cannot be used on pre-L devices.", new Object[0]);
            this.h = p0;
            this.b();
        }
    }

    public void setDrawAsLabel(boolean p0) {
        if (this.i != p0) {
            this.i = p0;
            this.b();
        }
    }

    public void setOnClickListener(View$OnClickListener p0) {
        FinskyLog.e("Don't call PlayActionButtonV2.setOnClickListener() directly, call configure().", new Object[0]);
    }

}
