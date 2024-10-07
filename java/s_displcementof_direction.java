public class s_displcementof_direction {
    public static float getdisplesment(String path){
        int X=0;
        int Y=0;
        for (int i = 0; i < path.length(); i++) {
            char dir=path.charAt(i);

            //east
            if (dir=='E') {
                X++;
            }
            //west
            if (dir=='W') {
                X--;
                
            }if (dir=='N') {
                Y++;
            }if (dir=='S'){
                Y--;
            }
        }
        int X2=X*X;
            int Y2=Y*Y;
        return (float)Math.sqrt(X2+Y2);
    }
    public static void main(String[] args) {
        String path="WNEENESENN";
        
        System.out.println(getdisplesment(path));
    }
}
