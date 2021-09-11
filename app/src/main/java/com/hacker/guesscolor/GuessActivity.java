package com.hacker.guesscolor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.hacker.guesscolor.bean.ColouredShape;
import com.hacker.guesscolor.dao.ColouredShapesData;
import com.hacker.guesscolor.logic.RandomGenerator;
import com.hacker.guesscolor.logic.ResultGenerator;

import java.util.Arrays;
import java.util.Timer;
import java.util.TimerTask;

import nl.dionsegijn.konfetti.KonfettiView;
import nl.dionsegijn.konfetti.models.Shape;
import nl.dionsegijn.konfetti.models.Size;

public class GuessActivity extends AppCompatActivity {

    private String resultColour="";
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guess);

        ImageView guessImageView=(ImageView) findViewById(R.id.guessImage);
        Button guessButton1=(Button) findViewById(R.id.guessButton1);
        Button guessButton2=(Button) findViewById(R.id.guessButton2);
        Button guessButton3=(Button) findViewById(R.id.guessButton3);
        Button guessButton4=(Button) findViewById(R.id.guessButton4);

        Bundle bundle=getIntent().getExtras();
        String[] previousColours=new String[4];
        String[] colours=new String[4];

        ColouredShape colouredShape;
        ColouredShapesData colouredShapesData=new ColouredShapesData();
        RandomGenerator randomGenerator=new RandomGenerator();

        String shape,colour;

        previousColours[0]=bundle.getString("colour1");
        previousColours[1]=bundle.getString("colour2");
        previousColours[2]=bundle.getString("colour3");
        previousColours[3]=bundle.getString("colour4");

        shape=randomGenerator.generateRandomShape();
        colour=randomGenerator.generateRandomColour(previousColours);

        colouredShape=colouredShapesData.getColouredShape(shape, colour);

        resultColour=colour;
        
        colours[0]=colour;
        colours[1]=randomGenerator.generateRandomColour(colours[0]);
        colours[2]=randomGenerator.generateRandomColour(colours[0],colours[1]);
        colours[3]=randomGenerator.generateRandomColour(colours[0],colours[1],colours[2]);

        Arrays.sort(colours);

        guessImageView.setImageResource(colouredShape.getPath());
        guessButton1.setText(colours[0]);
        guessButton2.setText(colours[1]);
        guessButton3.setText(colours[2]);
        guessButton4.setText(colours[3]);

    }

    public void guessColour1OnClick(View view) {

        Button guessButton1=(Button) findViewById(R.id.guessButton1);
        Button guessButton2=(Button) findViewById(R.id.guessButton2);
        Button guessButton3=(Button) findViewById(R.id.guessButton3);
        Button guessButton4=(Button) findViewById(R.id.guessButton4);

        ResultGenerator resultGenerator=new ResultGenerator();

        String selectedColour=guessButton1.getText().toString();

        if(resultGenerator.checkResult(resultColour,selectedColour)) {

            Log.d("result","Success");
            setButtonColours(guessButton1,guessButton2,guessButton3,guessButton4);
            showKonfetti();
            playSound();
            showCreditsActivity();

        } else {

            Log.d("result","Failed");
            guessButton1.setEnabled(false);
            Toast.makeText(getApplicationContext(),"Incorrect answer. Try again.",Toast.LENGTH_SHORT).show();

        }

    }

    public void guessColour2OnClick(View view) {

        Button guessButton1=(Button) findViewById(R.id.guessButton1);
        Button guessButton2=(Button) findViewById(R.id.guessButton2);
        Button guessButton3=(Button) findViewById(R.id.guessButton3);
        Button guessButton4=(Button) findViewById(R.id.guessButton4);

        ResultGenerator resultGenerator=new ResultGenerator();

        String selectedColour=guessButton2.getText().toString();

        if(resultGenerator.checkResult(resultColour,selectedColour)) {

            Log.d("result","Success");
            setButtonColours(guessButton2,guessButton1,guessButton3,guessButton4);
            showKonfetti();
            playSound();
            showCreditsActivity();

        } else {

            Log.d("result","Failed");
            guessButton2.setEnabled(false);
            Toast.makeText(getApplicationContext(),"Incorrect answer. Try again.",Toast.LENGTH_SHORT).show();

        }

    }

    public void guessColour3OnClick(View view) {

        Button guessButton1=(Button) findViewById(R.id.guessButton1);
        Button guessButton2=(Button) findViewById(R.id.guessButton2);
        Button guessButton3=(Button) findViewById(R.id.guessButton3);
        Button guessButton4=(Button) findViewById(R.id.guessButton4);

        ResultGenerator resultGenerator=new ResultGenerator();

        String selectedColour=guessButton3.getText().toString();

        if(resultGenerator.checkResult(resultColour,selectedColour)) {

            Log.d("result","Success");
            setButtonColours(guessButton3,guessButton1,guessButton2,guessButton4);
            showKonfetti();
            playSound();
            showCreditsActivity();

        } else {

            Log.d("result","Failed");
            guessButton3.setEnabled(false);
            Toast.makeText(getApplicationContext(),"Incorrect answer. Try again.",Toast.LENGTH_SHORT).show();

        }

    }

    public void guessColour4OnClick(View view) {

        Button guessButton1=(Button) findViewById(R.id.guessButton1);
        Button guessButton2=(Button) findViewById(R.id.guessButton2);
        Button guessButton3=(Button) findViewById(R.id.guessButton3);
        Button guessButton4=(Button) findViewById(R.id.guessButton4);

        ResultGenerator resultGenerator=new ResultGenerator();

        String selectedColour=guessButton4.getText().toString();

        if(resultGenerator.checkResult(resultColour,selectedColour)) {

            Log.d("result","Success");
            setButtonColours(guessButton4,guessButton1,guessButton2,guessButton3);
            showKonfetti();
            playSound();
            showCreditsActivity();

        } else {

            Log.d("result","Failed");
            guessButton4.setEnabled(false);
            Toast.makeText(getApplicationContext(),"Incorrect answer. Try again.",Toast.LENGTH_SHORT).show();

        }

    }

    public void setButtonColours(Button successButton,Button failButton1,Button failButton2,Button failButton3) {

        successButton.setBackgroundColor(getResources().getColor(R.color.green,null));
        failButton1.setBackgroundColor(getResources().getColor(R.color.red, null));
        failButton2.setBackgroundColor(getResources().getColor(R.color.red, null));
        failButton3.setBackgroundColor(getResources().getColor(R.color.red, null));

    }

    public void showKonfetti() {

        final KonfettiView konfettiView = findViewById(R.id.konfettiView);

        konfettiView.build()
                .addColors(Color.YELLOW, Color.GREEN, Color.MAGENTA)
                .setDirection(0.0, 359.0)
                .setSpeed(1f, 5f)
                .setFadeOutEnabled(true)
                .setTimeToLive(2000L)
                .addShapes(Shape.Square.INSTANCE, Shape.Circle.INSTANCE)
                .addSizes(new Size(12, 5f))
                .setPosition(-50f, konfettiView.getWidth() + 50f, -50f, -50f)
                .streamFor(300, 5000L);

    }

    public void playSound() {

        final MediaPlayer mp=MediaPlayer.create(this,R.raw.applause);
        mp.start();

    }

    public void showCreditsActivity() {

        Intent creditsIntent=new Intent(this,CreditsActivity.class);
        Timer t=new Timer();

        t.schedule(
                new TimerTask() {
                    @Override
                    public void run() {
                        startActivity(creditsIntent);
                        t.cancel();
                    }
                }, 5000
        );

    }

}