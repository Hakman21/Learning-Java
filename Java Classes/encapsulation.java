public class encapsulation {
    /*
    Encapsulation is to make sure that "sensitive" data is hidden from users

    declare class variables/attributes as private
    provide public get and set methods to access and update the value of a private variable
    */

    private String name; // PRIVATE = RESTRICTED ACCESS

    //Getter returns the value of name
    public String getName() {
        return name;
    }

    //Setter takes parameter newName and sets it to the name variable. this refers to current object
    public void setName(String newName) {
        this.name = newName;
    }
}