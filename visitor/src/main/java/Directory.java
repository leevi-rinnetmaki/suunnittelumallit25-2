import java.util.HashMap;

public class Directory implements FileSystemElement{

    public String name;
    public HashMap<String, FileSystemElement> subElements;

    public Directory(String name){
        this.name=name;
        subElements=new HashMap<>();
    }

    @Override
    public void accept(FileSystemVisitor visitor){
        visitor.visit(this);
    }
}