package com.example.diceroller;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    public static final Random RANDOM=new Random();
    private Button rolldice;
    private ImageView img1,img2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rolldice=findViewById(R.id.rolldice);
        img1=findViewById(R.id.img1);
        img2=findViewById(R.id.img2);

        rolldice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int value1=randomDicevalue();
                int value2= randomDicevalue();

                int res1=getResources().getIdentifier("dice_"+value1,"drawable",getPackageName());
                int res2=getResources().getIdentifier("dice"+value2,"drawable",getPackageName());

                img1.setImageResource(res1);
                img2.setImageResource(res2);
            }
        });
    }
    public  static int randomDicevalue(){
        return  RANDOM.nextInt(6)+1;
    }
}