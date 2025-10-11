package polypar;

import polyarr.Teacher;

public class Test {
    public static void main(String [] args){
        Worker tom = new Worker("tom", 2500);
        Manger milan = new Manger("milan", 5000, 200000);
        Test ployParameter = new Test();
        ployParameter.showEmpAnnual(tom);
        ployParameter.showEmpAnnual(milan);
        ployParameter.worktest(tom);
        ployParameter.worktest(milan);
    }
    public void showEmpAnnual(Polyee e){
        System.out.println(e.getaun());
    }
    public void  worktest(Polyee e){
        if(e instanceof Worker){
            ((Worker)e).work();
        }
        if(e instanceof Manger){
            ((Manger)e).manger();
        }
    }
}
