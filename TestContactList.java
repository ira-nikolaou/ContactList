// Name: Ira Nikolaou 
// Student ID: 16061888 
// Assignment 5

public class TestContactList {
    public static void main(String[] args) {
        ContactList myContacts = new ContactList();

        Contact contactAl = new Contact("Al E. Gater", "001 123 7654321", "", "@SeeYouLater", "@Aligator",
                "@NotOnTwitter");

        Contact contactJack = new Contact("Jack Pott", "+771 0896 651299452", "luckynumber@jackpott.com",
                "@TheJackPott", "", "@Jackpott");

        Contact contactFrank = new Contact("Frank N. Stein", "086 45216789", "", "", "", "@NotTheMonster");

        Contact contactSandy = new Contact("Sandy Beech", "199 526 4711231", "holiday@sandybeech.com", "@SandyBeeches",
                "@SandyBeeches", "@SandyHoliday");

        Contact contactEarl = new Contact("Earl E. Bird", "151 698 213459", "theEarlyEBird@CatchesTheWorm.com", "", "", "");

        Contact contactUpton = new Contact("Upton O.Goode", "001 241 721890", "UpToNo@Goode.com", "", "", "");

        Contact contactMax = new Contact("Max E. Mumm", "080 810 2468312", "alwaysgivethe@maxE.mumm", "", "", "");

        myContacts.add(contactAl);
        myContacts.add(contactJack);
        myContacts.add(contactFrank);
        myContacts.add(contactSandy);
        myContacts.add(contactEarl);
        myContacts.add(contactUpton);
        myContacts.add(contactMax);
        //The sort method will display the names in alphabetical order through the compareto method. 
        myContacts.sort();
        System.out.println(
                "Thanks to the compareTo and array.sort method our contact list is alphabetised by name: ");
        System.out.println();
        myContacts.display();
        System.out.println(Contact.seperator());
        //The sort method will display the names in alphabetical order through the compareto method. 
        System.out.println(
                "With the remove method, we can now remove contacts Jack Pott and the contact in position 7: ");
        System.out.println();
        myContacts.remove("Jack Pott");
        myContacts.remove(7);
        myContacts.display();
        System.out.println(Contact.seperator());
        System.out.println(
                "If we use the compareTo method by itself, we can compare two contacts and return an int value: ");
        System.out.println(contactMax.compareTo(contactEarl));
        System.out.println(contactSandy.compareTo(contactAl));
    }
}