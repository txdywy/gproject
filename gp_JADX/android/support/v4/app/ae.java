package android.support.v4.app;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources.NotFoundException;
import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.support.v4.p037h.C0308c;
import android.support.v4.p037h.C0311f;
import android.support.v4.p037h.C0312g;
import android.support.v4.p037h.C0320p;
import android.support.v4.view.ai;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater.Factory2;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.ScaleAnimation;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

final class ae extends ab implements Factory2 {
    public static final Interpolator f1294F = new DecelerateInterpolator(2.5f);
    public static final Interpolator f1295G = new DecelerateInterpolator(1.5f);
    public static boolean f1296a = false;
    public static Field f1297r = null;
    public Bundle f1298A = null;
    public SparseArray f1299B = null;
    public ArrayList f1300C;
    public at f1301D;
    public Runnable f1302E = new af(this);
    public ArrayList f1303b;
    public boolean f1304c;
    public int f1305d = 0;
    public final ArrayList f1306e = new ArrayList();
    public SparseArray f1307f;
    public ArrayList f1308g;
    public ArrayList f1309h;
    public ArrayList f1310i;
    public ArrayList f1311j;
    public ArrayList f1312k;
    public final CopyOnWriteArrayList f1313l = new CopyOnWriteArrayList();
    public int f1314m = 0;
    public aa f1315n;
    public C0235y f1316o;
    public Fragment f1317p;
    public Fragment f1318q;
    public boolean f1319s;
    public boolean f1320t;
    public boolean f1321u;
    public String f1322v;
    public boolean f1323w;
    public ArrayList f1324x;
    public ArrayList f1325y;
    public ArrayList f1326z;

    ae() {
    }

    public final boolean m1267m() {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.ssa.SSATransform.placePhi(SSATransform.java:82)
	at jadx.core.dex.visitors.ssa.SSATransform.process(SSATransform.java:50)
	at jadx.core.dex.visitors.ssa.SSATransform.visit(SSATransform.java:42)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:37)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:59)
	at jadx.core.ProcessClass.process(ProcessClass.java:42)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:306)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:199)
