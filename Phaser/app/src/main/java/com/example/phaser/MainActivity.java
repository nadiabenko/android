package com.example.phaser;

import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Phraser Phr = new Phraser();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            final TextView myTextView = (TextView) findViewById(R.id.tv_result);
            Button myButton = (Button) findViewById(R.id.Gen);
            //btn = (Button)findViewById(R.id.Gen);

            myTextView.setText(Phr.PhraserGen() + " – это всё, что нам нужно.");

            myButton.setOnClickListener(
                    new View.OnClickListener(){

                        public void onClick(View v)
                        {
                            myTextView.setText(Phr.PhraserGen() + " – это всё, что нам нужно.");
                        }
                    }

            );
        }
}