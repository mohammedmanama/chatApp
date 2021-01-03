package com.example.chatapp.Fragments;

import com.example.chatapp.Notification.MyResponse;
import com.example.chatapp.Notification.Sender;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface APIService {
    @Headers(
            {
                    "Content-Type:application/json",
                    "Authorization:key=AAAAITQe1ZY:APA91bFM_CtrkYq6fwQD9j0IsTJzGTbWZ1WQoiemcP03O5vLEhu7i1qK9MDQTL6O94SAT6YENWdavFNU3B5f6DA5nVq3skwBQJmy1KSy21SvT4L96LXhCRpjusxPx8Q-HUwSl0420lRb"
            }
    )

    @POST("fcm/send")
    Call<MyResponse> sendNotification(@Body Sender body);
}
