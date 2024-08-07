package team.CY.calculator.erros;

import android.app.Activity;

public class NoBaseNumber extends BaseError{
    public NoBaseNumber(String mes) {
        super(mes);
    }

    public void handle(Activity activity,String tip){
        super.Handle(activity,tip);
    }
}
