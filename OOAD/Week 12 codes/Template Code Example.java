// Template Code Example

abstract class BasicEngineering {

    // Making method final to prevent overriding
    public final void completeCourse () {
        completeMath();
        completeSoftSkills();
        completeSpecialPaper();
    }

    private void completeMath () {
        System.out.println("1. Maths");
    }

    private void completeSoftSkills () {
        System.out.println("2. Soft Skills");
    }

    public abstract void completeSpecialPaper();
}

// Sub Classes
class ComputerScience extends BasicEngineering {
    
    @Override
    public void completeSpecialPaper () {
        System.out.println("3. OOP");
    }

}

class Electronics extends BasicEngineering {

    @Override
    public void completeSpecialPaper () {
        System.out.println("3. Digital Logic and Circuit Theory");
    }

}

// main function
public class TemplateMethodPatternExample {
    public static void main (Strings args[]) {
        
        //CS 
        BasicEngineering preferredCourse = new ComputerScience();
        System.out.println("CS course will be completed in following order: ");

        preferredCourse.completeCourse();

        // Electronics
        preferredCourse = new Electronics();
        System.out.println("Electronics course will be completed in following order: ");
        preferredCourse.completeCourse();
    }
}