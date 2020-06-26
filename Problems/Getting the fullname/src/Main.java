class User {
    private String firstName;
    private String lastName;

    public User() {
        this.firstName = "";
        this.lastName = "";
    }

    public void setFirstName(String firstName) {
        if (firstName != null) {
            this.firstName = firstName;
        }
    }

    public void setLastName(String lastName) {
        if (lastName != null) {
            this.lastName = lastName;
        }
    }

    public String getFullName() {
        String fullName = "Unknown";
        if (!"".equals(firstName) && !"".equals(lastName)) {
            return fullName =  firstName + " " + lastName;
        }
        if (!"".equals(firstName)) {
            return fullName = firstName;
        }
        if (!"".equals(lastName)) {
            return fullName = lastName;
        }
        return fullName;
    }
}
