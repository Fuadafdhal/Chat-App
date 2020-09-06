package com.afdhal_fa.chatapp.Fragment;

import com.afdhal_fa.chatapp.Notification.MyResponse;
import com.afdhal_fa.chatapp.Notification.Sender;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface APIService {
    @Headers(
            {
                    "Content-Type:application/json",
                    "Authorization:key=AAAARrUMtIw:APA91bE2E0jB95wbbHpNbqG_e3KGeAYLFxrBXf_g3qzp2X0V9-_i6MVR9FZRm8Vmr86sUUhyCPtAkFsU3zOSDXn3nQlRWK1TrY_0K0X4bD7uW87ibbalgFkA6ctE_iMaTGZSdBm9hwEF"
            }
    )

    @POST("fcm/send")
    Call<MyResponse> sendNotification(@Body Sender body);
}
