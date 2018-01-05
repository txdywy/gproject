package android.support.v7.widget;

import android.view.View;
import android.view.ViewParent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;

final class am {
    static InputConnection m3191a(InputConnection inputConnection, EditorInfo editorInfo, View view) {
        if (inputConnection != null && editorInfo.hintText == null) {
            for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                if (parent instanceof ie) {
                    editorInfo.hintText = ((ie) parent).m3871a();
                    break;
                }
            }
        }
        return inputConnection;
    }
}
