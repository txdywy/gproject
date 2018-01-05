package android.support.v7.view;

import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.View;
import android.view.Window.Callback;
import android.view.WindowManager.LayoutParams;
import android.view.accessibility.AccessibilityEvent;
import java.util.List;

public class C0407n implements Callback {
    public final Callback f2264e;

    public C0407n(Callback callback) {
        if (callback == null) {
            throw new IllegalArgumentException("Window callback may not be null");
        }
        this.f2264e = callback;
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return this.f2264e.dispatchKeyEvent(keyEvent);
    }

    public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        return this.f2264e.dispatchKeyShortcutEvent(keyEvent);
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.f2264e.dispatchTouchEvent(motionEvent);
    }

    public boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        return this.f2264e.dispatchTrackballEvent(motionEvent);
    }

    public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return this.f2264e.dispatchGenericMotionEvent(motionEvent);
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return this.f2264e.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    public View onCreatePanelView(int i) {
        return this.f2264e.onCreatePanelView(i);
    }

    public boolean onCreatePanelMenu(int i, Menu menu) {
        return this.f2264e.onCreatePanelMenu(i, menu);
    }

    public boolean onPreparePanel(int i, View view, Menu menu) {
        return this.f2264e.onPreparePanel(i, view, menu);
    }

    public boolean onMenuOpened(int i, Menu menu) {
        return this.f2264e.onMenuOpened(i, menu);
    }

    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        return this.f2264e.onMenuItemSelected(i, menuItem);
    }

    public void onWindowAttributesChanged(LayoutParams layoutParams) {
        this.f2264e.onWindowAttributesChanged(layoutParams);
    }

    public void onContentChanged() {
        this.f2264e.onContentChanged();
    }

    public void onWindowFocusChanged(boolean z) {
        this.f2264e.onWindowFocusChanged(z);
    }

    public void onAttachedToWindow() {
        this.f2264e.onAttachedToWindow();
    }

    public void onDetachedFromWindow() {
        this.f2264e.onDetachedFromWindow();
    }

    public void onPanelClosed(int i, Menu menu) {
        this.f2264e.onPanelClosed(i, menu);
    }

    public boolean onSearchRequested(SearchEvent searchEvent) {
        return this.f2264e.onSearchRequested(searchEvent);
    }

    public boolean onSearchRequested() {
        return this.f2264e.onSearchRequested();
    }

    public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        return this.f2264e.onWindowStartingActionMode(callback);
    }

    public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
        return this.f2264e.onWindowStartingActionMode(callback, i);
    }

    public void onActionModeStarted(ActionMode actionMode) {
        this.f2264e.onActionModeStarted(actionMode);
    }

    public void onActionModeFinished(ActionMode actionMode) {
        this.f2264e.onActionModeFinished(actionMode);
    }

    public void onProvideKeyboardShortcuts(List list, Menu menu, int i) {
        this.f2264e.onProvideKeyboardShortcuts(list, menu, i);
    }

    public void onPointerCaptureChanged(boolean z) {
        this.f2264e.onPointerCaptureChanged(z);
    }
}
