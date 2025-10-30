interface Command{
    void click();
}
class BoldClass implements Command
{
    TextEditor td= new TextEditor();
    public BoldClass(TextEditor textEditor)
    {
        this.td= textEditor;
    }
    @Override
    public void click()
    {
        td.boldText();
    }
}
class Button{
    private Command command;
    public void setCommand(Command command)
    {
        this.command= command;
    }
    public void click()
    {
        command.click();
    }
}
class TextEditor{
    
    public void boldText()
    {
        System.out.println("Text has been bold");
    }
    public void ItalicText()
    {
        System.out.println("Text has been Italic");
    }
    public void UnderlineText()
    {
        System.out.println("Text has been Underlined");
    }
}
public class TextEditorMain {
    public static void main(String[] args) {
        TextEditor td= new TextEditor();
        Button btn= new Button();
        btn.setCommand(new BoldClass(td));
        btn.click();

    }    
}
