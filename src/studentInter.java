public interface studentInter {
    abstract void collageDetails();
    abstract void schoolDetails();
    abstract void address();
}

interface studentOther{
    public void m();
}
class employee implements studentInter,studentOther{
    String collName = "lovely professional university";
    String name = "intelPath";
    String comName = "Microsoft";
    String schName = "ZPSS chennaram";
    String state = "Telangana";
    String district = "Khammam";
    String mandal = "Nelakondapalli";
    String village = "Chennaranm";
    int collId = 118055;
    int age = 20;
    int schId = 12632;
    int comId = 57343;
    public void collageDetails(){
        System.out.println(collName);
        System.out.println(name);
        System.out.println(collId);
        System.out.println(age);
    }
    public void schoolDetails(){
        System.out.println(schName);
        System.out.println(name);
        System.out.println(schId);
        System.out.println(age-5);
    }

    public void comDetails(){
        System.out.println(comName);
        System.out.println(name);
        System.out.println(comId);
        System.out.println(age);
    }
    public void address(){
        System.out.println(state);
        System.out.println(district);
        System.out.println(mandal);
        System.out.println(village);
    }
    public void m(){
        System.out.println("Student and Employee details successfully printed!!!");
    }

}

class MainClass{
    public static void main(String[] args){
        employee obj = new employee();

        System.out.println("School details: ");
        obj.schoolDetails();
        System.out.println();
        System.out.println("collage details: ");
        obj.collageDetails();
        System.out.println();
        System.out.println("Company details: ");
        obj.comDetails();
        System.out.println();
        System.out.println("Address: ");
        obj.address();
        System.out.println();
        obj.m();

    }
}

