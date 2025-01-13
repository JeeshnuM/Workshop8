public class GradeCalulator {
    public float grade;

    GradeCalulator(float grade){
        this.grade = grade;
    }

    String Grade(){
        if(grade <= 0){
            return "F";
        }
        else if(grade >= 85 ||grade <= 100){
            return "A";
        }
        else if(grade >= 70 || grade <= 84){
            return "B";
        }
        else if(grade <= 60 || grade <= 69){
            return "C";
        }
        else{
            return "D";
        }
    }
}
