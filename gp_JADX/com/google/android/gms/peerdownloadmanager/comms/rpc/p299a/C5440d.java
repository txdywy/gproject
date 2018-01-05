package com.google.android.gms.peerdownloadmanager.comms.rpc.p299a;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.channels.ClosedChannelException;

public final class C5440d extends C5437a {
    public C5440d(InputStream inputStream, OutputStream outputStream, C5438b c5438b) {
        super(inputStream, outputStream, c5438b);
    }

    protected final void mo5009a(C5439c c5439c) {
        while (true) {
            int read;
            try {
                read = this.b.read(this.a);
                if (read == -1) {
                    throw new ClosedChannelException();
                }
                c5439c.f28137b += (long) read;
                this.c.writeInt(read);
                c5439c.f28138c += 4;
                if (read == 0) {
                    c5439c.f28136a = true;
                    return;
                } else {
                    this.c.write(this.a, 0, read);
                    c5439c.f28138c += (long) read;
                }
            } catch (IOException e) {
                read = 0;
            }
        }
    }
}
