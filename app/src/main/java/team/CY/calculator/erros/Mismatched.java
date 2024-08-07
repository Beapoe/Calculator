package team.CY.calculator.erros;

import android.app.Activity;

public class Mismatched extends BaseError{
    public Mismatched(String mes) {
        super(mes);
    }

    public void handle(Activity activity){
        super.Handle(activity,"错误搭配");
    }
}