*/
        /*
        r4 = this;
        r1 = 1;
        r4.m1238a(r1);
        r0 = 0;
    L_0x0005:
        r2 = r4.f1324x;
        r3 = r4.f1325y;
        r2 = r4.m1206c(r2, r3);
        if (r2 == 0) goto L_0x0022;
    L_0x000f:
        r4.f1304c = r1;
        r0 = r4.f1324x;	 Catch:{ all -> 0x001d }
        r2 = r4.f1325y;	 Catch:{ all -> 0x001d }
        r4.m1237a(r0, r2);	 Catch:{ all -> 0x001d }
        r4.m1266l();
        r0 = r1;
        goto L_0x0005;
    L_0x001d:
        r0 = move-exception;
        r4.m1266l();
        throw r0;
    L_0x0022:
        r4.m1268n();
        r4.m1270p();
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.app.ae.m():boolean");
    }

    private static boolean m1197a(Animator animator) {
        if (animator == null) {
            return false;
        }
        if (animator instanceof ValueAnimator) {
            PropertyValuesHolder[] values = ((ValueAnimator) animator).getValues();
            for (PropertyValuesHolder propertyName : values) {
                if ("alpha".equals(propertyName.getPropertyName())) {
                    return true;
                }
            }
            return false;
        } else if (!(animator instanceof AnimatorSet)) {
            return false;
        } else {
            List childAnimations = ((AnimatorSet) animator).getChildAnimations();
            for (int i = 0; i < childAnimations.size(); i++) {
                if (m1197a((Animator) childAnimations.get(i))) {
                    return true;
                }
            }
            return false;
        }
    }

    private final void m1195a(RuntimeException runtimeException) {
        Log.e("FragmentManager", runtimeException.getMessage());
        Log.e("FragmentManager", "Activity state:");
        PrintWriter printWriter = new PrintWriter(new C0312g("FragmentManager"));
        if (this.f1315n != null) {
            try {
                this.f1315n.mo354a("  ", printWriter, new String[0]);
            } catch (Throwable e) {
                Log.e("FragmentManager", "Failed dumping state", e);
            }
        } else {
            try {
                mo288a("  ", null, printWriter, new String[0]);
            } catch (Throwable e2) {
                Log.e("FragmentManager", "Failed dumping state", e2);
            }
        }
        throw runtimeException;
    }

    public final aw mo284a() {
        return new C0245j(this);
    }

    public final boolean mo291b() {
        boolean m = m1267m();
        m1178A();
        return m;
    }

    public final void mo292c() {
        m1234a(new ar(this, null, -1, 0), false);
    }

    public final boolean mo293d() {
        m1219z();
        return m1218y();
    }

    public final void mo287a(String str, int i) {
        m1234a(new ar(this, str, -1, i), false);
    }

    public final void mo289b(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("Bad id: " + i);
        }
        m1234a(new ar(this, null, i, 1), false);
    }

    private final boolean m1218y() {
        m1267m();
        m1238a(true);
        if (this.f1318q != null) {
            ab abVar = this.f1318q.f732D;
            if (abVar != null && abVar.mo293d()) {
                return true;
            }
        }
        boolean a = m1242a(this.f1324x, this.f1325y, null, -1, 0);
        if (a) {
            this.f1304c = true;
            try {
                m1237a(this.f1324x, this.f1325y);
            } finally {
                m1266l();
            }
        }
        m1268n();
        m1270p();
        return a;
    }

    public final int mo294e() {
        return this.f1308g != null ? this.f1308g.size() : 0;
    }

    public final ac mo295f() {
        return (ac) this.f1308g.get(0);
    }

    public final void mo286a(ad adVar) {
        if (this.f1312k == null) {
            this.f1312k = new ArrayList();
        }
        this.f1312k.add(adVar);
    }

    public final void mo290b(ad adVar) {
        if (this.f1312k != null) {
            this.f1312k.remove(adVar);
        }
    }

    public final void mo285a(Bundle bundle, String str, Fragment fragment) {
        if (fragment.f758o < 0) {
            m1195a(new IllegalStateException("Fragment " + fragment + " is not currently in the FragmentManager"));
        }
        bundle.putInt(str, fragment.f758o);
    }

    public final Fragment mo282a(Bundle bundle, String str) {
        int i = bundle.getInt(str, -1);
        if (i == -1) {
            return null;
        }
        Fragment fragment = (Fragment) this.f1307f.get(i);
        if (fragment != null) {
            return fragment;
        }
        m1195a(new IllegalStateException("Fragment no longer exists for key " + str + ": index " + i));
        return fragment;
    }

    public final List mo296g() {
        if (this.f1306e.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        List list;
        synchronized (this.f1306e) {
            list = (List) this.f1306e.clone();
        }
        return list;
    }

    public final boolean mo297h() {
        return this.f1321u;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder(128);
        stringBuilder.append("FragmentManager{");
        stringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
        stringBuilder.append(" in ");
        if (this.f1317p != null) {
            C0311f.m1677a(this.f1317p, stringBuilder);
        } else {
            C0311f.m1677a(this.f1315n, stringBuilder);
        }
        stringBuilder.append("}}");
        return stringBuilder.toString();
    }

    public final void mo288a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        int i;
        int i2 = 0;
        String str2 = str + "    ";
        if (this.f1307f != null) {
            size = this.f1307f.size();
            if (size > 0) {
                printWriter.print(str);
                printWriter.print("Active Fragments in ");
                printWriter.print(Integer.toHexString(System.identityHashCode(this)));
                printWriter.println(":");
                for (i = 0; i < size; i++) {
                    Fragment fragment;
                    fragment = (Fragment) this.f1307f.valueAt(i);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i);
                    printWriter.print(": ");
                    printWriter.println(fragment);
                    if (fragment != null) {
                        fragment.mo4590a(str2, fileDescriptor, printWriter, strArr);
                    }
                }
            }
        }
        size = this.f1306e.size();
        if (size > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (i = 0; i < size; i++) {
                fragment = (Fragment) this.f1306e.get(i);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.println(fragment.toString());
            }
        }
        if (this.f1309h != null) {
            size = this.f1309h.size();
            if (size > 0) {
                printWriter.print(str);
                printWriter.println("Fragments Created Menus:");
                for (i = 0; i < size; i++) {
                    fragment = (Fragment) this.f1309h.get(i);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i);
                    printWriter.print(": ");
                    printWriter.println(fragment.toString());
                }
            }
        }
        if (this.f1308g != null) {
            size = this.f1308g.size();
            if (size > 0) {
                printWriter.print(str);
                printWriter.println("Back Stack:");
                for (i = 0; i < size; i++) {
                    C0245j c0245j = (C0245j) this.f1308g.get(i);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i);
                    printWriter.print(": ");
                    printWriter.println(c0245j.toString());
                    c0245j.m1470a(str2, printWriter);
                }
            }
        }
        synchronized (this) {
            if (this.f1310i != null) {
                int size2 = this.f1310i.size();
                if (size2 > 0) {
                    printWriter.print(str);
                    printWriter.println("Back Stack Indices:");
                    for (i = 0; i < size2; i++) {
                        c0245j = (C0245j) this.f1310i.get(i);
                        printWriter.print(str);
                        printWriter.print("  #");
                        printWriter.print(i);
                        printWriter.print(": ");
                        printWriter.println(c0245j);
                    }
                }
            }
            if (this.f1311j != null && this.f1311j.size() > 0) {
                printWriter.print(str);
                printWriter.print("mAvailBackStackIndices: ");
                printWriter.println(Arrays.toString(this.f1311j.toArray()));
            }
        }
        if (this.f1303b != null) {
            i = this.f1303b.size();
            if (i > 0) {
                printWriter.print(str);
                printWriter.println("Pending Actions:");
                while (i2 < i) {
                    aq aqVar = (aq) this.f1303b.get(i2);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i2);
                    printWriter.print(": ");
                    printWriter.println(aqVar);
                    i2++;
                }
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.f1315n);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.f1316o);
        if (this.f1317p != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.f1317p);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.f1314m);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.f1320t);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.f1321u);
        if (this.f1319s) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.f1319s);
        }
        if (this.f1322v != null) {
            printWriter.print(str);
            printWriter.print("  mNoTransactionsBecause=");
            printWriter.println(this.f1322v);
        }
    }

    private static an m1183a(float f, float f2, float f3, float f4) {
        Animation animationSet = new AnimationSet(false);
        Animation scaleAnimation = new ScaleAnimation(f, f2, f, f2, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setInterpolator(f1294F);
        scaleAnimation.setDuration(220);
        animationSet.addAnimation(scaleAnimation);
        scaleAnimation = new AlphaAnimation(f3, f4);
        scaleAnimation.setInterpolator(f1295G);
        scaleAnimation.setDuration(220);
        animationSet.addAnimation(scaleAnimation);
        return new an(animationSet);
    }

    private static an m1182a(float f, float f2) {
        Animation alphaAnimation = new AlphaAnimation(f, f2);
        alphaAnimation.setInterpolator(f1295G);
        alphaAnimation.setDuration(220);
        return new an(alphaAnimation);
    }

    private final an m1184a(Fragment fragment, int i, boolean z, int i2) {
        Object obj = 1;
        int M = fragment.m561M();
        Fragment.m546s();
        Fragment.m547t();
        if (M != 0) {
            Object obj2;
            Animator loadAnimator;
            boolean equals = "anim".equals(this.f1315n.f1285c.getResources().getResourceTypeName(M));
            if (equals) {
                try {
                    Animation loadAnimation = AnimationUtils.loadAnimation(this.f1315n.f1285c, M);
                    if (loadAnimation != null) {
                        return new an(loadAnimation);
                    }
                    obj2 = 1;
                    if (obj2 == null) {
                        try {
                            loadAnimator = AnimatorInflater.loadAnimator(this.f1315n.f1285c, M);
                            if (loadAnimator != null) {
                                return new an(loadAnimator);
                            }
                        } catch (RuntimeException e) {
                            if (equals) {
                                throw e;
                            }
                            Animation loadAnimation2 = AnimationUtils.loadAnimation(this.f1315n.f1285c, M);
                            if (loadAnimation2 != null) {
                                return new an(loadAnimation2);
                            }
                        }
                    }
                } catch (NotFoundException e2) {
                    throw e2;
                } catch (RuntimeException e3) {
                }
            }
            obj2 = null;
            if (obj2 == null) {
                loadAnimator = AnimatorInflater.loadAnimator(this.f1315n.f1285c, M);
                if (loadAnimator != null) {
                    return new an(loadAnimator);
                }
            }
        }
        if (i == 0) {
            return null;
        }
        switch (i) {
            case 4097:
                if (!z) {
                    obj = 2;
                    break;
                }
                break;
            case 4099:
                if (!z) {
                    obj = 6;
                    break;
                }
                obj = 5;
                break;
            case 8194:
                if (!z) {
                    obj = 4;
                    break;
                }
                obj = 3;
                break;
            default:
                obj = -1;
                break;
        }
        if (obj < null) {
            return null;
        }
        switch (obj) {
            case 1:
                return m1183a(1.125f, 1.0f, 0.0f, 1.0f);
            case 2:
                return m1183a(1.0f, 0.975f, 1.0f, 0.0f);
            case 3:
                return m1183a(0.975f, 1.0f, 0.0f, 1.0f);
            case 4:
                return m1183a(1.0f, 1.075f, 1.0f, 0.0f);
            case 5:
                return m1182a(0.0f, 1.0f);
            case 6:
                return m1182a(1.0f, 0.0f);
            default:
                if (i2 == 0 && this.f1315n.mo358e()) {
                    i2 = this.f1315n.mo359f();
                }
                if (i2 == 0) {
                    return null;
                }
                return null;
        }
    }

    private static void m1194a(View view, an anVar) {
        Object obj = null;
        if (view != null && anVar != null) {
            if (view != null && anVar != null && VERSION.SDK_INT >= 19 && view.getLayerType() == 0 && ai.f1848a.mo398j(view)) {
                boolean z;
                if (anVar.f1343a instanceof AlphaAnimation) {
                    z = true;
                } else if (anVar.f1343a instanceof AnimationSet) {
                    List animations = ((AnimationSet) anVar.f1343a).getAnimations();
                    for (int i = 0; i < animations.size(); i++) {
                        if (animations.get(i) instanceof AlphaAnimation) {
                            z = true;
                            break;
                        }
                    }
                    z = false;
                } else {
                    z = m1197a(anVar.f1344b);
                }
                if (z) {
                    int i2 = 1;
                }
            }
            if (obj == null) {
                return;
            }
            if (anVar.f1344b != null) {
                anVar.f1344b.addListener(new ao(view));
                return;
            }
            AnimationListener a = m1185a(anVar.f1343a);
            view.setLayerType(2, null);
            anVar.f1343a.setAnimationListener(new ak(view, a));
        }
    }

    private static AnimationListener m1185a(Animation animation) {
        try {
            if (f1297r == null) {
                Field declaredField = Animation.class.getDeclaredField("mListener");
                f1297r = declaredField;
                declaredField.setAccessible(true);
            }
            return (AnimationListener) f1297r.get(animation);
        } catch (Throwable e) {
            Log.e("FragmentManager", "No field with the name mListener is found in Animation class", e);
            return null;
        } catch (Throwable e2) {
            Log.e("FragmentManager", "Cannot access Animation's mListener field", e2);
            return null;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    final void m1230a(android.support.v4.app.Fragment r9, int r10, int r11, int r12, boolean r13) {
        /*
        r8 = this;
        r0 = r9.f764u;
        if (r0 == 0) goto L_0x0008;
    L_0x0004:
        r0 = r9.f739K;
        if (r0 == 0) goto L_0x000c;
    L_0x0008:
        r0 = 1;
        if (r10 <= r0) goto L_0x000c;
    L_0x000b:
        r10 = 1;
    L_0x000c:
        r0 = r9.f765v;
        if (r0 == 0) goto L_0x001f;
    L_0x0010:
        r0 = r9.f755l;
        if (r10 <= r0) goto L_0x001f;
    L_0x0014:
        r0 = r9.f755l;
        if (r0 != 0) goto L_0x0039;
    L_0x0018:
        r0 = r9.cL_();
        if (r0 == 0) goto L_0x0039;
    L_0x001e:
        r10 = 1;
    L_0x001f:
        r0 = r9.f748T;
        if (r0 == 0) goto L_0x002c;
    L_0x0023:
        r0 = r9.f755l;
        r1 = 4;
        if (r0 >= r1) goto L_0x002c;
    L_0x0028:
        r0 = 3;
        if (r10 <= r0) goto L_0x002c;
    L_0x002b:
        r10 = 3;
    L_0x002c:
        r0 = r9.f755l;
        if (r0 > r10) goto L_0x0381;
    L_0x0030:
        r0 = r9.f766w;
        if (r0 == 0) goto L_0x003c;
    L_0x0034:
        r0 = r9.f767x;
        if (r0 != 0) goto L_0x003c;
    L_0x0038:
        return;
    L_0x0039:
        r10 = r9.f755l;
        goto L_0x001f;
    L_0x003c:
        r0 = r9.m566R();
        if (r0 != 0) goto L_0x0048;
    L_0x0042:
        r0 = r9.m567S();
        if (r0 == 0) goto L_0x005c;
    L_0x0048:
        r0 = 0;
        r9.d_(r0);
        r0 = 0;
        r9.m577a(r0);
        r2 = r9.m568T();
        r3 = 0;
        r4 = 0;
        r5 = 1;
        r0 = r8;
        r1 = r9;
        r0.m1230a(r1, r2, r3, r4, r5);
    L_0x005c:
        r0 = r9.f755l;
        switch(r0) {
            case 0: goto L_0x0092;
            case 1: goto L_0x01b0;
            case 2: goto L_0x032f;
            case 3: goto L_0x0335;
            case 4: goto L_0x0357;
            default: goto L_0x0061;
        };
    L_0x0061:
        r0 = r9.f755l;
        if (r0 == r10) goto L_0x0038;
    L_0x0065:
        r0 = "FragmentManager";
        r1 = new java.lang.StringBuilder;
        r2 = "moveToState: Fragment state for ";
        r1.<init>(r2);
        r1 = r1.append(r9);
        r2 = " not updated inline; expected state ";
        r1 = r1.append(r2);
        r1 = r1.append(r10);
        r2 = " found ";
        r1 = r1.append(r2);
        r2 = r9.f755l;
        r1 = r1.append(r2);
        r1 = r1.toString();
        android.util.Log.w(r0, r1);
        r9.f755l = r10;
        goto L_0x0038;
    L_0x0092:
        if (r10 <= 0) goto L_0x01b0;
    L_0x0094:
        r0 = f1296a;
        if (r0 == 0) goto L_0x00ac;
    L_0x0098:
        r0 = "FragmentManager";
        r1 = new java.lang.StringBuilder;
        r2 = "moveto CREATED: ";
        r1.<init>(r2);
        r1 = r1.append(r9);
        r1 = r1.toString();
        android.util.Log.v(r0, r1);
    L_0x00ac:
        r0 = r9.f756m;
        if (r0 == 0) goto L_0x00f6;
    L_0x00b0:
        r0 = r9.f756m;
        r1 = r8.f1315n;
        r1 = r1.f1285c;
        r1 = r1.getClassLoader();
        r0.setClassLoader(r1);
        r0 = r9.f756m;
        r1 = "android:view_state";
        r0 = r0.getSparseParcelableArray(r1);
        r9.f757n = r0;
        r0 = r9.f756m;
        r1 = "android:target_state";
        r0 = r8.mo282a(r0, r1);
        r9.f761r = r0;
        r0 = r9.f761r;
        if (r0 == 0) goto L_0x00e0;
    L_0x00d5:
        r0 = r9.f756m;
        r1 = "android:target_req_state";
        r2 = 0;
        r0 = r0.getInt(r1, r2);
        r9.f763t = r0;
    L_0x00e0:
        r0 = r9.f756m;
        r1 = "android:user_visible_hint";
        r2 = 1;
        r0 = r0.getBoolean(r1, r2);
        r9.f749U = r0;
        r0 = r9.f749U;
        if (r0 != 0) goto L_0x00f6;
    L_0x00ef:
        r0 = 1;
        r9.f748T = r0;
        r0 = 3;
        if (r10 <= r0) goto L_0x00f6;
    L_0x00f5:
        r10 = 3;
    L_0x00f6:
        r0 = r8.f1315n;
        r9.f731C = r0;
        r0 = r8.f1317p;
        r9.f734F = r0;
        r0 = r8.f1317p;
        if (r0 == 0) goto L_0x0141;
    L_0x0102:
        r0 = r8.f1317p;
        r0 = r0.f732D;
    L_0x0106:
        r9.f730B = r0;
        r0 = r9.f761r;
        if (r0 == 0) goto L_0x0156;
    L_0x010c:
        r0 = r8.f1307f;
        r1 = r9.f761r;
        r1 = r1.f758o;
        r0 = r0.get(r1);
        r1 = r9.f761r;
        if (r0 == r1) goto L_0x0146;
    L_0x011a:
        r0 = new java.lang.IllegalStateException;
        r1 = new java.lang.StringBuilder;
        r2 = "Fragment ";
        r1.<init>(r2);
        r1 = r1.append(r9);
        r2 = " declared target fragment ";
        r1 = r1.append(r2);
        r2 = r9.f761r;
        r1 = r1.append(r2);
        r2 = " that does not belong to this FragmentManager!";
        r1 = r1.append(r2);
        r1 = r1.toString();
        r0.<init>(r1);
        throw r0;
    L_0x0141:
        r0 = r8.f1315n;
        r0 = r0.f1288f;
        goto L_0x0106;
    L_0x0146:
        r0 = r9.f761r;
        r0 = r0.f755l;
        if (r0 > 0) goto L_0x0156;
    L_0x014c:
        r1 = r9.f761r;
        r2 = 1;
        r3 = 0;
        r4 = 0;
        r5 = 1;
        r0 = r8;
        r0.m1230a(r1, r2, r3, r4, r5);
    L_0x0156:
        r0 = r8.f1315n;
        r0 = r0.f1285c;
        r1 = 0;
        r8.m1187a(r9, r0, r1);
        r0 = 0;
        r9.f744P = r0;
        r0 = r8.f1315n;
        r0 = r0.f1285c;
        r9.mo135a(r0);
        r0 = r9.f744P;
        if (r0 != 0) goto L_0x0187;
    L_0x016c:
        r0 = new android.support.v4.app.SuperNotCalledException;
        r1 = new java.lang.StringBuilder;
        r2 = "Fragment ";
        r1.<init>(r2);
        r1 = r1.append(r9);
        r2 = " did not call through to super.onAttach()";
        r1 = r1.append(r2);
        r1 = r1.toString();
        r0.<init>(r1);
        throw r0;
    L_0x0187:
        r0 = r9.f734F;
        if (r0 == 0) goto L_0x0190;
    L_0x018b:
        r0 = r9.f734F;
        android.support.v4.app.Fragment.m545r();
    L_0x0190:
        r0 = r8.f1315n;
        r0 = r0.f1285c;
        r1 = 0;
        r8.m1198b(r9, r0, r1);
        r0 = r9.ad;
        if (r0 != 0) goto L_0x0312;
    L_0x019c:
        r0 = r9.f756m;
        r1 = 0;
        r8.m1188a(r9, r0, r1);
        r0 = r9.f756m;
        r9.m608j(r0);
        r0 = r9.f756m;
        r1 = 0;
        r8.m1199b(r9, r0, r1);
    L_0x01ad:
        r0 = 0;
        r9.f741M = r0;
    L_0x01b0:
        r0 = r9.f766w;
        if (r0 == 0) goto L_0x01ef;
    L_0x01b4:
        r0 = r9.f769z;
        if (r0 != 0) goto L_0x01ef;
    L_0x01b8:
        r0 = r9.f756m;
        r0 = r9.m602g(r0);
        r1 = 0;
        r2 = r9.f756m;
        r0 = r9.m589b(r0, r1, r2);
        r9.f746R = r0;
        r0 = r9.f746R;
        if (r0 == 0) goto L_0x031c;
    L_0x01cb:
        r0 = r9.f746R;
        r9.f747S = r0;
        r0 = r9.f746R;
        r1 = 0;
        r0.setSaveFromParentEnabled(r1);
        r0 = r9.f738J;
        if (r0 == 0) goto L_0x01e0;
    L_0x01d9:
        r0 = r9.f746R;
        r1 = 8;
        r0.setVisibility(r1);
    L_0x01e0:
        r0 = r9.f746R;
        r1 = r9.f756m;
        r9.mo1410a(r0, r1);
        r0 = r9.f746R;
        r1 = r9.f756m;
        r2 = 0;
        r8.m1189a(r9, r0, r1, r2);
    L_0x01ef:
        r0 = 1;
        if (r10 <= r0) goto L_0x032f;
    L_0x01f2:
        r0 = f1296a;
        if (r0 == 0) goto L_0x020a;
    L_0x01f6:
        r0 = "FragmentManager";
        r1 = new java.lang.StringBuilder;
        r2 = "moveto ACTIVITY_CREATED: ";
        r1.<init>(r2);
        r1 = r1.append(r9);
        r1 = r1.toString();
        android.util.Log.v(r0, r1);
    L_0x020a:
        r0 = r9.f766w;
        if (r0 != 0) goto L_0x02ce;
    L_0x020e:
        r0 = 0;
        r1 = r9.f736H;
        if (r1 == 0) goto L_0x0280;
    L_0x0213:
        r0 = r9.f736H;
        r1 = -1;
        if (r0 != r1) goto L_0x0235;
    L_0x0218:
        r0 = new java.lang.IllegalArgumentException;
        r1 = new java.lang.StringBuilder;
        r2 = "Cannot create fragment ";
        r1.<init>(r2);
        r1 = r1.append(r9);
        r2 = " for a container view with no id";
        r1 = r1.append(r2);
        r1 = r1.toString();
        r0.<init>(r1);
        r8.m1195a(r0);
    L_0x0235:
        r0 = r8.f1316o;
        r1 = r9.f736H;
        r0 = r0.mo279a(r1);
        r0 = (android.view.ViewGroup) r0;
        if (r0 != 0) goto L_0x0280;
    L_0x0241:
        r1 = r9.f768y;
        if (r1 != 0) goto L_0x0280;
    L_0x0245:
        r1 = r9.m605i();	 Catch:{ NotFoundException -> 0x0321 }
        r2 = r9.f736H;	 Catch:{ NotFoundException -> 0x0321 }
        r1 = r1.getResourceName(r2);	 Catch:{ NotFoundException -> 0x0321 }
    L_0x024f:
        r2 = new java.lang.IllegalArgumentException;
        r3 = new java.lang.StringBuilder;
        r4 = "No view found for id 0x";
        r3.<init>(r4);
        r4 = r9.f736H;
        r4 = java.lang.Integer.toHexString(r4);
        r3 = r3.append(r4);
        r4 = " (";
        r3 = r3.append(r4);
        r1 = r3.append(r1);
        r3 = ") for fragment ";
        r1 = r1.append(r3);
        r1 = r1.append(r9);
        r1 = r1.toString();
        r2.<init>(r1);
        r8.m1195a(r2);
    L_0x0280:
        r9.f745Q = r0;
        r1 = r9.f756m;
        r1 = r9.m602g(r1);
        r2 = r9.f756m;
        r1 = r9.m589b(r1, r0, r2);
        r9.f746R = r1;
        r1 = r9.f746R;
        if (r1 == 0) goto L_0x0328;
    L_0x0294:
        r1 = r9.f746R;
        r9.f747S = r1;
        r1 = r9.f746R;
        r2 = 0;
        r1.setSaveFromParentEnabled(r2);
        if (r0 == 0) goto L_0x02a5;
    L_0x02a0:
        r1 = r9.f746R;
        r0.addView(r1);
    L_0x02a5:
        r0 = r9.f738J;
        if (r0 == 0) goto L_0x02b0;
    L_0x02a9:
        r0 = r9.f746R;
        r1 = 8;
        r0.setVisibility(r1);
    L_0x02b0:
        r0 = r9.f746R;
        r1 = r9.f756m;
        r9.mo1410a(r0, r1);
        r0 = r9.f746R;
        r1 = r9.f756m;
        r2 = 0;
        r8.m1189a(r9, r0, r1, r2);
        r0 = r9.f746R;
        r0 = r0.getVisibility();
        if (r0 != 0) goto L_0x0326;
    L_0x02c7:
        r0 = r9.f745Q;
        if (r0 == 0) goto L_0x0326;
    L_0x02cb:
        r0 = 1;
    L_0x02cc:
        r9.f754Z = r0;
    L_0x02ce:
        r0 = r9.f756m;
        r9.m609k(r0);
        r0 = r9.f756m;
        r1 = 0;
        r8.m1204c(r9, r0, r1);
        r0 = r9.f746R;
        if (r0 == 0) goto L_0x032c;
    L_0x02dd:
        r0 = r9.f756m;
        r1 = r9.f757n;
        if (r1 == 0) goto L_0x02ed;
    L_0x02e3:
        r1 = r9.f747S;
        r2 = r9.f757n;
        r1.restoreHierarchyState(r2);
        r1 = 0;
        r9.f757n = r1;
    L_0x02ed:
        r1 = 0;
        r9.f744P = r1;
        r9.m606i(r0);
        r0 = r9.f744P;
        if (r0 != 0) goto L_0x032c;
    L_0x02f7:
        r0 = new android.support.v4.app.SuperNotCalledException;
        r1 = new java.lang.StringBuilder;
        r2 = "Fragment ";
        r1.<init>(r2);
        r1 = r1.append(r9);
        r2 = " did not call through to super.onViewStateRestored()";
        r1 = r1.append(r2);
        r1 = r1.toString();
        r0.<init>(r1);
        throw r0;
    L_0x0312:
        r0 = r9.f756m;
        r9.m604h(r0);
        r0 = 1;
        r9.f755l = r0;
        goto L_0x01ad;
    L_0x031c:
        r0 = 0;
        r9.f747S = r0;
        goto L_0x01ef;
    L_0x0321:
        r1 = move-exception;
        r1 = "unknown";
        goto L_0x024f;
    L_0x0326:
        r0 = 0;
        goto L_0x02cc;
    L_0x0328:
        r0 = 0;
        r9.f747S = r0;
        goto L_0x02ce;
    L_0x032c:
        r0 = 0;
        r9.f756m = r0;
    L_0x032f:
        r0 = 2;
        if (r10 <= r0) goto L_0x0335;
    L_0x0332:
        r0 = 3;
        r9.f755l = r0;
    L_0x0335:
        r0 = 3;
        if (r10 <= r0) goto L_0x0357;
    L_0x0338:
        r0 = f1296a;
        if (r0 == 0) goto L_0x0350;
    L_0x033c:
        r0 = "FragmentManager";
        r1 = new java.lang.StringBuilder;
        r2 = "moveto STARTED: ";
        r1.<init>(r2);
        r1 = r1.append(r9);
        r1 = r1.toString();
        android.util.Log.v(r0, r1);
    L_0x0350:
        r9.m554F();
        r0 = 0;
        r8.m1200b(r9, r0);
    L_0x0357:
        r0 = 4;
        if (r10 <= r0) goto L_0x0061;
    L_0x035a:
        r0 = f1296a;
        if (r0 == 0) goto L_0x0372;
    L_0x035e:
        r0 = "FragmentManager";
        r1 = new java.lang.StringBuilder;
        r2 = "moveto RESUMED: ";
        r1.<init>(r2);
        r1 = r1.append(r9);
        r1 = r1.toString();
        android.util.Log.v(r0, r1);
    L_0x0372:
        r9.m555G();
        r0 = 0;
        r8.m1205c(r9, r0);
        r0 = 0;
        r9.f756m = r0;
        r0 = 0;
        r9.f757n = r0;
        goto L_0x0061;
    L_0x0381:
        r0 = r9.f755l;
        if (r0 <= r10) goto L_0x0061;
    L_0x0385:
        r0 = r9.f755l;
        switch(r0) {
            case 1: goto L_0x038c;
            case 2: goto L_0x0417;
            case 3: goto L_0x03f9;
            case 4: goto L_0x03d7;
            case 5: goto L_0x03b5;
            default: goto L_0x038a;
        };
    L_0x038a:
        goto L_0x0061;
    L_0x038c:
        if (r10 > 0) goto L_0x0061;
    L_0x038e:
        r0 = r8.f1321u;
        if (r0 == 0) goto L_0x03a3;
    L_0x0392:
        r0 = r9.m566R();
        if (r0 == 0) goto L_0x051b;
    L_0x0398:
        r0 = r9.m566R();
        r1 = 0;
        r9.d_(r1);
        r0.clearAnimation();
    L_0x03a3:
        r0 = r9.m566R();
        if (r0 != 0) goto L_0x03af;
    L_0x03a9:
        r0 = r9.m567S();
        if (r0 == 0) goto L_0x052e;
    L_0x03af:
        r9.m598e(r10);
        r10 = 1;
        goto L_0x0061;
    L_0x03b5:
        r0 = 5;
        if (r10 >= r0) goto L_0x03d7;
    L_0x03b8:
        r0 = f1296a;
        if (r0 == 0) goto L_0x03d0;
    L_0x03bc:
        r0 = "FragmentManager";
        r1 = new java.lang.StringBuilder;
        r2 = "movefrom RESUMED: ";
        r1.<init>(r2);
        r1 = r1.append(r9);
        r1 = r1.toString();
        android.util.Log.v(r0, r1);
    L_0x03d0:
        r9.m556H();
        r0 = 0;
        r8.m1210d(r9, r0);
    L_0x03d7:
        r0 = 4;
        if (r10 >= r0) goto L_0x03f9;
    L_0x03da:
        r0 = f1296a;
        if (r0 == 0) goto L_0x03f2;
    L_0x03de:
        r0 = "FragmentManager";
        r1 = new java.lang.StringBuilder;
        r2 = "movefrom STARTED: ";
        r1.<init>(r2);
        r1 = r1.append(r9);
        r1 = r1.toString();
        android.util.Log.v(r0, r1);
    L_0x03f2:
        r9.m557I();
        r0 = 0;
        r8.m1212e(r9, r0);
    L_0x03f9:
        r0 = 3;
        if (r10 >= r0) goto L_0x0417;
    L_0x03fc:
        r0 = f1296a;
        if (r0 == 0) goto L_0x0414;
    L_0x0400:
        r0 = "FragmentManager";
        r1 = new java.lang.StringBuilder;
        r2 = "movefrom STOPPED: ";
        r1.<init>(r2);
        r1 = r1.append(r9);
        r1 = r1.toString();
        android.util.Log.v(r0, r1);
    L_0x0414:
        r9.m558J();
    L_0x0417:
        r0 = 2;
        if (r10 >= r0) goto L_0x038c;
    L_0x041a:
        r0 = f1296a;
        if (r0 == 0) goto L_0x0432;
    L_0x041e:
        r0 = "FragmentManager";
        r1 = new java.lang.StringBuilder;
        r2 = "movefrom ACTIVITY_CREATED: ";
        r1.<init>(r2);
        r1 = r1.append(r9);
        r1 = r1.toString();
        android.util.Log.v(r0, r1);
    L_0x0432:
        r0 = r9.f746R;
        if (r0 == 0) goto L_0x0445;
    L_0x0436:
        r0 = r8.f1315n;
        r0 = r0.mo355b();
        if (r0 == 0) goto L_0x0445;
    L_0x043e:
        r0 = r9.f757n;
        if (r0 != 0) goto L_0x0445;
    L_0x0442:
        r8.m1217j(r9);
    L_0x0445:
        r0 = r9.f732D;
        if (r0 == 0) goto L_0x044f;
    L_0x0449:
        r0 = r9.f732D;
        r1 = 1;
        r0.m1252c(r1);
    L_0x044f:
        r0 = 1;
        r9.f755l = r0;
        r0 = 0;
        r9.f744P = r0;
        r9.mo138d();
        r0 = r9.f744P;
        if (r0 != 0) goto L_0x0477;
    L_0x045c:
        r0 = new android.support.v4.app.SuperNotCalledException;
        r1 = new java.lang.StringBuilder;
        r2 = "Fragment ";
        r1.<init>(r2);
        r1 = r1.append(r9);
        r2 = " did not call through to super.onDestroyView()";
        r1 = r1.append(r2);
        r1 = r1.toString();
        r0.<init>(r1);
        throw r0;
    L_0x0477:
        r0 = r9.f750V;
        if (r0 == 0) goto L_0x0480;
    L_0x047b:
        r0 = r9.f750V;
        r0.m1391e();
    L_0x0480:
        r0 = 0;
        r9.f769z = r0;
        r0 = 0;
        r8.m1213f(r9, r0);
        r0 = r9.f746R;
        if (r0 == 0) goto L_0x04f0;
    L_0x048b:
        r0 = r9.f745Q;
        if (r0 == 0) goto L_0x04f0;
    L_0x048f:
        r0 = r9.f746R;
        r0.clearAnimation();
        r0 = r9.f745Q;
        r1 = r9.f746R;
        r0.endViewTransition(r1);
        r0 = 0;
        r1 = r8.f1314m;
        if (r1 <= 0) goto L_0x0626;
    L_0x04a0:
        r1 = r8.f1321u;
        if (r1 != 0) goto L_0x0626;
    L_0x04a4:
        r1 = r9.f746R;
        r1 = r1.getVisibility();
        if (r1 != 0) goto L_0x0626;
    L_0x04ac:
        r1 = r9.ab;
        r2 = 0;
        r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1));
        if (r1 < 0) goto L_0x0626;
    L_0x04b3:
        r0 = 0;
        r0 = r8.m1184a(r9, r11, r0, r12);
        r6 = r0;
    L_0x04b9:
        r0 = 0;
        r9.ab = r0;
        if (r6 == 0) goto L_0x04e9;
    L_0x04be:
        r4 = r9.f746R;
        r3 = r9.f745Q;
        r3.startViewTransition(r4);
        r9.m598e(r10);
        r0 = r6.f1343a;
        if (r0 == 0) goto L_0x04fe;
    L_0x04cc:
        r7 = r6.f1343a;
        r0 = r9.f746R;
        r9.d_(r0);
        r2 = m1185a(r7);
        r0 = new android.support.v4.app.ag;
        r1 = r8;
        r5 = r9;
        r0.<init>(r1, r2, r3, r4, r5);
        r7.setAnimationListener(r0);
        m1194a(r4, r6);
        r0 = r9.f746R;
        r0.startAnimation(r7);
    L_0x04e9:
        r0 = r9.f745Q;
        r1 = r9.f746R;
        r0.removeView(r1);
    L_0x04f0:
        r0 = 0;
        r9.f745Q = r0;
        r0 = 0;
        r9.f746R = r0;
        r0 = 0;
        r9.f747S = r0;
        r0 = 0;
        r9.f767x = r0;
        goto L_0x038c;
    L_0x04fe:
        r0 = r6.f1344b;
        r1 = r6.f1344b;
        r9.m577a(r1);
        r1 = new android.support.v4.app.ai;
        r1.<init>(r8, r3, r4, r9);
        r0.addListener(r1);
        r1 = r9.f746R;
        r0.setTarget(r1);
        r1 = r9.f746R;
        m1194a(r1, r6);
        r0.start();
        goto L_0x04e9;
    L_0x051b:
        r0 = r9.m567S();
        if (r0 == 0) goto L_0x03a3;
    L_0x0521:
        r0 = r9.m567S();
        r1 = 0;
        r9.m577a(r1);
        r0.cancel();
        goto L_0x03a3;
    L_0x052e:
        r0 = f1296a;
        if (r0 == 0) goto L_0x0546;
    L_0x0532:
        r0 = "FragmentManager";
        r1 = new java.lang.StringBuilder;
        r2 = "movefrom CREATED: ";
        r1.<init>(r2);
        r1 = r1.append(r9);
        r1 = r1.toString();
        android.util.Log.v(r0, r1);
    L_0x0546:
        r0 = r9.f741M;
        if (r0 != 0) goto L_0x0579;
    L_0x054a:
        r9.m559K();
        r0 = 0;
        r8.m1214g(r9, r0);
    L_0x0551:
        r0 = 0;
        r9.f744P = r0;
        r9.mo134a();
        r0 = 0;
        r9.ac = r0;
        r0 = r9.f744P;
        if (r0 != 0) goto L_0x057d;
    L_0x055e:
        r0 = new android.support.v4.app.SuperNotCalledException;
        r1 = new java.lang.StringBuilder;
        r2 = "Fragment ";
        r1.<init>(r2);
        r1 = r1.append(r9);
        r2 = " did not call through to super.onDetach()";
        r1 = r1.append(r2);
        r1 = r1.toString();
        r0.<init>(r1);
        throw r0;
    L_0x0579:
        r0 = 0;
        r9.f755l = r0;
        goto L_0x0551;
    L_0x057d:
        r0 = r9.f732D;
        if (r0 == 0) goto L_0x05a8;
    L_0x0581:
        r0 = r9.f741M;
        if (r0 != 0) goto L_0x05a0;
    L_0x0585:
        r0 = new java.lang.IllegalStateException;
        r1 = new java.lang.StringBuilder;
        r2 = "Child FragmentManager of ";
        r1.<init>(r2);
        r1 = r1.append(r9);
        r2 = " was not  destroyed and this fragment is not retaining instance";
        r1 = r1.append(r2);
        r1 = r1.toString();
        r0.<init>(r1);
        throw r0;
    L_0x05a0:
        r0 = r9.f732D;
        r0.m1277w();
        r0 = 0;
        r9.f732D = r0;
    L_0x05a8:
        r0 = 0;
        r8.m1215h(r9, r0);
        if (r13 != 0) goto L_0x0061;
    L_0x05ae:
        r0 = r9.f741M;
        if (r0 != 0) goto L_0x061b;
    L_0x05b2:
        r0 = r9.f758o;
        if (r0 < 0) goto L_0x0061;
    L_0x05b6:
        r0 = f1296a;
        if (r0 == 0) goto L_0x05ce;
    L_0x05ba:
        r0 = "FragmentManager";
        r1 = new java.lang.StringBuilder;
        r2 = "Freeing fragment index ";
        r1.<init>(r2);
        r1 = r1.append(r9);
        r1 = r1.toString();
        android.util.Log.v(r0, r1);
    L_0x05ce:
        r0 = r8.f1307f;
        r1 = r9.f758o;
        r2 = 0;
        r0.put(r1, r2);
        r0 = r8.f1315n;
        r1 = r9.f759p;
        r0.m1150a(r1);
        r0 = -1;
        r9.f758o = r0;
        r0 = 0;
        r9.f759p = r0;
        r0 = 0;
        r9.f764u = r0;
        r0 = 0;
        r9.f765v = r0;
        r0 = 0;
        r9.f766w = r0;
        r0 = 0;
        r9.f767x = r0;
        r0 = 0;
        r9.f768y = r0;
        r0 = 0;
        r9.f729A = r0;
        r0 = 0;
        r9.f730B = r0;
        r0 = 0;
        r9.f732D = r0;
        r0 = 0;
        r9.f731C = r0;
        r0 = 0;
        r9.f735G = r0;
        r0 = 0;
        r9.f736H = r0;
        r0 = 0;
        r9.f737I = r0;
        r0 = 0;
        r9.f738J = r0;
        r0 = 0;
        r9.f739K = r0;
        r0 = 0;
        r9.f741M = r0;
        r0 = 0;
        r9.f750V = r0;
        r0 = 0;
        r9.f751W = r0;
        r0 = 0;
        r9.f752X = r0;
        goto L_0x0061;
    L_0x061b:
        r0 = 0;
        r9.f731C = r0;
        r0 = 0;
        r9.f734F = r0;
        r0 = 0;
        r9.f730B = r0;
        goto L_0x0061;
    L_0x0626:
        r6 = r0;
        goto L_0x04b9;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.app.ae.a(android.support.v4.app.Fragment, int, int, int, boolean):void");
    }

    private final void m1216i(Fragment fragment) {
        m1230a(fragment, this.f1314m, 0, 0, false);
    }

    final void m1229a(Fragment fragment) {
        if (fragment != null) {
            int indexOf;
            ViewGroup viewGroup;
            int indexOfChild;
            an a;
            int i = this.f1314m;
            if (fragment.f765v) {
                if (fragment.cL_()) {
                    i = Math.min(i, 1);
                } else {
                    i = Math.min(i, 0);
                }
            }
            m1230a(fragment, i, fragment.m562N(), fragment.m563O(), false);
            if (fragment.f746R != null) {
                Fragment fragment2;
                ViewGroup viewGroup2 = fragment.f745Q;
                View view = fragment.f746R;
                if (viewGroup2 == null || view == null) {
                    fragment2 = null;
                } else {
                    for (indexOf = this.f1306e.indexOf(fragment) - 1; indexOf >= 0; indexOf--) {
                        fragment2 = (Fragment) this.f1306e.get(indexOf);
                        if (fragment2.f745Q == viewGroup2 && fragment2.f746R != null) {
                            break;
                        }
                    }
                    fragment2 = null;
                }
                if (fragment2 != null) {
                    view = fragment2.f746R;
                    viewGroup = fragment.f745Q;
                    indexOfChild = viewGroup.indexOfChild(view);
                    i = viewGroup.indexOfChild(fragment.f746R);
                    if (i < indexOfChild) {
                        viewGroup.removeViewAt(i);
                        viewGroup.addView(fragment.f746R, indexOfChild);
                    }
                }
                if (fragment.f754Z && fragment.f745Q != null) {
                    if (fragment.ab > 0.0f) {
                        fragment.f746R.setAlpha(fragment.ab);
                    }
                    fragment.ab = 0.0f;
                    fragment.f754Z = false;
                    a = m1184a(fragment, fragment.m562N(), true, fragment.m563O());
                    if (a != null) {
                        m1194a(fragment.f746R, a);
                        if (a.f1343a != null) {
                            fragment.f746R.startAnimation(a.f1343a);
                        } else {
                            a.f1344b.setTarget(fragment.f746R);
                            a.f1344b.start();
                        }
                    }
                }
            }
            if (fragment.aa) {
                boolean z;
                if (fragment.f746R != null) {
                    indexOf = fragment.m562N();
                    if (fragment.f738J) {
                        z = false;
                    } else {
                        z = true;
                    }
                    a = m1184a(fragment, indexOf, z, fragment.m563O());
                    if (a == null || a.f1344b == null) {
                        if (a != null) {
                            m1194a(fragment.f746R, a);
                            fragment.f746R.startAnimation(a.f1343a);
                            a.f1343a.start();
                        }
                        if (!fragment.f738J || fragment.m570V()) {
                            indexOfChild = 0;
                        } else {
                            indexOfChild = 8;
                        }
                        fragment.f746R.setVisibility(indexOfChild);
                        if (fragment.m570V()) {
                            fragment.m597d(false);
                        }
                    } else {
                        a.f1344b.setTarget(fragment.f746R);
                        if (!fragment.f738J) {
                            fragment.f746R.setVisibility(0);
                        } else if (fragment.m570V()) {
                            fragment.m597d(false);
                        } else {
                            viewGroup = fragment.f745Q;
                            View view2 = fragment.f746R;
                            viewGroup.startViewTransition(view2);
                            a.f1344b.addListener(new aj(viewGroup, view2, fragment));
                        }
                        m1194a(fragment.f746R, a);
                        a.f1344b.start();
                    }
                }
                if (fragment.f764u && fragment.f742N && fragment.f743O) {
                    this.f1319s = true;
                }
                fragment.aa = false;
                z = fragment.f738J;
                Fragment.r_();
            }
        }
    }

    final void m1225a(int i, boolean z) {
        if (this.f1315n == null && i != 0) {
            throw new IllegalStateException("No activity");
        } else if (z || i != this.f1314m) {
            this.f1314m = i;
            if (this.f1307f != null) {
                Fragment fragment;
                int a;
                int size = this.f1306e.size();
                int i2 = 0;
                int i3 = 0;
                while (i2 < size) {
                    fragment = (Fragment) this.f1306e.get(i2);
                    m1229a(fragment);
                    if (fragment.f750V != null) {
                        a = fragment.f750V.mo314a() | i3;
                    } else {
                        a = i3;
                    }
                    i2++;
                    i3 = a;
                }
                size = this.f1307f.size();
                i2 = 0;
                while (i2 < size) {
                    fragment = (Fragment) this.f1307f.valueAt(i2);
                    if (fragment != null && ((fragment.f765v || fragment.f739K) && !fragment.f754Z)) {
                        m1229a(fragment);
                        if (fragment.f750V != null) {
                            a = fragment.f750V.mo314a() | i3;
                            i2++;
                            i3 = a;
                        }
                    }
                    a = i3;
                    i2++;
                    i3 = a;
                }
                if (i3 == 0) {
                    m1264j();
                }
                if (this.f1319s && this.f1315n != null && this.f1314m == 5) {
                    this.f1315n.mo357d();
                    this.f1319s = false;
                }
            }
        }
    }

    final void m1264j() {
        if (this.f1307f != null) {
            for (int i = 0; i < this.f1307f.size(); i++) {
                Fragment fragment = (Fragment) this.f1307f.valueAt(i);
                if (fragment != null && fragment.f748T) {
                    if (this.f1304c) {
                        this.f1323w = true;
                    } else {
                        fragment.f748T = false;
                        m1230a(fragment, this.f1314m, 0, 0, false);
                    }
                }
            }
        }
    }

    final void m1245b(Fragment fragment) {
        if (fragment.f758o < 0) {
            int i = this.f1305d;
            this.f1305d = i + 1;
            fragment.m576a(i, this.f1317p);
            if (this.f1307f == null) {
                this.f1307f = new SparseArray();
            }
            this.f1307f.put(fragment.f758o, fragment);
            if (f1296a) {
                Log.v("FragmentManager", "Allocated fragment index " + fragment);
            }
        }
    }

    public final void m1231a(Fragment fragment, boolean z) {
        if (f1296a) {
            Log.v("FragmentManager", "add: " + fragment);
        }
        m1245b(fragment);
        if (!fragment.f739K) {
            if (this.f1306e.contains(fragment)) {
                throw new IllegalStateException("Fragment already added: " + fragment);
            }
            synchronized (this.f1306e) {
                this.f1306e.add(fragment);
            }
            fragment.f764u = true;
            fragment.f765v = false;
            if (fragment.f746R == null) {
                fragment.aa = false;
            }
            if (fragment.f742N && fragment.f743O) {
                this.f1319s = true;
            }
            if (z) {
                m1216i(fragment);
            }
        }
    }

    public final void m1253c(Fragment fragment) {
        if (f1296a) {
            Log.v("FragmentManager", "remove: " + fragment + " nesting=" + fragment.f729A);
        }
        boolean z = !fragment.cL_();
        if (!fragment.f739K || z) {
            synchronized (this.f1306e) {
                this.f1306e.remove(fragment);
            }
            if (fragment.f742N && fragment.f743O) {
                this.f1319s = true;
            }
            fragment.f764u = false;
            fragment.f765v = true;
        }
    }

    public static void m1208d(Fragment fragment) {
        boolean z = true;
        if (f1296a) {
            Log.v("FragmentManager", "hide: " + fragment);
        }
        if (!fragment.f738J) {
            fragment.f738J = true;
            if (fragment.aa) {
                z = false;
            }
            fragment.aa = z;
        }
    }

    public static void m1211e(Fragment fragment) {
        boolean z = false;
        if (f1296a) {
            Log.v("FragmentManager", "show: " + fragment);
        }
        if (fragment.f738J) {
            fragment.f738J = false;
            if (!fragment.aa) {
                z = true;
            }
            fragment.aa = z;
        }
    }

    public final void m1258f(Fragment fragment) {
        if (f1296a) {
            Log.v("FragmentManager", "detach: " + fragment);
        }
        if (!fragment.f739K) {
            fragment.f739K = true;
            if (fragment.f764u) {
                if (f1296a) {
                    Log.v("FragmentManager", "remove from detach: " + fragment);
                }
                synchronized (this.f1306e) {
                    this.f1306e.remove(fragment);
                }
                if (fragment.f742N && fragment.f743O) {
                    this.f1319s = true;
                }
                fragment.f764u = false;
            }
        }
    }

    public final void m1260g(Fragment fragment) {
        if (f1296a) {
            Log.v("FragmentManager", "attach: " + fragment);
        }
        if (fragment.f739K) {
            fragment.f739K = false;
            if (!fragment.f764u) {
                if (this.f1306e.contains(fragment)) {
                    throw new IllegalStateException("Fragment already added: " + fragment);
                }
                if (f1296a) {
                    Log.v("FragmentManager", "add from attach: " + fragment);
                }
                synchronized (this.f1306e) {
                    this.f1306e.add(fragment);
                }
                fragment.f764u = true;
                if (fragment.f742N && fragment.f743O) {
                    this.f1319s = true;
                }
            }
        }
    }

    public final Fragment mo281a(int i) {
        int size;
        for (size = this.f1306e.size() - 1; size >= 0; size--) {
            Fragment fragment = (Fragment) this.f1306e.get(size);
            if (fragment != null && fragment.f735G == i) {
                return fragment;
            }
        }
        if (this.f1307f != null) {
            for (size = this.f1307f.size() - 1; size >= 0; size--) {
                fragment = (Fragment) this.f1307f.valueAt(size);
                if (fragment != null && fragment.f735G == i) {
                    return fragment;
                }
            }
        }
        return null;
    }

    public final Fragment mo283a(String str) {
        int size;
        Fragment fragment;
        if (str != null) {
            for (size = this.f1306e.size() - 1; size >= 0; size--) {
                fragment = (Fragment) this.f1306e.get(size);
                if (fragment != null && str.equals(fragment.f737I)) {
                    return fragment;
                }
            }
        }
        if (!(this.f1307f == null || str == null)) {
            for (size = this.f1307f.size() - 1; size >= 0; size--) {
                fragment = (Fragment) this.f1307f.valueAt(size);
                if (fragment != null && str.equals(fragment.f737I)) {
                    return fragment;
                }
            }
        }
        return null;
    }

    public final Fragment m1243b(String str) {
        if (!(this.f1307f == null || str == null)) {
            for (int size = this.f1307f.size() - 1; size >= 0; size--) {
                Fragment fragment = (Fragment) this.f1307f.valueAt(size);
                if (fragment != null) {
                    if (!str.equals(fragment.f759p)) {
                        fragment = fragment.f732D != null ? fragment.f732D.m1243b(str) : null;
                    }
                    if (fragment != null) {
                        return fragment;
                    }
                }
            }
        }
        return null;
    }

    private final void m1219z() {
        if (this.f1320t) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        } else if (this.f1322v != null) {
            throw new IllegalStateException("Can not perform this action inside of " + this.f1322v);
        }
    }

    public final boolean mo298i() {
        return this.f1320t;
    }

    public final void m1234a(aq aqVar, boolean z) {
        if (!z) {
            m1219z();
        }
        synchronized (this) {
            if (!this.f1321u && this.f1315n != null) {
                if (this.f1303b == null) {
                    this.f1303b = new ArrayList();
                }
                this.f1303b.add(aqVar);
                m1265k();
            } else if (z) {
            } else {
                throw new IllegalStateException("Activity has been destroyed");
            }
        }
    }

    final void m1265k() {
        Object obj = 1;
        synchronized (this) {
            Object obj2 = (this.f1300C == null || this.f1300C.isEmpty()) ? null : 1;
            if (this.f1303b == null || this.f1303b.size() != 1) {
                obj = null;
            }
            if (!(obj2 == null && r0 == null)) {
                this.f1315n.f1286d.removeCallbacks(this.f1302E);
                this.f1315n.f1286d.post(this.f1302E);
            }
        }
    }

    public final int m1220a(C0245j c0245j) {
        int size;
        synchronized (this) {
            if (this.f1311j == null || this.f1311j.size() <= 0) {
                if (this.f1310i == null) {
                    this.f1310i = new ArrayList();
                }
                size = this.f1310i.size();
                if (f1296a) {
                    Log.v("FragmentManager", "Setting back stack index " + size + " to " + c0245j);
                }
                this.f1310i.add(c0245j);
            } else {
                size = ((Integer) this.f1311j.remove(this.f1311j.size() - 1)).intValue();
                if (f1296a) {
                    Log.v("FragmentManager", "Adding back stack index " + size + " with " + c0245j);
                }
                this.f1310i.set(size, c0245j);
            }
        }
        return size;
    }

    private final void m1186a(int i, C0245j c0245j) {
        synchronized (this) {
            if (this.f1310i == null) {
                this.f1310i = new ArrayList();
            }
            int size = this.f1310i.size();
            if (i < size) {
                if (f1296a) {
                    Log.v("FragmentManager", "Setting back stack index " + i + " to " + c0245j);
                }
                this.f1310i.set(i, c0245j);
            } else {
                while (size < i) {
                    this.f1310i.add(null);
                    if (this.f1311j == null) {
                        this.f1311j = new ArrayList();
                    }
                    if (f1296a) {
                        Log.v("FragmentManager", "Adding available back stack index " + size);
                    }
                    this.f1311j.add(Integer.valueOf(size));
                    size++;
                }
                if (f1296a) {
                    Log.v("FragmentManager", "Adding back stack index " + i + " with " + c0245j);
                }
                this.f1310i.add(c0245j);
            }
        }
    }

    final void m1238a(boolean z) {
        if (this.f1304c) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        } else if (Looper.myLooper() != this.f1315n.f1286d.getLooper()) {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        } else {
            if (!z) {
                m1219z();
            }
            if (this.f1324x == null) {
                this.f1324x = new ArrayList();
                this.f1325y = new ArrayList();
            }
            this.f1304c = true;
            try {
                m1202b(null, null);
            } finally {
                this.f1304c = false;
            }
        }
    }

    final void m1266l() {
        this.f1304c = false;
        this.f1325y.clear();
        this.f1324x.clear();
    }

    private final void m1202b(ArrayList arrayList, ArrayList arrayList2) {
        int i;
        if (this.f1300C == null) {
            i = 0;
        } else {
            i = this.f1300C.size();
        }
        int i2 = 0;
        int i3 = i;
        while (i2 < i3) {
            int indexOf;
            as asVar = (as) this.f1300C.get(i2);
            if (!(arrayList == null || asVar.f1351a)) {
                indexOf = arrayList.indexOf(asVar.f1352b);
                if (indexOf != -1 && ((Boolean) arrayList2.get(indexOf)).booleanValue()) {
                    asVar.m1286d();
                    i = i2;
                    indexOf = i3;
                    i2 = i + 1;
                    i3 = indexOf;
                }
            }
            if ((asVar.f1353c == 0 ? 1 : 0) != 0 || (arrayList != null && asVar.f1352b.m1473a(arrayList, 0, arrayList.size()))) {
                this.f1300C.remove(i2);
                i2--;
                i3--;
                if (!(arrayList == null || asVar.f1351a)) {
                    indexOf = arrayList.indexOf(asVar.f1352b);
                    if (indexOf != -1 && ((Boolean) arrayList2.get(indexOf)).booleanValue()) {
                        asVar.m1286d();
                        i = i2;
                        indexOf = i3;
                        i2 = i + 1;
                        i3 = indexOf;
                    }
                }
                asVar.m1285c();
            }
            i = i2;
            indexOf = i3;
            i2 = i + 1;
            i3 = indexOf;
        }
    }

    final void m1237a(ArrayList arrayList, ArrayList arrayList2) {
        int i = 0;
        if (arrayList != null && !arrayList.isEmpty()) {
            if (arrayList2 == null || arrayList.size() != arrayList2.size()) {
                throw new IllegalStateException("Internal error with the back stack records");
            }
            m1202b(arrayList, arrayList2);
            int size = arrayList.size();
            int i2 = 0;
            while (i < size) {
                int i3;
                if (((C0245j) arrayList.get(i)).f1576t) {
                    i3 = i;
                } else {
                    if (i2 != i) {
                        m1196a(arrayList, arrayList2, i2, i);
                    }
                    i2 = i + 1;
                    if (((Boolean) arrayList2.get(i)).booleanValue()) {
                        while (i2 < size && ((Boolean) arrayList2.get(i2)).booleanValue() && !((C0245j) arrayList.get(i2)).f1576t) {
                            i2++;
                        }
                    }
                    i3 = i2;
                    m1196a(arrayList, arrayList2, i, i3);
                    i2 = i3;
                    i3--;
                }
                i = i3 + 1;
            }
            if (i2 != size) {
                m1196a(arrayList, arrayList2, i2, size);
            }
        }
    }

    private final void m1196a(ArrayList arrayList, ArrayList arrayList2, int i, int i2) {
        int a;
        boolean z = ((C0245j) arrayList.get(i)).f1576t;
        if (this.f1326z == null) {
            this.f1326z = new ArrayList();
        } else {
            this.f1326z.clear();
        }
        this.f1326z.addAll(this.f1306e);
        int i3 = i;
        Fragment fragment = this.f1318q;
        boolean z2 = false;
        while (i3 < i2) {
            Fragment b;
            boolean z3;
            C0245j c0245j = (C0245j) arrayList.get(i3);
            if (((Boolean) arrayList2.get(i3)).booleanValue()) {
                b = c0245j.m1475b(this.f1326z, fragment);
            } else {
                b = c0245j.m1457a(this.f1326z, fragment);
            }
            if (z2 || c0245j.f1565i) {
                z3 = true;
            } else {
                z3 = false;
            }
            i3++;
            fragment = b;
            z2 = z3;
        }
        this.f1326z.clear();
        if (!z) {
            ax.m1318a(this, arrayList, arrayList2, i, i2, false);
        }
        m1203b(arrayList, arrayList2, i, i2);
        if (z) {
            C0308c c0308c = new C0308c();
            m1201b(c0308c);
            a = m1181a(arrayList, arrayList2, i, i2, c0308c);
            m1193a(c0308c);
        } else {
            a = i2;
        }
        if (a != i && z) {
            ax.m1318a(this, arrayList, arrayList2, i, a, true);
            m1225a(this.f1314m, true);
        }
        while (i < i2) {
            c0245j = (C0245j) arrayList.get(i);
            if (((Boolean) arrayList2.get(i)).booleanValue() && c0245j.f1569m >= 0) {
                int i4 = c0245j.f1569m;
                synchronized (this) {
                    this.f1310i.set(i4, null);
                    if (this.f1311j == null) {
                        this.f1311j = new ArrayList();
                    }
                    if (f1296a) {
                        Log.v("FragmentManager", "Freeing back stack index " + i4);
                    }
                    this.f1311j.add(Integer.valueOf(i4));
                }
                c0245j.f1569m = -1;
            }
            c0245j.m1479b();
            i++;
        }
        if (z2) {
            m1179B();
        }
    }

    private static void m1193a(C0308c c0308c) {
        int size = c0308c.size();
        for (int i = 0; i < size; i++) {
            Fragment fragment = (Fragment) c0308c.f1729i[i];
            if (!fragment.f764u) {
                View view = fragment.f746R;
                fragment.ab = view.getAlpha();
                view.setAlpha(0.0f);
            }
        }
    }

    private final int m1181a(ArrayList arrayList, ArrayList arrayList2, int i, int i2, C0308c c0308c) {
        int i3 = i2 - 1;
        int i4 = i2;
        while (i3 >= i) {
            boolean z;
            int i5;
            C0245j c0245j = (C0245j) arrayList.get(i3);
            boolean booleanValue = ((Boolean) arrayList2.get(i3)).booleanValue();
            for (int i6 = 0; i6 < c0245j.f1558b.size(); i6++) {
                if (C0245j.m1456b((C0246k) c0245j.f1558b.get(i6))) {
                    z = true;
                    break;
                }
            }
            z = false;
            if (!z || c0245j.m1473a(arrayList, i3 + 1, i2)) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                if (this.f1300C == null) {
                    this.f1300C = new ArrayList();
                }
                C0236t asVar = new as(c0245j, booleanValue);
                this.f1300C.add(asVar);
                c0245j.m1469a(asVar);
                if (booleanValue) {
                    c0245j.m1487f();
                } else {
                    c0245j.m1472a(false);
                }
                int i7 = i4 - 1;
                if (i3 != i7) {
                    arrayList.remove(i3);
                    arrayList.add(i7, c0245j);
                }
                m1201b(c0308c);
                i5 = i7;
            } else {
                i5 = i4;
            }
            i3--;
            i4 = i5;
        }
        return i4;
    }

    private final void m1192a(C0245j c0245j, boolean z, boolean z2, boolean z3) {
        if (z) {
            c0245j.m1472a(z3);
        } else {
            c0245j.m1487f();
        }
        ArrayList arrayList = new ArrayList(1);
        ArrayList arrayList2 = new ArrayList(1);
        arrayList.add(c0245j);
        arrayList2.add(Boolean.valueOf(z));
        if (z2) {
            ax.m1318a(this, arrayList, arrayList2, 0, 1, true);
        }
        if (z3) {
            m1225a(this.f1314m, true);
        }
        if (this.f1307f != null) {
            int size = this.f1307f.size();
            for (int i = 0; i < size; i++) {
                Fragment fragment = (Fragment) this.f1307f.valueAt(i);
                if (fragment != null && fragment.f746R != null && fragment.f754Z && c0245j.m1480b(fragment.f736H)) {
                    if (fragment.ab > 0.0f) {
                        fragment.f746R.setAlpha(fragment.ab);
                    }
                    if (z3) {
                        fragment.ab = 0.0f;
                    } else {
                        fragment.ab = -1.0f;
                        fragment.f754Z = false;
                    }
                }
            }
        }
    }

    private static void m1203b(ArrayList arrayList, ArrayList arrayList2, int i, int i2) {
        while (i < i2) {
            C0245j c0245j = (C0245j) arrayList.get(i);
            if (((Boolean) arrayList2.get(i)).booleanValue()) {
                c0245j.m1467a(-1);
                c0245j.m1472a(i == i2 + -1);
            } else {
                c0245j.m1467a(1);
                c0245j.m1487f();
            }
            i++;
        }
    }

    private final void m1201b(C0308c c0308c) {
        if (this.f1314m > 0) {
            int min = Math.min(this.f1314m, 4);
            int size = this.f1306e.size();
            for (int i = 0; i < size; i++) {
                Fragment fragment = (Fragment) this.f1306e.get(i);
                if (fragment.f755l < min) {
                    m1230a(fragment, min, fragment.m561M(), fragment.m562N(), false);
                    if (!(fragment.f746R == null || fragment.f738J || !fragment.f754Z)) {
                        c0308c.add(fragment);
                    }
                }
            }
        }
    }

    private final void m1178A() {
        if (this.f1300C != null) {
            while (!this.f1300C.isEmpty()) {
                ((as) this.f1300C.remove(0)).m1285c();
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean m1206c(java.util.ArrayList r5, java.util.ArrayList r6) {
        /*
        r4 = this;
        r0 = 0;
        monitor-enter(r4);
        r1 = r4.f1303b;	 Catch:{ all -> 0x003c }
        if (r1 == 0) goto L_0x000e;
    L_0x0006:
        r1 = r4.f1303b;	 Catch:{ all -> 0x003c }
        r1 = r1.size();	 Catch:{ all -> 0x003c }
        if (r1 != 0) goto L_0x0010;
    L_0x000e:
        monitor-exit(r4);	 Catch:{ all -> 0x003c }
    L_0x000f:
        return r0;
    L_0x0010:
        r1 = r4.f1303b;	 Catch:{ all -> 0x003c }
        r3 = r1.size();	 Catch:{ all -> 0x003c }
        r2 = r0;
        r1 = r0;
    L_0x0018:
        if (r2 >= r3) goto L_0x002b;
    L_0x001a:
        r0 = r4.f1303b;	 Catch:{ all -> 0x003c }
        r0 = r0.get(r2);	 Catch:{ all -> 0x003c }
        r0 = (android.support.v4.app.aq) r0;	 Catch:{ all -> 0x003c }
        r0 = r0.mo300a(r5, r6);	 Catch:{ all -> 0x003c }
        r1 = r1 | r0;
        r0 = r2 + 1;
        r2 = r0;
        goto L_0x0018;
    L_0x002b:
        r0 = r4.f1303b;	 Catch:{ all -> 0x003c }
        r0.clear();	 Catch:{ all -> 0x003c }
        r0 = r4.f1315n;	 Catch:{ all -> 0x003c }
        r0 = r0.f1286d;	 Catch:{ all -> 0x003c }
        r2 = r4.f1302E;	 Catch:{ all -> 0x003c }
        r0.removeCallbacks(r2);	 Catch:{ all -> 0x003c }
        monitor-exit(r4);	 Catch:{ all -> 0x003c }
        r0 = r1;
        goto L_0x000f;
    L_0x003c:
        r0 = move-exception;
        monitor-exit(r4);	 Catch:{ all -> 0x003c }
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.app.ae.c(java.util.ArrayList, java.util.ArrayList):boolean");
    }

    final void m1268n() {
        if (this.f1323w) {
            int i = 0;
            for (int i2 = 0; i2 < this.f1307f.size(); i2++) {
                Fragment fragment = (Fragment) this.f1307f.valueAt(i2);
                if (!(fragment == null || fragment.f750V == null)) {
                    i |= fragment.f750V.mo314a();
                }
            }
            if (i == 0) {
                this.f1323w = false;
                m1264j();
            }
        }
    }

    private final void m1179B() {
        if (this.f1312k != null) {
            for (int i = 0; i < this.f1312k.size(); i++) {
                ((ad) this.f1312k.get(i)).mo1358a();
            }
        }
    }

    final boolean m1242a(ArrayList arrayList, ArrayList arrayList2, String str, int i, int i2) {
        if (this.f1308g == null) {
            return false;
        }
        int size;
        if (str == null && i < 0 && (i2 & 1) == 0) {
            size = this.f1308g.size() - 1;
            if (size < 0) {
                return false;
            }
            arrayList.add(this.f1308g.remove(size));
            arrayList2.add(Boolean.valueOf(true));
        } else {
            int size2;
            size = -1;
            if (str != null || i >= 0) {
                C0245j c0245j;
                size2 = this.f1308g.size() - 1;
                while (size2 >= 0) {
                    c0245j = (C0245j) this.f1308g.get(size2);
                    if ((str != null && str.equals(c0245j.f1567k)) || (i >= 0 && i == c0245j.f1569m)) {
                        break;
                    }
                    size2--;
                }
                if (size2 < 0) {
                    return false;
                }
                if ((i2 & 1) != 0) {
                    size2--;
                    while (size2 >= 0) {
                        c0245j = (C0245j) this.f1308g.get(size2);
                        if ((str == null || !str.equals(c0245j.f1567k)) && (i < 0 || i != c0245j.f1569m)) {
                            break;
                        }
                        size2--;
                    }
                }
                size = size2;
            }
            if (size == this.f1308g.size() - 1) {
                return false;
            }
            for (size2 = this.f1308g.size() - 1; size2 > size; size2--) {
                arrayList.add(this.f1308g.remove(size2));
                arrayList2.add(Boolean.valueOf(true));
            }
        }
        return true;
    }

    static void m1191a(at atVar) {
        if (atVar != null) {
            List<Fragment> list = atVar.f1354a;
            if (list != null) {
                for (Fragment fragment : list) {
                    fragment.f741M = true;
                }
            }
            List<at> list2 = atVar.f1355b;
            if (list2 != null) {
                for (at a : list2) {
                    m1191a(a);
                }
            }
        }
    }

    private final void m1180C() {
        List list;
        List list2;
        if (this.f1307f != null) {
            int i = 0;
            list = null;
            list2 = null;
            while (i < this.f1307f.size()) {
                ArrayList arrayList;
                ArrayList arrayList2;
                Fragment fragment = (Fragment) this.f1307f.valueAt(i);
                if (fragment != null) {
                    ArrayList arrayList3;
                    Object obj;
                    if (fragment.f740L) {
                        if (list2 == null) {
                            arrayList3 = new ArrayList();
                        }
                        arrayList3.add(fragment);
                        fragment.f762s = fragment.f761r != null ? fragment.f761r.f758o : -1;
                        if (f1296a) {
                            Log.v("FragmentManager", "retainNonConfig: keeping retained " + fragment);
                        }
                    }
                    if (fragment.f732D != null) {
                        fragment.f732D.m1180C();
                        obj = fragment.f732D.f1301D;
                    } else {
                        at atVar = fragment.f733E;
                    }
                    if (list == null && obj != null) {
                        list = new ArrayList(this.f1307f.size());
                        for (int i2 = 0; i2 < i; i2++) {
                            list.add(null);
                        }
                    }
                    arrayList = list;
                    if (arrayList != null) {
                        arrayList.add(obj);
                    }
                    arrayList2 = arrayList3;
                } else {
                    List list3 = list;
                    list = list2;
                }
                i++;
                Object obj2 = arrayList2;
                Object obj3 = arrayList;
            }
        } else {
            list = null;
            list2 = null;
        }
        if (list2 == null && list == null) {
            this.f1301D = null;
        } else {
            this.f1301D = new at(list2, list);
        }
    }

    private final void m1217j(Fragment fragment) {
        if (fragment.f747S != null) {
            if (this.f1299B == null) {
                this.f1299B = new SparseArray();
            } else {
                this.f1299B.clear();
            }
            fragment.f747S.saveHierarchyState(this.f1299B);
            if (this.f1299B.size() > 0) {
                fragment.f757n = this.f1299B;
                this.f1299B = null;
            }
        }
    }

    final Parcelable m1269o() {
        int i;
        BackStackState[] backStackStateArr = null;
        int i2 = 0;
        m1178A();
        if (this.f1307f == null) {
            i = 0;
        } else {
            i = this.f1307f.size();
        }
        for (int i3 = 0; i3 < i; i3++) {
            Fragment fragment = (Fragment) this.f1307f.valueAt(i3);
            if (fragment != null) {
                if (fragment.m566R() != null) {
                    int T = fragment.m568T();
                    View R = fragment.m566R();
                    Animation animation = R.getAnimation();
                    if (animation != null) {
                        animation.cancel();
                        R.clearAnimation();
                    }
                    fragment.d_(null);
                    m1230a(fragment, T, 0, 0, false);
                } else if (fragment.m567S() != null) {
                    fragment.m567S().end();
                }
            }
        }
        m1267m();
        this.f1320t = true;
        this.f1301D = null;
        if (this.f1307f == null || this.f1307f.size() <= 0) {
            return null;
        }
        int size = this.f1307f.size();
        FragmentState[] fragmentStateArr = new FragmentState[size];
        T = 0;
        boolean z = false;
        while (T < size) {
            boolean z2;
            Fragment fragment2 = (Fragment) this.f1307f.valueAt(T);
            if (fragment2 != null) {
                if (fragment2.f758o < 0) {
                    m1195a(new IllegalStateException("Failure saving state: active " + fragment2 + " has cleared index: " + fragment2.f758o));
                }
                FragmentState fragmentState = new FragmentState(fragment2);
                fragmentStateArr[T] = fragmentState;
                if (fragment2.f755l <= 0 || fragmentState.f1281k != null) {
                    fragmentState.f1281k = fragment2.f756m;
                } else {
                    Bundle bundle;
                    if (this.f1298A == null) {
                        this.f1298A = new Bundle();
                    }
                    fragment2.m611l(this.f1298A);
                    m1209d(fragment2, this.f1298A, false);
                    if (this.f1298A.isEmpty()) {
                        bundle = null;
                    } else {
                        bundle = this.f1298A;
                        this.f1298A = null;
                    }
                    if (fragment2.f746R != null) {
                        m1217j(fragment2);
                    }
                    if (fragment2.f757n != null) {
                        if (bundle == null) {
                            bundle = new Bundle();
                        }
                        bundle.putSparseParcelableArray("android:view_state", fragment2.f757n);
                    }
                    if (!fragment2.f749U) {
                        if (bundle == null) {
                            bundle = new Bundle();
                        }
                        bundle.putBoolean("android:user_visible_hint", fragment2.f749U);
                    }
                    fragmentState.f1281k = bundle;
                    if (fragment2.f761r != null) {
                        if (fragment2.f761r.f758o < 0) {
                            m1195a(new IllegalStateException("Failure saving state: " + fragment2 + " has target not in fragment manager: " + fragment2.f761r));
                        }
                        if (fragmentState.f1281k == null) {
                            fragmentState.f1281k = new Bundle();
                        }
                        mo285a(fragmentState.f1281k, "android:target_state", fragment2.f761r);
                        if (fragment2.f763t != 0) {
                            fragmentState.f1281k.putInt("android:target_req_state", fragment2.f763t);
                        }
                    }
                }
                if (f1296a) {
                    Log.v("FragmentManager", "Saved state of " + fragment2 + ": " + fragmentState.f1281k);
                }
                z2 = true;
            } else {
                z2 = z;
            }
            T++;
            z = z2;
        }
        if (z) {
            int[] iArr;
            size = this.f1306e.size();
            if (size > 0) {
                iArr = new int[size];
                for (T = 0; T < size; T++) {
                    iArr[T] = ((Fragment) this.f1306e.get(T)).f758o;
                    if (iArr[T] < 0) {
                        m1195a(new IllegalStateException("Failure saving state: active " + this.f1306e.get(T) + " has cleared index: " + iArr[T]));
                    }
                    if (f1296a) {
                        Log.v("FragmentManager", "saveAllState: adding fragment #" + T + ": " + this.f1306e.get(T));
                    }
                }
            } else {
                iArr = null;
            }
            if (this.f1308g != null) {
                T = this.f1308g.size();
                if (T > 0) {
                    backStackStateArr = new BackStackState[T];
                    while (i2 < T) {
                        backStackStateArr[i2] = new BackStackState((C0245j) this.f1308g.get(i2));
                        if (f1296a) {
                            Log.v("FragmentManager", "saveAllState: adding back stack #" + i2 + ": " + this.f1308g.get(i2));
                        }
                        i2++;
                    }
                }
            }
            FragmentManagerState fragmentManagerState = new FragmentManagerState();
            fragmentManagerState.f1266a = fragmentStateArr;
            fragmentManagerState.f1267b = iArr;
            fragmentManagerState.f1268c = backStackStateArr;
            if (this.f1318q != null) {
                fragmentManagerState.f1269d = this.f1318q.f758o;
            }
            fragmentManagerState.f1270e = this.f1305d;
            m1180C();
            return fragmentManagerState;
        } else if (!f1296a) {
            return null;
        } else {
            Log.v("FragmentManager", "saveAllState: no fragments!");
            return null;
        }
    }

    final void m1228a(Parcelable parcelable, at atVar) {
        if (parcelable != null) {
            FragmentManagerState fragmentManagerState = (FragmentManagerState) parcelable;
            if (fragmentManagerState.f1266a != null) {
                int size;
                Fragment fragment;
                int i;
                List list;
                if (atVar != null) {
                    List list2 = atVar.f1354a;
                    List list3 = atVar.f1355b;
                    if (list2 != null) {
                        size = list2.size();
                    } else {
                        boolean z = false;
                    }
                    for (int i2 = 0; i2 < size; i2++) {
                        fragment = (Fragment) list2.get(i2);
                        if (f1296a) {
                            Log.v("FragmentManager", "restoreAllState: re-attaching retained " + fragment);
                        }
                        i = 0;
                        while (i < fragmentManagerState.f1266a.length && fragmentManagerState.f1266a[i].f1272b != fragment.f758o) {
                            i++;
                        }
                        if (i == fragmentManagerState.f1266a.length) {
                            m1195a(new IllegalStateException("Could not find active fragment with index " + fragment.f758o));
                        }
                        FragmentState fragmentState = fragmentManagerState.f1266a[i];
                        fragmentState.f1282l = fragment;
                        fragment.f757n = null;
                        fragment.f729A = 0;
                        fragment.f767x = false;
                        fragment.f764u = false;
                        fragment.f761r = null;
                        if (fragmentState.f1281k != null) {
                            fragmentState.f1281k.setClassLoader(this.f1315n.f1285c.getClassLoader());
                            fragment.f757n = fragmentState.f1281k.getSparseParcelableArray("android:view_state");
                            fragment.f756m = fragmentState.f1281k;
                        }
                    }
                    list = list3;
                } else {
                    list = null;
                }
                this.f1307f = new SparseArray(fragmentManagerState.f1266a.length);
                i = 0;
                while (i < fragmentManagerState.f1266a.length) {
                    FragmentState fragmentState2 = fragmentManagerState.f1266a[i];
                    if (fragmentState2 != null) {
                        at atVar2;
                        if (list == null || i >= list.size()) {
                            atVar2 = null;
                        } else {
                            atVar2 = (at) list.get(i);
                        }
                        aa aaVar = this.f1315n;
                        C0235y c0235y = this.f1316o;
                        Fragment fragment2 = this.f1317p;
                        if (fragmentState2.f1282l == null) {
                            Context context = aaVar.f1285c;
                            if (fragmentState2.f1279i != null) {
                                fragmentState2.f1279i.setClassLoader(context.getClassLoader());
                            }
                            if (c0235y != null) {
                                fragmentState2.f1282l = c0235y.mo341a(context, fragmentState2.f1271a, fragmentState2.f1279i);
                            } else {
                                fragmentState2.f1282l = Fragment.m543a(context, fragmentState2.f1271a, fragmentState2.f1279i);
                            }
                            if (fragmentState2.f1281k != null) {
                                fragmentState2.f1281k.setClassLoader(context.getClassLoader());
                                fragmentState2.f1282l.f756m = fragmentState2.f1281k;
                            }
                            fragmentState2.f1282l.m576a(fragmentState2.f1272b, fragment2);
                            fragmentState2.f1282l.f766w = fragmentState2.f1273c;
                            fragmentState2.f1282l.f768y = true;
                            fragmentState2.f1282l.f735G = fragmentState2.f1274d;
                            fragmentState2.f1282l.f736H = fragmentState2.f1275e;
                            fragmentState2.f1282l.f737I = fragmentState2.f1276f;
                            fragmentState2.f1282l.f740L = fragmentState2.f1277g;
                            fragmentState2.f1282l.f739K = fragmentState2.f1278h;
                            fragmentState2.f1282l.f738J = fragmentState2.f1280j;
                            fragmentState2.f1282l.f730B = aaVar.f1288f;
                            if (f1296a) {
                                Log.v("FragmentManager", "Instantiated fragment " + fragmentState2.f1282l);
                            }
                        }
                        fragmentState2.f1282l.f733E = atVar2;
                        fragment = fragmentState2.f1282l;
                        if (f1296a) {
                            Log.v("FragmentManager", "restoreAllState: active #" + i + ": " + fragment);
                        }
                        this.f1307f.put(fragment.f758o, fragment);
                        fragmentState2.f1282l = null;
                    }
                    i++;
                }
                if (atVar != null) {
                    List list4 = atVar.f1354a;
                    if (list4 != null) {
                        i = list4.size();
                    } else {
                        boolean z2 = false;
                    }
                    for (int i3 = 0; i3 < i; i3++) {
                        fragment = (Fragment) list4.get(i3);
                        if (fragment.f762s >= 0) {
                            fragment.f761r = (Fragment) this.f1307f.get(fragment.f762s);
                            if (fragment.f761r == null) {
                                Log.w("FragmentManager", "Re-attaching retained fragment " + fragment + " target no longer exists: " + fragment.f762s);
                            }
                        }
                    }
                }
                this.f1306e.clear();
                if (fragmentManagerState.f1267b != null) {
                    for (size = 0; size < fragmentManagerState.f1267b.length; size++) {
                        fragment = (Fragment) this.f1307f.get(fragmentManagerState.f1267b[size]);
                        if (fragment == null) {
                            m1195a(new IllegalStateException("No instantiated fragment for index #" + fragmentManagerState.f1267b[size]));
                        }
                        fragment.f764u = true;
                        if (f1296a) {
                            Log.v("FragmentManager", "restoreAllState: added #" + size + ": " + fragment);
                        }
                        if (this.f1306e.contains(fragment)) {
                            throw new IllegalStateException("Already added!");
                        }
                        synchronized (this.f1306e) {
                            this.f1306e.add(fragment);
                        }
                    }
                }
                if (fragmentManagerState.f1268c != null) {
                    this.f1308g = new ArrayList(fragmentManagerState.f1268c.length);
                    for (int i4 = 0; i4 < fragmentManagerState.f1268c.length; i4++) {
                        C0245j a = fragmentManagerState.f1268c[i4].m1139a(this);
                        if (f1296a) {
                            Log.v("FragmentManager", "restoreAllState: back stack #" + i4 + " (index " + a.f1569m + "): " + a);
                            PrintWriter printWriter = new PrintWriter(new C0312g("FragmentManager"));
                            a.m1471a("  ", printWriter, false);
                            printWriter.close();
                        }
                        this.f1308g.add(a);
                        if (a.f1569m >= 0) {
                            m1186a(a.f1569m, a);
                        }
                    }
                } else {
                    this.f1308g = null;
                }
                if (fragmentManagerState.f1269d >= 0) {
                    this.f1318q = (Fragment) this.f1307f.get(fragmentManagerState.f1269d);
                }
                this.f1305d = fragmentManagerState.f1270e;
            }
        }
    }

    final void m1270p() {
        if (this.f1307f != null) {
            for (int size = this.f1307f.size() - 1; size >= 0; size--) {
                if (this.f1307f.valueAt(size) == null) {
                    this.f1307f.delete(this.f1307f.keyAt(size));
                }
            }
        }
    }

    public final void m1232a(aa aaVar, C0235y c0235y, Fragment fragment) {
        if (this.f1315n != null) {
            throw new IllegalStateException("Already attached");
        }
        this.f1315n = aaVar;
        this.f1316o = c0235y;
        this.f1317p = fragment;
    }

    public final void m1271q() {
        this.f1301D = null;
        this.f1320t = false;
        int size = this.f1306e.size();
        for (int i = 0; i < size; i++) {
            Fragment fragment = (Fragment) this.f1306e.get(i);
            if (!(fragment == null || fragment.f732D == null)) {
                fragment.f732D.m1271q();
            }
        }
    }

    public final void m1272r() {
        this.f1320t = false;
        m1252c(1);
    }

    public final void m1273s() {
        this.f1320t = false;
        m1252c(2);
    }

    public final void m1274t() {
        this.f1320t = false;
        m1252c(4);
    }

    public final void m1275u() {
        this.f1320t = false;
        m1252c(5);
    }

    public final void m1276v() {
        this.f1320t = true;
        m1252c(3);
    }

    public final void m1277w() {
        this.f1321u = true;
        m1267m();
        m1252c(0);
        this.f1315n = null;
        this.f1316o = null;
        this.f1317p = null;
    }

    final void m1252c(int i) {
        try {
            this.f1304c = true;
            m1225a(i, false);
            m1267m();
        } finally {
            this.f1304c = false;
        }
    }

    public final void m1248b(boolean z) {
        for (int size = this.f1306e.size() - 1; size >= 0; size--) {
            Fragment fragment = (Fragment) this.f1306e.get(size);
            if (!(fragment == null || fragment.f732D == null)) {
                fragment.f732D.m1248b(z);
            }
        }
    }

    public final void m1254c(boolean z) {
        for (int size = this.f1306e.size() - 1; size >= 0; size--) {
            Fragment fragment = (Fragment) this.f1306e.get(size);
            if (!(fragment == null || fragment.f732D == null)) {
                fragment.f732D.m1254c(z);
            }
        }
    }

    public final void m1226a(Configuration configuration) {
        for (int i = 0; i < this.f1306e.size(); i++) {
            Fragment fragment = (Fragment) this.f1306e.get(i);
            if (fragment != null) {
                fragment.onConfigurationChanged(configuration);
                if (fragment.f732D != null) {
                    fragment.f732D.m1226a(configuration);
                }
            }
        }
    }

    public final void m1278x() {
        for (int i = 0; i < this.f1306e.size(); i++) {
            Fragment fragment = (Fragment) this.f1306e.get(i);
            if (fragment != null) {
                fragment.onLowMemory();
                if (fragment.f732D != null) {
                    fragment.f732D.m1278x();
                }
            }
        }
    }

    public final boolean m1240a(Menu menu, MenuInflater menuInflater) {
        int i = 0;
        if (this.f1314m <= 0) {
            return false;
        }
        ArrayList arrayList = null;
        int i2 = 0;
        boolean z = false;
        while (i2 < this.f1306e.size()) {
            boolean z2;
            Fragment fragment = (Fragment) this.f1306e.get(i2);
            if (fragment != null) {
                int i3;
                if (fragment.f738J) {
                    i3 = 0;
                } else {
                    if (fragment.f742N && fragment.f743O) {
                        fragment.mo2865a(menu, menuInflater);
                        i3 = 1;
                    } else {
                        i3 = 0;
                    }
                    if (fragment.f732D != null) {
                        i3 |= fragment.f732D.m1240a(menu, menuInflater);
                    }
                }
                if (i3 != 0) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(fragment);
                    z2 = true;
                    i2++;
                    z = z2;
                }
            }
            z2 = z;
            i2++;
            z = z2;
        }
        if (this.f1309h != null) {
            while (i < this.f1309h.size()) {
                fragment = (Fragment) this.f1309h.get(i);
                if (arrayList == null || !arrayList.contains(fragment)) {
                    Fragment.m548x();
                }
                i++;
            }
        }
        this.f1309h = arrayList;
        return z;
    }

    public final boolean m1239a(Menu menu) {
        if (this.f1314m <= 0) {
            return false;
        }
        boolean z = false;
        for (int i = 0; i < this.f1306e.size(); i++) {
            Fragment fragment = (Fragment) this.f1306e.get(i);
            if (fragment != null) {
                int i2;
                if (fragment.f738J) {
                    i2 = 0;
                } else {
                    if (fragment.f742N && fragment.f743O) {
                        i2 = 1;
                    } else {
                        i2 = 0;
                    }
                    if (fragment.f732D != null) {
                        i2 |= fragment.f732D.m1239a(menu);
                    }
                }
                if (i2 != 0) {
                    z = true;
                }
            }
        }
        return z;
    }

    public final boolean m1241a(MenuItem menuItem) {
        if (this.f1314m <= 0) {
            return false;
        }
        for (int i = 0; i < this.f1306e.size(); i++) {
            Fragment fragment = (Fragment) this.f1306e.get(i);
            if (fragment != null) {
                boolean z;
                if (!fragment.f738J) {
                    if (fragment.f742N && fragment.f743O && fragment.mo2866a(menuItem)) {
                        z = true;
                        if (!z) {
                            return true;
                        }
                    } else if (fragment.f732D != null && fragment.f732D.m1241a(menuItem)) {
                        z = true;
                        if (!z) {
                            return true;
                        }
                    }
                }
                z = false;
                if (!z) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean m1250b(MenuItem menuItem) {
        if (this.f1314m <= 0) {
            return false;
        }
        for (int i = 0; i < this.f1306e.size(); i++) {
            Fragment fragment = (Fragment) this.f1306e.get(i);
            if (fragment != null) {
                boolean z;
                if (fragment.f738J || fragment.f732D == null || !fragment.f732D.m1250b(menuItem)) {
                    z = false;
                } else {
                    z = true;
                }
                if (z) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void m1247b(Menu menu) {
        if (this.f1314m > 0) {
            for (int i = 0; i < this.f1306e.size(); i++) {
                Fragment fragment = (Fragment) this.f1306e.get(i);
                if (!(fragment == null || fragment.f738J || fragment.f732D == null)) {
                    fragment.f732D.m1247b(menu);
                }
            }
        }
    }

    public final void m1261h(Fragment fragment) {
        if (fragment == null || (this.f1307f.get(fragment.f758o) == fragment && (fragment.f731C == null || fragment.f730B == this))) {
            this.f1318q = fragment;
            return;
        }
        throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
    }

    private final void m1187a(Fragment fragment, Context context, boolean z) {
        if (this.f1317p != null) {
            ae aeVar = this.f1317p.f730B;
            if (aeVar instanceof ae) {
                aeVar.m1187a(fragment, context, true);
            }
        }
        Iterator it = this.f1313l.iterator();
        while (it.hasNext()) {
            C0320p c0320p = (C0320p) it.next();
            if (z) {
                ((Boolean) c0320p.f1763b).booleanValue();
            }
        }
    }

    private final void m1198b(Fragment fragment, Context context, boolean z) {
        if (this.f1317p != null) {
            ae aeVar = this.f1317p.f730B;
            if (aeVar instanceof ae) {
                aeVar.m1198b(fragment, context, true);
            }
        }
        Iterator it = this.f1313l.iterator();
        while (it.hasNext()) {
            C0320p c0320p = (C0320p) it.next();
            if (z) {
                ((Boolean) c0320p.f1763b).booleanValue();
            }
        }
    }

    private final void m1188a(Fragment fragment, Bundle bundle, boolean z) {
        if (this.f1317p != null) {
            ae aeVar = this.f1317p.f730B;
            if (aeVar instanceof ae) {
                aeVar.m1188a(fragment, bundle, true);
            }
        }
        Iterator it = this.f1313l.iterator();
        while (it.hasNext()) {
            C0320p c0320p = (C0320p) it.next();
            if (z) {
                ((Boolean) c0320p.f1763b).booleanValue();
            }
        }
    }

    private final void m1199b(Fragment fragment, Bundle bundle, boolean z) {
        if (this.f1317p != null) {
            ae aeVar = this.f1317p.f730B;
            if (aeVar instanceof ae) {
                aeVar.m1199b(fragment, bundle, true);
            }
        }
        Iterator it = this.f1313l.iterator();
        while (it.hasNext()) {
            C0320p c0320p = (C0320p) it.next();
            if (z) {
                ((Boolean) c0320p.f1763b).booleanValue();
            }
        }
    }

    private final void m1204c(Fragment fragment, Bundle bundle, boolean z) {
        if (this.f1317p != null) {
            ae aeVar = this.f1317p.f730B;
            if (aeVar instanceof ae) {
                aeVar.m1204c(fragment, bundle, true);
            }
        }
        Iterator it = this.f1313l.iterator();
        while (it.hasNext()) {
            C0320p c0320p = (C0320p) it.next();
            if (z) {
                ((Boolean) c0320p.f1763b).booleanValue();
            }
        }
    }

    private final void m1189a(Fragment fragment, View view, Bundle bundle, boolean z) {
        if (this.f1317p != null) {
            ae aeVar = this.f1317p.f730B;
            if (aeVar instanceof ae) {
                aeVar.m1189a(fragment, view, bundle, true);
            }
        }
        Iterator it = this.f1313l.iterator();
        while (it.hasNext()) {
            C0320p c0320p = (C0320p) it.next();
            if (z) {
                ((Boolean) c0320p.f1763b).booleanValue();
            }
        }
    }

    private final void m1200b(Fragment fragment, boolean z) {
        if (this.f1317p != null) {
            ae aeVar = this.f1317p.f730B;
            if (aeVar instanceof ae) {
                aeVar.m1200b(fragment, true);
            }
        }
        Iterator it = this.f1313l.iterator();
        while (it.hasNext()) {
            C0320p c0320p = (C0320p) it.next();
            if (z) {
                ((Boolean) c0320p.f1763b).booleanValue();
            }
        }
    }

    private final void m1205c(Fragment fragment, boolean z) {
        if (this.f1317p != null) {
            ae aeVar = this.f1317p.f730B;
            if (aeVar instanceof ae) {
                aeVar.m1205c(fragment, true);
            }
        }
        Iterator it = this.f1313l.iterator();
        while (it.hasNext()) {
            C0320p c0320p = (C0320p) it.next();
            if (z) {
                ((Boolean) c0320p.f1763b).booleanValue();
            }
        }
    }

    private final void m1210d(Fragment fragment, boolean z) {
        if (this.f1317p != null) {
            ae aeVar = this.f1317p.f730B;
            if (aeVar instanceof ae) {
                aeVar.m1210d(fragment, true);
            }
        }
        Iterator it = this.f1313l.iterator();
        while (it.hasNext()) {
            C0320p c0320p = (C0320p) it.next();
            if (z) {
                ((Boolean) c0320p.f1763b).booleanValue();
            }
        }
    }

    private final void m1212e(Fragment fragment, boolean z) {
        if (this.f1317p != null) {
            ae aeVar = this.f1317p.f730B;
            if (aeVar instanceof ae) {
                aeVar.m1212e(fragment, true);
            }
        }
        Iterator it = this.f1313l.iterator();
        while (it.hasNext()) {
            C0320p c0320p = (C0320p) it.next();
            if (z) {
                ((Boolean) c0320p.f1763b).booleanValue();
            }
        }
    }

    private final void m1209d(Fragment fragment, Bundle bundle, boolean z) {
        if (this.f1317p != null) {
            ae aeVar = this.f1317p.f730B;
            if (aeVar instanceof ae) {
                aeVar.m1209d(fragment, bundle, true);
            }
        }
        Iterator it = this.f1313l.iterator();
        while (it.hasNext()) {
            C0320p c0320p = (C0320p) it.next();
            if (z) {
                ((Boolean) c0320p.f1763b).booleanValue();
            }
        }
    }

    private final void m1213f(Fragment fragment, boolean z) {
        if (this.f1317p != null) {
            ae aeVar = this.f1317p.f730B;
            if (aeVar instanceof ae) {
                aeVar.m1213f(fragment, true);
            }
        }
        Iterator it = this.f1313l.iterator();
        while (it.hasNext()) {
            C0320p c0320p = (C0320p) it.next();
            if (z) {
                ((Boolean) c0320p.f1763b).booleanValue();
            }
        }
    }

    private final void m1214g(Fragment fragment, boolean z) {
        if (this.f1317p != null) {
            ae aeVar = this.f1317p.f730B;
            if (aeVar instanceof ae) {
                aeVar.m1214g(fragment, true);
            }
        }
        Iterator it = this.f1313l.iterator();
        while (it.hasNext()) {
            C0320p c0320p = (C0320p) it.next();
            if (z) {
                ((Boolean) c0320p.f1763b).booleanValue();
            }
        }
    }

    private final void m1215h(Fragment fragment, boolean z) {
        if (this.f1317p != null) {
            ae aeVar = this.f1317p.f730B;
            if (aeVar instanceof ae) {
                aeVar.m1215h(fragment, true);
            }
        }
        Iterator it = this.f1313l.iterator();
        while (it.hasNext()) {
            C0320p c0320p = (C0320p) it.next();
            if (z) {
                ((Boolean) c0320p.f1763b).booleanValue();
            }
        }
    }

    public static int m1207d(int i) {
        switch (i) {
            case 4097:
                return 8194;
            case 4099:
                return 4099;
            case 8194:
                return 4097;
            default:
                return 0;
        }
    }

    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        if (!"fragment".equals(str)) {
            return null;
        }
        String string;
        String attributeValue = attributeSet.getAttributeValue(null, "class");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ap.f1346a);
        if (attributeValue == null) {
            string = obtainStyledAttributes.getString(0);
        } else {
            string = attributeValue;
        }
        int resourceId = obtainStyledAttributes.getResourceId(1, -1);
        String string2 = obtainStyledAttributes.getString(2);
        obtainStyledAttributes.recycle();
        if (!Fragment.m544a(this.f1315n.f1285c, string)) {
            return null;
        }
        int id;
        if (view != null) {
            id = view.getId();
        } else {
            id = 0;
        }
        if (id == -1 && resourceId == -1 && string2 == null) {
            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + string);
        }
        Fragment fragment;
        Fragment a = resourceId != -1 ? mo281a(resourceId) : null;
        if (a == null && string2 != null) {
            a = mo283a(string2);
        }
        if (a == null && id != -1) {
            a = mo281a(id);
        }
        if (f1296a) {
            Log.v("FragmentManager", "onCreateView: id=0x" + Integer.toHexString(resourceId) + " fname=" + string + " existing=" + a);
        }
        if (a == null) {
            Fragment a2 = this.f1316o.mo341a(context, string, null);
            a2.f766w = true;
            a2.f735G = resourceId != 0 ? resourceId : id;
            a2.f736H = id;
            a2.f737I = string2;
            a2.f767x = true;
            a2.f730B = this;
            a2.f731C = this.f1315n;
            Bundle bundle = a2.f756m;
            a2.m615q();
            m1231a(a2, true);
            fragment = a2;
        } else if (a.f767x) {
            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string2 + ", or parent id 0x" + Integer.toHexString(id) + " with another fragment for " + string);
        } else {
            a.f767x = true;
            a.f731C = this.f1315n;
            if (!a.f741M) {
                Bundle bundle2 = a.f756m;
                a.m615q();
            }
            fragment = a;
        }
        if (this.f1314m > 0 || !fragment.f766w) {
            m1216i(fragment);
        } else {
            m1230a(fragment, 1, 0, 0, false);
        }
        if (fragment.f746R == null) {
            throw new IllegalStateException("Fragment " + string + " did not create a view.");
        }
        if (resourceId != 0) {
            fragment.f746R.setId(resourceId);
        }
        if (fragment.f746R.getTag() == null) {
            fragment.f746R.setTag(string2);
        }
        return fragment.f746R;
    }

    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    static {
        AccelerateInterpolator accelerateInterpolator = new AccelerateInterpolator(2.5f);
        accelerateInterpolator = new AccelerateInterpolator(1.5f);
    }
}
