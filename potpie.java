public class potpie {
    private String name;
    private ToString birthday;

    public potpie(String name, ToString birthday){
        this.name = name;
        this.birthday = birthday;
    }

    public String toString(){
        return String.format("My name is %s, my birthday is %s",name, birthday);
    }
}
