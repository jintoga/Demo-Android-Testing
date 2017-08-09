package com.dat.demotesting;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.firstNumber)
    protected EditText firstNumber;
    @BindView(R.id.secondNumber)
    protected EditText secondNumber;
    @BindView(R.id.add)
    protected Button add;
    @BindView(R.id.multiply)
    protected Button multiply;
    @BindView(R.id.subtract)
    protected Button subtract;
    @BindView(R.id.divide)
    protected Button divide;
    @BindView(R.id.result)
    protected TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    public static void create(@NonNull Context context, @NonNull String username) {
        if (context instanceof MainActivity) {
            return;
        }
        Intent intent = new Intent(context, MainActivity.class);
        intent.putExtra(username, username);
        context.startActivity(intent);
    }
}
