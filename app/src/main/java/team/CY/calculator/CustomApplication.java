package team.CY.calculator;

import android.app.Application;

import java.util.ArrayList;

public class CustomApplication extends Application {
    private ArrayList<Character> InputStream,OutputStream;
    private boolean clicked = false;

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
}
