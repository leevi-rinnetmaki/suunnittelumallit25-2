public class SearchVisitor implements FileSystemVisitor{

    public int matches = 0;
    public String subString;
    @Override
    public void visit(File file){
        if(file.name.contains(subString)){
            matches++;
        }
    }

    @Override
    public void visit(Directory directory){
        if(directory.name.contains(subString)){
            matches++;
        }
        for(FileSystemElement element : directory.subElements.values()){
            element.accept(this);
        }
    }
}
