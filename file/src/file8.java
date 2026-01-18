public class file8 {
    public static void main(String[] args) {
        BufferedReader_ bufferedReader = new BufferedReader_(new fileReader());
        bufferedReader.readfile(10);
        BufferedReader_ bufferedReader1 = new BufferedReader_(new StringReader_());
        bufferedReader1.readstring(10);
    }
}

abstract class Reader_ {
    public void readFile(){}
    public void readstring(){}
}

class fileReader extends Reader_ {
    public void readFile(){
        System.out.println("读取文件");
    }
}

class StringReader_ extends Reader_ {
    public void readstring(){
        System.out.println("读取字符串");
    }
}

class BufferedReader_ extends Reader_ {
    private Reader_ reader_;
    public BufferedReader_(Reader_ reader_){
        this.reader_ = reader_;
    }
    public void readfile(int num){
        for (int i = 0; i < num; i++) {
            reader_.readFile();
        }
    }
    public void readstring(int num){
        for (int i = 0; i < num; i++) {
            reader_.readstring();
        }
    }
}