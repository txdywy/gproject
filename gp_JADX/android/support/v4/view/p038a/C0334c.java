package android.support.v4.view.p038a;

import android.os.Build.VERSION;
import android.support.v7.widget.eq;
import android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction;
import com.squareup.haha.perflib.io.MemoryMappedFileBuffer;

public final class C0334c {
    public static final C0334c f1831a = new C0334c(1, null);
    public static final C0334c f1832b = new C0334c(2, null);
    public final Object f1833c;

    public C0334c(int i, CharSequence charSequence) {
        this(VERSION.SDK_INT >= 21 ? new AccessibilityAction(i, charSequence) : null);
    }

    private C0334c(Object obj) {
        this.f1833c = obj;
    }

    static {
        Object obj;
        Object obj2 = null;
        C0334c c0334c = new C0334c(4, null);
        c0334c = new C0334c(8, null);
        c0334c = new C0334c(16, null);
        c0334c = new C0334c(32, null);
        c0334c = new C0334c(64, null);
        c0334c = new C0334c(128, null);
        c0334c = new C0334c(256, null);
        c0334c = new C0334c(512, null);
        c0334c = new C0334c(MemoryMappedFileBuffer.DEFAULT_PADDING, null);
        c0334c = new C0334c(eq.FLAG_MOVED, null);
        c0334c = new C0334c(eq.FLAG_APPEARED_IN_PRE_LAYOUT, null);
        c0334c = new C0334c(8192, null);
        c0334c = new C0334c(16384, null);
        c0334c = new C0334c(32768, null);
        c0334c = new C0334c(65536, null);
        c0334c = new C0334c(131072, null);
        c0334c = new C0334c(262144, null);
        c0334c = new C0334c(524288, null);
        c0334c = new C0334c(1048576, null);
        c0334c = new C0334c(2097152, null);
        C0334c c0334c2 = new C0334c(VERSION.SDK_INT >= 23 ? AccessibilityAction.ACTION_SHOW_ON_SCREEN : null);
        if (VERSION.SDK_INT >= 23) {
            obj = AccessibilityAction.ACTION_SCROLL_TO_POSITION;
        } else {
            obj = null;
        }
        c0334c2 = new C0334c(obj);
        if (VERSION.SDK_INT >= 23) {
            obj = AccessibilityAction.ACTION_SCROLL_UP;
        } else {
            obj = null;
        }
        c0334c2 = new C0334c(obj);
        if (VERSION.SDK_INT >= 23) {
            obj = AccessibilityAction.ACTION_SCROLL_LEFT;
        } else {
            obj = null;
        }
        c0334c2 = new C0334c(obj);
        if (VERSION.SDK_INT >= 23) {
            obj = AccessibilityAction.ACTION_SCROLL_DOWN;
        } else {
            obj = null;
        }
        c0334c2 = new C0334c(obj);
        if (VERSION.SDK_INT >= 23) {
            obj = AccessibilityAction.ACTION_SCROLL_RIGHT;
        } else {
            obj = null;
        }
        c0334c2 = new C0334c(obj);
        if (VERSION.SDK_INT >= 23) {
            obj = AccessibilityAction.ACTION_CONTEXT_CLICK;
        } else {
            obj = null;
        }
        c0334c2 = new C0334c(obj);
        if (VERSION.SDK_INT >= 24) {
            obj2 = AccessibilityAction.ACTION_SET_PROGRESS;
        }
        c0334c = new C0334c(obj2);
    }
}
