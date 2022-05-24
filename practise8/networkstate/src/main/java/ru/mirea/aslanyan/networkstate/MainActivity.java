package ru.mirea.aslanyan.networkstate;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.textView);
        LiveData<String> networkLiveData = NetworkLiveData.getInstance(this);
        networkLiveData.observe(this, s -> textView.setText(s));
    }
}