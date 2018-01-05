package android.support.v7.view.menu;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.support.v4.p032d.p033a.C0283a;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import java.util.Iterator;

class ak extends C0468e implements Menu {
    ak(Context context, C0283a c0283a) {
        super(context, c0283a);
    }

    public MenuItem add(CharSequence charSequence) {
        return m2747a(((C0283a) this.d).add(charSequence));
    }

    public MenuItem add(int i) {
        return m2747a(((C0283a) this.d).add(i));
    }

    public MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return m2747a(((C0283a) this.d).add(i, i2, i3, charSequence));
    }

    public MenuItem add(int i, int i2, int i3, int i4) {
        return m2747a(((C0283a) this.d).add(i, i2, i3, i4));
    }

    public SubMenu addSubMenu(CharSequence charSequence) {
        return m2748a(((C0283a) this.d).addSubMenu(charSequence));
    }

    public SubMenu addSubMenu(int i) {
        return m2748a(((C0283a) this.d).addSubMenu(i));
    }

    public SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        return m2748a(((C0283a) this.d).addSubMenu(i, i2, i3, charSequence));
    }

    public SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return m2748a(((C0283a) this.d).addSubMenu(i, i2, i3, i4));
    }

    public int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        MenuItem[] menuItemArr2 = null;
        if (menuItemArr != null) {
            menuItemArr2 = new MenuItem[menuItemArr.length];
        }
        int addIntentOptions = ((C0283a) this.d).addIntentOptions(i, i2, i3, componentName, intentArr, intent, i4, menuItemArr2);
        if (menuItemArr2 != null) {
            int length = menuItemArr2.length;
            for (int i5 = 0; i5 < length; i5++) {
                menuItemArr[i5] = m2747a(menuItemArr2[i5]);
            }
        }
        return addIntentOptions;
    }

    public void removeItem(int i) {
        if (this.f2672b != null) {
            Iterator it = this.f2672b.keySet().iterator();
            while (it.hasNext()) {
                if (i == ((MenuItem) it.next()).getItemId()) {
                    it.remove();
                    break;
                }
            }
        }
        ((C0283a) this.d).removeItem(i);
    }

    public void removeGroup(int i) {
        if (this.f2672b != null) {
            Iterator it = this.f2672b.keySet().iterator();
            while (it.hasNext()) {
                if (i == ((MenuItem) it.next()).getGroupId()) {
                    it.remove();
                }
            }
        }
        ((C0283a) this.d).removeGroup(i);
    }

    public void clear() {
        if (this.f2672b != null) {
            this.f2672b.clear();
        }
        if (this.f2673c != null) {
            this.f2673c.clear();
        }
        ((C0283a) this.d).clear();
    }

    public void setGroupCheckable(int i, boolean z, boolean z2) {
        ((C0283a) this.d).setGroupCheckable(i, z, z2);
    }

    public void setGroupVisible(int i, boolean z) {
        ((C0283a) this.d).setGroupVisible(i, z);
    }

    public void setGroupEnabled(int i, boolean z) {
        ((C0283a) this.d).setGroupEnabled(i, z);
    }

    public boolean hasVisibleItems() {
        return ((C0283a) this.d).hasVisibleItems();
    }

    public MenuItem findItem(int i) {
        return m2747a(((C0283a) this.d).findItem(i));
    }

    public int size() {
        return ((C0283a) this.d).size();
    }

    public MenuItem getItem(int i) {
        return m2747a(((C0283a) this.d).getItem(i));
    }

    public void close() {
        ((C0283a) this.d).close();
    }

    public boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        return ((C0283a) this.d).performShortcut(i, keyEvent, i2);
    }

    public boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return ((C0283a) this.d).isShortcutKey(i, keyEvent);
    }

    public boolean performIdentifierAction(int i, int i2) {
        return ((C0283a) this.d).performIdentifierAction(i, i2);
    }

    public void setQwertyMode(boolean z) {
        ((C0283a) this.d).setQwertyMode(z);
    }
}
