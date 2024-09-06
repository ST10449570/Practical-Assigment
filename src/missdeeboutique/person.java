
package missdeeboutique;


public class person 
{
    protected String name;
    protected String contactInfo;

    public person(String name, String contactInfo) {
        this.name = name;
        this.contactInfo = contactInfo;
    }

    public String getName() {
        return name;
    }

    public String getContactInfo() {
        return contactInfo;
    }  
}
