class PrivateProperty{
    public static void main(String[] args){
        state Obj=new state("india");
        System.out.println(Obj.getCountry());
        Obj.setCountry("chinna");
        System.out.println(Obj.getCountry());
    }
}
class state{
    private String country;
    state(String country){
        this.country=country;
    }
    String getCountry(){
        return this.country;
    }
    void setCountry(String newCountry){
        this.country=newCountry;
    }
}