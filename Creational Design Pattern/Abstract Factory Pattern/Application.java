interface Button{
    void render();
}
interface ScrollBar{
    void scroll();
}
class WindowsButton implements Button{
    @Override
    public void render()
    {
        System.out.println("Rendering Windows Button");
    }
}
class MacOSButton implements Button{
    @Override
    public void render()
    {
        System.out.println("Rendering MacOS Button");
    }
}
class WindowsScroll implements ScrollBar{
    @Override
    public void scroll()
    {
        System.out.println("Scolling Windows");
    }
}
class MacOSScroll implements ScrollBar{
    @Override
    public void scroll()
    {
        System.out.println("Scrolling MacOS");
    }
}
interface UIFactory{
    Button createButton();
    ScrollBar createScroll();
}
class WindowsFactory implements UIFactory{
    @Override
    public Button createButton()
    {
        return new WindowsButton();
    }

    @Override
    public ScrollBar createScroll()
    {
        return new WindowsScroll();
    }
}
class MacOSFactory implements UIFactory{
    @Override
    public Button createButton()
    {
        return new MacOSButton();
    }

    @Override
    public ScrollBar createScroll()
    {
        return new MacOSScroll();
    }
}
public class Application {
    private Button button;
    private ScrollBar scrollBar;

    public Application(UIFactory factory)
    {
        this.button= factory.createButton();
        this.scrollBar= factory.createScroll();
    }

    public void renderUI()
    {
        button.render();
        scrollBar.scroll();
    }

    public static void main(String[] args) {
        Application app= new Application(new MacOSFactory());
        app.renderUI();
    }
}
