package com.example.covid19_project;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class Tranjasondata extends AppCompatActivity {
    Button jasonbutton;
    TextView jasontext;
    private RequestQueue mQueue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tranjasondata);
        jasonbutton = findViewById(R.id.jasonbutton);
        jasontext = findViewById(R.id.jasontext);
        mQueue = Volley.newRequestQueue(this);

    }

    public void getjason(View v) {
        jsonParse();
    }

    private void jsonParse() {//jason 1.網址 2.陣列內容
        String url = "https://my-json-server.typicode.com/typicode/demo/db";
        JsonObjectRequest request = new JsonObjectRequest(Request.Method.GET,
                url,
                null,
                new Response.Listener<JSONObject>() {
                    @Override
                    public void onResponse(JSONObject response) {
                        try {
                            JSONArray jsonArray = response.getJSONArray("posts");
                            for (int i = 0; i < jsonArray.length(); i++) {
                                JSONObject employee = jsonArray.getJSONObject(i);
                                int id = employee.getInt("id");
                                String title = employee.getString("title");
                                jasontext.append(""+id +"\n"+":" + title+ "\n\n");
                            }
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                error.printStackTrace();
            }
        });
        mQueue.add(request);
    }

}




