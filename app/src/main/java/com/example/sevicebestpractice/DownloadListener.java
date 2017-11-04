package com.example.sevicebestpractice;

/**
 * Created by 96274 on 2017/11/2.
 */

public interface  DownloadListener {
    void onProgress(int progress);
    void onSuccess();
    void onFailed();
    void onPaused();
    void onCanceled();
}
