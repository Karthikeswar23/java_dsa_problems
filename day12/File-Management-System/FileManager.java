interface FileOperations{
    public void uploadFile(MyFiles file);
    public void renameFile(String current, String newName);
    // public void updateFile();
    public void deleteFile(String name);
    public void displayFiles(String folder);
}

public class FileManager implements FileOperations{
    private static final int memory = 100;
    MyFiles[] myFiles = new MyFiles[memory];
    private int cnt = 0;
    //private int fNameCnt = 0;
    
    @Override
    public void uploadFile(MyFiles file){
        if(cnt < memory && file.getType() != null){
            myFiles[cnt++] = file;
            System.out.println("Uploaded in " + file.getType() + "-Folder Successfully");
        }
        else
            System.out.println("Invalid File Type (Please specify appropiate extension");
    }
    
    @Override
    public void renameFile(String current, String newName){
        for(int i = 0; i < memory; i++){
            try{
                if(current.equals(myFiles[i].getName())){
                    myFiles[i].setFname(newName);
                    System.out.println("File " + current + " renamed as " + newName);
                    break;
                }
            }
            catch(Exception e){
                System.out.println(current + " Does not exist in the directory");
                break;
            }
        }
    }
    
    @Override
    public void deleteFile(String name){
        int flag = 0;
        for(int i = 0; i < memory; i++){
            if(name.equals(myFiles[i].getName())){
                myFiles[i] = null;
                System.out.println(name + " was Deleted from Directory");
                flag = 1;
                break;
            }
        }
        if(flag == 0)
            System.out.println(name + " Did Not exist in the  Directory");
    }
    
    @Override
    public void displayFiles(String folder){
        if(!folder.equals("exit")){
            System.out.println("\n~/" + folder);
            for(int i = 0; i < memory; i++){
                if(myFiles[i] != null && folder.equals(myFiles[i].getType()))
                    System.out.println("  |-" +myFiles[i].getName());
            }
        }
    }
}