// Name: Ira Nikolaou 
// Student ID: 16061888 
// Assignment 5

public class Contact implements Comparable<Contact> {

    // instance variables
    private String contactName = "";
    private String phoneNumber = "";
    private String emailAddress = "";
    private String facebookHandle = "";
    private String instagramHandle = "";
    private String twitterHandle = "";

    // Setters
    public void setContactName(String inputName) {
        this.contactName = inputName;
    }

    public void setPhoneNumber(String inputNumber) {
        this.phoneNumber = inputNumber;
    }

    public void setEmailAddress(String inputEmail) {
        this.emailAddress = inputEmail;
    }

    public void setFacebookHandle(String inputFacebook) {
        this.facebookHandle = inputFacebook;
    }

    public void setInstagramHandle(String inputInstagram) {
        this.instagramHandle = inputInstagram;
    }

    public void setTwitterHandle(String inputTwitter) {
        this.twitterHandle = inputTwitter;
    }

    // Getters
    public String getContactName() {
        return this.contactName;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public String getEmailAddress() {
        return this.emailAddress;
    }

    public String getFacebookHandle() {
        return this.facebookHandle;
    }

    public String getInstagramHandle() {
        return this.instagramHandle;
    }

    public String getTwitterHandle() {
        return this.twitterHandle;
    }

    // Constructors
    public Contact(String name) {
        this.contactName = name;
    }

    public Contact(String name, String number) {
        this.contactName = name;
        this.phoneNumber = number;
    }

    public Contact(String name, String number, String email) {
        this.contactName = name;
        this.phoneNumber = number;
        this.emailAddress = email;
    }

    public Contact(String name, String number, String email, String facebook, String instagram, String twitter) {
        this.contactName = name;
        this.phoneNumber = number;
        this.emailAddress = email;
        this.facebookHandle = facebook;
        this.instagramHandle = instagram;
        this.twitterHandle = twitter;
    }

    // Centre Method
    public static String centreThirty(String text) {
        int n = text.length();
        int before = (30 - n) / 2;
        int rest = 30 - before;
        int leftspace = before + 1;
        int rightspace = rest - 1;

        if (30 <= n)
            return text.substring(0, 27) + "...";

        else if (before == 0)
            return String.format("%-30s", text);

        else
            return String.format("%" + leftspace + "s%-" + rightspace + "s", "", text);
    }

    // toString Method
    public String toString() {
        String enterName = String.format("%-17s: ", "Name") + centreThirty(this.contactName) + String.format("\n");
        String enterNumber = String.format("%-17s: ", "Phone Number") + centreThirty(this.phoneNumber)
                + String.format("\n");
        String enterEmail = String.format("%-17s: ", "Email Address") + centreThirty(this.emailAddress)
                + String.format("\n");
        String enterFacebook = String.format("%-17s: ", "Facebook Handle") + centreThirty(this.facebookHandle)
                + String.format("\n");
        String enterInstagram = String.format("%-17s: ", "Instagram Handle") + centreThirty(this.instagramHandle)
                + String.format("\n");
        String enterTwitter = String.format("%-17s: ", "Twitter Handle") + centreThirty(this.twitterHandle)
                + String.format("\n");

        String returnedString = "";

        if (this.contactName != "") {
            returnedString = returnedString.concat(enterName);
        }

        if (this.phoneNumber != "") {
            returnedString = returnedString.concat(enterNumber);
        }

        if (this.emailAddress != "") {
            returnedString = returnedString.concat(enterEmail);
        }

        if (this.facebookHandle != "") {
            returnedString = returnedString.concat(enterFacebook);
        }

        if (this.instagramHandle != "") {
            returnedString = returnedString.concat(enterInstagram);
        }

        if (this.twitterHandle != "") {
            returnedString = returnedString.concat(enterTwitter);
        }

        return returnedString;
    }

    // CompareTo method alphabetises the contactlist by name
    // This method is repurposed from the playlist example in lecture 20 part1
    public int compareTo(Contact other) {
        return this.contactName.compareTo(other.contactName);
    }

    //displays a line to seperate sections in the driver method
    public static String seperator() {
        String text = "_";
        int times = 60;

        var repeatedString = "";

        while (times > 0) {
            repeatedString += "_";
            times--;
        }
        return repeatedString;
    }

}