package th.ac.su.smartvote;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class CheckActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check);


        //final int B = Integer.parseInt(A);

        Button checkButton = findViewById(R.id.button_check);

        checkButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                 EditText numberEditText = findViewById(R.id.button_input);
                 String num = numberEditText.getText().toString();

                if(numberEditText.length() != 13){
                    Toast t = Toast.makeText(CheckActivity.this,"กรุณากรอกหมายเลขบัตรประชาชน 13 หลัก",Toast.LENGTH_LONG);
                    t.show();
                }
                else {
                    if(num.equals("1111111111111") || num.equals("2222222222222") ){
                        AlertDialog.Builder dialog = new AlertDialog.Builder(CheckActivity.this);
                        dialog.setTitle("ผลการตรวจสอบสิทธิเลือกตั้ง");
                        dialog.setMessage("คุณเป็นผู้มีสิทธิเลือกตั้ง");
                        dialog.setNegativeButton("OK", null);
                        dialog.show();


                    }
                    else{
                        AlertDialog.Builder dialog = new AlertDialog.Builder(CheckActivity.this);
                        dialog.setTitle("ผลการตรวจสอบสิทธิเลือกตั้ง");
                        dialog.setMessage("คุณไม่มีมีสิทธิเลือกตั้ง");
                        dialog.setNegativeButton("OK", null);
                        dialog.show();

                    }
                }

            }
        });
    }
}