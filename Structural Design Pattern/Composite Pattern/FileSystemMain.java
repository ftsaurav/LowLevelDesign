import java.util.ArrayList;
import java.util.List;

interface FileSystemComponent {
    void showDetails();
}
class File implements FileSystemComponent {
    private String name;

    public File(String name){
        this.name = name;
    }

    public void showDetails(){
        System.out.println("File : " +name);
    }
}

class Folder implements FileSystemComponent{
    private String name;
    private List<FileSystemComponent> components = new ArrayList<>();

    public Folder(String name){
        this.name = name;
    }

    public void addComponent(FileSystemComponent component){
        components.add(component);
    }

    public void showDetails(){
        System.out.println("Folder: " + name);
        for(FileSystemComponent component:components){
            component.showDetails();
        }
    }
}
public class FileSystemMain {
    public static void main(String[] args) {
        FileSystemComponent file1 = new File("File1.txt");
        FileSystemComponent file2 = new File("File2.txt");
        Folder folder = new Folder("Documents");
        folder.addComponent(file1);
        folder.addComponent(file2);

        //Subfolder
        Folder subfolder = new Folder("Subfolder");
        FileSystemComponent file3 = new File("File3.txt");

        subfolder.addComponent(file3);
        folder.addComponent(subfolder);

        folder.showDetails();
    }
}
