package com.sinixcode.tic_tac_toe;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.ContentInfoCompat;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
public Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9;
public Button reset;
public String b1,b2,b3,b4,b5,b6,b7,b8,b9;
TextView txtv;
int flag = 0;
int count =0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        reset = findViewById(R.id.reset);
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn1.setEnabled(true);
                btn2.setEnabled(true);
                btn3.setEnabled(true);
                btn4.setEnabled(true);
                btn5.setEnabled(true);
                btn6.setEnabled(true);
                btn7.setEnabled(true);
                btn8.setEnabled(true);
                btn9.setEnabled(true);

                btn1.setText("");
                btn2.setText("");
                btn3.setText("");
                btn4.setText("");
                btn5.setText("");
                btn6.setText("");
                btn7.setText("");
                btn8.setText("");
                btn9.setText("");
                

                txtv.setText("Lets Play Again...");
            }
        });

        txtv = findViewById(R.id.winner);

        btn1 = findViewById(R.id.btn1);

        btn2 = findViewById(R.id.btn2);

        btn3 = findViewById(R.id.btn3);

        btn4 = findViewById(R.id.btn4);

        btn5 = findViewById(R.id.btn5);

        btn6 = findViewById(R.id.btn6);

        btn7 = findViewById(R.id.btn7);

        btn8 = findViewById(R.id.btn8);

        btn9 = findViewById(R.id.btn9);
    }

    public void Check(View view){
        Button btnCurrent = (Button) view;
        count++;
        if(flag == 0){
            btnCurrent.setText("X");
            flag=1;
        }
        else{
            btnCurrent.setText("O");
            flag=0;
        }

        if(count>1){
            b1=btn1.getText().toString();
            b2=btn2.getText().toString();
            b3=btn3.getText().toString();
            b4=btn4.getText().toString();
            b5=btn5.getText().toString();
            b6=btn6.getText().toString();
            b7=btn7.getText().toString();
            b8=btn8.getText().toString();
            b9=btn9.getText().toString();

        //Conditions
        if (b1.equals(b2) && b2.equals(b3) && !b1.equals("")){
            txtv.setText("Winner is "+ b1);
            disablebtn();

        } else if (b4.equals(b5) && b5.equals(b6) && !b4.equals("")) {
            txtv.setText("Winner is "+ b4);
            disablebtn();

        } else if (b7.equals(b8) && b8.equals(b9) && !b7.equals("")) {
            txtv.setText("Winner is "+ b7);
            disablebtn();

        } else if (b1.equals(b4) && b4.equals(b7) && !b1.equals("")) {
            txtv.setText("Winner is "+ b1);
            disablebtn();

        } else if (b2.equals(b5) && b5.equals(b8) && !b2.equals("")) {
            txtv.setText("Winner is "+ b2);
            disablebtn();

        } else if (b3.equals(b6) && b6.equals(b9) && !b3.equals("")) {
            txtv.setText("Winner is "+ b3);
            disablebtn();

        } else if (b1.equals(b5) && b5.equals(b9) && !b1.equals("")) {
            txtv.setText("Winner is "+ b1);
            disablebtn();
        } else if (b3.equals(b5) && b5.equals(b7) && !b3.equals("")) {
            txtv.setText("Winner is "+ b3);
            disablebtn();
        } else if (!b1.equals("") && !b2.equals("") && !b3.equals("") && !b4.equals("") && !b5.equals("") && !b6.equals("") && !b7.equals("") && !b8.equals("") && !b9.equals("")) {
            disablebtn();
            txtv.setText("Match Draw");
        }
        }
    }

    public void disablebtn(){
        btn1.setEnabled(false);
        btn2.setEnabled(false);
        btn3.setEnabled(false);
        btn4.setEnabled(false);
        btn5.setEnabled(false);
        btn6.setEnabled(false);
        btn7.setEnabled(false);
        btn8.setEnabled(false);
        btn9.setEnabled(false);
    }
    public void disablebtn(Button btn){
        btn.setEnabled(false);
    }
}

