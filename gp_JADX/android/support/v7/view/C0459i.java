package android.support.v7.view;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.XmlResourceParser;
import android.support.v4.p032d.p033a.C0283a;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;

public final class C0459i extends MenuInflater {
    public static final Class[] f2571a;
    public static final Class[] f2572b;
    public final Object[] f2573c;
    public final Object[] f2574d = this.f2573c;
    public Context f2575e;
    public Object f2576f;

    public C0459i(Context context) {
        super(context);
        this.f2575e = context;
        this.f2573c = new Object[]{context};
    }

    public final void inflate(int i, Menu menu) {
        if (menu instanceof C0283a) {
            XmlResourceParser xmlResourceParser = null;
            try {
                xmlResourceParser = this.f2575e.getResources().getLayout(i);
                m2711a(xmlResourceParser, Xml.asAttributeSet(xmlResourceParser), menu);
                if (xmlResourceParser != null) {
                    xmlResourceParser.close();
                }
            } catch (Throwable e) {
                throw new InflateException("Error inflating menu XML", e);
            } catch (Throwable e2) {
                throw new InflateException("Error inflating menu XML", e2);
            } catch (Throwable th) {
                if (xmlResourceParser != null) {
                    xmlResourceParser.close();
                }
            }
        } else {
            super.inflate(i, menu);
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m2711a(org.xmlpull.v1.XmlPullParser r11, android.util.AttributeSet r12, android.view.Menu r13) {
        /*
        r10 = this;
        r4 = new android.support.v7.view.k;
        r4.<init>(r10, r13);
        r0 = r11.getEventType();
        r3 = 0;
        r2 = 0;
    L_0x000b:
        r1 = 2;
        if (r0 != r1) goto L_0x0046;
    L_0x000e:
        r0 = r11.getName();
        r1 = "menu";
        r1 = r0.equals(r1);
        if (r1 == 0) goto L_0x0031;
    L_0x001a:
        r0 = r11.next();
    L_0x001e:
        r1 = 0;
    L_0x001f:
        if (r1 != 0) goto L_0x0284;
    L_0x0021:
        switch(r0) {
            case 1: goto L_0x027c;
            case 2: goto L_0x004e;
            case 3: goto L_0x0213;
            default: goto L_0x0024;
        };
    L_0x0024:
        r0 = r1;
        r1 = r2;
        r2 = r3;
    L_0x0027:
        r3 = r11.next();
        r9 = r0;
        r0 = r3;
        r3 = r2;
        r2 = r1;
        r1 = r9;
        goto L_0x001f;
    L_0x0031:
        r1 = new java.lang.RuntimeException;
        r2 = new java.lang.StringBuilder;
        r3 = "Expecting menu, got ";
        r2.<init>(r3);
        r0 = r2.append(r0);
        r0 = r0.toString();
        r1.<init>(r0);
        throw r1;
    L_0x0046:
        r0 = r11.next();
        r1 = 1;
        if (r0 != r1) goto L_0x000b;
    L_0x004d:
        goto L_0x001e;
    L_0x004e:
        if (r3 != 0) goto L_0x0024;
    L_0x0050:
        r0 = r11.getName();
        r5 = "group";
        r5 = r0.equals(r5);
        if (r5 == 0) goto L_0x00a3;
    L_0x005c:
        r0 = r4.f2585F;
        r0 = r0.f2575e;
        r5 = android.support.v7.p040a.C0403j.MenuGroup;
        r0 = r0.obtainStyledAttributes(r12, r5);
        r5 = android.support.v7.p040a.C0403j.MenuGroup_android_id;
        r6 = 0;
        r5 = r0.getResourceId(r5, r6);
        r4.f2587b = r5;
        r5 = android.support.v7.p040a.C0403j.MenuGroup_android_menuCategory;
        r6 = 0;
        r5 = r0.getInt(r5, r6);
        r4.f2588c = r5;
        r5 = android.support.v7.p040a.C0403j.MenuGroup_android_orderInCategory;
        r6 = 0;
        r5 = r0.getInt(r5, r6);
        r4.f2589d = r5;
        r5 = android.support.v7.p040a.C0403j.MenuGroup_android_checkableBehavior;
        r6 = 0;
        r5 = r0.getInt(r5, r6);
        r4.f2590e = r5;
        r5 = android.support.v7.p040a.C0403j.MenuGroup_android_visible;
        r6 = 1;
        r5 = r0.getBoolean(r5, r6);
        r4.f2591f = r5;
        r5 = android.support.v7.p040a.C0403j.MenuGroup_android_enabled;
        r6 = 1;
        r5 = r0.getBoolean(r5, r6);
        r4.f2592g = r5;
        r0.recycle();
        r0 = r1;
        r1 = r2;
        r2 = r3;
        goto L_0x0027;
    L_0x00a3:
        r5 = "item";
        r5 = r0.equals(r5);
        if (r5 == 0) goto L_0x01f9;
    L_0x00ab:
        r0 = r4.f2585F;
        r0 = r0.f2575e;
        r5 = android.support.v7.p040a.C0403j.MenuItem;
        r5 = r0.obtainStyledAttributes(r12, r5);
        r0 = android.support.v7.p040a.C0403j.MenuItem_android_id;
        r6 = 0;
        r0 = r5.getResourceId(r0, r6);
        r4.f2594i = r0;
        r0 = android.support.v7.p040a.C0403j.MenuItem_android_menuCategory;
        r6 = r4.f2588c;
        r0 = r5.getInt(r0, r6);
        r6 = android.support.v7.p040a.C0403j.MenuItem_android_orderInCategory;
        r7 = r4.f2589d;
        r6 = r5.getInt(r6, r7);
        r7 = -65536; // 0xffffffffffff0000 float:NaN double:NaN;
        r0 = r0 & r7;
        r7 = 65535; // 0xffff float:9.1834E-41 double:3.23786E-319;
        r6 = r6 & r7;
        r0 = r0 | r6;
        r4.f2595j = r0;
        r0 = android.support.v7.p040a.C0403j.MenuItem_android_title;
        r0 = r5.getText(r0);
        r4.f2596k = r0;
        r0 = android.support.v7.p040a.C0403j.MenuItem_android_titleCondensed;
        r0 = r5.getText(r0);
        r4.f2597l = r0;
        r0 = android.support.v7.p040a.C0403j.MenuItem_android_icon;
        r6 = 0;
        r0 = r5.getResourceId(r0, r6);
        r4.f2598m = r0;
        r0 = android.support.v7.p040a.C0403j.MenuItem_android_alphabeticShortcut;
        r0 = r5.getString(r0);
        r0 = android.support.v7.view.C0461k.m2712a(r0);
        r4.f2599n = r0;
        r0 = android.support.v7.p040a.C0403j.MenuItem_alphabeticModifiers;
        r6 = 4096; // 0x1000 float:5.74E-42 double:2.0237E-320;
        r0 = r5.getInt(r0, r6);
        r4.f2600o = r0;
        r0 = android.support.v7.p040a.C0403j.MenuItem_android_numericShortcut;
        r0 = r5.getString(r0);
        r0 = android.support.v7.view.C0461k.m2712a(r0);
        r4.f2601p = r0;
        r0 = android.support.v7.p040a.C0403j.MenuItem_numericModifiers;
        r6 = 4096; // 0x1000 float:5.74E-42 double:2.0237E-320;
        r0 = r5.getInt(r0, r6);
        r4.f2602q = r0;
        r0 = android.support.v7.p040a.C0403j.MenuItem_android_checkable;
        r0 = r5.hasValue(r0);
        if (r0 == 0) goto L_0x01dc;
    L_0x0125:
        r0 = android.support.v7.p040a.C0403j.MenuItem_android_checkable;
        r6 = 0;
        r0 = r5.getBoolean(r0, r6);
        if (r0 == 0) goto L_0x01d9;
    L_0x012e:
        r0 = 1;
    L_0x012f:
        r4.f2603r = r0;
    L_0x0131:
        r0 = android.support.v7.p040a.C0403j.MenuItem_android_checked;
        r6 = 0;
        r0 = r5.getBoolean(r0, r6);
        r4.f2604s = r0;
        r0 = android.support.v7.p040a.C0403j.MenuItem_android_visible;
        r6 = r4.f2591f;
        r0 = r5.getBoolean(r0, r6);
        r4.f2605t = r0;
        r0 = android.support.v7.p040a.C0403j.MenuItem_android_enabled;
        r6 = r4.f2592g;
        r0 = r5.getBoolean(r0, r6);
        r4.f2606u = r0;
        r0 = android.support.v7.p040a.C0403j.MenuItem_showAsAction;
        r6 = -1;
        r0 = r5.getInt(r0, r6);
        r4.f2607v = r0;
        r0 = android.support.v7.p040a.C0403j.MenuItem_android_onClick;
        r0 = r5.getString(r0);
        r4.f2611z = r0;
        r0 = android.support.v7.p040a.C0403j.MenuItem_actionLayout;
        r6 = 0;
        r0 = r5.getResourceId(r0, r6);
        r4.f2608w = r0;
        r0 = android.support.v7.p040a.C0403j.MenuItem_actionViewClass;
        r0 = r5.getString(r0);
        r4.f2609x = r0;
        r0 = android.support.v7.p040a.C0403j.MenuItem_actionProviderClass;
        r0 = r5.getString(r0);
        r4.f2610y = r0;
        r0 = r4.f2610y;
        if (r0 == 0) goto L_0x01e2;
    L_0x017c:
        r0 = 1;
    L_0x017d:
        if (r0 == 0) goto L_0x01e4;
    L_0x017f:
        r6 = r4.f2608w;
        if (r6 != 0) goto L_0x01e4;
    L_0x0183:
        r6 = r4.f2609x;
        if (r6 != 0) goto L_0x01e4;
    L_0x0187:
        r0 = r4.f2610y;
        r6 = f2572b;
        r7 = r4.f2585F;
        r7 = r7.f2574d;
        r0 = r4.m2713a(r0, r6, r7);
        r0 = (android.support.v4.view.C0350g) r0;
        r4.f2580A = r0;
    L_0x0197:
        r0 = android.support.v7.p040a.C0403j.MenuItem_contentDescription;
        r0 = r5.getText(r0);
        r4.f2581B = r0;
        r0 = android.support.v7.p040a.C0403j.MenuItem_tooltipText;
        r0 = r5.getText(r0);
        r4.f2582C = r0;
        r0 = android.support.v7.p040a.C0403j.MenuItem_iconTintMode;
        r0 = r5.hasValue(r0);
        if (r0 == 0) goto L_0x01f1;
    L_0x01af:
        r0 = android.support.v7.p040a.C0403j.MenuItem_iconTintMode;
        r6 = -1;
        r0 = r5.getInt(r0, r6);
        r6 = r4.f2584E;
        r0 = android.support.v7.widget.cj.m3399a(r0, r6);
        r4.f2584E = r0;
    L_0x01be:
        r0 = android.support.v7.p040a.C0403j.MenuItem_iconTint;
        r0 = r5.hasValue(r0);
        if (r0 == 0) goto L_0x01f5;
    L_0x01c6:
        r0 = android.support.v7.p040a.C0403j.MenuItem_iconTint;
        r0 = r5.getColorStateList(r0);
        r4.f2583D = r0;
    L_0x01ce:
        r5.recycle();
        r0 = 0;
        r4.f2593h = r0;
        r0 = r1;
        r1 = r2;
        r2 = r3;
        goto L_0x0027;
    L_0x01d9:
        r0 = 0;
        goto L_0x012f;
    L_0x01dc:
        r0 = r4.f2590e;
        r4.f2603r = r0;
        goto L_0x0131;
    L_0x01e2:
        r0 = 0;
        goto L_0x017d;
    L_0x01e4:
        if (r0 == 0) goto L_0x01ed;
    L_0x01e6:
        r0 = "SupportMenuInflater";
        r6 = "Ignoring attribute 'actionProviderClass'. Action view already specified.";
        android.util.Log.w(r0, r6);
    L_0x01ed:
        r0 = 0;
        r4.f2580A = r0;
        goto L_0x0197;
    L_0x01f1:
        r0 = 0;
        r4.f2584E = r0;
        goto L_0x01be;
    L_0x01f5:
        r0 = 0;
        r4.f2583D = r0;
        goto L_0x01ce;
    L_0x01f9:
        r5 = "menu";
        r5 = r0.equals(r5);
        if (r5 == 0) goto L_0x020d;
    L_0x0201:
        r0 = r4.m2716b();
        r10.m2711a(r11, r12, r0);
        r0 = r1;
        r1 = r2;
        r2 = r3;
        goto L_0x0027;
    L_0x020d:
        r2 = 1;
        r9 = r1;
        r1 = r0;
        r0 = r9;
        goto L_0x0027;
    L_0x0213:
        r0 = r11.getName();
        if (r3 == 0) goto L_0x0226;
    L_0x0219:
        r5 = r0.equals(r2);
        if (r5 == 0) goto L_0x0226;
    L_0x021f:
        r2 = 0;
        r0 = 0;
        r9 = r1;
        r1 = r0;
        r0 = r9;
        goto L_0x0027;
    L_0x0226:
        r5 = "group";
        r5 = r0.equals(r5);
        if (r5 == 0) goto L_0x0236;
    L_0x022e:
        r4.m2714a();
        r0 = r1;
        r1 = r2;
        r2 = r3;
        goto L_0x0027;
    L_0x0236:
        r5 = "item";
        r5 = r0.equals(r5);
        if (r5 == 0) goto L_0x026f;
    L_0x023e:
        r0 = r4.f2593h;
        if (r0 != 0) goto L_0x0024;
    L_0x0242:
        r0 = r4.f2580A;
        if (r0 == 0) goto L_0x0256;
    L_0x0246:
        r0 = r4.f2580A;
        r0 = r0.mo654e();
        if (r0 == 0) goto L_0x0256;
    L_0x024e:
        r4.m2716b();
        r0 = r1;
        r1 = r2;
        r2 = r3;
        goto L_0x0027;
    L_0x0256:
        r0 = 1;
        r4.f2593h = r0;
        r0 = r4.f2586a;
        r5 = r4.f2587b;
        r6 = r4.f2594i;
        r7 = r4.f2595j;
        r8 = r4.f2596k;
        r0 = r0.add(r5, r6, r7, r8);
        r4.m2715a(r0);
        r0 = r1;
        r1 = r2;
        r2 = r3;
        goto L_0x0027;
    L_0x026f:
        r5 = "menu";
        r0 = r0.equals(r5);
        if (r0 == 0) goto L_0x0024;
    L_0x0277:
        r0 = 1;
        r1 = r2;
        r2 = r3;
        goto L_0x0027;
    L_0x027c:
        r0 = new java.lang.RuntimeException;
        r1 = "Unexpected end of document";
        r0.<init>(r1);
        throw r0;
    L_0x0284:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.view.i.a(org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.view.Menu):void");
    }

    static Object m2710a(Object obj) {
        Object obj2 = obj;
        while (!(obj2 instanceof Activity) && (obj2 instanceof ContextWrapper)) {
            obj2 = ((ContextWrapper) obj2).getBaseContext();
        }
        return obj2;
    }

    static {
        Class[] clsArr = new Class[]{Context.class};
        f2571a = clsArr;
        f2572b = clsArr;
    }
}
