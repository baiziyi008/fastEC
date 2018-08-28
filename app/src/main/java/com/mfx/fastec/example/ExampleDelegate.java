package com.mfx.fastec.example;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

import com.mfx.latte.delegates.LatteDelegate;
import com.mfx.latte.net.RestClient;
import com.mfx.latte.net.callback.IError;
import com.mfx.latte.net.callback.IFailure;
import com.mfx.latte.net.callback.ISuccess;

/**
 * Created by mfx on 2018/8/27.
 */

public class ExampleDelegate extends LatteDelegate {
    @Override
    public Object setlayout() {
        return R.layout.delegate_example;
    }

    @Override
    public void onBindView(@Nullable Bundle savedInstanceState, View rootVieww) {

    }

    private void testRestClient(){
        RestClient.builder()
                .url("")
                .params("","")
                .success(new ISuccess() {
                    @Override
                    public void onSuccess(String response) {

                    }
                })
                .failure(new IFailure() {
                    @Override
                    public void onFailure() {

                    }
                })
                .error(new IError() {
                    @Override
                    public void onError(int code, String msg) {

                    }
                })
                .build();
    }
}
