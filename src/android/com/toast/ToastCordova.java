package com.toast;

import org.apache.cordova.CordovaInterface;
import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CordovaWebView;
import org.apache.cordova.PluginResult;
import org.apache.cordova.PluginResult.Status;
import org.json.JSONObject;
import org.json.JSONException;

import org.json.JSONArray;
import org.apache.cordova.CallbackContext;
import android.content.Context;
import android.widget.Toast;

public class ToastCordova extends CordovaPlugin{
	private static final String TAG = "Toast";
	public void initialize(CordovaInterface cordova, CordovaWebView webView) {
		super.initialize(cordova, webView);
	}

	//Function waiting Cordova JS command
	@Override
	public boolean execute(String action, JSONArray args, CallbackContext callbackContext){
		if(action.equals("toast")){
			try{
				String frase = args.getString(0);
				toast(frase);
			}
			catch(Exception e){
				//string error = e;
			}
		}
		return true;
	}
	//The toast
	public void toast(String frase){
		Context context=this.cordova.getActivity().getApplicationContext();
        	String texto = frase;
        	int duracao = Toast.LENGTH_SHORT;
        	Toast toast = Toast.makeText(context, texto, duracao);
        	toast.show();
	}
	
}
