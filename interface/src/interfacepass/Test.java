package interfacepass;

public class Test {
   IG ig = new Teacher();
   IH ih = new Teacher();
}
interface IH{}
interface IG extends IH{}
class Teacher implements IG{

}
