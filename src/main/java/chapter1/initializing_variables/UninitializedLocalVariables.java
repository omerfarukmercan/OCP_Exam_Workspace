package chapter1.initializing_variables;

public class UninitializedLocalVariables {

    public void notValid(){
        int y = 10;
        int x;
        //int reply = x + y; DOES NOT COMPILE
    }

    public int valid(){
        int y = 10;
        int x;
        x = 3;
        int z;
        int reply = x + y;
        return reply;
    }

    public void findAnswer(boolean check){
        int answer;
        int otherAnswer;
        int onlyOneBranch;
        if(check){
            onlyOneBranch = 1;
            answer = 1;
        }else{
            answer = 2;
        }
        System.out.println(answer);
        //System.out.println(onlyOneBranch); DOES NOT COMPILE
    }

    public int validV2(){
        int y;
        int x;
        return 0;
    }

    public int notValidv2(){
        int x;
        int y;

        //System.out.println(y); DOES NOT COMPILE
        return 0;
    }



}
