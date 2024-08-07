package team.CY.calculator;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class main extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }


    //功能性方法
    public void calc(){
        //三级运算处理

    }


    //特殊方法实现
    private void IS_addCharacter(char data) {
        CustomApplication app = (CustomApplication) getApplication();
        ArrayList<Character> is = app.getInputStream();
        is.add(data);
        app.setInputStream(is);
    }

    private void ButtonClickedCheck() {
        CustomApplication app = (CustomApplication) getApplication();
        boolean clicked = app.isClicked();
        if (!clicked) {
            TextView Equation = findViewById(R.id.Equation);
            Equation.setText("");
            app.setClicked(true);
        }
    }

    public double Square(){
        CustomApplication app = (CustomApplication) getApplication();
        ArrayList<Character> is = app.getInputStream();

    }


    //OnClick方法
    @SuppressLint("SetTextI18n")
    private void Equation_TextEcho(String data) {
        ButtonClickedCheck();
        TextView Equation = findViewById(R.id.Equation);
        Equation.setText(Equation.getText() + data);
    }

    @SuppressLint("SetTextI18n")
    public void PCS_OnClick(View v) {
        IS_addCharacter('%');
        Equation_TextEcho("%");
    }

    public void RS_OnClick(View v) {
        IS_addCharacter('√');
        Equation_TextEcho("√");
    }

    public void Sq_OnClick(View v) {
        IS_addCharacter('²');
        Equation_TextEcho("²");
    }

    @SuppressLint("SetTextI18n")
    public void OIX_OnClick(View v) {
        IS_addCharacter('/');
        TextView Equation = findViewById(R.id.Equation);
        Equation.setText("1/" + Equation.getText().toString());
    }

    public void CE_OnClick(View v) {
        CustomApplication app = (CustomApplication) getApplication();
        ArrayList<Character> is = app.getInputStream();
        is.clear();
        is.add('0');
        app.setInputStream(is);
        TextView Equation = findViewById(R.id.Equation);
        Equation.setText("0");
    }

    public void CA_OnClick(View v) {
        CustomApplication app = (CustomApplication) getApplication();
        ArrayList<Character> is = app.getInputStream();
        ArrayList<Character> os = app.getOutputStream();
        is.clear();
        os.clear();
        is.add('0');
        os.add('0');
        app.setInputStream(is);
        app.setOutputStream(os);
        TextView Equation = findViewById(R.id.Equation);
        TextView Result = findViewById(R.id.Result);
        Equation.setText("0");
        Result.setText("0");
    }

    public void B_OnClick(View v) {
        TextView Equation = findViewById(R.id.Equation);
        Equation.setText(Equation.getText().toString().substring(0, Equation.getText().toString().length() - 1));
        //This is the longest function call statement I've ever written
        CustomApplication app = (CustomApplication) getApplication();
        ArrayList<Character> is = app.getInputStream();
        is.remove(is.size() - 1);
        app.setInputStream(is);
    }

    public void DS_OnClick(View v) {
        IS_addCharacter('÷');
        Equation_TextEcho("÷");
    }

    public void Se_OnClick(View v) {
        IS_addCharacter('7');
        Equation_TextEcho("7");
    }

    public void E_OnClick(View v) {
        IS_addCharacter('8');
        Equation_TextEcho("8");
    }

    public void N_OnClick(View v) {
        IS_addCharacter('9');
        Equation_TextEcho("9");
    }

    public void MS_OnClick(View v) {
        IS_addCharacter('x');
        Equation_TextEcho("x");
    }

    public void F_OnClick(View v) {
        IS_addCharacter('4');
        Equation_TextEcho("4");
    }

    public void Fi_OnClick(View v) {
        IS_addCharacter('5');
        Equation_TextEcho("5");
    }

    public void S_OnClick(View v) {
        IS_addCharacter('6');
        Equation_TextEcho("6");
    }

    public void MiS_OnClick(View v) {
        IS_addCharacter('-');
        Equation_TextEcho("-");
    }

    public void O_OnClick(View v) {
        IS_addCharacter('1');
        Equation_TextEcho("1");
    }

    public void T_OnClick(View v) {
        IS_addCharacter('2');
        Equation_TextEcho("2");
    }

    public void Th_OnClick(View v) {
        IS_addCharacter('3');
        Equation_TextEcho("3");
    }

    public void PS_OnClick(View v) {
        IS_addCharacter('+');
        Equation_TextEcho("+");
    }

    public void Si_OnClick(View v) {
        IS_addCharacter('±');
        Equation_TextEcho("±");
    }

    public void Z_OnClick(View v) {
        IS_addCharacter('0');
        Equation_TextEcho("0");
    }

    public void D_OnClick(View v) {
        IS_addCharacter('.');
        Equation_TextEcho(".");
    }

    public void Eq_OnClick(View v) {
        IS_addCharacter('=');
        Equation_TextEcho("=");
    }
}
