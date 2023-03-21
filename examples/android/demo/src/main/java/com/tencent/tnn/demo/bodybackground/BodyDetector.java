package com.tencent.tnn.demo.bodybackground;

import android.graphics.Bitmap;
import com.tencent.tnn.demo.FaceInfo;
//抠背景Detector
public class BodyDetector {
    public native int init(String modelPath, int width, int height, float scoreThreshold, float iouThreshold, int topk, int computeType);
    public native boolean checkNpu(String modelPath);
    public native int deinit();
    public native FaceInfo[] detectFromStream(byte[] yuv420sp, int width, int height, int view_width, int view_height, int rotate);
    public native FaceInfo[] detectFromImage(Bitmap bitmap, int width, int height);
}