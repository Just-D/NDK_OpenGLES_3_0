package com.byteflow.app;

public class MyNativeRender {
    static {
        System.loadLibrary("native-render");
    }

    public native void native_OnInit();

    public native void native_OnUnInit();

    public native void native_SetParamsInt(int paramType, int value0, int value1);

    public native void native_SetImageData(int format, int width, int height, byte[] bytes);

    public native void native_OnSurfaceCreated();

    public native void native_OnSurfaceChanged(int width, int height);

    public native void native_OnDrawFrame();
}