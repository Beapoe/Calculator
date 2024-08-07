package team.CY.calculator.erros;

import android.app.Activity;

import java.util.ArrayList;
import java.util.stream.Collectors;

import team.CY.calculator.CustomApplication;

public class Checker {
    private final Activity activity;

    public Checker(Activity nactivity){
        activity = nactivity;
    }

    //特殊方法
    private static <T> ArrayList<T> FindAndRemove(ArrayList<T> origin,ArrayList<T> elements){
        ArrayList<T> processed = new ArrayList<>();
        for (T toRemove:elements) {
            processed.addAll(origin.stream().filter(element -> element == toRemove).collect(Collectors.toList()));
        }
        return RemoveDuplicates(processed);
    }

    private static <T> ArrayList<T> RemoveDuplicates(ArrayList<T> rawList){
        ArrayList<T> unique = new ArrayList<>();
        for (T item:rawList) {
            if(!unique.contains(item)) unique.add(item);
        }
        return unique;
    }

    //功能实现
    public boolean ZeroHighDigit_Check(){
        CustomApplication app = (CustomApplication) activity.getApplication();
        ArrayList<Character> is = app.getInputStream();
        boolean MetZero = false;
        boolean Fault = false;
        for (Character data:is) {
            if(data=='0' && !MetZero){
                MetZero=true;
                ArrayList<Character> numbers = new ArrayList<>(app.getJudgementCharacterSet().subList(11,21));
                if(is.get(is.indexOf(data)+1)=='√' || is.get(is.indexOf(data)+1)=='±' || numbers.contains(is.get(is.indexOf(data)+1))) Fault=true;
            }
        }
        return Fault;
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
            if(current_data == '%' || app.getJudgementCharacterSet().subList(0,11).contains(current_data)){
                PCSWithNumber = true;
                break;
            }
        }
        return PCSWithNumber;
    }


}
