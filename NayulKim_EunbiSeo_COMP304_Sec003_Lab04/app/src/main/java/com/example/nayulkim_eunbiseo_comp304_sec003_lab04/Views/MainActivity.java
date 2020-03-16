package com.example.nayulkim_eunbiseo_comp304_sec003_lab04.Views;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.nayulkim_eunbiseo_comp304_sec003_lab04.R;

public class MainActivity extends AppCompatActivity {
    private Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void loginClick(View view){
        Intent intent=new Intent(this,LoginActivity.class);
        startActivity(intent);

    }
}
