package android.support.v4.app;

import android.animation.Animator;
import android.app.Activity;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.p004a.p007b.C0014b;
import android.p004a.p007b.C0016d;
import android.support.v4.p037h.C0304u;
import android.support.v4.p037h.C0311f;
import android.support.v4.view.C0358o;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnCreateContextMenuListener;
import android.view.ViewGroup;
import android.view.animation.Animation;
import java.io.FileDescriptor;
import java.io.PrintWriter;

public class Fragment implements ComponentCallbacks, OnCreateContextMenuListener {
    public static final C0304u f727j = new C0304u();
    public static final Object f728k = new Object();
    public int f729A;
    public ae f730B;
    public aa f731C;
    public ae f732D;
    public at f733E;
    public Fragment f734F;
    public int f735G;
    public int f736H;
    public String f737I;
    public boolean f738J;
    public boolean f739K;
    public boolean f740L;
    public boolean f741M;
    public boolean f742N;
    public boolean f743O = true;
    public boolean f744P;
    public ViewGroup f745Q;
    public View f746R;
    public View f747S;
    public boolean f748T;
    public boolean f749U = true;
    public by f750V;
    public boolean f751W;
    public boolean f752X;
    public C0253s f753Y;
    public boolean f754Z;
    public boolean aa;
    public float ab;
    public LayoutInflater ac;
    public boolean ad;
    public C0016d ae = new C0016d();
    public int f755l = 0;
    public Bundle f756m;
    public SparseArray f757n;
    public int f758o = -1;
    public String f759p;
    public Bundle f760q;
    public Fragment f761r;
    public int f762s = -1;
    public int f763t;
    public boolean f764u;
    public boolean f765v;
    public boolean f766w;
    public boolean f767x;
    public boolean f768y;
    public boolean f769z;

    public class InstantiationException extends RuntimeException {
        public InstantiationException(String str, Exception exception) {
            super(str, exception);
        }
    }

