package team.CY.calculator.erros;

import android.app.Activity;
import android.os.Handler;
import android.widget.TextView;

import team.CY.calculator.R;

public class BaseError extends Exception{
    public BaseError(String mes){
        super(mes);
    }

    public void Handle(Activity activity,String tip){
        TextView Equation = activity.findViewById(R.id.Equation);
        String text = Equation.getText().toString();
        Equation.setText("");
        Equation.setText(tip);
        Runnable recovery = new Runnable() {
            @Override
            public void run() {
                Equation.setText(text);
            }
        };
        Handler handler = new Handler();
        handler.postDelayed(recovery,3000);
    }
}
