package team.CY.calculator.erros;

import android.app.Activity;

import java.util.ArrayList;

import team.CY.calculator.CustomApplication;

public class Checker {
    private Activity activity;

    public Checker(Activity nactivity){
        activity = nactivity;
    }
    public boolean ZeroHighDigit_Check(){
        CustomApplication app = (CustomApplication) activity.getApplication();
        ArrayList<Character> is = app.getInputStream();
        boolean MetZero = false;
        boolean MetNonZero = false;
        for (Character data:is) {
            if(data == '0' && !MetNonZero){
                MetZero = true;
            }else if(data!='%' && data!='√' && data!='²' && data!='/' && data!='÷' && data!='x' && data!='-' && data!='+' && data!='±' && data!='.' && data!='='){
                MetNonZero = true;
            }
        }
        return MetZero;
    }

    public boolean PCSWithNumber_Check(){
        CustomApplication app = (CustomApplication) activity.getApplication();
        ArrayList<Character> is = app.getInputStream();
        int counter = 0;
        Character data;
        boolean PCSWithNumber = false;
        for (Character current_data :is) {
            counter++;
            data = is.get(counter+1);
            if(current_data == '%' && data!='√' && data!='²' && data!='/' && data!='÷' && data!='x' && data!='-' && data!='+' && data!='±' && data!='.' && data!='='){
                PCSWithNumber = true;
                break;
            }
        }
        return PCSWithNumber;
    }
}