    public static Fragment m543a(Context context, String str, Bundle bundle) {
        try {
            Class cls = (Class) f727j.get(str);
            if (cls == null) {
                cls = context.getClassLoader().loadClass(str);
                f727j.put(str, cls);
            }
            Fragment fragment = (Fragment) cls.getConstructor(new Class[0]).newInstance(new Object[0]);
            if (bundle != null) {
                bundle.setClassLoader(fragment.getClass().getClassLoader());
                fragment.m600f(bundle);
            }
            return fragment;
        } catch (Exception e) {
            throw new InstantiationException("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e);
        } catch (Exception e2) {
            throw new InstantiationException("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e2);
        } catch (Exception e22) {
            throw new InstantiationException("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e22);
        } catch (Exception e222) {
            throw new InstantiationException("Unable to instantiate fragment " + str + ": could not find Fragment constructor", e222);
        } catch (Exception e2222) {
            throw new InstantiationException("Unable to instantiate fragment " + str + ": calling Fragment constructor caused an exception", e2222);
        }
    }

    static boolean m544a(Context context, String str) {
        try {
            Class cls = (Class) f727j.get(str);
            if (cls == null) {
                cls = context.getClassLoader().loadClass(str);
                f727j.put(str, cls);
            }
            return Fragment.class.isAssignableFrom(cls);
        } catch (ClassNotFoundException e) {
            return false;
        }
    }

    final void m576a(int i, Fragment fragment) {
        this.f758o = i;
        if (fragment != null) {
            this.f759p = fragment.f759p + ":" + this.f758o;
        } else {
            this.f759p = "android:fragment:" + this.f758o;
        }
    }

    final boolean cL_() {
        return this.f729A > 0;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder(128);
        C0311f.m1677a(this, stringBuilder);
        if (this.f758o >= 0) {
            stringBuilder.append(" #");
            stringBuilder.append(this.f758o);
        }
        if (this.f735G != 0) {
            stringBuilder.append(" id=0x");
            stringBuilder.append(Integer.toHexString(this.f735G));
        }
        if (this.f737I != null) {
            stringBuilder.append(" ");
            stringBuilder.append(this.f737I);
        }
        stringBuilder.append('}');
        return stringBuilder.toString();
    }

    public final void m600f(Bundle bundle) {
        if (this.f758o < 0 || !cM_()) {
            this.f760q = bundle;
            return;
        }
        throw new IllegalStateException("Fragment already active and state has been saved");
    }

    public final boolean cM_() {
        if (this.f730B == null) {
            return false;
        }
        return this.f730B.mo298i();
    }

    public final void m581a(Fragment fragment, int i) {
        ae aeVar = this.f730B;
        ae aeVar2;
        if (fragment != null) {
            aeVar2 = fragment.f730B;
        } else {
            aeVar2 = null;
        }
        if (aeVar == null || r0 == null || aeVar == r0) {
            for (Fragment fragment2 = fragment; fragment2 != null; fragment2 = fragment2.f761r) {
                if (fragment2 == this) {
                    throw new IllegalArgumentException("Setting " + fragment + " as the target of " + this + " would create a target cycle");
                }
            }
            this.f761r = fragment;
            this.f763t = i;
            return;
        }
        throw new IllegalArgumentException("Fragment " + fragment + " must share the same FragmentManager to be set as a target fragment");
    }

    public final Context m601g() {
        if (this.f731C == null) {
            return null;
        }
        return this.f731C.f1285c;
    }

    public final C0254u m603h() {
        if (this.f731C == null) {
            return null;
        }
        return (C0254u) this.f731C.f1284b;
    }

    public final Resources m605i() {
        if (this.f731C != null) {
            return this.f731C.f1285c.getResources();
        }
        throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }

    public final String m592c(int i) {
        return m605i().getString(i);
    }

    public final String m572a(int i, Object... objArr) {
        return m605i().getString(i, objArr);
    }

    public final ab m607j() {
        if (this.f732D == null) {
            mo968W();
            if (this.f755l >= 5) {
                this.f732D.m1275u();
            } else if (this.f755l >= 4) {
                this.f732D.m1274t();
            } else if (this.f755l >= 2) {
                this.f732D.m1273s();
            } else if (this.f755l > 0) {
                this.f732D.m1272r();
            }
        }
        return this.f732D;
    }

    public final boolean m610k() {
        return this.f731C != null && this.f764u;
    }

    public final boolean m612l() {
        return this.f755l >= 5;
    }

    public static void r_() {
    }

    public final void s_() {
        if (!this.f742N) {
            this.f742N = true;
            if (m610k() && !this.f738J) {
                this.f731C.mo357d();
            }
        }
    }

    public final void m593c(boolean z) {
        if (this.f743O != z) {
            this.f743O = z;
            if (this.f742N && m610k() && !this.f738J) {
                this.f731C.mo357d();
            }
        }
    }

    public final bw m613o() {
        if (this.f750V != null) {
            return this.f750V;
        }
        if (this.f731C == null) {
            throw new IllegalStateException("Fragment " + this + " not attached to Activity");
        }
        this.f752X = true;
        this.f750V = this.f731C.m1146a(this.f759p, this.f751W, true);
        return this.f750V;
    }

    public final void m580a(Intent intent) {
        if (this.f731C == null) {
            throw new IllegalStateException("Fragment " + this + " not attached to Activity");
        }
        this.f731C.mo352a(this, intent, -1);
    }

    public void startActivityForResult(Intent intent, int i) {
        if (this.f731C == null) {
            throw new IllegalStateException("Fragment " + this + " not attached to Activity");
        }
        this.f731C.mo352a(this, intent, i);
    }

    public void mo2342a(int i, int i2, Intent intent) {
    }

    public final void a_(String[] strArr) {
        if (this.f731C == null) {
            throw new IllegalStateException("Fragment " + this + " not attached to Activity");
        }
        this.f731C.mo353a(this, strArr);
    }

    public void m587a(int[] iArr) {
    }

    public LayoutInflater mo137c(Bundle bundle) {
        return m614p();
    }

    final LayoutInflater m602g(Bundle bundle) {
        this.ac = mo137c(bundle);
        return this.ac;
    }

    @Deprecated
    public final LayoutInflater m614p() {
        if (this.f731C == null) {
            throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
        }
        LayoutInflater c = this.f731C.mo356c();
        m607j();
        C0358o.m2046b(c, this.f732D);
        return c;
    }

    public final void m615q() {
        Activity activity;
        this.f744P = true;
        if (this.f731C == null) {
            activity = null;
        } else {
            activity = this.f731C.f1284b;
        }
        if (activity != null) {
            this.f744P = false;
            this.f744P = true;
        }
    }

    public static void m545r() {
    }

    public void mo135a(Context context) {
        Activity activity;
        this.f744P = true;
        if (this.f731C == null) {
            activity = null;
        } else {
            activity = this.f731C.f1284b;
        }
        if (activity != null) {
            this.f744P = false;
            mo1292a(activity);
        }
    }

    @Deprecated
    public void mo1292a(Activity activity) {
        this.f744P = true;
    }

    public static Animation m546s() {
        return null;
    }

    public static Animator m547t() {
        return null;
    }

    public void mo136b(Bundle bundle) {
        boolean z = true;
        this.f744P = true;
        m604h(bundle);
        if (this.f732D != null) {
            if (this.f732D.f1314m <= 0) {
                z = false;
            }
            if (!z) {
                this.f732D.m1272r();
            }
        }
    }

    final void m604h(Bundle bundle) {
        if (bundle != null) {
            Parcelable parcelable = bundle.getParcelable("android:support:fragments");
            if (parcelable != null) {
                if (this.f732D == null) {
                    mo968W();
                }
                this.f732D.m1228a(parcelable, this.f733E);
                this.f733E = null;
                this.f732D.m1272r();
            }
        }
    }

    public View mo970a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return null;
    }

    public void mo1410a(View view, Bundle bundle) {
    }

    public void mo139d(Bundle bundle) {
        this.f744P = true;
    }

    public void m606i(Bundle bundle) {
        this.f744P = true;
    }

    public void g_() {
        this.f744P = true;
        if (!this.f751W) {
            this.f751W = true;
            if (!this.f752X) {
                this.f752X = true;
                this.f750V = this.f731C.m1146a(this.f759p, this.f751W, false);
            } else if (this.f750V != null) {
                this.f750V.m1388b();
            }
        }
    }

    public void mo979u() {
        this.f744P = true;
    }

    public void mo140e(Bundle bundle) {
    }

    public void onConfigurationChanged(Configuration configuration) {
        this.f744P = true;
    }

    public void mo980v() {
        this.f744P = true;
    }

    public void h_() {
        this.f744P = true;
    }

    public void onLowMemory() {
        this.f744P = true;
    }

    public void mo138d() {
        this.f744P = true;
    }

    public void mo1346w() {
        this.f744P = true;
        if (!this.f752X) {
            this.f752X = true;
            this.f750V = this.f731C.m1146a(this.f759p, this.f751W, false);
        }
        if (this.f750V != null) {
            this.f750V.m1393g();
        }
    }

    public void mo134a() {
        this.f744P = true;
    }

    public void mo2865a(Menu menu, MenuInflater menuInflater) {
    }

    public static void m548x() {
    }

    public boolean mo2866a(MenuItem menuItem) {
        return false;
    }

    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenuInfo contextMenuInfo) {
        m603h().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    public final void m582a(cq cqVar) {
        m560L().f1604o = cqVar;
    }

    public final Object m619y() {
        if (this.f753Y == null) {
            return null;
        }
        return this.f753Y.f1596g;
    }

    public final Object m620z() {
        if (this.f753Y == null) {
            return null;
        }
        if (this.f753Y.f1597h == f728k) {
            return m619y();
        }
        return this.f753Y.f1597h;
    }

    public final Object m549A() {
        if (this.f753Y == null) {
            return null;
        }
        return this.f753Y.f1598i;
    }

    public final Object m550B() {
        if (this.f753Y == null) {
            return null;
        }
        if (this.f753Y.f1599j == f728k) {
            return m549A();
        }
        return this.f753Y.f1599j;
    }

    public final void a_(Object obj) {
        m560L().f1600k = obj;
    }

    public final Object m551C() {
        if (this.f753Y == null) {
            return null;
        }
        return this.f753Y.f1600k;
    }

    public final Object m552D() {
        if (this.f753Y == null) {
            return null;
        }
        if (this.f753Y.f1601l == f728k) {
            return m551C();
        }
        return this.f753Y.f1601l;
    }

    final void m553E() {
        C0236t c0236t = null;
        if (this.f753Y != null) {
            this.f753Y.f1606q = false;
            C0236t c0236t2 = this.f753Y.f1607r;
            this.f753Y.f1607r = null;
            c0236t = c0236t2;
        }
        if (c0236t != null) {
            c0236t.mo301a();
        }
    }

    public void mo4590a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mFragmentId=#");
        printWriter.print(Integer.toHexString(this.f735G));
        printWriter.print(" mContainerId=#");
        printWriter.print(Integer.toHexString(this.f736H));
        printWriter.print(" mTag=");
        printWriter.println(this.f737I);
        printWriter.print(str);
        printWriter.print("mState=");
        printWriter.print(this.f755l);
        printWriter.print(" mIndex=");
        printWriter.print(this.f758o);
        printWriter.print(" mWho=");
        printWriter.print(this.f759p);
        printWriter.print(" mBackStackNesting=");
        printWriter.println(this.f729A);
        printWriter.print(str);
        printWriter.print("mAdded=");
        printWriter.print(this.f764u);
        printWriter.print(" mRemoving=");
        printWriter.print(this.f765v);
        printWriter.print(" mFromLayout=");
        printWriter.print(this.f766w);
        printWriter.print(" mInLayout=");
        printWriter.println(this.f767x);
        printWriter.print(str);
        printWriter.print("mHidden=");
        printWriter.print(this.f738J);
        printWriter.print(" mDetached=");
        printWriter.print(this.f739K);
        printWriter.print(" mMenuVisible=");
        printWriter.print(this.f743O);
        printWriter.print(" mHasMenu=");
        printWriter.println(this.f742N);
        printWriter.print(str);
        printWriter.print("mRetainInstance=");
        printWriter.print(this.f740L);
        printWriter.print(" mRetaining=");
        printWriter.print(this.f741M);
        printWriter.print(" mUserVisibleHint=");
        printWriter.println(this.f749U);
        if (this.f730B != null) {
            printWriter.print(str);
            printWriter.print("mFragmentManager=");
            printWriter.println(this.f730B);
        }
        if (this.f731C != null) {
            printWriter.print(str);
            printWriter.print("mHost=");
            printWriter.println(this.f731C);
        }
        if (this.f734F != null) {
            printWriter.print(str);
            printWriter.print("mParentFragment=");
            printWriter.println(this.f734F);
        }
        if (this.f760q != null) {
            printWriter.print(str);
            printWriter.print("mArguments=");
            printWriter.println(this.f760q);
        }
        if (this.f756m != null) {
            printWriter.print(str);
            printWriter.print("mSavedFragmentState=");
            printWriter.println(this.f756m);
        }
        if (this.f757n != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewState=");
            printWriter.println(this.f757n);
        }
        if (this.f761r != null) {
            printWriter.print(str);
            printWriter.print("mTarget=");
            printWriter.print(this.f761r);
            printWriter.print(" mTargetRequestCode=");
            printWriter.println(this.f763t);
        }
        if (m561M() != 0) {
            printWriter.print(str);
            printWriter.print("mNextAnim=");
            printWriter.println(m561M());
        }
        if (this.f745Q != null) {
            printWriter.print(str);
            printWriter.print("mContainer=");
            printWriter.println(this.f745Q);
        }
        if (this.f746R != null) {
            printWriter.print(str);
            printWriter.print("mView=");
            printWriter.println(this.f746R);
        }
        if (this.f747S != null) {
            printWriter.print(str);
            printWriter.print("mInnerView=");
            printWriter.println(this.f746R);
        }
        if (m566R() != null) {
            printWriter.print(str);
            printWriter.print("mAnimatingAway=");
            printWriter.println(m566R());
            printWriter.print(str);
            printWriter.print("mStateAfterAnimating=");
            printWriter.println(m568T());
        }
        if (this.f750V != null) {
            printWriter.print(str);
            printWriter.println("Loader Manager:");
            this.f750V.m1385a(str + "  ", fileDescriptor, printWriter, strArr);
        }
        if (this.f732D != null) {
            printWriter.print(str);
            printWriter.println("Child " + this.f732D + ":");
            this.f732D.mo288a(str + "  ", fileDescriptor, printWriter, strArr);
        }
    }

    private final void mo968W() {
        if (this.f731C == null) {
            throw new IllegalStateException("Fragment has not been attached yet.");
        }
        this.f732D = new ae();
        this.f732D.m1232a(this.f731C, new C0252r(this), this);
    }

    final void m608j(Bundle bundle) {
        if (this.f732D != null) {
            this.f732D.m1271q();
        }
        this.f755l = 1;
        this.f744P = false;
        mo136b(bundle);
        this.ad = true;
        if (this.f744P) {
            this.ae.m19a(C0014b.ON_CREATE);
            return;
        }
        throw new SuperNotCalledException("Fragment " + this + " did not call through to super.onCreate()");
    }

    final View m589b(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        if (this.f732D != null) {
            this.f732D.m1271q();
        }
        this.f769z = true;
        return mo970a(layoutInflater, viewGroup, bundle);
    }

    final void m609k(Bundle bundle) {
        if (this.f732D != null) {
            this.f732D.m1271q();
        }
        this.f755l = 2;
        this.f744P = false;
        mo139d(bundle);
        if (!this.f744P) {
            throw new SuperNotCalledException("Fragment " + this + " did not call through to super.onActivityCreated()");
        } else if (this.f732D != null) {
            this.f732D.m1273s();
        }
    }

    final void m554F() {
        if (this.f732D != null) {
            this.f732D.m1271q();
            this.f732D.m1267m();
        }
        this.f755l = 4;
        this.f744P = false;
        g_();
        if (this.f744P) {
            if (this.f732D != null) {
                this.f732D.m1274t();
            }
            if (this.f750V != null) {
                this.f750V.m1392f();
            }
            this.ae.m19a(C0014b.ON_START);
            return;
        }
        throw new SuperNotCalledException("Fragment " + this + " did not call through to super.onStart()");
    }

    final void m555G() {
        if (this.f732D != null) {
            this.f732D.m1271q();
            this.f732D.m1267m();
        }
        this.f755l = 5;
        this.f744P = false;
        mo979u();
        if (this.f744P) {
            if (this.f732D != null) {
                this.f732D.m1275u();
                this.f732D.m1267m();
            }
            this.ae.m19a(C0014b.ON_RESUME);
            return;
        }
        throw new SuperNotCalledException("Fragment " + this + " did not call through to super.onResume()");
    }

    final void m611l(Bundle bundle) {
        mo140e(bundle);
        if (this.f732D != null) {
            Parcelable o = this.f732D.m1269o();
            if (o != null) {
                bundle.putParcelable("android:support:fragments", o);
            }
        }
    }

    final void m556H() {
        this.ae.m19a(C0014b.ON_PAUSE);
        if (this.f732D != null) {
            this.f732D.m1252c(4);
        }
        this.f755l = 4;
        this.f744P = false;
        mo980v();
        if (!this.f744P) {
            throw new SuperNotCalledException("Fragment " + this + " did not call through to super.onPause()");
        }
    }

    final void m557I() {
        this.ae.m19a(C0014b.ON_STOP);
        if (this.f732D != null) {
            this.f732D.m1276v();
        }
        this.f755l = 3;
        this.f744P = false;
        h_();
        if (!this.f744P) {
            throw new SuperNotCalledException("Fragment " + this + " did not call through to super.onStop()");
        }
    }

    final void m558J() {
        if (this.f732D != null) {
            this.f732D.m1252c(2);
        }
        this.f755l = 2;
        if (this.f751W) {
            this.f751W = false;
            if (!this.f752X) {
                this.f752X = true;
                this.f750V = this.f731C.m1146a(this.f759p, this.f751W, false);
            }
            if (this.f750V == null) {
                return;
            }
            if (this.f731C.f1290h) {
                this.f750V.m1390d();
            } else {
                this.f750V.m1389c();
            }
        }
    }

    final void m559K() {
        this.ae.m19a(C0014b.ON_DESTROY);
        if (this.f732D != null) {
            this.f732D.m1277w();
        }
        this.f755l = 0;
        this.f744P = false;
        this.ad = false;
        mo1346w();
        if (this.f744P) {
            this.f732D = null;
            return;
        }
        throw new SuperNotCalledException("Fragment " + this + " did not call through to super.onDestroy()");
    }

    final void m583a(C0236t c0236t) {
        m560L();
        if (c0236t != this.f753Y.f1607r) {
            if (c0236t == null || this.f753Y.f1607r == null) {
                if (this.f753Y.f1606q) {
                    this.f753Y.f1607r = c0236t;
                }
                if (c0236t != null) {
                    c0236t.mo302b();
                    return;
                }
                return;
            }
            throw new IllegalStateException("Trying to set a replacement startPostponedEnterTransition on " + this);
        }
    }

    public final C0253s m560L() {
        if (this.f753Y == null) {
            this.f753Y = new C0253s();
        }
        return this.f753Y;
    }

    final int m561M() {
        if (this.f753Y == null) {
            return 0;
        }
        return this.f753Y.f1593d;
    }

    final void m595d(int i) {
        if (this.f753Y != null || i != 0) {
            m560L().f1593d = i;
        }
    }

    final int m562N() {
        if (this.f753Y == null) {
            return 0;
        }
        return this.f753Y.f1594e;
    }

    final void m574a(int i, int i2) {
        if (this.f753Y != null || i != 0 || i2 != 0) {
            m560L();
            this.f753Y.f1594e = i;
            this.f753Y.f1595f = i2;
        }
    }

    final int m563O() {
        if (this.f753Y == null) {
            return 0;
        }
        return this.f753Y.f1595f;
    }

    final cq m564P() {
        if (this.f753Y == null) {
            return null;
        }
        return this.f753Y.f1604o;
    }

    final cq m565Q() {
        if (this.f753Y == null) {
            return null;
        }
        return this.f753Y.f1605p;
    }

    final View m566R() {
        if (this.f753Y == null) {
            return null;
        }
        return this.f753Y.f1590a;
    }

    final void d_(View view) {
        m560L().f1590a = view;
    }

    final void m577a(Animator animator) {
        m560L().f1591b = animator;
    }

    final Animator m567S() {
        if (this.f753Y == null) {
            return null;
        }
        return this.f753Y.f1591b;
    }

    final int m568T() {
        if (this.f753Y == null) {
            return 0;
        }
        return this.f753Y.f1592c;
    }

    final void m598e(int i) {
        m560L().f1592c = i;
    }

    final boolean m569U() {
        if (this.f753Y == null) {
            return false;
        }
        return this.f753Y.f1606q;
    }

    final boolean m570V() {
        if (this.f753Y == null) {
            return false;
        }
        return this.f753Y.f1608s;
    }

    final void m597d(boolean z) {
        m560L().f1608s = z;
    }
}
