package danielideriba.com.br.fcmapp

import android.util.Log
import com.google.firebase.iid.FirebaseInstanceId
import com.google.firebase.iid.FirebaseInstanceIdService


/**
 * Created by danielideriba on 14,February,2019
 */
class MyFirebaseInstanceIDService: FirebaseInstanceIdService() {
    override fun onTokenRefresh() {
        super.onTokenRefresh()
        Log.i("TOKEN", FirebaseInstanceId.getInstance().token)
    }

}