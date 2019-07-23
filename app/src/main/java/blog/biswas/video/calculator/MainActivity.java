package blog.biswas.video.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvNumber;
    int operation = 0;
    int num1 = 0;
    int num2 = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvNumber = findViewById(R.id.tvNumber);
    }

    public void setText(View view) {
        tvNumber.setText(tvNumber.getText().toString() + view.getTag().toString());

    }

    public void setOperation(View view) {
        num1 = Integer.parseInt(tvNumber.getText().toString());
        tvNumber.setText("");
        operation = Integer.parseInt(view.getTag().toString());


    }
    public void setEqual(View view){
        num2 = Integer.parseInt(tvNumber.getText().toString());

        if(operation == 1){
            int result = num1+num2;
            String finalResult = String.valueOf(result);
            tvNumber.setText(finalResult);
        }else if(operation == 2){
            int result = num1-num2;
            String finalResult = String.valueOf(result);
            tvNumber.setText(finalResult);
        }else if(operation == 3){
            int result = num1*num2;
            String finalResult = String.valueOf(result);
            tvNumber.setText(finalResult);
        }else if(operation == 4){
            int result = num1/num2;
            String finalResult = String.valueOf(result);
            tvNumber.setText(finalResult);
        }
    }
    public void cleanMemory(View view){
        tvNumber.setText("");
    }

    public void substracSrting(View view){
        String str = tvNumber.getText().toString();
        String[] parts = str.split("\\.");

        if(parts[1].length() > 1){
            str = str.substring(0, str.length() - 1);
        }else {
            str = str.substring(0, str.length() - 2);
        }
        tvNumber.setText(str);
    }


    ///public void clear(View view) {
//        String str = textView.getText().toString();
//        String[] parts = str.split("\\.");
//
//        if(parts[1].length() > 1){
//            str = str.substring(0, str.length() - 1);
//        }else {
//            str = str.substring(0, str.length() - 2);
//        }
//
//        textView.setText(str);



}



//    public void operation(View view) {
//            if(textView.getText().toString() != null || !textView.getText().toString().equal("")){
//                var1 = Double.parseDouble(textView.getText().toString());
//                textView.setText("");
//                operation = Integer.parseInt(view.getTag().toString());
//            }
//            else
//            {
//                Toast.makeText(context, "Please enter valid number", Toast.LENGTH_SHORT).show();
//            }
//    }
//




