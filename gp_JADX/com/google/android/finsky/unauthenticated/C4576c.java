package com.google.android.finsky.unauthenticated;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.PopupMenu;
import com.google.android.finsky.aa.C0954a;
import com.google.android.finsky.p111d.C2475d;
import com.squareup.leakcanary.C7582R;

final class C4576c implements OnClickListener {
    public final /* synthetic */ ImageView f23391a;
    public final /* synthetic */ C4574a f23392b;

    C4576c(C4574a c4574a, ImageView imageView) {
        this.f23392b = c4574a;
        this.f23391a = imageView;
    }

    public final void onClick(View view) {
        PopupMenu popupMenu = new PopupMenu(this.f23392b.m601g(), this.f23391a);
        popupMenu.getMenuInflater().inflate(C7582R.menu.unauth_actions, popupMenu.getMenu());
        popupMenu.getMenu().findItem(C7582R.id.auto_update_option).setChecked(((Boolean) C0954a.f5854x.m5760a()).booleanValue());
        this.f23391a.setImageResource(C7582R.drawable.play_overflow_menu_open);
        this.f23392b.f23387e.m13379b(new C2475d(this.f23392b).m13256a(2949));
        popupMenu.show();
        popupMenu.setOnMenuItemClickListener(this.f23392b);
    }
}
