package team.CY.calculator;

import android.app.Application;

import java.util.ArrayList;
import java.util.Arrays;

public class CustomApplication extends Application {
    private ArrayList<Character> InputStream,OutputStream;
    private boolean clicked = false;
    private final ArrayList<Character> JudgementCharacterSet = new ArrayList<>(Arrays.asList('%','√','²','/','÷','x','-','+','±','.','=','1','2','3','4','5','6','7','8','9','0'));

    public ArrayList<Character> getInputStream(){
        if(InputStream == null){
            InputStream = new ArrayList<>();
            return InputStream;
        }else{
            return InputStream;
        }
    }

    public void setInputStream(ArrayList<Character> nInputStream){
        InputStream = nInputStream;
    }

    public ArrayList<Character> getOutputStream(){
        if(OutputStream == null){
            OutputStream = new ArrayList<>();
            return OutputStream;
        }else{
            return OutputStream;
        }
    }

    public void setOutputStream(ArrayList<Character> nOutputStream){
        OutputStream = nOutputStream;
    }

    public boolean isClicked() {
        return clicked;
    }

    public void setClicked(boolean clicked) {
        this.clicked = clicked;
    }

    public ArrayList<Character> getJudgementCharacterSet() {
        return JudgementCharacterSet;
    }
}
