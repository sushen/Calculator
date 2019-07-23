package blog.biswas.video.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView tvNumber;
    double operation = 0;
    double num1 = 0;
    double num2 = 0;


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

//        public void setOperation(View view) {
//            if(tvNumber.getText().toString() != null || !tvNumber.getText().toString().equal("")){
//                num1 = Double.parseDouble(tvNumber.getText().toString());
//                tvNumber.setText("");
//                operation = Integer.parseInt(view.getTag().toString());
//            }
//            else
//            {
//                Toast.makeText(context, "Please enter valid number", Toast.LENGTH_SHORT).show();
//            }
//    }


    public void setEqual(View view){
        num2 = Integer.parseInt(tvNumber.getText().toString());

        if(operation == 1){
            double result = num1+num2;
            String finalResult = String.valueOf(result);
            tvNumber.setText(finalResult);
        }else if(operation == 2){
            double result = num1-num2;
            String finalResult = String.valueOf(result);
            tvNumber.setText(finalResult);
        }else if(operation == 3){
            double result = num1*num2;
            String finalResult = String.valueOf(result);
            tvNumber.setText(finalResult);
        }else if(operation == 4){
            double result = num1/num2;
            String finalResult = String.valueOf(result);
            tvNumber.setText(finalResult);
        }
    }
    public void decimal(){
        Toast.makeText(getApplicationContext(),"I am Going to main activety",Toast.LENGTH_LONG)
                .show();
    }



    public void parcentise(){
        Toast.makeText(getApplicationContext(),"Hello",Toast.LENGTH_SHORT).show();
    }

    public void cleanMemory(View view){
        tvNumber.setText("");
    }


    public void substracSrting(View view){
        String str = tvNumber.getText().toString();
        if (str.length() >= 1){
            str = str.substring(0,str.length() - 1);
            tvNumber.setText(str);
        }else {
            tvNumber.setText("");
        }
    }

//    public void substracSrting(View view){
//        String str = tvNumber.getText().toString();
//        String[] parts = str.split("\\.");
//
//        if(parts[1].length() > 1){
//            str = str.substring(0, str.length() - 1);
//        }else {
//            str = str.substring(0, str.length() - 2);
//        }
//        tvNumber.setText(str);
//    }

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





