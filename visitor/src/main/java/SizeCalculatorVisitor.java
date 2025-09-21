public class SizeCalculatorVisitor implements FileSystemVisitor{

    public int size = 0;
    @Override
    public void visit(File file){
        size += file.size;
    }

    @Override
    public void visit(Directory directory){
        for(FileSystemElement element : directory.subElements.values()){
            element.accept(this);
        }
    }
}
