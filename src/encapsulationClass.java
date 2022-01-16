public class encapsulationClass {
    private String name;
    private int id;
    private String branch;
    private String CName;

    public String getName(){
        return name;
    }
    public int getId(){
        return id;
    }
    public String getBranch(){
        return branch;
    }
    public String getCName(){
        return CName;
    }

    public void setName(String InName){
        name = InName;
    }
    public void setId(int InId){
        id = InId;
    }
    public void setBranch(String InBranch){
        branch = InBranch;
    }
    public void setCName(String InCName){
        CName = InCName;
    }
}
class execution{
    public static void main(String[] args){
        String name = "Shaik";
        int id = 118055;
        String branch = "Computer science";
        String cname = "Lovely";
        encapsulationClass obj = new encapsulationClass();
        obj.setName(name);
        obj.setId(id);
        obj.setBranch(branch);
        obj.setCName(cname);
        System.out.println(obj.getCName());
        System.out.println(obj.getName());
        System.out.println(obj.getId());
        System.out.println(obj.getBranch());

    }
}
