package team.CY.calculator.erros;

import android.app.Activity;
import android.os.Handler;
import android.widget.TextView;

import team.CY.calculator.R;

public class ZeroHighDigit extends BaseError{
    public ZeroHighDigit(String mes){
        super(mes);
    }

    public void handle(Activity activity,String tip) {
        super.Handle(activity,tip);
    }
}
