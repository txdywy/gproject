package android.support.design.widget;

import android.os.Handler.Callback;
import android.os.Message;

final class bs implements Callback {
    public final /* synthetic */ br f896a;

    bs(br brVar) {
        this.f896a = brVar;
    }

    public final boolean handleMessage(Message message) {
        switch (message.what) {
            case 0:
                br brVar = this.f896a;
                bu buVar = (bu) message.obj;
                synchronized (brVar.f892b) {
                    if (brVar.f894d == buVar || brVar.f895e == buVar) {
                        brVar.m711a(buVar, 2);
                    }
                }
                return true;
            default:
                return false;
        }
    }
}
