import java.util.List;
import java.util.Scanner;

public class profill {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        Scanner scanner = new Scanner(System.in);
        List<Profile> searchResult;

        while (true) {
            System.out.println("Välkommen till den gula boken:");
            System.out.println("8. kom in som admin");
            System.out.println("9. Komma in som gäst:");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 8:
                    System.out.println("1. Add Profile");
                    System.out.println("2. Search Profiles");
                    System.out.println("3. Update Profile");
                    System.out.println("4. Delete Profile");
                    System.out.println("5. Display Profiles");
                    int adminChoice = scanner.nextInt();
                    scanner.nextLine();  // Consume the newline

                    switch (adminChoice) {
                        case 1:
                            System.out.print("Enter name:");
                            String name = scanner.nextLine();
                            System.out.println("Enter your lastname:");
                            String lastname = scanner.nextLine();
                            System.out.println("Enter your age:");
                            int age = Integer.parseInt(scanner.nextLine());
                            System.out.println("Enter your homeAdress:");
                            String homeAdress = scanner.nextLine();
                            System.out.println("Ange city:");
                            String city = scanner.nextLine();
                            System.out.println("Ange postnummer:");
                            int postnummer = Integer.parseInt(scanner.nextLine());
                            System.out.println("Ange street name:");
                            String streetname = scanner.nextLine();
                            System.out.print("Enter phone number: ");
                            String phoneNumber = scanner.nextLine();
                            Profile profile = new Profile(name, lastname, age, homeAdress, phoneNumber, streetname, city, postnummer);
                            phoneBook.addProfile(profile);
                            System.out.println("Profile added success!");
                            break;
                        case 2:
                            System.out.print("Enter search keyword: ");
                            String keyword = scanner.nextLine();
                            searchResult = phoneBook.searchProfiles(keyword);
                            System.out.println("Search results:");
                            for (Profile result : searchResult) {
                                System.out.println("Name: " + result.getName() + "\n" + "Lastname:" + result.getLastname() + "\n" + "Age:" + result.getAge() + "\n"
                                        + " Phone Number: " + result.getPhoneNumber() + "\n" + "HomeAdress:" + result.getHomeAdress() + "\n" + "city:" + result.getcity() + "\n" + "Postnummer" + result.getPostnummer() + "\n" + "street name:" + result.getStreetname());
                            }
                            break;
                        case 3:
                            System.out.print("Enter name of profile to update: ");
                            String updateName = scanner.nextLine();
                            System.out.println("Enter Lastname of profile to update:");
                            String updateLastname = scanner.nextLine();
                            System.out.println("Enter Age of profile to update: ");
                            int updateAge = Integer.parseInt(scanner.nextLine());
                            System.out.print("Enter new phone number: ");
                            String newPhoneNumber = scanner.nextLine();
                            System.out.println("Enter homeAdress of profile to update");
                            String updateHomeAdress = scanner.nextLine();
                            System.out.println("Enter city of profile to update");
                            String updatCity = scanner.nextLine();
                            System.out.println("Enter postnummer of profile to update:");
                            int updatePostNummer = Integer.parseInt(scanner.nextLine());
                            System.out.println("Enter street name  of profile to update:");
                            String updateStreetname = scanner.nextLine();
                            phoneBook.updateProfile(updateName, updateLastname, updateAge, newPhoneNumber, updatCity, updatePostNummer, updateStreetname);
                            System.out.println("Profile updated successfully!");
                            break;
                        case 4:
                            System.out.print("Enter name of profile to delete: ");
                            String deleteName = scanner.nextLine();
                            phoneBook.deleteProfile(deleteName);
                            System.out.println("Profile deleted successfully!");
                            break;
                        case 5:
                            phoneBook.displayProfiles();
                            break;
                        default:
                            System.out.println("Invalid admin choice. Please enter a valid option.");
                            break;
                    }
                    break;

                case 9:
                    System.out.print("Enter search after the name or last name: ");
                    String search = scanner.nextLine();
                    searchResult = phoneBook.searchProfiles(search);
                    System.out.println("Search results:");
                    for (Profile result : searchResult) {
                        System.out.println("Name: " + result.getName() + "\n" +
                                "Lastname:" + result.getLastname() + "\n" +
                                "Age:" + result.getAge() + "\n" +
                                "Phone Number: " + result.getPhoneNumber() + "\n" +
                                "HomeAdress:" + result.getHomeAdress() + "\n" +
                                "City:" + result.getCity() + "\n" +
                                "Postnummer: " + result.getPostnummer() + "\n" +
                                "Street name:" + result.getStreetname());


                    }
                    break;

                case 0:
                    System.out.println("Exiting program. Have a nice day!");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
                    break;
            }
        }
    }
}
