package android.support.v7.widget;

import android.view.KeyEvent;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;

final class gh implements OnEditorActionListener {
    public final /* synthetic */ SearchView f3508a;

    gh(SearchView searchView) {
        this.f3508a = searchView;
    }

    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        this.f3508a.onSubmitQuery();
        return true;
    }
}
