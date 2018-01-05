package com.google.android.play.search;

import android.content.Context;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.KeyEvent.DispatcherState;
import android.widget.EditText;

public class PlaySearchEditText extends EditText {
    public PlaySearchEditText(Context context) {
        super(context);
    }

    public PlaySearchEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (VERSION.SDK_INT >= 11 && VERSION.SDK_INT <= 22) {
            setCustomSelectionActionModeCallback(new C6421n());
        }
    }

    public boolean onKeyPreIme(int i, KeyEvent keyEvent) {
        if (i == 4 && hasFocus() && keyEvent.getAction() == 1) {
            DispatcherState keyDispatcherState = getKeyDispatcherState();
            if (keyDispatcherState != null) {
                keyDispatcherState.handleUpEvent(keyEvent);
            }
            if (!keyEvent.isCanceled()) {
                clearFocus();
                return true;
            }
        }
        return super.onKeyPreIme(i, keyEvent);
    }
}
