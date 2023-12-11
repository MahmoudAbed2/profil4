import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Profile {
    private String name;
    private String lastname;
    private int age;
    private String homeAdress;
    private String city;
    private int postnummer;
    private String streetname;
    private String phoneNumber;


    public Profile(String name, String lastname, int age, String homeAdress, String phoneNumber, String streetname, String city,  int postnummer) {
        this.name = name;
        this.lastname = lastname;
        this.age = age;
        this.homeAdress = homeAdress;
        this.phoneNumber = phoneNumber;
        this.streetname  = streetname;
        this.city = city;
        this.postnummer = postnummer;
    }
    public String getName() {
        return name;
    }

    public String getLastname() {
        return lastname;
    }

    public int getAge() {
        return age;
    }

    public String getHomeAdress() {
        return homeAdress;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getcity() {
        return city;
    }

    public int getPostnummer() {
        return postnummer;
    }

    public String getStreetname() {
        return streetname;
    }

    public void setPhoneNumber(String newPhoneNumber) {
    }


    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}

class PhoneBook {
    private List<Profile> profiles;

    public PhoneBook() {
        profiles = new ArrayList<>();
    }

    public void addProfile(Profile profile) {
        profiles.add(profile);
    }

    public List<Profile> searchProfiles(String keyword) {
        List<Profile> result = new ArrayList<>();
        for (Profile profile : profiles) {
            if (profile.getName().contains(keyword) || profile.getHomeAdress().contains(keyword) || profile.getcity().contains(keyword)
                    || profile.getStreetname().contains(keyword) || profile.getLastname().contains(keyword) || profile.getPhoneNumber().contains(keyword)) {
                result.add(profile);
            }
        }
        return result;
    }

    public void updateProfile(String name, String lastname, int updateAge, String newPhoneNumber, String city, int StreetName, String postnummer) {
        for (Profile profile : profiles) {
            if (profile.getName().equals(name)) {
                profile.setPhoneNumber(newPhoneNumber);
                break;
            }
        }
    }

    public void deleteProfile(String name) {
        profiles.removeIf(profile -> profile.getName().equals(name));
    }

    public void displayProfiles() {
        for (Profile profile : profiles) {
            System.out.println("Name: " + profile.getName() + "\n" + "Lastname: " + profile.getLastname() + "\n" + "Age:" + profile.getAge() + "\n"
                    + "Phone Number: " + profile.getPhoneNumber() + "\n" + "HomeAdress: " + profile.getHomeAdress() + "\n"
                    + "city:" + profile.getcity() + "\n" + "Postnummer:" + profile.getPostnummer() + "\n" + "streetName:" + profile.getStreetname());
        }
    }
}

