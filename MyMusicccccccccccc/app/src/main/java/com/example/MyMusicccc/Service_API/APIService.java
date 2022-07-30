package com.example.MyMusicccc.Service_API;

public class APIService {
    private static String base_url = "https://dd21-20-249-101-167.jp.ngrok.io/Server2/";

   //private static String base_url = "https://musicapptld.000webhostapp.com/Server2/";

  //  private static String base_url = "https://free02.123host.vn:2222/CMD_FILE_MANAGER/public_html/Server2/";
    public static Dataservice getService(){
        return APIRetrofitClient.getClient(base_url).create(Dataservice.class);
    }


}
