package android.support.v7.view.menu;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v4.p028a.C0216d;
import android.support.v4.p032d.p033a.C0283a;
import android.support.v4.view.C0350g;
import android.support.v7.p040a.C0395b;
import android.util.SparseArray;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.KeyCharacterMap.KeyData;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class C0471p implements C0283a {
    public static final int[] f2714a = new int[]{1, 4, 5, 3, 2, 0};
    public final Context f2715b;
    public final Resources f2716c;
    public boolean f2717d;
    public boolean f2718e;
    public C0408q f2719f;
    public ArrayList f2720g;
    public ArrayList f2721h;
    public boolean f2722i;
    public ArrayList f2723j;
    public ArrayList f2724k;
    public boolean f2725l;
    public int f2726m = 1;
    public ContextMenuInfo f2727n;
    public CharSequence f2728o;
    public Drawable f2729p;
    public View f2730q;
    public boolean f2731r = false;
    public boolean f2732s = false;
    public boolean f2733t = false;
    public boolean f2734u = false;
    public boolean f2735v = false;
    public ArrayList f2736w = new ArrayList();
    public CopyOnWriteArrayList f2737x = new CopyOnWriteArrayList();
    public C0485t f2738y;
    public boolean f2739z;

    public C0471p(Context context) {
        boolean z = true;
        this.f2715b = context;
        this.f2716c = context.getResources();
        this.f2720g = new ArrayList();
        this.f2721h = new ArrayList();
        this.f2722i = true;
        this.f2723j = new ArrayList();
        this.f2724k = new ArrayList();
        this.f2725l = true;
        if (this.f2716c.getConfiguration().keyboard == 1 || !this.f2716c.getBoolean(C0395b.abc_config_showMenuShortcutsWhenKeyboardPresent)) {
            z = false;
        }
        this.f2718e = z;
    }

    public final void m2821a(af afVar) {
        m2822a(afVar, this.f2715b);
    }

    public final void m2822a(af afVar, Context context) {
        this.f2737x.add(new WeakReference(afVar));
        afVar.mo659a(context, this);
        this.f2725l = true;
    }

    public final void m2829b(af afVar) {
        Iterator it = this.f2737x.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            af afVar2 = (af) weakReference.get();
            if (afVar2 == null || afVar2 == afVar) {
                this.f2737x.remove(weakReference);
            }
        }
    }

    public final void m2820a(Bundle bundle) {
        int size = size();
        int i = 0;
        SparseArray sparseArray = null;
        while (i < size) {
            MenuItem item = getItem(i);
            View actionView = item.getActionView();
            if (!(actionView == null || actionView.getId() == -1)) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt("android:menu:expandedactionview", item.getItemId());
                }
            }
            SparseArray sparseArray2 = sparseArray;
            if (item.hasSubMenu()) {
                ((ap) item.getSubMenu()).m2820a(bundle);
            }
            i++;
            sparseArray = sparseArray2;
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(mo679a(), sparseArray);
        }
    }

    public final void m2828b(Bundle bundle) {
        if (bundle != null) {
            MenuItem item;
            SparseArray sparseParcelableArray = bundle.getSparseParcelableArray(mo679a());
            int size = size();
            for (int i = 0; i < size; i++) {
                item = getItem(i);
                View actionView = item.getActionView();
                if (!(actionView == null || actionView.getId() == -1)) {
                    actionView.restoreHierarchyState(sparseParcelableArray);
                }
                if (item.hasSubMenu()) {
                    ((ap) item.getSubMenu()).m2828b(bundle);
                }
            }
            int i2 = bundle.getInt("android:menu:expandedactionview");
            if (i2 > 0) {
                item = findItem(i2);
                if (item != null) {
                    item.expandActionView();
                }
            }
        }
    }

    protected String mo679a() {
        return "android:menu:actionviewstates";
    }

    public void mo680a(C0408q c0408q) {
        this.f2719f = c0408q;
    }

    private final MenuItem m2815a(int i, int i2, int i3, CharSequence charSequence) {
        int i4 = (-65536 & i3) >> 16;
        if (i4 < 0 || i4 >= f2714a.length) {
            throw new IllegalArgumentException("order does not contain a valid category.");
        }
        int i5 = (f2714a[i4] << 16) | (65535 & i3);
        MenuItem c0485t = new C0485t(this, i, i2, i3, i5, charSequence, this.f2726m);
        if (this.f2727n != null) {
            c0485t.f2825E = this.f2727n;
        }
        this.f2720g.add(C0471p.m2813a(this.f2720g, i5), c0485t);
        m2830b(true);
        return c0485t;
    }

    public MenuItem add(CharSequence charSequence) {
        return m2815a(0, 0, 0, charSequence);
    }

    public MenuItem add(int i) {
        return m2815a(0, 0, 0, this.f2716c.getString(i));
    }

    public MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return m2815a(i, i2, i3, charSequence);
    }

    public MenuItem add(int i, int i2, int i3, int i4) {
        return m2815a(i, i2, i3, this.f2716c.getString(i4));
    }

    public SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    public SubMenu addSubMenu(int i) {
        return addSubMenu(0, 0, 0, this.f2716c.getString(i));
    }

    public SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        C0485t c0485t = (C0485t) m2815a(i, i2, i3, charSequence);
        ap apVar = new ap(this.f2715b, this, c0485t);
        c0485t.m2913a(apVar);
        return apVar;
    }

    public SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return addSubMenu(i, i2, i3, this.f2716c.getString(i4));
    }

    public int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        PackageManager packageManager = this.f2715b.getPackageManager();
        List queryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = queryIntentActivityOptions != null ? queryIntentActivityOptions.size() : 0;
        if ((i4 & 1) == 0) {
            removeGroup(i);
        }
        for (int i5 = 0; i5 < size; i5++) {
            ResolveInfo resolveInfo = (ResolveInfo) queryIntentActivityOptions.get(i5);
            Intent intent2 = new Intent(resolveInfo.specificIndex < 0 ? intent : intentArr[resolveInfo.specificIndex]);
            intent2.setComponent(new ComponentName(resolveInfo.activityInfo.applicationInfo.packageName, resolveInfo.activityInfo.name));
            MenuItem intent3 = add(i, i2, i3, resolveInfo.loadLabel(packageManager)).setIcon(resolveInfo.loadIcon(packageManager)).setIntent(intent2);
            if (menuItemArr != null && resolveInfo.specificIndex >= 0) {
                menuItemArr[resolveInfo.specificIndex] = intent3;
            }
        }
        return size;
    }

    public void removeItem(int i) {
        int i2;
        int size = size();
        for (int i3 = 0; i3 < size; i3++) {
            if (((C0485t) this.f2720g.get(i3)).getItemId() == i) {
                i2 = i3;
                break;
            }
        }
        i2 = -1;
        m2816a(i2, true);
    }

    public void removeGroup(int i) {
        int i2;
        int size = size();
        for (i2 = 0; i2 < size; i2++) {
            if (((C0485t) this.f2720g.get(i2)).getGroupId() == i) {
                size = i2;
                break;
            }
        }
        size = -1;
        if (size >= 0) {
            int size2 = this.f2720g.size() - size;
            int i3 = 0;
            while (true) {
                i2 = i3 + 1;
                if (i3 >= size2 || ((C0485t) this.f2720g.get(size)).getGroupId() != i) {
                    m2830b(true);
                } else {
                    m2816a(size, false);
                    i3 = i2;
                }
            }
            m2830b(true);
        }
    }

    private final void m2816a(int i, boolean z) {
        if (i >= 0 && i < this.f2720g.size()) {
            this.f2720g.remove(i);
            if (z) {
                m2830b(true);
            }
        }
    }

    public void clear() {
        if (this.f2738y != null) {
            mo684b(this.f2738y);
        }
        this.f2720g.clear();
        m2830b(true);
    }

    public void setGroupCheckable(int i, boolean z, boolean z2) {
        int size = this.f2720g.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0485t c0485t = (C0485t) this.f2720g.get(i2);
            if (c0485t.getGroupId() == i) {
                c0485t.m2914a(z2);
                c0485t.setCheckable(z);
            }
        }
    }

    public void setGroupVisible(int i, boolean z) {
        int size = this.f2720g.size();
        int i2 = 0;
        boolean z2 = false;
        while (i2 < size) {
            boolean z3;
            C0485t c0485t = (C0485t) this.f2720g.get(i2);
            if (c0485t.getGroupId() == i && c0485t.m2917b(z)) {
                z3 = true;
            } else {
                z3 = z2;
            }
            i2++;
            z2 = z3;
        }
        if (z2) {
            m2830b(true);
        }
    }

    public void setGroupEnabled(int i, boolean z) {
        int size = this.f2720g.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0485t c0485t = (C0485t) this.f2720g.get(i2);
            if (c0485t.getGroupId() == i) {
                c0485t.setEnabled(z);
            }
        }
    }

    public boolean hasVisibleItems() {
        if (this.f2739z) {
            return true;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            if (((C0485t) this.f2720g.get(i)).isVisible()) {
                return true;
            }
        }
        return false;
    }

    public MenuItem findItem(int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            C0485t c0485t = (C0485t) this.f2720g.get(i2);
            if (c0485t.getItemId() == i) {
                return c0485t;
            }
            if (c0485t.hasSubMenu()) {
                MenuItem findItem = c0485t.getSubMenu().findItem(i);
                if (findItem != null) {
                    return findItem;
                }
            }
        }
        return null;
    }

    public int size() {
        return this.f2720g.size();
    }

    public MenuItem getItem(int i) {
        return (MenuItem) this.f2720g.get(i);
    }

    public boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return m2814a(i, keyEvent) != null;
    }

    public void setQwertyMode(boolean z) {
        this.f2717d = z;
        m2830b(false);
    }

    boolean mo683b() {
        return this.f2717d;
    }

    public boolean mo685c() {
        return this.f2718e;
    }

    boolean mo681a(C0471p c0471p, MenuItem menuItem) {
        return this.f2719f != null && this.f2719f.mo529a(c0471p, menuItem);
    }

    private static int m2813a(ArrayList arrayList, int i) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (((C0485t) arrayList.get(size)).f2829d <= i) {
                return size + 1;
            }
        }
        return 0;
    }

    public boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        MenuItem a = m2814a(i, keyEvent);
        boolean z = false;
        if (a != null) {
            z = m2827a(a, null, i2);
        }
        if ((i2 & 2) != 0) {
            m2824a(true);
        }
        return z;
    }

    private final void m2817a(List list, int i, KeyEvent keyEvent) {
        boolean b = mo683b();
        int modifiers = keyEvent.getModifiers();
        KeyData keyData = new KeyData();
        if (keyEvent.getKeyData(keyData) || i == 67) {
            int size = this.f2720g.size();
            for (int i2 = 0; i2 < size; i2++) {
                C0485t c0485t = (C0485t) this.f2720g.get(i2);
                if (c0485t.hasSubMenu()) {
                    ((C0471p) c0485t.getSubMenu()).m2817a(list, i, keyEvent);
                }
                char alphabeticShortcut = b ? c0485t.getAlphabeticShortcut() : c0485t.getNumericShortcut();
                if ((modifiers & 69647) == ((b ? c0485t.getAlphabeticModifiers() : c0485t.getNumericModifiers()) & 69647) && alphabeticShortcut != '\u0000' && ((alphabeticShortcut == keyData.meta[0] || alphabeticShortcut == keyData.meta[2] || (b && alphabeticShortcut == '\b' && i == 67)) && c0485t.isEnabled())) {
                    list.add(c0485t);
                }
            }
        }
    }

    private final C0485t m2814a(int i, KeyEvent keyEvent) {
        List list = this.f2736w;
        list.clear();
        m2817a(list, i, keyEvent);
        if (list.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyData keyData = new KeyData();
        keyEvent.getKeyData(keyData);
        int size = list.size();
        if (size == 1) {
            return (C0485t) list.get(0);
        }
        boolean b = mo683b();
        for (int i2 = 0; i2 < size; i2++) {
            char alphabeticShortcut;
            C0485t c0485t = (C0485t) list.get(i2);
            if (b) {
                alphabeticShortcut = c0485t.getAlphabeticShortcut();
            } else {
                alphabeticShortcut = c0485t.getNumericShortcut();
            }
            if (alphabeticShortcut == keyData.meta[0] && (metaState & 2) == 0) {
                return c0485t;
            }
            if (alphabeticShortcut == keyData.meta[2] && (metaState & 2) != 0) {
                return c0485t;
            }
            if (b && alphabeticShortcut == '\b' && i == 67) {
                return c0485t;
            }
        }
        return null;
    }

    public boolean performIdentifierAction(int i, int i2) {
        return m2827a(findItem(i), null, i2);
    }

    public final boolean m2827a(MenuItem menuItem, af afVar, int i) {
        boolean z = false;
        C0485t c0485t = (C0485t) menuItem;
        if (c0485t == null || !c0485t.isEnabled()) {
            return false;
        }
        boolean z2;
        boolean b = c0485t.m2916b();
        C0350g c0350g = c0485t.f2822B;
        if (c0350g == null || !c0350g.mo654e()) {
            z2 = false;
        } else {
            z2 = true;
        }
        boolean expandActionView;
        if (c0485t.m2926i()) {
            expandActionView = c0485t.expandActionView() | b;
            if (!expandActionView) {
                return expandActionView;
            }
            m2824a(true);
            return expandActionView;
        } else if (c0485t.hasSubMenu() || z2) {
            if ((i & 4) == 0) {
                m2824a(false);
            }
            if (!c0485t.hasSubMenu()) {
                c0485t.m2913a(new ap(this.f2715b, this, c0485t));
            }
            ap apVar = (ap) c0485t.getSubMenu();
            if (z2) {
                c0350g.mo652a((SubMenu) apVar);
            }
            if (!this.f2737x.isEmpty()) {
                if (afVar != null) {
                    z = afVar.mo670a(apVar);
                }
                Iterator it = this.f2737x.iterator();
                boolean z3 = z;
                while (it.hasNext()) {
                    WeakReference weakReference = (WeakReference) it.next();
                    af afVar2 = (af) weakReference.get();
                    if (afVar2 == null) {
                        this.f2737x.remove(weakReference);
                    } else {
                        if (z3) {
                            z = z3;
                        } else {
                            z = afVar2.mo670a(apVar);
                        }
                        z3 = z;
                    }
                }
                z = z3;
            }
            expandActionView = b | r2;
            if (expandActionView) {
                return expandActionView;
            }
            m2824a(true);
            return expandActionView;
        } else {
            if ((i & 1) == 0) {
                m2824a(true);
            }
            return b;
        }
    }

    public final void m2824a(boolean z) {
        if (!this.f2735v) {
            this.f2735v = true;
            Iterator it = this.f2737x.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                af afVar = (af) weakReference.get();
                if (afVar == null) {
                    this.f2737x.remove(weakReference);
                } else {
                    afVar.mo665a(this, z);
                }
            }
            this.f2735v = false;
        }
    }

    public void close() {
        m2824a(true);
    }

    public final void m2830b(boolean z) {
        if (this.f2731r) {
            this.f2732s = true;
            if (z) {
                this.f2733t = true;
                return;
            }
            return;
        }
        if (z) {
            this.f2722i = true;
            this.f2725l = true;
        }
        if (!this.f2737x.isEmpty()) {
            m2834d();
            Iterator it = this.f2737x.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                af afVar = (af) weakReference.get();
                if (afVar == null) {
                    this.f2737x.remove(weakReference);
                } else {
                    afVar.mo668a(z);
                }
            }
            m2835e();
        }
    }

    public final void m2834d() {
        if (!this.f2731r) {
            this.f2731r = true;
            this.f2732s = false;
            this.f2733t = false;
        }
    }

    public final void m2835e() {
        this.f2731r = false;
        if (this.f2732s) {
            this.f2732s = false;
            m2830b(this.f2733t);
        }
    }

    final void m2836f() {
        this.f2722i = true;
        m2830b(true);
    }

    final void m2837g() {
        this.f2725l = true;
        m2830b(true);
    }

    public final ArrayList m2838h() {
        if (!this.f2722i) {
            return this.f2721h;
        }
        this.f2721h.clear();
        int size = this.f2720g.size();
        for (int i = 0; i < size; i++) {
            C0485t c0485t = (C0485t) this.f2720g.get(i);
            if (c0485t.isVisible()) {
                this.f2721h.add(c0485t);
            }
        }
        this.f2722i = false;
        this.f2725l = true;
        return this.f2721h;
    }

    public final void m2839i() {
        ArrayList h = m2838h();
        if (this.f2725l) {
            Iterator it = this.f2737x.iterator();
            int i = 0;
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                af afVar = (af) weakReference.get();
                if (afVar == null) {
                    this.f2737x.remove(weakReference);
                } else {
                    i = afVar.mo669a() | i;
                }
            }
            if (i != 0) {
                this.f2723j.clear();
                this.f2724k.clear();
                i = h.size();
                for (int i2 = 0; i2 < i; i2++) {
                    C0485t c0485t = (C0485t) h.get(i2);
                    if (c0485t.m2923f()) {
                        this.f2723j.add(c0485t);
                    } else {
                        this.f2724k.add(c0485t);
                    }
                }
            } else {
                this.f2723j.clear();
                this.f2724k.clear();
                this.f2724k.addAll(m2838h());
            }
            this.f2725l = false;
        }
    }

    public final ArrayList m2840j() {
        m2839i();
        return this.f2724k;
    }

    public void clearHeader() {
        this.f2729p = null;
        this.f2728o = null;
        this.f2730q = null;
        m2830b(false);
    }

    final void m2819a(int i, CharSequence charSequence, int i2, Drawable drawable, View view) {
        Resources resources = this.f2716c;
        if (view != null) {
            this.f2730q = view;
            this.f2728o = null;
            this.f2729p = null;
        } else {
            if (i > 0) {
                this.f2728o = resources.getText(i);
            } else if (charSequence != null) {
                this.f2728o = charSequence;
            }
            if (i2 > 0) {
                this.f2729p = C0216d.m1112a(this.f2715b, i2);
            } else if (drawable != null) {
                this.f2729p = drawable;
            }
            this.f2730q = null;
        }
        m2830b(false);
    }

    public C0471p mo686k() {
        return this;
    }

    public boolean mo682a(C0485t c0485t) {
        boolean z = false;
        if (!this.f2737x.isEmpty()) {
            m2834d();
            Iterator it = this.f2737x.iterator();
            boolean z2 = false;
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                af afVar = (af) weakReference.get();
                if (afVar == null) {
                    this.f2737x.remove(weakReference);
                } else {
                    z = afVar.mo660b(c0485t);
                    if (z) {
                        break;
                    }
                    z2 = z;
                }
            }
            z = z2;
            m2835e();
            if (z) {
                this.f2738y = c0485t;
            }
        }
        return z;
    }

    public boolean mo684b(C0485t c0485t) {
        boolean z = false;
        if (!this.f2737x.isEmpty() && this.f2738y == c0485t) {
            m2834d();
            Iterator it = this.f2737x.iterator();
            boolean z2 = false;
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                af afVar = (af) weakReference.get();
                if (afVar == null) {
                    this.f2737x.remove(weakReference);
                } else {
                    z = afVar.mo661c(c0485t);
                    if (z) {
                        break;
                    }
                    z2 = z;
                }
            }
            z = z2;
            m2835e();
            if (z) {
                this.f2738y = null;
            }
        }
        return z;
    }
}
