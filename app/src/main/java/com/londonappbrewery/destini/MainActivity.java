package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    TextView mStory;
    Button mTopButton,mBottomButton;
    String mT1Story, mT1Ans1,mT1Ans2;
    String mT2Story,mT2Ans1,mT2Ans2;
    String mT3Story,mT3Ans1,mT3Ans2;
    String mT4End,mT5End,mT6End;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        mStory = (TextView) findViewById(R.id.storyTextView);
        mTopButton = (Button) findViewById(R.id.buttonTop);
        mBottomButton = (Button) findViewById(R.id.buttonBottom);

        mT1Story = getString(R.string.T1_Story);
        mT1Ans1 = getString(R.string.T1_Ans1);
        mT1Ans2 = getString(R.string.T1_Ans2);
        mT2Story = getString(R.string.T2_Story);
        mT2Ans1 = getString(R.string.T2_Ans1);
        mT2Ans2 = getString(R.string.T2_Ans2);
        mT3Story = getString(R.string.T3_Story);
        mT3Ans1 = getString(R.string.T3_Ans1);
        mT3Ans2 = getString(R.string.T3_Ans2);
        mT4End = getString(R.string.T4_End);
        mT5End = getString(R.string.T5_End);
        mT6End = getString(R.string.T6_End);

        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
        mTopButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mTopButton.getText() == mT1Ans1 || mTopButton.getText() == mT2Ans1){
                    mStory.setText(mT3Story);
                    mTopButton.setText(mT3Ans1);
                    mBottomButton.setText(mT3Ans2);
                } else if(mTopButton.getText() == mT3Ans1){
                    mStory.setText(mT6End);
                    mTopButton.setVisibility(View.INVISIBLE);
                    mBottomButton.setVisibility(View.INVISIBLE);
                }
            }
        });



        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:
        mBottomButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mBottomButton.getText() == mT1Ans2){
                    mStory.setText(mT2Story);
                    mTopButton.setText(mT2Ans1);
                    mBottomButton.setText(mT2Ans2);
                }else if(mBottomButton.getText() == mT2Ans2){
                    mStory.setText(mT4End);
                    mTopButton.setVisibility(View.INVISIBLE);
                    mBottomButton.setVisibility(View.INVISIBLE);
                } else if(mBottomButton.getText() == mT3Ans2){
                    mStory.setText(mT5End);
                    mTopButton.setVisibility(View.INVISIBLE);
                    mBottomButton.setVisibility(View.INVISIBLE);
                }
            }
        });

    }
}
