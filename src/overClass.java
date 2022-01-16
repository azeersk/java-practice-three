public class overClass {
    public void socialMedia(){
        System.out.println("youtube is a social media app!!");
    }
    public void socialMedia(String app){
        System.out.println(app + " is a social media app!!");
    }
}


class overrideClass extends overClass {
    @Override
    public void socialMedia() {
        System.out.println("google is a social media app!!");
    }
}


class poly{
    public static void main(String[] args){

        overrideClass overObj = new overrideClass();
        String appName = "FaceBook";
        overObj.socialMedia();

        System.out.println();
        overClass overObjTwo = new overClass();
        overObjTwo.socialMedia();
        overObjTwo.socialMedia(appName);
    }
}
