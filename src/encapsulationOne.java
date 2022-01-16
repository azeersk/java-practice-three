public class encapsulationOne {
    private String companyName = "Microsoft";
    private String eName;
    private int eId;
    private int eage;

    public void seteName(String name){
        eName = name;
    }
    public void seteId(int id){
        eId = id;
    }
    public void seteAge(int age){
        eage = age;
    }

    public String geteName(){
        System.out.println(companyName);
        return eName;
    }
    public int getId(){
        return eId;
    }
    public int getEage(){
        return eage;
    }
}



class execute{
    public static void main(String[] args){

        encapsulationOne obj = new encapsulationOne();
        String name = "intel";
        int id = 12987;
        int age = 23;

        obj.seteName(name);
        obj.seteId(id);
        obj.seteAge(age);

        System.out.println(obj.geteName());
        System.out.println(obj.getId());
        System.out.println(obj.getEage());
        System.out.println();

        String nameOne = "AMD";
        int idOne = 117068;
        int ageOne = 15;

        obj.seteName(nameOne);
        obj.seteId(idOne);
        obj.seteAge(ageOne);
        System.out.println(obj.geteName());
        System.out.println(obj.getId());
        System.out.println(obj.getEage());


    }
}