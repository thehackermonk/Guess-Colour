package com.hacker.guesscolor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.hacker.guesscolor.bean.ColouredShape;
import com.hacker.guesscolor.logic.ShapesLogic;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        reloadShapes();

    }

    public void reloadShapes() {

        ImageView imageView1=(ImageView) findViewById(R.id.shape1);
        ImageView imageView2=(ImageView) findViewById(R.id.shape2);
        ImageView imageView3=(ImageView) findViewById(R.id.shape3);
        ImageView imageView4=(ImageView) findViewById(R.id.shape4);

        TextView colorText1=(TextView) findViewById(R.id.color1Text);
        TextView colorText2=(TextView) findViewById(R.id.color2Text);
        TextView colorText3=(TextView) findViewById(R.id.color3Text);
        TextView colorText4=(TextView) findViewById(R.id.color4Text);

        ColouredShape colouredShape1,colouredShape2,colouredShape3,colouredShape4;
        ShapesLogic shapesLogic=new ShapesLogic();

        colouredShape1=shapesLogic.getRandomShape();
        colouredShape2=shapesLogic.getRandomShape();
        colouredShape3=shapesLogic.getRandomShape();
        colouredShape4=shapesLogic.getRandomShape();

        imageView1.setImageResource(colouredShape1.getPath());
        colorText1.setText(colouredShape1.getColour());

        imageView2.setImageResource(colouredShape2.getPath());
        colorText2.setText(colouredShape2.getColour());

        imageView3.setImageResource(colouredShape3.getPath());
        colorText3.setText(colouredShape3.getColour());

        imageView4.setImageResource(colouredShape4.getPath());
        colorText4.setText(colouredShape4.getColour());

    }

    public void guessButtonOnClick(View view) {

        TextView colorText1=(TextView) findViewById(R.id.color1Text);
        TextView colorText2=(TextView) findViewById(R.id.color2Text);
        TextView colorText3=(TextView) findViewById(R.id.color3Text);
        TextView colorText4=(TextView) findViewById(R.id.color4Text);

        Intent guessIntent=new Intent(this, GuessActivity.class);

        Bundle bundle=new Bundle();

        bundle.putString("colour1",colorText1.getText().toString());
        bundle.putString("colour2",colorText2.getText().toString());
        bundle.putString("colour3",colorText3.getText().toString());
        bundle.putString("colour4",colorText4.getText().toString());

        guessIntent.putExtras(bundle);

        startActivity(guessIntent);

    }

    public void refreshButtonOnClick(View view) {

        reloadShapes();

    }

}