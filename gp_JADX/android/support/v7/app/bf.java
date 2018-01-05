package android.support.v7.app;

import android.app.Dialog;
import android.os.Bundle;
import android.support.v4.app.C0141p;

public class bf extends C0141p {
    public Dialog mo143a(Bundle bundle) {
        return new be(m601g(), this.f771b);
    }

    public void mo144a(Dialog dialog, int i) {
        if (dialog instanceof be) {
            be beVar = (be) dialog;
            switch (i) {
                case 1:
                case 2:
                    break;
                case 3:
                    dialog.getWindow().addFlags(24);
                    break;
                default:
                    return;
            }
            beVar.m536a();
            return;
        }
        super.mo144a(dialog, i);
    }
}
