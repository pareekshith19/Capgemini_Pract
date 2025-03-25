public class problem7 {
    public static void main(String[] args){
        double radius = 6378;
        double volumeinkm = (4/3)*3.14*Math.pow(radius,3);
        double volumeinmiles = volumeinkm*1.6;
        System.out.printf("The volume of earth in cubic kilometers is %f and cubic miles is %f",volumeinkm,volumeinmiles);
    }
    
}
