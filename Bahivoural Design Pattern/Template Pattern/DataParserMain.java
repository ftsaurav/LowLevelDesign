abstract class DataParser{
    public final void parse(){
        openFile();
        parseFile();
        closeFile();
    }
    public void openFile()
    {
        System.out.println("Opening the File");
    }
    public void closeFile()
    {
        System.out.println("Closing the File");
    }
    abstract void parseFile();
}
class CSVParser extends DataParser
{

    @Override
    void parseFile() {
        System.out.println("Parsing CSV File");
    }
    
}
class JSONParser extends DataParser
{

    @Override
    void parseFile() {
        System.out.println("Parsing JSON File");
    }
    
}
public class DataParserMain {
    public static void main(String[] args) {
        DataParser dp1= new CSVParser();
        DataParser dp2= new JSONParser();
        dp1.parse();
        dp2.parse();
    }
    
    
}
