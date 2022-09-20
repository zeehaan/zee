package test2;

public class secondans2 {
    int length;    int width;    int height;
    public secondans2(int length, int width, int height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }
//    public void GetVolumeOfRectangle(){
//        if(length<=0 && width<=0 && height<=0)
//        {
//            System.out.println("Enter valid Value");
//        }
//        System.out.println("Volume of the Rectangle : "+length*width*height);
//    }
    public void ModifySizeOfTheRectangle( int value){
       length*=value;
       width*=value;
       height*=value;
    }
    public int GetLength(){
       return length;
    }
    public int GetWidth(){
        return width;
    }
    public int GetHeight(){
       return height;
    }
    public int Getvolume(){
        return length*width*height;
    }


}
