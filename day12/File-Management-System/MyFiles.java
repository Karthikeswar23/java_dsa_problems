public class MyFiles{
    private String Fid;
    private String Fname;
    private String type;
    MyFiles(String name){
        //Fid = id;
        Fname = name;
        //this.type = type;
    }
    void setFid(MyFiles id){
        Fid = id.toString();
    }
    String getId(){
        return Fid;
    }
    void setFname(String name){
        Fname = name;
    }
    String getName(){
        return Fname;
    }
    void setType(String name){
        if(name.endsWith(".mp3") || name.endsWith(".wav"))
            type = "audio";
        else if(name.endsWith(".mp4") || name.endsWith(".mkv"))
            type = "video";
        else if(name.endsWith(".jpg") || name.endsWith(".jpeg") 
        || name.endsWith(".png") || name.endsWith(".gif"))
            type = "image";
        else if(name.endsWith(".txt") || name.endsWith(".py") 
        || name.endsWith(".java") ||name.endsWith(".c"))
            type = "documents";
        else
            type = null;
    }
    String getType(){
        return type;
    }
    static String getExe(String name){
        String temp = "";
        for(int i = name.length()-1; name.charAt(i) != '.'; i--)
            temp += name.charAt(i);
        String res = ".";
        for(int i = temp.length()-1; i >= 0; i--)
            res += temp.charAt(i);
        return res;
    }
}