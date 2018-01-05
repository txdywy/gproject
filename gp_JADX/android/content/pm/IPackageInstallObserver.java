package android.content.pm;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.p008a.C0021a;
import com.google.android.p008a.C0022b;

public interface IPackageInstallObserver extends IInterface {

    public abstract class Stub extends C0022b implements IPackageInstallObserver {
        public static final String DESCRIPTOR = "android.content.pm.IPackageInstallObserver";
        public static final int TRANSACTION_packageInstalled = 1;

        public class Proxy extends C0021a implements IPackageInstallObserver {
            Proxy(IBinder iBinder) {
                super(iBinder, Stub.DESCRIPTOR);
            }

            public void packageInstalled(String str, int i) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeString(str);
                obtainAndWriteInterfaceToken.writeInt(i);
                transactOneway(1, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static IPackageInstallObserver asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            if (queryLocalInterface instanceof IPackageInstallObserver) {
                return (IPackageInstallObserver) queryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (routeToSuperOrEnforceInterface(i, parcel, parcel2, i2)) {
                return true;
            }
            if (i != 1) {
                return false;
            }
            packageInstalled(parcel.readString(), parcel.readInt());
            return true;
        }
    }

    void packageInstalled(String str, int i);
}
