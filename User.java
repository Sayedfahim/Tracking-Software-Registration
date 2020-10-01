public class User {
    private int id;
    private String firstName;
    private String lastName;
    private int age;
    
    public User(int Id, String Fname, String Lname, int Age)
    {
        this.id = Id;
        this.firstName = Fname;
        this.lastName = Lname;
        this.age = Age;
    }
    
    public int getId()
    {
        return id;
    }
    
    public String getFirstName()
    {
        return firstName;
    }
    
    public String getLastNAme()
    {
        return lastName;
    }
    
    public int getAge()
    {
        return age;
    }
}
