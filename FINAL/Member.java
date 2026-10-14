// Alexis Bowen

public class Member {
    public static void main(String[] args)
    {
            private static final long serialVersionUID = 1L;

    private final String id;
    private String name;
    private int age;
    private String guardianContact;

    public Member(String id, String name, int age, String guardianContact) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.guardianContact = guardianContact;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGuardianContact() {
        return guardianContact;
    }

    public void updateDetails(String name, int age, String guardianContact) {
        this.name = name;
        this.age = age;
        this.guardianContact = guardianContact;
    }
}
}

    