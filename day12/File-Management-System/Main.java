import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    FileManager fm = new FileManager();
	    int ch = 0;
	    do{
	        System.out.println("\t##File Management System##");
	        System.out.println("1. Upload File");
	        System.out.println("2. Rename File");
	        //System.out.println("3. Update File");
	        System.out.println("3. Delete File");
	        System.out.println("4. Display Files");
	        //System.out.println("6. Close");
	        System.out.print("\nSelect an Option: ");
	        ch = sc.nextInt();
	        switch(ch){
	            case 1:
	                System.out.print("Enter File Name: ");
	                String name = sc.next();
	               // System.out.print("Enter File type: ");
	               // String type = s.next();
	                MyFiles file = new MyFiles(name);
	                file.setFid(file);
	                //System.out.println(file.getId());
	                file.setType(name);
	                //System.out.println(file.getType());
	                fm.uploadFile(file);
	                break;
	            case 2:
	                System.out.print("Enter Current File Name: ");
	                String current = sc.next();
	                System.out.print("Enter New File name: ");
	                String newName = sc.next();
	                //System.out.println(MyFiles.getExe(current) + " " + MyFiles.getExe(newName));
	                if(MyFiles.getExe(current).equals(MyFiles.getExe(newName))){
	                    fm.renameFile(current, newName);
	                }
	                break;
	            //case 3:
	                //break;
	            case 3:
	                System.out.print("Enter File name to delete: ");
	                String fname = sc.next();
	                fm.deleteFile(fname);
	                break;
	            case 4:
	                String folder = "";
	                do{
	                    System.out.println("Audio");
                        System.out.println("Image");
                        System.out.println("Video");
                        System.out.println("Documents");
                        System.out.println("Exit");
                        System.out.print("Enter folder name to view Files: ");
                        folder = sc.next().toLowerCase();
                        if(folder.equals("audio") || folder.equals("image")
                        || folder.equals("video") || folder.equals("documents"))
                            fm.displayFiles(folder);
                        else
                            folder = "exit";
                        System.out.println();
                    }while(!folder.equals("exit"));
                    System.out.println("File Display mode exited");
	                break;
	            default:
	                System.out.println("Exited File Explorer");
	        }
	        System.out.println();
	    }while(ch < 5);
	}
}