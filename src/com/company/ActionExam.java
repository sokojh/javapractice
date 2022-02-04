package com.company;

public class ActionExam {
//    Action action = new MyAction();
//    action.exec();
    Action action =new Action() {
    @Override
    public void exec() {
        System.out.println("exec");
    }
};
   // action.exec();
}
