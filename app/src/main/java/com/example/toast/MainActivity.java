package com.example.toast;



import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {
    Button toast;
    @SuppressLint({"SetTextI18n", "RtlHardcoded"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toast=findViewById(R.id.toast);
      toast.setOnClickListener(v -> {
          Toast toast=new Toast(getApplicationContext());
          View view=getLayoutInflater().inflate(R.layout.custom_toast_layout, findViewById(R.id.viewcontainer));
          toast.setView(view);
          TextView text=view.findViewById(R.id.text);
          text.setText("Message send successfully");
          toast.setDuration(Toast.LENGTH_LONG);
          toast.setGravity(Gravity.TOP|Gravity.RIGHT,0,0);
          toast.show();
      });
    }
}