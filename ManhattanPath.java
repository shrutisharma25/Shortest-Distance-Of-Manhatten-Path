import java.util.Scanner;
class ManhattanPath{

    public static double shortestDistance(int X,int Y,String directions){
        int x=X,y=Y;
        directions=directions.toUpperCase();
        for(int i=0;i<directions.length();i++){
            char c=directions.charAt(i);
            if(c=='N'){
                y++;
            }
            if(c=='S'){
                y--;
            }
            if(c=='E'){
                x++;
            }
            if(c=='W'){
                x--;
            }
        }
        double distance=Math.sqrt( ( (Math.pow((x-X),2)) + (Math.pow((y-Y),2)) ) );
        return distance;
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int X=sc.nextInt();
        int Y=sc.nextInt();
        String directions=sc.next();
        System.out.format("%.1f", shortestDistance(X,Y,directions));
    }

}