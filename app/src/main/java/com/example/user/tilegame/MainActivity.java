package com.example.user.tilegame;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class MainActivity extends AppCompatActivity {

    //emptyButtonLocation is corresponding array index
    private int emptyButtonLocation;
    private int timeReductionFactor;
    private Button but1, but2, but3, but4 , but5, but6, but7, but8, but9, but10, but11, but12, but13, but14, but15, but16;
    private Button[] buttonArray = new Button[16];
    private int shuffleCounter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        but1 = findViewById(R.id.button1);
        but1.setText("1");
        buttonArray[0] = but1;

        but2 = findViewById(R.id.button2);
        but2.setText("2");
        buttonArray[1] = but2;

        but3 = findViewById(R.id.button3);
        but3.setText("3");
        buttonArray[2] = but3;

        but4 = findViewById(R.id.button4);
        but4.setText("4");
        buttonArray[3] = but4;

        but5 = findViewById(R.id.button5);
        but5.setText("5");
        buttonArray[4] = but5;

        but6 = findViewById(R.id.button6);
        but6.setText("6");
        buttonArray[5] = but6;

        but7 = findViewById(R.id.button7);
        but7.setText("7");
        buttonArray[6] = but7;

        but8 = findViewById(R.id.button8);
        but8.setText("8");
        buttonArray[7] = but8;

        but9 = findViewById(R.id.button9);
        but9.setText("9");
        buttonArray[8] = but9;

        but10 = findViewById(R.id.button10);
        but10.setText("10");
        buttonArray[9] = but10;

        but11 = findViewById(R.id.button11);
        but11.setText("11");
        buttonArray[10] = but11;

        but12 = findViewById(R.id.button12);
        but12.setText("12");
        buttonArray[11] = but12;

        but13 = findViewById(R.id.button13);
        but13.setText("13");
        buttonArray[12] = but13;

        but14 = findViewById(R.id.button14);
        but14.setText("14");
        buttonArray[13] = but14;

        but15 = findViewById(R.id.button15);
        but15.setText("15");
        buttonArray[14] = but15;

        but16 = findViewById(R.id.button16);
        but16.setText("");
        buttonArray[15] = but16;
        emptyButtonLocation = Arrays.asList(buttonArray).indexOf(but16);
    }

    //all the button clicked methods check to see if there is an open space adjacent
    //to the clicked tile, if so, it switches then tests to see if you won

    public void onButton1Clicked(View v) {
        if (but1.getText() == "") {
            testWin();
            return;
        }
        else if (but2.getText() == "") {
            buttonSwitch(but1, but2);
            testWin();
            return;
        }
        else if (but5.getText() == "") {
            buttonSwitch(but1, but5);
            testWin();
            return;
        }
        else {
            return;
        }

    }

    public void onButton2Clicked(View v) {
        if (but2.getText() == "") {
            testWin();
            return;
        }
        else if (but1.getText() == "") {
            buttonSwitch(but2, but1);
            testWin();
            return;
        }
        else if (but3.getText() == "") {
            buttonSwitch(but2, but3);
            testWin();
            return;
        }
        else if (but6.getText() == "") {
            buttonSwitch(but2, but6);
            testWin();
            return;
        }
        else {
            return;
        }
    }

    public void onButton3Clicked(View v) {
        if (but3.getText() == "") {
            testWin();
            return;
        }
        else if (but2.getText() == "") {
            buttonSwitch(but3, but2);
            testWin();
            return;
        }
        else if (but4.getText() == "") {
            buttonSwitch(but3, but4);
            testWin();
            return;
        }
        else if  (but7.getText() == "") {
            buttonSwitch(but3, but7);
            testWin();
            return;
        }
        else {
            return;
        }
    }

    public void onButton4Clicked(View v) {
        if (but4.getText() == "") {
            testWin();
            return;
        }
        else if (but3.getText() == "") {
            buttonSwitch(but4, but3);
            testWin();
            return;
        }
        else if (but8.getText() == "") {
            buttonSwitch(but4, but8);
            testWin();
            return;
        }
        else {
            return;
        }
    }

    public void onButton5Clicked(View v) {
        if (but1.getText() == "") {
            buttonSwitch(but5, but1);
            testWin();
            return;
        }
        else if (but6.getText() == "") {
            buttonSwitch(but5, but6);
            testWin();
            return;
        }
        else if (but9.getText() == "") {
            buttonSwitch(but5, but9);
            testWin();
            return;
        }
        else {
            return;
        }
    }

    public void onButton6Clicked(View v) {
        if (but5.getText() == "") {
            buttonSwitch(but6, but5);
            testWin();
            return;
        }
        else if (but7.getText() == "") {
            buttonSwitch(but6, but7);
            testWin();
            return;
        }
        else if (but2.getText() == "") {
            buttonSwitch(but6, but2);
            testWin();
            return;
        }
        else if (but10.getText() == "") {
            buttonSwitch(but6, but10);
            testWin();
            return;
        }
        else {
            return;
        }
    }

    public void onButton7Clicked(View v) {
        if (but6.getText() == "") {
            buttonSwitch(but7, but6);
            testWin();
            return;
        }
        else if (but8.getText() == "") {
            buttonSwitch(but7, but8);
            testWin();
            return;
        }
        else if (but3.getText() == "") {
            buttonSwitch(but7, but3);
            testWin();
            return;
        }
        else if (but11.getText() == "") {
            buttonSwitch(but7, but11);
            testWin();
            return;
        }
        else {
            return;
        }
    }

    public void onButton8Clicked(View v) {
        if (but7.getText() == "") {
            buttonSwitch(but8, but7);
            testWin();
            return;
        }
        else if (but4.getText() == "") {
            buttonSwitch(but8, but4);
            testWin();
            return;
        }
        else if (but12.getText() == "") {
            buttonSwitch(but8, but12);
            testWin();
            return;
        }
        else {
            return;
        }
    }

    public void onButton9Clicked(View v) {
        if (but5.getText() == "") {
            buttonSwitch(but9, but5);
            testWin();
            return;
        }
        else if (but10.getText() == "") {
            buttonSwitch(but9, but10);
            testWin();
            return;
        }
        else if (but13.getText() == "") {
            buttonSwitch(but9, but13);
            testWin();
            return;
        }
        else {
            return;
        }
    }

    public void onButton10Clicked(View v) {
        if (but9.getText() == "") {
            buttonSwitch(but10, but9);
            testWin();
            return;
        }
        else if (but11.getText() == "") {
            buttonSwitch(but10, but11);
            testWin();
            return;
        }
        else if (but6.getText() == "") {
            buttonSwitch(but10, but6);
            testWin();
            return;
        }
        else if (but14.getText() == "") {
            buttonSwitch(but10, but14);
            testWin();
            return;
        }
        else {
            return;
        }
    }

    public void onButton11Clicked(View v) {
        if (but10.getText() == "") {
            buttonSwitch(but11, but10);
            testWin();
            return;
        }
        else if (but12.getText() == "") {
            buttonSwitch(but11, but12);
            testWin();
            return;
        }
        else if (but7.getText() == "") {
            buttonSwitch(but11, but7);
            testWin();
            return;
        }
        else if (but15.getText() == "") {
            buttonSwitch(but11, but15);
            testWin();
            return;
        }
        else {
            return;
        }
    }

    public void onButton12Clicked(View v) {
        if (but11.getText() == "") {
            buttonSwitch(but12, but11);
            testWin();
            return;
        }
        else if (but8.getText() == "") {
            buttonSwitch(but12, but8);
            testWin();
            return;
        }
        else if (but16.getText() == "") {
            buttonSwitch(but12, but16);
            testWin();
            return;
        }
        else {
            return;
        }
    }

    public void onButton13Clicked(View v) {
        if (but14.getText() == "") {
            buttonSwitch(but13, but14);
            testWin();
            return;
        }
        else if (but9.getText() == "") {
            buttonSwitch(but13, but9);
            testWin();
            return;
        }
        else {
            return;
        }
    }

    public void onButton14Clicked(View v) {
        if (but13.getText() == "") {
            buttonSwitch(but14, but13);
            testWin();
            return;
        }
        else if (but10.getText() == "") {
            buttonSwitch(but14, but10);
            testWin();
            return;
        }
        else if (but15.getText() == "") {
            buttonSwitch(but14, but15);
            testWin();
            return;
        }
        else {
            return;
        }
    }

    public void onButton15Clicked(View v) {
        if (but14.getText() == "") {
            buttonSwitch(but15, but14);
            testWin();
            return;
        }
        else if (but11.getText() == "") {
            buttonSwitch(but15, but11);
            testWin();
            return;
        }
        else if (but16.getText() == "") {
            buttonSwitch(but15, but16);
            testWin();
            return;
        }
        else {
            return;
        }
    }

    public void onButton16Clicked(View v) {
        if (but15.getText() == "") {
            buttonSwitch(but16, but15);
            testWin();
            return;
        }
        else if (but12.getText() == "") {
            buttonSwitch(but16, but12);
            testWin();
            return;
        }
        else {
            return;
        }
    }

    //resets the board to the original starting position

    public void onResetButtonClicked(View v) {
        reset();
    }

    //for (int i = 0; i < 50; i++) {
    //            Button emptyButton = buttonArray[emptyButtonLocation];
    //            ArrayList<Button> emptySpaces = findAdjacentOpenSpaces(emptyButton);
    //            Random r = new Random();
    //            int randomButton = r.nextInt((emptySpaces.size() - 1) + 1);
    //            buttonSwitch(emptyButton, emptySpaces.get(randomButton));
    //        }

    //
    public void onShuffleButtonClicked(View v) {
        final Handler h = new Handler();
        Runnable r = new Runnable() {
            int counter = 0;
            @Override
            public void run(){
                Button emptyButton = buttonArray[emptyButtonLocation];
                ArrayList<Button> emptySpaces = findAdjacentOpenSpaces(emptyButton);
                Random r = new Random();
                int randomButton = r.nextInt((emptySpaces.size() - 1) + 1);
                Button buttonToShuffle = emptySpaces.get(randomButton);
                buttonSwitch(emptyButton, buttonToShuffle);
                //Button lastButtonMoved = buttonToShuffle;
                if (counter < 300) {
                    counter++;
                    timeReductionFactor += 2 * counter;
                    h.postDelayed(this, 300 - timeReductionFactor);
                }
                else {
                    h.removeCallbacksAndMessages(null);
                }
            }
        };
        h.postDelayed(r, 300 - timeReductionFactor);
    }

    /**
     final Handler h = new Handler();
     Runnable r = new Runnable() {
     int counter = 0;
     @Override
     public void run(){
     Button emptyButton = buttonArray[emptyButtonLocation];
     ArrayList<Button> emptySpaces = findAdjacentOpenSpaces(emptyButton);
     Random r = new Random();
     int randomButton = r.nextInt((emptySpaces.size() - 1) + 1);
     Button buttonToShuffle = emptySpaces.get(randomButton);
     buttonSwitch(emptyButton, buttonToShuffle);
     //Button lastButtonMoved = buttonToShuffle;
     if (counter < 300) {
     counter++;
     timeReductionFactor += 2 * counter;
     h.postDelayed(this, 300 - timeReductionFactor);
     }
     else {
     h.removeCallbacksAndMessages(null);
     }
     }
     };
     h.postDelayed(r, 300 - timeReductionFactor);
     **/


    //original blank button always goes first, space that becomes empty goes second
    public void buttonSwitch(Button b1, Button b2) {
        String temp = (String) b1.getText();
        b1.setText(b2.getText());
        b2.setText(temp);
        emptyButtonLocation = Arrays.asList(buttonArray).indexOf(b2);
    }

    //checks if all tiles are in their original position

    public void testWin() {
        boolean check = true;
        for (int i = 0; i < buttonArray.length - 1; i++) {
            if (buttonArray[i].getText().equals(Integer.toString(i + 1)) == false) {
                check = false;
            }
        }
        if (check == true) {
            Intent intent = new Intent(this, WinnerActivity.class);
            startActivity(intent);
        }
        else {
            return;
        }
    }

    //checks to see if any adjacent spaces are open

    public ArrayList<Button> findAdjacentOpenSpaces(Button b) {
        ArrayList<Button> adjacentOpenSpaces = new ArrayList<>();
        if (b == but1) {
            int i = Arrays.asList(buttonArray).indexOf(b);
            Collections.addAll(adjacentOpenSpaces, buttonArray[i + 1], buttonArray[i + 4]);
            return adjacentOpenSpaces;
        }
        else if (b == but2 || b == but3) {
            int i = Arrays.asList(buttonArray).indexOf(b);
            Collections.addAll(adjacentOpenSpaces,buttonArray[i-1], buttonArray[i + 1], buttonArray[i + 4]);
            return adjacentOpenSpaces;
        }
        else if (b == but4) {
            int i = Arrays.asList(buttonArray).indexOf(b);
            Collections.addAll(adjacentOpenSpaces,buttonArray[i-1], buttonArray[i + 4]);
            return adjacentOpenSpaces;
        }
        else if (b == but5 || b == but9) {
            int i = Arrays.asList(buttonArray).indexOf(b);
            Collections.addAll(adjacentOpenSpaces,buttonArray[i - 4], buttonArray[i + 1], buttonArray[i + 4]);
            return adjacentOpenSpaces;
        }
        else if (b == but6 || b == but7 || b == but10 || b == but11) {
            int i = Arrays.asList(buttonArray).indexOf(b);
            Collections.addAll(adjacentOpenSpaces,buttonArray[i-1], buttonArray[i + 1], buttonArray[i + 4], buttonArray[i - 4]);
            return adjacentOpenSpaces;
        }
        else if (b == but8 || b == but12) {
            int i = Arrays.asList(buttonArray).indexOf(b);
            Collections.addAll(adjacentOpenSpaces,buttonArray[i-1], buttonArray[i - 4], buttonArray[i + 4]);
            return adjacentOpenSpaces;
        }
        else if (b == but13) {
            int i = Arrays.asList(buttonArray).indexOf(b);
            Collections.addAll(adjacentOpenSpaces, buttonArray[i + 1], buttonArray[i - 4]);
            return adjacentOpenSpaces;
        }
        else if (b == but14 || b == but15) {
            int i = Arrays.asList(buttonArray).indexOf(b);
            Collections.addAll(adjacentOpenSpaces,buttonArray[i-1], buttonArray[i + 1], buttonArray[i - 4]);
            return adjacentOpenSpaces;
        }
        else if (b == but16) {
            int i = Arrays.asList(buttonArray).indexOf(b);
            Collections.addAll(adjacentOpenSpaces,buttonArray[i-1], buttonArray[i - 4]);
            return adjacentOpenSpaces;
        }
        else {
            return null;
        }
    }

    //resets all buttons to original position

    public void reset() {
        for (int i = 1; i < buttonArray.length; i++) {
            buttonArray[i - 1].setText(Integer.toString(i));
        }
        but16.setText("");
    }
}
