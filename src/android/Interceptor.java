package org.apache.cordova.interceptor;

import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaPlugin;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class Interceptor extends CordovaPlugin {
    public static final String TAG = "Interceptor";

    public Interceptor() {
    }

    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {

        if ("getInfo".equals(action)) {
            JSONObject r = new JSONObject();
            r.put("uuid", "==================================");
            r.put("version", "==================================");
            r.put("platform", "==================================");
            r.put("model", "==================================");
            r.put("manufacturer", "==================================");
            r.put("isVirtual", "==================================");
            r.put("serial", "==================================");
            callbackContext.success(r);
        }
        else {
            return false;
        }
        return true;
    }



}
