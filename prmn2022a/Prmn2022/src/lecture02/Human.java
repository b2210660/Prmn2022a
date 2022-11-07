package lecture02;

class Human {

    String name;
    int age;

    Human(String name, int age){
        this.name = name;
        this.age = age;
    }

    void print(){
        System.out.print(name + ", " + age + "歳");
        if(age <= 18){
            System.out.print("生徒です");
        }else if(age <= 22){
            System.out.print("学生です");
        }

    }


}
