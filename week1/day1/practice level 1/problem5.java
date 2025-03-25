public class problem5 {
    public static void main(String[] args){
        int pens = 14;
        int students = 3;
        int pensdistributed = pens/students;
        double leftoverpens = pens%students;
        System.out.printf("The Pen Per Student is %d and the remaining pen not distributed is %.2f" ,pensdistributed,leftoverpens);
    }
}
