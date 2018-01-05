package com.firebase.jobdispatcher;

import android.os.Bundle;
import android.os.Message;
import android.os.Messenger;

final class C0748m implements C0744v {
    public final Messenger f4690a;
    public final String f4691b;

    C0748m(Messenger messenger, String str) {
        this.f4690a = messenger;
        this.f4691b = str;
    }

    public final void mo1117a(int i) {
        try {
            Messenger messenger = this.f4690a;
            Message obtain = Message.obtain();
            obtain.what = 3;
            obtain.arg1 = i;
            Bundle bundle = new Bundle();
            bundle.putString("tag", this.f4691b);
            obtain.setData(bundle);
            messenger.send(obtain);
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
}
