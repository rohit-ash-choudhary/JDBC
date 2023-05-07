/*
we need stored data in database because the variable data was memory till program run on loaded in memory
after upload program thi variable deleted so we need to process data and need to stored in data base
like below a, name and weight deleted once program unloaded from memory.
* */

public class WhyJDBC {
    public static void main(String[] args) {
        int a=34;
        String name="rohitash";
        float weight= (float) 34.3565;
        System.out.println(a);
        System.out.println(weight);
        System.out.println(name);
    }
}
