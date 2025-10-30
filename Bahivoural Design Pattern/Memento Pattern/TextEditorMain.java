import java.util.Stack;

class CareTaker
{
    private final Stack<Memento> s= new Stack<>();

    public void saveState(TextEditor editor)
    {
        s.push(editor.save());
    }

    public void undo(TextEditor editor)
    {
        if(!s.isEmpty())
        {
            s.pop();
            editor.restore(s.peek());
        }
    }
}
class Memento
{
    private final String content;

    public Memento(String content)
    {
        this.content=content;
    }

    public String getContent()
    {
        return content;
    }
}
class TextEditor
{
    private String content;

    public void write(String text)
    {
        this.content=text;
    }

    public String getContent()
    {
        return content;
    }

    public Memento save()
    {
        return new Memento(content);
    }

    public void restore(Memento memento)
    {
        content= memento.getContent();
    }
}
public class TextEditorMain
{
    public static void main(String[] args)
    {
        TextEditor td= new TextEditor();
        CareTaker careTaker= new CareTaker();
        td.write("Hello world");
        careTaker.saveState(td);
        td.write("Hello Everyone");
        careTaker.saveState(td);
        careTaker.undo(td);

        System.out.println(td.getContent());
    }
}
